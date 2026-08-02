package ru.ozon.app.android.storefront.screens.about;

import DJ.e;
import Mc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.storefront.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/screens/about/AboutViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/screens/about/AboutViewModel;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "composerLocationRepository", "<init>", "(Lru/ozon/app/android/location/ComposerLocationRepository;)V", "", "countryCode", "", "postAboutInfo", "(Ljava/lang/String;)V", "onCleared", "()V", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/storefront/screens/about/AboutInfo;", "mAboutInfo", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "getAboutInfo", "()Landroidx/lifecycle/P;", "aboutInfo", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AboutViewModelImpl extends w0 implements AboutViewModel {

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final V<AboutInfo> mAboutInfo;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.screens.about.AboutViewModelImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<String, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, AboutViewModelImpl.class, "postAboutInfo", "postAboutInfo(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AboutViewModelImpl) this.receiver).postAboutInfo(p02);
        }
    }

    public AboutViewModelImpl(@NotNull ComposerLocationRepository composerLocationRepository) {
        Intrinsics.checkNotNullParameter(composerLocationRepository, "composerLocationRepository");
        C8486a c8486a = new C8486a();
        this.compositeDisposable = c8486a;
        this.mAboutInfo = new V<>();
        InterfaceC8487b subscribe = composerLocationRepository.getCountryCode().subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new e(new AnonymousClass1(this), 6));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postAboutInfo(String countryCode) {
        String valueOf = String.valueOf(Calendar.getInstance().get(1));
        this.mAboutInfo.setValue(Intrinsics.d(countryCode, "BLR") ? new AboutInfo(StringProvider.getString(R$string.about_company_legal_name_by_android), "ozon://web?url=https://docs.ozon.ru/legal/personal-data-rb/", StringProvider.getString(R$string.about_copyright_years_range_by_android, valueOf)) : new AboutInfo(StringProvider.getString(R$string.about_company_legal_name_android), "ozon://web?url=https://docs.ozon.ru/legal/personal-data/", StringProvider.getString(R$string.about_copyright_years_range_android, valueOf)));
    }

    @Override // ru.ozon.app.android.storefront.screens.about.AboutViewModel
    @NotNull
    public P<AboutInfo> getAboutInfo() {
        return this.mAboutInfo;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.dispose();
    }
}
