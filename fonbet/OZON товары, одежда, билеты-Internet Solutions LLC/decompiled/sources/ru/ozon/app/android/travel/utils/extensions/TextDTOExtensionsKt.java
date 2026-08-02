package ru.ozon.app.android.travel.utils.extensions;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¨\u0006\b"}, d2 = {"withNavigationLinksHandling", "Lru/ozon/uni/atoms/data/text/TextDTO;", "view", "Landroid/view/View;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextDTOExtensionsKt {
    @NotNull
    public static final TextDTO withNavigationLinksHandling(@NotNull TextDTO textDTO, @NotNull View view, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        OzonSpannableString text = textDTO.getText();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OzonUrlSpan.Companion.configUrlSpans$default(companion, text, null, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textAction)), null, new Pair(view, new TextDTOExtensionsKt$withNavigationLinksHandling$1(function1, textDTO)), 5, null);
        return textDTO;
    }
}
