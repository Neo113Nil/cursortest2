package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hig {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final /* synthetic */ hig[] d;

    /* JADX INFO: Fake field, exist only in values array */
    hig EF0;

    static {
        hig higVar = new hig("VERIFICATION_NOT_EXECUTED", 0);
        d = new hig[]{higVar};
        a = Arrays.asList(higVar);
        b = Arrays.asList(new hig[0]);
        c = Arrays.asList(higVar);
    }

    public static hig valueOf(String str) {
        return (hig) Enum.valueOf(hig.class, str);
    }

    public static hig[] values() {
        return (hig[]) d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "verificationNotExecuted";
    }
}
