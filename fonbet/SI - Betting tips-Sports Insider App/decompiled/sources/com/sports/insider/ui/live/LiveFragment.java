package com.sports.insider.ui.live;

import a2.f;
import a2.q;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.live.LiveFragment;
import e.d0;
import eg.c0;
import eg.m0;
import eg.t1;
import eg.y;
import ge.b;
import ge.c;
import ge.d;
import ge.k;
import ge.s;
import gf.t;
import hg.t0;
import hg.u0;
import io.sentry.hints.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.z;
import lg.e;
import q4.r;
import u1.a;
import ve.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/live/LiveFragment;", "Landroidx/fragment/app/Fragment;", "Lge/b;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveFragment.kt\ncom/sports/insider/ui/live/LiveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* loaded from: classes.dex */
public final class LiveFragment extends Fragment implements b {

    /* renamed from: a, reason: collision with root package name */
    public k f6910a;

    /* renamed from: b, reason: collision with root package name */
    public x f6911b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6912c;

    /* renamed from: d, reason: collision with root package name */
    public final t f6913d;

    /* renamed from: e, reason: collision with root package name */
    public final t f6914e;

    /* renamed from: f, reason: collision with root package name */
    public final c f6915f;

    /* renamed from: g, reason: collision with root package name */
    public final c f6916g;

    /* renamed from: h, reason: collision with root package name */
    public final c f6917h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f6918i;

    /* JADX WARN: Type inference failed for: r0v6, types: [ge.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ge.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ge.c] */
    public LiveFragment() {
        super(R.layout.fragment_live_list);
        this.f6912c = new d(this, 0);
        this.f6913d = gf.k.b(new q(17, this));
        this.f6914e = gf.k.b(new b2.b(23));
        final int i5 = 0;
        this.f6915f = new q0(this) { // from class: ge.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveFragment f9961b;

            {
                this.f9961b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                k kVar;
                switch (i5) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        this.f9961b.G(bool != null ? bool.booleanValue() : true);
                        break;
                    case 1:
                        List newList = (List) obj;
                        if (newList != null && (kVar = this.f9961b.f6910a) != null) {
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            a aVar = kVar.f9979b;
                            List oldList = kVar.f9978a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f9958e = oldList;
                            aVar.f9959f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            kVar.f9978a = newList;
                            c2.f(new androidx.recyclerview.widget.c(kVar));
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        a0 a0Var = this.f9961b.f6918i;
                        if (a0Var != null) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) a0Var.f683e;
                            if (!Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                                if (floatingActionButton.getVisibility() != 4) {
                                    floatingActionButton.setVisibility(4);
                                    break;
                                }
                            } else if (floatingActionButton.getVisibility() != 0) {
                                floatingActionButton.setVisibility(0);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6916g = new q0(this) { // from class: ge.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveFragment f9961b;

            {
                this.f9961b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                k kVar;
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        this.f9961b.G(bool != null ? bool.booleanValue() : true);
                        break;
                    case 1:
                        List newList = (List) obj;
                        if (newList != null && (kVar = this.f9961b.f6910a) != null) {
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            a aVar = kVar.f9979b;
                            List oldList = kVar.f9978a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f9958e = oldList;
                            aVar.f9959f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            kVar.f9978a = newList;
                            c2.f(new androidx.recyclerview.widget.c(kVar));
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        a0 a0Var = this.f9961b.f6918i;
                        if (a0Var != null) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) a0Var.f683e;
                            if (!Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                                if (floatingActionButton.getVisibility() != 4) {
                                    floatingActionButton.setVisibility(4);
                                    break;
                                }
                            } else if (floatingActionButton.getVisibility() != 0) {
                                floatingActionButton.setVisibility(0);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6917h = new q0(this) { // from class: ge.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveFragment f9961b;

            {
                this.f9961b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                k kVar;
                switch (i11) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        this.f9961b.G(bool != null ? bool.booleanValue() : true);
                        break;
                    case 1:
                        List newList = (List) obj;
                        if (newList != null && (kVar = this.f9961b.f6910a) != null) {
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            a aVar = kVar.f9979b;
                            List oldList = kVar.f9978a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f9958e = oldList;
                            aVar.f9959f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            kVar.f9978a = newList;
                            c2.f(new androidx.recyclerview.widget.c(kVar));
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        a0 a0Var = this.f9961b.f6918i;
                        if (a0Var != null) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) a0Var.f683e;
                            if (!Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                                if (floatingActionButton.getVisibility() != 4) {
                                    floatingActionButton.setVisibility(4);
                                    break;
                                }
                            } else if (floatingActionButton.getVisibility() != 0) {
                                floatingActionButton.setVisibility(0);
                                break;
                            }
                        }
                        break;
                }
            }
        };
    }

    public final s F() {
        return (s) this.f6913d.getValue();
    }

    public final void G(boolean z5) {
        ViewParent viewParent;
        a0 a0Var = this.f6918i;
        if (a0Var != null) {
            ViewParent rvLive = (RecyclerView) a0Var.f684f;
            ViewParent emptySelectionLive = (LinearLayout) a0Var.f681c;
            if (z5) {
                Intrinsics.checkNotNullExpressionValue(emptySelectionLive, "emptySelectionLive");
                viewParent = emptySelectionLive;
            } else {
                Intrinsics.checkNotNullExpressionValue(rvLive, "rvLive");
                viewParent = rvLive;
            }
            View[] view = {viewParent};
            Intrinsics.checkNotNullParameter(view, "view");
            View view2 = view[0];
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (z5) {
                Intrinsics.checkNotNullExpressionValue(rvLive, "rvLive");
            } else {
                Intrinsics.checkNotNullExpressionValue(emptySelectionLive, "emptySelectionLive");
                rvLive = emptySelectionLive;
            }
            View[] view3 = {rvLive};
            Intrinsics.checkNotNullParameter(view3, "view");
            View view4 = view3[0];
            if (view4 != null) {
                view4.setVisibility(8);
            }
            if (z5) {
                View[] view5 = {(FloatingActionButton) a0Var.f683e};
                Intrinsics.checkNotNullParameter(view5, "view");
                View view6 = view5[0];
                if (view6 != null) {
                    view6.setVisibility(4);
                }
            }
        }
    }

    @Override // ge.b
    public final void b(nc.b live) {
        Intrinsics.checkNotNullParameter(live, "live");
        s F = F();
        String btnUrl = live.getBtnUrl();
        p0 activity = getActivity();
        F.getClass();
        if (btnUrl == null || activity == null) {
            return;
        }
        Continuation continuation = null;
        try {
            Object systemService = activity.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("url_to", btnUrl));
            t0 t0Var = rc.x.f22455a;
            Intrinsics.checkNotNullParameter("Copy", "msg");
            rc.x.f22455a.b(new gf.u(null, 500, "Copy"));
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, continuation, 18), 2);
        }
    }

    @Override // ge.b
    public final void n(nc.b live) {
        Intrinsics.checkNotNullParameter(live, "live");
        c0.t(d1.g(this), null, null, new androidx.lifecycle.c(this, live, (Continuation) null, 13), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_live_list, viewGroup, false);
        int i5 = R.id.empty_selection_live;
        LinearLayout linearLayout = (LinearLayout) y3.j(R.id.empty_selection_live, inflate);
        if (linearLayout != null) {
            i5 = R.id.empty_selection_tv_text_live;
            TextView textView = (TextView) y3.j(R.id.empty_selection_tv_text_live, inflate);
            if (textView != null) {
                i5 = R.id.fabBottomLive;
                FloatingActionButton floatingActionButton = (FloatingActionButton) y3.j(R.id.fabBottomLive, inflate);
                if (floatingActionButton != null) {
                    i5 = R.id.rvLive;
                    RecyclerView recyclerView = (RecyclerView) y3.j(R.id.rvLive, inflate);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                        this.f6918i = new a0(swipeRefreshLayout, linearLayout, textView, floatingActionButton, recyclerView, swipeRefreshLayout, 8);
                        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "getRoot(...)");
                        return swipeRefreshLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6912c.e();
        a0 a0Var = this.f6918i;
        if (a0Var != null) {
            RecyclerView recyclerView = (RecyclerView) a0Var.f684f;
            recyclerView.clearOnScrollListeners();
            recyclerView.removeItemDecoration((ge.t) this.f6914e.getValue());
            recyclerView.setAdapter(null);
        }
        this.f6918i = null;
        this.f6911b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        s F = F();
        F.getClass();
        a i5 = d1.i(F);
        e eVar = m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        Continuation continuation = null;
        c0.t(i5, dVar, null, new ge.r(F, continuation, 0), 2);
        c0.t(d1.i(F), dVar, null, new ge.r(F, continuation, 1), 2);
        c0.t(d1.i(F), dVar, null, new androidx.lifecycle.b(F, continuation, 3), 2);
        k kVar = this.f6910a;
        if (kVar != null) {
            kVar.f9980c = this;
        }
        d1.a(u0.h(F().f9998g, 100L)).e(getViewLifecycleOwner(), this.f6915f);
        d1.a(F().f9997f).e(getViewLifecycleOwner(), this.f6916g);
        d1.a(u0.h(F().f9999h, 100L)).e(getViewLifecycleOwner(), this.f6917h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        s F = F();
        t1 t1Var = F.f9994c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        F.f9994c = null;
        t1 t1Var2 = F.f9993b;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        F.f9993b = null;
        d1.a(u0.h(F().f9998g, 100L)).i(this.f6915f);
        d1.a(F().f9997f).i(this.f6916g);
        d1.a(u0.h(F().f9999h, 100L)).i(this.f6917h);
        k kVar = this.f6910a;
        if (kVar != null) {
            kVar.f9980c = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        dd.a d10 = F().f9995d.d();
        if (d10 != null) {
            d10.w().c("live_screen_show", null);
        }
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6912c);
        ArrayList arrayList = new ArrayList();
        ge.a aVar = new ge.a(0);
        aVar.f9958e = new ArrayList();
        aVar.f9959f = new ArrayList();
        this.f6910a = new k(arrayList, aVar, this);
        G(true);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, true);
        a0 a0Var = this.f6918i;
        if (a0Var != null) {
            RecyclerView recyclerView = (RecyclerView) a0Var.f684f;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f6910a);
            ((SwipeRefreshLayout) a0Var.f685g).setEnabled(false);
            ((TextView) a0Var.f682d).setText(getString(R.string.live_hello));
            recyclerView.addItemDecoration((ge.t) this.f6914e.getValue());
            recyclerView.addOnScrollListener(new ge.e(linearLayoutManager, this));
            FloatingActionButton fabBottomLive = (FloatingActionButton) a0Var.f683e;
            Intrinsics.checkNotNullExpressionValue(fabBottomLive, "fabBottomLive");
            io.sentry.config.a.y(fabBottomLive, 600L, new f(5, this));
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f6911b = new x(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a8  */
    @Override // ge.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(nc.b live) {
        Uri uri;
        Pair pair;
        Intrinsics.checkNotNullParameter(live, "live");
        s F = F();
        String btnUrl = live.getBtnUrl();
        p0 fragmentActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "requireActivity(...)");
        F.getClass();
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        s7.t tVar = new s7.t(21);
        Continuation continuation = null;
        if (btnUrl != null) {
            try {
                uri = Uri.parse(btnUrl);
            } catch (Exception unused) {
            }
            if (uri != null) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                if (z.j(uri.getScheme(), "insightsapp", true)) {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    if (z.j(uri.getHost(), "cloudPayment", true)) {
                        pair = new Pair(uri.getQueryParameter("productId"), uri.getQueryParameter("typeSubs"));
                        if (pair != null) {
                            String str = (String) pair.f19192a;
                            String str2 = (String) pair.f19193b;
                            androidx.lifecycle.z g10 = d1.g(this);
                            e eVar = m0.f9201a;
                            c0.t(g10, jg.q.f18523a, null, new ge.f((Object) this, (Object) str, (Object) str2, continuation, 0), 2);
                            return;
                        }
                        return;
                    }
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    if (z.j(uri.getHost(), "inAppBilling", true)) {
                        jg.d dVar = MyApp.f6830c;
                        e eVar2 = m0.f9201a;
                        lg.d dVar2 = lg.d.f20063c;
                        y yVar = new y("LaunchBilling");
                        dVar2.getClass();
                        c0.t(dVar, kotlin.coroutines.e.c(dVar2, yVar), null, new o(tVar, fragmentActivity, uri, continuation, 8), 2);
                    }
                } else {
                    WeakReference weakReference = new WeakReference(fragmentActivity.getBaseContext());
                    if (btnUrl != null) {
                        zc.e.e(btnUrl, weakReference, null);
                    }
                }
            }
            pair = null;
            if (pair != null) {
            }
        }
        uri = null;
        if (uri != null) {
        }
        pair = null;
        if (pair != null) {
        }
    }

    @Override // ge.b
    public final void t(String str) {
        if (str == null) {
            return;
        }
        x xVar = this.f6911b;
        if (xVar != null) {
            List images = kotlin.collections.t.c(str.toString());
            Intrinsics.checkNotNullParameter(images, "images");
            ArrayList arrayList = xVar.f24915a;
            arrayList.clear();
            arrayList.addAll(images);
        }
        x xVar2 = this.f6911b;
        if (xVar2 != null) {
            xVar2.a();
        }
    }

    @Override // ge.b
    public final void v(hc.c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        j jVar = new j(28);
        int i5 = data.f10489a;
        jVar.C(i5);
        new j(28).B(requireActivity(), i5, data.f10490b);
    }
}
