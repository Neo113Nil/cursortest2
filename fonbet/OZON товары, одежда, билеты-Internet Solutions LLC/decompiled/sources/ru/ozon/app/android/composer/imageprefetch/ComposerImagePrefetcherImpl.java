package ru.ozon.app.android.composer.imageprefetch;

import E10.d;
import E10.e;
import Lm0.a;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.ComposerImagePrefetcherImpl;
import ru.ozon.app.android.composer.imageprefetch.flags.PrefetchImagesCountFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.composer.ui.widget.l;
import w10.InterfaceC10409a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/composer/imageprefetch/ComposerImagePrefetcherImpl;", "Lw10/a;", "Lru/ozon/app/android/composer/imageprefetch/ComposerImagePrefetcher;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "imagePrefetcher", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "init", "(Landroidx/lifecycle/J;Landroidx/recyclerview/widget/RecyclerView;)V", "", "layoutPosition", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "currentList", "Landroid/content/Context;", "context", "onPrefetchPositionChanged", "(ILjava/util/List;Landroid/content/Context;)V", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "prefetchImagesCount", "I", "maxInternalRecyclerViewPrefetchPosition", "lastPrefetchedPosition", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerImagePrefetcherImpl implements InterfaceC10409a {

    @NotNull
    private final ImagePrefetcher<c> imagePrefetcher;
    private int lastPrefetchedPosition;
    private int maxInternalRecyclerViewPrefetchPosition;
    private final int prefetchImagesCount;

    public ComposerImagePrefetcherImpl(@NotNull FeatureService featureService, @NotNull ImagePrefetcher<c> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.imagePrefetcher = imagePrefetcher;
        int max = Math.max(featureService.getIntKey(PrefetchImagesCountFlag.INSTANCE), 0);
        this.prefetchImagesCount = max;
        this.maxInternalRecyclerViewPrefetchPosition = -1;
        this.lastPrefetchedPosition = -1;
        if (max <= 0) {
            a.f17149a.e("Incorrect prefetch images count. It can't be less or equals to zero", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(ComposerImagePrefetcherImpl composerImagePrefetcherImpl, C8042d c8042d, RecyclerView recyclerView, int i11) {
        List<l> g10 = c8042d.g();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        composerImagePrefetcherImpl.onPrefetchPositionChanged(i11, g10, context);
    }

    @Override // w10.InterfaceC10409a
    public void init(@NotNull final J lifecycleOwner, @NotNull final RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Object layoutManager = recyclerView.getLayoutManager();
        d dVar = layoutManager instanceof d ? (d) layoutManager : null;
        if (dVar == null) {
            return;
        }
        RecyclerView.g adapter = recyclerView.getAdapter();
        final C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return;
        }
        dVar.a(new e() { // from class: Jr.a
            @Override // E10.e
            public final void a(int i11) {
                ComposerImagePrefetcherImpl.init$lambda$0(ComposerImagePrefetcherImpl.this, c8042d, recyclerView, i11);
            }
        });
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.imageprefetch.ComposerImagePrefetcherImpl$init$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                lifecycleOwner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                ImagePrefetcher imagePrefetcher;
                Intrinsics.checkNotNullParameter(owner, "owner");
                imagePrefetcher = ComposerImagePrefetcherImpl.this.imagePrefetcher;
                Context context = recyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                imagePrefetcher.clear(context);
            }
        });
    }

    public final void onPrefetchPositionChanged(int layoutPosition, @NotNull List<l> currentList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.maxInternalRecyclerViewPrefetchPosition < layoutPosition) {
            this.maxInternalRecyclerViewPrefetchPosition = layoutPosition;
            int i11 = layoutPosition + 1;
            int max = Math.max(i11, this.lastPrefetchedPosition + 1);
            if (max >= currentList.size()) {
                return;
            }
            int min = Math.min(i11 + this.prefetchImagesCount, currentList.size());
            List<l> subList = currentList.subList(max, min);
            ArrayList arrayList = new ArrayList(C7714v.z(subList, 10));
            Iterator<T> it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(((l) it.next()).d());
            }
            this.imagePrefetcher.prefetch(context, arrayList);
            this.lastPrefetchedPosition = min - 1;
        }
    }
}
