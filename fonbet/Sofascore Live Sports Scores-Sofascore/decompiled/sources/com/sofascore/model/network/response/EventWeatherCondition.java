package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.WeatherConditionType;
import defpackage.ec6;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u0010!¨\u00065"}, d2 = {"Lcom/sofascore/model/network/response/EventWeatherCondition;", "", "", "temperature", "Lcom/sofascore/model/mvvm/model/WeatherConditionType;", "generalCondition", "humidity", "windSpeed", "", "isForecast", "<init>", "(Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/WeatherConditionType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Lcom/sofascore/model/mvvm/model/WeatherConditionType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventWeatherCondition;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Lcom/sofascore/model/mvvm/model/WeatherConditionType;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/WeatherConditionType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/sofascore/model/network/response/EventWeatherCondition;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getTemperature", "Lcom/sofascore/model/mvvm/model/WeatherConditionType;", "getGeneralCondition", "getHumidity", "getWindSpeed", "Ljava/lang/Boolean;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventWeatherCondition {

    @Nullable
    private final WeatherConditionType generalCondition;

    @Nullable
    private final Double humidity;

    @Nullable
    private final Boolean isForecast;

    @Nullable
    private final Double temperature;

    @Nullable
    private final Double windSpeed;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new ec6(8)), null, null, null};

    public /* synthetic */ EventWeatherCondition(int i, Double d, WeatherConditionType weatherConditionType, Double d2, Double d3, Boolean bool, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, EventWeatherCondition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.temperature = d;
        this.generalCondition = weatherConditionType;
        this.humidity = d2;
        this.windSpeed = d3;
        this.isForecast = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return WeatherConditionType.INSTANCE.serializer();
    }

    public static /* synthetic */ EventWeatherCondition copy$default(EventWeatherCondition eventWeatherCondition, Double d, WeatherConditionType weatherConditionType, Double d2, Double d3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            d = eventWeatherCondition.temperature;
        }
        if ((i & 2) != 0) {
            weatherConditionType = eventWeatherCondition.generalCondition;
        }
        if ((i & 4) != 0) {
            d2 = eventWeatherCondition.humidity;
        }
        if ((i & 8) != 0) {
            d3 = eventWeatherCondition.windSpeed;
        }
        if ((i & 16) != 0) {
            bool = eventWeatherCondition.isForecast;
        }
        Boolean bool2 = bool;
        Double d4 = d2;
        return eventWeatherCondition.copy(d, weatherConditionType, d4, d3, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(EventWeatherCondition self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        h75 h75Var = h75.a;
        output.h(serialDesc, 0, h75Var, self.temperature);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.generalCondition);
        output.h(serialDesc, 2, h75Var, self.humidity);
        output.h(serialDesc, 3, h75Var, self.windSpeed);
        output.h(serialDesc, 4, gz1.a, self.isForecast);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getTemperature() {
        return this.temperature;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WeatherConditionType getGeneralCondition() {
        return this.generalCondition;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getHumidity() {
        return this.humidity;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getWindSpeed() {
        return this.windSpeed;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsForecast() {
        return this.isForecast;
    }

    @NotNull
    public final EventWeatherCondition copy(@Nullable Double temperature, @Nullable WeatherConditionType generalCondition, @Nullable Double humidity, @Nullable Double windSpeed, @Nullable Boolean isForecast) {
        return new EventWeatherCondition(temperature, generalCondition, humidity, windSpeed, isForecast);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventWeatherCondition)) {
            return false;
        }
        EventWeatherCondition eventWeatherCondition = (EventWeatherCondition) other;
        return Intrinsics.c(this.temperature, eventWeatherCondition.temperature) && this.generalCondition == eventWeatherCondition.generalCondition && Intrinsics.c(this.humidity, eventWeatherCondition.humidity) && Intrinsics.c(this.windSpeed, eventWeatherCondition.windSpeed) && Intrinsics.c(this.isForecast, eventWeatherCondition.isForecast);
    }

    @Nullable
    public final WeatherConditionType getGeneralCondition() {
        return this.generalCondition;
    }

    @Nullable
    public final Double getHumidity() {
        return this.humidity;
    }

    @Nullable
    public final Double getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final Double getWindSpeed() {
        return this.windSpeed;
    }

    public int hashCode() {
        Double d = this.temperature;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        WeatherConditionType weatherConditionType = this.generalCondition;
        int hashCode2 = (hashCode + (weatherConditionType == null ? 0 : weatherConditionType.hashCode())) * 31;
        Double d2 = this.humidity;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.windSpeed;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.isForecast;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isForecast() {
        return this.isForecast;
    }

    @NotNull
    public String toString() {
        Double d = this.temperature;
        WeatherConditionType weatherConditionType = this.generalCondition;
        Double d2 = this.humidity;
        Double d3 = this.windSpeed;
        Boolean bool = this.isForecast;
        StringBuilder sb = new StringBuilder("EventWeatherCondition(temperature=");
        sb.append(d);
        sb.append(", generalCondition=");
        sb.append(weatherConditionType);
        sb.append(", humidity=");
        fc6.A(sb, d2, ", windSpeed=", d3, ", isForecast=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventWeatherCondition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventWeatherCondition;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventWeatherCondition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventWeatherCondition(@Nullable Double d, @Nullable WeatherConditionType weatherConditionType, @Nullable Double d2, @Nullable Double d3, @Nullable Boolean bool) {
        this.temperature = d;
        this.generalCondition = weatherConditionType;
        this.humidity = d2;
        this.windSpeed = d3;
        this.isForecast = bool;
    }
}
