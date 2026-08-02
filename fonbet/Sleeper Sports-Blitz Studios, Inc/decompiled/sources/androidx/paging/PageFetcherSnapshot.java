package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002By\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u000bJ\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0086@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010.J\u001e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0082@¢\u0006\u0002\u00105J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u00101\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u00109J5\u0010:\u001a\u00020;2\u0006\u00101\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00018\u00002\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010>H\u0002¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u000bH\u0002J \u0010A\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\b\u0010*\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020D0\n2\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u0010EJ7\u0010F\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020DH\u0002¢\u0006\u0002\u0010JJ.\u0010K\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010L\u001a\u00020MH\u0082@¢\u0006\u0002\u0010NJ&\u0010O\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u0010PJ\f\u0010Q\u001a\u00020\u000b*\u00020RH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "Key", "", "Value", "initialKey", "pagingSource", "Landroidx/paging/PagingSource;", AnalyticsConstantsKt.KEY_CONFIG, "Landroidx/paging/PagingConfig;", "retryFlow", "Lkotlinx/coroutines/flow/Flow;", "", "remoteMediatorConnection", "Landroidx/paging/RemoteMediatorConnection;", "previousPagingState", "Landroidx/paging/PagingState;", "jumpCallback", "Lkotlin/Function0;", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "hintHandler", "Landroidx/paging/HintHandler;", "getInitialKey$paging_common_release", "()Ljava/lang/Object;", "Ljava/lang/Object;", "pageEventCh", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageEvent;", "pageEventChCollected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "pageEventChannelFlowJob", "Lkotlinx/coroutines/CompletableJob;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "getPagingSource$paging_common_release", "()Landroidx/paging/PagingSource;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "stateHolder", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "accessHint", "viewportHint", "Landroidx/paging/ViewportHint;", AnalyticsConstantsKt.CLOSE_BUTTON, "currentPagingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doInitialLoad", "doLoad", "loadType", "Landroidx/paging/LoadType;", "generationalHint", "Landroidx/paging/GenerationalViewportHint;", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadParams", "Landroidx/paging/PagingSource$LoadParams;", SDKConstants.PARAM_KEY, "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "loadResultLog", "", "loadKey", "result", "Landroidx/paging/PagingSource$LoadResult;", "(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;", "onInvalidLoad", "retryLoadError", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectAsGenerationalViewportHints", "", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextLoadKeyOrNull", "Landroidx/paging/PageFetcherSnapshotState;", "generationId", "presentedItemsBeyondAnchor", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "setError", "error", "Landroidx/paging/LoadState$Error;", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLoading", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumingHints", "Lkotlinx/coroutines/CoroutineScope;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingConfig config;
    private final HintHandler hintHandler;
    private final Key initialKey;
    private final Function0<Unit> jumpCallback;
    private final Channel<PageEvent<Value>> pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final CompletableJob pageEventChannelFlowJob;
    private final Flow<PageEvent<Value>> pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    private final PagingState<Key, Value> previousPagingState;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final Flow<Unit> retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource, PagingConfig config, Flow<Unit> retryFlow, RemoteMediatorConnection<Key, Value> remoteMediatorConnection, PagingState<Key, Value> pagingState, Function0<Unit> jumpCallback) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.previousPagingState = pagingState;
        this.jumpCallback = jumpCallback;
        if (config.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.hintHandler = new HintHandler();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.pageEventChannelFlowJob = Job$default;
        this.pageEventFlow = FlowKt.onStart(CancelableChannelFlowKt.cancelableChannelFlow(Job$default, new PageFetcherSnapshot$pageEventFlow$1(this, null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    public final Key getInitialKey$paging_common_release() {
        return this.initialKey;
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common_release() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, Flow flow, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, pagingSource, pagingConfig, flow, (i & 16) != 0 ? null : remoteMediatorConnection, (i & 32) != 0 ? null : pagingState, (i & 64) != 0 ? new Function0<Unit>() { // from class: androidx.paging.PageFetcherSnapshot.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : anonymousClass1);
    }

    public final Flow<PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object doInitialLoad = doInitialLoad(continuation);
            return doInitialLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doInitialLoad : Unit.INSTANCE;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        this.hintHandler.forceSetHint(loadType, viewportHint);
        return Unit.INSTANCE;
    }

    public final void accessHint(ViewportHint viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public final void close() {
        Job.DefaultImpls.cancel$default((Job) this.pageEventChannelFlowJob, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object currentPagingState(Continuation<? super PagingState<Key, Value>> continuation) {
        PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        int i;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        Mutex mutex;
        try {
            if (continuation instanceof PageFetcherSnapshot$currentPagingState$1) {
                pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState$1) continuation;
                if ((pageFetcherSnapshot$currentPagingState$1.label & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$currentPagingState$1.label -= Integer.MIN_VALUE;
                    Object obj = pageFetcherSnapshot$currentPagingState$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageFetcherSnapshot$currentPagingState$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        holder = this.stateHolder;
                        Mutex mutex2 = ((PageFetcherSnapshotState.Holder) holder).lock;
                        pageFetcherSnapshot$currentPagingState$1.L$0 = this;
                        pageFetcherSnapshot$currentPagingState$1.L$1 = holder;
                        pageFetcherSnapshot$currentPagingState$1.L$2 = mutex2;
                        pageFetcherSnapshot$currentPagingState$1.label = 1;
                        if (mutex2.lock(null, pageFetcherSnapshot$currentPagingState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) pageFetcherSnapshot$currentPagingState$1.L$2;
                        holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$currentPagingState$1.L$1;
                        pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$currentPagingState$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common_release(pageFetcherSnapshot.hintHandler.getLastAccessHint());
                }
            }
            return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common_release(pageFetcherSnapshot.hintHandler.getLastAccessHint());
        } finally {
            mutex.unlock(null);
        }
        pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, continuation);
        Object obj2 = pageFetcherSnapshot$currentPagingState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pageFetcherSnapshot$currentPagingState$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(CoroutineScope coroutineScope) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$1(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$3(this, null), 3, null);
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.INSTANCE.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x013d, code lost:
    
        if (r13 != r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:67:0x0164, B:69:0x018c, B:70:0x019d, B:72:0x01a6), top: B:66:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6 A[Catch: all -> 0x0290, TRY_LEAVE, TryCatch #0 {all -> 0x0290, blocks: (B:67:0x0164, B:69:0x018c, B:70:0x019d, B:72:0x01a6), top: B:66:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInitialLoad(Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        ?? r2;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot pageFetcherSnapshot;
        Mutex mutex;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        LoadType loadType;
        PageFetcherSnapshot pageFetcherSnapshot2;
        PagingLogger pagingLogger;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        Mutex mutex2;
        PagingSource.LoadResult<Key, Value> loadResult;
        PageFetcherSnapshot pageFetcherSnapshot3;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        Mutex mutex3;
        PagingSource.LoadResult<Key, Value> loadResult2;
        boolean insert;
        PagingSource.LoadResult<Key, Value> loadResult3;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        Mutex mutex4;
        PagingSource.LoadResult<Key, Value> loadResult4;
        PageFetcherSnapshot pageFetcherSnapshot5;
        Channel<PageEvent<Value>> channel;
        PageEvent<Value> pageEvent$paging_common_release;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        Mutex mutex5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        PagingSource.LoadResult.Page page;
        Mutex mutex6;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        LoadState.Error error;
        LoadType loadType2;
        try {
            try {
                if (continuation instanceof PageFetcherSnapshot$doInitialLoad$1) {
                    pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) continuation;
                    if ((pageFetcherSnapshot$doInitialLoad$1.label & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$doInitialLoad$1.label -= Integer.MIN_VALUE;
                        Object obj = pageFetcherSnapshot$doInitialLoad$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r2 = pageFetcherSnapshot$doInitialLoad$1.label;
                        switch (r2) {
                            case 0:
                                ResultKt.throwOnFailure(obj);
                                holder = this.stateHolder;
                                Mutex mutex7 = ((PageFetcherSnapshotState.Holder) holder).lock;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = this;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = holder;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex7;
                                pageFetcherSnapshot$doInitialLoad$1.label = 1;
                                if (mutex7.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                    pageFetcherSnapshot = this;
                                    mutex = mutex7;
                                    pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                                    loadType = LoadType.REFRESH;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = mutex;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 2;
                                    if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                                        r2 = mutex;
                                        Unit unit = Unit.INSTANCE;
                                        r2.unlock(null);
                                        PagingSource.LoadParams<Key> loadParams = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                                        pagingLogger = PagingLogger.INSTANCE;
                                        if (pagingLogger.isLoggable(3)) {
                                            pagingLogger.log(3, "Start REFRESH with loadKey " + pageFetcherSnapshot2.initialKey + " on " + pageFetcherSnapshot2.pagingSource, null);
                                        }
                                        PagingSource<Key, Value> pagingSource = pageFetcherSnapshot2.pagingSource;
                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                        pageFetcherSnapshot$doInitialLoad$1.label = 3;
                                        obj = pagingSource.load(loadParams, pageFetcherSnapshot$doInitialLoad$1);
                                        break;
                                    }
                                }
                                return coroutine_suspended;
                            case 1:
                                Mutex mutex8 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutex = mutex8;
                                pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                                loadType = LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = mutex;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 2;
                                if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                }
                                break;
                            case 2:
                                Mutex mutex9 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                r2 = mutex9;
                                Unit unit2 = Unit.INSTANCE;
                                r2.unlock(null);
                                PagingSource.LoadParams<Key> loadParams2 = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                                pagingLogger = PagingLogger.INSTANCE;
                                if (pagingLogger.isLoggable(3)) {
                                }
                                PagingSource<Key, Value> pagingSource2 = pageFetcherSnapshot2.pagingSource;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 3;
                                obj = pagingSource2.load(loadParams2, pageFetcherSnapshot$doInitialLoad$1);
                                break;
                            case 3:
                                PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                PagingSource.LoadResult<Key, Value> loadResult5 = (PagingSource.LoadResult) obj;
                                if (loadResult5 instanceof PagingSource.LoadResult.Page) {
                                    PageFetcherSnapshotState.Holder<Key, Value> holder6 = pageFetcherSnapshot2.stateHolder;
                                    Mutex mutex10 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult5;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = holder6;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex10;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 4;
                                    if (mutex10.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                        holder3 = holder6;
                                        mutex3 = mutex10;
                                        loadResult2 = loadResult5;
                                        try {
                                            PageFetcherSnapshotState pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder3).state;
                                            insert = pageFetcherSnapshotState3.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult2);
                                            pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.REFRESH, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                            if (((PagingSource.LoadResult.Page) loadResult2).getPrevKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.PREPEND, LoadState.NotLoading.INSTANCE.getComplete$paging_common_release());
                                            }
                                            if (((PagingSource.LoadResult.Page) loadResult2).getNextKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.APPEND, LoadState.NotLoading.INSTANCE.getComplete$paging_common_release());
                                            }
                                            if (!insert) {
                                                PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                if (pagingLogger2.isLoggable(3)) {
                                                    pagingLogger2.log(3, pageFetcherSnapshot3.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot3.initialKey, loadResult2), null);
                                                }
                                                holder4 = pageFetcherSnapshot3.stateHolder;
                                                Mutex mutex11 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot3;
                                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult2;
                                                pageFetcherSnapshot$doInitialLoad$1.L$2 = holder4;
                                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex11;
                                                pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                                if (mutex11.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                    mutex4 = mutex11;
                                                    loadResult4 = loadResult2;
                                                    pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                                    PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                    channel = pageFetcherSnapshot5.pageEventCh;
                                                    pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult4, LoadType.REFRESH);
                                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot5;
                                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult4;
                                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex4;
                                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                                    pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                                    if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                                        loadResult3 = loadResult4;
                                                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                                        r2 = mutex4;
                                                        Unit unit3 = Unit.INSTANCE;
                                                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                                            PagingSource.LoadResult.Page page2 = (PagingSource.LoadResult.Page) loadResult3;
                                                            if (page2.getPrevKey() == null || page2.getNextKey() == null) {
                                                                holder5 = pageFetcherSnapshot4.stateHolder;
                                                                Mutex mutex12 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot4;
                                                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult3;
                                                                pageFetcherSnapshot$doInitialLoad$1.L$2 = holder5;
                                                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex12;
                                                                pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                                                if (mutex12.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                                    mutex5 = mutex12;
                                                                    pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                                                    try {
                                                                        PagingState<Key, Value> currentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot6.hintHandler.getLastAccessHint());
                                                                        mutex5.unlock(null);
                                                                        page = (PagingSource.LoadResult.Page) loadResult3;
                                                                        if (page.getPrevKey() == null) {
                                                                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, currentPagingState$paging_common_release);
                                                                        }
                                                                        if (page.getNextKey() == null) {
                                                                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, currentPagingState$paging_common_release);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else {
                                                PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                                if (pagingLogger3.isLoggable(2)) {
                                                    pagingLogger3.log(2, pageFetcherSnapshot3.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot3.initialKey, null), null);
                                                }
                                                loadResult3 = loadResult2;
                                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                                                if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    if (!(loadResult5 instanceof PagingSource.LoadResult.Error)) {
                                        if (loadResult5 instanceof PagingSource.LoadResult.Invalid) {
                                            PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                            if (pagingLogger4.isLoggable(2)) {
                                                pagingLogger4.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult5), null);
                                            }
                                            pageFetcherSnapshot2.onInvalidLoad();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                    if (pagingLogger5.isLoggable(2)) {
                                        pagingLogger5.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult5), null);
                                    }
                                    holder2 = pageFetcherSnapshot2.stateHolder;
                                    mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult5;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = holder2;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex2;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 8;
                                    if (mutex2.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                        loadResult = loadResult5;
                                        try {
                                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                                            loadType2 = LoadType.REFRESH;
                                            pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex2;
                                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                            pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                            pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                            if (pageFetcherSnapshot2.setError(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                mutex6 = mutex2;
                                                Unit unit4 = Unit.INSTANCE;
                                                mutex6.unlock(null);
                                                return Unit.INSTANCE;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            mutex6 = mutex2;
                                            throw th;
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            case 4:
                                mutex3 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                PageFetcherSnapshotState pageFetcherSnapshotState32 = ((PageFetcherSnapshotState.Holder) holder3).state;
                                insert = pageFetcherSnapshotState32.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult2);
                                pageFetcherSnapshotState32.getSourceLoadStates().set(LoadType.REFRESH, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                if (((PagingSource.LoadResult.Page) loadResult2).getPrevKey() == null) {
                                }
                                if (((PagingSource.LoadResult.Page) loadResult2).getNextKey() == null) {
                                }
                                if (!insert) {
                                }
                                break;
                            case 5:
                                Mutex mutex13 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutex4 = mutex13;
                                PageFetcherSnapshotState pageFetcherSnapshotState42 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                channel = pageFetcherSnapshot5.pageEventCh;
                                pageEvent$paging_common_release = pageFetcherSnapshotState42.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult4, LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult4;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex4;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                }
                                break;
                            case 6:
                                Mutex mutex14 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                r2 = mutex14;
                                Unit unit32 = Unit.INSTANCE;
                                if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                }
                                return Unit.INSTANCE;
                            case 7:
                                mutex5 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                PagingState<Key, Value> currentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot6.hintHandler.getLastAccessHint());
                                mutex5.unlock(null);
                                page = (PagingSource.LoadResult.Page) loadResult3;
                                if (page.getPrevKey() == null) {
                                }
                                if (page.getNextKey() == null) {
                                }
                                return Unit.INSTANCE;
                            case 8:
                                mutex2 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                                loadType2 = LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex2;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                if (pageFetcherSnapshot2.setError(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            case 9:
                                mutex6 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Unit unit42 = Unit.INSTANCE;
                                    mutex6.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (r2) {
                }
            } finally {
            }
        } finally {
        }
        pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuation);
        Object obj2 = pageFetcherSnapshot$doInitialLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = pageFetcherSnapshot$doInitialLoad$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x034f, code lost:
    
        r0 = r8;
        r8 = r9;
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031f A[Catch: all -> 0x06eb, TRY_LEAVE, TryCatch #5 {all -> 0x06eb, blocks: (B:199:0x0306, B:201:0x031f), top: B:198:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06f3 A[Catch: all -> 0x06f9, TRY_ENTER, TryCatch #4 {all -> 0x06f9, blocks: (B:210:0x0222, B:217:0x02d0, B:221:0x0239, B:223:0x0249, B:224:0x0255, B:226:0x025f, B:228:0x0278, B:230:0x027b, B:232:0x0296, B:235:0x02b4, B:237:0x02cd, B:239:0x06f3, B:240:0x06f8), top: B:209:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05a8 A[Catch: all -> 0x06e0, TRY_LEAVE, TryCatch #0 {all -> 0x06e0, blocks: (B:73:0x059a, B:75:0x05a8), top: B:72:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05f6 A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:78:0x05d4, B:80:0x05dd, B:82:0x05f6, B:84:0x0602, B:86:0x060a, B:87:0x0617, B:88:0x0611, B:89:0x061c, B:93:0x064d, B:175:0x0088, B:178:0x00b8), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x060a A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:78:0x05d4, B:80:0x05dd, B:82:0x05f6, B:84:0x0602, B:86:0x060a, B:87:0x0617, B:88:0x0611, B:89:0x061c, B:93:0x064d, B:175:0x0088, B:178:0x00b8), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0611 A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:78:0x05d4, B:80:0x05dd, B:82:0x05f6, B:84:0x0602, B:86:0x060a, B:87:0x0617, B:88:0x0611, B:89:0x061c, B:93:0x064d, B:175:0x0088, B:178:0x00b8), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v49, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r14v30, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v58, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x06a2 -> B:13:0x06a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doLoad(LoadType loadType, GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$1;
        ?? r5;
        Ref.IntRef intRef;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        Mutex mutex;
        GenerationalViewportHint generationalViewportHint2;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        int i;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        Mutex mutex2;
        Ref.IntRef intRef2;
        LoadType loadType2;
        Ref.ObjectRef objectRef;
        PageFetcherSnapshot pageFetcherSnapshot2;
        GenerationalViewportHint generationalViewportHint3;
        Ref.ObjectRef objectRef2;
        Mutex mutex3;
        Object nextLoadKeyOrNull;
        ?? r2;
        Object obj;
        ?? r12;
        Ref.BooleanRef booleanRef;
        PageFetcherSnapshot pageFetcherSnapshot3;
        GenerationalViewportHint generationalViewportHint4;
        LoadType loadType3;
        ?? r9;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef3;
        PagingSource.LoadParams<Key> loadParams;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        Ref.BooleanRef booleanRef2;
        PagingSource.LoadResult loadResult;
        Mutex mutex4;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        PagingSource.LoadResult loadResult2;
        Mutex mutex5;
        PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$12;
        LoadType loadType4;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        Mutex mutex6;
        GenerationalViewportHint generationalViewportHint5;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        LoadType loadType5;
        PageFetcherSnapshot pageFetcherSnapshot4;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef4;
        Ref.IntRef intRef4;
        GenerationalViewportHint generationalViewportHint6;
        LoadType loadType6;
        Mutex mutex7;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        PagingSource.LoadResult loadResult3;
        LoadType loadType7;
        PageFetcherSnapshot pageFetcherSnapshot5;
        PagingSource.LoadResult loadResult4;
        PagingSource.LoadParams<Key> loadParams2;
        Ref.BooleanRef booleanRef4;
        Ref.ObjectRef objectRef5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        Throwable th;
        PageFetcherSnapshot pageFetcherSnapshot7;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState3;
        LoadState.Error error;
        Mutex mutex8;
        int i2;
        int i3;
        PageFetcherSnapshotState.Holder<Key, Value> holder6;
        Mutex mutex9;
        Ref.BooleanRef booleanRef5;
        Mutex mutex10;
        PageEvent<Value> pageEvent$paging_common_release;
        Channel<PageEvent<Value>> channel;
        PageEvent.Drop<Value> dropEventOrNull;
        PageFetcherSnapshot pageFetcherSnapshot8;
        ?? r14;
        Throwable th2;
        Object prevKey;
        Object obj2;
        LoadType loadType8 = loadType;
        try {
            if (continuation instanceof PageFetcherSnapshot$doLoad$1) {
                pageFetcherSnapshot$doLoad$1 = (PageFetcherSnapshot$doLoad$1) continuation;
                if ((pageFetcherSnapshot$doLoad$1.label & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$doLoad$1.label -= Integer.MIN_VALUE;
                    Object obj3 = pageFetcherSnapshot$doLoad$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = pageFetcherSnapshot$doLoad$1.label;
                    switch (r5) {
                        case 0:
                            ResultKt.throwOnFailure(obj3);
                            if (loadType8 == LoadType.REFRESH) {
                                throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH".toString());
                            }
                            intRef = new Ref.IntRef();
                            holder = this.stateHolder;
                            mutex = ((PageFetcherSnapshotState.Holder) holder).lock;
                            pageFetcherSnapshot$doLoad$1.L$0 = this;
                            pageFetcherSnapshot$doLoad$1.L$1 = loadType8;
                            generationalViewportHint2 = generationalViewportHint;
                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint2;
                            pageFetcherSnapshot$doLoad$1.L$3 = intRef;
                            pageFetcherSnapshot$doLoad$1.L$4 = holder;
                            pageFetcherSnapshot$doLoad$1.L$5 = mutex;
                            pageFetcherSnapshot$doLoad$1.label = 1;
                            if (mutex.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                pageFetcherSnapshot = this;
                                try {
                                    PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder).state;
                                    i = WhenMappings.$EnumSwitchMapping$0[loadType8.ordinal()];
                                    if (i != 1) {
                                        throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                    }
                                    if (i == 2) {
                                        int initialPageIndex = (pageFetcherSnapshotState4.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetFirst()) - 1;
                                        if (initialPageIndex > CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release())) {
                                            intRef.element += pageFetcherSnapshot.config.pageSize * (initialPageIndex - CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release()));
                                            initialPageIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release());
                                        }
                                        if (initialPageIndex >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                intRef.element += pageFetcherSnapshotState4.getPages$paging_common_release().get(i4).getData().size();
                                                if (i4 != initialPageIndex) {
                                                    i4++;
                                                }
                                            }
                                        }
                                    } else if (i == 3) {
                                        int initialPageIndex2 = pageFetcherSnapshotState4.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetLast() + 1;
                                        if (initialPageIndex2 < 0) {
                                            intRef.element += pageFetcherSnapshot.config.pageSize * (-initialPageIndex2);
                                            initialPageIndex2 = 0;
                                        }
                                        int lastIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release());
                                        if (initialPageIndex2 <= lastIndex) {
                                            while (true) {
                                                intRef.element += pageFetcherSnapshotState4.getPages$paging_common_release().get(initialPageIndex2).getData().size();
                                                if (initialPageIndex2 != lastIndex) {
                                                    initialPageIndex2++;
                                                }
                                            }
                                        }
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                                    PageFetcherSnapshotState.Holder<Key, Value> holder7 = pageFetcherSnapshot.stateHolder;
                                    Mutex mutex11 = ((PageFetcherSnapshotState.Holder) holder7).lock;
                                    pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot;
                                    pageFetcherSnapshot$doLoad$1.L$1 = loadType8;
                                    pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint2;
                                    pageFetcherSnapshot$doLoad$1.L$3 = intRef;
                                    pageFetcherSnapshot$doLoad$1.L$4 = objectRef6;
                                    pageFetcherSnapshot$doLoad$1.L$5 = holder7;
                                    pageFetcherSnapshot$doLoad$1.L$6 = mutex11;
                                    pageFetcherSnapshot$doLoad$1.L$7 = objectRef6;
                                    pageFetcherSnapshot$doLoad$1.label = 2;
                                    if (mutex11.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                        Ref.IntRef intRef5 = intRef;
                                        holder2 = holder7;
                                        mutex2 = mutex11;
                                        intRef2 = intRef5;
                                        loadType2 = loadType8;
                                        objectRef = objectRef6;
                                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                                        generationalViewportHint3 = generationalViewportHint2;
                                        objectRef2 = objectRef;
                                        try {
                                            PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState5 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                            nextLoadKeyOrNull = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState5, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType2) + intRef2.element);
                                            if (nextLoadKeyOrNull == null) {
                                                pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot2;
                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType2;
                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef2;
                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef2;
                                                pageFetcherSnapshot$doLoad$1.L$5 = mutex2;
                                                pageFetcherSnapshot$doLoad$1.L$6 = nextLoadKeyOrNull;
                                                pageFetcherSnapshot$doLoad$1.L$7 = objectRef;
                                                pageFetcherSnapshot$doLoad$1.label = 3;
                                                if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState5, loadType2, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                    mutex3 = mutex2;
                                                    obj = nextLoadKeyOrNull;
                                                    pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                    r2 = obj;
                                                    mutex2 = mutex3;
                                                    r12 = pageFetcherSnapshot3;
                                                    mutex2.unlock(null);
                                                    objectRef.element = r2;
                                                    booleanRef = new Ref.BooleanRef();
                                                    if (objectRef2.element != null) {
                                                        PagingSource.LoadParams<Key> loadParams3 = r12.loadParams(loadType2, objectRef2.element);
                                                        PagingLogger pagingLogger = PagingLogger.INSTANCE;
                                                        if (pagingLogger.isLoggable(3)) {
                                                            obj2 = null;
                                                            pagingLogger.log(3, "Start " + loadType2 + " with loadKey " + objectRef2.element + " on " + r12.pagingSource, null);
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        PagingSource<Key, Value> pagingSource = r12.pagingSource;
                                                        pageFetcherSnapshot$doLoad$1.L$0 = r12;
                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType2;
                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef2;
                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef2;
                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadParams3;
                                                        pageFetcherSnapshot$doLoad$1.L$7 = obj2;
                                                        pageFetcherSnapshot$doLoad$1.L$8 = obj2;
                                                        pageFetcherSnapshot$doLoad$1.label = 4;
                                                        Object load = pagingSource.load(loadParams3, pageFetcherSnapshot$doLoad$1);
                                                        if (load != coroutine_suspended) {
                                                            loadType3 = loadType2;
                                                            intRef3 = intRef2;
                                                            r9 = r12;
                                                            generationalViewportHint4 = generationalViewportHint3;
                                                            objectRef3 = objectRef2;
                                                            loadParams = loadParams3;
                                                            obj3 = load;
                                                            loadResult = (PagingSource.LoadResult) obj3;
                                                            if (loadResult instanceof PagingSource.LoadResult.Page) {
                                                                int i5 = WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()];
                                                                if (i5 == 2) {
                                                                    prevKey = ((PagingSource.LoadResult.Page) loadResult).getPrevKey();
                                                                } else if (i5 == 3) {
                                                                    prevKey = ((PagingSource.LoadResult.Page) loadResult).getNextKey();
                                                                } else {
                                                                    throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                                                                }
                                                                if (!r9.pagingSource.getKeyReuseSupported() && Intrinsics.areEqual(prevKey, objectRef3.element)) {
                                                                    throw new IllegalStateException(StringsKt.trimMargin$default("The same value, " + objectRef3.element + ", was passed as the " + (loadType3 == LoadType.PREPEND ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", null, 1, null).toString());
                                                                }
                                                                holder3 = r9.stateHolder;
                                                                mutex4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                                                                pageFetcherSnapshot$doLoad$1.L$0 = r9;
                                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                                pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                                pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                                pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                pageFetcherSnapshot$doLoad$1.L$8 = holder3;
                                                                pageFetcherSnapshot$doLoad$1.L$9 = mutex4;
                                                                pageFetcherSnapshot$doLoad$1.label = 5;
                                                                if (mutex4.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                    r14 = r9;
                                                                    booleanRef2 = booleanRef;
                                                                    try {
                                                                        if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType3, (PagingSource.LoadResult.Page) loadResult)) {
                                                                            PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                                            if (pagingLogger2.isLoggable(2)) {
                                                                                pagingLogger2.log(2, r14.loadResultLog(loadType3, objectRef3.element, th2), th2);
                                                                            }
                                                                        } else {
                                                                            PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                                                            if (pagingLogger3.isLoggable(3)) {
                                                                                pagingLogger3.log(3, r14.loadResultLog(loadType3, objectRef3.element, loadResult), th2);
                                                                            }
                                                                            PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) loadResult;
                                                                            intRef3.element += page.getData().size();
                                                                            if ((loadType3 == LoadType.PREPEND && page.getPrevKey() == null) || (loadType3 == LoadType.APPEND && page.getNextKey() == null)) {
                                                                                booleanRef2.element = true;
                                                                            }
                                                                            booleanRef = booleanRef2;
                                                                            pageFetcherSnapshot8 = r14;
                                                                            if (WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()] != 2) {
                                                                            }
                                                                            holder5 = pageFetcherSnapshot8.stateHolder;
                                                                            mutex7 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                                                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                                            pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                                            pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                            pageFetcherSnapshot$doLoad$1.L$8 = loadType6;
                                                                            pageFetcherSnapshot$doLoad$1.L$9 = holder5;
                                                                            pageFetcherSnapshot$doLoad$1.L$10 = mutex7;
                                                                            pageFetcherSnapshot$doLoad$1.label = 8;
                                                                            Ref.BooleanRef booleanRef6 = booleanRef;
                                                                            if (mutex7.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                            }
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            } else if (!(loadResult instanceof PagingSource.LoadResult.Error)) {
                                                                pageFetcherSnapshot8 = r9;
                                                                if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                                                                    PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                                                    if (pagingLogger4.isLoggable(2)) {
                                                                        pagingLogger4.log(2, r9.loadResultLog(loadType3, objectRef3.element, loadResult), null);
                                                                    }
                                                                    r9.onInvalidLoad();
                                                                    return Unit.INSTANCE;
                                                                }
                                                                if (WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()] != 2) {
                                                                    loadType6 = LoadType.APPEND;
                                                                } else {
                                                                    loadType6 = LoadType.PREPEND;
                                                                }
                                                                holder5 = pageFetcherSnapshot8.stateHolder;
                                                                mutex7 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                                pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot8;
                                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                                pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                                pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                                pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                pageFetcherSnapshot$doLoad$1.L$8 = loadType6;
                                                                pageFetcherSnapshot$doLoad$1.L$9 = holder5;
                                                                pageFetcherSnapshot$doLoad$1.L$10 = mutex7;
                                                                pageFetcherSnapshot$doLoad$1.label = 8;
                                                                Ref.BooleanRef booleanRef62 = booleanRef;
                                                                if (mutex7.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                    loadType5 = loadType3;
                                                                    generationalViewportHint6 = generationalViewportHint4;
                                                                    intRef4 = intRef3;
                                                                    objectRef4 = objectRef3;
                                                                    pageFetcherSnapshot4 = pageFetcherSnapshot8;
                                                                    booleanRef3 = booleanRef62;
                                                                    try {
                                                                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                                                        dropEventOrNull = pageFetcherSnapshotState2.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                                                                        if (dropEventOrNull == null) {
                                                                            pageFetcherSnapshotState2.drop(dropEventOrNull);
                                                                            Channel<PageEvent<Value>> channel2 = pageFetcherSnapshot4.pageEventCh;
                                                                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                                            pageFetcherSnapshot$doLoad$1.L$1 = loadType5;
                                                                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                                            pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef4;
                                                                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef3;
                                                                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                                            pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                            pageFetcherSnapshot$doLoad$1.L$8 = mutex7;
                                                                            pageFetcherSnapshot$doLoad$1.L$9 = pageFetcherSnapshotState2;
                                                                            pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                                            pageFetcherSnapshot$doLoad$1.label = 9;
                                                                            if (channel2.send(dropEventOrNull, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                                r5 = mutex7;
                                                                                loadType7 = loadType5;
                                                                                loadResult3 = loadResult;
                                                                                pageFetcherSnapshot5 = pageFetcherSnapshot4;
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                loadResult = loadResult3;
                                                                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                                                                loadType5 = loadType7;
                                                                                mutex10 = r5;
                                                                                loadParams2 = loadParams;
                                                                                objectRef4.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                                                                                if (objectRef4.element == null && !(pageFetcherSnapshotState2.getSourceLoadStates().get(loadType5) instanceof LoadState.Error)) {
                                                                                    pageFetcherSnapshotState2.getSourceLoadStates().set(loadType5, !booleanRef3.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                                                }
                                                                                pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                                                                                channel = pageFetcherSnapshot4.pageEventCh;
                                                                                pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType5;
                                                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef4;
                                                                                pageFetcherSnapshot$doLoad$1.L$5 = booleanRef3;
                                                                                pageFetcherSnapshot$doLoad$1.L$6 = loadParams2;
                                                                                pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                                pageFetcherSnapshot$doLoad$1.L$8 = mutex10;
                                                                                pageFetcherSnapshot$doLoad$1.L$9 = null;
                                                                                pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                                                pageFetcherSnapshot$doLoad$1.label = 10;
                                                                                if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                                    loadResult4 = loadResult;
                                                                                    booleanRef4 = booleanRef3;
                                                                                    pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                                                                    objectRef5 = objectRef4;
                                                                                    generationalViewportHint3 = generationalViewportHint6;
                                                                                    loadType2 = loadType5;
                                                                                    mutex8 = mutex10;
                                                                                    Unit unit3 = Unit.INSTANCE;
                                                                                    mutex8.unlock(null);
                                                                                    i2 = ((loadParams2 instanceof PagingSource.LoadParams.Prepend) || ((PagingSource.LoadResult.Page) loadResult4).getPrevKey() != null) ? 0 : 1;
                                                                                    i3 = ((loadParams2 instanceof PagingSource.LoadParams.Append) || ((PagingSource.LoadResult.Page) loadResult4).getNextKey() != null) ? 0 : 1;
                                                                                    if (pageFetcherSnapshot6.remoteMediatorConnection != null || (i2 == 0 && i3 == 0)) {
                                                                                        booleanRef = booleanRef4;
                                                                                        objectRef2 = objectRef5;
                                                                                        intRef2 = intRef4;
                                                                                        r12 = pageFetcherSnapshot6;
                                                                                        if (objectRef2.element != null) {
                                                                                        }
                                                                                    } else {
                                                                                        holder6 = pageFetcherSnapshot6.stateHolder;
                                                                                        mutex9 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                                                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot6;
                                                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType2;
                                                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef5;
                                                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef4;
                                                                                        pageFetcherSnapshot$doLoad$1.L$6 = holder6;
                                                                                        pageFetcherSnapshot$doLoad$1.L$7 = mutex9;
                                                                                        pageFetcherSnapshot$doLoad$1.L$8 = null;
                                                                                        pageFetcherSnapshot$doLoad$1.I$0 = i2;
                                                                                        pageFetcherSnapshot$doLoad$1.I$1 = i3;
                                                                                        pageFetcherSnapshot$doLoad$1.label = 11;
                                                                                        if (mutex9.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                                            PageFetcherSnapshot pageFetcherSnapshot9 = pageFetcherSnapshot6;
                                                                                            booleanRef5 = booleanRef4;
                                                                                            objectRef2 = objectRef5;
                                                                                            intRef2 = intRef4;
                                                                                            r12 = pageFetcherSnapshot9;
                                                                                            try {
                                                                                                PagingState<Key, Value> currentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(r12.hintHandler.getLastAccessHint());
                                                                                                if (i2 != 0) {
                                                                                                    r12.remoteMediatorConnection.requestLoad(LoadType.PREPEND, currentPagingState$paging_common_release);
                                                                                                }
                                                                                                if (i3 != 0) {
                                                                                                    r12.remoteMediatorConnection.requestLoad(LoadType.APPEND, currentPagingState$paging_common_release);
                                                                                                }
                                                                                                booleanRef = booleanRef5;
                                                                                                if (objectRef2.element != null) {
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            mutex10 = mutex7;
                                                                            loadParams2 = loadParams;
                                                                            objectRef4.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                                                                            if (objectRef4.element == null) {
                                                                                pageFetcherSnapshotState2.getSourceLoadStates().set(loadType5, !booleanRef3.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                                            }
                                                                            pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                                                                            channel = pageFetcherSnapshot4.pageEventCh;
                                                                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                                            pageFetcherSnapshot$doLoad$1.L$1 = loadType5;
                                                                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                                            pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef4;
                                                                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef3;
                                                                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams2;
                                                                            pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                                            pageFetcherSnapshot$doLoad$1.L$8 = mutex10;
                                                                            pageFetcherSnapshot$doLoad$1.L$9 = null;
                                                                            pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                                            pageFetcherSnapshot$doLoad$1.label = 10;
                                                                            if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        r5 = mutex7;
                                                                        r5.unlock(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                                                if (pagingLogger5.isLoggable(2)) {
                                                                    pagingLogger5.log(2, r9.loadResultLog(loadType3, objectRef3.element, loadResult), null);
                                                                }
                                                                holder4 = r9.stateHolder;
                                                                Mutex mutex12 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                                                pageFetcherSnapshot$doLoad$1.L$0 = r9;
                                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                                pageFetcherSnapshot$doLoad$1.L$3 = loadResult;
                                                                pageFetcherSnapshot$doLoad$1.L$4 = holder4;
                                                                pageFetcherSnapshot$doLoad$1.L$5 = mutex12;
                                                                pageFetcherSnapshot$doLoad$1.L$6 = null;
                                                                pageFetcherSnapshot$doLoad$1.label = 6;
                                                                if (mutex12.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                    loadResult2 = loadResult;
                                                                    mutex5 = mutex12;
                                                                    pageFetcherSnapshot$doLoad$12 = pageFetcherSnapshot$doLoad$1;
                                                                    loadType4 = loadType3;
                                                                    pageFetcherSnapshot7 = r9;
                                                                    try {
                                                                        pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                                        error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                                                                        pageFetcherSnapshot$doLoad$12.L$0 = loadType4;
                                                                        pageFetcherSnapshot$doLoad$12.L$1 = generationalViewportHint4;
                                                                        pageFetcherSnapshot$doLoad$12.L$2 = mutex5;
                                                                        pageFetcherSnapshot$doLoad$12.L$3 = pageFetcherSnapshotState3;
                                                                        pageFetcherSnapshot$doLoad$12.L$4 = null;
                                                                        pageFetcherSnapshot$doLoad$12.L$5 = null;
                                                                        pageFetcherSnapshot$doLoad$12.label = 7;
                                                                        if (pageFetcherSnapshot7.setError(pageFetcherSnapshotState3, loadType4, error, pageFetcherSnapshot$doLoad$12) != coroutine_suspended) {
                                                                            mutex6 = mutex5;
                                                                            pageFetcherSnapshotState = pageFetcherSnapshotState3;
                                                                            generationalViewportHint5 = generationalViewportHint4;
                                                                            pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType4, generationalViewportHint5.getHint());
                                                                            Unit unit4 = Unit.INSTANCE;
                                                                            mutex6.unlock(null);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        mutex6 = mutex5;
                                                                        mutex6.unlock(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                r2 = 0;
                                                r12 = pageFetcherSnapshot2;
                                                mutex2.unlock(null);
                                                objectRef.element = r2;
                                                booleanRef = new Ref.BooleanRef();
                                                if (objectRef2.element != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            mutex3 = mutex2;
                                            mutex3.unlock(null);
                                            throw th;
                                        }
                                    }
                                } finally {
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            Mutex mutex13 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint2 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType9 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex = mutex13;
                            loadType8 = loadType9;
                            PageFetcherSnapshotState pageFetcherSnapshotState42 = ((PageFetcherSnapshotState.Holder) holder).state;
                            i = WhenMappings.$EnumSwitchMapping$0[loadType8.ordinal()];
                            if (i != 1) {
                            }
                            break;
                        case 2:
                            objectRef = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$7;
                            mutex2 = (Mutex) pageFetcherSnapshot$doLoad$1.L$6;
                            holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef2 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef2 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint3 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType2 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot10 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            pageFetcherSnapshot2 = pageFetcherSnapshot10;
                            PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState52 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            nextLoadKeyOrNull = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState52, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType2) + intRef2.element);
                            if (nextLoadKeyOrNull == null) {
                            }
                            break;
                        case 3:
                            objectRef = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$7;
                            obj = pageFetcherSnapshot$doLoad$1.L$6;
                            mutex3 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef2 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef2 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint3 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType2 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot11 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                pageFetcherSnapshot3 = pageFetcherSnapshot11;
                                r2 = obj;
                                mutex2 = mutex3;
                                r12 = pageFetcherSnapshot3;
                                mutex2.unlock(null);
                                objectRef.element = r2;
                                booleanRef = new Ref.BooleanRef();
                                if (objectRef2.element != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                mutex3.unlock(null);
                                throw th;
                            }
                        case 4:
                            PagingSource.LoadParams<Key> loadParams4 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef6 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint7 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType10 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot12 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            generationalViewportHint4 = generationalViewportHint7;
                            loadType3 = loadType10;
                            r9 = pageFetcherSnapshot12;
                            objectRef3 = objectRef7;
                            intRef3 = intRef6;
                            loadParams = loadParams4;
                            booleanRef = booleanRef7;
                            loadResult = (PagingSource.LoadResult) obj3;
                            if (loadResult instanceof PagingSource.LoadResult.Page) {
                            }
                            return coroutine_suspended;
                        case 5:
                            Mutex mutex14 = (Mutex) pageFetcherSnapshot$doLoad$1.L$9;
                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$8;
                            PagingSource.LoadResult loadResult5 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef2 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef3 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef3 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint4 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType3 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot13 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            loadResult = loadResult5;
                            mutex4 = mutex14;
                            r14 = pageFetcherSnapshot13;
                            if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType3, (PagingSource.LoadResult.Page) loadResult)) {
                            }
                            break;
                        case 6:
                            Mutex mutex15 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$4;
                            loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint8 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType11 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot14 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex5 = mutex15;
                            pageFetcherSnapshot$doLoad$12 = pageFetcherSnapshot$doLoad$1;
                            generationalViewportHint4 = generationalViewportHint8;
                            loadType4 = loadType11;
                            pageFetcherSnapshot7 = pageFetcherSnapshot14;
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                            pageFetcherSnapshot$doLoad$12.L$0 = loadType4;
                            pageFetcherSnapshot$doLoad$12.L$1 = generationalViewportHint4;
                            pageFetcherSnapshot$doLoad$12.L$2 = mutex5;
                            pageFetcherSnapshot$doLoad$12.L$3 = pageFetcherSnapshotState3;
                            pageFetcherSnapshot$doLoad$12.L$4 = null;
                            pageFetcherSnapshot$doLoad$12.L$5 = null;
                            pageFetcherSnapshot$doLoad$12.label = 7;
                            if (pageFetcherSnapshot7.setError(pageFetcherSnapshotState3, loadType4, error, pageFetcherSnapshot$doLoad$12) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 7:
                            pageFetcherSnapshotState = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$3;
                            mutex6 = (Mutex) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint5 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$1;
                            loadType4 = (LoadType) pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType4, generationalViewportHint5.getHint());
                                Unit unit42 = Unit.INSTANCE;
                                mutex6.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th7) {
                                th = th7;
                                mutex6.unlock(null);
                                throw th;
                            }
                        case 8:
                            Mutex mutex16 = (Mutex) pageFetcherSnapshot$doLoad$1.L$10;
                            holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$9;
                            LoadType loadType12 = (LoadType) pageFetcherSnapshot$doLoad$1.L$8;
                            PagingSource.LoadResult loadResult6 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            PagingSource.LoadParams<Key> loadParams5 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef7 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint9 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType5 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            loadResult = loadResult6;
                            loadParams = loadParams5;
                            booleanRef3 = booleanRef8;
                            objectRef4 = objectRef8;
                            intRef4 = intRef7;
                            generationalViewportHint6 = generationalViewportHint9;
                            loadType6 = loadType12;
                            mutex7 = mutex16;
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            dropEventOrNull = pageFetcherSnapshotState2.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                            if (dropEventOrNull == null) {
                            }
                            break;
                        case 9:
                            pageFetcherSnapshotState2 = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$9;
                            Mutex mutex17 = (Mutex) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef3 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef4 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef4 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint6 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType7 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            r5 = mutex17;
                            Unit unit22 = Unit.INSTANCE;
                            loadResult = loadResult3;
                            pageFetcherSnapshot4 = pageFetcherSnapshot5;
                            loadType5 = loadType7;
                            mutex10 = r5;
                            loadParams2 = loadParams;
                            objectRef4.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                            if (objectRef4.element == null) {
                            }
                            pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                            channel = pageFetcherSnapshot4.pageEventCh;
                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doLoad$1.L$1 = loadType5;
                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                            pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef4;
                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef3;
                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams2;
                            pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                            pageFetcherSnapshot$doLoad$1.L$8 = mutex10;
                            pageFetcherSnapshot$doLoad$1.L$9 = null;
                            pageFetcherSnapshot$doLoad$1.L$10 = null;
                            pageFetcherSnapshot$doLoad$1.label = 10;
                            if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                            }
                            break;
                        case 10:
                            Mutex mutex18 = (Mutex) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams2 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef4 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef5 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef8 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint10 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType13 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            generationalViewportHint3 = generationalViewportHint10;
                            intRef4 = intRef8;
                            loadType2 = loadType13;
                            mutex8 = mutex18;
                            Unit unit32 = Unit.INSTANCE;
                            mutex8.unlock(null);
                            if (loadParams2 instanceof PagingSource.LoadParams.Prepend) {
                                break;
                            }
                            if (loadParams2 instanceof PagingSource.LoadParams.Append) {
                                break;
                            }
                            if (pageFetcherSnapshot6.remoteMediatorConnection != null) {
                            }
                            booleanRef = booleanRef4;
                            objectRef2 = objectRef5;
                            intRef2 = intRef4;
                            r12 = pageFetcherSnapshot6;
                            if (objectRef2.element != null) {
                            }
                            return Unit.INSTANCE;
                        case 11:
                            i3 = pageFetcherSnapshot$doLoad$1.I$1;
                            i2 = pageFetcherSnapshot$doLoad$1.I$0;
                            Mutex mutex19 = (Mutex) pageFetcherSnapshot$doLoad$1.L$7;
                            holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef5 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef9 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint11 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType14 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot15 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            generationalViewportHint3 = generationalViewportHint11;
                            mutex9 = mutex19;
                            objectRef2 = objectRef9;
                            r12 = pageFetcherSnapshot15;
                            loadType2 = loadType14;
                            intRef2 = intRef9;
                            PagingState<Key, Value> currentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(r12.hintHandler.getLastAccessHint());
                            if (i2 != 0) {
                            }
                            if (i3 != 0) {
                            }
                            booleanRef = booleanRef5;
                            if (objectRef2.element != null) {
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r5) {
            }
        } catch (Throwable th8) {
            th = th8;
        }
        pageFetcherSnapshot$doLoad$1 = new PageFetcherSnapshot$doLoad$1(this, continuation);
        Object obj32 = pageFetcherSnapshot$doLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = pageFetcherSnapshot$doLoad$1.label;
    }

    private final String loadResultLog(LoadType loadType, Key loadKey, PagingSource.LoadResult<Key, Value> result) {
        if (result == null) {
            return "End " + loadType + " with loadkey " + loadKey + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + loadKey + ". Returned " + result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), LoadState.Loading.INSTANCE)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, LoadState.Loading.INSTANCE);
            Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), error)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, error);
            Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.generationId$paging_common_release(loadType) || (pageFetcherSnapshotState.getSourceLoadStates().get(loadType) instanceof LoadState.Error) || i2 >= this.config.prefetchDistance) {
            return null;
        }
        if (loadType == LoadType.PREPEND) {
            return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.first((List) pageFetcherSnapshotState.getPages$paging_common_release())).getPrevKey();
        }
        return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.last((List) pageFetcherSnapshotState.getPages$paging_common_release())).getNextKey();
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(Flow<Integer> flow, final LoadType loadType, Continuation<? super Unit> continuation) {
        Object collect = FlowKt.conflate(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null))).collect(new FlowCollector(this) { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$4
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((GenerationalViewportHint) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation2) {
                Object doLoad;
                doLoad = this.this$0.doLoad(loadType, generationalViewportHint, continuation2);
                return doLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doLoad : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
