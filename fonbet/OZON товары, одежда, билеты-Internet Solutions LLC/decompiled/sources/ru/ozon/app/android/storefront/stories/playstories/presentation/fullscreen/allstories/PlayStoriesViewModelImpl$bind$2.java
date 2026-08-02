package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import P00.k;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\u0015\u0010\u0004\u001a\u0011\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LP00/k;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "invoke", "(LP00/k;)Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class PlayStoriesViewModelImpl$bind$2 extends AbstractC7737t implements Function1<k<l>, PlayStoriesVO> {
    final /* synthetic */ PlayStoriesViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayStoriesViewModelImpl$bind$2(PlayStoriesViewModelImpl playStoriesViewModelImpl) {
        super(1);
        this.this$0 = playStoriesViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PlayStoriesVO invoke(k<l> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.setupAnalytics(it);
        c d11 = ((l) C7714v.K(it.d())).d();
        if (d11 instanceof PlayStoriesVO) {
            return (PlayStoriesVO) d11;
        }
        return null;
    }
}
