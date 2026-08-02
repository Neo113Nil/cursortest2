package w5;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6707c {
    private static final /* synthetic */ EnumC6707c[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f67427a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6707c f67428b = new EnumC6707c("None", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6707c f67429c = new EnumC6707c("Top", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6707c f67430d = new EnumC6707c("Bottom", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6707c f67431e = new EnumC6707c("Left", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6707c f67432f = new EnumC6707c("Right", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6707c f67433g = new EnumC6707c("Start", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6707c f67434h = new EnumC6707c("End", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6707c f67435i = new EnumC6707c("CenterVertical", 7);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC6707c f67436j = new EnumC6707c("FillVertical", 8);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC6707c f67437k = new EnumC6707c("CenterHorizontal", 9);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC6707c f67438l = new EnumC6707c("FillHorizontal", 10);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC6707c f67439m = new EnumC6707c("Center", 11);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC6707c f67440n = new EnumC6707c("Fill", 12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f67441o;

    /* renamed from: w5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC6707c a(int i10) {
            return i10 != 1 ? i10 != 3 ? i10 != 5 ? i10 != 7 ? i10 != 48 ? i10 != 80 ? i10 != 112 ? i10 != 119 ? i10 != 8388611 ? i10 != 8388613 ? i10 != 16 ? i10 != 17 ? EnumC6707c.f67428b : EnumC6707c.f67439m : EnumC6707c.f67435i : EnumC6707c.f67434h : EnumC6707c.f67433g : EnumC6707c.f67440n : EnumC6707c.f67436j : EnumC6707c.f67430d : EnumC6707c.f67429c : EnumC6707c.f67438l : EnumC6707c.f67432f : EnumC6707c.f67431e : EnumC6707c.f67437k;
        }

        public a() {
        }
    }

    static {
        EnumC6707c[] a10 = a();
        $VALUES = a10;
        f67441o = EnumEntriesKt.enumEntries(a10);
        f67427a = new a(null);
    }

    public EnumC6707c(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6707c[] a() {
        return new EnumC6707c[]{f67428b, f67429c, f67430d, f67431e, f67432f, f67433g, f67434h, f67435i, f67436j, f67437k, f67438l, f67439m, f67440n};
    }

    public static EnumC6707c valueOf(String str) {
        return (EnumC6707c) Enum.valueOf(EnumC6707c.class, str);
    }

    public static EnumC6707c[] values() {
        return (EnumC6707c[]) $VALUES.clone();
    }
}
