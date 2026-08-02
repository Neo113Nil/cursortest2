package io.radar.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: RadarInAppMessageManager.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/radar/sdk/RadarInAppMessageManager;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "context", "Landroid/content/Context;", "(Landroid/app/Activity;Landroid/content/Context;)V", "currentMessage", "Lio/radar/sdk/model/RadarInAppMessage;", "currentView", "Landroid/view/View;", "inAppMessageReceiver", "Lio/radar/sdk/RadarInAppMessageReceiver;", "modalShowTime", "", ActionType.DISMISS, "", "logConversion", "name", "", "withDuration", "", "setInAppMessageReceiver", "setInAppMessageReceiver$sdk_release", "showInAppMessage", "payload", "showInAppMessage$sdk_release", "showInAppMessages", "inAppMessages", "", "showInAppMessages$sdk_release", "([Lio/radar/sdk/model/RadarInAppMessage;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarInAppMessageManager {
    private final Activity activity;
    private final Context context;
    private RadarInAppMessage currentMessage;
    private View currentView;
    private RadarInAppMessageReceiver inAppMessageReceiver;
    private long modalShowTime;

    public RadarInAppMessageManager(Activity activity, Context context) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        this.activity = activity;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logConversion(String name, boolean withDuration) {
        RadarInAppMessage radarInAppMessage = this.currentMessage;
        if (radarInAppMessage == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaignId", radarInAppMessage.getMetadata().optString("radar:campaignId"));
        jSONObject.put("geofenceId", radarInAppMessage.getMetadata().optString("radar:geofenceId"));
        jSONObject.put("campaignMetadata", radarInAppMessage.getMetadata().optString("radar:campaignMetadata"));
        if (withDuration) {
            jSONObject.put("displayDuration", System.currentTimeMillis() - this.modalShowTime);
        }
        Radar.sendLogConversionRequest$sdk_release(name, jSONObject, new Radar.RadarLogConversionCallback() { // from class: io.radar.sdk.RadarInAppMessageManager$logConversion$1
            @Override // io.radar.sdk.Radar.RadarLogConversionCallback
            public void onComplete(Radar.RadarStatus status, RadarEvent event) {
                Intrinsics.checkNotNullParameter(status, "status");
                RadarLogger logger$sdk_release = Radar.INSTANCE.getLogger$sdk_release();
                StringBuilder sb = new StringBuilder("Conversion name = ");
                sb.append(event != null ? event.getConversionName() : null);
                sb.append(": status = ");
                sb.append(status);
                sb.append("; event = ");
                sb.append(event);
                RadarLogger.i$default(logger$sdk_release, sb.toString(), null, null, 6, null);
            }
        });
    }

    public final void showInAppMessage$sdk_release(final RadarInAppMessage payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        RadarInAppMessageReceiver radarInAppMessageReceiver = this.inAppMessageReceiver;
        if (radarInAppMessageReceiver != null) {
            radarInAppMessageReceiver.createInAppMessageView(this.context, payload, new Function0<Unit>() { // from class: io.radar.sdk.RadarInAppMessageManager$showInAppMessage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RadarInAppMessageReceiver radarInAppMessageReceiver2;
                    RadarInAppMessageManager.this.logConversion("in_app_message_dismissed", true);
                    radarInAppMessageReceiver2 = RadarInAppMessageManager.this.inAppMessageReceiver;
                    if (radarInAppMessageReceiver2 != null) {
                        radarInAppMessageReceiver2.onInAppMessageDismissed(payload);
                    }
                    RadarInAppMessageManager.this.dismiss();
                }
            }, new Function0<Unit>() { // from class: io.radar.sdk.RadarInAppMessageManager$showInAppMessage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Activity activity;
                    RadarInAppMessageReceiver radarInAppMessageReceiver2;
                    Activity activity2;
                    RadarInAppMessageManager.this.logConversion("in_app_message_clicked", true);
                    StringBuilder sb = new StringBuilder("called super, activity is ");
                    activity = RadarInAppMessageManager.this.activity;
                    sb.append(activity);
                    Log.d("MyInAppMessageReceiver", sb.toString());
                    RadarInAppMessage.Button button = payload.getButton();
                    if ((button != null ? button.getDeepLink() : null) != null && !Intrinsics.areEqual(payload.getButton().getDeepLink(), AbstractJsonLexerKt.NULL) && !StringsKt.isBlank(payload.getButton().getDeepLink())) {
                        String deepLink = payload.getButton().getDeepLink();
                        RadarInAppMessageManager radarInAppMessageManager = RadarInAppMessageManager.this;
                        try {
                            Uri parse = Uri.parse(deepLink);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Opening URL: " + deepLink + " -> URI: " + parse, null, null, 6, null);
                            Intent intent = new Intent("android.intent.action.VIEW", parse);
                            activity2 = radarInAppMessageManager.activity;
                            activity2.startActivity(intent);
                        } catch (Exception e) {
                            RadarLogger.e$default(Radar.INSTANCE.getLogger$sdk_release(), "Error opening URL '" + deepLink + "': " + e.getMessage(), null, null, 6, null);
                        }
                    } else {
                        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Button deepLink is null or 'null' string, skipping deepLink opening", null, null, 6, null);
                    }
                    radarInAppMessageReceiver2 = RadarInAppMessageManager.this.inAppMessageReceiver;
                    if (radarInAppMessageReceiver2 != null) {
                        radarInAppMessageReceiver2.onInAppMessageButtonClicked(payload);
                    }
                    RadarInAppMessageManager.this.dismiss();
                }
            }, new Function1<View, Unit>() { // from class: io.radar.sdk.RadarInAppMessageManager$showInAppMessage$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View view) {
                    View view2;
                    Activity activity;
                    Intrinsics.checkNotNullParameter(view, "view");
                    view2 = RadarInAppMessageManager.this.currentView;
                    if (view2 == null) {
                        activity = RadarInAppMessageManager.this.activity;
                        Window window = activity.getWindow();
                        View decorView = window != null ? window.getDecorView() : null;
                        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                        if (viewGroup == null) {
                            RadarLogger.e$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity decorView is null or not a ViewGroup, cannot show in-app message", null, null, 6, null);
                            return;
                        }
                        viewGroup.addView(view);
                        RadarInAppMessageManager.this.currentView = view;
                        RadarInAppMessageManager.this.currentMessage = payload;
                        RadarInAppMessageManager.this.logConversion("in_app_message_clicked", false);
                        return;
                    }
                    RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "In-app message view already exists, skipping", null, null, 6, null);
                }
            });
        }
    }

    public final void dismiss() {
        View view = this.currentView;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.currentView = null;
        }
    }

    public final void setInAppMessageReceiver$sdk_release(RadarInAppMessageReceiver inAppMessageReceiver) {
        Intrinsics.checkNotNullParameter(inAppMessageReceiver, "inAppMessageReceiver");
        this.inAppMessageReceiver = inAppMessageReceiver;
    }

    public final void showInAppMessages$sdk_release(RadarInAppMessage[] inAppMessages) {
        Intrinsics.checkNotNullParameter(inAppMessages, "inAppMessages");
        for (RadarInAppMessage radarInAppMessage : inAppMessages) {
            RadarInAppMessageReceiver radarInAppMessageReceiver = this.inAppMessageReceiver;
            if (radarInAppMessageReceiver != null && radarInAppMessageReceiver != null) {
                radarInAppMessageReceiver.onNewInAppMessage(radarInAppMessage);
            }
        }
    }
}
