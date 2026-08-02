package ru.ozon.app.android.minifyLink.presentation;

import AA.a;
import AA.d;
import Bc.f;
import Bc.i;
import W10.c;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepository;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/minifyLink/data/MinifyLinkRepository;", "minifyLinkRepository", "<init>", "(Lru/ozon/app/android/minifyLink/data/MinifyLinkRepository;)V", "", "onCleared", "()V", "", "originalUrl", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lkotlin/Function1;", "showLink", "onClickShare", "(Ljava/lang/String;LW10/c;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/minifyLink/data/MinifyLinkRepository;", "Lnc/b;", "disposable", "Lnc/b;", "", "isFetching", "Z", "minify-link_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MinifyLinkViewModel extends w0 {
    private InterfaceC8487b disposable;
    private boolean isFetching;

    @NotNull
    private final MinifyLinkRepository minifyLinkRepository;

    public MinifyLinkViewModel(@NotNull MinifyLinkRepository minifyLinkRepository) {
        Intrinsics.checkNotNullParameter(minifyLinkRepository, "minifyLinkRepository");
        this.minifyLinkRepository = minifyLinkRepository;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public final void onClickShare(@NotNull String originalUrl, @NotNull c trackingData, @NotNull Function1<? super String, Unit> showLink) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(showLink, "showLink");
        if (this.isFetching) {
            return;
        }
        this.disposable = new f(new i(this.minifyLinkRepository.minifyLink(originalUrl, trackingData).g(C8125a.a()), new a(new MinifyLinkViewModel$onClickShare$1(this), 0)), new InterfaceC9019a() { // from class: AA.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                MinifyLinkViewModel.this.isFetching = false;
            }
        }).h(new AA.c(new MinifyLinkViewModel$onClickShare$3(showLink), 0), new d(new MinifyLinkViewModel$onClickShare$4(showLink, originalUrl), 0));
    }
}
