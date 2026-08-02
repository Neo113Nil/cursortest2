package com.facebook.react.fabric.mounting;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001d\u001a\u00020\u0019H\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0007J\b\u0010\u001e\u001a\u00020\u0019H\u0003J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0011H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0003J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003J\u0010\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher;", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "itemDispatchListener", "Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "<init>", "(Lcom/facebook/react/fabric/mounting/MountingManager;Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;)V", "viewCommandMountItems", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "mountItems", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "preMountItems", "inDispatch", "", EventKeys.VALUE_KEY, "", "batchedExecutionTime", "getBatchedExecutionTime", "()J", "runStartTime", "getRunStartTime", "lastFrameTimeNanos", "addViewCommandMountItem", "", "mountItem", "addMountItem", "addPreAllocateMountItem", "tryDispatchMountItems", "dispatchMountItems", "dispatchPreMountItems", "frameTimeNanos", "dispatchPreMountItemsImpl", "deadline", "executeOrEnqueue", "item", "getAndResetViewCommandMountItems", "", "getAndResetMountItems", "getAndResetPreMountItems", "ItemDispatchListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n1#2:395\n*E\n"})
/* loaded from: classes2.dex */
public final class MountItemDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long FRAME_TIME_NS = 16666666;

    @NotNull
    private static final String TAG = "MountItemDispatcher";
    private long batchedExecutionTime;
    private boolean inDispatch;

    @NotNull
    private final ItemDispatchListener itemDispatchListener;
    private long lastFrameTimeNanos;

    @NotNull
    private final Queue<MountItem> mountItems;

    @NotNull
    private final MountingManager mountingManager;

    @NotNull
    private final Queue<MountItem> preMountItems;
    private long runStartTime;

    @NotNull
    private final Queue<DispatchCommandMountItem> viewCommandMountItems;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$Companion;", "", "<init>", "()V", "TAG", "", "FRAME_TIME_NS", "", "drainConcurrentItemQueue", "", "E", "queue", "Ljava/util/Queue;", "printMountItem", "", "mountItem", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "prefix", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n1#2:395\n739#3,9:396\n*S KotlinDebug\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n*L\n386#1:396,9\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <E> List<E> drainConcurrentItemQueue(Queue<E> queue) {
            if (queue.isEmpty()) {
                return null;
            }
            List createListBuilder = CollectionsKt.createListBuilder();
            do {
                E poll = queue.poll();
                if (poll != null) {
                    createListBuilder.add(poll);
                }
            } while (!queue.isEmpty());
            List<E> build = CollectionsKt.build(createListBuilder);
            if (build.isEmpty()) {
                return null;
            }
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void printMountItem(MountItem mountItem, String prefix) {
            List emptyList;
            List split$default = StringsKt.split$default((CharSequence) mountItem.toString(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null);
            if (!split$default.isEmpty()) {
                ListIterator listIterator = split$default.listIterator(split$default.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                E6.a.m(MountItemDispatcher.TAG, prefix + ": " + ((String) it.next()));
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "", "willMountItems", "", "mountItems", "", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "didMountItems", "didDispatchMountItems", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(@Nullable List<? extends MountItem> mountItems);

        void willMountItems(@Nullable List<? extends MountItem> mountItems);
    }

    public MountItemDispatcher(@NotNull MountingManager mountingManager, @NotNull ItemDispatchListener itemDispatchListener) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        Intrinsics.checkNotNullParameter(itemDispatchListener, "itemDispatchListener");
        this.mountingManager = mountingManager;
        this.itemDispatchListener = itemDispatchListener;
        this.viewCommandMountItems = new ConcurrentLinkedQueue();
        this.mountItems = new ConcurrentLinkedQueue();
        this.preMountItems = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMountItems$lambda$1(MountItemDispatcher mountItemDispatcher, DispatchCommandMountItem command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            Companion.printMountItem(command, "dispatchMountItems: Executing viewCommandMountItem");
        }
        try {
            mountItemDispatcher.executeOrEnqueue(command);
        } catch (RetryableMountingLayerException e10) {
            if (command.getNumRetries() == 0) {
                command.incrementRetries();
                mountItemDispatcher.addViewCommandMountItem(command);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + command, e10));
            }
        } catch (Throwable th2) {
            ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + command, th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Finally extract failed */
    private final void dispatchPreMountItemsImpl(long deadline) {
        MountItem poll;
        A8.a.c(0L, "MountItemDispatcher::premountViews");
        this.inDispatch = true;
        while (System.nanoTime() <= deadline && (poll = this.preMountItems.poll()) != null) {
            try {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(poll, "dispatchPreMountItems");
                }
                executeOrEnqueue(poll);
            } catch (Throwable th2) {
                this.inDispatch = false;
                throw th2;
            }
        }
        this.inDispatch = false;
        A8.a.i(0L);
    }

    private final void executeOrEnqueue(MountItem item) {
        if (!this.mountingManager.isWaitingForViewAttach(item.getSurfaceId())) {
            item.execute(this.mountingManager);
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            E6.a.o(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(item.getSurfaceId()));
        }
        this.mountingManager.getSurfaceManagerEnforced(item.getSurfaceId(), "MountItemDispatcher::executeOrEnqueue").scheduleMountItemOnViewAttach(item);
    }

    private final List<MountItem> getAndResetMountItems() {
        return Companion.drainConcurrentItemQueue(this.mountItems);
    }

    private final List<MountItem> getAndResetPreMountItems() {
        return Companion.drainConcurrentItemQueue(this.preMountItems);
    }

    private final List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return Companion.drainConcurrentItemQueue(this.viewCommandMountItems);
    }

    public final void addMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        this.mountItems.add(mountItem);
    }

    public final void addPreAllocateMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        if (!this.mountingManager.surfaceIsStopped(mountItem.getSurfaceId())) {
            this.preMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            E6.a.o(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.getSurfaceId()), mountItem.toString());
        }
    }

    public final void addViewCommandMountItem(@NotNull DispatchCommandMountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        if (ReactNativeFeatureFlags.disableEarlyViewCommandExecution()) {
            this.mountItems.add(mountItem);
        } else {
            this.viewCommandMountItems.add(mountItem);
        }
    }

    public final void dispatchMountItems(@NotNull Queue<MountItem> mountItems) {
        Intrinsics.checkNotNullParameter(mountItems, "mountItems");
        while (!mountItems.isEmpty()) {
            MountItem poll = mountItems.poll();
            if (poll == null) {
                throw new IllegalArgumentException("MountItem should not be null");
            }
            MountItem mountItem = poll;
            try {
                mountItem.execute(this.mountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (mountItem instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItem;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    Companion.printMountItem(mountItem, "dispatchExternalMountItems: mounting failed with " + e10.getMessage());
                }
            }
        }
    }

    public final void dispatchPreMountItems(long frameTimeNanos) {
        this.lastFrameTimeNanos = frameTimeNanos;
        if (this.preMountItems.isEmpty()) {
            return;
        }
        dispatchPreMountItemsImpl(this.lastFrameTimeNanos + 8333333);
    }

    public final long getBatchedExecutionTime() {
        return this.batchedExecutionTime;
    }

    public final long getRunStartTime() {
        return this.runStartTime;
    }

    public final void tryDispatchMountItems() {
        if (this.inDispatch) {
            return;
        }
        this.inDispatch = true;
        try {
            dispatchMountItems();
            this.inDispatch = false;
            this.itemDispatchListener.didDispatchMountItems();
        } catch (Throwable th2) {
            this.inDispatch = false;
            throw th2;
        }
    }

    private final void dispatchMountItems() {
        boolean isIgnorable;
        this.batchedExecutionTime = 0L;
        this.runStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return;
        }
        this.itemDispatchListener.willMountItems(andResetMountItems);
        Function1 function1 = new Function1() { // from class: com.facebook.react.fabric.mounting.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit dispatchMountItems$lambda$1;
                dispatchMountItems$lambda$1 = MountItemDispatcher.dispatchMountItems$lambda$1(MountItemDispatcher.this, (DispatchCommandMountItem) obj);
                return dispatchMountItems$lambda$1;
            }
        };
        if (andResetViewCommandMountItems != null) {
            A8.a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            Iterator<DispatchCommandMountItem> it = andResetViewCommandMountItems.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            A8.a.i(0L);
        }
        List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            A8.a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : andResetPreMountItems) {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            A8.a.i(0L);
        }
        if (andResetMountItems != null) {
            A8.a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<MountItem> it2 = andResetMountItems.iterator();
            while (it2.hasNext()) {
                MountItem next = it2.next();
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(next, "dispatchMountItems: Executing mountItem");
                }
                DispatchCommandMountItem dispatchCommandMountItem = next instanceof DispatchCommandMountItem ? (DispatchCommandMountItem) next : null;
                if (dispatchCommandMountItem != null) {
                    function1.invoke(dispatchCommandMountItem);
                } else {
                    try {
                        executeOrEnqueue(next);
                    } finally {
                        if (isIgnorable) {
                        }
                    }
                }
            }
            this.batchedExecutionTime += SystemClock.uptimeMillis() - uptimeMillis;
            A8.a.i(0L);
        }
        this.itemDispatchListener.didMountItems(andResetMountItems);
    }
}
