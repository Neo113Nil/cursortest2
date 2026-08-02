package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.izi0;
import xsna.jgp;
import xsna.myc0;
import xsna.ovj;
import xsna.pn00;
import xsna.spj;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: AndroidOpenMeasurementRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final ovj mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.19.0");
    private final xh50<Map<String, AdSession>> activeSessions = vtk0.a(jgp.b);
    private final xh50<Set<String>> finishedSessions = vtk0.a(EmptySet.b);
    private final xh50<Boolean> _isOMActive = vtk0.a(Boolean.FALSE);

    public AndroidOpenMeasurementRepository(ovj ovjVar, OmidManager omidManager) {
        this.mainDispatcher = ovjVar;
        this.omidManager = omidManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, AdSession adSession) {
        Map<String, AdSession> value;
        xh50<Map<String, AdSession>> xh50Var = this.activeSessions;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, pn00.o(value, new Pair(byteString.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString byteString) {
        return this.activeSessions.getValue().get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        Map<String, AdSession> value;
        xh50<Map<String, AdSession>> xh50Var = this.activeSessions;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, pn00.l(byteString.toStringUtf8(), value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        Set<String> value;
        xh50<Set<String>> xh50Var = this.finishedSessions;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, izi0.k(value, byteString.toStringUtf8())));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, spj<? super OMResult> spjVar) {
        return myc0.k(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, spj<? super OMResult> spjVar) {
        return myc0.k(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString byteString) {
        return this.finishedSessions.getValue().contains(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z, spj<? super OMResult> spjVar) {
        return myc0.k(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z, null), spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        Boolean value;
        xh50<Boolean> xh50Var = this._isOMActive;
        do {
            value = xh50Var.getValue();
            value.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, spj<? super OMResult> spjVar) {
        return myc0.k(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), spjVar);
    }
}
