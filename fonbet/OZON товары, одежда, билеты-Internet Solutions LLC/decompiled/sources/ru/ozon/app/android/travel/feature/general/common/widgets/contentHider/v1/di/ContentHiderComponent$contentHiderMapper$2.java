package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.data.ContentHiderMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/data/ContentHiderMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ContentHiderComponent$contentHiderMapper$2 extends AbstractC7737t implements Function0<ContentHiderMapper> {
    final /* synthetic */ ContentHiderComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentHiderComponent$contentHiderMapper$2(ContentHiderComponent contentHiderComponent) {
        super(0);
        this.this$0 = contentHiderComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ContentHiderMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new ContentHiderMapper(contextComponentDependencies.getContext());
    }
}
