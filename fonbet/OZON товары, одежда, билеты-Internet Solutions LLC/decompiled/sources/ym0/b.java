package ym0;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Locale f106803a = new Locale("RU");

    @NotNull
    public static String a() {
        Date time = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getInstance().time");
        StringBuilder sb2 = new StringBuilder(new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, f106803a).format(time));
        sb2.insert(sb2.length() - 2, ProductContainerDTO.RATIO_DELIMITER);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }
}
