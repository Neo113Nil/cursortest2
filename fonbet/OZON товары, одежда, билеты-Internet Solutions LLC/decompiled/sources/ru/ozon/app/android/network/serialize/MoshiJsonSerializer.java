package ru.ozon.app.android.network.serialize;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/serialize/MoshiJsonSerializer;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "T", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Class;", "clazz", "", "toJson", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;", "Ljava/lang/reflect/Type;", "type", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoshiJsonSerializer implements JsonSerializer {

    @NotNull
    private final Moshi moshi;

    public MoshiJsonSerializer(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // ru.ozon.app.android.network.serialize.JsonSerializer
    @NotNull
    public <T> String toJson(T value, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.moshi.c(clazz).toJson(value);
    }

    @Override // ru.ozon.app.android.network.serialize.JsonSerializer
    @NotNull
    public <T> String toJson(T value, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.moshi.d(type).toJson(value);
    }
}
