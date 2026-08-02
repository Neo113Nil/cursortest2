package bo.app;

import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c9 {

    /* renamed from: b, reason: collision with root package name */
    public static final b9 f25332b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f25333c;

    /* renamed from: d, reason: collision with root package name */
    public static final c9 f25334d;

    /* renamed from: e, reason: collision with root package name */
    public static final c9 f25335e;

    /* renamed from: f, reason: collision with root package name */
    public static final c9 f25336f;

    /* renamed from: g, reason: collision with root package name */
    public static final c9 f25337g;

    /* renamed from: h, reason: collision with root package name */
    public static final c9 f25338h;

    /* renamed from: i, reason: collision with root package name */
    public static final c9 f25339i;

    /* renamed from: j, reason: collision with root package name */
    public static final c9 f25340j;

    /* renamed from: k, reason: collision with root package name */
    public static final c9 f25341k;

    /* renamed from: l, reason: collision with root package name */
    public static final c9 f25342l;

    /* renamed from: m, reason: collision with root package name */
    public static final c9 f25343m;

    /* renamed from: n, reason: collision with root package name */
    public static final c9 f25344n;

    /* renamed from: o, reason: collision with root package name */
    public static final c9 f25345o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c9[] f25346p;

    /* renamed from: a, reason: collision with root package name */
    public final String f25347a;

    static {
        c9 c9Var = new c9("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        f25334d = c9Var;
        c9 c9Var2 = new c9("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        f25335e = c9Var2;
        c9 c9Var3 = new c9("V3_DATA", 2, EventKeys.DATA);
        f25336f = c9Var3;
        c9 c9Var4 = new c9("TEMPLATE_REQUEST", 3, "template");
        f25337g = c9Var4;
        c9 c9Var5 = new c9("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        f25338h = c9Var5;
        c9 c9Var6 = new c9("GEOFENCE_REFRESH", 5, "geofence/request");
        f25339i = c9Var6;
        c9 c9Var7 = new c9("GEOFENCE_REPORT", 6, "geofence/report");
        f25340j = c9Var7;
        c9 c9Var8 = new c9("PUSH_REDELIVER", 7, "push/redeliver");
        f25341k = c9Var8;
        c9 c9Var9 = new c9("BANNERS_SYNC", 8, "banners/sync");
        f25342l = c9Var9;
        c9 c9Var10 = new c9("SDK_DEBUGGER_INIT", 9, "debugger/init");
        f25343m = c9Var10;
        c9 c9Var11 = new c9("SDK_DEBUGGER_LOG", 10, "debugger/log");
        f25344n = c9Var11;
        c9 c9Var12 = new c9("DUST_CONFIG", 11, "dust/config");
        f25345o = c9Var12;
        c9[] c9VarArr = {c9Var, c9Var2, c9Var3, c9Var4, c9Var5, c9Var6, c9Var7, c9Var8, c9Var9, c9Var10, c9Var11, c9Var12};
        f25346p = c9VarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(c9VarArr);
        f25332b = new b9();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((c9) obj).f25347a, obj);
        }
        f25333c = linkedHashMap;
    }

    public c9(String str, int i10, String str2) {
        this.f25347a = str2;
    }

    public static c9 valueOf(String str) {
        return (c9) Enum.valueOf(c9.class, str);
    }

    public static c9[] values() {
        return (c9[]) f25346p.clone();
    }
}
