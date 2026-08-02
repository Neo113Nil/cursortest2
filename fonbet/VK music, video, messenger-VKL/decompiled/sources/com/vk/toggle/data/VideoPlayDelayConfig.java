package com.vk.toggle.data;

import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import defpackage.q0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.jgp;
import xsna.zrp;

/* compiled from: VideoPlayDelayConfig.kt */
/* loaded from: classes11.dex */
public final class VideoPlayDelayConfig {
    public static final a c = new a();
    public static final VideoPlayDelayConfig d;
    public static final VideoPlayDelayConfig e;
    public static final VideoPlayDelayConfig f;
    public final Map<Type, Long> a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPlayDelayConfig.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CATALOG;
        public static final Type DISCOVER;
        public static final Type FEED;
        public static final Type FEED_RECOMMENDED;
        public static final Type POST;
        public static final Type SEARCH_VIDEO;
        public static final Type WALL;

        static {
            Type type = new Type("CATALOG", 0);
            CATALOG = type;
            Type type2 = new Type("FEED", 1);
            FEED = type2;
            Type type3 = new Type("FEED_RECOMMENDED", 2);
            FEED_RECOMMENDED = type3;
            Type type4 = new Type("WALL", 3);
            WALL = type4;
            Type type5 = new Type("DISCOVER", 4);
            DISCOVER = type5;
            Type type6 = new Type("POST", 5);
            POST = type6;
            Type type7 = new Type("SEARCH_VIDEO", 6);
            SEARCH_VIDEO = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoPlayDelayConfig.kt */
    public static final class a {
        public static VideoPlayDelayConfig a(String str) {
            Object obj;
            try {
                JSONObject jSONObject = new JSONObject(str);
                MapBuilder mapBuilder = new MapBuilder();
                JSONArray jSONArray = jSONObject.getJSONArray("payload");
                boolean z = false;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String D = f370.D(jSONObject2, UcumUtils.UCUM_SECONDS);
                        if (D != null) {
                            String lowerCase = D.toLowerCase(Locale.ROOT);
                            Iterator<E> it = Type.h().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((Type) obj).name().toLowerCase(Locale.ROOT).equals(lowerCase)) {
                                    break;
                                }
                            }
                            Type type = (Type) obj;
                            if (type != null) {
                                Long z2 = f370.z(jSONObject2, "d");
                                mapBuilder.put(type, Long.valueOf(z2 != null ? z2.longValue() : 0L));
                            }
                        }
                    }
                }
                MapBuilder h = mapBuilder.h();
                Integer x = f370.x(jSONObject, "enable_for_clips");
                if (x != null && x.intValue() == 1) {
                    z = true;
                }
                return new VideoPlayDelayConfig(h, z);
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    static {
        String obj;
        VideoPlayDelayConfig a2;
        VideoPlayDelayConfig videoPlayDelayConfig = new VideoPlayDelayConfig(jgp.b, false);
        d = videoPlayDelayConfig;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Type.FEED_RECOMMENDED, 1000L);
        mapBuilder.put(Type.CATALOG, 1L);
        e = new VideoPlayDelayConfig(mapBuilder.h(), false);
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_VIDEO_AUTOPLAY_DELAY);
        if (i != null && (obj = i.c.toString()) != null && (a2 = a.a(obj)) != null) {
            videoPlayDelayConfig = a2;
        }
        f = videoPlayDelayConfig;
    }

    public VideoPlayDelayConfig(Map<Type, Long> map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlayDelayConfig)) {
            return false;
        }
        VideoPlayDelayConfig videoPlayDelayConfig = (VideoPlayDelayConfig) obj;
        return epx.f(this.a, videoPlayDelayConfig.a) && this.b == videoPlayDelayConfig.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayDelayConfig(delaysMap=");
        sb.append(this.a);
        sb.append(", enableForClips=");
        return q0.a(sb, this.b, ')');
    }
}
