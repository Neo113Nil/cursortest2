package er;

import m3.C8062d;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder;
import t3.z;

/* renamed from: er.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC6383a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62397c;

    public /* synthetic */ RunnableC6383a(int i11, Object obj, Object obj2) {
        this.f62395a = i11;
        this.f62396b = obj;
        this.f62397c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62395a) {
            case 0:
                ServiceCarouselViewHolder.bind$lambda$0((ServiceCarouselVO) this.f62396b, (ServiceCarouselViewHolder) this.f62397c);
                break;
            default:
                C8062d.a((C8062d) this.f62396b, (z) this.f62397c);
                break;
        }
    }
}
