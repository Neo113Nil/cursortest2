package ru.ozon.uni.android.uikitsdk.ext;

import Sc.o;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.ImageWithHorizontalPaddingSpan;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a5\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/text/SpannableStringBuilder;", "clearSpan", "(Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "iconPosition", "", "iconPaddingLeft", "iconPaddingRight", "insertIconSpan", "(Landroid/text/SpannableStringBuilder;Landroid/graphics/drawable/Drawable;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;II)Landroid/text/SpannableStringBuilder;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpannableStringBuilderExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonAtomLabelDTO.IconPosition.values().length];
            try {
                iArr[CommonAtomLabelDTO.IconPosition.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAtomLabelDTO.IconPosition.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SpannableStringBuilder clearSpan(@NotNull SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        ImageWithHorizontalPaddingSpan[] imageWithHorizontalPaddingSpanArr = (ImageWithHorizontalPaddingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageWithHorizontalPaddingSpan.class);
        Intrinsics.f(imageWithHorizontalPaddingSpanArr);
        if (imageWithHorizontalPaddingSpanArr.length == 0) {
            return spannableStringBuilder;
        }
        for (ImageWithHorizontalPaddingSpan imageWithHorizontalPaddingSpan : imageWithHorizontalPaddingSpanArr) {
            spannableStringBuilder.removeSpan(imageWithHorizontalPaddingSpan);
        }
        if (h.g0(spannableStringBuilder, "\ufeff\ufeff")) {
            spannableStringBuilder.delete(0, 2);
        }
        if (h.B(spannableStringBuilder, "\ufeff\ufeff")) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder insertIconSpan(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Drawable iconDrawable, @NotNull CommonAtomLabelDTO.IconPosition iconPosition, int i11, int i12) {
        int i13;
        AddonSide addonSide;
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(iconDrawable, "iconDrawable");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i14 = iArr[iconPosition.ordinal()];
        if (i14 == 1) {
            i13 = 0;
        } else {
            if (i14 != 2) {
                throw new o();
            }
            i13 = spannableStringBuilder.length();
        }
        spannableStringBuilder.insert(i13, "\ufeff\ufeff");
        int length = iconPosition != CommonAtomLabelDTO.IconPosition.START ? spannableStringBuilder.length() - 1 : 0;
        int i15 = iArr[iconPosition.ordinal()];
        if (i15 == 1) {
            addonSide = AddonSide.START;
        } else {
            if (i15 != 2) {
                throw new o();
            }
            addonSide = AddonSide.END;
        }
        spannableStringBuilder.setSpan(new ImageWithHorizontalPaddingSpan(iconDrawable, i11, i12, addonSide), length, length + 1, 33);
        return spannableStringBuilder;
    }
}
