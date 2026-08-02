package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;
import xsna.epx;
import xsna.qlb0;
import xsna.tgw;
import xsna.zr;

/* renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4467o1 {
    public static final C4467o1 a = new C4467o1();

    /* renamed from: com.ironsource.o1$a */
    public static final class a implements InterfaceC4485p1 {
        private final IronSource.a a;

        public a(IronSource.a aVar) {
            this.a = aVar;
        }

        private final IronSource.a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.a + ")";
        }

        public final a a(IronSource.a aVar) {
            return new a(aVar);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("adUnit", Integer.valueOf(If.c(this.a)));
        }
    }

    /* renamed from: com.ironsource.o1$b */
    public static final class b implements InterfaceC4485p1 {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("AdIdentifier(value=", this.a, ")");
        }

        public final b a(String str) {
            return new b(str);
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.a);
        }
    }

    /* renamed from: com.ironsource.o1$c */
    public static final class c implements InterfaceC4485p1 {
        private final AdSize a;

        public c(AdSize adSize) {
            this.a = adSize;
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            int i;
            String sizeDescription = this.a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode == -96588539) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.g)) {
                    i = 3;
                }
                i = 0;
            } else if (hashCode == 72205083) {
                if (sizeDescription.equals("LARGE")) {
                    i = 2;
                }
                i = 0;
            } else if (hashCode != 446888797) {
                if (hashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                    i = 1;
                }
                i = 0;
            } else {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.d)) {
                    i = 4;
                }
                i = 0;
            }
            map.put(com.ironsource.mediationsdk.j.h, Integer.valueOf(i));
        }
    }

    /* renamed from: com.ironsource.o1$d */
    public static final class d implements InterfaceC4485p1 {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("AuctionId(auctionId=", this.a, ")");
        }

        public final d a(String str) {
            return new d(str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("auctionId", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$e */
    public static final class e implements InterfaceC4485p1 {
        private final int a;

        public e(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "DemandOnly(value=", ")");
        }

        public final e a(int i) {
            return new e(i);
        }

        public static /* synthetic */ e a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.a;
            }
            return eVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$f */
    public static final class f implements InterfaceC4485p1 {
        private final long a;

        public f(long j) {
            this.a = j;
        }

        private final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public int hashCode() {
            return Long.hashCode(this.a);
        }

        public String toString() {
            return qlb0.a(this.a, "Duration(duration=", ")");
        }

        public final f a(long j) {
            return new f(j);
        }

        public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.a;
            }
            return fVar.a(j);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("duration", Long.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$g */
    public static final class g implements InterfaceC4485p1 {
        private final String a;

        public g(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("DynamicDemandSourceId(dynamicSourceId=", this.a, ")");
        }

        public final g a(String str) {
            return new g(str);
        }

        public static /* synthetic */ g a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$h */
    public static final class h implements InterfaceC4485p1 {
        private final String a;

        public h(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("DynamicSourceId(sourceId=", this.a, ")");
        }

        public final h a(String str) {
            return new h(str);
        }

        public static /* synthetic */ h a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$j */
    public static final class j implements InterfaceC4485p1 {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "ErrorCode(code=", ")");
        }

        public final j a(int i) {
            return new j(i);
        }

        public static /* synthetic */ j a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.a;
            }
            return jVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("errorCode", Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$k */
    public static final class k implements InterfaceC4485p1 {
        private final String a;

        public k(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return zr.a("ErrorReason(reason=", this.a, ")");
        }

        public final k a(String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            String str = this.a;
            if (str == null || str.length() == 0) {
                return;
            }
            map.put("reason", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$l */
    public static final class l implements InterfaceC4485p1 {
        private final String a;

        public l(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("Ext1(value=", this.a, ")");
        }

        public final l a(String str) {
            return new l(str);
        }

        public static /* synthetic */ l a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_EXT1, this.a);
        }
    }

    /* renamed from: com.ironsource.o1$m */
    public static final class m implements InterfaceC4485p1 {
        private final JSONObject a;

        public m(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        private final JSONObject a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.a + ")";
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return;
            }
            map.put("genericParams", jSONObject);
        }
    }

    /* renamed from: com.ironsource.o1$n */
    public static final class n implements InterfaceC4485p1 {
        private final int a;

        public n(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "InstanceType(instanceType=", ")");
        }

        public final n a(int i) {
            return new n(i);
        }

        public static /* synthetic */ n a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.a;
            }
            return nVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("instanceType", Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$o */
    public static final class o implements InterfaceC4485p1 {
        private final int a;

        public o(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "MultipleAdObjects(value=", ")");
        }

        public final o a(int i) {
            return new o(i);
        }

        public static /* synthetic */ o a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.a;
            }
            return oVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("isMultipleAdObjects", Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$p */
    public static final class p implements InterfaceC4485p1 {
        private final int a;

        public p(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "OneFlow(value=", ")");
        }

        public final p a(int i) {
            return new p(i);
        }

        public static /* synthetic */ p a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.a;
            }
            return pVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("isOneFlow", Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$q */
    public static final class q implements InterfaceC4485p1 {
        private final String a;

        public q(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("Placement(value=", this.a, ")");
        }

        public final q a(String str) {
            return new q(str);
        }

        public static /* synthetic */ q a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("placement", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$r */
    public static final class r implements InterfaceC4485p1 {
        private final int a;

        public r(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "Programmatic(programmatic=", ")");
        }

        public final r a(int i) {
            return new r(i);
        }

        public static /* synthetic */ r a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.a;
            }
            return rVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$s */
    public static final class s implements InterfaceC4485p1 {
        private final String a;

        public s(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("Provider(sourceName=", this.a, ")");
        }

        public final s a(String str) {
            return new s(str);
        }

        public static /* synthetic */ s a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.a);
        }
    }

    /* renamed from: com.ironsource.o1$t */
    public static final class t implements InterfaceC4485p1 {
        private final int a;

        public t(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "RewardAmount(value=", ")");
        }

        public final t a(int i) {
            return new t(i);
        }

        public static /* synthetic */ t a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.a;
            }
            return tVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$u */
    public static final class u implements InterfaceC4485p1 {
        private final String a;

        public u(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("RewardName(value=", this.a, ")");
        }

        public final u a(String str) {
            return new u(str);
        }

        public static /* synthetic */ u a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_REWARD_NAME, this.a);
        }
    }

    /* renamed from: com.ironsource.o1$v */
    public static final class v implements InterfaceC4485p1 {
        private final String a;

        public v(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("SdkVersion(version=", this.a, ")");
        }

        public final v a(String str) {
            return new v(str);
        }

        public static /* synthetic */ v a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.a);
        }
    }

    /* renamed from: com.ironsource.o1$w */
    public static final class w implements InterfaceC4485p1 {
        private final int a;

        public w(int i) {
            this.a = i;
        }

        private final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "SessionDepth(sessionDepth=", ")");
        }

        public final w a(int i) {
            return new w(i);
        }

        public static /* synthetic */ w a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.a;
            }
            return wVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("sessionDepth", Integer.valueOf(this.a));
        }
    }

    /* renamed from: com.ironsource.o1$x */
    public static final class x implements InterfaceC4485p1 {
        private final String a;

        public x(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.a, ((x) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("SubProviderId(subProviderId=", this.a, ")");
        }

        public final x a(String str) {
            return new x(str);
        }

        public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("spId", this.a);
        }
    }

    /* renamed from: com.ironsource.o1$y */
    public static final class y implements InterfaceC4485p1 {
        private final String a;

        public y(String str) {
            this.a = str;
        }

        private final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.a, ((y) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("TransId(value=", this.a, ")");
        }

        public final y a(String str) {
            return new y(str);
        }

        public static /* synthetic */ y a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
            map.put("transId", this.a);
        }
    }

    private C4467o1() {
    }

    /* renamed from: com.ironsource.o1$i */
    public static final class i implements InterfaceC4485p1 {
        public static final i a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4485p1
        public void a(Map<String, Object> map) {
        }
    }
}
