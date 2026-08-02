package com.vk.clips.upload.vk.impl.uploader;

import android.content.Context;
import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$CancelPublish;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a86;
import xsna.aed;
import xsna.asu0;
import xsna.bpn0;
import xsna.bw;
import xsna.ced;
import xsna.cef;
import xsna.cvk;
import xsna.def;
import xsna.dhr0;
import xsna.e05;
import xsna.eed;
import xsna.f57;
import xsna.fgj0;
import xsna.fpf0;
import xsna.fxv0;
import xsna.ged;
import xsna.hg1;
import xsna.ia;
import xsna.ivv0;
import xsna.izs;
import xsna.j5g;
import xsna.jed;
import xsna.js1;
import xsna.jt50;
import xsna.kmv;
import xsna.kze;
import xsna.lgj0;
import xsna.med;
import xsna.mj1;
import xsna.n1d;
import xsna.n52;
import xsna.nf0;
import xsna.ogj0;
import xsna.pba;
import xsna.pgn;
import xsna.qcy;
import xsna.r1q;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s9;
import xsna.u4q0;
import xsna.wa3;
import xsna.wdq0;
import xsna.wfj0;
import xsna.wrp;
import xsna.xdd;
import xsna.ydd;
import xsna.ydf;
import xsna.yfb;
import xsna.ysg0;
import xsna.zg9;
import xsna.zik0;

/* compiled from: ClipsUploadController.kt */
/* loaded from: classes.dex */
public final class c {
    public static final c a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final SparseArray<jed> c;
    public static final SparseArray<xdd> d;
    public static final ClipsPersistentStore e;
    public static final io.reactivex.rxjava3.disposables.b f;
    public static final pgn g;
    public static volatile boolean h;
    public static final bpn0 i;

    /* compiled from: ClipsUploadController.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsPersistentStore.PersistedUpload.State.values().length];
            try {
                iArr[ClipsPersistentStore.PersistedUpload.State.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsPersistentStore.PersistedUpload.State.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(c.class, "persistentInitDisposable", "getPersistentInitDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
        a = new c();
        c = new SparseArray<>();
        d = new SparseArray<>();
        e = new ClipsPersistentStore();
        f = new io.reactivex.rxjava3.disposables.b();
        g = new pgn();
        i = new bpn0(new wa3(2));
        d();
    }

    public static void a(xdd xddVar, String str) {
        SparseArray<xdd> sparseArray = d;
        xdd xddVar2 = sparseArray.get(xddVar.f());
        if (xddVar2 == null) {
            return;
        }
        synchronized (xddVar2) {
            if (sparseArray.get(xddVar.f()) == null) {
                return;
            }
            SparseArray<jed> sparseArray2 = c;
            jed jedVar = sparseArray2.get(xddVar.f());
            if (jedVar != null) {
                a.getClass();
                j(jedVar);
                if (jedVar.a.h() || jedVar.c()) {
                    return;
                }
            }
            int f2 = xddVar.f();
            com.vk.upload.impl.a.b(f2, str);
            a.getClass();
            sparseArray2.remove(f2);
            xddVar.j(true);
            ysg0.b.a(new ydd(xddVar));
            a86 a86Var = new a86(VkUiUploadFailureType.CANCELLED, 4);
            Integer C = xddVar.d().Ab().C();
            String Z = xddVar.d().Ab().Z();
            if (C != null && Z != null) {
                a86Var.invoke(Long.valueOf(C.intValue()), Z);
            }
            ClipsPersistentStore.PersistedUpload c2 = e.c(xddVar.a());
            if (c2 != null) {
                asu0.a.getClass();
                asu0.n().submit(new nf0(c2, 2));
            }
            L.e("ClipsController", "upload " + xddVar.f() + " canceled");
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static jed b(int i2) {
        u4q0 u4q0Var = zik0.a;
        xdd xddVar = d.get(i2);
        if (xddVar == null) {
            return null;
        }
        SparseArray<jed> sparseArray = c;
        jed jedVar = sparseArray.get(i2);
        jed a2 = jedVar != null ? jedVar.a() : new jed(xddVar);
        sparseArray.put(i2, a2);
        return a2;
    }

    public static void c(ClipsPersistentStore.PersistedUpload persistedUpload, Throwable th) {
        ClipsDraftVk Ab = persistedUpload.Ab();
        if (Ab == null) {
            cvk.u(R.string.clips_upload_error, false);
            return;
        }
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        n1d n1dVar = new n1d(Ab, 7);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(n1dVar);
        dhr0.a.getClass();
        Context E = dhr0.E();
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9) {
            wdq0.a(E);
        } else if (r1q.a(th)) {
            wdq0.c(E);
        } else {
            wdq0.b(E);
        }
    }

    public static void d() {
        ClipsPersistentStore clipsPersistentStore = e;
        synchronized (clipsPersistentStore) {
            if (!h) {
                a.getClass();
                pgn pgnVar = g;
                qcy<Object>[] qcyVarArr = b;
                qcy<Object> qcyVar = qcyVarArr[0];
                if (((io.reactivex.rxjava3.disposables.c) pgnVar.b) == null) {
                    io.reactivex.rxjava3.disposables.c d2 = clipsPersistentStore.d(new zg9(2));
                    qcy<Object> qcyVar2 = qcyVarArr[0];
                    pgnVar.b(d2);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
    }

    public static List e(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            eed eedVar = (eed) sparseArray.valueAt(i2);
            Pair pair = eedVar instanceof aed ? null : eedVar instanceof ced ? new Pair(((ced) eedVar).a(), eedVar) : new Pair(eedVar.a.o(), eedVar);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return j5g.y0(arrayList);
    }

    public static SparseArray f(SparseArray sparseArray, SparseArray sparseArray2) {
        SparseArray sparseArray3 = new SparseArray();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            xdd xddVar = (xdd) sparseArray.valueAt(i2);
            int f2 = xddVar.f();
            u4q0 u4q0Var = zik0.a;
            eed eedVar = (jed) sparseArray2.get(f2);
            if (eedVar == null) {
                if (xddVar.h()) {
                    eedVar = new ydd(xddVar);
                } else if (xddVar.i()) {
                    new IllegalStateException("");
                    eedVar = new ged(xddVar);
                } else {
                    eedVar = xddVar.g() == null ? new med(xddVar) : null;
                }
            }
            if (eedVar != null) {
                sparseArray3.put(keyAt, eedVar);
            }
        }
        return sparseArray3;
    }

    public static void g(final int i2) {
        SparseArray<xdd> sparseArray = d;
        xdd xddVar = sparseArray.get(i2);
        if (xddVar == null) {
            return;
        }
        synchronized (xddVar) {
            try {
                u4q0 u4q0Var = zik0.a;
                xdd xddVar2 = sparseArray.get(i2);
                if (xddVar2 != null) {
                    ClipsPersistentStore clipsPersistentStore = e;
                    ClipsPersistentStore.PersistedUpload c2 = clipsPersistentStore.c(xddVar2.a());
                    if (c2 != null) {
                        synchronized (clipsPersistentStore) {
                            clipsPersistentStore.a.remove(c2.Bb());
                            clipsPersistentStore.a();
                            s3q0 s3q0Var = s3q0.a;
                        }
                        a.getClass();
                        ClipsDraftVk Ab = c2.Ab();
                        if (Ab != null) {
                            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                            s9 s9Var = new s9(Ab, 27);
                            clipsDraftPersistentStore.getClass();
                            ClipsDraftPersistentStore.o(s9Var);
                        }
                    }
                    if (!xddVar2.b()) {
                        asu0.a.getClass();
                        asu0.n().submit(new n52(xddVar2, 7));
                    }
                    c cVar = a;
                    int f2 = xddVar2.f();
                    cVar.getClass();
                    jed b2 = b(f2);
                    if (b2 != null) {
                        b2.f();
                        ysg0.b.a(b2);
                    }
                    UserId c3 = xddVar2.c();
                    Integer g2 = xddVar2.g();
                    int i3 = 0;
                    if (c3 != null && g2 != null) {
                        int intValue = g2.intValue();
                        Integer C = xddVar2.d().Ab().C();
                        String Z = xddVar2.d().Ab().Z();
                        if (C != null && Z != null) {
                            fxv0.a().a(new ivv0(C.intValue(), c3.b, intValue, Z));
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        hg1.e(f, k(c3, intValue, b(i2), new izs() { // from class: xsna.bef
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                                wjs0.a(new enc(clipVideoFile, i2));
                                if (fxc0.B().o0()) {
                                    wjs0.a(new cwr0(clipVideoFile, null, 26));
                                }
                                return s3q0.a;
                            }
                        }).subscribe(new ia(new cef(xddVar2, i2, i3), 15), new bw(new def(i2, xddVar2, i3), 16)));
                    }
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.CLIP_UPLOAD);
                    new ClipsUploadErrorsEventBuilder(new ClipsUploadErrorsEventBuilder.a.c(null, xddVar2.e(), false), ClipsUploadErrorsEventBuilder.b.C1786b.a, Integer.valueOf(xddVar2.d().Ab().n())).q();
                }
                L.e("ClipsController", "upload " + i2 + " done");
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(int i2, String str, Throwable th, boolean z) {
        SparseArray<xdd> sparseArray = d;
        xdd xddVar = sparseArray.get(i2);
        if (xddVar == null) {
            return;
        }
        synchronized (xddVar) {
            SparseArray<jed> sparseArray2 = c;
            jed jedVar = sparseArray2.get(i2);
            if (jedVar == null || !(jedVar.a.h() || jedVar.c())) {
                u4q0 u4q0Var = zik0.a;
                xdd xddVar2 = sparseArray.get(i2);
                if (xddVar2 != null) {
                    if (z) {
                        a.getClass();
                        sparseArray2.remove(i2);
                    }
                    int i3 = 4;
                    if (th instanceof InterruptedException) {
                        a.getClass();
                        sparseArray2.remove(i2);
                        xddVar2.j(true);
                        ysg0.b.a(new ydd(xddVar2));
                        a86 a86Var = new a86(VkUiUploadFailureType.CANCELLED, i3);
                        Integer C = xddVar2.d().Ab().C();
                        String Z = xddVar2.d().Ab().Z();
                        if (C != null && Z != null) {
                            a86Var.invoke(Long.valueOf(C.intValue()), Z);
                        }
                    } else {
                        xddVar2.k(true);
                        ysg0.b.a(new ged(xddVar2));
                        c cVar = a;
                        VkUiUploadFailureType vkUiUploadFailureType = VkUiUploadFailureType.ERROR;
                        cVar.getClass();
                        a86 a86Var2 = new a86(vkUiUploadFailureType, i3);
                        Integer C2 = xddVar2.d().Ab().C();
                        String Z2 = xddVar2.d().Ab().Z();
                        if (C2 != null && Z2 != null) {
                            a86Var2.invoke(Long.valueOf(C2.intValue()), Z2);
                        }
                        ClipsPersistentStore clipsPersistentStore = e;
                        ClipsPersistentStore.PersistedUpload c2 = clipsPersistentStore.c(xddVar2.a());
                        if (c2 != null) {
                            clipsPersistentStore.e(c2, ClipsPersistentStore.PersistedUpload.State.FAILED);
                            c(c2, th);
                        }
                        ClipsUploadErrorsEventBuilder.ErrorType a2 = d.a(th);
                        String e2 = xddVar2.e();
                        if (e2 != null) {
                            str = e2;
                        }
                        new ClipsUploadErrorsEventBuilder(new ClipsUploadErrorsEventBuilder.a.c(a2, str, false), new ClipsUploadErrorsEventBuilder.b.a(th), Integer.valueOf(xddVar2.d().Ab().n())).q();
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                }
                L.f("ClipsController", "upload " + i2 + " encountered error", th);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static void i(xdd xddVar) {
        xdd xddVar2;
        SparseArray<xdd> sparseArray = d;
        xdd xddVar3 = sparseArray.get(xddVar.f());
        if (xddVar3 == null) {
            return;
        }
        synchronized (xddVar3) {
            if (sparseArray.get(xddVar.f()) == null) {
                return;
            }
            SparseArray<jed> sparseArray2 = c;
            jed jedVar = sparseArray2.get(xddVar.f());
            if (jedVar == null || (xddVar2 = jedVar.a) == null || xddVar2.h()) {
                xddVar.k(false);
                xddVar.j(false);
                int f2 = xddVar.f();
                ClipsPersistentStore.PersistedUpload c2 = e.c(xddVar.a());
                int f3 = xddVar.f();
                u4q0 u4q0Var = zik0.a;
                jed jedVar2 = sparseArray2.get(f3);
                L.e("ClipsController", "retry called for upload " + f2);
                if (com.vk.upload.impl.a.a(f2)) {
                    com.vk.upload.impl.a.e(f2);
                    ysg0.b.a(new med(xddVar));
                } else if (c2 != null) {
                    kmv Fb = c2.Fb();
                    c2.Eb().Bb();
                    ((b) Fb).o0(c2.Eb());
                    com.vk.upload.impl.a.i((b) c2.Fb());
                    ysg0.b.a(new med(xddVar));
                } else if (jedVar2 == null || !jedVar2.c()) {
                    cvk.u(R.string.clips_upload_error_unknown, false);
                } else {
                    c cVar = a;
                    int f4 = xddVar.f();
                    cVar.getClass();
                    g(f4);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static void j(jed jedVar) {
        ClipUploadData d2 = jedVar.a.d();
        int l0 = d2.Ab().l0();
        UiTracker uiTracker = UiTracker.a;
        new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CANCEL_PUBLISH, new MobileOfficialAppsClipsStat$ClipsCreateContext(d2.Ab().n(), wrp.a(d2.Ab().p())), null, new MobileOfficialAppsClipsStat$CancelPublish((int) (jedVar.b() * l0), l0), null, null, null, null, null, null, null, 2036, null)).q();
    }

    public static c2 k(UserId userId, int i2, jed jedVar, izs izsVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        m1 T = rsg0.T(yfb.y(lgj0.a.d(new ogj0(), Collections.singletonList(VideoFile.a.a(i2, userId)), wfj0.a(), 58), new pba(fgj0.a, 3)));
        js1 js1Var = new js1(izsVar, 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        q<R> L = T.E(js1Var, lVar, kVar, kVar).L(new mj1(new ydf(atomicInteger, userId, i2, jedVar), 12), false);
        e05 e05Var = new e05(new f57(8), 12);
        L.getClass();
        return new c2(L, e05Var);
    }

    public static void l(kmv kmvVar, ClipUploadData clipUploadData, UserId userId) {
        ClipUploadParams.LicensedAudioInfo B = clipUploadData.Ab().B();
        kmvVar.f(B != null ? B.getId() : null);
        String description = clipUploadData.Ab().getDescription();
        if (description == null) {
            description = "";
        }
        kmvVar.setDescription(description);
        kmvVar.c(userId);
    }
}
