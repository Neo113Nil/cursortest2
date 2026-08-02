package com.vk.profile.community.impl.ui.profile;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.lego.CommunityAuthorHeaderMode;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.b;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.o;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.a3i;
import xsna.ajh;
import xsna.ao50;
import xsna.asl0;
import xsna.asu0;
import xsna.azh0;
import xsna.b0u0;
import xsna.b1h;
import xsna.b3i;
import xsna.b9c0;
import xsna.bkm;
import xsna.bo8;
import xsna.bpn0;
import xsna.bu0;
import xsna.c60;
import xsna.c7h;
import xsna.csh;
import xsna.ctg;
import xsna.cuz;
import xsna.dhr0;
import xsna.dsc;
import xsna.e43;
import xsna.egc0;
import xsna.eja;
import xsna.el3;
import xsna.enj;
import xsna.epx;
import xsna.eu0;
import xsna.f4z;
import xsna.f5z;
import xsna.feh;
import xsna.fes;
import xsna.fkq0;
import xsna.fnj;
import xsna.fpf0;
import xsna.gm50;
import xsna.gr3;
import xsna.gsh;
import xsna.gu50;
import xsna.gzs;
import xsna.h5s;
import xsna.hf8;
import xsna.hg1;
import xsna.hh1;
import xsna.i4e;
import xsna.i4h;
import xsna.iah0;
import xsna.iax;
import xsna.ijr0;
import xsna.in0;
import xsna.iut0;
import xsna.izs;
import xsna.j6e;
import xsna.ji0;
import xsna.jtg;
import xsna.k7m;
import xsna.kbj0;
import xsna.km50;
import xsna.kp1;
import xsna.l46;
import xsna.lp1;
import xsna.lpj;
import xsna.lrv0;
import xsna.m7m;
import xsna.mk50;
import xsna.mmf;
import xsna.mph;
import xsna.msy;
import xsna.myc0;
import xsna.mzp0;
import xsna.n8;
import xsna.ncg;
import xsna.neh;
import xsna.nrh;
import xsna.nth;
import xsna.o1i;
import xsna.ocg;
import xsna.owd0;
import xsna.p0e0;
import xsna.p0z;
import xsna.p8;
import xsna.pce;
import xsna.q8;
import xsna.qhh0;
import xsna.qoh;
import xsna.r8;
import xsna.rf1;
import xsna.ry0;
import xsna.s200;
import xsna.s3q0;
import xsna.s7;
import xsna.s8;
import xsna.smq;
import xsna.soh;
import xsna.su50;
import xsna.szf0;
import xsna.t5h;
import xsna.t6g0;
import xsna.toh;
import xsna.too0;
import xsna.um0;
import xsna.uth;
import xsna.v9;
import xsna.vk50;
import xsna.w8i;
import xsna.wod;
import xsna.woh;
import xsna.wth;
import xsna.ww50;
import xsna.xif0;
import xsna.xn50;
import xsna.yah;
import xsna.ynh;
import xsna.yw90;
import xsna.z23;
import xsna.zah;

/* compiled from: CommunityProfileFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileFragment extends MviImplFragment<com.vk.profile.community.impl.ui.profile.a, CommunityProfileViewState, CommunityProfileAction> implements w8i, fes, bkm, o1i.a, qhh0, wod, owd0, szf0, too0 {
    public static final /* synthetic */ int k0 = 0;
    public final Object Q;
    public final a R;
    public com.vk.profile.community.impl.ui.profile.f S;
    public com.vk.profile.community.impl.ui.profile.actions.e T;
    public final Object U;
    public final ynh V;
    public final b9c0 W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final nth a0;
    public final feh b0;
    public final Object c0;
    public final bpn0 d0;
    public com.vk.profile.community.impl.ui.profile.e e0;
    public ContentTab f0;
    public final CommunityProfileFragment$receiver$1 g0;
    public boolean h0;
    public final i i0;
    public final Object j0;

    /* compiled from: CommunityProfileFragment.kt */
    public static final class a extends FragmentImpl.b {
        public a() {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            int i = CommunityProfileFragment.k0;
            CommunityAuthorHeaderMode go = CommunityProfileFragment.this.go();
            go.getClass();
            if (go == CommunityAuthorHeaderMode.Lego) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: CommunityProfileFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ExtendedCommunityProfile, egc0> {
        @Override // xsna.izs
        public final egc0 invoke(ExtendedCommunityProfile extendedCommunityProfile) {
            return ((gsh) this.receiver).a(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunityProfileFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<ContentTab> {
        @Override // xsna.gzs
        public final ContentTab invoke() {
            return ((CommunityProfileFragment) this.receiver).f0;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof asl0.a);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final asl0.a invoke(Object obj) {
            if (obj != null) {
                return (asl0.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.story.api.di.StoriesEvent.AnimationBitmap");
        }
    }

    /* compiled from: CommunityProfileFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class g implements izs {
        public static final g b = new g();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof asl0.b);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class h implements izs {
        public static final h b = new h();

        @Override // xsna.izs
        public final asl0.b invoke(Object obj) {
            if (obj != null) {
                return (asl0.b) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.story.api.di.StoriesEvent.AnimationReady");
        }
    }

    /* compiled from: CommunityProfileFragment.kt */
    public static final class i implements lrv0.a {
        public i() {
        }

        @Override // xsna.lrv0.a
        public final void xb() {
            if (CommunityProfileFragment.this.h0) {
                Intent intent = new Intent("request_update_bottom_theme_event");
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                cuz.a(context).c(intent);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.vk.profile.community.impl.ui.profile.CommunityProfileFragment$receiver$1] */
    public CommunityProfileFragment() {
        bu0 bu0Var = new bu0(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, bu0Var);
        this.R = new a();
        this.U = msy.a(lazyThreadSafetyMode, new pce(this, 8));
        this.V = new ynh(m7m.f(this), this);
        this.W = new b9c0(this, new eja());
        this.X = msy.a(lazyThreadSafetyMode, new b1h(this, 2));
        this.Y = msy.a(lazyThreadSafetyMode, new ncg(this, 6));
        this.Z = msy.a(lazyThreadSafetyMode, new hh1(this, 28));
        this.a0 = new nth();
        this.b0 = new feh();
        this.c0 = msy.a(lazyThreadSafetyMode, new ocg(this, 5));
        this.d0 = new bpn0(new ry0(this, 28));
        this.f0 = new ContentTab.Wall(false, 3);
        this.g0 = new BroadcastReceiver() { // from class: com.vk.profile.community.impl.ui.profile.CommunityProfileFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                xn50.a.c(CommunityProfileFragment.this, new CommunityProfileAction.d(intent));
            }
        };
        this.i0 = new i();
        this.j0 = msy.a(lazyThreadSafetyMode, new ji0(this, 28));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        go();
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        io.reactivex.rxjava3.disposables.b bVar = getFeature().e;
        com.vk.profile.community.impl.ui.profile.b io2 = io();
        zah jo = jo(requireArguments());
        b3i b3iVar = (b3i) this.X.getValue();
        iax iaxVar = (iax) this.U.getValue();
        soh sohVar = new soh(this);
        mzp0 mzp0Var = this.J;
        yw90 On = On();
        b bVar2 = new b(1, (gsh) this.j0.getValue(), gsh.class, "postingItemPresenter", "postingItemPresenter(Lcom/vkontakte/android/api/ExtendedCommunityProfile;)Lcom/vk/newsfeed/api/posting/PostingItemContract$Presenter;", 0);
        Bundle arguments = getArguments();
        com.vk.profile.community.impl.ui.profile.f fVar = new com.vk.profile.community.impl.ui.profile.f(requireContext, viewLifecycleOwner, bVar, io2, this.V, jo, b3iVar, iaxVar, sohVar, mzp0Var, On, arguments != null ? arguments.getBoolean("community_as_viewpager_holder") : false, bVar2, new c(0, this, CommunityProfileFragment.class, "getCurrentTab", "getCurrentTab()Lcom/vk/profile/core/content/ContentTab;", 0));
        this.S = fVar;
        return new mk50.c(fVar.k);
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return bo8.a(bundle, Collections.singleton("id"), getArguments()) && bundle.getBoolean("can_reorder", true);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        CommunityProfileViewState communityProfileViewState = (CommunityProfileViewState) ao50Var;
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        gm50.a.b(fVar, communityProfileViewState.a, new v9(fVar, 29));
        ((f4z) getFeature().f.b).a(new i4h(this, 2), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.R;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        mph mphVar;
        ExtendedCommunityProfile extendedCommunityProfile;
        this.R.b();
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null || (extendedCommunityProfile = (mphVar = fVar.C).q) == null) {
            return;
        }
        ((egc0) mphVar.k.invoke(extendedCommunityProfile)).N2();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        try {
            com.vk.profile.community.impl.ui.profile.f fVar = this.S;
            if (fVar == null) {
                fVar = null;
            }
            fVar.b(rect2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // xsna.o1i.a
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        getFeature().e.b(cVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.c();
    }

    @Override // xsna.bkm
    public final void bb(int i2) {
        jtg jtgVar = (jtg) this.W.d;
        if (jtgVar != null) {
            ijr0 ijr0Var = jtgVar.g;
            if (i2 > 0) {
                ijr0Var.a(3, false);
            } else {
                ijr0Var.a(3, true);
            }
        }
    }

    @Override // xsna.fes
    public final boolean df() {
        return true;
    }

    @Override // xsna.o1i.a
    public final void dl(ExtendedCommunityProfile extendedCommunityProfile) {
        t8(extendedCommunityProfile, false);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    /* renamed from: eo */
    public final km50 sf(Parcelable parcelable) {
        CommunityProfileSavedState communityProfileSavedState = parcelable instanceof CommunityProfileSavedState ? (CommunityProfileSavedState) parcelable : null;
        Integer num = communityProfileSavedState != null ? communityProfileSavedState.b : null;
        return new CommunityProfileState(new CommunityProfileContent((UserId) null, (List) null, (ContentTab) null, (String) null, false, (Integer) null, num != null ? new CommunityProfileContent.InitialPosition(num.intValue(), CommunityProfileContent.InitialPosition.ScrollToContentType.NONE) : null, false, false, (Pair) null, 1983));
    }

    public final o1i.a.InterfaceC3433a fo() {
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar != null) {
            return fVar.v.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CommunityAuthorHeaderMode go() {
        return (CommunityAuthorHeaderMode) this.Q.getValue();
    }

    public final UserId ho() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            UserId userId = (UserId) parcelable;
            if (userId != null) {
                return userId;
            }
        }
        return UserId.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.profile.community.impl.ui.profile.b io() {
        return (com.vk.profile.community.impl.ui.profile.b) this.Z.getValue();
    }

    public final zah jo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("search_stats_logging_info");
            if (!(parcelable3 instanceof SearchStatsLoggingInfo)) {
                parcelable3 = null;
            }
            parcelable = (SearchStatsLoggingInfo) parcelable3;
        }
        return new zah((azh0) this.V.b.getValue(), (SearchStatsLoggingInfo) parcelable);
    }

    @Override // xsna.x2i
    public final void mn(a3i a3iVar) {
        CommunityProfileState.d dVar;
        if (a3iVar instanceof a3i.b) {
            dVar = new CommunityProfileState.d.b(((a3i.b) a3iVar).a);
        } else if (a3iVar instanceof a3i.a) {
            dVar = CommunityProfileState.d.a.a;
        } else {
            if (!(a3iVar instanceof a3i.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = CommunityProfileState.d.e.a;
        }
        getFeature().C(new CommunityProfileAction.u(dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String stringExtra;
        Object failure;
        JSONObject jSONObject;
        String optString;
        CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType menuSnackBarType;
        Parcelable parcelable;
        Object parcelableExtra;
        n8 n8Var = ((woh) this.c0.getValue()).a;
        if (i2 != 999) {
            if (i2 != 1004) {
                if (i2 == 3238) {
                    n8Var.invoke(new CommunityProfileAction.h());
                } else if (i2 == 3901) {
                    n8Var.invoke(new CommunityProfileAction.p(i2, i3, intent));
                } else if (i2 != 3903) {
                    switch (i2) {
                        case 101:
                            if (i3 == -1) {
                                n8Var.invoke(new CommunityProfileAction.o(true));
                                n8Var.invoke(CommunityProfileAction.t.b);
                                break;
                            }
                            break;
                    }
                } else if (i3 == -1 && intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("uid", UserId.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("uid");
                        if (!(parcelableExtra2 instanceof UserId)) {
                            parcelableExtra2 = null;
                        }
                        parcelable = (UserId) parcelableExtra2;
                    }
                    UserId userId = (UserId) parcelable;
                    if (userId != null) {
                        n8Var.invoke(new CommunityProfileAction.q(userId));
                    }
                }
            } else if (intent != null) {
                n8Var.invoke(new CommunityProfileAction.r(intent));
            }
            super.onActivityResult(i2, i3, intent);
        }
        if (i3 == -1) {
            n8Var.invoke(new CommunityProfileAction.o(true));
            if (intent != null && (stringExtra = intent.getStringExtra("VKWebAppClose_payload")) != null) {
                try {
                    jSONObject = new JSONObject(stringExtra);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (jSONObject.optBoolean("shouldShowSnackBar") && (optString = jSONObject.optString("type")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != 96417) {
                        if (hashCode != 3108362) {
                            if (hashCode == 1093755131 && optString.equals("reorder")) {
                                menuSnackBarType = CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.REORDER;
                                failure = new CommunityProfileAction.MiniAppMenuResultSnackBar(menuSnackBarType, jSONObject.getBoolean("isSuccess"));
                                if (!(failure instanceof Result.Failure)) {
                                    n8Var.invoke((CommunityProfileAction.MiniAppMenuResultSnackBar) failure);
                                }
                            }
                        } else if (optString.equals("edit")) {
                            menuSnackBarType = CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.EDIT_ITEM;
                            failure = new CommunityProfileAction.MiniAppMenuResultSnackBar(menuSnackBarType, jSONObject.getBoolean("isSuccess"));
                            if (!(failure instanceof Result.Failure)) {
                            }
                        }
                    } else if (optString.equals("add")) {
                        menuSnackBarType = CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.ADD_ITEM;
                        failure = new CommunityProfileAction.MiniAppMenuResultSnackBar(menuSnackBarType, jSONObject.getBoolean("isSuccess"));
                        if (!(failure instanceof Result.Failure)) {
                        }
                    }
                    failure = new Result.Failure(th);
                    if (!(failure instanceof Result.Failure)) {
                    }
                }
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public final void onAttach(Context context) {
        super.onAttach(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        intentFilter.addAction("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        int i2 = Build.VERSION.SDK_INT;
        CommunityProfileFragment$receiver$1 communityProfileFragment$receiver$1 = this.g0;
        if (i2 >= 33) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                mo2getContext.registerReceiver(communityProfileFragment$receiver$1, intentFilter, hf8.a, null, 4);
            }
        } else {
            Context mo2getContext2 = mo2getContext();
            if (mo2getContext2 != null) {
                mo2getContext2.registerReceiver(communityProfileFragment$receiver$1, intentFilter, hf8.a, null);
            }
        }
        IntentFilter a2 = z23.a("draft");
        Context mo2getContext3 = mo2getContext();
        if (mo2getContext3 != null) {
            cuz.a(mo2getContext3).b(communityProfileFragment$receiver$1, a2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null) {
            fVar = null;
        }
        com.vk.profile.community.impl.ui.profile.f fVar2 = fVar;
        fVar2.e();
        p0z p0zVar = fVar2.j;
        new kp1(1, fVar2, com.vk.profile.community.impl.ui.profile.f.class, "updateLegoLiveCoverBottomNavigationVisibility", "updateLegoLiveCoverBottomNavigationVisibility(Z)V", 0, 4);
        p0zVar.getClass();
        fVar2.B.a(ajh.a.a);
        fVar2.c.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        CommunityAuthorHeaderMode go = go();
        go.getClass();
        xn50.a.c(this, new CommunityProfileAction.j.a(go == CommunityAuthorHeaderMode.Lego || (iah0.s(requireContext) && !fnj.d(requireContext)), iah0.s(requireContext())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.os.Parcelable] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        SchemeStat$EventItem schemeStat$EventItem;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        super.onCreate(bundle);
        xn50.a.c(this, CommunityProfileAction.j.b.b);
        UserId ho = ho();
        feh fehVar = this.b0;
        if (bundle == null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("track_code", null) : null;
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString("referrer", null) : null;
            fehVar.getClass();
            UserId e2 = fkq0.e(ho);
            Set<String> set = p0e0.a;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(e2.b);
            jSONObject.put("group_ids", jSONArray);
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            String a2 = (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) ? null : t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
            if (string2 != null && string2.equalsIgnoreCase("TAB_BAR")) {
                jSONObject.put("source", string2);
                jSONObject.put("screen", a2);
            } else if (myc0.f(a2)) {
                jSONObject.put("source", a2);
            }
            if (string == null) {
                string = (uiTrackingScreen == null || (schemeStat$EventItem = uiTrackingScreen.f) == null) ? null : schemeStat$EventItem.a;
            }
            if (myc0.f(string)) {
                jSONObject.put("track_code", string);
            }
            new b.d(jSONObject, 0, "open_group").h();
        }
        fehVar.getClass();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("screen_view_data");
        b2.a(fkq0.a(ho), "group_id");
        bVar.k(b2.e());
        ww50 v = s200.v(kn());
        if (v != null) {
            v.j(this);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments3.getParcelable("catchup_link", CatchUpBanner.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments3.getParcelable("catchup_link");
                parcelable = parcelable3 instanceof CatchUpBanner ? parcelable3 : null;
            }
            r2 = (CatchUpBanner) parcelable;
        }
        if (r2 != null) {
            this.W.b(r2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.T != null) {
            CommunityAuthorHeaderMode go = go();
            go.getClass();
            if (go == CommunityAuthorHeaderMode.Lego) {
                neh nehVar = io().f.a;
                io.reactivex.rxjava3.disposables.g gVar = nehVar.c;
                gVar.dispose();
                nehVar.d = null;
                gVar.b(null);
                io().f.b.dispose();
            }
            com.vk.profile.community.impl.ui.profile.actions.e eVar = this.T;
            (eVar != null ? eVar : null).b.m.dispose();
        }
        ww50 v = s200.v(kn());
        if (v != null) {
            v.c0(this);
        }
        xn50.a.c(this, CommunityProfileAction.j.c.b);
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar != null) {
            p0z p0zVar = fVar.j;
            new lp1(1, fVar, com.vk.profile.community.impl.ui.profile.f.class, "updateLegoLiveCoverBottomNavigationVisibility", "updateLegoLiveCoverBottomNavigationVisibility(Z)V", 0, 4);
            p0zVar.getClass();
            xif0 xif0Var = (xif0) fVar.n.getValue();
            if (xif0Var != null) {
                xif0Var.b();
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        Context mo2getContext = mo2getContext();
        CommunityProfileFragment$receiver$1 communityProfileFragment$receiver$1 = this.g0;
        if (mo2getContext != null) {
            enj.s(mo2getContext, communityProfileFragment$receiver$1);
        }
        Context mo2getContext2 = mo2getContext();
        if (mo2getContext2 != null) {
            cuz.a(mo2getContext2).d(communityProfileFragment$receiver$1);
        }
        super.onDetach();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        xn50.a.c(this, CommunityProfileAction.j.d.b);
        super.onPause();
        jtg jtgVar = (jtg) this.W.d;
        if (jtgVar != null) {
            jtgVar.g.a(2, false);
        }
        dhr0.a.d(this.i0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar != null) {
            mph mphVar = fVar.C;
            ExtendedCommunityProfile extendedCommunityProfile = mphVar.q;
            if (extendedCommunityProfile != null) {
                ((egc0) mphVar.k.invoke(extendedCommunityProfile)).N2();
            }
            fVar.A.b(0);
        }
        xn50.a.c(this, CommunityProfileAction.j.e.b);
        dhr0.a.a(this.i0);
        jtg jtgVar = (jtg) this.W.d;
        if (jtgVar != null) {
            jtgVar.g.a(2, true);
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        q qVar = (q) this.d0.getValue();
        hg1.x0 x0Var = new hg1.x0(d.b);
        qVar.getClass();
        i0 i0Var = new i0(new i0(qVar, x0Var).U(new hg1.w0(e.b)), new rf1(new gr3(this, 26), 16));
        int i2 = 15;
        c60 c60Var = new c60(new mmf(this, 9), i2);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        o oVar = new o(i0Var.E(c60Var, lVar, kVar, kVar), new s7(new j6e(this, 7), 10));
        asu0.a.getClass();
        hg1.a(new c0(oVar.a0(asu0.m()), lVar, new l46(this, 3)).subscribe(new um0(new dsc(this, 14), 19), new eu0(new f(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i2)), getViewLifecycleOwner());
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null) {
            fVar = null;
        }
        fVar.k.setFitsSystemWindows(true);
        com.vk.profile.community.impl.ui.profile.f fVar2 = this.S;
        View view2 = (fVar2 != null ? fVar2 : null).k;
        toh tohVar = new toh();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view2, tohVar);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        com.vk.profile.community.impl.ui.profile.f fVar = this.S;
        if (fVar == null) {
            fVar = null;
        }
        fVar.A.a.smoothScrollToPosition(0);
        return true;
    }

    @Override // xsna.o1i.a
    public final void t8(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        if (z) {
            getFeature().C(new CommunityProfileAction.o(true));
        } else {
            getFeature().C(new CommunityProfileAction.w(0, extendedCommunityProfile));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    public final Parcelable vb() {
        List<CommunityProfileContentItem> list;
        com.vk.profile.community.impl.ui.profile.e eVar = this.e0;
        Integer num = null;
        if (eVar == null) {
            eVar = null;
        }
        CommunityProfileState communityProfileState = (CommunityProfileState) eVar.c;
        ContentTab contentTab = communityProfileState.e;
        Integer d2 = contentTab != null ? contentTab.d() : null;
        CommunityProfileContent communityProfileContent = communityProfileState.d;
        if (communityProfileContent != null && (list = communityProfileContent.b) != null) {
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((CommunityProfileContentItem) next).a.d(), d2)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                num = Integer.valueOf(i2);
            }
        }
        return new CommunityProfileSavedState(num);
    }

    @Override // xsna.wod
    public final boolean vl() {
        return this.h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        WallGetMode valueOf;
        CommunityAuthorHeaderMode communityAuthorHeaderMode;
        boolean z;
        CommunityProfileState communityProfileState;
        ContentTab contentTab;
        CommunityAuthorHeaderMode go;
        Object parcelable3;
        Object parcelable4;
        mzp0 mzp0Var = this.J;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            parcelable4 = bundle.getParcelable("id", UserId.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("id");
            if (!(parcelable5 instanceof UserId)) {
                parcelable5 = null;
            }
            parcelable = (UserId) parcelable5;
        }
        UserId userId = (UserId) parcelable;
        if (userId == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        if (i2 >= 33) {
            parcelable3 = bundle.getParcelable("community_deeplink_param", CommunityProfileDeeplinkParams.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable("community_deeplink_param");
            if (!(parcelable6 instanceof CommunityProfileDeeplinkParams)) {
                parcelable6 = null;
            }
            parcelable2 = (CommunityProfileDeeplinkParams) parcelable6;
        }
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = (CommunityProfileDeeplinkParams) parcelable2;
        String string = bundle.getString("referrer");
        String string2 = bundle.getString("track_code", null);
        String string3 = bundle.getString("wall_mode", null);
        if (string3 != null) {
            try {
                valueOf = WallGetMode.valueOf(string3);
            } catch (Exception e2) {
                com.vk.metrics.eventtracking.b.a.a(e2);
            }
            String string4 = km50Var != null ? bundle.getString("signature_param") : null;
            boolean z2 = bundle.getBoolean("community_from_clip");
            boolean z3 = bundle.getBoolean("community_from_creation_flow");
            Serializable serializable = bundle.getSerializable("entry_service_join_analytic_params");
            FullSourceJoinApi.EntryServiceType entryServiceType = !(serializable instanceof FullSourceJoinApi.EntryServiceType) ? (FullSourceJoinApi.EntryServiceType) serializable : null;
            String string5 = bundle.getString("prev_source_join_analytic_params");
            WallGetMode wallGetMode = valueOf;
            String string6 = bundle.getString("prev_screen_name_join_analytic_params");
            String str = string4;
            FullSourceJoinApi.EntryServiceType entryServiceType2 = entryServiceType;
            csh cshVar = new csh(userId2, communityProfileDeeplinkParams, mzp0Var, string, string2, wallGetMode, str, z2, z3, entryServiceType2, string5, string6);
            this.h0 = z2;
            CommunityAuthorHeaderMode go2 = go();
            go2.getClass();
            communityAuthorHeaderMode = CommunityAuthorHeaderMode.Lego;
            z = true;
            boolean z4 = go2 != communityAuthorHeaderMode;
            communityProfileState = !(km50Var instanceof CommunityProfileState) ? (CommunityProfileState) km50Var : null;
            if (communityProfileState == null) {
                communityProfileState = new CommunityProfileState(null);
            }
            boolean z5 = z4;
            com.vk.profile.community.impl.ui.profile.e eVar = new com.vk.profile.community.impl.ui.profile.e(userId2, communityProfileState, requireContext(), ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).xa(), new ctg(requireContext()), this.V, z5);
            this.e0 = eVar;
            contentTab = ((CommunityProfileState) eVar.c).e;
            if (contentTab == null) {
                contentTab = new ContentTab.Wall(false, 3);
            }
            this.f0 = contentTab;
            zah jo = jo(bundle);
            int i3 = 0;
            int i4 = 1;
            this.T = new com.vk.profile.community.impl.ui.profile.actions.e(requireContext(), new com.vk.profile.community.impl.ui.profile.c(this, jo, (b3i) this.X.getValue(), this.V, io(), bundle.getString("track_code", null), new in0(this, 28), ((ClipsConfigViewersComponent) ((k7m) m7m.f(this)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments(), new r8(1, (gsh) this.j0.getValue(), gsh.class, "postingItemPresenter", "postingItemPresenter(Lcom/vkontakte/android/api/ExtendedCommunityProfile;)Lcom/vk/newsfeed/api/posting/PostingItemContract$Presenter;", 0, 6), new com.vk.movika.sdk.base.logic.processor.actions.d(this, 29), new s8(1, this, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7), new qoh(entryServiceType2, string5, string6)), new wth(c7h.a((c7h) this.V.T0.getValue(), requireContext(), this, (b3i) this.X.getValue(), null, null, 24), (iax) this.U.getValue(), (nrh) this.V.t0.getValue()), new uth(cshVar.b, str), this, new yah(this, (su50) this.V.z.getValue(), (gu50) this.V.A.getValue(), (kbj0) this.V.A0.getValue(), (smq) this.V.L0.getValue(), new q8(i4, this, CommunityProfileFragment.class, "addDisposable", "addDisposable(Lio/reactivex/rxjava3/disposables/Disposable;)V", i3, 4)), io(), new p8(i4, this, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i3, 3), new i4e(this, 12));
            Context requireContext = requireContext();
            com.vk.profile.community.impl.ui.profile.e eVar2 = this.e0;
            com.vk.profile.community.impl.ui.profile.e eVar3 = eVar2 != null ? null : eVar2;
            t6g0 t6g0Var = t6g0.b;
            ExtendedProfilesRepository c2 = t6g0.c();
            Context requireContext2 = requireContext();
            go = go();
            go.getClass();
            if (go != communityAuthorHeaderMode && (!iah0.s(requireContext2) || fnj.d(requireContext2))) {
                z = false;
            }
            return new com.vk.profile.community.impl.ui.profile.a(requireContext, eVar3, cshVar, c2, z, z5, this.V, io().f.a, new t5h(userId2), jo);
        }
        valueOf = null;
        if (km50Var != null) {
        }
        boolean z22 = bundle.getBoolean("community_from_clip");
        boolean z32 = bundle.getBoolean("community_from_creation_flow");
        Serializable serializable2 = bundle.getSerializable("entry_service_join_analytic_params");
        if (!(serializable2 instanceof FullSourceJoinApi.EntryServiceType)) {
        }
        String string52 = bundle.getString("prev_source_join_analytic_params");
        WallGetMode wallGetMode2 = valueOf;
        String string62 = bundle.getString("prev_screen_name_join_analytic_params");
        String str2 = string4;
        FullSourceJoinApi.EntryServiceType entryServiceType22 = entryServiceType;
        csh cshVar2 = new csh(userId2, communityProfileDeeplinkParams, mzp0Var, string, string2, wallGetMode2, str2, z22, z32, entryServiceType22, string52, string62);
        this.h0 = z22;
        CommunityAuthorHeaderMode go22 = go();
        go22.getClass();
        communityAuthorHeaderMode = CommunityAuthorHeaderMode.Lego;
        z = true;
        if (go22 != communityAuthorHeaderMode) {
        }
        if (!(km50Var instanceof CommunityProfileState)) {
        }
        if (communityProfileState == null) {
        }
        boolean z52 = z4;
        com.vk.profile.community.impl.ui.profile.e eVar4 = new com.vk.profile.community.impl.ui.profile.e(userId2, communityProfileState, requireContext(), ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).xa(), new ctg(requireContext()), this.V, z52);
        this.e0 = eVar4;
        contentTab = ((CommunityProfileState) eVar4.c).e;
        if (contentTab == null) {
        }
        this.f0 = contentTab;
        zah jo2 = jo(bundle);
        int i32 = 0;
        int i42 = 1;
        this.T = new com.vk.profile.community.impl.ui.profile.actions.e(requireContext(), new com.vk.profile.community.impl.ui.profile.c(this, jo2, (b3i) this.X.getValue(), this.V, io(), bundle.getString("track_code", null), new in0(this, 28), ((ClipsConfigViewersComponent) ((k7m) m7m.f(this)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments(), new r8(1, (gsh) this.j0.getValue(), gsh.class, "postingItemPresenter", "postingItemPresenter(Lcom/vkontakte/android/api/ExtendedCommunityProfile;)Lcom/vk/newsfeed/api/posting/PostingItemContract$Presenter;", 0, 6), new com.vk.movika.sdk.base.logic.processor.actions.d(this, 29), new s8(1, this, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7), new qoh(entryServiceType22, string52, string62)), new wth(c7h.a((c7h) this.V.T0.getValue(), requireContext(), this, (b3i) this.X.getValue(), null, null, 24), (iax) this.U.getValue(), (nrh) this.V.t0.getValue()), new uth(cshVar2.b, str2), this, new yah(this, (su50) this.V.z.getValue(), (gu50) this.V.A.getValue(), (kbj0) this.V.A0.getValue(), (smq) this.V.L0.getValue(), new q8(i42, this, CommunityProfileFragment.class, "addDisposable", "addDisposable(Lio/reactivex/rxjava3/disposables/Disposable;)V", i32, 4)), io(), new p8(i42, this, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i32, 3), new i4e(this, 12));
        Context requireContext3 = requireContext();
        com.vk.profile.community.impl.ui.profile.e eVar22 = this.e0;
        if (eVar22 != null) {
        }
        t6g0 t6g0Var2 = t6g0.b;
        ExtendedProfilesRepository c22 = t6g0.c();
        Context requireContext22 = requireContext();
        go = go();
        go.getClass();
        if (go != communityAuthorHeaderMode) {
            z = false;
        }
        return new com.vk.profile.community.impl.ui.profile.a(requireContext3, eVar3, cshVar2, c22, z, z52, this.V, io().f.a, new t5h(userId2), jo2);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UserId userId;
        Bundle arguments = getArguments();
        this.a0.getClass();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("id")) == null) {
            userId = UserId.d;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(userId.b), null, null, arguments != null ? arguments.getString("track_code", null) : null, null, 32, null);
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
    }
}
