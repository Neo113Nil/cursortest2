package ru.ozon.app.android.web.webview.cache.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke-SCBLOKU", "(Ljava/lang/Integer;)Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LocalStateActualizer$loadResources$3 extends AbstractC7737t implements Function1<Integer, LocalStateActualizer.ActualizingResult> {
    public static final LocalStateActualizer$loadResources$3 INSTANCE = new LocalStateActualizer$loadResources$3();

    LocalStateActualizer$loadResources$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-SCBLOKU, reason: not valid java name and merged with bridge method [inline-methods] */
    public final LocalStateActualizer.ActualizingResult invoke(Integer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return LocalStateActualizer.ActualizingResult.m1578boximpl(LocalStateActualizer.ActualizingResult.m1579constructorimpl(it.intValue()));
    }
}
