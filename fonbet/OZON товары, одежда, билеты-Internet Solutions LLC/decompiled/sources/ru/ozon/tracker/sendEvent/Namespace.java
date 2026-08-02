package ru.ozon.tracker.sendEvent;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/tracker/sendEvent/Namespace;", "", "<init>", "(Ljava/lang/String;I)V", "BX", "TRAVEL", "TRAVEL_APP", "FRESH", "SELECT", "SC", "CA", "FINANCE_BANK", "FINANCE_PVZ", "FINANCE_RKO", "FX", "PVZ_MOBILE", "SHIPPING_SUPERAPP", "HIRE", "MPX", "INSTALLER", "TRAVEL_EXTRANET_APP", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Namespace {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Namespace[] $VALUES;

    /* renamed from: BX, reason: collision with root package name */
    public static final Namespace f97866BX = new Namespace("BX", 0);
    public static final Namespace TRAVEL = new Namespace("TRAVEL", 1);
    public static final Namespace TRAVEL_APP = new Namespace("TRAVEL_APP", 2);
    public static final Namespace FRESH = new Namespace("FRESH", 3);
    public static final Namespace SELECT = new Namespace("SELECT", 4);
    public static final Namespace SC = new Namespace("SC", 5);

    /* renamed from: CA, reason: collision with root package name */
    public static final Namespace f97867CA = new Namespace("CA", 6);
    public static final Namespace FINANCE_BANK = new Namespace("FINANCE_BANK", 7);
    public static final Namespace FINANCE_PVZ = new Namespace("FINANCE_PVZ", 8);
    public static final Namespace FINANCE_RKO = new Namespace("FINANCE_RKO", 9);

    /* renamed from: FX, reason: collision with root package name */
    public static final Namespace f97868FX = new Namespace("FX", 10);
    public static final Namespace PVZ_MOBILE = new Namespace("PVZ_MOBILE", 11);
    public static final Namespace SHIPPING_SUPERAPP = new Namespace("SHIPPING_SUPERAPP", 12);
    public static final Namespace HIRE = new Namespace("HIRE", 13);
    public static final Namespace MPX = new Namespace("MPX", 14);
    public static final Namespace INSTALLER = new Namespace("INSTALLER", 15);
    public static final Namespace TRAVEL_EXTRANET_APP = new Namespace("TRAVEL_EXTRANET_APP", 16);

    private static final /* synthetic */ Namespace[] $values() {
        return new Namespace[]{f97866BX, TRAVEL, TRAVEL_APP, FRESH, SELECT, SC, f97867CA, FINANCE_BANK, FINANCE_PVZ, FINANCE_RKO, f97868FX, PVZ_MOBILE, SHIPPING_SUPERAPP, HIRE, MPX, INSTALLER, TRAVEL_EXTRANET_APP};
    }

    static {
        Namespace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Namespace(String str, int i11) {
    }

    @NotNull
    public static a<Namespace> getEntries() {
        return $ENTRIES;
    }

    public static Namespace valueOf(String str) {
        return (Namespace) Enum.valueOf(Namespace.class, str);
    }

    public static Namespace[] values() {
        return (Namespace[]) $VALUES.clone();
    }
}
