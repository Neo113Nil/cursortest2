package io.radar.sdk.util;

import android.content.Context;
import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarLog;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: RadarLogBuffer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J,\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/util/RadarLogBuffer;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getFlushableLogs", "Lio/radar/sdk/util/Flushable;", "Lio/radar/sdk/model/RadarLog;", "persistLogs", "", "setPersistentLogFeatureFlag", "persistentLogFeatureFlag", "", "write", "level", "Lio/radar/sdk/Radar$RadarLogLevel;", "type", "Lio/radar/sdk/Radar$RadarLogType;", "message", "", "createdAt", "Ljava/util/Date;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RadarLogBuffer {
    Context getContext();

    Flushable<RadarLog> getFlushableLogs();

    void persistLogs();

    void setPersistentLogFeatureFlag(boolean persistentLogFeatureFlag);

    void write(Radar.RadarLogLevel level, Radar.RadarLogType type, String message, Date createdAt);

    /* compiled from: RadarLogBuffer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void write$default(RadarLogBuffer radarLogBuffer, Radar.RadarLogLevel radarLogLevel, Radar.RadarLogType radarLogType, String str, Date date, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i & 8) != 0) {
                date = new Date();
            }
            radarLogBuffer.write(radarLogLevel, radarLogType, str, date);
        }
    }
}
