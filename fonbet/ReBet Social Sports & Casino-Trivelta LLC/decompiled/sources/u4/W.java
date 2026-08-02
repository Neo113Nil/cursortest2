package u4;

import A1.a;
import D1.d;
import D1.e;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PictureInPictureParams;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.l;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.a;
import androidx.media3.exoplayer.source.C2205f;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.X;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.B;
import androidx.media3.exoplayer.trackselection.C2225a;
import androidx.media3.exoplayer.trackselection.n;
import androidx.media3.ui.PlayerView;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.C2333B;
import b1.C2334C;
import b1.C2340I;
import b1.C2350d;
import b1.InterfaceC2341J;
import b1.z;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import d1.C3985a;
import d1.C3987c;
import h1.C4419o;
import h1.InterfaceC4411g;
import h1.InterfaceC4425u;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import m1.C5511i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p1.C6031a;
import p1.C6033c;
import q1.C6103l;
import r4.C6206b;
import r4.c;
import t1.C6378a;
import t1.C6379b;
import t4.C6441a;
import t4.C6442b;
import u4.W;
import v1.AbstractC6610O;
import v4.AbstractC6634a;
import v4.C6636c;
import w4.C6702a;
import w4.C6704c;
import w4.InterfaceC6703b;

/* loaded from: classes.dex */
public class W extends FrameLayout implements LifecycleEventListener, InterfaceC2341J.d, d.a, InterfaceC6703b, q1.t {

    /* renamed from: f5, reason: collision with root package name */
    public static final CookieManager f66001f5;

    /* renamed from: A, reason: collision with root package name */
    public float f66002A;

    /* renamed from: B, reason: collision with root package name */
    public int f66003B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f66004C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f66005D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f66006E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f66007F;

    /* renamed from: G, reason: collision with root package name */
    public Runnable f66008G;

    /* renamed from: H, reason: collision with root package name */
    public Runnable f66009H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f66010I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f66011J;

    /* renamed from: K, reason: collision with root package name */
    public r4.e f66012K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f66013L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f66014O;

    /* renamed from: P, reason: collision with root package name */
    public long f66015P;

    /* renamed from: P4, reason: collision with root package name */
    public boolean f66016P4;

    /* renamed from: Q4, reason: collision with root package name */
    public boolean f66017Q4;

    /* renamed from: R, reason: collision with root package name */
    public boolean f66018R;

    /* renamed from: R4, reason: collision with root package name */
    public boolean f66019R4;

    /* renamed from: S4, reason: collision with root package name */
    public final ThemedReactContext f66020S4;

    /* renamed from: T, reason: collision with root package name */
    public r4.i f66021T;

    /* renamed from: T1, reason: collision with root package name */
    public boolean f66022T1;

    /* renamed from: T4, reason: collision with root package name */
    public final AudioManager f66023T4;

    /* renamed from: U4, reason: collision with root package name */
    public final C6702a f66024U4;

    /* renamed from: V, reason: collision with root package name */
    public boolean f66025V;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f66026V1;

    /* renamed from: V4, reason: collision with root package name */
    public final C6704c f66027V4;

    /* renamed from: W, reason: collision with root package name */
    public String f66028W;

    /* renamed from: W4, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f66029W4;

    /* renamed from: X4, reason: collision with root package name */
    public long f66030X4;

    /* renamed from: Y4, reason: collision with root package name */
    public long f66031Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public long f66032Z4;

    /* renamed from: a, reason: collision with root package name */
    public final s4.V f66033a;

    /* renamed from: a5, reason: collision with root package name */
    public boolean f66034a5;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6492C f66035b;

    /* renamed from: b1, reason: collision with root package name */
    public String f66036b1;

    /* renamed from: b2, reason: collision with root package name */
    public c.a f66037b2;

    /* renamed from: b5, reason: collision with root package name */
    public int f66038b5;

    /* renamed from: c, reason: collision with root package name */
    public D1.i f66039c;

    /* renamed from: c5, reason: collision with root package name */
    public final String f66040c5;

    /* renamed from: d, reason: collision with root package name */
    public C6505k f66041d;

    /* renamed from: d5, reason: collision with root package name */
    public e.a f66042d5;

    /* renamed from: e, reason: collision with root package name */
    public DialogC6507m f66043e;

    /* renamed from: e5, reason: collision with root package name */
    public final Handler f66044e5;

    /* renamed from: f, reason: collision with root package name */
    public C6378a f66045f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4411g.a f66046g;

    /* renamed from: g1, reason: collision with root package name */
    public String f66047g1;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f66048g2;

    /* renamed from: h, reason: collision with root package name */
    public ExoPlayer f66049h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.media3.exoplayer.trackselection.n f66050i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f66051j;

    /* renamed from: k, reason: collision with root package name */
    public ServiceConnection f66052k;

    /* renamed from: l, reason: collision with root package name */
    public E1.a f66053l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f66054m;

    /* renamed from: n, reason: collision with root package name */
    public int f66055n;

    /* renamed from: o, reason: collision with root package name */
    public long f66056o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f66057p;

    /* renamed from: p1, reason: collision with root package name */
    public String f66058p1;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f66059p2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f66060q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f66061r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f66062s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f66063t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f66064u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f66065v;

    /* renamed from: w, reason: collision with root package name */
    public PictureInPictureParams.Builder f66066w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f66067x;

    /* renamed from: x1, reason: collision with root package name */
    public String f66068x1;

    /* renamed from: x2, reason: collision with root package name */
    public float f66069x2;

    /* renamed from: y, reason: collision with root package name */
    public float f66070y;

    /* renamed from: y1, reason: collision with root package name */
    public String f66071y1;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f66072y2;

    /* renamed from: z, reason: collision with root package name */
    public com.brentvatne.exoplayer.a f66073z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                W.this.k2();
                sendMessageDelayed(obtainMessage(1), Math.round(W.this.f66069x2));
            }
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            C6441a.b("ReactExoplayerView", "Could not register ExoPlayer");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            W.this.getClass();
            try {
                if (W.this.f66020S4.getCurrentActivity() == null) {
                    C6441a.f("ReactExoplayerView", "Could not register ExoPlayer: currentActivity is null");
                } else {
                    W.F0(W.this);
                    throw null;
                }
            } catch (Exception e10) {
                C6441a.b("ReactExoplayerView", "Could not register ExoPlayer: " + e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                W.F0(W.this);
            } catch (Exception unused) {
            }
            W.this.getClass();
        }
    }

    public class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4411g f66076a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f66077b;

        /* renamed from: c, reason: collision with root package name */
        public final long f66078c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4411g f66079d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Uri f66080e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f66081f;

        public c(InterfaceC4411g interfaceC4411g, Uri uri, long j10) {
            this.f66079d = interfaceC4411g;
            this.f66080e = uri;
            this.f66081f = j10;
            this.f66076a = interfaceC4411g;
            this.f66077b = uri;
            this.f66078c = j10 * 1000;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList call() {
            int i10;
            ArrayList arrayList = new ArrayList();
            try {
                C6033c b10 = androidx.media3.exoplayer.dash.j.b(this.f66076a, this.f66077b);
                int e10 = b10.e();
                int i11 = 0;
                while (i11 < e10) {
                    p1.g d10 = b10.d(i11);
                    int i12 = 0;
                    while (i12 < d10.f62934c.size()) {
                        C6031a c6031a = (C6031a) d10.f62934c.get(i12);
                        if (c6031a.f62891b != 2) {
                            i10 = i11;
                        } else {
                            int i13 = 0;
                            boolean z10 = false;
                            while (true) {
                                if (i13 >= c6031a.f62892c.size()) {
                                    i10 = i11;
                                    break;
                                }
                                p1.j jVar = (p1.j) c6031a.f62892c.get(i13);
                                androidx.media3.common.a aVar = jVar.f62947b;
                                if (W.this.z1(aVar)) {
                                    i10 = i11;
                                    if (jVar.f62949d <= this.f66078c) {
                                        break;
                                    }
                                    arrayList.add(W.this.i1(aVar, i13));
                                    z10 = true;
                                } else {
                                    i10 = i11;
                                }
                                i13++;
                                i11 = i10;
                            }
                            if (z10) {
                                return arrayList;
                            }
                        }
                        i12++;
                        i11 = i10;
                    }
                    i11++;
                }
                return null;
            } catch (Exception e11) {
                C6441a.f("ReactExoplayerView", "error in getVideoTrackInfoFromManifest:" + e11.getMessage());
                return null;
            }
        }
    }

    public class d extends androidx.activity.F {
        public d(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.F
        public void handleOnBackPressed() {
            W.this.setFullscreen(false);
        }
    }

    public static class e implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final W f66084a;

        /* renamed from: b, reason: collision with root package name */
        public final ThemedReactContext f66085b;

        public final /* synthetic */ void d() {
            this.f66084a.f66049h.h(this.f66084a.f66002A * 0.8f);
        }

        public final /* synthetic */ void e() {
            this.f66084a.f66049h.h(this.f66084a.f66002A * 1.0f);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            Activity currentActivity = this.f66085b.getCurrentActivity();
            if (i10 == -2) {
                this.f66084a.f66033a.f64710s.invoke(Boolean.FALSE);
            } else if (i10 == -1) {
                this.f66084a.f66067x = false;
                this.f66084a.f66033a.f64710s.invoke(Boolean.FALSE);
                if (currentActivity != null) {
                    final W w10 = this.f66084a;
                    Objects.requireNonNull(w10);
                    currentActivity.runOnUiThread(new Runnable() { // from class: u4.X
                        @Override // java.lang.Runnable
                        public final void run() {
                            W.this.Q1();
                        }
                    });
                }
                this.f66084a.f66023T4.abandonAudioFocus(this);
            } else if (i10 == 1) {
                this.f66084a.f66067x = true;
                this.f66084a.f66033a.f64710s.invoke(Boolean.TRUE);
            }
            if (this.f66084a.f66049h == null || currentActivity == null) {
                return;
            }
            if (i10 == -3) {
                if (this.f66084a.f66064u) {
                    return;
                }
                currentActivity.runOnUiThread(new Runnable() { // from class: u4.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        W.e.this.d();
                    }
                });
            } else {
                if (i10 != 1 || this.f66084a.f66064u) {
                    return;
                }
                currentActivity.runOnUiThread(new Runnable() { // from class: u4.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        W.e.this.e();
                    }
                });
            }
        }

        public e(W w10, ThemedReactContext themedReactContext) {
            this.f66084a = w10;
            this.f66085b = themedReactContext;
        }
    }

    public class f extends androidx.media3.exoplayer.e {

        /* renamed from: l, reason: collision with root package name */
        public final int f66086l;

        /* renamed from: m, reason: collision with root package name */
        public final Runtime f66087m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(D1.g gVar, C6206b c6206b) {
            super(gVar, r1 != r10.b() ? c6206b.k() : 50000, c6206b.i() != r10.b() ? c6206b.i() : 50000, c6206b.e() != r10.b() ? c6206b.e() : 1000, c6206b.d() != r10.b() ? c6206b.d() : 2000, -1, true, c6206b.c() != r10.b() ? c6206b.c() : 0, false);
            int k10 = c6206b.k();
            C6206b.a aVar = C6206b.f63930l;
            this.f66087m = Runtime.getRuntime();
            this.f66086l = (int) Math.floor(((ActivityManager) W.this.f66020S4.getSystemService("activity")).getMemoryClass() * (c6206b.j() != aVar.a() ? c6206b.j() : 1.0d) * 1024.0d * 1024.0d);
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f66001f5 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public W(ThemedReactContext themedReactContext, InterfaceC6492C interfaceC6492C) {
        super(themedReactContext);
        this.f66053l = null;
        this.f66054m = false;
        this.f66064u = false;
        this.f66065v = false;
        this.f66067x = false;
        this.f66070y = 1.0f;
        this.f66073z = com.brentvatne.exoplayer.a.f29490d;
        this.f66002A = 1.0f;
        this.f66003B = 0;
        this.f66004C = false;
        this.f66005D = false;
        this.f66006E = false;
        this.f66010I = false;
        this.f66011J = false;
        this.f66012K = new r4.e();
        this.f66013L = new ArrayList();
        this.f66014O = false;
        this.f66015P = -1L;
        this.f66018R = false;
        this.f66021T = new r4.i();
        this.f66068x1 = "disabled";
        this.f66026V1 = true;
        this.f66059p2 = true;
        this.f66069x2 = 250.0f;
        this.f66072y2 = false;
        this.f66016P4 = false;
        this.f66017Q4 = false;
        this.f66019R4 = false;
        this.f66030X4 = -1L;
        this.f66031Y4 = -1L;
        this.f66032Z4 = -1L;
        this.f66034a5 = false;
        this.f66038b5 = 1;
        this.f66040c5 = String.valueOf(UUID.randomUUID());
        this.f66044e5 = new a(Looper.getMainLooper());
        this.f66020S4 = themedReactContext;
        this.f66033a = new s4.V();
        this.f66035b = interfaceC6492C;
        this.f66039c = interfaceC6492C.c();
        if (Build.VERSION.SDK_INT >= 26 && this.f66066w == null) {
            this.f66066w = G.a();
        }
        this.f66007F = new Handler();
        d1();
        this.f66023T4 = (AudioManager) themedReactContext.getSystemService("audio");
        themedReactContext.addLifecycleEventListener(this);
        this.f66024U4 = new C6702a(themedReactContext);
        this.f66029W4 = new e(themedReactContext);
        this.f66027V4 = new C6704c(this, themedReactContext);
    }

    public static boolean B1(androidx.media3.exoplayer.trackselection.C c10, b1.P p10, int i10) {
        return (c10 == null || c10.m() != p10 || c10.l(i10) == -1) ? false : true;
    }

    public static /* bridge */ /* synthetic */ AbstractBinderC6490A F0(W w10) {
        w10.getClass();
        return null;
    }

    public static /* synthetic */ q1.u U(q1.u uVar, b1.z zVar) {
        return uVar;
    }

    private ArrayList<r4.l> getAudioTrackInfo() {
        ArrayList<r4.l> arrayList = new ArrayList<>();
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar != null) {
            B.a o10 = nVar.o();
            int n12 = n1(1);
            if (o10 != null && n12 != -1) {
                m0 f10 = o10.f(n12);
                androidx.media3.exoplayer.trackselection.C a10 = this.f66049h.N().a(1);
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    b1.P b10 = f10.b(i10);
                    androidx.media3.common.a a11 = b10.a(0);
                    boolean z10 = a10 != null && a10.m() == b10;
                    r4.l h12 = h1(a11, i10, a10, b10);
                    int i11 = a11.f20538j;
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    h12.f(i11);
                    h12.j(z10);
                    arrayList.add(h12);
                }
            }
        }
        return arrayList;
    }

    private ArrayList<r4.l> getBasicAudioTrackInfo() {
        ArrayList<r4.l> arrayList = new ArrayList<>();
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar != null) {
            B.a o10 = nVar.o();
            int n12 = n1(1);
            if (o10 != null && n12 != -1) {
                m0 f10 = o10.f(n12);
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    androidx.media3.common.a a10 = f10.b(i10).a(0);
                    r4.l lVar = new r4.l();
                    lVar.g(i10);
                    String str = a10.f20532d;
                    if (str == null) {
                        str = "unknown";
                    }
                    lVar.h(str);
                    String str2 = a10.f20530b;
                    if (str2 == null) {
                        str2 = "Track " + (i10 + 1);
                    }
                    lVar.k(str2);
                    lVar.j(false);
                    String str3 = a10.f20543o;
                    if (str3 != null) {
                        lVar.i(str3);
                    }
                    int i11 = a10.f20538j;
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    lVar.f(i11);
                    arrayList.add(lVar);
                }
                C6441a.a("ReactExoplayerView", "getBasicAudioTrackInfo: returning " + arrayList.size() + " audio tracks (no selection status)");
            }
        }
        return arrayList;
    }

    private ArrayList<r4.l> getBasicTextTrackInfo() {
        ArrayList<r4.l> arrayList = new ArrayList<>();
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar != null) {
            B.a o10 = nVar.o();
            int n12 = n1(3);
            if (o10 != null && n12 != -1) {
                m0 f10 = o10.f(n12);
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    b1.P b10 = f10.b(i10);
                    for (int i11 = 0; i11 < b10.f24395a; i11++) {
                        androidx.media3.common.a a10 = b10.a(i11);
                        r4.l lVar = new r4.l();
                        lVar.g(arrayList.size());
                        String str = a10.f20543o;
                        if (str != null) {
                            lVar.i(str);
                        }
                        String str2 = a10.f20532d;
                        if (str2 != null) {
                            lVar.h(str2);
                        }
                        String str3 = a10.f20529a;
                        boolean z10 = str3 != null && str3.startsWith("external-subtitle-");
                        String str4 = a10.f20530b;
                        if (str4 != null && !str4.isEmpty()) {
                            lVar.k(a10.f20530b);
                        } else if (z10) {
                            lVar.k("External " + (i11 + 1));
                        } else {
                            lVar.k("Track " + (arrayList.size() + 1));
                        }
                        lVar.j(false);
                        arrayList.add(lVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<r4.l> getTextTrackInfo() {
        ArrayList<r4.l> arrayList = new ArrayList<>();
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar != null) {
            B.a o10 = nVar.o();
            int n12 = n1(3);
            if (o10 != null && n12 != -1) {
                androidx.media3.exoplayer.trackselection.C a10 = this.f66049h.N().a(3);
                m0 f10 = o10.f(n12);
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    b1.P b10 = f10.b(i10);
                    for (int i11 = 0; i11 < b10.f24395a; i11++) {
                        androidx.media3.common.a a11 = b10.a(i11);
                        r4.l h12 = h1(a11, i11, a10, b10);
                        String str = a11.f20529a;
                        boolean z10 = str != null && str.startsWith("external-subtitle-");
                        B1(a10, b10, i11);
                        h12.g(arrayList.size());
                        if (h12.d() == null || h12.d().isEmpty()) {
                            if (z10) {
                                h12.k("External " + (i11 + 1));
                            } else {
                                h12.k("Track " + (arrayList.size() + 1));
                            }
                        }
                        arrayList.add(h12);
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<r4.m> getVideoTrackInfo() {
        ArrayList<r4.m> arrayList = new ArrayList<>();
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar != null) {
            B.a o10 = nVar.o();
            int n12 = n1(2);
            if (o10 != null && n12 != -1) {
                m0 f10 = o10.f(n12);
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    b1.P b10 = f10.b(i10);
                    for (int i11 = 0; i11 < b10.f24395a; i11++) {
                        androidx.media3.common.a a10 = b10.a(i11);
                        if (z1(a10)) {
                            arrayList.add(i1(a10, i11));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<r4.m> getVideoTrackInfoFromManifest() {
        return o1(0);
    }

    private void setPlayWhenReady(boolean z10) {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer == null) {
            return;
        }
        if (!z10) {
            exoPlayer.x(false);
            return;
        }
        boolean W12 = W1();
        this.f66067x = W12;
        if (W12) {
            this.f66049h.x(true);
        }
    }

    public static /* synthetic */ A1.a x0(W w10, z.b bVar) {
        w10.J1(bVar);
        return null;
    }

    public static boolean x1(AbstractC2339H abstractC2339H) {
        return abstractC2339H.f24309a == 1002;
    }

    public final boolean A1() {
        ExoPlayer exoPlayer = this.f66049h;
        return exoPlayer != null && exoPlayer.j();
    }

    public boolean C1() {
        String str = this.f66047g1;
        return str == null || "auto".equals(str);
    }

    public final /* synthetic */ void D1(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C6518y.j(this.f66020S4, this.f66066w, this.f66041d);
    }

    public final /* synthetic */ void E1(r4.i iVar, W w10) {
        if (this.f66034a5 && iVar == this.f66021T) {
            return;
        }
        try {
            w1(iVar);
        } catch (Exception e10) {
            w10.f66051j = true;
            C6441a.b("ReactExoplayerView", "Failed to initialize Player! 1");
            C6441a.b("ReactExoplayerView", e10.toString());
            e10.printStackTrace();
            this.f66033a.f64694c.invoke(e10.toString(), e10, "1001");
        }
    }

    public final /* synthetic */ void F1(final r4.i iVar, Activity activity, final W w10) {
        if (this.f66034a5 && iVar == this.f66021T) {
            return;
        }
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: u4.I
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.E1(iVar, w10);
                }
            });
        } else {
            C6441a.b("ReactExoplayerView", "Failed to initialize Player!, null activity");
            this.f66033a.f64694c.invoke("Failed to initialize Player!", new Exception("Current Activity is null!"), "1001");
        }
    }

    @Override // D1.d.a
    public void G(int i10, long j10, long j11) {
        int i11;
        if (this.f66016P4) {
            ExoPlayer exoPlayer = this.f66049h;
            if (exoPlayer == null) {
                this.f66033a.f64696e.invoke(Long.valueOf(j11), 0, 0, null);
                return;
            }
            androidx.media3.common.a y10 = exoPlayer.y();
            boolean z10 = y10 != null && ((i11 = y10.f20513A) == 90 || i11 == 270);
            this.f66033a.f64696e.invoke(Long.valueOf(j11), Integer.valueOf(y10 != null ? z10 ? y10.f20550v : y10.f20551w : 0), Integer.valueOf(y10 != null ? z10 ? y10.f20551w : y10.f20550v : 0), y10 != null ? y10.f20529a : null);
        }
    }

    public final /* synthetic */ void G1(final r4.i iVar, final W w10, final Activity activity) {
        if (this.f66034a5 && iVar == this.f66021T) {
            return;
        }
        try {
            if (iVar.p() != null || y1(iVar)) {
                if (this.f66049h == null) {
                    u1(w10);
                    this.f66009H = C6518y.d(this.f66020S4, this);
                    C6518y.h(this.f66020S4, this.f66066w, this.f66065v);
                }
                if (this.f66021T.s() || this.f66021T.q() || this.f66021T.c().f() <= 0) {
                    this.f66010I = false;
                } else {
                    C6491B.f65970a.b(getContext(), this.f66021T.c().f());
                    this.f66010I = true;
                }
                if (this.f66051j) {
                    this.f66041d.f();
                    Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: u4.V
                        @Override // java.lang.Runnable
                        public final void run() {
                            W.this.F1(iVar, activity, w10);
                        }
                    });
                } else if (iVar == this.f66021T) {
                    w1(iVar);
                }
            }
        } catch (Exception e10) {
            w10.f66051j = true;
            C6441a.b("ReactExoplayerView", "Failed to initialize Player! 2");
            C6441a.b("ReactExoplayerView", e10.toString());
            e10.printStackTrace();
            this.f66033a.f64694c.invoke(e10.toString(), e10, "1001");
        }
    }

    public final /* synthetic */ void H1(int i10) {
        this.f66033a.f64706o.invoke(Boolean.valueOf(i10 == 0));
    }

    public final /* synthetic */ void I1(boolean z10) {
        setFullscreen(!this.f66060q);
    }

    @Override // b1.InterfaceC2341J.d
    public void J(AbstractC2339H abstractC2339H) {
        String str = "ExoPlaybackException: " + AbstractC2339H.b(abstractC2339H.f24309a);
        String str2 = "2" + abstractC2339H.f24309a;
        int i10 = abstractC2339H.f24309a;
        if ((i10 == 6000 || i10 == 6002 || i10 == 6004 || i10 == 6006 || i10 == 6007) && !this.f66004C) {
            this.f66004C = true;
            this.f66051j = true;
            l2();
            s1();
            setPlayWhenReady(true);
            return;
        }
        this.f66033a.f64694c.invoke(str, abstractC2339H, str2);
        this.f66051j = true;
        if (!x1(abstractC2339H)) {
            l2();
            return;
        }
        Z0();
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            exoPlayer.n();
            this.f66049h.g();
        }
    }

    public final /* synthetic */ A1.a J1(z.b bVar) {
        return null;
    }

    public final /* synthetic */ void K1() {
        if (this.f66041d != null) {
            m2();
        }
    }

    public final /* synthetic */ void L1() {
        this.f66033a.f64701j.invoke();
    }

    public final /* synthetic */ void M1() {
        this.f66033a.f64703l.invoke();
    }

    public final /* synthetic */ void N1(long j10, long j11, int i10, int i11, ArrayList arrayList, ArrayList arrayList2, String str) {
        ArrayList<r4.m> videoTrackInfoFromManifest = getVideoTrackInfoFromManifest();
        if (videoTrackInfoFromManifest != null) {
            this.f66005D = true;
        }
        this.f66033a.f64693b.invoke(Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11), arrayList, arrayList2, videoTrackInfoFromManifest, str);
        m2();
    }

    @Override // q1.t
    public void O(int i10, D.b bVar) {
        C6441a.a("DRM Info", "onDrmKeysLoaded");
    }

    public final void O0() {
        i2();
    }

    public final void O1(boolean z10) {
        if (this.f66063t == z10) {
            return;
        }
        if (this.f66062s && this.f66014O && !z10) {
            this.f66033a.f64698g.invoke(Long.valueOf(this.f66049h.getCurrentPosition()), Long.valueOf(this.f66015P));
            this.f66014O = false;
        }
        this.f66063t = z10;
        this.f66033a.f64705n.invoke(Boolean.valueOf(z10));
    }

    public final void P0() {
        setRepeatModifier(this.f66025V);
        setMutedModifier(this.f66064u);
    }

    public final void P1() {
        this.f66023T4.abandonAudioFocus(this.f66029W4);
    }

    public final InterfaceC4411g.a Q0(boolean z10) {
        return C6502h.f(this.f66020S4, z10 ? this.f66039c : null, this.f66021T.j());
    }

    public final void Q1() {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null && exoPlayer.S()) {
            setPlayWhenReady(false);
        }
        setKeepScreenOn(false);
    }

    public final q1.u R0(UUID uuid, r4.f fVar) {
        if (e1.Z.f45503a < 18) {
            return null;
        }
        try {
            C6636c.a aVar = C6636c.f67018d;
            InterfaceC6500f e10 = aVar.a().e();
            if (e10 == null) {
                e10 = new C6499e(S0(false));
            }
            q1.u a10 = e10.a(uuid, fVar);
            if (a10 == null) {
                this.f66033a.f64694c.invoke("Failed to build DRM session manager", new Exception("DRM session manager is null"), "3007");
            }
            q1.u f10 = aVar.a().f(this.f66021T, a10);
            return f10 != null ? f10 : a10;
        } catch (q1.O e11) {
            throw e11;
        } catch (Exception e12) {
            this.f66033a.f64694c.invoke(e12.toString(), e12, "3006");
            return null;
        }
    }

    public final void R1(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final InterfaceC4425u S0(boolean z10) {
        return C6502h.g(this.f66020S4, z10 ? this.f66039c : null, this.f66021T.j());
    }

    public final void S1() {
        R1(this.f66041d);
    }

    @Override // q1.t
    public void T(int i10, D.b bVar, int i11) {
        C6441a.a("DRM Info", "onDrmSessionAcquired");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.media3.exoplayer.source.D T0(Uri uri, String str, final q1.u uVar, long j10, long j11) {
        String lastPathSegment;
        int G02;
        D.a factory;
        D.a aVar;
        final e.a aVar2;
        if (uri == null) {
            throw new IllegalStateException("Invalid video uri");
        }
        if ("rtsp".equals(str)) {
            G02 = 3;
        } else {
            if (TextUtils.isEmpty(str)) {
                lastPathSegment = uri.getLastPathSegment();
            } else {
                lastPathSegment = "." + str;
            }
            G02 = e1.Z.G0(lastPathSegment);
        }
        this.f66035b.a(this.f66048g2);
        z.c i10 = new z.c().i(uri);
        C2333B a10 = C6497c.a(this.f66021T.k());
        if (a10 != null) {
            i10.e(a10);
        }
        List U02 = U0();
        if (U02 != null) {
            i10.g(U02);
        }
        this.f66021T.b();
        i10.c(C6497c.b(this.f66021T.c()).f());
        ArrayList arrayList = new ArrayList();
        q1.w c6103l = uVar != null ? new q1.w() { // from class: u4.K
            @Override // q1.w
            public final q1.u a(b1.z zVar) {
                return W.U(q1.u.this, zVar);
            }
        } : new C6103l();
        if (G02 == 0) {
            factory = new DashMediaSource.Factory(new l.a(this.f66046g), Q0(false));
        } else {
            if (G02 != 1) {
                if (G02 == 2) {
                    InterfaceC4411g.a aVar3 = this.f66046g;
                    if (this.f66010I && !this.f66011J) {
                        aVar3 = C6491B.f65970a.a(S0(true));
                    }
                    aVar = new HlsMediaSource.Factory(aVar3).k(this.f66021T.o());
                } else {
                    if (G02 == 3) {
                        C6441a.b("Exo Player Exception", "RTSP is not enabled!");
                        throw new IllegalStateException("RTSP is not enabled!");
                    }
                    if (G02 != 4) {
                        throw new IllegalStateException("Unsupported type: " + G02);
                    }
                    if ("asset".equals(uri.getScheme())) {
                        try {
                            aVar = new X.b(C6502h.b(this.f66020S4, uri));
                        } catch (Exception unused) {
                            throw new IllegalStateException("cannot open input file:" + uri);
                        }
                    } else {
                        aVar = ("file".equals(uri.getScheme()) || !this.f66010I) ? new X.b(this.f66046g) : new X.b(C6491B.f65970a.a(S0(true)));
                    }
                }
                aVar2 = this.f66042d5;
                if (aVar2 != null) {
                    Objects.requireNonNull(aVar2);
                    aVar = aVar.f(new e.a() { // from class: u4.L
                        @Override // D1.e.a
                        public final D1.e a(b1.z zVar) {
                            return e.a.this.a(zVar);
                        }
                    });
                }
                C6636c.a aVar4 = C6636c.f67018d;
                D.a aVar5 = (D.a) H.a(aVar4.a().i(this.f66021T, aVar, this.f66046g), aVar);
                i10.f(arrayList);
                z.c h10 = aVar4.a().h(this.f66021T, i10);
                androidx.media3.exoplayer.source.D e10 = aVar5.d(c6103l).g(this.f66035b.b(this.f66021T.l())).e(h10 == null ? h10.a() : i10.a());
                return (j10 >= 0 || j11 < 0) ? j10 < 0 ? new C2205f(e10, 1000 * j10, Long.MIN_VALUE) : j11 >= 0 ? new C2205f(e10, 0L, j11 * 1000) : e10 : new C2205f(e10, j10 * 1000, j11 * 1000);
            }
            factory = new SsMediaSource.Factory(new a.C0391a(this.f66046g), Q0(false));
        }
        aVar = factory;
        aVar2 = this.f66042d5;
        if (aVar2 != null) {
        }
        C6636c.a aVar42 = C6636c.f67018d;
        D.a aVar52 = (D.a) H.a(aVar42.a().i(this.f66021T, aVar, this.f66046g), aVar);
        i10.f(arrayList);
        z.c h102 = aVar42.a().h(this.f66021T, i10);
        androidx.media3.exoplayer.source.D e102 = aVar52.d(c6103l).g(this.f66035b.b(this.f66021T.l())).e(h102 == null ? h102.a() : i10.a());
        if (j10 >= 0) {
        }
    }

    public final void T1() {
        if (this.f66041d == null || this.f66049h == null || !this.f66017Q4) {
            return;
        }
        j2();
    }

    public final List U0() {
        String str;
        String f10;
        z.k.a o10;
        String str2;
        if (this.f66021T.m() == null || this.f66021T.m().a().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f66021T.m().a().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r4.g gVar = (r4.g) it.next();
            try {
                str = "external-subtitle-" + i10;
                f10 = gVar.f();
            } catch (Exception e10) {
                C6441a.b("ReactExoplayerView", "Error creating SubtitleConfiguration for URI " + gVar.h() + ": " + e10.getMessage());
            }
            if (f10 != null) {
                if (f10.isEmpty()) {
                }
                o10 = new z.k.a(gVar.h()).k(str).n(gVar.g()).l(f10).o(128);
                if (gVar.e() != null && !gVar.e().isEmpty()) {
                    o10.m(gVar.e());
                }
                if (i10 == 0 || !((str2 = this.f66068x1) == null || "disabled".equals(str2))) {
                    o10.p(0);
                } else {
                    o10.p(1);
                }
                arrayList.add(o10.i());
                C6441a.a("ReactExoplayerView", "Created subtitle configuration: " + str + " - " + f10 + " (" + gVar.g() + ")");
                i10++;
            }
            f10 = "External " + (i10 + 1);
            if (gVar.e() != null && !gVar.e().isEmpty()) {
                f10 = f10 + " (" + gVar.e() + ")";
            }
            o10 = new z.k.a(gVar.h()).k(str).n(gVar.g()).l(f10).o(128);
            if (gVar.e() != null) {
                o10.m(gVar.e());
            }
            if (i10 == 0) {
            }
            o10.p(0);
            arrayList.add(o10.i());
            C6441a.a("ReactExoplayerView", "Created subtitle configuration: " + str + " - " + f10 + " (" + gVar.g() + ")");
            i10++;
        }
        if (!arrayList.isEmpty()) {
            C6441a.a("ReactExoplayerView", "Built " + arrayList.size() + " external subtitle configurations");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final void U1() {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer == null) {
            return;
        }
        if (this.f66054m) {
            E1.a aVar = new E1.a("RNVExoplayer");
            this.f66053l = aVar;
            this.f66049h.b(aVar);
        } else {
            E1.a aVar2 = this.f66053l;
            if (aVar2 != null) {
                exoPlayer.A(aVar2);
                this.f66053l = null;
            }
        }
    }

    public final void V0(com.brentvatne.exoplayer.a aVar) {
        if (this.f66049h != null) {
            int c10 = aVar.c();
            this.f66049h.F(new C2350d.e().c(e1.Z.O(c10)).b(e1.Z.L(c10)).a(), false);
            AudioManager audioManager = (AudioManager) this.f66020S4.getSystemService("audio");
            boolean z10 = aVar == com.brentvatne.exoplayer.a.f29490d;
            audioManager.setMode(z10 ? 0 : 3);
            audioManager.setSpeakerphoneOn(z10);
        }
    }

    public final void V1() {
        Runnable runnable;
        if (this.f66049h != null) {
            l2();
            this.f66049h.release();
            this.f66049h.v(this);
            C6518y.h(this.f66020S4, this.f66066w, false);
            Runnable runnable2 = this.f66009H;
            if (runnable2 != null) {
                runnable2.run();
            }
            this.f66050i = null;
            C6636c.f67018d.a().a(this.f66040c5, this.f66049h);
            this.f66049h = null;
        }
        C6378a c6378a = this.f66045f;
        if (c6378a != null) {
            c6378a.a();
            this.f66045f = null;
        }
        this.f66044e5.removeMessages(1);
        this.f66024U4.a();
        this.f66027V4.b();
        this.f66039c.e(this);
        Handler handler = this.f66007F;
        if (handler == null || (runnable = this.f66008G) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f66008G = null;
    }

    public void W0() {
        h2();
        this.f66020S4.removeLifecycleEventListener(this);
        V1();
        this.f66034a5 = true;
    }

    public final boolean W1() {
        return this.f66022T1 || this.f66021T.p() == null || this.f66067x || this.f66023T4.requestAudioFocus(this.f66029W4, 3, 1) == 1;
    }

    @Override // b1.InterfaceC2341J.d
    public void X(InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, int i10) {
        if (i10 == 1) {
            this.f66014O = true;
            this.f66015P = eVar2.f24336g;
            if (this.f66005D) {
                d2(2, this.f66047g1, this.f66058p1);
            }
        }
        if (this.f66051j) {
            l2();
        }
        if (this.f66005D) {
            d2(2, this.f66047g1, this.f66058p1);
            this.f66006E = true;
        }
        if (i10 == 0 && this.f66049h.l0() == 1) {
            k2();
            if (this.f66018R) {
                return;
            }
            this.f66018R = true;
            this.f66033a.f64699h.invoke();
        }
    }

    public final void X0() {
        try {
            ServiceConnection serviceConnection = this.f66052k;
            if (serviceConnection != null) {
                this.f66020S4.unbindService(serviceConnection);
            }
        } catch (Exception unused) {
            C6441a.f("ReactExoplayerView", "Cloud not cleanup playback service");
        }
    }

    public final void X1(r4.i iVar) {
        C6378a c6378a = this.f66045f;
        if (c6378a == null) {
            this.f66033a.f64694c.invoke("DaiAdsLoader is null", null, "DAI_ADS_LOADER_NULL_ERROR");
        } else {
            c6378a.b(this.f66049h);
            iVar.b();
            throw null;
        }
    }

    @Override // q1.t
    public void Y(int i10, D.b bVar) {
        C6441a.a("DRM Info", "onDrmKeysRemoved");
    }

    public final void Y0() {
        this.f66044e5.removeMessages(1);
    }

    public final void Y1() {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            if (!exoPlayer.S()) {
                setPlayWhenReady(true);
            }
            setKeepScreenOn(this.f66059p2);
        }
    }

    @Override // q1.t
    public void Z(int i10, D.b bVar, Exception exc) {
        C6441a.a("DRM Info", "onDrmSessionManagerError");
        this.f66033a.f64694c.invoke("onDrmSessionManagerError", exc, "3002");
    }

    public final void Z0() {
        this.f66055n = -1;
        this.f66056o = -9223372036854775807L;
    }

    public void Z1(long j10) {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j10);
        }
    }

    public void a1() {
        ExoPlayer exoPlayer;
        if (this.f66021T.p() != null && (exoPlayer = this.f66049h) != null) {
            exoPlayer.stop();
            this.f66049h.l();
        }
        this.f66021T = new r4.i();
        this.f66046g = null;
        Z0();
    }

    public final void a2(String str, String str2) {
        int n12;
        String str3;
        String str4;
        if (this.f66049h == null || this.f66050i == null) {
            return;
        }
        C6441a.a("ReactExoplayerView", "selectTextTrackInternal: type=" + str + ", value=" + str2);
        n.e.a a10 = this.f66050i.c().a();
        if ("disabled".equals(str) || str2 == null) {
            a10.U(3, true);
        } else {
            a10.U(3, false);
            a10.H(3);
            B.a o10 = this.f66050i.o();
            if (o10 != null && (n12 = n1(3)) != -1) {
                m0 f10 = o10.f(n12);
                boolean z10 = false;
                for (int i10 = 0; i10 < f10.f21832a; i10++) {
                    b1.P b10 = f10.b(i10);
                    for (int i11 = 0; i11 < b10.f24395a; i11++) {
                        androidx.media3.common.a a11 = b10.a(i11);
                        if (("language".equals(str) && (str4 = a11.f20532d) != null && str4.equals(str2)) || (("title".equals(str) && (str3 = a11.f20530b) != null && str3.equals(str2)) || ("index".equals(str) && C6442b.i(str2, -1) == i11))) {
                            a10.m0(new b1.Q(b10, Arrays.asList(Integer.valueOf(i11))));
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
                if (!z10) {
                    C6441a.f("ReactExoplayerView", "Text track not found for type=" + str + ", value=" + str2 + ". Keeping current selection.");
                }
            }
        }
        try {
            this.f66050i.m(a10.G());
            this.f66007F.postDelayed(new Runnable() { // from class: u4.P
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.K1();
                }
            }, 100L);
        } catch (Exception e10) {
            C6441a.b("ReactExoplayerView", "Error setting text track parameters: " + e10.getMessage());
        }
    }

    public final C6378a b1() {
        return new C6378a.C0906a(getContext(), this.f66041d.getPlayerView()).c(this).b(this).a();
    }

    public void b2(String str, String str2) {
        this.f66028W = str;
        this.f66036b1 = str2;
        if (this.f66017Q4 || this.f66049h == null || this.f66050i == null) {
            return;
        }
        d2(1, str, str2);
    }

    public final androidx.media3.exoplayer.source.r c1() {
        this.f66045f = b1();
        androidx.media3.exoplayer.source.r rVar = new androidx.media3.exoplayer.source.r(new C4419o.a(getContext()));
        rVar.v(new C6379b(this.f66045f, rVar));
        return rVar;
    }

    public void c2(String str, String str2) {
        this.f66068x1 = str;
        this.f66071y1 = str2;
        a2(str, str2);
    }

    public final void d1() {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f66001f5;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C6505k c6505k = new C6505k(getContext());
        this.f66041d = c6505k;
        c6505k.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: u4.T
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                W.this.D1(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        this.f66041d.setLayoutParams(layoutParams);
        addView(this.f66041d, 0, layoutParams);
        this.f66041d.setFocusable(this.f66026V1);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x026a A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:56:0x0213, B:58:0x023a, B:63:0x0250, B:65:0x0256, B:68:0x025f, B:71:0x026a, B:72:0x0295, B:76:0x0264, B:77:0x0246), top: B:55:0x0213 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d2(int i10, String str, String str2) {
        B.a o10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        androidx.media3.common.a aVar;
        int i14;
        int i15;
        if (this.f66049h == null || this.f66050i == null || this.f66017Q4) {
            return;
        }
        int n12 = n1(i10);
        int i16 = -1;
        if (n12 == -1 || (o10 = this.f66050i.o()) == null) {
            return;
        }
        m0 f10 = o10.f(n12);
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        arrayList.add(0);
        String str3 = TextUtils.isEmpty(str) ? Constants.COLLATION_DEFAULT : str;
        if ("disabled".equals(str3)) {
            e1(n12);
            return;
        }
        if ("language".equals(str3)) {
            i11 = 0;
            while (i11 < f10.f21832a) {
                String str4 = f10.b(i11).a(0).f20532d;
                if (str4 != null && str4.equals(str2)) {
                    break;
                } else {
                    i11++;
                }
            }
            i11 = -1;
        } else if ("title".equals(str3)) {
            i11 = 0;
            while (i11 < f10.f21832a) {
                String str5 = f10.b(i11).a(0).f20530b;
                if (str5 != null && str5.equals(str2)) {
                    break;
                } else {
                    i11++;
                }
            }
            i11 = -1;
        } else if ("index".equals(str3)) {
            int i18 = C6442b.i(str2, -1);
            if (i18 != -1) {
                if (i10 == 2 && f10.f21832a == 1) {
                    if (i18 < f10.b(0).f24395a) {
                        arrayList.set(0, Integer.valueOf(i18));
                    }
                    i11 = 0;
                } else if (i18 < f10.f21832a) {
                    i11 = i18;
                }
            }
            i11 = -1;
        } else if ("resolution".equals(str3)) {
            int i19 = C6442b.i(str2, -1);
            if (i19 != -1) {
                int i20 = -1;
                int i21 = 0;
                while (i21 < f10.f21832a) {
                    b1.P b10 = f10.b(i21);
                    androidx.media3.common.a aVar2 = null;
                    int i22 = i16;
                    int i23 = i17;
                    androidx.media3.common.a aVar3 = null;
                    while (true) {
                        if (i23 >= b10.f24395a) {
                            i12 = i21;
                            aVar2 = aVar3;
                            i13 = i22;
                            z10 = false;
                            break;
                        }
                        androidx.media3.common.a a10 = b10.a(i23);
                        int i24 = a10.f20551w;
                        if (i24 == i19) {
                            arrayList.set(0, Integer.valueOf(i23));
                            i12 = i21;
                            i20 = i12;
                            z10 = true;
                            i13 = -1;
                            break;
                        }
                        int i25 = i21;
                        if (this.f66005D) {
                            if (aVar3 != null) {
                                aVar = a10;
                                if (a10.f20538j <= aVar3.f20538j) {
                                    if (i24 <= aVar3.f20551w) {
                                    }
                                }
                                if (i24 >= i19) {
                                }
                                i22 = i23;
                                aVar3 = aVar;
                            } else {
                                aVar = a10;
                                if (i24 >= i19) {
                                }
                                i22 = i23;
                                aVar3 = aVar;
                            }
                        }
                        i23++;
                        i21 = i25;
                    }
                    if (aVar2 == null && this.f66005D && !z10) {
                        int i26 = Integer.MAX_VALUE;
                        for (int i27 = 0; i27 < b10.f24395a; i27++) {
                            int i28 = b10.a(i27).f20551w;
                            if (i28 < i26) {
                                arrayList.set(0, Integer.valueOf(i27));
                                i20 = i12;
                                i26 = i28;
                            }
                        }
                    }
                    if (aVar2 != null && i13 != -1) {
                        arrayList.set(0, Integer.valueOf(i13));
                        i20 = i12;
                    }
                    i21 = i12 + 1;
                    i16 = -1;
                    i17 = 0;
                }
                i11 = i20;
                i16 = -1;
            }
            i11 = -1;
            i16 = -1;
        } else {
            if (i10 == 3 && e1.Z.f45503a > 18) {
                CaptioningManager captioningManager = (CaptioningManager) this.f66020S4.getSystemService("captioning");
                if (captioningManager != null && captioningManager.isEnabled()) {
                    i11 = l1(f10);
                }
                i11 = -1;
            } else if (i10 == 1) {
                i11 = l1(f10);
            } else {
                i16 = -1;
                i11 = -1;
            }
            i16 = -1;
        }
        if (i11 == i16 && i10 == 2 && f10.f21832a != 0) {
            b1.P b11 = f10.b(0);
            arrayList = new ArrayList(b11.f24395a);
            for (int i29 = 0; i29 < b11.f24395a; i29++) {
                arrayList.add(Integer.valueOf(i29));
            }
            int i30 = 0;
            for (int i31 = 0; i31 < arrayList.size(); i31++) {
                if (z1(b11.a(i31))) {
                    i30++;
                }
            }
            if (arrayList.size() != 1) {
                ArrayList arrayList2 = new ArrayList(i30 + 1);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    if (z1(b11.a(i32))) {
                        arrayList2.add((Integer) arrayList.get(i32));
                    }
                }
                arrayList = arrayList2;
            }
            i15 = -1;
            i14 = 0;
        } else {
            i14 = i11;
            i15 = -1;
        }
        if (i14 == i15) {
            e1(n12);
            return;
        }
        try {
            b1.Q q10 = new b1.Q(f10.b(i14), arrayList);
            n.e.a F02 = this.f66050i.c().a().u0(true).v0(true).w0(true).F0(n12, false);
            if (i10 == 1) {
                if (!str3.equals(Constants.COLLATION_DEFAULT)) {
                }
                if (i10 == 2 || !C1()) {
                    F02.m0(q10);
                } else {
                    int i33 = this.f66003B;
                    F02.A0(i33 == 0 ? Integer.MAX_VALUE : i33);
                }
                if (i10 == 1) {
                    F02.x0(false);
                    F02.y0(false);
                    C6441a.a("ReactExoplayerView", "Audio track selection: group=" + i14 + ", tracks=" + arrayList + ", override=" + q10);
                }
                this.f66050i.m(F02.G());
                C6441a.a("ReactExoplayerView", "Applied track selection for type: " + i10 + ", group: " + i14);
            }
            F02.H(q10.a());
            if (i10 == 2) {
            }
            F02.m0(q10);
            if (i10 == 1) {
            }
            this.f66050i.m(F02.G());
            C6441a.a("ReactExoplayerView", "Applied track selection for type: " + i10 + ", group: " + i14);
        } catch (Exception e10) {
            C6441a.b("ReactExoplayerView", "Error applying track selection: " + e10.getMessage());
            e10.printStackTrace();
        }
    }

    public void e1(int i10) {
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        if (nVar == null) {
            return;
        }
        this.f66050i.m(nVar.c().a().F0(i10, true).G());
    }

    public void e2(String str, String str2) {
        this.f66047g1 = str;
        this.f66058p1 = str2;
        if (this.f66057p) {
            return;
        }
        d2(2, str, str2);
    }

    @Override // b1.InterfaceC2341J.d
    public void f0(float f10) {
        this.f66033a.f64712u.invoke(Float.valueOf(f10));
    }

    public void f1() {
        PictureInPictureParams pictureInPictureParams;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f66066w.setActions(C6518y.q(this.f66020S4, this.f66062s, this.f66027V4));
            if (this.f66049h.g0() == 3) {
                this.f66066w.setAspectRatio(C6518y.k(this.f66049h));
            }
            pictureInPictureParams = this.f66066w.build();
        } else {
            pictureInPictureParams = null;
        }
        C6518y.p(this.f66020S4, pictureInPictureParams);
    }

    public final void f2() {
        if (!this.f66019R4 || this.f66049h == null) {
            return;
        }
        this.f66052k = new b();
        Intent intent = new Intent(this.f66020S4, (Class<?>) b0.class);
        intent.setAction("androidx.media3.session.MediaSessionService");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f66020S4.startForegroundService(intent);
        } else {
            this.f66020S4.startService(intent);
        }
        this.f66020S4.bindService(intent, this.f66052k, i10 >= 29 ? 4097 : 1);
    }

    @Override // b1.InterfaceC2341J.d
    public void g0(b1.T t10) {
        C6441a.a("ReactExoplayerView", "onTracksChanged called - updating track information, controls=" + this.f66017Q4);
        if (this.f66017Q4) {
            ArrayList<r4.l> basicTextTrackInfo = getBasicTextTrackInfo();
            ArrayList<r4.l> basicAudioTrackInfo = getBasicAudioTrackInfo();
            ArrayList<r4.m> videoTrackInfo = getVideoTrackInfo();
            this.f66033a.f64714w.invoke(basicTextTrackInfo);
            this.f66033a.f64713v.invoke(basicAudioTrackInfo);
            this.f66033a.f64715x.invoke(videoTrackInfo);
        } else {
            ArrayList<r4.l> textTrackInfo = getTextTrackInfo();
            ArrayList<r4.l> audioTrackInfo = getAudioTrackInfo();
            ArrayList<r4.m> videoTrackInfo2 = getVideoTrackInfo();
            this.f66033a.f64714w.invoke(textTrackInfo);
            this.f66033a.f64713v.invoke(audioTrackInfo);
            this.f66033a.f64715x.invoke(videoTrackInfo2);
            Iterator<r4.l> it = audioTrackInfo.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
        m2();
    }

    public void g1() {
        Activity currentActivity = this.f66020S4.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        if (!this.f66013L.isEmpty()) {
            if (this.f66041d.getParent().equals(viewGroup)) {
                viewGroup.removeView(this.f66041d);
            }
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                viewGroup.getChildAt(i10).setVisibility(((Integer) this.f66013L.get(i10)).intValue());
            }
            this.f66013L.clear();
        }
        if (currentActivity.isInPictureInPictureMode()) {
            currentActivity.moveTaskToBack(false);
        }
    }

    public final void g2() {
        this.f66044e5.sendEmptyMessage(1);
    }

    public boolean getPreventsDisplaySleepDuringVideoPlayback() {
        return this.f66059p2;
    }

    public final r4.l h1(androidx.media3.common.a aVar, int i10, androidx.media3.exoplayer.trackselection.C c10, b1.P p10) {
        r4.l lVar = new r4.l();
        lVar.g(i10);
        String str = aVar.f20543o;
        if (str != null) {
            lVar.i(str);
        }
        String str2 = aVar.f20532d;
        if (str2 != null) {
            lVar.h(str2);
        }
        String str3 = aVar.f20530b;
        if (str3 != null) {
            lVar.k(str3);
        }
        lVar.j(B1(c10, p10, i10));
        return lVar;
    }

    public final void h2() {
        P1();
        V1();
    }

    public final r4.m i1(androidx.media3.common.a aVar, int i10) {
        r4.m mVar = new r4.m();
        int i11 = aVar.f20550v;
        if (i11 == -1) {
            i11 = 0;
        }
        mVar.o(i11);
        int i12 = aVar.f20551w;
        if (i12 == -1) {
            i12 = 0;
        }
        mVar.k(i12);
        int i13 = aVar.f20538j;
        mVar.i(i13 != -1 ? i13 : 0);
        mVar.m(aVar.f20513A);
        String str = aVar.f20539k;
        if (str != null) {
            mVar.j(str);
        }
        String str2 = aVar.f20529a;
        if (str2 == null) {
            str2 = String.valueOf(i10);
        }
        mVar.n(str2);
        mVar.l(i10);
        return mVar;
    }

    public final void i2() {
        C6505k c6505k = this.f66041d;
        if (c6505k == null) {
            return;
        }
        c6505k.setControllerShowTimeoutMs(5000);
        this.f66041d.setControllerAutoShow(true);
        this.f66041d.setControllerHideOnTouch(true);
        j2();
    }

    public final void j1() {
        t1();
        setControls(this.f66017Q4);
        P0();
    }

    public final void j2() {
        C6505k c6505k = this.f66041d;
        if (c6505k == null) {
            return;
        }
        c6505k.setUseController(this.f66017Q4 && !this.f66012K.a());
    }

    @Override // q1.t
    public void k0(int i10, D.b bVar) {
        C6441a.a("DRM Info", "onDrmKeysRestored");
    }

    public void k1(Promise promise) {
        if (this.f66049h != null) {
            promise.resolve(Float.valueOf(r0.getCurrentPosition() / 1000.0f));
        } else {
            promise.reject("PLAYER_NOT_AVAILABLE", "Player is not initialized.");
        }
    }

    public final void k2() {
        if (this.f66049h != null) {
            if (this.f66041d != null && A1() && this.f66017Q4) {
                this.f66041d.e();
            }
            long m10 = (this.f66049h.m() * this.f66049h.getDuration()) / 100;
            long duration = this.f66049h.getDuration();
            long currentPosition = this.f66049h.getCurrentPosition();
            if (currentPosition > duration) {
                currentPosition = duration;
            }
            if (this.f66030X4 == currentPosition && this.f66031Y4 == m10 && this.f66032Z4 == duration) {
                return;
            }
            this.f66030X4 = currentPosition;
            this.f66031Y4 = m10;
            this.f66032Z4 = duration;
            this.f66033a.f64695d.invoke(Long.valueOf(currentPosition), Long.valueOf(m10), Long.valueOf(this.f66049h.getDuration()), Double.valueOf(m1(currentPosition)));
        }
    }

    public final int l1(m0 m0Var) {
        if (m0Var.f21832a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i10 = 0; i10 < m0Var.f21832a; i10++) {
            String str = m0Var.b(i10).a(0).f20532d;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i10;
            }
        }
        return 0;
    }

    public final void l2() {
        this.f66055n = this.f66049h.h0();
        this.f66056o = this.f66049h.f0() ? Math.max(0L, this.f66049h.getCurrentPosition()) : -9223372036854775807L;
    }

    @Override // w4.InterfaceC6703b
    public void m() {
        this.f66033a.f64709r.invoke();
    }

    public double m1(long j10) {
        AbstractC2346O.c cVar = new AbstractC2346O.c();
        if (!this.f66049h.I().q()) {
            this.f66049h.I().n(this.f66049h.h0(), cVar);
        }
        return cVar.f24382f + j10;
    }

    public final void m2() {
        if (this.f66041d == null) {
            return;
        }
        this.f66041d.setShowSubtitleButton(!(this.f66021T.m() == null || this.f66021T.m().a().isEmpty()) || p1());
    }

    public int n1(int i10) {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer == null) {
            return -1;
        }
        int U10 = exoPlayer.U();
        for (int i11 = 0; i11 < U10; i11++) {
            if (this.f66049h.O(i11) == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void n2() {
        final int i10;
        int i11;
        if (this.f66049h.j() || !this.f66057p) {
            return;
        }
        this.f66057p = false;
        String str = this.f66028W;
        if (str != null) {
            b2(str, this.f66036b1);
        }
        String str2 = this.f66047g1;
        if (str2 != null) {
            e2(str2, this.f66058p1);
        }
        String str3 = this.f66068x1;
        if (str3 != null) {
            c2(str3, this.f66071y1);
        }
        androidx.media3.common.a y10 = this.f66049h.y();
        boolean z10 = y10 != null && ((i11 = y10.f20513A) == 90 || i11 == 270);
        if (y10 != null) {
            i10 = z10 ? y10.f20551w : y10.f20550v;
        } else {
            i10 = 0;
        }
        final int i12 = y10 != null ? z10 ? y10.f20550v : y10.f20551w : 0;
        final String str4 = y10 != null ? y10.f20529a : null;
        final long duration = this.f66049h.getDuration();
        final long currentPosition = this.f66049h.getCurrentPosition();
        final ArrayList<r4.l> audioTrackInfo = getAudioTrackInfo();
        final ArrayList<r4.l> textTrackInfo = getTextTrackInfo();
        if (this.f66021T.e() != -1) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: u4.O
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.N1(duration, currentPosition, i10, i12, audioTrackInfo, textTrackInfo, str4);
                }
            });
            return;
        }
        this.f66033a.f64693b.invoke(Long.valueOf(duration), Long.valueOf(currentPosition), Integer.valueOf(i10), Integer.valueOf(i12), audioTrackInfo, textTrackInfo, getVideoTrackInfo(), str4);
        m2();
        T1();
    }

    public final ArrayList o1(int i10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            ArrayList arrayList = (ArrayList) newSingleThreadExecutor.submit(new c(this.f66046g.a(), this.f66021T.p(), (this.f66021T.e() * 1000) - 100)).get(3000L, TimeUnit.MILLISECONDS);
            if (arrayList == null && i10 < 1) {
                return o1(i10 + 1);
            }
            newSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (Exception e10) {
            C6441a.f("ReactExoplayerView", "error in getVideoTrackInfoFromManifest handling request:" + e10.getMessage());
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        X0();
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        W0();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f66061r = true;
        Activity currentActivity = this.f66020S4.getCurrentActivity();
        int i10 = e1.Z.f45503a;
        boolean z10 = i10 >= 24 && currentActivity != null && currentActivity.isInPictureInPictureMode();
        boolean z11 = i10 >= 24 && currentActivity != null && currentActivity.isInMultiWindowMode();
        if (this.f66072y2 || z10 || z11) {
            return;
        }
        setPlayWhenReady(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f66072y2 || !this.f66061r) {
            setPlayWhenReady(!this.f66062s);
        }
        this.f66061r = false;
    }

    @Override // q1.t
    public void p0(int i10, D.b bVar) {
        C6441a.a("DRM Info", "onDrmSessionReleased");
    }

    public final boolean p1() {
        androidx.media3.exoplayer.trackselection.n nVar;
        B.a o10;
        int n12;
        if (this.f66049h == null || (nVar = this.f66050i) == null || (o10 = nVar.o()) == null || (n12 = n1(3)) == -1) {
            return false;
        }
        m0 f10 = o10.f(n12);
        for (int i10 = 0; i10 < f10.f21832a; i10++) {
            b1.P b10 = f10.b(i10);
            for (int i11 = 0; i11 < b10.f24395a; i11++) {
                String str = b10.a(i11).f20529a;
                if (str == null || !str.startsWith("external-subtitle-")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final A1.b q1(androidx.media3.exoplayer.source.D d10, r4.i iVar) {
        iVar.b();
        iVar.p();
        return null;
    }

    @Override // b1.InterfaceC2341J.d
    public void r0(InterfaceC2341J interfaceC2341J, InterfaceC2341J.c cVar) {
        String str;
        String str2;
        if (cVar.a(4) || cVar.a(5)) {
            int g02 = interfaceC2341J.g0();
            boolean S10 = interfaceC2341J.S();
            String str3 = "onStateChanged: playWhenReady=" + S10 + ", playbackState=";
            this.f66033a.f64711t.invoke(Float.valueOf((S10 && g02 == 3) ? 1.0f : 0.0f));
            if (g02 != 1) {
                if (g02 == 2) {
                    str2 = str3 + "buffering";
                    O1(true);
                    Y0();
                    setKeepScreenOn(this.f66059p2);
                } else if (g02 == 3) {
                    str = str3 + "ready";
                    this.f66018R = false;
                    this.f66033a.f64704m.invoke();
                    O1(false);
                    Y0();
                    g2();
                    n2();
                    if (this.f66006E && this.f66005D) {
                        this.f66006E = false;
                        d2(2, this.f66047g1, this.f66058p1);
                    }
                    C6505k c6505k = this.f66041d;
                    if (c6505k != null) {
                        c6505k.i();
                    }
                    setKeepScreenOn(this.f66059p2);
                } else if (g02 != 4) {
                    str2 = str3 + "unknown";
                } else {
                    str2 = str3 + "ended";
                    k2();
                    if (!this.f66018R) {
                        this.f66018R = true;
                        this.f66033a.f64699h.invoke();
                    }
                    P1();
                    setKeepScreenOn(false);
                }
                C6441a.a("ReactExoplayerView", str2);
            }
            str = str3 + "idle";
            this.f66033a.f64707p.invoke();
            Y0();
            if (!interfaceC2341J.S()) {
                setKeepScreenOn(false);
            }
            str2 = str;
            C6441a.a("ReactExoplayerView", str2);
        }
    }

    public final void r1(r4.i iVar) {
        if (this.f66049h == null) {
            C6441a.f("ReactExoplayerView", "Player is null in initializeDaiSource, skipping DAI initialization");
            return;
        }
        X1(iVar);
        this.f66049h.g();
        this.f66051j = false;
        this.f66033a.f64692a.invoke();
        this.f66057p = true;
        j1();
    }

    public final void s1() {
        this.f66011J = C6636c.f67018d.a().k(this.f66021T);
        final Activity currentActivity = this.f66020S4.getCurrentActivity();
        final r4.i iVar = this.f66021T;
        Runnable runnable = new Runnable() { // from class: u4.U
            @Override // java.lang.Runnable
            public final void run() {
                W.this.G1(iVar, this, currentActivity);
            }
        };
        this.f66008G = runnable;
        this.f66007F.postDelayed(runnable, 1L);
    }

    public void setAudioOutput(com.brentvatne.exoplayer.a aVar) {
        if (this.f66073z != aVar) {
            this.f66073z = aVar;
            V0(aVar);
        }
    }

    public void setBufferingStrategy(c.a aVar) {
        this.f66037b2 = aVar;
    }

    public void setCmcdConfigurationFactory(e.a aVar) {
        this.f66042d5 = aVar;
    }

    public void setControls(boolean z10) {
        this.f66017Q4 = z10;
        C6505k c6505k = this.f66041d;
        if (c6505k != null) {
            c6505k.setUseController(z10);
            if (z10) {
                this.f66041d.setControllerAutoShow(true);
                this.f66041d.setControllerHideOnTouch(true);
                this.f66041d.setControllerShowTimeoutMs(5000);
            }
        }
        if (z10) {
            O0();
        }
        T1();
    }

    public void setControlsStyles(r4.e eVar) {
        this.f66012K = eVar;
        T1();
    }

    public void setDebug(boolean z10) {
        this.f66054m = z10;
        U1();
    }

    public void setDisableDisconnectError(boolean z10) {
        this.f66048g2 = z10;
    }

    public void setDisableFocus(boolean z10) {
        this.f66022T1 = z10;
    }

    public void setEnterPictureInPictureOnLeave(boolean z10) {
        this.f66065v = z10;
        if (this.f66049h != null) {
            C6518y.h(this.f66020S4, this.f66066w, z10);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z10) {
        this.f66026V1 = z10;
        this.f66041d.setFocusable(z10);
    }

    public void setFullscreen(boolean z10) {
        if (z10 == this.f66060q) {
            return;
        }
        this.f66060q = z10;
        if (this.f66020S4.getCurrentActivity() == null) {
            return;
        }
        if (this.f66060q) {
            this.f66043e = new DialogC6507m(getContext(), this.f66041d, this, null, new d(true), this.f66012K);
            this.f66033a.f64700i.invoke();
            DialogC6507m dialogC6507m = this.f66043e;
            if (dialogC6507m != null) {
                dialogC6507m.show();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: u4.Q
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.L1();
                }
            });
            return;
        }
        this.f66033a.f64702k.invoke();
        DialogC6507m dialogC6507m2 = this.f66043e;
        if (dialogC6507m2 != null) {
            dialogC6507m2.dismiss();
            S1();
            setControls(this.f66017Q4);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: u4.S
            @Override // java.lang.Runnable
            public final void run() {
                W.this.M1();
            }
        });
    }

    public void setIsInPictureInPicture(boolean z10) {
        this.f66033a.f64691A.invoke(Boolean.valueOf(z10));
        DialogC6507m dialogC6507m = this.f66043e;
        if (dialogC6507m != null && dialogC6507m.isShowing()) {
            if (z10) {
                this.f66043e.d();
                return;
            }
            return;
        }
        Activity currentActivity = this.f66020S4.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z10) {
            ViewGroup viewGroup2 = (ViewGroup) this.f66041d.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f66041d);
            }
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) != this.f66041d) {
                    this.f66013L.add(Integer.valueOf(viewGroup.getChildAt(i10).getVisibility()));
                    viewGroup.getChildAt(i10).setVisibility(8);
                }
            }
            viewGroup.addView(this.f66041d, layoutParams);
            return;
        }
        viewGroup.removeView(this.f66041d);
        if (this.f66013L.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup.getChildAt(i11).setVisibility(((Integer) this.f66013L.get(i11)).intValue());
        }
        addView(this.f66041d, 0, layoutParams);
        S1();
    }

    public void setMaxBitRateModifier(int i10) {
        this.f66003B = i10;
        if (this.f66049h == null || !C1()) {
            return;
        }
        androidx.media3.exoplayer.trackselection.n nVar = this.f66050i;
        n.e.a H10 = nVar.H();
        int i11 = this.f66003B;
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        nVar.g0(H10.A0(i11));
    }

    public void setMutedModifier(boolean z10) {
        this.f66064u = z10;
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            exoPlayer.h(z10 ? 0.0f : this.f66002A);
        }
    }

    public void setPausedModifier(boolean z10) {
        this.f66062s = z10;
        if (this.f66049h != null) {
            if (z10) {
                Q1();
            } else {
                Y1();
            }
        }
    }

    public void setPlayInBackground(boolean z10) {
        this.f66072y2 = z10;
    }

    public void setPreventsDisplaySleepDuringVideoPlayback(boolean z10) {
        this.f66059p2 = z10;
    }

    public void setProgressUpdateInterval(float f10) {
        this.f66069x2 = f10;
    }

    public void setRateModifier(float f10) {
        if (f10 <= 0.0f) {
            C6441a.f("ReactExoplayerView", "cannot set rate <= 0");
            return;
        }
        this.f66070y = f10;
        if (this.f66049h != null) {
            this.f66049h.e(new C2340I(this.f66070y, 1.0f));
        }
    }

    public void setRepeatModifier(boolean z10) {
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            if (z10) {
                exoPlayer.i0(1);
            } else {
                exoPlayer.i0(0);
            }
        }
        this.f66025V = z10;
    }

    public void setReportBandwidth(boolean z10) {
        this.f66016P4 = z10;
    }

    public void setResizeModeModifier(int i10) {
        C6505k c6505k = this.f66041d;
        if (c6505k != null) {
            c6505k.setResizeMode(i10);
        }
    }

    public void setShowNotificationControls(boolean z10) {
        this.f66019R4 = z10;
        ServiceConnection serviceConnection = this.f66052k;
        if (serviceConnection == null && z10) {
            f2();
        } else {
            if (z10 || serviceConnection == null) {
                return;
            }
            X0();
        }
    }

    public void setShutterColor(Integer num) {
        this.f66041d.setShutterColor(num.intValue());
    }

    public void setSrc(r4.i iVar) {
        if (iVar.p() == null && !y1(iVar)) {
            a1();
            return;
        }
        Z0();
        boolean r10 = iVar.r(this.f66021T);
        this.f66004C = false;
        this.f66021T = iVar;
        InterfaceC4411g.a f10 = C6502h.f(this.f66020S4, this.f66039c, iVar.j());
        this.f66046g = (InterfaceC4411g.a) H.a(C6636c.f67018d.a().g(iVar, f10), f10);
        if (iVar.d() != null) {
            setCmcdConfigurationFactory(new C6496b(iVar.d()).h());
        } else {
            setCmcdConfigurationFactory(null);
        }
        if (r10) {
            return;
        }
        this.f66018R = false;
        this.f66051j = true;
        s1();
    }

    public void setSubtitleStyle(r4.j jVar) {
        this.f66041d.setSubtitleStyle(jVar);
    }

    public void setViewType(int i10) {
        this.f66041d.k(i10);
    }

    public void setVolumeModifier(float f10) {
        this.f66002A = f10;
        ExoPlayer exoPlayer = this.f66049h;
        if (exoPlayer != null) {
            exoPlayer.h(f10);
        }
    }

    @Override // b1.InterfaceC2341J.d
    public void t0(boolean z10) {
        if (z10 && this.f66014O) {
            this.f66033a.f64698g.invoke(Long.valueOf(this.f66049h.getCurrentPosition()), Long.valueOf(this.f66015P));
        }
        C6518y.i(this.f66020S4, this.f66066w, this.f66027V4, !z10);
        this.f66033a.f64697f.invoke(Boolean.valueOf(z10), Boolean.valueOf(this.f66014O));
        if (z10) {
            this.f66014O = false;
        }
    }

    public final void t1() {
        this.f66041d.setPlayer(this.f66049h);
        this.f66041d.setControllerVisibilityListener(new PlayerView.d() { // from class: u4.M
            @Override // androidx.media3.ui.PlayerView.d
            public final void a(int i10) {
                W.this.H1(i10);
            }
        });
        this.f66041d.setFullscreenButtonClickListener(new PlayerView.e() { // from class: u4.N
            @Override // androidx.media3.ui.PlayerView.e
            public final void a(boolean z10) {
                W.this.I1(z10);
            }
        });
        i2();
    }

    @Override // b1.InterfaceC2341J.d
    public void u(C2340I c2340i) {
        this.f66033a.f64711t.invoke(Float.valueOf(c2340i.f24315a));
    }

    public final void u1(W w10) {
        androidx.media3.exoplayer.source.r rVar;
        androidx.media3.exoplayer.trackselection.n nVar = new androidx.media3.exoplayer.trackselection.n(getContext(), new C2225a.b());
        w10.f66050i = nVar;
        n.e.a H10 = this.f66050i.H();
        int i10 = this.f66003B;
        if (i10 == 0) {
            i10 = Integer.MAX_VALUE;
        }
        nVar.g0(H10.A0(i10));
        f fVar = new f(new D1.g(true, PKIFailureInfo.notAuthorized), this.f66021T.c());
        long g10 = this.f66021T.c().g();
        if (g10 > 0) {
            this.f66035b.d(g10);
            this.f66039c = this.f66035b.c();
        }
        C5511i m10 = new C5511i(getContext()).q(0).p(true).m();
        if (y1(this.f66021T)) {
            rVar = c1();
        } else {
            rVar = new androidx.media3.exoplayer.source.r(this.f66046g);
            rVar.u(new a.InterfaceC0001a() { // from class: u4.J
                @Override // A1.a.InterfaceC0001a
                public final A1.a a(z.b bVar) {
                    W.x0(W.this, bVar);
                    return null;
                }
            }, this.f66041d.getPlayerView());
        }
        if (this.f66010I && !this.f66011J) {
            rVar.r(C6491B.f65970a.a(S0(true)));
        }
        this.f66049h = new ExoPlayer.b(getContext(), m10).p(w10.f66050i).k(this.f66039c).m(fVar).o(rVar).i();
        C6636c.f67018d.a().b(this.f66040c5, this.f66049h);
        U1();
        this.f66049h.p(w10);
        this.f66049h.h(this.f66064u ? 0.0f : this.f66002A * 1.0f);
        this.f66041d.setPlayer(this.f66049h);
        this.f66024U4.b(w10);
        this.f66027V4.c();
        this.f66039c.d(new Handler(), w10);
        setPlayWhenReady(!this.f66062s);
        this.f66051j = true;
        this.f66049h.e(new C2340I(this.f66070y, 1.0f));
        V0(this.f66073z);
        if (this.f66019R4) {
            f2();
        }
    }

    public final q1.u v1() {
        UUID e02;
        r4.f h10 = this.f66021T.h();
        if (h10 == null || h10.c() == null || (e02 = e1.Z.e0(h10.c())) == null) {
            return null;
        }
        try {
            C6441a.a("ReactExoplayerView", "drm buildDrmSessionManager");
            return R0(e02, h10);
        } catch (q1.O e10) {
            this.f66033a.f64694c.invoke(getResources().getString(e1.Z.f45503a < 18 ? AbstractC6634a.f67015a : e10.f63247a == 1 ? AbstractC6634a.f67017c : AbstractC6634a.f67016b), e10, "3003");
            return null;
        }
    }

    @Override // b1.InterfaceC2341J.d
    public void w(C2334C c2334c) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof V1.i) {
                V1.i iVar = (V1.i) c2334c.d(i10);
                arrayList.add(new r4.k(iVar.f12353a, iVar instanceof V1.n ? ((V1.n) iVar).f12363c : ""));
            } else if (d10 instanceof S1.a) {
                S1.a aVar = (S1.a) d10;
                arrayList.add(new r4.k(aVar.f10536a, aVar.f10537b));
            } else {
                C6441a.a("ReactExoplayerView", "unhandled metadata " + d10);
            }
        }
        this.f66033a.f64708q.invoke(arrayList);
    }

    public final void w1(r4.i iVar) {
        ExoPlayer exoPlayer;
        if (y1(iVar)) {
            r1(iVar);
            return;
        }
        if (iVar.p() == null) {
            return;
        }
        q1.u v12 = v1();
        if (v12 == null && iVar.h() != null && iVar.h().c() != null) {
            C6441a.b("ReactExoplayerView", "Failed to initialize DRM Session Manager Framework!");
            return;
        }
        androidx.media3.exoplayer.source.D T02 = T0(iVar.p(), iVar.i(), v12, iVar.g(), iVar.f());
        androidx.media3.exoplayer.source.D d10 = (androidx.media3.exoplayer.source.D) H.a(q1(T02, iVar), T02);
        while (true) {
            exoPlayer = this.f66049h;
            if (exoPlayer != null) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                C6441a.b("ReactExoplayerView", e10.toString());
            }
        }
        int i10 = this.f66055n;
        if (i10 != -1) {
            exoPlayer.Q(i10, this.f66056o);
            this.f66049h.q(d10, false);
        } else if (iVar.n() > 0) {
            this.f66049h.s(d10, iVar.n());
        } else {
            this.f66049h.q(d10, true);
        }
        this.f66049h.g();
        this.f66051j = false;
        S1();
        this.f66033a.f64692a.invoke();
        this.f66057p = true;
        j1();
    }

    @Override // b1.InterfaceC2341J.d
    public void y(C3987c c3987c) {
        if (c3987c.f44897a.isEmpty() || ((C3985a) c3987c.f44897a.get(0)).f44857a == null) {
            return;
        }
        this.f66033a.f64716y.invoke(((C3985a) c3987c.f44897a.get(0)).f44857a.toString());
    }

    public final boolean y1(r4.i iVar) {
        if (iVar == null) {
            return false;
        }
        iVar.b();
        return false;
    }

    public final boolean z1(androidx.media3.common.a aVar) {
        int i10 = aVar.f20550v;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = aVar.f20551w;
        if (i11 == -1) {
            i11 = 0;
        }
        float f10 = aVar.f20554z;
        if (f10 == -1.0f) {
            f10 = 0.0f;
        }
        String str = aVar.f20543o;
        if (str == null) {
            return true;
        }
        try {
            return AbstractC6610O.k(str, false, false).v(i10, i11, f10);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // b1.InterfaceC2341J.d
    public void c0(boolean z10) {
    }

    @Override // b1.InterfaceC2341J.d
    public void d0(AbstractC2346O abstractC2346O, int i10) {
    }
}
