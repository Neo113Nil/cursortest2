package com.sofascore.model.mvvm.model;

import defpackage.g0l;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/sofascore/model/mvvm/model/WeatherConditionType;", "", "<init>", "(Ljava/lang/String;I)V", "SUNNY", "CLEAR", "CLOUDY", "NIGHT_CLOUDY", "PARTLY_CLOUDY", "NIGHT_PARTLY_CLOUDY", "LIGHT_RAIN", "HEAVY_RAIN", "THUNDERSTORM", "SNOW", "FOG", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeatherConditionType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ WeatherConditionType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("sunny")
    public static final WeatherConditionType SUNNY = new WeatherConditionType("SUNNY", 0);

    @q5h("clear")
    public static final WeatherConditionType CLEAR = new WeatherConditionType("CLEAR", 1);

    @q5h("cloudy")
    public static final WeatherConditionType CLOUDY = new WeatherConditionType("CLOUDY", 2);

    @q5h("night_cloudy")
    public static final WeatherConditionType NIGHT_CLOUDY = new WeatherConditionType("NIGHT_CLOUDY", 3);

    @q5h("partly_cloudy")
    public static final WeatherConditionType PARTLY_CLOUDY = new WeatherConditionType("PARTLY_CLOUDY", 4);

    @q5h("night_partly_cloudy")
    public static final WeatherConditionType NIGHT_PARTLY_CLOUDY = new WeatherConditionType("NIGHT_PARTLY_CLOUDY", 5);

    @q5h("light_rain")
    public static final WeatherConditionType LIGHT_RAIN = new WeatherConditionType("LIGHT_RAIN", 6);

    @q5h("heavy_rain")
    public static final WeatherConditionType HEAVY_RAIN = new WeatherConditionType("HEAVY_RAIN", 7);

    @q5h("thunderstorm")
    public static final WeatherConditionType THUNDERSTORM = new WeatherConditionType("THUNDERSTORM", 8);

    @q5h("snow")
    public static final WeatherConditionType SNOW = new WeatherConditionType("SNOW", 9);

    @q5h("fog")
    public static final WeatherConditionType FOG = new WeatherConditionType("FOG", 10);

    private static final /* synthetic */ WeatherConditionType[] $values() {
        return new WeatherConditionType[]{SUNNY, CLEAR, CLOUDY, NIGHT_CLOUDY, PARTLY_CLOUDY, NIGHT_PARTLY_CLOUDY, LIGHT_RAIN, HEAVY_RAIN, THUNDERSTORM, SNOW, FOG};
    }

    static {
        WeatherConditionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(6));
    }

    private WeatherConditionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.mvvm.model.WeatherConditionType", values(), new String[]{"sunny", "clear", "cloudy", "night_cloudy", "partly_cloudy", "night_partly_cloudy", "light_rain", "heavy_rain", "thunderstorm", "snow", "fog"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static WeatherConditionType valueOf(String str) {
        return (WeatherConditionType) Enum.valueOf(WeatherConditionType.class, str);
    }

    public static WeatherConditionType[] values() {
        return (WeatherConditionType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/WeatherConditionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/WeatherConditionType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) WeatherConditionType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
