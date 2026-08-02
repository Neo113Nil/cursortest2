package ru.ozon.app.android.push.providers;

import Yg0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/push/providers/TeensModeProviderImpl;", "LYg0/g;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "<init>", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "", "isTeensModeEnabled", "()Z", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TeensModeProviderImpl implements g {

    @NotNull
    private final TeensModeStorage teensModeStorage;

    public TeensModeProviderImpl(@NotNull TeensModeStorage teensModeStorage) {
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        this.teensModeStorage = teensModeStorage;
    }

    @Override // Yg0.g
    public boolean isTeensModeEnabled() {
        return this.teensModeStorage.isTeensModeEnabled();
    }
}
