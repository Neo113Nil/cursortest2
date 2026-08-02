package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.app.android.universalwidgets.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollButtonSubtitleBinder$buttonSubtitle$2 extends AbstractC7737t implements Function0<TextAtomWithIconView> {
    final /* synthetic */ SkuScrollButtonSubtitleBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollButtonSubtitleBinder$buttonSubtitle$2(SkuScrollButtonSubtitleBinder skuScrollButtonSubtitleBinder) {
        super(0);
        this.this$0 = skuScrollButtonSubtitleBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomWithIconView invoke() {
        View findViewById;
        findViewById = this.this$0.findViewById(R$id.buttonSubtitle);
        return (TextAtomWithIconView) findViewById;
    }
}
