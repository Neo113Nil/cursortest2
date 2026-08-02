package defpackage;

import com.sofascore.model.mvvm.model.WeatherConditionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class h0l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WeatherConditionType.values().length];
        try {
            iArr[WeatherConditionType.SUNNY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WeatherConditionType.CLEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WeatherConditionType.CLOUDY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WeatherConditionType.NIGHT_CLOUDY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WeatherConditionType.PARTLY_CLOUDY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WeatherConditionType.NIGHT_PARTLY_CLOUDY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WeatherConditionType.LIGHT_RAIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[WeatherConditionType.HEAVY_RAIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[WeatherConditionType.THUNDERSTORM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[WeatherConditionType.SNOW.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[WeatherConditionType.FOG.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
