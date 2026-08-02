package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<ReportAbuseFormDTO, l20.d, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> {
    @Override // kotlin.jvm.functions.Function2
    public final ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o invoke(ReportAbuseFormDTO reportAbuseFormDTO, l20.d dVar) {
        ReportAbuseFormDTO dto = reportAbuseFormDTO;
        l20.d info = dVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return a.a(dto, info);
    }
}
