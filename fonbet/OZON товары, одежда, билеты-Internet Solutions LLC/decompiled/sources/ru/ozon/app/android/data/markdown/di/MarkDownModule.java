package ru.ozon.app.android.data.markdown.di;

import GZ.g;
import Ub.d;
import Vb.p;
import Yb.a;
import android.content.Context;
import bc.C5639o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.data.markdown.MarkWonConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/data/markdown/di/MarkDownModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LGZ/g;", "router", "LUb/d;", "provideMarkWon", "(Landroid/content/Context;LGZ/g;)LUb/d;", "markdown_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarkDownModule {

    @NotNull
    public static final MarkDownModule INSTANCE = new MarkDownModule();

    private MarkDownModule() {
    }

    @NotNull
    public final d provideMarkWon(@NotNull Context context, @NotNull g router) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(router, "router");
        d.a a11 = d.a(context);
        a11.a(p.c());
        a11.a(new a());
        a11.a(C5639o.a());
        a11.a(new MarkWonConfigurator(router));
        d build = a11.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
