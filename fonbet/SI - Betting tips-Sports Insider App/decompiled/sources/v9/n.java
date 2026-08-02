package v9;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final j f24525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24527c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f24528d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(j jVar, int i5) {
        this(jVar, i5, (byte) 0);
        this.f24527c = 0;
    }

    public final List a() {
        switch (this.f24527c) {
            case 0:
                return new ArrayList();
            default:
                return this.f24528d;
        }
    }

    public n(j jVar, int i5, byte b10) {
        this.f24525a = jVar;
        this.f24526b = i5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(j jVar, int i5, ArrayList arrayList) {
        this(jVar, i5, (byte) 0);
        this.f24527c = 1;
        this.f24528d = arrayList;
    }
}
