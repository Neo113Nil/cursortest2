package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {107}, m = "getUrlUri", n = {}, s = {})
/* renamed from: com.plaid.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3788x4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3806z4 f41190b;

    /* renamed from: c, reason: collision with root package name */
    public int f41191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3788x4(C3806z4 c3806z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41190b = c3806z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41189a = obj;
        this.f41191c |= Integer.MIN_VALUE;
        return this.f41190b.a(this);
    }
}
