package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di.TextBlockV2Component;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2ViewHolder;", "view", "Landroid/view/View;", "<unused var>", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TextBlockV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TextBlockV2ViewHolder> {
    final /* synthetic */ TextBlockV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextBlockV2ViewMapper$holderProducer$1(TextBlockV2ViewMapper textBlockV2ViewMapper) {
        super(2);
        this.this$0 = textBlockV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TextBlockV2ViewHolder invoke(View view, ComposerReferences composerReferences) {
        TextBlockV2Component textBlockV2Component;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        textBlockV2Component = this.this$0.component;
        return new TextBlockV2ViewHolder((TextAtomV2View) view, textBlockV2Component.getTokenizedAnalytics());
    }
}
