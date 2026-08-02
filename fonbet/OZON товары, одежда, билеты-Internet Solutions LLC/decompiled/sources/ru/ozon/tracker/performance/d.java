package ru.ozon.tracker.performance;

import Qj0.A0;
import Qj0.AbstractC3880a;
import Qj0.B;
import Qj0.C3882b;
import Qj0.C3883c;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.C3886f;
import Qj0.C3887g;
import Qj0.C3891k;
import Qj0.C3893m;
import Qj0.C3894n;
import Qj0.C3895o;
import Qj0.C3898s;
import Qj0.C3899t;
import Qj0.C3900u;
import Qj0.C3901v;
import Qj0.C3902w;
import Qj0.C3903x;
import Qj0.C3904y;
import Qj0.F;
import Qj0.G;
import Qj0.K;
import Qj0.L;
import Qj0.N;
import Qj0.O;
import Qj0.P;
import Qj0.Q;
import Qj0.S;
import Qj0.U;
import Qj0.r;
import Qj0.t0;
import Qj0.u0;
import Qj0.x0;
import Qj0.y0;
import Qj0.z0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fi0.s;
import fi0.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.HardwareInfo;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.tracker.db.entities.UserData;
import ru.ozon.tracker.performance.NavigationType;
import ru.ozon.tracker.performance.a;
import ru.ozon.tracker.performance.b;
import ru.ozon.tracker.performance.model.TraceEntity;
import ru.ozon.tracker.sendEvent.CurrentPageInternalProvider;
import ru.ozon.tracker.sendEvent.Namespace;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f97822a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final s f97823b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f97824c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final BuildInfoManager f97825d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x f97826e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final CurrentPageInternalProvider f97827f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97828g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97829h;

    static final class a extends AbstractC7737t implements Function0<Double> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            if (d.this.f97824c.getHardwareInfo().getCpu().getMaxFrequency() != null) {
                return Double.valueOf(r0.longValue() / 1000);
            }
            return null;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Long> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long totalRam = d.this.f97824c.getHardwareInfo().getTotalRam();
            if (totalRam == null) {
                return null;
            }
            long longValue = totalRam.longValue();
            long j11 = UserVerificationMethods.USER_VERIFY_ALL;
            return Long.valueOf((longValue / j11) / j11);
        }
    }

    public d(@NotNull u0 userDataController, @NotNull s attrsManager, @NotNull DeviceInfoManager deviceInfoManager, @NotNull BuildInfoManager buildInfoManager, @NotNull x settings, @NotNull CurrentPageInternalProvider currentPageProvider) {
        Intrinsics.checkNotNullParameter(userDataController, "userDataController");
        Intrinsics.checkNotNullParameter(attrsManager, "attrsManager");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        Intrinsics.checkNotNullParameter(buildInfoManager, "buildInfoManager");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
        this.f97822a = userDataController;
        this.f97823b = attrsManager;
        this.f97824c = deviceInfoManager;
        this.f97825d = buildInfoManager;
        this.f97826e = settings;
        this.f97827f = currentPageProvider;
        this.f97828g = k.b(new a());
        this.f97829h = k.b(new b());
    }

    private static void c(ArrayList arrayList, String str, String str2, boolean z11) {
        Object obj;
        Object obj2;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((TraceEntity.Metric) obj).getType(), str2)) {
                    break;
                }
            }
        }
        TraceEntity.Metric metric = (TraceEntity.Metric) obj;
        if (metric == null) {
            return;
        }
        if (z11) {
            arrayList.remove(metric);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (Intrinsics.d(((TraceEntity.Metric) obj2).getType(), str)) {
                    break;
                }
            }
        }
        TraceEntity.Metric metric2 = (TraceEntity.Metric) obj2;
        if (metric2 == null) {
            return;
        }
        arrayList.remove(metric2);
        Double value = metric2.getValue();
        double doubleValue = value != null ? value.doubleValue() : 0.0d;
        Double value2 = metric.getValue();
        arrayList.add(TraceEntity.Metric.copy$default(metric2, null, Double.valueOf(doubleValue + (value2 != null ? value2.doubleValue() : 0.0d)), 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v59, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, ru.ozon.tracker.performance.CacheResult] */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v76, types: [T, ru.ozon.android.networkinfo.models.ConnectionType] */
    /* JADX WARN: Type inference failed for: r2v33, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v37, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v40, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v51, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v55, types: [T, ru.ozon.tracker.performance.MapLoadingSteps] */
    /* JADX WARN: Type inference failed for: r42v1, types: [T, ru.ozon.tracker.performance.model.TraceEntity$MapSdk] */
    /* JADX WARN: Type inference failed for: r9v34, types: [Qj0.a, T] */
    /* JADX WARN: Type inference failed for: r9v43, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v47, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v62, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v74, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v77, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v79, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull U u11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        U u12;
        M m11;
        M m12;
        ArrayList arrayList;
        d dVar;
        U u13;
        M m13;
        U u14;
        M m14;
        M m15;
        M m16;
        M m17;
        Object obj;
        M m18;
        M m19;
        M m21;
        M m22;
        M m23;
        M m24;
        M m25;
        M m26;
        M m27;
        M m28;
        M m29;
        M m31;
        M m32;
        M m33;
        M m34;
        M m35;
        M m36;
        ArrayList arrayList2;
        M m37;
        TraceEntity.VideoMetric videoMetric;
        M m38;
        ArrayList arrayList3;
        M m39;
        M m41;
        ArrayList arrayList4;
        M m42;
        M m43;
        M m44;
        M m45;
        M m46;
        M m47;
        TraceEntity.VideoMetric videoMetric2;
        ArrayList arrayList5;
        M m48;
        M m49;
        Metric metric;
        List list;
        M m51;
        M m52;
        M m53;
        M m54;
        M m55;
        M m56;
        M m57;
        String userId;
        NavigationType.Name a11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f97798P;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f97798P = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = cVar2.f97796N;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f97798P;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    M m58 = new M();
                    M m59 = new M();
                    M m61 = new M();
                    M m62 = new M();
                    M m63 = new M();
                    M m64 = new M();
                    M m65 = new M();
                    M m66 = new M();
                    M m67 = new M();
                    M m68 = new M();
                    M m69 = new M();
                    M m71 = new M();
                    M m72 = new M();
                    M m73 = new M();
                    c cVar3 = cVar2;
                    M m74 = new M();
                    M m75 = new M();
                    M m76 = m64;
                    M m77 = new M();
                    M m78 = new M();
                    M m79 = new M();
                    M m81 = new M();
                    M m82 = new M();
                    M m83 = new M();
                    M m84 = new M();
                    M m85 = new M();
                    M m86 = new M();
                    M m87 = new M();
                    M m88 = new M();
                    M m89 = new M();
                    M m91 = new M();
                    M m92 = new M();
                    M m93 = new M();
                    M m94 = new M();
                    HashSet<AbstractC3880a> e11 = u11.e();
                    u12 = U.f23534h;
                    e11.addAll(u12.e());
                    Iterator<AbstractC3880a> it = e11.iterator();
                    while (true) {
                        Iterator<AbstractC3880a> it2 = it;
                        if (it.hasNext()) {
                            AbstractC3880a next = it2.next();
                            if (next instanceof C3882b) {
                                m59.f71787a = ((C3882b) next).a();
                            } else if (next instanceof C3883c) {
                                m61.f71787a = ((C3883c) next).a();
                            } else if (next instanceof C3884d) {
                                m68.f71787a = ((C3884d) next).a();
                            } else if (next instanceof C3885e) {
                                m69.f71787a = ((C3885e) next).a();
                            } else if (next instanceof C3893m) {
                                m62.f71787a = new Integer(((C3893m) next).a());
                            } else if (next instanceof C3895o) {
                                m63.f71787a = new Integer(((C3895o) next).a());
                            } else if (next instanceof B) {
                                m58.f71787a = ((B) next).a().name();
                            } else if (next instanceof Q) {
                                m65.f71787a = new Integer(((Q) next).a());
                            } else if (next instanceof S) {
                                m66.f71787a = ((S) next).a();
                            } else if (next instanceof t0) {
                                m67.f71787a = ((t0) next).a();
                            } else if (next instanceof A0) {
                                m71.f71787a = ((A0) next).a();
                            } else if (next instanceof L) {
                                m72.f71787a = ((L) next).a();
                            } else if (next instanceof N) {
                                m73.f71787a = ((N) next).a();
                            } else if (next instanceof O) {
                                m74.f71787a = ((O) next).a();
                            } else if (next instanceof P) {
                                m75.f71787a = ((P) next).a();
                            } else if (next instanceof r) {
                                ?? valueOf = Boolean.valueOf(((r) next).a());
                                M m95 = m77;
                                m95.f71787a = valueOf;
                                m53 = m73;
                                m54 = m72;
                                m77 = m95;
                                m51 = m76;
                                m56 = m92;
                                m57 = m94;
                                m52 = m74;
                                m55 = m87;
                                m87 = m55;
                                m92 = m56;
                                m94 = m57;
                                m74 = m52;
                                m73 = m53;
                                m72 = m54;
                                m76 = m51;
                                it = it2;
                            } else {
                                if (next instanceof C3894n) {
                                    m51 = m76;
                                    m51.f71787a = new Integer(((C3894n) next).a());
                                    m52 = m74;
                                } else {
                                    m51 = m76;
                                    m52 = m74;
                                    if (next instanceof F) {
                                        m78.f71787a = ((F) next).a();
                                    } else if (next instanceof C3899t) {
                                        m79.f71787a = ((C3899t) next).a();
                                    } else if (next instanceof C3900u) {
                                        m81.f71787a = ((C3900u) next).a();
                                    } else if (next instanceof x0) {
                                        m82.f71787a = ((x0) next).a();
                                    } else if (next instanceof C3891k) {
                                        m83.f71787a = ((C3891k) next).a();
                                    } else if (next instanceof K) {
                                        m84.f71787a = ((K) next).a();
                                    } else if (next instanceof y0) {
                                        M m96 = m85;
                                        m96.f71787a = new Integer(((y0) next).a());
                                        m85 = m96;
                                    } else if (next instanceof C3898s) {
                                        ?? valueOf2 = Boolean.valueOf(((C3898s) next).a());
                                        M m97 = m86;
                                        m97.f71787a = valueOf2;
                                        m53 = m73;
                                        m54 = m72;
                                        m86 = m97;
                                        m55 = m87;
                                        m56 = m92;
                                        m57 = m94;
                                        m87 = m55;
                                        m92 = m56;
                                        m94 = m57;
                                        m74 = m52;
                                        m73 = m53;
                                        m72 = m54;
                                        m76 = m51;
                                        it = it2;
                                    } else {
                                        if (next instanceof ru.ozon.tracker.performance.a) {
                                            List<a.C2147a> a12 = ((ru.ozon.tracker.performance.a) next).a();
                                            m53 = m73;
                                            ?? arrayList6 = new ArrayList(C7714v.z(a12, 10));
                                            Iterator it3 = a12.iterator();
                                            while (it3.hasNext()) {
                                                a.C2147a c2147a = (a.C2147a) it3.next();
                                                arrayList6.add(new TraceEntity.Attributes.Step(c2147a.a(), c2147a.b()));
                                                it3 = it3;
                                                m72 = m72;
                                            }
                                            m54 = m72;
                                            m55 = m87;
                                            m55.f71787a = arrayList6;
                                        } else {
                                            m53 = m73;
                                            m54 = m72;
                                            m55 = m87;
                                            if (next instanceof C3901v) {
                                                m88.f71787a = ((C3901v) next).a();
                                            } else {
                                                M m98 = m88;
                                                if (next instanceof C3904y) {
                                                    ((C3904y) next).getClass();
                                                    m91.f71787a = null;
                                                } else if (next instanceof NavigationType) {
                                                    m89.f71787a = next;
                                                } else {
                                                    if (next instanceof ru.ozon.tracker.performance.b) {
                                                        ?? a13 = ((ru.ozon.tracker.performance.b) next).a();
                                                        M m99 = m92;
                                                        m99.f71787a = a13;
                                                        m88 = m98;
                                                        m56 = m99;
                                                    } else {
                                                        m88 = m98;
                                                        m56 = m92;
                                                        if (next instanceof G) {
                                                            m93.f71787a = next;
                                                        } else {
                                                            if (!(next instanceof C3902w)) {
                                                                throw new o();
                                                            }
                                                            C3902w c3902w = (C3902w) next;
                                                            ?? mapSdk = new TraceEntity.MapSdk(c3902w.l(), c3902w.n(), c3902w.a(), c3902w.g(), c3902w.f(), c3902w.p(), c3902w.e(), c3902w.m(), c3902w.j(), c3902w.b(), c3902w.i(), c3902w.k(), c3902w.r(), c3902w.s(), c3902w.d(), c3902w.o(), c3902w.h(), c3902w.q(), c3902w.c());
                                                            m57 = m94;
                                                            m57.f71787a = mapSdk;
                                                            m87 = m55;
                                                            m92 = m56;
                                                            m94 = m57;
                                                            m74 = m52;
                                                            m73 = m53;
                                                            m72 = m54;
                                                            m76 = m51;
                                                            it = it2;
                                                        }
                                                    }
                                                    m57 = m94;
                                                    m87 = m55;
                                                    m92 = m56;
                                                    m94 = m57;
                                                    m74 = m52;
                                                    m73 = m53;
                                                    m72 = m54;
                                                    m76 = m51;
                                                    it = it2;
                                                }
                                                m88 = m98;
                                            }
                                        }
                                        m56 = m92;
                                        m57 = m94;
                                        m87 = m55;
                                        m92 = m56;
                                        m94 = m57;
                                        m74 = m52;
                                        m73 = m53;
                                        m72 = m54;
                                        m76 = m51;
                                        it = it2;
                                    }
                                }
                                m53 = m73;
                                m54 = m72;
                                m55 = m87;
                                m56 = m92;
                                m57 = m94;
                                m87 = m55;
                                m92 = m56;
                                m94 = m57;
                                m74 = m52;
                                m73 = m53;
                                m72 = m54;
                                m76 = m51;
                                it = it2;
                            }
                            m53 = m73;
                            m54 = m72;
                            m51 = m76;
                            m56 = m92;
                            m57 = m94;
                            m52 = m74;
                            m55 = m87;
                            m87 = m55;
                            m92 = m56;
                            m94 = m57;
                            m74 = m52;
                            m73 = m53;
                            m72 = m54;
                            m76 = m51;
                            it = it2;
                        } else {
                            M m100 = m73;
                            M m101 = m72;
                            M m102 = m76;
                            M m103 = m92;
                            M m104 = m74;
                            M m105 = m87;
                            if (!Intrinsics.d(m58.f71787a, "IMAGE") || (list = (List) m103.f71787a) == null) {
                                m11 = m105;
                                m12 = m71;
                                arrayList = null;
                            } else {
                                List list2 = list;
                                m11 = m105;
                                arrayList = new ArrayList(C7714v.z(list2, 10));
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    b.a aVar2 = (b.a) it4.next();
                                    arrayList.add(new TraceEntity.ServerTimingData(aVar2.c(), aVar2.b(), aVar2.a()));
                                    it4 = it4;
                                    m71 = m71;
                                }
                                m12 = m71;
                            }
                            if (m68.f71787a == 0 || m69.f71787a == 0) {
                                dVar = this;
                                Page currentPage = dVar.f97827f.getCurrentPage();
                                if (m68.f71787a == 0) {
                                    m68.f71787a = currentPage != null ? currentPage.getName() : 0;
                                }
                                if (m69.f71787a == 0) {
                                    m69.f71787a = currentPage != null ? currentPage.getUrl() : 0;
                                }
                            } else {
                                dVar = this;
                            }
                            HashSet<C3886f> f7 = u11.f();
                            u13 = U.f23534h;
                            f7.addAll(u13.f());
                            ArrayList arrayList7 = new ArrayList(C7714v.z(f7, 10));
                            Iterator<C3886f> it5 = f7.iterator();
                            while (true) {
                                m13 = m69;
                                if (!it5.hasNext()) {
                                    break;
                                }
                                it5.next().getClass();
                                arrayList7.add(new TraceEntity.CustomMetric(null, null, 0.0d));
                                m69 = m13;
                                arrayList = arrayList;
                                it5 = it5;
                            }
                            ArrayList arrayList8 = arrayList;
                            ArrayList arrayList9 = !arrayList7.isEmpty() ? arrayList7 : null;
                            z0 k11 = u11.k();
                            TraceEntity.VideoMetric a14 = k11 != null ? Sj0.b.a(k11) : null;
                            ArrayList arrayList10 = new ArrayList();
                            TreeSet j11 = u11.j();
                            u14 = U.f23534h;
                            j11.addAll(u14.j());
                            while (!j11.isEmpty()) {
                                Metric metric2 = (Metric) j11.pollFirst();
                                if (metric2.isInterval$tracker_sdk_release()) {
                                    videoMetric2 = a14;
                                    arrayList5 = arrayList9;
                                    m48 = m67;
                                    m49 = m68;
                                    if (!metric2.isStart$tracker_sdk_release() && (metric = (Metric) j11.higher(metric2)) != null && !metric.isEnd$tracker_sdk_release() && Intrinsics.d(metric2.getMetricName$tracker_sdk_release(), metric.getMetricName$tracker_sdk_release())) {
                                        double value = (metric2.getValue() - ((Metric) j11.pollFirst()).getValue()) / 1000000;
                                        String metricName$tracker_sdk_release = metric2.getMetricName$tracker_sdk_release();
                                        if (value < 0.0d) {
                                            value = 0.0d;
                                        }
                                        arrayList10.add(new TraceEntity.Metric(metricName$tracker_sdk_release, new Double(value)));
                                    }
                                } else {
                                    videoMetric2 = a14;
                                    arrayList5 = arrayList9;
                                    m48 = m67;
                                    m49 = m68;
                                    arrayList10.add(new TraceEntity.Metric(metric2.getMetricName$tracker_sdk_release(), new Double(metric2.getValue())));
                                }
                                a14 = videoMetric2;
                                arrayList9 = arrayList5;
                                m67 = m48;
                                m68 = m49;
                            }
                            TraceEntity.VideoMetric videoMetric3 = a14;
                            ArrayList arrayList11 = arrayList9;
                            M m106 = m67;
                            M m107 = m68;
                            for (C3903x c3903x : u11.h()) {
                                c(arrayList10, c3903x.b().getMetricName(), ((C3887g) c3903x.c()).getMetricName(), c3903x.a());
                            }
                            c(arrayList10, MetricType.LAYOUT_TIME_END.getMetricName(), MetricType.BIND_TIME_END.getMetricName(), true);
                            cVar3.f97799d = dVar;
                            cVar3.f97800e = m58;
                            cVar3.f97801f = m59;
                            cVar3.f97802g = m61;
                            cVar3.f97803h = m62;
                            cVar3.f97804i = m63;
                            cVar3.f97805j = m102;
                            cVar3.f97806k = m65;
                            cVar3.f97807l = m66;
                            cVar3.f97808m = m106;
                            m14 = m107;
                            cVar3.f97809n = m14;
                            m15 = m13;
                            cVar3.f97810o = m15;
                            m16 = m12;
                            cVar3.f97811p = m16;
                            m17 = m101;
                            cVar3.f97812q = m17;
                            cVar3.f97813r = m100;
                            cVar3.f97814s = m104;
                            cVar3.f97815t = m75;
                            cVar3.f97816u = m77;
                            cVar3.f97817v = m78;
                            cVar3.f97818w = m79;
                            cVar3.f97819x = m81;
                            cVar3.f97820y = m82;
                            cVar3.f97821z = m83;
                            cVar3.f97783A = m84;
                            cVar3.f97784B = m85;
                            cVar3.f97785C = m86;
                            cVar3.f97786D = m11;
                            cVar3.f97787E = m88;
                            cVar3.f97788F = m89;
                            cVar3.f97789G = m91;
                            cVar3.f97790H = m93;
                            cVar3.f97791I = m94;
                            cVar3.f97792J = arrayList8;
                            cVar3.f97793K = arrayList11;
                            cVar3.f97794L = videoMetric3;
                            cVar3.f97795M = arrayList10;
                            cVar3.f97798P = 1;
                            Object e12 = dVar.f97822a.e(cVar3);
                            if (e12 == aVar) {
                                return aVar;
                            }
                            obj = e12;
                            m18 = m106;
                            m19 = m65;
                            m21 = m66;
                            m22 = m102;
                            m23 = m104;
                            m24 = m77;
                            m25 = m81;
                            m26 = m82;
                            m27 = m83;
                            m28 = m85;
                            m29 = m86;
                            m31 = m11;
                            m32 = m88;
                            m33 = m89;
                            m34 = m91;
                            m35 = m93;
                            m36 = m94;
                            arrayList2 = arrayList8;
                            m37 = m75;
                            videoMetric = videoMetric3;
                            m38 = m100;
                            arrayList3 = arrayList11;
                            m39 = m62;
                            m41 = m63;
                            arrayList4 = arrayList10;
                            m42 = m58;
                            m43 = m59;
                            m44 = m61;
                            m45 = m78;
                            m46 = m79;
                            m47 = m84;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ArrayList arrayList12 = cVar2.f97795M;
                    TraceEntity.VideoMetric videoMetric4 = cVar2.f97794L;
                    ArrayList arrayList13 = cVar2.f97793K;
                    ArrayList arrayList14 = cVar2.f97792J;
                    M m108 = cVar2.f97791I;
                    M m109 = cVar2.f97790H;
                    M m110 = cVar2.f97789G;
                    M m111 = cVar2.f97788F;
                    M m112 = cVar2.f97787E;
                    M m113 = cVar2.f97786D;
                    M m114 = cVar2.f97785C;
                    M m115 = cVar2.f97784B;
                    M m116 = cVar2.f97783A;
                    M m117 = cVar2.f97821z;
                    M m118 = cVar2.f97820y;
                    M m119 = cVar2.f97819x;
                    M m120 = cVar2.f97818w;
                    M m121 = cVar2.f97817v;
                    M m122 = cVar2.f97816u;
                    M m123 = cVar2.f97815t;
                    M m124 = cVar2.f97814s;
                    M m125 = cVar2.f97813r;
                    M m126 = cVar2.f97812q;
                    M m127 = cVar2.f97811p;
                    M m128 = cVar2.f97810o;
                    M m129 = cVar2.f97809n;
                    M m130 = cVar2.f97808m;
                    M m131 = cVar2.f97807l;
                    M m132 = cVar2.f97806k;
                    M m133 = cVar2.f97805j;
                    M m134 = cVar2.f97804i;
                    M m135 = cVar2.f97803h;
                    M m136 = cVar2.f97802g;
                    M m137 = cVar2.f97801f;
                    M m138 = cVar2.f97800e;
                    dVar = cVar2.f97799d;
                    Sc.s.b(obj2);
                    m36 = m108;
                    m35 = m109;
                    m33 = m111;
                    m32 = m112;
                    m29 = m114;
                    m28 = m115;
                    m26 = m118;
                    m24 = m122;
                    m37 = m123;
                    m23 = m124;
                    m38 = m125;
                    m17 = m126;
                    m16 = m127;
                    m14 = m129;
                    m18 = m130;
                    m19 = m132;
                    m22 = m133;
                    m44 = m136;
                    m43 = m137;
                    arrayList4 = arrayList12;
                    videoMetric = videoMetric4;
                    arrayList2 = arrayList14;
                    m34 = m110;
                    m31 = m113;
                    m46 = m120;
                    m15 = m128;
                    m39 = m135;
                    m27 = m117;
                    m42 = m138;
                    m47 = m116;
                    obj = obj2;
                    m45 = m121;
                    m21 = m131;
                    arrayList3 = arrayList13;
                    m25 = m119;
                    m41 = m134;
                }
                UserData userData = (UserData) obj;
                M m139 = m44;
                HardwareInfo hardwareInfo = dVar.f97824c.getHardwareInfo();
                String str = (String) m17.f71787a;
                DateTime dateTime = new DateTime();
                Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
                x xVar = dVar.f97826e;
                String F11 = xVar.F();
                BuildInfoManager buildInfoManager = dVar.f97825d;
                String appVersion = buildInfoManager.getAppVersion();
                int buildNumber = buildInfoManager.getBuildNumber();
                String str2 = !xVar.D().c() ? "PLATFORM_ANDROID" : "android";
                Namespace f11 = dVar.f97823b.f();
                DeviceInfoManager deviceInfoManager = dVar.f97824c;
                TraceEntity.Attributes attributes = new TraceEntity.Attributes(f11, appVersion, buildNumber, deviceInfoManager.getScreenResolution().e().intValue(), deviceInfoManager.getScreenResolution().f().intValue(), xVar.w(), str2, deviceInfoManager.getDeviceType().getType(), deviceInfoManager.getOsVersion(), deviceInfoManager.getDeviceModel(), hardwareInfo.getCpu().getCores(), (Double) dVar.f97828g.getValue(), (Long) dVar.f97829h.getValue(), (String) m26.f71787a, (String) m27.f71787a, (String) m47.f71787a, (List) m31.f71787a, (String) m34.f71787a, deviceInfoManager.getScreenDensity());
                Integer num = new Integer(userData.getAbGroup());
                Long l11 = new Long(userData.getRegionId());
                userId = userData.getUserId();
                if (userId.length() == 0) {
                    userId = null;
                }
                TraceEntity.User user = new TraceEntity.User(num, l11, userId, userData.getCompanyId());
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                TraceEntity.Page page = new TraceEntity.Page((String) m14.f71787a, str4, (String) m15.f71787a, str5, str6, null, (String) m46.f71787a, (String) m25.f71787a, (String) m45.f71787a, null, str3, 1594, null);
                TraceEntity.Widget widget = new TraceEntity.Widget(str4, (String) m16.f71787a, str5, str6, false ? 1 : 0, null, null, null, false ? 1 : 0, str3, null, false ? 1 : 0, null, null, null, null, null, null, null, 524285, null);
                TraceEntity.Obj obj3 = new TraceEntity.Obj((String) m42.f71787a, null, 2, false ? 1 : 0);
                ConnectionType connectionType = (ConnectionType) m43.f71787a;
                String str7 = (String) m139.f71787a;
                Integer num2 = (Integer) m39.f71787a;
                Integer num3 = (Integer) m41.f71787a;
                Integer num4 = (Integer) m19.f71787a;
                String str8 = (String) m21.f71787a;
                Integer num5 = (Integer) m22.f71787a;
                String str9 = (String) m18.f71787a;
                CacheResult cacheResult = (CacheResult) m38.f71787a;
                String name = cacheResult == null ? cacheResult.name() : null;
                String str10 = (String) m23.f71787a;
                String str11 = (String) m37.f71787a;
                Boolean bool = (Boolean) m24.f71787a;
                Integer num6 = (Integer) m28.f71787a;
                Boolean bool2 = (Boolean) m29.f71787a;
                MapLoadingSteps mapLoadingSteps = (MapLoadingSteps) m32.f71787a;
                NavigationType navigationType = (NavigationType) m33.f71787a;
                TraceEntity.Properties properties = new TraceEntity.Properties(connectionType, str7, num2, num3, num5, num4, str8, str9, name, str10, str11, bool, num6, bool2, mapLoadingSteps, (navigationType != null || (a11 = navigationType.a()) == null) ? null : a11.getType());
                G g10 = (G) m35.f71787a;
                return new TraceEntity(null, str, dateTime, F11, attributes, user, page, obj3, properties, widget, (TraceEntity.MapSdk) m36.f71787a, arrayList4, arrayList3, videoMetric, arrayList2, g10 == null ? new TraceEntity.PclPage(g10.b(), g10.d(), g10.c(), g10.a()) : null, 1, null);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj22 = cVar2.f97796N;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f97798P;
        if (i11 != 0) {
        }
        UserData userData2 = (UserData) obj;
        M m1392 = m44;
        HardwareInfo hardwareInfo2 = dVar.f97824c.getHardwareInfo();
        String str12 = (String) m17.f71787a;
        DateTime dateTime2 = new DateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime2, "now(...)");
        x xVar2 = dVar.f97826e;
        String F112 = xVar2.F();
        BuildInfoManager buildInfoManager2 = dVar.f97825d;
        String appVersion2 = buildInfoManager2.getAppVersion();
        int buildNumber2 = buildInfoManager2.getBuildNumber();
        String str22 = !xVar2.D().c() ? "PLATFORM_ANDROID" : "android";
        Namespace f112 = dVar.f97823b.f();
        DeviceInfoManager deviceInfoManager2 = dVar.f97824c;
        TraceEntity.Attributes attributes2 = new TraceEntity.Attributes(f112, appVersion2, buildNumber2, deviceInfoManager2.getScreenResolution().e().intValue(), deviceInfoManager2.getScreenResolution().f().intValue(), xVar2.w(), str22, deviceInfoManager2.getDeviceType().getType(), deviceInfoManager2.getOsVersion(), deviceInfoManager2.getDeviceModel(), hardwareInfo2.getCpu().getCores(), (Double) dVar.f97828g.getValue(), (Long) dVar.f97829h.getValue(), (String) m26.f71787a, (String) m27.f71787a, (String) m47.f71787a, (List) m31.f71787a, (String) m34.f71787a, deviceInfoManager2.getScreenDensity());
        Integer num7 = new Integer(userData2.getAbGroup());
        Long l112 = new Long(userData2.getRegionId());
        userId = userData2.getUserId();
        if (userId.length() == 0) {
        }
        TraceEntity.User user2 = new TraceEntity.User(num7, l112, userId, userData2.getCompanyId());
        String str32 = null;
        String str42 = null;
        String str52 = null;
        String str62 = null;
        TraceEntity.Page page2 = new TraceEntity.Page((String) m14.f71787a, str42, (String) m15.f71787a, str52, str62, null, (String) m46.f71787a, (String) m25.f71787a, (String) m45.f71787a, null, str32, 1594, null);
        TraceEntity.Widget widget2 = new TraceEntity.Widget(str42, (String) m16.f71787a, str52, str62, false ? 1 : 0, null, null, null, false ? 1 : 0, str32, null, false ? 1 : 0, null, null, null, null, null, null, null, 524285, null);
        TraceEntity.Obj obj32 = new TraceEntity.Obj((String) m42.f71787a, null, 2, false ? 1 : 0);
        ConnectionType connectionType2 = (ConnectionType) m43.f71787a;
        String str72 = (String) m1392.f71787a;
        Integer num22 = (Integer) m39.f71787a;
        Integer num32 = (Integer) m41.f71787a;
        Integer num42 = (Integer) m19.f71787a;
        String str82 = (String) m21.f71787a;
        Integer num52 = (Integer) m22.f71787a;
        String str92 = (String) m18.f71787a;
        CacheResult cacheResult2 = (CacheResult) m38.f71787a;
        if (cacheResult2 == null) {
        }
        String str102 = (String) m23.f71787a;
        String str112 = (String) m37.f71787a;
        Boolean bool3 = (Boolean) m24.f71787a;
        Integer num62 = (Integer) m28.f71787a;
        Boolean bool22 = (Boolean) m29.f71787a;
        MapLoadingSteps mapLoadingSteps2 = (MapLoadingSteps) m32.f71787a;
        NavigationType navigationType2 = (NavigationType) m33.f71787a;
        TraceEntity.Properties properties2 = new TraceEntity.Properties(connectionType2, str72, num22, num32, num52, num42, str82, str92, name, str102, str112, bool3, num62, bool22, mapLoadingSteps2, (navigationType2 != null || (a11 = navigationType2.a()) == null) ? null : a11.getType());
        G g102 = (G) m35.f71787a;
        return new TraceEntity(null, str12, dateTime2, F112, attributes2, user2, page2, obj32, properties2, widget2, (TraceEntity.MapSdk) m36.f71787a, arrayList4, arrayList3, videoMetric, arrayList2, g102 == null ? new TraceEntity.PclPage(g102.b(), g102.d(), g102.c(), g102.a()) : null, 1, null);
    }
}
