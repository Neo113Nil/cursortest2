package io.intercom.android.sdk.helpcenter.api;

import com.turboimage.events.FailureEvent;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.sentry.protocol.Response;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CollectionRequestCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "", "onComplete", "", Response.TYPE, "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "onError", "errorCode", "", FailureEvent.EVENT_NAME, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface CollectionRequestCallback {
    void onComplete(List<HelpCenterCollection> response);

    void onError(int errorCode);

    void onFailure();
}
