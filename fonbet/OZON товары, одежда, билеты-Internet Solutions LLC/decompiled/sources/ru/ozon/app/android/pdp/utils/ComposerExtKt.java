package ru.ozon.app.android.pdp.utils;

import android.content.Context;
import android.util.Size;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a(\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u001a\u001e\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u001a\u001e\u0010\u000f\u001a\u00020\u0014*\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012¨\u0006\u0015"}, d2 = {"getStubMeasureSize", "Landroid/util/Size;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "context", "Landroid/content/Context;", "horizontalPaddings", "", "", "withNavigationLinksHandling", "view", "Landroid/view/View;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "addAdditionalParams", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "additionalParams", "", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposerExtKt {
    @NotNull
    public static final AtomAction.Click addAdditionalParams(@NotNull AtomAction.Click click, @NotNull Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(click, "<this>");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Map<String, String> params = click.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.putAll(additionalParams);
        Unit unit = Unit.f71690a;
        return AtomAction.Click.copy$default(click, null, null, null, u11, null, null, 55, null);
    }

    @NotNull
    public static final Size getStubMeasureSize(@NotNull TextDTO textDTO, @NotNull Context context, @NotNull List<Integer> horizontalPaddings) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        textAtomV2View.measure(View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - C7714v.J0(horizontalPaddings), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new Size(textAtomV2View.getMeasuredWidth(), textAtomV2View.getMeasuredHeight());
    }

    @NotNull
    public static final TextDTO withNavigationLinksHandling(@NotNull TextDTO textDTO, @NotNull View view, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        OzonSpannableString text = textDTO.getText();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OzonUrlSpan.Companion.configUrlSpans$default(companion, text, null, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textAction)), null, new Pair(view, new ComposerExtKt$withNavigationLinksHandling$1(function1, textDTO)), 5, null);
        return textDTO;
    }

    @NotNull
    public static final AtomAction.ComposerAction addAdditionalParams(@NotNull AtomAction.ComposerAction composerAction, @NotNull Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(composerAction, "<this>");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Map<String, String> params = composerAction.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.putAll(additionalParams);
        Unit unit = Unit.f71690a;
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }
}
