package ru.ozon.app.android.monetization.di;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/di/MonetizationOzonTrackerSupportedPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "provideSupportedPayloadTypes$monetization_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonetizationOzonTrackerSupportedPayloadTypesModule {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/di/MonetizationOzonTrackerSupportedPayloadTypesModule$Companion;", "", "<init>", "()V", "ACTION_TYPE_SWIPE", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final Set<a> provideSupportedPayloadTypes$monetization_prodGoogleAllVendorsRelease() {
        Intrinsics.checkNotNullParameter("swipe", "type");
        return e0.a(a.a("swipe"));
    }
}
