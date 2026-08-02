package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bbf {
    public static final /* synthetic */ bbf[] a = {new bbf("EVENT", 0), new bbf("HEADER", 1), new bbf("EMPTY_STATE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    bbf EF5;

    public static bbf valueOf(String str) {
        return (bbf) Enum.valueOf(bbf.class, str);
    }

    public static bbf[] values() {
        return (bbf[]) a.clone();
    }
}
