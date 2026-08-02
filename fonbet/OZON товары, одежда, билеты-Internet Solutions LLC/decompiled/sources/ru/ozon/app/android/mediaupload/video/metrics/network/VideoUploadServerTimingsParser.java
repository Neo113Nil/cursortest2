package ru.ozon.app.android.mediaupload.video.metrics.network;

import C.o0;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricsRequestBody;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadServerTimingsParser;", "", "<init>", "()V", "parseServerTimings", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event$ServerTiming;", "rawServerTimings", "", "Companion", "TimingData", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadServerTimingsParser {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadServerTimingsParser$Companion;", "", "<init>", "()V", "SERVER_TIMING_DESC_PREFIX", "", "SERVER_TIMING_DUR_PREFIX", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadServerTimingsParser$TimingData;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "start", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getStart", "getTimestamp", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class TimingData {
        private final String name;
        private final String start;
        private final String timestamp;

        public TimingData(String str, String str2, String str3) {
            this.name = str;
            this.start = str2;
            this.timestamp = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimingData)) {
                return false;
            }
            TimingData timingData = (TimingData) other;
            return Intrinsics.d(this.name, timingData.name) && Intrinsics.d(this.start, timingData.start) && Intrinsics.d(this.timestamp, timingData.timestamp);
        }

        public final String getName() {
            return this.name;
        }

        public final String getStart() {
            return this.start;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.start;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.timestamp;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.start;
            return o0.c(C3660k.d("TimingData(name=", str, ", start=", str2, ", timestamp="), this.timestamp, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    public final List<UploadMetricsRequestBody.Event.ServerTiming> parseServerTimings(List<String> rawServerTimings) {
        Double u02;
        Long l11 = null;
        if (rawServerTimings == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = rawServerTimings.iterator();
        while (it.hasNext()) {
            int i11 = 0;
            for (Object obj : h.m((String) it.next(), new String[]{","}, 0, 6)) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    ?? r16 = l11;
                    C7714v.O0();
                    throw r16;
                }
                List m11 = h.m((String) obj, new String[]{";"}, 0, 6);
                String str = (String) C7714v.Q(0, m11);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i13 = 1;
                String str3 = "";
                while (i13 < 3) {
                    String str4 = (String) C7714v.Q(i13, m11);
                    ?? obj2 = str4 != null ? h.z0(str4).toString() : l11;
                    Long l12 = l11;
                    if (obj2 != 0) {
                        if (h.e0(obj2, "desc=", false)) {
                            str2 = h.B0(h.i0(obj2, "desc="), '\"');
                        } else if (h.e0(obj2, "dur=", false)) {
                            String i02 = h.i0(obj2, "dur=");
                            h.t(i02, ".", false);
                            str3 = i02;
                        }
                    }
                    i13++;
                    l11 = l12;
                }
                Long l13 = l11;
                if (i11 % 2 == 0) {
                    arrayList.add(new TimingData(str, str3, str2));
                } else {
                    arrayList2.add(str2);
                }
                i11 = i12;
                l11 = l13;
            }
        }
        Long l14 = l11;
        IntRange o11 = kotlin.ranges.h.o(0, arrayList.size());
        ArrayList arrayList3 = new ArrayList(C7714v.z(o11, 10));
        C7665d it2 = o11.iterator();
        while (it2.hasNext()) {
            int b11 = it2.b();
            TimingData timingData = (TimingData) arrayList.get(b11);
            String name = timingData.getName();
            String start = timingData.getStart();
            Long valueOf = (start == null || (u02 = h.u0(start)) == null) ? l14 : Long.valueOf((long) (u02.doubleValue() * 1000));
            String timestamp = timingData.getTimestamp();
            Long y02 = timestamp != null ? h.y0(timestamp) : l14;
            String str5 = (String) C7714v.Q(b11, arrayList2);
            arrayList3.add(new UploadMetricsRequestBody.Event.ServerTiming(name, valueOf, y02, str5 != null ? h.y0(str5) : l14));
        }
        return arrayList3;
    }
}
