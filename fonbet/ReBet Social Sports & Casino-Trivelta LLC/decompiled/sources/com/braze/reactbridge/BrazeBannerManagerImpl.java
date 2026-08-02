package com.braze.reactbridge;

import android.view.View;
import android.view.ViewGroup;
import com.braze.Braze;
import com.braze.models.Banner;
import com.braze.reactbridge.BannerContainer;
import com.braze.reactbridge.BrazeBannerManagerImpl;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/braze/reactbridge/BrazeBannerManagerImpl;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lcom/braze/reactbridge/BannerContainer;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/braze/reactbridge/BannerContainer;", "view", "", "placementID", "", "setPlacementID", "(Lcom/braze/reactbridge/BannerContainer;Ljava/lang/String;)V", "", "getExportedCustomBubblingEventTypeConstants", "()Ljava/util/Map;", "BannerDimensionsEvent", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeBannerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeBannerManagerImpl.kt\ncom/braze/reactbridge/BrazeBannerManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes.dex */
public final class BrazeBannerManagerImpl {

    @NotNull
    public static final BrazeBannerManagerImpl INSTANCE = new BrazeBannerManagerImpl();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/reactbridge/BrazeBannerManagerImpl$BannerDimensionsEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", EventKeys.PAYLOAD, "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "getEventName", "", "getEventData", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerDimensionsEvent extends Event<BannerDimensionsEvent> {

        @NotNull
        private final WritableMap payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerDimensionsEvent(int i10, int i11, @NotNull WritableMap payload) {
            super(i10, i11);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @Nullable
        /* renamed from: getEventData, reason: from getter */
        public WritableMap getAccessibilityEventData() {
            return this.payload;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "onHeightChanged";
        }
    }

    private BrazeBannerManagerImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$8(final ThemedReactContext themedReactContext, final BannerContainer bannerContainer, double d10) {
        Intrinsics.checkNotNull(themedReactContext, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        final int surfaceId = UIManagerHelper.getSurfaceId(themedReactContext);
        final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        doubleRef.element = d10;
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
        bannerContainer.postOnAnimation(new Runnable() { // from class: V3.b
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerManagerImpl.createViewInstance$lambda$8$lambda$7(BannerContainer.this, doubleRef, surfaceId, themedReactContext);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$8$lambda$7(BannerContainer bannerContainer, Ref.DoubleRef doubleRef, int i10, ReactContext reactContext) {
        ViewGroup.LayoutParams layoutParams = bannerContainer.getLayoutParams();
        int i11 = (int) doubleRef.element;
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
            bannerContainer.setLayoutParams(layoutParams);
            bannerContainer.requestLayout();
            bannerContainer.invalidate();
            Object parent = bannerContainer.getParent();
            final View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.postOnAnimation(new Runnable() { // from class: V3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        BrazeBannerManagerImpl.createViewInstance$lambda$8$lambda$7$lambda$4$lambda$3(view);
                    }
                });
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("height", doubleRef.element);
        BannerDimensionsEvent bannerDimensionsEvent = new BannerDimensionsEvent(i10, bannerContainer.getId(), createMap);
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

    @NotNull
    public final BannerContainer createViewInstance(@NotNull final ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final BannerContainer bannerContainer = new BannerContainer(context);
        bannerContainer.getBannerView().setHeightCallback(new Function1() { // from class: V3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createViewInstance$lambda$8;
                createViewInstance$lambda$8 = BrazeBannerManagerImpl.createViewInstance$lambda$8(ThemedReactContext.this, bannerContainer, ((Double) obj).doubleValue());
                return createViewInstance$lambda$8;
            }
        });
        return bannerContainer;
    }

    @Nullable
    public final Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapsKt.mapOf(TuplesKt.to("onHeightChanged", MapsKt.mapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mapOf(TuplesKt.to("bubbled", "onHeightChanged"), TuplesKt.to("captured", "onHeightChanged"))))));
    }

    public final void setPlacementID(@NotNull BannerContainer view, @Nullable String placementID) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAlpha(1.0f);
        view.getBannerView().setPlacementId(placementID);
    }
}
