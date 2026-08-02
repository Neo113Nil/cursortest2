package m1;

import androidx.media3.exoplayer.source.AbstractC2221w;
import b1.AbstractC2346O;
import b1.C2348b;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j1 extends AbstractC5492a {
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;

    /* renamed from: h, reason: collision with root package name */
    public final int f56257h;

    /* renamed from: i, reason: collision with root package name */
    public final int f56258i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f56259j;
    private final AbstractC2346O[] timelines;
    private final Object[] uids;

    public class a extends AbstractC2221w {

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC2346O.c f56260f;

        public a(AbstractC2346O abstractC2346O) {
            super(abstractC2346O);
            this.f56260f = new AbstractC2346O.c();
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            AbstractC2346O.b g10 = super.g(i10, bVar, z10);
            if (super.n(g10.f24356c, this.f56260f).f()) {
                g10.u(bVar.f24354a, bVar.f24355b, bVar.f24356c, bVar.f24357d, bVar.f24358e, C2348b.f24539f, true);
                return g10;
            }
            g10.f24359f = true;
            return g10;
        }
    }

    public j1(Collection collection, androidx.media3.exoplayer.source.e0 e0Var) {
        this(G(collection), H(collection), e0Var);
    }

    public static AbstractC2346O[] G(Collection collection) {
        AbstractC2346O[] abstractC2346OArr = new AbstractC2346O[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            abstractC2346OArr[i10] = ((T0) it.next()).b();
            i10++;
        }
        return abstractC2346OArr;
    }

    public static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((T0) it.next()).a();
            i10++;
        }
        return objArr;
    }

    @Override // m1.AbstractC5492a
    public int A(int i10) {
        return this.firstWindowInChildIndices[i10];
    }

    @Override // m1.AbstractC5492a
    public AbstractC2346O D(int i10) {
        return this.timelines[i10];
    }

    public j1 E(androidx.media3.exoplayer.source.e0 e0Var) {
        AbstractC2346O[] abstractC2346OArr = new AbstractC2346O[this.timelines.length];
        int i10 = 0;
        while (true) {
            AbstractC2346O[] abstractC2346OArr2 = this.timelines;
            if (i10 >= abstractC2346OArr2.length) {
                return new j1(abstractC2346OArr, this.uids, e0Var);
            }
            abstractC2346OArr[i10] = new a(abstractC2346OArr2[i10]);
            i10++;
        }
    }

    public List F() {
        return Arrays.asList(this.timelines);
    }

    @Override // b1.AbstractC2346O
    public int i() {
        return this.f56258i;
    }

    @Override // b1.AbstractC2346O
    public int p() {
        return this.f56257h;
    }

    @Override // m1.AbstractC5492a
    public int s(Object obj) {
        Integer num = (Integer) this.f56259j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // m1.AbstractC5492a
    public int t(int i10) {
        return e1.Z.g(this.firstPeriodInChildIndices, i10 + 1, false, false);
    }

    @Override // m1.AbstractC5492a
    public int u(int i10) {
        return e1.Z.g(this.firstWindowInChildIndices, i10 + 1, false, false);
    }

    @Override // m1.AbstractC5492a
    public Object x(int i10) {
        return this.uids[i10];
    }

    @Override // m1.AbstractC5492a
    public int z(int i10) {
        return this.firstPeriodInChildIndices[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(AbstractC2346O[] abstractC2346OArr, Object[] objArr, androidx.media3.exoplayer.source.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int length = abstractC2346OArr.length;
        this.timelines = abstractC2346OArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.f56259j = new HashMap();
        int length2 = abstractC2346OArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            AbstractC2346O abstractC2346O = abstractC2346OArr[i10];
            this.timelines[i13] = abstractC2346O;
            this.firstWindowInChildIndices[i13] = i11;
            this.firstPeriodInChildIndices[i13] = i12;
            i11 += abstractC2346O.p();
            i12 += this.timelines[i13].i();
            this.f56259j.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f56257h = i11;
        this.f56258i = i12;
    }
}
