package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v9d {
    public static final SparseArray a;
    public static final /* synthetic */ v9d[] b;

    /* JADX INFO: Fake field, exist only in values array */
    v9d EF1;

    static {
        v9d v9dVar = new v9d("UNKNOWN_MOBILE_SUBTYPE", 0);
        v9d v9dVar2 = new v9d("GPRS", 1);
        v9d v9dVar3 = new v9d("EDGE", 2);
        v9d v9dVar4 = new v9d("UMTS", 3);
        v9d v9dVar5 = new v9d("CDMA", 4);
        v9d v9dVar6 = new v9d("EVDO_0", 5);
        v9d v9dVar7 = new v9d("EVDO_A", 6);
        v9d v9dVar8 = new v9d("RTT", 7);
        v9d v9dVar9 = new v9d("HSDPA", 8);
        v9d v9dVar10 = new v9d("HSUPA", 9);
        v9d v9dVar11 = new v9d("HSPA", 10);
        v9d v9dVar12 = new v9d("IDEN", 11);
        v9d v9dVar13 = new v9d("EVDO_B", 12);
        v9d v9dVar14 = new v9d("LTE", 13);
        v9d v9dVar15 = new v9d("EHRPD", 14);
        v9d v9dVar16 = new v9d("HSPAP", 15);
        v9d v9dVar17 = new v9d("GSM", 16);
        v9d v9dVar18 = new v9d("TD_SCDMA", 17);
        v9d v9dVar19 = new v9d("IWLAN", 18);
        v9d v9dVar20 = new v9d("LTE_CA", 19);
        b = new v9d[]{v9dVar, v9dVar2, v9dVar3, v9dVar4, v9dVar5, v9dVar6, v9dVar7, v9dVar8, v9dVar9, v9dVar10, v9dVar11, v9dVar12, v9dVar13, v9dVar14, v9dVar15, v9dVar16, v9dVar17, v9dVar18, v9dVar19, v9dVar20, new v9d("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, v9dVar);
        sparseArray.put(1, v9dVar2);
        sparseArray.put(2, v9dVar3);
        sparseArray.put(3, v9dVar4);
        sparseArray.put(4, v9dVar5);
        sparseArray.put(5, v9dVar6);
        sparseArray.put(6, v9dVar7);
        sparseArray.put(7, v9dVar8);
        sparseArray.put(8, v9dVar9);
        sparseArray.put(9, v9dVar10);
        sparseArray.put(10, v9dVar11);
        sparseArray.put(11, v9dVar12);
        sparseArray.put(12, v9dVar13);
        sparseArray.put(13, v9dVar14);
        sparseArray.put(14, v9dVar15);
        sparseArray.put(15, v9dVar16);
        sparseArray.put(16, v9dVar17);
        sparseArray.put(17, v9dVar18);
        sparseArray.put(18, v9dVar19);
        sparseArray.put(19, v9dVar20);
    }

    public static v9d valueOf(String str) {
        return (v9d) Enum.valueOf(v9d.class, str);
    }

    public static v9d[] values() {
        return (v9d[]) b.clone();
    }
}
