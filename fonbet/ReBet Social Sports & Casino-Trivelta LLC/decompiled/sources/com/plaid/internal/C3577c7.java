package com.plaid.internal;

import androidx.lifecycle.InterfaceC2193s;
import com.plaid.internal.C3577c7;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3577c7<T> extends androidx.lifecycle.B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f39853a = new AtomicBoolean(false);

    public static final void a(C3577c7 this$0, androidx.lifecycle.C observer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        if (this$0.f39853a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(@NotNull InterfaceC2193s owner, @NotNull final androidx.lifecycle.C observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (hasActiveObservers()) {
            throw new B2("Only one observer supported");
        }
        super.observe(owner, new androidx.lifecycle.C() { // from class: hc.m
            @Override // androidx.lifecycle.C
            public final void onChanged(Object obj) {
                C3577c7.a(C3577c7.this, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.B, androidx.lifecycle.LiveData
    public final void setValue(T t10) {
        this.f39853a.set(true);
        super.setValue(t10);
    }
}
