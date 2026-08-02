package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a0 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<l0> mEndValuesList;
    private u mEpicenterCallback;
    private y[] mListenersCache;
    private s.e mNameOverrides;
    f0 mPropagation;
    x mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<l0> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final p STRAIGHT_PATH_MOTION = new r();
    private static ThreadLocal<s.e> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private m0 mStartValues = new m0();
    private m0 mEndValues = new m0();
    i0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private a0 mCloneParent = null;
    private ArrayList<y> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private p mPathMotion = STRAIGHT_PATH_MOTION;

    public static void a(m0 m0Var, View view, l0 l0Var) {
        s.e eVar = m0Var.f2728a;
        s.e eVar2 = m0Var.f2731d;
        SparseArray sparseArray = m0Var.f2729b;
        s.j jVar = m0Var.f2730c;
        eVar.put(view, l0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        String f6 = androidx.core.view.q0.f(view);
        if (f6 != null) {
            if (eVar2.containsKey(f6)) {
                eVar2.put(f6, null);
            } else {
                eVar2.put(f6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (jVar.f22560a) {
                    int i5 = jVar.f22563d;
                    long[] jArr = jVar.f22561b;
                    Object[] objArr = jVar.f22562c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i5; i11++) {
                        Object obj = objArr[i11];
                        if (obj != s.k.f22564a) {
                            if (i11 != i10) {
                                jArr[i10] = jArr[i11];
                                objArr[i10] = obj;
                                objArr[i11] = null;
                            }
                            i10++;
                        }
                    }
                    jVar.f22560a = false;
                    jVar.f22563d = i10;
                }
                if (t.a.b(jVar.f22561b, jVar.f22563d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    jVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) jVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    jVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static s.e d() {
        s.e eVar = sRunningAnimators.get();
        if (eVar != null) {
            return eVar;
        }
        s.e eVar2 = new s.e(0);
        sRunningAnimators.set(eVar2);
        return eVar2;
    }

    public static boolean e(l0 l0Var, l0 l0Var2, String str) {
        Object obj = l0Var.f2724a.get(str);
        Object obj2 = l0Var2.f2724a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    @NonNull
    public a0 addListener(@NonNull y yVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(yVar);
        return this;
    }

    @NonNull
    public a0 addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new androidx.appcompat.widget.d(2, this));
        animator.start();
    }

    public final void b(View view, boolean z5) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (this.mTargetTypeExcludes.get(i5).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    l0 l0Var = new l0(view);
                    if (z5) {
                        captureStartValues(l0Var);
                    } else {
                        captureEndValues(l0Var);
                    }
                    l0Var.f2726c.add(this);
                    capturePropagationValues(l0Var);
                    if (z5) {
                        a(this.mStartValues, view, l0Var);
                    } else {
                        a(this.mEndValues, view, l0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    if (this.mTargetTypeChildExcludes.get(i10).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                                b(viewGroup.getChildAt(i11), z5);
                            }
                        }
                    }
                }
            }
        }
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i5 = size - 1; i5 >= 0; i5--) {
            Animator animator = animatorArr[i5];
            animatorArr[i5] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(z.O, false);
    }

    public abstract void captureEndValues(l0 l0Var);

    public abstract void captureStartValues(l0 l0Var);

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z5) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        s.e eVar;
        clearValues(z5);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i5 = 0; i5 < this.mTargetIds.size(); i5++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i5).intValue());
                if (findViewById != null) {
                    l0 l0Var = new l0(findViewById);
                    if (z5) {
                        captureStartValues(l0Var);
                    } else {
                        captureEndValues(l0Var);
                    }
                    l0Var.f2726c.add(this);
                    capturePropagationValues(l0Var);
                    if (z5) {
                        a(this.mStartValues, findViewById, l0Var);
                    } else {
                        a(this.mEndValues, findViewById, l0Var);
                    }
                }
            }
            for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                View view = this.mTargets.get(i10);
                l0 l0Var2 = new l0(view);
                if (z5) {
                    captureStartValues(l0Var2);
                } else {
                    captureEndValues(l0Var2);
                }
                l0Var2.f2726c.add(this);
                capturePropagationValues(l0Var2);
                if (z5) {
                    a(this.mStartValues, view, l0Var2);
                } else {
                    a(this.mEndValues, view, l0Var2);
                }
            }
        } else {
            b(viewGroup, z5);
        }
        if (z5 || (eVar = this.mNameOverrides) == null) {
            return;
        }
        int i11 = eVar.f22575c;
        ArrayList arrayList3 = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList3.add((View) this.mStartValues.f2731d.remove((String) this.mNameOverrides.g(i12)));
        }
        for (int i13 = 0; i13 < i11; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.mStartValues.f2731d.put((String) this.mNameOverrides.j(i13), view2);
            }
        }
    }

    public void clearValues(boolean z5) {
        if (z5) {
            this.mStartValues.f2728a.clear();
            this.mStartValues.f2729b.clear();
            this.mStartValues.f2730c.b();
        } else {
            this.mEndValues.f2728a.clear();
            this.mEndValues.f2729b.clear();
            this.mEndValues.f2730c.b();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        return null;
    }

    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull m0 m0Var, @NonNull m0 m0Var2, @NonNull ArrayList<l0> arrayList, @NonNull ArrayList<l0> arrayList2) {
        int i5;
        boolean z5;
        View view;
        l0 l0Var;
        Animator animator;
        l0 l0Var2;
        s.e d10 = d();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z7 = getRootTransition().mSeekController != null;
        int i10 = 0;
        while (i10 < size) {
            l0 l0Var3 = arrayList.get(i10);
            l0 l0Var4 = arrayList2.get(i10);
            if (l0Var3 != null && !l0Var3.f2726c.contains(this)) {
                l0Var3 = null;
            }
            if (l0Var4 != null && !l0Var4.f2726c.contains(this)) {
                l0Var4 = null;
            }
            if ((l0Var3 != null || l0Var4 != null) && (l0Var3 == null || l0Var4 == null || isTransitionRequired(l0Var3, l0Var4))) {
                Animator createAnimator = createAnimator(viewGroup, l0Var3, l0Var4);
                if (createAnimator != null) {
                    if (l0Var4 != null) {
                        view = l0Var4.f2725b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            l0Var2 = new l0(view);
                            l0 l0Var5 = (l0) m0Var2.f2728a.get(view);
                            i5 = size;
                            if (l0Var5 != null) {
                                int i11 = 0;
                                while (i11 < transitionProperties.length) {
                                    String str = transitionProperties[i11];
                                    l0Var2.f2724a.put(str, l0Var5.f2724a.get(str));
                                    i11++;
                                    z7 = z7;
                                    l0Var5 = l0Var5;
                                }
                            }
                            z5 = z7;
                            int i12 = d10.f22575c;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator = createAnimator;
                                    break;
                                }
                                t tVar = (t) d10.get((Animator) d10.g(i13));
                                if (tVar.f2744c != null && tVar.f2742a == view && tVar.f2743b.equals(getName()) && tVar.f2744c.equals(l0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i5 = size;
                            z5 = z7;
                            animator = createAnimator;
                            l0Var2 = null;
                        }
                        createAnimator = animator;
                        l0Var = l0Var2;
                    } else {
                        i5 = size;
                        z5 = z7;
                        view = l0Var3.f2725b;
                        l0Var = null;
                    }
                    if (createAnimator != null) {
                        String name = getName();
                        WindowId windowId = viewGroup.getWindowId();
                        t tVar2 = new t();
                        tVar2.f2742a = view;
                        tVar2.f2743b = name;
                        tVar2.f2744c = l0Var;
                        tVar2.f2745d = windowId;
                        tVar2.f2746e = this;
                        tVar2.f2747f = createAnimator;
                        if (z5) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(createAnimator);
                            createAnimator = animatorSet;
                        }
                        d10.put(createAnimator, tVar2);
                        this.mAnimators.add(createAnimator);
                    }
                    i10++;
                    size = i5;
                    z7 = z5;
                }
            }
            i5 = size;
            z5 = z7;
            i10++;
            size = i5;
            z7 = z5;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                t tVar3 = (t) d10.get(this.mAnimators.get(sparseIntArray.keyAt(i14)));
                tVar3.f2747f.setStartDelay(tVar3.f2747f.getStartDelay() + (sparseIntArray.valueAt(i14) - LongCompanionObject.MAX_VALUE));
            }
        }
    }

    @NonNull
    public g0 createSeekController() {
        x xVar = new x(this);
        this.mSeekController = xVar;
        addListener(xVar);
        return this.mSeekController;
    }

    public void end() {
        int i5 = this.mNumInstances - 1;
        this.mNumInstances = i5;
        if (i5 == 0) {
            notifyListeners(z.N, false);
            for (int i10 = 0; i10 < this.mStartValues.f2730c.i(); i10++) {
                View view = (View) this.mStartValues.f2730c.j(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < this.mEndValues.f2730c.i(); i11++) {
                View view2 = (View) this.mEndValues.f2730c.j(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public a0 excludeChildren(@NonNull View view, boolean z5) {
        ArrayList<View> arrayList = this.mTargetChildExcludes;
        if (view != null) {
            arrayList = z5 ? u6.h.d(view, arrayList) : u6.h.u(view, arrayList);
        }
        this.mTargetChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public a0 excludeTarget(@NonNull View view, boolean z5) {
        ArrayList<View> arrayList = this.mTargetExcludes;
        if (view != null) {
            arrayList = z5 ? u6.h.d(view, arrayList) : u6.h.u(view, arrayList);
        }
        this.mTargetExcludes = arrayList;
        return this;
    }

    public final void f(a0 a0Var, z zVar, boolean z5) {
        a0 a0Var2 = this.mCloneParent;
        if (a0Var2 != null) {
            a0Var2.f(a0Var, zVar, z5);
        }
        ArrayList<y> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        y[] yVarArr = this.mListenersCache;
        if (yVarArr == null) {
            yVarArr = new y[size];
        }
        this.mListenersCache = null;
        y[] yVarArr2 = (y[]) this.mListeners.toArray(yVarArr);
        for (int i5 = 0; i5 < size; i5++) {
            zVar.a(yVarArr2[i5], a0Var, z5);
            yVarArr2[i5] = null;
        }
        this.mListenersCache = yVarArr2;
    }

    public void forceToEnd(ViewGroup viewGroup) {
        s.e d10 = d();
        int i5 = d10.f22575c;
        if (viewGroup == null || i5 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        s.e eVar = new s.e(d10);
        d10.clear();
        for (int i10 = i5 - 1; i10 >= 0; i10--) {
            t tVar = (t) eVar.j(i10);
            if (tVar.f2742a != null && windowId.equals(tVar.f2745d)) {
                ((Animator) eVar.g(i10)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        u uVar = this.mEpicenterCallback;
        if (uVar == null) {
            return null;
        }
        return uVar.a();
    }

    public u getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public l0 getMatchedTransitionValues(View view, boolean z5) {
        i0 i0Var = this.mParent;
        if (i0Var != null) {
            return i0Var.getMatchedTransitionValues(view, z5);
        }
        ArrayList<l0> arrayList = z5 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            }
            l0 l0Var = arrayList.get(i5);
            if (l0Var == null) {
                return null;
            }
            if (l0Var.f2725b == view) {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            return (z5 ? this.mEndValuesList : this.mStartValuesList).get(i5);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public p getPathMotion() {
        return this.mPathMotion;
    }

    public f0 getPropagation() {
        return null;
    }

    @NonNull
    public final a0 getRootTransition() {
        i0 i0Var = this.mParent;
        return i0Var != null ? i0Var.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public l0 getTransitionValues(@NonNull View view, boolean z5) {
        i0 i0Var = this.mParent;
        if (i0Var != null) {
            return i0Var.getTransitionValues(view, z5);
        }
        return (l0) (z5 ? this.mStartValues : this.mEndValues).f2728a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(l0 l0Var, l0 l0Var2) {
        if (l0Var != null && l0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (e(l0Var, l0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = l0Var.f2724a.keySet().iterator();
                while (it.hasNext()) {
                    if (e(l0Var, l0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (this.mTargetTypeExcludes.get(i5).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            if (androidx.core.view.q0.f(view) != null && this.mTargetNameExcludes.contains(androidx.core.view.q0.f(view))) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap weakHashMap2 = androidx.core.view.z0.f1413a;
            if (arrayList6.contains(androidx.core.view.q0.f(view))) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i10 = 0; i10 < this.mTargetTypes.size(); i10++) {
                if (this.mTargetTypes.get(i10).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(z zVar, boolean z5) {
        f(this, zVar, z5);
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i5 = size - 1; i5 >= 0; i5--) {
            Animator animator = animatorArr[i5];
            animatorArr[i5] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(z.P, false);
        this.mPaused = true;
    }

    public void playTransition(@NonNull ViewGroup viewGroup) {
        t tVar;
        l0 l0Var;
        View view;
        View view2;
        View view3;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        m0 m0Var = this.mStartValues;
        m0 m0Var2 = this.mEndValues;
        s.e eVar = new s.e(m0Var.f2728a);
        s.e eVar2 = new s.e(m0Var2.f2728a);
        int i5 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i5 >= iArr.length) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 == 1) {
                for (int i11 = eVar.f22575c - 1; i11 >= 0; i11--) {
                    View view4 = (View) eVar.g(i11);
                    if (view4 != null && isValidTarget(view4) && (l0Var = (l0) eVar2.remove(view4)) != null && isValidTarget(l0Var.f2725b)) {
                        this.mStartValuesList.add((l0) eVar.h(i11));
                        this.mEndValuesList.add(l0Var);
                    }
                }
            } else if (i10 == 2) {
                s.e eVar3 = m0Var.f2731d;
                s.e eVar4 = m0Var2.f2731d;
                int i12 = eVar3.f22575c;
                for (int i13 = 0; i13 < i12; i13++) {
                    View view5 = (View) eVar3.j(i13);
                    if (view5 != null && isValidTarget(view5) && (view = (View) eVar4.get(eVar3.g(i13))) != null && isValidTarget(view)) {
                        l0 l0Var2 = (l0) eVar.get(view5);
                        l0 l0Var3 = (l0) eVar2.get(view);
                        if (l0Var2 != null && l0Var3 != null) {
                            this.mStartValuesList.add(l0Var2);
                            this.mEndValuesList.add(l0Var3);
                            eVar.remove(view5);
                            eVar2.remove(view);
                        }
                    }
                }
            } else if (i10 == 3) {
                SparseArray sparseArray = m0Var.f2729b;
                SparseArray sparseArray2 = m0Var2.f2729b;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    View view6 = (View) sparseArray.valueAt(i14);
                    if (view6 != null && isValidTarget(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && isValidTarget(view2)) {
                        l0 l0Var4 = (l0) eVar.get(view6);
                        l0 l0Var5 = (l0) eVar2.get(view2);
                        if (l0Var4 != null && l0Var5 != null) {
                            this.mStartValuesList.add(l0Var4);
                            this.mEndValuesList.add(l0Var5);
                            eVar.remove(view6);
                            eVar2.remove(view2);
                        }
                    }
                }
            } else if (i10 == 4) {
                s.j jVar = m0Var.f2730c;
                s.j jVar2 = m0Var2.f2730c;
                int i15 = jVar.i();
                for (int i16 = 0; i16 < i15; i16++) {
                    View view7 = (View) jVar.j(i16);
                    if (view7 != null && isValidTarget(view7) && (view3 = (View) jVar2.e(jVar.g(i16))) != null && isValidTarget(view3)) {
                        l0 l0Var6 = (l0) eVar.get(view7);
                        l0 l0Var7 = (l0) eVar2.get(view3);
                        if (l0Var6 != null && l0Var7 != null) {
                            this.mStartValuesList.add(l0Var6);
                            this.mEndValuesList.add(l0Var7);
                            eVar.remove(view7);
                            eVar2.remove(view3);
                        }
                    }
                }
            }
            i5++;
        }
        for (int i17 = 0; i17 < eVar.f22575c; i17++) {
            l0 l0Var8 = (l0) eVar.j(i17);
            if (isValidTarget(l0Var8.f2725b)) {
                this.mStartValuesList.add(l0Var8);
                this.mEndValuesList.add(null);
            }
        }
        for (int i18 = 0; i18 < eVar2.f22575c; i18++) {
            l0 l0Var9 = (l0) eVar2.j(i18);
            if (isValidTarget(l0Var9.f2725b)) {
                this.mEndValuesList.add(l0Var9);
                this.mStartValuesList.add(null);
            }
        }
        s.e d10 = d();
        int i19 = d10.f22575c;
        WindowId windowId = viewGroup.getWindowId();
        for (int i20 = i19 - 1; i20 >= 0; i20--) {
            Animator animator = (Animator) d10.g(i20);
            if (animator != null && (tVar = (t) d10.get(animator)) != null) {
                a0 a0Var = tVar.f2746e;
                View view8 = tVar.f2742a;
                if (view8 != null && windowId.equals(tVar.f2745d)) {
                    l0 l0Var10 = tVar.f2744c;
                    l0 transitionValues = getTransitionValues(view8, true);
                    l0 matchedTransitionValues = getMatchedTransitionValues(view8, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = (l0) this.mEndValues.f2728a.get(view8);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && a0Var.isTransitionRequired(l0Var10, matchedTransitionValues)) {
                        if (a0Var.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            a0Var.mCurrentAnimators.remove(animator);
                            d10.remove(animator);
                            if (a0Var.mCurrentAnimators.size() == 0) {
                                a0Var.notifyListeners(z.O, false);
                                if (!a0Var.mEnded) {
                                    a0Var.mEnded = true;
                                    a0Var.notifyListeners(z.N, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            d10.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            x xVar = this.mSeekController;
            a0 a0Var2 = xVar.f2765g;
            long j = a0Var2.getTotalDurationMillis() == 0 ? 1L : 0L;
            a0Var2.setCurrentPlayTimeMillis(j, xVar.f2759a);
            xVar.f2759a = j;
            this.mSeekController.f2760b = true;
        }
    }

    public void prepareAnimatorsForSeeking() {
        s.e d10 = d();
        this.mTotalDuration = 0L;
        for (int i5 = 0; i5 < this.mAnimators.size(); i5++) {
            Animator animator = this.mAnimators.get(i5);
            t tVar = (t) d10.get(animator);
            if (animator != null && tVar != null) {
                Animator animator2 = tVar.f2747f;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, v.a(animator));
            }
        }
        this.mAnimators.clear();
    }

    @NonNull
    public a0 removeListener(@NonNull y yVar) {
        a0 a0Var;
        ArrayList<y> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(yVar) && (a0Var = this.mCloneParent) != null) {
                a0Var.removeListener(yVar);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public a0 removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i5 = size - 1; i5 >= 0; i5--) {
                    Animator animator = animatorArr[i5];
                    animatorArr[i5] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(z.Q, false);
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        s.e d10 = d();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (d10.containsKey(next)) {
                start();
                if (next != null) {
                    next.addListener(new s(this, d10));
                    animate(next);
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z5) {
        this.mCanRemoveViews = z5;
    }

    public void setCurrentPlayTimeMillis(long j, long j6) {
        long totalDurationMillis = getTotalDurationMillis();
        int i5 = 0;
        boolean z5 = j < j6;
        if ((j6 < 0 && j >= 0) || (j6 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(z.M, z5);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i5 < size) {
            Animator animator = animatorArr[i5];
            animatorArr[i5] = null;
            v.b(animator, Math.min(Math.max(0L, j), v.a(animator)));
            i5++;
            totalDurationMillis = totalDurationMillis;
        }
        long j10 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j <= j10 || j6 > j10) && (j >= 0 || j6 < 0)) {
            return;
        }
        if (j > j10) {
            this.mEnded = true;
        }
        notifyListeners(z.N, z5);
    }

    @NonNull
    public a0 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(u uVar) {
        this.mEpicenterCallback = uVar;
    }

    @NonNull
    public a0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i10 = iArr[i5];
            if (i10 < 1 || i10 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i11 = 0; i11 < i5; i11++) {
                if (iArr[i11] == i10) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(p pVar) {
        if (pVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pVar;
        }
    }

    @NonNull
    public a0 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(z.M, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    @NonNull
    public a0 addTarget(int i5) {
        if (i5 != 0) {
            this.mTargetIds.add(Integer.valueOf(i5));
        }
        return this;
    }

    @Override // 
    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a0 mo68clone() {
        try {
            a0 a0Var = (a0) super.clone();
            a0Var.mAnimators = new ArrayList<>();
            a0Var.mStartValues = new m0();
            a0Var.mEndValues = new m0();
            a0Var.mStartValuesList = null;
            a0Var.mEndValuesList = null;
            a0Var.mSeekController = null;
            a0Var.mCloneParent = this;
            a0Var.mListeners = null;
            return a0Var;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    @NonNull
    public a0 removeTarget(int i5) {
        if (i5 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i5));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.mDuration != -1) {
            sb2.append("dur(");
            sb2.append(this.mDuration);
            sb2.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb2.append("dly(");
            sb2.append(this.mStartDelay);
            sb2.append(") ");
        }
        if (this.mInterpolator != null) {
            sb2.append("interp(");
            sb2.append(this.mInterpolator);
            sb2.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb2.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i5 = 0; i5 < this.mTargetIds.size(); i5++) {
                    if (i5 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargetIds.get(i5));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargets.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @NonNull
    public a0 addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public a0 removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public a0 excludeChildren(int i5, boolean z5) {
        ArrayList<Integer> arrayList = this.mTargetIdChildExcludes;
        if (i5 > 0) {
            if (z5) {
                arrayList = u6.h.d(Integer.valueOf(i5), arrayList);
            } else {
                arrayList = u6.h.u(Integer.valueOf(i5), arrayList);
            }
        }
        this.mTargetIdChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public a0 excludeTarget(int i5, boolean z5) {
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (i5 > 0) {
            if (z5) {
                arrayList = u6.h.d(Integer.valueOf(i5), arrayList);
            } else {
                arrayList = u6.h.u(Integer.valueOf(i5), arrayList);
            }
        }
        this.mTargetIdExcludes = arrayList;
        return this;
    }

    @NonNull
    public a0 removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public a0 addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @NonNull
    public a0 excludeChildren(@NonNull Class<?> cls, boolean z5) {
        ArrayList<Class<?>> arrayList = this.mTargetTypeChildExcludes;
        if (cls != null) {
            if (z5) {
                arrayList = u6.h.d(cls, arrayList);
            } else {
                arrayList = u6.h.u(cls, arrayList);
            }
        }
        this.mTargetTypeChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public a0 excludeTarget(@NonNull String str, boolean z5) {
        ArrayList<String> arrayList = this.mTargetNameExcludes;
        if (str != null) {
            if (z5) {
                arrayList = u6.h.d(str, arrayList);
            } else {
                arrayList = u6.h.u(str, arrayList);
            }
        }
        this.mTargetNameExcludes = arrayList;
        return this;
    }

    @NonNull
    public a0 excludeTarget(@NonNull Class<?> cls, boolean z5) {
        ArrayList<Class<?>> arrayList = this.mTargetTypeExcludes;
        if (cls != null) {
            if (z5) {
                arrayList = u6.h.d(cls, arrayList);
            } else {
                arrayList = u6.h.u(cls, arrayList);
            }
        }
        this.mTargetTypeExcludes = arrayList;
        return this;
    }

    public void capturePropagationValues(l0 l0Var) {
    }

    public void setPropagation(f0 f0Var) {
    }
}
