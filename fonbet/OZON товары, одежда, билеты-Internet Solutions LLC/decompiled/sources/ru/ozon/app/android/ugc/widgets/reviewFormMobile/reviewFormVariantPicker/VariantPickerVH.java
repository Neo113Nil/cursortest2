package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import androidx.fragment.app.G;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerView;", "view", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerView;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "variantPicker", "", "showOptionsSheet", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "variant", "onVariantSelected", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;)V", "updateSelectedVariant", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerView;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter;", "variantsAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "contentView$delegate", "LSc/j;", "getContentView", "()Landroidx/recyclerview/widget/RecyclerView;", "contentView", "Lru/ozon/uni/android/component/sheet/SheetView;", "variantsSheet$delegate", "getVariantsSheet", "()Lru/ozon/uni/android/component/sheet/SheetView;", "variantsSheet", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"NestedScrollFlagNotApplied"})
/* loaded from: classes2.dex */
public final class VariantPickerVH extends k<VariantPickerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: contentView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contentView;

    @NotNull
    private final ReviewFormViewModel formViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final VariantsListAdapter variantsAdapter;

    /* renamed from: variantsSheet$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j variantsSheet;

    @NotNull
    private final ReviewFormVariantPickerView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVH$Companion;", "", "<init>", "()V", "VARIANT_PICKER_TAG", "", "VARIANT_PICKER_ACTION_ID", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantPickerVH(@NotNull ReviewFormVariantPickerView view, @NotNull ReviewFormViewModel formViewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.formViewModel = formViewModel;
        this.refs = refs;
        this.variantsAdapter = new VariantsListAdapter(new VariantPickerVH$variantsAdapter$1(this));
        this.contentView = Sc.k.b(new VariantPickerVH$contentView$2(this));
        this.variantsSheet = Sc.k.b(new VariantPickerVH$variantsSheet$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new VariantPickerVH$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getContentView() {
        return (RecyclerView) this.contentView.getValue();
    }

    private final SheetView getVariantsSheet() {
        return (SheetView) this.variantsSheet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVariantSelected(VariantPickerVO.VariantPickerItem.Variant variant) {
        this.refs.getController().update(new SelectedVariantChanged(variant));
        getVariantsSheet().dismiss();
        updateSelectedVariant(variant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOptionsSheet(VariantPickerVO variantPicker) {
        this.variantsAdapter.submitList(variantPicker.getVariants());
        G d11 = this.refs.getContainer().d();
        if (d11 == null || getVariantsSheet().isAdded()) {
            return;
        }
        getVariantsSheet().show(d11, "variant_picker");
    }

    private final void updateSelectedVariant(VariantPickerVO.VariantPickerItem.Variant variant) {
        VariantPickerVO boundData = getBoundData();
        if (boundData != null) {
            this.formViewModel.onViewIntent(new ViewIntent.VariantUpdated(boundData.getUploadKey(), variant.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VariantPickerVO item, @NotNull d info) {
        Object obj;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReviewFormVariantPickerView reviewFormVariantPickerView = this.view;
        reviewFormVariantPickerView.setTitle(item.getTitle());
        reviewFormVariantPickerView.setPicker(item, this.actionHandler);
        List<VariantPickerVO.VariantPickerItem> variants = item.getVariants();
        if (variants != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : variants) {
                if (obj2 instanceof VariantPickerVO.VariantPickerItem.Variant) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((VariantPickerVO.VariantPickerItem.Variant) obj).getIsSelected()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            VariantPickerVO.VariantPickerItem.Variant variant = (VariantPickerVO.VariantPickerItem.Variant) obj;
            if (variant != null) {
                updateSelectedVariant(variant);
            }
        }
    }
}
