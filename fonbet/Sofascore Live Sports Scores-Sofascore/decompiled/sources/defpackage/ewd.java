package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ewd {
    public static final ewd a;
    public static final ewd b;
    public static final /* synthetic */ ewd[] c;

    static {
        ewd ewdVar = new ewd("Vertical", 0);
        a = ewdVar;
        ewd ewdVar2 = new ewd("Horizontal", 1);
        b = ewdVar2;
        c = new ewd[]{ewdVar, ewdVar2};
    }

    public static ewd valueOf(String str) {
        return (ewd) Enum.valueOf(ewd.class, str);
    }

    public static ewd[] values() {
        return (ewd[]) c.clone();
    }
}
