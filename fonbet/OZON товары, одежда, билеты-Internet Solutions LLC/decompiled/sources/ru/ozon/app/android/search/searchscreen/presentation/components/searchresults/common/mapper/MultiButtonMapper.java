package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.MultiButtonDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.SwitchingButtonAtomModifier;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonTemplate;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u001a\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001b\u001a\u00020\u001c*\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0002J\f\u0010\u001f\u001a\u00020 *\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/MultiButtonMapper;", "", "switchingButtonAtomModifier", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SwitchingButtonAtomModifier;", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SwitchingButtonAtomModifier;)V", "toMultiButtonVO", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "buttonDTO", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;", "args", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/MultiButtonMapperArgs;", "extractTemplateState", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "extractButtons", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel;", "calculateButton", "buttonModel", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "footerAtom", "Lru/ozon/uni/atoms/data/AtomDTO;", "computeSecondButtonTopOffset", "", "firstButton", "secondButton", "computeContainerOffset", "isSellerButton", "", "mapButton", "button", "mapOrientation", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MultiButtonMapper {

    @NotNull
    private final SwitchingButtonAtomModifier switchingButtonAtomModifier;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultiButtonDTO.Theme.values().length];
            try {
                iArr[MultiButtonDTO.Theme.THEME_TYPE_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiButtonDTO.Theme.THEME_TYPE_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiButtonMapper(@NotNull SwitchingButtonAtomModifier switchingButtonAtomModifier) {
        Intrinsics.checkNotNullParameter(switchingButtonAtomModifier, "switchingButtonAtomModifier");
        this.switchingButtonAtomModifier = switchingButtonAtomModifier;
    }

    private final MultiButtonModel calculateButton(MultiButtonModel.ButtonModel buttonModel, AtomDTO footerAtom) {
        if (buttonModel == null && footerAtom == null) {
            return null;
        }
        return new MultiButtonModel(buttonModel, footerAtom, null, 4, null);
    }

    private final int computeContainerOffset(AtomDTO firstButton, AtomDTO secondButton) {
        return (!(isSellerButton(firstButton) && secondButton == null) && !(isSellerButton(secondButton) && firstButton == null) && (!isSellerButton(secondButton) || firstButton == null)) ? MultiButtonTemplate.INSTANCE.getDefaultFirstButtonMargin$search_prodGoogleAllVendorsRelease() : MultiButtonTemplate.INSTANCE.getSellerButtonOffset();
    }

    private final int computeSecondButtonTopOffset(AtomDTO firstButton, AtomDTO secondButton) {
        return (secondButton == null || !isSellerButton(firstButton)) ? MultiButtonTemplate.INSTANCE.getDefaultFirstButtonMargin$search_prodGoogleAllVendorsRelease() : MultiButtonTemplate.INSTANCE.getSellerButtonOffset();
    }

    private final List<MultiButtonModel> extractButtons(MultiButtonDTO multiButtonDTO, MultiButtonMapperArgs multiButtonMapperArgs) {
        return C7714v.I(C7714v.m0(calculateButton(mapButton(multiButtonDTO.getExpressButton(), multiButtonMapperArgs), multiButtonDTO.getExpressSubtitle()), calculateButton(mapButton(multiButtonDTO.getOzonButton(), multiButtonMapperArgs), multiButtonDTO.getOzonSubtitle())));
    }

    private final MultiButtonTemplate extractTemplateState(MultiButtonDTO multiButtonDTO, MultiButtonMapperArgs multiButtonMapperArgs) {
        return new MultiButtonTemplate(mapOrientation(multiButtonDTO), extractButtons(multiButtonDTO, multiButtonMapperArgs), computeSecondButtonTopOffset(multiButtonDTO.getExpressButton(), multiButtonDTO.getOzonButton()), computeContainerOffset(multiButtonDTO.getExpressButton(), multiButtonDTO.getOzonButton()));
    }

    private final boolean isSellerButton(AtomDTO atomDTO) {
        if ((atomDTO instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity ? (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO : null) != null) {
            ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO;
            if ((addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL || addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_140) && addToCartButtonWithQuantity.getSellerIcon() != null) {
                return true;
            }
        }
        return false;
    }

    private final MultiButtonModel.ButtonModel mapButton(AtomDTO button, MultiButtonMapperArgs args) {
        if (button == null) {
            return null;
        }
        return new MultiButtonModel.ButtonModel(args.getId(), args.getIsAdult(), this.switchingButtonAtomModifier.modifyActionsIfNeedIt(button));
    }

    private final MultiButtonTemplate.MultiButtonOrientation mapOrientation(MultiButtonDTO multiButtonDTO) {
        MultiButtonDTO.Theme theme = multiButtonDTO.getTheme();
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return MultiButtonTemplate.MultiButtonOrientation.HORIZONTAL;
        }
        return MultiButtonTemplate.MultiButtonOrientation.VERTICAL;
    }

    public final MultiButtonVO toMultiButtonVO(MultiButtonDTO buttonDTO, @NotNull MultiButtonMapperArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (buttonDTO == null) {
            return null;
        }
        return new MultiButtonVO("multiButton", null, extractTemplateState(buttonDTO, args), args.getFixedFooterHeight(), 2, null);
    }

    public /* synthetic */ MultiButtonMapper(SwitchingButtonAtomModifier switchingButtonAtomModifier, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new SwitchingButtonAtomModifier() : switchingButtonAtomModifier);
    }
}
