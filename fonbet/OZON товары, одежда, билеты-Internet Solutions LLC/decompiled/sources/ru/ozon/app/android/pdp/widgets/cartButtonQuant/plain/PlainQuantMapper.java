package ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.QuantMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainQuantMapper implements Function2<CartButtonQuantDto, d, List<? extends PlainQuantVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PlainQuantVO> invoke(@NotNull CartButtonQuantDto dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CartButtonQuantDto.Configuration configuration = dto.getConfiguration();
        CartButtonQuantDto.Configuration.PlainData plainData = configuration instanceof CartButtonQuantDto.Configuration.PlainData ? (CartButtonQuantDto.Configuration.PlainData) configuration : null;
        if (plainData != null) {
            ButtonV3Atom.LargeButton actionButton = plainData.getActionButton();
            List<PlainQuantVO> a02 = C7714v.a0(new PlainQuantVO(widgetInfo.d().hashCode(), plainData.getAsyncFetchType() == CartButtonQuantDto.AsyncFetchType.TITLE ? QuantMapperKt.updateWithPlaceholderTitle(actionButton) : actionButton, actionButton.getText(), plainData.getAsyncFetchType(), null, dto.getNeedsShadow(), dto.getStyle()));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
