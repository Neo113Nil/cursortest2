package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {489, 491}, m = "handleSuccess", n = {"this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId", "this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes3.dex */
public final class S2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39608a;

    /* renamed from: b, reason: collision with root package name */
    public String f39609b;

    /* renamed from: c, reason: collision with root package name */
    public String f39610c;

    /* renamed from: d, reason: collision with root package name */
    public String f39611d;

    /* renamed from: e, reason: collision with root package name */
    public String f39612e;

    /* renamed from: f, reason: collision with root package name */
    public Pane$PaneRendering f39613f;

    /* renamed from: g, reason: collision with root package name */
    public List f39614g;

    /* renamed from: h, reason: collision with root package name */
    public List f39615h;

    /* renamed from: i, reason: collision with root package name */
    public String f39616i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f39617j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f39618k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y2 f39619l;

    /* renamed from: m, reason: collision with root package name */
    public int f39620m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39619l = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39618k = obj;
        this.f39620m |= Integer.MIN_VALUE;
        return this.f39619l.a(null, null, null, null, null, null, null, null, this);
    }
}
