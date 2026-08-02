package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sfb {
    public static final sfb a;
    public static final sfb b;
    public static final sfb c;
    public static final /* synthetic */ sfb[] d;

    static {
        sfb sfbVar = new sfb("REFRESH", 0);
        a = sfbVar;
        sfb sfbVar2 = new sfb("PREPEND", 1);
        b = sfbVar2;
        sfb sfbVar3 = new sfb("APPEND", 2);
        c = sfbVar3;
        d = new sfb[]{sfbVar, sfbVar2, sfbVar3};
    }

    public static sfb valueOf(String str) {
        return (sfb) Enum.valueOf(sfb.class, str);
    }

    public static sfb[] values() {
        return (sfb[]) d.clone();
    }
}
