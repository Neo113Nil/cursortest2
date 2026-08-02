package ru.ozon.app.android.payment.ui;

import android.content.Context;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "isSupport", "Lio/reactivex/C;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class GooglePayManagerImpl$checkIsGooglePayReady$2 extends AbstractC7737t implements Function1<Boolean, C<? extends Boolean>> {
    final /* synthetic */ AndroidPlatformComponentConfig $config;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $panOnlyEnabled;
    final /* synthetic */ GooglePayManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayManagerImpl$checkIsGooglePayReady$2(GooglePayManagerImpl googlePayManagerImpl, Context context, AndroidPlatformComponentConfig androidPlatformComponentConfig, boolean z11) {
        super(1);
        this.this$0 = googlePayManagerImpl;
        this.$context = context;
        this.$config = androidPlatformComponentConfig;
        this.$panOnlyEnabled = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends Boolean> invoke(Boolean isSupport) {
        GooglePayAvailabilityStorage googlePayAvailabilityStorage;
        GooglePayAvailabilityStorage googlePayAvailabilityStorage2;
        y isGooglePayReady;
        Intrinsics.checkNotNullParameter(isSupport, "isSupport");
        if (!isSupport.booleanValue()) {
            googlePayAvailabilityStorage = this.this$0.googlePayAvailabilityStorage;
            googlePayAvailabilityStorage.setGooglePaySupported(false);
            return y.f(Boolean.FALSE);
        }
        googlePayAvailabilityStorage2 = this.this$0.googlePayAvailabilityStorage;
        googlePayAvailabilityStorage2.setGooglePaySupported(true);
        isGooglePayReady = this.this$0.isGooglePayReady(this.$context, this.$config, this.$panOnlyEnabled);
        return isGooglePayReady;
    }
}
