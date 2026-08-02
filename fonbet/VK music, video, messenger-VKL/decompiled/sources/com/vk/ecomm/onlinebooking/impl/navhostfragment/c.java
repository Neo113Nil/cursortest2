package com.vk.ecomm.onlinebooking.impl.navhostfragment;

import java.util.Map;

/* compiled from: BookingScreenParams.kt */
/* loaded from: classes18.dex */
public final class c {
    public static final boolean a(BookingScreenParams bookingScreenParams) {
        Map<String, String> map = bookingScreenParams.p;
        return map.containsKey("record_id") || map.containsKey("specialist_id");
    }
}
