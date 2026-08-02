package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rdp {
    public static final rdp a;
    public static final rdp b;
    public static final rdp c;
    public static final /* synthetic */ rdp[] d;

    static {
        rdp rdpVar = new rdp("PASS_THROUGH", 0);
        a = rdpVar;
        rdp rdpVar2 = new rdp("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = rdpVar2;
        rdp rdpVar3 = new rdp("DISCARDING", 2);
        c = rdpVar3;
        d = new rdp[]{rdpVar, rdpVar2, rdpVar3};
    }

    public static rdp[] values() {
        return (rdp[]) d.clone();
    }
}
