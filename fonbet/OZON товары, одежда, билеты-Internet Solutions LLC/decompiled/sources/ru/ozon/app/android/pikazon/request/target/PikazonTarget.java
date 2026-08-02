package ru.ozon.app.android.pikazon.request.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.request.PikazonRequest;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J)\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "Resource", "", "Lru/ozon/app/android/pikazon/request/PikazonRequest;", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "", "load", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "clear", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;)V", "Lru/ozon/app/android/pikazon/request/target/ContextTarget;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PikazonTarget<Resource> {
    void clear(@NotNull PikazonRequest<Resource> pikazonRequest);

    void load(@NotNull PikazonRequest<Resource> pikazonRequest, PikazonLoaderCallback<Resource> pikazonLoaderCallback);
}
