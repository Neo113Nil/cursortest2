package d5;

import com.facebook.react.uimanager.ViewProps;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4005a {
    private static final /* synthetic */ EnumC4005a[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4005a f44960b = new EnumC4005a("UP", 0, "up");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4005a f44961c = new EnumC4005a("DOWN", 1, "down");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4005a f44962d = new EnumC4005a("LEFT", 2, ViewProps.LEFT);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4005a f44963e = new EnumC4005a("RIGHT", 3, ViewProps.RIGHT);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f44964f;

    /* renamed from: a, reason: collision with root package name */
    public final String f44965a;

    static {
        EnumC4005a[] a10 = a();
        $VALUES = a10;
        f44964f = EnumEntriesKt.enumEntries(a10);
    }

    public EnumC4005a(String str, int i10, String str2) {
        this.f44965a = str2;
    }

    public static final /* synthetic */ EnumC4005a[] a() {
        return new EnumC4005a[]{f44960b, f44961c, f44962d, f44963e};
    }

    public static EnumC4005a valueOf(String str) {
        return (EnumC4005a) Enum.valueOf(EnumC4005a.class, str);
    }

    public static EnumC4005a[] values() {
        return (EnumC4005a[]) $VALUES.clone();
    }

    public final String b() {
        return this.f44965a;
    }
}
