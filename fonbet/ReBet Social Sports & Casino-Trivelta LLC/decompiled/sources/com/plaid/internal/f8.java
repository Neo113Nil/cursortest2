package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class f8 implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f40613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g8 f40614d;

    public f8(g8 g8Var, String str, String str2, byte[] bArr) {
        this.f40614d = g8Var;
        this.f40611a = str;
        this.f40612b = str2;
        this.f40613c = bArr;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() {
        E2.k acquire = this.f40614d.f40634c.acquire();
        acquire.P0(1, this.f40611a);
        acquire.P0(2, this.f40612b);
        acquire.j1(3, this.f40613c);
        try {
            this.f40614d.f40632a.beginTransaction();
            try {
                acquire.J0();
                this.f40614d.f40632a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f40614d.f40632a.endTransaction();
            }
        } finally {
            this.f40614d.f40634c.release(acquire);
        }
    }
}
