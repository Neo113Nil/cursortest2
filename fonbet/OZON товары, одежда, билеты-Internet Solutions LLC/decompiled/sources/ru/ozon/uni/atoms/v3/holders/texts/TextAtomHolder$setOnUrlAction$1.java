package ru.ozon.uni.atoms.v3.holders.texts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TextAtomHolder$setOnUrlAction$1 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ TextAtom $textAtom;
    final /* synthetic */ TextAtomHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextAtomHolder$setOnUrlAction$1(TextAtomHolder textAtomHolder, TextAtom textAtom) {
        super(1);
        this.this$0 = textAtomHolder;
        this.$textAtom = textAtom;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        Function1 onAction;
        Intrinsics.checkNotNullParameter(it, "it");
        onAction = this.this$0.getOnAction();
        this.this$0.handleAction(new AtomAction.Move(it, null, this.$textAtom.getTrackingInfo(), null, 10, null));
        return Boolean.valueOf(onAction != null);
    }
}
