package p0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21400a;

    /* renamed from: b, reason: collision with root package name */
    public int f21401b;

    public d(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21400a = new Object[i5];
    }

    @Override // p0.c
    public boolean a(Object instance) {
        Object[] objArr;
        boolean z5;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i5 = this.f21401b;
        int i10 = 0;
        while (true) {
            objArr = this.f21400a;
            if (i10 >= i5) {
                z5 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z5 = true;
                break;
            }
            i10++;
        }
        if (z5) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f21401b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f21401b = i11 + 1;
        return true;
    }

    @Override // p0.c
    public Object b() {
        int i5 = this.f21401b;
        if (i5 <= 0) {
            return null;
        }
        int i10 = i5 - 1;
        Object[] objArr = this.f21400a;
        Object obj = objArr[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f21401b--;
        return obj;
    }

    public void c(v.b bVar) {
        int i5 = this.f21401b;
        Object[] objArr = this.f21400a;
        if (i5 < objArr.length) {
            objArr[i5] = bVar;
            this.f21401b = i5 + 1;
        }
    }

    public d() {
        this.f21400a = new Object[256];
    }
}
