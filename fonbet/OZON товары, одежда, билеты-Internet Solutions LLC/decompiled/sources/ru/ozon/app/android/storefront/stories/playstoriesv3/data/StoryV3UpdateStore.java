package ru.ozon.app.android.storefront.stories.playstoriesv3.data;

import IJ.a;
import Nc.C3667a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/StoryV3UpdateStore;", "", "<init>", "()V", "", "storyId", "", "sendStoryViewed", "(J)V", "clearStorage", "Lio/reactivex/p;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "subscribeOnStoryViewed", "()Lio/reactivex/p;", "LNc/a;", "kotlin.jvm.PlatformType", "store", "LNc/a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryV3UpdateStore {

    @NotNull
    private final C3667a<ViewedStoryModel> store;

    public StoryV3UpdateStore() {
        C3667a<ViewedStoryModel> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.store = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeOnStoryViewed$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public final void clearStorage() {
        this.store.onNext(new ViewedStoryModel(Long.MIN_VALUE, M.f71699a));
    }

    public final void sendStoryViewed(long storyId) {
        ViewedStoryModel viewedStoryModel;
        ViewedStoryModel f7 = this.store.f();
        if (f7 == null || (viewedStoryModel = f7.copy(storyId, e0.g(f7.getViewedStoriesIds(), Long.valueOf(storyId)))) == null) {
            viewedStoryModel = new ViewedStoryModel(storyId, e0.h(Long.valueOf(storyId)));
        }
        this.store.onNext(viewedStoryModel);
    }

    @NotNull
    public final p<ViewedStoryModel> subscribeOnStoryViewed() {
        p<ViewedStoryModel> hide = this.store.filter(new a(StoryV3UpdateStore$subscribeOnStoryViewed$1.INSTANCE, 5)).hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }
}
