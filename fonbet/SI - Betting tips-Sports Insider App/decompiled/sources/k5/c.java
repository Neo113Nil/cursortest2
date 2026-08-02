package k5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18814a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f18815b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f18816c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f18817d;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f18814a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f18815b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f18816c = cVar3;
        f18817d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18817d.clone();
    }
}
