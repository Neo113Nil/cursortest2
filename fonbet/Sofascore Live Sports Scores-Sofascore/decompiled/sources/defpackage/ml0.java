package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzvz;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ml0 extends MediaCodec.Callback {
    public final /* synthetic */ int a;
    public final Object b;
    public final HandlerThread c;
    public Handler d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public MediaFormat g;
    public MediaFormat h;
    public MediaCodec.CodecException i;
    public MediaCodec.CryptoException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object n;
    public final Object o;
    public Object p;

    public ml0(HandlerThread handlerThread, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.c = handlerThread;
                this.n = new zzdo();
                this.o = new zzdo();
                this.e = new ArrayDeque();
                this.f = new ArrayDeque();
                break;
            default:
                this.b = new Object();
                this.c = handlerThread;
                this.n = new zz0(1);
                this.o = new zz0(1);
                this.e = new ArrayDeque();
                this.f = new ArrayDeque();
                break;
        }
    }

    public void a() {
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            this.h = (MediaFormat) arrayDeque.getLast();
        }
        zz0 zz0Var = (zz0) this.n;
        zz0Var.c = zz0Var.b;
        zz0 zz0Var2 = (zz0) this.o;
        zz0Var2.c = zz0Var2.b;
        this.e.clear();
        arrayDeque.clear();
    }

    public void b() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException != null) {
            this.m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.i;
        if (codecException != null) {
            this.i = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.j;
        if (cryptoException == null) {
            return;
        }
        this.j = null;
        throw cryptoException;
    }

    public void c() {
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            this.h = (MediaFormat) arrayDeque.getLast();
        }
        zzdo zzdoVar = (zzdo) this.n;
        zzdoVar.c = zzdoVar.b;
        zzdo zzdoVar2 = (zzdo) this.o;
        zzdoVar2.c = zzdoVar2.b;
        this.e.clear();
        arrayDeque.clear();
    }

    public void d() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException != null) {
            this.m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.i;
        if (codecException != null) {
            this.i = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.j;
        if (cryptoException == null) {
            return;
        }
        this.j = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    this.j = cryptoException;
                }
                return;
            default:
                synchronized (this.b) {
                    this.j = cryptoException;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    this.i = codecException;
                }
                return;
            default:
                synchronized (this.b) {
                    this.i = codecException;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        zg6 zg6Var;
        zznd zzndVar;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    ((zz0) this.n).b(i);
                    e3c e3cVar = (e3c) this.p;
                    if (e3cVar != null && (zg6Var = ((h3c) e3cVar.b).I) != null) {
                        zg6Var.a();
                    }
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        ((zzdo) this.n).a(i);
                        t9p t9pVar = (t9p) this.p;
                        if (t9pVar != null && (zzndVar = ((zzvz) t9pVar.a).H) != null) {
                            zzndVar.zza();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        zg6 zg6Var;
        zznd zzndVar;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        MediaFormat mediaFormat = this.h;
                        if (mediaFormat != null) {
                            ((zz0) this.o).b(-2);
                            this.f.add(mediaFormat);
                            this.h = null;
                        }
                        ((zz0) this.o).b(i);
                        this.e.add(bufferInfo);
                        e3c e3cVar = (e3c) this.p;
                        if (e3cVar != null && (zg6Var = ((h3c) e3cVar.b).I) != null) {
                            zg6Var.a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        MediaFormat mediaFormat2 = this.h;
                        if (mediaFormat2 != null) {
                            ((zzdo) this.o).a(-2);
                            this.f.add(mediaFormat2);
                            this.h = null;
                        }
                        ((zzdo) this.o).a(i);
                        this.e.add(bufferInfo);
                        t9p t9pVar = (t9p) this.p;
                        if (t9pVar != null && (zzndVar = ((zzvz) t9pVar.a).H) != null) {
                            zzndVar.zza();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    ((zz0) this.o).b(-2);
                    this.f.add(mediaFormat);
                    this.h = null;
                }
                return;
            default:
                synchronized (this.b) {
                    ((zzdo) this.o).a(-2);
                    this.f.add(mediaFormat);
                    this.h = null;
                }
                return;
        }
    }
}
