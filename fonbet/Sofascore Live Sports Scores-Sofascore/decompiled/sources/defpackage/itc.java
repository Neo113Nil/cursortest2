package defpackage;

import android.graphics.BlendMode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class itc {
    public static final itc a;
    public static final /* synthetic */ itc[] b;

    /* JADX INFO: Fake field, exist only in values array */
    itc EF0;

    static {
        itc itcVar = new itc("DST_IN", 0);
        itc itcVar2 = new itc("SRC_ATOP", 1);
        a = itcVar2;
        b = new itc[]{itcVar, itcVar2, new itc("SRC_IN", 2)};
    }

    public static itc valueOf(String str) {
        return (itc) Enum.valueOf(itc.class, str);
    }

    public static itc[] values() {
        return (itc[]) b.clone();
    }

    public final BlendMode d() {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        int ordinal = ordinal();
        if (ordinal == 0) {
            blendMode = BlendMode.DST_IN;
            return blendMode;
        }
        if (ordinal == 1) {
            blendMode2 = BlendMode.SRC_ATOP;
            return blendMode2;
        }
        if (ordinal == 2) {
            blendMode3 = BlendMode.SRC_IN;
            return blendMode3;
        }
        zzl.b();
        return null;
    }
}
