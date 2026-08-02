package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import U20.a;
import U20.b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/PlayerGroupProvider;", "Lr20/c;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "<init>", "(Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;)V", "LU20/a;", "provide", "()LU20/a;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlayerGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final PlayerPreferences videoPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/PlayerGroupProvider$Companion;", "", "<init>", "()V", "PLAYER", "", "GROUP", "TOGGLE", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlayerGroupProvider(@NotNull PlayerPreferences videoPreferences) {
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        this.videoPreferences = videoPreferences;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        return new a("playerGroup", "Player", C7714v.a0(new b.i("playerToggle", "Блокировка воспроизведения", this.videoPreferences.isBlockVideoPlaying(), new PlayerGroupProvider$provide$1(this), null, 48)));
    }
}
