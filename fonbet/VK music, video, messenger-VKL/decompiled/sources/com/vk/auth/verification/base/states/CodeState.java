package com.vk.auth.verification.base.states;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.verification.libverify.mobile.id.MobileIdScreenType;
import java.util.concurrent.TimeUnit;
import xsna.zcl;

/* compiled from: CodeState.kt */
/* loaded from: classes15.dex */
public abstract class CodeState extends BaseCodeState {
    public CodeState b;
    public CodeState c;
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final Parcelable.Creator<CodeState> CREATOR = a.a;

    /* compiled from: CodeState.kt */
    public static final class AppWait extends WithTime {
        public final int g;

        public AppWait(long j, int i) {
            super(j, 0L);
            this.g = i;
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class CallInWait extends CodeState {
        public final String e;
        public final long f;
        public final long g;
        public final String h;
        public final boolean i;
        public final boolean j;

        public CallInWait(String str, long j, long j2, String str2, boolean z, boolean z2) {
            super(null);
            this.e = str;
            this.f = j;
            this.g = j2;
            this.h = str2;
            this.i = z;
            this.j = z2;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class CallResetPreview extends CodeState {
        public final String e;

        public CallResetPreview(String str) {
            super(null);
            this.e = str;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class CallResetWithPhoneWait extends CallResetWait {
        public final String h;

        public CallResetWithPhoneWait(long j, long j2, int i, String str) {
            super(j, j2, i);
            this.h = str;
        }

        @Override // com.vk.auth.verification.base.states.CodeState.CallResetWait, com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L, 1, null);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class CheckAccess extends WithTime {
        public CheckAccess(long j, long j2) {
            super(j, j2);
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }

        public CheckAccess(long j, long j2, int i, zcl zclVar) {
            this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? CodeState.d : j2);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class EmailWait extends WithTime {
        public final int g;
        public final String h;

        public EmailWait() {
            this(0L, 0L, 0, null, 15, null);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }

        public EmailWait(long j, long j2, int i, String str, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? System.currentTimeMillis() : j, (i2 & 2) != 0 ? CodeState.d : j2, (i2 & 4) != 0 ? 6 : i, (i2 & 8) != 0 ? "" : str);
        }

        public EmailWait(long j, long j2, int i, String str) {
            super(j, j2);
            this.g = i;
            this.h = str;
        }
    }

    /* compiled from: CodeState.kt */
    public static final class LibverifyMessengersPushWait extends CodeState {
        public final String e;
        public final Integer f;
        public final boolean g;

        public /* synthetic */ LibverifyMessengersPushWait(String str, Integer num, boolean z, int i, zcl zclVar) {
            this(str, num, (i & 4) != 0 ? false : z);
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }

        public LibverifyMessengersPushWait(String str, Integer num, boolean z) {
            super(null);
            this.e = str;
            this.f = num;
            this.g = z;
        }
    }

    /* compiled from: CodeState.kt */
    public static final class LibverifyMobileId extends CodeState {
        public final MobileIdScreenType e;

        public LibverifyMobileId(MobileIdScreenType mobileIdScreenType) {
            super(null);
            this.e = mobileIdScreenType;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class MaxMessengerWait extends WithTime {
        public final String g;
        public final String h;

        public MaxMessengerWait(long j, long j2, String str, String str2) {
            super(j, j2);
            this.g = str;
            this.h = str2;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L, 1, null);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class MessengerLoading extends CodeState {
        public final String e;
        public final Integer f;
        public final String g;

        public MessengerLoading(String str, Integer num, String str2) {
            super(null);
            this.e = str;
            this.f = num;
            this.g = str2;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class MessengerRegistration extends CodeState {
        public final String e;
        public final Integer f;
        public final String g;

        public MessengerRegistration(String str, Integer num, String str2) {
            super(null);
            this.e = str;
            this.f = num;
            this.g = str2;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class NotReceive extends CodeState {
        public final long e;

        public NotReceive() {
            this(0L, 1, null);
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new SmsWait(System.currentTimeMillis(), this.e, 0, 4, null);
        }

        public NotReceive(long j) {
            super(null);
            this.e = j;
        }

        public NotReceive(long j, int i, zcl zclVar) {
            this((i & 1) != 0 ? CodeState.d : j);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class Passkey extends CodeState {
        public final boolean e;

        public Passkey(boolean z) {
            super(null);
            this.e = z;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class PushWait extends WithTime {
        public final int g;

        public PushWait(long j, long j2, int i, int i2, zcl zclVar) {
            this(j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 6 : i);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }

        public PushWait(long j, long j2, int i) {
            super(j, j2);
            this.g = i;
        }
    }

    /* compiled from: CodeState.kt */
    public static final class SmsInbox extends CodeState {
        public final String e;
        public final String f;
        public final int g;
        public final long h;

        public SmsInbox(String str, String str2, int i, long j) {
            super(null);
            this.e = str;
            this.f = str2;
            this.g = i;
            this.h = j;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static final class VoiceCallWait extends WithTime {
        public VoiceCallWait(long j, long j2) {
            super(j, j2);
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L);
        }
    }

    /* compiled from: CodeState.kt */
    public static abstract class WithTime extends CodeState {
        public final long e;
        public final long f;

        public WithTime(long j, long j2) {
            super(null);
            this.e = j;
            this.f = j2;
        }
    }

    public /* synthetic */ CodeState(zcl zclVar) {
        this();
    }

    public final CodeState e() {
        CodeState codeState;
        return (!(this instanceof NotReceive) || (codeState = this.b) == null) ? this : codeState;
    }

    public abstract CodeState f();

    @Override // com.vk.auth.verification.base.states.BaseCodeState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof AppWait) {
            AppWait appWait = (AppWait) this;
            parcel.writeInt(0);
            parcel.writeLong(appWait.e);
            parcel.writeInt(appWait.g);
        } else if (this instanceof SmsWait) {
            SmsWait smsWait = (SmsWait) this;
            parcel.writeInt(1);
            parcel.writeLong(smsWait.e);
            parcel.writeLong(smsWait.f);
            parcel.writeInt(smsWait.g);
        } else if (this instanceof PushWait) {
            PushWait pushWait = (PushWait) this;
            parcel.writeInt(7);
            parcel.writeLong(pushWait.e);
            parcel.writeLong(pushWait.f);
            parcel.writeInt(pushWait.g);
        } else if (this instanceof NotReceive) {
            parcel.writeInt(2);
            parcel.writeLong(((NotReceive) this).e);
        } else if (this instanceof VoiceCallWait) {
            VoiceCallWait voiceCallWait = (VoiceCallWait) this;
            parcel.writeInt(3);
            parcel.writeLong(voiceCallWait.e);
            parcel.writeLong(voiceCallWait.f);
        } else if (this instanceof CallResetWithPhoneWait) {
            CallResetWithPhoneWait callResetWithPhoneWait = (CallResetWithPhoneWait) this;
            parcel.writeInt(6);
            parcel.writeLong(callResetWithPhoneWait.e);
            parcel.writeLong(callResetWithPhoneWait.f);
            parcel.writeInt(callResetWithPhoneWait.g);
            parcel.writeString(callResetWithPhoneWait.h);
        } else if (this instanceof CallResetWait) {
            CallResetWait callResetWait = (CallResetWait) this;
            parcel.writeInt(4);
            parcel.writeLong(callResetWait.e);
            parcel.writeLong(callResetWait.f);
            parcel.writeInt(callResetWait.g);
        } else if (this instanceof EmailWait) {
            EmailWait emailWait = (EmailWait) this;
            parcel.writeInt(5);
            parcel.writeLong(emailWait.e);
            parcel.writeLong(emailWait.f);
            parcel.writeInt(emailWait.g);
            parcel.writeString(emailWait.h);
        } else if (this instanceof Passkey) {
            parcel.writeInt(8);
            parcel.writeByte(((Passkey) this).e ? (byte) 1 : (byte) 0);
        } else if (this instanceof LibverifyMobileId) {
            parcel.writeInt(10);
            parcel.writeParcelable(((LibverifyMobileId) this).e, i);
        } else if (this instanceof CallInWait) {
            CallInWait callInWait = (CallInWait) this;
            parcel.writeInt(9);
            parcel.writeString(callInWait.e);
            parcel.writeLong(callInWait.f);
            parcel.writeLong(callInWait.g);
            parcel.writeString(callInWait.h);
            parcel.writeByte(callInWait.i ? (byte) 1 : (byte) 0);
            parcel.writeByte(callInWait.j ? (byte) 1 : (byte) 0);
        } else if (this instanceof CallResetPreview) {
            parcel.writeInt(11);
            parcel.writeString(((CallResetPreview) this).e);
        } else {
            if (this instanceof LibverifyMessengersPushWait) {
                LibverifyMessengersPushWait libverifyMessengersPushWait = (LibverifyMessengersPushWait) this;
                parcel.writeInt(12);
                parcel.writeString(libverifyMessengersPushWait.e);
                Integer num = libverifyMessengersPushWait.f;
                parcel.writeInt(num != null ? num.intValue() : -1);
                parcel.writeByte(libverifyMessengersPushWait.g ? (byte) 1 : (byte) 0);
            } else if (this instanceof MaxMessengerWait) {
                MaxMessengerWait maxMessengerWait = (MaxMessengerWait) this;
                parcel.writeInt(13);
                parcel.writeLong(maxMessengerWait.e);
                parcel.writeLong(maxMessengerWait.f);
                parcel.writeString(maxMessengerWait.g);
                parcel.writeString(maxMessengerWait.h);
            } else if (this instanceof SmsInbox) {
                SmsInbox smsInbox = (SmsInbox) this;
                parcel.writeInt(14);
                parcel.writeString(smsInbox.f);
                parcel.writeString(smsInbox.e);
                parcel.writeInt(smsInbox.g);
                parcel.writeLong(smsInbox.h);
            } else if (this instanceof MaxCodeWait) {
                MaxCodeWait maxCodeWait = (MaxCodeWait) this;
                parcel.writeInt(15);
                parcel.writeLong(maxCodeWait.e);
                parcel.writeLong(maxCodeWait.f);
                parcel.writeInt(maxCodeWait.g);
                parcel.writeString(maxCodeWait.h);
                parcel.writeByte(maxCodeWait.i ? (byte) 1 : (byte) 0);
                parcel.writeByte(maxCodeWait.j ? (byte) 1 : (byte) 0);
            } else if (this instanceof MessengerLoading) {
                MessengerLoading messengerLoading = (MessengerLoading) this;
                parcel.writeInt(16);
                parcel.writeString(messengerLoading.e);
                Integer num2 = messengerLoading.f;
                parcel.writeInt(num2 != null ? num2.intValue() : -1);
                parcel.writeString(messengerLoading.g);
            } else {
                if (!(this instanceof MessengerRegistration)) {
                    return;
                }
                MessengerRegistration messengerRegistration = (MessengerRegistration) this;
                parcel.writeInt(17);
                parcel.writeString(messengerRegistration.e);
                Integer num3 = messengerRegistration.f;
                parcel.writeInt(num3 != null ? num3.intValue() : -1);
                parcel.writeString(messengerRegistration.g);
            }
        }
        parcel.writeParcelable(this.b, i);
    }

    /* compiled from: CodeState.kt */
    public static class CallResetWait extends WithTime {
        public final int g;

        public CallResetWait(long j, long j2, int i, int i2, zcl zclVar) {
            this(j, (i2 & 2) != 0 ? CodeState.d : j2, (i2 & 4) != 0 ? 4 : i);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public CodeState f() {
            return new NotReceive(0L, 1, null);
        }

        public CallResetWait(long j, long j2, int i) {
            super(j, j2);
            this.g = i;
        }
    }

    /* compiled from: CodeState.kt */
    public static final class MaxCodeWait extends WithTime {
        public final int g;
        public final String h;
        public final boolean i;
        public final boolean j;

        public MaxCodeWait(long j, long j2, int i, String str, boolean z, boolean z2, int i2, zcl zclVar) {
            this(j, (i2 & 2) != 0 ? CodeState.d : j2, (i2 & 4) != 0 ? 6 : i, str, z, z2);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L, 1, null);
        }

        public MaxCodeWait(long j, long j2, int i, String str, boolean z, boolean z2) {
            super(j, j2);
            this.g = i;
            this.h = str;
            this.i = z;
            this.j = z2;
        }
    }

    /* compiled from: CodeState.kt */
    public static final class SmsWait extends WithTime {
        public final int g;

        public SmsWait(long j, long j2, int i, int i2, zcl zclVar) {
            this(j, (i2 & 2) != 0 ? CodeState.d : j2, (i2 & 4) != 0 ? 6 : i);
        }

        @Override // com.vk.auth.verification.base.states.BaseCodeState
        public final int d() {
            return this.g;
        }

        @Override // com.vk.auth.verification.base.states.CodeState
        public final CodeState f() {
            return new NotReceive(0L, 1, null);
        }

        public SmsWait(long j, long j2, int i) {
            super(j, j2);
            this.g = i;
        }
    }

    public CodeState() {
        super(null);
    }
}
