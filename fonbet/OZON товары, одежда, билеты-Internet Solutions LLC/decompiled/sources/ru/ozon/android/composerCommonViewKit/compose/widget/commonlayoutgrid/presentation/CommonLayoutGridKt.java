package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import P9.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import Tg.b;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.common.DsAdultState;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.core.repository.UniTypographyTokenRepository;
import u0.E;
import u0.InterfaceC9893b;
import w0.C10386b;
import w0.C10392h;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u0011\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u001b\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/presentation/CommonLayoutGridVO;", "item", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CommonLayoutGrid", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/presentation/CommonLayoutGridVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "", "index", "", "isUserAnAdult", "LWZ/t;", "itemTokenizedEvent", "Item", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;IZLkotlin/jvm/functions/Function1;LWZ/t;LS0/k;I)V", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "items", "BottomText", "(ILjava/util/List;LS0/k;I)V", "Lu0/b;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;", "gridType", "InsideText", "(Lu0/b;ILjava/util/List;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonLayoutGridKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonLayoutGridDTO.GridType.values().length];
            try {
                iArr[CommonLayoutGridDTO.GridType.INVALID_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonLayoutGridDTO.GridType.GRID1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonLayoutGridDTO.GridType.GRID2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonLayoutGridDTO.GridType.GRID3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomText(int i11, List<CommonLayoutGridDTO.Item> list, InterfaceC3967k interfaceC3967k, int i12) {
        C3969l u11 = interfaceC3967k.u(-1835064933);
        CommonLayoutGridDTO.Item item = list.get(i11);
        u11.o(-872432533);
        if (item.getTitle() != null || item.getSubtitle() != null) {
            E.a(u11, a0.f(e.f40358c0, 4));
        }
        u11.k();
        u11.o(-872429603);
        if (item.getTitle() != null) {
            e e11 = a0.e(e.f40358c0, 1.0f);
            a.b(e11, SelectionItemFormDTO.TITLE_FIELD_NAME + i11);
            TextDTO title = item.getTitle();
            Integer maxLines = title.getMaxLines();
            int intValue = maxLines != null ? maxLines.intValue() : 1;
            TextPreset preset = title.getPreset();
            if (preset == null) {
                preset = TextPreset.PRESET_CUSTOM;
            }
            TextPreset textPreset = preset;
            String typographyToken = title.getTypographyToken();
            if (typographyToken == null) {
                typographyToken = UniTheme.INSTANCE.getTypographyTokens().getCompactControl400Small().getId();
            }
            String str = typographyToken;
            String textColor = title.getTextColor();
            if (textColor == null) {
                textColor = UniTheme.INSTANCE.getColorTokens().getTextPrimary().getId();
            }
            String str2 = textColor;
            TextDTO.TextAlignment textAlignment = title.getTextAlignment();
            if (textAlignment == null) {
                textAlignment = TextDTO.TextAlignment.CENTER;
            }
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(title, null, textAlignment, null, null, null, null, textPreset, str, str2, null, null, null, null, false, null, null, null, null, Integer.valueOf(intValue), 261693, null), e11, u11, 0, 0);
        }
        u11.k();
        u11.o(-872408278);
        if (item.getSubtitle() != null) {
            e e12 = a0.e(e.f40358c0, 1.0f);
            a.b(e12, "subtitle" + i11);
            TextDTO subtitle = item.getSubtitle();
            Integer maxLines2 = subtitle.getMaxLines();
            int intValue2 = maxLines2 != null ? maxLines2.intValue() : 1;
            TextPreset preset2 = subtitle.getPreset();
            if (preset2 == null) {
                preset2 = TextPreset.PRESET_CUSTOM;
            }
            TextPreset textPreset2 = preset2;
            String typographyToken2 = subtitle.getTypographyToken();
            if (typographyToken2 == null) {
                typographyToken2 = UniTheme.INSTANCE.getTypographyTokens().getCompact300XSmall().getId();
            }
            String str3 = typographyToken2;
            String textColor2 = subtitle.getTextColor();
            if (textColor2 == null) {
                textColor2 = UniTheme.INSTANCE.getColorTokens().getTextSecondary().getId();
            }
            String str4 = textColor2;
            TextDTO.TextAlignment textAlignment2 = subtitle.getTextAlignment();
            if (textAlignment2 == null) {
                textAlignment2 = TextDTO.TextAlignment.CENTER;
            }
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(subtitle, null, textAlignment2, null, null, null, null, textPreset2, str3, str4, null, null, null, null, false, null, null, null, null, Integer.valueOf(intValue2), 261693, null), e12, u11, 0, 0);
        }
        u11.k();
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonLayoutGridKt$BottomText$2(i11, list, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonLayoutGrid(@NotNull CommonLayoutGridVO item, e eVar, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super b, Unit> function12;
        CommonLayoutGridDTO layoutGrid;
        J0 m02;
        l1.J0 a11;
        Function1<? super b, Unit> function13;
        e eVar3;
        UniPaddingToken rightPadding;
        UniPaddingToken leftPadding;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-958861893);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    Function1<? super b, Unit> function14 = i14 != 0 ? null : function12;
                    layoutGrid = item.getLayoutGrid();
                    if (layoutGrid.getGridType() != CommonLayoutGridDTO.GridType.INVALID_STATE || layoutGrid.getItems().isEmpty()) {
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new CommonLayoutGridKt$CommonLayoutGrid$1$1(item, eVar4, function14, i11, i12));
                            return;
                        }
                        return;
                    }
                    CommonLayoutGridDTO.CornerRadii cornerRadii = layoutGrid.getCornerRadii();
                    if (cornerRadii == null || cornerRadii.getIsEmpty()) {
                        a11 = y0.a();
                    } else {
                        CommonLayoutGridDTO.CornerRadii cornerRadii2 = layoutGrid.getCornerRadii();
                        UniRadiusToken topLeftCornerRadius = cornerRadii2.getTopLeftCornerRadius();
                        float dp = topLeftCornerRadius != null ? TokensExtKt.getDp(topLeftCornerRadius) : UniTheme.INSTANCE.getRadii().getNone();
                        UniRadiusToken topRightCornerRadius = cornerRadii2.getTopRightCornerRadius();
                        float dp2 = topRightCornerRadius != null ? TokensExtKt.getDp(topRightCornerRadius) : UniTheme.INSTANCE.getRadii().getNone();
                        UniRadiusToken bottomLeftCornerRadius = cornerRadii2.getBottomLeftCornerRadius();
                        float dp3 = bottomLeftCornerRadius != null ? TokensExtKt.getDp(bottomLeftCornerRadius) : UniTheme.INSTANCE.getRadii().getNone();
                        UniRadiusToken bottomRightCornerRadius = cornerRadii2.getBottomRightCornerRadius();
                        a11 = h.c(dp, dp2, bottomRightCornerRadius != null ? TokensExtKt.getDp(bottomRightCornerRadius) : UniTheme.INSTANCE.getRadii().getNone(), dp3);
                    }
                    C7807Z c7807z = TokenParserKt.tokenToColor(layoutGrid.getBackgroundColor(), u11, 0);
                    u11.o(-926942265);
                    long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                    u11.k();
                    InterfaceC3978p0 b11 = n1.b(DsAdultState.INSTANCE.isUserAnAdult(), u11);
                    e h11 = a0.h(eVar4, 0.0f, 5000, 1);
                    a.b(h11, "commonLayoutGridContainer");
                    e b12 = androidx.compose.foundation.e.b(h11, layerFloor1, a11);
                    CommonLayoutGridDTO.Paddings paddings = layoutGrid.getPaddings();
                    float padding500 = (paddings == null || (leftPadding = paddings.getLeftPadding()) == null) ? UniTheme.INSTANCE.getPaddings().getPadding500() : TokensExtKt.getDp(leftPadding);
                    CommonLayoutGridDTO.Paddings paddings2 = layoutGrid.getPaddings();
                    e j11 = T.j(b12, padding500, 0.0f, (paddings2 == null || (rightPadding = paddings2.getRightPadding()) == null) ? UniTheme.INSTANCE.getPaddings().getPadding500() : TokensExtKt.getDp(rightPadding), 0.0f, 10);
                    C10386b c10386b = new C10386b(layoutGrid.getGridType().getCount());
                    int i16 = C5179b.f39454h;
                    UniPaddingToken itemsSpacing = layoutGrid.getItemsSpacing();
                    C5179b.i n11 = C5179b.n(itemsSpacing != null ? TokensExtKt.getDp(itemsSpacing) : UniTheme.INSTANCE.getPaddings().getPadding300());
                    u11.o(-165223695);
                    boolean n12 = ((i13 & 896) == 256) | u11.n(layoutGrid) | u11.n(b11) | u11.F(item);
                    Object C11 = u11.C();
                    if (n12 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CommonLayoutGridKt$CommonLayoutGrid$1$2$1(layoutGrid, function14, item, b11);
                        u11.x(C11);
                    }
                    u11.k();
                    C10392h.a(c10386b, j11, null, null, null, n11, null, false, (Function1) C11, u11, 100663296);
                    function13 = function14;
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    function13 = function12;
                }
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new CommonLayoutGridKt$CommonLayoutGrid$2(item, eVar3, function13, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            layoutGrid = item.getLayoutGrid();
            if (layoutGrid.getGridType() != CommonLayoutGridDTO.GridType.INVALID_STATE) {
            }
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        layoutGrid = item.getLayoutGrid();
        if (layoutGrid.getGridType() != CommonLayoutGridDTO.GridType.INVALID_STATE) {
        }
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonLayoutGrid$lambda$3$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InsideText(InterfaceC9893b interfaceC9893b, int i11, List<CommonLayoutGridDTO.Item> list, CommonLayoutGridDTO.GridType gridType, InterfaceC3967k interfaceC3967k, int i12) {
        CommonCellSettings.LayoutPadding layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding2;
        CommonLayoutGridDTO.GridType gridType2;
        C3969l u11 = interfaceC3967k.u(1282004207);
        CommonLayoutGridDTO.Item item = list.get(i11);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr[gridType.ordinal()];
        if (i13 == 1) {
            layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        } else if (i13 == 2) {
            layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new o();
            }
            layoutPadding = CommonCellSettings.LayoutPadding.PADDING_300;
        }
        int i14 = iArr[gridType.ordinal()];
        if (i14 == 1) {
            layoutPadding2 = CommonCellSettings.LayoutPadding.NONE;
        } else if (i14 == 2) {
            layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
        } else if (i14 == 3) {
            layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_350;
        } else {
            if (i14 != 4) {
                throw new o();
            }
            layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
        }
        e a11 = interfaceC9893b.a(e.f40358c0, InterfaceC6250b.a.o());
        TextDTO title = item.getTitle();
        if (title == null) {
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new CommonLayoutGridKt$InsideText$1$1(interfaceC9893b, i11, list, gridType, i12));
                return;
            }
            return;
        }
        Integer maxLines = title.getMaxLines();
        int intValue = maxLines != null ? maxLines.intValue() : 2;
        TextPreset preset = title.getPreset();
        if (preset == null) {
            preset = TextPreset.PRESET_CUSTOM;
        }
        TextPreset textPreset = preset;
        String typographyToken = title.getTypographyToken();
        if (typographyToken == null) {
            UniTypographyTokenRepository typographyTokens = UniTheme.INSTANCE.getTypographyTokens();
            gridType2 = gridType;
            typographyToken = (gridType2 == CommonLayoutGridDTO.GridType.GRID1 ? typographyTokens.getHeadline500Medium() : typographyTokens.getCompactControl400Small()).getId();
        } else {
            gridType2 = gridType;
        }
        String str = typographyToken;
        String textColor = title.getTextColor();
        if (textColor == null) {
            textColor = UniTheme.INSTANCE.getColorTokens().getTextPrimary().getId();
        }
        String str2 = textColor;
        TextDTO.TextAlignment textAlignment = title.getTextAlignment();
        if (textAlignment == null) {
            textAlignment = TextDTO.TextAlignment.LEADING;
        }
        TextDTO.TextAlignment textAlignment2 = textAlignment;
        CommonCellSettings.LayoutPadding leftPadding = title.getLeftPadding();
        CommonCellSettings.LayoutPadding layoutPadding3 = CommonCellSettings.LayoutPadding.NONE;
        if (leftPadding == layoutPadding3) {
            leftPadding = null;
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = leftPadding == null ? layoutPadding2 : leftPadding;
        CommonCellSettings.LayoutPadding rightPadding = title.getRightPadding();
        if (rightPadding == layoutPadding3) {
            rightPadding = null;
        }
        CommonCellSettings.LayoutPadding layoutPadding5 = rightPadding == null ? layoutPadding2 : rightPadding;
        CommonCellSettings.LayoutPadding topPadding = title.getTopPadding();
        CommonCellSettings.LayoutPadding layoutPadding6 = topPadding != layoutPadding3 ? topPadding : null;
        DsTextAtomKt.DsTextAtom(TextDTO.copy$default(title, null, textAlignment2, layoutPadding4, layoutPadding5, layoutPadding6 == null ? layoutPadding : layoutPadding6, null, textPreset, str, str2, null, null, null, null, false, null, null, null, null, Integer.valueOf(intValue), 261665, null), a11, u11, 0, 0);
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new CommonLayoutGridKt$InsideText$2(interfaceC9893b, i11, list, gridType2, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Item(CommonLayoutGridDTO commonLayoutGridDTO, int i11, boolean z11, Function1<? super b, Unit> function1, t tVar, InterfaceC3967k interfaceC3967k, int i12) {
        Function1<? super b, Unit> function12;
        ImageDTO copy;
        UniPaddingToken bottomPadding;
        UniPaddingToken topPadding;
        C3969l u11 = interfaceC3967k.u(2086380054);
        CommonLayoutGridDTO.Item item = commonLayoutGridDTO.getItems().get(i11);
        l lVar = (l) u11.m(f.e());
        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
        u11.o(2143087625);
        boolean F11 = u11.F(tVar) | u11.F(lVar);
        Object C11 = u11.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CommonLayoutGridKt$Item$1$1$1(tVar, lVar);
            u11.x(C11);
        }
        u11.k();
        i.a(aVar, null, (Function0) C11, u11, 6);
        u11.o(984574698);
        e.a aVar2 = e.f40358c0;
        CommonLayoutGridDTO.Paddings paddings = commonLayoutGridDTO.getPaddings();
        float padding200 = (paddings == null || (topPadding = paddings.getTopPadding()) == null) ? UniTheme.INSTANCE.getPaddings().getPadding200() : TokensExtKt.getDp(topPadding);
        CommonLayoutGridDTO.Paddings paddings2 = commonLayoutGridDTO.getPaddings();
        e j11 = T.j(aVar2, 0.0f, padding200, 0.0f, (paddings2 == null || (bottomPadding = paddings2.getBottomPadding()) == null) ? UniTheme.INSTANCE.getPaddings().getPadding200() : TokensExtKt.getDp(bottomPadding), 5);
        if (item.getAction() != null && function1 != null) {
            u11.o(1010387854);
            boolean n11 = ((((i12 & 7168) ^ 3072) > 2048 && u11.n(function1)) || (i12 & 3072) == 2048) | u11.n(item);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CommonLayoutGridKt$Item$1$2$1$1(function1, item);
                u11.x(C12);
            }
            u11.k();
            j11 = androidx.compose.foundation.i.c(j11, false, null, null, (Function0) C12, 7);
        }
        u11.k();
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        int I11 = u11.I();
        A0 d11 = u11.d();
        e f7 = c.f(u11, j11);
        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
            u11.H(a12);
        } else {
            u11.e();
        }
        Function2 g10 = K00.b.g(u11, a11, u11, d11);
        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
            Ep.a.d(I11, u11, I11, g10);
        }
        F1.b(u11, f7, InterfaceC2801g.a.f());
        Boolean isAdult = item.isAdult();
        Boolean bool = Boolean.TRUE;
        boolean z12 = (!Intrinsics.d(isAdult, bool) || z11 || item.getBlurPlaceholderImage() == null) ? false : true;
        V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
        int I12 = u11.I();
        A0 d12 = u11.d();
        e f12 = c.f(u11, aVar2);
        Function0 a13 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
            u11.H(a13);
        } else {
            u11.e();
        }
        Function2 f13 = T7.E.f(u11, f11, u11, d12);
        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
            Ep.a.d(I12, u11, I12, f13);
        }
        F1.b(u11, f12, InterfaceC2801g.a.f());
        C5187j c5187j = C5187j.f39515a;
        if (z12) {
            u11.o(1820342520);
            a.b(aVar2, "image" + i11);
            copy = r16.copy((r34 & 1) != 0 ? r16.image : item.getBlurPlaceholderImage(), (r34 & 2) != 0 ? r16.backgroundColor : null, (r34 & 4) != 0 ? r16.aspectRatio : null, (r34 & 8) != 0 ? r16.hasParanja : false, (r34 & 16) != 0 ? r16.layoutPaddingLeft : null, (r34 & 32) != 0 ? r16.layoutPaddingRight : null, (r34 & 64) != 0 ? r16.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r16.layoutPaddingBottom : null, (r34 & 256) != 0 ? r16.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r16.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r16.testInfo : null, (r34 & 2048) != 0 ? r16.trackingInfo : null, (r34 & 4096) != 0 ? r16.imageWidth : null, (r34 & 8192) != 0 ? r16.imageType : null, (r34 & 16384) != 0 ? r16.fitType : null, (r34 & 32768) != 0 ? item.getImage().customRatio : null);
            DsImageAtomKt.DsImageAtom(copy, aVar2, u11, 0, 0);
            AdultOverlayKt.AdultOverlay(c5187j, i11, u11, (i12 & 112) | 6);
            u11.k();
        } else {
            u11.o(1820595666);
            a.b(aVar2, "image" + i11);
            DsImageAtomKt.DsImageAtom(item.getImage(), aVar2, u11, 0, 0);
            u11.o(-356909869);
            if (item.getAdBadge() != null && !Intrinsics.d(commonLayoutGridDTO.isTextInsideCard(), bool)) {
                e a14 = c5187j.a(aVar2, InterfaceC6250b.a.n());
                UniPaddingToken badgeTopRightMargin = commonLayoutGridDTO.getBadgeTopRightMargin();
                e f14 = T.f(a14, badgeTopRightMargin != null ? TokensExtKt.getDp(badgeTopRightMargin) : UniTheme.INSTANCE.getPaddings().getPadding300());
                a.b(f14, "badge" + i11);
                BadgeDTO adBadge = item.getAdBadge();
                u11.o(-356897262);
                if (function1 == null) {
                    u11.o(-356896735);
                    Object C13 = u11.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        C13 = CommonLayoutGridKt$Item$1$3$1$1$1.INSTANCE;
                        u11.x(C13);
                    }
                    u11.k();
                    function12 = (Function1) C13;
                } else {
                    function12 = function1;
                }
                u11.k();
                DsBadgeAtomKt.DsBadgeAtom(adBadge, f14, function12, u11, 0, 0);
            }
            u11.k();
            if (Intrinsics.d(commonLayoutGridDTO.isTextInsideCard(), bool) && item.getTitle() != null) {
                InsideText(c5187j, i11, commonLayoutGridDTO.getItems(), commonLayoutGridDTO.getGridType(), u11, (i12 & 112) | 6);
            }
            u11.k();
        }
        u11.f();
        u11.o(1010426966);
        if (!Intrinsics.d(commonLayoutGridDTO.isTextInsideCard(), bool)) {
            BottomText(i11, commonLayoutGridDTO.getItems(), u11, (i12 >> 3) & 14);
        }
        u11.k();
        u11.f();
        Unit unit = Unit.f71690a;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonLayoutGridKt$Item$2(commonLayoutGridDTO, i11, z11, function1, tVar, i12));
        }
    }
}
