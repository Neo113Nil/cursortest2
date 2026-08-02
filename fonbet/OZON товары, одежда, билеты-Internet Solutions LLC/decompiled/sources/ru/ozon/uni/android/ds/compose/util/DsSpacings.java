package ru.ozon.uni.android.ds.compose.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bW\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\b¨\u0006["}, d2 = {"Lru/ozon/uni/android/ds/compose/util/DsSpacings;", "", "<init>", "()V", "LZ1/h;", "dp0", "F", "getDp0-D9Ej5fM", "()F", "dp1", "getDp1-D9Ej5fM", "dp2", "getDp2-D9Ej5fM", "dp3", "getDp3-D9Ej5fM", "dp4", "getDp4-D9Ej5fM", "dp5", "getDp5-D9Ej5fM", "dp6", "getDp6-D9Ej5fM", "dp8", "getDp8-D9Ej5fM", "dp10", "getDp10-D9Ej5fM", "dp11", "getDp11-D9Ej5fM", "dp12", "getDp12-D9Ej5fM", "dp13", "getDp13-D9Ej5fM", "dp14", "getDp14-D9Ej5fM", "dp16", "getDp16-D9Ej5fM", "dp18", "getDp18-D9Ej5fM", "dp20", "getDp20-D9Ej5fM", "dp22", "getDp22-D9Ej5fM", "dp24", "getDp24-D9Ej5fM", "dp28", "getDp28-D9Ej5fM", "dp32", "getDp32-D9Ej5fM", "dp36", "getDp36-D9Ej5fM", "dp40", "getDp40-D9Ej5fM", "dp44", "getDp44-D9Ej5fM", "dp48", "getDp48-D9Ej5fM", "dp52", "getDp52-D9Ej5fM", "dp56", "getDp56-D9Ej5fM", "dp60", "getDp60-D9Ej5fM", "dp64", "getDp64-D9Ej5fM", "dp68", "getDp68-D9Ej5fM", "dp72", "getDp72-D9Ej5fM", "dp76", "getDp76-D9Ej5fM", "dp80", "getDp80-D9Ej5fM", "dp84", "getDp84-D9Ej5fM", "dp88", "getDp88-D9Ej5fM", "dp92", "getDp92-D9Ej5fM", "dp96", "getDp96-D9Ej5fM", "dp100", "getDp100-D9Ej5fM", "dp104", "getDp104-D9Ej5fM", "dp108", "getDp108-D9Ej5fM", "dp112", "getDp112-D9Ej5fM", "dp116", "getDp116-D9Ej5fM", "dp120", "getDp120-D9Ej5fM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsSpacings {

    @NotNull
    public static final DsSpacings INSTANCE = new DsSpacings();
    private static final float dp0 = 0;
    private static final float dp1 = 1;
    private static final float dp2 = 2;
    private static final float dp3 = 3;
    private static final float dp4 = 4;
    private static final float dp5 = 5;
    private static final float dp6 = 6;
    private static final float dp8 = 8;
    private static final float dp10 = 10;
    private static final float dp11 = 11;
    private static final float dp12 = 12;
    private static final float dp13 = 13;
    private static final float dp14 = 14;
    private static final float dp16 = 16;
    private static final float dp18 = 18;
    private static final float dp20 = 20;
    private static final float dp22 = 22;
    private static final float dp24 = 24;
    private static final float dp28 = 28;
    private static final float dp32 = 32;
    private static final float dp36 = 36;
    private static final float dp40 = 40;
    private static final float dp44 = 44;
    private static final float dp48 = 48;
    private static final float dp52 = 52;
    private static final float dp56 = 56;
    private static final float dp60 = 60;
    private static final float dp64 = 64;
    private static final float dp68 = 68;
    private static final float dp72 = 72;
    private static final float dp76 = 76;
    private static final float dp80 = 80;
    private static final float dp84 = 84;
    private static final float dp88 = 88;
    private static final float dp92 = 92;
    private static final float dp96 = 96;
    private static final float dp100 = 100;
    private static final float dp104 = 104;
    private static final float dp108 = 108;
    private static final float dp112 = 112;
    private static final float dp116 = 116;
    private static final float dp120 = 120;

    private DsSpacings() {
    }

    /* renamed from: getDp0-D9Ej5fM, reason: not valid java name */
    public final float m1838getDp0D9Ej5fM() {
        return dp0;
    }

    /* renamed from: getDp1-D9Ej5fM, reason: not valid java name */
    public final float m1839getDp1D9Ej5fM() {
        return dp1;
    }

    /* renamed from: getDp10-D9Ej5fM, reason: not valid java name */
    public final float m1840getDp10D9Ej5fM() {
        return dp10;
    }

    /* renamed from: getDp100-D9Ej5fM, reason: not valid java name */
    public final float m1841getDp100D9Ej5fM() {
        return dp100;
    }

    /* renamed from: getDp12-D9Ej5fM, reason: not valid java name */
    public final float m1842getDp12D9Ej5fM() {
        return dp12;
    }

    /* renamed from: getDp13-D9Ej5fM, reason: not valid java name */
    public final float m1843getDp13D9Ej5fM() {
        return dp13;
    }

    /* renamed from: getDp14-D9Ej5fM, reason: not valid java name */
    public final float m1844getDp14D9Ej5fM() {
        return dp14;
    }

    /* renamed from: getDp16-D9Ej5fM, reason: not valid java name */
    public final float m1845getDp16D9Ej5fM() {
        return dp16;
    }

    /* renamed from: getDp18-D9Ej5fM, reason: not valid java name */
    public final float m1846getDp18D9Ej5fM() {
        return dp18;
    }

    /* renamed from: getDp2-D9Ej5fM, reason: not valid java name */
    public final float m1847getDp2D9Ej5fM() {
        return dp2;
    }

    /* renamed from: getDp20-D9Ej5fM, reason: not valid java name */
    public final float m1848getDp20D9Ej5fM() {
        return dp20;
    }

    /* renamed from: getDp22-D9Ej5fM, reason: not valid java name */
    public final float m1849getDp22D9Ej5fM() {
        return dp22;
    }

    /* renamed from: getDp24-D9Ej5fM, reason: not valid java name */
    public final float m1850getDp24D9Ej5fM() {
        return dp24;
    }

    /* renamed from: getDp28-D9Ej5fM, reason: not valid java name */
    public final float m1851getDp28D9Ej5fM() {
        return dp28;
    }

    /* renamed from: getDp3-D9Ej5fM, reason: not valid java name */
    public final float m1852getDp3D9Ej5fM() {
        return dp3;
    }

    /* renamed from: getDp32-D9Ej5fM, reason: not valid java name */
    public final float m1853getDp32D9Ej5fM() {
        return dp32;
    }

    /* renamed from: getDp4-D9Ej5fM, reason: not valid java name */
    public final float m1854getDp4D9Ej5fM() {
        return dp4;
    }

    /* renamed from: getDp40-D9Ej5fM, reason: not valid java name */
    public final float m1855getDp40D9Ej5fM() {
        return dp40;
    }

    /* renamed from: getDp44-D9Ej5fM, reason: not valid java name */
    public final float m1856getDp44D9Ej5fM() {
        return dp44;
    }

    /* renamed from: getDp5-D9Ej5fM, reason: not valid java name */
    public final float m1857getDp5D9Ej5fM() {
        return dp5;
    }

    /* renamed from: getDp56-D9Ej5fM, reason: not valid java name */
    public final float m1858getDp56D9Ej5fM() {
        return dp56;
    }

    /* renamed from: getDp6-D9Ej5fM, reason: not valid java name */
    public final float m1859getDp6D9Ej5fM() {
        return dp6;
    }

    /* renamed from: getDp64-D9Ej5fM, reason: not valid java name */
    public final float m1860getDp64D9Ej5fM() {
        return dp64;
    }

    /* renamed from: getDp8-D9Ej5fM, reason: not valid java name */
    public final float m1861getDp8D9Ej5fM() {
        return dp8;
    }
}
