package com.vk.auth.validation.internal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneValidationContract.kt */
/* loaded from: classes15.dex */
public final class PhoneValidationContract$SkipBehaviour {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhoneValidationContract$SkipBehaviour[] $VALUES;
    public static final PhoneValidationContract$SkipBehaviour LOGOUT;
    public static final PhoneValidationContract$SkipBehaviour NOTHING;
    public static final PhoneValidationContract$SkipBehaviour UNLINK;

    static {
        PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour = new PhoneValidationContract$SkipBehaviour("LOGOUT", 0);
        LOGOUT = phoneValidationContract$SkipBehaviour;
        PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour2 = new PhoneValidationContract$SkipBehaviour("UNLINK", 1);
        UNLINK = phoneValidationContract$SkipBehaviour2;
        PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour3 = new PhoneValidationContract$SkipBehaviour("NOTHING", 2);
        NOTHING = phoneValidationContract$SkipBehaviour3;
        PhoneValidationContract$SkipBehaviour[] phoneValidationContract$SkipBehaviourArr = {phoneValidationContract$SkipBehaviour, phoneValidationContract$SkipBehaviour2, phoneValidationContract$SkipBehaviour3};
        $VALUES = phoneValidationContract$SkipBehaviourArr;
        $ENTRIES = new asp(phoneValidationContract$SkipBehaviourArr);
    }

    public PhoneValidationContract$SkipBehaviour() {
        throw null;
    }

    public static PhoneValidationContract$SkipBehaviour valueOf(String str) {
        return (PhoneValidationContract$SkipBehaviour) Enum.valueOf(PhoneValidationContract$SkipBehaviour.class, str);
    }

    public static PhoneValidationContract$SkipBehaviour[] values() {
        return (PhoneValidationContract$SkipBehaviour[]) $VALUES.clone();
    }
}
