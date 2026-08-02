package io.intercom.android.sdk;

import com.turboimage.events.FailureEvent;
import com.turboimage.events.SuccessEvent;
import kotlin.Metadata;

/* compiled from: IntercomStatusCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/IntercomStatusCallback;", "", SuccessEvent.EVENT_NAME, "", FailureEvent.EVENT_NAME, "intercomError", "Lio/intercom/android/sdk/IntercomError;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface IntercomStatusCallback {
    void onFailure(IntercomError intercomError);

    void onSuccess();
}
