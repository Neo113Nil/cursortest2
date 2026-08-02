package androidx.vectordrawable.graphics.drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public g0.f[] f2824a;

    /* renamed from: b, reason: collision with root package name */
    public String f2825b;

    /* renamed from: c, reason: collision with root package name */
    public int f2826c;

    public p() {
        this.f2824a = null;
        this.f2826c = 0;
    }

    public g0.f[] getPathData() {
        return this.f2824a;
    }

    public String getPathName() {
        return this.f2825b;
    }

    public void setPathData(g0.f[] fVarArr) {
        if (!y4.a.g(this.f2824a, fVarArr)) {
            this.f2824a = y4.a.r(fVarArr);
            return;
        }
        g0.f[] fVarArr2 = this.f2824a;
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            fVarArr2[i5].f9681a = fVarArr[i5].f9681a;
            int i10 = 0;
            while (true) {
                float[] fArr = fVarArr[i5].f9682b;
                if (i10 < fArr.length) {
                    fVarArr2[i5].f9682b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public p(p pVar) {
        this.f2824a = null;
        this.f2826c = 0;
        this.f2825b = pVar.f2825b;
        this.f2824a = y4.a.r(pVar.f2824a);
    }
}
