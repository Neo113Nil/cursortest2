package com.vk.push.core.remote.config.omicron;

import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes.dex */
public class Data {
    public final Integer a;
    public final String b;
    public final HashMap c;

    @Nullable
    public final Map<String, String> d;

    public static final class Builder {
        public Integer a;
        public String b;
        public final HashMap c = new HashMap();
        public Map<String, String> d;

        public Data build() {
            return new Data(this);
        }

        public Builder condition(String str) {
            this.b = str;
            return this;
        }

        public Builder pair(String str, Object obj) {
            if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
                this.c.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("Value of type " + obj.getClass() + " not supported");
        }

        public Builder segments(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public Builder version(Integer num) {
            this.a = num;
            return this;
        }
    }

    public Data(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Object> getAll() {
        return Collections.unmodifiableMap(this.c);
    }

    @Deprecated
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Nullable
    public Boolean getBooleanOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @Nullable
    public String getCondition() {
        return this.b;
    }

    @Deprecated
    public double getDouble(String str) {
        return getDouble(str, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }

    @Nullable
    public Double getDoubleOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        return null;
    }

    @Deprecated
    public float getFloat(String str) {
        return getFloat(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Nullable
    public Float getFloatOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        return null;
    }

    @Deprecated
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Nullable
    public Integer getIntOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        return null;
    }

    @Deprecated
    public long getLong(String str) {
        return getLong(str, 0L);
    }

    @Nullable
    public Long getLongOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    @Nullable
    public Map<String, String> getSegments() {
        Map<String, String> map = this.d;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    @Nullable
    public String getString(String str) {
        return getString(str, null);
    }

    @Nullable
    public Integer getVersion() {
        return this.a;
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.c.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public double getDouble(String str, double d) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    public float getFloat(String str, float f) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).floatValue() : f;
    }

    public int getInt(String str, int i) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public long getLong(String str, long j) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    @Nullable
    public String getString(String str, @Nullable String str2) {
        Object obj = this.c.get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
