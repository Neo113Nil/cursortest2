package p1;

import android.net.Uri;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.Collections;
import java.util.List;
import p1.k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f62946a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.a f62947b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3445z f62948c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62949d;

    /* renamed from: e, reason: collision with root package name */
    public final List f62950e;

    /* renamed from: f, reason: collision with root package name */
    public final List f62951f;

    /* renamed from: g, reason: collision with root package name */
    public final List f62952g;

    /* renamed from: h, reason: collision with root package name */
    public final i f62953h;

    public static class c extends j {

        /* renamed from: i, reason: collision with root package name */
        public final Uri f62955i;

        /* renamed from: j, reason: collision with root package name */
        public final long f62956j;

        /* renamed from: k, reason: collision with root package name */
        public final String f62957k;

        /* renamed from: l, reason: collision with root package name */
        public final i f62958l;

        /* renamed from: m, reason: collision with root package name */
        public final m f62959m;

        public c(long j10, androidx.media3.common.a aVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, aVar, list, eVar, list2, list3, list4);
            this.f62955i = Uri.parse(((C6032b) list.get(0)).f62896a);
            i c10 = eVar.c();
            this.f62958l = c10;
            this.f62957k = str;
            this.f62956j = j11;
            this.f62959m = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // p1.j
        public String k() {
            return this.f62957k;
        }

        @Override // p1.j
        public androidx.media3.exoplayer.dash.i l() {
            return this.f62959m;
        }

        @Override // p1.j
        public i m() {
            return this.f62958l;
        }
    }

    public static j o(long j10, androidx.media3.common.a aVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, aVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, aVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract androidx.media3.exoplayer.dash.i l();

    public abstract i m();

    public i n() {
        return this.f62953h;
    }

    public j(long j10, androidx.media3.common.a aVar, List list, k kVar, List list2, List list3, List list4) {
        AbstractC4134a.a(!list.isEmpty());
        this.f62946a = j10;
        this.f62947b = aVar;
        this.f62948c = AbstractC3445z.o(list);
        this.f62950e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f62951f = list3;
        this.f62952g = list4;
        this.f62953h = kVar.a(this);
        this.f62949d = kVar.b();
    }

    public static class b extends j implements androidx.media3.exoplayer.dash.i {

        /* renamed from: i, reason: collision with root package name */
        public final k.a f62954i;

        public b(long j10, androidx.media3.common.a aVar, List list, k.a aVar2, List list2, List list3, List list4) {
            super(j10, aVar, list, aVar2, list2, list3, list4);
            this.f62954i = aVar2;
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long a(long j10, long j11) {
            return this.f62954i.h(j10, j11);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long b(long j10) {
            return this.f62954i.j(j10);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long c(long j10, long j11) {
            return this.f62954i.d(j10, j11);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long d(long j10, long j11) {
            return this.f62954i.f(j10, j11);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public i e(long j10) {
            return this.f62954i.k(this, j10);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long f(long j10, long j11) {
            return this.f62954i.i(j10, j11);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long g(long j10) {
            return this.f62954i.g(j10);
        }

        @Override // androidx.media3.exoplayer.dash.i
        public boolean h() {
            return this.f62954i.l();
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long i() {
            return this.f62954i.e();
        }

        @Override // androidx.media3.exoplayer.dash.i
        public long j(long j10, long j11) {
            return this.f62954i.c(j10, j11);
        }

        @Override // p1.j
        public String k() {
            return null;
        }

        @Override // p1.j
        public i m() {
            return null;
        }

        @Override // p1.j
        public androidx.media3.exoplayer.dash.i l() {
            return this;
        }
    }
}
