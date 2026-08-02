package ru.ozon.app.android.video.manager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.download.DownloadListener;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/video/download/DownloadListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1$onDownloadChanged$1 extends AbstractC7737t implements Function1<DownloadListener, Unit> {
    public static final ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1$onDownloadChanged$1 INSTANCE = new ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1$onDownloadChanged$1();

    ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1$onDownloadChanged$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DownloadListener downloadListener) {
        invoke2(downloadListener);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DownloadListener notifyAndRemoveListeners) {
        Intrinsics.checkNotNullParameter(notifyAndRemoveListeners, "$this$notifyAndRemoveListeners");
        notifyAndRemoveListeners.onSuccess();
    }
}
