package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class N3 implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P3 f39454b;

    public N3(P3 p32, String str) {
        this.f39454b = p32;
        this.f39453a = str;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() {
        E2.k acquire = this.f39454b.f39508c.acquire();
        acquire.P0(1, this.f39453a);
        try {
            this.f39454b.f39506a.beginTransaction();
            try {
                acquire.G();
                this.f39454b.f39506a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f39454b.f39506a.endTransaction();
            }
        } finally {
            this.f39454b.f39508c.release(acquire);
        }
    }
}
