package com.vk.fave.entities;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveSource.kt */
/* loaded from: classes18.dex */
public final class FaveSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveSource[] $VALUES;
    public static final a Companion;
    public static final FaveSource LINK_PROCESSOR;
    public static final FaveSource LONG_READ;
    public static final FaveSource MENU;
    public static final FaveSource QR;
    public static final FaveSource SNACKBAR;

    /* compiled from: FaveSource.kt */
    public static final class a {
        public static FaveSource a(String str) {
            if (str == null) {
                return null;
            }
            for (FaveSource faveSource : FaveSource.values()) {
                if (epx.f(faveSource.name(), str)) {
                    return faveSource;
                }
            }
            return null;
        }
    }

    static {
        FaveSource faveSource = new FaveSource("SNACKBAR", 0);
        SNACKBAR = faveSource;
        FaveSource faveSource2 = new FaveSource("LINK_PROCESSOR", 1);
        LINK_PROCESSOR = faveSource2;
        FaveSource faveSource3 = new FaveSource("MENU", 2);
        MENU = faveSource3;
        FaveSource faveSource4 = new FaveSource("LONG_READ", 3);
        LONG_READ = faveSource4;
        FaveSource faveSource5 = new FaveSource("QR", 4);
        QR = faveSource5;
        FaveSource[] faveSourceArr = {faveSource, faveSource2, faveSource3, faveSource4, faveSource5};
        $VALUES = faveSourceArr;
        $ENTRIES = new asp(faveSourceArr);
        Companion = new a();
    }

    public FaveSource() {
        throw null;
    }

    public static FaveSource valueOf(String str) {
        return (FaveSource) Enum.valueOf(FaveSource.class, str);
    }

    public static FaveSource[] values() {
        return (FaveSource[]) $VALUES.clone();
    }
}
