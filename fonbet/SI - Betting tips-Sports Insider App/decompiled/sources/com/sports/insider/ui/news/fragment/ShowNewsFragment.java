package com.sports.insider.ui.news.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.i;
import c4.o;
import c4.v;
import c4.y;
import cd.k;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.news.fragment.ShowNewsFragment;
import com.sports.insider.ui.views.AnalyticsBackground;
import ec.f;
import eg.c0;
import hc.h;
import hg.t0;
import ie.c;
import ie.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import nc.g;
import q4.e;
import q4.j;
import rc.b0;
import rd.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/news/fragment/ShowNewsFragment;", "Lrd/a;", "Lec/f;", "Landroidx/swiperefreshlayout/widget/i;", "<init>", "()V", "Lie/d;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShowNewsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowNewsFragment.kt\ncom/sports/insider/ui/news/fragment/ShowNewsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n*L\n1#1,110:1\n42#2,3:111\n52#3,2:114\n35#3,3:116\n17#3:119\n40#3,6:120\n*S KotlinDebug\n*F\n+ 1 ShowNewsFragment.kt\ncom/sports/insider/ui/news/fragment/ShowNewsFragment\n*L\n65#1:111,3\n103#1:114,2\n41#1:116,3\n41#1:119\n41#1:120,6\n*E\n"})
/* loaded from: classes.dex */
public final class ShowNewsFragment extends a<f> implements i {

    /* renamed from: b, reason: collision with root package name */
    public final c f6924b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6925c;

    /* renamed from: d, reason: collision with root package name */
    public final c f6926d;

    /* JADX WARN: Type inference failed for: r0v0, types: [ie.c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ie.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ie.c] */
    public ShowNewsFragment() {
        final int i5 = 0;
        this.f6924b = new q0(this) { // from class: ie.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowNewsFragment f11237b;

            {
                this.f11237b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ShowNewsFragment showNewsFragment = this.f11237b;
                            je.c G = showNewsFragment.G();
                            h hVar = (h) G.f18475d.getValue();
                            if ((hVar != null ? hVar.f10498e : null) == null && G.f18474c > 0) {
                                showNewsFragment.G().e(false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        f fVar = (f) this.f11237b.f22459a;
                        if (fVar != null) {
                            fVar.f8935d.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        h hVar2 = (h) obj;
                        if (hVar2 != null) {
                            ShowNewsFragment showNewsFragment2 = this.f11237b;
                            f fVar2 = (f) showNewsFragment2.f22459a;
                            if (fVar2 != null) {
                                fVar2.f8934c.setText(hVar2.f10499f);
                            }
                            f fVar3 = (f) showNewsFragment2.f22459a;
                            if (fVar3 != null) {
                                fVar3.f8937f.setText(hVar2.f10496c);
                            }
                            f fVar4 = (f) showNewsFragment2.f22459a;
                            if (fVar4 != null) {
                                fVar4.f8936e.setText(hVar2.f10498e);
                            }
                            f fVar5 = (f) showNewsFragment2.f22459a;
                            if (fVar5 != null) {
                                ImageView imageView = fVar5.f8933b;
                                String str = hVar2.f10497d;
                                o a7 = y.a(imageView.getContext());
                                e eVar = new e(imageView.getContext());
                                eVar.f21940c = str;
                                j.d(eVar, imageView);
                                j.c(eVar, R.drawable.bg_prediction);
                                ((v) a7).a(eVar.a());
                            }
                            je.c G2 = showNewsFragment2.G();
                            fd.d dVar = (fd.d) G2.f18480i.getValue();
                            int i10 = G2.f18474c;
                            dVar.getClass();
                            c0.t(MyApp.f6830c, b0.b(), null, new k(i10, 0, new cd.d(), (Continuation) null), 2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6925c = new q0(this) { // from class: ie.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowNewsFragment f11237b;

            {
                this.f11237b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ShowNewsFragment showNewsFragment = this.f11237b;
                            je.c G = showNewsFragment.G();
                            h hVar = (h) G.f18475d.getValue();
                            if ((hVar != null ? hVar.f10498e : null) == null && G.f18474c > 0) {
                                showNewsFragment.G().e(false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        f fVar = (f) this.f11237b.f22459a;
                        if (fVar != null) {
                            fVar.f8935d.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        h hVar2 = (h) obj;
                        if (hVar2 != null) {
                            ShowNewsFragment showNewsFragment2 = this.f11237b;
                            f fVar2 = (f) showNewsFragment2.f22459a;
                            if (fVar2 != null) {
                                fVar2.f8934c.setText(hVar2.f10499f);
                            }
                            f fVar3 = (f) showNewsFragment2.f22459a;
                            if (fVar3 != null) {
                                fVar3.f8937f.setText(hVar2.f10496c);
                            }
                            f fVar4 = (f) showNewsFragment2.f22459a;
                            if (fVar4 != null) {
                                fVar4.f8936e.setText(hVar2.f10498e);
                            }
                            f fVar5 = (f) showNewsFragment2.f22459a;
                            if (fVar5 != null) {
                                ImageView imageView = fVar5.f8933b;
                                String str = hVar2.f10497d;
                                o a7 = y.a(imageView.getContext());
                                e eVar = new e(imageView.getContext());
                                eVar.f21940c = str;
                                j.d(eVar, imageView);
                                j.c(eVar, R.drawable.bg_prediction);
                                ((v) a7).a(eVar.a());
                            }
                            je.c G2 = showNewsFragment2.G();
                            fd.d dVar = (fd.d) G2.f18480i.getValue();
                            int i102 = G2.f18474c;
                            dVar.getClass();
                            c0.t(MyApp.f6830c, b0.b(), null, new k(i102, 0, new cd.d(), (Continuation) null), 2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6926d = new q0(this) { // from class: ie.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowNewsFragment f11237b;

            {
                this.f11237b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ShowNewsFragment showNewsFragment = this.f11237b;
                            je.c G = showNewsFragment.G();
                            h hVar = (h) G.f18475d.getValue();
                            if ((hVar != null ? hVar.f10498e : null) == null && G.f18474c > 0) {
                                showNewsFragment.G().e(false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        f fVar = (f) this.f11237b.f22459a;
                        if (fVar != null) {
                            fVar.f8935d.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        h hVar2 = (h) obj;
                        if (hVar2 != null) {
                            ShowNewsFragment showNewsFragment2 = this.f11237b;
                            f fVar2 = (f) showNewsFragment2.f22459a;
                            if (fVar2 != null) {
                                fVar2.f8934c.setText(hVar2.f10499f);
                            }
                            f fVar3 = (f) showNewsFragment2.f22459a;
                            if (fVar3 != null) {
                                fVar3.f8937f.setText(hVar2.f10496c);
                            }
                            f fVar4 = (f) showNewsFragment2.f22459a;
                            if (fVar4 != null) {
                                fVar4.f8936e.setText(hVar2.f10498e);
                            }
                            f fVar5 = (f) showNewsFragment2.f22459a;
                            if (fVar5 != null) {
                                ImageView imageView = fVar5.f8933b;
                                String str = hVar2.f10497d;
                                o a7 = y.a(imageView.getContext());
                                e eVar = new e(imageView.getContext());
                                eVar.f21940c = str;
                                j.d(eVar, imageView);
                                j.c(eVar, R.drawable.bg_prediction);
                                ((v) a7).a(eVar.a());
                            }
                            je.c G2 = showNewsFragment2.G();
                            fd.d dVar = (fd.d) G2.f18480i.getValue();
                            int i102 = G2.f18474c;
                            dVar.getClass();
                            c0.t(MyApp.f6830c, b0.b(), null, new k(i102, 0, new cd.d(), (Continuation) null), 2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_news_read, viewGroup, false);
        int i5 = R.id.bgnImg;
        ImageView imageView = (ImageView) y3.j(R.id.bgnImg, inflate);
        if (imageView != null) {
            i5 = R.id.dateText;
            TextView textView = (TextView) y3.j(R.id.dateText, inflate);
            if (textView != null) {
                i5 = R.id.rootAnalytics;
                if (((AnalyticsBackground) y3.j(R.id.rootAnalytics, inflate)) != null) {
                    i5 = R.id.root_scroll;
                    if (((NestedScrollView) y3.j(R.id.root_scroll, inflate)) != null) {
                        i5 = R.id.swipeRefreshLayout;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) y3.j(R.id.swipeRefreshLayout, inflate);
                        if (swipeRefreshLayout != null) {
                            i5 = R.id.text;
                            TextView textView2 = (TextView) y3.j(R.id.text, inflate);
                            if (textView2 != null) {
                                i5 = R.id.titleText;
                                TextView textView3 = (TextView) y3.j(R.id.titleText, inflate);
                                if (textView3 != null) {
                                    f fVar = new f((FrameLayout) inflate, imageView, textView, swipeRefreshLayout, textView2, textView3);
                                    Intrinsics.checkNotNullExpressionValue(fVar, "inflate(...)");
                                    return fVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final je.c G() {
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "owner");
        o1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        m1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        t1.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(je.c.class, "modelClass");
        Intrinsics.checkNotNullParameter(je.c.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(je.c.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (je.c) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SwipeRefreshLayout swipeRefreshLayout;
        ImageView imageView;
        super.onDestroyView();
        f fVar = (f) this.f22459a;
        if (fVar != null && (imageView = fVar.f8933b) != null) {
            k2.x.s(imageView).a();
        }
        f fVar2 = (f) this.f22459a;
        if (fVar2 == null || (swipeRefreshLayout = fVar2.f8935d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onPause();
        f fVar = (f) this.f22459a;
        if (fVar == null || (swipeRefreshLayout = fVar.f8935d) == null) {
            return;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onResume();
        f fVar = (f) this.f22459a;
        if (fVar == null || (swipeRefreshLayout = fVar.f8935d) == null) {
            return;
        }
        swipeRefreshLayout.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(d.class);
        i3.i argumentProducer = new i3.i(1, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        G().getClass();
        je.c G = G();
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        G.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (G.f18476e == null) {
            G.f18476e = new we.a(context);
        }
        je.c G2 = G();
        Bundle bundle = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = u6.h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        int a7 = ((d) ((y1.i) invoke)).a();
        if (a7 <= 0) {
            G2.getClass();
            t0 t0Var = rc.x.f22455a;
            rc.x.a(R.string.error_loading_news, true);
            a.a.r(this).e();
            return;
        }
        G2.f18474c = a7;
        G2.e(false);
        we.a aVar = G().f18476e;
        if (aVar != null) {
            aVar.e(getViewLifecycleOwner(), this.f6924b);
        }
        f fVar = (f) this.f22459a;
        if (fVar != null) {
            fVar.f8935d.setOnRefreshListener(this);
        }
        G().f18479h.e(getViewLifecycleOwner(), this.f6925c);
        G().f18477f.e(getViewLifecycleOwner(), this.f6926d);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        G().getClass();
        we.a aVar = G().f18476e;
        if (aVar != null) {
            aVar.i(this.f6924b);
        }
        G().f18479h.i(this.f6925c);
        G().f18477f.i(this.f6926d);
        f fVar = (f) this.f22459a;
        if (fVar != null) {
            SwipeRefreshLayout swipeRefreshLayout = fVar.f8935d;
            swipeRefreshLayout.setOnRefreshListener(null);
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        f fVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Typeface a7 = ((za.i) ((g) y3.m(g.class, null, 6))).a();
        if (a7 != null) {
            f fVar2 = (f) this.f22459a;
            if (fVar2 != null) {
                fVar2.f8934c.setTypeface(a7);
            }
            f fVar3 = (f) this.f22459a;
            if (fVar3 != null) {
                fVar3.f8937f.setTypeface(a7);
            }
        }
        Typeface b10 = ((za.i) ((g) y3.m(g.class, null, 6))).b();
        if (b10 == null || (fVar = (f) this.f22459a) == null) {
            return;
        }
        fVar.f8936e.setTypeface(b10);
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public final void p() {
        G().e(true);
    }
}
