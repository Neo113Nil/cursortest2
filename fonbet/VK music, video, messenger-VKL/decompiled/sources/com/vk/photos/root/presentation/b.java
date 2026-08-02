package com.vk.photos.root.presentation;

import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.photos.root.presentation.a;
import com.vk.photos.root.presentation.c;
import com.vk.photos.root.presentation.e;
import com.vk.photos.root.tabs.PhotosRootTab;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentType;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ca10;
import xsna.f4z;
import xsna.h7v;
import xsna.hg1;
import xsna.iga0;
import xsna.izs;
import xsna.k130;
import xsna.m7a0;
import xsna.qfa0;
import xsna.s3q0;
import xsna.v4w;
import xsna.wj50;
import xsna.wk50;
import xsna.ysg0;

/* compiled from: PhotosRootFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<i, iga0, com.vk.photos.root.presentation.a, c> {
    public final h7v f;
    public final qfa0.l g;
    public final qfa0.e h;
    public final f4z i;

    /* compiled from: PhotosRootFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public b(ysg0<m7a0> ysg0Var, qfa0 qfa0Var, h7v h7vVar, int i) {
        super(a.c.b, new d(new iga0(true, i, false, false)));
        this.f = h7vVar;
        this.g = qfa0Var.getTabs();
        this.h = qfa0Var.a();
        this.i = new f4z();
        if (h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_PHOTOFLOW.getId()) != null) {
            C(new a.f(true));
        } else if (h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_QUESTION.getId()) != null) {
            C(new a.i());
        }
        io.reactivex.rxjava3.subjects.f<m7a0> fVar = ysg0Var.a;
        hg1.e3 e3Var = new hg1.e3();
        fVar.getClass();
        this.e.b(new i0(fVar, e3Var).U(new hg1.d3()).subscribe(new ca10(new v4w(this, 16), 8), new k130(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 11)));
    }

    @Override // xsna.wk50
    public final void N(iga0 iga0Var, com.vk.photos.root.presentation.a aVar) {
        MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType;
        iga0 iga0Var2 = iga0Var;
        com.vk.photos.root.presentation.a aVar2 = aVar;
        if (aVar2.equals(a.c.b)) {
            return;
        }
        if (aVar2 instanceof a.f) {
            U((a.f) aVar2);
            return;
        }
        boolean equals = aVar2.equals(a.b.b);
        qfa0.e eVar = this.h;
        if (equals) {
            eVar.e();
            U(new a.f(false));
            C(new a.i());
            return;
        }
        boolean equals2 = aVar2.equals(a.h.b);
        f4z f4zVar = this.i;
        h7v h7vVar = this.f;
        if (equals2) {
            eVar.c();
            Hint p = h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_QUESTION.getId());
            if (p != null) {
                f4zVar.b(new e.d(p));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.e) {
            int i = ((a.e) aVar2).b;
            if (!iga0Var2.c || iga0Var2.b == i) {
                return;
            }
            T(new c.d(i));
            if (i == PhotosRootTab.PHOTO_FLOW.h()) {
                mobileOfficialAppsConPhotosStat$ContentType = MobileOfficialAppsConPhotosStat$ContentType.PHOTO;
            } else if (i != PhotosRootTab.ALBUMS.h()) {
                return;
            } else {
                mobileOfficialAppsConPhotosStat$ContentType = MobileOfficialAppsConPhotosStat$ContentType.ALBUM;
            }
            this.g.a(mobileOfficialAppsConPhotosStat$ContentType);
            return;
        }
        if (aVar2 instanceof a.j) {
            T(new c.C1510c(((a.j) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.i) {
            T(new c.b(((a.i) aVar2).b));
            return;
        }
        if (aVar2.equals(a.d.b)) {
            Hint p2 = h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_AUTOPLAY.getId());
            if (p2 != null) {
                f4zVar.b(new e.d(p2));
                return;
            }
            return;
        }
        if (aVar2.equals(a.C1509a.b)) {
            Hint p3 = h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_AUTOPLAY.getId());
            if (p3 != null) {
                h7vVar.s(p3);
                return;
            }
            return;
        }
        if (!aVar2.equals(a.g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        eVar.a();
        Hint p4 = h7vVar.p(HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_PHOTOFLOW.getId());
        if (p4 != null) {
            f4zVar.b(new e.d(p4));
        }
    }

    public final void U(a.f fVar) {
        if (!fVar.b) {
            String id = HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_PHOTOFLOW.getId();
            h7v h7vVar = this.f;
            Hint p = h7vVar.p(id);
            if (p != null) {
                h7vVar.s(p);
            }
        }
        T(new c.a(fVar.b));
    }

    public final wj50<e> x() {
        return this.i;
    }
}
