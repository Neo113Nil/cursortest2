package hh;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10824b;

    public /* synthetic */ f(String str, boolean z5) {
        this.f10823a = str;
        this.f10824b = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f10823a);
        thread.setDaemon(this.f10824b);
        return thread;
    }
}
