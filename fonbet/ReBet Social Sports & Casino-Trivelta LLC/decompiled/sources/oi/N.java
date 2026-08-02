package oi;

import kotlin.jvm.internal.CharCompanionObject;

/* loaded from: classes5.dex */
public enum N implements p {
    ERROR_MESSAGE;

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.p
    public char a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(o oVar, o oVar2) {
        boolean f10 = oVar.f(this);
        if (f10 == oVar2.f(this)) {
            return 0;
        }
        return f10 ? 1 : -1;
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String c() {
        return String.valueOf(CharCompanionObject.MAX_VALUE);
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String d0() {
        return "";
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return String.class;
    }
}
