package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;

/* compiled from: BookingRecordItem.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BookingButton.Action.values().length];
        try {
            iArr[BookingButton.Action.Reschedule.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BookingButton.Action.Cancel.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BookingButton.Action.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
