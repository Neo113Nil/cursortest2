package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import android.os.Bundle;
import com.google.protobuf.Timestamp;
import com.plaid.internal.C3556a6;
import com.plaid.internal.H6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nRemoteLogSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteLogSender.kt\ncom/plaid/internal/remotelog/RemoteLogSender\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1#2:157\n1549#3:158\n1620#3,3:159\n*S KotlinDebug\n*F\n+ 1 RemoteLogSender.kt\ncom/plaid/internal/remotelog/RemoteLogSender\n*L\n132#1:158\n132#1:159,3\n*E\n"})
/* loaded from: classes3.dex */
public final class N6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i8 f39458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39459b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final I f39460c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ph.L f39461d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public volatile String f39462e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile String f39463f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public volatile String f39464g;

    @Inject
    public N6(@NotNull i8 workflowApi, @NotNull String persistentLinkId, @NotNull I clientTypeProvider) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(persistentLinkId, "persistentLinkId");
        Intrinsics.checkNotNullParameter(clientTypeProvider, "clientTypeProvider");
        this.f39458a = workflowApi;
        this.f39459b = persistentLinkId;
        this.f39460c = clientTypeProvider;
        this.f39461d = C1452g0.b().b2(1);
    }

    public static final Workflow$LinkWorkflowEventRequest a(N6 n62, ArrayList arrayList, String str) {
        Mobile$MobileSDKPloggerLog.b bVar;
        n62.getClass();
        Mobile$MobileSDKPloggerLog.MobileSDKSession.a newBuilder = Mobile$MobileSDKPloggerLog.MobileSDKSession.newBuilder();
        String str2 = n62.f39463f;
        if (str2 != null) {
            newBuilder.a(str2);
        }
        newBuilder.b(n62.f39459b);
        newBuilder.c(str);
        String str3 = n62.f39464g;
        if (str3 != null) {
            newBuilder.d(str3);
        }
        I i10 = n62.f39460c;
        I5 i52 = i10.f39288a;
        Bundle bundle = i52.f39298a.getPackageManager().getApplicationInfo(i52.f39298a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        I5 i53 = i10.f39288a;
        Bundle bundle2 = i53.f39298a.getPackageManager().getApplicationInfo(i53.f39298a.getPackageName(), 128).metaData;
        String string2 = bundle2 != null ? bundle2.getString("com.plaid.link.react_native") : null;
        newBuilder.a((string == null || StringsKt.isBlank(string)) ? (string2 == null || StringsKt.isBlank(string2)) ? Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_ANDROID : Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_REACTNATIVEANDROID : Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_FLUTTERANDROID);
        Mobile$MobileSDKPloggerLog.MobileSDKSession build = newBuilder.build();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            I6 i62 = (I6) it.next();
            Mobile$MobileSDKPloggerLog.a newBuilder2 = Mobile$MobileSDKPloggerLog.newBuilder();
            J6 j62 = i62.f39302d;
            Intrinsics.checkNotNullParameter(j62, "<this>");
            int i11 = K6.f39326a[j62.ordinal()];
            if (i11 == 1) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_DEBUG;
            } else if (i11 == 2) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_INFO;
            } else if (i11 == 3) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_WARN;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_ERROR;
            }
            long j10 = 1000;
            arrayList2.add(ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(i62.f39300b / j10).setNanos((int) ((i62.f39300b % j10) * DurationKt.NANOS_IN_MILLIS))).a(str).a(newBuilder2.a(bVar).a(i62.f39299a).a(i62.f39301c).a(build).build()).build());
        }
        Workflow$LinkWorkflowEventRequest build2 = Workflow$LinkWorkflowEventRequest.newBuilder().b(str).a(arrayList2).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    public final void a(@Nullable String str) {
        if (this.f39462e != null && !Intrinsics.areEqual(this.f39462e, str)) {
            C3556a6.a.e(C3556a6.f39823a, "RemoteLogSender: Link session ID is being changed from " + this.f39462e + " to " + str);
        }
        this.f39462e = str;
        C3556a6.a.a(C3556a6.f39823a, "RemoteLogSender: link_session_id set: " + str);
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        this.f39463f = str;
        this.f39464g = str2;
        C3556a6.a.a(C3556a6.f39823a, "RemoteLogSender: session data set: linkOpenId=" + str + ", linkToken=" + str2);
    }

    @Nullable
    public final Object a(@NotNull ArrayList arrayList, @NotNull H6.b bVar) {
        String str = this.f39462e;
        if (str == null) {
            C3556a6.a.b(C3556a6.f39823a, "RemoteLogSender: Cannot send events without link_session_id");
            return Unit.INSTANCE;
        }
        Object g10 = AbstractC1455i.g(this.f39461d, new M6(this, arrayList, str, null), bVar);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }
}
