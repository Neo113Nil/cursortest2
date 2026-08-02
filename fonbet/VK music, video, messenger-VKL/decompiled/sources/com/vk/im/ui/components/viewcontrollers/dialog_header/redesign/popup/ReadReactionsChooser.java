package com.vk.im.ui.components.viewcontrollers.dialog_header.redesign.popup;

import com.vk.im.popup.Popup;
import xsna.asp;
import xsna.zrp;

/* compiled from: Popups.kt */
/* loaded from: classes2.dex */
public final class ReadReactionsChooser extends Popup.a<Choice> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Popups.kt */
    public static final class Choice {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Choice[] $VALUES;
        public static final Choice READ_ALL_REACTIONS;

        static {
            Choice choice = new Choice("READ_ALL_REACTIONS", 0);
            READ_ALL_REACTIONS = choice;
            Choice[] choiceArr = {choice};
            $VALUES = choiceArr;
            $ENTRIES = new asp(choiceArr);
        }

        public Choice() {
            throw null;
        }

        public static Choice valueOf(String str) {
            return (Choice) Enum.valueOf(Choice.class, str);
        }

        public static Choice[] values() {
            return (Choice[]) $VALUES.clone();
        }
    }
}
