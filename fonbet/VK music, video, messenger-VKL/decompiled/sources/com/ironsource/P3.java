package com.ironsource;

import com.facebook.soloader.MinElf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.oq;
import xsna.rq;
import xsna.sq;
import xsna.ss9;
import xsna.tq;
import xsna.uq;
import xsna.vp;
import xsna.vq;
import xsna.wq;
import xsna.wr;
import xsna.xe9;
import xsna.xq;
import xsna.zcl;
import xsna.zr;

/* loaded from: classes13.dex */
public final class P3 {
    private final c a;
    private final a b;
    private final d c;
    private final b d;

    public static final class a {
        private final g a;
        private final c b;
        private final b c;
        private final d d;

        /* renamed from: com.ironsource.P3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0204a {
            List<e> a();
        }

        public static final class b implements InterfaceC0204a {
            private final List<e> a;
            private final Integer b;
            private final Long c;
            private final c.C0207c d;
            private final Integer e;
            private final Boolean f;
            private final Long g;
            private final Boolean h;
            private final JSONObject i;
            private final Boolean j;
            private final Integer k;
            private final Integer l;
            private final Integer m;
            private final f n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final Boolean A() {
                return this.h;
            }

            public final Boolean B() {
                return this.j;
            }

            public final b a(List<e> list, Integer num, Long l, c.C0207c c0207c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                return new b(list, num, l, c0207c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            public final List<e> b() {
                return this.a;
            }

            public final Boolean c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Integer e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n);
            }

            public final Integer f() {
                return this.m;
            }

            public final f g() {
                return this.n;
            }

            public final Integer h() {
                return this.b;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C0207c c0207c = this.d;
                int hashCode4 = (hashCode3 + (c0207c == null ? 0 : c0207c.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.k;
                int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.m;
                int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.n;
                return hashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Long i() {
                return this.c;
            }

            public final c.C0207c j() {
                return this.d;
            }

            public final Integer k() {
                return this.e;
            }

            public final Boolean l() {
                return this.f;
            }

            public final Long m() {
                return this.g;
            }

            public final Boolean n() {
                return this.h;
            }

            public final JSONObject o() {
                return this.i;
            }

            public final JSONObject p() {
                return this.i;
            }

            public final Integer q() {
                return this.m;
            }

            public final Integer r() {
                return this.l;
            }

            public final Long s() {
                return this.c;
            }

            public final Integer t() {
                return this.e;
            }

            public String toString() {
                List<e> list = this.a;
                Integer num = this.b;
                Long l = this.c;
                c.C0207c c0207c = this.d;
                Integer num2 = this.e;
                Boolean bool = this.f;
                Long l2 = this.g;
                Boolean bool2 = this.h;
                JSONObject jSONObject = this.i;
                Boolean bool3 = this.j;
                Integer num3 = this.k;
                Integer num4 = this.l;
                Integer num5 = this.m;
                f fVar = this.n;
                StringBuilder sb = new StringBuilder("Banner(placements=");
                sb.append(list);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                sb.append(num);
                sb.append(", atim=");
                sb.append(l);
                sb.append(", events=");
                sb.append(c0207c);
                sb.append(", bannerInterval=");
                rq.h(sb, num2, ", collectBiddingDataAsyncEnabled=", bool, ", collectBiddingDataTimeout=");
                sb.append(l2);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", isOneFlow=");
                sb.append(bool3);
                sb.append(", delayLoadFailure=");
                sq.b(sb, num3, ", advancedLoading=", num4, ", adapterTimeOutInSeconds=");
                sb.append(num5);
                sb.append(", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            public final Boolean u() {
                return this.f;
            }

            public final Long v() {
                return this.g;
            }

            public final Integer w() {
                return this.k;
            }

            public final c.C0207c x() {
                return this.d;
            }

            public final Integer y() {
                return this.b;
            }

            public final f z() {
                return this.n;
            }

            public b(List<e> list, Integer num, Long l, c.C0207c c0207c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                this.a = list;
                this.b = num;
                this.c = l;
                this.d = c0207c;
                this.e = num2;
                this.f = bool;
                this.g = l2;
                this.h = bool2;
                this.i = jSONObject;
                this.j = bool3;
                this.k = num3;
                this.l = num4;
                this.m = num5;
                this.n = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0204a
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ b(List list, Integer num, Long l, c.C0207c c0207c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c0207c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : fVar);
            }
        }

        public static final class c implements InterfaceC0204a {
            private final List<e> a;
            private final c.C0207c b;
            private final Integer c;
            private final Integer d;
            private final Integer e;
            private final Boolean f;
            private final Long g;
            private final Boolean h;
            private final JSONObject i;
            private final Integer j;
            private final Integer k;
            private final Boolean l;
            private final Integer m;
            private final Integer n;
            private final f o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
            }

            public final Integer A() {
                return this.m;
            }

            public final f B() {
                return this.o;
            }

            public final Boolean C() {
                return this.h;
            }

            public final Boolean D() {
                return this.l;
            }

            public final c a(List<e> list, c.C0207c c0207c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                return new c(list, c0207c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            public final List<e> b() {
                return this.a;
            }

            public final Integer c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && epx.f(this.j, cVar.j) && epx.f(this.k, cVar.k) && epx.f(this.l, cVar.l) && epx.f(this.m, cVar.m) && epx.f(this.n, cVar.n) && epx.f(this.o, cVar.o);
            }

            public final Integer f() {
                return this.m;
            }

            public final Integer g() {
                return this.n;
            }

            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0207c c0207c = this.b;
                int hashCode2 = (hashCode + (c0207c == null ? 0 : c0207c.hashCode())) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.e;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.g;
                int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.k;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.m;
                int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.n;
                int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final c.C0207c i() {
                return this.b;
            }

            public final Integer j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final Integer l() {
                return this.e;
            }

            public final Boolean m() {
                return this.f;
            }

            public final Long n() {
                return this.g;
            }

            public final Boolean o() {
                return this.h;
            }

            public final JSONObject p() {
                return this.i;
            }

            public final JSONObject q() {
                return this.i;
            }

            public final Integer r() {
                return this.d;
            }

            public final Integer s() {
                return this.k;
            }

            public final Integer t() {
                return this.n;
            }

            public String toString() {
                List<e> list = this.a;
                c.C0207c c0207c = this.b;
                Integer num = this.c;
                Integer num2 = this.d;
                Integer num3 = this.e;
                Boolean bool = this.f;
                Long l = this.g;
                Boolean bool2 = this.h;
                JSONObject jSONObject = this.i;
                Integer num4 = this.j;
                Integer num5 = this.k;
                Boolean bool3 = this.l;
                Integer num6 = this.m;
                Integer num7 = this.n;
                f fVar = this.o;
                StringBuilder sb = new StringBuilder("Interstitial(placements=");
                sb.append(list);
                sb.append(", events=");
                sb.append(c0207c);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                sq.b(sb, num, ", adapterTimeOutInSeconds=", num2, ", delayLoadFailure=");
                rq.h(sb, num3, ", collectBiddingDataAsyncEnabled=", bool, ", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", expiredDurationInMinutes=");
                sb.append(num4);
                sb.append(", advancedLoading=");
                rq.h(sb, num5, ", isOneFlow=", bool3, ", parallelLoad=");
                sq.b(sb, num6, ", atim=", num7, ", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            public final Boolean u() {
                return this.f;
            }

            public final Long v() {
                return this.g;
            }

            public final Integer w() {
                return this.e;
            }

            public final c.C0207c x() {
                return this.b;
            }

            public final Integer y() {
                return this.j;
            }

            public final Integer z() {
                return this.c;
            }

            public c(List<e> list, c.C0207c c0207c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                this.a = list;
                this.b = c0207c;
                this.c = num;
                this.d = num2;
                this.e = num3;
                this.f = bool;
                this.g = l;
                this.h = bool2;
                this.i = jSONObject;
                this.j = num4;
                this.k = num5;
                this.l = bool3;
                this.m = num6;
                this.n = num7;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0204a
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ c(List list, c.C0207c c0207c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0207c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : fVar);
            }
        }

        public static final class d implements InterfaceC0204a {
            private final List<e> a;
            private final c.C0207c b;
            private final Boolean c;
            private final Long d;
            private final Boolean e;
            private final JSONObject f;
            private final Integer g;
            private final Integer h;
            private final Integer i;
            private final Integer j;
            private final Long k;
            private final f l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            public final d a(List<e> list, c.C0207c c0207c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                return new d(list, c0207c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            public final List<e> b() {
                return this.a;
            }

            public final Integer c() {
                return this.j;
            }

            public final Long d() {
                return this.k;
            }

            public final f e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i) && epx.f(this.j, dVar.j) && epx.f(this.k, dVar.k) && epx.f(this.l, dVar.l);
            }

            public final c.C0207c f() {
                return this.b;
            }

            public final Boolean g() {
                return this.c;
            }

            public final Long h() {
                return this.d;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0207c c0207c = this.b;
                int hashCode2 = (hashCode + (c0207c == null ? 0 : c0207c.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.d;
                int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.e;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f;
                int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.g;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.h;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l2 = this.k;
                int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                f fVar = this.l;
                return hashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Boolean i() {
                return this.e;
            }

            public final JSONObject j() {
                return this.f;
            }

            public final Integer k() {
                return this.g;
            }

            public final Integer l() {
                return this.h;
            }

            public final Integer m() {
                return this.i;
            }

            public final JSONObject n() {
                return this.f;
            }

            public final Integer o() {
                return this.j;
            }

            public final Integer p() {
                return this.g;
            }

            public final Long q() {
                return this.k;
            }

            public final Boolean r() {
                return this.c;
            }

            public final Long s() {
                return this.d;
            }

            public final Integer t() {
                return this.h;
            }

            public String toString() {
                List<e> list = this.a;
                c.C0207c c0207c = this.b;
                Boolean bool = this.c;
                Long l = this.d;
                Boolean bool2 = this.e;
                JSONObject jSONObject = this.f;
                Integer num = this.g;
                Integer num2 = this.h;
                Integer num3 = this.i;
                Integer num4 = this.j;
                Long l2 = this.k;
                f fVar = this.l;
                StringBuilder sb = new StringBuilder("NativeAd(placements=");
                sb.append(list);
                sb.append(", events=");
                sb.append(c0207c);
                sb.append(", collectBiddingDataAsyncEnabled=");
                sb.append(bool);
                sb.append(", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", advancedLoading=");
                sq.b(sb, num, ", delayLoadFailure=", num2, ", maxNumOfAdaptersToLoadOnStart=");
                sq.b(sb, num3, ", adapterTimeOutInSeconds=", num4, ", atim=");
                sb.append(l2);
                sb.append(", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            public final c.C0207c u() {
                return this.b;
            }

            public final Integer v() {
                return this.i;
            }

            public final f w() {
                return this.l;
            }

            public final Boolean x() {
                return this.e;
            }

            public d(List<e> list, c.C0207c c0207c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                this.a = list;
                this.b = c0207c;
                this.c = bool;
                this.d = l;
                this.e = bool2;
                this.f = jSONObject;
                this.g = num;
                this.h = num2;
                this.i = num3;
                this.j = num4;
                this.k = l2;
                this.l = fVar;
            }

            public static /* synthetic */ d a(d dVar, List list, c.C0207c c0207c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.a;
                }
                if ((i & 2) != 0) {
                    c0207c = dVar.b;
                }
                if ((i & 4) != 0) {
                    bool = dVar.c;
                }
                if ((i & 8) != 0) {
                    l = dVar.d;
                }
                if ((i & 16) != 0) {
                    bool2 = dVar.e;
                }
                if ((i & 32) != 0) {
                    jSONObject = dVar.f;
                }
                if ((i & 64) != 0) {
                    num = dVar.g;
                }
                if ((i & 128) != 0) {
                    num2 = dVar.h;
                }
                if ((i & 256) != 0) {
                    num3 = dVar.i;
                }
                if ((i & 512) != 0) {
                    num4 = dVar.j;
                }
                if ((i & 1024) != 0) {
                    l2 = dVar.k;
                }
                if ((i & 2048) != 0) {
                    fVar = dVar.l;
                }
                Long l3 = l2;
                f fVar2 = fVar;
                Integer num5 = num3;
                Integer num6 = num4;
                Integer num7 = num;
                Integer num8 = num2;
                Boolean bool3 = bool2;
                JSONObject jSONObject2 = jSONObject;
                return dVar.a(list, c0207c, bool, l, bool3, jSONObject2, num7, num8, num5, num6, l3, fVar2);
            }

            @Override // com.ironsource.P3.a.InterfaceC0204a
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ d(List list, c.C0207c c0207c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0207c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? null : fVar);
            }
        }

        public static final class e {
            private final Integer a;
            private final String b;
            private final Boolean c;
            private final String d;
            private final Integer e;
            private final Boolean f;
            private final C0205a g;
            private final b h;

            /* renamed from: com.ironsource.P3$a$e$a, reason: collision with other inner class name */
            public static final class C0205a {
                private final Boolean a;
                private final String b;
                private final Integer c;

                public C0205a() {
                    this(null, null, null, 7, null);
                }

                public final Boolean a() {
                    return this.a;
                }

                public final String b() {
                    return this.b;
                }

                public final Integer c() {
                    return this.c;
                }

                public final Boolean d() {
                    return this.a;
                }

                public final Integer e() {
                    return this.c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0205a)) {
                        return false;
                    }
                    C0205a c0205a = (C0205a) obj;
                    return epx.f(this.a, c0205a.a) && epx.f(this.b, c0205a.b) && epx.f(this.c, c0205a.c);
                }

                public final String f() {
                    return this.b;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.c;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    Boolean bool = this.a;
                    String str = this.b;
                    Integer num = this.c;
                    StringBuilder sb = new StringBuilder("Capping(enabled=");
                    sb.append(bool);
                    sb.append(", unit=");
                    sb.append(str);
                    sb.append(", maxImpressions=");
                    return oq.b(sb, num, ")");
                }

                public C0205a(Boolean bool, String str, Integer num) {
                    this.a = bool;
                    this.b = str;
                    this.c = num;
                }

                public final C0205a a(Boolean bool, String str, Integer num) {
                    return new C0205a(bool, str, num);
                }

                public static /* synthetic */ C0205a a(C0205a c0205a, Boolean bool, String str, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0205a.a;
                    }
                    if ((i & 2) != 0) {
                        str = c0205a.b;
                    }
                    if ((i & 4) != 0) {
                        num = c0205a.c;
                    }
                    return c0205a.a(bool, str, num);
                }

                public /* synthetic */ C0205a(Boolean bool, String str, Integer num, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }
            }

            public static final class b {
                private final Boolean a;
                private final Integer b;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final Boolean a() {
                    return this.a;
                }

                public final Integer b() {
                    return this.b;
                }

                public final Boolean c() {
                    return this.a;
                }

                public final Integer d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    return hashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Pacing(enabled=" + this.a + ", numOfSeconds=" + this.b + ")";
                }

                public b(Boolean bool, Integer num) {
                    this.a = bool;
                    this.b = num;
                }

                public final b a(Boolean bool, Integer num) {
                    return new b(bool, num);
                }

                public /* synthetic */ b(Boolean bool, Integer num, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                public static /* synthetic */ b a(b bVar, Boolean bool, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.a;
                    }
                    if ((i & 2) != 0) {
                        num = bVar.b;
                    }
                    return bVar.a(bool, num);
                }
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final Integer a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final String d() {
                return this.d;
            }

            public final Integer e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g) && epx.f(this.h, eVar.h);
            }

            public final Boolean f() {
                return this.f;
            }

            public final C0205a g() {
                return this.g;
            }

            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0205a c0205a = this.g;
                int hashCode7 = (hashCode6 + (c0205a == null ? 0 : c0205a.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final C0205a i() {
                return this.g;
            }

            public final Boolean j() {
                return this.f;
            }

            public final b k() {
                return this.h;
            }

            public final Integer l() {
                return this.a;
            }

            public final String m() {
                return this.b;
            }

            public final Integer n() {
                return this.e;
            }

            public final String o() {
                return this.d;
            }

            public final Boolean p() {
                return this.c;
            }

            public String toString() {
                Integer num = this.a;
                String str = this.b;
                Boolean bool = this.c;
                String str2 = this.d;
                Integer num2 = this.e;
                Boolean bool2 = this.f;
                C0205a c0205a = this.g;
                b bVar = this.h;
                StringBuilder sb = new StringBuilder("Placement(placementId=");
                sb.append(num);
                sb.append(", placementName=");
                sb.append(str);
                sb.append(", isDefault=");
                xsna.l4.i(bool, ", virtualItemName=", str2, ", virtualItemCount=", sb);
                rq.h(sb, num2, ", delivery=", bool2, ", capping=");
                sb.append(c0205a);
                sb.append(", pacing=");
                sb.append(bVar);
                sb.append(")");
                return sb.toString();
            }

            public e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0205a c0205a, b bVar) {
                this.a = num;
                this.b = str;
                this.c = bool;
                this.d = str2;
                this.e = num2;
                this.f = bool2;
                this.g = c0205a;
                this.h = bVar;
            }

            public final e a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0205a c0205a, b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c0205a, bVar);
            }

            public static /* synthetic */ e a(e eVar, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0205a c0205a, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.a;
                }
                if ((i & 2) != 0) {
                    str = eVar.b;
                }
                if ((i & 4) != 0) {
                    bool = eVar.c;
                }
                if ((i & 8) != 0) {
                    str2 = eVar.d;
                }
                if ((i & 16) != 0) {
                    num2 = eVar.e;
                }
                if ((i & 32) != 0) {
                    bool2 = eVar.f;
                }
                if ((i & 64) != 0) {
                    c0205a = eVar.g;
                }
                if ((i & 128) != 0) {
                    bVar = eVar.h;
                }
                C0205a c0205a2 = c0205a;
                b bVar2 = bVar;
                Integer num3 = num2;
                Boolean bool3 = bool2;
                return eVar.a(num, str, bool, str2, num3, bool3, c0205a2, bVar2);
            }

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0205a c0205a, b bVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c0205a, (i & 128) != 0 ? null : bVar);
            }
        }

        public static final class f {
            private final Boolean a;
            private final Boolean b;

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final Boolean a() {
                return this.a;
            }

            public final Boolean b() {
                return this.b;
            }

            public final Boolean c() {
                return this.a;
            }

            public final Boolean d() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                return "Providers(parallelInit=" + this.a + ", waitUntilAllProvidersFinishInit=" + this.b + ")";
            }

            public f(Boolean bool, Boolean bool2) {
                this.a = bool;
                this.b = bool2;
            }

            public final f a(Boolean bool, Boolean bool2) {
                return new f(bool, bool2);
            }

            public static /* synthetic */ f a(f fVar, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.b;
                }
                return fVar.a(bool, bool2);
            }

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }
        }

        public static final class g implements InterfaceC0204a {
            private final List<e> a;
            private final Integer b;
            private final Integer c;
            private final Integer d;
            private final Integer e;
            private final Integer f;
            private final Boolean g;
            private final Long h;
            private final Boolean i;
            private final JSONObject j;
            private final Integer k;
            private final Boolean l;
            private final Integer m;
            private final Integer n;
            private final f o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
            }

            public final Integer A() {
                return this.m;
            }

            public final f B() {
                return this.o;
            }

            public final Boolean C() {
                return this.i;
            }

            public final Boolean D() {
                return this.l;
            }

            public final g a(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            public final List<e> b() {
                return this.a;
            }

            public final JSONObject c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f) && epx.f(this.g, gVar.g) && epx.f(this.h, gVar.h) && epx.f(this.i, gVar.i) && epx.f(this.j, gVar.j) && epx.f(this.k, gVar.k) && epx.f(this.l, gVar.l) && epx.f(this.m, gVar.m) && epx.f(this.n, gVar.n) && epx.f(this.o, gVar.o);
            }

            public final Integer f() {
                return this.m;
            }

            public final Integer g() {
                return this.n;
            }

            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.e;
                int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f;
                int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.h;
                int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.i;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.j;
                int hashCode10 = (hashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.k;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.m;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.n;
                int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Integer i() {
                return this.b;
            }

            public final Integer j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final Integer l() {
                return this.e;
            }

            public final Integer m() {
                return this.f;
            }

            public final Boolean n() {
                return this.g;
            }

            public final Long o() {
                return this.h;
            }

            public final Boolean p() {
                return this.i;
            }

            public final JSONObject q() {
                return this.j;
            }

            public final Integer r() {
                return this.c;
            }

            public final Integer s() {
                return this.e;
            }

            public final Integer t() {
                return this.n;
            }

            public String toString() {
                List<e> list = this.a;
                Integer num = this.b;
                Integer num2 = this.c;
                Integer num3 = this.d;
                Integer num4 = this.e;
                Integer num5 = this.f;
                Boolean bool = this.g;
                Long l = this.h;
                Boolean bool2 = this.i;
                JSONObject jSONObject = this.j;
                Integer num6 = this.k;
                Boolean bool3 = this.l;
                Integer num7 = this.m;
                Integer num8 = this.n;
                f fVar = this.o;
                StringBuilder sb = new StringBuilder("Rewarded(placements=");
                sb.append(list);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                sb.append(num);
                sb.append(", adapterTimeOutInSeconds=");
                sq.b(sb, num2, ", loadRVInterval=", num3, ", advancedLoading=");
                sq.b(sb, num4, ", expiredDurationInMinutes=", num5, ", collectBiddingDataAsyncEnabled=");
                sb.append(bool);
                sb.append(", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", delayLoadFailure=");
                rq.h(sb, num6, ", isOneFlow=", bool3, ", parallelLoad=");
                sq.b(sb, num7, ", atim=", num8, ", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            public final Boolean u() {
                return this.g;
            }

            public final Long v() {
                return this.h;
            }

            public final Integer w() {
                return this.k;
            }

            public final Integer x() {
                return this.f;
            }

            public final Integer y() {
                return this.d;
            }

            public final Integer z() {
                return this.b;
            }

            public g(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                this.a = list;
                this.b = num;
                this.c = num2;
                this.d = num3;
                this.e = num4;
                this.f = num5;
                this.g = bool;
                this.h = l;
                this.i = bool2;
                this.j = jSONObject;
                this.k = num6;
                this.l = bool3;
                this.m = num7;
                this.n = num8;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0204a
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) != 0 ? null : fVar);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final g a() {
            return this.a;
        }

        public final c b() {
            return this.b;
        }

        public final b c() {
            return this.c;
        }

        public final d d() {
            return this.d;
        }

        public final b e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final c f() {
            return this.b;
        }

        public final d g() {
            return this.d;
        }

        public final g h() {
            return this.a;
        }

        public int hashCode() {
            g gVar = this.a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(g gVar, c cVar, b bVar, d dVar) {
            this.a = gVar;
            this.b = cVar;
            this.c = bVar;
            this.d = dVar;
        }

        public final a a(g gVar, c cVar, b bVar, d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        public static /* synthetic */ a a(a aVar, g gVar, c cVar, b bVar, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.b;
            }
            if ((i & 4) != 0) {
                bVar = aVar.c;
            }
            if ((i & 8) != 0) {
                dVar = aVar.d;
            }
            return aVar.a(gVar, cVar, bVar, dVar);
        }

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }
    }

    public static final class b {
        private final Integer a;
        private final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.b;
        }

        public final Integer d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AdQuality(initMode=" + this.a + ", adqInitBlob=" + this.b + ")";
        }

        public b(Integer num, String str) {
            this.a = num;
            this.b = str;
        }

        public final b a(Integer num, String str) {
            return new b(num, str);
        }

        public /* synthetic */ b(Integer num, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ b a(b bVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(num, str);
        }
    }

    public static final class c {
        private final e a;
        private final C0207c b;
        private final h c;
        private final f d;
        private final a e;
        private final b f;
        private final g g;
        private final d h;
        private final Boolean i;
        private final Boolean j;

        public static final class a {
            private final String a;
            private final String b;
            private final String c;
            private final Integer d;
            private final Long e;
            private final Integer f;
            private final Boolean g;
            private final Boolean h;
            private final Integer i;
            private final Boolean j;
            private final C0206a k;
            private final C0206a l;
            private final C0206a m;
            private final C0206a n;

            /* renamed from: com.ironsource.P3$c$a$a, reason: collision with other inner class name */
            public static final class C0206a {
                private final Boolean a;
                private final Integer b;
                private final Boolean c;
                private final Integer d;
                private final Integer e;
                private final Boolean f;
                private final Boolean g;
                private final Integer h;
                private final Integer i;
                private final Boolean j;

                public C0206a() {
                    this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
                }

                public final Boolean a() {
                    return this.a;
                }

                public final Boolean b() {
                    return this.j;
                }

                public final Integer c() {
                    return this.b;
                }

                public final Boolean d() {
                    return this.c;
                }

                public final Integer e() {
                    return this.d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0206a)) {
                        return false;
                    }
                    C0206a c0206a = (C0206a) obj;
                    return epx.f(this.a, c0206a.a) && epx.f(this.b, c0206a.b) && epx.f(this.c, c0206a.c) && epx.f(this.d, c0206a.d) && epx.f(this.e, c0206a.e) && epx.f(this.f, c0206a.f) && epx.f(this.g, c0206a.g) && epx.f(this.h, c0206a.h) && epx.f(this.i, c0206a.i) && epx.f(this.j, c0206a.j);
                }

                public final Integer f() {
                    return this.e;
                }

                public final Boolean g() {
                    return this.f;
                }

                public final Boolean h() {
                    return this.g;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.c;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.d;
                    int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.e;
                    int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f;
                    int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.g;
                    int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.h;
                    int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.i;
                    int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.j;
                    return hashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                public final Integer i() {
                    return this.h;
                }

                public final Integer j() {
                    return this.i;
                }

                public final Integer k() {
                    return this.d;
                }

                public final Boolean l() {
                    return this.j;
                }

                public final Integer m() {
                    return this.b;
                }

                public final Boolean n() {
                    return this.c;
                }

                public final Boolean o() {
                    return this.a;
                }

                public final Integer p() {
                    return this.h;
                }

                public final Integer q() {
                    return this.e;
                }

                public final Integer r() {
                    return this.i;
                }

                public final Boolean s() {
                    return this.f;
                }

                public final Boolean t() {
                    return this.g;
                }

                public String toString() {
                    Boolean bool = this.a;
                    Integer num = this.b;
                    Boolean bool2 = this.c;
                    Integer num2 = this.d;
                    Integer num3 = this.e;
                    Boolean bool3 = this.f;
                    Boolean bool4 = this.g;
                    Integer num4 = this.h;
                    Integer num5 = this.i;
                    Boolean bool5 = this.j;
                    StringBuilder sb = new StringBuilder("AdFormatAuction(programmatic=");
                    sb.append(bool);
                    sb.append(", minTimeBeforeFirstAuction=");
                    sb.append(num);
                    sb.append(", objectPerWaterfall=");
                    sb.append(bool2);
                    sb.append(", auctionRetryInterval=");
                    sb.append(num2);
                    sb.append(", timeToWaitBeforeAuction=");
                    rq.h(sb, num3, ", isAuctionOnShowStart=", bool3, ", isLoadWhileShow=");
                    sb.append(bool4);
                    sb.append(", timeToDeleteOldWaterfallAfterAuction=");
                    sb.append(num4);
                    sb.append(", timeToWaitBeforeLoad=");
                    sb.append(num5);
                    sb.append(", enableAuctionFallback=");
                    sb.append(bool5);
                    sb.append(")");
                    return sb.toString();
                }

                public C0206a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    this.a = bool;
                    this.b = num;
                    this.c = bool2;
                    this.d = num2;
                    this.e = num3;
                    this.f = bool3;
                    this.g = bool4;
                    this.h = num4;
                    this.i = num5;
                    this.j = bool5;
                }

                public final C0206a a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    return new C0206a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                public static /* synthetic */ C0206a a(C0206a c0206a, Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0206a.a;
                    }
                    if ((i & 2) != 0) {
                        num = c0206a.b;
                    }
                    if ((i & 4) != 0) {
                        bool2 = c0206a.c;
                    }
                    if ((i & 8) != 0) {
                        num2 = c0206a.d;
                    }
                    if ((i & 16) != 0) {
                        num3 = c0206a.e;
                    }
                    if ((i & 32) != 0) {
                        bool3 = c0206a.f;
                    }
                    if ((i & 64) != 0) {
                        bool4 = c0206a.g;
                    }
                    if ((i & 128) != 0) {
                        num4 = c0206a.h;
                    }
                    if ((i & 256) != 0) {
                        num5 = c0206a.i;
                    }
                    if ((i & 512) != 0) {
                        bool5 = c0206a.j;
                    }
                    Integer num6 = num5;
                    Boolean bool6 = bool5;
                    Boolean bool7 = bool4;
                    Integer num7 = num4;
                    Integer num8 = num3;
                    Boolean bool8 = bool3;
                    return c0206a.a(bool, num, bool2, num2, num8, bool8, bool7, num7, num6, bool6);
                }

                public /* synthetic */ C0206a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : bool5);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final C0206a A() {
                return this.k;
            }

            public final Boolean B() {
                return this.j;
            }

            public final String a() {
                return this.a;
            }

            public final Boolean b() {
                return this.j;
            }

            public final C0206a c() {
                return this.k;
            }

            public final C0206a d() {
                return this.l;
            }

            public final C0206a e() {
                return this.m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n);
            }

            public final C0206a f() {
                return this.n;
            }

            public final String g() {
                return this.b;
            }

            public final String h() {
                return this.c;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.e;
                int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C0206a c0206a = this.k;
                int hashCode11 = (hashCode10 + (c0206a == null ? 0 : c0206a.hashCode())) * 31;
                C0206a c0206a2 = this.l;
                int hashCode12 = (hashCode11 + (c0206a2 == null ? 0 : c0206a2.hashCode())) * 31;
                C0206a c0206a3 = this.m;
                int hashCode13 = (hashCode12 + (c0206a3 == null ? 0 : c0206a3.hashCode())) * 31;
                C0206a c0206a4 = this.n;
                return hashCode13 + (c0206a4 != null ? c0206a4.hashCode() : 0);
            }

            public final Integer i() {
                return this.d;
            }

            public final Long j() {
                return this.e;
            }

            public final Integer k() {
                return this.f;
            }

            public final Boolean l() {
                return this.g;
            }

            public final Boolean m() {
                return this.h;
            }

            public final Integer n() {
                return this.i;
            }

            public final String o() {
                return this.a;
            }

            public final Integer p() {
                return this.f;
            }

            public final Long q() {
                return this.e;
            }

            public final Integer r() {
                return this.d;
            }

            public final String s() {
                return this.b;
            }

            public final C0206a t() {
                return this.m;
            }

            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                Integer num = this.d;
                Long l = this.e;
                Integer num2 = this.f;
                Boolean bool = this.g;
                Boolean bool2 = this.h;
                Integer num3 = this.i;
                Boolean bool3 = this.j;
                C0206a c0206a = this.k;
                C0206a c0206a2 = this.l;
                C0206a c0206a3 = this.m;
                C0206a c0206a4 = this.n;
                StringBuilder a = xe9.a("Auction(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
                kr.b(num, str3, ", auctionTrials=", ", auctionTimeout=", a);
                a.append(l);
                a.append(", auctionSavedHistory=");
                a.append(num2);
                a.append(", compressAuctionRequest=");
                tq.i(a, bool, ", compressAuctionResponse=", bool2, ", encryptionVersion=");
                rq.h(a, num3, ", tokenPerAdapter=", bool3, ", rewarded=");
                a.append(c0206a);
                a.append(", interstitial=");
                a.append(c0206a2);
                a.append(", banner=");
                a.append(c0206a3);
                a.append(", nativeAd=");
                a.append(c0206a4);
                a.append(")");
                return a.toString();
            }

            public final Boolean u() {
                return this.g;
            }

            public final Boolean v() {
                return this.h;
            }

            public final Integer w() {
                return this.i;
            }

            public final String x() {
                return this.c;
            }

            public final C0206a y() {
                return this.l;
            }

            public final C0206a z() {
                return this.n;
            }

            public a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0206a c0206a, C0206a c0206a2, C0206a c0206a3, C0206a c0206a4) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = num;
                this.e = l;
                this.f = num2;
                this.g = bool;
                this.h = bool2;
                this.i = num3;
                this.j = bool3;
                this.k = c0206a;
                this.l = c0206a2;
                this.m = c0206a3;
                this.n = c0206a4;
            }

            public final a a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0206a c0206a, C0206a c0206a2, C0206a c0206a3, C0206a c0206a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0206a, c0206a2, c0206a3, c0206a4);
            }

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0206a c0206a, C0206a c0206a2, C0206a c0206a3, C0206a c0206a4, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c0206a, (i & 2048) != 0 ? null : c0206a2, (i & 4096) != 0 ? null : c0206a3, (i & 8192) != 0 ? null : c0206a4);
            }
        }

        public static final class b {
            private final Boolean a;
            private final String b;
            private final String c;
            private final Boolean d;
            private final Integer e;
            private final Boolean f;
            private final List<String> g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public final Boolean a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Integer e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
            }

            public final Boolean f() {
                return this.f;
            }

            public final List<String> g() {
                return this.g;
            }

            public final Boolean h() {
                return this.a;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.g;
                return hashCode6 + (list != null ? list.hashCode() : 0);
            }

            public final Boolean i() {
                return this.d;
            }

            public final List<String> j() {
                return this.g;
            }

            public final String k() {
                return this.c;
            }

            public final String l() {
                return this.b;
            }

            public final Boolean m() {
                return this.f;
            }

            public final Integer n() {
                return this.e;
            }

            public String toString() {
                Boolean bool = this.a;
                String str = this.b;
                String str2 = this.c;
                Boolean bool2 = this.d;
                Integer num = this.e;
                Boolean bool3 = this.f;
                List<String> list = this.g;
                StringBuilder sb = new StringBuilder("CrashReporter(enabled=");
                sb.append(bool);
                sb.append(", reporterURL=");
                sb.append(str);
                sb.append(", reporterKeyword=");
                uq.c(bool2, str2, ", includeANR=", ", timeout=", sb);
                rq.h(sb, num, ", setIgnoreDebugger=", bool3, ", keysToInclude=");
                return vp.b(")", sb, list);
            }

            public b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                this.a = bool;
                this.b = str;
                this.c = str2;
                this.d = bool2;
                this.e = num;
                this.f = bool3;
                this.g = list;
            }

            public final b a(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            public static /* synthetic */ b a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.a;
                }
                if ((i & 2) != 0) {
                    str = bVar.b;
                }
                if ((i & 4) != 0) {
                    str2 = bVar.c;
                }
                if ((i & 8) != 0) {
                    bool2 = bVar.d;
                }
                if ((i & 16) != 0) {
                    num = bVar.e;
                }
                if ((i & 32) != 0) {
                    bool3 = bVar.f;
                }
                if ((i & 64) != 0) {
                    list = bVar.g;
                }
                Boolean bool4 = bool3;
                List list2 = list;
                Integer num2 = num;
                String str3 = str2;
                return bVar.a(bool, str, str3, bool2, num2, bool4, list2);
            }

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }
        }

        /* renamed from: com.ironsource.P3$c$c, reason: collision with other inner class name */
        public static final class C0207c {
            private final Boolean a;
            private final Boolean b;
            private final Boolean c;
            private final Integer d;
            private final String e;
            private final String f;
            private final Integer g;
            private final Integer h;
            private final Integer i;
            private final List<Integer> j;
            private final List<Integer> k;
            private final List<Integer> l;
            private final List<Integer> m;
            private final JSONObject n;
            private final a o;
            private final String p;

            /* renamed from: com.ironsource.P3$c$c$a */
            public static final class a {
                private final String a;
                private final Boolean b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.a;
                }

                public final Boolean b() {
                    return this.b;
                }

                public final Boolean c() {
                    return this.b;
                }

                public final String d() {
                    return this.a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.b;
                    return hashCode + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.a + ", pixelEventsEnabled=" + this.b + ")";
                }

                public a(String str, Boolean bool) {
                    this.a = str;
                    this.b = bool;
                }

                public final a a(String str, Boolean bool) {
                    return new a(str, bool);
                }

                public /* synthetic */ a(String str, Boolean bool, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ a a(a aVar, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.b;
                    }
                    return aVar.a(str, bool);
                }
            }

            public C0207c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
            }

            public final a A() {
                return this.o;
            }

            public final Boolean B() {
                return this.b;
            }

            public final Boolean C() {
                return this.a;
            }

            public final String D() {
                return this.f;
            }

            public final String E() {
                return this.e;
            }

            public final List<Integer> F() {
                return this.l;
            }

            public final Boolean a() {
                return this.a;
            }

            public final List<Integer> b() {
                return this.j;
            }

            public final List<Integer> c() {
                return this.k;
            }

            public final List<Integer> d() {
                return this.l;
            }

            public final List<Integer> e() {
                return this.m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0207c)) {
                    return false;
                }
                C0207c c0207c = (C0207c) obj;
                return epx.f(this.a, c0207c.a) && epx.f(this.b, c0207c.b) && epx.f(this.c, c0207c.c) && epx.f(this.d, c0207c.d) && epx.f(this.e, c0207c.e) && epx.f(this.f, c0207c.f) && epx.f(this.g, c0207c.g) && epx.f(this.h, c0207c.h) && epx.f(this.i, c0207c.i) && epx.f(this.j, c0207c.j) && epx.f(this.k, c0207c.k) && epx.f(this.l, c0207c.l) && epx.f(this.m, c0207c.m) && epx.f(this.n, c0207c.n) && epx.f(this.o, c0207c.o) && epx.f(this.p, c0207c.p);
            }

            public final JSONObject f() {
                return this.n;
            }

            public final a g() {
                return this.o;
            }

            public final String h() {
                return this.p;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.e;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.g;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.h;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.i;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.j;
                int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.k;
                int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.l;
                int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.m;
                int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.n;
                int hashCode14 = (hashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.o;
                int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.p;
                return hashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            public final Boolean i() {
                return this.b;
            }

            public final Boolean j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final String l() {
                return this.e;
            }

            public final String m() {
                return this.f;
            }

            public final Integer n() {
                return this.g;
            }

            public final Integer o() {
                return this.h;
            }

            public final Integer p() {
                return this.i;
            }

            public final String q() {
                return this.p;
            }

            public final Integer r() {
                return this.g;
            }

            public final Boolean s() {
                return this.c;
            }

            public final Integer t() {
                return this.d;
            }

            public String toString() {
                Boolean bool = this.a;
                Boolean bool2 = this.b;
                Boolean bool3 = this.c;
                Integer num = this.d;
                String str = this.e;
                String str2 = this.f;
                Integer num2 = this.g;
                Integer num3 = this.h;
                Integer num4 = this.i;
                List<Integer> list = this.j;
                List<Integer> list2 = this.k;
                List<Integer> list3 = this.l;
                List<Integer> list4 = this.m;
                JSONObject jSONObject = this.n;
                a aVar = this.o;
                String str3 = this.p;
                StringBuilder sb = new StringBuilder("Events(sendUltraEvents=");
                sb.append(bool);
                sb.append(", sendEventsToggle=");
                sb.append(bool2);
                sb.append(", eventsCompression=");
                sb.append(bool3);
                sb.append(", eventsCompressionLevel=");
                sb.append(num);
                sb.append(", serverEventsURL=");
                n6j.b(sb, str, ", serverEventsType=", str2, ", backupThreshold=");
                sq.b(sb, num2, ", maxNumberOfEvents=", num3, ", maxEventsPerBatch=");
                sb.append(num4);
                sb.append(", optOut=");
                sb.append(list);
                sb.append(", optIn=");
                vq.d(sb, list2, ", triggerEvents=", list3, ", nonConnectivityEvents=");
                sb.append(list4);
                sb.append(", genericParams=");
                sb.append(jSONObject);
                sb.append(", pixel=");
                sb.append(aVar);
                sb.append(", abt=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final JSONObject u() {
                return this.n;
            }

            public final Integer v() {
                return this.i;
            }

            public final Integer w() {
                return this.h;
            }

            public final List<Integer> x() {
                return this.m;
            }

            public final List<Integer> y() {
                return this.k;
            }

            public final List<Integer> z() {
                return this.j;
            }

            public C0207c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                this.a = bool;
                this.b = bool2;
                this.c = bool3;
                this.d = num;
                this.e = str;
                this.f = str2;
                this.g = num2;
                this.h = num3;
                this.i = num4;
                this.j = list;
                this.k = list2;
                this.l = list3;
                this.m = list4;
                this.n = jSONObject;
                this.o = aVar;
                this.p = str3;
            }

            public final C0207c a(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                return new C0207c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            public /* synthetic */ C0207c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }
        }

        public static final class d {
            private final Map<String, String> a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final Map<String, String> a() {
                return this.a;
            }

            public final Map<String, String> b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public int hashCode() {
                Map<String, String> map = this.a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "External(mediationTypes=" + this.a + ")";
            }

            public d(Map<String, String> map) {
                this.a = map;
            }

            public final d a(Map<String, String> map) {
                return new d(map);
            }

            public /* synthetic */ d(Map map, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.a;
                }
                return dVar.a(map);
            }
        }

        public static final class e {
            private final Integer a;
            private final Integer b;
            private final Integer c;
            private final Boolean d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            public final Integer a() {
                return this.a;
            }

            public final Integer b() {
                return this.b;
            }

            public final Integer c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Integer e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
            }

            public final Integer f() {
                return this.b;
            }

            public final Integer g() {
                return this.a;
            }

            public final Boolean h() {
                return this.d;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.d;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                Integer num = this.a;
                Integer num2 = this.b;
                Integer num3 = this.c;
                Boolean bool = this.d;
                StringBuilder a = wr.a(num, "Loggers(server=", num2, ", publisher=", ", console=");
                a.append(num3);
                a.append(", shouldSendPublisherLogsOnUIThread=");
                a.append(bool);
                a.append(")");
                return a.toString();
            }

            public e(Integer num, Integer num2, Integer num3, Boolean bool) {
                this.a = num;
                this.b = num2;
                this.c = num3;
                this.d = bool;
            }

            public final e a(Integer num, Integer num2, Integer num3, Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            public static /* synthetic */ e a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.a;
                }
                if ((i & 2) != 0) {
                    num2 = eVar.b;
                }
                if ((i & 4) != 0) {
                    num3 = eVar.c;
                }
                if ((i & 8) != 0) {
                    bool = eVar.d;
                }
                return eVar.a(num, num2, num3, bool);
            }

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }
        }

        public static final class f {
            private final String a;
            private final String b;
            private final JSONObject c;

            public f() {
                this(null, null, null, 7, null);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final JSONObject c() {
                return this.c;
            }

            public final JSONObject d() {
                return this.c;
            }

            public final String e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final String f() {
                return this.a;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.c;
                return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            public String toString() {
                String str = this.a;
                String str2 = this.b;
                JSONObject jSONObject = this.c;
                StringBuilder a = xe9.a("Segment(name=", str, ", id=", str2, ", custom=");
                a.append(jSONObject);
                a.append(")");
                return a.toString();
            }

            public f(String str, String str2, JSONObject jSONObject) {
                this.a = str;
                this.b = str2;
                this.c = jSONObject;
            }

            public final f a(String str, String str2, JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            public static /* synthetic */ f a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }
        }

        public static final class g {
            private final Boolean a;
            private final a b;
            private final Boolean c;
            private final C0208c d;
            private final List<String> e;
            private final Integer f;
            private final Boolean g;
            private final b h;

            public static final class a {
                private final String a;
                private final String b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.a;
                }

                public final String b() {
                    return this.b;
                }

                public final String c() {
                    return this.b;
                }

                public final String d() {
                    return this.a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return ss9.a("ConsentView(pre=", this.a, ", post=", this.b, ")");
                }

                public a(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final a a(String str, String str2) {
                    return new a(str, str2);
                }

                public /* synthetic */ a(String str, String str2, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ a a(a aVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.b;
                    }
                    return aVar.a(str, str2);
                }
            }

            public static final class b {
                private final JSONObject a;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final JSONObject a() {
                    return this.a;
                }

                public final JSONObject b() {
                    return this.a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                public String toString() {
                    return "EpConfig(traits=" + this.a + ")";
                }

                public b(JSONObject jSONObject) {
                    this.a = jSONObject;
                }

                public final b a(JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                public /* synthetic */ b(JSONObject jSONObject, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ b a(b bVar, JSONObject jSONObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.a;
                    }
                    return bVar.a(jSONObject);
                }
            }

            /* renamed from: com.ironsource.P3$c$g$c, reason: collision with other inner class name */
            public static final class C0208c {
                private final Map<String, a> a;

                /* renamed from: com.ironsource.P3$c$g$c$a */
                public static final class a {
                    private final List<String> a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    public final List<String> a() {
                        return this.a;
                    }

                    public final List<String> b() {
                        return this.a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                    }

                    public int hashCode() {
                        List<String> list = this.a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    public String toString() {
                        return wq.c("Provider(skanIds=", ")", this.a);
                    }

                    public a(List<String> list) {
                        this.a = list;
                    }

                    public final a a(List<String> list) {
                        return new a(list);
                    }

                    public /* synthetic */ a(List list, int i, zcl zclVar) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ a a(a aVar, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.a;
                        }
                        return aVar.a(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0208c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final Map<String, a> a() {
                    return this.a;
                }

                public final Map<String, a> b() {
                    return this.a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0208c) && epx.f(this.a, ((C0208c) obj).a);
                }

                public int hashCode() {
                    Map<String, a> map = this.a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                public String toString() {
                    return "Skd(providers=" + this.a + ")";
                }

                public C0208c(Map<String, a> map) {
                    this.a = map;
                }

                public final C0208c a(Map<String, a> map) {
                    return new C0208c(map);
                }

                public /* synthetic */ C0208c(Map map, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ C0208c a(C0208c c0208c, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = c0208c.a;
                    }
                    return c0208c.a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final Boolean a() {
                return this.a;
            }

            public final a b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final C0208c d() {
                return this.d;
            }

            public final List<String> e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f) && epx.f(this.g, gVar.g) && epx.f(this.h, gVar.h);
            }

            public final Integer f() {
                return this.f;
            }

            public final Boolean g() {
                return this.g;
            }

            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.b;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.c;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0208c c0208c = this.d;
                int hashCode4 = (hashCode3 + (c0208c == null ? 0 : c0208c.hashCode())) * 31;
                List<String> list = this.e;
                int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.g;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final a i() {
                return this.b;
            }

            public final b j() {
                return this.h;
            }

            public final List<String> k() {
                return this.e;
            }

            public final Boolean l() {
                return this.c;
            }

            public final Boolean m() {
                return this.g;
            }

            public final Boolean n() {
                return this.a;
            }

            public final C0208c o() {
                return this.d;
            }

            public final Integer p() {
                return this.f;
            }

            public String toString() {
                return "Settings(sid=" + this.a + ", consentView=" + this.b + ", passAdditionalContextualSignals=" + this.c + ", skd=" + this.d + ", isp=" + this.e + ", uaeh=" + this.f + ", sharedThreadPool=" + this.g + ", epConfig=" + this.h + ")";
            }

            public g(Boolean bool, a aVar, Boolean bool2, C0208c c0208c, List<String> list, Integer num, Boolean bool3, b bVar) {
                this.a = bool;
                this.b = aVar;
                this.c = bool2;
                this.d = c0208c;
                this.e = list;
                this.f = num;
                this.g = bool3;
                this.h = bVar;
            }

            public final g a(Boolean bool, a aVar, Boolean bool2, C0208c c0208c, List<String> list, Integer num, Boolean bool3, b bVar) {
                return new g(bool, aVar, bool2, c0208c, list, num, bool3, bVar);
            }

            public static /* synthetic */ g a(g gVar, Boolean bool, a aVar, Boolean bool2, C0208c c0208c, List list, Integer num, Boolean bool3, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = gVar.a;
                }
                if ((i & 2) != 0) {
                    aVar = gVar.b;
                }
                if ((i & 4) != 0) {
                    bool2 = gVar.c;
                }
                if ((i & 8) != 0) {
                    c0208c = gVar.d;
                }
                if ((i & 16) != 0) {
                    list = gVar.e;
                }
                if ((i & 32) != 0) {
                    num = gVar.f;
                }
                if ((i & 64) != 0) {
                    bool3 = gVar.g;
                }
                if ((i & 128) != 0) {
                    bVar = gVar.h;
                }
                Boolean bool4 = bool3;
                b bVar2 = bVar;
                List list2 = list;
                Integer num2 = num;
                return gVar.a(bool, aVar, bool2, c0208c, list2, num2, bool4, bVar2);
            }

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C0208c c0208c, List list, Integer num, Boolean bool3, b bVar, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c0208c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bVar);
            }
        }

        public static final class h {
            private final List<String> a;
            private final JSONObject b;
            private final Boolean c;
            private final Boolean d;
            private final Boolean e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            public final List<String> a() {
                return this.a;
            }

            public final JSONObject b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Boolean e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d) && epx.f(this.e, hVar.e);
            }

            public final Boolean f() {
                return this.d;
            }

            public final Boolean g() {
                return this.c;
            }

            public final Boolean h() {
                return this.e;
            }

            public int hashCode() {
                List<String> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.b;
                int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.e;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            public final List<String> i() {
                return this.a;
            }

            public final JSONObject j() {
                return this.b;
            }

            public String toString() {
                List<String> list = this.a;
                JSONObject jSONObject = this.b;
                Boolean bool = this.c;
                Boolean bool2 = this.d;
                Boolean bool3 = this.e;
                StringBuilder sb = new StringBuilder("Token(optInKeys=");
                sb.append(list);
                sb.append(", tokenGenericParams=");
                sb.append(jSONObject);
                sb.append(", compressToken=");
                tq.i(sb, bool, ", compressExternalToken=", bool2, ", oneToken=");
                return xq.d(sb, bool3, ")");
            }

            public h(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                this.a = list;
                this.b = jSONObject;
                this.c = bool;
                this.d = bool2;
                this.e = bool3;
            }

            public final h a(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            public static /* synthetic */ h a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.b;
                }
                if ((i & 4) != 0) {
                    bool = hVar.c;
                }
                if ((i & 8) != 0) {
                    bool2 = hVar.d;
                }
                if ((i & 16) != 0) {
                    bool3 = hVar.e;
                }
                Boolean bool4 = bool3;
                Boolean bool5 = bool;
                return hVar.a(list, jSONObject, bool5, bool2, bool4);
            }

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        }

        public final e a() {
            return this.a;
        }

        public final Boolean b() {
            return this.j;
        }

        public final C0207c c() {
            return this.b;
        }

        public final h d() {
            return this.c;
        }

        public final f e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && epx.f(this.j, cVar.j);
        }

        public final a f() {
            return this.e;
        }

        public final b g() {
            return this.f;
        }

        public final g h() {
            return this.g;
        }

        public int hashCode() {
            e eVar = this.a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C0207c c0207c = this.b;
            int hashCode2 = (hashCode + (c0207c == null ? 0 : c0207c.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.d;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f;
            int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.g;
            int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.h;
            int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.j;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final d i() {
            return this.h;
        }

        public final Boolean j() {
            return this.i;
        }

        public final a k() {
            return this.e;
        }

        public final b l() {
            return this.f;
        }

        public final C0207c m() {
            return this.b;
        }

        public final d n() {
            return this.h;
        }

        public final Boolean o() {
            return this.j;
        }

        public final e p() {
            return this.a;
        }

        public final f q() {
            return this.d;
        }

        public final g r() {
            return this.g;
        }

        public final h s() {
            return this.c;
        }

        public final Boolean t() {
            return this.i;
        }

        public String toString() {
            return "Application(loggers=" + this.a + ", events=" + this.b + ", token=" + this.c + ", segment=" + this.d + ", auction=" + this.e + ", crashReporter=" + this.f + ", settings=" + this.g + ", external=" + this.h + ", uuidEnabled=" + this.i + ", integration=" + this.j + ")";
        }

        public c(e eVar, C0207c c0207c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            this.a = eVar;
            this.b = c0207c;
            this.c = hVar;
            this.d = fVar;
            this.e = aVar;
            this.f = bVar;
            this.g = gVar;
            this.h = dVar;
            this.i = bool;
            this.j = bool2;
        }

        public final c a(e eVar, C0207c c0207c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            return new c(eVar, c0207c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        public static /* synthetic */ c a(c cVar, e eVar, C0207c c0207c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = cVar.a;
            }
            if ((i & 2) != 0) {
                c0207c = cVar.b;
            }
            if ((i & 4) != 0) {
                hVar = cVar.c;
            }
            if ((i & 8) != 0) {
                fVar = cVar.d;
            }
            if ((i & 16) != 0) {
                aVar = cVar.e;
            }
            if ((i & 32) != 0) {
                bVar = cVar.f;
            }
            if ((i & 64) != 0) {
                gVar = cVar.g;
            }
            if ((i & 128) != 0) {
                dVar = cVar.h;
            }
            if ((i & 256) != 0) {
                bool = cVar.i;
            }
            if ((i & 512) != 0) {
                bool2 = cVar.j;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            g gVar2 = gVar;
            d dVar2 = dVar;
            a aVar2 = aVar;
            b bVar2 = bVar;
            return cVar.a(eVar, c0207c, hVar, fVar, aVar2, bVar2, gVar2, dVar2, bool3, bool4);
        }

        public /* synthetic */ c(e eVar, C0207c c0207c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c0207c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
        }
    }

    public static final class d {
        private final String a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return zr.a("TestSuite(controllerUrl=", this.a, ")");
        }

        public d(String str) {
            this.a = str;
        }

        public final d a(String str) {
            return new d(str);
        }

        public /* synthetic */ d(String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }
    }

    public P3() {
        this(null, null, null, null, 15, null);
    }

    public final c a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final d c() {
        return this.c;
    }

    public final b d() {
        return this.d;
    }

    public final a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3)) {
            return false;
        }
        P3 p3 = (P3) obj;
        return epx.f(this.a, p3.a) && epx.f(this.b, p3.b) && epx.f(this.c, p3.c) && epx.f(this.d, p3.d);
    }

    public final b f() {
        return this.d;
    }

    public final c g() {
        return this.a;
    }

    public final d h() {
        return this.c;
    }

    public int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Configurations2(application=" + this.a + ", adFormats=" + this.b + ", testSuite=" + this.c + ", adQuality=" + this.d + ")";
    }

    public P3(c cVar, a aVar, d dVar, b bVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    public final P3 a(c cVar, a aVar, d dVar, b bVar) {
        return new P3(cVar, aVar, dVar, bVar);
    }

    public static /* synthetic */ P3 a(P3 p3, c cVar, a aVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = p3.a;
        }
        if ((i & 2) != 0) {
            aVar = p3.b;
        }
        if ((i & 4) != 0) {
            dVar = p3.c;
        }
        if ((i & 8) != 0) {
            bVar = p3.d;
        }
        return p3.a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ P3(c cVar, a aVar, d dVar, b bVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }
}
