package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", f = "OAuthRedirectUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readOAuthRedirectUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3726q4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f40999a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3734r4 f41001c;

    /* renamed from: d, reason: collision with root package name */
    public int f41002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3726q4(C3734r4 c3734r4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41001c = c3734r4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41000b = obj;
        this.f41002d |= Integer.MIN_VALUE;
        return this.f41001c.a(this);
    }
}
