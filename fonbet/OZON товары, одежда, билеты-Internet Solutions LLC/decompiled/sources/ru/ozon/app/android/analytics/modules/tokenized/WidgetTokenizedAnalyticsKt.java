package ru.ozon.app.android.analytics.modules.tokenized;

import W10.c;
import WZ.l;
import WZ.s;
import WZ.t;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LWZ/l;", "LW10/c;", "trackingData", "", "processWidgetClick", "(LWZ/l;LW10/c;)V", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetTokenizedAnalyticsKt {
    public static final void processWidgetClick(@NotNull l lVar, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        String type = ActionType.CLICK.INSTANCE.getType();
        Parcelable.Creator<t> creator = t.CREATOR;
        s.a aVar = new s.a();
        aVar.a(type);
        String d11 = trackingData.d();
        if (d11 != null) {
            aVar.l(d11);
        }
        Unit unit = Unit.f71690a;
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, t.a.a(type, aVar.b()), null, 2, null);
    }
}
