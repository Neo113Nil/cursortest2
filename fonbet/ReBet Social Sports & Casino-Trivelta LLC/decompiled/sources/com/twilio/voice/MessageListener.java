package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface MessageListener {
    void onCallInvite(@NonNull CallInvite callInvite);

    void onCancelledCallInvite(@NonNull CancelledCallInvite cancelledCallInvite, CallException callException);
}
