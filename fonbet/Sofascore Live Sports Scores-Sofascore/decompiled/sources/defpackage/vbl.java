package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vbl {
    public static final /* synthetic */ vbl[] a = {new vbl("NOT_APPLIED", 0), new vbl("APPLIED_IMMEDIATELY", 1), new vbl("APPLIED_FOR_NEXT_RUN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    vbl EF5;

    public static vbl valueOf(String str) {
        return (vbl) Enum.valueOf(vbl.class, str);
    }

    public static vbl[] values() {
        return (vbl[]) a.clone();
    }
}
