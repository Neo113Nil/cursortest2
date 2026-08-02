package hC;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f65200a;

    public /* synthetic */ c(Function1 function1) {
        this.f65200a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f65200a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C checkIsGooglePayReady$lambda$2;
        checkIsGooglePayReady$lambda$2 = GooglePayManagerImpl.checkIsGooglePayReady$lambda$2(this.f65200a, obj);
        return checkIsGooglePayReady$lambda$2;
    }
}
