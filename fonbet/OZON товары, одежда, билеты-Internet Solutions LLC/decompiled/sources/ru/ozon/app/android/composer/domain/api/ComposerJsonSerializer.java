package ru.ozon.app.android.composer.domain.api;

import U00.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/domain/api/ComposerJsonSerializer;", "LU00/b;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "<init>", "(Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "T", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/reflect/Type;", "type", "", "toJson", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerJsonSerializer implements b {

    @NotNull
    private final JsonSerializer jsonSerializer;

    public ComposerJsonSerializer(@NotNull JsonSerializer jsonSerializer) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.jsonSerializer = jsonSerializer;
    }

    @Override // U00.b
    @NotNull
    public <T> String toJson(T value, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.jsonSerializer.toJson((JsonSerializer) value, type);
    }
}
