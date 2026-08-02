package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.ironsource.U3;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import defpackage.au3;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.lm5;
import defpackage.rm5;
import defpackage.rq3;
import defpackage.tub;
import defpackage.xw3;
import defpackage.y9h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010 \u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n01008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020$008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R$\u0010;\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lau3;", "mainDispatcher", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "omidManager", "<init>", "(Lau3;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "adSession", "", "addSession", "(Lcom/google/protobuf/ByteString;Lcom/iab/omid/library/unity3d/adsession/AdSession;)V", "sessionFinished", "(Lcom/google/protobuf/ByteString;)V", "removeSession", "getSession", "(Lcom/google/protobuf/ByteString;)Lcom/iab/omid/library/unity3d/adsession/AdSession;", "Lcom/unity3d/ads/core/data/model/OMData;", "buildOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/model/OMResult;", "activateOM", "(Landroid/content/Context;Lrq3;)Ljava/lang/Object;", "Landroid/webkit/WebView;", "webView", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "options", "startSession", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Lrq3;)Ljava/lang/Object;", "finishSession", "(Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "", "signalLoaded", "impressionOccurred", "(Lcom/google/protobuf/ByteString;ZLrq3;)Ljava/lang/Object;", "hasSessionFinished", "(Lcom/google/protobuf/ByteString;)Z", "Lau3;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "kotlin.jvm.PlatformType", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "Lf1d;", "", "", "activeSessions", "Lf1d;", "", "finishedSessions", "_isOMActive", "getOmData", "omData", U3.i.X, "isOMActive", "()Z", "setOMActive", "(Z)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {

    @NotNull
    private final f1d _isOMActive;

    @NotNull
    private final f1d activeSessions;

    @NotNull
    private final f1d finishedSessions;

    @NotNull
    private final au3 mainDispatcher;

    @NotNull
    private final OmidManager omidManager;
    private final Partner partner;

    public AndroidOpenMeasurementRepository(@NotNull au3 au3Var, @NotNull OmidManager omidManager) {
        au3Var.getClass();
        omidManager.getClass();
        this.mainDispatcher = au3Var;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.19.0");
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.activeSessions = gdi.a(lm5Var);
        this.finishedSessions = gdi.a(rm5.a);
        this._isOMActive = gdi.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString opportunityId, AdSession adSession) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this.activeSessions;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, tub.l((Map) value, new Pair(opportunityId.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString opportunityId) {
        return (AdSession) ((Map) ((fdi) this.activeSessions).getValue()).get(opportunityId.toStringUtf8());
    }

    private final void removeSession(ByteString opportunityId) {
        fdi fdiVar;
        Object value;
        LinkedHashMap linkedHashMap;
        f1d f1dVar = this.activeSessions;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            Map map = (Map) value;
            String stringUtf8 = opportunityId.toStringUtf8();
            map.getClass();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(stringUtf8);
        } while (!fdiVar.k(value, tub.j(linkedHashMap)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString opportunityId) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this.finishedSessions;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, y9h.g((Set) value, opportunityId.toStringUtf8())));
        removeSession(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object activateOM(@NotNull Context context, @NotNull rq3<? super OMResult> rq3Var) {
        return xw3.R(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object finishSession(@NotNull ByteString byteString, @NotNull rq3<? super OMResult> rq3Var) {
        return xw3.R(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @NotNull
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        return ((Set) ((fdi) this.finishedSessions).getValue()).contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object impressionOccurred(@NotNull ByteString byteString, boolean z, @NotNull rq3<? super OMResult> rq3Var) {
        return xw3.R(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z, null), rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((fdi) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this._isOMActive;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            ((Boolean) value).getClass();
        } while (!fdiVar.k(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object startSession(@NotNull ByteString byteString, @Nullable WebView webView, @NotNull OmidOptions omidOptions, @NotNull rq3<? super OMResult> rq3Var) {
        return xw3.R(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), rq3Var);
    }
}
