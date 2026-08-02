package com.vk.content.design.view.camera;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.a;
import com.vk.core.ui.CircularProgressView;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskDisableReason;
import com.vk.dto.user.UserProfile;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.location.common.LocationCommon;
import com.vk.masks.MasksController;
import com.vk.masks.MasksEffectNotAvailableException;
import com.vk.masks.MasksView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;
import defpackage.b0;
import defpackage.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.am9;
import xsna.b00;
import xsna.b4r;
import xsna.bi10;
import xsna.bjm0;
import xsna.bpn0;
import xsna.bt;
import xsna.bwt0;
import xsna.c4r;
import xsna.c5g;
import xsna.ci10;
import xsna.cqm0;
import xsna.cwp0;
import xsna.cz;
import xsna.d2y;
import xsna.di10;
import xsna.drm0;
import xsna.dug0;
import xsna.epx;
import xsna.f1j;
import xsna.f3t;
import xsna.f4m;
import xsna.f870;
import xsna.f9t;
import xsna.fym;
import xsna.gfl;
import xsna.gmj;
import xsna.gsa;
import xsna.hg1;
import xsna.hj7;
import xsna.i3t;
import xsna.iah0;
import xsna.izs;
import xsna.j70;
import xsna.j9;
import xsna.jo3;
import xsna.jz30;
import xsna.k1;
import xsna.k7y;
import xsna.k9x;
import xsna.kjs;
import xsna.kl6;
import xsna.kpr;
import xsna.kzz;
import xsna.l4;
import xsna.l960;
import xsna.li10;
import xsna.lkz;
import xsna.maz;
import xsna.mg10;
import xsna.mi10;
import xsna.nf9;
import xsna.ng10;
import xsna.o9e;
import xsna.oq;
import xsna.ox0;
import xsna.p4g;
import xsna.pf1;
import xsna.pw70;
import xsna.qdz;
import xsna.qg6;
import xsna.qi10;
import xsna.qo9;
import xsna.qw70;
import xsna.rg10;
import xsna.rh10;
import xsna.ri10;
import xsna.rkz;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sc;
import xsna.si10;
import xsna.skz;
import xsna.szb0;
import xsna.t520;
import xsna.ti10;
import xsna.tw6;
import xsna.ubq;
import xsna.ubw;
import xsna.ui10;
import xsna.vx6;
import xsna.wcj;
import xsna.wh10;
import xsna.whp;
import xsna.wmz;
import xsna.x50;
import xsna.xg10;
import xsna.xz;
import xsna.y8g0;
import xsna.yg10;
import xsna.yp80;
import xsna.yr00;
import xsna.z1z;
import xsna.zyu;
import xsna.zzz;

/* compiled from: MasksWrap.kt */
/* loaded from: classes17.dex */
public final class MasksWrap extends com.vk.content.design.view.camera.a implements xg10.a, rg10 {
    public static final /* synthetic */ int e0 = 0;
    public qdz G;
    public MasksView H;
    public RecyclerView I;
    public o9e J;
    public View K;
    public View L;
    public izs<? super List<? extends bi10>, s3q0> M;
    public final xg10 N;
    public final LinkedHashSet O;
    public zzz P;
    public final e Q;
    public final xg10 R;
    public int S;
    public boolean T;
    public int U;
    public final a V;
    public Mask W;
    public Integer a0;
    public b b0;
    public final bpn0 c0;
    public final bpn0 d0;

    /* compiled from: MasksWrap.kt */
    public static final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.getMasksView().a(0);
            izs<List<? extends bi10>, s3q0> onMasksUpdatedCallback = masksWrap.getOnMasksUpdatedCallback();
            if (onMasksUpdatedCallback != null) {
                onMasksUpdatedCallback.invoke(masksWrap.N.y0());
            }
        }
    }

    /* compiled from: MasksWrap.kt */
    public interface b {
        void a(ArrayList arrayList);
    }

    /* compiled from: MasksWrap.kt */
    public static final class c implements c.m<ArrayList<bi10>> {
        public final /* synthetic */ MasksController.MasksCatalogType b;
        public final /* synthetic */ MasksWrap c;

        /* compiled from: MasksWrap.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MasksController.MasksCatalogType.values().length];
                try {
                    iArr[MasksController.MasksCatalogType.VOIP_MASKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MasksController.MasksCatalogType.VOIP_VIRTUAL_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MasksController.MasksCatalogType.DEFAULT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: MasksWrap.kt */
        public static final class b extends m.b {
            public final /* synthetic */ List<bi10> b;
            public final /* synthetic */ ArrayList<bi10> c;

            public b(ListDataSet.ArrayListImpl arrayListImpl, ArrayList arrayList) {
                this.b = arrayListImpl;
                this.c = arrayList;
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areContentsTheSame(int i, int i2) {
                return epx.f(this.b.get(i), this.c.get(i2));
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areItemsTheSame(int i, int i2) {
                return epx.f(this.b.get(i), this.c.get(i2));
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getNewListSize() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getOldListSize() {
                return this.b.size();
            }
        }

        public c(MasksController.MasksCatalogType masksCatalogType, MasksWrap masksWrap) {
            this.b = masksCatalogType;
            this.c = masksWrap;
        }

        @Override // com.vk.lists.c.m
        public final q<ArrayList<bi10>> O9(String str, com.vk.lists.c cVar) {
            int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
            MasksWrap masksWrap = this.c;
            if (i == 1) {
                MasksController masksController = masksWrap.getMasksController();
                return rsg0.y0(new wh10(masksController.g), null, null, 3).U(masksController.p);
            }
            if (i == 2) {
                a.b virtualBackground = masksWrap.getVirtualBackground();
                return virtualBackground != null ? virtualBackground.b() : g0.b;
            }
            if (i == 3) {
                return masksWrap.getMasksController().e(false);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.vk.lists.c.k
        public final q<ArrayList<bi10>> hj(com.vk.lists.c cVar, boolean z) {
            int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
            MasksWrap masksWrap = this.c;
            if (i == 1) {
                MasksController masksController = masksWrap.getMasksController();
                return rsg0.y0(new wh10(masksController.g), null, null, 3).U(masksController.p);
            }
            if (i == 2) {
                a.b virtualBackground = masksWrap.getVirtualBackground();
                return virtualBackground != null ? virtualBackground.b() : g0.b;
            }
            if (i == 3) {
                return masksWrap.getMasksController().e(z);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.vk.lists.c.k
        @SuppressLint({"CheckResult"})
        public final void wd(q<ArrayList<bi10>> qVar, boolean z, com.vk.lists.c cVar) {
            qVar.subscribe(new kl6(new ui10(this.c, cVar, z), 25), new zyu(new x50(27), 4));
        }
    }

    /* compiled from: MasksWrap.kt */
    public static final class d implements whp {
        @Override // xsna.whp
        public final String a() {
            return "";
        }
    }

    public MasksWrap(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final gfl getDefaultGalleryAssetDelegate() {
        return (gfl) this.d0.getValue();
    }

    private final cwp0 getUgcBGDelegate() {
        return (cwp0) this.c0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s3q0 v(MasksWrap masksWrap, Mask mask, boolean z, boolean z2, long j, int i, dug0.c cVar) {
        EmptyList emptyList;
        String name;
        if (cVar.c()) {
            masksWrap.setCurrentMaskDownload(null);
            szb0 szb0Var = masksWrap.s;
            xg10 xg10Var = masksWrap.R;
            yg10 masksAnalytics = masksWrap.getMasksAnalytics();
            if (masksAnalytics != null) {
                masksAnalytics.b(mask);
            }
            int i2 = 5;
            int i3 = 3;
            if (z) {
                com.vk.lists.c cVar2 = masksWrap.u;
                if (cVar2 != null) {
                    cVar2.p(true);
                }
            } else if (!z2) {
                MasksController masksController = masksWrap.t;
                int i4 = 4;
                m1 a0 = (!masksController.c.c.containsKey(mask.Db()) || mask.u) ? null : rsg0.y0(new rh10(mask.Db(), masksController.g), null, null, 3).U(new bt(18)).U(new qo9(i4, masksController, mask)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                if (a0 != null) {
                    masksWrap.x = a0.subscribe(new xz(new j9(masksWrap, 7), i2), new p(new sc(i3), i4));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z2) {
                xg10Var.notifyDataSetChanged();
            } else {
                masksWrap.N.notifyDataSetChanged();
            }
            k9x k9xVar = qw70.a;
            int i5 = mask.d;
            String str = mask.q;
            k9x k9xVar2 = qw70.a;
            int i6 = k9xVar2.b;
            if (i5 > k9xVar2.c || i6 > i5) {
                masksWrap.j(true);
            } else {
                szb0Var.d(masksWrap.o, com.vk.content.design.view.camera.a.E, 1000L, null);
            }
            if (z) {
                long j2 = elapsedRealtime - j;
                szb0Var.d(masksWrap.k, com.vk.content.design.view.camera.a.E, j2 >= 5000 ? 0L : 5000 - j2, null);
            }
            if (!TextUtils.isEmpty(str)) {
                masksWrap.n.setText(str);
                masksWrap.s.d(masksWrap.n, com.vk.content.design.view.camera.a.F, 2000L, new j70(masksWrap, 5));
            }
            a.InterfaceC0730a camera1View = masksWrap.getCamera1View();
            if (camera1View != null) {
                yg10 masksAnalytics2 = masksWrap.getMasksAnalytics();
                if (masksAnalytics2 != null) {
                    masksAnalytics2.i(i, mask);
                }
                if (mask.u) {
                    EffectRegistry.EffectId b2 = pw70.b(i5);
                    name = b2 != null ? b2.name() : null;
                    if (name != null && pw70.a(i5)) {
                        name = name + i5;
                    } else if (name == null) {
                        Mask selectedMask = masksWrap.getSelectedMask();
                        name = selectedMask != null ? selectedMask.Db() : null;
                    }
                } else {
                    name = cVar.c.getName();
                }
                camera1View.h(mask, name, z2);
            }
            masksWrap.setCurrentMaskDownload(null);
            Integer num = masksWrap.a0;
            Mask selectedMask2 = masksWrap.getSelectedMask();
            if (!epx.f(num, selectedMask2 != null ? Integer.valueOf(selectedMask2.d) : null)) {
                masksWrap.S = 0;
                Mask selectedMask3 = masksWrap.getSelectedMask();
                masksWrap.a0 = selectedMask3 != null ? Integer.valueOf(selectedMask3.d) : null;
            }
            String y = f9t.y(mask.Db());
            if (y != null && y.length() != 0) {
                masksWrap.T = true;
                masksWrap.U = i;
                String y2 = f9t.y(mask.Db());
                ArrayList arrayList = masksWrap.getMasksController().b;
                if (y2 != null) {
                    arrayList = new ArrayList();
                    List c0 = drm0.c0(y2, new String[]{" "}, 0, 6);
                    int parseInt = Integer.parseInt((String) c0.get(0));
                    int parseInt2 = Integer.parseInt((String) c0.get(1));
                    int size = masksWrap.getMasksController().b.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        bi10.b bVar = (bi10.b) masksWrap.getMasksController().b.get(i7);
                        int i8 = bVar.a.d;
                        if (parseInt2 <= i8 && i8 <= parseInt) {
                            arrayList.add(bVar);
                        }
                    }
                }
                xg10Var.setItems(arrayList);
                Mask mask2 = ((bi10.b) xg10Var.c.c(masksWrap.S)).a;
                if (arrayList.size() > 0) {
                    RecyclerView recyclerView = masksWrap.I;
                    ViewGroup.LayoutParams layoutParams = recyclerView != null ? recyclerView.getLayoutParams() : null;
                    ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                    if (bVar2 != null) {
                        bVar2.P = ((masksWrap.getWidth() - y8g0.a(R.dimen.gallery_list_padding_end)) - y8g0.a(R.dimen.camera_masks_mask_list_margin_start_default)) - (y8g0.a(R.dimen.effect_list_item_size) / 2);
                        RecyclerView recyclerView2 = masksWrap.I;
                        if (recyclerView2 != null) {
                            recyclerView2.setLayoutParams(bVar2);
                        }
                    }
                    xg10Var.notifyDataSetChanged();
                    masksWrap.Q.c(0, mask2);
                }
            }
            cwp0 ugcBGDelegate = masksWrap.getUgcBGDelegate();
            ugcBGDelegate.getClass();
            if (i5 == (-EffectRegistry.EffectId.UGC_SKY_BACKGROUND.id)) {
                String Db = mask.Db();
                File n = !TextUtils.isEmpty(Db) ? f9t.n(Db) : null;
                if (n == null) {
                    emptyList = EmptyList.b;
                } else {
                    try {
                        List c02 = drm0.c0(new BufferedReader(new FileReader(new File(new File(n, "string"), "default_backgrounds"))).readLine(), new String[]{StringUtils.COMMA}, 0, 6);
                        ArrayList arrayList2 = new ArrayList(c5g.u(c02, 10));
                        Iterator it = c02.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(drm0.p0((String) it.next()).toString());
                        }
                        emptyList = arrayList2;
                    } catch (IOException unused) {
                        emptyList = EmptyList.b;
                    }
                }
                m1 T = rsg0.T(new fym(EffectNativeSink.getLibVersionCode(), p4g.k(emptyList, StringUtils.COMMA, null)));
                hg1.f(ugcBGDelegate.b);
                ugcBGDelegate.b = T.U(new l960(new jz30(14), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t520(new bjm0(ugcBGDelegate, 3), 25));
            }
        } else {
            CircularProgressView progressCircular = masksWrap.getProgressCircular();
            float f2 = cVar.b;
            float progress = masksWrap.getProgressCircular().getProgress();
            if (f2 < progress) {
                f2 = progress;
            }
            progressCircular.setProgress(f2);
        }
        return s3q0.a;
    }

    public final void A(Mask mask) {
        q a0;
        if (mask.m) {
            getMasksController().getClass();
            if (mask.m) {
                String Db = mask.Db();
                ci10 ci10Var = new ci10("masks.markAsViewed");
                ci10Var.K("mask_ids", Db);
                q<R> L = rsg0.y0(ci10Var, null, null, 3).r0(io.reactivex.rxjava3.schedulers.a.b()).L(new l4(24), false);
                cz czVar = new cz(mask, 28);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                a0 = L.E(czVar, lVar, kVar, kVar).U(new oq(19)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            } else {
                a0 = q.T(Boolean.TRUE);
            }
            setMarkMaskAsViewedDisposable(a0.subscribe(new kjs(new d2y(this, 5), 3), new ubq(new c4r(13), 11)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if (r0 == (-ru.ok.gleffects.EffectRegistry.EffectId.RANDOM_MUSIC.id)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, Mask mask, boolean z) {
        am9.a aVar;
        a.InterfaceC0730a camera1View;
        int i2 = mask.d;
        MaskDisableReason maskDisableReason = mask.p;
        u();
        xg10 xg10Var = this.N;
        if (mask.equals(xg10Var.f) && !z) {
            I(true);
            return;
        }
        Object obj = null;
        if (mask.u) {
            a.InterfaceC0730a camera1View2 = getCamera1View();
            if (camera1View2 != null && camera1View2.i(i2)) {
                Iterator it = ((ArrayList) xg10Var.y0()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        bi10 bi10Var = (bi10) it.next();
                        bi10.d dVar = bi10Var instanceof bi10.d ? (bi10.d) bi10Var : null;
                        if (dVar != null) {
                            Mask mask2 = dVar.a;
                            if (mask2.h == mask.h && mask2.d == i2) {
                                break;
                            }
                        }
                    }
                }
            }
            A(mask);
            this.W = mask;
            q(true);
            setSelectedMask(mask);
            y();
            a.InterfaceC0730a camera1View3 = getCamera1View();
            if (camera1View3 == null || !camera1View3.g()) {
                return;
            }
            getProgressCircular().setIndeterminate(true);
            H();
            return;
        }
        Mask selectedMask = getSelectedMask();
        if (selectedMask != null && (camera1View = getCamera1View()) != null) {
            camera1View.d(selectedMask);
        }
        A(mask);
        setSelectedMask(mask);
        this.W = null;
        q(true);
        if (maskDisableReason != null) {
            d.a aVar2 = new d.a(getContext());
            if (!TextUtils.isEmpty(maskDisableReason.b)) {
                aVar2.setTitle(maskDisableReason.b);
            }
            String str = maskDisableReason.c;
            String str2 = maskDisableReason.d;
            aVar2.a.f = str;
            if (TextUtils.isEmpty(str2)) {
                aVar2.j(getContext().getString(R.string.ok).toUpperCase(Locale.ROOT), new si10(0));
            } else {
                String string = getContext().getString(R.string.masks_more_info);
                Locale locale = Locale.ROOT;
                aVar2.j(string.toUpperCase(locale), new qi10(0, str2, this));
                aVar2.f(getContext().getString(R.string.cancel).toUpperCase(locale), new ri10());
            }
            aVar2.m();
            return;
        }
        if (mask.Fb() && !getMasksController().h(mask)) {
            Context context = getContext();
            LocationCommon.a.getClass();
            if (LocationCommon.b(context)) {
                ProgressDialog show = ProgressDialog.show(getContext(), getContext().getString(R.string.mask_need_geo_location_info_title), null, true, true);
                setLocationDisposable(new i0(kzz.e(getContext()), new jo3(new f1j(show, 28), 23)).subscribe(new wmz(new li10(mask, this, i, show), 1), new lkz(new mi10(show, 0), 1)));
                return;
            } else {
                Context context2 = getContext();
                new AlertDialog.Builder(context2).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(1, context2, obj)).setNegativeButton(R.string.cancel, new z1z(obj, 1)).show();
                return;
            }
        }
        setCurrentMaskId(mask.Db());
        am9 cameraTracker = getCameraTracker();
        if (cameraTracker != null && (aVar = cameraTracker.a) != null) {
            aVar.m = getCurrentMaskId();
        }
        a.InterfaceC0730a camera1View4 = getCamera1View();
        if (camera1View4 != null) {
            camera1View4.a(mask);
        }
        x(i, mask, false);
    }

    public final void C(String str) {
        maz.c(getLinksBridge().e(), getContext(), str, new LaunchContext(false, false, false, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), null, null, null, null, null, "story", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108343), null, new f(), 8);
    }

    public final void D(boolean z, boolean z2) {
        com.vk.lists.c cVar = this.u;
        if (cVar != null) {
            cVar.p(z2);
        }
        if (z) {
            return;
        }
        this.T = false;
    }

    public final void F(boolean z, String[] strArr, Integer num) {
        o9e o9eVar;
        int i = 0;
        if (!z && (o9eVar = this.J) != null) {
            o9eVar.d(EmptyList.b);
            f4m.j(o9eVar.c);
            o9eVar.f.clear();
            o9eVar.a.scrollToPosition(0);
            f3t f3tVar = o9eVar.e;
            f3tVar.j.invoke(Integer.valueOf(f3tVar.o));
            f3tVar.o = -1;
            f3tVar.m = true;
            io.reactivex.rxjava3.disposables.c cVar = o9eVar.h;
            if (cVar != null) {
                cVar.dispose();
            }
            f3tVar.l = true;
            o9eVar.f();
        }
        if (strArr != null) {
            gfl defaultGalleryAssetDelegate = getDefaultGalleryAssetDelegate();
            defaultGalleryAssetDelegate.getClass();
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i2 = 0;
            while (i < length) {
                arrayList.add(new i3t(Uri.parse("file://" + strArr[i]), i2));
                i++;
                i2++;
            }
            defaultGalleryAssetDelegate.a.accept(arrayList);
            if (num == null || num.intValue() < 0 || num.intValue() >= arrayList.size()) {
                return;
            }
            defaultGalleryAssetDelegate.b.accept(num);
        }
    }

    public final void G(long j, String str) {
        szb0 szb0Var = this.s;
        if (str == null || str.length() == 0) {
            szb0Var.d(this.n, com.vk.content.design.view.camera.a.E, 0L, null);
            return;
        }
        this.n.setText(str);
        szb0Var.e(this.n, com.vk.content.design.view.camera.a.F, true, null);
        szb0Var.d(this.n, com.vk.content.design.view.camera.a.E, j, null);
    }

    public final void H() {
        float a2 = ((y8g0.a(R.dimen.effect_list_item_size) * 3) / 2.0f) + y8g0.a(R.dimen.camera_masks_mask_list_margin_bottom);
        if (!this.T || (getHeight() - iah0.a(y8g0.a(R.dimen.masks_progress_size))) / 2.0f >= a2) {
            f4m.q(0, getProgress());
            bwt0.b0(17, getProgress());
        } else {
            f4m.q((int) a2, getProgress());
            bwt0.b0(81, getProgress());
        }
        this.s.e(this.o, com.vk.content.design.view.camera.a.F, true, null);
    }

    public final void I(boolean z) {
        a.InterfaceC0730a camera1View;
        yg10 masksAnalytics;
        Mask selectedMask = getSelectedMask();
        setSelectedMask(null);
        this.T = false;
        this.W = null;
        this.S = 0;
        if (z && (masksAnalytics = getMasksAnalytics()) != null) {
            masksAnalytics.c();
        }
        if (selectedMask != null && (camera1View = getCamera1View()) != null) {
            camera1View.d(selectedMask);
        }
        q(false);
    }

    public final void J(boolean z) {
        am9.a aVar;
        Mask mask = this.W;
        if (mask != null) {
            if (!z) {
                l(mask, new MasksEffectNotAvailableException());
                this.W = null;
                setSelectedMask(null);
                return;
            }
            a.InterfaceC0730a camera1View = getCamera1View();
            if (camera1View == null || !camera1View.i(mask.d)) {
                return;
            }
            setCurrentMaskId(mask.Db());
            am9 cameraTracker = getCameraTracker();
            if (cameraTracker != null && (aVar = cameraTracker.a) != null) {
                aVar.m = getCurrentMaskId();
            }
            a.InterfaceC0730a camera1View2 = getCamera1View();
            if (camera1View2 != null) {
                camera1View2.a(mask);
            }
            x(mask.h, mask, false);
            this.W = null;
        }
    }

    @Override // xsna.xg10.a
    public final void b(Mask mask) {
        a.b virtualBackground = getVirtualBackground();
        if (virtualBackground != null) {
            virtualBackground.a(mask);
        }
    }

    @Override // xsna.xg10.a
    public final void c(int i, Mask mask) {
        B(i, mask, false);
    }

    @Override // xsna.xg10.a
    public final void d() {
        I(true);
    }

    @Override // xsna.xg10.a
    public final void e() {
        di10 masksProvider = getMasksProvider();
        if (masksProvider != null) {
            masksProvider.A();
        }
        C(f870.v(InternalVkMiniApps.MASK_CATALOG.h()));
        nf9.b.k(StoryPublishEvent.OPEN_MASK_CATALOG);
    }

    @Override // xsna.rg10
    public final void f(String str) {
        j1 U;
        a.InterfaceC0730a camera1View;
        if (a()) {
            if (getSelectedMask() == null && (camera1View = getCamera1View()) != null) {
                camera1View.j(str);
            }
            com.vk.lists.c cVar = this.u;
            if (cVar != null) {
                cVar.p(true);
            }
            setSelectedMask(null);
            this.R.L0(null);
            this.W = null;
            int i = 0;
            q(false);
            u();
            int i2 = 6;
            List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            if (c0.size() > 1) {
                String str2 = (String) c0.get(1);
                bpn0 bpn0Var = cqm0.a;
                try {
                    i = Integer.parseInt(str2);
                } catch (Throwable unused) {
                }
                if (i < 0) {
                    U = rsg0.y0(new fym(EffectNativeSink.getLibVersionCode(), str), null, null, 3).U(new vx6(new kpr(i2), 21));
                    int i3 = 22;
                    setCurrentMaskDownload(U.subscribe(new rkz(new gmj(this, i3), 4), new skz(new wcj(this, i3), 2)));
                }
            }
            U = rsg0.y0(new rh10(str, com.vk.media.ok.b.W0), null, null, 3).U(new ox0(new b4r(13), 26));
            int i32 = 22;
            setCurrentMaskDownload(U.subscribe(new rkz(new gmj(this, i32), 4), new skz(new wcj(this, i32), 2)));
        }
    }

    @Override // xsna.xg10.a
    public final void g() {
        a.b virtualBackground = getVirtualBackground();
        if (virtualBackground != null) {
            virtualBackground.c();
        }
    }

    public final View getClipsGalleryListContainer() {
        return this.K;
    }

    public final View getClipsGalleryListContainerBG() {
        return this.L;
    }

    public final o9e getClipsGalleryListWrapper() {
        return this.J;
    }

    public final RecyclerView getGroupedEffectView() {
        return this.I;
    }

    public final qdz getLinksBridge() {
        qdz qdzVar = this.G;
        if (qdzVar != null) {
            return qdzVar;
        }
        return null;
    }

    public final Mask getMaskShouldSelectAfterUpdate() {
        return this.W;
    }

    public final MasksView getMasksView() {
        MasksView masksView = this.H;
        if (masksView != null) {
            return masksView;
        }
        return null;
    }

    public final izs<List<? extends bi10>, s3q0> getOnMasksUpdatedCallback() {
        return this.M;
    }

    public final b getOnNewDataListener() {
        return this.b0;
    }

    public final zzz getOrientationDelegate() {
        return this.P;
    }

    public final Integer getPrevSelectedMask() {
        return this.a0;
    }

    @Override // com.vk.content.design.view.camera.a
    public Mask getSelectedMask() {
        return this.N.f;
    }

    @Override // xsna.rg10
    public final void h(mg10.b bVar) {
        String str = bVar.a;
        LinkedHashSet linkedHashSet = this.O;
        if (linkedHashSet.contains(str)) {
            linkedHashSet.remove(str);
        } else {
            linkedHashSet.add(str);
        }
    }

    @Override // com.vk.content.design.view.camera.a
    public final com.vk.lists.c i(MasksController.MasksCatalogType masksCatalogType) {
        c.h hVar = new c.h(new c(masksCatalogType, this));
        hVar.q = false;
        hVar.o = new d();
        return com.vk.lists.f.a(hVar, getMasksView().getPagindatedView());
    }

    @Override // com.vk.content.design.view.camera.a
    public final void m() {
        a aVar = this.V;
        xg10 xg10Var = this.N;
        xg10Var.registerAdapterDataObserver(aVar);
        getMasksView().getPagindatedView().setAdapter(xg10Var);
        RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.R);
        }
        getMasksView().getPagindatedView().setItemDecoration(new ng10(getContext()));
    }

    public final void setClipsGalleryListContainer(View view) {
        this.K = view;
    }

    public final void setClipsGalleryListContainerBG(View view) {
        this.L = view;
    }

    public final void setClipsGalleryListWrapper(o9e o9eVar) {
        this.J = o9eVar;
    }

    public final void setGroupedEffectView(RecyclerView recyclerView) {
        this.I = recyclerView;
    }

    public final void setLinksBridge(qdz qdzVar) {
        this.G = qdzVar;
    }

    public final void setLoadCommonMasks(boolean z) {
        getMasksController().l = z;
        Mask selectedMask = getSelectedMask();
        if (selectedMask == null || selectedMask.u || z) {
            return;
        }
        this.W = getSelectedMask();
        setSelectedMask(null);
        q(false);
    }

    public final void setLoadOkMasks(boolean z) {
        getMasksController().k = z;
        Mask selectedMask = getSelectedMask();
        if (selectedMask == null || !selectedMask.u || z) {
            return;
        }
        this.W = getSelectedMask();
        setSelectedMask(null);
        q(false);
    }

    public final void setLoadingResourcesProgress(float f2) {
        CircularProgressView progressCircular = getProgressCircular();
        float progress = getProgressCircular().getProgress();
        if (f2 < progress) {
            f2 = progress;
        }
        progressCircular.setProgress(f2);
    }

    public final void setMaskShouldSelectAfterUpdate(Mask mask) {
        this.W = mask;
    }

    @Override // xsna.rg10
    public void setMasksAuthorClickEnabled(boolean z) {
        setAuthorClickEnabled(z);
    }

    public final void setMasksView(MasksView masksView) {
        this.H = masksView;
    }

    public final void setOnMasksUpdatedCallback(izs<? super List<? extends bi10>, s3q0> izsVar) {
        this.M = izsVar;
    }

    public final void setOnNewDataListener(b bVar) {
        this.b0 = bVar;
    }

    public final void setOrientationDelegate(zzz zzzVar) {
        this.P = zzzVar;
        this.N.g = zzzVar;
    }

    public final void setPrevSelectedMask(Integer num) {
        this.a0 = num;
    }

    @Override // com.vk.content.design.view.camera.a
    public void setSelectedMask(Mask mask) {
        this.N.L0(mask);
    }

    public final void w() {
        Mask mask = this.N.f;
        if (mask != null) {
            x(mask.h, mask, false);
        }
    }

    public final void x(int i, Mask mask, boolean z) {
        y();
        getProgressCircular().setProgressNoAnim(0.01f);
        boolean z2 = false;
        getProgressCircular().setIndeterminate(false);
        if (!z) {
            this.T = false;
            this.R.L0(null);
        }
        MasksController masksController = getMasksController();
        boolean i2 = masksController.i(mask);
        Group group = mask.c;
        UserProfile userProfile = mask.b;
        if (!i2 && !masksController.d.contains(mask)) {
            z2 = true;
        }
        if (z2) {
            H();
            szb0 szb0Var = this.s;
            String str = "";
            if (userProfile == null && group == null) {
                this.l.clear();
                this.m.setText("");
                this.k.setOnClickListener(null);
                szb0Var.e(this.k, com.vk.content.design.view.camera.a.E, true, null);
            } else {
                this.l.o0(mask.Bb(), null);
                TextView textView = this.m;
                Context context = getContext();
                if (userProfile != null) {
                    str = userProfile.e;
                } else if (group != null) {
                    str = group.d;
                }
                textView.setText(context.getString(R.string.masks_author, str));
                this.k.setOnClickListener(new qg6(0, this, mask));
                szb0Var.e(this.k, com.vk.content.design.view.camera.a.F, true, null);
            }
        }
        setCurrentMaskDownload(new c0(getMasksController().g(mask), io.reactivex.rxjava3.internal.functions.a.d, new gsa(mask, 4)).subscribe(new pf1(new ti10(this, mask, z2, z, SystemClock.elapsedRealtime(), i), 28), new b00(new b0(21, this, mask), 28)));
    }

    public final void y() {
        io.reactivex.rxjava3.disposables.c currentMaskDownload = getCurrentMaskDownload();
        if (currentMaskDownload != null) {
            yg10 masksAnalytics = getMasksAnalytics();
            if (masksAnalytics != null) {
                masksAnalytics.a(this.N.f);
            }
            am9 cameraTracker = getCameraTracker();
            if (cameraTracker != null) {
                cameraTracker.c(StoryPublishEvent.CANCEL_MASK_LOADING, null);
            }
            currentMaskDownload.dispose();
            setCurrentMaskDownload(null);
        }
    }

    public final void z(Mask mask) {
        if (epx.f(getSelectedMask(), mask)) {
            return;
        }
        B(mask.h, mask, false);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public MasksWrap(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.N = new xg10(this);
        this.O = new LinkedHashSet();
        zzz.a.getClass();
        this.P = (zzz) zzz.a.b.getValue();
        e eVar = new e();
        this.Q = eVar;
        this.R = new xg10(eVar);
        this.U = -1;
        this.c0 = new bpn0(new k7y(this, 7));
        this.d0 = new bpn0(new ubw(this, 8));
        this.V = new a();
        getProgress().setOnClickListener(new k1(this, 9));
    }

    /* compiled from: MasksWrap.kt */
    public static final class e implements xg10.a {
        public e() {
        }

        @Override // xsna.xg10.a
        public final void c(int i, Mask mask) {
            MasksWrap masksWrap = MasksWrap.this;
            masksWrap.u();
            xg10 xg10Var = masksWrap.R;
            if (mask.equals(xg10Var.f)) {
                return;
            }
            xg10Var.L0(mask);
            masksWrap.S = ((ListDataSet) xg10Var.c).w(new tw6(new yr00(mask, 3), 1));
            masksWrap.x(masksWrap.U, mask, true);
        }

        @Override // xsna.xg10.a
        public final void d() {
        }

        @Override // xsna.xg10.a
        public final void e() {
        }

        @Override // xsna.xg10.a
        public final void g() {
        }

        @Override // xsna.xg10.a
        public final void b(Mask mask) {
        }
    }

    /* compiled from: MasksWrap.kt */
    public static final class f implements yp80 {
        public f() {
        }

        @Override // xsna.yp80
        public final void I() {
            MasksWrap masksWrap = MasksWrap.this;
            LinkedHashSet linkedHashSet = masksWrap.O;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            linkedHashSet.clear();
            com.vk.lists.c masksPaginatedHelper = masksWrap.getMasksPaginatedHelper();
            if (masksPaginatedHelper != null) {
                masksPaginatedHelper.p(false);
            }
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
        }
    }
}
