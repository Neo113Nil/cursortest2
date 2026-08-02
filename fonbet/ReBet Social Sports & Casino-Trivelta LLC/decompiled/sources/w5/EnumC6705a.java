package w5;

import com.plaid.internal.EnumC3631g;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6705a {
    private static final /* synthetic */ EnumC6705a[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6705a f67405b = new EnumC6705a("PLAIN_TEXT", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6705a f67406c = new EnumC6705a("PASSWORD", 1, EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6705a f67407d = new EnumC6705a("EMAIL", 2, 33);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6705a f67408e = new EnumC6705a("PHONE", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6705a f67409f = new EnumC6705a("NUMBER", 4, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6705a f67410g = new EnumC6705a("NUMBER_SIGNED", 5, 4098);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6705a f67411h = new EnumC6705a("NUMBER_DECIMAL", 6, 8194);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6705a f67412i = new EnumC6705a("MULTI_LINE", 7, 131073);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC6705a f67413j = new EnumC6705a("DATE", 8, 20);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC6705a f67414k = new EnumC6705a("TIME", 9, 36);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC6705a f67415l = new EnumC6705a("URI", 10, 17);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC6705a f67416m = new EnumC6705a("WEB_SEARCH", 11, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC6705a f67417n = new EnumC6705a("PERSON_NAME", 12, 97);

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC6705a f67418o = new EnumC6705a("POSTAL_ADDRESS", 13, 113);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC6705a f67419p = new EnumC6705a("NONE", 14, 0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f67420q;

    /* renamed from: a, reason: collision with root package name */
    public final int f67421a;

    static {
        EnumC6705a[] a10 = a();
        $VALUES = a10;
        f67420q = EnumEntriesKt.enumEntries(a10);
    }

    public EnumC6705a(String str, int i10, int i11) {
        this.f67421a = i11;
    }

    public static final /* synthetic */ EnumC6705a[] a() {
        return new EnumC6705a[]{f67405b, f67406c, f67407d, f67408e, f67409f, f67410g, f67411h, f67412i, f67413j, f67414k, f67415l, f67416m, f67417n, f67418o, f67419p};
    }

    public static EnumC6705a valueOf(String str) {
        return (EnumC6705a) Enum.valueOf(EnumC6705a.class, str);
    }

    public static EnumC6705a[] values() {
        return (EnumC6705a[]) $VALUES.clone();
    }

    public final int b() {
        return this.f67421a;
    }
}
