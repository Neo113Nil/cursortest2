package ru.ozon.app.android.injection.analytics.di;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/injection/analytics/di/OzonTrackerSupportedPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "provideSupportedPayloadTypes", "()Ljava/util/Set;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonTrackerSupportedPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes() {
        Intrinsics.checkNotNullParameter("click", "type");
        a a11 = a.a("click");
        Intrinsics.checkNotNullParameter("view", "type");
        a a12 = a.a("view");
        Intrinsics.checkNotNullParameter(TokenizedTrackingInfo.ACTION_ERROR_VIEW, "type");
        a a13 = a.a(TokenizedTrackingInfo.ACTION_ERROR_VIEW);
        Intrinsics.checkNotNullParameter("purchase", "type");
        a a14 = a.a("purchase");
        Intrinsics.checkNotNullParameter("composerAction", "type");
        a a15 = a.a("composerAction");
        Intrinsics.checkNotNullParameter("subscribe", "type");
        a a16 = a.a("subscribe");
        Intrinsics.checkNotNullParameter(TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "type");
        a a17 = a.a(TokenizedTrackingInfo.ACTION_UNSUBSCRIBE);
        Intrinsics.checkNotNullParameter(TokenizedTrackingInfo.ACTION_MORE_INFO, "type");
        return e0.a(a11, a12, a13, a14, a15, a16, a17, a.a(TokenizedTrackingInfo.ACTION_MORE_INFO));
    }
}
