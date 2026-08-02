package ru.ozon.app.android.ui.session.configurators.auth.smsretriever;

import android.content.IntentFilter;
import androidx.core.content.a;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.domain.session.updatekey.OnSmsReceived;
import ru.ozon.app.android.ui.session.bcreceiver.SmsRetrieverBroadcastReciever;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Void;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SmsRetrieverConfigurator$onCreate$1$1 extends AbstractC7737t implements Function1<Void, Unit> {
    final /* synthetic */ SmsRetrieverConfigurator this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "smsMessage", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ui.session.configurators.auth.smsretriever.SmsRetrieverConfigurator$onCreate$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ SmsRetrieverConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SmsRetrieverConfigurator smsRetrieverConfigurator) {
            super(1);
            this.this$0 = smsRetrieverConfigurator;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String smsMessage) {
            InterfaceC7851b controller;
            Intrinsics.checkNotNullParameter(smsMessage, "smsMessage");
            ConfiguratorReferences references = this.this$0.getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            controller.update(new OnSmsReceived(smsMessage));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsRetrieverConfigurator$onCreate$1$1(SmsRetrieverConfigurator smsRetrieverConfigurator) {
        super(1);
        this.this$0 = smsRetrieverConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
        invoke2(r12);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Void r42) {
        SmsRetrieverBroadcastReciever smsRetrieverBroadcastReciever;
        SmsRetrieverBroadcastReciever smsRetrieverBroadcastReciever2;
        IntentFilter intentFilter;
        this.this$0.smsBroadcastReceiver = new SmsRetrieverBroadcastReciever();
        smsRetrieverBroadcastReciever = this.this$0.smsBroadcastReceiver;
        if (smsRetrieverBroadcastReciever != null) {
            smsRetrieverBroadcastReciever.setSmsConsumer(new AnonymousClass1(this.this$0));
        }
        r a11 = this.this$0.getContainer().a();
        if (a11 != null) {
            SmsRetrieverConfigurator smsRetrieverConfigurator = this.this$0;
            smsRetrieverBroadcastReciever2 = smsRetrieverConfigurator.smsBroadcastReceiver;
            intentFilter = smsRetrieverConfigurator.intentFilter;
            a.registerReceiver(a11, smsRetrieverBroadcastReciever2, intentFilter, 2);
        }
    }
}
