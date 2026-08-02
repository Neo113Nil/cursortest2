package ru.ozon.app.android.pdp.widgets.badgeList.presentation.flex;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/badgeList/presentation/flex/BadgeListBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BadgeListWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2 extends AbstractC7737t implements Function0<BadgeListBinder> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ BadgeListWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(BadgeListWidgetPlaceholderViewHolder badgeListWidgetPlaceholderViewHolder, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, ComposerReferences composerReferences) {
        super(0);
        this.this$0 = badgeListWidgetPlaceholderViewHolder;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeListBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.this$0.mainView;
        return new BadgeListBinder(this.this$0, this.$widgetImagePlaceholderAdapter, this.$refs, (HorizontalFlexAtomsLayout) interfaceC4008j.getValue());
    }
}
