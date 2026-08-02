package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.e;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aaj0;
import xsna.b0u0;
import xsna.bds;
import xsna.c5g;
import xsna.cds;
import xsna.fds;
import xsna.g5g;
import xsna.gds;
import xsna.gxt0;
import xsna.gzs;
import xsna.iut0;
import xsna.j5g;
import xsna.nx3;
import xsna.qj80;
import xsna.qml;
import xsna.qo4;
import xsna.qye;
import xsna.r0a;
import xsna.rml;
import xsna.rq9;
import xsna.s3q0;
import xsna.sml;
import xsna.tk5;
import xsna.vc2;
import xsna.wq8;
import xsna.wu5;
import xsna.zk3;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class b extends SpecialEffectsController {

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public static final class C0032b extends f {
        public final boolean b;
        public boolean c;
        public e.a d;

        public C0032b(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            this.b = z;
        }

        public final e.a b(Context context) {
            Animation loadAnimation;
            e.a aVar;
            if (this.c) {
                return this.d;
            }
            SpecialEffectsController.Operation operation = this.a;
            Fragment fragment = operation.c;
            boolean z = operation.a == SpecialEffectsController.Operation.State.VISIBLE;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.b ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            e.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
                if (onCreateAnimation != null) {
                    aVar2 = new e.a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                    if (onCreateAnimator != null) {
                        aVar2 = new e.a(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? androidx.fragment.app.e.a(android.R.attr.activityOpenEnterAnimation, context) : androidx.fragment.app.e.a(android.R.attr.activityOpenExitAnimation, context) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? androidx.fragment.app.e.a(android.R.attr.activityCloseEnterAnimation, context) : androidx.fragment.app.e.a(android.R.attr.activityCloseExitAnimation, context) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            try {
                                if (equals) {
                                    try {
                                        loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    } catch (Resources.NotFoundException e) {
                                        throw e;
                                    } catch (RuntimeException unused) {
                                    }
                                    if (loadAnimation != null) {
                                        aVar = new e.a(loadAnimation);
                                        aVar2 = aVar;
                                    }
                                }
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (loadAnimator != null) {
                                    aVar = new e.a(loadAnimator);
                                    aVar2 = aVar;
                                }
                            } catch (RuntimeException e2) {
                                if (equals) {
                                    throw e2;
                                }
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (loadAnimation2 != null) {
                                    aVar2 = new e.a(loadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
            this.d = aVar2;
            this.c = true;
            return aVar2;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static final class c extends SpecialEffectsController.a {
        public final C0032b c;
        public AnimatorSet d;

        /* compiled from: DefaultSpecialEffectsController.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ SpecialEffectsController.Operation e;
            public final /* synthetic */ c f;

            public a(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, c cVar) {
                this.b = viewGroup;
                this.c = view;
                this.d = z;
                this.e = operation;
                this.f = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup = this.b;
                View view = this.c;
                viewGroup.endViewTransition(view);
                boolean z = this.d;
                SpecialEffectsController.Operation operation = this.e;
                if (z) {
                    operation.a.a(view, viewGroup);
                }
                c cVar = this.f;
                cVar.c.a.c(cVar);
                if (FragmentManager.P(2)) {
                    Objects.toString(operation);
                }
            }
        }

        public c(C0032b c0032b) {
            this.c = c0032b;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup viewGroup) {
            AnimatorSet animatorSet = this.d;
            C0032b c0032b = this.c;
            if (animatorSet == null) {
                c0032b.a.c(this);
                return;
            }
            SpecialEffectsController.Operation operation = c0032b.a;
            if (operation.g) {
                e.a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.P(2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(ViewGroup viewGroup) {
            SpecialEffectsController.Operation operation = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.P(2)) {
                Objects.toString(operation);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(wu5 wu5Var) {
            SpecialEffectsController.Operation operation = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.c.mTransitioning) {
                return;
            }
            if (FragmentManager.P(2)) {
                operation.toString();
            }
            long a2 = d.a.a(animatorSet);
            long j = (long) (wu5Var.c * a2);
            if (j == 0) {
                j = 1;
            }
            if (j == a2) {
                j = a2 - 1;
            }
            if (FragmentManager.P(2)) {
                animatorSet.toString();
                operation.toString();
            }
            e.a.b(animatorSet, j);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void f(ViewGroup viewGroup) {
            c cVar;
            C0032b c0032b = this.c;
            if (c0032b.a()) {
                return;
            }
            e.a b = c0032b.b(viewGroup.getContext());
            this.d = b != null ? b.b : null;
            SpecialEffectsController.Operation operation = c0032b.a;
            Fragment fragment = operation.c;
            boolean z = operation.a == SpecialEffectsController.Operation.State.GONE;
            View view = fragment.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            return animatorSet.getTotalDuration();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static class f {
        public final SpecialEffectsController.Operation a;

        public f(SpecialEffectsController.Operation operation) {
            this.a = operation;
        }

        public final boolean a() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.a;
            View view = operation.c.mView;
            if (view != null) {
                SpecialEffectsController.Operation.State.Companion.getClass();
                state = SpecialEffectsController.Operation.State.a.a(view);
            } else {
                state = null;
            }
            SpecialEffectsController.Operation.State state2 = operation.a;
            if (state == state2) {
                return true;
            }
            SpecialEffectsController.Operation.State state3 = SpecialEffectsController.Operation.State.VISIBLE;
            return (state == state3 || state2 == state3) ? false : true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static final class g extends SpecialEffectsController.a {
        public final ArrayList c;
        public final SpecialEffectsController.Operation d;
        public final SpecialEffectsController.Operation e;
        public final gds f;
        public final Object g;
        public final ArrayList<View> h;
        public final ArrayList<View> i;
        public final zk3<String, String> j;
        public final ArrayList<String> k;
        public final ArrayList<String> l;
        public final zk3<String, View> m;
        public final zk3<String, View> n;
        public final boolean o;
        public final rq9 p = new rq9();
        public Object q;

        /* compiled from: DefaultSpecialEffectsController.kt */
        public static final class a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ ViewGroup $container;
            final /* synthetic */ Object $mergedTransition;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.$container = viewGroup;
                this.$mergedTransition = obj;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                g.this.f.e(this.$container, this.$mergedTransition);
                return s3q0.a;
            }
        }

        /* compiled from: DefaultSpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.b$g$b, reason: collision with other inner class name */
        public static final class C0033b extends Lambda implements gzs<s3q0> {
            final /* synthetic */ ViewGroup $container;
            final /* synthetic */ Object $mergedTransition;
            final /* synthetic */ Ref$ObjectRef<gzs<s3q0>> $seekCancelLambda;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0033b(ViewGroup viewGroup, Object obj, Ref$ObjectRef<gzs<s3q0>> ref$ObjectRef) {
                super(0);
                this.$container = viewGroup;
                this.$mergedTransition = obj;
                this.$seekCancelLambda = ref$ObjectRef;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.c] */
            @Override // xsna.gzs
            public final s3q0 invoke() {
                g gVar = g.this;
                gVar.q = gVar.f.i(this.$container, this.$mergedTransition);
                g gVar2 = g.this;
                boolean z = gVar2.q != null;
                Object obj = this.$mergedTransition;
                ViewGroup viewGroup = this.$container;
                if (z) {
                    this.$seekCancelLambda.element = new androidx.fragment.app.c(gVar2, viewGroup);
                    if (FragmentManager.P(2)) {
                        Objects.toString(g.this.d);
                        Objects.toString(g.this.e);
                    }
                    return s3q0.a;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + JwtParser.SEPARATOR_CHAR).toString());
            }
        }

        public g(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, gds gdsVar, Object obj, ArrayList arrayList2, ArrayList arrayList3, zk3 zk3Var, ArrayList arrayList4, ArrayList arrayList5, zk3 zk3Var2, zk3 zk3Var3, boolean z) {
            this.c = arrayList;
            this.d = operation;
            this.e = operation2;
            this.f = gdsVar;
            this.g = obj;
            this.h = arrayList2;
            this.i = arrayList3;
            this.j = zk3Var;
            this.k = arrayList4;
            this.l = arrayList5;
            this.m = zk3Var2;
            this.n = zk3Var3;
            this.o = z;
        }

        public static void h(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i = gxt0.a;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    h(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final boolean b() {
            Object obj;
            gds gdsVar = this.f;
            if (!gdsVar.l()) {
                return false;
            }
            ArrayList<h> arrayList = this.c;
            if (arrayList == null || !arrayList.isEmpty()) {
                for (h hVar : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = hVar.b) == null || !gdsVar.m(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.g;
            return obj2 == null || gdsVar.m(obj2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup viewGroup) {
            this.p.a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(ViewGroup viewGroup) {
            boolean isLaidOut = viewGroup.isLaidOut();
            ArrayList<h> arrayList = this.c;
            if (!isLaidOut) {
                for (h hVar : arrayList) {
                    SpecialEffectsController.Operation operation = hVar.a;
                    if (FragmentManager.P(2)) {
                        viewGroup.toString();
                        Objects.toString(operation);
                    }
                    hVar.a.c(this);
                }
                return;
            }
            Object obj = this.q;
            gds gdsVar = this.f;
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (obj != null) {
                gdsVar.c(obj);
                if (FragmentManager.P(2)) {
                    Objects.toString(operation3);
                    Objects.toString(operation2);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> i = i(viewGroup, operation2, operation3);
            ArrayList<View> d = i.d();
            Object g = i.g();
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
                gdsVar.u(operation4.c, g, this.p, new wq8(1, operation4, this));
            }
            k(d, viewGroup, new a(viewGroup, g));
            if (FragmentManager.P(2)) {
                Objects.toString(operation3);
                Objects.toString(operation2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(wu5 wu5Var) {
            Object obj = this.q;
            if (obj != null) {
                this.f.r(obj, wu5Var.c);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void f(ViewGroup viewGroup) {
            Object obj;
            boolean isLaidOut = viewGroup.isLaidOut();
            ArrayList arrayList = this.c;
            if (!isLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((h) it.next()).a;
                    if (FragmentManager.P(2)) {
                        viewGroup.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            boolean j = j();
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (j && (obj = this.g) != null && !b()) {
                Objects.toString(obj);
                Objects.toString(operation3);
                Objects.toString(operation2);
            }
            if (b() && j()) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair<ArrayList<View>, Object> i = i(viewGroup, operation2, operation3);
                ArrayList<View> d = i.d();
                Object g = i.g();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a);
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it3.next();
                    qo4 qo4Var = new qo4(ref$ObjectRef, 1);
                    Fragment fragment = operation4.c;
                    this.f.v(g, this.p, qo4Var, new qye(3, operation4, this));
                }
                k(d, viewGroup, new C0033b(viewGroup, g, ref$ObjectRef));
            }
        }

        public final Pair<ArrayList<View>, Object> i(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            gds gdsVar;
            ArrayList<View> arrayList3;
            ArrayList arrayList4;
            Iterator it;
            View view;
            g gVar = this;
            View view2 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList5 = gVar.c;
            Iterator it2 = arrayList5.iterator();
            View view3 = null;
            boolean z = false;
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = gVar.i;
                arrayList2 = gVar.h;
                obj = gVar.g;
                gdsVar = gVar.f;
                if (!hasNext) {
                    break;
                }
                if (((h) it2.next()).d == null || operation2 == null || operation == null || gVar.j.isEmpty() || obj == null) {
                    arrayList4 = arrayList5;
                    it = it2;
                } else {
                    Fragment fragment = operation.c;
                    Fragment fragment2 = operation2.c;
                    arrayList4 = arrayList5;
                    boolean z2 = gVar.o;
                    it = it2;
                    zk3<String, View> zk3Var = gVar.m;
                    bds.a(fragment, fragment2, z2, zk3Var);
                    qj80.a(viewGroup, new vc2(operation, operation2, gVar, 2));
                    arrayList2.addAll(zk3Var.values());
                    ArrayList<String> arrayList6 = gVar.l;
                    if (!arrayList6.isEmpty()) {
                        View view4 = zk3Var.get(arrayList6.get(0));
                        gdsVar.s(view4, obj);
                        view3 = view4;
                    }
                    zk3<String, View> zk3Var2 = gVar.n;
                    arrayList.addAll(zk3Var2.values());
                    ArrayList<String> arrayList7 = gVar.k;
                    if (!arrayList7.isEmpty() && (view = zk3Var2.get(arrayList7.get(0))) != null) {
                        qj80.a(viewGroup, new rml(gdsVar, view, rect, 0));
                        z = true;
                    }
                    gdsVar.w(obj, view2, arrayList2);
                    gds gdsVar2 = gVar.f;
                    Object obj2 = gVar.g;
                    gdsVar2.q(obj2, null, null, obj2, arrayList);
                }
                arrayList5 = arrayList4;
                it2 = it;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = new ArrayList();
            Iterator it3 = arrayList8.iterator();
            Object obj3 = null;
            Object obj4 = null;
            while (it3.hasNext()) {
                h hVar = (h) it3.next();
                Iterator it4 = it3;
                SpecialEffectsController.Operation operation3 = hVar.a;
                boolean z3 = z;
                Object h = gdsVar.h(hVar.b);
                if (h != null) {
                    ArrayList<View> arrayList10 = arrayList2;
                    ArrayList<View> arrayList11 = new ArrayList<>();
                    Object obj5 = obj;
                    Fragment fragment3 = operation3.c;
                    Object obj6 = obj4;
                    h(fragment3.mView, arrayList11);
                    if (obj5 != null && (operation3 == operation2 || operation3 == operation)) {
                        if (operation3 == operation2) {
                            arrayList11.removeAll(j5g.S0(arrayList10));
                        } else {
                            arrayList11.removeAll(j5g.S0(arrayList));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        gdsVar.a(view2, h);
                        arrayList3 = arrayList11;
                    } else {
                        gdsVar.b(h, arrayList11);
                        gVar.f.q(h, h, arrayList11, null, null);
                        arrayList3 = arrayList11;
                        if (operation3.a == SpecialEffectsController.Operation.State.GONE) {
                            operation3.i = false;
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList3);
                            arrayList12.remove(fragment3.mView);
                            gdsVar.p(h, fragment3.mView, arrayList12);
                            qj80.a(viewGroup, new nx3(arrayList3, 2));
                        }
                    }
                    if (operation3.a == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList9.addAll(arrayList3);
                        if (z3) {
                            gdsVar.t(h, rect);
                        }
                        if (FragmentManager.P(2)) {
                            h.toString();
                            Iterator<View> it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                it5.next().toString();
                            }
                        }
                    } else {
                        gdsVar.s(view3, h);
                        if (FragmentManager.P(2)) {
                            h.toString();
                            Iterator<View> it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                it6.next().toString();
                            }
                        }
                    }
                    if (hVar.c) {
                        obj3 = gdsVar.o(obj3, h);
                        gVar = this;
                        it3 = it4;
                        z = z3;
                        arrayList2 = arrayList10;
                        obj = obj5;
                        obj4 = obj6;
                    } else {
                        obj4 = gdsVar.o(obj6, h);
                        gVar = this;
                        it3 = it4;
                        z = z3;
                        arrayList2 = arrayList10;
                        obj = obj5;
                    }
                } else {
                    it3 = it4;
                    z = z3;
                    gVar = this;
                }
            }
            Object n = gdsVar.n(obj3, obj4, obj);
            if (FragmentManager.P(2)) {
                Objects.toString(n);
            }
            return new Pair<>(arrayList9, n);
        }

        public final boolean j() {
            ArrayList arrayList = this.c;
            if (arrayList != null && arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void k(ArrayList<View> arrayList, ViewGroup viewGroup, gzs<s3q0> gzsVar) {
            bds.d(4, arrayList);
            gds gdsVar = this.f;
            gdsVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList3.get(i);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                arrayList2.add(view.getTransitionName());
                view.setTransitionName(null);
            }
            boolean P = FragmentManager.P(2);
            ArrayList<View> arrayList4 = this.h;
            if (P) {
                Iterator<View> it = arrayList4.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    next.toString();
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    next.getTransitionName();
                }
                Iterator<View> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    next2.toString();
                    WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                    next2.getTransitionName();
                }
            }
            gzsVar.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                View view2 = arrayList4.get(i2);
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                String transitionName = view2.getTransitionName();
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    view2.setTransitionName(null);
                    String str = this.j.get(transitionName);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i3))) {
                            arrayList3.get(i3).setTransitionName(transitionName);
                            break;
                        }
                        i3++;
                    }
                }
            }
            qj80.a(viewGroup, new fds(size2, arrayList3, arrayList2, arrayList4, arrayList5));
            bds.d(0, arrayList);
            gdsVar.x(this.g, arrayList4, arrayList3);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            Fragment fragment = operation.c;
            SpecialEffectsController.Operation.State state = operation.a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            this.b = state == state2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.c = operation.a == state2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final gds b() {
            Object obj = this.b;
            gds c = c(obj);
            Object obj2 = this.d;
            gds c2 = c(obj2);
            if (c == null || c2 == null || c == c2) {
                return c == null ? c2 : c;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final gds c(Object obj) {
            if (obj == null) {
                return null;
            }
            cds cdsVar = bds.a;
            if (cdsVar != null && cdsVar.g(obj)) {
                return cdsVar;
            }
            gds gdsVar = bds.b;
            if (gdsVar != null && gdsVar.g(obj)) {
                return gdsVar;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void m(zk3 zk3Var, View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            zk3Var.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m(zk3Var, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        int i;
        ArrayList arrayList2;
        int i2;
        boolean z2;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation;
        ArrayList arrayList4;
        int i3;
        int i4;
        String b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.c.mView;
            aVar.getClass();
            SpecialEffectsController.Operation.State a2 = SpecialEffectsController.Operation.State.a.a(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (a2 == state && operation2.a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj2;
            SpecialEffectsController.Operation.State.a aVar2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.c.mView;
            aVar2.getClass();
            SpecialEffectsController.Operation.State a3 = SpecialEffectsController.Operation.State.a.a(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (a3 != state2 && operation4.a == state2) {
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) obj2;
        int i5 = 2;
        if (FragmentManager.P(2)) {
            Objects.toString(operation3);
            Objects.toString(operation5);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController.Operation) j5g.i0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Fragment.k kVar = ((SpecialEffectsController.Operation) it2.next()).c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.b = kVar2.b;
            kVar.c = kVar2.c;
            kVar.d = kVar2.d;
            kVar.e = kVar2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it3.hasNext()) {
                break;
            }
            SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) it3.next();
            arrayList5.add(new C0032b(operation6, z));
            arrayList6.add(new h(operation6, z, !z ? operation6 != operation5 : operation6 != operation3));
            operation6.d.add(new qml(i, this, operation6));
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((h) next).a()) {
                arrayList7.add(next);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((h) next2).b() != null) {
                arrayList8.add(next2);
            }
        }
        Iterator it6 = arrayList8.iterator();
        gds gdsVar = null;
        while (it6.hasNext()) {
            h hVar = (h) it6.next();
            gds b2 = hVar.b();
            if (gdsVar != null && b2 != gdsVar) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(hVar.a.c);
                sb.append(" returned Transition ");
                throw new IllegalArgumentException(tk5.c(sb, hVar.b, " which uses a different Transition type than other Fragments.").toString());
            }
            gdsVar = b2;
        }
        if (gdsVar == null) {
            arrayList2 = arrayList5;
            i2 = 2;
            z2 = 0;
        } else {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            zk3 zk3Var = new zk3();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            zk3 zk3Var2 = new zk3();
            ArrayList<String> arrayList13 = arrayList12;
            zk3 zk3Var3 = new zk3();
            Iterator it7 = arrayList8.iterator();
            Object obj3 = null;
            while (it7.hasNext()) {
                Object obj4 = ((h) it7.next()).d;
                if (obj4 == null || operation3 == null) {
                    arrayList3 = arrayList5;
                    operation = operation3;
                    arrayList4 = arrayList9;
                    i3 = i;
                    i4 = i5;
                } else {
                    i4 = i5;
                    Fragment fragment2 = operation3.c;
                    if (operation5 != null) {
                        Fragment fragment3 = operation5.c;
                        Object y = gdsVar.y(gdsVar.h(obj4));
                        ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        ArrayList arrayList14 = arrayList5;
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        SpecialEffectsController.Operation operation7 = operation3;
                        int size = sharedElementTargetNames.size();
                        ArrayList arrayList15 = arrayList9;
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i6));
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i6));
                            }
                            i6++;
                            size = i7;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        Pair pair = !z ? new Pair(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new Pair(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                        aaj0 aaj0Var = (aaj0) pair.d();
                        aaj0 aaj0Var2 = (aaj0) pair.g();
                        int size2 = sharedElementSourceNames.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            zk3Var.put(sharedElementSourceNames.get(i8), sharedElementTargetNames2.get(i8));
                            i8++;
                            aaj0Var = aaj0Var;
                            aaj0Var2 = aaj0Var2;
                        }
                        aaj0 aaj0Var3 = aaj0Var;
                        aaj0 aaj0Var4 = aaj0Var2;
                        if (FragmentManager.P(i4)) {
                            Iterator<String> it8 = sharedElementTargetNames2.iterator();
                            while (it8.hasNext()) {
                                it8.next();
                            }
                            Iterator<String> it9 = sharedElementSourceNames.iterator();
                            while (it9.hasNext()) {
                                it9.next();
                            }
                        }
                        m(zk3Var2, fragment2.mView);
                        zk3Var2.m(sharedElementSourceNames);
                        if (aaj0Var3 != null) {
                            if (FragmentManager.P(i4)) {
                                operation7.toString();
                            }
                            int size3 = sharedElementSourceNames.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i9 = size3 - 1;
                                    String str = sharedElementSourceNames.get(size3);
                                    View view3 = (View) zk3Var2.get(str);
                                    if (view3 == null) {
                                        zk3Var.remove(str);
                                    } else {
                                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                        if (!str.equals(view3.getTransitionName())) {
                                            zk3Var.put(view3.getTransitionName(), (String) zk3Var.remove(str));
                                        }
                                    }
                                    if (i9 < 0) {
                                        break;
                                    } else {
                                        size3 = i9;
                                    }
                                }
                            }
                        } else {
                            zk3Var.m(zk3Var2.keySet());
                        }
                        m(zk3Var3, fragment3.mView);
                        zk3Var3.m(sharedElementTargetNames2);
                        zk3Var3.m(zk3Var.values());
                        if (aaj0Var4 != null) {
                            if (FragmentManager.P(i4)) {
                                operation5.toString();
                            }
                            int size4 = sharedElementTargetNames2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i10 = size4 - 1;
                                    String str2 = sharedElementTargetNames2.get(size4);
                                    View view4 = (View) zk3Var3.get(str2);
                                    if (view4 == null) {
                                        String b3 = bds.b(zk3Var, str2);
                                        if (b3 != null) {
                                            zk3Var.remove(b3);
                                        }
                                    } else {
                                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                                        if (!str2.equals(view4.getTransitionName()) && (b = bds.b(zk3Var, str2)) != null) {
                                            zk3Var.put(b, view4.getTransitionName());
                                        }
                                    }
                                    if (i10 < 0) {
                                        break;
                                    } else {
                                        size4 = i10;
                                    }
                                }
                            }
                        } else {
                            bds.c(zk3Var, zk3Var3);
                        }
                        g5g.C(zk3Var2.entrySet(), new sml(zk3Var.keySet()), false);
                        g5g.C(zk3Var3.entrySet(), new sml(zk3Var.values()), false);
                        if (zk3Var.isEmpty()) {
                            Objects.toString(y);
                            operation7.toString();
                            operation5.toString();
                            arrayList15.clear();
                            arrayList10.clear();
                            i = 0;
                            arrayList13 = sharedElementSourceNames;
                            i5 = i4;
                            operation3 = operation7;
                            arrayList9 = arrayList15;
                            obj3 = null;
                        } else {
                            i = 0;
                            obj3 = y;
                            i5 = i4;
                            operation3 = operation7;
                            arrayList9 = arrayList15;
                            arrayList13 = sharedElementSourceNames;
                        }
                        arrayList11 = sharedElementTargetNames2;
                        arrayList5 = arrayList14;
                    } else {
                        arrayList3 = arrayList5;
                        operation = operation3;
                        arrayList4 = arrayList9;
                        i3 = i;
                    }
                }
                i = i3;
                i5 = i4;
                arrayList5 = arrayList3;
                operation3 = operation;
                arrayList9 = arrayList4;
            }
            arrayList2 = arrayList5;
            SpecialEffectsController.Operation operation8 = operation3;
            ArrayList arrayList16 = arrayList9;
            int i11 = i;
            i2 = i5;
            if (obj3 == null) {
                if (!arrayList8.isEmpty()) {
                    Iterator it10 = arrayList8.iterator();
                    while (it10.hasNext()) {
                        if (((h) it10.next()).b == null) {
                        }
                    }
                }
                z2 = i11;
            }
            z2 = i11;
            g gVar = new g(arrayList8, operation8, operation5, gdsVar, obj3, arrayList16, arrayList10, zk3Var, arrayList11, arrayList13, zk3Var2, zk3Var3, z);
            Iterator it11 = arrayList8.iterator();
            while (it11.hasNext()) {
                ((h) it11.next()).a.j.add(gVar);
            }
        }
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        Iterator it12 = arrayList2.iterator();
        while (it12.hasNext()) {
            g5g.y(((C0032b) it12.next()).a.k, arrayList18);
        }
        boolean isEmpty = arrayList18.isEmpty();
        Iterator it13 = arrayList2.iterator();
        boolean z3 = z2;
        while (it13.hasNext()) {
            C0032b c0032b = (C0032b) it13.next();
            Context context = this.a.getContext();
            SpecialEffectsController.Operation operation9 = c0032b.a;
            e.a b4 = c0032b.b(context);
            if (b4 != null) {
                if (b4.b == null) {
                    arrayList17.add(c0032b);
                } else {
                    Fragment fragment4 = operation9.c;
                    if (operation9.k.isEmpty()) {
                        if (operation9.a == SpecialEffectsController.Operation.State.GONE) {
                            operation9.i = z2;
                        }
                        operation9.j.add(new c(c0032b));
                        z3 = true;
                    } else if (FragmentManager.P(i2)) {
                        Objects.toString(fragment4);
                    }
                }
            }
        }
        Iterator it14 = arrayList17.iterator();
        while (it14.hasNext()) {
            C0032b c0032b2 = (C0032b) it14.next();
            SpecialEffectsController.Operation operation10 = c0032b2.a;
            Fragment fragment5 = operation10.c;
            if (isEmpty) {
                if (!z3) {
                    operation10.j.add(new a(c0032b2));
                } else if (FragmentManager.P(i2)) {
                    Objects.toString(fragment5);
                }
            } else if (FragmentManager.P(i2)) {
                Objects.toString(fragment5);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static final class a extends SpecialEffectsController.a {
        public final C0032b c;

        public a(C0032b c0032b) {
            this.c = c0032b;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup viewGroup) {
            C0032b c0032b = this.c;
            SpecialEffectsController.Operation operation = c0032b.a;
            View view = operation.c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            c0032b.a.c(this);
            if (FragmentManager.P(2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(ViewGroup viewGroup) {
            C0032b c0032b = this.c;
            boolean a = c0032b.a();
            SpecialEffectsController.Operation operation = c0032b.a;
            if (a) {
                operation.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            View view = operation.c.mView;
            e.a b = c0032b.b(context);
            if (b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = b.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.a != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation);
                operation.c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            e.b bVar = new e.b(animation, viewGroup, view);
            bVar.setAnimationListener(new AnimationAnimationListenerC0031a(operation, viewGroup, view, this));
            view.startAnimation(bVar);
            if (FragmentManager.P(2)) {
                operation.toString();
            }
        }

        /* compiled from: DefaultSpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0031a implements Animation.AnimationListener {
            public final /* synthetic */ SpecialEffectsController.Operation b;
            public final /* synthetic */ ViewGroup c;
            public final /* synthetic */ View d;
            public final /* synthetic */ a e;

            public AnimationAnimationListenerC0031a(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, a aVar) {
                this.b = operation;
                this.c = viewGroup;
                this.d = view;
                this.e = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                ViewGroup viewGroup = this.c;
                viewGroup.post(new r0a(viewGroup, this.d, this.e, 1));
                if (FragmentManager.P(2)) {
                    Objects.toString(this.b);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                if (FragmentManager.P(2)) {
                    Objects.toString(this.b);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }
        }
    }
}
