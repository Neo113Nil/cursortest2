package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.logging.LoggingLevel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "selectedIndex", "", "<unused var>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class HttpLoggingGroupProvider$provide$2 extends AbstractC7737t implements Function2<Integer, Context, Unit> {
    final /* synthetic */ LoggingLevel[] $values;
    final /* synthetic */ HttpLoggingGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpLoggingGroupProvider$provide$2(HttpLoggingGroupProvider httpLoggingGroupProvider, LoggingLevel[] loggingLevelArr) {
        super(2);
        this.this$0 = httpLoggingGroupProvider;
        this.$values = loggingLevelArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Context context) {
        invoke(num.intValue(), context);
        return Unit.f71690a;
    }

    public final void invoke(int i11, Context context) {
        HttpLoggingLevelStorage httpLoggingLevelStorage;
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        httpLoggingLevelStorage = this.this$0.httpLoggingLevelStorage;
        httpLoggingLevelStorage.setLevel(this.$values[i11]);
    }
}
