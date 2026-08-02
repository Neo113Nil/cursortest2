package ru.ozon.app.android.account.adult.presenter;

import Fj.c;
import Nc.C3667a;
import io.reactivex.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R$\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "T", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lio/reactivex/p;", "", "observeItems", "()Lio/reactivex/p;", "list", "", "bindItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LNc/a;", "imagesSubject", "LNc/a;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdultListDelegate<T extends AdultVO> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final FeatureChecker featureChecker;
    private C3667a<List<T>> imagesSubject;

    public AdultListDelegate(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.imagesSubject = C3667a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeItems$lambda$0(Boolean isUserAnAdult, List items) {
        Intrinsics.checkNotNullParameter(isUserAnAdult, "isUserAnAdult");
        Intrinsics.checkNotNullParameter(items, "items");
        boolean booleanValue = isUserAnAdult.booleanValue();
        Iterator it = items.iterator();
        while (it.hasNext()) {
            AdultVO adultVO = (AdultVO) it.next();
            adultVO.setShouldBlur(!booleanValue && adultVO.getIsAdult());
        }
        return items;
    }

    public final void bindItems(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (this.imagesSubject == null) {
            this.imagesSubject = C3667a.d();
        }
        C3667a<List<T>> c3667a = this.imagesSubject;
        if (c3667a != null) {
            c3667a.onNext(list);
        }
    }

    @NotNull
    public final p<List<T>> observeItems() {
        if (this.imagesSubject == null) {
            this.imagesSubject = C3667a.d();
        }
        p<List<T>> combineLatest = p.combineLatest(this.adultHandler.observeUserAdultState(), this.imagesSubject, new c());
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(...)");
        return combineLatest;
    }
}
