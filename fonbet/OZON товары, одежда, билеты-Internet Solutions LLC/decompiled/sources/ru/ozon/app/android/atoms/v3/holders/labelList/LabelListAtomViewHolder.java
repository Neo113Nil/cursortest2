package ru.ozon.app.android.atoms.v3.holders.labelList;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.uikit.view.atoms.labelList.LabelListView;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\r*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002J\f\u0010\u001f\u001a\u00020\u0014*\u00020 H\u0002J\u0014\u0010!\u001a\u00020\"*\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0002¨\u0006%"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/labelList/LabelListAtomViewHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "createLabelString", "", "", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$Label;", "updateNextIconIndex", "", "hasIcon", "", "titleLength", "receiveImageSpan", "Landroid/text/style/ImageSpan;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "tint", "Landroid/graphics/drawable/Drawable;", "tintColor", "extractAlignment", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$AlignType;", "colorText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelListAtomViewHolder extends AtomV3<LabelListAtom, LabelListView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LabelListAtom.AlignType.values().length];
            try {
                iArr[LabelListAtom.AlignType.ALIGN_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LabelListAtom.AlignType.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListAtomViewHolder(@NotNull LabelListView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final OzonSpannableString colorText(OzonSpannableString ozonSpannableString, String str) {
        ozonSpannableString.setSpan(new ForegroundColorSpan(StyleParser.INSTANCE.parseColor(getContext(), str, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY)), 0, ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }

    private final CharSequence createLabelString(List<LabelListAtom.Label> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        for (LabelListAtom.Label label : list) {
            Icon icon = label.getIcon();
            ImageSpan receiveImageSpan = icon != null ? receiveImageSpan(icon) : null;
            String str = receiveImageSpan != null ? "i " : "";
            if (!h.K(str) || !h.K(label.getTitle())) {
                OzonSpannableString colorText = colorText(label.getTitle(), label.getTitleColor());
                spannableStringBuilder.append((CharSequence) str).append((CharSequence) colorText).setSpan(receiveImageSpan, i11, i11 + 1, 0);
                Unit unit = Unit.f71690a;
                i11 = updateNextIconIndex(i11, receiveImageSpan != null, colorText.length());
            }
        }
        return spannableStringBuilder;
    }

    private final int extractAlignment(LabelListAtom.AlignType alignType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignType.ordinal()];
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 4;
        }
        throw new o();
    }

    private final ImageSpan receiveImageSpan(Icon icon) {
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(getContext(), icon.getImage());
        if (loadDrawableByName == null) {
            return null;
        }
        loadDrawableByName.mutate();
        tint(loadDrawableByName, icon.getTintColor());
        loadDrawableByName.setBounds(0, 0, loadDrawableByName.getIntrinsicWidth(), loadDrawableByName.getIntrinsicHeight());
        return new LabelListImageSpan(loadDrawableByName);
    }

    private final void tint(Drawable drawable, String str) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), str);
        if (parseColor != null) {
            drawable.setTint(parseColor.intValue());
        } else {
            drawable.setTintList(null);
        }
    }

    private final int updateNextIconIndex(int i11, boolean z11, int i12) {
        return i11 + i12 + (z11 ? 2 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LabelListAtomViewHolder(@NotNull Context context, String str) {
        this(r0 == null ? new LabelListView(context, null, 0, 6, null) : r0, str);
        Intrinsics.checkNotNullParameter(context, "context");
        LabelListView labelListView = (LabelListView) q.f64554a.i(N.b(LabelListView.class), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull LabelListAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LabelListAtomViewHolder) item);
        LabelListView containerView = getContainerView();
        containerView.setTextAlignment(extractAlignment(item.getAlign()));
        TestInfo testInfo = item.getTestInfo();
        containerView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        containerView.setText(createLabelString(item.getItems()));
        containerView.setMaxLines(item.getMaxLines());
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(item.getTextStyle());
        containerView.setTextAppearance(parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Caption);
    }
}
