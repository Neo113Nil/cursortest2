package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data;

import Sc.o;
import kotlin.Metadata;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"resolveColors", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$Theme$Colors;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddToCartButtonDTOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddToCartButtonDTO.Theme.StyleWrapper.Style.values().length];
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.NEW_FRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.DEFAULT_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SECONDARY_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.DEFAULT_FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SECONDARY_FRESH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonDTO.Theme.Colors resolveColors(AddToCartButtonDTO.Theme.StyleWrapper.Style style) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 == 1) {
            UniColors uniColors = UniColors.BG_PRIMARY;
            String token = uniColors.getToken();
            UniColors uniColors2 = UniColors.GRAPHIC_FRESH;
            String token2 = uniColors2.getToken();
            UniColors uniColors3 = UniColors.TEXT_PRIMARY;
            return new AddToCartButtonDTO.Theme.Colors(token, token2, uniColors3.getToken(), uniColors.getToken(), uniColors2.getToken(), uniColors3.getToken());
        }
        if (i11 == 2) {
            return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_ACTION_PRIMARY.getToken(), UniColors.GRAPHIC_PRIMARY_ON_DARK.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), UniColors.BG_OPAQUE_ACTION_SECONDARY.getToken(), UniColors.GRAPHIC_ACTION_PRIMARY.getToken(), UniColors.TEXT_PRIMARY.getToken());
        }
        if (i11 == 3) {
            UniColors uniColors4 = UniColors.BG_OPAQUE_ACTION_SECONDARY;
            String token3 = uniColors4.getToken();
            UniColors uniColors5 = UniColors.GRAPHIC_ACTION_PRIMARY;
            return new AddToCartButtonDTO.Theme.Colors(token3, uniColors5.getToken(), UniColors.TEXT_ACTION.getToken(), uniColors4.getToken(), uniColors5.getToken(), UniColors.TEXT_PRIMARY.getToken());
        }
        if (i11 == 4) {
            return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_FRESH_PRIMARY.getToken(), UniColors.GRAPHIC_PRIMARY_ON_DARK.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), UniColors.BG_FRESH_SECONDARY.getToken(), UniColors.GRAPHIC_FRESH.getToken(), UniColors.TEXT_PRIMARY.getToken());
        }
        if (i11 != 5) {
            throw new o();
        }
        UniColors uniColors6 = UniColors.BG_OPAQUE_FRESH_SECONDARY;
        String token4 = uniColors6.getToken();
        UniColors uniColors7 = UniColors.GRAPHIC_FRESH;
        return new AddToCartButtonDTO.Theme.Colors(token4, uniColors7.getToken(), UniColors.TEXT_FRESH.getToken(), uniColors6.getToken(), uniColors7.getToken(), UniColors.TEXT_PRIMARY.getToken());
    }
}
