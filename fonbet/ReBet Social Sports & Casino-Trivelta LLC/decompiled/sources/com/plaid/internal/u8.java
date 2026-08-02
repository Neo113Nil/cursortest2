package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.C3678l1;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nWorkflowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkflowViewModel.kt\ncom/plaid/internal/workflow/panes/WorkflowViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1855#2,2:153\n*S KotlinDebug\n*F\n+ 1 WorkflowViewModel.kt\ncom/plaid/internal/workflow/panes/WorkflowViewModel\n*L\n141#1:153,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class u8 extends androidx.lifecycle.Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r8 f41125a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final J4 f41126b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public InterfaceC3759u2 f41127c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC3799y6 f41128d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public C3787x3 f41129e;

    public u8(@NotNull r8 paneId, @NotNull J4 paneHostComponent) {
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f41125a = paneId;
        this.f41126b = paneHostComponent;
    }

    @NotNull
    public final C3787x3 a() {
        C3787x3 c3787x3 = this.f41129e;
        if (c3787x3 != null) {
            return c3787x3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkWorkflowAnalytics");
        return null;
    }

    @NotNull
    public final InterfaceC3799y6 b() {
        InterfaceC3799y6 interfaceC3799y6 = this.f41128d;
        if (interfaceC3799y6 != null) {
            return interfaceC3799y6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paneStore");
        return null;
    }

    @Nullable
    public final Object a(@NotNull r8 r8Var, @NotNull C3678l1.a aVar) {
        return AbstractC1455i.g(C1452g0.b(), new s8(this, r8Var, null), aVar);
    }
}
