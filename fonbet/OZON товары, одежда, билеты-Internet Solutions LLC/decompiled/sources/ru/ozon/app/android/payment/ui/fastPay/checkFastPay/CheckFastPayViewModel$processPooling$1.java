package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayViewModel", f = "CheckFastPayViewModel.kt", l = {70, 72, ModuleDescriptor.MODULE_VERSION}, m = "processPooling")
/* loaded from: classes13.dex */
final class CheckFastPayViewModel$processPooling$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckFastPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFastPayViewModel$processPooling$1(CheckFastPayViewModel checkFastPayViewModel, d<? super CheckFastPayViewModel$processPooling$1> dVar) {
        super(dVar);
        this.this$0 = checkFastPayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object processPooling;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        processPooling = this.this$0.processPooling(null, this);
        return processPooling;
    }
}
