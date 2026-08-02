package com.vk.money.createtransfer.people;

import xsna.asp;
import xsna.zrp;

/* compiled from: VkPayInfo.kt */
/* loaded from: classes3.dex */
public final class VkPayInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPayInfo.kt */
    public static final class VkPayState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkPayState[] $VALUES;
        public static final VkPayState Anonymous;
        public static final VkPayState Disabled;
        public static final VkPayState Permissible;

        static {
            VkPayState vkPayState = new VkPayState("Disabled", 0);
            Disabled = vkPayState;
            VkPayState vkPayState2 = new VkPayState("Anonymous", 1);
            Anonymous = vkPayState2;
            VkPayState vkPayState3 = new VkPayState("Permissible", 2);
            Permissible = vkPayState3;
            VkPayState[] vkPayStateArr = {vkPayState, vkPayState2, vkPayState3};
            $VALUES = vkPayStateArr;
            $ENTRIES = new asp(vkPayStateArr);
        }

        public VkPayState() {
            throw null;
        }

        public static VkPayState valueOf(String str) {
            return (VkPayState) Enum.valueOf(VkPayState.class, str);
        }

        public static VkPayState[] values() {
            return (VkPayState[]) $VALUES.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPayInfo)) {
            return false;
        }
        ((VkPayInfo) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return "VkPayInfo(balance=0, currency=null, state=null)";
    }
}
