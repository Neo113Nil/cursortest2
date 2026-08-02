package net.time4j.format;

import oi.InterfaceC5907c;

/* loaded from: classes5.dex */
public final class q implements InterfaceC5907c {

    /* renamed from: a, reason: collision with root package name */
    public final String f58115a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f58116b;

    public q(String str, Class cls) {
        if (str == null) {
            throw new NullPointerException("Missing name of attribute key.");
        }
        if (cls == null) {
            throw new NullPointerException("Missing type of attribute.");
        }
        this.f58115a = str;
        this.f58116b = cls;
    }

    public static q a(String str, Class cls) {
        return new q(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f58115a.equals(qVar.f58115a) && this.f58116b.equals(qVar.f58116b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f58115a.hashCode();
    }

    @Override // oi.InterfaceC5907c
    public String name() {
        return this.f58115a;
    }

    public String toString() {
        return this.f58116b.getName() + "@" + this.f58115a;
    }

    @Override // oi.InterfaceC5907c
    public Class type() {
        return this.f58116b;
    }
}
