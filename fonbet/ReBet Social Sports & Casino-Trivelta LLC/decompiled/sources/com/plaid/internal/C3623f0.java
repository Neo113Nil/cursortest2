package com.plaid.internal;

import java.lang.reflect.Type;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", f = "CrashStorage.kt", i = {0, 0}, l = {53}, m = "loadEvents", n = {"this", "eventType"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3623f0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3641h0 f40590a;

    /* renamed from: b, reason: collision with root package name */
    public Type f40591b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3641h0 f40593d;

    /* renamed from: e, reason: collision with root package name */
    public int f40594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3623f0(C3641h0 c3641h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40593d = c3641h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40592c = obj;
        this.f40594e |= Integer.MIN_VALUE;
        return C3641h0.a(this.f40593d, null, null, this);
    }
}
