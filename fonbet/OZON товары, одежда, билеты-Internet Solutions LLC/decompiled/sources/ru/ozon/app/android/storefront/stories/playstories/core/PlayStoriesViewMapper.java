package ru.ozon.app.android.storefront.stories.playstories.core;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesDTO;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/core/PlayStoriesViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesDTO;", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesDTO;Ljava/lang/String;)Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayStoriesViewMapper extends SingleNoUiViewMapper<PlayStoriesDTO, PlayStoriesVO> {

    @NotNull
    private final Function2<PlayStoriesDTO, d, List<PlayStoriesVO>> mapper = new PlayStoriesViewMapper$mapper$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayStoriesVO toVO(PlayStoriesDTO playStoriesDTO, String str) {
        return new PlayStoriesVO(a.a("PlayStoriesV2.", str), playStoriesDTO.getSpan(), playStoriesDTO.getPointer(), playStoriesDTO.getStories());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<PlayStoriesDTO, d, List<PlayStoriesVO>> getMapper() {
        return this.mapper;
    }
}
