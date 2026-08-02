package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class kkb {
    public static final ikb a;
    public static final /* synthetic */ kkb[] b;

    static {
        ikb ikbVar = new ikb();
        a = ikbVar;
        b = new kkb[]{ikbVar, new kkb() { // from class: jkb
        }};
    }

    public static kkb valueOf(String str) {
        return (kkb) Enum.valueOf(kkb.class, str);
    }

    public static kkb[] values() {
        return (kkb[]) b.clone();
    }
}
