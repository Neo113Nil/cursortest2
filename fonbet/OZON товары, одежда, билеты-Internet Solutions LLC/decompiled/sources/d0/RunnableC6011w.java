package d0;

import io.sentry.W2;
import io.sentry.android.core.C7109j;
import java.util.ArrayList;

/* renamed from: d0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC6011w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f60941d;

    public /* synthetic */ RunnableC6011w(Object obj, Object obj2, Object obj3, int i11) {
        this.f60938a = i11;
        this.f60939b = obj;
        this.f60940c = obj2;
        this.f60941d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60938a) {
            case 0:
                J.j((J) this.f60939b, (ArrayList) this.f60940c, (Runnable) this.f60941d);
                break;
            default:
                C7109j.g((C7109j) this.f60939b, (W2) this.f60940c, (io.sentry.W) this.f60941d);
                break;
        }
    }
}
