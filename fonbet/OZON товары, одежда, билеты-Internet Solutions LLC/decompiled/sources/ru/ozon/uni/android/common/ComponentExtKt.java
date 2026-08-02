package ru.ozon.uni.android.common;

import CC.a;
import Dc0.j;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¨\u0006\u0012"}, d2 = {"createCloseButton", "Lru/ozon/uni/android/controls/button/IconButtonView;", "context", "Landroid/content/Context;", "onDismiss", "Lkotlin/Function0;", "", "createSheetCloseButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "id", "", "dto", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "createSheetHeader", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "headerText", "", "headerTextColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComponentExtKt {
    @NotNull
    public static final IconButtonView createCloseButton(@NotNull Context context, @NotNull Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        AttributeSet attributeSet = null;
        IconButtonView iconButtonView = new IconButtonView(context, attributeSet, 0, R$style.Button_NeutralSecondary, null, 22, null);
        iconButtonView.setPreset(IconButtonDTO.Preset.SIZE_HEADER_400);
        iconButtonView.setIcon(Integer.valueOf(R$drawable.ic_s_cross));
        iconButtonView.setOnClickListener(new j(onDismiss, 14));
        return iconButtonView;
    }

    @NotNull
    public static final IconButtonV3View createSheetCloseButton(@NotNull Context context, int i11, @NotNull IconButtonV3DTO dto, @NotNull Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(i11);
        IconButtonV3HolderKt.bind$default(iconButtonV3View, dto, null, 2, null);
        iconButtonV3View.setOnClickListener(new a(onDismiss, 18));
        return iconButtonV3View;
    }

    @NotNull
    public static final TextAtomV2View createSheetHeader(@NotNull Context context, int i11, @NotNull String headerText, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(i11);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(headerText);
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, layoutPadding, layoutPadding, textPreset, "tsCompactControl500Medium", str, null, null, null, null, false, CommonAtomLabelDTO.TruncatingMode.TAIL, null, null, null, 1, 245248, null), null, 2, null);
        return textAtomV2View;
    }

    public static /* synthetic */ TextAtomV2View createSheetHeader$default(Context context, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$id.sheetDialogHeader;
        }
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        return createSheetHeader(context, i11, str, str2);
    }
}
