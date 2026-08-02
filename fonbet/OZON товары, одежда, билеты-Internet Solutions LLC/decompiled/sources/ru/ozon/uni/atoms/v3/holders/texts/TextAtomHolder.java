package ru.ozon.uni.atoms.v3.holders.texts;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import gk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/texts/TextAtomHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "linkMovementMethod", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "Landroid/text/method/MovementMethod;", "onBind", "", "item", "setTestId", "testId", "setOnUrlAction", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textAtom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextAtomHolder extends AtomV3<TextAtom, TextAtomView> {
    private final MovementMethod linkMovementMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomHolder(@NotNull TextAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.linkMovementMethod = LinkMovementMethod.getInstance();
    }

    private final void setOnUrlAction(OzonSpannableString ozonSpannableString, TextAtom textAtom) {
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        OzonUrlSpan.Companion.configUrlSpans$default(companion, ozonSpannableString, null, Integer.valueOf(ThemeExtKt.themeColor(getContext(), UniGlobalConfigKt.getUnderlineLinksFlag(getContext()) ? R$attr.textAction : R$attr.oz_semantic_accent_primary)), Boolean.valueOf(UniGlobalConfigKt.getUnderlineLinksFlag(getContext())), new Pair(getContainerView(), new TextAtomHolder$setOnUrlAction$1(this, textAtom)), 1, null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setContentDescription(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TextAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TextAtomHolder) item);
        TextAtomView containerView = getContainerView();
        setOnUrlAction(item.getText(), item);
        containerView.setText(item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        containerView.setStyleOrDefault(styleParser.parseTextStyle(item.getTextStyle()));
        containerView.setMaxLinesOrDefault(item.getMaxLines());
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTextColorOrDefault(styleParser.parseColor(context, item.getTextColor()));
        MovementMethod movementMethod = this.linkMovementMethod;
        if (!OzonSpannableStringKt.hasClickableSpan(item.getText())) {
            movementMethod = null;
        }
        containerView.setMovementMethod(movementMethod);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomHolder(@NotNull Context context, String str) {
        this((TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
