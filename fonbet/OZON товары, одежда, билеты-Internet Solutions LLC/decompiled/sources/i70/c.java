package i70;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65965b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f65964a = i11;
        this.f65965b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65964a) {
            case 0:
                return OfflinePayFragment.v((OfflinePayFragment) this.f65965b, (View) obj);
            default:
                return z90.e.q0((z90.e) this.f65965b);
        }
    }
}
