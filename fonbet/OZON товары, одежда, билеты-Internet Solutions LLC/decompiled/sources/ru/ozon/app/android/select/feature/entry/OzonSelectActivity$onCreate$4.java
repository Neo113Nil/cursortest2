package ru.ozon.app.android.select.feature.entry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.utils.UriExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OzonSelectActivity$onCreate$4 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ OzonSelectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonSelectActivity$onCreate$4(OzonSelectActivity ozonSelectActivity) {
        super(1);
        this.this$0 = ozonSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        boolean openUrl;
        Intrinsics.checkNotNullParameter(it, "it");
        openUrl = this.this$0.openUrl(UriExtKt.replaceUriForSelect(it));
        return Boolean.valueOf(openUrl);
    }
}
