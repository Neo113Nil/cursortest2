package com.vk.im.ui.components.chat_profile;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.xub;
import xsna.zrp;

/* compiled from: ChatProfileActionItem.kt */
/* loaded from: classes2.dex */
public final class ChatProfileActionItem$Notifications extends xub {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatProfileActionItem.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DISABLED;
        public static final State ENABLED;
        public static final State NO_SOUND;

        static {
            State state = new State("ENABLED", 0);
            ENABLED = state;
            State state2 = new State("NO_SOUND", 1);
            NO_SOUND = state2;
            State state3 = new State("DISABLED", 2);
            DISABLED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: ChatProfileActionItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.NO_SOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChatProfileActionItem$Notifications(Context context, State state) {
        super(r4, 4, r3, Integer.valueOf(R.attr.im_icon_red));
        int i;
        CharSequence text = context.getText(R.string.vkim_chat_profile_action_notifications);
        int i2 = a.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == 1) {
            i = R.drawable.vk_icon_notifications_28;
        } else if (i2 == 2) {
            i = R.drawable.vk_icon_notification_disable_outline_28;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_mute_outline_28;
        }
    }
}
