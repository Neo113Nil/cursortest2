package ru.ozon.app.android.pdp.widgets.refreshPdpProcessor.presentation;

import A00.a;
import M10.d;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/refreshPdpProcessor/presentation/RefreshPdpProcessorViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/refreshPdpProcessor/presentation/RefreshPdpProcessorVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/refreshPdpProcessor/presentation/RefreshPdpProcessorVO;)V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RefreshPdpProcessorViewHolder extends AbstractC6065b<RefreshPdpProcessorVO> {

    @NotNull
    private final i container;
    private final View metricView;

    public RefreshPdpProcessorViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RefreshPdpProcessorVO item) {
        View view;
        RecyclerView composerRecyclerViewOrNull;
        String tag;
        Uri parse;
        List<String> pathSegments;
        ComponentCallbacksC5392m parentFragment;
        Intrinsics.checkNotNullParameter(item, "item");
        ComponentCallbacksC5392m b11 = this.container.K().b();
        ComponentCallbacksC5392m targetFragment = (b11 == null || (parentFragment = b11.getParentFragment()) == null) ? null : parentFragment.getTargetFragment();
        if (targetFragment == null || (tag = targetFragment.getTag()) == null || (parse = Uri.parse(tag)) == null || (pathSegments = parse.getPathSegments()) == null || !pathSegments.contains("review")) {
            a.C.d a11 = (targetFragment == null || (view = targetFragment.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) ? null : d.a(composerRecyclerViewOrNull);
            e V11 = this.container.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            ComposerExtKt.sendRefreshToTargetFragment$default(((ComposerReferences) V11).getContainer(), item.getNewPdpLink(), new h.b(a11, null, 2), null, null, 12, null);
        }
    }
}
