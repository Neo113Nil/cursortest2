package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.events.Event;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.C6776e;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002./B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\b\u0010#\u001a\u00020\u0012H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\b\u0010+\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020-H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "motionEvent", "Landroid/view/MotionEvent;", "_eventName", "", "coalescingKey", "", "pointersEventData", "", "Lcom/facebook/react/bridge/WritableMap;", "eventState", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "activeHitPathViewIds", "", "init", "", "eventName", "targetTag", "motionEventToCopy", "getEventName", "isClickEvent", "", "()Z", "dispatch", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventAnimationDriverMatchSpec", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "getEventAnimationDriverMatchSpec", "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec$delegate", "Lkotlin/Lazy;", "onDispose", "createW3CPointerEvents", "addModifierKeyData", "pointerEvent", "modifierKeyMask", "createW3CPointerEvent", "index", "createPointersEventData", "getCoalescingKey", "dispatchModern", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "PointerEventState", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PointerEvent extends Event<PointerEvent> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C6776e EVENTS_POOL;
    private static final int POINTER_EVENTS_POOL_SIZE = 6;

    @NotNull
    private static final String TAG;
    private static final short UNSET_COALESCING_KEY = -1;
    private String _eventName;

    @Nullable
    private List<Integer> activeHitPathViewIds;
    private short coalescingKey;

    /* renamed from: eventAnimationDriverMatchSpec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventAnimationDriverMatchSpec;

    @Nullable
    private PointerEventState eventState;

    @Nullable
    private MotionEvent motionEvent;

    @Nullable
    private List<? extends WritableMap> pointersEventData;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJA\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0011J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\r\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$Companion;", "", "<init>", "()V", "", "eventName", "", "targetTag", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "eventState", "Landroid/view/MotionEvent;", "motionEventToCopy", "Lcom/facebook/react/uimanager/events/PointerEvent;", "obtain", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/PointerEvent;", "", "activeHitPathViewIds", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;Ljava/util/List;)Lcom/facebook/react/uimanager/events/PointerEvent;", "", "coalescingKey", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/PointerEvent;", "TAG", "Ljava/lang/String;", "POINTER_EVENTS_POOL_SIZE", "I", "Lx0/e;", "EVENTS_POOL", "Lx0/e;", "UNSET_COALESCING_KEY", "S", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, @Nullable MotionEvent motionEventToCopy) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            return obtain(eventName, targetTag, eventState, motionEventToCopy, (List<Integer>) null);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, @Nullable MotionEvent motionEventToCopy, @Nullable List<Integer> activeHitPathViewIds) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object c10 = S7.a.c(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) c10, (short) 0, activeHitPathViewIds);
            return pointerEvent2;
        }

        @JvmStatic
        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, @Nullable MotionEvent motionEventToCopy, short coalescingKey) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object c10 = S7.a.c(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) c10, coalescingKey, null);
            return pointerEvent2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "", "primaryPointerId", "", "activePointerId", "lastButtonState", "surfaceId", "offsetByPointerId", "", "", "hitPathByPointerId", "", "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "eventCoordinatesByPointerId", "screenCoordinatesByPointerId", "hoveringPointerIds", "", "<init>", "(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getPrimaryPointerId", "()I", "getActivePointerId", "getLastButtonState", "getOffsetByPointerId", "()Ljava/util/Map;", "getHitPathByPointerId", "getEventCoordinatesByPointerId", "getScreenCoordinatesByPointerId", "getHoveringPointerIds", "()Ljava/util/Set;", "getSurfaceId", "supportsHover", "", "pointerId", "hitPathForActivePointer", "getHitPathForActivePointer", "()Ljava/util/List;", "hitPathViewIdsForActivePointer", "getHitPathViewIdsForActivePointer", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\ncom/facebook/react/uimanager/events/PointerEvent$PointerEventState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n1563#2:376\n1634#2,3:377\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\ncom/facebook/react/uimanager/events/PointerEvent$PointerEventState\n*L\n311#1:376\n311#1:377,3\n*E\n"})
    public static final class PointerEventState {
        private final int activePointerId;

        @NotNull
        private final Map<Integer, float[]> eventCoordinatesByPointerId;

        @NotNull
        private final Map<Integer, List<TouchTargetHelper.ViewTarget>> hitPathByPointerId;

        @NotNull
        private final Set<Integer> hoveringPointerIds;
        private final int lastButtonState;

        @NotNull
        private final Map<Integer, float[]> offsetByPointerId;
        private final int primaryPointerId;

        @NotNull
        private final Map<Integer, float[]> screenCoordinatesByPointerId;
        private final int surfaceId;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventState(int i10, int i11, int i12, int i13, @NotNull Map<Integer, float[]> offsetByPointerId, @NotNull Map<Integer, ? extends List<TouchTargetHelper.ViewTarget>> hitPathByPointerId, @NotNull Map<Integer, float[]> eventCoordinatesByPointerId, @NotNull Map<Integer, float[]> screenCoordinatesByPointerId, @NotNull Set<Integer> hoveringPointerIds) {
            Intrinsics.checkNotNullParameter(offsetByPointerId, "offsetByPointerId");
            Intrinsics.checkNotNullParameter(hitPathByPointerId, "hitPathByPointerId");
            Intrinsics.checkNotNullParameter(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(hoveringPointerIds, "hoveringPointerIds");
            this.primaryPointerId = i10;
            this.activePointerId = i11;
            this.lastButtonState = i12;
            this.surfaceId = i13;
            this.offsetByPointerId = offsetByPointerId;
            this.hitPathByPointerId = hitPathByPointerId;
            this.eventCoordinatesByPointerId = eventCoordinatesByPointerId;
            this.screenCoordinatesByPointerId = screenCoordinatesByPointerId;
            this.hoveringPointerIds = new HashSet(hoveringPointerIds);
        }

        public final int getActivePointerId() {
            return this.activePointerId;
        }

        @NotNull
        public final Map<Integer, float[]> getEventCoordinatesByPointerId() {
            return this.eventCoordinatesByPointerId;
        }

        @NotNull
        public final Map<Integer, List<TouchTargetHelper.ViewTarget>> getHitPathByPointerId() {
            return this.hitPathByPointerId;
        }

        @NotNull
        public final List<TouchTargetHelper.ViewTarget> getHitPathForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @NotNull
        public final List<Integer> getHitPathViewIdsForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<TouchTargetHelper.ViewTarget> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((TouchTargetHelper.ViewTarget) it.next()).getViewId()));
            }
            return arrayList;
        }

        @NotNull
        public final Set<Integer> getHoveringPointerIds() {
            return this.hoveringPointerIds;
        }

        public final int getLastButtonState() {
            return this.lastButtonState;
        }

        @NotNull
        public final Map<Integer, float[]> getOffsetByPointerId() {
            return this.offsetByPointerId;
        }

        public final int getPrimaryPointerId() {
            return this.primaryPointerId;
        }

        @NotNull
        public final Map<Integer, float[]> getScreenCoordinatesByPointerId() {
            return this.screenCoordinatesByPointerId;
        }

        public final int getSurfaceId() {
            return this.surfaceId;
        }

        public final boolean supportsHover(int pointerId) {
            return this.hoveringPointerIds.contains(Integer.valueOf(pointerId));
        }
    }

    static {
        String simpleName = PointerEvent.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        EVENTS_POOL = new C6776e(6);
    }

    public /* synthetic */ PointerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void addModifierKeyData(WritableMap pointerEvent, int modifierKeyMask) {
        pointerEvent.putBoolean("ctrlKey", (modifierKeyMask & 4096) != 0);
        pointerEvent.putBoolean("shiftKey", (modifierKeyMask & 1) != 0);
        pointerEvent.putBoolean("altKey", (modifierKeyMask & 2) != 0);
        pointerEvent.putBoolean("metaKey", (modifierKeyMask & PKIFailureInfo.notAuthorized) != 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        return kotlin.collections.CollectionsKt.listOf(createW3CPointerEvent(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_CANCEL) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return createW3CPointerEvents();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.CLICK) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_UP) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OVER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_MOVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_DOWN) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_LEAVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_ENTER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OUT) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<WritableMap> createPointersEventData() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int actionIndex = motionEvent.getActionIndex();
        String str = this._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        switch (str.hashCode()) {
            case -1786514288:
                break;
            case -1780335505:
                break;
            case -1304584214:
                break;
            case -1304316135:
                break;
            case -1304250340:
                break;
            case -1065042973:
                break;
            case -992108237:
                break;
            case 383186882:
                break;
            case 1343400710:
                break;
            default:
                return null;
        }
    }

    private final WritableMap createW3CPointerEvent(int index) {
        double pressure;
        WritableMap createMap = Arguments.createMap();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerId = motionEvent.getPointerId(index);
        PointerEventState pointerEventState = this.eventState;
        if (pointerEventState == null) {
            throw new IllegalStateException("Required value was null.");
        }
        createMap.putDouble("pointerId", pointerId);
        String w3CPointerType = PointerEventHelper.getW3CPointerType(motionEvent.getToolType(index));
        createMap.putString("pointerType", w3CPointerType);
        createMap.putBoolean("isPrimary", !isClickEvent() && (pointerEventState.supportsHover(pointerId) || pointerId == pointerEventState.getPrimaryPointerId()));
        float[] fArr = pointerEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr2 = fArr;
        double dIPFromPixel = PixelUtil.toDIPFromPixel(fArr2[0]);
        double dIPFromPixel2 = PixelUtil.toDIPFromPixel(fArr2[1]);
        createMap.putDouble("clientX", dIPFromPixel);
        createMap.putDouble("clientY", dIPFromPixel2);
        float[] fArr3 = pointerEventState.getScreenCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr4 = fArr3;
        double dIPFromPixel3 = PixelUtil.toDIPFromPixel(fArr4[0]);
        double dIPFromPixel4 = PixelUtil.toDIPFromPixel(fArr4[1]);
        createMap.putDouble("screenX", dIPFromPixel3);
        createMap.putDouble("screenY", dIPFromPixel4);
        createMap.putDouble(C5444x.f55808b, dIPFromPixel);
        createMap.putDouble("y", dIPFromPixel2);
        createMap.putDouble("pageX", dIPFromPixel);
        createMap.putDouble("pageY", dIPFromPixel2);
        float[] fArr5 = pointerEventState.getOffsetByPointerId().get(Integer.valueOf(pointerId));
        if (fArr5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr6 = fArr5;
        createMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(fArr6[0]));
        createMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(fArr6[1]));
        createMap.putInt("target", getViewTag());
        createMap.putDouble(EventKeys.TIMESTAMP, getTimestampMs());
        createMap.putInt("detail", 0);
        createMap.putDouble("tiltX", 0.0d);
        createMap.putDouble("tiltY", 0.0d);
        createMap.putInt("twist", 0);
        if (Intrinsics.areEqual(w3CPointerType, PointerEventHelper.POINTER_TYPE_MOUSE) || isClickEvent()) {
            createMap.putDouble("width", 1.0d);
            createMap.putDouble("height", 1.0d);
        } else {
            double dIPFromPixel5 = PixelUtil.toDIPFromPixel(motionEvent.getTouchMajor(index));
            createMap.putDouble("width", dIPFromPixel5);
            createMap.putDouble("height", dIPFromPixel5);
        }
        int buttonState = motionEvent.getButtonState();
        createMap.putInt("button", PointerEventHelper.getButtonChange(w3CPointerType, pointerEventState.getLastButtonState(), buttonState));
        String str = this._eventName;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        createMap.putInt("buttons", PointerEventHelper.getButtons(str, w3CPointerType, buttonState));
        if (isClickEvent()) {
            pressure = 0.0d;
        } else {
            int i10 = createMap.getInt("buttons");
            String str3 = this._eventName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            } else {
                str2 = str3;
            }
            pressure = PointerEventHelper.getPressure(i10, str2);
        }
        createMap.putDouble("pressure", pressure);
        createMap.putDouble("tangentialPressure", 0.0d);
        List<Integer> list = this.activeHitPathViewIds;
        if (list != null) {
            createMap.putArray("hitPathForEventListener", Arguments.makeNativeArray((List<?>) list));
        }
        addModifierKeyData(createMap, motionEvent.getMetaState());
        return createMap;
    }

    private final List<WritableMap> createW3CPointerEvents() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            arrayList.add(createW3CPointerEvent(i10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1(final PointerEvent pointerEvent) {
        return new Event.EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.h
            @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
            public final boolean match(int i10, String str) {
                boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0;
                eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0 = PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent.this, i10, str);
                return eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent pointerEvent, int i10, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        String str = pointerEvent._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        if (!Intrinsics.areEqual(eventName, str)) {
            return false;
        }
        if (!PointerEventHelper.isBubblingEvent(eventName)) {
            return pointerEvent.getViewTag() == i10;
        }
        PointerEventState pointerEventState = pointerEvent.eventState;
        if (pointerEventState == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Iterator<TouchTargetHelper.ViewTarget> it = pointerEventState.getHitPathForActivePointer().iterator();
        while (it.hasNext()) {
            if (it.next().getViewId() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey, List<Integer> activeHitPathViewIds) {
        super.init(eventState.getSurfaceId(), targetTag, motionEventToCopy.getEventTime());
        this._eventName = eventName;
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.coalescingKey = coalescingKey;
        this.eventState = eventState;
        this.activeHitPathViewIds = activeHitPathViewIds;
    }

    private final boolean isClickEvent() {
        String str = this._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        return Intrinsics.areEqual(str, PointerEventHelper.CLICK);
    }

    @JvmStatic
    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i10, @NotNull PointerEventState pointerEventState, @Nullable MotionEvent motionEvent) {
        return INSTANCE.obtain(str, i10, pointerEventState, motionEvent);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Deprecated(message = "Prefer to override getEventData instead")
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMap : list) {
            if (z10) {
                writableMap = writableMap.copy();
            }
            int viewTag = getViewTag();
            String str = this._eventName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(@NotNull RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMap : list) {
            if (z10) {
                writableMap = writableMap.copy();
            }
            WritableMap writableMap2 = writableMap;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this._eventName;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
                str = null;
            }
            short s10 = this.coalescingKey;
            boolean z11 = s10 != -1;
            String str3 = this._eventName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z11, s10, writableMap2, PointerEventHelper.getEventCategory(str2));
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public Event.EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        return (Event.EventAnimationDriverMatchSpec) this.eventAnimationDriverMatchSpec.getValue();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        String str = this._eventName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_eventName");
        return null;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.eventState = null;
        this.pointersEventData = null;
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private PointerEvent() {
        this.coalescingKey = (short) -1;
        this.eventAnimationDriverMatchSpec = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.facebook.react.uimanager.events.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1;
                eventAnimationDriverMatchSpec_delegate$lambda$1 = PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1(PointerEvent.this);
                return eventAnimationDriverMatchSpec_delegate$lambda$1;
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i10, @NotNull PointerEventState pointerEventState, @Nullable MotionEvent motionEvent, @Nullable List<Integer> list) {
        return INSTANCE.obtain(str, i10, pointerEventState, motionEvent, list);
    }

    @JvmStatic
    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i10, @NotNull PointerEventState pointerEventState, @Nullable MotionEvent motionEvent, short s10) {
        return INSTANCE.obtain(str, i10, pointerEventState, motionEvent, s10);
    }
}
