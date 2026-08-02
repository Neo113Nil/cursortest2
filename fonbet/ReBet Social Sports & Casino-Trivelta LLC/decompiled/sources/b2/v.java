package b2;

import H1.InterfaceC1184q;
import e1.J;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public C2373c f24961a;

    /* renamed from: b, reason: collision with root package name */
    public long f24962b;

    /* renamed from: c, reason: collision with root package name */
    public long f24963c;

    /* renamed from: d, reason: collision with root package name */
    public long f24964d;

    /* renamed from: e, reason: collision with root package name */
    public int f24965e;

    /* renamed from: f, reason: collision with root package name */
    public int f24966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24967g;

    /* renamed from: h, reason: collision with root package name */
    public u f24968h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24970j;

    /* renamed from: k, reason: collision with root package name */
    public long f24971k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24972l;
    public long[] trunDataPosition = new long[0];
    public int[] trunLength = new int[0];
    public int[] sampleSizeTable = new int[0];
    public long[] samplePresentationTimesUs = new long[0];
    public boolean[] sampleIsSyncFrameTable = new boolean[0];
    public boolean[] sampleHasSubsampleEncryptionTable = new boolean[0];

    /* renamed from: i, reason: collision with root package name */
    public final J f24969i = new J();

    public void a(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.readFully(this.f24969i.f(), 0, this.f24969i.j());
        this.f24969i.b0(0);
        this.f24970j = false;
    }

    public void b(J j10) {
        j10.q(this.f24969i.f(), 0, this.f24969i.j());
        this.f24969i.b0(0);
        this.f24970j = false;
    }

    public long c(int i10) {
        return this.samplePresentationTimesUs[i10];
    }

    public void d(int i10) {
        this.f24969i.X(i10);
        this.f24967g = true;
        this.f24970j = true;
    }

    public void e(int i10, int i11) {
        this.f24965e = i10;
        this.f24966f = i11;
        if (this.trunLength.length < i10) {
            this.trunDataPosition = new long[i10];
            this.trunLength = new int[i10];
        }
        if (this.sampleSizeTable.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.sampleSizeTable = new int[i12];
            this.samplePresentationTimesUs = new long[i12];
            this.sampleIsSyncFrameTable = new boolean[i12];
            this.sampleHasSubsampleEncryptionTable = new boolean[i12];
        }
    }

    public void f() {
        this.f24965e = 0;
        this.f24971k = 0L;
        this.f24972l = false;
        this.f24967g = false;
        this.f24970j = false;
        this.f24968h = null;
    }

    public boolean g(int i10) {
        return this.f24967g && this.sampleHasSubsampleEncryptionTable[i10];
    }
}
