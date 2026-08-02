package ru.ozon.app.android.video.player.performance;

import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "", "<init>", "()V", "cache", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "", "findWidgetName", "view", "put", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "get", "getWidgetNameTagValue", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoWidgetNamesHolder {

    @NotNull
    private final WeakHashMap<View, String> cache = new WeakHashMap<>();

    private final String get(View key) {
        return this.cache.get(key);
    }

    private final String getWidgetNameTagValue(View view) {
        Object tag = view.getTag(R.id.tag_key_widget_name);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    private final void put(View key, String value) {
        this.cache.put(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final String findWidgetName(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String str = get(view);
        if (str != null) {
            return str;
        }
        String widgetNameTagValue = getWidgetNameTagValue(view);
        if (widgetNameTagValue != null) {
            put(view, widgetNameTagValue);
            return widgetNameTagValue;
        }
        View view2 = view.getParent();
        while (true) {
            if (view2 == 0) {
                return null;
            }
            View view3 = view2 instanceof View ? view2 : null;
            String widgetNameTagValue2 = view3 != null ? getWidgetNameTagValue(view3) : null;
            if (widgetNameTagValue2 != null) {
                put(view, widgetNameTagValue2);
                return widgetNameTagValue2;
            }
            view2 = view2.getParent();
        }
    }
}
