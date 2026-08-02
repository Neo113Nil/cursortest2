package ru.ozon.app.android.session.userSocialsMobile.data.item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileDTO;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemVO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\t2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVo", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;Ll20/d;)Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;)Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;)Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "state", "invoke", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserSocialsMobileItemMapper implements Function2<UserSocialsMobileDTO, d, List<? extends UserSocialsMobileItemVO>> {
    private final UserSocialsMobileItemVO toVo(UserSocialsMobileDTO.SocialDTO socialDTO, d dVar) {
        long hashCode = (dVar.d() + "_item_" + socialDTO.getTitle()).hashCode();
        TextAtom title = socialDTO.getTitle();
        Avatar logo = socialDTO.getLogo();
        TextAtom description = socialDTO.getDescription();
        UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO unbindButton = socialDTO.getUnbindButton();
        return new UserSocialsMobileItemVO(hashCode, title, logo, description, unbindButton != null ? toVo(unbindButton) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UserSocialsMobileItemVO> invoke(@NotNull UserSocialsMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<UserSocialsMobileDTO.SocialDTO> socials = state.getSocials();
        ArrayList arrayList = new ArrayList(C7714v.z(socials, 10));
        Iterator<T> it = socials.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((UserSocialsMobileDTO.SocialDTO) it.next(), widgetInfo));
        }
        return arrayList;
    }

    private final UserSocialsMobileItemVO.UnbindButtonVO toVo(UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO unbindButtonDTO) {
        return new UserSocialsMobileItemVO.UnbindButtonVO(unbindButtonDTO.getButton(), toVo(unbindButtonDTO.getConfirmationData()));
    }

    private final UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO toVo(UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO.ConfirmationDataDTO confirmationDataDTO) {
        return new UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO(confirmationDataDTO.getTitle(), confirmationDataDTO.getSubtitle());
    }
}
