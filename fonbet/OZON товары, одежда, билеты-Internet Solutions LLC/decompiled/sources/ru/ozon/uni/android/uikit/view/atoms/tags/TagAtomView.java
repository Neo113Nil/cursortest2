package ru.ozon.uni.android.uikit.view.atoms.tags;

import Cm.e;
import Ef0.c;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.TagUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R.\u0010(\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000e048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "refreshStyle", "()V", "Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView$Style;", "getStyle", "()Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView$Style;", "onAttachedToWindow", "", "selected", "setSelected", "(Z)V", "enabled", "setEnabled", "tintColor", "setTintColor", "(Ljava/lang/Integer;)V", "Landroid/widget/ImageView;", "getTagImage", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "getTagTextView", "()Landroid/widget/TextView;", "Lru/ozon/uni/databinding/TagUniBinding;", "binding", "Lru/ozon/uni/databinding/TagUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/TagUniBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "count", "getCount", "setCount", "dp12", "I", "Ljava/lang/Integer;", "", "Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView$StateMapKey;", "styleStateMap", "Ljava/util/Map;", "Style", "StateMapKey", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TagAtomView extends ConstraintLayout implements AtomView {

    @NotNull
    private final TagUniBinding binding;
    private CharSequence count;
    private final int dp12;

    @NotNull
    private final Map<StateMapKey, Style> styleStateMap;
    private CharSequence text;
    private Integer tintColor;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView$StateMapKey;", "", "", "isEnabled", "isSelected", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class StateMapKey {
        private final boolean isEnabled;
        private final boolean isSelected;

        public StateMapKey(boolean z11, boolean z12) {
            this.isEnabled = z11;
            this.isSelected = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateMapKey)) {
                return false;
            }
            StateMapKey stateMapKey = (StateMapKey) other;
            return this.isEnabled == stateMapKey.isEnabled && this.isSelected == stateMapKey.isSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + (Boolean.hashCode(this.isEnabled) * 31);
        }

        @NotNull
        public String toString() {
            return c.c("StateMapKey(isEnabled=", ", isSelected=", ")", this.isEnabled, this.isSelected);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView$Style;", "", "", "textColor", "countColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTextColor", "getCountColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Style {
        private final int countColor;
        private final int textColor;

        public Style(int i11, int i12) {
            this.textColor = i11;
            this.countColor = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return this.textColor == style.textColor && this.countColor == style.countColor;
        }

        public final int getCountColor() {
            return this.countColor;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.countColor) + (Integer.hashCode(this.textColor) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("Style(textColor=", this.textColor, ", countColor=", ")", this.countColor);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Style getStyle() {
        Integer num = this.tintColor;
        if (num == null) {
            return (Style) U.e(this.styleStateMap, new StateMapKey(isEnabled(), isSelected()));
        }
        int intValue = num.intValue();
        return new Style(intValue, intValue);
    }

    private final void refreshStyle() {
        Style style = getStyle();
        this.binding.tagTv.setTextColor(style.getTextColor());
        ImageView tagImage = this.binding.tagImage;
        Intrinsics.checkNotNullExpressionValue(tagImage, "tagImage");
        ThemeExtKt.tint(tagImage, Integer.valueOf(style.getTextColor()));
        this.binding.countTv.setTextColor(style.getCountColor());
    }

    @NotNull
    public final ImageView getTagImage() {
        ImageView tagImage = this.binding.tagImage;
        Intrinsics.checkNotNullExpressionValue(tagImage, "tagImage");
        return tagImage;
    }

    @NotNull
    public final TextView getTagTextView() {
        TextView tagTv = this.binding.tagTv;
        Intrinsics.checkNotNullExpressionValue(tagTv, "tagTv");
        return tagTv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.height = ResourceExtKt.dim(context, R$dimen.atom_tag_height);
        setLayoutParams(layoutParams);
    }

    public final void setCount(CharSequence charSequence) {
        this.count = charSequence;
        TextView textView = this.binding.countTv;
        if (charSequence == null || h.K(charSequence)) {
            Intrinsics.f(textView);
            ViewExtKt.gone(textView);
        } else {
            textView.setText(charSequence);
            ViewExtKt.show(textView);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        refreshStyle();
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        refreshStyle();
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        TextView tagTv = this.binding.tagTv;
        Intrinsics.checkNotNullExpressionValue(tagTv, "tagTv");
        ViewExtKt.showOrGone(tagTv, charSequence != null ? Boolean.valueOf(!h.K(charSequence)) : null);
        this.binding.tagTv.setText(charSequence);
    }

    public final void setTintColor(Integer tintColor) {
        this.tintColor = tintColor;
        refreshStyle();
    }

    public /* synthetic */ TagAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12);
        this.dp12 = px;
        this.styleStateMap = U.j(new Pair(new StateMapKey(true, true), new Style(ThemeExtKt.themeColor(context, R$attr.graphicPrimaryDynamic), a.getColor(context, R$color.oz_semantic_white_overlay_2))), new Pair(new StateMapKey(true, false), new Style(a.getColor(context, R$color.oz_semantic_text_primary), a.getColor(context, R$color.oz_semantic_text_secondary))), new Pair(new StateMapKey(false, true), new Style(a.getColor(context, R$color.oz_semantic_white_overlay_2), a.getColor(context, R$color.oz_semantic_white_overlay_2))), new Pair(new StateMapKey(false, false), new Style(a.getColor(context, R$color.oz_semantic_text_quaternary), a.getColor(context, R$color.oz_semantic_text_quaternary))));
        this.binding = TagUniBinding.bind(View.inflate(context, R$layout.tag_uni, this));
        ViewExtKt.updatePadding$default(this, px, 0, px, 0, 10, null);
        setBackgroundResource(R$drawable.o2_tag);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.Tag, i11, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setText(obtainStyledAttributes.getString(R$styleable.Tag_android_text));
            setCount(obtainStyledAttributes.getString(R$styleable.Tag_count));
            obtainStyledAttributes.recycle();
        }
    }
}
