package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.config.b<ReportAbuseFormDTO>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f87028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(JsonParser jsonParser) {
        super(1);
        this.f87028b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.config.b<ReportAbuseFormDTO> bVar) {
        ru.ozon.composer.compose.widget.config.b<ReportAbuseFormDTO> config = bVar;
        Intrinsics.checkNotNullParameter(config, "$this$config");
        ru.ozon.composer.compose.widget.config.b.j(config, null, new b(this.f87028b), 1, null);
        return Unit.f71690a;
    }
}
