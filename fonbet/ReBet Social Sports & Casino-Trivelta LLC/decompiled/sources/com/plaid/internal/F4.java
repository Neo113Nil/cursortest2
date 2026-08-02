package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class F4 implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f39247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H4 f39248d;

    public F4(H4 h42, String str, String str2, byte[] bArr) {
        this.f39248d = h42;
        this.f39245a = str;
        this.f39246b = str2;
        this.f39247c = bArr;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() {
        E2.k acquire = this.f39248d.f39271b.acquire();
        acquire.P0(1, this.f39245a);
        acquire.P0(2, this.f39246b);
        acquire.j1(3, this.f39247c);
        try {
            this.f39248d.f39270a.beginTransaction();
            try {
                acquire.J0();
                this.f39248d.f39270a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f39248d.f39270a.endTransaction();
            }
        } finally {
            this.f39248d.f39271b.release(acquire);
        }
    }
}
