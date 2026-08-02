package ru.ozon.app.android.pdp.offline.widgetfactory.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ru/ozon/app/android/pdp/offline/widgetfactory/core/WidgetFactory$Base", "T", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Ljava/lang/Class;", "clazz", "<init>", "(Lcom/squareup/moshi/Moshi;Ljava/lang/Class;)V", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class WidgetFactory$Base<T> {

    @NotNull
    private final JsonAdapter<T> adapter;

    public WidgetFactory$Base(@NotNull Moshi moshi, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.adapter = moshi.c(clazz);
    }

    @NotNull
    protected final JsonAdapter<T> getAdapter() {
        return this.adapter;
    }
}
