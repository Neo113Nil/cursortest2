package ru.ozon.app.android.network.logs;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.WebViewErrorBlackListKeysList;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WebViewErrorLogger$keys$2 extends AbstractC7737t implements Function0<HashSet<String>> {
    final /* synthetic */ WebViewErrorLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewErrorLogger$keys$2(WebViewErrorLogger webViewErrorLogger) {
        super(0);
        this.this$0 = webViewErrorLogger;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        FeatureService featureService;
        featureService = this.this$0.featureService;
        return C7714v.S0(h.m(featureService.getStringKey(WebViewErrorBlackListKeysList.INSTANCE), new String[]{","}, 0, 6));
    }
}
