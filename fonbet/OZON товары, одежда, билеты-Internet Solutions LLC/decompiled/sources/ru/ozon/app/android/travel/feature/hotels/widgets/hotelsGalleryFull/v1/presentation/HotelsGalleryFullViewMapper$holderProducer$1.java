package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.di.HotelsGalleryFullComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullView;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFullViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsGalleryFullWidgetViewHolder> {
    final /* synthetic */ HotelsGalleryFullViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullViewMapper$holderProducer$1(HotelsGalleryFullViewMapper hotelsGalleryFullViewMapper) {
        super(2);
        this.this$0 = hotelsGalleryFullViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsGalleryFullWidgetViewHolder invoke(View view, ComposerReferences refs) {
        HotelsGalleryFullComponent hotelsGalleryFullComponent;
        HotelsGalleryFullComponent hotelsGalleryFullComponent2;
        HotelsGalleryFullComponent hotelsGalleryFullComponent3;
        HotelsGalleryFullComponent hotelsGalleryFullComponent4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        HotelsGalleryFullView hotelsGalleryFullView = (HotelsGalleryFullView) view;
        hotelsGalleryFullComponent = this.this$0.component;
        C c11 = new C(hotelsGalleryFullComponent) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullViewMapper$holderProducer$1.1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((HotelsGalleryFullComponent) this.receiver).getVideoPlayer();
            }
        };
        hotelsGalleryFullComponent2 = this.this$0.component;
        SoundController soundController = hotelsGalleryFullComponent2.getSoundService().getSoundController(SoundScope.COMMON);
        hotelsGalleryFullComponent3 = this.this$0.component;
        l tokenizedAnalytics = hotelsGalleryFullComponent3.getTokenizedAnalytics();
        hotelsGalleryFullComponent4 = this.this$0.component;
        return new HotelsGalleryFullWidgetViewHolder(hotelsGalleryFullView, soundController, c11, refs, hotelsGalleryFullComponent4.getCustomActionHandlersStoreFactory(), tokenizedAnalytics);
    }
}
