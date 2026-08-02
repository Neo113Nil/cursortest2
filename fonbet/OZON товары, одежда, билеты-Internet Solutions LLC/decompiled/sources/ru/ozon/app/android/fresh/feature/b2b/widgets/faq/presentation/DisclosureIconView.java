package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\n2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/DisclosureIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateIcon", "()V", "", "state", "setState", "(Z)V", "Lkotlin/Function1;", "block", "onIconChange", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/Drawable;", "iconDown$delegate", "LSc/j;", "getIconDown", "()Landroid/graphics/drawable/Drawable;", "iconDown", "iconUp$delegate", "getIconUp", "iconUp", "isIconUp", "Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DisclosureIconView extends AppCompatImageView {

    /* renamed from: iconDown$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconDown;

    /* renamed from: iconUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconUp;
    private boolean isIconUp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureIconView(@NotNull Context context, AttributeSet attributeSet) {
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
        setImageDrawable(this.isIconUp ? getIconUp() : getIconDown());
    }

    public final void onIconChange(Function1<? super Boolean, Unit> block) {
        this.isIconUp = !this.isIconUp;
        updateIcon();
        if (block != null) {
            block.invoke(Boolean.valueOf(this.isIconUp));
        }
    }

    public final void setState(boolean state) {
        this.isIconUp = state;
        updateIcon();
    }

    public /* synthetic */ DisclosureIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconDown = DelegatesKt.lazyUnsafe(new DisclosureIconView$iconDown$2(context));
        this.iconUp = DelegatesKt.lazyUnsafe(new DisclosureIconView$iconUp$2(context));
    }
}
