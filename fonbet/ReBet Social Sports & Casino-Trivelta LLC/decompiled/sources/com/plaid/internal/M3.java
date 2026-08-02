package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class M3 implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P3 f39375d;

    public M3(P3 p32, String str, String str2, String str3) {
        this.f39375d = p32;
        this.f39372a = str;
        this.f39373b = str2;
        this.f39374c = str3;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() {
        E2.k acquire = this.f39375d.f39507b.acquire();
        acquire.P0(1, this.f39372a);
        acquire.P0(2, this.f39373b);
        acquire.P0(3, this.f39374c);
        try {
            this.f39375d.f39506a.beginTransaction();
            try {
                acquire.J0();
                this.f39375d.f39506a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f39375d.f39506a.endTransaction();
            }
        } finally {
            this.f39375d.f39507b.release(acquire);
        }
    }
}
