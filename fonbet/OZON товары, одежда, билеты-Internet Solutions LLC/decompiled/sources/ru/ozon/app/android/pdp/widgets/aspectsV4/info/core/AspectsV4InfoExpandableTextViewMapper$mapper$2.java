package ru.ozon.app.android.pdp.widgets.aspectsV4.info.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/core/AspectsV4InfoMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AspectsV4InfoExpandableTextViewMapper$mapper$2 extends AbstractC7737t implements Function0<AspectsV4InfoMapper> {
    final /* synthetic */ AspectsV4InfoExpandableTextViewMapper this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsV4.info.core.AspectsV4InfoExpandableTextViewMapper$mapper$2$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Map<String, ? extends Boolean>> {
        final /* synthetic */ AspectsV4InfoExpandableTextViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AspectsV4InfoExpandableTextViewMapper aspectsV4InfoExpandableTextViewMapper) {
            super(0);
            this.this$0 = aspectsV4InfoExpandableTextViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Boolean> invoke() {
            Map<String, ? extends Boolean> expandedState;
            expandedState = this.this$0.getExpandedState();
            return expandedState;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4InfoExpandableTextViewMapper$mapper$2(AspectsV4InfoExpandableTextViewMapper aspectsV4InfoExpandableTextViewMapper) {
        super(0);
        this.this$0 = aspectsV4InfoExpandableTextViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AspectsV4InfoMapper invoke() {
        return new AspectsV4InfoMapper(new AnonymousClass1(this.this$0));
    }
}
