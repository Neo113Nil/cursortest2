package zf0;

import ru.ozon.android.networkinfo.models.NetworkConnectionType;

/* loaded from: classes7.dex */
public final /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109002a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f109003b;

    static {
        int[] iArr = new int[NetworkConnectionType.values().length];
        try {
            iArr[NetworkConnectionType.WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_SLOW_2G.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_2G.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_3G.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_4G.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_5G.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[NetworkConnectionType.CELLULAR_UNSPECIFIED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f109002a = iArr;
        int[] iArr2 = new int[qf0.b.values().length];
        try {
            iArr2[qf0.b.WiFi.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[qf0.b.Cellular.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f109003b = iArr2;
    }
}
