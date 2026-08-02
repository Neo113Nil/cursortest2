package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.e;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.n;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.anl;
import xsna.fxc0;
import xsna.io20;
import xsna.kr10;
import xsna.lhg;
import xsna.tgq;
import xsna.uel;
import xsna.y2r0;
import xsna.ylo;
import xsna.zhn0;

/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes12.dex */
public final class e implements i.a {
    public final a a;
    public final a.InterfaceC0045a b;
    public anl c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    /* compiled from: DefaultMediaSourceFactory.java */
    public static final class a {
        public final tgq a;
        public a.InterfaceC0045a d;
        public anl f;

        @Nullable
        public ylo g;

        @Nullable
        public androidx.media3.exoplayer.upstream.b h;
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();
        public boolean e = true;

        public a(tgq tgqVar, anl anlVar) {
            this.a = tgqVar;
            this.f = anlVar;
        }

        public final i.a a(int i) throws ClassNotFoundException {
            zhn0 zhn0Var;
            zhn0 zhn0Var2;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap = this.c;
            i.a aVar = (i.a) hashMap.get(valueOf);
            if (aVar != null) {
                return aVar;
            }
            Integer valueOf2 = Integer.valueOf(i);
            HashMap hashMap2 = this.b;
            zhn0 zhn0Var3 = (zhn0) hashMap2.get(valueOf2);
            if (zhn0Var3 == null) {
                final a.InterfaceC0045a interfaceC0045a = this.d;
                interfaceC0045a.getClass();
                if (i == 0) {
                    final Class asSubclass = DashMediaSource.Factory.class.asSubclass(i.a.class);
                    zhn0Var = new zhn0() { // from class: xsna.kil
                        @Override // xsna.zhn0
                        public final Object get() {
                            return androidx.media3.exoplayer.source.e.g(asSubclass, interfaceC0045a);
                        }
                    };
                } else if (i == 1) {
                    final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(i.a.class);
                    zhn0Var = new zhn0() { // from class: xsna.lil
                        @Override // xsna.zhn0
                        public final Object get() {
                            return androidx.media3.exoplayer.source.e.g(asSubclass2, interfaceC0045a);
                        }
                    };
                } else if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(i.a.class);
                        zhn0Var2 = new zhn0() { // from class: xsna.nil
                            @Override // xsna.zhn0
                            public final Object get() {
                                try {
                                    return (i.a) asSubclass3.getConstructor(null).newInstance(null);
                                } catch (Exception e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(lhg.a(i, "Unrecognized contentType: "));
                        }
                        zhn0Var2 = new zhn0() { // from class: xsna.oil
                            @Override // xsna.zhn0
                            public final Object get() {
                                return new n.b(interfaceC0045a, e.a.this.a);
                            }
                        };
                    }
                    zhn0Var3 = zhn0Var2;
                    hashMap2.put(Integer.valueOf(i), zhn0Var3);
                } else {
                    final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(i.a.class);
                    zhn0Var = new zhn0() { // from class: xsna.mil
                        @Override // xsna.zhn0
                        public final Object get() {
                            return androidx.media3.exoplayer.source.e.g(asSubclass4, interfaceC0045a);
                        }
                    };
                }
                zhn0Var3 = zhn0Var;
                hashMap2.put(Integer.valueOf(i), zhn0Var3);
            }
            i.a aVar2 = (i.a) zhn0Var3.get();
            ylo yloVar = this.g;
            if (yloVar != null) {
                aVar2.e(yloVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.h;
            if (bVar != null) {
                aVar2.f(bVar);
            }
            aVar2.a(this.f);
            aVar2.c(this.e);
            aVar2.b();
            hashMap.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }
    }

    public e(Context context, uel uelVar) {
        this(new c.a(context), uelVar);
    }

    public static i.a g(Class cls, a.InterfaceC0045a interfaceC0045a) {
        try {
            return (i.a) cls.getConstructor(a.InterfaceC0045a.class).newInstance(interfaceC0045a);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(anl anlVar) {
        this.c = anlVar;
        a aVar = this.a;
        aVar.f = anlVar;
        aVar.a.a(anlVar);
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(anlVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void b() {
        a aVar = this.a;
        aVar.getClass();
        aVar.a.b();
    }

    @Override // androidx.media3.exoplayer.source.i.a
    @Deprecated
    public final void c(boolean z) {
        this.i = z;
        a aVar = this.a;
        aVar.e = z;
        aVar.a.c(z);
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).c(z);
        }
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final i d(kr10 kr10Var) {
        kr10Var.b.getClass();
        String scheme = kr10Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(kr10Var.b.b, "application/x-image-uri")) {
            long j = kr10Var.b.f;
            String str = y2r0.a;
            throw null;
        }
        kr10.f fVar = kr10Var.b;
        int J = y2r0.J(fVar.a, fVar.b);
        if (kr10Var.b.f != C.TIME_UNSET) {
            tgq tgqVar = this.a.a;
            if (tgqVar instanceof uel) {
                uel uelVar = (uel) tgqVar;
                synchronized (uelVar) {
                    uelVar.e = 1;
                }
            }
            tgq tgqVar2 = this.a.a;
            if (tgqVar2 instanceof uel) {
                uel uelVar2 = (uel) tgqVar2;
                synchronized (uelVar2) {
                    uelVar2.f = 1;
                }
            }
        }
        try {
            i.a a2 = this.a.a(J);
            kr10.e.a a3 = kr10Var.d.a();
            kr10.e eVar = kr10Var.d;
            if (eVar.a == C.TIME_UNSET) {
                a3.a = this.d;
            }
            if (eVar.d == -3.4028235E38f) {
                a3.d = this.g;
            }
            if (eVar.e == -3.4028235E38f) {
                a3.e = this.h;
            }
            if (eVar.b == C.TIME_UNSET) {
                a3.b = this.e;
            }
            if (eVar.c == C.TIME_UNSET) {
                a3.c = this.f;
            }
            kr10.e eVar2 = new kr10.e(a3);
            if (!eVar2.equals(kr10Var.d)) {
                kr10.a a4 = kr10Var.a();
                a4.k = eVar2.a();
                kr10Var = a4.a();
            }
            i d = a2.d(kr10Var);
            ImmutableList<kr10.i> immutableList = kr10Var.b.e;
            if (!immutableList.isEmpty()) {
                i[] iVarArr = new i[immutableList.size() + 1];
                iVarArr[0] = d;
                if (immutableList.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        kr10.i iVar = immutableList.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new j.a();
                        new a.C0054a();
                        com.google.common.collect.h hVar = com.google.common.collect.h.h;
                        ImmutableList.b bVar = ImmutableList.c;
                        com.google.common.collect.g gVar = com.google.common.collect.g.f;
                        List list = Collections.EMPTY_LIST;
                        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
                        kr10.g gVar3 = kr10.g.a;
                        Uri uri = Uri.EMPTY;
                        iVar.getClass();
                        throw null;
                    }
                    a.C0043a c0043a = new a.C0043a();
                    immutableList.get(0).getClass();
                    ArrayList<io20.a> arrayList = io20.a;
                    c0043a.m = null;
                    immutableList.get(0).getClass();
                    c0043a.d = null;
                    immutableList.get(0).getClass();
                    c0043a.e = 0;
                    immutableList.get(0).getClass();
                    c0043a.f = 0;
                    immutableList.get(0).getClass();
                    c0043a.b = null;
                    immutableList.get(0).getClass();
                    c0043a.a = null;
                    androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                    if (this.c.a(aVar)) {
                        a.C0043a a5 = aVar.a();
                        a5.m = io20.q("application/x-media3-cues");
                        a5.j = aVar.n;
                        a5.K = this.c.b(aVar);
                        new androidx.media3.common.a(a5);
                    }
                    immutableList.get(0).getClass();
                    throw null;
                }
                d = new MergingMediaSource(iVarArr);
            }
            kr10.c cVar = kr10Var.f;
            if (cVar.b != 0 || cVar.d != Long.MIN_VALUE) {
                ClippingMediaSource.a aVar2 = new ClippingMediaSource.a(d);
                long j2 = cVar.b;
                fxc0.p(j2 >= 0);
                fxc0.z(!aVar2.e);
                aVar2.b = j2;
                long j3 = cVar.d;
                fxc0.z(!aVar2.e);
                aVar2.c = j3;
                boolean z = !cVar.e;
                fxc0.z(!aVar2.e);
                aVar2.d = z;
                fxc0.z(!aVar2.e);
                fxc0.z(!aVar2.e);
                fxc0.z(!aVar2.e);
                aVar2.e = true;
                d = new ClippingMediaSource(aVar2);
            }
            kr10Var.b.getClass();
            kr10Var.b.getClass();
            return d;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final i.a e(ylo yloVar) {
        fxc0.t(yloVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        a aVar = this.a;
        aVar.g = yloVar;
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).e(yloVar);
        }
        return this;
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final /* bridge */ /* synthetic */ i.a f(androidx.media3.exoplayer.upstream.b bVar) {
        h(bVar);
        return this;
    }

    public final void h(androidx.media3.exoplayer.upstream.b bVar) {
        fxc0.t(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        a aVar = this.a;
        aVar.h = bVar;
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).f(bVar);
        }
    }

    public e(a.b bVar) {
        this(bVar, new uel());
    }

    public e(a.InterfaceC0045a interfaceC0045a, tgq tgqVar) {
        this.b = interfaceC0045a;
        anl anlVar = new anl();
        this.c = anlVar;
        a aVar = new a(tgqVar, anlVar);
        this.a = aVar;
        if (interfaceC0045a != aVar.d) {
            aVar.d = interfaceC0045a;
            aVar.b.clear();
            aVar.c.clear();
        }
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
        this.f = C.TIME_UNSET;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }
}
