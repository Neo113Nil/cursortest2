package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.messenger.util.MessengerBlockViewedPond;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "onCleared", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "vo", "", "itemWasViewed", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;)Z", "itemViewed", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;)V", "Lru/ozon/app/android/universalwidgets/messenger/util/MessengerBlockViewedPond;", "viewedPond", "Lru/ozon/app/android/universalwidgets/messenger/util/MessengerBlockViewedPond;", "MyViewModelFactory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockViewModel extends w0 {

    @NotNull
    private final MessengerBlockViewedPond viewedPond = new MessengerBlockViewedPond();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel$MyViewModelFactory;", "Landroidx/lifecycle/z0$b;", "<init>", "()V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class MyViewModelFactory implements z0.b {
        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new TileScrollBlockViewModel();
        }
    }

    public final void itemViewed(@NotNull TileScrollBlockVO.TileVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.viewedPond.itemViewed(vo.getBlockId(), Long.valueOf(vo.getId()));
    }

    public final boolean itemWasViewed(@NotNull TileScrollBlockVO.TileVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        return this.viewedPond.containsItem(vo.getBlockId(), vo.getId());
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.viewedPond.clear();
    }
}
