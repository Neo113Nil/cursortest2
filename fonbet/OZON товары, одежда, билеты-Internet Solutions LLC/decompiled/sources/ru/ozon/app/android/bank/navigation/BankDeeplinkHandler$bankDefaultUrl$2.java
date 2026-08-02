package ru.ozon.app.android.bank.navigation;

import O30.b;
import W30.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BankDeeplinkHandler$bankDefaultUrl$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ BankDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDeeplinkHandler$bankDefaultUrl$2(BankDeeplinkHandler bankDeeplinkHandler) {
        super(0);
        this.this$0 = bankDeeplinkHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ExternalFintechSettings externalFintechSettings;
        Context context;
        externalFintechSettings = this.this$0.settingsBank;
        context = this.this$0.context;
        return externalFintechSettings.getBankUrl(a.a(context, b.FINANCE));
    }
}
