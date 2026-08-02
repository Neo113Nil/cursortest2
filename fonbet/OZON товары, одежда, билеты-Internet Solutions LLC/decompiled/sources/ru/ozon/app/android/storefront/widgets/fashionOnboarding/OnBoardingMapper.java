package ru.ozon.app.android.storefront.widgets.fashionOnboarding;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingMapper;", "", "<init>", "()V", "getOnBoardingVO", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "image", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnBoardingMapper {
    @NotNull
    public final OnBoardingVO getOnBoardingVO(String title, String description, String image) {
        if (title == null) {
            title = "Ozon Fashion";
        }
        if (description == null) {
            description = "Любимые бренды и оригинальные товары с возможностью оплаты после примерки!";
        }
        if (image == null) {
            image = "https://cdn1.ozone.ru/s3/cms/ad/t6c/img.png";
        }
        return new OnBoardingVO(title, description, image);
    }
}
