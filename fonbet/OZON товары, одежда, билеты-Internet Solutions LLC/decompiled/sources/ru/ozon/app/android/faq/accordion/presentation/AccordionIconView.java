package ru.ozon.app.android.faq.accordion.presentation;

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
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\n2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/faq/accordion/presentation/AccordionIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateIcon", "()V", "resId", "setImageResource", "(I)V", "", "isIconUp", "bind", "(Z)V", "Lkotlin/Function1;", "block", "onIconChange", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/Drawable;", "iconUp$delegate", "LSc/j;", "getIconUp", "()Landroid/graphics/drawable/Drawable;", "iconUp", "Z", "Companion", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccordionIconView extends AppCompatImageView {

    /* renamed from: iconUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconUp;
    private boolean isIconUp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Drawable getIconUp() {
        return (Drawable) this.iconUp.getValue();
    }

    private final void updateIcon() {
        setRotation(this.isIconUp ? 0.0f : 180.0f);
    }

    public final void bind(boolean isIconUp) {
        this.isIconUp = isIconUp;
        setImageDrawable(getIconUp());
        ViewExtKt.show(this);
        updateIcon();
    }

    public final void onIconChange(Function1<? super Boolean, Unit> block) {
        this.isIconUp = !this.isIconUp;
        updateIcon();
        if (block != null) {
            block.invoke(Boolean.valueOf(this.isIconUp));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        setRotation(0.0f);
        super.setImageResource(resId);
    }

    public /* synthetic */ AccordionIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconUp = LazyUtilsKt.unsafeLazy(new AccordionIconView$iconUp$2(context));
    }
}
