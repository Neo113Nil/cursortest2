package ru.ozon.app.android.analytics.performance;

import Eg0.a;
import Gg0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/performance/WidgetsNamesProvider;", "LEg0/a;", "LGg0/c;", "mediaNamesHolder", "<init>", "(LGg0/c;)V", "", "requestUuid", "", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", "LGg0/c;", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetsNamesProvider implements a {

    @NotNull
    private final String key;

    @NotNull
    private final c mediaNamesHolder;

    public WidgetsNamesProvider(@NotNull c mediaNamesHolder) {
        Intrinsics.checkNotNullParameter(mediaNamesHolder, "mediaNamesHolder");
        this.mediaNamesHolder = mediaNamesHolder;
        this.key = "imageOwner";
    }

    @Override // Eg0.a
    @NotNull
    public String getKey() {
        return this.key;
    }

    @Override // Eg0.a
    public Object getValue(@NotNull String requestUuid) {
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        return this.mediaNamesHolder.b(requestUuid);
    }
}
