package com.vk.ecomm.onlinebooking.impl.navhostfragment.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.api.router.BookingSource;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingSource;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingStartViewItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.as7;
import xsna.bpn0;
import xsna.bs7;
import xsna.cqm0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.f1;
import xsna.fkq0;
import xsna.hzp0;
import xsna.j5g;
import xsna.jeq0;
import xsna.kas;
import xsna.krv0;
import xsna.l7s;
import xsna.lm7;
import xsna.msy;
import xsna.ng1;
import xsna.oz50;
import xsna.tq7;
import xsna.w8i;
import xsna.yc;
import xsna.zr7;

/* compiled from: BookingNavHostFragment.kt */
/* loaded from: classes18.dex */
public final class BookingNavHostFragment extends FragmentImpl implements w8i {
    public static final /* synthetic */ int S = 0;
    public final Object N;
    public final bpn0 O;
    public final Object P;
    public final Object Q;
    public final zr7 R;

    /* compiled from: BookingNavHostFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, String str, String str2, BookingSource bookingSource) {
            super(BookingNavHostFragment.class, null, null);
            this.j.putParcelable("groupId", userId);
            this.j.putString("screenTag", str2);
            this.j.putSerializable("source", bookingSource);
            this.j.putString("url", str);
        }
    }

    public BookingNavHostFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 10));
        this.O = new bpn0(new f1(this, 9));
        this.P = msy.a(lazyThreadSafetyMode, new ng1(this, 10));
        this.Q = msy.a(lazyThreadSafetyMode, new yc(this, 12));
        this.R = new zr7(this, 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Fragment G;
        FragmentManager fragmentManager = fo().f;
        boolean z = false;
        if (fragmentManager.K() > 0 && (G = fragmentManager.G(R.id.fragment_container)) != null) {
            FragmentImpl fragmentImpl = G instanceof FragmentImpl ? (FragmentImpl) G : null;
            Boolean valueOf = fragmentImpl != null ? Boolean.valueOf(fragmentImpl.a0()) : null;
            if (valueOf != null) {
                z = valueOf.booleanValue();
            }
        }
        return z;
    }

    public final UserId eo() {
        return (UserId) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tq7 fo() {
        return (tq7) this.Q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void go(as7 as7Var) {
        String str;
        Fragment fragment;
        b bVar;
        int i = -1;
        b bVar2 = null;
        if (as7Var instanceof as7.j) {
            tq7 fo = fo();
            BookingScreenParams bookingScreenParams = ((as7.j) as7Var).a;
            List<Fragment> f = fo.f.c.f();
            ListIterator<Fragment> listIterator = f.listIterator(f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fragment = null;
                    break;
                } else {
                    fragment = listIterator.previous();
                    if (fragment.isVisible()) {
                        break;
                    }
                }
            }
            Fragment fragment2 = fragment;
            if (fragment2 instanceof bs7) {
                bVar2 = ((bs7) fragment2).X9();
            } else {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(kas.a("Screen ", fragment2, " is not BookingNavScreen")));
            }
            LinkedList<b> linkedList = a.b.a(bookingScreenParams != null ? bookingScreenParams.c : a.f.d.a).b;
            Iterator<b> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (bVar2 != null && next.getClass() == bVar2.getClass()) {
                    i = r2;
                    break;
                }
                r2++;
            }
            if (i < 0 || e43.h(linkedList) <= i) {
                b.a.getClass();
                bVar = b.c.b;
            } else {
                bVar = linkedList.get(i + 1);
            }
            fo.c(bVar, bookingScreenParams);
            return;
        }
        if (as7Var.equals(as7.b.a)) {
            tq7 fo2 = fo();
            UserId eo = eo();
            fo2.g.getClass();
            UiTracker.i.g();
            FragmentManager fragmentManager = fo2.f;
            r2 = fragmentManager.K() > 1 ? 1 : 0;
            fragmentManager.Y();
            if (r2 == 0) {
                fo2.a(eo, null);
                return;
            }
            return;
        }
        if (as7Var instanceof as7.c) {
            tq7 fo3 = fo();
            UserId eo2 = eo();
            b.j jVar = ((as7.c) as7Var).a;
            fo3.g.getClass();
            UiTracker.i.g();
            FragmentManager fragmentManager2 = fo3.f;
            boolean z = fragmentManager2.K() > 1;
            if (z) {
                str = "OnlineBooking" + jVar;
            } else {
                str = null;
            }
            fragmentManager2.Z(-1, 0, str);
            if (z) {
                return;
            }
            fo3.a(eo2, null);
            return;
        }
        if (as7Var instanceof as7.a) {
            fo().a(eo(), ((as7.a) as7Var).a);
            return;
        }
        if (as7Var instanceof as7.m) {
            tq7 fo4 = fo();
            as7.m mVar = (as7.m) as7Var;
            BookingScreenParams bookingScreenParams2 = mVar.a;
            if (mVar.b) {
                fo4.f.Z(-1, 1, null);
            } else {
                fo4.getClass();
            }
            b bVar3 = (b) j5g.a0(a.b.a(bookingScreenParams2 != null ? bookingScreenParams2.c : a.f.d.a).b);
            if (bVar3 == null) {
                b.a.getClass();
                bVar3 = b.c.b;
            }
            fo4.c(bVar3, bookingScreenParams2);
            return;
        }
        if (as7Var instanceof as7.l) {
            fo().i(((as7.l) as7Var).a, true, false);
            return;
        }
        if (as7Var instanceof as7.d) {
            fo().d(null, true, true, false);
            return;
        }
        if (as7Var instanceof as7.f) {
            fo().f(((as7.f) as7Var).a);
            return;
        }
        if (as7Var instanceof as7.g) {
            fo().e(null, false, false);
            return;
        }
        if (as7Var instanceof as7.h) {
            fo().h(((as7.h) as7Var).a);
            return;
        }
        if (as7Var instanceof as7.i) {
            fo().j(null);
            return;
        }
        if (as7Var instanceof as7.k) {
            fo().g(null);
        } else {
            if (!(as7Var instanceof as7.e)) {
                throw new NoWhenBranchMatchedException();
            }
            tq7 fo5 = fo();
            String str2 = ((as7.e) as7Var).a;
            fo5.getClass();
            if (drm0.N(str2)) {
                return;
            }
            fo5.b.getBrowser().f(fo5.a.requireContext(), null, LaunchContext.A, str2);
        }
    }

    public final void ho() {
        Window window;
        Context requireContext;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (requireArguments().getBoolean("force_dark_theme", false)) {
            TypedValue typedValue = krv0.a;
            Integer d = krv0.d();
            requireContext = d != null ? new l7s(requireContext(), d.intValue()) : requireContext();
        } else {
            requireContext = requireContext();
        }
        int m = krv0.m(R.attr.vk_ui_background_content, requireContext);
        TypedValue typedValue2 = krv0.a;
        krv0.s(window, m);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = krv0.a;
        krv0.a(this.R);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.booking_nav_fragment_container, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TypedValue typedValue = krv0.a;
        krv0.k(this.R);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ho();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        BookingSource bookingSource;
        String str;
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource;
        Object obj;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments.getSerializable("source", BookingSource.class);
            } else {
                Object serializable = arguments.getSerializable("source");
                if (!(serializable instanceof BookingSource)) {
                    serializable = null;
                }
                obj = (BookingSource) serializable;
            }
            bookingSource = (BookingSource) obj;
        }
        bookingSource = BookingSource.RECORD;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("screenTag")) == null) {
            str = "";
        }
        String m = cqm0.m(str);
        com.vk.ecomm.onlinebooking.impl.navhostfragment.a aVar = a.o.d;
        if (!m.equals(aVar.c)) {
            aVar = a.j.d;
            if (!m.equals(aVar.c)) {
                aVar = a.h.d;
                if (!m.equals(aVar.c)) {
                    aVar = a.e.d;
                    if (!m.equals(aVar.c)) {
                        aVar = a.k.d;
                        if (!m.equals(aVar.c)) {
                            aVar = a.l.d;
                            if (!m.equals(aVar.c)) {
                                aVar = a.f.d;
                            }
                        }
                    }
                }
            }
        }
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("url") : null;
        String str2 = string == null ? "" : string;
        LinkedHashMap a2 = jeq0.a(Uri.parse(str2));
        String str3 = (String) a2.get("service_type");
        if (bundle == null) {
            lm7 Df = ((OnlineBookingInternalComponent) this.P.getValue()).Df();
            UserId eo = eo();
            Df.getClass();
            int i = lm7.a.$EnumSwitchMapping$0[bookingSource.ordinal()];
            if (i == 1) {
                commonMarketStat$TypeSmbNativeBookingSource = CommonMarketStat$TypeSmbNativeBookingSource.RECORD;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                commonMarketStat$TypeSmbNativeBookingSource = CommonMarketStat$TypeSmbNativeBookingSource.REPEAT_RECORD;
            }
            Df.a = commonMarketStat$TypeSmbNativeBookingSource;
            CommonMarketStat$TypeSmbNativeBookingStartViewItem commonMarketStat$TypeSmbNativeBookingStartViewItem = new CommonMarketStat$TypeSmbNativeBookingStartViewItem(Long.valueOf(fkq0.e(eo).b), null, null, str2, Df.a, null, 38, null);
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null);
            UiTracker uiTracker = UiTracker.a;
            UiTrackingScreen b = UiTracker.j.b();
            new hzp0.h0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, null, null, commonMarketStat$TypeSmbNativeBookingStartViewItem, 30)).a();
        }
        Bundle arguments4 = getArguments();
        if (epx.f(arguments4 != null ? Boolean.valueOf(arguments4.getBoolean("force_dark_theme")) : null, Boolean.TRUE)) {
            TypedValue typedValue = krv0.a;
            Integer d = krv0.d();
            view.setBackgroundColor(krv0.m(R.attr.vk_ui_background, d != null ? new l7s(requireContext(), d.intValue()) : requireContext()));
        }
        go(new as7.m(new BookingScreenParams(eo(), aVar.a, null, null, null, false, null, null, null, null, 0, null, 0, null, a2, epx.f(str3, "individual") ? BookingServiceType.INDIVIDUAL : epx.f(str3, "activity") ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL, null, 81916, null), false));
    }
}
