package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class egg {
    public static final /* synthetic */ egg[] a = {new egg("REPLAY", 0), new egg("CALL_TO_ACTION", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    egg EF5;

    public static egg valueOf(String str) {
        return (egg) Enum.valueOf(egg.class, str);
    }

    public static egg[] values() {
        return (egg[]) a.clone();
    }
}
