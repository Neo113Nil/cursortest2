package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouterImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PlayStoriesActivity$storiesRouter$2 extends AbstractC7737t implements Function0<StoriesRouterImpl> {
    final /* synthetic */ PlayStoriesActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayStoriesActivity$storiesRouter$2(PlayStoriesActivity playStoriesActivity) {
        super(0);
        this.this$0 = playStoriesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StoriesRouterImpl invoke() {
        PlayStoriesActivity playStoriesActivity = this.this$0;
        return new StoriesRouterImpl(playStoriesActivity, playStoriesActivity.getOzonRouter());
    }
}
