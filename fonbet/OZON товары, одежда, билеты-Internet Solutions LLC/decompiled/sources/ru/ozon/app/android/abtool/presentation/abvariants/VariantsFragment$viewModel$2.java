package ru.ozon.app.android.abtool.presentation.abvariants;

import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel;
import ru.ozon.app.android.abtool.utils.NamespaceUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/z0$b;", "invoke", "()Landroidx/lifecycle/z0$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class VariantsFragment$viewModel$2 extends AbstractC7737t implements Function0<z0.b> {
    final /* synthetic */ VariantsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantsFragment$viewModel$2(VariantsFragment variantsFragment) {
        super(0);
        this.this$0 = variantsFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final z0.b invoke() {
        return new VariantsViewModel.Factory(NamespaceUtilsKt.getNamespace(this.this$0.getArguments()));
    }
}
