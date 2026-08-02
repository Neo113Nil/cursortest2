package ru.ozon.fintech.features.metrix.data;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000eHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u00063"}, d2 = {"Lru/ozon/fintech/features/metrix/data/Event;", "", "deviceTime", "", "eventName", "geopoint", "Lru/ozon/fintech/features/metrix/data/Geopoint;", "network", ImagesContract.URL, "entryType", "timingType", "duration", "", "responseStatus", "", "deliveryType", "fetchStart", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/metrix/data/Geopoint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;J)V", "getDeviceTime", "()Ljava/lang/String;", "getEventName", "getGeopoint", "()Lru/ozon/fintech/features/metrix/data/Geopoint;", "getNetwork", "getUrl", "getEntryType", "getTimingType", "getDuration", "()J", "getResponseStatus", "()I", "getDeliveryType", "getFetchStart", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Event {

    @i(name = "delivery_type")
    @NotNull
    private final String deliveryType;

    @i(name = "device_time")
    @NotNull
    private final String deviceTime;

    @i(name = "duration")
    private final long duration;

    @i(name = "entryType")
    @NotNull
    private final String entryType;

    @i(name = "event_name")
    @NotNull
    private final String eventName;

    @i(name = "fetch_start")
    private final long fetchStart;

    @i(name = "geopoint")
    @NotNull
    private final Geopoint geopoint;

    @i(name = "network")
    @NotNull
    private final String network;

    @i(name = "response_status")
    private final int responseStatus;

    @i(name = "timing_type")
    @NotNull
    private final String timingType;

    @i(name = ImagesContract.URL)
    @NotNull
    private final String url;

    public Event(@NotNull String deviceTime, @NotNull String eventName, @NotNull Geopoint geopoint, @NotNull String network, @NotNull String url, @NotNull String entryType, @NotNull String timingType, long j11, int i11, @NotNull String deliveryType, long j12) {
        Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(geopoint, "geopoint");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(timingType, "timingType");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
        this.deviceTime = deviceTime;
        this.eventName = eventName;
        this.geopoint = geopoint;
        this.network = network;
        this.url = url;
        this.entryType = entryType;
        this.timingType = timingType;
        this.duration = j11;
        this.responseStatus = i11;
        this.deliveryType = deliveryType;
        this.fetchStart = j12;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceTime() {
        return this.deviceTime;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    /* renamed from: component11, reason: from getter */
    public final long getFetchStart() {
        return this.fetchStart;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Geopoint getGeopoint() {
        return this.geopoint;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getEntryType() {
        return this.entryType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTimingType() {
        return this.timingType;
    }

    /* renamed from: component8, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component9, reason: from getter */
    public final int getResponseStatus() {
        return this.responseStatus;
    }

    @NotNull
    public final Event copy(@NotNull String deviceTime, @NotNull String eventName, @NotNull Geopoint geopoint, @NotNull String network, @NotNull String url, @NotNull String entryType, @NotNull String timingType, long duration, int responseStatus, @NotNull String deliveryType, long fetchStart) {
        Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(geopoint, "geopoint");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(timingType, "timingType");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
        return new Event(deviceTime, eventName, geopoint, network, url, entryType, timingType, duration, responseStatus, deliveryType, fetchStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.d(this.deviceTime, event.deviceTime) && Intrinsics.d(this.eventName, event.eventName) && Intrinsics.d(this.geopoint, event.geopoint) && Intrinsics.d(this.network, event.network) && Intrinsics.d(this.url, event.url) && Intrinsics.d(this.entryType, event.entryType) && Intrinsics.d(this.timingType, event.timingType) && this.duration == event.duration && this.responseStatus == event.responseStatus && Intrinsics.d(this.deliveryType, event.deliveryType) && this.fetchStart == event.fetchStart;
    }

    @NotNull
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    @NotNull
    public final String getDeviceTime() {
        return this.deviceTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEntryType() {
        return this.entryType;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final long getFetchStart() {
        return this.fetchStart;
    }

    @NotNull
    public final Geopoint getGeopoint() {
        return this.geopoint;
    }

    @NotNull
    public final String getNetwork() {
        return this.network;
    }

    public final int getResponseStatus() {
        return this.responseStatus;
    }

    @NotNull
    public final String getTimingType() {
        return this.timingType;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Long.hashCode(this.fetchStart) + g.a(C2454a.a(this.responseStatus, c.a(g.a(g.a(g.a(g.a((this.geopoint.hashCode() + g.a(this.deviceTime.hashCode() * 31, 31, this.eventName)) * 31, 31, this.network), 31, this.url), 31, this.entryType), 31, this.timingType), 31, this.duration), 31), 31, this.deliveryType);
    }

    @NotNull
    public String toString() {
        String str = this.deviceTime;
        String str2 = this.eventName;
        Geopoint geopoint = this.geopoint;
        String str3 = this.network;
        String str4 = this.url;
        String str5 = this.entryType;
        String str6 = this.timingType;
        long j11 = this.duration;
        int i11 = this.responseStatus;
        String str7 = this.deliveryType;
        long j12 = this.fetchStart;
        StringBuilder d11 = C3660k.d("Event(deviceTime=", str, ", eventName=", str2, ", geopoint=");
        d11.append(geopoint);
        d11.append(", network=");
        d11.append(str3);
        d11.append(", url=");
        a.h(d11, str4, ", entryType=", str5, ", timingType=");
        d11.append(str6);
        d11.append(", duration=");
        d11.append(j11);
        d11.append(", responseStatus=");
        d11.append(i11);
        d11.append(", deliveryType=");
        d11.append(str7);
        d11.append(", fetchStart=");
        d11.append(j12);
        d11.append(")");
        return d11.toString();
    }
}
