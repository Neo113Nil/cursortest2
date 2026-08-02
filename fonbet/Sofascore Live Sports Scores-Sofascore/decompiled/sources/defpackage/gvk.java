package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gvk {
    public static final gvk a;
    public static final gvk b;
    public static final gvk c;
    public static final gvk d;
    public static final gvk e;
    public static final /* synthetic */ gvk[] f;

    static {
        gvk gvkVar = new gvk("DIVIDER_2", 0);
        a = gvkVar;
        gvk gvkVar2 = new gvk("DIVIDER_1", 1);
        b = gvkVar2;
        gvk gvkVar3 = new gvk("EMPTY_VIEW_FINALS", 2);
        c = gvkVar3;
        gvk gvkVar4 = new gvk("EMPTY_VIEW_QUARTERFINALS", 3);
        d = gvkVar4;
        gvk gvkVar5 = new gvk("EMPTY_VIEW_EIGHT_FINALS", 4);
        e = gvkVar5;
        f = new gvk[]{gvkVar, gvkVar2, gvkVar3, gvkVar4, gvkVar5};
    }

    public static gvk valueOf(String str) {
        return (gvk) Enum.valueOf(gvk.class, str);
    }

    public static gvk[] values() {
        return (gvk[]) f.clone();
    }
}
