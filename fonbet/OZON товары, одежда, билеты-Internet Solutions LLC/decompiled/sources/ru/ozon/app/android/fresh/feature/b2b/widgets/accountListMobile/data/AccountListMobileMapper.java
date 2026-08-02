package ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data.AccountListMobileDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.presentation.AccountListMobileVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/presentation/AccountListMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO$AccountDTO;", "toVo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO$AccountDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/presentation/AccountListMobileVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountListMobileMapper implements Function2<AccountListMobileDTO, d, List<? extends AccountListMobileVO>> {
    private final AccountListMobileVO toVo(AccountListMobileDTO.AccountDTO accountDTO) {
        long hashCode = accountDTO.hashCode();
        Avatar avatar = accountDTO.getAvatar();
        String title = accountDTO.getTitle();
        String subtitle = accountDTO.getSubtitle();
        Badge counter = accountDTO.getCounter();
        boolean isSelected = accountDTO.isSelected();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(accountDTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = accountDTO.getTrackingInfo();
        return new AccountListMobileVO(hashCode, avatar, title, subtitle, counter, isSelected, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AccountListMobileVO> invoke(@NotNull AccountListMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<AccountListMobileDTO.AccountDTO> accounts = state.getAccounts();
        ArrayList arrayList = new ArrayList(C7714v.z(accounts, 10));
        Iterator<T> it = accounts.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((AccountListMobileDTO.AccountDTO) it.next()));
        }
        return arrayList;
    }
}
