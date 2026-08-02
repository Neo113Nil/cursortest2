package defpackage;

import android.app.Application;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.analytics.models.AnalyticsPlayerViewingTransitionState;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.ads.h;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.delegates.BlazePipDelegate;
import com.blaze.blazesdk.delegates.BlazePipState;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.videos.models.local.VideoViewed;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.g;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.J;
import com.blaze.blazesdk.players.models.L;
import com.blaze.blazesdk.players.models.N;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerCastButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.i4m;
import defpackage.zwm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w3m extends c1m {
    public final aeh A0;
    public final aeh B0;
    public long C0;
    public BlazeCachingLevel D0;
    public AnalyticsPlayerViewingTransitionState.PlayerViewingMode E0;
    public com.blaze.blazesdk.features.videos.models.ui.a F0;
    public i G0;
    public final fdi H0;
    public final fdi I0;
    public final long J0;
    public yda K0;
    public final long L0;
    public yda M0;
    public final fdi N0;
    public final fdi O0;
    public final drm P0;
    public int Q0;
    public boolean l0;
    public String n0;
    public B p0;
    public SeekType s0;
    public SeekDirection t0;
    public long u0;
    public long v0;
    public boolean x0;
    public long y0;
    public final qom k0 = qom.b;
    public int m0 = -1;
    public List o0 = km5.a;
    public final long q0 = Ua.s;
    public final long r0 = Ua.s;
    public final mqi w0 = ypa.b(new o2m(this, 2));
    public float z0 = 1.0f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: w3m$a$a, reason: collision with other inner class name */
        public static final class C1357a extends a {
            public final boolean a;

            public C1357a(boolean z) {
                super(null);
                this.a = z;
            }

            public static C1357a copy$default(C1357a c1357a, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = c1357a.a;
                }
                c1357a.getClass();
                return new C1357a(z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1357a) && this.a == ((C1357a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return lnb.r(new StringBuilder("ForceHideOverlay(shouldShowSeekbar="), this.a, ')');
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class b extends a {
            public final boolean a;

            public b(boolean z) {
                super(null);
                this.a = z;
            }

            public static b copy$default(b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.a;
                }
                bVar.getClass();
                return new b(z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return lnb.r(new StringBuilder("ShowOverlay(shouldLogAction="), this.a, ')');
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public w3m() {
        aeh b = beh.b(0, 1, null, 5);
        this.A0 = b;
        this.B0 = b;
        this.D0 = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        wpm.d.getClass();
        fdi a2 = gdi.a(new wpm(true, true, false));
        this.H0 = a2;
        this.I0 = a2;
        this.J0 = 300L;
        this.L0 = 2000L;
        fdi a3 = gdi.a(wyl.a);
        this.N0 = a3;
        this.O0 = a3;
        drm drmVar = new drm(false);
        this.P0 = drmVar;
        x5m.safeViewModelScopeIO$default(this, null, new jsm(this, null), 1, null);
        int i = 3;
        drmVar.c = new n2m(this, i);
        drmVar.d = new s2m(this, 1);
        drmVar.e = new o2m(this, i);
        drmVar.f = new o2m(this, 4);
        this.Q0 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(w3m w3mVar, n4m n4mVar, Pair pair, boolean z, sq3 sq3Var) {
        jxm jxmVar;
        int i;
        gim.e eVar;
        BlazeDatabase instance;
        s9m videosViewedDao;
        s9m videosViewedDao2;
        Object obj;
        String str;
        w3m w3mVar2 = w3mVar;
        w3mVar2.getClass();
        qom qomVar = w3mVar2.k0;
        if (sq3Var instanceof jxm) {
            jxmVar = (jxm) sq3Var;
            int i2 = jxmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jxmVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = jxmVar.t;
                lu3 lu3Var = lu3.a;
                i = jxmVar.v;
                if (i != 0) {
                    y6a.M(obj2);
                    gim gimVar = n4mVar != null ? n4mVar.b : null;
                    gim.e eVar2 = gimVar instanceof gim.e ? (gim.e) gimVar : null;
                    if (eVar2 == null) {
                        return Unit.a;
                    }
                    VideoModel videoModel = eVar2.a;
                    if (w3mVar2.A) {
                        return Unit.a;
                    }
                    long longValue = ((Number) pair.a).longValue();
                    long longValue2 = ((Number) pair.b).longValue();
                    long j = w3mVar2.C0;
                    boolean z2 = j >= longValue + 5000 || j <= longValue - 5000;
                    boolean z3 = 1 <= longValue2 && longValue2 <= longValue;
                    w3mVar2.C0 = longValue;
                    if (z3) {
                        String str2 = videoModel.id;
                        jxmVar.r = w3mVar2;
                        jxmVar.s = eVar2;
                        jxmVar.v = 1;
                        qomVar.getClass();
                        try {
                            Set<Map.Entry> entrySet = qom.c.entrySet();
                            entrySet.getClass();
                            for (Map.Entry entry : entrySet) {
                                Object value = entry.getValue();
                                value.getClass();
                                Iterator it = ((Iterable) value).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (Intrinsics.c(((VideoModel) obj).id, str2)) {
                                        break;
                                    }
                                }
                                VideoModel videoModel2 = (VideoModel) obj;
                                if (videoModel2 != null) {
                                    videoModel2.k = true;
                                }
                                qom.d.b(entry.getKey());
                            }
                            BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
                            BlazeDatabase instance2 = companion.instance();
                            Integer num = (instance2 == null || (videosViewedDao2 = instance2.getVideosViewedDao()) == null) ? null : new Integer(videosViewedDao2.a(str2));
                            if (num != null && num.intValue() == 0 && (instance = companion.instance()) != null && (videosViewedDao = instance.getVideosViewedDao()) != null) {
                                o02.L(videosViewedDao.c(new VideoViewed(str2, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)));
                            }
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                        if (Unit.a == lu3Var) {
                            return lu3Var;
                        }
                        eVar = eVar2;
                        qom qomVar2 = w3mVar2.k0;
                        str = eVar.a.id;
                        jxmVar.r = null;
                        jxmVar.s = null;
                        jxmVar.v = 2;
                        qomVar2.getClass();
                        if (qom.e(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == lu3Var) {
                        }
                    } else if (z || z2) {
                        jxmVar.v = 3;
                        qomVar.getClass();
                        if (qom.e(videoModel.id, longValue) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else if (i == 1) {
                    eVar = jxmVar.s;
                    w3mVar2 = jxmVar.r;
                    y6a.M(obj2);
                    qom qomVar22 = w3mVar2.k0;
                    str = eVar.a.id;
                    jxmVar.r = null;
                    jxmVar.s = null;
                    jxmVar.v = 2;
                    qomVar22.getClass();
                    if (qom.e(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 2 && i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        jxmVar = new jxm(w3mVar2, sq3Var);
        Object obj22 = jxmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = jxmVar.v;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static ArrayList Y(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            gim gimVar = ((n4m) obj).b;
            if (!(gimVar instanceof gim.c) || !((gim.c) gimVar).a.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean j0(w3m w3mVar) {
        if (w3mVar.D() == null) {
            return false;
        }
        String str = w3mVar.q;
        n4m D = w3mVar.D();
        return Intrinsics.c(CollectionsKt.j0(w3mVar.t), w3mVar.D()) && Intrinsics.c(str, D != null ? D.a : null) && w3mVar.E() > 0 && w3mVar.G() >= w3mVar.E();
    }

    public static /* synthetic */ void onPageSelected$default(w3m w3mVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        w3mVar.c0(i, z);
    }

    public static /* synthetic */ void updatePipMode$default(w3m w3mVar, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        w3mVar.b0(i, str, z);
    }

    @Override // defpackage.c1m
    public final t I() {
        return this.k0;
    }

    @Override // defpackage.c1m
    public final boolean K() {
        tcm a2;
        fdi fdiVar;
        fam famVar = this.e;
        if (famVar == null || (a2 = famVar.a()) == null || (fdiVar = ((com.blaze.blazesdk.players.a) a2).k) == null) {
            return false;
        }
        return ((Boolean) fdiVar.getValue()).booleanValue();
    }

    @Override // defpackage.c1m
    public final boolean L() {
        bqm bqmVar = (bqm) this.P0.a.getValue();
        bqmVar.getClass();
        return (bqmVar instanceof vjm) || (bqmVar instanceof inm);
    }

    @Override // defpackage.c1m
    public final boolean M() {
        return this.P0.b != null;
    }

    @Override // defpackage.c1m
    public final void N() {
        n4m D = D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            mzm.b(this, EventActionName.PLAYBACK_INITIAL_START, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
        }
    }

    @Override // defpackage.c1m
    public final void O() {
        if (L()) {
            return;
        }
        B b = this.p0;
        if (b != null) {
            H h = H.APP_BACKGROUND;
            h.getClass();
            b.c = h;
        }
        mzm.e(this);
    }

    @Override // defpackage.c1m
    public final void P() {
        drm drmVar = this.P0;
        dim dimVar = drmVar.b;
        drmVar.b = null;
        if (dimVar != null) {
            return;
        }
        B b = this.p0;
        if (b != null) {
            J j = J.b;
            j.getClass();
            b.b = j;
        }
        mzm.d(this, false);
    }

    @Override // defpackage.c1m
    public final void Q() {
        tcm a2;
        try {
            fam famVar = this.e;
            if (famVar == null || (a2 = famVar.a()) == null) {
                return;
            }
            ((com.blaze.blazesdk.players.a) a2).e = new s2m(this, 0);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void U() {
        Object obj;
        w3m w3mVar;
        h0(new a.b(true));
        try {
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.e) {
                gim.e eVar = (gim.e) gimVar;
                w3mVar = this;
                mzm.b(w3mVar, EventActionName.SHARE_CLICK, mzm.createVideosPlayerProps$default(w3mVar, eVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
            } else {
                w3mVar = this;
            }
            n4m D2 = w3mVar.D();
            if (D2 == null) {
                return;
            }
            String d = nxl.d(D2);
            fam famVar = w3mVar.e;
            w3mVar.d0 = famVar != null ? famVar.isPlaying() : false;
            try {
                try {
                    try {
                        obj = null;
                        try {
                            m(BlazePlayerType.VIDEOS, BlazeShareParams.BlazeShareContentType.Video.INSTANCE, d, D2.a, D2.d, D2.f);
                        } catch (Throwable th) {
                            th = th;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, obj);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = null;
            }
        } catch (Throwable th5) {
            th = th5;
            obj = null;
        }
    }

    public final void V() {
        float f;
        if (this.x0) {
            long G = G();
            long j = G - this.y0;
            this.x0 = false;
            fam famVar = this.e;
            if (famVar != null) {
                famVar.a(1.0f);
            }
            h0(new a.b(false));
            PlaybackSpeedType playbackSpeedType = PlaybackSpeedType.PRESS_HOLD;
            long j2 = this.y0;
            playbackSpeedType.getClass();
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.e) {
                f = 1.0f;
                mzm.b(this, EventActionName.PLAYBACK_SPEED_CHANGE, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, playbackSpeedType, Long.valueOf(j2), Long.valueOf(G), Long.valueOf(j), 2046, null));
            } else {
                f = 1.0f;
            }
            this.z0 = f;
        }
    }

    public final BlazeContentExtraInfo W(Integer num) {
        VideoModel videoModel;
        com.blaze.blazesdk.app_configurations.models.ads.i iVar = ((v0m) ((i7m) this.b0.getValue())).d;
        Map map = null;
        if (iVar instanceof h) {
            if (num == null) {
                return new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
            }
            n4m n4mVar = (n4m) CollectionsKt.a0(num.intValue(), this.o0);
            gim gimVar = n4mVar != null ? n4mVar.b : null;
            gim.e eVar = gimVar instanceof gim.e ? (gim.e) gimVar : null;
            if (eVar != null && (videoModel = eVar.a) != null) {
                map = videoModel.p;
            }
        } else if (iVar != null) {
            zzl.b();
            return null;
        }
        Map map2 = map;
        return new BlazeContentExtraInfo(null, map2, null, map2, null, 21, null);
    }

    public final List Z(int i, List list) {
        i iVar = this.G0;
        if (iVar == null) {
            return list;
        }
        fsf fsfVar = new fsf();
        fsfVar.a = list;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.F0;
        if (aVar != null) {
            if ((aVar instanceof a.b) || (aVar instanceof a.C0011a)) {
                Unit unit = Unit.a;
            } else {
                if (!(aVar instanceof a.e)) {
                    zzl.b();
                    return null;
                }
                if (iVar.a) {
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new zwl(new q7m(i)).a((n4m) it.next()));
                    }
                    list = arrayList;
                }
                fsfVar.a = list;
                Unit unit2 = Unit.a;
            }
        }
        return (List) fsfVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r2 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r8 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r8 = defpackage.o3a.k(r7.o0, r8.intValue(), r0 + 1).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r8.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r0 = (defpackage.n4m) r8.next();
        r1 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if ((r1 instanceof gim.c) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r1 = ((gim.c) r1).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        defpackage.evl.dispatchOnMain$default(com.blaze.blazesdk.shared.BlazeSDK.INSTANCE, null, new defpackage.l0n(r1, W(java.lang.Integer.valueOf(r0.o + 1)), new defpackage.bcl(15, r7, r0), null), 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(int i) {
        int i2 = ((v0m) ((i7m) this.b0.getValue())).a;
        n4m n4mVar = (n4m) CollectionsKt.a0(i, this.t);
        if (n4mVar != null) {
            Iterator it = this.o0.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                if (Intrinsics.c(((n4m) next).a, n4mVar.a)) {
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public final void b0(int i, String str, boolean z) {
        boolean z2;
        fam famVar = this.e;
        boolean z3 = famVar != null && famVar.isPlaying();
        i4m bVar = z ? bgm.a : new i4m.b(i, str);
        drm drmVar = this.P0;
        bqm bqmVar = (bqm) drmVar.a.getValue();
        drmVar.a(bVar, z3);
        bqm bqmVar2 = (bqm) drmVar.a.getValue();
        boolean z4 = bqmVar instanceof vjm;
        if (z4 || !(bqmVar2 instanceof vjm)) {
            if (!z4 || (bqmVar2 instanceof vjm)) {
                return;
            }
            mzm.a(this);
            l0(false);
            return;
        }
        n4m D = D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.e) {
            gim.e eVar = (gim.e) gimVar;
            z2 = true;
            mzm.b(this, EventActionName.PIP_ENABLED, mzm.createVideosPlayerProps$default(this, eVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
        } else {
            z2 = true;
        }
        l0(z2);
    }

    public final void c0(int i, boolean z) {
        try {
            try {
                int numOfVideosToPrefetchWhenPlaying = this.D0.getNumOfVideosToPrefetchWhenPlaying() + i;
                int i2 = i + 1;
                if (i2 <= numOfVideosToPrefetchWhenPlaying) {
                    while (true) {
                        n4m n4mVar = (n4m) CollectionsKt.a0(i2, this.t);
                        if (n4mVar != null) {
                            o(n4mVar, null);
                        }
                        if (i2 == numOfVideosToPrefetchWhenPlaying) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
            a0(i);
            n4m n4mVar2 = (n4m) CollectionsKt.a0(i, this.t);
            if (n4mVar2 == null) {
                return;
            }
            k0(n4mVar2, z);
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }

    public final void d0(long j, long j2, Function1 function1, Function0 function0, Function0 function02) {
        yda ydaVar = this.M0;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        yda ydaVar2 = this.K0;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        if (j - j2 > this.J0) {
            function1.invoke(Long.valueOf(j));
            function0.invoke();
            this.K0 = x5m.safeViewModelScopeIO$default(this, null, new pjm(this, null), 1, null);
        } else {
            boolean booleanValue = ((Boolean) function02.invoke()).booleanValue();
            function1.invoke(0L);
            if (booleanValue) {
                return;
            }
            h0(((wpm) this.H0.getValue()).a ? new a.C1357a(false) : new a.b(true));
        }
    }

    @Override // defpackage.c1m, defpackage.ltk
    public final void e() {
        super.e();
        if (this.x0) {
            V();
        }
        ((vyd) this.w0.getValue()).a();
        yda ydaVar = this.K0;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.K0 = null;
        yda ydaVar2 = this.M0;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.M0 = null;
        drm drmVar = this.P0;
        if (((bqm) drmVar.a.getValue()) instanceof vjm) {
            l0(false);
        }
        drmVar.c = null;
        drmVar.d = null;
        drmVar.e = null;
        drmVar.f = null;
        if (J() && this.U) {
            this.k0.g(H());
        }
        if (this.i != null && !this.f0) {
            gzk gzkVar = gzk.a;
            gzk.c(BlazePlayerType.VIDEOS, C(), this.j);
        }
        BlazePlayerType blazePlayerType = BlazePlayerType.VIDEOS;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.F0;
        if (aVar != null) {
            ufl uflVar = new ufl(9, this, blazePlayerType);
            if (!(aVar instanceof a.b) && !(aVar instanceof a.C0011a)) {
                if (aVar instanceof a.e) {
                    Unit unit = Unit.a;
                    return;
                } else {
                    zzl.b();
                    return;
                }
            }
            a.d b = aVar.b();
            if (b instanceof a.d.C0014a) {
                uflVar.invoke();
            } else if (b instanceof g) {
                Unit unit2 = Unit.a;
            } else {
                zzl.b();
            }
        }
    }

    public final void e0(AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode, boolean z) {
        AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode2 = this.E0;
        if (z && playerViewingMode2 != playerViewingMode) {
            playerViewingMode.getClass();
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.e) {
                mzm.b(this, EventActionName.VIEWING_MODE_TRANSITION, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, playerViewingMode, false, null, null, null, null, 32254, null));
            }
        }
        this.E0 = playerViewingMode;
    }

    public final void f0(VideoModel videoModel) {
        videoModel.getClass();
        try {
            h0(new a.b(true));
            x5m.safeViewModelScopeIO$default(this, null, new plm(this, videoModel, null), 1, null);
            if (videoModel.v) {
                n4m D = D();
                gim gimVar = D != null ? D.b : null;
                if (gimVar instanceof gim.e) {
                    mzm.b(this, EventActionName.LIKE, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                    return;
                }
                return;
            }
            n4m D2 = D();
            gim gimVar2 = D2 != null ? D2.b : null;
            if (gimVar2 instanceof gim.e) {
                mzm.b(this, EventActionName.UNLIKE, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar2, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.c1m
    public final fam g(BlazeVideoManager blazeVideoManager) {
        BlazeVideosPlayerCastButtonStyle cast;
        Application application$blazesdk_release;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.F0;
        BlazeVideosPlayerStyle a2 = aVar != null ? com.blaze.blazesdk.features.videos.models.ui.h.a(aVar) : null;
        return (a2 == null || (cast = a2.getCast()) == null || !cast.isVisible() || (application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release()) == null) ? blazeVideoManager : new com.blaze.blazesdk.players.a(blazeVideoManager, application$blazesdk_release);
    }

    public final void g0(H h) {
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.F0;
        if (aVar != null) {
            h.getClass();
            if (com.blaze.blazesdk.features.videos.models.ui.h.d(aVar)) {
                h = H.VIEWING_MODE_TRANSITION;
            }
            B b = this.p0;
            if (b != null) {
                h.getClass();
                b.c = h;
            }
        }
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = this.F0;
        if (aVar2 != null && com.blaze.blazesdk.features.videos.models.ui.h.d(aVar2)) {
            n4m D = D();
            String str = null;
            String str2 = D != null ? D.a : null;
            if (this.F0 instanceof a.b) {
                n4m n4mVar = (n4m) CollectionsKt.a0(0, this.t);
                if (n4mVar != null) {
                    str = n4mVar.a;
                }
            } else {
                str = str2;
            }
            if (str2 == null || str == null || str2.equals(str)) {
                return;
            }
        }
        mzm.e(this);
    }

    public final void h0(a aVar) {
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = this.F0;
        if (aVar2 != null) {
            if (!(aVar2 instanceof a.b)) {
                if (aVar2 instanceof a.C0011a) {
                    x5m.safeViewModelScopeIO$default(this, null, new aym(this, aVar, null), 1, null);
                    return;
                } else if (aVar2 instanceof a.e) {
                    x5m.safeViewModelScopeIO$default(this, null, new aym(this, aVar, null), 1, null);
                    return;
                } else {
                    zzl.b();
                    return;
                }
            }
            a.d dVar = ((a.b) aVar2).c;
            if (dVar instanceof a.d.C0014a) {
                x5m.safeViewModelScopeIO$default(this, null, new aym(this, aVar, null), 1, null);
            } else if (dVar instanceof g) {
                Unit unit = Unit.a;
            } else {
                zzl.b();
            }
        }
    }

    @Override // defpackage.c1m
    public final void i(long j) {
        yda ydaVar = this.K0;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        h0(new a.C1357a(true));
        super.i(j);
    }

    public final void i0(List list, BlazeVideosAdsConfigType blazeVideosAdsConfigType, int i) {
        Object invoke;
        BlazeAdInfoModel blazeAdInfoModel;
        c cVar;
        List list2;
        c.C0006c c;
        com.blaze.blazesdk.app_configurations.models.ads.i iVar;
        c cVar2;
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle exit;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.F0;
        if (aVar == null) {
            return;
        }
        el2 el2Var = new el2(list, 8);
        if (aVar instanceof a.b) {
            a.d dVar = ((a.b) aVar).c;
            if (dVar instanceof a.d.C0014a) {
                invoke = el2Var.invoke();
            } else {
                if (!(dVar instanceof g)) {
                    zzl.b();
                    return;
                }
                invoke = zmm.a(CollectionsKt.L0(list, 1));
            }
        } else if (aVar instanceof a.C0011a) {
            invoke = el2Var.invoke();
        } else {
            if (!(aVar instanceof a.e)) {
                zzl.b();
                return;
            }
            invoke = el2Var.invoke();
        }
        List Z = Z(i, (List) invoke);
        i7m i7mVar = (i7m) this.b0.getValue();
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = this.F0;
        BlazeVideosPlayerStyle a2 = aVar2 != null ? com.blaze.blazesdk.features.videos.models.ui.h.a(aVar2) : null;
        if (a2 != null && (buttons = a2.getButtons()) != null && (exit = buttons.getExit()) != null) {
            exit.isVisibleForAds();
        }
        v0m v0mVar = (v0m) i7mVar;
        v0mVar.getClass();
        Z.getClass();
        blazeVideosAdsConfigType.getClass();
        tul tulVar = jdm.d;
        c.C0006c c2 = v0m.c(blazeVideosAdsConfigType, (tulVar == null || (cVar2 = tulVar.c) == null) ? null : cVar2.c);
        if (c2 != null) {
            com.blaze.blazesdk.app_configurations.models.ads.i iVar2 = c2.a;
            v0mVar.d = iVar2;
            if (!(iVar2 instanceof h)) {
                zzl.b();
                return;
            }
            int i2 = ((h) iVar2).b;
            ArrayList arrayList = new ArrayList(Z);
            n4m n4mVar = (n4m) CollectionsKt.firstOrNull(Z);
            BlazeAdInfoModel blazeAdInfoModel2 = n4mVar != null ? n4mVar.s : null;
            if (blazeAdInfoModel2 != null && (cVar = blazeAdInfoModel2.c) != null && (list2 = cVar.c) != null && (c = v0m.c(BlazeVideosAdsConfigType.FIXED_PERCENTAGES, list2)) != null && (iVar = c.a) != null && (iVar instanceof h)) {
                i2 = ((h) iVar).b;
            }
            if (i2 > 0) {
                for (int i3 = this.m0; i3 < arrayList.size(); i3 += i2) {
                    n4m n4mVar2 = (n4m) CollectionsKt.a0(i3, arrayList);
                    if (n4mVar2 == null || (blazeAdInfoModel = n4mVar2.r) == null) {
                        blazeAdInfoModel = n4mVar2 != null ? n4mVar2.s : null;
                    }
                    com.blaze.blazesdk.players.models.c d = v0m.d(blazeAdInfoModel);
                    if (d != null && n4mVar2 != null) {
                        n4mVar2.q = (com.blaze.blazesdk.players.models.c) ParcelableExtensionKt.blazeDeepCopy(d);
                    }
                    if (n4mVar2 != null) {
                        arrayList.set(i3, n4mVar2);
                    }
                }
            }
            Z = arrayList;
        }
        this.o0 = Z;
        ArrayList arrayList2 = new ArrayList(k13.r(Z, 10));
        int i4 = 0;
        for (Object obj : Z) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                b.q();
                throw null;
            }
            n4m copy$default = n4m.copy$default((n4m) obj, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8388607, null);
            copy$default.o = i4;
            arrayList2.add(copy$default);
            i4 = i5;
        }
        this.o0 = arrayList2;
        ArrayList Y = Y(arrayList2);
        this.t = Y;
        if (Y.isEmpty()) {
            return;
        }
        fdi fdiVar = this.u;
        fdiVar.getClass();
        fdiVar.m(null, Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    @Override // defpackage.c1m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j, boolean z) {
        Long l;
        super.j(j, z);
        h0(new a.b(false));
        this.s0 = SeekType.SEEK_BAR;
        Long l2 = this.C;
        if (l2 != null) {
            long longValue = l2.longValue();
            Long l3 = this.D;
            if (l3 != null) {
                l = Long.valueOf(l3.longValue() - longValue);
                this.t0 = l == null ? l.longValue() > 0 ? SeekDirection.FORWARD : SeekDirection.BACKWARD : null;
                mzm.logSeekEvent$default(this, null, 1, null);
            }
        }
        l = null;
        this.t0 = l == null ? l.longValue() > 0 ? SeekDirection.FORWARD : SeekDirection.BACKWARD : null;
        mzm.logSeekEvent$default(this, null, 1, null);
    }

    @Override // defpackage.c1m
    public final void k(u uVar, boolean z) {
        gim gimVar;
        uVar.getClass();
        if (z && !Intrinsics.c(this.Z.getValue(), uVar)) {
            if (uVar.equals(a1n.a)) {
                n4m D = D();
                gimVar = D != null ? D.b : null;
                if (gimVar instanceof gim.e) {
                    mzm.b(this, EventActionName.FORCED_PLAYBACK_PLAY, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                }
            } else {
                if (!uVar.equals(n1n.a)) {
                    zzl.b();
                    return;
                }
                n4m D2 = D();
                gimVar = D2 != null ? D2.b : null;
                if (gimVar instanceof gim.e) {
                    mzm.b(this, EventActionName.FORCED_PLAYBACK_PAUSE, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                }
            }
        }
        super.k(uVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:7:0x000f, B:10:0x0019, B:12:0x001d, B:13:0x0024, B:15:0x0037, B:16:0x003d, B:19:0x0060, B:22:0x0075, B:24:0x007b, B:26:0x0081, B:28:0x0085, B:30:0x008f, B:32:0x0095, B:33:0x009a, B:38:0x00c9, B:39:0x00cf, B:42:0x00cd, B:43:0x00a8, B:45:0x00ae, B:47:0x00bc, B:49:0x00c0, B:52:0x0067, B:53:0x0044, B:55:0x004b, B:56:0x004f, B:58:0x0053, B:61:0x0059, B:64:0x00d8), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:7:0x000f, B:10:0x0019, B:12:0x001d, B:13:0x0024, B:15:0x0037, B:16:0x003d, B:19:0x0060, B:22:0x0075, B:24:0x007b, B:26:0x0081, B:28:0x0085, B:30:0x008f, B:32:0x0095, B:33:0x009a, B:38:0x00c9, B:39:0x00cf, B:42:0x00cd, B:43:0x00a8, B:45:0x00ae, B:47:0x00bc, B:49:0x00c0, B:52:0x0067, B:53:0x0044, B:55:0x004b, B:56:0x004f, B:58:0x0053, B:61:0x0059, B:64:0x00d8), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(n4m n4mVar, boolean z) {
        wom womVar;
        boolean z2;
        B b;
        VideoModel videoModel;
        try {
            if (!n4mVar.equals(D()) && !z) {
                boolean z3 = D() == null;
                if (this.x0) {
                    V();
                }
                ((vyd) this.w0.getValue()).a();
                Integer t = tz9.t(this.t, n4mVar);
                if (t != null) {
                    this.m0 = t.intValue();
                }
                if (D() != null) {
                    mzm.e(this);
                    B b2 = this.p0;
                    H h = b2 != null ? b2.c : null;
                    if ((h == H.USER_SKIP_PREVIOUS || h == H.USER_SKIP_NEXT) && b2 != null) {
                        L l = L.b;
                        l.getClass();
                        b2.b = l;
                    }
                }
                n4m D = D();
                if (D != null) {
                    x5m.safeViewModelScopeIO$default(this, null, new awm(this, D, (Pair) this.o.b, null), 1, null);
                }
                gim gimVar = n4mVar.b;
                gim.e eVar = gimVar instanceof gim.e ? (gim.e) gimVar : null;
                Float valueOf = (eVar == null || (videoModel = eVar.a) == null) ? null : Float.valueOf(videoModel.l);
                if (z3 && (this.F0 instanceof a.b)) {
                    valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                c1m.basePrepareMediaFor$default(this, n4mVar, z3, false, false, valueOf, 12, null);
                if (z3 && (womVar = this.g0) != null) {
                    boolean c = Intrinsics.c(n4mVar.a, womVar.a());
                    z2 = !c;
                    if (!c && (b = this.p0) != null) {
                        N n = N.b;
                        n.getClass();
                        b.b = n;
                    }
                    if (z2) {
                        this.e0 = true;
                    } else {
                        mzm.d(this, true);
                    }
                    x5m.safeViewModelScopeIO$default(this, null, new cnm(this, null), 1, null);
                    return;
                }
                z2 = true;
                if (z2) {
                }
                x5m.safeViewModelScopeIO$default(this, null, new cnm(this, null), 1, null);
                return;
            }
            c1m.basePrepareMediaFor$default(this, n4mVar, false, z, z, null, 18, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.c1m
    public final void l(n7k n7kVar) {
        n7kVar.getClass();
        fdi fdiVar = this.X;
        fdiVar.getClass();
        fdiVar.m(null, n7kVar);
    }

    public final void l0(boolean z) {
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        if (blazeSDK.getPipManager().getIsActive() == z) {
            return;
        }
        blazeSDK.getPipManager().setActive$blazesdk_release(z);
        BlazePipDelegate delegate = blazeSDK.getPipManager().getDelegate();
        if (delegate != null) {
            delegate.onPipStateChanged(BlazePlayerType.VIDEOS, this.i != null ? C().equals("entry_points_broadcast_id") ? this.j : C() : this.j, z ? BlazePipState.ON : BlazePipState.OFF);
        }
    }

    public final void m0(boolean z) {
        try {
            v(z);
            if (Boolean.valueOf(z).equals(this.H.d())) {
                return;
            }
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.e) {
                mzm.b(this, EventActionName.AUDIO, mzm.createVideosPlayerProps$default(this, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.c1m
    public final void u(zwm zwmVar) {
        zwmVar.getClass();
        if (zwmVar instanceof zwm.a) {
            ywl ywlVar = ((zwm.a) zwmVar).a;
            ywl ywlVar2 = ywl.d;
            if (ywlVar == ywlVar2 && this.x0) {
                V();
            }
            if (ywlVar == ywlVar2) {
                return;
            }
        } else if (!(zwmVar instanceof qxm) && !(zwmVar instanceof qvm)) {
            zzl.b();
            return;
        }
        super.u(zwmVar);
    }

    @Override // defpackage.c1m
    public final void z(boolean z) {
        if (z) {
            h0(b7m.a);
        }
    }
}
