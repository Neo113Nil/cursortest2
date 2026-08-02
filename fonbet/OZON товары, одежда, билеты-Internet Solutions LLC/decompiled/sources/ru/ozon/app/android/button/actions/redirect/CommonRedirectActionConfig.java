package ru.ozon.app.android.button.actions.redirect;

import GZ.g;
import a00.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.data.ActionButtonDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/button/actions/redirect/CommonRedirectActionConfig;", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "Lru/ozon/app/android/button/actions/redirect/CommonRedirectActionDTO;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "action", "La00/h;", "viewModelOwnerProvider", "", "widgetId", "", "onAction", "(Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;La00/h;Ljava/lang/Long;)V", "LGZ/g;", "Companion", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonRedirectActionConfig implements BaseActionConfig<CommonRedirectActionDTO> {

    @NotNull
    private final g ozonRouter;

    public CommonRedirectActionConfig(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    /* renamed from: action, reason: merged with bridge method [inline-methods] */
    public CommonRedirectActionDTO m495action(ActionButtonDTO.ButtonsItem.Action action) {
        return (CommonRedirectActionDTO) BaseActionConfig.DefaultImpls.action(this, action);
    }

    @Override // ru.ozon.app.android.button.actions.BaseActionConfig
    public void onAction(ActionButtonDTO.ButtonsItem.Action action, @NotNull h viewModelOwnerProvider, Long widgetId) {
        String deeplink;
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        CommonRedirectActionDTO commonRedirectActionDTO = (CommonRedirectActionDTO) m495action(action);
        if (commonRedirectActionDTO == null || (deeplink = commonRedirectActionDTO.getDeeplink()) == null) {
            return;
        }
        g.a.a(this.ozonRouter, deeplink, null, null, 6);
    }
}
