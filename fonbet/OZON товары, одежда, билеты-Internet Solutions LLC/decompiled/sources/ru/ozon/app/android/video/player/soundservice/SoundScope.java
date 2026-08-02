package ru.ozon.app.android.video.player.soundservice;

import Xc.a;
import Xc.b;
import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/SoundScope;", "", "<init>", "(Ljava/lang/String;I)V", CodePackage.COMMON, "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoundScope {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SoundScope[] $VALUES;
    public static final SoundScope COMMON = new SoundScope(CodePackage.COMMON, 0);

    private static final /* synthetic */ SoundScope[] $values() {
        return new SoundScope[]{COMMON};
    }

    static {
        SoundScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SoundScope(String str, int i11) {
    }

    public static SoundScope valueOf(String str) {
        return (SoundScope) Enum.valueOf(SoundScope.class, str);
    }

    public static SoundScope[] values() {
        return (SoundScope[]) $VALUES.clone();
    }
}
