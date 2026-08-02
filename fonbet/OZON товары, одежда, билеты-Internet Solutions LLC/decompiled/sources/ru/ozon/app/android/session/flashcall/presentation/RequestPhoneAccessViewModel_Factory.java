package ru.ozon.app.android.session.flashcall.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.v2.ActionV2Repository;

/* loaded from: classes2.dex */
public final class RequestPhoneAccessViewModel_Factory implements e<RequestPhoneAccessViewModel> {
    private final a<ActionV2Repository> actionRepositoryProvider;

    public RequestPhoneAccessViewModel_Factory(a<ActionV2Repository> aVar) {
        this.actionRepositoryProvider = aVar;
    }

    public static RequestPhoneAccessViewModel_Factory create(a<ActionV2Repository> aVar) {
        return new RequestPhoneAccessViewModel_Factory(aVar);
    }

    public static RequestPhoneAccessViewModel newInstance(ActionV2Repository actionV2Repository) {
        return new RequestPhoneAccessViewModel(actionV2Repository);
    }

    @Override // Pc.a
    public RequestPhoneAccessViewModel get() {
        return newInstance(this.actionRepositoryProvider.get());
    }
}
