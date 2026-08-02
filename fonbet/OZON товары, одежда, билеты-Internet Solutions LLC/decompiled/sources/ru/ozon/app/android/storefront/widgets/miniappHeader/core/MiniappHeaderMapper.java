package ru.ozon.app.android.storefront.widgets.miniappHeader.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.miniappHeader.data.MiniappHeaderDTO;
import ru.ozon.app.android.storefront.widgets.miniappHeader.presentation.MiniappHeaderVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/miniappHeader/core/MiniappHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/data/MiniappHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/miniappHeader/data/MiniappHeaderDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MiniappHeaderMapper implements Function2<MiniappHeaderDTO, d, List<? extends MiniappHeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MiniappHeaderVO> invoke(@NotNull MiniappHeaderDTO state, @NotNull d widgetInfo) {
        IconDTO copy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        IconDTO icon = state.getIcon();
        String backgroundColor = state.getIcon().getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.CLEAR_LIGHT_KEY_0.getToken();
        }
        copy = icon.copy((r34 & 1) != 0 ? icon.size : null, (r34 & 2) != 0 ? icon.hasShape : null, (r34 & 4) != 0 ? icon.shape : null, (r34 & 8) != 0 ? icon.text : null, (r34 & 16) != 0 ? icon.icon : null, (r34 & 32) != 0 ? icon.backgroundImage : null, (r34 & 64) != 0 ? icon.backgroundColor : backgroundColor, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon.textColor : null, (r34 & 256) != 0 ? icon.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon.borderWidth : null, (r34 & 2048) != 0 ? icon.isBorderInside : null, (r34 & 4096) != 0 ? icon.hasParanja : null, (r34 & 8192) != 0 ? icon.getContext() : null, (r34 & 16384) != 0 ? icon.getTestInfo() : null, (r34 & 32768) != 0 ? icon.getTrackingInfo() : null);
        ImageDTO logo = state.getLogo();
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new MiniappHeaderVO(hashCode, title, copy, logo, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
