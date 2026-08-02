package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonMapper;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonMapper;", "T", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateMainButtonComponent$mapper$2<T> extends AbstractC7737t implements Function0<RateMainButtonMapper<T>> {
    public static final RateMainButtonComponent$mapper$2 INSTANCE = new RateMainButtonComponent$mapper$2();

    RateMainButtonComponent$mapper$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final RateMainButtonMapper<T> invoke() {
        return new RateMainButtonMapper<>();
    }
}
