package ru.ozon.app.android.initializers.logger;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nf.C8590c;
import ru.ozon.app.android.storage.logging.LoggingLevel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storage/logging/LoggingLevel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storage/logging/LoggingLevel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HttpLoggingActionIntializer$init$1 extends AbstractC7737t implements Function1<LoggingLevel, Unit> {
    final /* synthetic */ HttpLoggingActionIntializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpLoggingActionIntializer$init$1(HttpLoggingActionIntializer httpLoggingActionIntializer) {
        super(1);
        this.this$0 = httpLoggingActionIntializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LoggingLevel loggingLevel) {
        invoke2(loggingLevel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LoggingLevel loggingLevel) {
        C8590c c8590c;
        C8590c.a map;
        c8590c = this.this$0.httpLoggingInterceptor;
        HttpLoggingActionIntializer httpLoggingActionIntializer = this.this$0;
        Intrinsics.f(loggingLevel);
        map = httpLoggingActionIntializer.map(loggingLevel);
        c8590c.a(map);
    }
}
