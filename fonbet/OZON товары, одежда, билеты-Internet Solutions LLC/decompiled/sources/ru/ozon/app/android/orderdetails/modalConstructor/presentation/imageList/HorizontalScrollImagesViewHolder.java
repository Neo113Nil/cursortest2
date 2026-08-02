package ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import android.content.res.Resources;
import androidx.core.content.a;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesAdapter;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.PaddingsExtKt;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.models.ModalConstructorVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$HorizontalScrollImagesVO;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "updateItemDecorationIfNeed", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$HorizontalScrollImagesVO;Ll20/d;)V", "Landroid/content/res/Resources;", "layoutPadding", "", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesItemDecoration;", "itemDecoration", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesItemDecoration;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalScrollImagesViewHolder extends k<ModalConstructorVO.HorizontalScrollImagesVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultListDelegate<ImageVO> adultDelegate;

    @NotNull
    private final ImagesAdapter imagesAdapter;
    private HorizontalScrollImagesItemDecoration itemDecoration;

    @NotNull
    private final RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollImagesViewHolder(@NotNull RecyclerView recyclerView, @NotNull AdultListDelegate<ImageVO> adultDelegate, @NotNull ComposerReferences refs) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.recyclerView = recyclerView;
        this.adultDelegate = adultDelegate;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ImagesAdapter imagesAdapter = new ImagesAdapter(refs.getContainer().f(), buildHandler);
        this.imagesAdapter = imagesAdapter;
        recyclerView.setAdapter(imagesAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$submitList(ImagesAdapter imagesAdapter, List list, d dVar) {
        imagesAdapter.submitList(list);
        return Unit.f71690a;
    }

    private final void updateItemDecorationIfNeed(CommonCellSettings.LayoutPadding padding) {
        Resources resources = this.itemView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int padding2 = getPadding(resources, padding);
        HorizontalScrollImagesItemDecoration horizontalScrollImagesItemDecoration = this.itemDecoration;
        if (horizontalScrollImagesItemDecoration == null || horizontalScrollImagesItemDecoration.getPaddingBetween() != padding2) {
            HorizontalScrollImagesItemDecoration horizontalScrollImagesItemDecoration2 = this.itemDecoration;
            if (horizontalScrollImagesItemDecoration2 != null) {
                this.recyclerView.removeItemDecoration(horizontalScrollImagesItemDecoration2);
            }
            HorizontalScrollImagesItemDecoration horizontalScrollImagesItemDecoration3 = new HorizontalScrollImagesItemDecoration(padding2);
            this.recyclerView.addItemDecoration(horizontalScrollImagesItemDecoration3);
            this.itemDecoration = horizontalScrollImagesItemDecoration3;
        }
    }

    public final int getPadding(@NotNull Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(n.a(this.adultDelegate.observeItems()), new HorizontalScrollImagesViewHolder$onAttachViewModel$1(this.imagesAdapter)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ModalConstructorVO.HorizontalScrollImagesVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PaddingsExtKt.applyPaddings(this.recyclerView, item.getPadding());
        updateItemDecorationIfNeed(item.getPaddingBetweenImages());
        this.adultDelegate.bindItems(item.getScrollImages());
        if (item.getShowBackground()) {
            this.recyclerView.setBackgroundColor(a.getColor(getContext(), R$color.layer_floor_1));
        }
    }
}
