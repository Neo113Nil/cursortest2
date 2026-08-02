package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0000H&R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "", "<init>", "()V", "json", "", "getJson", "()Ljava/lang/String;", "setJson", "(Ljava/lang/String;)V", "copyExcludingAnalytics", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePlaceholderWidgetObject {
    public static final int $stable = 0;

    @NotNull
    public abstract BasePlaceholderWidgetObject copyExcludingAnalytics();

    public abstract String getJson();

    public abstract void setJson(String str);
}
