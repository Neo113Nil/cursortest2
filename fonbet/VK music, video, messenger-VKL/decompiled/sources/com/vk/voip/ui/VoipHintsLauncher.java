package com.vk.voip.ui;

import android.view.View;
import xsna.asp;
import xsna.hh1;
import xsna.zrp;

/* compiled from: VoipHintsLauncher.kt */
/* loaded from: classes7.dex */
public interface VoipHintsLauncher {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipHintsLauncher.kt */
    public static final class Hint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Hint[] $VALUES;
        public static final Hint ADD_FRIENDS_TO_CALL;
        public static final Hint INVITE_BY_LINK;
        public static final Hint MEMBERS_ACTIONS;
        public static final Hint VOIP_CAROUSEL_ACTIONS;

        static {
            Hint hint = new Hint("ADD_FRIENDS_TO_CALL", 0);
            ADD_FRIENDS_TO_CALL = hint;
            Hint hint2 = new Hint("INVITE_BY_LINK", 1);
            INVITE_BY_LINK = hint2;
            Hint hint3 = new Hint("VOIP_CAROUSEL_ACTIONS", 2);
            VOIP_CAROUSEL_ACTIONS = hint3;
            Hint hint4 = new Hint("MEMBERS_ACTIONS", 3);
            MEMBERS_ACTIONS = hint4;
            Hint[] hintArr = {hint, hint2, hint3, hint4};
            $VALUES = hintArr;
            $ENTRIES = new asp(hintArr);
        }

        public Hint() {
            throw null;
        }

        public static Hint valueOf(String str) {
            return (Hint) Enum.valueOf(Hint.class, str);
        }

        public static Hint[] values() {
            return (Hint[]) $VALUES.clone();
        }
    }

    void a(View view, Hint hint, hh1 hh1Var);
}
