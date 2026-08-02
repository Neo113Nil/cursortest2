package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoRepositoryV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoResponseV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2Impl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoRepositoryV2;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;", "addEdoStatusStorage", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoRepositoryV2;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;)V", "", "observeViewIntent", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoResponseV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "toAction", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoResponseV2;)Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "viewIntent", "onViewIntent", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoRepositoryV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;", "LAe/w0;", "viewIntents", "LAe/w0;", "singleEvent", "getSingleEvent", "()LAe/w0;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddEdoViewModelV2Impl extends w0 implements AddEdoViewModelV2 {

    @NotNull
    private final AddEdoStatusStorage addEdoStatusStorage;

    @NotNull
    private final AddEdoRepositoryV2 repository;

    @NotNull
    private final Ae.w0<AddEdoViewModelV2.SingleEvent> singleEvent;

    @NotNull
    private final Ae.w0<AddEdoViewModelV2.ViewIntent> viewIntents;

    public AddEdoViewModelV2Impl(@NotNull AddEdoRepositoryV2 repository, @NotNull AddEdoStatusStorage addEdoStatusStorage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(addEdoStatusStorage, "addEdoStatusStorage");
        this.repository = repository;
        this.addEdoStatusStorage = addEdoStatusStorage;
        this.viewIntents = E0.b(0, 0, null, 7);
        this.singleEvent = E0.b(0, 0, null, 7);
        observeViewIntent();
    }

    private final void observeViewIntent() {
        C10727i.c(x0.a(this), null, null, new AddEdoViewModelV2Impl$observeViewIntent$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AddEdoViewModelV2.SingleEvent toAction(AddEdoResponseV2 addEdoResponseV2) {
        String deeplink = addEdoResponseV2.getDeeplink();
        if (deeplink != null && !h.K(deeplink) && addEdoResponseV2.isSuccess()) {
            return new AddEdoViewModelV2.SingleEvent.SuccessRedirect(addEdoResponseV2.getDeeplink());
        }
        String deeplink2 = addEdoResponseV2.getDeeplink();
        if ((deeplink2 == null || h.K(deeplink2)) && addEdoResponseV2.isSuccess()) {
            return AddEdoViewModelV2.SingleEvent.SuccessRefresh.INSTANCE;
        }
        return new AddEdoViewModelV2.SingleEvent.ShowError(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2
    public void onViewIntent(@NotNull AddEdoViewModelV2.ViewIntent viewIntent) {
        Intrinsics.checkNotNullParameter(viewIntent, "viewIntent");
        C10727i.c(x0.a(this), null, null, new AddEdoViewModelV2Impl$onViewIntent$1(this, viewIntent, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2
    @NotNull
    public Ae.w0<AddEdoViewModelV2.SingleEvent> getSingleEvent() {
        return this.singleEvent;
    }
}
