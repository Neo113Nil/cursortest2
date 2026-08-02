package com.vk.music.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.asp;
import xsna.zrp;

/* compiled from: ScreenStateReceiver.kt */
/* loaded from: classes3.dex */
public final class ScreenStateReceiver extends BroadcastReceiver {
    public boolean b;
    public a c;
    public boolean a = true;
    public ScreenState d = ScreenState.ON_AND_UNLOCKED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenStateReceiver.kt */
    public static final class ScreenState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenState[] $VALUES;
        public static final ScreenState OFF_AND_LOCKED;
        public static final ScreenState ON_AND_LOCKED;
        public static final ScreenState ON_AND_UNLOCKED;

        static {
            ScreenState screenState = new ScreenState("ON_AND_LOCKED", 0);
            ON_AND_LOCKED = screenState;
            ScreenState screenState2 = new ScreenState("ON_AND_UNLOCKED", 1);
            ON_AND_UNLOCKED = screenState2;
            ScreenState screenState3 = new ScreenState("OFF_AND_LOCKED", 2);
            OFF_AND_LOCKED = screenState3;
            ScreenState[] screenStateArr = {screenState, screenState2, screenState3};
            $VALUES = screenStateArr;
            $ENTRIES = new asp(screenStateArr);
        }

        public ScreenState() {
            throw null;
        }

        public static ScreenState valueOf(String str) {
            return (ScreenState) Enum.valueOf(ScreenState.class, str);
        }

        public static ScreenState[] values() {
            return (ScreenState[]) $VALUES.clone();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    this.a = false;
                    a aVar = this.c;
                    if (aVar != null) {
                        aVar.d();
                    }
                    this.d = ScreenState.OFF_AND_LOCKED;
                    return;
                }
                return;
            }
            if (hashCode != -1454123155) {
                if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                    this.d = ScreenState.ON_AND_UNLOCKED;
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.SCREEN_ON")) {
                this.a = true;
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.h();
                }
                this.d = ScreenState.ON_AND_LOCKED;
            }
        }
    }

    /* compiled from: ScreenStateReceiver.kt */
    public interface a {
        default void d() {
        }

        default void h() {
        }
    }
}
