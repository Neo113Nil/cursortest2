package ru.ozon.app.android.atoms.v3.holders.texts;

import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u000e\u0010\u0015\u001a\u00020\u0016*\u0004\u0018\u00010\u0017H\u0003R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/texts/TextAtomWithIconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "linkMovementMethod", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "Landroid/text/method/MovementMethod;", "onBind", "", "item", "setTestId", "testId", "toDrawableSpanAlignment", "", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextAtomWithIconHolder extends AtomV3<TextAtomWithIcon, TextAtomWithIconView> {
    private final MovementMethod linkMovementMethod;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAtomWithIcon.IconAlignment.values().length];
            try {
                iArr[TextAtomWithIcon.IconAlignment.BASELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAtomWithIcon.IconAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomWithIconHolder(@NotNull TextAtomWithIconView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.linkMovementMethod = LinkMovementMethod.getInstance();
    }

    @SuppressLint({"NewApi"})
    private final int toDrawableSpanAlignment(TextAtomWithIcon.IconAlignment iconAlignment) {
        int i11 = iconAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[iconAlignment.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 0;
            }
        }
        return i12;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setContentDescription(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TextAtomWithIcon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TextAtomWithIconHolder) item);
        TextAtomWithIconView containerView = getContainerView();
        OzonSpannableString text = item.getText();
        String icon = item.getIcon();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTextWithIcon(text, icon, styleParser.parseColor(context, item.getIconTintColor()), toDrawableSpanAlignment(item.getIconAlignment()));
        containerView.setStyleOrDefault(styleParser.parseTextStyle(item.getTextStyle()));
        containerView.setMaxLinesOrDefault(item.getMaxLines());
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setTextColorOrDefault(styleParser.parseColor(context2, item.getTextColor()));
        MovementMethod movementMethod = this.linkMovementMethod;
        if (!OzonSpannableStringKt.hasClickableSpan(item.getText())) {
            movementMethod = null;
        }
        containerView.setMovementMethod(movementMethod);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomWithIconHolder(@NotNull Context context, String str) {
        this(new TextAtomWithIconView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
