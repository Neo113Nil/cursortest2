package ru.ozon.app.android.storefront.data.tiles.addtocart;

import Sc.o;
import kotlin.Metadata;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"resolveColors", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$Colors;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "tiles_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddToCartButtonDTOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddToCartButtonDTO.Theme.StyleWrapper.Style.values().length];
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.DEFAULT_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SECONDARY_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.DEFAULT_FRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SECONDARY_FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.DEFAULT_EXPRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SECONDARY_EXPRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SELECT_PRIMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.SELECT_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_PRIMARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_FRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_EXPRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_PRIMARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_FRESH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_EXPRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonDTO.Theme.Colors resolveColors(AddToCartButtonDTO.Theme.StyleWrapper.Style style) {
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_ACTION_PRIMARY.getToken(), UniColors.GRAPHIC_PRIMARY_ON_DARK.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), UniColors.BG_OPAQUE_ACTION_SECONDARY.getToken(), UniColors.GRAPHIC_ACTION_PRIMARY.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 2:
                UniColors uniColors = UniColors.BG_OPAQUE_ACTION_SECONDARY;
                String token = uniColors.getToken();
                UniColors uniColors2 = UniColors.GRAPHIC_ACTION_PRIMARY;
                return new AddToCartButtonDTO.Theme.Colors(token, uniColors2.getToken(), UniColors.TEXT_ACTION.getToken(), uniColors.getToken(), uniColors2.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 3:
                return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_FRESH_PRIMARY.getToken(), UniColors.GRAPHIC_PRIMARY_ON_DARK.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), UniColors.BG_FRESH_SECONDARY.getToken(), UniColors.GRAPHIC_FRESH.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 4:
                UniColors uniColors3 = UniColors.BG_OPAQUE_FRESH_SECONDARY;
                String token2 = uniColors3.getToken();
                UniColors uniColors4 = UniColors.GRAPHIC_FRESH;
                return new AddToCartButtonDTO.Theme.Colors(token2, uniColors4.getToken(), UniColors.TEXT_FRESH.getToken(), uniColors3.getToken(), uniColors4.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 5:
                return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_ACCENT_PRIMARY.getToken(), UniColors.GRAPHIC_PRIMARY_ON_DARK.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), UniColors.BG_OPAQUE_ACCENT_SECONDARY.getToken(), UniColors.GRAPHIC_EXPRESS.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 6:
                UniColors uniColors5 = UniColors.BG_OPAQUE_ACCENT_SECONDARY;
                return new AddToCartButtonDTO.Theme.Colors(uniColors5.getToken(), UniColors.GRAPHIC_ACCENT_PRIMARY.getToken(), UniColors.TEXT_ACCENT.getToken(), uniColors5.getToken(), UniColors.GRAPHIC_EXPRESS.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 7:
                return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_ACTION_PRIMARY.getToken(), UniColors.GRAPHIC_KEY_INVERTED.getToken(), UniColors.TEXT_PRIMARY_INVERTED.getToken(), UniColors.BG_SECONDARY.getToken(), UniColors.GRAPHIC_KEY.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 8:
                UniColors uniColors6 = UniColors.BG_SECONDARY;
                String token3 = uniColors6.getToken();
                UniColors uniColors7 = UniColors.GRAPHIC_KEY;
                String token4 = uniColors7.getToken();
                UniColors uniColors8 = UniColors.TEXT_PRIMARY;
                return new AddToCartButtonDTO.Theme.Colors(token3, token4, uniColors8.getToken(), uniColors6.getToken(), uniColors7.getToken(), uniColors8.getToken());
            case 9:
            case 10:
            case 11:
                return new AddToCartButtonDTO.Theme.Colors(UniColors.BG_ACTION_PRIMARY.getToken(), UniColors.GRAPHIC_DARK_KEY.getToken(), UniColors.TEXT_DARK_KEY.getToken(), UniColors.BG_SECONDARY.getToken(), UniColors.GRAPHIC_PRIMARY.getToken(), UniColors.TEXT_PRIMARY.getToken());
            case 12:
            case 13:
            case 14:
                String token5 = UniColors.BG_ACTION_PRIMARY.getToken();
                UniColors uniColors9 = UniColors.GRAPHIC_PRIMARY;
                String token6 = uniColors9.getToken();
                UniColors uniColors10 = UniColors.TEXT_PRIMARY;
                return new AddToCartButtonDTO.Theme.Colors(token5, token6, uniColors10.getToken(), UniColors.BG_SECONDARY.getToken(), uniColors9.getToken(), uniColors10.getToken());
            default:
                throw new o();
        }
    }
}
