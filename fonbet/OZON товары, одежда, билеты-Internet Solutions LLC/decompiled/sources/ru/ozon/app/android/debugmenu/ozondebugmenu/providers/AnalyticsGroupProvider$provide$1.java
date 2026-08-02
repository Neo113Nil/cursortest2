package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import GZ.g;
import LZ.b;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pZ.C8880a;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationActivity;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AnalyticsGroupProvider$provide$1 extends AbstractC7737t implements Function1<Context, Unit> {
    final /* synthetic */ AnalyticsGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsGroupProvider$provide$1(AnalyticsGroupProvider analyticsGroupProvider) {
        super(1);
        this.this$0 = analyticsGroupProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Context context) {
        invoke2(context);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Context it) {
        g gVar;
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(it, (Class<?>) DataLayerRepresentationActivity.class);
        gVar = this.this$0.ozonRouter;
        gVar.c(new b(new C8880a(intent, null, null)), null);
    }
}
