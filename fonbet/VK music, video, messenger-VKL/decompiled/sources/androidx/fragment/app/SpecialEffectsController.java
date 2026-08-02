package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.b;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.g5g;
import xsna.j5g;
import xsna.lhg;
import xsna.m8i;
import xsna.s3q0;
import xsna.t33;
import xsna.wu5;

/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    /* compiled from: SpecialEffectsController.kt */
    public static class Operation {
        public State a;
        public LifecycleImpact b;
        public final Fragment c;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public final ArrayList j;
        public final ArrayList k;
        public final ArrayList d = new ArrayList();
        public boolean i = true;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        public static final class LifecycleImpact {
            private static final /* synthetic */ LifecycleImpact[] $VALUES;
            public static final LifecycleImpact ADDING;
            public static final LifecycleImpact NONE;
            public static final LifecycleImpact REMOVING;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                NONE = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                ADDING = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                REMOVING = lifecycleImpact3;
                $VALUES = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public LifecycleImpact() {
                throw null;
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        public static final class State {
            private static final /* synthetic */ State[] $VALUES;
            public static final a Companion;
            public static final State GONE;
            public static final State INVISIBLE;
            public static final State REMOVED;
            public static final State VISIBLE;

            /* compiled from: SpecialEffectsController.kt */
            public static final class a {
                public static State a(View view) {
                    return (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && view.getVisibility() == 0) ? State.INVISIBLE : b(view.getVisibility());
                }

                public static State b(int i) {
                    if (i == 0) {
                        return State.VISIBLE;
                    }
                    if (i == 4) {
                        return State.INVISIBLE;
                    }
                    if (i == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException(lhg.a(i, "Unknown visibility "));
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            public /* synthetic */ class b {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            static {
                State state = new State(SignalingProtocol.HUNGUP_REASON_REMOVED, 0);
                REMOVED = state;
                State state2 = new State("VISIBLE", 1);
                VISIBLE = state2;
                State state3 = new State("GONE", 2);
                GONE = state3;
                State state4 = new State("INVISIBLE", 3);
                INVISIBLE = state4;
                $VALUES = new State[]{state, state2, state3, state4};
                Companion = new a();
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }

            public final void a(View view, ViewGroup viewGroup) {
                int i = b.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (FragmentManager.P(2)) {
                            view.toString();
                            viewGroup2.toString();
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.P(2)) {
                        view.toString();
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.P(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.P(2)) {
                        view.toString();
                    }
                    view.setVisibility(8);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (FragmentManager.P(2)) {
                        view.toString();
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment) {
            this.a = state;
            this.b = lifecycleImpact;
            this.c = fragment;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            Iterator it = j5g.O0(this.k).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(viewGroup);
            }
        }

        public void b() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (FragmentManager.P(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(a aVar) {
            ArrayList arrayList = this.j;
            if (arrayList.remove(aVar) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(State state, LifecycleImpact lifecycleImpact) {
            int i = a.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            Fragment fragment = this.c;
            if (i == 1) {
                if (this.a == State.REMOVED) {
                    if (FragmentManager.P(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.b);
                    }
                    this.a = State.VISIBLE;
                    this.b = LifecycleImpact.ADDING;
                    this.i = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.P(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.a);
                    Objects.toString(this.b);
                }
                this.a = State.REMOVED;
                this.b = LifecycleImpact.REMOVING;
                this.i = true;
                return;
            }
            if (i == 3 && this.a != State.REMOVED) {
                if (FragmentManager.P(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.a);
                    state.toString();
                }
                this.a = state;
            }
        }

        public void e() {
            this.h = true;
        }

        public final String toString() {
            StringBuilder a2 = t33.a("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            a2.append(this.a);
            a2.append(" lifecycleImpact = ");
            a2.append(this.b);
            a2.append(" fragment = ");
            a2.append(this.c);
            a2.append('}');
            return a2.toString();
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public static final class b extends Operation {
        public final j l;

        public b(Operation.State state, Operation.LifecycleImpact lifecycleImpact, j jVar) {
            super(state, lifecycleImpact, jVar.c);
            this.l = jVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.c.mTransitioning = false;
            this.l.i();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void e() {
            if (this.h) {
                return;
            }
            this.h = true;
            Operation.LifecycleImpact lifecycleImpact = this.b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.ADDING;
            j jVar = this.l;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = jVar.c;
                    View requireView = fragment.requireView();
                    if (FragmentManager.P(2)) {
                        Objects.toString(requireView.findFocus());
                        requireView.toString();
                        fragment.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = jVar.c;
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (FragmentManager.P(2)) {
                    findFocus.toString();
                    fragment2.toString();
                }
            }
            View requireView2 = this.c.requireView();
            if (requireView2.getParent() == null) {
                jVar.a();
                requireView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (requireView2.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final SpecialEffectsController i(ViewGroup viewGroup, FragmentManager fragmentManager) {
        fragmentManager.O();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public final void a(Operation operation) {
        if (operation.i) {
            operation.a.a(operation.c.requireView(), this.a);
            operation.i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c(List<Operation> list) {
        List<Operation> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            g5g.y(((Operation) it.next()).k, arrayList);
        }
        List O0 = j5g.O0(j5g.S0(arrayList));
        int size = O0.size();
        for (int i = 0; i < size; i++) {
            ((a) O0.get(i)).d(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a(list.get(i2));
        }
        List O02 = j5g.O0(list2);
        int size3 = O02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Operation operation = (Operation) O02.get(i3);
            if (operation.k.isEmpty()) {
                operation.b();
            }
        }
    }

    public final void d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, j jVar) {
        synchronized (this.b) {
            try {
                Operation f = f(jVar.c);
                if (f == null) {
                    Fragment fragment = jVar.c;
                    f = fragment.mTransitioning ? g(fragment) : null;
                }
                if (f != null) {
                    f.d(state, lifecycleImpact);
                    return;
                }
                final b bVar = new b(state, lifecycleImpact, jVar);
                this.b.add(bVar);
                bVar.d.add(new Runnable() { // from class: androidx.fragment.app.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController specialEffectsController = SpecialEffectsController.this;
                        ArrayList arrayList = specialEffectsController.b;
                        SpecialEffectsController.b bVar2 = bVar;
                        if (arrayList.contains(bVar2)) {
                            bVar2.a.a(bVar2.c.mView, specialEffectsController.a);
                        }
                    }
                });
                bVar.d.add(new m8i(1, this, bVar));
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0049, B:23:0x0053, B:26:0x0057, B:30:0x0050, B:32:0x015b, B:36:0x005d, B:37:0x006d, B:39:0x0074, B:41:0x0080, B:42:0x0083, B:45:0x0095, B:48:0x0099, B:53:0x0090, B:54:0x0092, B:56:0x009f, B:60:0x00b1, B:61:0x00cc, B:63:0x00d2, B:65:0x00e0, B:67:0x00e4, B:71:0x0105, B:78:0x00eb, B:79:0x00ef, B:81:0x00f5, B:89:0x010f, B:91:0x0113, B:92:0x011c, B:94:0x0122, B:96:0x012e, B:99:0x0136, B:101:0x013a, B:102:0x0159, B:104:0x0143, B:106:0x014d), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z;
        boolean z2;
        if (this.e) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.P(2)) {
                            Objects.toString(operation);
                        }
                        ViewGroup viewGroup = this.a;
                        if (!operation.e) {
                            operation.a(viewGroup);
                        }
                        if (!operation.f) {
                            this.c.add(operation);
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        z = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Operation operation2 = (Operation) it2.next();
                        if (FragmentManager.P(2)) {
                            Objects.toString(operation2);
                        }
                        ViewGroup viewGroup2 = this.a;
                        boolean z3 = operation2.c.mTransitioning;
                        if (!operation2.e) {
                            if (z3) {
                                operation2.g = true;
                            }
                            operation2.a(viewGroup2);
                        }
                        if (!operation2.f) {
                            this.c.add(operation2);
                        }
                    }
                    l();
                    ArrayList arrayList3 = new ArrayList(this.b);
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList3);
                    b(arrayList3, this.d);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    Iterator it3 = arrayList3.iterator();
                    boolean z4 = true;
                    while (it3.hasNext()) {
                        Operation operation3 = (Operation) it3.next();
                        if (!operation3.k.isEmpty()) {
                            ArrayList arrayList4 = operation3.k;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    if (!((a) it4.next()).b()) {
                                    }
                                }
                            }
                            z2 = true;
                            ref$BooleanRef.element = z2;
                            if (operation3.c.mTransitioning) {
                                z4 = false;
                            }
                        }
                        z2 = false;
                        ref$BooleanRef.element = z2;
                        if (operation3.c.mTransitioning) {
                        }
                    }
                    if (ref$BooleanRef.element) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            g5g.y(((Operation) it5.next()).k, arrayList5);
                        }
                        if (!arrayList5.isEmpty()) {
                            ref$BooleanRef.element = z;
                            if (z4) {
                                k(arrayList3);
                                c(arrayList3);
                            } else if (z) {
                                k(arrayList3);
                                int size = arrayList3.size();
                                for (int i = 0; i < size; i++) {
                                    a((Operation) arrayList3.get(i));
                                }
                            }
                            this.d = false;
                        }
                    }
                    z = false;
                    ref$BooleanRef.element = z;
                    if (z4) {
                    }
                    this.d = false;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation f(Fragment fragment) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (epx.f(operation.c, fragment) && !operation.e) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final Operation g(Fragment fragment) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (epx.f(operation.c, fragment) && !operation.e) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final void h() {
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                Iterator it = new ArrayList(this.c).iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (FragmentManager.P(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(operation);
                    }
                    operation.a(this.a);
                }
                Iterator it2 = new ArrayList(this.b).iterator();
                while (it2.hasNext()) {
                    Operation operation2 = (Operation) it2.next();
                    if (FragmentManager.P(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(operation2);
                    }
                    operation2.a(this.a);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Object obj;
        synchronized (this.b) {
            try {
                l();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    Operation operation = (Operation) obj;
                    Operation.State.a aVar = Operation.State.Companion;
                    View view = operation.c.mView;
                    aVar.getClass();
                    Operation.State a2 = Operation.State.a.a(view);
                    Operation.State state = operation.a;
                    Operation.State state2 = Operation.State.VISIBLE;
                    if (state == state2 && a2 != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) obj;
                Fragment fragment = operation2 != null ? operation2.c : null;
                this.e = fragment != null ? fragment.isPostponed() : false;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List<Operation> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((Operation) it.next()).k, arrayList);
        }
        List O0 = j5g.O0(j5g.S0(arrayList));
        int size2 = O0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a) O0.get(i2)).g(this.a);
        }
    }

    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.b == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.c.requireView();
                Operation.State.a aVar = Operation.State.Companion;
                int visibility = requireView.getVisibility();
                aVar.getClass();
                operation.d(Operation.State.a.b(visibility), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes12.dex */
    public static class a {
        public boolean a;
        public boolean b;

        public final void a(ViewGroup viewGroup) {
            if (!this.b) {
                c(viewGroup);
            }
            this.b = true;
        }

        public boolean b() {
            return this instanceof b.c;
        }

        public final void g(ViewGroup viewGroup) {
            if (!this.a) {
                f(viewGroup);
            }
            this.a = true;
        }

        public void c(ViewGroup viewGroup) {
        }

        public void d(ViewGroup viewGroup) {
        }

        public void e(wu5 wu5Var) {
        }

        public void f(ViewGroup viewGroup) {
        }
    }
}
