package ru.ozon.app.android.abtool.presentation.debug;

import android.os.Bundle;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.presentation.debug.AbDebugViewModel;
import ru.ozon.app.android.abtool.utils.NamespaceUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/z0$b;", "invoke", "()Landroidx/lifecycle/z0$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AbDebugFragment$viewModel$2 extends AbstractC7737t implements Function0<z0.b> {
    final /* synthetic */ AbDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbDebugFragment$viewModel$2(AbDebugFragment abDebugFragment) {
        super(0);
        this.this$0 = abDebugFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final z0.b invoke() {
        AbToolNamespace namespace = NamespaceUtilsKt.getNamespace(this.this$0.getArguments());
        Bundle arguments = this.this$0.getArguments();
        ActionType actionType = (ActionType) ActionType.getEntries().get(arguments != null ? arguments.getInt("extra_action_type", AbDebugFragment.INSTANCE.getDEFAULT_ACTION_TYPE$abzone_release().ordinal()) : AbDebugFragment.INSTANCE.getDEFAULT_ACTION_TYPE$abzone_release().ordinal());
        Bundle arguments2 = this.this$0.getArguments();
        String string = arguments2 != null ? arguments2.getString("extra_variants", "") : null;
        return new AbDebugViewModel.Factory(actionType, string != null ? string : "", namespace);
    }
}
