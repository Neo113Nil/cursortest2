package com.vk.auth.ui;

import xsna.asp;
import xsna.zrp;

/* compiled from: VkCustomExistingProfile.kt */
/* loaded from: classes15.dex */
public interface VkCustomExistingProfile {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCustomExistingProfile.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode NeedPassword;
        public static final Mode NoPassword;

        static {
            Mode mode = new Mode("NeedPassword", 0);
            NeedPassword = mode;
            Mode mode2 = new Mode("NoPassword", 1);
            NoPassword = mode2;
            Mode[] modeArr = {mode, mode2};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    void a();

    void b();
}
