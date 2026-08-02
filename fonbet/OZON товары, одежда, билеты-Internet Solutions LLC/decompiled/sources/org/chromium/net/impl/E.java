package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;
import java.util.LinkedList;
import java.util.regex.Pattern;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public abstract class E extends org.chromium.net.m {

    /* renamed from: o, reason: collision with root package name */
    static int f78801o;

    /* renamed from: a, reason: collision with root package name */
    protected final I f78802a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78803b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f78804c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList f78805d = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private final I.d f78806e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f78807f;

    /* renamed from: g, reason: collision with root package name */
    private String f78808g;

    /* renamed from: h, reason: collision with root package name */
    private String f78809h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f78810i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f78811j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f78812k;

    /* renamed from: l, reason: collision with root package name */
    private a f78813l;

    /* renamed from: m, reason: collision with root package name */
    private long f78814m;

    /* renamed from: n, reason: collision with root package name */
    private String f78815n;

    enum a {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        private final boolean mContentCacheEnabled;
        private final int mType;

        a(int i11, boolean z11) {
            this.mContentCacheEnabled = z11;
            this.mType = i11;
        }

        final int a() {
            return this.mType;
        }

        final boolean b() {
            return this.mContentCacheEnabled;
        }
    }

    /* loaded from: classes10.dex */
    public static class b {
    }

    /* loaded from: classes10.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f78816a;

        /* renamed from: b, reason: collision with root package name */
        final int f78817b;

        /* renamed from: c, reason: collision with root package name */
        final int f78818c;

        c(String str, int i11, int i12) {
            this.f78816a = str;
            this.f78817b = i11;
            this.f78818c = i12;
        }
    }

    static {
        Pattern.compile("^[0-9\\.]*$");
        f78801o = Integer.parseInt("138.0.7204.157".split("\\.")[0]) < 59 ? 3 : 36;
    }

    public E(Context context, I.d dVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.f78803b = applicationContext;
        this.f78806e = dVar;
        this.f78802a = J.a(applicationContext, dVar);
        try {
            this.f78810i = true;
            this.f78811j = true;
            this.f78812k = false;
            p(0, 0L);
            this.f78807f = true;
            A(uptimeMillis, true);
        } catch (Throwable th2) {
            A(uptimeMillis, false);
            throw th2;
        }
    }

    private void A(long j11, boolean z11) {
        I i11 = this.f78802a;
        if (f78801o >= 30) {
            return;
        }
        I.b bVar = new I.b();
        bVar.f78830e = Boolean.FALSE;
        try {
            bVar.f78827b = I.b.a.IMPL;
            bVar.f78833h = Process.myUid();
            bVar.f78832g = new I.f(ImplVersion.getCronetVersion());
            bVar.f78829d = this.f78806e;
            bVar.f78831f = new I.f("138.0.7204.157");
            bVar.f78826a = g();
            bVar.f78830e = Boolean.valueOf(z11);
        } finally {
            bVar.f78828c = (int) (SystemClock.uptimeMillis() - j11);
            i11.b(bVar);
        }
    }

    final boolean B() {
        return this.f78807f;
    }

    final LinkedList C() {
        return this.f78805d;
    }

    final boolean D() {
        return this.f78810i;
    }

    final LinkedList E() {
        return this.f78804c;
    }

    public final void F(String str) {
        this.f78815n = str;
    }

    public final void G(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f78809h = str;
    }

    public final void H(String str) {
        this.f78808g = str;
    }

    final String I() {
        return this.f78809h;
    }

    final I.a J() {
        int i11;
        int i12;
        boolean z11 = this.f78807f;
        boolean z12 = this.f78810i;
        boolean z13 = this.f78811j;
        boolean z14 = this.f78812k;
        int ordinal = this.f78813l.ordinal();
        if (ordinal != 0) {
            i11 = 3;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = 2;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    i12 = 1;
                }
                return new I.a(z11, z12, z13, z14, i12, this.f78815n, g());
            }
        } else {
            i11 = 0;
        }
        i12 = i11;
        return new I.a(z11, z12, z13, z14, i12, this.f78815n, g());
    }

    @Override // org.chromium.net.m
    public /* bridge */ /* synthetic */ org.chromium.net.m a(int i11, int i12, String str) {
        k(i11, i12, str);
        return this;
    }

    @Override // org.chromium.net.m
    public void c(boolean z11) {
        this.f78812k = z11;
    }

    @Override // org.chromium.net.m
    public org.chromium.net.m d(boolean z11) {
        this.f78811j = z11;
        return this;
    }

    @Override // org.chromium.net.m
    public /* bridge */ /* synthetic */ org.chromium.net.m e(int i11, long j11) {
        p(i11, j11);
        return this;
    }

    @Override // org.chromium.net.m
    public org.chromium.net.m f(boolean z11) {
        this.f78810i = z11;
        return this;
    }

    @Override // org.chromium.net.m
    protected long g() {
        return 0L;
    }

    @Override // org.chromium.net.m
    public org.chromium.net.m h(String str) {
        this.f78815n = str;
        return this;
    }

    @Override // org.chromium.net.m
    public /* bridge */ /* synthetic */ org.chromium.net.m i(String str) {
        G(str);
        return this;
    }

    @Override // org.chromium.net.m
    public org.chromium.net.m j(String str) {
        this.f78808g = str;
        return this;
    }

    public final void k(int i11, int i12, String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(str));
        }
        this.f78804c.add(new c(str, i11, i12));
    }

    final boolean l() {
        return this.f78812k;
    }

    final boolean m() {
        return !this.f78813l.b();
    }

    public final void n(boolean z11) {
        this.f78812k = z11;
    }

    public final void o(boolean z11) {
        this.f78811j = z11;
    }

    public final void p(int i11, long j11) {
        a aVar;
        if (i11 == 0) {
            aVar = a.DISABLED;
        } else if (i11 == 1) {
            aVar = a.MEMORY;
        } else if (i11 == 2) {
            aVar = a.DISK_NO_HTTP;
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            aVar = a.DISK;
        }
        if (aVar.a() == 1 && this.f78809h == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.f78813l = aVar;
        this.f78814m = j11;
    }

    public final void q(boolean z11) {
        this.f78810i = z11;
    }

    public final String r() {
        return this.f78815n;
    }

    final Context s() {
        return this.f78803b;
    }

    final I.d t() {
        return this.f78806e;
    }

    final String u() {
        if (!this.f78810i) {
            return "";
        }
        return this.f78803b.getPackageName() + " Cronet/" + ImplVersion.getCronetVersion();
    }

    public final String v() {
        return d0.a(this.f78803b);
    }

    final String w() {
        return this.f78808g;
    }

    final boolean x() {
        return this.f78811j;
    }

    final long y() {
        return this.f78814m;
    }

    final int z() {
        return this.f78813l.a();
    }
}
