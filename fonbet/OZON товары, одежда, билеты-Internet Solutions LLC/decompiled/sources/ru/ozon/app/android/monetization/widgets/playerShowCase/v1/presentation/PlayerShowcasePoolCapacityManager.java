package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/PlayerShowcasePoolCapacityManager;", "", "<init>", "()V", "", "onPlayerGet", "onPlayerStopped", "LAe/x0;", "", "_remainPoolPlayers", "LAe/x0;", "LAe/M0;", "remainPoolPlayers", "LAe/M0;", "getRemainPoolPlayers", "()LAe/M0;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcasePoolCapacityManager {

    @NotNull
    private final x0<Integer> _remainPoolPlayers;

    @NotNull
    private final M0<Integer> remainPoolPlayers;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/PlayerShowcasePoolCapacityManager$Companion;", "", "<init>", "()V", "MAX_POOL_SIZE", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlayerShowcasePoolCapacityManager() {
        x0<Integer> a11 = O0.a(3);
        this._remainPoolPlayers = a11;
        this.remainPoolPlayers = C2399j.b(a11);
    }

    @NotNull
    public final M0<Integer> getRemainPoolPlayers() {
        return this.remainPoolPlayers;
    }

    public final void onPlayerGet() {
        x0<Integer> x0Var = this._remainPoolPlayers;
        do {
        } while (!x0Var.b(x0Var.getValue(), Integer.valueOf(r1.intValue() - 1)));
    }

    public final void onPlayerStopped() {
        Integer value;
        x0<Integer> x0Var = this._remainPoolPlayers;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, Integer.valueOf(value.intValue() + 1)));
    }
}
