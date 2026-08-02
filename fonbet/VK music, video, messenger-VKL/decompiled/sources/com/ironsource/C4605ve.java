package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import xsna.epx;
import xsna.vp;
import xsna.xe9;
import xsna.zcl;

/* renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4605ve {
    private final String a;
    private final String b;
    private final List<IronSource.a> c;

    public C4605ve(String str, String str2, List<IronSource.a> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<IronSource.a> c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final List<IronSource.a> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4605ve)) {
            return false;
        }
        C4605ve c4605ve = (C4605ve) obj;
        return epx.f(this.a, c4605ve.a) && epx.f(this.b, c4605ve.b) && epx.f(this.c, c4605ve.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return vp.b(")", xe9.a("SdkInitRequest(appKey=", str, ", userId=", str2, ", legacyAdFormats="), this.c);
    }

    public final C4605ve a(String str, String str2, List<IronSource.a> list) {
        return new C4605ve(str, str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4605ve a(C4605ve c4605ve, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4605ve.a;
        }
        if ((i & 2) != 0) {
            str2 = c4605ve.b;
        }
        if ((i & 4) != 0) {
            list = c4605ve.c;
        }
        return c4605ve.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> list) {
        this.c.clear();
        this.c.addAll(list);
    }

    public /* synthetic */ C4605ve(String str, String str2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
