package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.twilio.voice.EventKeys;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 U2\u00020\u0001:\u0001UB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0013J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0007J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0007J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H\u0007J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010*\u001a\u00020(H\u0007J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0007J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0007J*\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u000102H\u0007J\u0010\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\bH\u0003J\u0010\u00105\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0010H\u0007J\u0018\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0010H\u0007J\u0016\u00109\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0010J\u0018\u0010:\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0010H\u0007J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0010H\u0007J\u001a\u0010=\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u000102H\u0007J\u0010\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0010H\u0007J \u0010@\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00102\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001fH\u0007J \u0010D\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00102\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020\u0010H\u0007J\u0014\u0010F\u001a\u00020\u00172\n\u0010G\u001a\u0006\u0012\u0002\b\u00030HH\u0016J\u0014\u0010I\u001a\u00020\u00172\n\u0010G\u001a\u0006\u0012\u0002\b\u00030HH\u0003J\u0010\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020LH\u0007J#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00100N2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010O\u001a\u00020BH\u0000¢\u0006\u0002\bPJ\u0016\u0010Q\u001a\u00020\u00172\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0SH\u0003J\u0010\u0010T\u001a\u00020B2\u0006\u0010A\u001a\u00020BH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "animatedNodes", "Landroid/util/SparseArray;", "Lcom/facebook/react/animated/AnimatedNode;", "activeAnimations", "Lcom/facebook/react/animated/AnimationDriver;", "updatedNodes", "eventDrivers", "", "Lcom/facebook/react/animated/EventAnimationDriver;", "animatedGraphBFSColor", "", "runUpdateNodeList", "eventListenerInitializedForFabric", "", "eventListenerInitializedForNonFabric", "warnedAboutGraphTraversal", "initializeEventListenerForUIManagerType", "", "uiManagerType", "getNodeById", StackTraceHelper.ID_KEY, "hasActiveAnimations", "createAnimatedNode", "tag", "config", "Lcom/facebook/react/bridge/ReadableMap;", "updateAnimatedNodeConfig", "dropAnimatedNode", "startListeningToAnimatedNodeValue", "listener", "Lcom/facebook/react/animated/AnimatedNodeValueListener;", "stopListeningToAnimatedNodeValue", "setAnimatedNodeValue", EventKeys.VALUE_KEY, "", "setAnimatedNodeOffset", "offset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "startAnimatingNode", "animationId", "animatedNodeTag", "animationConfig", "endCallback", "Lcom/facebook/react/bridge/Callback;", "stopAnimationsForNode", "animatedNode", "stopAnimation", "connectAnimatedNodes", "parentNodeTag", "childNodeTag", "disconnectAnimatedNodes", "connectAnimatedNodeToView", "viewTag", "disconnectAnimatedNodeFromView", "getValue", "callback", "restoreDefaultValues", "addAnimatedEventToView", "eventHandlerName", "", "eventMapping", "removeAnimatedEventFromView", "animatedValueTag", "onEventDispatch", "event", "Lcom/facebook/react/uimanager/events/Event;", "handleEvent", "runUpdates", "frameTimeNanos", "", "getTagsOfConnectedNodes", "", "eventName", "getTagsOfConnectedNodes$ReactAndroid_release", "updateNodes", "nodes", "", "normalizeEventName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeAnimatedNodesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAnimatedNodesManager.kt\ncom/facebook/react/animated/NativeAnimatedNodesManager\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n30#2,3:805\n30#2,3:808\n30#2,3:811\n30#2,3:814\n30#2,3:817\n30#2,3:821\n30#2,3:824\n1#3:820\n1869#4:827\n1869#4,2:828\n1870#4:830\n1869#4,2:831\n1869#4,2:833\n*S KotlinDebug\n*F\n+ 1 NativeAnimatedNodesManager.kt\ncom/facebook/react/animated/NativeAnimatedNodesManager\n*L\n279#1:805,3\n289#1:808,3\n320#1:811,3\n330#1:814,3\n450#1:817,3\n608#1:821,3\n618#1:824,3\n641#1:827\n644#1:828,2\n641#1:830\n678#1:831,2\n735#1:833,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NativeAnimatedNodesManager implements EventDispatcherListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "NativeAnimatedNodesManager";
    private int animatedGraphBFSColor;
    private boolean eventListenerInitializedForFabric;
    private boolean eventListenerInitializedForNonFabric;

    @Nullable
    private final ReactApplicationContext reactApplicationContext;
    private boolean warnedAboutGraphTraversal;

    @NotNull
    private final SparseArray<AnimatedNode> animatedNodes = new SparseArray<>();

    @NotNull
    private final SparseArray<AnimationDriver> activeAnimations = new SparseArray<>();

    @NotNull
    private final SparseArray<AnimatedNode> updatedNodes = new SparseArray<>();

    @NotNull
    private final List<EventAnimationDriver> eventDrivers = new ArrayList();

    @NotNull
    private final List<AnimatedNode> runUpdateNodeList = new LinkedList();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativeAnimatedNodesManager(@Nullable ReactApplicationContext reactApplicationContext) {
        this.reactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(Event<?> event) {
        if (this.eventDrivers.isEmpty()) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z10 = false;
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (eventAnimationDriverMatchSpec != null && eventAnimationDriverMatchSpec.match(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                stopAnimationsForNode(eventAnimationDriver.valueNode);
                event.dispatchModern(eventAnimationDriver);
                this.runUpdateNodeList.add(eventAnimationDriver.valueNode);
                z10 = true;
            }
        }
        if (z10) {
            updateNodes(this.runUpdateNodeList);
            this.runUpdateNodeList.clear();
        }
    }

    private final String normalizeEventName(String eventHandlerName) {
        if (!StringsKt.startsWith$default(eventHandlerName, ViewProps.ON, false, 2, (Object) null)) {
            return eventHandlerName;
        }
        String substring = eventHandlerName.substring(2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return ViewProps.TOP + substring;
    }

    private final void stopAnimationsForNode(AnimatedNode animatedNode) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArray = null;
        int i10 = 0;
        while (i10 < this.activeAnimations.size()) {
            AnimationDriver valueAt = this.activeAnimations.valueAt(i10);
            if (Intrinsics.areEqual(animatedNode, valueAt.animatedValue)) {
                ValueAnimatedNode valueAnimatedNode = valueAt.animatedValue;
                if (valueAnimatedNode == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (valueAt.endCallback != null) {
                    WritableMap createMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                    readableMapBuilder.put("finished", false);
                    readableMapBuilder.put(EventKeys.VALUE_KEY, valueAnimatedNode.nodeValue);
                    readableMapBuilder.put("offset", valueAnimatedNode.offset);
                    Callback callback = valueAt.endCallback;
                    if (callback != null) {
                        callback.invoke(createMap);
                    }
                } else if (this.reactApplicationContext != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
                    readableMapBuilder2.put("animationId", valueAt.id);
                    readableMapBuilder2.put("finished", false);
                    readableMapBuilder2.put(EventKeys.VALUE_KEY, valueAnimatedNode.nodeValue);
                    readableMapBuilder2.put("offset", valueAnimatedNode.offset);
                    if (writableArray == null) {
                        writableArray = Arguments.createArray();
                    }
                    writableArray.pushMap(createMap2);
                }
                this.activeAnimations.removeAt(i10);
                i10--;
            }
            i10++;
        }
        if (writableArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
    }

    private final void updateNodes(List<? extends AnimatedNode> nodes) {
        List<AnimatedNode> list;
        List<AnimatedNode> list2;
        int i10 = this.animatedGraphBFSColor;
        int i11 = i10 + 1;
        this.animatedGraphBFSColor = i11;
        if (i11 == 0) {
            this.animatedGraphBFSColor = i10 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i12 = 0;
        for (AnimatedNode animatedNode : nodes) {
            int i13 = animatedNode.BFSColor;
            int i14 = this.animatedGraphBFSColor;
            if (i13 != i14) {
                animatedNode.BFSColor = i14;
                i12++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2 != null && (list2 = animatedNode2.children) != null) {
                for (AnimatedNode animatedNode3 : list2) {
                    animatedNode3.activeIncomingNodes++;
                    int i15 = animatedNode3.BFSColor;
                    int i16 = this.animatedGraphBFSColor;
                    if (i15 != i16) {
                        animatedNode3.BFSColor = i16;
                        i12++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i17 = this.animatedGraphBFSColor;
        int i18 = i17 + 1;
        this.animatedGraphBFSColor = i18;
        if (i18 == 0) {
            this.animatedGraphBFSColor = i17 + 2;
        }
        int i19 = 0;
        for (AnimatedNode animatedNode4 : nodes) {
            if (animatedNode4.activeIncomingNodes == 0) {
                int i20 = animatedNode4.BFSColor;
                int i21 = this.animatedGraphBFSColor;
                if (i20 != i21) {
                    animatedNode4.BFSColor = i21;
                    i19++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i22 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode5 != null) {
                try {
                    animatedNode5.update$ReactAndroid_release();
                } catch (JSApplicationCausedNativeException e10) {
                    E6.a.n(TAG, "Native animation workaround, frame lost as result of race condition", e10);
                }
            }
            if (animatedNode5 instanceof PropsAnimatedNode) {
                ((PropsAnimatedNode) animatedNode5).updateView();
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5 != null && (list = animatedNode5.children) != null) {
                for (AnimatedNode animatedNode6 : list) {
                    int i23 = animatedNode6.activeIncomingNodes - 1;
                    animatedNode6.activeIncomingNodes = i23;
                    int i24 = animatedNode6.BFSColor;
                    int i25 = this.animatedGraphBFSColor;
                    if (i24 != i25 && i23 == 0) {
                        animatedNode6.BFSColor = i25;
                        i19++;
                        arrayDeque.add(animatedNode6);
                    } else if (i24 == i25) {
                        i22++;
                    }
                }
            }
        }
        if (i12 == i19) {
            this.warnedAboutGraphTraversal = false;
            return;
        }
        if (this.warnedAboutGraphTraversal) {
            return;
        }
        this.warnedAboutGraphTraversal = true;
        E6.a.m(TAG, "Detected animation cycle or disconnected graph. ");
        Iterator<? extends AnimatedNode> it = nodes.iterator();
        while (it.hasNext()) {
            E6.a.m(TAG, it.next().prettyPrintWithChildren$ReactAndroid_release());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i22 > 0 ? "cycles (" + i22 + ")" : "disconnected regions") + ", there are " + i12 + " but toposort visited only " + i19);
        boolean z10 = this.eventListenerInitializedForFabric;
        if (z10 && i22 == 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z10) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        }
    }

    public final void addAnimatedEventToView(int viewTag, @NotNull String eventHandlerName, @NotNull ReadableMap eventMapping) {
        Intrinsics.checkNotNullParameter(eventHandlerName, "eventHandlerName");
        Intrinsics.checkNotNullParameter(eventMapping, "eventMapping");
        int i10 = eventMapping.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.animatedNodes.get(i10);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + viewTag + "] connected to event handler (" + eventHandlerName + ") should be of type " + ValueAnimatedNode.class.getName());
        }
        ReadableArray array = eventMapping.getArray("nativeEventPath");
        if (array == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = array.getString(i11);
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(string);
        }
        String normalizeEventName = normalizeEventName(eventHandlerName);
        this.eventDrivers.add(new EventAnimationDriver(normalizeEventName, viewTag, arrayList, (ValueAnimatedNode) animatedNode));
        if (Intrinsics.areEqual(normalizeEventName, "topScroll")) {
            addAnimatedEventToView(viewTag, "topScrollEnded", eventMapping);
        }
    }

    public final void connectAnimatedNodeToView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + animatedNodeTag + "] does not exist");
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + viewTag + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + viewTag).toString());
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, viewTag);
        if (uIManagerForReactTag != null) {
            ((PropsAnimatedNode) animatedNode).connectToView(viewTag, uIManagerForReactTag);
            this.updatedNodes.put(animatedNodeTag, animatedNode);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + viewTag));
        }
    }

    public final void connectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + parentNodeTag + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 != null) {
            animatedNode.addChild$ReactAndroid_release(animatedNode2);
            this.updatedNodes.put(childNodeTag, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + childNodeTag + "] does not exist");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void createAnimatedNode(int tag, @NotNull ReadableMap config) {
        AnimatedNode subtractionAnimatedNode;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.animatedNodes.get(tag) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + tag + "] already exists");
        }
        String string = config.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1774341004:
                    if (string.equals("subtraction")) {
                        subtractionAnimatedNode = new SubtractionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1226589444:
                    if (string.equals("addition")) {
                        subtractionAnimatedNode = new AdditionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1023368385:
                    if (string.equals("object")) {
                        subtractionAnimatedNode = new ObjectAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 94842723:
                    if (string.equals(ViewProps.COLOR)) {
                        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
                        if (reactApplicationContext == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        subtractionAnimatedNode = new ColorAnimatedNode(config, this, reactApplicationContext);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 106940784:
                    if (string.equals("props")) {
                        subtractionAnimatedNode = new PropsAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 109780401:
                    if (string.equals("style")) {
                        subtractionAnimatedNode = new StyleAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 111972721:
                    if (string.equals(EventKeys.VALUE_KEY)) {
                        subtractionAnimatedNode = new ValueAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 364720301:
                    if (string.equals("division")) {
                        subtractionAnimatedNode = new DivisionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 559331748:
                    if (string.equals("interpolation")) {
                        subtractionAnimatedNode = new InterpolationAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 668845958:
                    if (string.equals("multiplication")) {
                        subtractionAnimatedNode = new MultiplicationAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1052666732:
                    if (string.equals(ViewProps.TRANSFORM)) {
                        subtractionAnimatedNode = new TransformAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1227434359:
                    if (string.equals("modulus")) {
                        subtractionAnimatedNode = new ModulusAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1270488759:
                    if (string.equals("tracking")) {
                        subtractionAnimatedNode = new TrackingAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1300649942:
                    if (string.equals("diffclamp")) {
                        subtractionAnimatedNode = new DiffClampAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
    }

    public final void disconnectAnimatedNodeFromView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + animatedNodeTag + "] does not exist");
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).disconnectFromView(viewTag);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + viewTag + "] should be of type " + PropsAnimatedNode.class.getName());
    }

    public final void disconnectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + parentNodeTag + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 != null) {
            animatedNode.removeChild$ReactAndroid_release(animatedNode2);
            this.updatedNodes.put(childNodeTag, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + childNodeTag + "] does not exist");
        }
    }

    public final void dropAnimatedNode(int tag) {
        this.animatedNodes.remove(tag);
        this.updatedNodes.remove(tag);
    }

    public final void extractAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).extractOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    public final void flattenAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).flattenOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    @Nullable
    public final AnimatedNode getNodeById(int id2) {
        return this.animatedNodes.get(id2);
    }

    @NotNull
    public final Set<Integer> getTagsOfConnectedNodes$ReactAndroid_release(int tag, @NotNull String eventName) {
        int i10;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        HashSet hashSet = new HashSet();
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (Intrinsics.areEqual(eventName, eventAnimationDriver.eventName) && tag == (i10 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i10));
                List<AnimatedNode> list = eventAnimationDriver.valueNode.children;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((AnimatedNode) it.next()).tag));
                    }
                }
            }
        }
        return hashSet;
    }

    public final void getValue(int tag, @Nullable Callback callback) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + tag + "] does not exist or is not a 'value' node");
        }
        double value = ((ValueAnimatedNode) animatedNode).getValue();
        if (callback != null) {
            callback.invoke(Double.valueOf(value));
            return;
        }
        if (this.reactApplicationContext == null) {
            return;
        }
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put("tag", tag);
        readableMapBuilder.put(EventKeys.VALUE_KEY, value);
        this.reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", createMap);
    }

    public final boolean hasActiveAnimations() {
        return this.activeAnimations.size() > 0 || this.updatedNodes.size() > 0;
    }

    public final void initializeEventListenerForUIManagerType(int uiManagerType) {
        if (uiManagerType == 2 ? this.eventListenerInitializedForFabric : this.eventListenerInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, uiManagerType);
        if (uIManager != null) {
            uIManager.getEventDispatcher().addListener(this);
            if (uiManagerType == 2) {
                this.eventListenerInitializedForFabric = true;
            } else {
                this.eventListenerInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(@NotNull final Event<?> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.f
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAnimatedNodesManager.this.handleEvent(event);
                }
            });
        }
    }

    public final void removeAnimatedEventFromView(int viewTag, @NotNull String eventHandlerName, int animatedValueTag) {
        Object obj;
        Intrinsics.checkNotNullParameter(eventHandlerName, "eventHandlerName");
        String normalizeEventName = normalizeEventName(eventHandlerName);
        Iterator<T> it = this.eventDrivers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) obj;
            if (Intrinsics.areEqual(normalizeEventName, eventAnimationDriver.eventName) && viewTag == eventAnimationDriver.viewTag && animatedValueTag == eventAnimationDriver.valueNode.tag) {
                break;
            }
        }
        EventAnimationDriver eventAnimationDriver2 = (EventAnimationDriver) obj;
        if (eventAnimationDriver2 != null) {
            this.eventDrivers.remove(eventAnimationDriver2);
        }
        if (Intrinsics.areEqual(normalizeEventName, "topScroll")) {
            removeAnimatedEventFromView(viewTag, "topScrollEnded", animatedValueTag);
        }
    }

    public final void restoreDefaultValues(int animatedNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            return;
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + PropsAnimatedNode.class.getName());
    }

    public final void runUpdates(long frameTimeNanos) {
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int size = this.updatedNodes.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnimatedNode valueAt = this.updatedNodes.valueAt(i10);
            List<AnimatedNode> list = this.runUpdateNodeList;
            Intrinsics.checkNotNull(valueAt);
            list.add(valueAt);
        }
        this.updatedNodes.clear();
        int size2 = this.activeAnimations.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            AnimationDriver valueAt2 = this.activeAnimations.valueAt(i11);
            valueAt2.runAnimationStep(frameTimeNanos);
            ValueAnimatedNode valueAnimatedNode = valueAt2.animatedValue;
            if (valueAnimatedNode != null) {
                this.runUpdateNodeList.add(valueAnimatedNode);
            }
            if (valueAt2.hasFinished) {
                z10 = true;
            }
        }
        updateNodes(this.runUpdateNodeList);
        this.runUpdateNodeList.clear();
        if (z10) {
            WritableArray writableArray = null;
            for (int size3 = this.activeAnimations.size() - 1; -1 < size3; size3--) {
                AnimationDriver valueAt3 = this.activeAnimations.valueAt(size3);
                if (valueAt3.hasFinished) {
                    ValueAnimatedNode valueAnimatedNode2 = valueAt3.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (valueAt3.endCallback != null) {
                        WritableMap createMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                        readableMapBuilder.put("finished", true);
                        readableMapBuilder.put(EventKeys.VALUE_KEY, valueAnimatedNode2.nodeValue);
                        readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                        Callback callback = valueAt3.endCallback;
                        if (callback != null) {
                            callback.invoke(createMap);
                        }
                    } else if (this.reactApplicationContext != null) {
                        WritableMap createMap2 = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
                        readableMapBuilder2.put("animationId", valueAt3.id);
                        readableMapBuilder2.put("finished", true);
                        readableMapBuilder2.put(EventKeys.VALUE_KEY, valueAnimatedNode2.nodeValue);
                        readableMapBuilder2.put("offset", valueAnimatedNode2.offset);
                        if (writableArray == null) {
                            writableArray = Arguments.createArray();
                        }
                        writableArray.pushMap(createMap2);
                    }
                    this.activeAnimations.removeAt(size3);
                }
            }
            if (writableArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
                return;
            }
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
        }
    }

    public final void setAnimatedNodeOffset(int tag, double offset) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).offset = offset;
            this.updatedNodes.put(tag, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
        }
    }

    public final void setAnimatedNodeValue(int tag, double value) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            stopAnimationsForNode(animatedNode);
            ((ValueAnimatedNode) animatedNode).nodeValue = value;
            this.updatedNodes.put(tag, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
        }
    }

    public final void startAnimatingNode(int animationId, int animatedNodeTag, @NotNull ReadableMap animationConfig, @Nullable Callback endCallback) {
        AnimationDriver frameBasedAnimationDriver;
        Intrinsics.checkNotNullParameter(animationConfig, "animationConfig");
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + animatedNodeTag + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + animatedNodeTag + "] should be of type " + ValueAnimatedNode.class.getName());
        }
        AnimationDriver animationDriver = this.activeAnimations.get(animationId);
        if (animationDriver != null) {
            animationDriver.resetConfig(animationConfig);
            return;
        }
        String string = animationConfig.getString("type");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != -895679987) {
                    if (hashCode == 95459258 && string.equals("decay")) {
                        frameBasedAnimationDriver = new DecayAnimation(animationConfig);
                        frameBasedAnimationDriver.id = animationId;
                        frameBasedAnimationDriver.endCallback = endCallback;
                        frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                        this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                        return;
                    }
                } else if (string.equals("spring")) {
                    frameBasedAnimationDriver = new SpringAnimation(animationConfig);
                    frameBasedAnimationDriver.id = animationId;
                    frameBasedAnimationDriver.endCallback = endCallback;
                    frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                    this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                    return;
                }
            } else if (string.equals("frames")) {
                frameBasedAnimationDriver = new FrameBasedAnimationDriver(animationConfig);
                frameBasedAnimationDriver.id = animationId;
                frameBasedAnimationDriver.endCallback = endCallback;
                frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + animatedNodeTag + "]: " + string);
    }

    public final void startListeningToAnimatedNodeValue(int tag, @Nullable AnimatedNodeValueListener listener) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(listener);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    public final void stopAnimation(int animationId) {
        WritableArray writableArray;
        ReactApplicationContext reactApplicationContext;
        int size = this.activeAnimations.size();
        int i10 = 0;
        while (true) {
            writableArray = null;
            if (i10 >= size) {
                break;
            }
            AnimationDriver valueAt = this.activeAnimations.valueAt(i10);
            if (valueAt.id == animationId) {
                if (valueAt.endCallback != null) {
                    WritableMap createMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                    readableMapBuilder.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode = valueAt.animatedValue;
                    if (valueAnimatedNode == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put(EventKeys.VALUE_KEY, valueAnimatedNode.nodeValue);
                    ValueAnimatedNode valueAnimatedNode2 = valueAt.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                    Callback callback = valueAt.endCallback;
                    if (callback == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    callback.invoke(createMap);
                } else if (this.reactApplicationContext != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
                    readableMapBuilder2.put("animationId", valueAt.id);
                    readableMapBuilder2.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode3 = valueAt.animatedValue;
                    if (valueAnimatedNode3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put(EventKeys.VALUE_KEY, valueAnimatedNode3.nodeValue);
                    ValueAnimatedNode valueAnimatedNode4 = valueAt.animatedValue;
                    if (valueAnimatedNode4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put("offset", valueAnimatedNode4.offset);
                    writableArray = Arguments.createArray();
                    writableArray.pushMap(createMap2);
                }
                this.activeAnimations.removeAt(i10);
            } else {
                i10++;
            }
        }
        if (writableArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
    }

    public final void stopListeningToAnimatedNodeValue(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateAnimatedNodeConfig(int tag, @Nullable ReadableMap config) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + tag + "] does not exist");
        }
        if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
            stopAnimationsForNode(animatedNode);
            ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(config);
            this.updatedNodes.put(tag, animatedNode);
        }
    }
}
