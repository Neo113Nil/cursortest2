package ru.ozon.app.android.pdp.widgets.brand.presentation.simple;

import Sc.InterfaceC4008j;
import WZ.l;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SimpleBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2 extends AbstractC7737t implements Function0<SimpleBrandBinder> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ SimpleBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(SimpleBrandWidgetPlaceholderViewHolder simpleBrandWidgetPlaceholderViewHolder, ComposerReferences composerReferences, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, l lVar) {
        super(0);
        this.this$0 = simpleBrandWidgetPlaceholderViewHolder;
        this.$refs = composerReferences;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleBrandBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.this$0.mainView;
        return new SimpleBrandBinder((FrameLayout) interfaceC4008j.getValue(), this.$refs, this.this$0, this.$widgetImagePlaceholderAdapter, this.$tokenizedAnalytics);
    }
}
