package net.time4j.format.expert;

import java.util.Set;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f58072a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5918n f58073b;

    public y(InterfaceC5918n interfaceC5918n, int i10) {
        if (interfaceC5918n == null) {
            throw new NullPointerException("Missing condition for unparseable chars.");
        }
        if (i10 >= 1) {
            this.f58073b = interfaceC5918n;
            this.f58072a = i10;
        } else {
            throw new IllegalArgumentException("Must be positive: " + i10);
        }
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        return 0;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return null;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int i10;
        int i11;
        int f10 = sVar.f();
        int length = charSequence.length();
        if (this.f58073b == null) {
            i10 = length - this.f58072a;
        } else {
            int i12 = f10;
            for (int i13 = 0; i13 < this.f58072a && (i11 = i13 + f10) < length && this.f58073b.test(Character.valueOf(charSequence.charAt(i11))); i13++) {
                i12++;
            }
            i10 = i12;
        }
        int min = Math.min(Math.max(i10, 0), length);
        if (min > f10) {
            sVar.l(min);
        }
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f58072a == yVar.f58072a) {
                InterfaceC5918n interfaceC5918n = this.f58073b;
                InterfaceC5918n interfaceC5918n2 = yVar.f58073b;
                if (interfaceC5918n != null ? interfaceC5918n.equals(interfaceC5918n2) : interfaceC5918n2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        InterfaceC5918n interfaceC5918n = this.f58073b;
        if (interfaceC5918n == null) {
            return this.f58072a;
        }
        return interfaceC5918n.hashCode() ^ (~this.f58072a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(y.class.getName());
        if (this.f58073b == null) {
            sb2.append("[keepRemainingChars=");
            sb2.append(this.f58072a);
        } else {
            sb2.append("[condition=");
            sb2.append(this.f58073b);
            sb2.append(", maxIterations=");
            sb2.append(this.f58072a);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return this;
    }
}
