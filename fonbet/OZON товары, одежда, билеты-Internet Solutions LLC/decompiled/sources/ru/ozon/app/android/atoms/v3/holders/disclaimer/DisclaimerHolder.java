package ru.ozon.app.android.atoms.v3.holders.disclaimer;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\u0010\u0010\f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/disclaimer/DisclaimerHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "defaultBackgroundColor", "", "onBind", "", "item", "setTestId", "testId", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerHolder extends AtomV3<DisclaimerAtom, DisclaimerContainer> {
    private final int defaultBackgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerHolder(@NotNull DisclaimerContainer view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.defaultBackgroundColor = ThemeExtKt.isDarkThemeActive(getContext()) ? R$color.oz_gray_30 : R$color.oz_white_2;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setContentDescription(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull DisclaimerAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((DisclaimerHolder) item);
        DisclaimerContainer containerView = getContainerView();
        DisclaimerAtom.Header header = item.getHeader();
        containerView.setHeaderText(header != null ? header.getText() : null);
        containerView.setText(item.getBody().getText());
        containerView.setIcon(item.getIcon());
        Function1<AtomAction, Unit> onAction = getOnAction();
        if (onAction != null) {
            containerView.setButtons(item.getButtons(), onAction);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DisclaimerAtom.Header header2 = item.getHeader();
        containerView.setHeaderColor(styleParser.parseColor(context, header2 != null ? header2.getColor() : null, DisclaimerAtom.Header.INSTANCE.getDEFAULT_COLOR()));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setTextColor(styleParser.parseColor(context2, item.getBody().getColor(), R$color.oz_semantic_text_tetriary));
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getIcon().getTintColor());
        if (parseColor != null) {
            containerView.setIconColor(parseColor.intValue());
        }
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        containerView.setCardColor(styleParser.parseColor(context4, item.getBackgroundColor(), this.defaultBackgroundColor));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclaimerHolder(@NotNull Context context, String str) {
        this(new DisclaimerContainer(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
