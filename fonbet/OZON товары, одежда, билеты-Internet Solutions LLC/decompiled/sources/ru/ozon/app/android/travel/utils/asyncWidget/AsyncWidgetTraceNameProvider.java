package ru.ozon.app.android.travel.utils.asyncWidget;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "", "provideTraceWidgetName", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AsyncWidgetTraceNameProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String provideTraceWidgetName(@NotNull AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider) {
            return null;
        }
    }

    String provideTraceWidgetName();
}
