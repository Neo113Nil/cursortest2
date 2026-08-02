package com.facebook.react.animated;

import androidx.lifecycle.AbstractC2177b;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\n\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00017\b\u0007\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004lmnoB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u0014\u0010\"\u001a\u00020\u001e2\n\u0010#\u001a\u00060$R\u00020\u0000H\u0002J\u0014\u0010%\u001a\u00020\u001e2\n\u0010#\u001a\u00060$R\u00020\u0000H\u0002J\u0014\u0010&\u001a\u00020\u001e2\n\u0010#\u001a\u00060$R\u00020\u0000H\u0002J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0017J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0017J\b\u0010.\u001a\u00020\u001eH\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00109\u001a\u00020\u001eH\u0002J\b\u0010:\u001a\u00020\u001eH\u0002J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010=\u001a\u00020\u001eH\u0016J\b\u0010>\u001a\u00020\u001eH\u0016J\u0018\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010G\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010H\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010I\u001a\u00020AH\u0016J\u0018\u0010J\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010I\u001a\u00020AH\u0016J\u0010\u0010K\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010L\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0016J(\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020AH\u0016J\u0018\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020AH\u0016J\u0018\u0010W\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020AH\u0016J\u0018\u0010X\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020A2\u0006\u0010Y\u001a\u00020AH\u0016J\u0018\u0010Z\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020A2\u0006\u0010Y\u001a\u00020AH\u0016J\u0010\u0010[\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020AH\u0016J \u0010\\\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020A2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020CH\u0016J \u0010`\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020A2\u0006\u0010]\u001a\u00020^2\u0006\u0010a\u001a\u00020AH\u0016J\u0010\u0010b\u001a\u00020\u001e2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020AH\u0016J\u0018\u0010e\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020A2\u0006\u0010g\u001a\u00020RH\u0016J\b\u0010h\u001a\u00020\u001eH\u0016J\u0010\u0010i\u001a\u00020\u001e2\u0006\u0010j\u001a\u00020kH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010\u000f2\b\u00100\u001a\u0004\u0018\u00010\u000f8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0004\n\u0002\u00108¨\u0006p"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactChoreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "preOperations", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "batchingControlledByJS", "", "currentFrameNumber", "", "currentBatchNumber", "initializedForFabric", "initializedForNonFabric", "uiManagerType", "", "getUiManagerType$annotations", "()V", "numFabricAnimations", "numNonFabricAnimations", "userDrivenScrollEnded", "", "viewTag", "initialize", "onHostResume", "addOperation", "operation", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "addUnbatchedOperation", "addPreOperation", "didScheduleMountItems", "uiManager", "Lcom/facebook/react/bridge/UIManager;", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "nodesManager", "getNodesManager", "()Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "setNodesManager", "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "enqueuedAnimationOnFrame", "animatedFrameCallback", "com/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1", "Lcom/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1;", "clearFrameCallback", "enqueueFrameCallback", "initializeLifecycleEventListenersForViewTag", "decrementInFlightAnimationsForViewTag", "startOperationBatch", "finishOperationBatch", "createAnimatedNode", "tagDouble", "", "config", "Lcom/facebook/react/bridge/ReadableMap;", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "setAnimatedNodeValue", EventKeys.VALUE_KEY, "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "startAnimatingNode", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "endCallback", "Lcom/facebook/react/bridge/Callback;", "stopAnimation", "connectAnimatedNodes", "parentNodeTagDouble", "childNodeTagDouble", "disconnectAnimatedNodes", "connectAnimatedNodeToView", "viewTagDouble", "disconnectAnimatedNodeFromView", "restoreDefaultValues", "addAnimatedEventToView", "eventName", "", "eventMapping", "removeAnimatedEventFromView", "animatedValueTagDouble", "addListener", "removeListeners", "count", "getValue", "animatedValueNodeTagDouble", "callback", "invalidate", "queueAndExecuteBatchedOperations", "opsAndArgs", "Lcom/facebook/react/bridge/ReadableArray;", "BatchExecutionOpCodes", "UIThreadOperation", "ConcurrentOperationQueue", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeAnimatedModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1121:1\n30#2,3:1122\n30#2,3:1127\n1869#3,2:1125\n*S KotlinDebug\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule\n*L\n232#1:1122,3\n540#1:1127,3\n232#1:1125,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;

    @NotNull
    public static final String NAME = "NativeAnimatedModule";

    @NotNull
    private final NativeAnimatedModule$animatedFrameCallback$1 animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;
    private boolean initializedForNonFabric;

    @NotNull
    private final AtomicReference<NativeAnimatedNodesManager> nodesManagerRef;
    private int numFabricAnimations;
    private int numNonFabricAnimations;

    @NotNull
    private final ConcurrentOperationQueue operations;

    @NotNull
    private final ConcurrentOperationQueue preOperations;

    @NotNull
    private final ReactChoreographer reactChoreographer;
    private int uiManagerType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "", EventKeys.VALUE_KEY, "", "<init>", "(Ljava/lang/String;II)V", "OP_CODE_CREATE_ANIMATED_NODE", "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", "OP_CODE_GET_VALUE", "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_CODE_CONNECT_ANIMATED_NODES", "OP_CODE_DISCONNECT_ANIMATED_NODES", "OP_CODE_START_ANIMATING_NODE", "OP_CODE_STOP_ANIMATION", "OP_CODE_SET_ANIMATED_NODE_VALUE", "OP_CODE_SET_ANIMATED_NODE_OFFSET", "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", "OP_CODE_RESTORE_DEFAULT_VALUES", "OP_CODE_DROP_ANIMATED_NODE", "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", "OP_CODE_ADD_LISTENER", "OP_CODE_REMOVE_LISTENERS", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BatchExecutionOpCodes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BatchExecutionOpCodes[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @Nullable
        private static BatchExecutionOpCodes[] valueMap;
        public static final BatchExecutionOpCodes OP_CODE_CREATE_ANIMATED_NODE = new BatchExecutionOpCodes("OP_CODE_CREATE_ANIMATED_NODE", 0, 1);
        public static final BatchExecutionOpCodes OP_CODE_UPDATE_ANIMATED_NODE_CONFIG = new BatchExecutionOpCodes("OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", 1, 2);
        public static final BatchExecutionOpCodes OP_CODE_GET_VALUE = new BatchExecutionOpCodes("OP_CODE_GET_VALUE", 2, 3);
        public static final BatchExecutionOpCodes OP_START_LISTENING_TO_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", 3, 4);
        public static final BatchExecutionOpCodes OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", 4, 5);
        public static final BatchExecutionOpCodes OP_CODE_CONNECT_ANIMATED_NODES = new BatchExecutionOpCodes("OP_CODE_CONNECT_ANIMATED_NODES", 5, 6);
        public static final BatchExecutionOpCodes OP_CODE_DISCONNECT_ANIMATED_NODES = new BatchExecutionOpCodes("OP_CODE_DISCONNECT_ANIMATED_NODES", 6, 7);
        public static final BatchExecutionOpCodes OP_CODE_START_ANIMATING_NODE = new BatchExecutionOpCodes("OP_CODE_START_ANIMATING_NODE", 7, 8);
        public static final BatchExecutionOpCodes OP_CODE_STOP_ANIMATION = new BatchExecutionOpCodes("OP_CODE_STOP_ANIMATION", 8, 9);
        public static final BatchExecutionOpCodes OP_CODE_SET_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_CODE_SET_ANIMATED_NODE_VALUE", 9, 10);
        public static final BatchExecutionOpCodes OP_CODE_SET_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_SET_ANIMATED_NODE_OFFSET", 10, 11);
        public static final BatchExecutionOpCodes OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", 11, 12);
        public static final BatchExecutionOpCodes OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", 12, 13);
        public static final BatchExecutionOpCodes OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW = new BatchExecutionOpCodes("OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", 13, 14);
        public static final BatchExecutionOpCodes OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW = new BatchExecutionOpCodes("OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", 14, 15);
        public static final BatchExecutionOpCodes OP_CODE_RESTORE_DEFAULT_VALUES = new BatchExecutionOpCodes("OP_CODE_RESTORE_DEFAULT_VALUES", 15, 16);
        public static final BatchExecutionOpCodes OP_CODE_DROP_ANIMATED_NODE = new BatchExecutionOpCodes("OP_CODE_DROP_ANIMATED_NODE", 16, 17);
        public static final BatchExecutionOpCodes OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW = new BatchExecutionOpCodes("OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", 17, 18);
        public static final BatchExecutionOpCodes OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW = new BatchExecutionOpCodes("OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", 18, 19);
        public static final BatchExecutionOpCodes OP_CODE_ADD_LISTENER = new BatchExecutionOpCodes("OP_CODE_ADD_LISTENER", 19, 20);
        public static final BatchExecutionOpCodes OP_CODE_REMOVE_LISTENERS = new BatchExecutionOpCodes("OP_CODE_REMOVE_LISTENERS", 20, 21);

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes$Companion;", "", "<init>", "()V", "valueMap", "", "Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "fromId", StackTraceHelper.ID_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final BatchExecutionOpCodes fromId(int id2) {
                BatchExecutionOpCodes[] batchExecutionOpCodesArr = BatchExecutionOpCodes.valueMap;
                if (batchExecutionOpCodesArr == null) {
                    batchExecutionOpCodesArr = BatchExecutionOpCodes.values();
                }
                if (BatchExecutionOpCodes.valueMap == null) {
                    BatchExecutionOpCodes.valueMap = batchExecutionOpCodesArr;
                }
                return batchExecutionOpCodesArr[id2 - 1];
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ BatchExecutionOpCodes[] $values() {
            return new BatchExecutionOpCodes[]{OP_CODE_CREATE_ANIMATED_NODE, OP_CODE_UPDATE_ANIMATED_NODE_CONFIG, OP_CODE_GET_VALUE, OP_START_LISTENING_TO_ANIMATED_NODE_VALUE, OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE, OP_CODE_CONNECT_ANIMATED_NODES, OP_CODE_DISCONNECT_ANIMATED_NODES, OP_CODE_START_ANIMATING_NODE, OP_CODE_STOP_ANIMATION, OP_CODE_SET_ANIMATED_NODE_VALUE, OP_CODE_SET_ANIMATED_NODE_OFFSET, OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET, OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET, OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW, OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW, OP_CODE_RESTORE_DEFAULT_VALUES, OP_CODE_DROP_ANIMATED_NODE, OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW, OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW, OP_CODE_ADD_LISTENER, OP_CODE_REMOVE_LISTENERS};
        }

        static {
            BatchExecutionOpCodes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private BatchExecutionOpCodes(String str, int i10, int i11) {
        }

        @JvmStatic
        @NotNull
        public static final BatchExecutionOpCodes fromId(int i10) {
            return INSTANCE.fromId(i10);
        }

        @NotNull
        public static EnumEntries<BatchExecutionOpCodes> getEntries() {
            return $ENTRIES;
        }

        public static BatchExecutionOpCodes valueOf(String str) {
            return (BatchExecutionOpCodes) Enum.valueOf(BatchExecutionOpCodes.class, str);
        }

        public static BatchExecutionOpCodes[] values() {
            return (BatchExecutionOpCodes[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0006R\u00020\u0007H\u0007J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0014\u001a\u000e\u0012\b\u0012\u00060\u0006R\u00020\u0007\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "", "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "queue", "Ljava/util/Queue;", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "Lcom/facebook/react/animated/NativeAnimatedModule;", "peekedOperation", "isEmpty", "", "()Z", "add", "", "operation", "executeBatch", "maxBatchNumber", "", "nodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "drainQueueIntoList", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ConcurrentOperationQueue {

        @Nullable
        private UIThreadOperation peekedOperation;

        @NotNull
        private final Queue<UIThreadOperation> queue = new ConcurrentLinkedQueue();

        public ConcurrentOperationQueue() {
        }

        public final void add(@NotNull UIThreadOperation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.queue.add(operation);
        }

        @Nullable
        public final List<UIThreadOperation> drainQueueIntoList(long maxBatchNumber) {
            if (isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                UIThreadOperation uIThreadOperation = this.peekedOperation;
                if (uIThreadOperation != null) {
                    if (uIThreadOperation.getBatchNumber() > maxBatchNumber) {
                        break;
                    }
                    arrayList.add(uIThreadOperation);
                    this.peekedOperation = null;
                }
                UIThreadOperation poll = this.queue.poll();
                if (poll == null) {
                    break;
                }
                if (poll.getBatchNumber() > maxBatchNumber) {
                    this.peekedOperation = poll;
                    return arrayList;
                }
                arrayList.add(poll);
            }
            return arrayList;
        }

        public final void executeBatch(long maxBatchNumber, @Nullable NativeAnimatedNodesManager nodesManager) {
            List<UIThreadOperation> drainQueueIntoList = drainQueueIntoList(maxBatchNumber);
            if (drainQueueIntoList != null) {
                for (UIThreadOperation uIThreadOperation : drainQueueIntoList) {
                    if (nodesManager == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    uIThreadOperation.execute(nodesManager);
                }
            }
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty() && this.peekedOperation == null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "", "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "execute", "", "animatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "batchNumber", "", "getBatchNumber", "()J", "setBatchNumber", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class UIThreadOperation {
        private long batchNumber = -1;

        public UIThreadOperation() {
        }

        public abstract void execute(@NotNull NativeAnimatedNodesManager animatedNodesManager);

        public final long getBatchNumber() {
            return this.batchNumber;
        }

        public final void setBatchNumber(long j10) {
            this.batchNumber = j10;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatchExecutionOpCodes.values().length];
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1] */
    public NativeAnimatedModule(@NotNull final ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactChoreographer = ReactChoreographer.INSTANCE.getInstance();
        this.operations = new ConcurrentOperationQueue();
        this.preOperations = new ConcurrentOperationQueue();
        this.nodesManagerRef = new AtomicReference<>();
        this.uiManagerType = 1;
        this.animatedFrameCallback = new GuardedFrameCallback(reactContext) { // from class: com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long frameTimeNanos) {
                try {
                    this.enqueuedAnimationOnFrame = false;
                    NativeAnimatedNodesManager nodesManager = this.getNodesManager();
                    if (nodesManager == null) {
                        return;
                    }
                    if (nodesManager.hasActiveAnimations()) {
                        nodesManager.runUpdates(frameTimeNanos);
                    }
                    this.enqueueFrameCallback();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
    }

    private final void addOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.operations.add(operation);
    }

    private final void addPreOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.preOperations.add(operation);
    }

    private final void addUnbatchedOperation(UIThreadOperation operation) {
        operation.setBatchNumber(-1L);
        this.operations.add(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementInFlightAnimationsForViewTag(int viewTag) {
        if (ViewUtil.getUIManagerType(viewTag) == 2) {
            this.numFabricAnimations--;
        } else {
            this.numNonFabricAnimations--;
        }
        int i10 = this.numNonFabricAnimations;
        if (i10 == 0 && this.numFabricAnimations > 0 && this.uiManagerType != 2) {
            this.uiManagerType = 2;
        } else {
            if (this.numFabricAnimations != 0 || i10 <= 0 || this.uiManagerType == 1) {
                return;
            }
            this.uiManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private static /* synthetic */ void getUiManagerType$annotations() {
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManager;
        int uIManagerType = ViewUtil.getUIManagerType(viewTag);
        this.uiManagerType = uIManagerType;
        if (uIManagerType == 2) {
            this.numFabricAnimations++;
        } else {
            this.numNonFabricAnimations++;
        }
        NativeAnimatedNodesManager nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.initializeEventListenerForUIManagerType(this.uiManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if ((this.uiManagerType == 2 ? this.initializedForFabric : this.initializedForNonFabric) || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManager = UIManagerHelper.getUIManager(reactApplicationContextIfActiveOrWarn, this.uiManagerType)) == null) {
            return;
        }
        uIManager.addUIManagerEventListener(this);
        if (this.uiManagerType == 2) {
            this.initializedForFabric = true;
        } else {
            this.initializedForNonFabric = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put("tag", i10);
        readableMapBuilder.put(EventKeys.VALUE_KEY, d10);
        readableMapBuilder.put("offset", d11);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder putArray) {
        Intrinsics.checkNotNullParameter(putArray, "$this$putArray");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            putArray.add(((Number) it.next()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$3(NativeAnimatedModule nativeAnimatedModule, long j10, NativeViewHierarchyManager it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativeAnimatedModule.preOperations.executeBatch(j10, nativeAnimatedModule.getNodesManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$4(NativeAnimatedModule nativeAnimatedModule, long j10, NativeViewHierarchyManager it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativeAnimatedModule.operations.executeBatch(j10, nativeAnimatedModule.getNodesManager());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, @NotNull final String eventName, @NotNull final ReadableMap eventMapping) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventMapping, "eventMapping");
        final int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$addAnimatedEventToView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.addAnimatedEventToView(i10, eventName, eventMapping);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        final int i11 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$connectAnimatedNodeToView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodeToView(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i10 = (int) parentNodeTagDouble;
        final int i11 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$connectAnimatedNodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodes(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, @NotNull final ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$createAnimatedNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.createAnimatedNode(i10, config);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (this.uiManagerType != 2) {
            return;
        }
        long j10 = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j10 = this.currentBatchNumber;
            }
        }
        this.preOperations.executeBatch(j10, getNodesManager());
        this.operations.executeBatch(j10, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        final int i11 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$disconnectAnimatedNodeFromView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodeFromView(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i10 = (int) parentNodeTagDouble;
        final int i11 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$disconnectAnimatedNodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodes(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$dropAnimatedNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.dropAnimatedNode(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$extractAnimatedNodeOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.extractAnimatedNodeOffset(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$flattenAnimatedNodeOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.flattenAnimatedNodeOffset(i10);
            }
        });
    }

    @Nullable
    public final NativeAnimatedNodesManager getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            AbstractC2177b.a(this.nodesManagerRef, null, new NativeAnimatedNodesManager(reactApplicationContextIfActiveOrWarn));
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final int i10 = (int) animatedValueNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$getValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.getValue(i10, callback);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(@NotNull ReadableArray opsAndArgs) {
        Intrinsics.checkNotNullParameter(opsAndArgs, "opsAndArgs");
        int size = opsAndArgs.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (WhenMappings.$EnumSwitchMapping$0[BatchExecutionOpCodes.INSTANCE.fromId(opsAndArgs.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i10 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i12));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i11));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new NativeAnimatedModule$queueAndExecuteBatchedOperations$1(this, size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, @NotNull final String eventName, double animatedValueTagDouble) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        final int i10 = (int) viewTagDouble;
        final int i11 = (int) animatedValueTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$removeAnimatedEventFromView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.removeAnimatedEventFromView(i10, eventName, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        addPreOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$restoreDefaultValues$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.restoreDefaultValues(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, final double value) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$setAnimatedNodeOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeOffset(i10, value);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, final double value) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$setAnimatedNodeValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeValue(i10, value);
            }
        });
    }

    @VisibleForTesting
    public final void setNodesManager(@Nullable NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.nodesManagerRef.set(nativeAnimatedNodesManager);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, @NotNull final ReadableMap animationConfig, @NotNull final Callback endCallback) {
        Intrinsics.checkNotNullParameter(animationConfig, "animationConfig");
        Intrinsics.checkNotNullParameter(endCallback, "endCallback");
        final int i10 = (int) animationIdDouble;
        final int i11 = (int) animatedNodeTagDouble;
        addUnbatchedOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$startAnimatingNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startAnimatingNode(i10, i11, animationConfig, endCallback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        final int i10 = (int) tagDouble;
        final AnimatedNodeValueListener animatedNodeValueListener = new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.a
            @Override // com.facebook.react.animated.AnimatedNodeValueListener
            public final void onValueUpdate(double d10, double d11) {
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule.this, i10, d10, d11);
            }
        };
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$startListeningToAnimatedNodeValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startListeningToAnimatedNodeValue(i10, animatedNodeValueListener);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        final int i10 = (int) animationIdDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$stopAnimation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopAnimation(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$stopListeningToAnimatedNodeValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopListeningToAnimatedNodeValue(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, @NotNull final ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule$updateAnimatedNodeConfig$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.updateAnimatedNodeConfig(i10, config);
            }
        });
    }

    public final void userDrivenScrollEnded(int viewTag) {
        NativeAnimatedNodesManager nativeAnimatedNodesManager = this.nodesManagerRef.get();
        if (nativeAnimatedNodesManager == null) {
            return;
        }
        final Set<Integer> tagsOfConnectedNodes$ReactAndroid_release = nativeAnimatedNodesManager.getTagsOfConnectedNodes$ReactAndroid_release(viewTag, "topScrollEnded");
        if (tagsOfConnectedNodes$ReactAndroid_release.isEmpty()) {
            return;
        }
        WritableMap createMap = Arguments.createMap();
        new ReadableMapBuilder(createMap).putArray("tags", new Function1() { // from class: com.facebook.react.animated.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit userDrivenScrollEnded$lambda$2$lambda$1;
                userDrivenScrollEnded$lambda$2$lambda$1 = NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1(tagsOfConnectedNodes$ReactAndroid_release, (ReadableArrayBuilder) obj);
                return userDrivenScrollEnded$lambda$2$lambda$1;
            }
        });
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", createMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if ((this.operations.isEmpty() && this.preOperations.isEmpty()) || this.uiManagerType == 2 || ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return;
        }
        final long j10 = this.currentBatchNumber;
        this.currentBatchNumber = 1 + j10;
        UIBlock uIBlock = new UIBlock() { // from class: com.facebook.react.animated.c
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$3(NativeAnimatedModule.this, j10, nativeViewHierarchyManager);
            }
        };
        UIBlock uIBlock2 = new UIBlock() { // from class: com.facebook.react.animated.d
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$4(NativeAnimatedModule.this, j10, nativeViewHierarchyManager);
            }
        };
        UIManagerModule uIManagerModule = (UIManagerModule) uiManager;
        uIManagerModule.prependUIBlock(uIBlock);
        uIManagerModule.addUIBlock(uIBlock2);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
