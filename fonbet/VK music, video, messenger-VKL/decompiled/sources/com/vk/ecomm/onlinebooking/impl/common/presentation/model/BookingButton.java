package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import xsna.asp;
import xsna.zrp;

/* compiled from: BookingRecordItem.kt */
/* loaded from: classes18.dex */
public final class BookingButton {
    public final Action a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingRecordItem.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action Cancel;
        public static final Action Other;
        public static final Action Reschedule;

        static {
            Action action = new Action("Reschedule", 0);
            Reschedule = action;
            Action action2 = new Action("Cancel", 1);
            Cancel = action2;
            Action action3 = new Action("Other", 2);
            Other = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public BookingButton(Action action) {
        this.a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookingButton) && this.a == ((BookingButton) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BookingButton(action=" + this.a + ')';
    }
}
