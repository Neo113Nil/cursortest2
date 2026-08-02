package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pug {
    public static final pug a;
    public static final pug b;
    public static final /* synthetic */ pug[] c;

    static {
        pug pugVar = new pug("IDLE", 0);
        a = pugVar;
        pug pugVar2 = new pug("SCROLLING", 1);
        b = pugVar2;
        c = new pug[]{pugVar, pugVar2};
    }

    public static pug valueOf(String str) {
        return (pug) Enum.valueOf(pug.class, str);
    }

    public static pug[] values() {
        return (pug[]) c.clone();
    }
}
