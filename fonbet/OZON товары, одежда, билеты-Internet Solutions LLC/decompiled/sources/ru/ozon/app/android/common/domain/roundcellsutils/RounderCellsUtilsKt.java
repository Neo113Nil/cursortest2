package ru.ozon.app.android.common.domain.roundcellsutils;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"determineLayoutModel", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "cells", "", "", "index", "", "paddingTop", "paddingBottom", "marginTop", "marginBottom", "marginLeft", "marginRight", "topCornerRadius", "", "bottomCornerRadius", "(Ljava/util/List;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RounderCellsUtilsKt {
    @NotNull
    public static final RoundedCellsVO.LayoutModel determineLayoutModel(@NotNull List<? extends Object> cells, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f7, Float f11) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return cells.size() == 1 ? RoundedCellsVO.LayoutModel.INSTANCE.createWithDefaultValues(num, num2, num3, num4, num5, num6, f7, f11) : i11 == 0 ? RoundedCellsVO.LayoutModel.INSTANCE.createWithDefaultValues(num, num2, num3, 0, num5, num6, f7, Float.valueOf(0.0f)) : i11 == C7714v.P(cells) ? RoundedCellsVO.LayoutModel.INSTANCE.createWithDefaultValues(num, num2, 0, num4, num5, num6, Float.valueOf(0.0f), f11) : RoundedCellsVO.LayoutModel.INSTANCE.createWithDefaultValues(0, 0, 0, 0, Integer.valueOf(num5 != null ? num5.intValue() : ResourceExtKt.toPx(16)), Integer.valueOf(num6 != null ? num6.intValue() : ResourceExtKt.toPx(16)), Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public static /* synthetic */ RoundedCellsVO.LayoutModel determineLayoutModel$default(List list, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f7, Float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            num2 = null;
        }
        if ((i12 & 16) != 0) {
            num3 = null;
        }
        if ((i12 & 32) != 0) {
            num4 = null;
        }
        if ((i12 & 64) != 0) {
            num5 = null;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num6 = null;
        }
        if ((i12 & 256) != 0) {
            f7 = null;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            f11 = null;
        }
        return determineLayoutModel(list, i11, num, num2, num3, num4, num5, num6, f7, f11);
    }
}
