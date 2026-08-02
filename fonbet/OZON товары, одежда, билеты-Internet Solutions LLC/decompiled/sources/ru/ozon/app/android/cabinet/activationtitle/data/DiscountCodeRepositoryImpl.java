package ru.ozon.app.android.cabinet.activationtitle.data;

import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeRepositoryImpl;", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeRepository;", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeApi;", "discountCodeApi", "<init>", "(Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeApi;)V", "", "code", "Lio/reactivex/y;", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeResponse;", "applyDiscountCode", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeApi;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountCodeRepositoryImpl implements DiscountCodeRepository {

    @NotNull
    private final DiscountCodeApi discountCodeApi;

    public DiscountCodeRepositoryImpl(@NotNull DiscountCodeApi discountCodeApi) {
        Intrinsics.checkNotNullParameter(discountCodeApi, "discountCodeApi");
        this.discountCodeApi = discountCodeApi;
    }

    @Override // ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeRepository
    @NotNull
    public y<DiscountCodeResponse> applyDiscountCode(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.discountCodeApi.applyDiscountCode(code);
    }
}
