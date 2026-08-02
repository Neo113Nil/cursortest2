package ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.DescriptionAccordionVO;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/AccordionIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateIcon", "()V", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "icon", "bindOrGone", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;)V", "", "newState", "changeIcon", "(Z)V", "Landroid/graphics/drawable/Drawable;", "iconDown$delegate", "LSc/j;", "getIconDown", "()Landroid/graphics/drawable/Drawable;", "iconDown", "iconUp$delegate", "getIconUp", "iconUp", "isIconUp", "Z", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccordionIconView extends AppCompatImageView {

    /* renamed from: iconDown$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconDown;

    /* renamed from: iconUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconUp;
    private boolean isIconUp;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Drawable getIconDown() {
        return (Drawable) this.iconDown.getValue();
    }

    private final Drawable getIconUp() {
        return (Drawable) this.iconUp.getValue();
    }

    private final void updateIcon() {
        Drawable iconUp = this.isIconUp ? getIconUp() : getIconDown();
        setContentDescription(this.isIconUp ? "disclosureOpen" : "disclosureHide");
        setImageDrawable(iconUp);
    }

    public final void bindOrGone(@NotNull DescriptionAccordionVO.Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (!icon.getIsShowIcon()) {
            ViewExtKt.gone(this);
            return;
        }
        this.isIconUp = icon.getIsDisclosureOpen();
        ViewExtKt.show(this);
        updateIcon();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(this, Integer.valueOf(ContextExtKt.parseColor(context, icon.getDisclosureTintColor())));
    }

    public final void changeIcon(boolean newState) {
        this.isIconUp = newState;
        updateIcon();
    }

    public /* synthetic */ AccordionIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconDown = DelegatesKt.lazyUnsafe(new AccordionIconView$iconDown$2(context));
        this.iconUp = DelegatesKt.lazyUnsafe(new AccordionIconView$iconUp$2(context));
    }
}
