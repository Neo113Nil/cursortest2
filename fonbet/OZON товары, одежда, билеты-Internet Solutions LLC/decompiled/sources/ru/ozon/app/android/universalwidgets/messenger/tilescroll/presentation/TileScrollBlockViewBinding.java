package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import X4.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.TileScrollItemDecorator;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", "LX4/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "getOrCreateHeaderView", "()Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "headerView", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "getHeaderView", "setHeaderView", "(Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollBlockViewBinding implements a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ConstraintLayout constraintLayout;
    private HeaderView headerView;

    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", "inflater", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "attachToRoot", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TileScrollBlockViewBinding create(@NotNull LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            ConstraintLayout constraintLayout = new ConstraintLayout(inflater.getContext());
            constraintLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
            if (attachToRoot && root != null) {
                root.addView(constraintLayout);
            }
            return new TileScrollBlockViewBinding(constraintLayout, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileScrollBlockViewBinding(ConstraintLayout constraintLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(constraintLayout);
    }

    public final HeaderView getHeaderView() {
        return this.headerView;
    }

    @NotNull
    public final HeaderView getOrCreateHeaderView() {
        if (this.headerView == null) {
            Context context = this.constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HeaderView headerView = new HeaderView(context, null, 0, 6, null);
            headerView.setId(View.generateViewId());
            ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
            bVar.f41656t = 0;
            bVar.f41658v = 0;
            bVar.f41636i = 0;
            headerView.setLayoutParams(bVar);
            this.constraintLayout.addView(headerView);
            this.headerView = headerView;
        }
        HeaderView headerView2 = this.headerView;
        Intrinsics.f(headerView2);
        return headerView2;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    private TileScrollBlockViewBinding(ConstraintLayout constraintLayout) {
        this.constraintLayout = constraintLayout;
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext());
        recyclerView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        recyclerView.setLayoutParams(bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new TileScrollItemDecorator());
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, UniColors.LAYER_FLOOR_0.getResId()));
        recyclerView.setNestedScrollingEnabled(false);
        constraintLayout.addView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // X4.a
    @NotNull
    /* renamed from: getRoot, reason: from getter */
    public ConstraintLayout getConstraintLayout() {
        return this.constraintLayout;
    }
}
