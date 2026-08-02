package ru.ozon.app.android.search.widgets.suggestions.ui.prefetch;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "", "links", "", "onPrefetchLinksBound", "(Ljava/util/List;)V", "Landroidx/lifecycle/V;", "_linksForPrefetch", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "linksForPrefetch", "Landroidx/lifecycle/P;", "getLinksForPrefetch", "()Landroidx/lifecycle/P;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsPrefetchViewModel extends w0 {

    @NotNull
    private final V<List<String>> _linksForPrefetch;

    @NotNull
    private final P<List<String>> linksForPrefetch;

    public SuggestionsPrefetchViewModel() {
        V<List<String>> v11 = new V<>();
        this._linksForPrefetch = v11;
        this.linksForPrefetch = v11;
    }

    @NotNull
    public final P<List<String>> getLinksForPrefetch() {
        return this.linksForPrefetch;
    }

    public final void onPrefetchLinksBound(@NotNull List<String> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this._linksForPrefetch.setValue(links);
    }
}
