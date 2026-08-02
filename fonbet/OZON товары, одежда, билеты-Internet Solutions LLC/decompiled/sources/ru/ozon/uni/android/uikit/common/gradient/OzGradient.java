package ru.ozon.uni.android.uikit.common.gradient;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "getOrientation", "()Landroid/graphics/drawable/GradientDrawable$Orientation;", "", "getColorResources", "()[I", "Landroid/content/Context;", "context", "getColors", "(Landroid/content/Context;)[I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent0;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent1;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent2;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent3;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent4;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientBlackOverlay;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradientBlackOverlay2;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OzGradient {

    @NotNull
    private final String name;

    public /* synthetic */ OzGradient(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    protected abstract int[] getColorResources();

    public final int[] getColors(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context resolveTheme$uni_release = StyleParser.INSTANCE.resolveTheme$uni_release(context);
        int[] colorResources = getColorResources();
        ArrayList arrayList = new ArrayList(colorResources.length);
        for (int i11 : colorResources) {
            try {
                arrayList.add(Integer.valueOf(a.getColor(context, ThemeExtKt.themeColorRes(resolveTheme$uni_release, i11))));
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return C7714v.T0(arrayList);
    }

    @NotNull
    public abstract GradientDrawable.Orientation getOrientation();

    private OzGradient(String str) {
        this.name = str;
    }
}
