package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText;

import UZ.d;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.m;
import WZ.t;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.LinkOnlyMovementMethod;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/utils/LinkOnlyMovementMethod;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2 extends AbstractC7737t implements Function0<LinkOnlyMovementMethod> {
    final /* synthetic */ SelectionItemDescriptionTextVH this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "link", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ SelectionItemDescriptionTextVH this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SelectionItemDescriptionTextVH selectionItemDescriptionTextVH) {
            super(1);
            this.this$0 = selectionItemDescriptionTextVH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g invoke$lambda$2$lambda$1(String str, UZ.a aVar, g params) {
            Intrinsics.checkNotNullParameter(aVar, "<unused var>");
            Intrinsics.checkNotNullParameter(params, "params");
            LinkedHashMap a11 = h.a(params.b());
            a11.put(SelectionItemFormDTO.TITLE_FIELD_NAME, str);
            return g.a(params, a11, null, 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final String link) {
            t linkClickEvent;
            l lVar;
            Intrinsics.checkNotNullParameter(link, "link");
            DescriptionTextVO descriptionTextVO = (DescriptionTextVO) this.this$0.getBoundData();
            if (descriptionTextVO == null || (linkClickEvent = descriptionTextVO.getLinkClickEvent()) == null) {
                return;
            }
            lVar = this.this$0.tokenizedAnalytics;
            m.a(lVar, linkClickEvent, new e() { // from class: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.a
                @Override // WZ.e
                public final g modifyParams(UZ.a aVar, g gVar) {
                    g invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2.AnonymousClass1.invoke$lambda$2$lambda$1(link, (d) aVar, gVar);
                    return invoke$lambda$2$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2(SelectionItemDescriptionTextVH selectionItemDescriptionTextVH) {
        super(0);
        this.this$0 = selectionItemDescriptionTextVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LinkOnlyMovementMethod invoke() {
        return new LinkOnlyMovementMethod(new AnonymousClass1(this.this$0));
    }
}
