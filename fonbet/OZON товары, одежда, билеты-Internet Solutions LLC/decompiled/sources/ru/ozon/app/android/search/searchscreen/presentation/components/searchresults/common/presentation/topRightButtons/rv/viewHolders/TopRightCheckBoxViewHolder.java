package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders;

import EX.c;
import Go.e;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonsChechBoxMapperKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001\"B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/viewHolders/TopRightCheckBoxViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/widget/ImageView;", "view", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "selectedProcessor", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/widget/ImageView;Lru/ozon/app/android/favorites/common/SelectedProcessor;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "onAttach", "()V", "onDetach", "onRecycle", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;", "model", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;Lru/ozon/composer/ui/widget/k;)V", "Landroid/widget/ImageView;", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "currentModel", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;", "Lkotlin/Function1;", "clickListener", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightCheckBoxViewHolder extends j {

    @NotNull
    private final Function1<View, Unit> clickListener;

    @NotNull
    private final ComposerReferences composerReferences;
    private TopRightButtonCheckBox currentModel;
    private View rootView;

    @NotNull
    private final SelectedProcessor selectedProcessor;

    @NotNull
    private final ImageView view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int LAYOUT_ID = R$layout.top_right_buttons_search_check_box;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/viewHolders/TopRightCheckBoxViewHolder$Companion;", "", "<init>", "()V", "LAYOUT_ID", "", "getLAYOUT_ID", "()I", "CHECKBOX_LOCATOR", "", "create", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/viewHolders/TopRightCheckBoxViewHolder;", "context", "Landroid/content/Context;", "selectedProcessor", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopRightCheckBoxViewHolder create(@NotNull Context context, @NotNull SelectedProcessor selectedProcessor, @NotNull ComposerReferences composerReferences) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(selectedProcessor, "selectedProcessor");
            Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
            ImageView imageView = new ImageView(context);
            imageView.setId(R$id.topRightButtonsSearchCheckBoxIv);
            imageView.setLayoutParams(new RecyclerView.p(-1, -2));
            imageView.setImageResource(R$drawable.selector_checkbox);
            return new TopRightCheckBoxViewHolder(imageView, selectedProcessor, composerReferences);
        }

        public final int getLAYOUT_ID() {
            return TopRightCheckBoxViewHolder.LAYOUT_ID;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRightCheckBoxViewHolder(@NotNull ImageView view, @NotNull SelectedProcessor selectedProcessor, @NotNull ComposerReferences composerReferences) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(selectedProcessor, "selectedProcessor");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.view = view;
        this.selectedProcessor = selectedProcessor;
        this.composerReferences = composerReferences;
        this.clickListener = new TopRightCheckBoxViewHolder$clickListener$1(this);
    }

    public final void bind(@NotNull TopRightButtonCheckBox model, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.currentModel = model;
        this.rootView = widgetViewHolder.itemView;
        if (TopRightButtonsChechBoxMapperKt.extractSku(model) == null) {
            ViewExtKt.gone(this.view);
            return;
        }
        ViewExtKt.show(this.view);
        this.view.setSelected(model.isSelected());
        this.view.setOnClickListener(new e(this.clickListener, 10));
        View view = this.rootView;
        if (view != null) {
            view.setOnClickListener(new c(this.clickListener, 8));
        }
        this.view.setContentDescription("checkbox " + model.isSelected());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.selectedProcessor.startProcessing(new TopRightCheckBoxViewHolder$onAttach$1(this));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.selectedProcessor.stopProcessing();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.view.setOnClickListener(null);
        View view = this.rootView;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.rootView = null;
    }
}
