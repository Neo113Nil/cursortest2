package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private a f91175a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b f91176b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private c f91177c;

    public b(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f91175a = builder;
        Context context = builder.h().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b flashbarContainerView = new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b(context);
        this.f91176b = flashbarContainerView;
        Intrinsics.checkNotNullParameter(this, "flashbar");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        Context context2 = builder.h().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        c cVar = new c(context2);
        this.f91177c = cVar;
        flashbarContainerView.g(cVar);
        Intrinsics.checkNotNullParameter(flashbarContainerView, "flashbarContainerView");
        flashbarContainerView.o(builder.c());
        flashbarContainerView.i(builder.d());
        builder.getClass();
        cVar.d(null);
        cVar.c(builder.g());
        cVar.b(builder.e(), null, builder.f());
        flashbarContainerView.addView(cVar);
    }

    public static void d(b bVar, OzonSpannableString ozonSpannableString, Integer num, String str, Long l11) {
        c cVar = bVar.f91177c;
        cVar.d(null);
        cVar.c(ozonSpannableString);
        cVar.b(num, null, str);
        bVar.f91176b.o(l11 != null ? l11.longValue() : 3000L);
    }

    public final void a(@NotNull ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f91176b.h(event);
    }

    public final boolean b() {
        return this.f91176b.k();
    }

    public final boolean c() {
        return this.f91176b.l();
    }

    public final void e() {
        this.f91176b.p(this.f91175a.h());
    }
}
