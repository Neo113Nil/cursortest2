package com.vk.ecomm.onlinebooking.impl.common;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.drm0;
import xsna.h03;

/* compiled from: BookingErrorModel.kt */
/* loaded from: classes18.dex */
public final class b {
    public static final String a(a aVar, Context context) {
        if (aVar instanceof a.e) {
            return context.getString(R.string.booking_connection_error_screen_description);
        }
        if (aVar instanceof a.b) {
            return ((a.b) aVar).a;
        }
        if (aVar instanceof a.f) {
            return context.getString(R.string.booking_no_booking_error_screen_description);
        }
        if (aVar.equals(a.g.a)) {
            return context.getString(R.string.booking_base_error_screen_description);
        }
        if (aVar.equals(a.h.a)) {
            return context.getString(R.string.booking_no_staff_for_booking_title);
        }
        if (aVar.equals(a.k.a)) {
            return context.getString(R.string.online_booking_service_not_available_at_time_text);
        }
        if (aVar.equals(a.l.a)) {
            return context.getString(R.string.online_booking_service_not_available_text);
        }
        if (aVar.equals(a.m.a)) {
            return context.getString(R.string.booking_base_error_screen_description);
        }
        if (aVar instanceof a.c) {
            return "";
        }
        if (aVar instanceof a.d) {
            return context.getString(R.string.select_other_master);
        }
        if (aVar instanceof a.j) {
            return context.getString(R.string.select_other_service);
        }
        if (aVar.equals(a.i.a)) {
            return context.getString(R.string.booking_service_cancellation_failure_description);
        }
        if (aVar.equals(a.C0955a.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(a aVar, Context context) {
        if (aVar instanceof a.e) {
            return context.getString(R.string.booking_connection_error_screen_title);
        }
        if (aVar instanceof a.b) {
            return context.getString(R.string.booking_custom_error_screen_title);
        }
        if (aVar instanceof a.f) {
            return context.getString(R.string.booking_no_booking_error_screen_title);
        }
        if (aVar.equals(a.g.a)) {
            return context.getString(R.string.booking_base_error_screen_title);
        }
        if (aVar.equals(a.h.a)) {
            return context.getString(R.string.booking_no_staff_for_booking_title);
        }
        if (aVar.equals(a.k.a)) {
            return context.getString(R.string.online_booking_service_not_available_at_time_title);
        }
        if (aVar.equals(a.l.a)) {
            return context.getString(R.string.booking_service_not_available_title);
        }
        if (aVar.equals(a.m.a)) {
            return context.getString(R.string.booking_base_error_screen_title);
        }
        if (aVar instanceof a.c) {
            throw null;
        }
        if (aVar instanceof a.d) {
            return context.getString(R.string.record_is_not_available_for_master, ((a.d) aVar).a);
        }
        if (aVar instanceof a.j) {
            return context.getString(R.string.service_is_unavailable);
        }
        if (aVar.equals(a.i.a)) {
            return context.getString(R.string.booking_service_cancellation_failure);
        }
        if (aVar.equals(a.C0955a.a)) {
            return context.getString(R.string.online_booking_record_already_exist_title);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final a c(Exception exc) {
        VKApiExecutionException vKApiExecutionException;
        int s;
        if (h03.a(exc)) {
            return a.e.a;
        }
        boolean z = exc instanceof VKApiExecutionException;
        if (z) {
            VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) exc;
            if (vKApiExecutionException2.x() && !drm0.N(vKApiExecutionException2.t())) {
                return new a.b(vKApiExecutionException2.t());
            }
        }
        if (!z || ((14101 > (s = (vKApiExecutionException = (VKApiExecutionException) exc).s()) || s >= 14106) && vKApiExecutionException.s() != 14108)) {
            return (z && ((VKApiExecutionException) exc).J()) ? a.f.a : exc instanceof BookingError.MasterIsNotAvailable ? new a.d(((BookingError.MasterIsNotAvailable) exc).d()) : exc instanceof BookingError.ServiceIsNotAvailableForRebooking ? a.j.a : exc instanceof BookingError.RecordCancellationException ? a.i.a : a.m.a;
        }
        int s2 = vKApiExecutionException.s();
        if (s2 == 14108) {
            return a.C0955a.a;
        }
        switch (s2) {
            case 14101:
                return a.f.a;
            case 14102:
                return a.g.a;
            case 14103:
                return a.h.a;
            case 14104:
                return a.k.a;
            case 14105:
                return a.l.a;
            default:
                return a.m.a;
        }
    }
}
