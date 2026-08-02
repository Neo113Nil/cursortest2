package com.vk.ecomm.onlinebooking.impl.edit.model;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.u11;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: BookingEditModel.kt */
/* loaded from: classes18.dex */
public final class BookingEditModel {
    public static final BookingEditModel j = new BookingEditModel(EditMode.Edit, null, new a(0, 0, 0, null, null), EmptyList.b, new b("", "", "", "", "", false, true, true), "", null, null, 0);
    public final EditMode a;
    public final BookingMaster b;
    public final a c;
    public final List<BookingServiceModel> d;
    public final b e;
    public final CharSequence f;
    public final String g;
    public final String h;
    public final int i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingEditModel.kt */
    public static final class EditMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditMode[] $VALUES;
        public static final EditMode Edit;
        public static final EditMode Overview;
        public static final EditMode Reschedule;

        static {
            EditMode editMode = new EditMode("Edit", 0);
            Edit = editMode;
            EditMode editMode2 = new EditMode("Reschedule", 1);
            Reschedule = editMode2;
            EditMode editMode3 = new EditMode("Overview", 2);
            Overview = editMode3;
            EditMode[] editModeArr = {editMode, editMode2, editMode3};
            $VALUES = editModeArr;
            $ENTRIES = new asp(editModeArr);
        }

        public EditMode() {
            throw null;
        }

        public static EditMode valueOf(String str) {
            return (EditMode) Enum.valueOf(EditMode.class, str);
        }

        public static EditMode[] values() {
            return (EditMode[]) $VALUES.clone();
        }
    }

    /* compiled from: BookingEditModel.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final Integer c;
        public final Integer d;
        public final int e;

        public a(int i, int i2, int i3, Integer num, Integer num2) {
            this.a = i;
            this.b = i2;
            this.c = num;
            this.d = num2;
            this.e = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            Integer num = this.c;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            return Integer.hashCode(this.e) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Date(timestamp=");
            sb.append(this.a);
            sb.append(", duration=");
            sb.append(this.b);
            sb.append(", capacity=");
            sb.append(this.c);
            sb.append(", recordsCount=");
            sb.append(this.d);
            sb.append(", activityId=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: BookingEditModel.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
            this.g = z2;
            this.h = z3;
        }

        public static b a(b bVar, String str, String str2, String str3, boolean z, int i) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            String str4 = str;
            String str5 = bVar.b;
            if ((i & 4) != 0) {
                str2 = bVar.c;
            }
            String str6 = str2;
            String str7 = bVar.d;
            if ((i & 16) != 0) {
                str3 = bVar.e;
            }
            String str8 = str3;
            if ((i & 32) != 0) {
                z = bVar.f;
            }
            boolean z2 = bVar.g;
            boolean z3 = bVar.h;
            bVar.getClass();
            return new b(str4, str5, str6, str7, str8, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(name=");
            sb.append(this.a);
            sb.append(", accountName=");
            sb.append(this.b);
            sb.append(", phone=");
            sb.append(this.c);
            sb.append(", accountPhone=");
            sb.append(this.d);
            sb.append(", comment=");
            sb.append(this.e);
            sb.append(", fillDataFromProfile=");
            sb.append(this.f);
            sb.append(", isDataFromProfileAvailable=");
            sb.append(this.g);
            sb.append(", canFillDataManually=");
            return q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: BookingEditModel.kt */
    public static final class c {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhoneInfo(phone=");
            sb.append(this.a);
            sb.append(", isValid=");
            return q0.a(sb, this.b, ')');
        }
    }

    public BookingEditModel(EditMode editMode, BookingMaster bookingMaster, a aVar, List<BookingServiceModel> list, b bVar, CharSequence charSequence, String str, String str2, int i) {
        this.a = editMode;
        this.b = bookingMaster;
        this.c = aVar;
        this.d = list;
        this.e = bVar;
        this.f = charSequence;
        this.g = str;
        this.h = str2;
        this.i = i;
    }

    public static BookingEditModel a(BookingEditModel bookingEditModel, a aVar, List list, b bVar, int i, int i2) {
        EditMode editMode = bookingEditModel.a;
        BookingMaster bookingMaster = bookingEditModel.b;
        if ((i2 & 4) != 0) {
            aVar = bookingEditModel.c;
        }
        a aVar2 = aVar;
        if ((i2 & 8) != 0) {
            list = bookingEditModel.d;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            bVar = bookingEditModel.e;
        }
        b bVar2 = bVar;
        CharSequence charSequence = bookingEditModel.f;
        String str = bookingEditModel.g;
        String str2 = bookingEditModel.h;
        if ((i2 & 256) != 0) {
            i = bookingEditModel.i;
        }
        bookingEditModel.getClass();
        return new BookingEditModel(editMode, bookingMaster, aVar2, list2, bVar2, charSequence, str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingEditModel)) {
            return false;
        }
        BookingEditModel bookingEditModel = (BookingEditModel) obj;
        return this.a == bookingEditModel.a && epx.f(this.b, bookingEditModel.b) && epx.f(this.c, bookingEditModel.c) && epx.f(this.d, bookingEditModel.d) && epx.f(this.e, bookingEditModel.e) && epx.f(this.f, bookingEditModel.f) && epx.f(this.g, bookingEditModel.g) && epx.f(this.h, bookingEditModel.h) && this.i == bookingEditModel.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        BookingMaster bookingMaster = this.b;
        int c2 = u11.c((this.e.hashCode() + fw3.a((this.c.hashCode() + ((hashCode + (bookingMaster == null ? 0 : bookingMaster.hashCode())) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        int hashCode2 = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return Integer.hashCode(this.i) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingEditModel(editMode=");
        sb.append(this.a);
        sb.append(", master=");
        sb.append(this.b);
        sb.append(", date=");
        sb.append(this.c);
        sb.append(", services=");
        sb.append(this.d);
        sb.append(", info=");
        sb.append(this.e);
        sb.append(", legalText=");
        sb.append((Object) this.f);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.g);
        sb.append(", termsOfServiceUrl=");
        sb.append(this.h);
        sb.append(", notifyInHours=");
        return vu5.b(sb, this.i, ')');
    }
}
