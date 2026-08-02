package ru.ozon.uni.atoms.v3.holders.text;

import android.R;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\r*\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "Landroid/content/res/Resources;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPadding", "", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "", "textAttrs", "[I", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "getViewAlign", "(Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;)I", "viewAlign", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextHolderKt {

    @NotNull
    private static final int[] textAttrs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextDTO.TextAlignment.values().length];
            try {
                iArr[TextDTO.TextAlignment.TRAILING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextDTO.TextAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonAtomLabelDTO.TruncatingMode.values().length];
            try {
                iArr2[CommonAtomLabelDTO.TruncatingMode.TAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CommonAtomLabelDTO.TruncatingMode.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        int[] iArr = {R.attr.textAppearance, R.attr.paddingTop, R.attr.paddingBottom, R.attr.textAllCaps, R$attr.paragraphSpacing};
        C7705l.Z(iArr);
        textAttrs = iArr;
    }

    public static final void bind(@NotNull TextAtomV2View textAtomV2View, @NotNull TextDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textAtomV2View, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(textAtomV2View, dto, new TextHolderKt$bind$provider$1(textAtomV2View), function1);
    }

    public static /* synthetic */ void bind$default(TextAtomV2View textAtomV2View, TextDTO textDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(textAtomV2View, textDTO, function1);
    }

    public static final void bindOrGone(@NotNull TextAtomV2View textAtomV2View, TextDTO textDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textAtomV2View, "<this>");
        if (textDTO == null) {
            textAtomV2View.setVisibility(8);
        } else {
            textAtomV2View.setVisibility(0);
            bind(textAtomV2View, textDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(TextAtomV2View textAtomV2View, TextDTO textDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(textAtomV2View, textDTO, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getPadding(Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getViewAlign(TextDTO.TextAlignment textAlignment) {
        int i11 = textAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? 2 : 4;
        }
        return 3;
    }
}
