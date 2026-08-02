package r4;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t4.C6442b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final a f63961o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f63962a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f63963b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63964c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f63966e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63967f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63968g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63969h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63970i;

    /* renamed from: l, reason: collision with root package name */
    public String f63973l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f63971j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63972k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f63974m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f63975n = 10000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(ReadableMap readableMap) {
            e eVar = new e();
            if (readableMap != null) {
                eVar.n(C6442b.b(readableMap, "hideSeekBar", false));
                eVar.d(C6442b.b(readableMap, "hideDuration", false));
                eVar.k(C6442b.b(readableMap, "hidePosition", false));
                eVar.j(C6442b.b(readableMap, "hidePlayPause", false));
                eVar.e(C6442b.b(readableMap, "hideForward", false));
                eVar.m(C6442b.b(readableMap, "hideRewind", false));
                eVar.h(C6442b.b(readableMap, "hideNext", false));
                eVar.l(C6442b.b(readableMap, "hidePrevious", false));
                eVar.f(C6442b.b(readableMap, "hideFullscreen", false));
                eVar.q(C6442b.e(readableMap, "seekIncrementMS", 10000));
                eVar.g(C6442b.b(readableMap, "hideNavigationBarOnFullScreenMode", true));
                eVar.i(C6442b.b(readableMap, "hideNotificationBarOnFullScreenMode", true));
                eVar.p(C6442b.h(readableMap, "liveLabel", null));
                eVar.o(C6442b.b(readableMap, "hideSettingButton", true));
            }
            return eVar;
        }

        public a() {
        }
    }

    public final boolean a() {
        return this.f63970i;
    }

    public final boolean b() {
        return this.f63971j;
    }

    public final boolean c() {
        return this.f63972k;
    }

    public final void d(boolean z10) {
        this.f63963b = z10;
    }

    public final void e(boolean z10) {
        this.f63966e = z10;
    }

    public final void f(boolean z10) {
        this.f63970i = z10;
    }

    public final void g(boolean z10) {
        this.f63971j = z10;
    }

    public final void h(boolean z10) {
        this.f63968g = z10;
    }

    public final void i(boolean z10) {
        this.f63972k = z10;
    }

    public final void j(boolean z10) {
        this.f63965d = z10;
    }

    public final void k(boolean z10) {
        this.f63964c = z10;
    }

    public final void l(boolean z10) {
        this.f63969h = z10;
    }

    public final void m(boolean z10) {
        this.f63967f = z10;
    }

    public final void n(boolean z10) {
        this.f63962a = z10;
    }

    public final void o(boolean z10) {
        this.f63974m = z10;
    }

    public final void p(String str) {
        this.f63973l = str;
    }

    public final void q(int i10) {
        this.f63975n = i10;
    }
}
