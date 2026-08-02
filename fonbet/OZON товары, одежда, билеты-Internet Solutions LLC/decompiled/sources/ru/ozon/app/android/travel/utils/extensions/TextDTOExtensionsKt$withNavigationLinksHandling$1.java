package ru.ozon.app.android.travel.utils.extensions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextDTOExtensionsKt$withNavigationLinksHandling$1 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ TextDTO $this_withNavigationLinksHandling;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextDTOExtensionsKt$withNavigationLinksHandling$1(Function1<? super AtomAction, Unit> function1, TextDTO textDTO) {
        super(1);
        this.$actionHandler = function1;
        this.$this_withNavigationLinksHandling = textDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        if (function1 != null) {
            function1.invoke(new AtomAction.Move(it, null, this.$this_withNavigationLinksHandling.getTrackingInfo(), null, 10, null));
        }
        return Boolean.valueOf(this.$actionHandler != null);
    }
}
