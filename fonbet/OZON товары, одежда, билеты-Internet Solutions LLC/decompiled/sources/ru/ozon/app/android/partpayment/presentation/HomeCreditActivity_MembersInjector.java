package ru.ozon.app.android.partpayment.presentation;

import EZ.h;
import GZ.g;
import Ib.b;
import ru.ozon.app.android.partpayment.routing.CompoundDestinationFactory;

/* loaded from: classes13.dex */
public final class HomeCreditActivity_MembersInjector implements b<HomeCreditActivity> {
    public static void injectCompoundDestinationFactory(HomeCreditActivity homeCreditActivity, CompoundDestinationFactory compoundDestinationFactory) {
        homeCreditActivity.compoundDestinationFactory = compoundDestinationFactory;
    }

    public static void injectNavigatorHolder(HomeCreditActivity homeCreditActivity, h hVar) {
        homeCreditActivity.navigatorHolder = hVar;
    }

    public static void injectRouter(HomeCreditActivity homeCreditActivity, g gVar) {
        homeCreditActivity.router = gVar;
    }
}
