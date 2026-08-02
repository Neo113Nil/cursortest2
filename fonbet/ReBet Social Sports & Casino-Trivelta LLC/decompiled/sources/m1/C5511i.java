package m1;

import F1.C1149k;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e1.AbstractC4156x;
import java.util.ArrayList;
import o1.InterfaceC5772y;
import o1.InterfaceC5773z;
import o1.P;
import u1.C6484a;
import u1.InterfaceC6485b;
import v1.C6620j;
import v1.InterfaceC6600E;
import v1.InterfaceC6627q;
import w1.C6698c;
import w1.InterfaceC6697b;

/* renamed from: m1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5511i implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f56238a;

    /* renamed from: b, reason: collision with root package name */
    public final C6620j f56239b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56242e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56244g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f56245h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56246i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f56247j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f56249l;

    /* renamed from: c, reason: collision with root package name */
    public int f56240c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f56241d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC6600E f56243f = InterfaceC6600E.f66903a;

    /* renamed from: k, reason: collision with root package name */
    public long f56248k = -9223372036854775807L;

    public C5511i(Context context) {
        this.f56238a = context;
        this.f56239b = new C6620j(context);
    }

    @Override // m1.m1
    public androidx.media3.exoplayer.p a(androidx.media3.exoplayer.p pVar, Handler handler, F1.O o10, InterfaceC5772y interfaceC5772y, C1.h hVar, InterfaceC6697b interfaceC6697b) {
        if (pVar.f() == 2) {
            return j(pVar, this.f56238a, this.f56240c, this.f56243f, this.f56242e, handler, o10, this.f56241d);
        }
        return null;
    }

    @Override // m1.m1
    public androidx.media3.exoplayer.p[] b(Handler handler, F1.O o10, InterfaceC5772y interfaceC5772y, C1.h hVar, InterfaceC6697b interfaceC6697b) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        l(this.f56238a, this.f56240c, this.f56243f, this.f56242e, handler, o10, this.f56241d, arrayList);
        InterfaceC5773z d10 = d(this.f56238a, this.f56244g, this.f56245h);
        if (d10 != null) {
            handler2 = handler;
            c(this.f56238a, this.f56240c, this.f56243f, this.f56242e, d10, handler2, interfaceC5772y, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.f56238a, hVar, handler2.getLooper(), this.f56240c, arrayList);
        h(this.f56238a, interfaceC6697b, handler2.getLooper(), this.f56240c, arrayList);
        e(this.f56238a, this.f56240c, arrayList);
        f(this.f56238a, arrayList);
        i(this.f56238a, handler2, this.f56240c, arrayList);
        return (androidx.media3.exoplayer.p[]) arrayList.toArray(new androidx.media3.exoplayer.p[0]);
    }

    public void c(Context context, int i10, InterfaceC6600E interfaceC6600E, boolean z10, InterfaceC5773z interfaceC5773z, Handler handler, InterfaceC5772y interfaceC5772y, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        arrayList.add(new o1.a0(context, n(), interfaceC6600E, z10, handler, interfaceC5772y, interfaceC5773z));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                AbstractC4156x.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        try {
                            i13 = i12 + 1;
                            arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                            AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            i14 = i13 + 1;
                            try {
                                arrayList.add(i13, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                                AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i13 = i14;
                                i14 = i13;
                                try {
                                    int i15 = i14 + 1;
                                    arrayList.add(i14, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused6) {
                                }
                                arrayList.add(i15, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                                AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            int i152 = i14 + 1;
                            try {
                                arrayList.add(i14, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                                AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i14 = i152;
                                i152 = i14;
                                arrayList.add(i152, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                                AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            }
                            arrayList.add(i152, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                            AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        } catch (Exception e10) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e10);
                        }
                    }
                } catch (ClassNotFoundException unused9) {
                }
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused10) {
                        i12 = i13;
                        i13 = i12;
                        i14 = i13 + 1;
                        arrayList.add(i13, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        int i1522 = i14 + 1;
                        arrayList.add(i14, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i1522, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    }
                    try {
                        i14 = i13 + 1;
                        arrayList.add(i13, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        int i15222 = i14 + 1;
                        arrayList.add(i14, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i15222, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    } catch (Exception e11) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e11);
                    }
                } catch (Exception e12) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e12);
                }
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                i13 = i12 + 1;
                arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                i14 = i13 + 1;
                arrayList.add(i13, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                int i152222 = i14 + 1;
                arrayList.add(i14, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(context, handler, interfaceC5772y, interfaceC5773z));
                AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i152222, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC5772y.class, InterfaceC5773z.class).newInstance(handler, interfaceC5772y, interfaceC5773z));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating Opus extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating MIDI extension", e15);
        }
    }

    public InterfaceC5773z d(Context context, boolean z10, boolean z11) {
        return new P.g(context).m(z10).l(z11).k();
    }

    public void e(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new G1.b());
    }

    public void f(Context context, ArrayList arrayList) {
        g(arrayList);
    }

    public void g(ArrayList arrayList) {
        arrayList.add(new u1.e(o(this.f56238a), null));
    }

    public void h(Context context, InterfaceC6697b interfaceC6697b, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new C6698c(interfaceC6697b, looper));
        arrayList.add(new C6698c(interfaceC6697b, looper));
    }

    public androidx.media3.exoplayer.p j(androidx.media3.exoplayer.p pVar, Context context, int i10, InterfaceC6600E interfaceC6600E, boolean z10, Handler handler, F1.O o10, long j10) {
        if (!this.f56246i || pVar.getClass() != C1149k.class) {
            return null;
        }
        C1149k.d p10 = new C1149k.d(context).s(n()).x(interfaceC6600E).r(j10).t(z10).u(handler).v(o10).w(50).q(this.f56247j).p(this.f56248k);
        if (Build.VERSION.SDK_INT >= 34) {
            p10 = p10.o(this.f56249l);
        }
        return p10.n();
    }

    public void k(Context context, C1.h hVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new C1.i(hVar, looper));
    }

    public void l(Context context, int i10, InterfaceC6600E interfaceC6600E, boolean z10, Handler handler, F1.O o10, long j10, ArrayList arrayList) {
        int i11;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        C1149k.d p10 = new C1149k.d(context).s(n()).x(interfaceC6600E).r(j10).t(z10).u(handler).v(o10).w(50).q(this.f56247j).p(this.f56248k);
        if (Build.VERSION.SDK_INT >= 34) {
            p10 = p10.o(this.f56249l);
        }
        arrayList.add(p10.n());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        arrayList.add(i11, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                        AbstractC4156x.g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused2) {
                    }
                    arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                }
            } catch (ClassNotFoundException unused3) {
            }
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i11 = i12;
                    i12 = i11;
                    arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                }
                try {
                    arrayList.add(i12, (androidx.media3.exoplayer.p) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, F1.O.class, cls).newInstance(Long.valueOf(j10), handler, o10, 50));
                    AbstractC4156x.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new IllegalStateException("Error instantiating VP9 extension", e12);
        }
    }

    public final C5511i m() {
        this.f56239b.c();
        return this;
    }

    public InterfaceC6627q.b n() {
        return this.f56239b;
    }

    public InterfaceC6485b.a o(Context context) {
        return new C6484a.c(context);
    }

    public final C5511i p(boolean z10) {
        this.f56242e = z10;
        return this;
    }

    public final C5511i q(int i10) {
        this.f56240c = i10;
        return this;
    }

    public void i(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
