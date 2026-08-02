package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v1c {
    public static final v1c a;
    public static final v1c b;
    public static final /* synthetic */ v1c[] c;

    static {
        v1c v1cVar = new v1c("Width", 0);
        a = v1cVar;
        v1c v1cVar2 = new v1c("Height", 1);
        b = v1cVar2;
        c = new v1c[]{v1cVar, v1cVar2};
    }

    public static v1c valueOf(String str) {
        return (v1c) Enum.valueOf(v1c.class, str);
    }

    public static v1c[] values() {
        return (v1c[]) c.clone();
    }
}
