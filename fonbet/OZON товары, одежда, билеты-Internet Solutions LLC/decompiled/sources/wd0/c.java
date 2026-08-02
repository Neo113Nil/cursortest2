package wd0;

import Jb0.D;
import Jb0.z;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.ImageFixed;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetMode;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageFixedHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9861a;
import vd0.AbstractC10309b;

/* loaded from: classes3.dex */
public final class c extends AbstractC10309b {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final r f104398m;

    public c(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f104398m = activity;
    }

    private final SheetView A(ConstraintLayout constraintLayout) {
        SheetMode sheetMode = SheetMode.HUG_CONTENT;
        Function0<Unit> h11 = h();
        if (h11 == null) {
            h11 = b.f104397b;
        }
        return new SheetView(constraintLayout, h11, sheetMode, d());
    }

    private static void y(ButtonView buttonView, C10540a c10540a, AbstractC10309b.a aVar, String str) {
        int i11;
        if (aVar == null) {
            i11 = 8;
        } else {
            buttonView.setTitleText(aVar.b());
            buttonView.setOnClickListener(new NV.a(7, aVar, c10540a));
            C9861a.e(buttonView, str);
            i11 = 0;
        }
        buttonView.setVisibility(i11);
    }

    public final C10540a z() {
        IconDTO iconDTO;
        int i11;
        r rVar = this.f104398m;
        D b11 = D.b(rVar.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b11, "inflate(...)");
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        z a12 = z.a(a11);
        Intrinsics.checkNotNullExpressionValue(a12, "bind(...)");
        C10540a c10540a = new C10540a(rVar, A(a11), a12);
        IconView iconView = b11.f14371c;
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        if (b() != null) {
            iconDTO = new IconDTO(IconDTO.IconSize.SIZE_800, null, null, null, null, b(), null, null, null, null, null, null, null, null, null, null, 65502, null);
        } else if (f() != null) {
            iconDTO = new IconDTO(IconDTO.IconSize.SIZE_800, null, null, f(), null, null, UniColors.BG_SECONDARY.getToken(), UniColors.TEXT_TERTIARY.getToken(), UniTextStyles.HEADLINE_700_X_LARGE.getToken(), null, null, null, null, null, null, null, 65078, null);
        } else if (e() != null) {
            IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_800;
            String e11 = e();
            Intrinsics.f(e11);
            iconDTO = new IconDTO(iconSize, null, null, null, new CommonAtomIconDTO(e11, UniColors.GRAPHIC_TERTIARY.getToken()), null, UniColors.BG_SECONDARY.getToken(), null, null, null, null, null, null, null, null, null, 65454, null);
        } else {
            iconDTO = null;
        }
        IconHolderKt.bindOrGone$default(iconView, iconDTO, null, 2, null);
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        int visibility = iconView.getVisibility();
        ImageFixed imageView = b11.f14372d;
        int i12 = 8;
        if (visibility == 0) {
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            imageView.setVisibility(8);
        } else {
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            String g10 = g();
            ImageFixedHolderKt.bindOrGone$default(imageView, g10 != null ? new ImageFixedDTO(g10, null, null, false, 0, null, null, null, null, null, null, 2046, null) : null, null, 2, null);
        }
        OzonSpannableString l11 = l();
        TextAtomV2View textAtomV2View = b11.f14375g;
        if (l11 == null) {
            i11 = 8;
        } else {
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            TextHolderKt.bind$default(textAtomV2View, new TextDTO(l11, m(), layoutPadding, layoutPadding, null, null, TextPreset.UI_H1, null, UniColors.TEXT_PRIMARY.getToken(), Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523440, null), null, 2, null);
            i11 = 0;
        }
        textAtomV2View.setVisibility(i11);
        OzonSpannableString k11 = k();
        TextAtomV2View textAtomV2View2 = b11.f14374f;
        if (k11 != null) {
            Function1<String, Unit> i13 = i();
            if (i13 != null) {
                k11 = OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, k11, null, Integer.valueOf(textAtomV2View2.getContext().getColor(R.color.text_action)), null, new Pair(textAtomV2View2, i13), 5, null);
            }
            OzonSpannableString ozonSpannableString = k11;
            CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
            TextHolderKt.bind$default(textAtomV2View2, new TextDTO(ozonSpannableString, m(), layoutPadding2, layoutPadding2, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, OzonSpannableStringKt.hasClickableSpan(ozonSpannableString), null, null, null, null, null, 515248, null), null, 2, null);
            i12 = 0;
        }
        textAtomV2View2.setVisibility(i12);
        ButtonView submitButton = b11.f14373e;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        y(submitButton, c10540a, j(), "submitButton");
        ButtonView cancelButton = b11.f14370b;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        y(cancelButton, c10540a, c(), "cancelButton");
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        if (submitButton.getVisibility() == 0) {
            submitButton.requestFocus();
            return c10540a;
        }
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        if (cancelButton.getVisibility() == 0) {
            cancelButton.requestFocus();
        }
        return c10540a;
    }
}
