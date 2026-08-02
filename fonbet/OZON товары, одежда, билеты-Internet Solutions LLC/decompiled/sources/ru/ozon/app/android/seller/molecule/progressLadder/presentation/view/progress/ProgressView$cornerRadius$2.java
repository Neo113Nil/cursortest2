package ru.ozon.app.android.seller.molecule.progressLadder.presentation.view.progress;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProgressView$cornerRadius$2 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ ProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressView$cornerRadius$2(ProgressView progressView) {
        super(0);
        this.this$0 = progressView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Context context;
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        context = this.this$0.context;
        return Float.valueOf(appTypeResolver.isSelect(context) ? ProgressView.selectCornerRadius : ProgressView.bxCornerRadius);
    }
}
