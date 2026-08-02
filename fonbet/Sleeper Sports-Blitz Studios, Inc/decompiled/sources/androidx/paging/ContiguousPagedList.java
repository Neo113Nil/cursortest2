package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagedStorage;
import androidx.paging.PagingSource;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContiguousPagedList.jvm.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u0000 X*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00030\u0006:\u0001XBg\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0015J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bH\u0001¢\u0006\u0002\b4J\b\u00105\u001a\u000200H\u0016J\u0018\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0002J\"\u00109\u001a\u0002002\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u0002000;H\u0016J\u0010\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020\u0017H\u0017J\u0010\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020\u0017H\u0017J \u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u0017H\u0017J \u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u0017H\u0017J\"\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020<2\u0010\u0010J\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0018\u0010K\u001a\u0002002\u0006\u0010L\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017H\u0016J\u0018\u0010M\u001a\u0002002\u0006\u0010L\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017H\u0016J\u0018\u0010N\u001a\u0002002\u0006\u0010I\u001a\u00020<2\u0006\u0010O\u001a\u00020=H\u0016J\b\u0010P\u001a\u000200H\u0016J\u0018\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020=H\u0016J\u001e\u0010T\u001a\u0002002\u0006\u0010I\u001a\u00020<2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010UH\u0002J\u0010\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020\u001bH\u0002R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b)\u0010#R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Landroidx/paging/ContiguousPagedList;", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "pagingSource", "Landroidx/paging/PagingSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "backgroundDispatcher", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", AnalyticsConstantsKt.KEY_CONFIG, "Landroidx/paging/PagedList$Config;", "initialPage", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialLastKey", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)V", "appendItemsRequested", "", "getBoundaryCallback$paging_common_release", "()Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallbackBeginDeferred", "", "boundaryCallbackEndDeferred", "highestIndexAccessed", "Ljava/lang/Object;", "isDetached", "()Z", "lastKey", "getLastKey$annotations", "()V", "getLastKey", "()Ljava/lang/Object;", "lowestIndexAccessed", "pager", "Landroidx/paging/LegacyPageFetcher;", "getPager$annotations", "getPagingSource", "()Landroidx/paging/PagingSource;", "prependItemsRequested", "replacePagesWithNulls", "shouldTrim", "deferBoundaryCallbacks", "", "deferEmpty", "deferBegin", "deferEnd", "deferBoundaryCallbacks$paging_common_release", "detach", "dispatchBoundaryCallbacks", "begin", "end", "dispatchCurrentLoadState", "callback", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "loadAroundInternal", "index", "onInitialized", "count", "onPageAppended", "endPosition", "changed", "added", "onPagePrepended", "leadingNulls", "onPageResult", "type", "page", "onPagesRemoved", "startOfDrops", "onPagesSwappedToPlaceholder", "onStateChanged", "state", "retry", "setInitialLoadState", "loadType", "loadState", "triggerBoundaryCallback", "", "tryDispatchBoundaryCallbacks", "post", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback, LegacyPageFetcher.PageConsumer<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int appendItemsRequested;
    private final PagedList.BoundaryCallback<V> boundaryCallback;
    private boolean boundaryCallbackBeginDeferred;
    private boolean boundaryCallbackEndDeferred;
    private int highestIndexAccessed;
    private final K initialLastKey;
    private int lowestIndexAccessed;
    private final LegacyPageFetcher<K, V> pager;
    private final PagingSource<K, V> pagingSource;
    private int prependItemsRequested;
    private boolean replacePagesWithNulls;
    private final boolean shouldTrim;

    public static /* synthetic */ void getLastKey$annotations() {
    }

    private static /* synthetic */ void getPager$annotations() {
    }

    @Override // androidx.paging.PagedList
    public final PagingSource<K, V> getPagingSource() {
        return this.pagingSource;
    }

    public final PagedList.BoundaryCallback<V> getBoundaryCallback$paging_common_release() {
        return this.boundaryCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource<K, V> pagingSource, CoroutineScope coroutineScope, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher backgroundDispatcher, PagedList.BoundaryCallback<V> boundaryCallback, PagedList.Config config, PagingSource.LoadResult.Page<K, V> initialPage, K k) {
        super(pagingSource, coroutineScope, notifyDispatcher, new PagedStorage(), config);
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        this.pagingSource = pagingSource;
        this.boundaryCallback = boundaryCallback;
        this.initialLastKey = k;
        this.lowestIndexAccessed = Integer.MAX_VALUE;
        this.highestIndexAccessed = Integer.MIN_VALUE;
        this.shouldTrim = config.maxSize != Integer.MAX_VALUE;
        PagedStorage<V> storage$paging_common_release = getStorage$paging_common_release();
        Intrinsics.checkNotNull(storage$paging_common_release, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.pager = new LegacyPageFetcher<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, storage$paging_common_release);
        if (config.enablePlaceholders) {
            getStorage$paging_common_release().init(initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, initialPage, initialPage.getItemsAfter() != Integer.MIN_VALUE ? initialPage.getItemsAfter() : 0, 0, this, (initialPage.getItemsBefore() == Integer.MIN_VALUE || initialPage.getItemsAfter() == Integer.MIN_VALUE) ? false : true);
        } else {
            getStorage$paging_common_release().init(0, initialPage, 0, initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, this, false);
        }
        triggerBoundaryCallback(LoadType.REFRESH, initialPage.getData());
    }

    /* compiled from: ContiguousPagedList.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bJ%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "()V", "getAppendItemsRequested", "", "prefetchDistance", "index", "itemsBeforeTrailingNulls", "getAppendItemsRequested$paging_common_release", "getPrependItemsRequested", "leadingNulls", "getPrependItemsRequested$paging_common_release", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAppendItemsRequested$paging_common_release(int prefetchDistance, int index, int itemsBeforeTrailingNulls) {
            return ((index + prefetchDistance) + 1) - itemsBeforeTrailingNulls;
        }

        public final int getPrependItemsRequested$paging_common_release(int prefetchDistance, int index, int leadingNulls) {
            return prefetchDistance - (index - leadingNulls);
        }

        private Companion() {
        }
    }

    @Override // androidx.paging.PagedList
    public K getLastKey() {
        K refreshKey;
        PagingState<?, V> refreshKeyInfo = getStorage$paging_common_release().getRefreshKeyInfo(getConfig());
        return (refreshKeyInfo == null || (refreshKey = this.pagingSource.getRefreshKey(refreshKeyInfo)) == null) ? this.initialLastKey : refreshKey;
    }

    @Override // androidx.paging.PagedList
    public boolean isDetached() {
        return this.pager.isDetached();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onPageResult(LoadType type, PagingSource.LoadResult.Page<?, V> page) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(page, "page");
        List<? extends V> data = page.getData();
        boolean z = true;
        boolean z2 = lastLoad() > getStorage$paging_common_release().getMiddleOfLoadedRange();
        boolean z3 = this.shouldTrim && getStorage$paging_common_release().shouldPreTrimNewPage(getConfig().maxSize, getRequiredRemainder(), data.size());
        if (type != LoadType.APPEND) {
            if (type != LoadType.PREPEND) {
                throw new IllegalArgumentException("unexpected result type " + type);
            }
            if (z3 && z2) {
                this.prependItemsRequested = 0;
            } else {
                getStorage$paging_common_release().prependPage$paging_common_release(page, this);
                int size = this.prependItemsRequested - data.size();
                this.prependItemsRequested = size;
                if (size > 0) {
                }
            }
            z = false;
            if (this.shouldTrim) {
            }
            triggerBoundaryCallback(type, data);
            return z;
        }
        if (z3 && !z2) {
            this.appendItemsRequested = 0;
        } else {
            getStorage$paging_common_release().appendPage$paging_common_release(page, this);
            int size2 = this.appendItemsRequested - data.size();
            this.appendItemsRequested = size2;
            if (size2 > 0) {
            }
        }
        z = false;
        if (this.shouldTrim) {
            if (z2) {
                if (!(this.pager.getLoadStateManager().getStartState() instanceof LoadState.Loading) && getStorage$paging_common_release().trimFromFront$paging_common_release(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder(), this)) {
                    this.pager.getLoadStateManager().setState(LoadType.PREPEND, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                }
            } else if (!(this.pager.getLoadStateManager().getEndState() instanceof LoadState.Loading) && getStorage$paging_common_release().trimFromEnd$paging_common_release(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder(), this)) {
                this.pager.getLoadStateManager().setState(LoadType.APPEND, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
            }
        }
        triggerBoundaryCallback(type, data);
        return z;
    }

    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    public void onStateChanged(LoadType type, LoadState state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        dispatchStateChangeAsync$paging_common_release(type, state);
    }

    private final void triggerBoundaryCallback(LoadType type, List<? extends V> page) {
        if (this.boundaryCallback != null) {
            boolean z = getStorage$paging_common_release().size() == 0;
            deferBoundaryCallbacks$paging_common_release(z, !z && type == LoadType.PREPEND && page.isEmpty(), !z && type == LoadType.APPEND && page.isEmpty());
        }
    }

    public final void deferBoundaryCallbacks$paging_common_release(boolean deferEmpty, boolean deferBegin, boolean deferEnd) {
        if (this.boundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
            this.lowestIndexAccessed = getStorage$paging_common_release().size();
        }
        if (this.highestIndexAccessed == Integer.MIN_VALUE) {
            this.highestIndexAccessed = 0;
        }
        if (deferEmpty || deferBegin || deferEnd) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), getNotifyDispatcher(), null, new ContiguousPagedList$deferBoundaryCallbacks$1(deferEmpty, this, deferBegin, deferEnd, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryDispatchBoundaryCallbacks(boolean post) {
        boolean z = this.boundaryCallbackBeginDeferred && this.lowestIndexAccessed <= getConfig().prefetchDistance;
        boolean z2 = this.boundaryCallbackEndDeferred && this.highestIndexAccessed >= (size() - 1) - getConfig().prefetchDistance;
        if (z || z2) {
            if (z) {
                this.boundaryCallbackBeginDeferred = false;
            }
            if (z2) {
                this.boundaryCallbackEndDeferred = false;
            }
            if (post) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), getNotifyDispatcher(), null, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z, z2, null), 2, null);
            } else {
                dispatchBoundaryCallbacks(z, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchBoundaryCallbacks(boolean begin, boolean end) {
        if (begin) {
            PagedList.BoundaryCallback<V> boundaryCallback = this.boundaryCallback;
            Intrinsics.checkNotNull(boundaryCallback);
            boundaryCallback.onItemAtFrontLoaded(getStorage$paging_common_release().getFirstLoadedItem$paging_common_release());
        }
        if (end) {
            PagedList.BoundaryCallback<V> boundaryCallback2 = this.boundaryCallback;
            Intrinsics.checkNotNull(boundaryCallback2);
            boundaryCallback2.onItemAtEndLoaded(getStorage$paging_common_release().getLastLoadedItem$paging_common_release());
        }
    }

    @Override // androidx.paging.PagedList
    public void retry() {
        Runnable refreshRetryCallback$paging_common_release;
        super.retry();
        this.pager.retry();
        if (!(this.pager.getLoadStateManager().getRefreshState() instanceof LoadState.Error) || (refreshRetryCallback$paging_common_release = getRefreshRetryCallback()) == null) {
            return;
        }
        refreshRetryCallback$paging_common_release.run();
    }

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(Function2<? super LoadType, ? super LoadState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.pager.getLoadStateManager().dispatchCurrentLoadState(callback);
    }

    @Override // androidx.paging.PagedList
    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.pager.getLoadStateManager().setState(loadType, loadState);
    }

    @Override // androidx.paging.PagedList
    public void loadAroundInternal(int index) {
        Companion companion = INSTANCE;
        int prependItemsRequested$paging_common_release = companion.getPrependItemsRequested$paging_common_release(getConfig().prefetchDistance, index, getStorage$paging_common_release().getPlaceholdersBefore());
        int appendItemsRequested$paging_common_release = companion.getAppendItemsRequested$paging_common_release(getConfig().prefetchDistance, index, getStorage$paging_common_release().getPlaceholdersBefore() + getStorage$paging_common_release().getDataCount());
        int max = Math.max(prependItemsRequested$paging_common_release, this.prependItemsRequested);
        this.prependItemsRequested = max;
        if (max > 0) {
            this.pager.trySchedulePrepend();
        }
        int max2 = Math.max(appendItemsRequested$paging_common_release, this.appendItemsRequested);
        this.appendItemsRequested = max2;
        if (max2 > 0) {
            this.pager.tryScheduleAppend();
        }
        this.lowestIndexAccessed = Math.min(this.lowestIndexAccessed, index);
        this.highestIndexAccessed = Math.max(this.highestIndexAccessed, index);
        tryDispatchBoundaryCallbacks(true);
    }

    @Override // androidx.paging.PagedList
    public void detach() {
        this.pager.detach();
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onInitialized(int count) {
        notifyInserted$paging_common_release(0, count);
        this.replacePagesWithNulls = getStorage$paging_common_release().getPlaceholdersBefore() > 0 || getStorage$paging_common_release().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagePrepended(int leadingNulls, int changed, int added) {
        notifyChanged(leadingNulls, changed);
        notifyInserted$paging_common_release(0, added);
        this.lowestIndexAccessed += added;
        this.highestIndexAccessed += added;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPageAppended(int endPosition, int changed, int added) {
        notifyChanged(endPosition, changed);
        notifyInserted$paging_common_release(endPosition + changed, added);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int startOfDrops, int count) {
        notifyRemoved(startOfDrops, count);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int startOfDrops, int count) {
        notifyChanged(startOfDrops, count);
    }
}
