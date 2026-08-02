package com.braze.requests;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class n {
    public static final m b;
    public static final LinkedHashMap c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final /* synthetic */ n[] p;

    /* renamed from: a, reason: collision with root package name */
    public final String f676a;

    static {
        n nVar = new n("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        d = nVar;
        n nVar2 = new n("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        e = nVar2;
        n nVar3 = new n("V3_DATA", 2, "data");
        f = nVar3;
        n nVar4 = new n("TEMPLATE_REQUEST", 3, SDKConstants.PARAM_UPDATE_TEMPLATE);
        g = nVar4;
        n nVar5 = new n("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        h = nVar5;
        n nVar6 = new n("GEOFENCE_REFRESH", 5, "geofence/request");
        i = nVar6;
        n nVar7 = new n("GEOFENCE_REPORT", 6, "geofence/report");
        j = nVar7;
        n nVar8 = new n("PUSH_REDELIVER", 7, "push/redeliver");
        k = nVar8;
        n nVar9 = new n("BANNERS_SYNC", 8, "banners/sync");
        l = nVar9;
        n nVar10 = new n("SDK_DEBUGGER_INIT", 9, "debugger/init");
        m = nVar10;
        n nVar11 = new n("SDK_DEBUGGER_LOG", 10, "debugger/log");
        n = nVar11;
        n nVar12 = new n("DUST_CONFIG", 11, "dust/config");
        o = nVar12;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        p = nVarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(nVarArr);
        b = new m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((n) obj).f676a, obj);
        }
        c = linkedHashMap;
    }

    public n(String str, int i2, String str2) {
        this.f676a = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) p.clone();
    }
}
