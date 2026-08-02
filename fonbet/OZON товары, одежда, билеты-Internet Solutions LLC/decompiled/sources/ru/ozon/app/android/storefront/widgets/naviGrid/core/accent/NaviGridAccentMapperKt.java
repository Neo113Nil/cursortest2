package ru.ozon.app.android.storefront.widgets.naviGrid.core.accent;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.accent.NaviGridAccentMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.ItemDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.ItemVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0000\u001a\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"toVO", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "id", "", "index", "", "mainBgColor", "", "hideTitle", "", "widgetTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getPaddings", "Lkotlin/Pair;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGridAccentMapperKt {
    private static final Pair<Integer, Integer> getPaddings(int i11) {
        if (i11 == 0) {
            NaviGridAccentMapper.Companion companion = NaviGridAccentMapper.INSTANCE;
            return new Pair<>(Integer.valueOf(companion.getDp16()), Integer.valueOf(companion.getDp4()));
        }
        if (i11 != 1) {
            return new Pair<>(0, 0);
        }
        NaviGridAccentMapper.Companion companion2 = NaviGridAccentMapper.INSTANCE;
        return new Pair<>(Integer.valueOf(companion2.getDp4()), Integer.valueOf(companion2.getDp16()));
    }

    @NotNull
    public static final ItemVO toVO(@NotNull ItemDTO itemDTO, long j11, int i11, String str, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        TextDTO title;
        Intrinsics.checkNotNullParameter(itemDTO, "<this>");
        ImageDTO image = itemDTO.getImage();
        TextDTO copy$default = (z11 || (title = itemDTO.getTitle()) == null) ? null : TextDTO.copy$default(title, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
        String backgroundColor = itemDTO.getBackgroundColor();
        AtomActionDTO action = itemDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, itemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
        return new ItemVO(j11, image, copy$default, backgroundColor, str, getPaddings(i11), atomAction, map != null ? TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(j11), null, 2, null) : null, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, itemDTO.getTestInfo());
    }
}
