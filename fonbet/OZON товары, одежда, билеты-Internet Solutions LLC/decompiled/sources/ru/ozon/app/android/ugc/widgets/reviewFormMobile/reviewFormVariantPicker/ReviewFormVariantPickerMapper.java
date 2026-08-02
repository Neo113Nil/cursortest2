package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import Kk.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cachedVariantCell", "updateByCachedValueIfNeeded", "(Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormVariantPickerMapper implements Function2<ReviewFormFieldDTO.VariantPickerDTO, d, List<? extends VariantPickerVO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public ReviewFormVariantPickerMapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    private final InputSelectButtonDTO updateByCachedValueIfNeeded(InputSelectButtonDTO inputSelectButtonDTO, CellDTO cellDTO) {
        String value;
        CellDTO.CenterBlock centerBlock;
        CellDTO.CellText title;
        OzonSpannableString text;
        if (cellDTO == null || (centerBlock = cellDTO.getCenterBlock()) == null || (title = centerBlock.getTitle()) == null || (text = title.getText()) == null || (value = text.toString()) == null) {
            value = inputSelectButtonDTO.getValue();
        }
        return InputSelectButtonDTO.copy$default(inputSelectButtonDTO, null, null, null, null, null, value, null, null, 223, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r3 == null) goto L14;
     */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<VariantPickerVO> invoke(@NotNull ReviewFormFieldDTO.VariantPickerDTO state, @NotNull d widgetInfo) {
        Set set;
        ArrayList arrayList;
        boolean isSelected;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "variantPicker");
        ReviewFormData formData = this.reviewFormRepository.getFormData();
        CellDTO cellDTO = null;
        String variantId = formData != null ? formData.getVariantId() : null;
        List<ReviewFormFieldDTO.VariantPickerDTO.VariantDTO> variants = state.getVariants();
        if (variants != null) {
            List<ReviewFormFieldDTO.VariantPickerDTO.VariantDTO> list = variants;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ReviewFormFieldDTO.VariantPickerDTO.VariantDTO) it.next()).getId());
            }
            set = C7714v.Y0(arrayList2);
        }
        set = M.f71699a;
        boolean z11 = variantId != null && set.contains(variantId);
        if (state.getVariants() != null) {
            ArrayList arrayList3 = new ArrayList();
            TextDTO variantsHeader = state.getVariantsHeader();
            if (variantsHeader != null) {
                arrayList3.add(new VariantPickerVO.VariantPickerItem.Header(variantsHeader));
            }
            List<ReviewFormFieldDTO.VariantPickerDTO.VariantDTO> variants2 = state.getVariants();
            ArrayList arrayList4 = new ArrayList(C7714v.z(variants2, 10));
            for (ReviewFormFieldDTO.VariantPickerDTO.VariantDTO variantDTO : variants2) {
                String id2 = variantDTO.getId();
                CellDTO cell = variantDTO.getCell();
                if (z11) {
                    isSelected = Intrinsics.d(variantId, variantDTO.getId());
                    if (isSelected) {
                        cellDTO = variantDTO.getCell();
                    }
                } else {
                    isSelected = variantDTO.isSelected();
                }
                arrayList4.add(new VariantPickerVO.VariantPickerItem.Variant(id2, cell, isSelected));
            }
            arrayList3.addAll(arrayList4);
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return C7714v.a0(new VariantPickerVO(a11, state.getUploadKey(), state.getTitle(), updateByCachedValueIfNeeded(state.getSelectionButton(), cellDTO), arrayList));
    }
}
