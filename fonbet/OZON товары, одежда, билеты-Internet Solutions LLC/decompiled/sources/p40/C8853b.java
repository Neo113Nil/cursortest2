package p40;

import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* renamed from: p40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8853b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f80147b;

    public /* synthetic */ C8853b(Object obj, int i11) {
        this.f80146a = i11;
        this.f80147b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80146a) {
            case 0:
                return e.d((e) this.f80147b, (ActionResult2) obj);
            default:
                return FintechWebViewFragmentBase.u((FintechWebViewFragmentBase) this.f80147b, (String) obj);
        }
    }
}
