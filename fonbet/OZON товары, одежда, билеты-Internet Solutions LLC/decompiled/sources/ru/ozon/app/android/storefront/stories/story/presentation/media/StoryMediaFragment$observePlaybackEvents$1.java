package ru.ozon.app.android.storefront.stories.story.presentation.media;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.stories.story.presentation.PlaybackType;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "playbackType", "Lru/ozon/app/android/storefront/stories/story/presentation/PlaybackType;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/stories/story/presentation/PlaybackType;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryMediaFragment$observePlaybackEvents$1 extends AbstractC7737t implements Function1<PlaybackType, Unit> {
    final /* synthetic */ StoryMediaFragment this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaybackType.values().length];
            try {
                iArr[PlaybackType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackType.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryMediaFragment$observePlaybackEvents$1(StoryMediaFragment storyMediaFragment) {
        super(1);
        this.this$0 = storyMediaFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PlaybackType playbackType) {
        invoke2(playbackType);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PlaybackType playbackType) {
        if (playbackType != null) {
            StoryMediaFragment storyMediaFragment = this.this$0;
            int i11 = WhenMappings.$EnumSwitchMapping$0[playbackType.ordinal()];
            if (i11 == 1) {
                storyMediaFragment.startPlayback();
            } else if (i11 == 2) {
                storyMediaFragment.pausePlayback();
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                storyMediaFragment.restartPlayback();
            }
        }
    }
}
