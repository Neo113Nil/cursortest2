package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f87029b = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof ReportAbuseFormDTO);
    }
}
