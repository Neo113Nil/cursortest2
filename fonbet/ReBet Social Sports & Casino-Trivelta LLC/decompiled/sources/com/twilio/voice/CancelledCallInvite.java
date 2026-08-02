package com.twilio.voice;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class CancelledCallInvite implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.twilio.voice.CancelledCallInvite.1
        @Override // android.os.Parcelable.Creator
        public CancelledCallInvite createFromParcel(Parcel parcel) {
            return new CancelledCallInvite(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CancelledCallInvite[] newArray(int i10) {
            return new CancelledCallInvite[i10];
        }
    };
    private final String callSid;
    final Map<String, String> cancelledCallInviteMessage;
    final Map<String, String> customParameters;
    private final String from;
    private final String to;

    public static CancelledCallInvite create(Map<String, String> map) {
        return new CancelledCallInvite(map);
    }

    public static boolean isValid(Map<String, String> map) {
        String str = map.get(VoiceConstants.VOICE_TWI_MESSAGE_TYPE);
        return (str == null || !str.equals(VoiceConstants.MESSAGE_TYPE_CANCEL) || map.get(VoiceConstants.CALL_SID) == null || map.get(VoiceConstants.TO) == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CancelledCallInvite) {
            CancelledCallInvite cancelledCallInvite = (CancelledCallInvite) obj;
            if (getFrom().equals(cancelledCallInvite.getFrom()) && getTo().equals(cancelledCallInvite.getTo()) && getCallSid().equals(cancelledCallInvite.getCallSid())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getCallSid() {
        return this.callSid;
    }

    @NonNull
    public Map<String, String> getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    @NonNull
    public String getTo() {
        return this.to;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringArray(new String[]{this.from, this.to, this.callSid});
        parcel.writeInt(this.cancelledCallInviteMessage.size());
        for (Map.Entry<String, String> entry : this.cancelledCallInviteMessage.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map = this.customParameters;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry2 : this.customParameters.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
    }

    private CancelledCallInvite(Map<String, String> map) {
        this.from = map.get(VoiceConstants.FROM);
        this.to = map.get(VoiceConstants.TO);
        this.callSid = map.get(VoiceConstants.CALL_SID);
        HashMap hashMap = new HashMap();
        this.customParameters = hashMap;
        String str = map.get(VoiceConstants.CUSTOM_PARAMS);
        if (str != null) {
            Utils.parseCustomParams(str, hashMap);
        }
        this.cancelledCallInviteMessage = map;
    }

    private CancelledCallInvite(Parcel parcel) {
        String[] strArr = new String[3];
        parcel.readStringArray(strArr);
        this.from = strArr[0];
        this.to = strArr[1];
        this.callSid = strArr[2];
        int readInt = parcel.readInt();
        this.cancelledCallInviteMessage = new HashMap(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.cancelledCallInviteMessage.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.customParameters = new HashMap(readInt2);
        for (int i11 = 0; i11 < readInt2; i11++) {
            this.customParameters.put(parcel.readString(), parcel.readString());
        }
    }
}
