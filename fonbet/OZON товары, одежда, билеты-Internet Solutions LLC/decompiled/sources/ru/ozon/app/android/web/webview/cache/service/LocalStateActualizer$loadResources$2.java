package ru.ozon.app.android.web.webview.cache.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Lkotlin/jvm/internal/EnhancedNullability;", "errorCount", "success", "", "invoke", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LocalStateActualizer$loadResources$2 extends AbstractC7737t implements Function2<Integer, Boolean, Integer> {
    public static final LocalStateActualizer$loadResources$2 INSTANCE = new LocalStateActualizer$loadResources$2();

    LocalStateActualizer$loadResources$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer errorCount, Boolean success) {
        Intrinsics.checkNotNullParameter(errorCount, "errorCount");
        Intrinsics.checkNotNullParameter(success, "success");
        return success.booleanValue() ? errorCount : Integer.valueOf(errorCount.intValue() + 1);
    }
}
