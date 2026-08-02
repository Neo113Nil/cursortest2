package ru.ozon.app.android.pdp.widgets.richContent.core;

import WZ.t;
import android.content.Context;
import android.content.res.TypedArray;
import i.C6977a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.ImagePositionVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.TileVO;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001c\u001a\u00020\u0005*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0018\u0010\u001e\u001a\u00020\u0005*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d\"\u0018\u0010\u001f\u001a\u00020\u0005*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;", "", "widgetId", "", "screenWidthWithMargins", "", "isSelect", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Billboard;", "toVoBillboard", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;JIZ)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Billboard;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$SpacerDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "toVoSpacer", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$SpacerDTO;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Text;", "toVoText", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Text;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;", "toVoDoubleTile", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;JZ)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "toVoListItem", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;Landroid/content/Context;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "isBulletList", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;)Z", "isImageList", "isNumberList", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentMapperExtKt {
    public static final boolean isBulletList(@NotNull RichContentDTO.Content.ListItemDTO listItemDTO) {
        Intrinsics.checkNotNullParameter(listItemDTO, "<this>");
        return listItemDTO.getImage() == null && listItemDTO.getNumber() == null;
    }

    public static final boolean isImageList(@NotNull RichContentDTO.Content.ListItemDTO listItemDTO) {
        Intrinsics.checkNotNullParameter(listItemDTO, "<this>");
        return listItemDTO.getImage() != null && listItemDTO.getNumber() == null;
    }

    public static final boolean isNumberList(@NotNull RichContentDTO.Content.ListItemDTO listItemDTO) {
        Intrinsics.checkNotNullParameter(listItemDTO, "<this>");
        return listItemDTO.getImage() == null && listItemDTO.getNumber() != null;
    }

    @NotNull
    public static final RichContentVO.Item.Billboard toVoBillboard(@NotNull RichContentDTO.Content.BillboardDTO billboardDTO, long j11, int i11, boolean z11) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(billboardDTO, "<this>");
        boolean z12 = billboardDTO.getRatio() > 1.5d;
        int ratio = (int) (billboardDTO.getRatio() * i11);
        String image = billboardDTO.getImage();
        if (z11) {
            AtomActionDTO action2 = billboardDTO.getAction();
            if (action2 != null) {
                String link = billboardDTO.getAction().getLink();
                action = AtomActionDTO.copy$default(action2, null, link != null ? UriExtKt.replaceUriForSelect(link) : null, null, null, null, 29, null);
            } else {
                action = null;
            }
        } else {
            action = billboardDTO.getAction();
        }
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, billboardDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = billboardDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        ImagePositionVO vo = RichContentUtilsKt.toVo(billboardDTO.getImagePosition());
        Boolean isParandja = billboardDTO.isParandja();
        return new RichContentVO.Item.Billboard(image, ratio, i11, atomAction, tokenizedEvent$default, vo, isParandja != null ? isParandja.booleanValue() : true, z12);
    }

    @NotNull
    public static final RichContentVO.Item.DoubleTile toVoDoubleTile(@NotNull RichContentDTO.Content.DoubleTileDTO doubleTileDTO, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(doubleTileDTO, "<this>");
        TileVO voDoubleTile$toVo = toVoDoubleTile$toVo(doubleTileDTO.getLeft(), z11, j11);
        RichContentDTO.Content.DoubleTileDTO.Tile right = doubleTileDTO.getRight();
        return new RichContentVO.Item.DoubleTile(voDoubleTile$toVo, right != null ? toVoDoubleTile$toVo(right, z11, j11) : null);
    }

    private static final TileVO toVoDoubleTile$toVo(RichContentDTO.Content.DoubleTileDTO.Tile tile, boolean z11, long j11) {
        AtomActionDTO action;
        int px = ResourceExtKt.toPx(Dimens.INSTANCE.getDP_8());
        int i11 = tile.getText() == null ? px * 3 : px;
        String image = tile.getImage();
        RichContentDTO.AlignedText title = tile.getTitle();
        TextDTO alignedVO = title != null ? RichContentUtilsKt.getAlignedVO(title) : null;
        RichContentDTO.AlignedText text = tile.getText();
        TextDTO alignedVO2 = text != null ? RichContentUtilsKt.getAlignedVO(text) : null;
        if (z11) {
            AtomActionDTO action2 = tile.getAction();
            if (action2 != null) {
                String link = tile.getAction().getLink();
                action = AtomActionDTO.copy$default(action2, null, link != null ? UriExtKt.replaceUriForSelect(link) : null, null, null, null, 29, null);
            } else {
                action = null;
            }
        } else {
            action = tile.getAction();
        }
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, tile.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = tile.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        ImagePositionVO vo = RichContentUtilsKt.toVo(tile.getImagePosition());
        Boolean isParandja = tile.isParandja();
        return new TileVO(image, alignedVO2, alignedVO, i11, atomAction, tokenizedEvent$default, vo, isParandja != null ? isParandja.booleanValue() : true);
    }

    @NotNull
    public static final RichContentVO.Item.ListItem toVoListItem(@NotNull RichContentDTO.Content.ListItemDTO listItemDTO, @NotNull Context context) {
        String textStyle;
        TextAtom text;
        String textColor;
        TextAtom text2;
        TextAtom text3;
        TextAtom text4;
        Intrinsics.checkNotNullParameter(listItemDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isImageList(listItemDTO)) {
            RichContentDTO.AlignedText title = listItemDTO.getTitle();
            TextDTO alignedVO = title != null ? RichContentUtilsKt.getAlignedVO(title) : null;
            RichContentDTO.AlignedText text5 = listItemDTO.getText();
            TextDTO alignedVO2 = text5 != null ? RichContentUtilsKt.getAlignedVO(text5) : null;
            String image = listItemDTO.getImage();
            ImagePositionVO vo = RichContentUtilsKt.toVo(listItemDTO.getImagePosition());
            Boolean isParandja = listItemDTO.isParandja();
            return new RichContentVO.Item.ListItem.ImageList(alignedVO, alignedVO2, image, vo, isParandja != null ? isParandja.booleanValue() : true);
        }
        if (isNumberList(listItemDTO)) {
            String str = listItemDTO.getNumber() + ".";
            Pair pair = listItemDTO.getTitle() != null ? new Pair(listItemDTO.getTitle().getText().getTextColor(), listItemDTO.getTitle().getText().getTextStyle()) : listItemDTO.getText() != null ? new Pair(listItemDTO.getText().getText().getTextColor(), listItemDTO.getText().getText().getTextStyle()) : new Pair(UniColors.TEXT_PRIMARY.getToken(), StyleParser.TextStyle.BODY_M.getStyleName());
            String str2 = (String) pair.a();
            String str3 = (String) pair.b();
            RichContentDTO.AlignedText title2 = listItemDTO.getTitle();
            TextDTO alignedVO3 = title2 != null ? RichContentUtilsKt.getAlignedVO(title2) : null;
            RichContentDTO.AlignedText text6 = listItemDTO.getText();
            return new RichContentVO.Item.ListItem.NumberList(alignedVO3, text6 != null ? RichContentUtilsKt.getAlignedVO(text6) : null, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, null, null, null, str3, str2, null, null, null, null, false, null, null, null, null, 1, 261758, null));
        }
        RichContentDTO.AlignedText title3 = listItemDTO.getTitle();
        if (title3 == null || (text4 = title3.getText()) == null || (textStyle = text4.getTextStyle()) == null) {
            RichContentDTO.AlignedText text7 = listItemDTO.getText();
            textStyle = (text7 == null || (text = text7.getText()) == null) ? null : text.getTextStyle();
        }
        RichContentDTO.AlignedText title4 = listItemDTO.getTitle();
        if (title4 == null || (text3 = title4.getText()) == null || (textColor = text3.getTextColor()) == null) {
            RichContentDTO.AlignedText text8 = listItemDTO.getText();
            textColor = (text8 == null || (text2 = text8.getText()) == null) ? null : text2.getTextColor();
        }
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(textStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Caption, C6977a.f65670x);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        float f7 = dimension / 2;
        RichContentDTO.AlignedText title5 = listItemDTO.getTitle();
        TextDTO alignedVO4 = title5 != null ? RichContentUtilsKt.getAlignedVO(title5) : null;
        RichContentDTO.AlignedText text9 = listItemDTO.getText();
        TextDTO alignedVO5 = text9 != null ? RichContentUtilsKt.getAlignedVO(text9) : null;
        int i11 = (int) f7;
        if (textColor == null) {
            textColor = UniColors.TEXT_PRIMARY.getToken();
        }
        return new RichContentVO.Item.ListItem.BulletList(alignedVO4, alignedVO5, i11, textColor, (int) (f7 / 1.5d));
    }

    @NotNull
    public static final RichContentVO.Item.Spacer toVoSpacer(@NotNull RichContentDTO.Content.SpacerDTO spacerDTO) {
        Intrinsics.checkNotNullParameter(spacerDTO, "<this>");
        return new RichContentVO.Item.Spacer(ResourceExtKt.toPx(spacerDTO.getHeight()), spacerDTO.getBackgroundColor());
    }

    @NotNull
    public static final RichContentVO.Item.Text toVoText(@NotNull RichContentDTO.Content.TextDTO textDTO) {
        Pair pair;
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        if (textDTO.getBackgroundColor() == null) {
            pair = new Pair(UniColors.LAYER_FLOOR_1.getToken(), 0);
        } else {
            String backgroundColor = textDTO.getBackgroundColor();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = backgroundColor.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            pair = new Pair(lowerCase, Integer.valueOf(Dimens.INSTANCE.getDP_16()));
        }
        return new RichContentVO.Item.Text(RichContentUtilsKt.getAlignedVO(textDTO.getText()), (String) pair.a(), ((Number) pair.b()).intValue());
    }
}
