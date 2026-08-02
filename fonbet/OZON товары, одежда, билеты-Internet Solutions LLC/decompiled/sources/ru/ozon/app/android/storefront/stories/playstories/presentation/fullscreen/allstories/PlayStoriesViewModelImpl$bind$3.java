package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "vo", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PlayStoriesViewModelImpl$bind$3 extends AbstractC7737t implements Function1<PlayStoriesVO, Unit> {
    final /* synthetic */ PlayStoriesViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayStoriesViewModelImpl$bind$3(PlayStoriesViewModelImpl playStoriesViewModelImpl) {
        super(1);
        this.this$0 = playStoriesViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PlayStoriesVO playStoriesVO) {
        invoke2(playStoriesVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PlayStoriesVO playStoriesVO) {
        if (playStoriesVO != null) {
            PlayStoriesViewModelImpl playStoriesViewModelImpl = this.this$0;
            Iterator<StoryCommonMolecule> it = playStoriesVO.getStories().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                int storyId = it.next().getStoryId();
                Integer pointer = playStoriesVO.getPointer();
                if (pointer != null && storyId == pointer.intValue()) {
                    break;
                } else {
                    i11++;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            playStoriesViewModelImpl.showStories(playStoriesVO, valueOf != null ? valueOf.intValue() : 0);
        }
    }
}
