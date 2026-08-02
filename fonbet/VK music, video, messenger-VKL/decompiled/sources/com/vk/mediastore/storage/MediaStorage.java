package com.vk.mediastore.storage;

import android.content.Context;
import androidx.media3.datasource.cache.c;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.toggle.d;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.a8r;
import xsna.asp;
import xsna.bpn0;
import xsna.e43;
import xsna.e8r;
import xsna.ezt;
import xsna.g9e0;
import xsna.gx8;
import xsna.j7q;
import xsna.qcy;
import xsna.u35;
import xsna.ukd;
import xsna.via;
import xsna.w0f;
import xsna.wa3;
import xsna.z4g;
import xsna.zrp;

/* compiled from: MediaStorage.kt */
/* loaded from: classes.dex */
public final class MediaStorage implements gx8.a {
    public static final MediaStorage b = new MediaStorage();
    public static final bpn0 c = new bpn0(new u35(4));
    public static final ezt d = new ezt();
    public static final bpn0 e = new bpn0(new w0f(2));
    public static final bpn0 f = new bpn0(new via(6));
    public static final ConcurrentHashMap<VideoCacheType, j7q> g = new ConcurrentHashMap<>();
    public static final bpn0 h = new bpn0(new wa3(8));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaStorage.kt */
    /* loaded from: classes3.dex */
    public static final class VideoCacheType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoCacheType[] $VALUES;
        public static final VideoCacheType ALL;
        public static final VideoCacheType COVERS;
        public static final VideoCacheType STORIES;

        static {
            VideoCacheType videoCacheType = new VideoCacheType("STORIES", 0);
            STORIES = videoCacheType;
            VideoCacheType videoCacheType2 = new VideoCacheType("COVERS", 1);
            COVERS = videoCacheType2;
            VideoCacheType videoCacheType3 = new VideoCacheType("ALL", 2);
            ALL = videoCacheType3;
            VideoCacheType[] videoCacheTypeArr = {videoCacheType, videoCacheType2, videoCacheType3};
            $VALUES = videoCacheTypeArr;
            $ENTRIES = new asp(videoCacheTypeArr);
        }

        public VideoCacheType() {
            throw null;
        }

        public static VideoCacheType valueOf(String str) {
            return (VideoCacheType) Enum.valueOf(VideoCacheType.class, str);
        }

        public static VideoCacheType[] values() {
            return (VideoCacheType[]) $VALUES.clone();
        }
    }

    /* compiled from: MediaStorage.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCacheType.values().length];
            try {
                iArr[VideoCacheType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCacheType.COVERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoCacheType.STORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static j7q b(long j, String str) {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.VIDEO.h(), true);
        File file = b2.a;
        long j2 = b2.b == PrivateFiles.StorageType.EXTERNAL ? 52428800L : 16777216L;
        File file2 = str.length() > 0 ? new File(file, str) : file;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new j7q(context, file2, j2, false, j, null, null, null, 992);
    }

    public static final j7q c(VideoCacheType videoCacheType) {
        ConcurrentHashMap<VideoCacheType, j7q> concurrentHashMap = g;
        j7q j7qVar = concurrentHashMap.get(videoCacheType);
        if (j7qVar == null) {
            int i = a.$EnumSwitchMapping$0[videoCacheType.ordinal()];
            if (i == 1) {
                j7qVar = (j7q) e.getValue();
            } else if (i == 2) {
                j7qVar = (j7q) h.getValue();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j7qVar = (j7q) f.getValue();
            }
            j7q putIfAbsent = concurrentHashMap.putIfAbsent(videoCacheType, j7qVar);
            if (putIfAbsent != null) {
                j7qVar = putIfAbsent;
            }
        }
        return j7qVar;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        Iterator<T> it = g.values().iterator();
        while (it.hasNext()) {
            ((j7q) it.next()).b();
        }
        ezt eztVar = d;
        eztVar.getClass();
        g9e0 g9e0Var = eztVar.a;
        try {
            qcy<Object> qcyVar = ezt.b[0];
            ((c) g9e0Var.b()).o();
            e8r.a.a(PrivateSubdir.GIF, null);
            g9e0Var.d();
        } catch (Throwable unused) {
        }
        PrivateFiles privateFiles = e8r.a;
        privateFiles.a(PrivateSubdir.VIDEO, null);
        privateFiles.a(PrivateSubdir.VIDEO_LIVE_COVERS, null);
        ClipsVideoStorage.a();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "MediaStorage";
    }

    @Override // xsna.gx8.a
    public final long u() {
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        PrivateFiles.a b4;
        long u = ((a8r) c.getValue()).u();
        d.getClass();
        PrivateFiles privateFiles = e8r.a;
        b2 = privateFiles.b(r3, PrivateSubdir.GIF.h(), true);
        long I = com.vk.core.files.a.I(b2.a) + u;
        b3 = privateFiles.b(r0, PrivateSubdir.VIDEO.h(), true);
        long g2 = z4g.g(b3.a) + I;
        b4 = privateFiles.b(r3, PrivateSubdir.VIDEO_LIVE_COVERS.h(), true);
        return z4g.g(privateFiles.b(PrivateSubdir.CLIPS_DISK_CACHE, ukd.a(d.g().a), true).a) + z4g.g(privateFiles.b(PrivateSubdir.CLIPS, ukd.a(d.g().a), true).a) + z4g.g(b4.a) + g2;
    }
}
