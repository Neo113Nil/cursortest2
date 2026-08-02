package ru.ozon.app.android.pdp.ui.configurators.ugc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/ReviewContentParam;", "", "<init>", "()V", "", "deeplink", "", "isReviewContentDeeplink", "(Ljava/lang/String;)Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReviewContentParam {

    @NotNull
    public static final ReviewContentParam INSTANCE = new ReviewContentParam();

    private ReviewContentParam() {
    }

    public final boolean isReviewContentDeeplink(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return (h.t(deeplink, "ruuid", false) || h.t(deeplink, "reviewUuid", false)) && (h.t(deeplink, "reviewPuuid", false) || h.t(deeplink, "reviewVuuid", false));
    }
}
