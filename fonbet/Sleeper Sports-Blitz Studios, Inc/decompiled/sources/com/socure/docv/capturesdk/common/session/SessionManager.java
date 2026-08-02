package com.socure.docv.capturesdk.common.session;

import com.socure.docv.capturesdk.api.SocureDocVContext;
import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.pipeline.model.SelfieRange;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionManager.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010I\u001a\u00020JJ\b\u0010K\u001a\u00020JH\u0002J\u0006\u0010L\u001a\u00020JR:\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b$\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010\u0011R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013R\u001a\u0010?\u001a\u00020@X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010\u0011R\u0011\u0010G\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bH\u0010&¨\u0006M"}, d2 = {"Lcom/socure/docv/capturesdk/common/session/SessionManager;", "", "()V", "captureMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getCaptureMap", "()Ljava/util/HashMap;", "setCaptureMap", "(Ljava/util/HashMap;)V", "capturedImages", "", "getCapturedImages", "setCapturedImages", "deviceSessionToken", "getDeviceSessionToken", "()Ljava/lang/String;", "setDeviceSessionToken", "(Ljava/lang/String;)V", "deviceUrl", "getDeviceUrl", "docUploadUuid", "getDocUploadUuid", "setDocUploadUuid", "documentsReferenceId", "getDocumentsReferenceId", "setDocumentsReferenceId", "docvUrl", "getDocvUrl", "eventId", "getEventId", "setEventId", "extractionData", "getExtractionData", "setExtractionData", "isMixPanelEnabled", "", "()Z", "manualCaptureTimeout", "", "getManualCaptureTimeout", "()J", "setManualCaptureTimeout", "(J)V", "publicKey", "getPublicKey", "selectedDocument", "Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "getSelectedDocument", "()Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "setSelectedDocument", "(Lcom/socure/docv/capturesdk/common/analytics/DocSelection;)V", "selfieFaceAngleRanges", "", "Lcom/socure/docv/capturesdk/core/pipeline/model/SelfieRange;", "getSelfieFaceAngleRanges", "()Ljava/util/List;", "setSelfieFaceAngleRanges", "(Ljava/util/List;)V", "sessionToken", "getSessionToken", "setSessionToken", "socureDocVContext", "Lcom/socure/docv/capturesdk/api/SocureDocVContext;", "getSocureDocVContext", "()Lcom/socure/docv/capturesdk/api/SocureDocVContext;", "setSocureDocVContext", "(Lcom/socure/docv/capturesdk/api/SocureDocVContext;)V", "transactionToken", "getTransactionToken", "useSocureGov", "getUseSocureGov", "clear", "", "clearCapturedImageMap", "clearDocData", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionManager {
    private static String deviceSessionToken;
    private static String docUploadUuid;
    private static String documentsReferenceId;
    private static String eventId;
    private static String extractionData;
    private static DocSelection selectedDocument;
    private static String sessionToken;
    public static SocureDocVContext socureDocVContext;
    public static final SessionManager INSTANCE = new SessionManager();
    private static long manualCaptureTimeout = 20000;
    private static HashMap<String, String> captureMap = new HashMap<>();
    private static HashMap<String, byte[]> capturedImages = new HashMap<>();
    private static List<SelfieRange> selfieFaceAngleRanges = UtilsKt.getDefaultSelfieRangeValues();

    private SessionManager() {
    }

    public final SocureDocVContext getSocureDocVContext() {
        SocureDocVContext socureDocVContext2 = socureDocVContext;
        if (socureDocVContext2 != null) {
            return socureDocVContext2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socureDocVContext");
        return null;
    }

    public final void setSocureDocVContext(SocureDocVContext socureDocVContext2) {
        Intrinsics.checkNotNullParameter(socureDocVContext2, "<set-?>");
        socureDocVContext = socureDocVContext2;
    }

    public final String getPublicKey() {
        return getSocureDocVContext().getPublicKey();
    }

    public final String getTransactionToken() {
        return getSocureDocVContext().getTransactionToken();
    }

    public final boolean getUseSocureGov() {
        return getSocureDocVContext().getUseSocureGov();
    }

    public final String getDocvUrl() {
        return getSocureDocVContext().getDocvBaseUrl();
    }

    public final String getDeviceUrl() {
        return getSocureDocVContext().getDeviceBaseUrl();
    }

    public final String getSessionToken() {
        return sessionToken;
    }

    public final void setSessionToken(String str) {
        sessionToken = str;
    }

    public final String getDeviceSessionToken() {
        return deviceSessionToken;
    }

    public final void setDeviceSessionToken(String str) {
        deviceSessionToken = str;
    }

    public final String getDocUploadUuid() {
        return docUploadUuid;
    }

    public final void setDocUploadUuid(String str) {
        docUploadUuid = str;
    }

    public final String getDocumentsReferenceId() {
        return documentsReferenceId;
    }

    public final void setDocumentsReferenceId(String str) {
        documentsReferenceId = str;
    }

    public final String getEventId() {
        return eventId;
    }

    public final void setEventId(String str) {
        eventId = str;
    }

    public final long getManualCaptureTimeout() {
        return manualCaptureTimeout;
    }

    public final void setManualCaptureTimeout(long j) {
        manualCaptureTimeout = j;
    }

    public final HashMap<String, String> getCaptureMap() {
        return captureMap;
    }

    public final void setCaptureMap(HashMap<String, String> hashMap) {
        captureMap = hashMap;
    }

    public final HashMap<String, byte[]> getCapturedImages() {
        return capturedImages;
    }

    public final void setCapturedImages(HashMap<String, byte[]> hashMap) {
        capturedImages = hashMap;
    }

    public final String getExtractionData() {
        return extractionData;
    }

    public final void setExtractionData(String str) {
        extractionData = str;
    }

    public final DocSelection getSelectedDocument() {
        return selectedDocument;
    }

    public final void setSelectedDocument(DocSelection docSelection) {
        selectedDocument = docSelection;
    }

    public final List<SelfieRange> getSelfieFaceAngleRanges() {
        return selfieFaceAngleRanges;
    }

    public final void setSelfieFaceAngleRanges(List<SelfieRange> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        selfieFaceAngleRanges = list;
    }

    public final boolean isMixPanelEnabled() {
        if (getUseSocureGov()) {
            return false;
        }
        String docvUrl = getDocvUrl();
        return docvUrl == null || docvUrl.length() == 0;
    }

    public final void clearDocData() {
        docUploadUuid = null;
        documentsReferenceId = null;
        clearCapturedImageMap();
        extractionData = null;
        selectedDocument = null;
    }

    public final void clear() {
        eventId = null;
        clearDocData();
    }

    private final void clearCapturedImageMap() {
        HashMap<String, byte[]> hashMap = capturedImages;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> hashMap2 = captureMap;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        capturedImages = null;
        captureMap = null;
    }
}
