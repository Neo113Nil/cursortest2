package ru.ozon.app.android.pdp.ui.configurators.ugc.question;

import Pc.a;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class QuestionsConfigurator$viewModel$2 extends AbstractC7737t implements Function0<CallApiViewModelImpl> {
    final /* synthetic */ QuestionsConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionsConfigurator$viewModel$2(QuestionsConfigurator questionsConfigurator) {
        super(0);
        this.this$0 = questionsConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CallApiViewModelImpl invoke() {
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) {
            return null;
        }
        final QuestionsConfigurator questionsConfigurator = this.this$0;
        return (CallApiViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsConfigurator$viewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = QuestionsConfigurator.this.pViewModel;
                CallApiViewModelImpl callApiViewModelImpl = (CallApiViewModelImpl) aVar.get();
                Intrinsics.g(callApiViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return callApiViewModelImpl;
            }
        }).a(CallApiViewModelImpl.class);
    }
}
