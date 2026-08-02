package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.environment.EnvironmentService;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class EnvironmentGroupProvider$provide$1 extends AbstractC7737t implements Function2<Boolean, Context, Unit> {
    final /* synthetic */ EnvironmentGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnvironmentGroupProvider$provide$1(EnvironmentGroupProvider environmentGroupProvider) {
        super(2);
        this.this$0 = environmentGroupProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Context context) {
        invoke(bool.booleanValue(), context);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, Context context) {
        EnvironmentService environmentService;
        DebugToolsService debugToolsService;
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        environmentService = this.this$0.environmentService;
        environmentService.toggleEnvironment();
        debugToolsService = this.this$0.debugToolsService;
        debugToolsService.setAbVariant(null);
        debugToolsService.setMeshValue(null);
    }
}
