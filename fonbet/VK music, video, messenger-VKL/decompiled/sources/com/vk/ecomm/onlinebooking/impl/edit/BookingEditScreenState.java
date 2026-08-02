package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.ft7;
import xsna.ho8;
import xsna.km50;
import xsna.qoy;
import xsna.shy;
import xsna.u11;
import xsna.uqi;
import xsna.urd0;
import xsna.zrp;

/* compiled from: BookingEditScreenState.kt */
/* loaded from: classes18.dex */
public final class BookingEditScreenState implements km50 {
    public final BookingScreenParams b;
    public final BookingEditModel c;
    public final d d;
    public final g e;
    public final boolean f;
    public final a g;
    public final InfoBlock h;
    public final f i;
    public final b j;
    public final boolean k;

    /* compiled from: BookingEditScreenState.kt */
    public static final class InfoBlock {
        public static final InfoBlock k;
        public final State a;
        public final String b;
        public final NameError c;
        public final String d;
        public final PhoneError e;
        public final String f;
        public final Error g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BookingEditScreenState.kt */
        public static final class Error {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Error[] $VALUES;
            public static final Error None;
            public static final Error TooLong;

            /* compiled from: BookingEditScreenState.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Error.values().length];
                    try {
                        iArr[Error.None.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Error.TooLong.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            static {
                Error error = new Error("None", 0);
                None = error;
                Error error2 = new Error("TooLong", 1);
                TooLong = error2;
                Error[] errorArr = {error, error2};
                $VALUES = errorArr;
                $ENTRIES = new asp(errorArr);
            }

            public Error() {
                throw null;
            }

            public static Error valueOf(String str) {
                return (Error) Enum.valueOf(Error.class, str);
            }

            public static Error[] values() {
                return (Error[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BookingEditScreenState.kt */
        public static final class NameError {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ NameError[] $VALUES;
            public static final NameError Empty;
            public static final NameError None;
            public static final NameError TooLong;

            /* compiled from: BookingEditScreenState.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NameError.values().length];
                    try {
                        iArr[NameError.None.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NameError.TooLong.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NameError.Empty.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            static {
                NameError nameError = new NameError("None", 0);
                None = nameError;
                NameError nameError2 = new NameError("TooLong", 1);
                TooLong = nameError2;
                NameError nameError3 = new NameError("Empty", 2);
                Empty = nameError3;
                NameError[] nameErrorArr = {nameError, nameError2, nameError3};
                $VALUES = nameErrorArr;
                $ENTRIES = new asp(nameErrorArr);
            }

            public NameError() {
                throw null;
            }

            public static NameError valueOf(String str) {
                return (NameError) Enum.valueOf(NameError.class, str);
            }

            public static NameError[] values() {
                return (NameError[]) $VALUES.clone();
            }

            public final f.k h() {
                int i = a.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    return f.k.a.b;
                }
                if (i == 2) {
                    return f.k.c.b;
                }
                if (i == 3) {
                    return f.k.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BookingEditScreenState.kt */
        public static final class PhoneError {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PhoneError[] $VALUES;
            public static final PhoneError Empty;
            public static final PhoneError None;
            public static final PhoneError TooLong;
            public static final PhoneError WrongFormat;

            /* compiled from: BookingEditScreenState.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PhoneError.values().length];
                    try {
                        iArr[PhoneError.None.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PhoneError.TooLong.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PhoneError.WrongFormat.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PhoneError.Empty.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            static {
                PhoneError phoneError = new PhoneError("None", 0);
                None = phoneError;
                PhoneError phoneError2 = new PhoneError("TooLong", 1);
                TooLong = phoneError2;
                PhoneError phoneError3 = new PhoneError("WrongFormat", 2);
                WrongFormat = phoneError3;
                PhoneError phoneError4 = new PhoneError("Empty", 3);
                Empty = phoneError4;
                PhoneError[] phoneErrorArr = {phoneError, phoneError2, phoneError3, phoneError4};
                $VALUES = phoneErrorArr;
                $ENTRIES = new asp(phoneErrorArr);
            }

            public PhoneError() {
                throw null;
            }

            public static PhoneError valueOf(String str) {
                return (PhoneError) Enum.valueOf(PhoneError.class, str);
            }

            public static PhoneError[] values() {
                return (PhoneError[]) $VALUES.clone();
            }

            public final f.l h() {
                int i = a.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    return f.l.a.b;
                }
                if (i == 2) {
                    return f.l.c.b;
                }
                if (i == 3) {
                    return f.l.d.b;
                }
                if (i == 4) {
                    return f.l.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BookingEditScreenState.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State Editable;
            public static final State ReadOnly;

            static {
                State state = new State("Editable", 0);
                Editable = state;
                State state2 = new State("ReadOnly", 1);
                ReadOnly = state2;
                State[] stateArr = {state, state2};
                $VALUES = stateArr;
                $ENTRIES = new asp(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        static {
            State state = State.Editable;
            Error error = Error.None;
            k = new InfoBlock(state, "", NameError.None, "", PhoneError.None, "", error, false, true, true);
        }

        public InfoBlock(State state, String str, NameError nameError, String str2, PhoneError phoneError, String str3, Error error, boolean z, boolean z2, boolean z3) {
            this.a = state;
            this.b = str;
            this.c = nameError;
            this.d = str2;
            this.e = phoneError;
            this.f = str3;
            this.g = error;
            this.h = z;
            this.i = z2;
            this.j = z3;
        }

        public static InfoBlock a(InfoBlock infoBlock, String str, NameError nameError, String str2, PhoneError phoneError, String str3, Error error, boolean z, int i) {
            State state = infoBlock.a;
            if ((i & 2) != 0) {
                str = infoBlock.b;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                nameError = infoBlock.c;
            }
            NameError nameError2 = nameError;
            if ((i & 8) != 0) {
                str2 = infoBlock.d;
            }
            String str5 = str2;
            PhoneError phoneError2 = (i & 16) != 0 ? infoBlock.e : phoneError;
            String str6 = (i & 32) != 0 ? infoBlock.f : str3;
            Error error2 = (i & 64) != 0 ? infoBlock.g : error;
            boolean z2 = (i & 128) != 0 ? infoBlock.h : z;
            boolean z3 = infoBlock.i;
            boolean z4 = infoBlock.j;
            infoBlock.getClass();
            return new InfoBlock(state, str4, nameError2, str5, phoneError2, str6, error2, z2, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBlock)) {
                return false;
            }
            InfoBlock infoBlock = (InfoBlock) obj;
            return this.a == infoBlock.a && epx.f(this.b, infoBlock.b) && this.c == infoBlock.c && epx.f(this.d, infoBlock.d) && this.e == infoBlock.e && epx.f(this.f, infoBlock.f) && this.g == infoBlock.g && this.h == infoBlock.h && this.i == infoBlock.i && this.j == infoBlock.j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + qoy.b(qoy.b((this.g.hashCode() + urd0.a((this.e.hashCode() + urd0.a((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f)) * 31, 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InfoBlock(state=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", nameError=");
            sb.append(this.c);
            sb.append(", phone=");
            sb.append(this.d);
            sb.append(", phoneError=");
            sb.append(this.e);
            sb.append(", comment=");
            sb.append(this.f);
            sb.append(", commentError=");
            sb.append(this.g);
            sb.append(", fillDataFromProfile=");
            sb.append(this.h);
            sb.append(", isDataFromProfileAvailable=");
            sb.append(this.i);
            sb.append(", canFillDataManually=");
            return q0.a(sb, this.j, ')');
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public interface a {

        /* compiled from: BookingEditScreenState.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState$a$a, reason: collision with other inner class name */
        public static final class C0956a implements a {
            public static final C0956a g = new C0956a(0, 0, new ft7(0, 0), "", null, null);
            public final int a;
            public final int b;
            public final ft7 c;
            public final CharSequence d;
            public final String e;
            public final String f;

            public C0956a(int i, int i2, ft7 ft7Var, CharSequence charSequence, String str, String str2) {
                this.a = i;
                this.b = i2;
                this.c = ft7Var;
                this.d = charSequence;
                this.e = str;
                this.f = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0956a)) {
                    return false;
                }
                C0956a c0956a = (C0956a) obj;
                return this.a == c0956a.a && this.b == c0956a.b && epx.f(this.c, c0956a.c) && epx.f(this.d, c0956a.d) && epx.f(this.e, c0956a.e) && epx.f(this.f, c0956a.f);
            }

            public final int hashCode() {
                int c = u11.c((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
                String str = this.e;
                int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Confirm(serviceCount=");
                sb.append(this.a);
                sb.append(", totalDuration=");
                sb.append(this.b);
                sb.append(", fork=");
                sb.append(this.c);
                sb.append(", legalText=");
                sb.append((Object) this.d);
                sb.append(", privacyPolicyUrl=");
                sb.append(this.e);
                sb.append(", termsOfServiceUrl=");
                return ho8.a(sb, this.f, ')');
            }
        }

        /* compiled from: BookingEditScreenState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -805276249;
            }

            public final String toString() {
                return "Rebook";
            }
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class b {
        public static final b e = new b(false, "", "", "");
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;

        public b(boolean z, String str, String str2, String str3) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public static b a(b bVar, boolean z, String str, String str2, String str3, int i) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 4) != 0) {
                str2 = bVar.c;
            }
            if ((i & 8) != 0) {
                str3 = bVar.d;
            }
            bVar.getClass();
            return new b(z, str, str2, str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConsentPersonalDataBlock(isChecked=");
            sb.append(this.a);
            sb.append(", privacyPolicyUrl=");
            sb.append(this.b);
            sb.append(", newsletterConsentUrl=");
            sb.append(this.c);
            sb.append(", termsOfServiceUrl=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final Integer d;
        public final Integer e;

        public c() {
            this(false, 0, 0, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
            Integer num = this.d;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Date(editable=");
            sb.append(this.a);
            sb.append(", timestamp=");
            sb.append(this.b);
            sb.append(", duration=");
            sb.append(this.c);
            sb.append(", capacity=");
            sb.append(this.d);
            sb.append(", recordsCount=");
            return uqi.b(sb, this.e, ')');
        }

        public c(boolean z, int i, int i2, Integer num, Integer num2) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = num2;
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class d {
        public final Exception a;
        public final com.vk.ecomm.onlinebooking.impl.edit.a b;

        public d(Exception exc, com.vk.ecomm.onlinebooking.impl.edit.a aVar) {
            this.a = exc;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.a + ", action=" + this.b + ')';
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class e {
        public final boolean a;
        public final BookingMaster b;

        public e() {
            this(false, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            BookingMaster bookingMaster = this.b;
            return hashCode + (bookingMaster == null ? 0 : bookingMaster.hashCode());
        }

        public final String toString() {
            return "Master(canChange=" + this.a + ", model=" + this.b + ')';
        }

        public e(boolean z, BookingMaster bookingMaster) {
            this.a = z;
            this.b = bookingMaster;
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class f {
        public static final f b = new f(NotificationVariants.HOURS_24);
        public final NotificationVariants a;

        public f(NotificationVariants notificationVariants) {
            this.a = notificationVariants;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationBlock(value=" + this.a + ')';
        }
    }

    /* compiled from: BookingEditScreenState.kt */
    public static final class g {
        public final boolean a;
        public final BookingServiceModel b;

        public g(boolean z, BookingServiceModel bookingServiceModel) {
            this.a = z;
            this.b = bookingServiceModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Service(canDelete=" + this.a + ", model=" + this.b + ')';
        }
    }

    public BookingEditScreenState(BookingScreenParams bookingScreenParams, BookingEditModel bookingEditModel, d dVar, g gVar, boolean z, a aVar, InfoBlock infoBlock, f fVar, b bVar, boolean z2) {
        this.b = bookingScreenParams;
        this.c = bookingEditModel;
        this.d = dVar;
        this.e = gVar;
        this.f = z;
        this.g = aVar;
        this.h = infoBlock;
        this.i = fVar;
        this.j = bVar;
        this.k = z2;
    }

    public static BookingEditScreenState a(BookingEditScreenState bookingEditScreenState, BookingScreenParams bookingScreenParams, BookingEditModel bookingEditModel, d dVar, g gVar, boolean z, a aVar, InfoBlock infoBlock, f fVar, b bVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            bookingScreenParams = bookingEditScreenState.b;
        }
        BookingScreenParams bookingScreenParams2 = bookingScreenParams;
        if ((i & 2) != 0) {
            bookingEditModel = bookingEditScreenState.c;
        }
        BookingEditModel bookingEditModel2 = bookingEditModel;
        if ((i & 4) != 0) {
            dVar = bookingEditScreenState.d;
        }
        d dVar2 = dVar;
        if ((i & 8) != 0) {
            gVar = bookingEditScreenState.e;
        }
        g gVar2 = gVar;
        boolean z3 = (i & 16) != 0 ? bookingEditScreenState.f : z;
        a aVar2 = (i & 32) != 0 ? bookingEditScreenState.g : aVar;
        InfoBlock infoBlock2 = (i & 64) != 0 ? bookingEditScreenState.h : infoBlock;
        f fVar2 = (i & 128) != 0 ? bookingEditScreenState.i : fVar;
        b bVar2 = (i & 256) != 0 ? bookingEditScreenState.j : bVar;
        boolean z4 = (i & 512) != 0 ? bookingEditScreenState.k : z2;
        bookingEditScreenState.getClass();
        return new BookingEditScreenState(bookingScreenParams2, bookingEditModel2, dVar2, gVar2, z3, aVar2, infoBlock2, fVar2, bVar2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingEditScreenState)) {
            return false;
        }
        BookingEditScreenState bookingEditScreenState = (BookingEditScreenState) obj;
        return epx.f(this.b, bookingEditScreenState.b) && epx.f(this.c, bookingEditScreenState.c) && epx.f(this.d, bookingEditScreenState.d) && epx.f(this.e, bookingEditScreenState.e) && this.f == bookingEditScreenState.f && epx.f(this.g, bookingEditScreenState.g) && epx.f(this.h, bookingEditScreenState.h) && epx.f(this.i, bookingEditScreenState.i) && epx.f(this.j, bookingEditScreenState.j) && this.k == bookingEditScreenState.k;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        d dVar = this.d;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.e;
        int hashCode3 = (this.h.hashCode() + ((this.g.hashCode() + qoy.b((hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f)) * 31)) * 31;
        f fVar = this.i;
        int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.a.hashCode())) * 31;
        b bVar = this.j;
        return Boolean.hashCode(this.k) + ((hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingEditScreenState(params=");
        sb.append(this.b);
        sb.append(", model=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", serviceToDelete=");
        sb.append(this.e);
        sb.append(", bookingLoading=");
        sb.append(this.f);
        sb.append(", bottomBar=");
        sb.append(this.g);
        sb.append(", infoBlock=");
        sb.append(this.h);
        sb.append(", notificationBlock=");
        sb.append(this.i);
        sb.append(", consentPersonalDataBlock=");
        sb.append(this.j);
        sb.append(", cancelConfirmation=");
        return q0.a(sb, this.k, ')');
    }
}
