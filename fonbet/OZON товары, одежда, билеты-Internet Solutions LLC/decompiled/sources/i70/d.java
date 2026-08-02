package i70;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65967b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f65966a = i11;
        this.f65967b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65966a) {
            case 0:
                return OfflinePayFragment.x((OfflinePayFragment) this.f65967b, (View) obj);
            default:
                return z90.e.r0((z90.e) this.f65967b);
        }
    }
}
