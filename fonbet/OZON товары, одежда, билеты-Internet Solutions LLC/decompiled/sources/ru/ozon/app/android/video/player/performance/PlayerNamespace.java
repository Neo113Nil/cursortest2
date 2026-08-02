package ru.ozon.app.android.video.player.performance;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "", "<init>", "(Ljava/lang/String;I)V", "GALLERY", "REVIEW", "TILE", "ADV", "OTHER", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerNamespace {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayerNamespace[] $VALUES;
    public static final PlayerNamespace GALLERY = new PlayerNamespace("GALLERY", 0);
    public static final PlayerNamespace REVIEW = new PlayerNamespace("REVIEW", 1);
    public static final PlayerNamespace TILE = new PlayerNamespace("TILE", 2);
    public static final PlayerNamespace ADV = new PlayerNamespace("ADV", 3);
    public static final PlayerNamespace OTHER = new PlayerNamespace("OTHER", 4);

    private static final /* synthetic */ PlayerNamespace[] $values() {
        return new PlayerNamespace[]{GALLERY, REVIEW, TILE, ADV, OTHER};
    }

    static {
        PlayerNamespace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PlayerNamespace(String str, int i11) {
    }

    public static PlayerNamespace valueOf(String str) {
        return (PlayerNamespace) Enum.valueOf(PlayerNamespace.class, str);
    }

    public static PlayerNamespace[] values() {
        return (PlayerNamespace[]) $VALUES.clone();
    }
}
