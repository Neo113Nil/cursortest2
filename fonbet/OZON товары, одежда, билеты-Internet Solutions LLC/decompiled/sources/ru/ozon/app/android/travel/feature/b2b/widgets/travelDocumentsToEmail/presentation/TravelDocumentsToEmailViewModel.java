package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation;

import Cw.c;
import Lz.C3602a;
import Mc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import com.google.android.gms.common.Scopes;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelAddEmailParam;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.TravelDocumentsToEmailViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import uc.i;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "api", "Ll10/b;", "composerController", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;Ll10/b;)V", "Lio/reactivex/b;", "source", "", "helperPerformAction", "(Lio/reactivex/b;)V", "onCleared", "()V", "Landroidx/lifecycle/P;", "errorLiveData", "()Landroidx/lifecycle/P;", "", "link", "", "params", "performAction", "(Ljava/lang/String;Ljava/util/Map;)V", Scopes.EMAIL, "", "addEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "Ll10/b;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelDocumentsToEmailViewModel extends w0 {

    @NotNull
    private final TravelCommonCompletableApi api;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final SingleLiveEvent<Unit> errorLiveData;

    public TravelDocumentsToEmailViewModel(@NotNull TravelCommonCompletableApi api, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.api = api;
        this.composerController = composerController;
        this.disposables = new C8486a();
        this.errorLiveData = new SingleLiveEvent<>();
    }

    private final void helperPerformAction(AbstractC7094b source) {
        this.disposables.d();
        n g10 = new l(source.k(a.b()), C8125a.a()).f(new C3602a(new TravelDocumentsToEmailViewModel$helperPerformAction$1(this), 7)).g(new InterfaceC9019a() { // from class: pN.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                TravelDocumentsToEmailViewModel.helperPerformAction$lambda$1(TravelDocumentsToEmailViewModel.this);
            }
        });
        i iVar = new i(new c(new TravelDocumentsToEmailViewModel$helperPerformAction$4(this), 15), new InterfaceC9019a() { // from class: pN.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                TravelDocumentsToEmailViewModel.helperPerformAction$lambda$2(TravelDocumentsToEmailViewModel.this);
            }
        });
        g10.a(iVar);
        this.disposables.a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void helperPerformAction$lambda$1(TravelDocumentsToEmailViewModel travelDocumentsToEmailViewModel) {
        travelDocumentsToEmailViewModel.composerController.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void helperPerformAction$lambda$2(TravelDocumentsToEmailViewModel travelDocumentsToEmailViewModel) {
        InterfaceC7851b.a.a(travelDocumentsToEmailViewModel.composerController, null, null, null, null, 15);
    }

    public final void addEmail(String email, String link, Map<String, ? extends Object> params) {
        if (email == null || link == null) {
            return;
        }
        if (params == null) {
            params = U.c();
        }
        helperPerformAction(this.api.completableAnyParamsResponse(link, U.m(params, U.j(new Pair(Scopes.EMAIL, new TravelAddEmailParam(h.z0(email).toString(), false, 2, null)), new Pair("validateOnly", Boolean.FALSE)))));
    }

    @NotNull
    public final P<Unit> errorLiveData() {
        return this.errorLiveData;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final void performAction(String link, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (link == null) {
            return;
        }
        helperPerformAction(this.api.completableResponse(link, params));
    }
}
