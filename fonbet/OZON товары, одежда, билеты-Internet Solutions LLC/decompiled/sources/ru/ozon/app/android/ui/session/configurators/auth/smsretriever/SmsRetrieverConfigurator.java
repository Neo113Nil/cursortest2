package ru.ozon.app.android.ui.session.configurators.auth.smsretriever;

import Ak.b;
import Hs.d;
import Lm0.a;
import android.app.Activity;
import android.content.IntentFilter;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.csma.flags.SmsAutoSubstitutionOnOtpFlag;
import ru.ozon.app.android.domain.session.utils.auth.GooglePlayServicesUtils;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.ui.session.bcreceiver.SmsRetrieverBroadcastReciever;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ui/session/configurators/auth/smsretriever/SmsRetrieverConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/ui/session/bcreceiver/SmsRetrieverBroadcastReciever;", "smsBroadcastReceiver", "Lru/ozon/app/android/ui/session/bcreceiver/SmsRetrieverBroadcastReciever;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SmsRetrieverConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final IntentFilter intentFilter;
    private SmsRetrieverBroadcastReciever smsBroadcastReceiver;

    public SmsRetrieverConfigurator(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.intentFilter = new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2$lambda$1(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a.f17149a.d(it);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || !this.featureChecker.isEnabled(SmsAutoSubstitutionOnOtpFlag.INSTANCE)) {
            return;
        }
        GooglePlayServicesUtils googlePlayServicesUtils = GooglePlayServicesUtils.INSTANCE;
        if (!googlePlayServicesUtils.isGoogleServicesEnabled(a11) || googlePlayServicesUtils.deviceVersionServicesLowerThanPassed(a11, "19.9")) {
            return;
        }
        Task<Void> startSmsRetriever = SmsRetriever.getClient((Activity) a11).startSmsRetriever();
        Intrinsics.checkNotNullExpressionValue(startSmsRetriever, "startSmsRetriever(...)");
        startSmsRetriever.addOnSuccessListener(new d(new SmsRetrieverConfigurator$onCreate$1$1(this), 7));
        startSmsRetriever.addOnFailureListener(new b());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        SmsRetrieverBroadcastReciever smsRetrieverBroadcastReciever;
        Intrinsics.checkNotNullParameter(owner, "owner");
        GooglePlayServicesUtils googlePlayServicesUtils = GooglePlayServicesUtils.INSTANCE;
        r a11 = getContainer().a();
        if (a11 == null || !googlePlayServicesUtils.isGoogleServicesEnabled(a11) || (smsRetrieverBroadcastReciever = this.smsBroadcastReceiver) == null) {
            return;
        }
        smsRetrieverBroadcastReciever.setSmsConsumer(null);
        r a12 = getContainer().a();
        if (a12 != null) {
            a12.unregisterReceiver(smsRetrieverBroadcastReciever);
        }
    }
}
