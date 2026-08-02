package ru.ozon.app.android.favorites.familyProfileAvatar.presentation;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.familyProfileAvatar.data.FamilyProfileAvatarDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/favorites/familyProfileAvatar/data/FamilyProfileAvatarDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarVO;", "invoke", "(Lru/ozon/app/android/favorites/familyProfileAvatar/data/FamilyProfileAvatarDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FamilyProfileAvatarViewMapper$mapper$1 extends AbstractC7737t implements Function2<FamilyProfileAvatarDTO, d, List<? extends FamilyProfileAvatarVO>> {
    public static final FamilyProfileAvatarViewMapper$mapper$1 INSTANCE = new FamilyProfileAvatarViewMapper$mapper$1();

    FamilyProfileAvatarViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<FamilyProfileAvatarVO> invoke(FamilyProfileAvatarDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IconDTO avatar = dto.getAvatar();
        TextDTO title = dto.getTitle();
        TextDTO subtitle = dto.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new FamilyProfileAvatarVO(hashCode, avatar, title, subtitle, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, dto.getTestInfo()));
    }
}
