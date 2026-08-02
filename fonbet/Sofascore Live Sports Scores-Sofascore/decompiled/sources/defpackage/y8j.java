package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y8j {
    public static final y8j a;
    public static final y8j b;
    public static final y8j c;
    public static final y8j d;
    public static final /* synthetic */ y8j[] e;

    static {
        y8j y8jVar = new y8j("Start", 0);
        a = y8jVar;
        y8j y8jVar2 = new y8j("End", 1);
        b = y8jVar2;
        y8j y8jVar3 = new y8j("Inner", 2);
        c = y8jVar3;
        y8j y8jVar4 = new y8j("NotByUser", 3);
        d = y8jVar4;
        e = new y8j[]{y8jVar, y8jVar2, y8jVar3, y8jVar4};
    }

    public static y8j valueOf(String str) {
        return (y8j) Enum.valueOf(y8j.class, str);
    }

    public static y8j[] values() {
        return (y8j[]) e.clone();
    }
}
