package ru.ozon.app.android.data.markdown;

import GZ.g;
import Ub.b;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/data/markdown/MarkWonLinkResolver;", "LUb/b;", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "Landroid/view/View;", "view", "", "link", "", "resolve", "(Landroid/view/View;Ljava/lang/String;)V", "LGZ/g;", "markdown_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarkWonLinkResolver implements b {

    @NotNull
    private final g router;

    public MarkWonLinkResolver(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    @Override // Ub.b
    public void resolve(@NotNull View view, @NotNull String link) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(link, "link");
        if (!h.t(link, "ozon://", false)) {
            link = LinkGenerator.webView$default(LinkGenerator.INSTANCE, link, null, false, false, 14, null).toString();
            Intrinsics.f(link);
        }
        g.a.a(this.router, link, null, null, 6);
    }
}
