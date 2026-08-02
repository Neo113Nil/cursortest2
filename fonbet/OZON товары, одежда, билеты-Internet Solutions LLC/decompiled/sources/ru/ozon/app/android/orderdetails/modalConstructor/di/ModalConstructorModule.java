package ru.ozon.app.android.orderdetails.modalConstructor.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.modalConstructor.core.ModalConstructorConfig;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.button.ButtonViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.image.ImageWrapperViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.separator.ModalConstructSeparatorViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.text.TextWrapperViewMapper;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/di/ModalConstructorModule;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/modalConstructor/core/ModalConstructorConfig;", "config", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/button/ButtonViewMapper;", "buttonViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/disclaimer/DisclaimerViewMapper;", "disclaimerViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/text/TextWrapperViewMapper;", "textViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/image/ImageWrapperViewMapper;", "imageViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/separator/ModalConstructSeparatorViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "cellListV2ViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesViewMapper;", "horizontalScrollImagesViewMapper", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidget", "(Lru/ozon/app/android/orderdetails/modalConstructor/core/ModalConstructorConfig;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/button/ButtonViewMapper;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/disclaimer/DisclaimerViewMapper;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/text/TextWrapperViewMapper;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/image/ImageWrapperViewMapper;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/separator/ModalConstructSeparatorViewMapper;Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesViewMapper;)Lru/ozon/app/android/composer/widgets/v2/Widget2;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalConstructorModule implements InterfaceC6958a {
    @NotNull
    public final Widget2 provideWidget(@NotNull ModalConstructorConfig config, @NotNull ButtonViewMapper buttonViewMapper, @NotNull DisclaimerViewMapper disclaimerViewMapper, @NotNull TextWrapperViewMapper textViewMapper, @NotNull ImageWrapperViewMapper imageViewMapper, @NotNull ModalConstructSeparatorViewMapper separatorViewMapper, @NotNull CellListV2ViewMapper cellListV2ViewMapper, @NotNull HorizontalScrollImagesViewMapper horizontalScrollImagesViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(buttonViewMapper, "buttonViewMapper");
        Intrinsics.checkNotNullParameter(disclaimerViewMapper, "disclaimerViewMapper");
        Intrinsics.checkNotNullParameter(textViewMapper, "textViewMapper");
        Intrinsics.checkNotNullParameter(imageViewMapper, "imageViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(cellListV2ViewMapper, "cellListV2ViewMapper");
        Intrinsics.checkNotNullParameter(horizontalScrollImagesViewMapper, "horizontalScrollImagesViewMapper");
        return new Widget2("csma", "modalConstructor", config, new ViewMapper2[]{disclaimerViewMapper, buttonViewMapper, textViewMapper, imageViewMapper, separatorViewMapper, cellListV2ViewMapper, horizontalScrollImagesViewMapper});
    }
}
