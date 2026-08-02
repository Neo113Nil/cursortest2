package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r4d {
    public static final r4d a;
    public static final r4d b;
    public static final r4d c;
    public static final /* synthetic */ r4d[] d;

    static {
        r4d r4dVar = new r4d("Normal", 0);
        a = r4dVar;
        r4d r4dVar2 = new r4d("Reconnect", 1);
        b = r4dVar2;
        r4d r4dVar3 = new r4d("WaitingForEndReconnect", 2);
        c = r4dVar3;
        d = new r4d[]{r4dVar, r4dVar2, r4dVar3};
    }

    public static r4d valueOf(String str) {
        return (r4d) Enum.valueOf(r4d.class, str);
    }

    public static r4d[] values() {
        return (r4d[]) d.clone();
    }
}
