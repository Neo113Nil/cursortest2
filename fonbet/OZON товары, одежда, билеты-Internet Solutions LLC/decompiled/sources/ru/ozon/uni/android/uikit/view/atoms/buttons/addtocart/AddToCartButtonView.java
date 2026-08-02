package ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b\u0010\u0010%\"\u0004\b&\u0010\u0012R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "syncTextState", "()V", "syncStyleState", "", "isActive", "setState", "(Z)V", "", "atomText", "Ljava/lang/CharSequence;", "getAtomText", "()Ljava/lang/CharSequence;", "setAtomText", "(Ljava/lang/CharSequence;)V", "activeText", "getActiveText", "setActiveText", "Lkotlin/Pair;", "styles", "Lkotlin/Pair;", "getStyles", "()Lkotlin/Pair;", "setStyles", "(Lkotlin/Pair;)V", "Z", "()Z", "setActive", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddToCartButtonView extends AppCompatTextView implements AtomView {

    @NotNull
    private CharSequence activeText;

    @NotNull
    private final StyleAppearance<AddToCartButtonView> appearance;

    @NotNull
    private CharSequence atomText;
    private boolean isActive;

    @NotNull
    private Pair<Integer, Integer> styles;

    public /* synthetic */ AddToCartButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void syncStyleState() {
        setText(this.isActive ? this.activeText : this.atomText);
    }

    private final void syncTextState() {
        StyleAppearance<AddToCartButtonView> styleAppearance = this.appearance;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, (this.isActive ? this.styles.e() : this.styles.f()).intValue());
        this.appearance.apply(this);
    }

    public final void setActiveText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.activeText = charSequence;
    }

    public final void setAtomText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.atomText = charSequence;
    }

    public final void setState(boolean isActive) {
        this.isActive = isActive;
        syncStyleState();
        syncTextState();
    }

    public final void setStyles(@NotNull Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.styles = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.atomText = "";
        this.activeText = "";
        this.styles = new Pair<>(Integer.valueOf(R$style.SmallButton_Primary_Green), Integer.valueOf(R$style.SmallButton_Primary));
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
    }
}
