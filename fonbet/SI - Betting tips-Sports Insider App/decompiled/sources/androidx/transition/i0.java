package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class i0 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public int f2711c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2709a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2710b = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2712d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f2713e = 0;

    @Override // androidx.transition.a0
    public final a0 addListener(y yVar) {
        return (i0) super.addListener(yVar);
    }

    @Override // androidx.transition.a0
    public final a0 addTarget(View view) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).addTarget(view);
        }
        return (i0) super.addTarget(view);
    }

    @Override // androidx.transition.a0
    public final void cancel() {
        super.cancel();
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).cancel();
        }
    }

    @Override // androidx.transition.a0
    public final void captureEndValues(l0 l0Var) {
        if (isValidTarget(l0Var.f2725b)) {
            Iterator it = this.f2709a.iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (a0Var.isValidTarget(l0Var.f2725b)) {
                    a0Var.captureEndValues(l0Var);
                    l0Var.f2726c.add(a0Var);
                }
            }
        }
    }

    @Override // androidx.transition.a0
    public final void capturePropagationValues(l0 l0Var) {
        super.capturePropagationValues(l0Var);
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).capturePropagationValues(l0Var);
        }
    }

    @Override // androidx.transition.a0
    public final void captureStartValues(l0 l0Var) {
        if (isValidTarget(l0Var.f2725b)) {
            Iterator it = this.f2709a.iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (a0Var.isValidTarget(l0Var.f2725b)) {
                    a0Var.captureStartValues(l0Var);
                    l0Var.f2726c.add(a0Var);
                }
            }
        }
    }

    @Override // androidx.transition.a0
    public final void createAnimators(ViewGroup viewGroup, m0 m0Var, m0 m0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            a0 a0Var = (a0) this.f2709a.get(i5);
            if (startDelay > 0 && (this.f2710b || i5 == 0)) {
                long startDelay2 = a0Var.getStartDelay();
                if (startDelay2 > 0) {
                    a0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    a0Var.setStartDelay(startDelay);
                }
            }
            a0Var.createAnimators(viewGroup, m0Var, m0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.a0
    public final a0 excludeTarget(View view, boolean z5) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).excludeTarget(view, z5);
        }
        return super.excludeTarget(view, z5);
    }

    @Override // androidx.transition.a0
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).forceToEnd(viewGroup);
        }
    }

    public final void g(a0 a0Var) {
        this.f2709a.add(a0Var);
        a0Var.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            a0Var.setDuration(j);
        }
        if ((this.f2713e & 1) != 0) {
            a0Var.setInterpolator(getInterpolator());
        }
        if ((this.f2713e & 2) != 0) {
            getPropagation();
            a0Var.setPropagation(null);
        }
        if ((this.f2713e & 4) != 0) {
            a0Var.setPathMotion(getPathMotion());
        }
        if ((this.f2713e & 8) != 0) {
            a0Var.setEpicenterCallback(getEpicenterCallback());
        }
    }

    public final a0 h(int i5) {
        if (i5 < 0 || i5 >= this.f2709a.size()) {
            return null;
        }
        return (a0) this.f2709a.get(i5);
    }

    @Override // androidx.transition.a0
    public final boolean hasAnimators() {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            if (((a0) this.f2709a.get(i5)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    public final void i(a0 a0Var) {
        this.f2709a.remove(a0Var);
        a0Var.mParent = null;
    }

    @Override // androidx.transition.a0
    public final boolean isSeekingSupported() {
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!((a0) this.f2709a.get(i5)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    public final void j(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f2709a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).setDuration(j);
        }
    }

    @Override // androidx.transition.a0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final i0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f2713e |= 1;
        ArrayList arrayList = this.f2709a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((a0) this.f2709a.get(i5)).setInterpolator(timeInterpolator);
            }
        }
        return (i0) super.setInterpolator(timeInterpolator);
    }

    public final void l(int i5) {
        if (i5 == 0) {
            this.f2710b = true;
        } else {
            if (i5 != 1) {
                throw new AndroidRuntimeException(c1.i(i5, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f2710b = false;
        }
    }

    @Override // androidx.transition.a0
    public final void pause(View view) {
        super.pause(view);
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).pause(view);
        }
    }

    @Override // androidx.transition.a0
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        int i5 = 0;
        h0 h0Var = new h0(this, i5);
        while (i5 < this.f2709a.size()) {
            a0 a0Var = (a0) this.f2709a.get(i5);
            a0Var.addListener(h0Var);
            a0Var.prepareAnimatorsForSeeking();
            long totalDurationMillis = a0Var.getTotalDurationMillis();
            if (this.f2710b) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                a0Var.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
            i5++;
        }
    }

    @Override // androidx.transition.a0
    public final a0 removeListener(y yVar) {
        return (i0) super.removeListener(yVar);
    }

    @Override // androidx.transition.a0
    public final a0 removeTarget(int i5) {
        for (int i10 = 0; i10 < this.f2709a.size(); i10++) {
            ((a0) this.f2709a.get(i10)).removeTarget(i5);
        }
        return (i0) super.removeTarget(i5);
    }

    @Override // androidx.transition.a0
    public final void resume(View view) {
        super.resume(view);
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).resume(view);
        }
    }

    @Override // androidx.transition.a0
    public final void runAnimators() {
        if (this.f2709a.isEmpty()) {
            start();
            end();
            return;
        }
        h0 h0Var = new h0();
        h0Var.f2704b = this;
        Iterator it = this.f2709a.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).addListener(h0Var);
        }
        this.f2711c = this.f2709a.size();
        if (this.f2710b) {
            Iterator it2 = this.f2709a.iterator();
            while (it2.hasNext()) {
                ((a0) it2.next()).runAnimators();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5 - 1)).addListener(new h0((a0) this.f2709a.get(i5), 2));
        }
        a0 a0Var = (a0) this.f2709a.get(0);
        if (a0Var != null) {
            a0Var.runAnimators();
        }
    }

    @Override // androidx.transition.a0
    public final void setCanRemoveViews(boolean z5) {
        super.setCanRemoveViews(z5);
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).setCanRemoveViews(z5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCurrentPlayTimeMillis(long j, long j6) {
        long j10;
        long totalDurationMillis = getTotalDurationMillis();
        long j11 = 0;
        if (this.mParent != null) {
            if (j < 0 && j6 < 0) {
                return;
            }
            if (j > totalDurationMillis && j6 > totalDurationMillis) {
                return;
            }
        }
        boolean z5 = j < j6;
        if ((j >= 0 && j6 < 0) || (j <= totalDurationMillis && j6 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(z.M, z5);
        }
        if (!this.f2710b) {
            int i5 = 1;
            while (true) {
                if (i5 >= this.f2709a.size()) {
                    i5 = this.f2709a.size();
                    break;
                } else if (((a0) this.f2709a.get(i5)).mSeekOffsetInParent > j6) {
                    break;
                } else {
                    i5++;
                }
            }
            int i10 = i5 - 1;
            if (j >= j6) {
                while (i10 < this.f2709a.size()) {
                    a0 a0Var = (a0) this.f2709a.get(i10);
                    long j12 = a0Var.mSeekOffsetInParent;
                    j10 = j11;
                    long j13 = j - j12;
                    if (j13 < j10) {
                        break;
                    }
                    a0Var.setCurrentPlayTimeMillis(j13, j6 - j12);
                    i10++;
                    j11 = j10;
                }
            } else {
                j10 = 0;
                while (i10 >= 0) {
                    a0 a0Var2 = (a0) this.f2709a.get(i10);
                    long j14 = a0Var2.mSeekOffsetInParent;
                    long j15 = j - j14;
                    a0Var2.setCurrentPlayTimeMillis(j15, j6 - j14);
                    if (j15 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            if (this.mParent == null) {
                if ((j <= totalDurationMillis || j6 > totalDurationMillis) && (j >= 0 || j6 < j10)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(z.N, z5);
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < this.f2709a.size(); i11++) {
            ((a0) this.f2709a.get(i11)).setCurrentPlayTimeMillis(j, j6);
        }
        j10 = j11;
        if (this.mParent == null) {
        }
    }

    @Override // androidx.transition.a0
    public final /* bridge */ /* synthetic */ a0 setDuration(long j) {
        j(j);
        return this;
    }

    @Override // androidx.transition.a0
    public final void setEpicenterCallback(u uVar) {
        super.setEpicenterCallback(uVar);
        this.f2713e |= 8;
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).setEpicenterCallback(uVar);
        }
    }

    @Override // androidx.transition.a0
    public final void setPathMotion(p pVar) {
        super.setPathMotion(pVar);
        this.f2713e |= 4;
        if (this.f2709a != null) {
            for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
                ((a0) this.f2709a.get(i5)).setPathMotion(pVar);
            }
        }
    }

    @Override // androidx.transition.a0
    public final void setPropagation(f0 f0Var) {
        super.setPropagation(null);
        this.f2713e |= 2;
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((a0) this.f2709a.get(i5)).setPropagation(null);
        }
    }

    @Override // androidx.transition.a0
    public final a0 setStartDelay(long j) {
        return (i0) super.setStartDelay(j);
    }

    @Override // androidx.transition.a0
    public final String toString(String str) {
        String a0Var = super.toString(str);
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            StringBuilder c2 = v.f.c(a0Var, "\n");
            c2.append(((a0) this.f2709a.get(i5)).toString(str + "  "));
            a0Var = c2.toString();
        }
        return a0Var;
    }

    @Override // androidx.transition.a0
    /* renamed from: clone */
    public final a0 mo68clone() {
        i0 i0Var = (i0) super.mo68clone();
        i0Var.f2709a = new ArrayList();
        int size = this.f2709a.size();
        for (int i5 = 0; i5 < size; i5++) {
            a0 mo68clone = ((a0) this.f2709a.get(i5)).mo68clone();
            i0Var.f2709a.add(mo68clone);
            mo68clone.mParent = i0Var;
        }
        return i0Var;
    }

    @Override // androidx.transition.a0
    public final a0 addTarget(int i5) {
        for (int i10 = 0; i10 < this.f2709a.size(); i10++) {
            ((a0) this.f2709a.get(i10)).addTarget(i5);
        }
        return (i0) super.addTarget(i5);
    }

    @Override // androidx.transition.a0
    public final a0 excludeTarget(String str, boolean z5) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).excludeTarget(str, z5);
        }
        return super.excludeTarget(str, z5);
    }

    @Override // androidx.transition.a0
    public final a0 removeTarget(View view) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).removeTarget(view);
        }
        return (i0) super.removeTarget(view);
    }

    @Override // androidx.transition.a0
    public final a0 addTarget(String str) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).addTarget(str);
        }
        return (i0) super.addTarget(str);
    }

    @Override // androidx.transition.a0
    public final a0 excludeTarget(int i5, boolean z5) {
        for (int i10 = 0; i10 < this.f2709a.size(); i10++) {
            ((a0) this.f2709a.get(i10)).excludeTarget(i5, z5);
        }
        return super.excludeTarget(i5, z5);
    }

    @Override // androidx.transition.a0
    public final a0 removeTarget(Class cls) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).removeTarget((Class<?>) cls);
        }
        return (i0) super.removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.a0
    public final a0 addTarget(Class cls) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).addTarget((Class<?>) cls);
        }
        return (i0) super.addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.a0
    public final a0 excludeTarget(Class cls, boolean z5) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).excludeTarget((Class<?>) cls, z5);
        }
        return super.excludeTarget((Class<?>) cls, z5);
    }

    @Override // androidx.transition.a0
    public final a0 removeTarget(String str) {
        for (int i5 = 0; i5 < this.f2709a.size(); i5++) {
            ((a0) this.f2709a.get(i5)).removeTarget(str);
        }
        return (i0) super.removeTarget(str);
    }
}
