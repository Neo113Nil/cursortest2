package ru.ozon.app.android.account.orders.cancel.presentation;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

/* loaded from: classes11.dex */
public final class CancelReasonFragment_MembersInjector implements b<CancelReasonFragment> {
    public static void injectHandlersInhibitor(CancelReasonFragment cancelReasonFragment, HandlersInhibitor handlersInhibitor) {
        cancelReasonFragment.handlersInhibitor = handlersInhibitor;
    }

    public static void injectPViewModel(CancelReasonFragment cancelReasonFragment, a<CancelReasonViewModelImpl> aVar) {
        cancelReasonFragment.pViewModel = aVar;
    }
}
