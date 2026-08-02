package ru.ozon.app.android.network.websockets;

import Xc.b;
import android.app.Application;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/websockets/AppVisibility;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/reactivex/p;", "Lru/ozon/app/android/network/websockets/AppVisibility$State;", "observe", "()Lio/reactivex/p;", "State", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppVisibility extends Application.ActivityLifecycleCallbacks {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/network/websockets/AppVisibility$State;", "", "<init>", "(Ljava/lang/String;I)V", "APP_FOREGROUND", "APP_BACKGROUND", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State APP_FOREGROUND = new State("APP_FOREGROUND", 0);
        public static final State APP_BACKGROUND = new State("APP_BACKGROUND", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{APP_FOREGROUND, APP_BACKGROUND};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @NotNull
    p<State> observe();
}
