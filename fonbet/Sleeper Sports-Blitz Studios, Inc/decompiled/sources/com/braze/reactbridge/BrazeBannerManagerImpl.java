package com.braze.reactbridge;

import android.view.View;
import android.view.ViewGroup;
import com.braze.Braze;
import com.braze.models.Banner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: BrazeBannerManagerImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/braze/reactbridge/BrazeBannerManagerImpl;", "", "<init>", "()V", "NAME", "", "EVENT_HEIGHT_CHANGED", "FIELD_HEIGHT", "createViewInstance", "Lcom/braze/reactbridge/BannerContainer;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setPlacementID", "", ViewHierarchyConstants.VIEW_KEY, SDKConstants.PARAM_PLACEMENT_ID, "getExportedCustomBubblingEventTypeConstants", "", "BannerDimensionsEvent", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeBannerManagerImpl {
    public static final String EVENT_HEIGHT_CHANGED = "onHeightChanged";
    public static final String FIELD_HEIGHT = "height";
    public static final BrazeBannerManagerImpl INSTANCE = new BrazeBannerManagerImpl();
    public static final String NAME = "BrazeBannerView";

    private BrazeBannerManagerImpl() {
    }

    /* compiled from: BrazeBannerManagerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/reactbridge/BrazeBannerManagerImpl$BannerDimensionsEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "payload", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "getEventName", "", "getEventData", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerDimensionsEvent extends Event<BannerDimensionsEvent> {
        private final WritableMap payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerDimensionsEvent(int i, int i2, WritableMap payload) {
            super(i, i2);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public String getEventName() {
            return BrazeBannerManagerImpl.EVENT_HEIGHT_CHANGED;
        }

        @Override // com.facebook.react.uimanager.events.Event
        /* renamed from: getEventData, reason: from getter */
        protected WritableMap getPayload() {
            return this.payload;
        }
    }

    public final BannerContainer createViewInstance(final ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final BannerContainer bannerContainer = new BannerContainer(context);
        bannerContainer.getBannerView().setHeightCallback(new Function1() { // from class: com.braze.reactbridge.BrazeBannerManagerImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createViewInstance$lambda$8;
                createViewInstance$lambda$8 = BrazeBannerManagerImpl.createViewInstance$lambda$8(ThemedReactContext.this, bannerContainer, ((Double) obj).doubleValue());
                return createViewInstance$lambda$8;
            }
        });
        return bannerContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$8(ThemedReactContext themedReactContext, final BannerContainer bannerContainer, double d) {
        Intrinsics.checkNotNull(themedReactContext, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        final ThemedReactContext themedReactContext2 = themedReactContext;
        final int surfaceId = UIManagerHelper.getSurfaceId(themedReactContext2);
        final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        doubleRef.element = d;
        String str = bannerContainer.getBannerView().get_placementId();
        if (str != null) {
            Banner banner = Braze.INSTANCE.getInstance(themedReactContext).getBanner(str);
            if (banner == null || !banner.getIsControl()) {
                banner = null;
            }
            if (banner != null) {
                doubleRef.element = 1.0d;
                bannerContainer.setAlpha(0.0f);
            }
        }
        bannerContainer.postOnAnimation(new Runnable() { // from class: com.braze.reactbridge.BrazeBannerManagerImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerManagerImpl.createViewInstance$lambda$8$lambda$7(BannerContainer.this, doubleRef, surfaceId, themedReactContext2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$8$lambda$7(BannerContainer bannerContainer, Ref.DoubleRef doubleRef, int i, ReactContext reactContext) {
        ViewGroup.LayoutParams layoutParams = bannerContainer.getLayoutParams();
        int i2 = (int) doubleRef.element;
        if (layoutParams.height != i2) {
            layoutParams.height = i2;
            bannerContainer.setLayoutParams(layoutParams);
            bannerContainer.requestLayout();
            bannerContainer.invalidate();
            Object parent = bannerContainer.getParent();
            final View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.postOnAnimation(new Runnable() { // from class: com.braze.reactbridge.BrazeBannerManagerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BrazeBannerManagerImpl.createViewInstance$lambda$8$lambda$7$lambda$4$lambda$3(view);
                    }
                });
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("height", doubleRef.element);
        BannerDimensionsEvent bannerDimensionsEvent = new BannerDimensionsEvent(i, bannerContainer.getId(), createMap);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, bannerContainer.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(bannerDimensionsEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$8$lambda$7$lambda$4$lambda$3(View view) {
        view.requestLayout();
        view.invalidate();
    }

    public final void setPlacementID(BannerContainer view, String placementID) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAlpha(1.0f);
        view.getBannerView().setPlacementId(placementID);
    }

    public final Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapsKt.mapOf(TuplesKt.to(EVENT_HEIGHT_CHANGED, MapsKt.mapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mapOf(TuplesKt.to("bubbled", EVENT_HEIGHT_CHANGED), TuplesKt.to("captured", EVENT_HEIGHT_CHANGED))))));
    }
}
