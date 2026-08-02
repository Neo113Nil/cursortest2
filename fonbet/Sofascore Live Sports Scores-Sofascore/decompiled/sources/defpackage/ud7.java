package defpackage;

import com.sofascore.model.fantasy.FantasyPriceChangeReason;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class ud7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FantasyPriceChangeReason.values().length];
        try {
            iArr[FantasyPriceChangeReason.GOOD_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FantasyPriceChangeReason.GOOD_FORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FantasyPriceChangeReason.TOP_FORM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FantasyPriceChangeReason.TRANSFERS_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FantasyPriceChangeReason.BAD_PERFORMANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FantasyPriceChangeReason.BAD_FORM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FantasyPriceChangeReason.TRANSFERS_OUT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FantasyPriceChangeReason.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
