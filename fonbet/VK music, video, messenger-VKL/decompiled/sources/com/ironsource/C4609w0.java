package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import xsna.epx;
import xsna.fw3;

/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4609w0 {
    private final String a;
    private final List<NetworkSettings> b;
    private final C4440ma c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4609w0(String str, List<? extends NetworkSettings> list, C4440ma c4440ma) {
        this.a = str;
        this.b = list;
        this.c = c4440ma;
    }

    public final String a() {
        return this.a;
    }

    public final List<NetworkSettings> b() {
        return this.b;
    }

    public final C4440ma c() {
        return this.c;
    }

    public final List<NetworkSettings> d() {
        return this.b;
    }

    public final C4440ma e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4609w0)) {
            return false;
        }
        C4609w0 c4609w0 = (C4609w0) obj;
        return epx.f(this.a, c4609w0.a) && epx.f(this.b, c4609w0.b) && epx.f(this.c, c4609w0.c);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return this.c.hashCode() + fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final C4609w0 a(String str, List<? extends NetworkSettings> list, C4440ma c4440ma) {
        return new C4609w0(str, list, c4440ma);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4609w0 a(C4609w0 c4609w0, String str, List list, C4440ma c4440ma, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4609w0.a;
        }
        if ((i & 2) != 0) {
            list = c4609w0.b;
        }
        if ((i & 4) != 0) {
            c4440ma = c4609w0.c;
        }
        return c4609w0.a(str, list, c4440ma);
    }
}
