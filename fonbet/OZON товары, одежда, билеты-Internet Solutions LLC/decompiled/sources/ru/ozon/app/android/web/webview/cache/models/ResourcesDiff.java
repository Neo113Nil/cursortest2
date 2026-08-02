package ru.ozon.app.android.web.webview.cache.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/web/webview/cache/models/ResourcesDiff;", "", "newResourcesUrls", "", "", "outDatedResources", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getNewResourcesUrls", "()Ljava/util/List;", "getOutDatedResources", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourcesDiff {

    @NotNull
    private final List<String> newResourcesUrls;

    @NotNull
    private final List<String> outDatedResources;

    public ResourcesDiff(@NotNull List<String> newResourcesUrls, @NotNull List<String> outDatedResources) {
        Intrinsics.checkNotNullParameter(newResourcesUrls, "newResourcesUrls");
        Intrinsics.checkNotNullParameter(outDatedResources, "outDatedResources");
        this.newResourcesUrls = newResourcesUrls;
        this.outDatedResources = outDatedResources;
    }

    @NotNull
    public final List<String> getNewResourcesUrls() {
        return this.newResourcesUrls;
    }

    @NotNull
    public final List<String> getOutDatedResources() {
        return this.outDatedResources;
    }
}
