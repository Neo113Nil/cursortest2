package l5;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19374a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.a f19375b;

    public /* synthetic */ e(ff.a aVar, int i5) {
        this.f19374a = i5;
        this.f19375b = aVar;
    }

    @Override // ff.a
    public final Object get() {
        switch (this.f19374a) {
            case 0:
                String packageName = ((Context) this.f19375b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new k((Context) this.f19375b.get(), "com.google.android.datatransport.events", Integer.valueOf(k.f19387d).intValue());
        }
    }
}
