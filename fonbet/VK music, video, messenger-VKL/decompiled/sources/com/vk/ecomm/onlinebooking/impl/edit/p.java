package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final class p {

    /* compiled from: BookingEditScreenReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingEditModel.EditMode.values().length];
            try {
                iArr[BookingEditModel.EditMode.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingEditModel.EditMode.Reschedule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingEditModel.EditMode.Overview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
