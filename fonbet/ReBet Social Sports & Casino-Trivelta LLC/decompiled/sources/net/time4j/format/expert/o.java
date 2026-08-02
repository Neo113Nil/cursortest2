package net.time4j.format.expert;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f58024a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f58025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58026c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58027d;

    /* renamed from: e, reason: collision with root package name */
    public final Locale f58028e;

    public o(oi.p pVar, Map map) {
        Map hashMap;
        Class type = pVar.getType();
        if (!type.isEnum()) {
            hashMap = new HashMap(map.size());
        } else {
            if (map.size() < type.getEnumConstants().length) {
                throw new IllegalArgumentException("Not enough text resources defined for enum: " + type.getName());
            }
            hashMap = g(type);
        }
        hashMap.putAll(map);
        this.f58024a = pVar;
        this.f58025b = Collections.unmodifiableMap(hashMap);
        this.f58026c = 0;
        this.f58027d = true;
        this.f58028e = Locale.getDefault();
    }

    public static Map g(Class cls) {
        return new EnumMap(cls);
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        if (!(appendable instanceof CharSequence)) {
            return i(oVar, appendable);
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        int i10 = i(oVar, appendable);
        if (set != null) {
            set.add(new C5713g(this.f58024a, length, charSequence.length()));
        }
        return i10;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f58024a;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int f10 = sVar.f();
        int length = charSequence.length();
        int intValue = z10 ? this.f58026c : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f10 >= length) {
            sVar.k(f10, "Missing chars for: " + this.f58024a.name());
            sVar.n();
            return;
        }
        boolean booleanValue = z10 ? this.f58027d : ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue();
        Locale locale = z10 ? this.f58028e : (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.getDefault());
        int i10 = length - f10;
        for (Object obj : this.f58025b.keySet()) {
            String h10 = h(obj);
            if (booleanValue) {
                String upperCase = h10.toUpperCase(locale);
                int length2 = h10.length();
                if (length2 <= i10) {
                    int i11 = length2 + f10;
                    if (upperCase.equals(charSequence.subSequence(f10, i11).toString().toUpperCase(locale))) {
                        tVar.C(this.f58024a, obj);
                        sVar.l(i11);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = h10.length();
                if (length3 <= i10) {
                    int i12 = length3 + f10;
                    if (h10.equals(charSequence.subSequence(f10, i12).toString())) {
                        tVar.C(this.f58024a, obj);
                        sVar.l(i12);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        sVar.k(f10, "Element value could not be parsed: " + this.f58024a.name());
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new o(this.f58024a, this.f58025b, ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue(), ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue(), (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.getDefault()));
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f58024a.equals(oVar.f58024a) && this.f58025b.equals(oVar.f58025b)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this.f58024a == pVar ? this : new o(pVar, this.f58025b);
    }

    public final String h(Object obj) {
        String str = (String) this.f58025b.get(obj);
        return str == null ? obj.toString() : str;
    }

    public int hashCode() {
        return (this.f58024a.hashCode() * 7) + (this.f58025b.hashCode() * 31);
    }

    public final int i(oi.o oVar, Appendable appendable) {
        String h10 = h(oVar.j(this.f58024a));
        appendable.append(h10);
        return h10.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(o.class.getName());
        sb2.append("[element=");
        sb2.append(this.f58024a.name());
        sb2.append(", resources=");
        sb2.append(this.f58025b);
        sb2.append(']');
        return sb2.toString();
    }

    public o(oi.p pVar, Map map, int i10, boolean z10, Locale locale) {
        this.f58024a = pVar;
        this.f58025b = map;
        this.f58026c = i10;
        this.f58027d = z10;
        this.f58028e = locale;
    }
}
