package com.vk.media.player;

import android.net.Uri;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.metrics.trackers.my.event.ServiceEvent;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import xsna.epx;
import xsna.jt50;
import xsna.sht0;

/* compiled from: VideoTracker.kt */
/* loaded from: classes3.dex */
public final class VideoTracker {
    public static final Set<Uri> a = Collections.newSetFromMap(new LinkedHashMap<Uri, Boolean>() { // from class: com.vk.media.player.VideoTracker$initedVideosUri$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof Uri) {
                return super.containsKey((Uri) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return super.containsValue((Boolean) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof Uri) {
                return (Boolean) super.get((Uri) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Uri) ? obj2 : (Boolean) super.getOrDefault((Uri) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof Uri) {
                return (Boolean) super.remove((Uri) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Uri, Boolean> entry) {
            return super.size() > 4;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Uri) && (obj2 instanceof Boolean)) {
                return super.remove((Uri) obj, (Boolean) obj2);
            }
            return false;
        }
    });
    public static final Set<Uri> b = Collections.newSetFromMap(new LinkedHashMap<Uri, Boolean>() { // from class: com.vk.media.player.VideoTracker$playedVideosUri$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof Uri) {
                return super.containsKey((Uri) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return super.containsValue((Boolean) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof Uri) {
                return (Boolean) super.get((Uri) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Uri) ? obj2 : (Boolean) super.getOrDefault((Uri) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof Uri) {
                return (Boolean) super.remove((Uri) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Uri, Boolean> entry) {
            return super.size() > 4;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Uri) && (obj2 instanceof Boolean)) {
                return super.remove((Uri) obj, (Boolean) obj2);
            }
            return false;
        }
    });
    public static long c;
    public static long d;
    public static boolean e;
    public static Uri f;
    public static boolean g;

    public static void a(sht0 sht0Var) {
        Uri uri = sht0Var.b;
        b.add(uri);
        a.remove(uri);
        if (!g) {
            d = System.currentTimeMillis();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"send start timespent with id 20"});
            }
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.c(ForegroundEvent.VIDEO_PLAYER);
            g = true;
        }
        if (epx.f(f, uri)) {
            return;
        }
        c = 0L;
    }

    public static void b() {
        if (g) {
            g = false;
            c = (System.currentTimeMillis() - d) + c;
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"send stop timespent with id 20"});
            }
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.e(ForegroundEvent.VIDEO_PLAYER);
            if (e) {
                l.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"send stop timespent with id 77"});
                }
                jt50.f(ServiceEvent.VIDEO_PLAYER_30S);
                e = false;
            }
        }
    }
}
