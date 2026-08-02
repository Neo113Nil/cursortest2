package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mif {
    public static final mif a;
    public static final /* synthetic */ mif[] b;

    static {
        mif mifVar = new mif("DEFAULT", 0);
        a = mifVar;
        mif mifVar2 = new mif("UNMETERED_ONLY", 1);
        mif mifVar3 = new mif("UNMETERED_OR_DAILY", 2);
        mif mifVar4 = new mif("FAST_IF_RADIO_AWAKE", 3);
        mif mifVar5 = new mif("NEVER", 4);
        mif mifVar6 = new mif("UNRECOGNIZED", 5);
        b = new mif[]{mifVar, mifVar2, mifVar3, mifVar4, mifVar5, mifVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, mifVar);
        sparseArray.put(1, mifVar2);
        sparseArray.put(2, mifVar3);
        sparseArray.put(3, mifVar4);
        sparseArray.put(4, mifVar5);
        sparseArray.put(-1, mifVar6);
    }

    public static mif valueOf(String str) {
        return (mif) Enum.valueOf(mif.class, str);
    }

    public static mif[] values() {
        return (mif[]) b.clone();
    }
}
