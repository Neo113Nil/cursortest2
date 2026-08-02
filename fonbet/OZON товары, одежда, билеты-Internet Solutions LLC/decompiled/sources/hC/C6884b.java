package hC;

import com.google.android.gms.tasks.OnFailureListener;
import io.reactivex.z;
import io.sentry.protocol.t;
import io.sentry.util.l;
import io.sentry.util.w;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;

/* renamed from: hC.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C6884b implements OnFailureListener, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f65198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65199b;

    public /* synthetic */ C6884b(Object obj, Object obj2) {
        this.f65198a = obj;
        this.f65199b = obj2;
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        String str = (String) this.f65199b;
        ((t) this.f65198a).getClass();
        int i11 = w.f68605c;
        if (str.equals("0000-0000")) {
            str = "00000000-0000-0000-0000-000000000000";
        }
        return str.replace("-", "");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GooglePayManagerImpl.isGooglePayReady$lambda$13$lambda$12$lambda$11((GooglePayManagerImpl) this.f65198a, (z) this.f65199b, exc);
    }
}
