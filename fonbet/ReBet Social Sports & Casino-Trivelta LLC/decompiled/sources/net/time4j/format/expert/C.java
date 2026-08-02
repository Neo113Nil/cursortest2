package net.time4j.format.expert;

import java.util.List;
import java.util.Set;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public enum C implements h {
    INSTANCE;

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        if (!oVar.d()) {
            throw new IllegalArgumentException("Cannot extract timezone id from: " + oVar);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        String a10 = oVar.r().a();
        appendable.append(a10);
        int length2 = a10.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new C5713g(B.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return B.TIMEZONE_ID;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        char charAt;
        char charAt2;
        int length = charSequence.length();
        int f10 = sVar.f();
        if (f10 >= length) {
            sVar.k(f10, "Missing timezone name.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = f10;
        while (i10 < length && (((charAt2 = charSequence.charAt(i10)) >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_' || charAt2 == '/'))) {
            sb2.append(charAt2);
            i10++;
        }
        if (!Character.isLetter(sb2.charAt(sb2.length() - 1))) {
            sb2.deleteCharAt(sb2.length() - 1);
            i10--;
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            sVar.k(f10, "Missing valid timezone id.");
            return;
        }
        if (sb3.startsWith("Etc/GMT")) {
            sVar.k(f10, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
            return;
        }
        if (sb3.equals("Z")) {
            tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.f58410k);
            sVar.l(i10);
            return;
        }
        if (sb3.equals("UTC") || sb3.equals("GMT") || sb3.equals("UT")) {
            if (length <= i10 || !((charAt = charSequence.charAt(i10)) == '+' || charAt == '-')) {
                tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.f58410k);
                sVar.l(i10);
                return;
            } else {
                sVar.l(i10);
                E.f57873f.c(charSequence, sVar, interfaceC5908d, tVar, z10);
                return;
            }
        }
        List u10 = net.time4j.tz.l.u("INCLUDE_ALIAS");
        int size = u10.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            net.time4j.tz.k kVar = (net.time4j.tz.k) u10.get(i12);
            int compareTo = kVar.a().compareTo(sb3);
            if (compareTo < 0) {
                i11 = i12 + 1;
            } else {
                if (compareTo <= 0) {
                    tVar.C(B.TIMEZONE_ID, kVar);
                    sVar.l(i10);
                    return;
                }
                size = i12 - 1;
            }
        }
        sVar.k(f10, "Cannot parse to timezone id: " + sb3);
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return INSTANCE;
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return INSTANCE;
    }
}
