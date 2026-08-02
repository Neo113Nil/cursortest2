package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class olb {
    public static final olb a;
    public static final /* synthetic */ olb[] b;

    static {
        olb olbVar = new olb("Immediately", 0);
        a = olbVar;
        b = new olb[]{olbVar, new olb("OnIterationFinish", 1)};
    }

    public static olb valueOf(String str) {
        return (olb) Enum.valueOf(olb.class, str);
    }

    public static olb[] values() {
        return (olb[]) b.clone();
    }
}
