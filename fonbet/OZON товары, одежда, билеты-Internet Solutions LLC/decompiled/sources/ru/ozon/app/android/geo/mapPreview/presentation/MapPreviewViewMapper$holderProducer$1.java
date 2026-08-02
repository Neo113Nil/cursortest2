package ru.ozon.app.android.geo.mapPreview.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.databinding.WidgetMapPreviewBinding;
import ru.ozon.app.android.geo.mapPreview.di.MapPreviewComponent;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVH;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MapPreviewViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, MapPreviewVH> {
    final /* synthetic */ MapPreviewViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapPreviewViewMapper$holderProducer$1(MapPreviewViewMapper mapPreviewViewMapper) {
        super(2);
        this.this$0 = mapPreviewViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MapPreviewVH invoke(View view, ComposerReferences composerReferences) {
        MapPreviewComponent mapPreviewComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        mapPreviewComponent = this.this$0.component;
        MapCommonProvider ozonMapProvider = mapPreviewComponent.getOzonMapProvider();
        WidgetMapPreviewBinding bind = WidgetMapPreviewBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new MapPreviewVH(composerReferences, bind, ozonMapProvider);
    }
}
