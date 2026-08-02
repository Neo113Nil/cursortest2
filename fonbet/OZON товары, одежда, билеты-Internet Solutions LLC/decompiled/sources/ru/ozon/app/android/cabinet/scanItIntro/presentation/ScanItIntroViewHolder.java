package ru.ozon.app.android.cabinet.scanItIntro.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cabinet.databinding.WidgetScanItIntroBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cabinet/databinding/WidgetScanItIntroBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/WidgetScanItIntroBinding;", "", "pagesCount", "I", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScanItIntroViewHolder extends k<ScanItIntroVO> {

    @NotNull
    private final WidgetScanItIntroBinding binding;

    @NotNull
    private final ComposerReferences composerRefs;

    @NotNull
    private final View containerView;
    private int pagesCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanItIntroViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerRefs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        this.containerView = containerView;
        this.composerRefs = composerRefs;
        WidgetScanItIntroBinding bind = WidgetScanItIntroBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.pagesRv.setAdapter(new ScanItIntroPageAdapter(new ActionHandler.Builder(composerRefs, this).onClick(new ScanItIntroViewHolder$actionHandler$1(this)).buildHandler()));
        new x().attachToRecyclerView(bind.pagesRv);
        bind.pagerIndicator.d(bind.pagesRv);
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScanItIntroVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.pagesCount = item.getPages().size();
        RecyclerView.g adapter = this.binding.pagesRv.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroPageAdapter");
        ((ScanItIntroPageAdapter) adapter).setPages(item.getPages());
        ScrollingPagerIndicator pagerIndicator = this.binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewExtKt.showOrGone(pagerIndicator, Boolean.valueOf(item.getPages().size() > 1));
    }
}
