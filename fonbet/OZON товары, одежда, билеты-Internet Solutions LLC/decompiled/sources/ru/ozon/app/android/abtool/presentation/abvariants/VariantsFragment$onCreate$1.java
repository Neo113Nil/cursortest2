package ru.ozon.app.android.abtool.presentation.abvariants;

import androidx.activity.C;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/C;", "", "invoke", "(Landroidx/activity/C;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class VariantsFragment$onCreate$1 extends AbstractC7737t implements Function1<C, Unit> {
    final /* synthetic */ VariantsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantsFragment$onCreate$1(VariantsFragment variantsFragment) {
        super(1);
        this.this$0 = variantsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C c11) {
        invoke2(c11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C addCallback) {
        G supportFragmentManager;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        r activity = this.this$0.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.P0();
    }
}
