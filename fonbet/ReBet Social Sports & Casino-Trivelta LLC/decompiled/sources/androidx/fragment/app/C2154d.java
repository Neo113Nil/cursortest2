package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C2035b;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2092i0;
import androidx.fragment.app.AbstractC2169t;
import androidx.fragment.app.C2154d;
import androidx.fragment.app.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import z.C6900a;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2154d extends X {

    /* renamed from: androidx.fragment.app.d$a */
    public static final class a extends X.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f20151d;

        /* renamed from: androidx.fragment.app.d$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0379a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X.d f20152a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f20153b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f20154c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f20155d;

            public AnimationAnimationListenerC0379a(X.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f20152a = dVar;
                this.f20153b = viewGroup;
                this.f20154c = view;
                this.f20155d = aVar;
            }

            public static final void b(ViewGroup container, View view, a this$0) {
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final ViewGroup viewGroup = this.f20153b;
                final View view = this.f20154c;
                final a aVar = this.f20155d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2154d.a.AnimationAnimationListenerC0379a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20152a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20152a);
                }
            }
        }

        public a(b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.f20151d = animationInfo;
        }

        @Override // androidx.fragment.app.X.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            X.d a10 = this.f20151d.a();
            View view = a10.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f20151d.a().e(this);
            if (FragmentManager.Q0(2)) {
                a10.toString();
            }
        }

        @Override // androidx.fragment.app.X.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f20151d.b()) {
                this.f20151d.a().e(this);
                return;
            }
            Context context = container.getContext();
            X.d a10 = this.f20151d.a();
            View view = a10.h().mView;
            b bVar = this.f20151d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC2169t.a c10 = bVar.c(context);
            if (c10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c10.f20226a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (a10.g() != X.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f20151d.a().e(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC2169t.b bVar2 = new AbstractC2169t.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0379a(a10, container, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.Q0(2)) {
                a10.toString();
            }
        }

        public final b h() {
            return this.f20151d;
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    public static final class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20156b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20157c;

        /* renamed from: d, reason: collision with root package name */
        public AbstractC2169t.a f20158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(X.d operation, boolean z10) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f20156b = z10;
        }

        public final AbstractC2169t.a c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f20157c) {
                return this.f20158d;
            }
            AbstractC2169t.a b10 = AbstractC2169t.b(context, a().h(), a().g() == X.d.b.VISIBLE, this.f20156b);
            this.f20158d = b10;
            this.f20157c = true;
            return b10;
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    public static final class c extends X.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f20159d;

        /* renamed from: e, reason: collision with root package name */
        public AnimatorSet f20160e;

        /* renamed from: androidx.fragment.app.d$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f20161a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f20162b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f20163c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ X.d f20164d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f20165e;

            public a(ViewGroup viewGroup, View view, boolean z10, X.d dVar, c cVar) {
                this.f20161a = viewGroup;
                this.f20162b = view;
                this.f20163c = z10;
                this.f20164d = dVar;
                this.f20165e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f20161a.endViewTransition(this.f20162b);
                if (this.f20163c || this.f20164d.g() == X.d.b.GONE) {
                    X.d.b g10 = this.f20164d.g();
                    View viewToAnimate = this.f20162b;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    g10.b(viewToAnimate, this.f20161a);
                }
                this.f20165e.h().a().e(this.f20165e);
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20164d);
                }
            }
        }

        public c(b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.f20159d = animatorInfo;
        }

        @Override // androidx.fragment.app.X.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.X.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.f20160e;
            if (animatorSet == null) {
                this.f20159d.a().e(this);
                return;
            }
            X.d a10 = this.f20159d.a();
            if (!a10.l()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f20167a.a(animatorSet);
            }
            if (FragmentManager.Q0(2)) {
                a10.toString();
                a10.l();
            }
        }

        @Override // androidx.fragment.app.X.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            X.d a10 = this.f20159d.a();
            AnimatorSet animatorSet = this.f20160e;
            if (animatorSet == null) {
                this.f20159d.a().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.Q0(2)) {
                Objects.toString(a10);
            }
        }

        @Override // androidx.fragment.app.X.b
        public void e(C2035b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            X.d a10 = this.f20159d.a();
            AnimatorSet animatorSet = this.f20160e;
            if (animatorSet == null) {
                this.f20159d.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !a10.h().mTransitioning) {
                return;
            }
            if (FragmentManager.Q0(2)) {
                a10.toString();
            }
            long a11 = C0380d.f20166a.a(animatorSet);
            long a12 = (long) (backEvent.a() * a11);
            if (a12 == 0) {
                a12 = 1;
            }
            if (a12 == a11) {
                a12 = a11 - 1;
            }
            if (FragmentManager.Q0(2)) {
                animatorSet.toString();
                a10.toString();
            }
            e.f20167a.b(animatorSet, a12);
        }

        @Override // androidx.fragment.app.X.b
        public void f(ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f20159d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f20159d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC2169t.a c10 = bVar.c(context);
            this.f20160e = c10 != null ? c10.f20227b : null;
            X.d a10 = this.f20159d.a();
            Fragment h10 = a10.h();
            boolean z10 = a10.g() == X.d.b.GONE;
            View view = h10.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f20160e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, a10, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f20160e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f20159d;
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    public static final class C0380d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0380d f20166a = new C0380d();

        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f20167a = new e();

        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(@NotNull AnimatorSet animatorSet, long j10) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final X.d f20168a;

        public f(X.d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f20168a = operation;
        }

        public final X.d a() {
            return this.f20168a;
        }

        public final boolean b() {
            View view = this.f20168a.h().mView;
            X.d.b a10 = view != null ? X.d.b.f20137a.a(view) : null;
            X.d.b g10 = this.f20168a.g();
            if (a10 == g10) {
                return true;
            }
            X.d.b bVar = X.d.b.VISIBLE;
            return (a10 == bVar || g10 == bVar) ? false : true;
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    public static final class g extends X.b {

        /* renamed from: d, reason: collision with root package name */
        public final List f20169d;

        /* renamed from: e, reason: collision with root package name */
        public final X.d f20170e;

        /* renamed from: f, reason: collision with root package name */
        public final X.d f20171f;

        /* renamed from: g, reason: collision with root package name */
        public final Q f20172g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f20173h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f20174i;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f20175j;

        /* renamed from: k, reason: collision with root package name */
        public final C6900a f20176k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f20177l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f20178m;

        /* renamed from: n, reason: collision with root package name */
        public final C6900a f20179n;

        /* renamed from: o, reason: collision with root package name */
        public final C6900a f20180o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f20181p;

        /* renamed from: q, reason: collision with root package name */
        public final u0.d f20182q;

        /* renamed from: r, reason: collision with root package name */
        public Object f20183r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f20184s;

        /* renamed from: androidx.fragment.app.d$g$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f20186e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f20187f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f20186e = viewGroup;
                this.f20187f = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m50invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m50invoke() {
                g.this.v().e(this.f20186e, this.f20187f);
            }
        }

        /* renamed from: androidx.fragment.app.d$g$b */
        public static final class b extends Lambda implements Function0 {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f20189e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f20190f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f20191g;

            /* renamed from: androidx.fragment.app.d$g$b$a */
            public static final class a extends Lambda implements Function0 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ g f20192d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Object f20193e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f20194f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f20192d = gVar;
                    this.f20193e = obj;
                    this.f20194f = viewGroup;
                }

                public static final void c(g this$0, ViewGroup container) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(container, "$container");
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        X.d a10 = ((h) it.next()).a();
                        View view = a10.h().getView();
                        if (view != null) {
                            a10.g().b(view, container);
                        }
                    }
                }

                public static final void d(g this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    FragmentManager.Q0(2);
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(this$0);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m52invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m52invoke() {
                    List w10 = this.f20192d.w();
                    if (!(w10 instanceof Collection) || !w10.isEmpty()) {
                        Iterator it = w10.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().l()) {
                                FragmentManager.Q0(2);
                                u0.d dVar = new u0.d();
                                Q v10 = this.f20192d.v();
                                Fragment h10 = ((h) this.f20192d.w().get(0)).a().h();
                                Object obj = this.f20193e;
                                final g gVar = this.f20192d;
                                v10.w(h10, obj, dVar, new Runnable() { // from class: androidx.fragment.app.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C2154d.g.b.a.d(C2154d.g.this);
                                    }
                                });
                                dVar.a();
                                return;
                            }
                        }
                    }
                    FragmentManager.Q0(2);
                    Q v11 = this.f20192d.v();
                    Object s10 = this.f20192d.s();
                    Intrinsics.checkNotNull(s10);
                    final g gVar2 = this.f20192d;
                    final ViewGroup viewGroup = this.f20194f;
                    v11.d(s10, new Runnable() { // from class: androidx.fragment.app.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.g.b.a.c(C2154d.g.this, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
                super(0);
                this.f20189e = viewGroup;
                this.f20190f = obj;
                this.f20191g = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m51invoke();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.d$g$b$a] */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m51invoke() {
                FragmentManager.Q0(2);
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f20189e, this.f20190f));
                if (g.this.s() == null) {
                    FragmentManager.Q0(2);
                    g.this.D(true);
                    return;
                }
                this.f20191g.element = new a(g.this, this.f20190f, this.f20189e);
                if (FragmentManager.Q0(2)) {
                    Objects.toString(g.this.t());
                    Objects.toString(g.this.u());
                }
            }
        }

        public g(List transitionInfos, X.d dVar, X.d dVar2, Q transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C6900a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C6900a firstOutViews, C6900a lastInViews, boolean z10) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.f20169d = transitionInfos;
            this.f20170e = dVar;
            this.f20171f = dVar2;
            this.f20172g = transitionImpl;
            this.f20173h = obj;
            this.f20174i = sharedElementFirstOutViews;
            this.f20175j = sharedElementLastInViews;
            this.f20176k = sharedElementNameMapping;
            this.f20177l = enteringNames;
            this.f20178m = exitingNames;
            this.f20179n = firstOutViews;
            this.f20180o = lastInViews;
            this.f20181p = z10;
            this.f20182q = new u0.d();
        }

        public static final void A(X.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.Q0(2)) {
                Objects.toString(operation);
            }
            operation.e(this$0);
        }

        public static final void p(X.d dVar, X.d dVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            O.a(dVar.h(), dVar2.h(), this$0.f20181p, this$0.f20180o, false);
        }

        public static final void q(Q impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        public static final void r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            O.d(transitioningViews, 4);
        }

        public static final void y(X.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.Q0(2)) {
                Objects.toString(operation);
            }
            operation.e(this$0);
        }

        public static final void z(Ref.ObjectRef seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.element;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
            O.d(arrayList, 4);
            ArrayList q10 = this.f20172g.q(this.f20175j);
            if (FragmentManager.Q0(2)) {
                Iterator it = this.f20174i.iterator();
                while (it.hasNext()) {
                    Object sharedElementFirstOutViews = it.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Objects.toString(view);
                    AbstractC2082d0.I(view);
                }
                Iterator it2 = this.f20175j.iterator();
                while (it2.hasNext()) {
                    Object sharedElementLastInViews = it2.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Objects.toString(view2);
                    AbstractC2082d0.I(view2);
                }
            }
            function0.invoke();
            this.f20172g.y(viewGroup, this.f20174i, this.f20175j, q10, this.f20176k);
            O.d(arrayList, 0);
            this.f20172g.A(this.f20173h, this.f20174i, this.f20175j);
        }

        public final void C(Object obj) {
            this.f20183r = obj;
        }

        public final void D(boolean z10) {
            this.f20184s = z10;
        }

        @Override // androidx.fragment.app.X.b
        public boolean b() {
            if (!this.f20172g.m()) {
                return false;
            }
            List<h> list = this.f20169d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f20172g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f20173h;
            return obj == null || this.f20172g.n(obj);
        }

        @Override // androidx.fragment.app.X.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f20182q.a();
        }

        @Override // androidx.fragment.app.X.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut() || this.f20184s) {
                for (h hVar : this.f20169d) {
                    X.d a10 = hVar.a();
                    if (FragmentManager.Q0(2)) {
                        if (this.f20184s) {
                            Objects.toString(a10);
                        } else {
                            container.toString();
                            Objects.toString(a10);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f20184s = false;
                return;
            }
            Object obj = this.f20183r;
            if (obj != null) {
                Q q10 = this.f20172g;
                Intrinsics.checkNotNull(obj);
                q10.c(obj);
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20170e);
                    Objects.toString(this.f20171f);
                    return;
                }
                return;
            }
            Pair o10 = o(container, this.f20171f, this.f20170e);
            ArrayList arrayList = (ArrayList) o10.component1();
            Object component2 = o10.component2();
            List list = this.f20169d;
            ArrayList<X.d> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final X.d dVar : arrayList2) {
                this.f20172g.w(dVar.h(), component2, this.f20182q, new Runnable() { // from class: androidx.fragment.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2154d.g.y(X.d.this, this);
                    }
                });
            }
            B(arrayList, container, new a(container, component2));
            if (FragmentManager.Q0(2)) {
                Objects.toString(this.f20170e);
                Objects.toString(this.f20171f);
            }
        }

        @Override // androidx.fragment.app.X.b
        public void e(C2035b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.f20183r;
            if (obj != null) {
                this.f20172g.t(obj, backEvent.a());
            }
        }

        @Override // androidx.fragment.app.X.b
        public void f(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f20169d.iterator();
                while (it.hasNext()) {
                    X.d a10 = ((h) it.next()).a();
                    if (FragmentManager.Q0(2)) {
                        container.toString();
                        Objects.toString(a10);
                    }
                }
                return;
            }
            if (x() && this.f20173h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f20173h + " between " + this.f20170e + " and " + this.f20171f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair o10 = o(container, this.f20171f, this.f20170e);
                ArrayList arrayList = (ArrayList) o10.component1();
                Object component2 = o10.component2();
                List list = this.f20169d;
                ArrayList<X.d> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final X.d dVar : arrayList2) {
                    this.f20172g.x(dVar.h(), component2, this.f20182q, new Runnable() { // from class: androidx.fragment.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.g.z(Ref.ObjectRef.this);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.g.A(X.d.this, this);
                        }
                    });
                }
                B(arrayList, container, new b(container, component2, objectRef));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC2092i0.c(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    n(arrayList, child);
                }
            }
        }

        public final Pair o(ViewGroup viewGroup, X.d dVar, final X.d dVar2) {
            final X.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f20169d.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f20176k.isEmpty() && this.f20173h != null) {
                    O.a(dVar3.h(), dVar2.h(), this.f20181p, this.f20179n, true);
                    androidx.core.view.M.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.g.p(X.d.this, dVar2, this);
                        }
                    });
                    this.f20174i.addAll(this.f20179n.values());
                    if (!this.f20178m.isEmpty()) {
                        Object obj = this.f20178m.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj, "exitingNames[0]");
                        view2 = (View) this.f20179n.get((String) obj);
                        this.f20172g.v(this.f20173h, view2);
                    }
                    this.f20175j.addAll(this.f20180o.values());
                    if (!this.f20177l.isEmpty()) {
                        Object obj2 = this.f20177l.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f20180o.get((String) obj2);
                        if (view3 != null) {
                            final Q q10 = this.f20172g;
                            androidx.core.view.M.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2154d.g.q(Q.this, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f20172g.z(this.f20173h, view, this.f20174i);
                    Q q11 = this.f20172g;
                    Object obj3 = this.f20173h;
                    q11.s(obj3, null, null, null, null, obj3, this.f20175j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f20169d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                X.d a10 = hVar.a();
                Object h10 = this.f20172g.h(hVar.f());
                if (h10 != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    boolean z11 = z10;
                    View view4 = a10.h().mView;
                    Iterator it3 = it2;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f20173h != null && (a10 == dVar2 || a10 == dVar3)) {
                        if (a10 == dVar2) {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f20174i));
                        } else {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f20175j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f20172g.a(h10, view);
                    } else {
                        this.f20172g.b(h10, arrayList2);
                        this.f20172g.s(h10, h10, arrayList2, null, null, null, null);
                        if (a10.g() == X.d.b.GONE) {
                            a10.p(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a10.h().mView);
                            this.f20172g.r(h10, a10.h().mView, arrayList3);
                            androidx.core.view.M.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2154d.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (a10.g() == X.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.f20172g.u(h10, rect);
                        }
                        if (FragmentManager.Q0(2)) {
                            h10.toString();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object transitioningViews = it4.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Objects.toString((View) transitioningViews);
                            }
                        }
                    } else {
                        this.f20172g.v(h10, view2);
                        if (FragmentManager.Q0(2)) {
                            h10.toString();
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object transitioningViews2 = it5.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Objects.toString((View) transitioningViews2);
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.f20172g.p(obj4, h10, null);
                    } else {
                        obj5 = this.f20172g.p(obj5, h10, null);
                    }
                    dVar3 = dVar;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                }
            }
            Object o10 = this.f20172g.o(obj4, obj5, this.f20173h);
            if (FragmentManager.Q0(2)) {
                Objects.toString(o10);
                viewGroup.toString();
            }
            return new Pair(arrayList, o10);
        }

        public final Object s() {
            return this.f20183r;
        }

        public final X.d t() {
            return this.f20170e;
        }

        public final X.d u() {
            return this.f20171f;
        }

        public final Q v() {
            return this.f20172g;
        }

        public final List w() {
            return this.f20169d;
        }

        public final boolean x() {
            List list = this.f20169d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    public static final class h extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f20195b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20196c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f20197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(X.d operation, boolean z10, boolean z11) {
            super(operation);
            Object returnTransition;
            Intrinsics.checkNotNullParameter(operation, "operation");
            X.d.b g10 = operation.g();
            X.d.b bVar = X.d.b.VISIBLE;
            if (g10 == bVar) {
                Fragment h10 = operation.h();
                returnTransition = z10 ? h10.getReenterTransition() : h10.getEnterTransition();
            } else {
                Fragment h11 = operation.h();
                returnTransition = z10 ? h11.getReturnTransition() : h11.getExitTransition();
            }
            this.f20195b = returnTransition;
            this.f20196c = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f20197d = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        public final Q c() {
            Q d10 = d(this.f20195b);
            Q d11 = d(this.f20197d);
            if (d10 == null || d11 == null || d10 == d11) {
                return d10 == null ? d11 : d10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f20195b + " which uses a different Transition  type than its shared element transition " + this.f20197d).toString());
        }

        public final Q d(Object obj) {
            if (obj == null) {
                return null;
            }
            Q q10 = O.f20075b;
            if (q10 != null && q10.g(obj)) {
                return q10;
            }
            Q q11 = O.f20076c;
            if (q11 != null && q11.g(obj)) {
                return q11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f20197d;
        }

        public final Object f() {
            return this.f20195b;
        }

        public final boolean g() {
            return this.f20197d != null;
        }

        public final boolean h() {
            return this.f20196c;
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    public static final class i extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Collection f20198d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f20198d = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.contains(this.f20198d, AbstractC2082d0.I((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154d(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static final void G(C2154d this$0, X.d operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.c(operation);
    }

    public final void F(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((b) it.next()).a().f());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            X.d a10 = bVar.a();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC2169t.a c10 = bVar.c(context);
            if (c10 != null) {
                if (c10.f20227b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment h10 = a10.h();
                    if (a10.f().isEmpty()) {
                        if (a10.g() == X.d.b.GONE) {
                            a10.p(false);
                        }
                        a10.b(new c(bVar));
                        z10 = true;
                    } else if (FragmentManager.Q0(2)) {
                        Objects.toString(h10);
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            X.d a11 = bVar2.a();
            Fragment h11 = a11.h();
            if (isEmpty) {
                if (!z10) {
                    a11.b(new a(bVar2));
                } else if (FragmentManager.Q0(2)) {
                    Objects.toString(h11);
                }
            } else if (FragmentManager.Q0(2)) {
                Objects.toString(h11);
            }
        }
    }

    public final void H(List list, boolean z10, X.d dVar, X.d dVar2) {
        Object obj;
        ArrayList arrayList;
        Iterator it;
        Pair pair;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).b()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((h) obj3).c() != null) {
                arrayList3.add(obj3);
            }
        }
        Q q10 = null;
        for (h hVar : arrayList3) {
            Q c10 = hVar.c();
            if (q10 != null && c10 != q10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            q10 = c10;
        }
        if (q10 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C6900a c6900a = new C6900a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        C6900a c6900a2 = new C6900a();
        C6900a c6900a3 = new C6900a();
        ArrayList<String> arrayList8 = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList<String> arrayList9 = arrayList7;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    obj = q10.B(q10.h(hVar2.e()));
                    arrayList9 = dVar2.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList9, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames = dVar.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = dVar.h().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    arrayList = arrayList3;
                    int i10 = 0;
                    while (i10 < size) {
                        Iterator it3 = it2;
                        int indexOf = arrayList9.indexOf(sharedElementTargetNames.get(i10));
                        int i11 = size;
                        if (indexOf != -1) {
                            arrayList9.set(indexOf, sharedElementSourceNames.get(i10));
                        }
                        i10++;
                        it2 = it3;
                        size = i11;
                    }
                    it = it2;
                    arrayList8 = dVar2.h().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList8, "lastIn.fragment.sharedElementTargetNames");
                    if (z10) {
                        dVar.h().getEnterTransitionCallback();
                        dVar2.h().getExitTransitionCallback();
                        pair = TuplesKt.to(null, null);
                    } else {
                        dVar.h().getExitTransitionCallback();
                        dVar2.h().getEnterTransitionCallback();
                        pair = TuplesKt.to(null, null);
                    }
                    android.support.v4.media.session.b.a(pair.component1());
                    android.support.v4.media.session.b.a(pair.component2());
                    int i12 = 0;
                    for (int size2 = arrayList9.size(); i12 < size2; size2 = size2) {
                        String str = arrayList9.get(i12);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                        String str2 = arrayList8.get(i12);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                        c6900a.put(str, str2);
                        i12++;
                    }
                    if (FragmentManager.Q0(2)) {
                        Iterator<String> it4 = arrayList8.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                        Iterator<String> it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            it5.next();
                        }
                    }
                    View view = dVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                    I(c6900a2, view);
                    c6900a2.n(arrayList9);
                    c6900a.n(c6900a2.keySet());
                    View view2 = dVar2.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view2, "lastIn.fragment.mView");
                    I(c6900a3, view2);
                    c6900a3.n(arrayList8);
                    c6900a3.n(c6900a.values());
                    O.c(c6900a, c6900a3);
                    Collection keySet = c6900a.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    J(c6900a2, keySet);
                    Collection values = c6900a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    J(c6900a3, values);
                    if (c6900a.isEmpty()) {
                        break;
                    }
                } else {
                    arrayList = arrayList3;
                    it = it2;
                }
                arrayList3 = arrayList;
                it2 = it;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            arrayList3 = arrayList;
            it2 = it;
        }
        ArrayList arrayList10 = arrayList3;
        if (obj == null) {
            if (arrayList10.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                if (((h) it6.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList10, dVar, dVar2, q10, obj, arrayList4, arrayList5, c6900a, arrayList8, arrayList9, c6900a2, c6900a3, z10);
        Iterator it7 = arrayList10.iterator();
        while (it7.hasNext()) {
            ((h) it7.next()).a().b(gVar);
        }
    }

    public final void I(Map map, View view) {
        String I10 = AbstractC2082d0.I(view);
        if (I10 != null) {
            map.put(I10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    I(map, child);
                }
            }
        }
    }

    public final void J(C6900a c6900a, Collection collection) {
        Set entries = c6900a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new i(collection));
    }

    public final void K(List list) {
        Fragment h10 = ((X.d) CollectionsKt.last(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X.d dVar = (X.d) it.next();
            dVar.h().mAnimationInfo.f19903c = h10.mAnimationInfo.f19903c;
            dVar.h().mAnimationInfo.f19904d = h10.mAnimationInfo.f19904d;
            dVar.h().mAnimationInfo.f19905e = h10.mAnimationInfo.f19905e;
            dVar.h().mAnimationInfo.f19906f = h10.mAnimationInfo.f19906f;
        }
    }

    @Override // androidx.fragment.app.X
    public void d(List operations, boolean z10) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        FragmentManager.Q0(2);
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            X.d dVar = (X.d) obj2;
            X.d.b.a aVar = X.d.b.f20137a;
            View view = dVar.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            X.d.b a10 = aVar.a(view);
            X.d.b bVar = X.d.b.VISIBLE;
            if (a10 == bVar && dVar.g() != bVar) {
                break;
            }
        }
        X.d dVar2 = (X.d) obj2;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            X.d dVar3 = (X.d) previous;
            X.d.b.a aVar2 = X.d.b.f20137a;
            View view2 = dVar3.h().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            X.d.b a11 = aVar2.a(view2);
            X.d.b bVar2 = X.d.b.VISIBLE;
            if (a11 != bVar2 && dVar3.g() == bVar2) {
                obj = previous;
                break;
            }
        }
        X.d dVar4 = (X.d) obj;
        if (FragmentManager.Q0(2)) {
            Objects.toString(dVar2);
            Objects.toString(dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final X.d dVar5 = (X.d) it2.next();
            arrayList.add(new b(dVar5, z10));
            boolean z11 = false;
            if (z10) {
                if (dVar5 != dVar2) {
                    arrayList2.add(new h(dVar5, z10, z11));
                    dVar5.a(new Runnable() { // from class: androidx.fragment.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.G(C2154d.this, dVar5);
                        }
                    });
                }
                z11 = true;
                arrayList2.add(new h(dVar5, z10, z11));
                dVar5.a(new Runnable() { // from class: androidx.fragment.app.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2154d.G(C2154d.this, dVar5);
                    }
                });
            } else {
                if (dVar5 != dVar4) {
                    arrayList2.add(new h(dVar5, z10, z11));
                    dVar5.a(new Runnable() { // from class: androidx.fragment.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2154d.G(C2154d.this, dVar5);
                        }
                    });
                }
                z11 = true;
                arrayList2.add(new h(dVar5, z10, z11));
                dVar5.a(new Runnable() { // from class: androidx.fragment.app.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2154d.G(C2154d.this, dVar5);
                    }
                });
            }
        }
        H(arrayList2, z10, dVar2, dVar4);
        F(arrayList);
    }
}
