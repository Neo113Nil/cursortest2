package ru.ozon.uni.atoms.v3.holders.text.expandable;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u009b\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u001c\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001d\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "Landroid/content/Context;", "context", "", "style", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "textColor", "moreBackingColor", "collapsedLines", "", "isExpanded", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "moreText", "isCustomPreset", "", "typographyToken", "moreTextTypographyToken", "", "applyStyle", "(Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;Landroid/content/Context;IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/uni/atoms/utils/OzonSpannableString;ZLjava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "", "textAttrs", "[I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpandableTextHolderKt {

    @NotNull
    private static final int[] textAttrs;

    static {
        int[] iArr = {R.attr.textAppearance, R.attr.paddingTop, R.attr.paddingBottom, ru.ozon.app.android.R.attr.lineHeight, R$attr.moreTextAppearance, R$attr.moreBackingHeight, R$attr.morePaddingBottom};
        C7705l.Z(iArr);
        textAttrs = iArr;
    }

    public static final void applyStyle(@NotNull ExpandableTextAtomView expandableTextAtomView, @NotNull Context context, int i11, int i12, int i13, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, OzonSpannableString ozonSpannableString, boolean z11, String str, String str2) {
        int resourceId;
        int resourceId2;
        OzonSpannableString ozonSpannableString2;
        Intrinsics.checkNotNullParameter(expandableTextAtomView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = textAttrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Number valueOf = num == null ? Float.valueOf(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.paddingTop), 0.0f)) : num;
        Number valueOf2 = num2 == null ? Float.valueOf(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.paddingBottom), 0.0f)) : num2;
        int dimension = (int) obtainStyledAttributes.getDimension(C7705l.L(iArr, R$attr.morePaddingBottom), 0.0f);
        boolean z12 = z11 && str != null;
        boolean z13 = z11 && str2 != null;
        if (z12) {
            Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(str);
            resourceId = parseTextStyle != null ? parseTextStyle.intValue() : i11;
        } else {
            resourceId = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.textAppearance), 0);
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (z13) {
            Integer parseTextStyle2 = StyleParser.INSTANCE.parseTextStyle(str2);
            resourceId2 = parseTextStyle2 != null ? parseTextStyle2.intValue() : i11;
        } else {
            resourceId2 = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R$attr.moreTextAppearance), 0);
        }
        int dimension2 = (int) obtainStyledAttributes.getDimension(C7705l.L(iArr, R$attr.moreBackingHeight), 0.0f);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(C7705l.L(iArr, ru.ozon.app.android.R.attr.lineHeight), -1);
        if (!z12) {
            dimensionPixelSize = Math.max(dimension2, dimensionPixelSize);
        }
        obtainStyledAttributes2.recycle();
        obtainStyledAttributes.recycle();
        TextViewExtKt.applyStyle(expandableTextAtomView, context, resourceId);
        expandableTextAtomView.setPadding(i12, valueOf.intValue(), i13, valueOf2.intValue());
        if (num3 != null) {
            expandableTextAtomView.setTextColor(num3.intValue());
        }
        if (ozonSpannableString == null) {
            String string = context.getString(R$string.design_system_expandable_text_more);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ozonSpannableString2 = new OzonSpannableString(string);
        } else {
            ozonSpannableString2 = ozonSpannableString;
        }
        expandableTextAtomView.setMoreText(ozonSpannableString2);
        expandableTextAtomView.setMoreTextStyle(resourceId2);
        expandableTextAtomView.setMoreBackingHeight(dimensionPixelSize);
        expandableTextAtomView.setMoreTextBottomPadding(dimension);
        expandableTextAtomView.setExpanded(bool != null ? bool.booleanValue() : false);
        expandableTextAtomView.setCollapsedLines(num5 != null ? num5.intValue() : 1);
    }

    public static final void bind(@NotNull ExpandableTextAtomView expandableTextAtomView, @NotNull ExpandableTextDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(expandableTextAtomView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(expandableTextAtomView, dto, new ExpandableTextHolderKt$bind$provider$1(expandableTextAtomView), function1);
    }

    public static /* synthetic */ void bind$default(ExpandableTextAtomView expandableTextAtomView, ExpandableTextDTO expandableTextDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(expandableTextAtomView, expandableTextDTO, function1);
    }

    public static final void bindOrGone(@NotNull ExpandableTextAtomView expandableTextAtomView, ExpandableTextDTO expandableTextDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(expandableTextAtomView, "<this>");
        if (expandableTextDTO == null) {
            expandableTextAtomView.setVisibility(8);
        } else {
            expandableTextAtomView.setVisibility(0);
            bind(expandableTextAtomView, expandableTextDTO, function1);
        }
    }
}
