package ru.ozon.app.android.video.player.playerpreferences;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferencesImpl;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isBlockVideoPlaying", "()Z", "block", "", "changeBlockVideoPlaying", "(Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "LSc/j;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerPreferencesImpl implements PlayerPreferences {

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preferences;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferencesImpl$Companion;", "", "<init>", "()V", "PLAYER_PREFERENCES", "", "KEY_BLOCK_VIDEO_PLAYING", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlayerPreferencesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = k.b(new PlayerPreferencesImpl$preferences$2(context));
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) this.preferences.getValue();
    }

    @Override // ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences
    public void changeBlockVideoPlaying(boolean block) {
        getPreferences().edit().putBoolean("block_video_playing", block).apply();
    }

    @Override // ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences
    public boolean isBlockVideoPlaying() {
        return getPreferences().getBoolean("block_video_playing", false);
    }
}
