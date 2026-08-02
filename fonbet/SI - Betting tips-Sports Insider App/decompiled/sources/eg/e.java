package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9166b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final f0[] f9167a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(f0[] f0VarArr) {
        this.f9167a = f0VarArr;
        this.notCompletedCount$volatile = f0VarArr.length;
    }
}
