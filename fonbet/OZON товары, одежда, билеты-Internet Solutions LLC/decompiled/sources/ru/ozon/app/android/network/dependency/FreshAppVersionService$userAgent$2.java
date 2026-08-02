package ru.ozon.app.android.network.dependency;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshAppVersionService$userAgent$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ FreshAppVersionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshAppVersionService$userAgent$2(FreshAppVersionService freshAppVersionService) {
        super(0);
        this.this$0 = freshAppVersionService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.this$0.getAppName() + "_prod";
    }
}
