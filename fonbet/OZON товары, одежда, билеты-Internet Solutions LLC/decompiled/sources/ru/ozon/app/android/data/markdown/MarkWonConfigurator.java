package ru.ozon.app.android.data.markdown;

import GZ.g;
import Ub.a;
import Ub.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/data/markdown/MarkWonConfigurator;", "LUb/a;", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "LUb/f$a;", "builder", "", "configureConfiguration", "(LUb/f$a;)V", "LGZ/g;", "markdown_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarkWonConfigurator extends a {

    @NotNull
    private final g router;

    public MarkWonConfigurator(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    @Override // Ub.a, Ub.h
    public void configureConfiguration(@NotNull f.a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.j(new MarkWonLinkResolver(this.router));
    }
}
