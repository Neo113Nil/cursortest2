package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item;

import Cy.b;
import Hj.C3143a;
import WZ.t;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "tagView", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "onClick", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "radius", "setCornerRadius", "(Lru/ozon/uni/android/controls/tag/TagButtonView;F)V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsMaxItemViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<CatalogTabsV2VO.Tab, Unit> onClick;

    @NotNull
    private final Function1<t, Unit> onView;

    @NotNull
    private final TagButtonView tagView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogTabsMaxItemViewHolder(@NotNull TagButtonView tagView, @NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super CatalogTabsV2VO.Tab, Unit> onClick, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.tagView = tagView;
        this.onView = onView;
        this.onClick = onClick;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(CatalogTabsMaxItemViewHolder catalogTabsMaxItemViewHolder, CatalogTabsV2VO.Tab tab, View view) {
        catalogTabsMaxItemViewHolder.onClick.invoke(tab);
    }

    private final void setCornerRadius(TagButtonView tagButtonView, final float f7) {
        tagButtonView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item.CatalogTabsMaxItemViewHolder$setCornerRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), f7);
            }
        });
        tagButtonView.setClipToOutline(true);
    }

    public final void bind(@NotNull CatalogTabsV2VO.Tab item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonHolderKt.bindOrGone(this.tagView, item.getTagButton(), this.actionHandler);
        setCornerRadius(this.tagView, UiExtKt.toPxF(item.getTagRadius()));
        this.tagView.setOnClickListener(new b(4, this, item));
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            this.onView.invoke(trackingInfo);
        }
    }
}
