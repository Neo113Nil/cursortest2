package ru.ozon.app.android.gallery;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequestsHolder;", "", "<init>", "()V", "requestsMap", "", "", "Lru/ozon/app/android/gallery/GalleryRequest;", "putRequest", "request", "takeRequest", "id", "removeRequest", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GalleryRequestsHolder {

    @NotNull
    public static final GalleryRequestsHolder INSTANCE = new GalleryRequestsHolder();

    @NotNull
    private static final Map<Long, GalleryRequest> requestsMap = new LinkedHashMap();

    private GalleryRequestsHolder() {
    }

    public final long putRequest(@NotNull GalleryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        requestsMap.put(Long.valueOf(elapsedRealtime), request);
        return elapsedRealtime;
    }

    public final GalleryRequest removeRequest(long id2) {
        return requestsMap.remove(Long.valueOf(id2));
    }

    public final GalleryRequest takeRequest(long id2) {
        return requestsMap.get(Long.valueOf(id2));
    }
}
