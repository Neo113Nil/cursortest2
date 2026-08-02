package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core;

import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.HammersV3BodyViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerBinderFrameWrapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerBinderFrameWrapperKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerMultiFrameBinderDelegate;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductBadgeBinder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3BodyViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HammersV3BodyViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HammersV3BodyViewHolder> {
    final /* synthetic */ HammersV3BodyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HammersV3BodyViewMapper$holderProducer$1(HammersV3BodyViewMapper hammersV3BodyViewMapper) {
        super(2);
        this.this$0 = hammersV3BodyViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HammersV3BodyViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        HammerBinderFrameWrapper[] elements = {HammerBinderFrameWrapperKt.asFrameWrapper$default(this.this$0.component().getImageBinder(), 0, 1, null), HammerBinderFrameWrapperKt.asFrameWrapper(new HammerProductBadgeBinder(), 1), HammerBinderFrameWrapperKt.asFrameWrapper(this.this$0.component().getInfoBlockBinder(), 2)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        return new HammersV3BodyViewHolder(view, ref, j02, new HammerMultiFrameBinderDelegate(j02, this.this$0.component().getFrameBinder()));
    }
}
