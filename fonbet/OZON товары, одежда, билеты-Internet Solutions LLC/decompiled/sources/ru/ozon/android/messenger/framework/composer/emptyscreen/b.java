package ru.ozon.android.messenger.framework.composer.emptyscreen;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.c;
import z00.d;
import z00.e;
import z00.f;

/* loaded from: classes10.dex */
public class b implements ru.ozon.android.messenger.framework.composer.emptyscreen.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.a f86694a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f86695b;

    static final class a extends AbstractC7737t implements Function1<e, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f86697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.f86697c = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(e eVar) {
            e createOfflinePage = eVar;
            Intrinsics.checkNotNullParameter(createOfflinePage, "$this$createOfflinePage");
            b bVar = b.this;
            bVar.f86694a.a(createOfflinePage, bVar.b(this.f86697c));
            return Unit.f71690a;
        }
    }

    public b(@NotNull ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.a fastAnswersCustomErrorWidgetFactory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fastAnswersCustomErrorWidgetFactory, "fastAnswersCustomErrorWidgetFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86694a = fastAnswersCustomErrorWidgetFactory;
        this.f86695b = context;
    }

    @NotNull
    protected final ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.c b(@NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        if (issue instanceof f.c) {
            return c.d.f86707a;
        }
        if (!(issue instanceof f.a)) {
            return issue instanceof f.b ? c.b.f86705a : c.C1547c.f86706a;
        }
        String packageName = this.f86695b.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return new c.a(packageName);
    }

    @Override // E00.a
    @NotNull
    public final z00.c createErrorState(@NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        return d.b(new a(issue));
    }
}
