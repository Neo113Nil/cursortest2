package L2;

import L2.AbstractC1388m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y extends AbstractC1388m {

    /* renamed from: P, reason: collision with root package name */
    public int f6942P;
    private AbstractC1388m[] mTransitionsCache;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f6940L = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    public boolean f6941O = true;

    /* renamed from: R, reason: collision with root package name */
    public boolean f6943R = false;

    /* renamed from: T, reason: collision with root package name */
    public int f6944T = 0;

    public class a extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1388m f6945a;

        public a(AbstractC1388m abstractC1388m) {
            this.f6945a = abstractC1388m;
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            this.f6945a.f0();
            abstractC1388m.b0(this);
        }
    }

    public class b extends u {
        public b() {
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            y.this.f6940L.remove(abstractC1388m);
            if (y.this.M()) {
                return;
            }
            y.this.X(AbstractC1388m.j.f6929c, false);
            y yVar = y.this;
            yVar.f6906y = true;
            yVar.X(AbstractC1388m.j.f6928b, false);
        }
    }

    public static class c extends u {

        /* renamed from: a, reason: collision with root package name */
        public y f6948a;

        public c(y yVar) {
            this.f6948a = yVar;
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            y yVar = this.f6948a;
            int i10 = yVar.f6942P - 1;
            yVar.f6942P = i10;
            if (i10 == 0) {
                yVar.f6943R = false;
                yVar.r();
            }
            abstractC1388m.b0(this);
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
            y yVar = this.f6948a;
            if (yVar.f6943R) {
                return;
            }
            yVar.n0();
            this.f6948a.f6943R = true;
        }
    }

    @Override // L2.AbstractC1388m
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public y j0(TimeInterpolator timeInterpolator) {
        this.f6944T |= 1;
        ArrayList arrayList = this.f6940L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1388m) this.f6940L.get(i10)).j0(timeInterpolator);
            }
        }
        return (y) super.j0(timeInterpolator);
    }

    public y B0(int i10) {
        if (i10 == 0) {
            this.f6941O = true;
            return this;
        }
        if (i10 == 1) {
            this.f6941O = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // L2.AbstractC1388m
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public y m0(long j10) {
        return (y) super.m0(j10);
    }

    public final void D0() {
        c cVar = new c(this);
        Iterator it = this.f6940L.iterator();
        while (it.hasNext()) {
            ((AbstractC1388m) it.next()).c(cVar);
        }
        this.f6942P = this.f6940L.size();
    }

    public final AbstractC1388m[] E0() {
        AbstractC1388m[] abstractC1388mArr = this.mTransitionsCache;
        this.mTransitionsCache = null;
        if (abstractC1388mArr == null) {
            abstractC1388mArr = new AbstractC1388m[this.f6940L.size()];
        }
        return (AbstractC1388m[]) this.f6940L.toArray(abstractC1388mArr);
    }

    @Override // L2.AbstractC1388m
    public boolean M() {
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            if (((AbstractC1388m) this.f6940L.get(i10)).M()) {
                return true;
            }
        }
        return false;
    }

    @Override // L2.AbstractC1388m
    public boolean N() {
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((AbstractC1388m) this.f6940L.get(i10)).N()) {
                return false;
            }
        }
        return true;
    }

    @Override // L2.AbstractC1388m
    public void Y(View view) {
        super.Y(view);
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).Y(view);
        }
    }

    @Override // L2.AbstractC1388m
    public void a0() {
        this.f6879G = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            AbstractC1388m abstractC1388m = (AbstractC1388m) this.f6940L.get(i10);
            abstractC1388m.c(bVar);
            abstractC1388m.a0();
            long J10 = abstractC1388m.J();
            if (this.f6941O) {
                this.f6879G = Math.max(this.f6879G, J10);
            } else {
                long j10 = this.f6879G;
                abstractC1388m.f6881I = j10;
                this.f6879G = j10 + J10;
            }
        }
    }

    @Override // L2.AbstractC1388m
    public void cancel() {
        super.cancel();
        AbstractC1388m[] E02 = E0();
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            E02[i10].cancel();
        }
        y0(E02);
    }

    @Override // L2.AbstractC1388m
    public void d0(View view) {
        super.d0(view);
        AbstractC1388m[] E02 = E0();
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            E02[i10].d0(view);
        }
        y0(E02);
    }

    @Override // L2.AbstractC1388m
    public void f0() {
        if (this.f6940L.isEmpty()) {
            n0();
            r();
            return;
        }
        D0();
        if (this.f6941O) {
            Iterator it = this.f6940L.iterator();
            while (it.hasNext()) {
                ((AbstractC1388m) it.next()).f0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f6940L.size(); i10++) {
            ((AbstractC1388m) this.f6940L.get(i10 - 1)).c(new a((AbstractC1388m) this.f6940L.get(i10)));
        }
        AbstractC1388m abstractC1388m = (AbstractC1388m) this.f6940L.get(0);
        if (abstractC1388m != null) {
            abstractC1388m.f0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // L2.AbstractC1388m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g0(long j10, long j11) {
        long j12;
        long J10 = J();
        long j13 = 0;
        if (this.f6899r != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > J10 && j11 > J10) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= J10 && j11 > J10)) {
            this.f6906y = false;
            X(AbstractC1388m.j.f6927a, z10);
        }
        if (!this.f6941O) {
            int v02 = v0(j11);
            if (j10 >= j11) {
                while (v02 < this.f6940L.size()) {
                    AbstractC1388m abstractC1388m = (AbstractC1388m) this.f6940L.get(v02);
                    long j14 = abstractC1388m.f6881I;
                    j12 = j13;
                    long j15 = j10 - j14;
                    if (j15 < j12) {
                        break;
                    }
                    abstractC1388m.g0(j15, j11 - j14);
                    v02++;
                    j13 = j12;
                }
            } else {
                j12 = 0;
                while (v02 >= 0) {
                    AbstractC1388m abstractC1388m2 = (AbstractC1388m) this.f6940L.get(v02);
                    long j16 = abstractC1388m2.f6881I;
                    long j17 = j10 - j16;
                    abstractC1388m2.g0(j17, j11 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        v02--;
                    }
                }
            }
            if (this.f6899r == null) {
                if ((j10 <= J10 || j11 > J10) && (j10 >= 0 || j11 < j12)) {
                    return;
                }
                if (j10 > J10) {
                    this.f6906y = true;
                }
                X(AbstractC1388m.j.f6928b, z10);
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).g0(j10, j11);
        }
        j12 = j13;
        if (this.f6899r == null) {
        }
    }

    @Override // L2.AbstractC1388m
    public void h(A a10) {
        if (P(a10.f6757b)) {
            Iterator it = this.f6940L.iterator();
            while (it.hasNext()) {
                AbstractC1388m abstractC1388m = (AbstractC1388m) it.next();
                if (abstractC1388m.P(a10.f6757b)) {
                    abstractC1388m.h(a10);
                    a10.f6758c.add(abstractC1388m);
                }
            }
        }
    }

    @Override // L2.AbstractC1388m
    public void i0(AbstractC1388m.f fVar) {
        super.i0(fVar);
        this.f6944T |= 8;
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).i0(fVar);
        }
    }

    @Override // L2.AbstractC1388m
    public void j(A a10) {
        super.j(a10);
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).j(a10);
        }
    }

    @Override // L2.AbstractC1388m
    public void k(A a10) {
        if (P(a10.f6757b)) {
            Iterator it = this.f6940L.iterator();
            while (it.hasNext()) {
                AbstractC1388m abstractC1388m = (AbstractC1388m) it.next();
                if (abstractC1388m.P(a10.f6757b)) {
                    abstractC1388m.k(a10);
                    a10.f6758c.add(abstractC1388m);
                }
            }
        }
    }

    @Override // L2.AbstractC1388m
    public void k0(AbstractC1382g abstractC1382g) {
        super.k0(abstractC1382g);
        this.f6944T |= 4;
        if (this.f6940L != null) {
            for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
                ((AbstractC1388m) this.f6940L.get(i10)).k0(abstractC1382g);
            }
        }
    }

    @Override // L2.AbstractC1388m
    public void l0(w wVar) {
        super.l0(wVar);
        this.f6944T |= 2;
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).l0(wVar);
        }
    }

    @Override // L2.AbstractC1388m
    /* renamed from: n */
    public AbstractC1388m clone() {
        y yVar = (y) super.clone();
        yVar.f6940L = new ArrayList();
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            yVar.s0(((AbstractC1388m) this.f6940L.get(i10)).clone());
        }
        return yVar;
    }

    @Override // L2.AbstractC1388m
    public String o0(String str) {
        String o02 = super.o0(str);
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o02);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append(((AbstractC1388m) this.f6940L.get(i10)).o0(str + "  "));
            o02 = sb2.toString();
        }
        return o02;
    }

    @Override // L2.AbstractC1388m
    public void p(ViewGroup viewGroup, B b10, B b11, ArrayList arrayList, ArrayList arrayList2) {
        long E10 = E();
        int size = this.f6940L.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1388m abstractC1388m = (AbstractC1388m) this.f6940L.get(i10);
            if (E10 > 0 && (this.f6941O || i10 == 0)) {
                long E11 = abstractC1388m.E();
                if (E11 > 0) {
                    abstractC1388m.m0(E11 + E10);
                } else {
                    abstractC1388m.m0(E10);
                }
            }
            abstractC1388m.p(viewGroup, b10, b11, arrayList, arrayList2);
        }
    }

    @Override // L2.AbstractC1388m
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public y c(AbstractC1388m.i iVar) {
        return (y) super.c(iVar);
    }

    @Override // L2.AbstractC1388m
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public y d(View view) {
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).d(view);
        }
        return (y) super.d(view);
    }

    public y r0(AbstractC1388m abstractC1388m) {
        s0(abstractC1388m);
        long j10 = this.f6884c;
        if (j10 >= 0) {
            abstractC1388m.h0(j10);
        }
        if ((this.f6944T & 1) != 0) {
            abstractC1388m.j0(x());
        }
        if ((this.f6944T & 2) != 0) {
            abstractC1388m.l0(B());
        }
        if ((this.f6944T & 4) != 0) {
            abstractC1388m.k0(A());
        }
        if ((this.f6944T & 8) != 0) {
            abstractC1388m.i0(w());
        }
        return this;
    }

    @Override // L2.AbstractC1388m
    public AbstractC1388m s(Class cls, boolean z10) {
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).s(cls, z10);
        }
        return super.s(cls, z10);
    }

    public final void s0(AbstractC1388m abstractC1388m) {
        this.f6940L.add(abstractC1388m);
        abstractC1388m.f6899r = this;
    }

    public AbstractC1388m t0(int i10) {
        if (i10 < 0 || i10 >= this.f6940L.size()) {
            return null;
        }
        return (AbstractC1388m) this.f6940L.get(i10);
    }

    public int u0() {
        return this.f6940L.size();
    }

    public final int v0(long j10) {
        for (int i10 = 1; i10 < this.f6940L.size(); i10++) {
            if (((AbstractC1388m) this.f6940L.get(i10)).f6881I > j10) {
                return i10 - 1;
            }
        }
        return this.f6940L.size() - 1;
    }

    @Override // L2.AbstractC1388m
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public y b0(AbstractC1388m.i iVar) {
        return (y) super.b0(iVar);
    }

    @Override // L2.AbstractC1388m
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public y c0(View view) {
        for (int i10 = 0; i10 < this.f6940L.size(); i10++) {
            ((AbstractC1388m) this.f6940L.get(i10)).c0(view);
        }
        return (y) super.c0(view);
    }

    public final void y0(AbstractC1388m[] abstractC1388mArr) {
        Arrays.fill(abstractC1388mArr, (Object) null);
        this.mTransitionsCache = abstractC1388mArr;
    }

    @Override // L2.AbstractC1388m
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public y h0(long j10) {
        ArrayList arrayList;
        super.h0(j10);
        if (this.f6884c >= 0 && (arrayList = this.f6940L) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1388m) this.f6940L.get(i10)).h0(j10);
            }
        }
        return this;
    }
}
