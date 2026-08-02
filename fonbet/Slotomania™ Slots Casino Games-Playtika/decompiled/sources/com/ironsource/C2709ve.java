package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2709ve {
    private final String a;
    private final String b;
    private final List<IronSource.a> c;

    public C2709ve(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
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
        if (!(obj instanceof C2709ve)) {
            return false;
        }
        C2709ve c2709ve = (C2709ve) obj;
        return Intrinsics.areEqual(this.a, c2709ve.a) && Intrinsics.areEqual(this.b, c2709ve.b) && Intrinsics.areEqual(this.c, c2709ve.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    public final C2709ve a(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C2709ve(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2709ve a(C2709ve c2709ve, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2709ve.a;
        }
        if ((i & 2) != 0) {
            str2 = c2709ve.b;
        }
        if ((i & 4) != 0) {
            list = c2709ve.c;
        }
        return c2709ve.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C2709ve(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
