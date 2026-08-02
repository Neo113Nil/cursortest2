package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import com.ironsource.X3;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final C0309a a;
    public static final a b = new a("Portrait", 0);
    public static final a c = new a("Landscape", 1);
    public static final a d = new a("None", 2);
    public static final /* synthetic */ a[] e;
    public static final /* synthetic */ EnumEntries f;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a$a, reason: collision with other inner class name */
    public static final class C0309a {
        public /* synthetic */ C0309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode == 3387192) {
                if (str.equals("none")) {
                    return a.d;
                }
                return null;
            }
            if (hashCode == 729267099) {
                if (str.equals(X3.i.D)) {
                    return a.b;
                }
                return null;
            }
            if (hashCode == 1430647483 && str.equals(X3.i.C)) {
                return a.c;
            }
            return null;
        }

        public C0309a() {
        }
    }

    static {
        a[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
        a = new C0309a(null);
    }

    public a(String str, int i) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{b, c, d};
    }

    public static EnumEntries<a> b() {
        return f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
