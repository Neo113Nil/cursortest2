package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y2 extends P2 {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final List<String> f66801t = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* renamed from: d, reason: collision with root package name */
    private Double f66803d;

    /* renamed from: e, reason: collision with root package name */
    private Double f66804e;

    /* renamed from: l, reason: collision with root package name */
    private io.sentry.protocol.r f66811l;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private List<String> f66814o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private List<String> f66815p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f66816q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private List<String> f66817r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private List<String> f66818s;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f66802c = false;

    /* renamed from: f, reason: collision with root package name */
    private a f66805f = a.MEDIUM;

    /* renamed from: g, reason: collision with root package name */
    private int f66806g = 1;

    /* renamed from: h, reason: collision with root package name */
    private long f66807h = 30000;

    /* renamed from: i, reason: collision with root package name */
    private long f66808i = 5000;

    /* renamed from: j, reason: collision with root package name */
    private long f66809j = 3600000;

    /* renamed from: k, reason: collision with root package name */
    private boolean f66810k = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f66812m = false;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private C1 f66813n = C1.PIXEL_COPY;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f7, int i11, int i12) {
            this.sizeScale = f7;
            this.bitRate = i11;
            this.screenshotQuality = i12;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public Y2(boolean z11, io.sentry.protocol.r rVar) {
        List<String> list = Collections.EMPTY_LIST;
        this.f66814o = list;
        this.f66815p = list;
        this.f66816q = true;
        List<String> list2 = f66801t;
        this.f66817r = list2;
        this.f66818s = list2;
        if (z11) {
            return;
        }
        this.f66712a.add("android.widget.TextView");
        this.f66712a.add("android.widget.ImageView");
        this.f66712a.add("android.webkit.WebView");
        this.f66712a.add("android.widget.VideoView");
        this.f66712a.add("androidx.camera.view.PreviewView");
        this.f66712a.add("androidx.media3.ui.PlayerView");
        this.f66712a.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f66712a.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f66811l = rVar;
    }

    @NotNull
    public static List<String> k() {
        return f66801t;
    }

    public final void A(boolean z11) {
        this.f66816q = z11;
    }

    public final void B(@NotNull ArrayList arrayList) {
        this.f66814o = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void C(@NotNull ArrayList arrayList) {
        this.f66815p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void D(@NotNull ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f66801t);
        linkedHashSet.addAll(arrayList);
        this.f66817r = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void E(@NotNull ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f66801t);
        linkedHashSet.addAll(arrayList);
        this.f66818s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void F(Double d11) {
        if (io.sentry.util.t.f(d11)) {
            this.f66804e = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void G(@NotNull C1 c12) {
        this.f66813n = c12;
    }

    public final void H(io.sentry.protocol.r rVar) {
        this.f66811l = rVar;
    }

    public final void I(Double d11) {
        if (io.sentry.util.t.f(d11)) {
            this.f66803d = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @Override // io.sentry.P2
    public final void d(boolean z11) {
        if (!z11) {
            f();
        }
        super.d(z11);
    }

    @Override // io.sentry.P2
    public final void e(boolean z11) {
        if (!z11) {
            f();
        }
        super.e(z11);
    }

    @Override // io.sentry.P2
    public final void f() {
        if (this.f66802c) {
            return;
        }
        this.f66802c = true;
        io.sentry.util.j.a("ReplayCustomMasking");
    }

    public final long g() {
        return this.f66807h;
    }

    public final int h() {
        return this.f66806g;
    }

    @NotNull
    public final List<String> i() {
        return this.f66814o;
    }

    @NotNull
    public final List<String> j() {
        return this.f66815p;
    }

    @NotNull
    public final List<String> l() {
        return this.f66817r;
    }

    @NotNull
    public final List<String> m() {
        return this.f66818s;
    }

    public final Double n() {
        return this.f66804e;
    }

    @NotNull
    public final a o() {
        return this.f66805f;
    }

    @NotNull
    public final C1 p() {
        return this.f66813n;
    }

    public final io.sentry.protocol.r q() {
        return this.f66811l;
    }

    public final long r() {
        return this.f66809j;
    }

    public final Double s() {
        return this.f66803d;
    }

    public final long t() {
        return this.f66808i;
    }

    public final boolean u() {
        return this.f66812m;
    }

    public final boolean v() {
        return this.f66816q;
    }

    public final boolean w() {
        Double d11 = this.f66803d;
        return d11 != null && d11.doubleValue() > 0.0d;
    }

    public final boolean x() {
        Double d11 = this.f66804e;
        return d11 != null && d11.doubleValue() > 0.0d;
    }

    public final boolean y() {
        return this.f66810k;
    }

    public final void z(boolean z11) {
        this.f66812m = z11;
    }
}
