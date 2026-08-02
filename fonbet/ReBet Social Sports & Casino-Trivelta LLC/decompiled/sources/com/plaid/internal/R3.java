package com.plaid.internal;

import com.twilio.voice.EventKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", f = "LocalPaneStateDatabaseStore.kt", i = {0, 0, 0}, l = {23}, m = "putString", n = {"this", "key", EventKeys.VALUE_KEY}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class R3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public S3 f39583a;

    /* renamed from: b, reason: collision with root package name */
    public String f39584b;

    /* renamed from: c, reason: collision with root package name */
    public String f39585c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S3 f39587e;

    /* renamed from: f, reason: collision with root package name */
    public int f39588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s32, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39587e = s32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39586d = obj;
        this.f39588f |= Integer.MIN_VALUE;
        return this.f39587e.a(null, null, null, this);
    }
}
