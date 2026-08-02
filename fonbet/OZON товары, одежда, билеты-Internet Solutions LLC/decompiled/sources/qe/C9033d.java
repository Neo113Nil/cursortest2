package qe;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC7695b;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9033d<T> extends AbstractC9032c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object[] f81946a;

    /* renamed from: b, reason: collision with root package name */
    private int f81947b;

    /* renamed from: qe.d$a */
    public static final class a extends AbstractC7695b<T> {

        /* renamed from: c, reason: collision with root package name */
        private int f81948c = -1;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9033d<T> f81949d;

        a(C9033d<T> c9033d) {
            this.f81949d = c9033d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC7695b
        protected final void b() {
            C9033d<T> c9033d;
            do {
                int i11 = this.f81948c + 1;
                this.f81948c = i11;
                c9033d = this.f81949d;
                if (i11 >= ((C9033d) c9033d).f81946a.length) {
                    break;
                }
            } while (((C9033d) c9033d).f81946a[this.f81948c] == null);
            if (this.f81948c >= ((C9033d) c9033d).f81946a.length) {
                c();
                return;
            }
            Object obj = ((C9033d) c9033d).f81946a[this.f81948c];
            Intrinsics.g(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    public C9033d() {
        super(0);
        this.f81946a = new Object[20];
        this.f81947b = 0;
    }

    @Override // qe.AbstractC9032c
    public final void b(int i11, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f81946a;
        if (objArr.length <= i11) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i11);
            Object[] copyOf = Arrays.copyOf(this.f81946a, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f81946a = copyOf;
        }
        Object[] objArr2 = this.f81946a;
        if (objArr2[i11] == null) {
            this.f81947b++;
        }
        objArr2[i11] = value;
    }

    @Override // qe.AbstractC9032c
    public final T get(int i11) {
        return (T) C7705l.K(i11, this.f81946a);
    }

    @Override // qe.AbstractC9032c
    public final int getSize() {
        return this.f81947b;
    }

    @Override // qe.AbstractC9032c, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
