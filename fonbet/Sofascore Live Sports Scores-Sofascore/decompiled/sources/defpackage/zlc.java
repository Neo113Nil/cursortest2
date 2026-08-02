package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zlc {
    public static final zlc a;
    public static final zlc b;
    public static final /* synthetic */ zlc[] c;

    static {
        zlc zlcVar = new zlc("BOTTOM", 0);
        a = zlcVar;
        zlc zlcVar2 = new zlc("TOP", 1);
        b = zlcVar2;
        c = new zlc[]{zlcVar, zlcVar2};
    }

    public static zlc valueOf(String str) {
        return (zlc) Enum.valueOf(zlc.class, str);
    }

    public static zlc[] values() {
        return (zlc[]) c.clone();
    }
}
