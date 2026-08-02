package com.plaid.internal;

import com.plaid.link.OnLoadCallback;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0, 0}, l = {57, 65, 70, 72}, m = "maybePreloadLink", n = {"this", "onLoad"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3620e6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3674k6 f40582a;

    /* renamed from: b, reason: collision with root package name */
    public OnLoadCallback f40583b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3674k6 f40585d;

    /* renamed from: e, reason: collision with root package name */
    public int f40586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3620e6(C3674k6 c3674k6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40585d = c3674k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40584c = obj;
        this.f40586e |= Integer.MIN_VALUE;
        return this.f40585d.a(null, this);
    }
}
