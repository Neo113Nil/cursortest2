package ru.ozon.app.android.storefront.widgets.cms.richtext;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.data.markdown.TextParserProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RichTextWidgetComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<RichTextWidgetMapper> {
    final /* synthetic */ RichTextWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RichTextWidgetComponent$Companion$create$1$1$mapper$2(RichTextWidgetComponent$Companion$create$1$1 richTextWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = richTextWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RichTextWidgetMapper invoke() {
        Context context;
        TextParserProvider textParserProvider;
        context = this.this$0.getContext();
        textParserProvider = this.this$0.getTextParserProvider();
        return new RichTextWidgetMapper(context, textParserProvider);
    }
}
