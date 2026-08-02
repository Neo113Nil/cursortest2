package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Xf {
    private String a;

    /* JADX WARN: Multi-variable type inference failed */
    public Xf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Xf) && Intrinsics.areEqual(this.a, ((Xf) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.a + ")";
    }

    public Xf(String str) {
        this.a = str;
    }

    public final Xf a(String str) {
        return new Xf(str);
    }

    public final void b(String str) {
        this.a = str;
    }

    public /* synthetic */ Xf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Xf a(Xf xf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xf.a;
        }
        return xf.a(str);
    }
}
