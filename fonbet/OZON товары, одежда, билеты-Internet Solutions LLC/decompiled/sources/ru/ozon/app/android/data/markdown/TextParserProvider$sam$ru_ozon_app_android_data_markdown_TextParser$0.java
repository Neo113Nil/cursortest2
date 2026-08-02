package ru.ozon.app.android.data.markdown;

import Sc.InterfaceC4003e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextParserProvider$sam$ru_ozon_app_android_data_markdown_TextParser$0 implements TextParser, InterfaceC7732n {
    private final /* synthetic */ Function1 function;

    TextParserProvider$sam$ru_ozon_app_android_data_markdown_TextParser$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TextParser) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    @NotNull
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // ru.ozon.app.android.data.markdown.TextParser
    public final /* synthetic */ OzonSpannableString parse(String str) {
        return (OzonSpannableString) this.function.invoke(str);
    }
}
