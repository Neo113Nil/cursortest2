package com.vk.channels.impl.list.item;

import xsna.asp;
import xsna.hfz;
import xsna.zrp;

/* compiled from: SuggestHeaderItem.kt */
/* loaded from: classes16.dex */
public final class SuggestHeaderItem implements hfz {
    public final int b;
    public final DropdownState c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuggestHeaderItem.kt */
    public static final class DropdownState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DropdownState[] $VALUES;
        public static final DropdownState Collapsed;
        public static final DropdownState Expanded;
        public static final DropdownState NoNeed;

        static {
            DropdownState dropdownState = new DropdownState("NoNeed", 0);
            NoNeed = dropdownState;
            DropdownState dropdownState2 = new DropdownState("Collapsed", 1);
            Collapsed = dropdownState2;
            DropdownState dropdownState3 = new DropdownState("Expanded", 2);
            Expanded = dropdownState3;
            DropdownState[] dropdownStateArr = {dropdownState, dropdownState2, dropdownState3};
            $VALUES = dropdownStateArr;
            $ENTRIES = new asp(dropdownStateArr);
        }

        public DropdownState() {
            throw null;
        }

        public static DropdownState valueOf(String str) {
            return (DropdownState) Enum.valueOf(DropdownState.class, str);
        }

        public static DropdownState[] values() {
            return (DropdownState[]) $VALUES.clone();
        }
    }

    public SuggestHeaderItem(int i, DropdownState dropdownState) {
        this.b = i;
        this.c = dropdownState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestHeaderItem)) {
            return false;
        }
        SuggestHeaderItem suggestHeaderItem = (SuggestHeaderItem) obj;
        return this.b == suggestHeaderItem.b && this.c == suggestHeaderItem.c;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483641;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "SuggestHeaderItem(size=" + this.b + ", dropdownState=" + this.c + ')';
    }
}
