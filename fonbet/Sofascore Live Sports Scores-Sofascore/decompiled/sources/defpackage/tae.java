package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tae {
    public static final /* synthetic */ tae[] a = {new tae("CounterClockwise", 0), new tae("Clockwise", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    tae EF5;

    public static tae valueOf(String str) {
        return (tae) Enum.valueOf(tae.class, str);
    }

    public static tae[] values() {
        return (tae[]) a.clone();
    }
}
