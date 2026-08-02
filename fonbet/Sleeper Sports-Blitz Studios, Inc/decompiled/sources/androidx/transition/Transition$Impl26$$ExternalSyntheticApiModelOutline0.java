package androidx.transition;

import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import android.webkit.TracingConfig;
import android.webkit.WebViewRenderProcess;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Transition$Impl26$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ CustomAudience.Builder m() {
        return new CustomAudience.Builder();
    }

    public static /* bridge */ /* synthetic */ CustomAudienceManager m(Object obj) {
        return (CustomAudienceManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ DeletionRequest.Builder m10019m() {
        return new DeletionRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MeasurementManager m10020m(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebSourceParams.Builder m(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder m(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WebTriggerParams.Builder m10021m(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WebTriggerRegistrationRequest.Builder m10022m(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetTopicsRequest.Builder m10023m() {
        return new GetTopicsRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetTopicsResponse m10024m(Object obj) {
        return (GetTopicsResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Topic m10025m(Object obj) {
        return (Topic) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TopicsManager m10026m(Object obj) {
        return (TopicsManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TracingConfig.Builder m10029m() {
        return new TracingConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WebViewRenderProcess m10034m(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m10036m() {
        return CustomAudienceManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m10038m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return MeasurementManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m10040m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return TopicsManager.class;
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m10041m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
