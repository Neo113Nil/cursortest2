package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v2k {
    public static final v2k a;
    public static final /* synthetic */ v2k[] b;

    /* JADX INFO: Fake field, exist only in values array */
    v2k EF0;

    static {
        v2k v2kVar = new v2k("FADING", 0);
        v2k v2kVar2 = new v2k("GATE", 1);
        v2k v2kVar3 = new v2k("ZOOM_IN", 2);
        a = v2kVar3;
        b = new v2k[]{v2kVar, v2kVar2, v2kVar3};
    }

    public static v2k valueOf(String str) {
        return (v2k) Enum.valueOf(v2k.class, str);
    }

    public static v2k[] values() {
        return (v2k[]) b.clone();
    }
}
