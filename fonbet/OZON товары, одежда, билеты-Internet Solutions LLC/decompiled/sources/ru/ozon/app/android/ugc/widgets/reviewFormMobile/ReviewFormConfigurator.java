package ru.ozon.app.android.ugc.widgets.reviewFormMobile;

import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import j10.h;
import java.util.Iterator;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/ReviewFormConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormConfigurator extends ComposerScreenConfig.PageConfigurator {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStart(@NotNull J owner) {
        C4911f ownerContainer;
        r a11;
        ConfiguratorReferences references;
        C4911f ownerContainer2;
        ComponentCallbacksC5392m c11;
        c cVar;
        h.b<l> voHelper;
        List<l> c12;
        Object obj;
        C7475g composerWidgetComponentStorage;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (references = getReferences()) == null || (ownerContainer2 = references.getOwnerContainer()) == null || (c11 = ownerContainer2.c()) == null) {
            return;
        }
        ConfiguratorReferences references3 = getReferences();
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) ((references3 == null || (composerWidgetComponentStorage = references3.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AndroidPlatformComponentApi.class));
        boolean z11 = (androidPlatformComponentApi != null ? androidPlatformComponentApi.getAppType() : null) == AppType.SELECT;
        ConfiguratorReferences references4 = getReferences();
        if (references4 != null && (voHelper = references4.getVoHelper()) != null && (c12 = voHelper.c()) != null) {
            Iterator<T> it = c12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((l) obj).d() instanceof ReviewFormHeaderVO) {
                        break;
                    }
                }
            }
            l lVar = (l) obj;
            if (lVar != null) {
                cVar = lVar.d();
                ReviewFormHeaderVO reviewFormHeaderVO = !(cVar instanceof ReviewFormHeaderVO) ? (ReviewFormHeaderVO) cVar : null;
                if (z11) {
                    return;
                }
                if ((reviewFormHeaderVO != null ? reviewFormHeaderVO.getBackgroundColor() : null) == null) {
                    StatusBarController statusBarController = StatusBarController.INSTANCE;
                    StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
                    statusBarController.setStatusBarBackgroundColor(c11, newState, ThemeExtKt.themeColor(a11, R$attr.layerFloor1));
                    statusBarController.setStatusBarContentColor(c11, newState, ThemeExtKt.isDarkThemeActive(a11), true);
                    return;
                }
                return;
            }
        }
        cVar = null;
        if (!(cVar instanceof ReviewFormHeaderVO)) {
        }
        if (z11) {
        }
    }
}
