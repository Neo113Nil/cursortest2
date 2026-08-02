package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComparisonCarouselView$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ ComparisonCarouselView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCarouselView$actionHandler$2(ComparisonCarouselView comparisonCarouselView) {
        super(1);
        this.this$0 = comparisonCarouselView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ComponentCallbacksC5392m c11 = this.this$0.composerReferences.getContainer().c();
        if (c11 != null) {
            Intent intent = new Intent();
            Map<String, String> params = action.getParams();
            String valueOf = String.valueOf(params != null ? new JSONObject(params) : null);
            intent.putExtra("EXTRA_DELETE", action.getActionName());
            intent.putExtra("API_REQUEST_PARAMS", valueOf);
            Unit unit = Unit.f71690a;
            c11.onActivityResult(9020, -1, intent);
        }
    }
}
