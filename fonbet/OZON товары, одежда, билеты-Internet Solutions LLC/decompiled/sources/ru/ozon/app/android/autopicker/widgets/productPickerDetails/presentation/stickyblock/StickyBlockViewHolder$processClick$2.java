package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.stickyblock;

import android.content.Intent;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class StickyBlockViewHolder$processClick$2 extends AbstractC7737t implements Function1<Intent, Unit> {
    final /* synthetic */ AtomAction $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyBlockViewHolder$processClick$2(AtomAction atomAction) {
        super(1);
        this.$action = atomAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent setResult) {
        Intrinsics.checkNotNullParameter(setResult, "$this$setResult");
        setResult.putExtra(ImagesContract.URL, ((AtomAction.Click) this.$action).getLink());
    }
}
