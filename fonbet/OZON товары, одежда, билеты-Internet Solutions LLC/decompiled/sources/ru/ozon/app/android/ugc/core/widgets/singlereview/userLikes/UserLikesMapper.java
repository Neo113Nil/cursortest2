package ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesDO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserLikesMapper implements Function2<UserLikesDO, d, List<? extends UserLikesVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UserLikesVO> invoke(@NotNull UserLikesDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        SingleReviewDTO.UserLikesDTO userLikes = state.getUserLikes();
        if (userLikes != null) {
            long hashCode = userLikes.hashCode() + widgetInfo.d().hashCode();
            List<IconDTO> avatars = userLikes.getAvatars();
            TextDTO text = userLikes.getText();
            IconDTO icon = userLikes.getIcon();
            AtomActionDTO action = userLikes.getAction();
            List<UserLikesVO> a02 = C7714v.a0(new UserLikesVO(hashCode, avatars, text, icon, action != null ? AtomActionMapperKt.toAtomAction(action, userLikes.getTrackingInfo()) : null));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
