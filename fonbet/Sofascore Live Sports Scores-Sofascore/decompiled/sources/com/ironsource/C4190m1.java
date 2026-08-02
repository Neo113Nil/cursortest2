package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import defpackage.lnb;
import defpackage.vxd;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4190m1 {

    @NotNull
    public static final C4190m1 a = new C4190m1();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$c */
    public static final class c implements InterfaceC4208n1 {

        @NotNull
        private final AdSize a;

        public c(@NotNull AdSize adSize) {
            adSize.getClass();
            this.a = adSize;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            int i;
            map.getClass();
            String sizeDescription = this.a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode == -96588539) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.g)) {
                    i = 3;
                }
                i = 0;
            } else if (hashCode == 72205083) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.b)) {
                    i = 2;
                }
                i = 0;
            } else if (hashCode != 446888797) {
                if (hashCode == 1951953708 && sizeDescription.equals(com.ironsource.mediationsdk.j.a)) {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$i */
    public static final class i implements InterfaceC4208n1 {

        @NotNull
        public static final i a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
        }
    }

    private C4190m1() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$b */
    public static final class b implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public b(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("AdIdentifier(value=", this.a, ")");
        }

        @NotNull
        public final b a(@NotNull String str) {
            str.getClass();
            return new b(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$d */
    public static final class d implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public d(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("AuctionId(auctionId=", this.a, ")");
        }

        @NotNull
        public final d a(@NotNull String str) {
            str.getClass();
            return new d(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("auctionId", this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$g */
    public static final class g implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public g(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ g a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.a;
            }
            return gVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("DynamicDemandSourceId(dynamicSourceId=", this.a, ")");
        }

        @NotNull
        public final g a(@NotNull String str) {
            str.getClass();
            return new g(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$h */
    public static final class h implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public h(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ h a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.a;
            }
            return hVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("DynamicSourceId(sourceId=", this.a, ")");
        }

        @NotNull
        public final h a(@NotNull String str) {
            str.getClass();
            return new h(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$l */
    public static final class l implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public l(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ l a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.a;
            }
            return lVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.c(this.a, ((l) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("Ext1(value=", this.a, ")");
        }

        @NotNull
        public final l a(@NotNull String str) {
            str.getClass();
            return new l(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_EXT1, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$q */
    public static final class q implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public q(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ q a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.a;
            }
            return qVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.c(this.a, ((q) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("Placement(value=", this.a, ")");
        }

        @NotNull
        public final q a(@NotNull String str) {
            str.getClass();
            return new q(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("placement", this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$s */
    public static final class s implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public s(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ s a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.a;
            }
            return sVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.c(this.a, ((s) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("Provider(sourceName=", this.a, ")");
        }

        @NotNull
        public final s a(@NotNull String str) {
            str.getClass();
            return new s(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$u */
    public static final class u implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public u(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ u a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.a;
            }
            return uVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Intrinsics.c(this.a, ((u) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("RewardName(value=", this.a, ")");
        }

        @NotNull
        public final u a(@NotNull String str) {
            str.getClass();
            return new u(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_REWARD_NAME, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$v */
    public static final class v implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public v(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ v a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.a;
            }
            return vVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.c(this.a, ((v) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("SdkVersion(version=", this.a, ")");
        }

        @NotNull
        public final v a(@NotNull String str) {
            str.getClass();
            return new v(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$x */
    public static final class x implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public x(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.a;
            }
            return xVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.c(this.a, ((x) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("SubProviderId(subProviderId=", this.a, ")");
        }

        @NotNull
        public final x a(@NotNull String str) {
            str.getClass();
            return new x(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("spId", this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$y */
    public static final class y implements InterfaceC4208n1 {

        @NotNull
        private final String a;

        public y(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ y a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.a;
            }
            return yVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && Intrinsics.c(this.a, ((y) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("TransId(value=", this.a, ")");
        }

        @NotNull
        public final y a(@NotNull String str) {
            str.getClass();
            return new y(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_TRANS_ID, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$m */
    public static final class m implements InterfaceC4208n1 {

        @Nullable
        private final JSONObject a;

        public m(@Nullable JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return;
            }
            map.put("genericParams", jSONObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.c(this.a, ((m) obj).a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.a + ")";
        }

        @NotNull
        public final m a(@Nullable JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.a;
            }
            return mVar.a(jSONObject);
        }

        private final JSONObject a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$e */
    public static final class e implements InterfaceC4208n1 {
        private final int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "DemandOnly(value=", ")");
        }

        @NotNull
        public final e a(int i) {
            return new e(i);
        }

        public static /* synthetic */ e a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.a;
            }
            return eVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$f */
    public static final class f implements InterfaceC4208n1 {
        private final long a;

        public f(long j) {
            this.a = j;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public int hashCode() {
            return Long.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return vxd.m("Duration(duration=", this.a, ")");
        }

        @NotNull
        public final f a(long j) {
            return new f(j);
        }

        public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.a;
            }
            return fVar.a(j);
        }

        private final long a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$j */
    public static final class j implements InterfaceC4208n1 {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "ErrorCode(code=", ")");
        }

        @NotNull
        public final j a(int i) {
            return new j(i);
        }

        public static /* synthetic */ j a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.a;
            }
            return jVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$n */
    public static final class n implements InterfaceC4208n1 {
        private final int a;

        public n(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("instanceType", Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "InstanceType(instanceType=", ")");
        }

        @NotNull
        public final n a(int i) {
            return new n(i);
        }

        public static /* synthetic */ n a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.a;
            }
            return nVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$o */
    public static final class o implements InterfaceC4208n1 {
        private final int a;

        public o(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("isMultipleAdObjects", Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "MultipleAdObjects(value=", ")");
        }

        @NotNull
        public final o a(int i) {
            return new o(i);
        }

        public static /* synthetic */ o a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.a;
            }
            return oVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$p */
    public static final class p implements InterfaceC4208n1 {
        private final int a;

        public p(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("isOneFlow", Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "OneFlow(value=", ")");
        }

        @NotNull
        public final p a(int i) {
            return new p(i);
        }

        public static /* synthetic */ p a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.a;
            }
            return pVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$r */
    public static final class r implements InterfaceC4208n1 {
        private final int a;

        public r(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "Programmatic(programmatic=", ")");
        }

        @NotNull
        public final r a(int i) {
            return new r(i);
        }

        public static /* synthetic */ r a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.a;
            }
            return rVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$t */
    public static final class t implements InterfaceC4208n1 {
        private final int a;

        public t(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "RewardAmount(value=", ")");
        }

        @NotNull
        public final t a(int i) {
            return new t(i);
        }

        public static /* synthetic */ t a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.a;
            }
            return tVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$w */
    public static final class w implements InterfaceC4208n1 {
        private final int a;

        public w(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("sessionDepth", Integer.valueOf(this.a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.a, "SessionDepth(sessionDepth=", ")");
        }

        @NotNull
        public final w a(int i) {
            return new w(i);
        }

        public static /* synthetic */ w a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.a;
            }
            return wVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$a */
    public static final class a implements InterfaceC4208n1 {

        @NotNull
        private final IronSource.a a;

        public a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("adUnit", Integer.valueOf(Gf.c(this.a)));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            return new a(aVar);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.a;
            }
            return aVar.a(aVar2);
        }

        private final IronSource.a a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.m1$k */
    public static final class k implements InterfaceC4208n1 {

        @Nullable
        private final String a;

        public k(@Nullable String str) {
            this.a = str;
        }

        @Override // com.ironsource.InterfaceC4208n1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            String str = this.a;
            if (str == null || str.length() == 0) {
                return;
            }
            map.put("reason", this.a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.c(this.a, ((k) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("ErrorReason(reason=", this.a, ")");
        }

        @NotNull
        public final k a(@Nullable String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.a;
            }
            return kVar.a(str);
        }

        private final String a() {
            return this.a;
        }
    }
}
