package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDatabaseBackedPaneStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatabaseBackedPaneStore.kt\ncom/plaid/internal/workflow/persistence/DatabaseBackedPaneStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1#2:42\n1549#3:43\n1620#3,3:44\n1855#3,2:47\n*S KotlinDebug\n*F\n+ 1 DatabaseBackedPaneStore.kt\ncom/plaid/internal/workflow/persistence/DatabaseBackedPaneStore\n*L\n25#1:43\n25#1:44,3\n26#1:47,2\n*E\n"})
/* renamed from: com.plaid.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3730r0 implements L4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3792y<String, Pane$PaneRendering> f41009a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4 f41010b;

    public C3730r0(WorkflowDatabase database) {
        C3554a4 cache = new C3554a4();
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f41009a = cache;
        this.f41010b = database.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC3799y6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull r8 r8Var, @NotNull ContinuationImpl continuationImpl) {
        C3722q0 c3722q0;
        int i10;
        Pane$PaneRendering pane$PaneRendering;
        C3730r0 c3730r0;
        byte[] bArr;
        if (continuationImpl instanceof C3722q0) {
            c3722q0 = (C3722q0) continuationImpl;
            int i11 = c3722q0.f40986e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3722q0.f40986e = i11 - Integer.MIN_VALUE;
                Object obj = c3722q0.f40984c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3722q0.f40986e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    pane$PaneRendering = (Pane$PaneRendering) this.f41009a.a((String) r8Var.f41040d.getValue());
                    if (pane$PaneRendering != null) {
                        c3730r0 = this;
                        if (pane$PaneRendering != null) {
                            c3730r0.f41009a.a((String) r8Var.f41040d.getValue(), pane$PaneRendering);
                        }
                        return pane$PaneRendering;
                    }
                    C4 c42 = this.f41010b;
                    String str = r8Var.f41037a;
                    String str2 = r8Var.f41038b;
                    c3722q0.f40982a = this;
                    c3722q0.f40983b = r8Var;
                    c3722q0.f40986e = 1;
                    obj = c42.a(str, str2, c3722q0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c3730r0 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r8Var = c3722q0.f40983b;
                    c3730r0 = c3722q0.f40982a;
                    ResultKt.throwOnFailure(obj);
                }
                I4 i42 = (I4) obj;
                pane$PaneRendering = (i42 != null || (bArr = i42.f39297c) == null) ? null : Pane$PaneRendering.parseFrom(bArr);
                if (pane$PaneRendering != null) {
                }
                return pane$PaneRendering;
            }
        }
        c3722q0 = new C3722q0(this, continuationImpl);
        Object obj2 = c3722q0.f40984c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3722q0.f40986e;
        if (i10 != 0) {
        }
        I4 i422 = (I4) obj2;
        if (i422 != null) {
        }
        if (pane$PaneRendering != null) {
        }
        return pane$PaneRendering;
    }

    @Override // com.plaid.internal.L4
    @Nullable
    public final Object a(@NotNull r8 r8Var, @NotNull Pane$PaneRendering pane$PaneRendering, @NotNull S2 s22) {
        this.f41009a.a((String) r8Var.f41040d.getValue(), pane$PaneRendering);
        C4 c42 = this.f41010b;
        String str = r8Var.f41037a;
        String str2 = r8Var.f41038b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        Object a10 = c42.a(str, str2, byteArray, s22);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
