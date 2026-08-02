package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesGetCallInteractionConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallInteractionConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetCallInteractionConfigResponseDto> CREATOR = new a();

    @pmi0("accept_button_icon_url")
    private final String acceptButtonIconUrl;

    @pmi0("accept_button_text")
    private final String acceptButtonText;

    @pmi0("accept_with_video_button_icon_url")
    private final String acceptWithVideoButtonIconUrl;

    @pmi0("accept_with_video_button_text")
    private final String acceptWithVideoButtonText;

    @pmi0("action_type")
    private final String actionType;

    @pmi0("action_value")
    private final String actionValue;

    @pmi0("burger_menu_action_text")
    private final String burgerMenuActionText;

    @pmi0("burger_menu_icon_url")
    private final String burgerMenuIconUrl;

    @pmi0("button_gradient_end_color")
    private final String buttonGradientEndColor;

    @pmi0("button_gradient_start_color")
    private final String buttonGradientStartColor;

    @pmi0("cancel_incoming_button_text")
    private final String cancelIncomingButtonText;

    @pmi0("cancel_outgoing_button_text")
    private final String cancelOutgoingButtonText;

    @pmi0("declined_text")
    private final String declinedText;

    @pmi0("enable_camera_to_request_interaction_message")
    private final String enableCameraToRequestInteractionMessage;

    @pmi0("enable_camera_to_request_interaction_title")
    private final String enableCameraToRequestInteractionTitle;

    @pmi0("hide_button_text")
    private final String hideButtonText;

    @pmi0("incoming_request_message")
    private final String incomingRequestMessage;

    @pmi0("interaction_id")
    private final String interactionId;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("opponent_success_text")
    private final String opponentSuccessText;

    @pmi0("outgoing_request_message")
    private final String outgoingRequestMessage;

    @pmi0("request_button_text")
    private final String requestButtonText;

    @pmi0("request_button_visible")
    private final Boolean requestButtonVisible;

    @pmi0("request_hint_message")
    private final String requestHintMessage;

    @pmi0("request_hint_title")
    private final String requestHintTitle;

    @pmi0("stop_button_text")
    private final String stopButtonText;

    @pmi0("success_text")
    private final String successText;

    @pmi0("vibration_duration_ms")
    private final Integer vibrationDurationMs;

    /* compiled from: MessagesGetCallInteractionConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallInteractionConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallInteractionConfigResponseDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z3 = z2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString21 = parcel.readString();
            Integer num = valueOf;
            String readString22 = parcel.readString();
            Boolean bool = null;
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            boolean z4 = z3;
            String readString25 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                bool = Boolean.valueOf(z4);
            }
            return new MessagesGetCallInteractionConfigResponseDto(z, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, num, readString21, readString22, readString23, readString24, readString25, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallInteractionConfigResponseDto[] newArray(int i) {
            return new MessagesGetCallInteractionConfigResponseDto[i];
        }
    }

    public MessagesGetCallInteractionConfigResponseDto(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num, String str21, String str22, String str23, String str24, String str25, Boolean bool) {
        this.isEnabled = z;
        this.interactionId = str;
        this.buttonGradientStartColor = str2;
        this.buttonGradientEndColor = str3;
        this.requestButtonText = str4;
        this.requestHintTitle = str5;
        this.requestHintMessage = str6;
        this.hideButtonText = str7;
        this.outgoingRequestMessage = str8;
        this.incomingRequestMessage = str9;
        this.opponentSuccessText = str10;
        this.successText = str11;
        this.cancelOutgoingButtonText = str12;
        this.cancelIncomingButtonText = str13;
        this.acceptButtonText = str14;
        this.acceptButtonIconUrl = str15;
        this.acceptWithVideoButtonText = str16;
        this.acceptWithVideoButtonIconUrl = str17;
        this.declinedText = str18;
        this.burgerMenuActionText = str19;
        this.burgerMenuIconUrl = str20;
        this.vibrationDurationMs = num;
        this.actionType = str21;
        this.actionValue = str22;
        this.stopButtonText = str23;
        this.enableCameraToRequestInteractionTitle = str24;
        this.enableCameraToRequestInteractionMessage = str25;
        this.requestButtonVisible = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetCallInteractionConfigResponseDto)) {
            return false;
        }
        MessagesGetCallInteractionConfigResponseDto messagesGetCallInteractionConfigResponseDto = (MessagesGetCallInteractionConfigResponseDto) obj;
        return this.isEnabled == messagesGetCallInteractionConfigResponseDto.isEnabled && epx.f(this.interactionId, messagesGetCallInteractionConfigResponseDto.interactionId) && epx.f(this.buttonGradientStartColor, messagesGetCallInteractionConfigResponseDto.buttonGradientStartColor) && epx.f(this.buttonGradientEndColor, messagesGetCallInteractionConfigResponseDto.buttonGradientEndColor) && epx.f(this.requestButtonText, messagesGetCallInteractionConfigResponseDto.requestButtonText) && epx.f(this.requestHintTitle, messagesGetCallInteractionConfigResponseDto.requestHintTitle) && epx.f(this.requestHintMessage, messagesGetCallInteractionConfigResponseDto.requestHintMessage) && epx.f(this.hideButtonText, messagesGetCallInteractionConfigResponseDto.hideButtonText) && epx.f(this.outgoingRequestMessage, messagesGetCallInteractionConfigResponseDto.outgoingRequestMessage) && epx.f(this.incomingRequestMessage, messagesGetCallInteractionConfigResponseDto.incomingRequestMessage) && epx.f(this.opponentSuccessText, messagesGetCallInteractionConfigResponseDto.opponentSuccessText) && epx.f(this.successText, messagesGetCallInteractionConfigResponseDto.successText) && epx.f(this.cancelOutgoingButtonText, messagesGetCallInteractionConfigResponseDto.cancelOutgoingButtonText) && epx.f(this.cancelIncomingButtonText, messagesGetCallInteractionConfigResponseDto.cancelIncomingButtonText) && epx.f(this.acceptButtonText, messagesGetCallInteractionConfigResponseDto.acceptButtonText) && epx.f(this.acceptButtonIconUrl, messagesGetCallInteractionConfigResponseDto.acceptButtonIconUrl) && epx.f(this.acceptWithVideoButtonText, messagesGetCallInteractionConfigResponseDto.acceptWithVideoButtonText) && epx.f(this.acceptWithVideoButtonIconUrl, messagesGetCallInteractionConfigResponseDto.acceptWithVideoButtonIconUrl) && epx.f(this.declinedText, messagesGetCallInteractionConfigResponseDto.declinedText) && epx.f(this.burgerMenuActionText, messagesGetCallInteractionConfigResponseDto.burgerMenuActionText) && epx.f(this.burgerMenuIconUrl, messagesGetCallInteractionConfigResponseDto.burgerMenuIconUrl) && epx.f(this.vibrationDurationMs, messagesGetCallInteractionConfigResponseDto.vibrationDurationMs) && epx.f(this.actionType, messagesGetCallInteractionConfigResponseDto.actionType) && epx.f(this.actionValue, messagesGetCallInteractionConfigResponseDto.actionValue) && epx.f(this.stopButtonText, messagesGetCallInteractionConfigResponseDto.stopButtonText) && epx.f(this.enableCameraToRequestInteractionTitle, messagesGetCallInteractionConfigResponseDto.enableCameraToRequestInteractionTitle) && epx.f(this.enableCameraToRequestInteractionMessage, messagesGetCallInteractionConfigResponseDto.enableCameraToRequestInteractionMessage) && epx.f(this.requestButtonVisible, messagesGetCallInteractionConfigResponseDto.requestButtonVisible);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.interactionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonGradientStartColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonGradientEndColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestButtonText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requestHintTitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.requestHintMessage;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hideButtonText;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.outgoingRequestMessage;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.incomingRequestMessage;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.opponentSuccessText;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.successText;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cancelOutgoingButtonText;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cancelIncomingButtonText;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.acceptButtonText;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.acceptButtonIconUrl;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.acceptWithVideoButtonText;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.acceptWithVideoButtonIconUrl;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.declinedText;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.burgerMenuActionText;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.burgerMenuIconUrl;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num = this.vibrationDurationMs;
        int hashCode22 = (hashCode21 + (num == null ? 0 : num.hashCode())) * 31;
        String str21 = this.actionType;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.actionValue;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.stopButtonText;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.enableCameraToRequestInteractionTitle;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.enableCameraToRequestInteractionMessage;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool = this.requestButtonVisible;
        return hashCode27 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetCallInteractionConfigResponseDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", interactionId=");
        sb.append(this.interactionId);
        sb.append(", buttonGradientStartColor=");
        sb.append(this.buttonGradientStartColor);
        sb.append(", buttonGradientEndColor=");
        sb.append(this.buttonGradientEndColor);
        sb.append(", requestButtonText=");
        sb.append(this.requestButtonText);
        sb.append(", requestHintTitle=");
        sb.append(this.requestHintTitle);
        sb.append(", requestHintMessage=");
        sb.append(this.requestHintMessage);
        sb.append(", hideButtonText=");
        sb.append(this.hideButtonText);
        sb.append(", outgoingRequestMessage=");
        sb.append(this.outgoingRequestMessage);
        sb.append(", incomingRequestMessage=");
        sb.append(this.incomingRequestMessage);
        sb.append(", opponentSuccessText=");
        sb.append(this.opponentSuccessText);
        sb.append(", successText=");
        sb.append(this.successText);
        sb.append(", cancelOutgoingButtonText=");
        sb.append(this.cancelOutgoingButtonText);
        sb.append(", cancelIncomingButtonText=");
        sb.append(this.cancelIncomingButtonText);
        sb.append(", acceptButtonText=");
        sb.append(this.acceptButtonText);
        sb.append(", acceptButtonIconUrl=");
        sb.append(this.acceptButtonIconUrl);
        sb.append(", acceptWithVideoButtonText=");
        sb.append(this.acceptWithVideoButtonText);
        sb.append(", acceptWithVideoButtonIconUrl=");
        sb.append(this.acceptWithVideoButtonIconUrl);
        sb.append(", declinedText=");
        sb.append(this.declinedText);
        sb.append(", burgerMenuActionText=");
        sb.append(this.burgerMenuActionText);
        sb.append(", burgerMenuIconUrl=");
        sb.append(this.burgerMenuIconUrl);
        sb.append(", vibrationDurationMs=");
        sb.append(this.vibrationDurationMs);
        sb.append(", actionType=");
        sb.append(this.actionType);
        sb.append(", actionValue=");
        sb.append(this.actionValue);
        sb.append(", stopButtonText=");
        sb.append(this.stopButtonText);
        sb.append(", enableCameraToRequestInteractionTitle=");
        sb.append(this.enableCameraToRequestInteractionTitle);
        sb.append(", enableCameraToRequestInteractionMessage=");
        sb.append(this.enableCameraToRequestInteractionMessage);
        sb.append(", requestButtonVisible=");
        return tn.a(sb, this.requestButtonVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.interactionId);
        parcel.writeString(this.buttonGradientStartColor);
        parcel.writeString(this.buttonGradientEndColor);
        parcel.writeString(this.requestButtonText);
        parcel.writeString(this.requestHintTitle);
        parcel.writeString(this.requestHintMessage);
        parcel.writeString(this.hideButtonText);
        parcel.writeString(this.outgoingRequestMessage);
        parcel.writeString(this.incomingRequestMessage);
        parcel.writeString(this.opponentSuccessText);
        parcel.writeString(this.successText);
        parcel.writeString(this.cancelOutgoingButtonText);
        parcel.writeString(this.cancelIncomingButtonText);
        parcel.writeString(this.acceptButtonText);
        parcel.writeString(this.acceptButtonIconUrl);
        parcel.writeString(this.acceptWithVideoButtonText);
        parcel.writeString(this.acceptWithVideoButtonIconUrl);
        parcel.writeString(this.declinedText);
        parcel.writeString(this.burgerMenuActionText);
        parcel.writeString(this.burgerMenuIconUrl);
        Integer num = this.vibrationDurationMs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.actionType);
        parcel.writeString(this.actionValue);
        parcel.writeString(this.stopButtonText);
        parcel.writeString(this.enableCameraToRequestInteractionTitle);
        parcel.writeString(this.enableCameraToRequestInteractionMessage);
        Boolean bool = this.requestButtonVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesGetCallInteractionConfigResponseDto(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num, String str21, String str22, String str23, String str24, String str25, Boolean bool, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str20, (i & 2097152) != 0 ? null : num, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str23, (i & 33554432) != 0 ? null : str24, (i & 67108864) != 0 ? null : str25, (i & 134217728) != 0 ? null : bool);
    }
}
