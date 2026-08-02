package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import Ye0.a;
import android.content.Context;
import io.sentry.K1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DebugFeaturesGroupProvider$provide$12 extends AbstractC7737t implements Function1<Context, Unit> {
    public static final DebugFeaturesGroupProvider$provide$12 INSTANCE = new DebugFeaturesGroupProvider$provide$12();

    DebugFeaturesGroupProvider$provide$12() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Context context) {
        invoke2(context);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            new a();
            throw null;
        } catch (Exception e11) {
            K1.d().u(e11);
        }
    }
}
