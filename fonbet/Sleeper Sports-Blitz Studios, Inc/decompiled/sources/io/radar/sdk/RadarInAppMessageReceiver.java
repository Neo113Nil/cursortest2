package io.radar.sdk;

import android.content.Context;
import android.view.View;
import io.radar.sdk.model.RadarInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarInAppMessageReceiver.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/RadarInAppMessageReceiver;", "", "createInAppMessageView", "", "context", "Landroid/content/Context;", "inAppMessage", "Lio/radar/sdk/model/RadarInAppMessage;", "onDismissListener", "Lkotlin/Function0;", "onInAppMessageButtonClicked", "onViewReady", "Lkotlin/Function1;", "Landroid/view/View;", "onInAppMessageDismissed", "onNewInAppMessage", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RadarInAppMessageReceiver {
    void createInAppMessageView(Context context, RadarInAppMessage inAppMessage, Function0<Unit> onDismissListener, Function0<Unit> onInAppMessageButtonClicked, Function1<? super View, Unit> onViewReady);

    void onInAppMessageButtonClicked(RadarInAppMessage inAppMessage);

    void onInAppMessageDismissed(RadarInAppMessage inAppMessage);

    void onNewInAppMessage(RadarInAppMessage inAppMessage);

    /* compiled from: RadarInAppMessageReceiver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onInAppMessageButtonClicked(RadarInAppMessageReceiver radarInAppMessageReceiver, RadarInAppMessage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        }

        public static void onInAppMessageDismissed(RadarInAppMessageReceiver radarInAppMessageReceiver, RadarInAppMessage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        }

        public static void onNewInAppMessage(RadarInAppMessageReceiver radarInAppMessageReceiver, RadarInAppMessage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Radar.showInAppMessage(inAppMessage);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void createInAppMessageView$default(RadarInAppMessageReceiver radarInAppMessageReceiver, Context context, RadarInAppMessage radarInAppMessage, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createInAppMessageView");
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function02 = null;
            }
            radarInAppMessageReceiver.createInAppMessageView(context, radarInAppMessage, function0, function02, function1);
        }

        public static void createInAppMessageView(RadarInAppMessageReceiver radarInAppMessageReceiver, Context context, RadarInAppMessage inAppMessage, Function0<Unit> function0, Function0<Unit> function02, Function1<? super View, Unit> onViewReady) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(onViewReady, "onViewReady");
            new RadarInAppMessageView(context, null, 0, 6, null).initialize(inAppMessage, function0, function02, onViewReady);
        }
    }
}
