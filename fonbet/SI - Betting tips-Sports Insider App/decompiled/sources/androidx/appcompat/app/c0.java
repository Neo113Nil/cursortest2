package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210b;

    public /* synthetic */ c0(int i5, Object obj) {
        this.f209a = i5;
        this.f210b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f209a) {
            case 0:
                ((l0) this.f210b).B();
                break;
            case 1:
                ((Runnable) this.f210b).run();
                break;
            case 2:
                ((MaterialBackHandler) this.f210b).handleBackInvoked();
                break;
            default:
                ((d2.l) this.f210b).a();
                break;
        }
    }
}
