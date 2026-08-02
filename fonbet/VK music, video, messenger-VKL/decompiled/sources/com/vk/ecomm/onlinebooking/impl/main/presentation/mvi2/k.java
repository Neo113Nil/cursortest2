package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;
import xsna.urd0;

/* compiled from: BookingStartScreenState.kt */
/* loaded from: classes18.dex */
public final class k implements lm50 {
    public final UserId b;
    public final a c;
    public final boolean d;
    public final String e;
    public final String f;
    public final BookingSettings g;
    public final List<BookingMaster> h;
    public final BookingRecord i;
    public final boolean j;
    public final boolean k;
    public final BookingActionResult l;

    /* compiled from: BookingStartScreenState.kt */
    public static final class a {
        public final com.vk.ecomm.onlinebooking.impl.common.a a;
        public final a.h b;

        public a(com.vk.ecomm.onlinebooking.impl.common.a aVar, a.h hVar) {
            this.a = aVar;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(cause=" + this.a + ", action=" + this.b + ')';
        }
    }

    public k(UserId userId, a aVar, boolean z, String str, String str2, BookingSettings bookingSettings, List<BookingMaster> list, BookingRecord bookingRecord, boolean z2, boolean z3, BookingActionResult bookingActionResult) {
        this.b = userId;
        this.c = aVar;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = bookingSettings;
        this.h = list;
        this.i = bookingRecord;
        this.j = z2;
        this.k = z3;
        this.l = bookingActionResult;
    }

    public static k a(k kVar, a aVar, boolean z, String str, String str2, BookingSettings bookingSettings, List list, BookingRecord bookingRecord, boolean z2, boolean z3, BookingActionResult bookingActionResult, int i) {
        a aVar2 = aVar;
        UserId userId = kVar.b;
        if ((i & 2) != 0) {
            aVar2 = kVar.c;
        }
        if ((i & 4) != 0) {
            z = kVar.d;
        }
        if ((i & 8) != 0) {
            str = kVar.e;
        }
        if ((i & 16) != 0) {
            str2 = kVar.f;
        }
        if ((i & 32) != 0) {
            bookingSettings = kVar.g;
        }
        if ((i & 64) != 0) {
            list = kVar.h;
        }
        if ((i & 128) != 0) {
            bookingRecord = kVar.i;
        }
        if ((i & 256) != 0) {
            z2 = kVar.j;
        }
        if ((i & 512) != 0) {
            z3 = kVar.k;
        }
        if ((i & 1024) != 0) {
            bookingActionResult = kVar.l;
        }
        BookingActionResult bookingActionResult2 = bookingActionResult;
        kVar.getClass();
        boolean z4 = z3;
        boolean z5 = z2;
        BookingRecord bookingRecord2 = bookingRecord;
        List list2 = list;
        BookingSettings bookingSettings2 = bookingSettings;
        String str3 = str2;
        String str4 = str;
        return new k(userId, aVar2, z, str4, str3, bookingSettings2, list2, bookingRecord2, z5, z4, bookingActionResult2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && this.d == kVar.d && epx.f(this.e, kVar.e) && epx.f(this.f, kVar.f) && epx.f(this.g, kVar.g) && epx.f(this.h, kVar.h) && epx.f(this.i, kVar.i) && this.j == kVar.j && this.k == kVar.k && this.l == kVar.l;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        a aVar = this.c;
        int a2 = urd0.a(qoy.b((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        BookingSettings bookingSettings = this.g;
        int a3 = fw3.a((hashCode2 + (bookingSettings == null ? 0 : bookingSettings.hashCode())) * 31, 31, this.h);
        BookingRecord bookingRecord = this.i;
        int b = qoy.b(qoy.b((a3 + (bookingRecord == null ? 0 : bookingRecord.hashCode())) * 31, 31, this.j), 31, this.k);
        BookingActionResult bookingActionResult = this.l;
        return b + (bookingActionResult != null ? bookingActionResult.hashCode() : 0);
    }

    public final String toString() {
        return "BookingStartScreenState(groupId=" + this.b + ", error=" + this.c + ", isLoading=" + this.d + ", title=" + this.e + ", masterAddress=" + this.f + ", settings=" + this.g + ", masters=" + this.h + ", record=" + this.i + ", showAllRecord=" + this.j + ", needConfirmCancelRecord=" + this.k + ", actionResult=" + this.l + ')';
    }
}
