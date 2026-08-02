package ru.ozon.app.android.marketing.widgets.blackFridayStatus.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle.BlackFridayStatusTextTitleViewHolder;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/BlackFridayStatusTextTitleViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BlackFridayStatusTextTitleViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, BlackFridayStatusTextTitleViewHolder> {
    final /* synthetic */ BlackFridayStatusTextTitleViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackFridayStatusTextTitleViewMapper$holderProducer$1(BlackFridayStatusTextTitleViewMapper blackFridayStatusTextTitleViewMapper) {
        super(2);
        this.this$0 = blackFridayStatusTextTitleViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BlackFridayStatusTextTitleViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        SwitchingButtonDelegate switchingButtonDelegate = this.this$0.component().getSwitchingButtonDelegateProvider().get();
        Intrinsics.checkNotNullExpressionValue(switchingButtonDelegate, "get(...)");
        return new BlackFridayStatusTextTitleViewHolder(view, refs, switchingButtonDelegate, this.this$0.component().getStartupArgsService());
    }
}
