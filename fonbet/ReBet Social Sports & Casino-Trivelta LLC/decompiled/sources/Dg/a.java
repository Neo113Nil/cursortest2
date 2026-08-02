package Dg;

import com.facebook.react.uimanager.ViewProps;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f2748b = new a("INVITE", 0, "invite");

    /* renamed from: c, reason: collision with root package name */
    public static final a f2749c = new a("ACCEPT", 1, "accept");

    /* renamed from: d, reason: collision with root package name */
    public static final a f2750d = new a("MISS", 2, "miss");

    /* renamed from: e, reason: collision with root package name */
    public static final a f2751e = new a("CANCEL", 3, "cancel");

    /* renamed from: f, reason: collision with root package name */
    public static final a f2752f = new a("REJECT", 4, "reject");

    /* renamed from: g, reason: collision with root package name */
    public static final a f2753g = new a("END", 5, ViewProps.END);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2754h;

    /* renamed from: a, reason: collision with root package name */
    public final String f2755a;

    static {
        a[] a10 = a();
        $VALUES = a10;
        f2754h = EnumEntriesKt.enumEntries(a10);
    }

    public a(String str, int i10, String str2) {
        this.f2755a = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f2748b, f2749c, f2750d, f2751e, f2752f, f2753g};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.f2755a;
    }
}
