package D4;

import com.bumptech.glide.load.engine.v;

/* loaded from: classes2.dex */
public abstract class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2542a;

    public k(Object obj) {
        this.f2542a = com.bumptech.glide.util.k.d(obj);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return this.f2542a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    public final Object get() {
        return this.f2542a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
