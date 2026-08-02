package ru.ozon.app.android.whitelist.common.utils;

import android.app.Application;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\t2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;", "", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "arrayCache", "", "", "", "lock", "getStringArray", "arrayName", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringArraysUtils {

    @NotNull
    private final Application application;

    @NotNull
    private final Map<String, List<String>> arrayCache;

    @NotNull
    private final Object lock;

    public StringArraysUtils(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.arrayCache = new LinkedHashMap();
        this.lock = new Object();
    }

    @NotNull
    public final List<String> getStringArray(@NotNull String arrayName) {
        List<String> list;
        Intrinsics.checkNotNullParameter(arrayName, "arrayName");
        synchronized (this.lock) {
            try {
                Map<String, List<String>> map = this.arrayCache;
                List<String> list2 = map.get(arrayName);
                if (list2 == null) {
                    list2 = StringArraysUtilsKt.getStringArrayByName(this.application, arrayName);
                    if (list2 == null) {
                        list2 = K.f71697a;
                    }
                    map.put(arrayName, list2);
                }
                list = list2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }
}
