package j$.util.concurrent;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public j[] f17664a;

    /* renamed from: b, reason: collision with root package name */
    public j f17665b = null;

    /* renamed from: c, reason: collision with root package name */
    public m f17666c;

    /* renamed from: d, reason: collision with root package name */
    public m f17667d;

    /* renamed from: e, reason: collision with root package name */
    public int f17668e;

    /* renamed from: f, reason: collision with root package name */
    public int f17669f;

    /* renamed from: g, reason: collision with root package name */
    public int f17670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17671h;

    public n(j[] jVarArr, int i5, int i10, int i11) {
        this.f17664a = jVarArr;
        this.f17671h = i5;
        this.f17668e = i10;
        this.f17669f = i10;
        this.f17670g = i11;
    }

    public final j a() {
        j[] jVarArr;
        int length;
        int i5;
        m mVar;
        j jVar = this.f17665b;
        if (jVar != null) {
            jVar = jVar.f17659d;
        }
        while (jVar == null) {
            if (this.f17669f >= this.f17670g || (jVarArr = this.f17664a) == null || (length = jVarArr.length) <= (i5 = this.f17668e) || i5 < 0) {
                this.f17665b = null;
                return null;
            }
            j k6 = ConcurrentHashMap.k(jVarArr, i5);
            if (k6 == null || k6.f17656a >= 0) {
                jVar = k6;
            } else if (k6 instanceof f) {
                this.f17664a = ((f) k6).f17650e;
                m mVar2 = this.f17667d;
                if (mVar2 == null) {
                    mVar2 = new m();
                } else {
                    this.f17667d = mVar2.f17663d;
                }
                mVar2.f17662c = jVarArr;
                mVar2.f17660a = length;
                mVar2.f17661b = i5;
                mVar2.f17663d = this.f17666c;
                this.f17666c = mVar2;
                jVar = null;
            } else {
                jVar = k6 instanceof o ? ((o) k6).f17675f : null;
            }
            if (this.f17666c != null) {
                while (true) {
                    mVar = this.f17666c;
                    if (mVar == null) {
                        break;
                    }
                    int i10 = this.f17668e;
                    int i11 = mVar.f17660a;
                    int i12 = i10 + i11;
                    this.f17668e = i12;
                    if (i12 < length) {
                        break;
                    }
                    this.f17668e = mVar.f17661b;
                    this.f17664a = mVar.f17662c;
                    mVar.f17662c = null;
                    m mVar3 = mVar.f17663d;
                    mVar.f17663d = this.f17667d;
                    this.f17666c = mVar3;
                    this.f17667d = mVar;
                    length = i11;
                }
                if (mVar == null) {
                    int i13 = this.f17668e + this.f17671h;
                    this.f17668e = i13;
                    if (i13 >= length) {
                        int i14 = this.f17669f + 1;
                        this.f17669f = i14;
                        this.f17668e = i14;
                    }
                }
            } else {
                int i15 = i5 + this.f17671h;
                this.f17668e = i15;
                if (i15 >= length) {
                    int i16 = this.f17669f + 1;
                    this.f17669f = i16;
                    this.f17668e = i16;
                }
            }
        }
        this.f17665b = jVar;
        return jVar;
    }
}
