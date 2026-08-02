package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class e8 implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8 f40588b;

    public e8(g8 g8Var, ArrayList arrayList) {
        this.f40588b = g8Var;
        this.f40587a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() {
        this.f40588b.f40632a.beginTransaction();
        try {
            this.f40588b.f40633b.handleMultiple(this.f40587a);
            this.f40588b.f40632a.setTransactionSuccessful();
            return Unit.INSTANCE;
        } finally {
            this.f40588b.f40632a.endTransaction();
        }
    }
}
