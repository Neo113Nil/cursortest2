package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import j20.C7244b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<C7244b, ReportAbuseFormDTO> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f87027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(JsonParser jsonParser) {
        super(1);
        this.f87027b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReportAbuseFormDTO invoke(C7244b c7244b) {
        C7244b state = c7244b;
        Intrinsics.checkNotNullParameter(state, "state");
        return (ReportAbuseFormDTO) this.f87027b.fromJson(state.b(), ReportAbuseFormDTO.class);
    }
}
