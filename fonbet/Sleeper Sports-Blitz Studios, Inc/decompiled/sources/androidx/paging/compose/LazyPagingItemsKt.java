package androidx.paging.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: LazyPagingItems.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IncompleteLoadState", "Landroidx/paging/LoadState$NotLoading;", "InitialLoadStates", "Landroidx/paging/LoadStates;", "collectAsLazyPagingItems", "Landroidx/paging/compose/LazyPagingItems;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/paging/compose/LazyPagingItems;", "paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LazyPagingItemsKt {
    private static final LoadState.NotLoading IncompleteLoadState;
    private static final LoadStates InitialLoadStates;

    static {
        LoadState.NotLoading notLoading = new LoadState.NotLoading(false);
        IncompleteLoadState = notLoading;
        InitialLoadStates = new LoadStates(LoadState.Loading.INSTANCE, notLoading, notLoading);
    }

    public static final <T> LazyPagingItems<T> collectAsLazyPagingItems(Flow<PagingData<T>> flow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        composer.startReplaceableGroup(388053246);
        ComposerKt.sourceInformation(composer, "C(collectAsLazyPagingItems)205@7600L40,207@7678L231,207@7646L263,217@7947L229,217@7915L261:LazyPagingItems.kt#2sw9ud");
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(388053246, i, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        composer.startReplaceableGroup(1046463091);
        ComposerKt.sourceInformation(composer, "CC(remember):LazyPagingItems.kt#9igjgp");
        boolean changed = composer.changed(flow);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyPagingItems(flow);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyPagingItems<T> lazyPagingItems = (LazyPagingItems) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1046463169);
        ComposerKt.sourceInformation(composer, "CC(remember):LazyPagingItems.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(coroutineContext) | composer.changedInstance(lazyPagingItems);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 0);
        composer.startReplaceableGroup(1046463438);
        ComposerKt.sourceInformation(composer, "CC(remember):LazyPagingItems.kt#9igjgp");
        boolean changedInstance2 = composer.changedInstance(coroutineContext) | composer.changedInstance(lazyPagingItems);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function2) new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyPagingItems;
    }
}
