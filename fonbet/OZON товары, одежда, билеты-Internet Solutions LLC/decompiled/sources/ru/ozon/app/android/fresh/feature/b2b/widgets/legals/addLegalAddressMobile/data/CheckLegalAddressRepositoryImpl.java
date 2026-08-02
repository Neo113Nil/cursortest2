package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data;

import Bc.m;
import Bc.o;
import Bc.r;
import DM.c;
import Fw.b;
import Mc.a;
import We.K;
import io.reactivex.C;
import io.reactivex.y;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.utils.ExtensionsKt;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;)V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "postData", "Lio/reactivex/y;", "checkLegalAddress", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckLegalAddressRepositoryImpl implements CheckLegalAddressRepository {

    @NotNull
    private final LegalsApi api;

    public CheckLegalAddressRepositoryImpl(@NotNull LegalsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K checkLegalAddress$lambda$0(String str, String str2) {
        return ExtensionsKt.jsonToRequestBody$default(str, null, new CheckLegalAddressRepositoryImpl$checkLegalAddress$1$1(str2), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C checkLegalAddress$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkLegalAddress$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (String) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepository
    @NotNull
    public y<String> checkLegalAddress(@NotNull final String address, @NotNull final String postData) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(postData, "postData");
        r rVar = new r(new m(new o(new Callable() { // from class: Xu.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                K checkLegalAddress$lambda$0;
                checkLegalAddress$lambda$0 = CheckLegalAddressRepositoryImpl.checkLegalAddress$lambda$0(postData, address);
                return checkLegalAddress$lambda$0;
            }
        }).j(a.a()), new c(new CheckLegalAddressRepositoryImpl$checkLegalAddress$2(this), 3)), new b(CheckLegalAddressRepositoryImpl$checkLegalAddress$3.INSTANCE, 3));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
