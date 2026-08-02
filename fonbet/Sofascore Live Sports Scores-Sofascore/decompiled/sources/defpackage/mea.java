package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mea {
    public static final mea a;
    public static final mea b;
    public static final /* synthetic */ mea[] c;

    static {
        mea meaVar = new mea("SIGN_IN", 0);
        a = meaVar;
        mea meaVar2 = new mea("START_VOTING", 1);
        b = meaVar2;
        c = new mea[]{meaVar, meaVar2};
    }

    public static mea valueOf(String str) {
        return (mea) Enum.valueOf(mea.class, str);
    }

    public static mea[] values() {
        return (mea[]) c.clone();
    }
}
