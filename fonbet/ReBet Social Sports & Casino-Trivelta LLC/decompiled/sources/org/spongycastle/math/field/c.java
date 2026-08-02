package org.spongycastle.math.field;

/* loaded from: classes5.dex */
public class c implements e {
    protected final int[] exponents;

    public c(int[] iArr) {
        this.exponents = Aj.a.g(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Aj.a.c(this.exponents, ((c) obj).exponents);
        }
        return false;
    }

    @Override // org.spongycastle.math.field.e
    public int getDegree() {
        return this.exponents[r0.length - 1];
    }

    @Override // org.spongycastle.math.field.e
    public int[] getExponentsPresent() {
        return Aj.a.g(this.exponents);
    }

    public int hashCode() {
        return Aj.a.s(this.exponents);
    }
}
