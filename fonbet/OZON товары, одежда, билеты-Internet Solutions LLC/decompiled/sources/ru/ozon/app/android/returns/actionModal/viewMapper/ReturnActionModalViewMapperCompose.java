package ru.ozon.app.android.returns.actionModal.viewMapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.actionModal.data.dto.ReturnActionModalDto;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.actionModal.viewMapper.extension.ReturnActionModalsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/actionModal/viewMapper/ReturnActionModalViewMapperCompose;", "", "<init>", "()V", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "invoke", "(Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;Ll20/d;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalViewMapperCompose {
    @NotNull
    public final ReturnActionModalVO invoke(@NotNull ReturnActionModalDto state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return ReturnActionModalsKt.toVO(state, widgetInfo.d());
    }
}
