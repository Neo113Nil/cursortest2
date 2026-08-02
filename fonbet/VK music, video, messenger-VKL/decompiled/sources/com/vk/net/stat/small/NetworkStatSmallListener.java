package com.vk.net.stat.small;

import android.net.Uri;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.d;
import okhttp3.l;
import okhttp3.p;
import xsna.asp;
import xsna.c63;
import xsna.cx2;
import xsna.epx;
import xsna.f360;
import xsna.f8f0;
import xsna.k8g0;
import xsna.l5m;
import xsna.n23;
import xsna.n3q;
import xsna.pep0;
import xsna.q260;
import xsna.u3j;
import xsna.upj;
import xsna.w0f;
import xsna.zrp;

/* compiled from: NetworkStatSmallListener.kt */
/* loaded from: classes3.dex */
public final class NetworkStatSmallListener extends f360 implements cx2 {
    public final b a;
    public final q260 b;
    public final boolean c;
    public final w0f d;
    public final upj e = new upj();
    public final ConcurrentHashMap<Long, a> f = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<d, c> g = new ConcurrentHashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkStatSmallListener.kt */
    /* loaded from: classes.dex */
    public static final class LoaderType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoaderType[] $VALUES;
        public static final LoaderType Api;
        public static final LoaderType Common;
        public static final LoaderType Image;

        static {
            LoaderType loaderType = new LoaderType("Common", 0);
            Common = loaderType;
            LoaderType loaderType2 = new LoaderType("Image", 1);
            Image = loaderType2;
            LoaderType loaderType3 = new LoaderType("Api", 2);
            Api = loaderType3;
            LoaderType[] loaderTypeArr = {loaderType, loaderType2, loaderType3};
            $VALUES = loaderTypeArr;
            $ENTRIES = new asp(loaderTypeArr);
        }

        public LoaderType() {
            throw null;
        }

        public static LoaderType valueOf(String str) {
            return (LoaderType) Enum.valueOf(LoaderType.class, str);
        }

        public static LoaderType[] values() {
            return (LoaderType[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkStatSmallListener.kt */
    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* compiled from: NetworkStatSmallListener.kt */
    public static final class b {
        public final String a;
        public final LoaderType b;

        public b(String str, LoaderType loaderType) {
            this.a = str;
            this.b = loaderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LoaderConfig(id=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: NetworkStatSmallListener.kt */
    public static final class c {
        public final String a;
        public final long b;
        public long c;
        public long d;
        public long e;
        public long f;

        public c(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public NetworkStatSmallListener(b bVar, com.vk.core.utils.newtork.b bVar2, q260 q260Var, boolean z, w0f w0fVar) {
        this.a = bVar;
        this.b = q260Var;
        this.c = z;
        this.d = w0fVar;
    }

    @Override // xsna.cx2
    public final void a(long j) {
        t(j, null);
    }

    @Override // xsna.cx2
    public final void b(long j, Exception exc) {
        t(j, exc);
    }

    @Override // xsna.cx2
    public final void c(long j, String str) {
        Long valueOf = Long.valueOf(j);
        this.e.getClass();
        this.f.put(valueOf, new a(str, System.currentTimeMillis()));
    }

    @Override // xsna.f360
    public final void d(f8f0 f8f0Var, f360.a aVar) {
        c remove = this.g.remove(f8f0Var);
        if (remove != null) {
            s(remove, null);
        }
    }

    @Override // xsna.f360
    public final void e(f8f0 f8f0Var, IOException iOException) {
        c remove = this.g.remove(f8f0Var);
        if (remove != null) {
            s(remove, iOException);
        }
    }

    @Override // xsna.f360
    public final void f(f8f0 f8f0Var, f360.a aVar) {
        String str;
        p pVar = f8f0Var.c;
        Object c2 = pVar.c(k8g0.e.class);
        l lVar = pVar.a;
        k8g0.e eVar = (k8g0.e) c2;
        a aVar2 = null;
        Long valueOf = eVar != null ? Long.valueOf(eVar.a) : null;
        b bVar = this.a;
        LoaderType loaderType = bVar.b;
        LoaderType loaderType2 = LoaderType.Api;
        if (loaderType == loaderType2 && valueOf != null) {
            aVar2 = this.f.remove(valueOf);
        }
        if (bVar.b == loaderType2) {
            str = lVar.d + lVar.b();
        } else {
            str = lVar.d;
        }
        long j = aVar.b;
        c cVar = new c(str, j);
        cVar.c = aVar2 != null ? aVar2.b : j;
        cVar.e = j;
        this.g.put(f8f0Var, cVar);
    }

    @Override // xsna.f360
    public final void i(d dVar, u3j u3jVar, f360.a aVar) {
        c cVar = this.g.get(dVar);
        if (cVar == null || cVar.d != 0) {
            return;
        }
        cVar.d = aVar.b;
    }

    @Override // xsna.f360
    public final void k(d dVar, f360.a aVar) {
        c cVar = this.g.get(dVar);
        if (cVar != null) {
            cVar.d = aVar.b;
        }
    }

    @Override // xsna.f360
    public final void n(d dVar, long j, f360.a aVar) {
        c remove = this.g.remove(dVar);
        if (remove != null) {
            remove.f = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(c cVar, Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = cVar.e - cVar.c;
        long j2 = cVar.d - cVar.b;
        this.e.getClass();
        long currentTimeMillis = System.currentTimeMillis() - cVar.d;
        String str = cVar.a;
        ExecutorService a2 = this.b.a.a();
        if (a2 instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) a2;
            i = threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
        } else {
            if (a2 instanceof n3q) {
                pep0 pep0Var = ((n3q) a2).b;
            }
            i = -1;
        }
        if (th != null) {
            c63 c63Var = c63.a;
            if (!c63.f) {
                NetworkState.a aVar = com.vk.core.utils.newtork.b.c().e;
                if (!aVar.b) {
                    int i6 = aVar.c;
                    i2 = 1;
                    if (i6 != 1) {
                        i2 = 2;
                        if (i6 != 2) {
                            if (i6 == 3) {
                                i2 = 3;
                            }
                        }
                    }
                    long j3 = cVar.f;
                    c63 c63Var2 = c63.a;
                    boolean z = c63.f;
                    boolean z2 = this.c;
                    String str2 = this.a.a;
                    String valueOf = String.valueOf(i);
                    boolean booleanValue = ((Boolean) this.d.invoke()).booleanValue();
                    String h = DevNullEventKey.SMALL_NET_STAT.h();
                    i3 = (int) j;
                    if (i3 <= 0) {
                        i3 = 0;
                    }
                    i4 = (int) j2;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    i5 = (int) currentTimeMillis;
                    if (i5 <= 0) {
                        i5 = 0;
                    }
                    int i7 = (int) j3;
                    int i8 = i7 <= 0 ? i7 : 0;
                    String simpleName = th == null ? th.getClass().getSimpleName() : null;
                    StringBuilder sb = new StringBuilder("{\"image_pool\":\"");
                    sb.append(z2);
                    sb.append("\",\"client_name\":\"");
                    sb.append(str2);
                    sb.append("\", \"stream_parsing\":\"");
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, n23.b(sb, booleanValue, "\"}"), str, Integer.valueOf(i3), valueOf, Integer.valueOf(i4), simpleName, Integer.valueOf(i5), null, Integer.valueOf(i2), null, Integer.valueOf(z ? 1 : 0), null, Integer.valueOf(i8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -11008, 3, null);
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = schemeStat$TypeDevNullItem;
                    l5mVar.q();
                }
            }
        }
        i2 = 0;
        long j32 = cVar.f;
        c63 c63Var22 = c63.a;
        boolean z3 = c63.f;
        boolean z22 = this.c;
        String str22 = this.a.a;
        String valueOf2 = String.valueOf(i);
        boolean booleanValue2 = ((Boolean) this.d.invoke()).booleanValue();
        String h2 = DevNullEventKey.SMALL_NET_STAT.h();
        i3 = (int) j;
        if (i3 <= 0) {
        }
        i4 = (int) j2;
        if (i4 <= 0) {
        }
        i5 = (int) currentTimeMillis;
        if (i5 <= 0) {
        }
        int i72 = (int) j32;
        if (i72 <= 0) {
        }
        if (th == null) {
        }
        StringBuilder sb2 = new StringBuilder("{\"image_pool\":\"");
        sb2.append(z22);
        sb2.append("\",\"client_name\":\"");
        sb2.append(str22);
        sb2.append("\", \"stream_parsing\":\"");
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2 = new SchemeStat$TypeDevNullItem(h2, n23.b(sb2, booleanValue2, "\"}"), str, Integer.valueOf(i3), valueOf2, Integer.valueOf(i4), simpleName, Integer.valueOf(i5), null, Integer.valueOf(i2), null, Integer.valueOf(z3 ? 1 : 0), null, Integer.valueOf(i8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -11008, 3, null);
        l5m l5mVar2 = new l5m(null, null, 3);
        l5mVar2.g = schemeStat$TypeDevNullItem2;
        l5mVar2.q();
    }

    public final void t(long j, Exception exc) {
        Uri uri;
        a remove = this.f.remove(Long.valueOf(j));
        if (remove != null) {
            String str = remove.a;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = Uri.EMPTY;
            }
            if (!epx.f(uri, Uri.EMPTY) && uri.getHost() != null) {
                str = uri.getHost() + '/' + uri.getPath();
            }
            this.e.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c cVar = new c(str, currentTimeMillis);
            cVar.c = remove.b;
            cVar.e = currentTimeMillis;
            cVar.d = currentTimeMillis;
            s(cVar, exc);
        }
    }
}
