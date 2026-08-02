package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import AJ.d;
import DJ.c;
import Mc.a;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepository;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import uc.i;
import vc.l;
import zz.C11156a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepository;", "repository", "<init>", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepository;)V", "", "link", "", "params", "", "setAllowPush", "(Ljava/lang/String;Ljava/util/Map;)V", "closeWidget", "onCleared", "()V", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposable", "Lnc/a;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnableNotificationsViewModelImpl extends w0 implements EnableNotificationsViewModel {

    @NotNull
    private final SingleLiveEvent<EnableNotificationsViewModel.Action> action;

    @NotNull
    private final C8486a disposable;

    @NotNull
    private final EnableNotificationsRepository repository;

    public EnableNotificationsViewModelImpl(@NotNull EnableNotificationsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.action = new SingleLiveEvent<>();
        this.disposable = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeWidget$lambda$2() {
    }

    @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModel
    public void closeWidget(@NotNull String link, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(link, "link");
        C8486a c8486a = this.disposable;
        l lVar = new l(this.repository.closeWidget(link, params).k(a.b()), C8125a.a());
        i iVar = new i(new d(EnableNotificationsViewModelImpl$closeWidget$2.INSTANCE, 13), new C11156a());
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.d();
    }

    @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModel
    public void setAllowPush(String link, Map<String, String> params) {
        if (link == null || params == null) {
            return;
        }
        C8486a c8486a = this.disposable;
        InterfaceC8487b h11 = this.repository.allowPush(link, params).j(a.b()).g(C8125a.a()).h(new AJ.a(new EnableNotificationsViewModelImpl$setAllowPush$1(this), 9), new c(new EnableNotificationsViewModelImpl$setAllowPush$2(this), 13));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModel
    @NotNull
    public SingleLiveEvent<EnableNotificationsViewModel.Action> getAction() {
        return this.action;
    }
}
