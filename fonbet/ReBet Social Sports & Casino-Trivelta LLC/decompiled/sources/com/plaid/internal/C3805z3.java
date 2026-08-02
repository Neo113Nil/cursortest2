package com.plaid.internal;

import com.plaid.internal.C3778w3;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLinkWorkflowAnalyticsDatabaseBackedStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkWorkflowAnalyticsDatabaseBackedStore.kt\ncom/plaid/internal/workflow/persistence/LinkWorkflowAnalyticsDatabaseBackedStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1855#2,2:43\n1549#2:45\n1620#2,3:46\n1549#2:49\n1620#2,3:50\n1549#2:53\n1620#2,3:54\n*S KotlinDebug\n*F\n+ 1 LinkWorkflowAnalyticsDatabaseBackedStore.kt\ncom/plaid/internal/workflow/persistence/LinkWorkflowAnalyticsDatabaseBackedStore\n*L\n21#1:43,2\n25#1:45\n25#1:46,3\n29#1:49\n29#1:50,3\n34#1:53\n34#1:54,3\n*E\n"})
/* renamed from: com.plaid.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3805z3 implements A3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Y7 f41230a;

    @Inject
    public C3805z3(@NotNull WorkflowDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f41230a = database.c();
    }

    @Override // com.plaid.internal.A3
    @Nullable
    public final Object a(@NotNull ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, @NotNull C3778w3.a aVar) {
        Y7 y72 = this.f41230a;
        String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
        Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
        String valueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
        byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        Object a10 = y72.a(workflowSessionId, valueOf, byteArray, aVar);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.A3
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3796y3 c3796y3;
        int i10;
        Iterator it;
        if (continuationImpl instanceof C3796y3) {
            c3796y3 = (C3796y3) continuationImpl;
            int i11 = c3796y3.f41205c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3796y3.f41205c = i11 - Integer.MIN_VALUE;
                Object obj = c3796y3.f41203a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3796y3.f41205c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y7 y72 = this.f41230a;
                    c3796y3.f41205c = 1;
                    obj = y72.a(c3796y3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(ClientEventOuterClass$ClientEvent.parseFrom(((h8) it.next()).f40664c));
                }
                return arrayList;
            }
        }
        c3796y3 = new C3796y3(this, continuationImpl);
        Object obj2 = c3796y3.f41203a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3796y3.f41205c;
        if (i10 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    @Override // com.plaid.internal.A3
    @Nullable
    public final Object a(@NotNull List list, @NotNull C3760u3 c3760u3) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = (ClientEventOuterClass$ClientEvent) it.next();
            String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
            Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
            String valueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
            byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            arrayList.add(new h8(workflowSessionId, valueOf, byteArray));
        }
        Object a10 = this.f41230a.a(arrayList, c3760u3);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
