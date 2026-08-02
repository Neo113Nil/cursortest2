package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ex4 implements Iterator, eia {
    public int a = -1;
    public int b;
    public int c;
    public IntRange d;
    public int e;
    public final /* synthetic */ fx4 f;

    public ex4(fx4 fx4Var) {
        this.f = fx4Var;
        int c = llf.c(0, 0, fx4Var.a.length());
        this.b = c;
        this.c = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        fx4 fx4Var = this.f;
        CharSequence charSequence = fx4Var.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i2 = fx4Var.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) fx4Var.c.invoke(charSequence, Integer.valueOf(this.c));
            if (pair == null) {
                this.d = new IntRange(this.b, StringsKt.N(charSequence), 1);
                this.c = -1;
            } else {
                int intValue = ((Number) pair.a).intValue();
                int intValue2 = ((Number) pair.b).intValue();
                this.d = llf.j(this.b, intValue);
                int i4 = intValue + intValue2;
                this.b = i4;
                this.c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.a = 1;
        }
        this.d = new IntRange(this.b, StringsKt.N(charSequence), 1);
        this.c = -1;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            yhk.d();
            return null;
        }
        IntRange intRange = this.d;
        intRange.getClass();
        this.d = null;
        this.a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
