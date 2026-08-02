package io.radar.sdk;

import Gh.B;
import Gh.C1164a;
import Gh.C1165b;
import Gh.h;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import io.radar.sdk.C4588b0;
import io.radar.sdk.C4589c;
import io.radar.sdk.N0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final Context f49794a;

    /* renamed from: b, reason: collision with root package name */
    public G0 f49795b;

    /* renamed from: c, reason: collision with root package name */
    public C4588b0 f49796c;

    public static final class A implements C4588b0.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f49798b;

        public A(i iVar) {
            this.f49798b = iVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            C1165b[] c1165bArr;
            String[] strArr;
            String[] strArr2;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONArray optJSONArray;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            JSONArray optJSONArray2;
            Intrinsics.checkNotNullParameter(status, "status");
            String[] strArr3 = null;
            if (status != C4589c.EnumC4607s.SUCCESS || jSONObject == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    M0 m02 = M0.f49714a;
                    C1165b[] f10 = m02.f(T.this.f49794a);
                    String[] e10 = m02.e(T.this.f49794a);
                    strArr = m02.d(T.this.f49794a);
                    c1165bArr = f10;
                    strArr3 = e10;
                } else {
                    c1165bArr = null;
                    strArr = null;
                }
                this.f49798b.a(status, jSONObject, c1165bArr, strArr3, strArr);
                return;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("beacons");
            C1165b[] b10 = optJSONArray3 != null ? C1165b.f4041l.b(optJSONArray3) : null;
            JSONObject optJSONObject5 = jSONObject.optJSONObject("meta");
            if (optJSONObject5 == null || (optJSONObject3 = optJSONObject5.optJSONObject(EventGroupType.SETTINGS_GROUP)) == null || (optJSONObject4 = optJSONObject3.optJSONObject("beacons")) == null || (optJSONArray2 = optJSONObject4.optJSONArray("uuids")) == null) {
                strArr2 = null;
            } else {
                int length = optJSONArray2.length();
                String[] strArr4 = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    strArr4[i10] = optJSONArray2.getString(i10);
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < length; i11++) {
                    String uuid = strArr4[i11];
                    Intrinsics.checkNotNullExpressionValue(uuid, "uuid");
                    if (uuid.length() > 0) {
                        arrayList.add(uuid);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                strArr2 = (String[]) array;
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("meta");
            if (optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject(EventGroupType.SETTINGS_GROUP)) != null && (optJSONObject2 = optJSONObject.optJSONObject("beacons")) != null && (optJSONArray = optJSONObject2.optJSONArray("uids")) != null) {
                int length2 = optJSONArray.length();
                String[] strArr5 = new String[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    strArr5[i12] = optJSONArray.getString(i12);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < length2; i13++) {
                    String uid = strArr5[i13];
                    Intrinsics.checkNotNullExpressionValue(uid, "uid");
                    if (uid.length() > 0) {
                        arrayList2.add(uid);
                    }
                }
                Object[] array2 = arrayList2.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                strArr3 = (String[]) array2;
            }
            String[] strArr6 = strArr3;
            if (Build.VERSION.SDK_INT >= 26) {
                M0 m03 = M0.f49714a;
                m03.v(T.this.f49794a, b10);
                m03.u(T.this.f49794a, strArr2);
                m03.t(T.this.f49794a, strArr6);
            }
            this.f49798b.a(C4589c.EnumC4607s.SUCCESS, jSONObject, b10, strArr2, strArr6);
        }
    }

    public static final class B implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f49799a;

        public B(j jVar) {
            this.f49799a = jVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                j.a.a(this.f49799a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("geofences");
            Gh.j[] c10 = optJSONArray != null ? Gh.j.f4139h.c(optJSONArray) : null;
            if (c10 != null) {
                this.f49799a.a(enumC4607s, jSONObject, c10);
            } else {
                j.a.a(this.f49799a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class C implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f49800a;

        public C(k kVar) {
            this.f49800a = kVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                k.a.a(this.f49800a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("places");
            Gh.o[] b10 = optJSONArray != null ? Gh.o.f4157h.b(optJSONArray) : null;
            if (b10 != null) {
                this.f49800a.a(enumC4607s, jSONObject, b10);
            } else {
                k.a.a(this.f49800a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class D implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49801a;

        public D(l lVar) {
            this.f49801a = lVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                l.a.a(this.f49801a, status, null, null, 6, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            Gh.h a10 = optJSONObject != null ? Gh.h.f4075t.a(optJSONObject) : null;
            if (a10 == null) {
                l.a.a(this.f49801a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            } else {
                this.f49801a.a(enumC4607s, jSONObject, a10);
            }
        }
    }

    public static final class E implements C4589c.InterfaceC4608t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f49802a;

        public E(m mVar) {
            this.f49802a = mVar;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4608t
        public void a(C4589c.EnumC4607s status, Location location, Gh.h[] hVarArr, Gh.C c10) {
            Intrinsics.checkNotNullParameter(status, "status");
            m mVar = this.f49802a;
            if (mVar != null) {
                m.a.a(mVar, status, null, null, null, null, null, null, 126, null);
            }
        }
    }

    public static final class F implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N0 f49803a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f49804b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f49805c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4589c.EnumC4597i f49806d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T f49807e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Location f49808f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m f49809g;

        public F(N0 n02, JSONObject jSONObject, boolean z10, C4589c.EnumC4597i enumC4597i, T t10, Location location, m mVar) {
            this.f49803a = n02;
            this.f49804b = jSONObject;
            this.f49805c = z10;
            this.f49806d = enumC4597i;
            this.f49807e = t10;
            this.f49808f = location;
            this.f49809g = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
        @Override // io.radar.sdk.C4588b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            C4589c.EnumC4597i enumC4597i;
            boolean z10;
            Gh.j[] e10;
            Gh.q b10;
            Gh.q h10;
            Gh.q d10;
            Gh.q g10;
            C1165b[] a10;
            Intrinsics.checkNotNullParameter(status, "status");
            if (status != C4589c.EnumC4607s.SUCCESS || jSONObject == null) {
                if (this.f49803a.k() == N0.d.ALL) {
                    this.f49804b.putOpt("replayed", Boolean.TRUE);
                    C4589c.c(this.f49804b);
                } else if (this.f49803a.k() == N0.d.STOPS && this.f49805c && (enumC4597i = this.f49806d) != C4589c.EnumC4597i.FOREGROUND_LOCATION && enumC4597i != C4589c.EnumC4597i.BACKGROUND_LOCATION) {
                    M0.f49714a.w(this.f49807e.f49794a, this.f49808f);
                }
                C4589c.m0(C4589c.f49918a, status, null, 2, null);
                m mVar = this.f49809g;
                if (mVar != null) {
                    m.a.a(mVar, status, null, null, null, null, null, null, 126, null);
                    return;
                }
                return;
            }
            M0 m02 = M0.f49714a;
            m02.w(this.f49807e.f49794a, null);
            C4589c.h();
            L0.f49705a.e0(this.f49807e.f49794a);
            Gh.e a11 = Gh.e.f4062d.a(jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            Gh.h[] b11 = optJSONArray != null ? Gh.h.f4075t.b(optJSONArray) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("user");
            Gh.C a12 = optJSONObject != null ? Gh.C.f3984s.a(optJSONObject) : null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("nearbyGeofences");
            Gh.j[] c10 = optJSONArray2 != null ? Gh.j.f4139h.c(optJSONArray2) : null;
            Gh.D a13 = Gh.D.f4003h.a(jSONObject);
            if (a12 != null) {
                if (a12.e() != null) {
                    if (!(a12.e().length == 0)) {
                        z10 = true;
                        m02.r(this.f49807e.f49794a, !z10 || (a12.f() == null));
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        e10 = a12.e();
                        if (e10 != null) {
                            for (Gh.j jVar : e10) {
                                linkedHashSet.add(jVar.c());
                            }
                        }
                        M0 m03 = M0.f49714a;
                        m03.s(this.f49807e.f49794a, linkedHashSet);
                        Gh.o f10 = a12.f();
                        m03.B(this.f49807e.f49794a, f10 == null ? f10.a() : null);
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        b10 = a12.b();
                        if (b10 != null) {
                            linkedHashSet2.add(b10.b());
                        }
                        h10 = a12.h();
                        if (h10 != null) {
                            linkedHashSet2.add(h10.b());
                        }
                        d10 = a12.d();
                        if (d10 != null) {
                            linkedHashSet2.add(d10.b());
                        }
                        g10 = a12.g();
                        if (g10 != null) {
                            linkedHashSet2.add(g10.b());
                        }
                        m03.C(this.f49807e.f49794a, linkedHashSet2);
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        a10 = a12.a();
                        if (a10 != null) {
                            for (C1165b c1165b : a10) {
                                String g11 = c1165b.g();
                                if (g11 != null) {
                                    linkedHashSet3.add(g11);
                                }
                            }
                        }
                        M0.f49714a.q(this.f49807e.f49794a, linkedHashSet3);
                    }
                }
                z10 = false;
                m02.r(this.f49807e.f49794a, !z10 || (a12.f() == null));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                e10 = a12.e();
                if (e10 != null) {
                }
                M0 m032 = M0.f49714a;
                m032.s(this.f49807e.f49794a, linkedHashSet4);
                Gh.o f102 = a12.f();
                m032.B(this.f49807e.f49794a, f102 == null ? f102.a() : null);
                LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                b10 = a12.b();
                if (b10 != null) {
                }
                h10 = a12.h();
                if (h10 != null) {
                }
                d10 = a12.d();
                if (d10 != null) {
                }
                g10 = a12.g();
                if (g10 != null) {
                }
                m032.C(this.f49807e.f49794a, linkedHashSet22);
                LinkedHashSet linkedHashSet32 = new LinkedHashSet();
                a10 = a12.a();
                if (a10 != null) {
                }
                M0.f49714a.q(this.f49807e.f49794a, linkedHashSet32);
            }
            if (b11 == null || a12 == null) {
                C4589c.m0(C4589c.f49918a, status, null, 2, null);
                m mVar2 = this.f49809g;
                if (mVar2 != null) {
                    m.a.a(mVar2, C4589c.EnumC4607s.ERROR_SERVER, null, null, null, null, null, null, 126, null);
                    return;
                }
                return;
            }
            L0 l02 = L0.f49705a;
            l02.M(this.f49807e.f49794a, a12.j());
            if (a12.i() == null && l02.z(this.f49807e.f49794a) != null) {
                C4589c.f49918a.x().D();
                l02.a0(this.f49807e.f49794a, null);
            }
            l02.b0(this.f49807e.f49794a, a12.c());
            C4589c c4589c = C4589c.f49918a;
            c4589c.p0(this.f49808f, a12);
            if (!(b11.length == 0)) {
                c4589c.n0(b11, a12);
            }
            if (a13 != null) {
                c4589c.u0(a13);
            }
            m mVar3 = this.f49809g;
            if (mVar3 != null) {
                mVar3.a(C4589c.EnumC4607s.SUCCESS, jSONObject, b11, a12, c10, a11, a13);
            }
        }
    }

    public static final class G implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f49810a;

        public G(n nVar) {
            this.f49810a = nVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                n nVar = this.f49810a;
                if (nVar != null) {
                    n.a.a(nVar, status, null, null, null, 14, null);
                    return;
                }
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("trip");
            Gh.B a10 = optJSONObject != null ? Gh.B.f3966k.a(optJSONObject) : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            Gh.h[] b10 = optJSONArray != null ? Gh.h.f4075t.b(optJSONArray) : null;
            if (b10 != null) {
                if (!(b10.length == 0)) {
                    C4589c.o0(C4589c.f49918a, b10, null, 2, null);
                }
            }
            n nVar2 = this.f49810a;
            if (nVar2 != null) {
                nVar2.a(enumC4607s, jSONObject, a10, b10);
            }
        }
    }

    public static final class H implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f49811a;

        public H(o oVar) {
            this.f49811a = oVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        @Override // io.radar.sdk.C4588b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            C4589c.EnumC4591b enumC4591b;
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                o.a.a(this.f49811a, status, null, null, null, 14, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("address");
            C1164a a10 = optJSONObject != null ? C1164a.f4011z.a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
            String optString = optJSONObject2 != null ? optJSONObject2.optString("verificationStatus") : null;
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1994383672:
                        if (optString.equals("verified")) {
                            enumC4591b = C4589c.EnumC4591b.VERIFIED;
                            break;
                        }
                        break;
                    case -468155295:
                        if (optString.equals("unverified")) {
                            enumC4591b = C4589c.EnumC4591b.UNVERIFIED;
                            break;
                        }
                        break;
                    case 1442827226:
                        if (optString.equals("partially verified")) {
                            enumC4591b = C4589c.EnumC4591b.PARTIALLY_VERIFIED;
                            break;
                        }
                        break;
                    case 1644168716:
                        if (optString.equals("ambiguous")) {
                            enumC4591b = C4589c.EnumC4591b.AMBIGUOUS;
                            break;
                        }
                        break;
                }
                if (a10 == null) {
                    this.f49811a.a(enumC4607s, jSONObject, a10, enumC4591b);
                    return;
                } else {
                    o.a.a(this.f49811a, C4589c.EnumC4607s.ERROR_SERVER, null, null, null, 14, null);
                    return;
                }
            }
            enumC4591b = C4589c.EnumC4591b.NONE;
            if (a10 == null) {
            }
        }
    }

    /* renamed from: io.radar.sdk.T$a, reason: case insensitive filesystem */
    public interface InterfaceC4577a {

        /* renamed from: io.radar.sdk.T$a$a, reason: collision with other inner class name */
        public static final class C0737a {
            public static /* synthetic */ void a(InterfaceC4577a interfaceC4577a, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.f fVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    fVar = null;
                }
                interfaceC4577a.a(enumC4607s, jSONObject, fVar);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.f fVar);
    }

    /* renamed from: io.radar.sdk.T$b, reason: case insensitive filesystem */
    public interface InterfaceC4578b {

        /* renamed from: io.radar.sdk.T$b$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4578b interfaceC4578b, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.x xVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    xVar = null;
                }
                interfaceC4578b.a(enumC4607s, jSONObject, xVar);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.x xVar);
    }

    /* renamed from: io.radar.sdk.T$c, reason: case insensitive filesystem */
    public interface InterfaceC4579c {

        /* renamed from: io.radar.sdk.T$c$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4579c interfaceC4579c, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a[] c1164aArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    c1164aArr = null;
                }
                interfaceC4579c.a(enumC4607s, jSONObject, c1164aArr);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a[] c1164aArr);
    }

    /* renamed from: io.radar.sdk.T$d, reason: case insensitive filesystem */
    public interface InterfaceC4580d {

        /* renamed from: io.radar.sdk.T$d$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4580d interfaceC4580d, C4589c.EnumC4607s enumC4607s, Gh.e eVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    eVar = null;
                }
                interfaceC4580d.a(enumC4607s, eVar);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, Gh.e eVar);
    }

    /* renamed from: io.radar.sdk.T$e, reason: case insensitive filesystem */
    public interface InterfaceC4581e {

        /* renamed from: io.radar.sdk.T$e$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4581e interfaceC4581e, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a c1164a, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    c1164a = null;
                }
                if ((i10 & 8) != 0) {
                    z10 = false;
                }
                interfaceC4581e.a(enumC4607s, jSONObject, c1164a, z10);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a c1164a, boolean z10);
    }

    /* renamed from: io.radar.sdk.T$f, reason: case insensitive filesystem */
    public interface InterfaceC4582f {

        /* renamed from: io.radar.sdk.T$f$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4582f interfaceC4582f, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                interfaceC4582f.a(enumC4607s, jSONObject);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject);
    }

    /* renamed from: io.radar.sdk.T$g, reason: case insensitive filesystem */
    public interface InterfaceC4583g {

        /* renamed from: io.radar.sdk.T$g$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4583g interfaceC4583g, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.w wVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    wVar = null;
                }
                interfaceC4583g.a(enumC4607s, jSONObject, wVar);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.w wVar);
    }

    /* renamed from: io.radar.sdk.T$h, reason: case insensitive filesystem */
    public interface InterfaceC4584h {

        /* renamed from: io.radar.sdk.T$h$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4584h interfaceC4584h, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                interfaceC4584h.a(enumC4607s, jSONObject);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject);
    }

    public interface i {

        public static final class a {
            public static /* synthetic */ void a(i iVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1165b[] c1165bArr, String[] strArr, String[] strArr2, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    c1165bArr = null;
                }
                if ((i10 & 8) != 0) {
                    strArr = null;
                }
                if ((i10 & 16) != 0) {
                    strArr2 = null;
                }
                iVar.a(enumC4607s, jSONObject, c1165bArr, strArr, strArr2);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1165b[] c1165bArr, String[] strArr, String[] strArr2);
    }

    public interface j {

        public static final class a {
            public static /* synthetic */ void a(j jVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.j[] jVarArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    jVarArr = null;
                }
                jVar.a(enumC4607s, jSONObject, jVarArr);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.j[] jVarArr);
    }

    public interface k {

        public static final class a {
            public static /* synthetic */ void a(k kVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.o[] oVarArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    oVarArr = null;
                }
                kVar.a(enumC4607s, jSONObject, oVarArr);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.o[] oVarArr);
    }

    public interface l {

        public static final class a {
            public static /* synthetic */ void a(l lVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.h hVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    hVar = null;
                }
                lVar.a(enumC4607s, jSONObject, hVar);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.h hVar);
    }

    public interface m {

        public static final class a {
            public static /* synthetic */ void a(m mVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.h[] hVarArr, Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    hVarArr = null;
                }
                if ((i10 & 8) != 0) {
                    c10 = null;
                }
                if ((i10 & 16) != 0) {
                    jVarArr = null;
                }
                if ((i10 & 32) != 0) {
                    eVar = null;
                }
                if ((i10 & 64) != 0) {
                    d10 = null;
                }
                mVar.a(enumC4607s, jSONObject, hVarArr, c10, jVarArr, eVar, d10);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.h[] hVarArr, Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10);
    }

    public interface n {

        public static final class a {
            public static /* synthetic */ void a(n nVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.B b10, Gh.h[] hVarArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    b10 = null;
                }
                if ((i10 & 8) != 0) {
                    hVarArr = null;
                }
                nVar.a(enumC4607s, jSONObject, b10, hVarArr);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, Gh.B b10, Gh.h[] hVarArr);
    }

    public interface o {

        public static final class a {
            public static /* synthetic */ void a(o oVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a c1164a, C4589c.EnumC4591b enumC4591b, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i10 & 4) != 0) {
                    c1164a = null;
                }
                if ((i10 & 8) != 0) {
                    enumC4591b = null;
                }
                oVar.a(enumC4607s, jSONObject, c1164a, enumC4591b);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, C1164a c1164a, C4589c.EnumC4591b enumC4591b);
    }

    public static final class p implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4579c f49812a;

        public p(InterfaceC4579c interfaceC4579c) {
            this.f49812a = interfaceC4579c;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4579c.a.a(this.f49812a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("addresses");
            C1164a[] b10 = optJSONArray != null ? C1164a.f4011z.b(optJSONArray) : null;
            if (b10 != null) {
                this.f49812a.a(enumC4607s, jSONObject, b10);
            } else {
                InterfaceC4579c.a.a(this.f49812a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class q implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f49813a;

        public q(n nVar) {
            this.f49813a = nVar;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                n nVar = this.f49813a;
                if (nVar != null) {
                    n.a.a(nVar, status, null, null, null, 14, null);
                    return;
                }
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("trip");
            Gh.B a10 = optJSONObject != null ? Gh.B.f3966k.a(optJSONObject) : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            Gh.h[] b10 = optJSONArray != null ? Gh.h.f4075t.b(optJSONArray) : null;
            if (b10 != null) {
                if (!(b10.length == 0)) {
                    C4589c.o0(C4589c.f49918a, b10, null, 2, null);
                }
            }
            n nVar2 = this.f49813a;
            if (nVar2 != null) {
                nVar2.a(enumC4607s, jSONObject, a10, b10);
            }
        }
    }

    public static final class r implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4579c f49814a;

        public r(InterfaceC4579c interfaceC4579c) {
            this.f49814a = interfaceC4579c;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4579c.a.a(this.f49814a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("addresses");
            C1164a[] b10 = optJSONArray != null ? C1164a.f4011z.b(optJSONArray) : null;
            if (b10 != null) {
                this.f49814a.a(enumC4607s, jSONObject, b10);
            } else {
                InterfaceC4579c.a.a(this.f49814a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class s implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4580d f49815a;

        public s(InterfaceC4580d interfaceC4580d) {
            this.f49815a = interfaceC4580d;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == C4589c.EnumC4607s.SUCCESS) {
                C4589c.h();
            }
            InterfaceC4580d interfaceC4580d = this.f49815a;
            if (interfaceC4580d != null) {
                interfaceC4580d.a(status, Gh.e.f4062d.a(jSONObject));
            }
        }
    }

    public static final class t implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4577a f49816a;

        public t(InterfaceC4577a interfaceC4577a) {
            this.f49816a = interfaceC4577a;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4577a.C0737a.a(this.f49816a, status, null, null, 6, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("context");
            Gh.f a10 = optJSONObject != null ? Gh.f.f4066f.a(optJSONObject) : null;
            if (a10 != null) {
                this.f49816a.a(enumC4607s, jSONObject, a10);
            } else {
                InterfaceC4577a.C0737a.a(this.f49816a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class u implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4578b f49817a;

        public u(InterfaceC4578b interfaceC4578b) {
            this.f49817a = interfaceC4578b;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4578b.a.a(this.f49817a, status, null, null, 6, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("routes");
            Gh.x a10 = optJSONObject != null ? Gh.x.f4194g.a(optJSONObject) : null;
            if (a10 != null) {
                this.f49817a.a(enumC4607s, jSONObject, a10);
            } else {
                InterfaceC4578b.a.a(this.f49817a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class v implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4583g f49818a;

        public v(InterfaceC4583g interfaceC4583g) {
            this.f49818a = interfaceC4583g;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4583g.a.a(this.f49818a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("matrix");
            Gh.w a10 = optJSONArray != null ? Gh.w.f4192b.a(optJSONArray) : null;
            if (a10 != null) {
                this.f49818a.a(enumC4607s, jSONObject, a10);
            } else {
                InterfaceC4583g.a.a(this.f49818a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public static final class w implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4581e f49819a;

        public w(InterfaceC4581e interfaceC4581e) {
            this.f49819a = interfaceC4581e;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4581e.a.a(this.f49819a, status, null, null, false, 14, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("address");
            C1164a a10 = optJSONObject != null ? C1164a.f4011z.a(optJSONObject) : null;
            boolean optBoolean = jSONObject.optBoolean("proxy");
            if (a10 != null) {
                this.f49819a.a(enumC4607s, jSONObject, a10, optBoolean);
            } else {
                InterfaceC4581e.a.a(this.f49819a, C4589c.EnumC4607s.ERROR_SERVER, null, null, false, 14, null);
            }
        }
    }

    public static final class x implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4582f f49820a;

        public x(InterfaceC4582f interfaceC4582f) {
            this.f49820a = interfaceC4582f;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            InterfaceC4582f interfaceC4582f = this.f49820a;
            if (interfaceC4582f != null) {
                interfaceC4582f.a(status, jSONObject);
            }
        }
    }

    public static final class y implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4584h f49821a;

        public y(InterfaceC4584h interfaceC4584h) {
            this.f49821a = interfaceC4584h;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            JSONObject optJSONObject;
            JSONArray optJSONArray;
            Intrinsics.checkNotNullParameter(status, "status");
            Gh.C c10 = null;
            if (status != C4589c.EnumC4607s.SUCCESS) {
                C4589c.m0(C4589c.f49918a, status, null, 2, null);
            }
            Gh.h[] b10 = (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("events")) == null) ? null : Gh.h.f4075t.b(optJSONArray);
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("user")) != null) {
                c10 = Gh.C.f3984s.a(optJSONObject);
            }
            if (b10 != null) {
                if (!(b10.length == 0)) {
                    C4589c.f49918a.n0(b10, c10);
                }
            }
            InterfaceC4584h interfaceC4584h = this.f49821a;
            if (interfaceC4584h != null) {
                interfaceC4584h.a(status, jSONObject);
            }
        }
    }

    public static final class z implements C4588b0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4579c f49822a;

        public z(InterfaceC4579c interfaceC4579c) {
            this.f49822a = interfaceC4579c;
        }

        @Override // io.radar.sdk.C4588b0.a
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.SUCCESS;
            if (status != enumC4607s || jSONObject == null) {
                InterfaceC4579c.a.a(this.f49822a, status, null, null, 6, null);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("addresses");
            C1164a[] b10 = optJSONArray != null ? C1164a.f4011z.b(optJSONArray) : null;
            if (b10 != null) {
                this.f49822a.a(enumC4607s, jSONObject, b10);
            } else {
                InterfaceC4579c.a.a(this.f49822a, C4589c.EnumC4607s.ERROR_SERVER, null, null, 6, null);
            }
        }
    }

    public T(Context context, G0 logger, C4588b0 apiHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        this.f49794a = context;
        this.f49795b = logger;
        this.f49796c = apiHelper;
    }

    public static /* synthetic */ void f(T t10, String str, boolean z10, InterfaceC4580d interfaceC4580d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC4580d = null;
        }
        t10.e(str, z10, interfaceC4580d);
    }

    public static /* synthetic */ void t(T t10, Location location, boolean z10, boolean z11, C4589c.EnumC4597i enumC4597i, boolean z12, C1165b[] c1165bArr, boolean z13, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, m mVar, int i10, Object obj) {
        m mVar2;
        T t11;
        Location location2;
        boolean z14;
        boolean z15;
        C4589c.EnumC4597i enumC4597i2;
        boolean z16;
        C1165b[] c1165bArr2;
        boolean z17 = (i10 & 64) != 0 ? false : z13;
        String str7 = (i10 & 128) != 0 ? null : str;
        String str8 = (i10 & 256) != 0 ? null : str2;
        Boolean bool2 = (i10 & 512) != 0 ? Boolean.FALSE : bool;
        String str9 = (i10 & 1024) != 0 ? null : str3;
        String str10 = (i10 & 2048) != 0 ? null : str4;
        String str11 = (i10 & 4096) != 0 ? null : str5;
        String str12 = (i10 & 8192) != 0 ? null : str6;
        if ((i10 & 16384) != 0) {
            mVar2 = null;
            location2 = location;
            z14 = z10;
            z15 = z11;
            enumC4597i2 = enumC4597i;
            z16 = z12;
            c1165bArr2 = c1165bArr;
            t11 = t10;
        } else {
            mVar2 = mVar;
            t11 = t10;
            location2 = location;
            z14 = z10;
            z15 = z11;
            enumC4597i2 = enumC4597i;
            z16 = z12;
            c1165bArr2 = c1165bArr;
        }
        t11.s(location2, z14, z15, enumC4597i2, z16, c1165bArr2, z17, str7, str8, bool2, str9, str10, str11, str12, mVar2);
    }

    public static /* synthetic */ void x(T t10, String str, h.d dVar, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        t10.w(str, dVar, str2);
    }

    public final void b(String query, Location location, String[] strArr, Integer num, String str, Boolean bool, InterfaceC4579c callback) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4579c.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("query=" + query);
        if (location != null) {
            sb2.append("&near=" + location.getLatitude() + ',' + location.getLongitude());
        }
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                sb2.append("&layers=" + ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        sb2.append("&limit=" + num);
        if (str != null) {
            sb2.append("&country=" + str);
        }
        if (bool != null) {
            sb2.append("&mailable=" + bool);
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/search/autocomplete?" + ((Object) sb2), j(q10), null, false, new p(callback), false, false, false, false, 1920, null);
    }

    public final void c(O0 o02, n nVar) {
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            if (nVar != null) {
                n.a.a(nVar, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
                return;
            }
            return;
        }
        String e10 = o02 != null ? o02.e() : null;
        if (e10 == null) {
            if (nVar != null) {
                n.a.a(nVar, C4589c.EnumC4607s.ERROR_BAD_REQUEST, null, null, null, 14, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("userId", l02.B(this.f49794a));
        jSONObject.putOpt("externalId", e10);
        if (o02.f() != null) {
            jSONObject.putOpt("metadata", o02.f());
        }
        if (o02.d() != null) {
            jSONObject.putOpt("destinationGeofenceTag", o02.d());
        }
        if (o02.c() != null) {
            jSONObject.putOpt("destinationGeofenceExternalId", o02.c());
        }
        jSONObject.putOpt("mode", C4589c.S0(o02.g()));
        jSONObject.putOpt("scheduledArrivalAt", R0.f49781a.a(o02.h()));
        if (o02.b() > 0) {
            jSONObject.put("approachingThreshold", o02.b());
        }
        C4588b0.q(this.f49796c, this.f49794a, VoiceURLConnection.METHOD_TYPE_POST, "v1/trips", j(q10), jSONObject, false, new q(nVar), false, false, false, false, 1920, null);
    }

    public final void d(String query, String[] strArr, String[] strArr2, InterfaceC4579c callback) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4579c.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("query=" + query);
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                sb2.append("&layers=" + ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        if (strArr2 != null) {
            if (!(strArr2.length == 0)) {
                sb2.append("&country=" + ArraysKt.joinToString$default(strArr2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/geocode/forward?" + ((Object) sb2), j(q10), null, false, new r(callback), false, false, false, false, 1920, null);
    }

    public final void e(String str, boolean z10, InterfaceC4580d interfaceC4580d) {
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            if (interfaceC4580d != null) {
                InterfaceC4580d.a.a(interfaceC4580d, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("installId=" + l02.g(this.f49794a));
        sb2.append("&sessionId=" + l02.t(this.f49794a));
        String f10 = l02.f(this.f49794a);
        if (f10 != null) {
            sb2.append("&id=" + f10);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("&locationAuthorization=");
        R0 r02 = R0.f49781a;
        sb3.append(r02.h(this.f49794a));
        sb2.append(sb3.toString());
        sb2.append("&locationAccuracyAuthorization=" + r02.g(this.f49794a));
        sb2.append("&verified=" + z10);
        if (str != null) {
            sb2.append("&usage=" + str);
        }
        String jSONObject = l02.b(this.f49794a).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "RadarSettings.getClientS…ation(context).toString()");
        sb2.append("&clientSdkConfiguration=" + URLEncoder.encode(jSONObject, "utf-8"));
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/config?" + ((Object) sb2), j(q10), null, false, new s(interfaceC4580d), false, true, z10, false, 1024, null);
    }

    public final void g(Location location, InterfaceC4577a callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4577a.C0737a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("coordinates=" + location.getLatitude() + ',' + location.getLongitude());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("v1/context?");
        sb3.append((Object) sb2);
        C4588b0.q(this.f49796c, this.f49794a, "GET", sb3.toString(), j(q10), null, false, new t(callback), false, false, false, false, 1920, null);
    }

    public final void h(Location origin, Location destination, EnumSet modes, C4589c.EnumC4604p units, int i10, InterfaceC4578b callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4578b.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=" + origin.getLatitude() + ',' + origin.getLongitude());
        sb2.append("&destination=" + destination.getLatitude() + ',' + destination.getLongitude());
        ArrayList arrayList = new ArrayList();
        if (modes.contains(C4589c.EnumC4603o.FOOT)) {
            arrayList.add("foot");
        }
        if (modes.contains(C4589c.EnumC4603o.BIKE)) {
            arrayList.add("bike");
        }
        if (modes.contains(C4589c.EnumC4603o.CAR)) {
            arrayList.add("car");
        }
        if (modes.contains(C4589c.EnumC4603o.TRUCK)) {
            arrayList.add("truck");
        }
        if (modes.contains(C4589c.EnumC4603o.MOTORBIKE)) {
            arrayList.add("motorbike");
        }
        sb2.append("&modes=" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        if (units == C4589c.EnumC4604p.METRIC) {
            sb2.append("&units=metric");
        } else {
            sb2.append("&units=imperial");
        }
        if (i10 > 1) {
            sb2.append("&geometryPoints=" + i10);
        }
        sb2.append("&geometry=linestring");
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/route/distance?" + ((Object) sb2), j(q10), null, false, new u(callback), false, false, false, false, 1920, null);
    }

    public final void i(Location[] origins, Location[] destinations, C4589c.EnumC4603o mode, C4589c.EnumC4604p units, InterfaceC4583g callback) {
        Intrinsics.checkNotNullParameter(origins, "origins");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4583g.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origins=");
        int length = origins.length;
        for (int i10 = 0; i10 < length; i10++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(origins[i10].getLatitude());
            sb3.append(',');
            sb3.append(origins[i10].getLongitude());
            sb2.append(sb3.toString());
            if (i10 < origins.length - 1) {
                sb2.append("|");
            }
        }
        sb2.append("&destinations=");
        int length2 = destinations.length;
        for (int i11 = 0; i11 < length2; i11++) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(destinations[i11].getLatitude());
            sb4.append(',');
            sb4.append(destinations[i11].getLongitude());
            sb2.append(sb4.toString());
            if (i11 < destinations.length - 1) {
                sb2.append("|");
            }
        }
        if (mode == C4589c.EnumC4603o.FOOT) {
            sb2.append("&mode=foot");
        } else if (mode == C4589c.EnumC4603o.BIKE) {
            sb2.append("&mode=bike");
        } else if (mode == C4589c.EnumC4603o.CAR) {
            sb2.append("&mode=car");
        } else if (mode == C4589c.EnumC4603o.TRUCK) {
            sb2.append("&mode=truck");
        } else if (mode == C4589c.EnumC4603o.MOTORBIKE) {
            sb2.append("&mode=motorbike");
        }
        if (units == C4589c.EnumC4604p.METRIC) {
            sb2.append("&units=metric");
        } else {
            sb2.append("&units=imperial");
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/route/matrix?" + ((Object) sb2), j(q10), null, false, new v(callback), false, false, false, false, 1920, null);
    }

    public final Map j(String str) {
        Pair pair = TuplesKt.to(Constants.AUTHORIZATION_HEADER, str);
        Pair pair2 = TuplesKt.to("Content-Type", "application/json");
        Pair pair3 = TuplesKt.to("X-Radar-Config", "true");
        R0 r02 = R0.f49781a;
        Map mutableMapOf = MapsKt.mutableMapOf(pair, pair2, pair3, TuplesKt.to("X-Radar-Device-Make", r02.d()), TuplesKt.to("X-Radar-Device-Model", r02.e()), TuplesKt.to("X-Radar-Device-OS", r02.f()), TuplesKt.to("X-Radar-Device-Type", "Android"), TuplesKt.to("X-Radar-SDK-Version", "3.21.3"), TuplesKt.to("X-Radar-Mobile-Origin", this.f49794a.getPackageName()));
        L0 l02 = L0.f49705a;
        if (l02.F(this.f49794a)) {
            mutableMapOf.put("X-Radar-X-Platform-SDK-Type", l02.D(this.f49794a));
            mutableMapOf.put("X-Radar-X-Platform-SDK-Version", l02.E(this.f49794a));
        } else {
            mutableMapOf.put("X-Radar-X-Platform-SDK-Type", "Native");
        }
        String p10 = l02.p(this.f49794a);
        if (p10 != null) {
            mutableMapOf.put("X-Radar-Product", p10);
        }
        return mutableMapOf;
    }

    public final void k(InterfaceC4581e callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4581e.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, false, 14, null);
        } else {
            C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/geocode/ip", j(q10), null, false, new w(callback), false, false, false, false, 1920, null);
        }
    }

    public final void l(List logs, InterfaceC4582f interfaceC4582f) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            if (interfaceC4582f != null) {
                InterfaceC4582f.a.a(interfaceC4582f, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(StackTraceHelper.ID_KEY, l02.f(this.f49794a));
            jSONObject.putOpt("deviceId", R0.f49781a.c(this.f49794a));
            jSONObject.putOpt("installId", l02.g(this.f49794a));
            jSONObject.putOpt("sessionId", l02.t(this.f49794a));
            JSONArray jSONArray = new JSONArray();
            Iterator it = logs.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Gh.l) it.next()).c());
            }
            jSONObject.putOpt("logs", jSONArray);
            C4588b0.q(this.f49796c, this.f49794a, VoiceURLConnection.METHOD_TYPE_POST, "v1/logs", j(q10), jSONObject, false, new x(interfaceC4582f), false, true, false, false, 1024, null);
        } catch (JSONException unused) {
            if (interfaceC4582f != null) {
                InterfaceC4582f.a.a(interfaceC4582f, C4589c.EnumC4607s.ERROR_BAD_REQUEST, null, 2, null);
            }
        }
    }

    public final void m(List replays, InterfaceC4584h interfaceC4584h) {
        Intrinsics.checkNotNullParameter(replays, "replays");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            if (interfaceC4584h != null) {
                InterfaceC4584h.a.a(interfaceC4584h, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = replays.iterator();
        while (it.hasNext()) {
            arrayList.add(((Gh.r) it.next()).b());
        }
        jSONObject.putOpt("replays", new JSONArray((Collection) arrayList));
        C4588b0.q(this.f49796c, this.f49794a, VoiceURLConnection.METHOD_TYPE_POST, "v1/track/replay", j(q10), jSONObject, false, new y(interfaceC4584h), true, false, false, false, 1024, null);
    }

    public final void n(Location location, String[] strArr, InterfaceC4579c callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            InterfaceC4579c.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("coordinates=" + location.getLatitude() + ',' + location.getLongitude());
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                sb2.append("&layers=" + ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/geocode/reverse?" + ((Object) sb2), j(q10), null, false, new z(callback), false, false, false, false, 1920, null);
    }

    public final void o(Location location, int i10, Integer num, i callback, boolean z10) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            i.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, null, 30, null);
            return;
        }
        if (z10 && Build.VERSION.SDK_INT >= 26) {
            M0 m02 = M0.f49714a;
            C1165b[] f10 = m02.f(this.f49794a);
            String[] e10 = m02.e(this.f49794a);
            String[] d10 = m02.d(this.f49794a);
            G0 g02 = this.f49795b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Using cached search beacons response | lastBeaconUUIDs = ");
            sb2.append(e10 != null ? ArraysKt.joinToString$default(e10, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null);
            sb2.append("; lastBeaconUIDs = ");
            sb2.append(d10 != null ? ArraysKt.joinToString$default(d10, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null);
            G0.b(g02, sb2.toString(), null, null, 6, null);
            callback.a(C4589c.EnumC4607s.SUCCESS, null, f10, e10, d10);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("near=" + location.getLatitude() + ',' + location.getLongitude());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("&radius=");
        sb4.append(i10);
        sb3.append(sb4.toString());
        sb3.append("&limit=" + num);
        sb3.append("&installId=" + l02.g(this.f49794a));
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/search/beacons?" + ((Object) sb3), j(q10), null, false, new A(callback), false, false, false, false, 1920, null);
    }

    public final void p(Location location, Integer num, String[] strArr, JSONObject jSONObject, Integer num2, Boolean bool, j callback) {
        Iterator<String> keys;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            j.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("near=" + location.getLatitude() + ',' + location.getLongitude());
        if (num != null) {
            sb2.append("&radius=" + num);
        }
        sb2.append("&limit=" + num2);
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                sb2.append("&tags=" + ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                sb2.append("&metadata[" + next + "]=" + jSONObject.get(next));
            }
        }
        if (bool != null) {
            sb2.append("&includeGeometry=" + bool);
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/search/geofences?" + ((Object) sb2), j(q10), null, false, new B(callback), false, false, false, false, 1920, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171 A[LOOP:0: B:42:0x016b->B:44:0x0171, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Location location, int i10, String[] strArr, Map map, String[] strArr2, String[] strArr3, String[] strArr4, Integer num, k callback) {
        boolean z10;
        Set<Map.Entry> entrySet;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            k.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("near=" + location.getLatitude() + ',' + location.getLongitude());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("&radius=");
        sb3.append(i10);
        sb2.append(sb3.toString());
        sb2.append("&limit=" + num);
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("&chains=");
                z10 = true;
                sb4.append(ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                sb2.append(sb4.toString());
                if (strArr2 != null) {
                    if ((!(strArr2.length == 0 ? z10 : false)) == z10) {
                        sb2.append("&categories=" + ArraysKt.joinToString$default(strArr2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (strArr3 != null) {
                    if (!(strArr3.length == 0)) {
                        sb2.append("&groups=" + ArraysKt.joinToString$default(strArr3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (strArr4 != null) {
                    if (!(strArr4.length == 0)) {
                        sb2.append("&country=" + ArraysKt.joinToString$default(strArr4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (Map.Entry entry : entrySet) {
                        sb2.append("&chainMetadata[" + ((String) entry.getKey()) + "]=\"" + ((String) entry.getValue()) + Typography.quote);
                    }
                }
                C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/search/places?" + ((Object) sb2), j(q10), null, false, new C(callback), false, false, false, false, 1920, null);
            }
        }
        z10 = true;
        if (strArr2 != null) {
        }
        if (strArr3 != null) {
        }
        if (strArr4 != null) {
        }
        if (map != null) {
            while (r1.hasNext()) {
            }
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/search/places?" + ((Object) sb2), j(q10), null, false, new C(callback), false, false, false, false, 1920, null);
    }

    public final void r(String name, JSONObject jSONObject, l callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            l.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt(StackTraceHelper.ID_KEY, l02.f(this.f49794a));
            jSONObject2.putOpt("installId", l02.g(this.f49794a));
            jSONObject2.putOpt("userId", l02.B(this.f49794a));
            jSONObject2.putOpt("deviceId", R0.f49781a.c(this.f49794a));
            jSONObject2.putOpt("type", name);
            jSONObject2.putOpt("metadata", jSONObject);
            C4588b0.q(this.f49796c, this.f49794a, VoiceURLConnection.METHOD_TYPE_POST, "v1/events", j(q10), jSONObject2, false, new D(callback), false, false, false, false, 1920, null);
        } catch (JSONException unused) {
            l.a.a(callback, C4589c.EnumC4607s.ERROR_BAD_REQUEST, null, null, 6, null);
        }
    }

    public final void s(Location location, boolean z10, boolean z11, C4589c.EnumC4597i source, boolean z12, C1165b[] c1165bArr, boolean z13, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, m mVar) {
        String str7;
        boolean hasVerticalAccuracy;
        boolean hasSpeedAccuracy;
        boolean hasBearingAccuracy;
        float bearingAccuracyDegrees;
        float bearingAccuracyDegrees2;
        float speedAccuracyMetersPerSecond;
        float speedAccuracyMetersPerSecond2;
        float verticalAccuracyMeters;
        float verticalAccuracyMeters2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            if (mVar != null) {
                m.a.a(mVar, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, null, null, null, 126, null);
                Unit unit = Unit.INSTANCE;
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        N0 C10 = C4589c.C();
        O0 z14 = l02.z(this.f49794a);
        boolean a10 = l02.a(this.f49794a);
        try {
            jSONObject.putOpt("anonymous", Boolean.valueOf(a10));
            if (a10) {
                jSONObject.putOpt("deviceId", "anonymous");
                str7 = q10;
                M0 m02 = M0.f49714a;
                jSONObject.putOpt("geofenceIds", new JSONArray((Collection) m02.c(this.f49794a)));
                jSONObject.putOpt("placeId", m02.m(this.f49794a));
                jSONObject.putOpt("regionIds", new JSONArray((Collection) m02.n(this.f49794a)));
                jSONObject.putOpt("beaconIds", new JSONArray((Collection) m02.a(this.f49794a)));
            } else {
                str7 = q10;
                jSONObject.putOpt(StackTraceHelper.ID_KEY, l02.f(this.f49794a));
                jSONObject.putOpt("installId", l02.g(this.f49794a));
                jSONObject.putOpt("userId", l02.B(this.f49794a));
                jSONObject.putOpt("deviceId", R0.f49781a.c(this.f49794a));
                jSONObject.putOpt("description", l02.c(this.f49794a));
                jSONObject.putOpt("metadata", l02.l(this.f49794a));
                jSONObject.putOpt("sessionId", l02.t(this.f49794a));
            }
            jSONObject.putOpt("latitude", Double.valueOf(location.getLatitude()));
            jSONObject.putOpt("longitude", Double.valueOf(location.getLongitude()));
            float accuracy = location.getAccuracy();
            if (!location.hasAccuracy() || Float.isNaN(location.getAccuracy()) || accuracy <= 0.0f) {
                accuracy = 1.0f;
            }
            jSONObject.putOpt("accuracy", Float.valueOf(accuracy));
            if (location.hasSpeed() && !Float.isNaN(location.getSpeed())) {
                jSONObject.putOpt("speed", Float.valueOf(location.getSpeed()));
            }
            if (location.hasBearing() && !Float.isNaN(location.getBearing())) {
                jSONObject.putOpt("course", Float.valueOf(location.getBearing()));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                hasVerticalAccuracy = location.hasVerticalAccuracy();
                if (hasVerticalAccuracy) {
                    verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    if (!Float.isNaN(verticalAccuracyMeters)) {
                        verticalAccuracyMeters2 = location.getVerticalAccuracyMeters();
                        jSONObject.putOpt("verticalAccuracy", Float.valueOf(verticalAccuracyMeters2));
                    }
                }
                hasSpeedAccuracy = location.hasSpeedAccuracy();
                if (hasSpeedAccuracy) {
                    speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                    if (!Float.isNaN(speedAccuracyMetersPerSecond)) {
                        speedAccuracyMetersPerSecond2 = location.getSpeedAccuracyMetersPerSecond();
                        jSONObject.putOpt("speedAccuracy", Float.valueOf(speedAccuracyMetersPerSecond2));
                    }
                }
                hasBearingAccuracy = location.hasBearingAccuracy();
                if (hasBearingAccuracy) {
                    bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                    if (!Float.isNaN(bearingAccuracyDegrees)) {
                        bearingAccuracyDegrees2 = location.getBearingAccuracyDegrees();
                        jSONObject.putOpt("courseAccuracy", Float.valueOf(bearingAccuracyDegrees2));
                    }
                }
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = DurationKt.NANOS_IN_MILLIS;
            long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos() / j10;
            long j11 = (elapsedRealtimeNanos / j10) - elapsedRealtimeNanos2;
            if (l02.s(this.f49794a).h() || !z11) {
                jSONObject.putOpt("updatedAtMsDiff", Long.valueOf(j11));
            }
            jSONObject.putOpt("locationMs", Long.valueOf(elapsedRealtimeNanos2));
            jSONObject.putOpt("foreground", Boolean.valueOf(z11));
            jSONObject.putOpt("stopped", Boolean.valueOf(z10));
            jSONObject.putOpt("replayed", Boolean.valueOf(z12));
            jSONObject.putOpt("deviceType", "Android");
            R0 r02 = R0.f49781a;
            jSONObject.putOpt("deviceMake", r02.d());
            jSONObject.putOpt("sdkVersion", "3.21.3");
            jSONObject.putOpt("deviceModel", r02.e());
            jSONObject.putOpt("deviceOS", r02.f());
            jSONObject.putOpt("deviceType", "Android");
            jSONObject.putOpt("deviceMake", r02.d());
            jSONObject.putOpt(AdRevenueScheme.COUNTRY, r02.b());
            jSONObject.putOpt("timeZoneOffset", Integer.valueOf(r02.i()));
            jSONObject.putOpt("source", C4589c.T0(source));
            if (l02.F(this.f49794a)) {
                jSONObject.putOpt("xPlatformType", l02.D(this.f49794a));
                jSONObject.putOpt("xPlatformSDKVersion", l02.E(this.f49794a));
            } else {
                jSONObject.putOpt("xPlatformType", "Native");
            }
            jSONObject.putOpt("mocked", Boolean.valueOf(location.isFromMockProvider()));
            if (z14 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("version", "2");
                jSONObject2.putOpt("externalId", z14.e());
                jSONObject2.putOpt("metadata", z14.f());
                jSONObject2.putOpt("destinationGeofenceTag", z14.d());
                jSONObject2.putOpt("destinationGeofenceExternalId", z14.c());
                jSONObject2.putOpt("mode", C4589c.S0(z14.g()));
                jSONObject.putOpt("tripOptions", jSONObject2);
            }
            if (C10.r()) {
                jSONObject.putOpt("nearbyGeofences", Boolean.TRUE);
                jSONObject.putOpt("nearbyGeofencesLimit", Integer.valueOf(C10.s()));
            }
            if (c1165bArr != null) {
                jSONObject.putOpt("beacons", C1165b.f4041l.d(c1165bArr));
            }
            jSONObject.putOpt("locationAuthorization", r02.h(this.f49794a));
            jSONObject.putOpt("locationAccuracyAuthorization", r02.g(this.f49794a));
            jSONObject.putOpt("trackingOptions", C4589c.C().z());
            jSONObject.putOpt("usingRemoteTrackingOptions", Boolean.valueOf(l02.w(this.f49794a) && l02.r(this.f49794a) != null));
            jSONObject.putOpt("locationServicesProvider", l02.j(this.f49794a));
            jSONObject.putOpt("verified", Boolean.valueOf(z13));
            if (z13) {
                jSONObject.putOpt("integrityToken", str);
                jSONObject.putOpt("integrityException", str2);
                jSONObject.putOpt("encrypted", bool);
                if (str3 != null) {
                    jSONObject.putOpt("expectedCountryCode", str3);
                }
                if (str4 != null) {
                    jSONObject.putOpt("expectedStateCode", str4);
                }
                if (str5 != null) {
                    jSONObject.putOpt(EventKeys.REASON, str5);
                }
                if (str6 != null) {
                    jSONObject.putOpt("transactionId", str6);
                }
                JSONArray jSONArray = new JSONArray();
                if (r02.j(this.f49794a)) {
                    jSONArray.put("fraud_sharing_multiple_displays");
                }
                if (r02.k(this.f49794a)) {
                    jSONArray.put("fraud_sharing_virtual_input_device");
                }
                if (jSONArray.length() > 0) {
                    jSONObject.putOpt("fraudFailureReasons", jSONArray);
                }
            }
            jSONObject.putOpt("appId", this.f49794a.getPackageName());
            try {
                jSONObject.putOpt("appName", this.f49794a.getApplicationInfo().loadLabel(this.f49794a.getPackageManager()).toString());
                PackageInfo packageInfo = this.f49794a.getPackageManager().getPackageInfo(this.f49794a.getPackageName(), 0);
                jSONObject.putOpt("appVersion", packageInfo.versionName);
                jSONObject.putOpt("appBuild", Integer.valueOf(packageInfo.versionCode));
            } catch (Exception unused) {
            }
            if (L0.f49705a.s(this.f49794a).i()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("motionActivityData", M0.f49714a.i(this.f49794a));
                if (location.hasSpeed() && !Float.isNaN(location.getSpeed())) {
                    jSONObject3.putOpt("speed", Float.valueOf(location.getSpeed()));
                }
                if (location.hasBearing() && !Float.isNaN(location.getBearing())) {
                    jSONObject3.putOpt("bearing", Float.valueOf(location.getBearing()));
                }
                jSONObject.putOpt("locationMetadata", jSONObject3);
            }
            Map j12 = j(str7);
            if (a10) {
                f(this, "track", false, null, 6, null);
            }
            boolean z15 = C10.k() == N0.d.ALL && C4589c.K() && !z13;
            if (z15) {
                C4589c.i(jSONObject, new E(mVar));
            } else {
                this.f49796c.p(this.f49794a, VoiceURLConnection.METHOD_TYPE_POST, "v1/track", j12, jSONObject, true, new F(C10, jSONObject, z10, source, this, location, mVar), z15, false, !z15, z13);
            }
        } catch (JSONException unused2) {
            if (mVar != null) {
                m.a.a(mVar, C4589c.EnumC4607s.ERROR_BAD_REQUEST, null, null, null, null, null, null, 126, null);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void u(O0 o02, B.b bVar, n nVar) {
        L0 l02 = L0.f49705a;
        String q10 = l02.q(this.f49794a);
        if (q10 == null) {
            if (nVar != null) {
                n.a.a(nVar, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
                return;
            }
            return;
        }
        String e10 = o02 != null ? o02.e() : null;
        if (e10 == null) {
            if (nVar != null) {
                n.a.a(nVar, C4589c.EnumC4607s.ERROR_BAD_REQUEST, null, null, null, 14, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("userId", l02.B(this.f49794a));
        if (bVar != null && bVar != B.b.UNKNOWN) {
            jSONObject.putOpt("status", C4589c.U0(bVar));
        }
        if (o02.f() != null) {
            jSONObject.putOpt("metadata", o02.f());
        }
        if (o02.d() != null) {
            jSONObject.putOpt("destinationGeofenceTag", o02.d());
        }
        if (o02.c() != null) {
            jSONObject.putOpt("destinationGeofenceExternalId", o02.c());
        }
        jSONObject.putOpt("mode", C4589c.S0(o02.g()));
        jSONObject.putOpt("scheduledArrivalAt", R0.f49781a.a(o02.h()));
        if (o02.b() > 0) {
            jSONObject.put("approachingThreshold", o02.b());
        }
        C4588b0.q(this.f49796c, this.f49794a, "PATCH", "v1/trips/" + e10 + "/update", j(q10), jSONObject, false, new G(nVar), false, false, false, false, 1920, null);
    }

    public final void v(C1164a address, o callback) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            o.a.a(callback, C4589c.EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("countryCode=" + address.d());
        sb2.append("&stateCode=" + address.g());
        sb2.append("&city=" + address.c());
        sb2.append("&postalCode=" + address.f());
        if (address.e() != null) {
            sb2.append("&number=" + address.e());
        }
        if (address.h() != null) {
            sb2.append("&street=" + address.h());
        }
        if (address.i() != null) {
            sb2.append("&unit=" + address.i());
        }
        if (address.b() != null) {
            sb2.append("&addressLabel=" + address.b());
        }
        C4588b0.q(this.f49796c, this.f49794a, "GET", "v1/addresses/validate?" + ((Object) sb2), j(q10), null, false, new H(callback), false, false, false, false, 1920, null);
    }

    public final void w(String eventId, h.d verification, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(verification, "verification");
        String q10 = L0.f49705a.q(this.f49794a);
        if (q10 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("verification", verification);
        jSONObject.putOpt("verifiedPlaceId", str);
        C4588b0.q(this.f49796c, this.f49794a, "PUT", "v1/events/" + eventId + "/verification", j(q10), jSONObject, false, null, false, false, false, false, 1984, null);
    }

    public /* synthetic */ T(Context context, G0 g02, C4588b0 c4588b0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, g02, (i10 & 4) != 0 ? new C4588b0(g02) : c4588b0);
    }
}
