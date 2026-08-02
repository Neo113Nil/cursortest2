package ru.ozon.app.android.regulardraw.ui;

import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "drawableResourceId", "(Ljava/lang/String;LS0/k;I)I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResourcesKt {
    public static final int drawableResourceId(@NotNull String name, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }
}
