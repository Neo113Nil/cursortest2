package com.vk.auth.verification.base.states;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.verification.libverify.mobile.id.MobileIdScreenType;
import io.reactivex.rxjava3.subjects.b;
import xsna.nr;
import xsna.zcl;

/* compiled from: MethodSelectorCodeState.kt */
/* loaded from: classes15.dex */
public abstract class MethodSelectorCodeState extends BaseCodeState {

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class AppGenerator extends MethodSelectorCodeState {
        public static final Parcelable.Creator<AppGenerator> CREATOR = new a();

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<AppGenerator> {
            @Override // android.os.Parcelable.Creator
            public final AppGenerator createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new AppGenerator();
            }

            @Override // android.os.Parcelable.Creator
            public final AppGenerator[] newArray(int i) {
                return new AppGenerator[i];
            }
        }

        public AppGenerator() {
            super(null);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class CallReset extends MethodSelectorCodeState {
        public static final Parcelable.Creator<CallReset> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<CallReset> {
            @Override // android.os.Parcelable.Creator
            public final CallReset createFromParcel(Parcel parcel) {
                return new CallReset(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CallReset[] newArray(int i) {
                return new CallReset[i];
            }
        }

        public CallReset(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Email extends MethodSelectorCodeState {
        public static final Parcelable.Creator<Email> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Email> {
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                return new Email(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class LibverifyCallIn extends MethodSelectorCodeState {
        public static final Parcelable.Creator<LibverifyCallIn> CREATOR = new a();
        public final String b;
        public final long c;
        public final long d;
        public final String e;
        public final boolean f;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<LibverifyCallIn> {
            @Override // android.os.Parcelable.Creator
            public final LibverifyCallIn createFromParcel(Parcel parcel) {
                return new LibverifyCallIn(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final LibverifyCallIn[] newArray(int i) {
                return new LibverifyCallIn[i];
            }
        }

        public LibverifyCallIn(String str, long j, long j2, String str2, boolean z) {
            super(null);
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = str2;
            this.f = z;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class LibverifyCallReset extends MethodSelectorCodeState {
        public static final Parcelable.Creator<LibverifyCallReset> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<LibverifyCallReset> {
            @Override // android.os.Parcelable.Creator
            public final LibverifyCallReset createFromParcel(Parcel parcel) {
                return new LibverifyCallReset(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LibverifyCallReset[] newArray(int i) {
                return new LibverifyCallReset[i];
            }
        }

        public LibverifyCallReset(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class LibverifyMessengerPush extends MethodSelectorCodeState {
        public static final Parcelable.Creator<LibverifyMessengerPush> CREATOR = new a();
        public final int b;
        public final String c;
        public final Integer d;
        public final String e;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<LibverifyMessengerPush> {
            @Override // android.os.Parcelable.Creator
            public final LibverifyMessengerPush createFromParcel(Parcel parcel) {
                return new LibverifyMessengerPush(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LibverifyMessengerPush[] newArray(int i) {
                return new LibverifyMessengerPush[i];
            }
        }

        public LibverifyMessengerPush(int i, String str, Integer num, String str2) {
            super(null);
            this.b = i;
            this.c = str;
            this.d = num;
            this.e = str2;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            Integer num = this.d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.e);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class LibverifyMobileId extends MethodSelectorCodeState {
        public static final Parcelable.Creator<LibverifyMobileId> CREATOR = new a();
        public final MobileIdScreenType b;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<LibverifyMobileId> {
            @Override // android.os.Parcelable.Creator
            public final LibverifyMobileId createFromParcel(Parcel parcel) {
                return new LibverifyMobileId(parcel.readInt() == 0 ? null : MobileIdScreenType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LibverifyMobileId[] newArray(int i) {
                return new LibverifyMobileId[i];
            }
        }

        public LibverifyMobileId(MobileIdScreenType mobileIdScreenType) {
            super(null);
            this.b = mobileIdScreenType;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            MobileIdScreenType mobileIdScreenType = this.b;
            if (mobileIdScreenType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                mobileIdScreenType.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class LibverifySms extends MethodSelectorCodeState {
        public static final Parcelable.Creator<LibverifySms> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<LibverifySms> {
            @Override // android.os.Parcelable.Creator
            public final LibverifySms createFromParcel(Parcel parcel) {
                return new LibverifySms(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LibverifySms[] newArray(int i) {
                return new LibverifySms[i];
            }
        }

        public LibverifySms(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Loading extends MethodSelectorCodeState {
        public static final Loading b = new Loading(null);
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class MaxMessenger extends MethodSelectorWithTimerCodeState {
        public static final Parcelable.Creator<MaxMessenger> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final Long g;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<MaxMessenger> {
            @Override // android.os.Parcelable.Creator
            public final MaxMessenger createFromParcel(Parcel parcel) {
                return new MaxMessenger(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final MaxMessenger[] newArray(int i) {
                return new MaxMessenger[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MaxMessenger(String str, String str2, String str3, boolean z, Long l) {
            super(null, 1, 0 == true ? 1 : 0);
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = z;
            this.g = l;
        }

        @Override // com.vk.auth.verification.base.states.MethodSelectorCodeState.MethodSelectorWithTimerCodeState
        public final Long e() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            Long l = this.g;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class MaxOtpCode extends MethodSelectorWithTimerCodeState {
        public static final Parcelable.Creator<MaxOtpCode> CREATOR = new a();
        public final int c;
        public final Long d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<MaxOtpCode> {
            @Override // android.os.Parcelable.Creator
            public final MaxOtpCode createFromParcel(Parcel parcel) {
                return new MaxOtpCode(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final MaxOtpCode[] newArray(int i) {
                return new MaxOtpCode[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MaxOtpCode(int i, Long l, String str, String str2, boolean z, boolean z2) {
            super(null, 1, 0 == true ? 1 : 0);
            this.c = i;
            this.d = l;
            this.e = str;
            this.f = str2;
            this.g = z;
            this.h = z2;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.c;
        }

        @Override // com.vk.auth.verification.base.states.MethodSelectorCodeState.MethodSelectorWithTimerCodeState
        public final Long e() {
            return this.d;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            Long l = this.d;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static abstract class MethodSelectorWithTimerCodeState extends MethodSelectorCodeState {
        public final Long b;

        public /* synthetic */ MethodSelectorWithTimerCodeState(Long l, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : l, null);
        }

        public Long e() {
            return this.b;
        }

        public MethodSelectorWithTimerCodeState(Long l, zcl zclVar) {
            super(null);
            this.b = l;
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class OfficialMessenger extends MethodSelectorCodeState {
        public static final Parcelable.Creator<OfficialMessenger> CREATOR = new a();
        public final int b;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<OfficialMessenger> {
            @Override // android.os.Parcelable.Creator
            public final OfficialMessenger createFromParcel(Parcel parcel) {
                return new OfficialMessenger(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OfficialMessenger[] newArray(int i) {
                return new OfficialMessenger[i];
            }
        }

        public OfficialMessenger(int i) {
            super(null);
            this.b = i;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Passkey extends MethodSelectorCodeState {
        public static final Parcelable.Creator<Passkey> CREATOR = new a();
        public final boolean b;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Passkey> {
            @Override // android.os.Parcelable.Creator
            public final Passkey createFromParcel(Parcel parcel) {
                return new Passkey(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Passkey[] newArray(int i) {
                return new Passkey[i];
            }
        }

        public Passkey(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Push extends MethodSelectorCodeState {
        public static final Parcelable.Creator<Push> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Push> {
            @Override // android.os.Parcelable.Creator
            public final Push createFromParcel(Parcel parcel) {
                return new Push(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Push[] newArray(int i) {
                return new Push[i];
            }
        }

        public Push(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Reserve extends MethodSelectorCodeState {
        public static final Parcelable.Creator<Reserve> CREATOR = new a();

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Reserve> {
            @Override // android.os.Parcelable.Creator
            public final Reserve createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new Reserve();
            }

            @Override // android.os.Parcelable.Creator
            public final Reserve[] newArray(int i) {
                return new Reserve[i];
            }
        }

        public Reserve() {
            super(null);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MethodSelectorCodeState.kt */
    public static final class Sms extends MethodSelectorCodeState {
        public static final Parcelable.Creator<Sms> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: MethodSelectorCodeState.kt */
        public static final class a implements Parcelable.Creator<Sms> {
            @Override // android.os.Parcelable.Creator
            public final Sms createFromParcel(Parcel parcel) {
                return new Sms(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Sms[] newArray(int i) {
                return new Sms[i];
            }
        }

        public Sms(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.b;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    public /* synthetic */ MethodSelectorCodeState(zcl zclVar) {
        this();
    }

    public MethodSelectorCodeState() {
        super(null);
    }
}
