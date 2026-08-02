package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation;

import C.h0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetSellerSortSwitcherBinding;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.SellerSortSwitcherVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;", "Lru/ozon/app/android/pdp/databinding/WidgetSellerSortSwitcherBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetSellerSortSwitcherBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindImage", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;)Ljava/lang/Object;", "", "bindText", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;)V", "Landroid/widget/TextView;", "updateMaxLines", "(Landroid/widget/TextView;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;Ll20/d;)V", "onDetach", "()V", "Lru/ozon/app/android/pdp/databinding/WidgetSellerSortSwitcherBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "previewVo", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;", "Ljava/lang/Runnable;", "textViewRunnable", "Ljava/lang/Runnable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "dp4", "I", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "tagsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherViewHolder extends k<SellerSortSwitcherVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetSellerSortSwitcherBinding binding;
    private final int dp4;
    private SellerSortSwitcherVO previewVo;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AtomsAdapter tagsAdapter;
    private Runnable textViewRunnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SellerSortSwitcherViewHolder(@NotNull WidgetSellerSortSwitcherBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new SellerSortSwitcherViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.dp4 = ResourceExtKt.toPx(4);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.tagsAdapter = atomsAdapter;
        HorizontalAtomsLayout horizontalAtomsLayout = binding.tagsHal;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new HorizontalAtomsDecorator() { // from class: ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.SellerSortSwitcherViewHolder$1$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
            public LinearLayout.LayoutParams modifyHorizontalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                Intrinsics.checkNotNullParameter(data, "data");
                lp.width = 0;
                lp.weight = 1.0f;
                return lp;
            }
        });
    }

    private final Object bindImage(SellerSortSwitcherVO item) {
        String image;
        WidgetSellerSortSwitcherBinding widgetSellerSortSwitcherBinding = this.binding;
        SellerSortSwitcherVO.ProductVO product = item.getProduct();
        if (product == null || (image = product.getImage()) == null) {
            ImageView productIv = widgetSellerSortSwitcherBinding.productIv;
            Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
            ViewExtKt.gone(productIv);
            return Unit.f71690a;
        }
        ImageView imageView = widgetSellerSortSwitcherBinding.productIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, image, C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(this.dp4, null, 2, null)), null, null, null, false, null, 124, null);
        ThemeExtKt.setParandjaForDarkTheme(imageView);
        ViewExtKt.show(imageView);
        return imageView;
    }

    private final void bindText(SellerSortSwitcherVO item) {
        TextView textView = this.binding.productTitleTv;
        Intrinsics.f(textView);
        SellerSortSwitcherVO.ProductVO product = item.getProduct();
        TextViewExtKt.setTextOrGone(textView, product != null ? product.getTitle() : null);
        updateMaxLines(textView);
    }

    private final void updateMaxLines(TextView textView) {
        Runnable runnable = this.textViewRunnable;
        if (runnable != null) {
            textView.removeCallbacks(runnable);
        }
        h0 h0Var = new h0(8, this, textView);
        this.textViewRunnable = h0Var;
        textView.post(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMaxLines$lambda$7(SellerSortSwitcherViewHolder sellerSortSwitcherViewHolder, TextView textView) {
        int height = sellerSortSwitcherViewHolder.binding.productIv.getHeight() / textView.getLineHeight();
        if (textView.getMaxLines() != height) {
            textView.setMaxLines(height);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        Runnable runnable = this.textViewRunnable;
        if (runnable != null) {
            this.binding.productTitleTv.removeCallbacks(runnable);
            this.textViewRunnable = null;
        }
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerSortSwitcherVO item, @NotNull d info) {
        SellerSortSwitcherVO.ProductVO product;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SellerSortSwitcherVO sellerSortSwitcherVO = this.previewVo;
        String image = (sellerSortSwitcherVO == null || (product = sellerSortSwitcherVO.getProduct()) == null) ? null : product.getImage();
        SellerSortSwitcherVO.ProductVO product2 = item.getProduct();
        if (!Intrinsics.d(image, product2 != null ? product2.getImage() : null)) {
            bindImage(item);
        }
        bindText(item);
        this.tagsAdapter.bind(getContext(), item.getTabs());
        this.previewVo = item;
    }
}
