package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.feed.tool.view.posting.photoviewer.PhotoViewerLayout;
import com.vk.movika.sdk.base.logic.interactor.m;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.arf;
import xsna.ba10;
import xsna.bpn0;
import xsna.ca10;
import xsna.cfa0;
import xsna.dq;
import xsna.e0o0;
import xsna.ey50;
import xsna.fa00;
import xsna.fcn;
import xsna.fgm;
import xsna.fkq0;
import xsna.foi;
import xsna.fs00;
import xsna.ga10;
import xsna.gko;
import xsna.gky;
import xsna.gtd0;
import xsna.i0o0;
import xsna.ikv0;
import xsna.isa;
import xsna.izs;
import xsna.j03;
import xsna.j4x;
import xsna.j5g;
import xsna.jr3;
import xsna.ko00;
import xsna.mbc0;
import xsna.msy;
import xsna.n1i;
import xsna.n2o0;
import xsna.n3t;
import xsna.nk6;
import xsna.nv2;
import xsna.o43;
import xsna.osn;
import xsna.ov2;
import xsna.pm0;
import xsna.pp3;
import xsna.pv2;
import xsna.qey;
import xsna.qhc0;
import xsna.qt5;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.uf1;
import xsna.ux00;
import xsna.w8i;
import xsna.ww50;
import xsna.xg5;
import xsna.xsw;
import xsna.y1q0;
import xsna.yfb;
import xsna.zqp;
import xsna.zyu;

/* compiled from: MarketPickerCallback.kt */
/* loaded from: classes4.dex */
public final class f implements e.a, w8i {
    public final gtd0 b;
    public final FragmentActivity c;
    public final ga10 d;
    public final mbc0 e;
    public final Object f;
    public final bpn0 g;
    public final bpn0 h;
    public final ArrayList i;
    public final com.vk.newsfeed.posting.market_picker.presentation.base.view.b j;
    public com.vk.core.view.components.spinner.c k;
    public final ArrayList l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final ww50<?> n;
    public final bpn0 o;
    public final LinkedHashMap p;
    public final g q;
    public final i0o0 r;
    public b s;
    public e t;
    public e.b u;
    public final LinkedHashSet v;
    public final y1q0 w;
    public final j x;
    public final Object y;

    /* compiled from: MarketPickerCallback.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: MarketPickerCallback.kt */
    public final class b implements fcn {
        public final /* synthetic */ e b;

        public b(e eVar) {
            this.b = eVar;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            e.c(this.b);
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(ArrayList arrayList, com.vk.newsfeed.posting.market_picker.presentation.base.view.b bVar, gtd0 gtd0Var, FragmentActivity fragmentActivity, ga10 ga10Var, qhc0 qhc0Var) {
        this.b = gtd0Var;
        this.c = fragmentActivity;
        this.d = ga10Var;
        mbc0 mbc0Var = new mbc0();
        mbc0Var.e((PostingMetricEntryPoint) ga10Var.a, (UserId) ga10Var.b, (Integer) ga10Var.c);
        this.e = mbc0Var;
        ko00 ko00Var = new ko00(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, ko00Var);
        this.g = new bpn0(new fgm(this, 22));
        this.h = new bpn0(new m(19));
        this.i = new ArrayList();
        this.j = bVar;
        ArrayList arrayList2 = new ArrayList();
        this.l = arrayList2;
        this.m = new io.reactivex.rxjava3.disposables.b();
        ey50 ey50Var = fragmentActivity instanceof ey50 ? (ey50) fragmentActivity : null;
        this.n = ey50Var != null ? ey50Var.Y() : null;
        this.o = new bpn0(new foi(this, 21));
        this.p = new LinkedHashMap();
        this.q = new g(this, qhc0Var);
        i0o0 i0o0Var = new i0o0();
        i0o0Var.a = -1;
        this.r = i0o0Var;
        this.v = new LinkedHashSet();
        y1q0 y1q0Var = new y1q0(0);
        this.w = y1q0Var;
        this.x = new j(arrayList2);
        this.y = msy.a(lazyThreadSafetyMode, new n1i(this, 22));
        arrayList2.addAll(arrayList);
        y1q0Var.b();
    }

    public static PostingAttachmentInfo f(Photo photo, UserId userId, int i) {
        return new PostingAttachmentInfo(photo.e.b, photo.c, "market_" + userId + '_' + i, null, null, 24, null);
    }

    public static boolean g(Photo photo) {
        return xg5.a().d(photo.e);
    }

    @Override // com.vk.newsfeed.posting.market_picker.presentation.base.view.e.a
    public final void a(e.b bVar) {
        this.j.a(bVar);
    }

    public final void b(Photo photo, e0o0 e0o0Var) {
        LinkedHashMap linkedHashMap = this.p;
        List list = (List) linkedHashMap.get(photo);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(e0o0Var);
        linkedHashMap.put(photo, list);
        List list2 = (List) linkedHashMap.get(photo);
        if (list2 != null && list2.isEmpty()) {
            linkedHashMap.remove(photo);
        }
        l();
    }

    public final void c(int i, e.c cVar) {
        e eVar;
        h hVar;
        h hVar2;
        e.b bVar = (e.b) j5g.b0(i, this.l);
        this.u = bVar;
        if (bVar != null) {
            PhotoAttachment photoAttachment = bVar.b;
            UiTrackingScreen uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_BROWSER);
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PHOTO, Long.valueOf(photoAttachment.f), Long.valueOf(photoAttachment.g.b), null, null, null, 48, null);
            this.w.c(uiTrackingScreen, true);
        }
        e.b bVar2 = this.u;
        Photo photo = bVar2 != null ? bVar2.b.l : null;
        boolean z = photo != null && g(photo);
        if (photo != null && photo.r) {
            e eVar2 = this.t;
            if (eVar2 != null && (hVar2 = eVar2.l) != null) {
                hVar2.c(photo, e(photo), z);
            }
            if (!photo.m) {
                d(photo, false);
            }
        } else if (photo != null && (eVar = this.t) != null && (hVar = eVar.l) != null) {
            hVar.c(photo, e(photo), z);
        }
        e.b bVar3 = this.u;
        Photo photo2 = bVar3 != null ? bVar3.b.l : null;
        ba10 ba10Var = new ba10(this, i, cVar, 0);
        if (photo2 == null || photo2.c == 0 || !fkq0.c(photo2.e) || photo2.d == -53 || photo2.l) {
            return;
        }
        if (this.v.contains(Integer.valueOf(photo2.c))) {
            return;
        }
        int i2 = 25;
        this.m.b(new c0(rsg0.y0(new cfa0(photo2.e, photo2.c, photo2.v), null, null, 3), new ca10(new o43(27, this, photo2), 0), io.reactivex.rxjava3.internal.functions.a.c).G(new osn(1, this, photo2)).subscribe(new ov2(new nv2(i2, photo2, ba10Var), 28), new pv2(new j4x(this, 7), i2)));
    }

    public final void d(Photo photo, boolean z) {
        if (!this.i.contains(Integer.valueOf(photo.c)) || z) {
            n2o0 n2o0Var = (n2o0) this.h.getValue();
            String h = Tag.ContentType.PHOTO.h();
            j1 U = rsg0.y0(yfb.x(n2o0Var.b(photo.c, photo.e, h, photo.v)), null, null, 3).U(new pm0(new gky(5), 19));
            n3t n3tVar = new n3t(new zqp(1, photo), 9);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            this.m.b(new c0(new p1(U.E(n3tVar, lVar, kVar, kVar).F(new ux00(new qey(5), 1)), new dq(new jr3(25), 18)), new fs00(new uf1(24, this, photo), 1), kVar).G(new isa(4, this, photo)).subscribe(new zyu(new qt5(14, this, photo), 2), new pp3(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 28)));
        }
    }

    public final ArrayList e(Photo photo) {
        ArrayList arrayList = new ArrayList();
        for (Tag tag : photo.x) {
            this.r.getClass();
            arrayList.add(i0o0.a(tag));
        }
        List<e0o0> list = (List) this.p.get(photo);
        if (list == null) {
            list = EmptyList.b;
        }
        for (e0o0 e0o0Var : list) {
            if (e0o0Var instanceof e0o0.c) {
                arrayList.removeIf(new nk6(new fa00((e0o0.c) e0o0Var, 4), 1));
            } else if (e0o0Var instanceof e0o0.b) {
                arrayList.add(((e0o0.b) e0o0Var).a);
            } else {
                if (!(e0o0Var instanceof e0o0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(((e0o0.a) e0o0Var).a);
            }
        }
        return arrayList;
    }

    public final boolean h(int i) {
        Photo photo;
        e.b bVar = (e.b) j5g.b0(i, this.l);
        return (bVar == null || (photo = bVar.b.l) == null || !photo.Ib()) ? false : true;
    }

    public final void i(Photo photo, e0o0 e0o0Var) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = this.p;
        List list = (List) linkedHashMap.get(photo);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                e0o0 e0o0Var2 = (e0o0) obj;
                if ((e0o0Var2 instanceof e0o0.a) && (e0o0Var instanceof e0o0.a)) {
                    if (((e0o0.a) e0o0Var2).a.a.a != ((e0o0.a) e0o0Var).a.a.a) {
                        arrayList.add(obj);
                    }
                } else if (!(e0o0Var2 instanceof e0o0.b) || !(e0o0Var instanceof e0o0.b)) {
                    if ((e0o0Var2 instanceof e0o0.c) && (e0o0Var instanceof e0o0.c) && ((e0o0.c) e0o0Var2).a.a.a == ((e0o0.c) e0o0Var).a.a.a) {
                    }
                    arrayList.add(obj);
                } else if (((e0o0.b) e0o0Var2).a.a.a != ((e0o0.b) e0o0Var).a.a.a) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        linkedHashMap.put(photo, arrayList != null ? new ArrayList(arrayList) : new ArrayList());
        List list2 = (List) linkedHashMap.get(photo);
        if (list2 == null || !list2.isEmpty()) {
            return;
        }
        linkedHashMap.remove(photo);
    }

    public final void j(String str) {
        PhotoViewerLayout photoViewerLayout;
        e eVar = this.t;
        if (eVar == null || (photoViewerLayout = eVar.q) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a((Context) this.o.getValue());
        aVar.t = ikv0.c.b.a;
        aVar.u = new ikv0.d(new ikv0.d.c(str, null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.l = 81;
        aVar.o(photoViewerLayout);
    }

    public final void k(Throwable th) {
        if (th == null) {
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        boolean d = com.vk.core.utils.newtork.b.d();
        FragmentActivity fragmentActivity = this.c;
        j(d ? j03.g(fragmentActivity.getApplicationContext(), th, R.string.error) : fragmentActivity.getApplicationContext().getString(R.string.posting_common_network_error));
    }

    public final void l() {
        if (this.p.isEmpty()) {
            e eVar = this.t;
            if (eVar != null) {
                eVar.v.setAfter(null);
                return;
            }
            return;
        }
        e eVar2 = this.t;
        if (eVar2 != null) {
            VkTopBar vkTopBar = eVar2.v;
            tlo0.a aVar = tlo0.Companion;
            String string = eVar2.q.getContext().getString(R.string.market_picker_done);
            aVar.getClass();
            tlo0.h hVar = new tlo0.h(string);
            gko.b bVar = gko.Companion;
            VkTopBar.l lVar = null;
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_24), hVar, new xsw(eVar2, 5), lVar, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new arf(eVar2, 29), 2), 24), null, 6));
        }
    }
}
