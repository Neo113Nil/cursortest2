package ru.ozon.app.android.storefront.stories.story.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/PlaybackType;", "", "<init>", "(Ljava/lang/String;I)V", "PLAY", "PAUSE", "REPLAY", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaybackType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlaybackType[] $VALUES;
    public static final PlaybackType PLAY = new PlaybackType("PLAY", 0);
    public static final PlaybackType PAUSE = new PlaybackType("PAUSE", 1);
    public static final PlaybackType REPLAY = new PlaybackType("REPLAY", 2);

    private static final /* synthetic */ PlaybackType[] $values() {
        return new PlaybackType[]{PLAY, PAUSE, REPLAY};
    }

    static {
        PlaybackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PlaybackType(String str, int i11) {
    }

    public static PlaybackType valueOf(String str) {
        return (PlaybackType) Enum.valueOf(PlaybackType.class, str);
    }

    public static PlaybackType[] values() {
        return (PlaybackType[]) $VALUES.clone();
    }
}
