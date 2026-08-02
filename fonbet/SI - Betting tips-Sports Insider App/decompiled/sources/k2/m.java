package k2;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f18715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f18716c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f18717d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f18719f;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f18714a = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f18718e = new ReentrantLock();

    public m(int i5) {
        this.f18715b = new long[i5];
        this.f18716c = new boolean[i5];
    }
}
