package ru.ozon.app.android.composer.widgets.internal.loading;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import g20.C6615a;
import g20.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/loading/LoadingViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lg20/a;", "Lg20/b;", "Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent;", "component", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent;Lru/ozon/app/android/utils/AppType;)V", "state", "Ll20/d;", "info", "", "map", "(Lg20/a;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent;", "Lru/ozon/app/android/utils/AppType;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingViewMapper extends g<C6615a, b> {
    private static final int PADDING_16;
    private static final int PROGRESS_BAR_HEIGHT;

    @NotNull
    private final AppType appType;

    @NotNull
    private final LoadingComponent component;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/loading/LoadingViewMapper$Companion;", "", "<init>", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(16);
        PADDING_16 = px;
        PROGRESS_BAR_HEIGHT = UiExtKt.toPx(24) + px + px;
    }

    public LoadingViewMapper(@NotNull LoadingComponent component, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.component = component;
        this.appType = appType;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<b> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new LoadingViewHolder(view, this.component.getPagePerformanceTracker(), this.appType);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ProgressBar progressBar = new ProgressBar(parent.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, PROGRESS_BAR_HEIGHT);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        int i11 = PADDING_16;
        progressBar.setPadding(0, i11, 0, i11);
        return progressBar;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<b> map(@NotNull C6615a state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
