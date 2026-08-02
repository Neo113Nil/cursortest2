package x0;

import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;

/* loaded from: classes.dex */
public final class a0 implements androidx.compose.foundation.lazy.layout.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.I f104718a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f104719b;

    /* renamed from: c, reason: collision with root package name */
    private final int f104720c;

    static final class a extends AbstractC7737t implements Function1<C10600e<? extends AbstractC10611p.a>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f104721b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f104722c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.I<Object> f104723d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a0 f104724e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, androidx.collection.I<Object> i13, a0 a0Var) {
            super(1);
            this.f104721b = i11;
            this.f104722c = i12;
            this.f104723d = i13;
            this.f104724e = a0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
        
            if (r3 == null) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke(C10600e<? extends AbstractC10611p.a> c10600e) {
            Object c10599d;
            C10600e<? extends AbstractC10611p.a> c10600e2 = c10600e;
            Function1<Integer, Object> key = c10600e2.c().getKey();
            int max = Math.max(this.f104721b, c10600e2.b());
            int min = Math.min(this.f104722c, (c10600e2.a() + c10600e2.b()) - 1);
            if (max <= min) {
                while (true) {
                    if (key != null) {
                        c10599d = key.invoke(Integer.valueOf(max - c10600e2.b()));
                    }
                    c10599d = new C10599d(max);
                    this.f104723d.h(max, c10599d);
                    a0 a0Var = this.f104724e;
                    a0Var.f104719b[max - a0Var.f104720c] = c10599d;
                    if (max == min) {
                        break;
                    }
                    max++;
                }
            }
            return Unit.f71690a;
        }
    }

    public a0(@NotNull IntRange intRange, @NotNull AbstractC10611p<?> abstractC10611p) {
        Z g10 = abstractC10611p.g();
        int f71842a = intRange.getF71842a();
        if (f71842a < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int min = Math.min(intRange.getF71843b(), g10.e() - 1);
        if (min < f71842a) {
            this.f104718a = androidx.collection.P.a();
            this.f104719b = new Object[0];
            this.f104720c = 0;
        } else {
            int i11 = (min - f71842a) + 1;
            this.f104719b = new Object[i11];
            this.f104720c = f71842a;
            androidx.collection.I i12 = new androidx.collection.I(i11);
            g10.c(f71842a, min, new a(f71842a, min, i12, this));
            this.f104718a = i12;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.h
    public final int b(@NotNull Object obj) {
        androidx.collection.I i11 = this.f104718a;
        int a11 = i11.a(obj);
        if (a11 >= 0) {
            return i11.f38641c[a11];
        }
        return -1;
    }

    public final Object d(int i11) {
        int i12 = i11 - this.f104720c;
        if (i12 < 0) {
            return null;
        }
        Object[] objArr = this.f104719b;
        if (i12 <= C7705l.I(objArr)) {
            return objArr[i12];
        }
        return null;
    }
}
