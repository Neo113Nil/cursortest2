package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import com.google.protobuf.Timestamp;
import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLinkWorkflowAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkWorkflowAnalytics.kt\ncom/plaid/internal/workflow/LinkWorkflowAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,192:1\n1477#2:193\n1502#2,3:194\n1505#2,3:204\n1855#2,2:211\n372#3,7:197\n125#4:207\n152#4,3:208\n*S KotlinDebug\n*F\n+ 1 LinkWorkflowAnalytics.kt\ncom/plaid/internal/workflow/LinkWorkflowAnalytics\n*L\n178#1:193\n178#1:194,3\n178#1:204,3\n184#1:211,2\n178#1:197,7\n178#1:207\n178#1:208,3\n*E\n"})
/* renamed from: com.plaid.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3787x3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i8 f41185a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final A3 f41186b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ph.L f41187c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Long f41188d;

    @Inject
    public C3787x3(@NotNull i8 api, @NotNull A3 workflowAnalyticsStore) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(workflowAnalyticsStore, "workflowAnalyticsStore");
        this.f41185a = api;
        this.f41186b = workflowAnalyticsStore;
        this.f41187c = C1452g0.b().b2(1);
    }

    public final void a(@NotNull r8 currentPane, @Nullable r8 r8Var) {
        String str;
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str2 = currentPane.f41037a;
        ClientEventOuterClass$ClientEvent.a a10 = a();
        ClientEventOuterClass$ClientEvent.Back.a newBuilder = ClientEventOuterClass$ClientEvent.Back.newBuilder();
        newBuilder.a(currentPane.f41039c);
        if (r8Var == null || (str = r8Var.f41039c) == null) {
            str = "";
        }
        newBuilder.b(str);
        Unit unit = Unit.INSTANCE;
        ClientEventOuterClass$ClientEvent.a a11 = a10.a(newBuilder);
        Intrinsics.checkNotNullExpressionValue(a11, "setBack(...)");
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3778w3(this, a11, str2, null), 3, null);
    }

    public final void b(@NotNull r8 currentPane) {
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str = currentPane.f41037a;
        ClientEventOuterClass$ClientEvent.a a10 = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingStarted.getDefaultInstance()));
        Intrinsics.checkNotNullExpressionValue(a10, "setOauthLink(...)");
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3778w3(this, a10, str, null), 3, null);
    }

    public final void c(@NotNull String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackOpen.getDefaultInstance()).build();
        Intrinsics.checkNotNull(build);
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3769v3(this, webviewFallbackId, build, null), 3, null);
    }

    public final void b() {
        this.f41188d = Long.valueOf(System.currentTimeMillis());
    }

    public final void b(@NotNull String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackEmitPreCompletionResult.getDefaultInstance()).build();
        Intrinsics.checkNotNull(build);
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3769v3(this, webviewFallbackId, build, null), 3, null);
    }

    public final void a(@NotNull r8 currentPane) {
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str = currentPane.f41037a;
        ClientEventOuterClass$ClientEvent.a a10 = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingComplete.getDefaultInstance()));
        Intrinsics.checkNotNullExpressionValue(a10, "setOauthLink(...)");
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3778w3(this, a10, str, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
    
        r10 = r0;
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[LOOP:1: B:42:0x00a9->B:44:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3787x3 c3787x3, ContinuationImpl continuationImpl) {
        C3760u3 c3760u3;
        int i10;
        Iterator it;
        C3760u3 c3760u32;
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
        Iterator it2;
        c3787x3.getClass();
        if (continuationImpl instanceof C3760u3) {
            c3760u3 = (C3760u3) continuationImpl;
            int i11 = c3760u3.f41117f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3760u3.f41117f = i11 - Integer.MIN_VALUE;
                Object obj = c3760u3.f41115d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3760u3.f41117f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    A3 a32 = c3787x3.f41186b;
                    c3760u3.f41112a = c3787x3;
                    c3760u3.f41117f = 1;
                    obj = a32.a(c3760u3);
                } else if (i10 == 1) {
                    c3787x3 = c3760u3.f41112a;
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest2 = c3760u3.f41114c;
                    Iterator it3 = c3760u3.f41113b;
                    C3787x3 c3787x32 = c3760u3.f41112a;
                    ResultKt.throwOnFailure(obj);
                    workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequest2;
                    c3787x3 = c3787x32;
                    c3760u32 = c3760u3;
                    it2 = it3;
                    if (((AbstractC3654i4) obj) instanceof AbstractC3654i4.c) {
                    }
                    it = it2;
                    c3760u3 = c3760u32;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it4 = c3760u3.f41113b;
                    C3787x3 c3787x33 = c3760u3.f41112a;
                    ResultKt.throwOnFailure(obj);
                    it = it4;
                    c3787x3 = c3787x33;
                    if (it.hasNext()) {
                        workflow$LinkWorkflowEventRequest = (Workflow$LinkWorkflowEventRequest) it.next();
                        i8 i8Var = c3787x3.f41185a;
                        Intrinsics.checkNotNull(workflow$LinkWorkflowEventRequest);
                        c3760u3.f41112a = c3787x3;
                        c3760u3.f41113b = it;
                        c3760u3.f41114c = workflow$LinkWorkflowEventRequest;
                        c3760u3.f41117f = 2;
                        Object a10 = i8Var.a(workflow$LinkWorkflowEventRequest, c3760u3);
                        if (a10 != coroutine_suspended) {
                            C3760u3 c3760u33 = c3760u3;
                            it2 = it;
                            obj = a10;
                            c3760u32 = c3760u33;
                            if (((AbstractC3654i4) obj) instanceof AbstractC3654i4.c) {
                                A3 a33 = c3787x3.f41186b;
                                List<ClientEventOuterClass$ClientEvent> eventsList = workflow$LinkWorkflowEventRequest.getEventsList();
                                Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                                c3760u32.f41112a = c3787x3;
                                c3760u32.f41113b = it2;
                                c3760u32.f41114c = null;
                                c3760u32.f41117f = 3;
                                if (a33.a(eventsList, c3760u32) != coroutine_suspended) {
                                }
                            }
                            it = it2;
                            c3760u3 = c3760u32;
                            if (it.hasNext()) {
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    String workflowSessionId = ((ClientEventOuterClass$ClientEvent) obj2).getWorkflowSessionId();
                    Object obj3 = linkedHashMap.get(workflowSessionId);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(workflowSessionId, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Workflow$LinkWorkflowEventRequest.a newBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                    newBuilder.b((String) entry.getKey());
                    newBuilder.a((Iterable<? extends ClientEventOuterClass$ClientEvent>) entry.getValue());
                    arrayList.add(newBuilder.build());
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                }
            }
        }
        c3760u3 = new C3760u3(c3787x3, continuationImpl);
        Object obj4 = c3760u3.f41115d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3760u3.f41117f;
        if (i10 != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r10.hasNext()) {
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        while (r2.hasNext()) {
        }
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
    }

    public static ClientEventOuterClass$ClientEvent.a a() {
        return ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000));
    }

    public final void a(@NotNull String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.newBuilder().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.b.LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN).build()).build();
        Intrinsics.checkNotNull(build);
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3769v3(this, webviewFallbackId, build, null), 3, null);
    }
}
