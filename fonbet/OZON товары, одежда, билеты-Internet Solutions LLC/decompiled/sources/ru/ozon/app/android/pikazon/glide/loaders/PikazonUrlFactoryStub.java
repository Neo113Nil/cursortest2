package ru.ozon.app.android.pikazon.glide.loaders;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactoryStub;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;", "<init>", "()V", "create", "", ImagesContract.URL, "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonUrlFactoryStub implements PikazonUrlFactory {
    @Override // ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory
    @NotNull
    public String create(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return url;
    }
}
