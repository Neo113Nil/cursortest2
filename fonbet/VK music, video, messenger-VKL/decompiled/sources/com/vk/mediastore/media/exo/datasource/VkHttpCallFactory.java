package com.vk.mediastore.media.exo.datasource;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import okhttp3.d;
import okhttp3.o;
import okhttp3.p;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.d260;
import xsna.gzs;
import xsna.jkv;
import xsna.k8g0;
import xsna.knf;
import xsna.o260;
import xsna.oy70;
import xsna.zrp;

/* compiled from: VkHttpCallFactory.kt */
/* loaded from: classes.dex */
public final class VkHttpCallFactory implements d.a {
    public static final AtomicInteger f = new AtomicInteger(0);
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final HashMap<String, Pair<Integer, Integer>> h = new HashMap<>();
    public static final ArrayList<String> i = new ArrayList<>();
    public static final Object j = new Object();
    public static final HashMap<Integer, HashSet<Pair<a, Executor>>> k = new HashMap<>();
    public final MediaType b;
    public final gzs<NetworkClient.ClientType> c;
    public final AtomicInteger d;
    public final int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkHttpCallFactory.kt */
    public static final class MediaType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType MUSIC;
        public static final MediaType VIDEO;

        static {
            MediaType mediaType = new MediaType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = mediaType;
            MediaType mediaType2 = new MediaType("MUSIC", 1);
            MUSIC = mediaType2;
            MediaType[] mediaTypeArr = {mediaType, mediaType2};
            $VALUES = mediaTypeArr;
            $ENTRIES = new asp(mediaTypeArr);
        }

        public MediaType() {
            throw null;
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkHttpCallFactory.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void e(jkv jkvVar, int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkHttpCallFactory(MediaType mediaType, gzs<? extends NetworkClient.ClientType> gzsVar) {
        this.b = mediaType;
        this.c = gzsVar;
        this.d = new AtomicInteger(0);
        this.e = f.incrementAndGet();
    }

    @Override // okhttp3.d.a
    public final d a(p pVar) {
        NetworkClient.ClientType invoke = this.c.invoke();
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o b = o260Var.b(invoke);
        String str = pVar.a.i;
        int i2 = this.e;
        int incrementAndGet = this.d.incrementAndGet();
        synchronized (j) {
            try {
                ArrayList<String> arrayList = i;
                if (arrayList.size() >= 20) {
                    h.remove(arrayList.remove(0));
                }
                h.put(str, new Pair<>(Integer.valueOf(i2), Integer.valueOf(incrementAndGet)));
                arrayList.add(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.b == MediaType.MUSIC) {
            p.a b2 = pVar.b();
            b2.h(k8g0.d.class, k8g0.d.a);
            pVar = b2.b();
        }
        return b.a(pVar);
    }

    public final void b(a aVar, ScheduledExecutorService scheduledExecutorService) {
        HashMap<Integer, HashSet<Pair<a, Executor>>> hashMap = k;
        if (!hashMap.containsKey(Integer.valueOf(this.e))) {
            hashMap.put(Integer.valueOf(this.e), new HashSet<>());
        }
        hashMap.get(Integer.valueOf(this.e)).add(new Pair<>(aVar, scheduledExecutorService));
        AtomicBoolean atomicBoolean = g;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        oy70 oy70Var = new oy70(new com.vk.mediastore.media.exo.datasource.a());
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.g(NetworkClient.ClientType.CLIENT_PLAYER).d.add(oy70Var);
    }

    public /* synthetic */ VkHttpCallFactory(MediaType mediaType, gzs gzsVar, int i2) {
        this((i2 & 1) != 0 ? MediaType.VIDEO : mediaType, (i2 & 2) != 0 ? new knf(19) : gzsVar);
    }
}
