package com.vk.auth.passport;

import com.vk.superapp.api.dto.account.ProfileNavigationInfo;

/* compiled from: PassportDataProviderImpl.kt */
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: PassportDataProviderImpl.kt */
    /* renamed from: com.vk.auth.passport.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0411a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileNavigationInfo.SecurityInfo.values().length];
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.NO_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.NO_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.HAS_WARNINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.ALL_GOOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
