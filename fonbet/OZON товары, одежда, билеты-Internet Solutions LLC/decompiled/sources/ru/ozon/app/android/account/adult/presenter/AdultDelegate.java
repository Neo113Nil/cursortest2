package ru.ozon.app.android.account.adult.presenter;

import Nc.C3667a;
import Sc.InterfaceC3999a;
import Ve.Om;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "T", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lio/reactivex/p;", "observeItem", "()Lio/reactivex/p;", "item", "", "bindItem", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;)V", "clear", "()V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "LNc/a;", "itemSubject", "LNc/a;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdultDelegate<T extends AdultVO> {

    @NotNull
    private final AdultHandler adultHandler;
    private C3667a<T> itemSubject;

    public AdultDelegate(@NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultHandler = adultHandler;
        this.itemSubject = C3667a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdultVO observeItem$lambda$0(Boolean isUserAnAdult, AdultVO item) {
        Intrinsics.checkNotNullParameter(isUserAnAdult, "isUserAnAdult");
        Intrinsics.checkNotNullParameter(item, "item");
        item.setShouldBlur(!isUserAnAdult.booleanValue() && item.getIsAdult());
        return item;
    }

    public final void bindItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.itemSubject == null) {
            this.itemSubject = C3667a.d();
        }
        C3667a<T> c3667a = this.itemSubject;
        if (c3667a != null) {
            c3667a.onNext(item);
        }
    }

    public final void clear() {
        this.itemSubject = null;
    }

    @NotNull
    public final p<T> observeItem() {
        if (this.itemSubject == null) {
            this.itemSubject = C3667a.d();
        }
        p<T> combineLatest = p.combineLatest(this.adultHandler.observeUserAdultState(), this.itemSubject, new Om());
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(...)");
        return combineLatest;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public AdultDelegate(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        this(adultHandler);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
    }
}
