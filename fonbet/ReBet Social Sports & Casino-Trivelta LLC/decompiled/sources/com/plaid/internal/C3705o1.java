package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0, 1}, l = {78, 82}, m = "getOAuthState", n = {"this", "pane", "pane"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: com.plaid.internal.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3705o1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f40899a;

    /* renamed from: b, reason: collision with root package name */
    public Pane$PaneRendering f40900b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f40902d;

    /* renamed from: e, reason: collision with root package name */
    public int f40903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705o1(C3678l1 c3678l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40902d = c3678l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40901c = obj;
        this.f40903e |= Integer.MIN_VALUE;
        return C3678l1.a(this.f40902d, (Pane$PaneRendering) null, this);
    }
}
