package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1}, l = {50, 50, 52}, m = "next", n = {"this", "outputs", "this"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: com.plaid.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3706o2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3750t2 f40904a;

    /* renamed from: b, reason: collision with root package name */
    public Pane$PaneOutput[] f40905b;

    /* renamed from: c, reason: collision with root package name */
    public Y2 f40906c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f40908e;

    /* renamed from: f, reason: collision with root package name */
    public int f40909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3706o2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40908e = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40907d = obj;
        this.f40909f |= Integer.MIN_VALUE;
        return this.f40908e.a((Pane$PaneOutput[]) null, this);
    }
}
