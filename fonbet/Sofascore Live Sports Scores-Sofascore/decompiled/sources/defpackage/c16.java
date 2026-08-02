package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c16 {
    public static final /* synthetic */ c16[] a = {new c16("GOAL", 0), new c16("SUSPENSION", 1), new c16("TWO_PLAYERS_VERTICAL", 2), new c16("BASIC", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    c16 EF5;

    public static c16 valueOf(String str) {
        return (c16) Enum.valueOf(c16.class, str);
    }

    public static c16[] values() {
        return (c16[]) a.clone();
    }
}
