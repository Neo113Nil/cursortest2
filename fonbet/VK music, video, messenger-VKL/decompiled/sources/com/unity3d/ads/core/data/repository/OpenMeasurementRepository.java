package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import xsna.spj;

/* compiled from: OpenMeasurementRepository.kt */
/* loaded from: classes14.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, spj<? super OMResult> spjVar);

    Object finishSession(ByteString byteString, spj<? super OMResult> spjVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, spj<? super OMResult> spjVar);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, spj<? super OMResult> spjVar);
}
