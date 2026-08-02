package e6;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8766b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8768d;

    public y(b6.p pVar, j jVar, int i5) {
        this.f8768d = pVar;
        this.f8767c = jVar;
        this.f8765a = true;
        this.f8766b = i5;
    }

    public static m a() {
        m mVar = new m();
        mVar.f8723b = false;
        mVar.f8724c = false;
        mVar.f8726e = 0;
        return mVar;
    }

    public y(m mVar, Feature[] featureArr, boolean z5, int i5) {
        this.f8768d = mVar;
        this.f8767c = featureArr;
        boolean z7 = false;
        if (featureArr != null && z5) {
            z7 = true;
        }
        this.f8765a = z7;
        this.f8766b = i5;
    }
}
