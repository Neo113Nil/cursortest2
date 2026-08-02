package cz;

import kotlin.jvm.functions.Function2;
import m1.InterfaceC8038i;
import m1.q;
import qc.InterfaceC9021c;
import ru.ozon.app.android.marketing.common.timer.TimerWidgetTicker;

/* renamed from: cz.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C5979a implements InterfaceC9021c, InterfaceC8038i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f60767a;

    public /* synthetic */ C5979a(Object obj) {
        this.f60767a = obj;
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        Object createTimer$lambda$0;
        createTimer$lambda$0 = TimerWidgetTicker.createTimer$lambda$0((Function2) this.f60767a, obj, obj2);
        return createTimer$lambda$0;
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        q qVar = (q) this.f60767a;
        double a11 = qVar.a();
        double b11 = qVar.b();
        double c11 = qVar.c();
        return d11 >= qVar.d() * c11 ? (Math.pow(d11 - qVar.e(), 1.0d / qVar.g()) - b11) / a11 : (d11 - qVar.f()) / c11;
    }
}
