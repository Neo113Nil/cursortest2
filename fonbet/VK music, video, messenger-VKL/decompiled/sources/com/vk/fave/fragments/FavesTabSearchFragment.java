package com.vk.fave.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.InterfaceC4319fe;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSearchType;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.newsfeed.common.views.fave.FavesEmptyListView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ad90;
import xsna.bd70;
import xsna.cn70;
import xsna.cvk;
import xsna.dck;
import xsna.dhr0;
import xsna.e43;
import xsna.enq;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.fpf0;
import xsna.g990;
import xsna.gj7;
import xsna.gjf0;
import xsna.go9;
import xsna.h03;
import xsna.iah0;
import xsna.io1;
import xsna.irq;
import xsna.izs;
import xsna.j5g;
import xsna.ju1;
import xsna.l9n;
import xsna.lqq;
import xsna.m7m;
import xsna.msy;
import xsna.oz50;
import xsna.p870;
import xsna.pcg;
import xsna.ps2;
import xsna.qhh0;
import xsna.qnq;
import xsna.rnq;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sqq;
import xsna.trf;
import xsna.usq;
import xsna.vsq;
import xsna.xrq;
import xsna.y8g0;
import xsna.yrq;
import xsna.z990;
import xsna.zc90;

/* compiled from: FavesTabSearchFragment.kt */
/* loaded from: classes18.dex */
public final class FavesTabSearchFragment extends BaseFragment implements qhh0 {
    public static final /* synthetic */ int k0 = 0;
    public FaveSearchType S;
    public FaveSource T;
    public View U;
    public RecyclerPaginatedView V;
    public ad90 W;
    public com.vk.lists.c X;
    public yrq Y;
    public xrq Z;
    public lqq a0;
    public rnq b0;
    public FaveTag d0;
    public String c0 = "";
    public final Object e0 = msy.a(LazyThreadSafetyMode.NONE, new trf(this, 23));
    public final f f0 = new f();
    public final e g0 = new e();
    public final usq h0 = new bd70() { // from class: xsna.usq
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            Object obj2;
            RecyclerPaginatedView recyclerPaginatedView;
            int i3 = FavesTabSearchFragment.k0;
            FavesTabSearchFragment favesTabSearchFragment = FavesTabSearchFragment.this;
            if (i == 1201) {
                if (obj == null ? true : obj instanceof FaveTag) {
                    FaveTag faveTag = (FaveTag) obj;
                    favesTabSearchFragment.d0 = faveTag;
                    if (faveTag == null && favesTabSearchFragment.W != null && (recyclerPaginatedView = favesTabSearchFragment.V) != null) {
                        recyclerPaginatedView.K9();
                    }
                    favesTabSearchFragment.W = null;
                    com.vk.lists.c cVar = favesTabSearchFragment.X;
                    if (cVar != null) {
                        cVar.p(false);
                        return;
                    }
                    return;
                }
            }
            if (i == 1202 && (obj instanceof FavePage)) {
                FavePage favePage = (FavePage) obj;
                xrq xrqVar = favesTabSearchFragment.Z;
                if (xrqVar == null) {
                    xrqVar = null;
                }
                Iterator it = ((ArrayList) xrqVar.y0()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    z990 z990Var = (z990) obj2;
                    if (z990Var != null && epx.f(z990Var.a, favePage)) {
                        break;
                    }
                }
                z990 z990Var2 = (z990) obj2;
                if (z990Var2 != null) {
                    z990 a2 = z990.a(z990Var2, favePage);
                    xrq xrqVar2 = favesTabSearchFragment.Z;
                    if (xrqVar2 == null) {
                        xrqVar2 = null;
                    }
                    xrqVar2.F0(z990Var2, a2);
                    favesTabSearchFragment.W = null;
                    return;
                }
                return;
            }
            if (i == 1205 && (obj instanceof FaveTag)) {
                FaveTag faveTag2 = (FaveTag) obj;
                xrq xrqVar3 = favesTabSearchFragment.Z;
                if (xrqVar3 == null) {
                    xrqVar3 = null;
                }
                ListDataSet listDataSet = (ListDataSet) xrqVar3.c;
                AbstractList abstractList = listDataSet.d;
                for (int i4 = 0; i4 < abstractList.size(); i4++) {
                    z990 z990Var3 = (z990) abstractList.get(i4);
                    int i5 = FavesTabSearchFragment.k0;
                    if (z990Var3 != null && FavesTabSearchFragment.io(z990Var3, faveTag2)) {
                        listDataSet.h(i4);
                        z990 z990Var4 = (z990) abstractList.get(i4);
                        int i6 = FavesTabSearchFragment.k0;
                        List<FaveTag> list = z990Var4.a.i;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (FaveTag faveTag3 : list) {
                            if (faveTag3.b == faveTag2.b) {
                                faveTag3 = faveTag2;
                            }
                            arrayList.add(faveTag3);
                        }
                        abstractList.set(i4, z990.a(z990Var4, (FavePage) z990Var4.a.copy(arrayList)));
                        listDataSet.d(i4);
                    }
                }
                favesTabSearchFragment.W = null;
                return;
            }
            if (i == 1204 && (obj instanceof FaveTag)) {
                FaveTag faveTag4 = (FaveTag) obj;
                xrq xrqVar4 = favesTabSearchFragment.Z;
                if (xrqVar4 == null) {
                    xrqVar4 = null;
                }
                ListDataSet listDataSet2 = (ListDataSet) xrqVar4.c;
                AbstractList abstractList2 = listDataSet2.d;
                for (int i7 = 0; i7 < abstractList2.size(); i7++) {
                    z990 z990Var5 = (z990) abstractList2.get(i7);
                    int i8 = FavesTabSearchFragment.k0;
                    if (z990Var5 != null && FavesTabSearchFragment.io(z990Var5, faveTag4)) {
                        listDataSet2.h(i7);
                        z990 z990Var6 = (z990) abstractList2.get(i7);
                        int i9 = FavesTabSearchFragment.k0;
                        List<FaveTag> list2 = z990Var6.a.i;
                        ArrayList arrayList2 = new ArrayList();
                        for (FaveTag faveTag5 : list2) {
                            if (faveTag5.b == faveTag4.b) {
                                faveTag5 = null;
                            }
                            if (faveTag5 != null) {
                                arrayList2.add(faveTag5);
                            }
                        }
                        abstractList2.set(i7, z990.a(z990Var6, (FavePage) z990Var6.a.copy(arrayList2)));
                        listDataSet2.d(i7);
                    }
                }
                favesTabSearchFragment.W = null;
            }
        }
    };
    public final b i0 = new b();
    public final dck j0 = new dck(this, 1);

    /* compiled from: FavesTabSearchFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: FavesTabSearchFragment.kt */
    public static final class b implements c.m<List<? extends z990>> {

        /* compiled from: FavesTabSearchFragment.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                h03.b(th);
                return s3q0.a;
            }
        }

        public b() {
        }

        public static final q<ad90> a(FavesTabSearchFragment favesTabSearchFragment) {
            String str;
            ad90 ad90Var = favesTabSearchFragment.W;
            if (ad90Var != null) {
                return q.T(ad90Var);
            }
            enq enqVar = enq.a;
            FaveSearchType faveSearchType = favesTabSearchFragment.S;
            if (faveSearchType == null) {
                faveSearchType = null;
            }
            String h = faveSearchType.h();
            FaveTag faveTag = favesTabSearchFragment.d0;
            Integer valueOf = faveTag != null ? Integer.valueOf(faveTag.b) : null;
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            switch (c == null ? -1 : irq.$EnumSwitchMapping$0[c.ordinal()]) {
                case 1:
                    str = "burger";
                    break;
                case 2:
                    str = "marketplace";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    str = "bookmarks";
                    break;
                case 18:
                    str = "market_item";
                    break;
                case 19:
                    str = "market_item_album";
                    break;
                case 20:
                    str = "market";
                    break;
                case 21:
                    str = "cart";
                    break;
                default:
                    str = "other";
                    break;
            }
            FaveSource faveSource = favesTabSearchFragment.T;
            if (faveSource == null) {
                faveSource = null;
            }
            enqVar.getClass();
            boolean z = faveSource != null && faveSource == FaveSource.SNACKBAR;
            zc90 zc90Var = new zc90("fave.getPages");
            zc90Var.K(SignalingProtocol.KEY_OFFSET, String.valueOf(0));
            zc90Var.C(500, "count");
            zc90Var.K("fields", j5g.g0(e43.l("photo_base", "verified", "trending", "is_verified", "online_info", "has_unseen_stories", "is_government_organization", "trust_mark", "url"), StringUtils.COMMA, null, null, 0, null, 62));
            zc90Var.K("ref", str);
            zc90Var.R("is_from_snackbar", z);
            if (valueOf != null) {
                zc90Var.C(valueOf.intValue(), "tag_id");
            }
            if (h != null) {
                zc90Var.K("type", h);
            }
            m1 y0 = rsg0.y0(zc90Var, null, null, 3);
            defpackage.d dVar = new defpackage.d(new pcg(favesTabSearchFragment, 19), 26);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            return y0.E(dVar, lVar, kVar, kVar);
        }

        @Override // com.vk.lists.c.m
        public final q<List<? extends z990>> O9(String str, com.vk.lists.c cVar) {
            FavesTabSearchFragment favesTabSearchFragment = FavesTabSearchFragment.this;
            String str2 = favesTabSearchFragment.c0;
            return (str2 == null || str2.length() == 0) ? a(favesTabSearchFragment).U(new ps2(new vsq(0), 21)) : a(favesTabSearchFragment).U(new ju1(new l9n(this, str2, 1), 26));
        }

        @Override // com.vk.lists.c.k
        public final q<List<z990>> hj(com.vk.lists.c cVar, boolean z) {
            if (z) {
                FavesTabSearchFragment.this.W = null;
            }
            return O9(null, cVar);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<List<z990>> qVar, boolean z, com.vk.lists.c cVar) {
            FavesTabSearchFragment favesTabSearchFragment = FavesTabSearchFragment.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new io1(new com.vk.libvideo.design.view.video.a(14, cVar, favesTabSearchFragment), 25), new gj7(a.b, 1));
            if (subscribe != null) {
                favesTabSearchFragment.eo(subscribe);
            }
        }
    }

    /* compiled from: FavesTabSearchFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            FavesTabSearchFragment favesTabSearchFragment = (FavesTabSearchFragment) this.receiver;
            if (!epx.f(favesTabSearchFragment.c0, str2)) {
                favesTabSearchFragment.c0 = str2;
                com.vk.lists.c cVar = favesTabSearchFragment.X;
                if (cVar != null) {
                    cVar.p(false);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FavesTabSearchFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            Object obj;
            UserId userId2 = userId;
            FavesTabSearchFragment favesTabSearchFragment = (FavesTabSearchFragment) this.receiver;
            xrq xrqVar = favesTabSearchFragment.Z;
            if (xrqVar == null) {
                xrqVar = null;
            }
            Iterator it = ((ArrayList) xrqVar.y0()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                z990 z990Var = (z990) obj;
                if (z990Var != null) {
                    Owner owner = z990Var.a.e;
                    if (epx.f(owner != null ? owner.b : null, userId2)) {
                        break;
                    }
                }
            }
            z990 z990Var2 = (z990) obj;
            if (z990Var2 != null) {
                FavePage favePage = z990Var2.a;
                Owner owner2 = favePage.e;
                z990 a = z990.a(z990Var2, FavePage.zb(favePage, owner2 != null ? Owner.e(owner2, null, 4161535) : null, false, null, 247));
                xrq xrqVar2 = favesTabSearchFragment.Z;
                if (xrqVar2 == null) {
                    xrqVar2 = null;
                }
                xrqVar2.F0(z990Var2, a);
                favesTabSearchFragment.W = null;
            }
            return s3q0.a;
        }
    }

    /* compiled from: FavesTabSearchFragment.kt */
    public static final class e extends AbstractPaginatedView.i {
        public e() {
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void c() {
            LinkedTextView titleView;
            RecyclerPaginatedView recyclerPaginatedView = FavesTabSearchFragment.this.V;
            View emptyView = recyclerPaginatedView != null ? recyclerPaginatedView.getEmptyView() : null;
            FavesEmptyListView favesEmptyListView = emptyView instanceof FavesEmptyListView ? (FavesEmptyListView) emptyView : null;
            if (favesEmptyListView != null && (titleView = favesEmptyListView.getTitleView()) != null) {
                titleView.setText(R.string.fave_empty_pages);
            }
            if (favesEmptyListView != null) {
                favesEmptyListView.setActionButtonVisible(false);
            }
            if (favesEmptyListView != null) {
                int i = FavesFragment.j0;
                f4m.q(FavesFragment.j0, favesEmptyListView);
            }
        }
    }

    /* compiled from: FavesTabSearchFragment.kt */
    public static final class f extends RecyclerView.i {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            i();
        }

        public final void i() {
            String e;
            String str;
            FavesTabSearchFragment favesTabSearchFragment = FavesTabSearchFragment.this;
            yrq yrqVar = favesTabSearchFragment.Y;
            if (yrqVar == null) {
                yrqVar = null;
            }
            yrqVar.unregisterAdapterDataObserver(this);
            FaveTag faveTag = favesTabSearchFragment.d0;
            boolean z = faveTag != null;
            if (z) {
                if (faveTag == null || (str = faveTag.c) == null) {
                    str = "";
                }
                e = y8g0.f(R.string.fave_empty_tag_common_category, str);
            } else {
                String str2 = favesTabSearchFragment.c0;
                e = (str2 == null || str2.length() <= 0) ? y8g0.e(R.string.fave_empty_pages) : y8g0.e(R.string.fave_search_empty);
            }
            qnq qnqVar = new qnq(e, dhr0.a0(R.attr.actionBarSize) + y8g0.a(R.dimen.fave_search_input_height), z);
            xrq xrqVar = favesTabSearchFragment.Z;
            if (xrqVar == null) {
                xrqVar = null;
            }
            boolean isEmpty = ((ArrayList) xrqVar.y0()).isEmpty();
            rnq rnqVar = favesTabSearchFragment.b0;
            if (rnqVar == null) {
                rnqVar = null;
            }
            boolean isEmpty2 = ((ArrayList) rnqVar.y0()).isEmpty();
            if (isEmpty && isEmpty2) {
                rnq rnqVar2 = favesTabSearchFragment.b0;
                if (rnqVar2 == null) {
                    rnqVar2 = null;
                }
                rnqVar2.x0(qnqVar);
            } else if (isEmpty && !isEmpty2) {
                rnq rnqVar3 = favesTabSearchFragment.b0;
                if (rnqVar3 == null) {
                    rnqVar3 = null;
                }
                rnqVar3.J0(0, qnqVar);
            } else if ((isEmpty || !isEmpty2) && !isEmpty && !isEmpty2) {
                rnq rnqVar4 = favesTabSearchFragment.b0;
                if (rnqVar4 == null) {
                    rnqVar4 = null;
                }
                rnqVar4.D0(0);
            }
            yrq yrqVar2 = favesTabSearchFragment.Y;
            (yrqVar2 != null ? yrqVar2 : null).registerAdapterDataObserver(this);
        }
    }

    public static boolean io(z990 z990Var, FaveTag faveTag) {
        FavePage favePage;
        List<FaveTag> list;
        Object obj = null;
        if (z990Var != null && (favePage = z990Var.a) != null && (list = favePage.i) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((FaveTag) next).b == faveTag.b) {
                    obj = next;
                    break;
                }
            }
            obj = (FaveTag) obj;
        }
        return obj != null;
    }

    public final void jo() {
        RecyclerPaginatedView recyclerPaginatedView = this.V;
        if (recyclerPaginatedView == null) {
            return;
        }
        Context context = recyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        gjf0.g(recyclerPaginatedView, fnj.d(context) ? cn70.b(8) : 0, 10);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        FaveSearchType faveSearchType;
        FaveSource faveSource;
        String string;
        super.onCreate(bundle);
        FaveSearchType.a aVar = FaveSearchType.Companion;
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("search_type_key") : null;
        aVar.getClass();
        FaveSearchType faveSearchType2 = FaveSearchType.FAVE_PEOPLE;
        if (epx.f(string2, faveSearchType2.h())) {
            faveSearchType = faveSearchType2;
        } else {
            faveSearchType = FaveSearchType.FAVE_COMMUNITY;
            if (!epx.f(string2, faveSearchType.h())) {
                L.l(go9.b("Can't find fave search tab for ", string2));
                faveSearchType = null;
            }
        }
        if (faveSearchType == null) {
            L.l("Can't setup search fave tab without tab");
            cvk.u(R.string.error, false);
        }
        if (faveSearchType != null) {
            faveSearchType2 = faveSearchType;
        }
        this.S = faveSearchType2;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("source")) != null) {
            FaveSource.Companion.getClass();
            faveSource = FaveSource.a.a(string);
        }
        faveSource = FaveSource.MENU;
        this.T = faveSource;
        if (faveSource == null) {
            faveSource = null;
        }
        this.Z = new xrq(faveSource, (StoryViewerRouter) this.e0.getValue());
        lqq lqqVar = new lqq(new c(1, this, FavesTabSearchFragment.class, "search", "search(Ljava/lang/String;)V", 0));
        lqqVar.n0(Collections.singletonList(new g990(faveSearchType != null ? Integer.valueOf(faveSearchType.j()) : null)));
        this.a0 = lqqVar;
        this.Y = new yrq();
        this.b0 = new rnq();
        Bundle arguments3 = getArguments();
        this.d0 = arguments3 != null ? (FaveTag) arguments3.getParcelable("fave_tag") : null;
        yrq yrqVar = this.Y;
        if (yrqVar == null) {
            yrqVar = null;
        }
        lqq lqqVar2 = this.a0;
        if (lqqVar2 == null) {
            lqqVar2 = null;
        }
        yrqVar.K0(lqqVar2);
        yrq yrqVar2 = this.Y;
        if (yrqVar2 == null) {
            yrqVar2 = null;
        }
        xrq xrqVar = this.Z;
        if (xrqVar == null) {
            xrqVar = null;
        }
        yrqVar2.K0(xrqVar);
        yrq yrqVar3 = this.Y;
        if (yrqVar3 == null) {
            yrqVar3 = null;
        }
        rnq rnqVar = this.b0;
        if (rnqVar == null) {
            rnqVar = null;
        }
        yrqVar3.K0(rnqVar);
        yrq yrqVar4 = this.Y;
        (yrqVar4 != null ? yrqVar4 : null).registerAdapterDataObserver(this.f0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fave_search_fragment, viewGroup, false);
        this.U = inflate;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.fave_search_list);
        this.V = recyclerPaginatedView;
        if (recyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
            dVar.c(2);
            dVar.f = 1;
            dVar.a();
            recyclerPaginatedView.setUiStateCallbacks(this.g0);
            yrq yrqVar = this.Y;
            if (yrqVar == null) {
                yrqVar = null;
            }
            recyclerPaginatedView.setAdapter(yrqVar);
            recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
            jo();
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            if (recyclerView != null) {
                Context requireContext = requireContext();
                HashSet hashSet = iah0.a;
                recyclerView.addItemDecoration(new sqq(fnj.d(requireContext) ? cn70.b(8) : 0, cn70.b(12)));
            }
            c.h hVar = new c.h(this.i0);
            hVar.s = 0;
            this.X = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        p870.f().g(this.j0);
        p870.f().g(this.h0);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        p870 f2 = p870.f();
        dck dckVar = this.j0;
        f2.b(1208, dckVar);
        p870.f().b(1209, dckVar);
        p870 f3 = p870.f();
        usq usqVar = this.h0;
        f3.b(InterfaceC4319fe.a.c, usqVar);
        p870.f().b(1204, usqVar);
        p870.f().b(1205, usqVar);
        p870.f().b(InterfaceC4319fe.a.b, usqVar);
        ((StoriesComponent) m7m.d(this).a(fpf0.a(StoriesComponent.class))).Pa().a(new d(1, this, FavesTabSearchFragment.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerPaginatedView recyclerPaginatedView = this.V;
        if (recyclerPaginatedView == null) {
            return false;
        }
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        if (recyclerView == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        FaveSearchType faveSearchType = this.S;
        if (faveSearchType == null) {
            faveSearchType = null;
        }
        uiTrackingScreen.a = faveSearchType.i();
    }
}
