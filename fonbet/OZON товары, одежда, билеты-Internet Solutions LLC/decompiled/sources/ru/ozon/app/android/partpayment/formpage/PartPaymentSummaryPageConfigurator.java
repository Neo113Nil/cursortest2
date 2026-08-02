package ru.ozon.app.android.partpayment.formpage;

import Hs.b;
import Hs.c;
import Pc.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.n;
import androidx.lifecycle.J;
import i3.C7003a;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModelImpl;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/PartPaymentSummaryPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "LPc/a;", "ru/ozon/app/android/partpayment/formpage/PartPaymentSummaryPageConfigurator$receiver$1", "receiver", "Lru/ozon/app/android/partpayment/formpage/PartPaymentSummaryPageConfigurator$receiver$1;", "Lnc/b;", "timeoutSubscription", "Lnc/b;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PartPaymentSummaryPageConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<FormPageViewModelImpl> pViewModel;

    @NotNull
    private final PartPaymentSummaryPageConfigurator$receiver$1 receiver;
    private InterfaceC8487b timeoutSubscription;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.partpayment.formpage.PartPaymentSummaryPageConfigurator$receiver$1] */
    public PartPaymentSummaryPageConfigurator(@NotNull a<FormPageViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.receiver = new BroadcastReceiver() { // from class: ru.ozon.app.android.partpayment.formpage.PartPaymentSummaryPageConfigurator$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                InterfaceC7851b controller;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                int intExtra = intent.getIntExtra("ru.ozon.app.android.push.PART_PAYMENT_NOTIFICATION_EXTRAS", -1);
                if (intExtra != -1) {
                    n.e(context).b(intExtra);
                }
                ConfiguratorReferences references = PartPaymentSummaryPageConfigurator.this.getReferences();
                if (references == null || (controller = references.getController()) == null) {
                    return;
                }
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
            }
        };
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context requireContext = getContainer().j().requireContext();
        n.e(requireContext).b(3516);
        C7003a.b(requireContext).c(this.receiver, new IntentFilter("ru.ozon.app.android.push.PART_PAYMENT_INTENT_ACTION"));
        InterfaceC8487b interfaceC8487b = this.timeoutSubscription;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.timeoutSubscription = p.interval(30L, 30L, TimeUnit.SECONDS).observeOn(C8125a.a()).subscribe(new b(new PartPaymentSummaryPageConfigurator$onCreate$2(this), 3), new c(new PartPaymentSummaryPageConfigurator$onCreate$3(Lm0.a.f17149a), 3));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C7003a.b(getContainer().j().requireContext()).e(this.receiver);
        InterfaceC8487b interfaceC8487b = this.timeoutSubscription;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
