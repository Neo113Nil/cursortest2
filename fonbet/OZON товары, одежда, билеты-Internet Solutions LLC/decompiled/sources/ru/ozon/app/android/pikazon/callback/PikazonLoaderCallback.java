package ru.ozon.app.android.pikazon.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "ResourceType", "", "onLoadSuccessful", "", "resource", "(Ljava/lang/Object;)V", "onLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PikazonLoaderCallback<ResourceType> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static <ResourceType> void onLoadFailed(@NotNull PikazonLoaderCallback<ResourceType> pikazonLoaderCallback, Exception exc) {
        }

        public static <ResourceType> void onLoadSuccessful(@NotNull PikazonLoaderCallback<ResourceType> pikazonLoaderCallback, ResourceType resourcetype) {
        }
    }

    void onLoadFailed(Exception e11);

    void onLoadSuccessful(ResourceType resource);
}
