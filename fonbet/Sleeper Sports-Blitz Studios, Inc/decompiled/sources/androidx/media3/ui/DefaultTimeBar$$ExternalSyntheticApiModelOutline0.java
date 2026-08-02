package androidx.media3.ui;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.common.AdData;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.media.MediaCodecInfo;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.Spatializer;
import android.view.SurfaceControl;
import android.window.SurfaceSyncGroup;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AdId m(Object obj) {
        return (AdId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdIdManager m9779m(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder m() {
        return new AdSelectionConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionManager m9780m(Object obj) {
        return (AdSelectionManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m9781m(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* synthetic */ ReportImpressionRequest m(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetId m9782m(Object obj) {
        return (AppSetId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetIdManager m9783m(Object obj) {
        return (AppSetIdManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdData.Builder m9784m() {
        return new AdData.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ JoinCustomAudienceRequest.Builder m9786m() {
        return new JoinCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ LeaveCustomAudienceRequest.Builder m9787m() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TrustedBiddingData.Builder m9788m() {
        return new TrustedBiddingData.Builder();
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m9789m(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser$InputReader m9791m(Object obj) {
        return (MediaParser$InputReader) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m9792m(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Spatializer m9793m(Object obj) {
        return (Spatializer) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ SurfaceControl.Transaction m9795m() {
        return new SurfaceControl.Transaction();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ SurfaceSyncGroup m9796m(String str) {
        return new SurfaceSyncGroup(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m9797m() {
        return AdIdManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9799m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AdSelectionManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m9803m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return AppSetIdManager.class;
    }
}
