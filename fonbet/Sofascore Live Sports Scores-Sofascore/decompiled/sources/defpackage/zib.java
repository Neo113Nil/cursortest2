package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zib {
    public static final /* synthetic */ zib[] a = {new zib("Verbose", 0), new zib("Debug", 1), new zib("Info", 2), new zib("Warn", 3), new zib("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    zib EF5;

    public static zib valueOf(String str) {
        return (zib) Enum.valueOf(zib.class, str);
    }

    public static zib[] values() {
        return (zib[]) a.clone();
    }
}
