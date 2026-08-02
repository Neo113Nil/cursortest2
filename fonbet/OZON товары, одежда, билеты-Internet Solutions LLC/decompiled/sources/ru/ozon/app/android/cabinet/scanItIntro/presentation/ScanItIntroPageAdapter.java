package ru.ozon.app.android.cabinet.scanItIntro.presentation;

import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.cabinet.databinding.ItemScanItIntroBinding;
import ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter$PageVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter$PageVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter$PageVH;I)V", "", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "pages", "setPages", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "PageVH", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScanItIntroPageAdapter extends RecyclerView.g<PageVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<ScanItIntroVO.Page> pages;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter$PageVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroPageAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "pageVO", "", "bind", "(Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/cabinet/databinding/ItemScanItIntroBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/ItemScanItIntroBinding;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PageVH extends RecyclerView.C {

        @NotNull
        private final ItemScanItIntroBinding binding;

        @NotNull
        private final View containerView;
        final /* synthetic */ ScanItIntroPageAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageVH(@NotNull ScanItIntroPageAdapter scanItIntroPageAdapter, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.this$0 = scanItIntroPageAdapter;
            this.containerView = containerView;
            ItemScanItIntroBinding bind = ItemScanItIntroBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            bind.firstButtonBa.setOnAction(scanItIntroPageAdapter.getActionHandler());
            bind.secondButtonBa.setOnAction(scanItIntroPageAdapter.getActionHandler());
        }

        public final void bind(@NotNull ScanItIntroVO.Page pageVO) {
            Intrinsics.checkNotNullParameter(pageVO, "pageVO");
            ItemScanItIntroBinding itemScanItIntroBinding = this.binding;
            ImageView scanItIntroIv = itemScanItIntroBinding.scanItIntroIv;
            Intrinsics.checkNotNullExpressionValue(scanItIntroIv, "scanItIntroIv");
            ImageViewExtKt.loadImageOrGone(scanItIntroIv, pageVO.getImage());
            TextView titleTv = itemScanItIntroBinding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            TextViewExtKt.setTextOrGone(titleTv, pageVO.getTitle());
            TextView descriptionTv = itemScanItIntroBinding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
            TextViewExtKt.setTextOrGone(descriptionTv, pageVO.getDescription());
            Button firstButton = pageVO.getFirstButton();
            if (firstButton != null) {
                itemScanItIntroBinding.firstButtonBa.bind(firstButton);
            }
            ButtonAtom firstButtonBa = itemScanItIntroBinding.firstButtonBa;
            Intrinsics.checkNotNullExpressionValue(firstButtonBa, "firstButtonBa");
            ViewExtKt.showOrInvisible(firstButtonBa, pageVO.getFirstButton() != null);
            Button secondButton = pageVO.getSecondButton();
            if (secondButton == null) {
                ButtonAtom secondButtonBa = itemScanItIntroBinding.secondButtonBa;
                Intrinsics.checkNotNullExpressionValue(secondButtonBa, "secondButtonBa");
                ViewExtKt.invisible(secondButtonBa);
            } else {
                itemScanItIntroBinding.secondButtonBa.bind(secondButton);
                ButtonAtom secondButtonBa2 = itemScanItIntroBinding.secondButtonBa;
                Intrinsics.checkNotNullExpressionValue(secondButtonBa2, "secondButtonBa");
                ViewExtKt.show(secondButtonBa2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScanItIntroPageAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.pages = new ArrayList();
    }

    @NotNull
    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.pages.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PageVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View inflate = C4636t5.a(parent, "parent").inflate(R$layout.item_scan_it_intro, parent, false);
        Intrinsics.f(inflate);
        return new PageVH(this, inflate);
    }

    public final void setPages(@NotNull List<ScanItIntroVO.Page> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.pages.clear();
        this.pages.addAll(pages);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PageVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.pages.get(position));
    }
}
