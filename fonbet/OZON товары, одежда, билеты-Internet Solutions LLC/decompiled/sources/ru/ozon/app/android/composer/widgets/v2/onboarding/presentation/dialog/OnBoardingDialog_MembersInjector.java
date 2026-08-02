package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import Ib.b;
import ru.ozon.app.android.network.version.AppVersionService;

/* loaded from: classes11.dex */
public final class OnBoardingDialog_MembersInjector implements b<OnBoardingDialog> {
    public static void injectAppVersionService(OnBoardingDialog onBoardingDialog, AppVersionService appVersionService) {
        onBoardingDialog.appVersionService = appVersionService;
    }
}
