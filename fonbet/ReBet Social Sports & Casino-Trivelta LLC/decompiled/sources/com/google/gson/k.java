package com.google.gson;

import java.util.Set;

/* loaded from: classes3.dex */
public final class k extends h {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.g f38329a = new com.google.gson.internal.g(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f38329a.equals(this.f38329a);
        }
        return true;
    }

    public int hashCode() {
        return this.f38329a.hashCode();
    }

    public boolean isEmpty() {
        return this.f38329a.size() == 0;
    }

    public void m(String str, h hVar) {
        com.google.gson.internal.g gVar = this.f38329a;
        if (hVar == null) {
            hVar = j.f38328a;
        }
        gVar.put(str, hVar);
    }

    public void n(String str, Boolean bool) {
        m(str, bool == null ? j.f38328a : new n(bool));
    }

    public void o(String str, Number number) {
        m(str, number == null ? j.f38328a : new n(number));
    }

    public void p(String str, String str2) {
        m(str, str2 == null ? j.f38328a : new n(str2));
    }

    public Set q() {
        return this.f38329a.entrySet();
    }

    public h r(String str) {
        return (h) this.f38329a.get(str);
    }

    public k s(String str) {
        return (k) this.f38329a.get(str);
    }

    public int size() {
        return this.f38329a.size();
    }

    public boolean t(String str) {
        return this.f38329a.containsKey(str);
    }

    public Set u() {
        return this.f38329a.keySet();
    }

    public h v(String str) {
        return (h) this.f38329a.remove(str);
    }
}
