package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuIconVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuItemVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuTextVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/core/MorkovskMenuMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MenuItemDTO;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "map", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MenuItemDTO;J)Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", "mapToVo", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;)Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskMenuMapper implements Function2<MorkovskMenuDTO, d, List<? extends MorkovskMenuVO>> {
    private final MorkovskMenuItemVO map(MorkovskMenuDTO.MenuItemDTO menuItemDTO, long j11) {
        MorkovskMenuIconVO morkovskMenuIconVO = new MorkovskMenuIconVO(menuItemDTO.getIcon().getIcon(), menuItemDTO.getIcon().getTintColor());
        MorkovskMenuTextVO mapToVo = mapToVo(menuItemDTO.getTitle());
        MorkovskMenuDTO.MorkovskMenuTextDTO info = menuItemDTO.getInfo();
        MorkovskMenuTextVO mapToVo2 = info != null ? mapToVo(info) : null;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(menuItemDTO.getAction(), menuItemDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = menuItemDTO.getTrackingInfo();
        return new MorkovskMenuItemVO(morkovskMenuIconVO, mapToVo, mapToVo2, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final MorkovskMenuTextVO mapToVo(MorkovskMenuDTO.MorkovskMenuTextDTO morkovskMenuTextDTO) {
        return new MorkovskMenuTextVO(morkovskMenuTextDTO.getText(), morkovskMenuTextDTO.getTintColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MorkovskMenuVO> invoke(@NotNull MorkovskMenuDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<MorkovskMenuDTO.MenuItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(map((MorkovskMenuDTO.MenuItemDTO) it.next(), hashCode));
        }
        return C7714v.a0(new MorkovskMenuVO(hashCode, arrayList, state.getButton()));
    }
}
