package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3641h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3655i5 f40638a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3560b0 f40639b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gson f40640c;

    /* renamed from: d, reason: collision with root package name */
    public final Type f40641d;

    public C3641h0(@NotNull C3655i5 storage, @NotNull C3560b0 crashReportFactory) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        this.f40638a = storage;
        this.f40639b = crashReportFactory;
        this.f40640c = new Gson();
        this.f40641d = new C3570c0().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3641h0 c3641h0, String str, Type type, ContinuationImpl continuationImpl) {
        C3623f0 c3623f0;
        int i10;
        if (continuationImpl instanceof C3623f0) {
            c3623f0 = (C3623f0) continuationImpl;
            int i11 = c3623f0.f40594e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3623f0.f40594e = i11 - Integer.MIN_VALUE;
                Object obj = c3623f0.f40592c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3623f0.f40594e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3655i5 c3655i5 = c3641h0.f40638a;
                    c3623f0.f40590a = c3641h0;
                    c3623f0.f40591b = type;
                    c3623f0.f40594e = 1;
                    obj = AbstractC1455i.g(C1452g0.b(), new C3628f5(c3655i5, str, null), c3623f0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    type = c3623f0.f40591b;
                    c3641h0 = c3623f0.f40590a;
                    ResultKt.throwOnFailure(obj);
                }
                Object n10 = c3641h0.f40640c.n((String) obj, type);
                Intrinsics.checkNotNullExpressionValue(n10, "fromJson(...)");
                return n10;
            }
        }
        c3623f0 = new C3623f0(c3641h0, continuationImpl);
        Object obj2 = c3623f0.f40592c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3623f0.f40594e;
        if (i10 != 0) {
        }
        Object n102 = c3641h0.f40640c.n((String) obj2, type);
        Intrinsics.checkNotNullExpressionValue(n102, "fromJson(...)");
        return n102;
    }

    public static String a() {
        return UUID.randomUUID() + ".txt";
    }
}
