package d80;

import android.app.Activity$ScreenCaptureCallback;
import android.os.Build;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity;
import x30.j;

/* renamed from: d80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6101b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61279b;

    public /* synthetic */ C6101b(Object obj, int i11) {
        this.f61278a = i11;
        this.f61279b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VKIDTokenExchanger vKIDTokenExchanger;
        Object obj = this.f61279b;
        switch (this.f61278a) {
            case 0:
                return ((C6102c) obj).getFactory();
            case 1:
                return Boolean.valueOf(l40.h.c((l40.h) obj));
            case 2:
                int i11 = FinanceActivity.f96328u0;
                return ((FinanceActivity) obj).J();
            case 3:
                vKIDTokenExchanger = VKIDDepsProd.tokenExchanger$lambda$17((VKIDDepsProd) obj);
                return vKIDTokenExchanger;
            default:
                if (Build.VERSION.SDK_INT <= 33) {
                    return null;
                }
                final j jVar = (j) obj;
                return new Activity$ScreenCaptureCallback() { // from class: x30.g
                    public final void onScreenCaptured() {
                        j.a(j.this);
                    }
                };
        }
    }
}
