package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
public final class H3 extends AbstractC4842u3 {

    /* renamed from: w, reason: collision with root package name */
    public static final List f50361w = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", Constants.ACCEPT_HEADER));

    /* renamed from: f, reason: collision with root package name */
    public Double f50363f;

    /* renamed from: g, reason: collision with root package name */
    public Double f50364g;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.s f50371n;

    /* renamed from: r, reason: collision with root package name */
    public List f50375r;

    /* renamed from: s, reason: collision with root package name */
    public List f50376s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f50377t;

    /* renamed from: u, reason: collision with root package name */
    public List f50378u;

    /* renamed from: v, reason: collision with root package name */
    public List f50379v;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f50362e = false;

    /* renamed from: h, reason: collision with root package name */
    public c f50365h = c.MEDIUM;

    /* renamed from: i, reason: collision with root package name */
    public int f50366i = 1;

    /* renamed from: j, reason: collision with root package name */
    public long f50367j = 30000;

    /* renamed from: k, reason: collision with root package name */
    public long f50368k = 5000;

    /* renamed from: l, reason: collision with root package name */
    public long f50369l = 3600000;

    /* renamed from: m, reason: collision with root package name */
    public boolean f50370m = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f50372o = false;

    /* renamed from: p, reason: collision with root package name */
    public Z1 f50373p = Z1.PIXEL_COPY;

    /* renamed from: q, reason: collision with root package name */
    public boolean f50374q = false;

    public interface a {
    }

    public interface b {
    }

    public enum c {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        c(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public H3(boolean z10, io.sentry.protocol.s sVar) {
        List list = Collections.EMPTY_LIST;
        this.f50375r = list;
        this.f50376s = list;
        this.f50377t = true;
        List list2 = f50361w;
        this.f50378u = list2;
        this.f50379v = list2;
        if (z10) {
            return;
        }
        this.f52781a.add("android.widget.TextView");
        this.f52781a.add("android.widget.ImageView");
        this.f52781a.add("android.webkit.WebView");
        this.f52781a.add("android.widget.VideoView");
        this.f52781a.add("androidx.camera.view.PreviewView");
        this.f52781a.add("androidx.media3.ui.PlayerView");
        this.f52781a.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f52781a.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f50371n = sVar;
    }

    public static List H(List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static List r() {
        return f50361w;
    }

    public long A() {
        return this.f50368k;
    }

    public boolean B() {
        return this.f50374q;
    }

    public boolean C() {
        return this.f50372o;
    }

    public boolean D() {
        return this.f50377t;
    }

    public boolean E() {
        return z() != null && z().doubleValue() > 0.0d;
    }

    public boolean F() {
        return u() != null && u().doubleValue() > 0.0d;
    }

    public boolean G() {
        return this.f50370m;
    }

    public void I(boolean z10) {
        this.f50374q = z10;
    }

    public void J(boolean z10) {
        this.f50372o = z10;
    }

    public void K(boolean z10) {
        this.f50377t = z10;
    }

    public void L(List list) {
        this.f50375r = Collections.unmodifiableList(new ArrayList(list));
    }

    public void M(List list) {
        this.f50376s = Collections.unmodifiableList(new ArrayList(list));
    }

    public void N(List list) {
        this.f50378u = H(f50361w, list);
    }

    public void O(List list) {
        this.f50379v = H(f50361w, list);
    }

    public void P(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f50364g = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void Q(Z1 z12) {
        this.f50373p = z12;
    }

    public void R(io.sentry.protocol.s sVar) {
        this.f50371n = sVar;
    }

    public void S(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f50363f = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @Override // io.sentry.AbstractC4842u3
    public void a(String str) {
        k();
        super.a(str);
    }

    @Override // io.sentry.AbstractC4842u3
    public void g(boolean z10) {
        if (!z10) {
            k();
        }
        super.g(z10);
    }

    @Override // io.sentry.AbstractC4842u3
    public void h(boolean z10) {
        if (!z10) {
            k();
        }
        super.h(z10);
    }

    @Override // io.sentry.AbstractC4842u3
    public void k() {
        if (this.f50362e) {
            return;
        }
        this.f50362e = true;
        io.sentry.util.n.a("ReplayCustomMasking");
    }

    public a l() {
        return null;
    }

    public long m() {
        return this.f50367j;
    }

    public b n() {
        return null;
    }

    public int o() {
        return this.f50366i;
    }

    public List p() {
        return this.f50375r;
    }

    public List q() {
        return this.f50376s;
    }

    public List s() {
        return this.f50378u;
    }

    public List t() {
        return this.f50379v;
    }

    public Double u() {
        return this.f50364g;
    }

    public c v() {
        return this.f50365h;
    }

    public Z1 w() {
        return this.f50373p;
    }

    public io.sentry.protocol.s x() {
        return this.f50371n;
    }

    public long y() {
        return this.f50369l;
    }

    public Double z() {
        return this.f50363f;
    }
}
