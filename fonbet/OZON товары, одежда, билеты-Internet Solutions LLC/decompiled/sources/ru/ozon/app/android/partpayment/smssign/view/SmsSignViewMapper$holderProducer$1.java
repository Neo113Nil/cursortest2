package ru.ozon.app.android.partpayment.smssign.view;

import Pc.a;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVH;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SmsSignViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SmsSignVH> {
    final /* synthetic */ SmsSignViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsSignViewMapper$holderProducer$1(SmsSignViewMapper smsSignViewMapper) {
        super(2);
        this.this$0 = smsSignViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SmsSignVH invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        B0 a11 = references.getViewModelOwnerProvider().a();
        final SmsSignViewMapper smsSignViewMapper = this.this$0;
        Object a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SmsSignViewMapper.this.pViewModel;
                SmsSignViewModelImpl smsSignViewModelImpl = (SmsSignViewModelImpl) aVar.get();
                Intrinsics.g(smsSignViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return smsSignViewModelImpl;
            }
        }).a(SmsSignViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new SmsSignVH(view, (SmsSignViewModel) a12, references);
    }
}
