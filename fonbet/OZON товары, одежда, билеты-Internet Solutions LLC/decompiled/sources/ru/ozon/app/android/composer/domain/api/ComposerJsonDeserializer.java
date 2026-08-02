package ru.ozon.app.android.composer.domain.api;

import U00.a;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/domain/api/ComposerJsonDeserializer;", "LU00/a;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "T", "Lsf/i;", "buffer", "Ljava/lang/Class;", "clazz", "fromBuffer", "(Lsf/i;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "paramType", "(Lsf/i;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lcom/squareup/moshi/Moshi;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerJsonDeserializer implements a {

    @NotNull
    private final Moshi moshi;

    public ComposerJsonDeserializer(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // U00.a
    public <T> T fromBuffer(@NotNull InterfaceC9683i buffer, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T fromJson = this.moshi.c(clazz).fromJson(buffer);
        Intrinsics.f(fromJson);
        return fromJson;
    }

    @Override // U00.a
    public <T> T fromBuffer(@NotNull InterfaceC9683i buffer, @NotNull Type paramType) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        T fromJson = this.moshi.d(paramType).fromJson(buffer);
        Intrinsics.f(fromJson);
        return fromJson;
    }
}
