package ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation;

import ic.AbstractC7042a;
import jc.C7335b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lic/a;", "invoke", "()Lic/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class AIMarkdownChatView$adapter$2 extends AbstractC7737t implements Function0<AbstractC7042a> {
    public static final AIMarkdownChatView$adapter$2 INSTANCE = new AIMarkdownChatView$adapter$2();

    AIMarkdownChatView$adapter$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(C7335b.InterfaceC1136b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.b(R$layout.item_markwon_table, R$id.table_layout);
        builder.c(R$layout.item_markwon_table_cell);
        builder.a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC7042a invoke() {
        AbstractC7042a.InterfaceC1089a f7 = AbstractC7042a.f(R$layout.item_markwon_block);
        f7.a(C7335b.d(new a()));
        AbstractC7042a build = f7.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
