package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f9j {
    public static final f9j a;
    public static final f9j b;
    public static final f9j c;
    public static final /* synthetic */ f9j[] d;

    static {
        f9j f9jVar = new f9j("Insert", 0);
        a = f9jVar;
        f9j f9jVar2 = new f9j("Delete", 1);
        b = f9jVar2;
        f9j f9jVar3 = new f9j("Replace", 2);
        c = f9jVar3;
        d = new f9j[]{f9jVar, f9jVar2, f9jVar3};
    }

    public static f9j valueOf(String str) {
        return (f9j) Enum.valueOf(f9j.class, str);
    }

    public static f9j[] values() {
        return (f9j[]) d.clone();
    }
}
