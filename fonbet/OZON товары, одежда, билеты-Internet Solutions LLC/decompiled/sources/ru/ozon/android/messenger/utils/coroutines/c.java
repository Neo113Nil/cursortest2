package ru.ozon.android.messenger.utils.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends AbstractC7737t implements Function1<T, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M<T> f91891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M<B0> f91892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ xe.M f91893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f91894e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f91895f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M<T> m11, M<B0> m12, xe.M m13, long j11, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            super(1);
            this.f91891b = m11;
            this.f91892c = m12;
            this.f91893d = m13;
            this.f91894e = j11;
            this.f91895f = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            M<T> m11 = this.f91891b;
            m11.f71787a = obj;
            M<B0> m12 = this.f91892c;
            B0 b02 = m12.f71787a;
            if (b02 == null || b02.l0()) {
                m12.f71787a = (T) C10727i.c(this.f91893d, null, null, new b(this.f91894e, this.f91895f, m11, null), 3);
            }
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final <T> Function1<T, Unit> a(@NotNull xe.M coroutineScope, long j11, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> destinationFunction) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
        return new a(new M(), new M(), coroutineScope, j11, destinationFunction);
    }
}
