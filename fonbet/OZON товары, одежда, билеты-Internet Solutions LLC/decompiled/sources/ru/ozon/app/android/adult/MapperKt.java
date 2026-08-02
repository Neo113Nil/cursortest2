package ru.ozon.app.android.adult;

import We.C4873o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.adult.AdultStateModel;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storage/adult/AdultStateModel;", "", "domain", "LWe/o;", "mapToCookie", "(Lru/ozon/app/android/storage/adult/AdultStateModel;Ljava/lang/String;)LWe/o;", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperKt {
    @NotNull
    public static final C4873o mapToCookie(@NotNull AdultStateModel adultStateModel, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(adultStateModel, "<this>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        C4873o.a aVar = new C4873o.a();
        aVar.b(domain);
        aVar.d(adultStateModel.getKey());
        aVar.e(adultStateModel.getAdultValue());
        aVar.c(adultStateModel.getExpireDate());
        return aVar.a();
    }
}
