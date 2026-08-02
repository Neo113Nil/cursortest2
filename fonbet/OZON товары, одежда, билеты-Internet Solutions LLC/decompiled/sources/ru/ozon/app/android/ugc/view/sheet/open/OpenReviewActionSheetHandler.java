package ru.ozon.app.android.ugc.view.sheet.open;

import GZ.g;
import LZ.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetFragment;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.action.sheet.AnalyticsInfo;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.open.ActionSheetVOInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/open/OpenReviewActionSheetHandler;", "Lru/ozon/app/android/ugc/view/sheet/open/ActionSheetVOInfo;", "T", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "", "handleOpenActionSheet", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "LGZ/g;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenReviewActionSheetHandler<T extends ActionSheetVOInfo> extends ReviewActionSheetHandler<T> {

    @NotNull
    private final g router;
    public static final int $stable = 8;

    public OpenReviewActionSheetHandler(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    private final boolean handleOpenActionSheet() {
        ActionSheetVOInfo actionSheetVOInfo = (ActionSheetVOInfo) getItem();
        if (actionSheetVOInfo == null) {
            return false;
        }
        ActionSheetVO actionSheetVO = actionSheetVOInfo.getActionSheetVO();
        if (actionSheetVO == null) {
            return true;
        }
        this.router.c(new b(new C9992d(new c("ActionSheetFragment", ActionSheetFragment.INSTANCE.newInstance(actionSheetVO, actionSheetVOInfo.getId(), new AnalyticsInfo(Long.valueOf(actionSheetVOInfo.getId()), null, null, 6, null)), null, false, false, null, false, false, false, 508, null), null, 2, null)), null);
        return true;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (action instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) action).getId(), "actionSheet") && handleOpenActionSheet();
    }
}
