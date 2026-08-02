package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w9d {
    public static final SparseArray a;
    public static final /* synthetic */ w9d[] b;

    /* JADX INFO: Fake field, exist only in values array */
    w9d EF1;

    static {
        w9d w9dVar = new w9d("MOBILE", 0);
        w9d w9dVar2 = new w9d("WIFI", 1);
        w9d w9dVar3 = new w9d("MOBILE_MMS", 2);
        w9d w9dVar4 = new w9d("MOBILE_SUPL", 3);
        w9d w9dVar5 = new w9d("MOBILE_DUN", 4);
        w9d w9dVar6 = new w9d("MOBILE_HIPRI", 5);
        w9d w9dVar7 = new w9d("WIMAX", 6);
        w9d w9dVar8 = new w9d("BLUETOOTH", 7);
        w9d w9dVar9 = new w9d("DUMMY", 8);
        w9d w9dVar10 = new w9d("ETHERNET", 9);
        w9d w9dVar11 = new w9d("MOBILE_FOTA", 10);
        w9d w9dVar12 = new w9d("MOBILE_IMS", 11);
        w9d w9dVar13 = new w9d("MOBILE_CBS", 12);
        w9d w9dVar14 = new w9d("WIFI_P2P", 13);
        w9d w9dVar15 = new w9d("MOBILE_IA", 14);
        w9d w9dVar16 = new w9d("MOBILE_EMERGENCY", 15);
        w9d w9dVar17 = new w9d("PROXY", 16);
        w9d w9dVar18 = new w9d("VPN", 17);
        w9d w9dVar19 = new w9d("NONE", 18);
        b = new w9d[]{w9dVar, w9dVar2, w9dVar3, w9dVar4, w9dVar5, w9dVar6, w9dVar7, w9dVar8, w9dVar9, w9dVar10, w9dVar11, w9dVar12, w9dVar13, w9dVar14, w9dVar15, w9dVar16, w9dVar17, w9dVar18, w9dVar19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, w9dVar);
        sparseArray.put(1, w9dVar2);
        sparseArray.put(2, w9dVar3);
        sparseArray.put(3, w9dVar4);
        sparseArray.put(4, w9dVar5);
        sparseArray.put(5, w9dVar6);
        sparseArray.put(6, w9dVar7);
        sparseArray.put(7, w9dVar8);
        sparseArray.put(8, w9dVar9);
        sparseArray.put(9, w9dVar10);
        sparseArray.put(10, w9dVar11);
        sparseArray.put(11, w9dVar12);
        sparseArray.put(12, w9dVar13);
        sparseArray.put(13, w9dVar14);
        sparseArray.put(14, w9dVar15);
        sparseArray.put(15, w9dVar16);
        sparseArray.put(16, w9dVar17);
        sparseArray.put(17, w9dVar18);
        sparseArray.put(-1, w9dVar19);
    }

    public static w9d valueOf(String str) {
        return (w9d) Enum.valueOf(w9d.class, str);
    }

    public static w9d[] values() {
        return (w9d[]) b.clone();
    }
}
