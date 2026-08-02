package com.twilio.voice;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import com.twilio.voice.Constants;
import com.twilio.voice.EventPayload;

/* loaded from: classes4.dex */
public class CallMessageListenerProxy implements Call.CallMessageListener {
    private final Call.CallMessageListener callMessageListener;
    private Handler handler = Utils.createHandler();
    private final EventPublisher publisher;

    public CallMessageListenerProxy(@NonNull EventPublisher eventPublisher, Call.CallMessageListener callMessageListener) {
        this.publisher = eventPublisher;
        this.callMessageListener = callMessageListener;
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageFailure(final String str, final String str2, final VoiceException voiceException) {
        InsightsUtils.publishCallMessageSendFailedEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType("application/json").voiceEventSid(str2).errorCode(Long.valueOf(voiceException.getErrorCode())).errorMessage(voiceException.getLocalizedMessage()).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.w
                @Override // java.lang.Runnable
                public final void run() {
                    CallMessageListenerProxy.this.callMessageListener.onMessageFailure(str, str2, voiceException);
                }
            });
        }
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageReceived(final String str, final CallMessage callMessage) {
        InsightsUtils.publishCallMessageReceivedEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType("application/json").callMessageEventType(Constants.CallMessageEventType.RECEIVED).voiceEventSid(callMessage.getVoiceEventSID()).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.v
                @Override // java.lang.Runnable
                public final void run() {
                    CallMessageListenerProxy.this.callMessageListener.onMessageReceived(str, callMessage);
                }
            });
        }
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageSent(final String str, final String str2) {
        InsightsUtils.publishCallMessageSentEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType("application/json").callMessageEventType(Constants.CallMessageEventType.SENT).voiceEventSid(str2).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.u
                @Override // java.lang.Runnable
                public final void run() {
                    CallMessageListenerProxy.this.callMessageListener.onMessageSent(str, str2);
                }
            });
        }
    }
}
