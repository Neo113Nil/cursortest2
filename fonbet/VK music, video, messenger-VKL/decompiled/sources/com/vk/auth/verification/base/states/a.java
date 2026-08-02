package com.vk.auth.verification.base.states;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.libverify.mobile.id.MobileIdScreenType;
import xsna.qxm0;

/* compiled from: CodeStateParcelHelper.kt */
/* loaded from: classes15.dex */
public final class a {
    public static final C0421a a = new C0421a();

    /* compiled from: CodeStateParcelHelper.kt */
    /* renamed from: com.vk.auth.verification.base.states.a$a, reason: collision with other inner class name */
    public static final class C0421a implements Parcelable.Creator<CodeState> {
        @Override // android.os.Parcelable.Creator
        public final CodeState createFromParcel(Parcel parcel) {
            CodeState appWait;
            CodeState smsWait;
            CodeState callResetWait;
            CodeState emailWait;
            CodeState pushWait;
            switch (parcel.readInt()) {
                case 0:
                    appWait = new CodeState.AppWait(parcel.readLong(), parcel.readInt());
                    break;
                case 1:
                    smsWait = new CodeState.SmsWait(parcel.readLong(), parcel.readLong(), parcel.readInt());
                    appWait = smsWait;
                    break;
                case 2:
                    appWait = new CodeState.NotReceive(parcel.readLong());
                    break;
                case 3:
                    appWait = new CodeState.VoiceCallWait(parcel.readLong(), parcel.readLong());
                    break;
                case 4:
                    callResetWait = new CodeState.CallResetWait(parcel.readLong(), parcel.readLong(), parcel.readInt());
                    appWait = callResetWait;
                    break;
                case 5:
                    emailWait = new CodeState.EmailWait(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString());
                    appWait = emailWait;
                    break;
                case 6:
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    smsWait = new CodeState.CallResetWithPhoneWait(readLong, readLong2, readInt, readString == null ? "" : readString);
                    appWait = smsWait;
                    break;
                case 7:
                    pushWait = new CodeState.PushWait(parcel.readLong(), parcel.readLong(), parcel.readInt());
                    appWait = pushWait;
                    break;
                case 8:
                    appWait = new CodeState.Passkey(qxm0.v(parcel));
                    break;
                case 9:
                    String readString2 = parcel.readString();
                    String str = readString2 == null ? "" : readString2;
                    long readLong3 = parcel.readLong();
                    long readLong4 = parcel.readLong();
                    String readString3 = parcel.readString();
                    pushWait = new CodeState.CallInWait(str, readLong3, readLong4, readString3 == null ? "" : readString3, qxm0.v(parcel), qxm0.v(parcel));
                    appWait = pushWait;
                    break;
                case 10:
                    appWait = new CodeState.LibverifyMobileId((MobileIdScreenType) parcel.readParcelable(MobileIdScreenType.class.getClassLoader()));
                    break;
                case 11:
                    String readString4 = parcel.readString();
                    appWait = new CodeState.CallResetPreview(readString4 != null ? readString4 : "");
                    break;
                case 12:
                    String readString5 = parcel.readString();
                    appWait = new CodeState.LibverifyMessengersPushWait(readString5 != null ? readString5 : "", Integer.valueOf(parcel.readInt()), qxm0.v(parcel));
                    break;
                case 13:
                    long readLong5 = parcel.readLong();
                    long readLong6 = parcel.readLong();
                    String readString6 = parcel.readString();
                    String str2 = readString6 == null ? "" : readString6;
                    String readString7 = parcel.readString();
                    appWait = new CodeState.MaxMessengerWait(readLong5, readLong6, str2, readString7 == null ? "" : readString7);
                    break;
                case 14:
                    String readString8 = parcel.readString();
                    String str3 = readString8 == null ? "" : readString8;
                    String readString9 = parcel.readString();
                    callResetWait = new CodeState.SmsInbox(str3, readString9 == null ? "" : readString9, parcel.readInt(), parcel.readLong());
                    appWait = callResetWait;
                    break;
                case 15:
                    long readLong7 = parcel.readLong();
                    long readLong8 = parcel.readLong();
                    int readInt2 = parcel.readInt();
                    String readString10 = parcel.readString();
                    emailWait = new CodeState.MaxCodeWait(readLong7, readLong8, readInt2, readString10 == null ? "" : readString10, qxm0.v(parcel), qxm0.v(parcel));
                    appWait = emailWait;
                    break;
                case 16:
                    String readString11 = parcel.readString();
                    appWait = new CodeState.MessengerLoading(readString11 != null ? readString11 : "", Integer.valueOf(parcel.readInt()), parcel.readString());
                    break;
                case 17:
                    String readString12 = parcel.readString();
                    appWait = new CodeState.MessengerRegistration(readString12 != null ? readString12 : "", Integer.valueOf(parcel.readInt()), parcel.readString());
                    break;
                default:
                    appWait = null;
                    break;
            }
            if (appWait != null) {
                appWait.b = (CodeState) parcel.readParcelable(CodeState.class.getClassLoader());
            }
            return appWait;
        }

        @Override // android.os.Parcelable.Creator
        public final CodeState[] newArray(int i) {
            return new CodeState[i];
        }
    }
}
