package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes2.dex */
public interface MediaViewApi extends AdComponentViewApiProvider {
    void destroy();

    View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    int getVideoDuration();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView);

    boolean isVideoContent();

    void setListener(MediaViewListener mediaViewListener);

    void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer);
}
