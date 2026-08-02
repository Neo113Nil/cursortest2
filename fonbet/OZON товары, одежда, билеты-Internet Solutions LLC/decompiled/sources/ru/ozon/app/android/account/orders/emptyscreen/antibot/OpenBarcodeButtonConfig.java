package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import Hj.C3143a;
import Lk.a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.AntibotEmptyActivity;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/OpenBarcodeButtonConfig;", "", "<init>", "()V", "antibotFrameForHostProvider", "Lkotlin/Function1;", "Landroid/widget/FrameLayout;", "", "getAntibotFrameForHostProvider", "()Lkotlin/jvm/functions/Function1;", "createButton", "frameLayout", "barcode", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "createIconDto", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "createTextDto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenBarcodeButtonConfig {

    @NotNull
    private final Function1<FrameLayout, Unit> antibotFrameForHostProvider = new OpenBarcodeButtonConfig$antibotFrameForHostProvider$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final void createButton(FrameLayout frameLayout, BarcodeData barcode) {
        Context context = frameLayout.getContext();
        Intrinsics.f(context);
        int px = UiExtKt.toPx(12, context);
        final float pxF = ResourceExtKt.toPxF(24, context);
        View.OnClickListener aVar = new a(0, context, barcode);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(0);
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig$createButton$container$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), pxF);
            }
        });
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.BG_PREMIUM_PRIMARY_INVERTED;
        linearLayout.setBackgroundColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, px, px);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOnClickListener(aVar);
        int px2 = UiExtKt.toPx(6, context);
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(px2, px2, 0, px2);
        iconView.setLayoutParams(layoutParams2);
        IconHolderKt.bind$default(iconView, createIconDto(), null, 2, null);
        iconView.setOnClickListener(aVar);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextHolderKt.bind$default(textAtomV2View, createTextDto(), null, 2, null);
        textAtomV2View.setOnClickListener(aVar);
        linearLayout.addView(iconView);
        linearLayout.addView(textAtomV2View);
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButton$lambda$0(Context context, BarcodeData barcodeData, View view) {
        AntibotEmptyActivity.Companion companion = AntibotEmptyActivity.INSTANCE;
        Intrinsics.f(context);
        context.startActivity(companion.createIntent(context, barcodeData));
    }

    private final IconDTO createIconDto() {
        return new IconDTO(IconDTO.IconSize.SIZE_400, Boolean.TRUE, IconDTO.IconShape.CIRCLE, null, new CommonAtomIconDTO("ic_m_barcode", UniColors.GRAPHIC_LIGHT_KEY.getToken()), null, UniColors.GRAPHIC_ACCENT_PRIMARY_INVERTED.getToken(), null, null, UniColors.GRAPHIC_PREMIUM.getToken(), 2, null, null, null, null, null, 63912, null);
    }

    private final TextDTO createTextDto() {
        OzonSpannableString ozonSpannableString = new OzonSpannableString(StringProvider.getString(R$string.antibot_screen_open_barcode_button));
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_200;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_400;
        return new TextDTO(ozonSpannableString, null, layoutPadding, layoutPadding2, layoutPadding2, layoutPadding2, TextPreset.PRESET_CUSTOM, "tsCompactControl500Medium", UniColors.TEXT_PRIMARY_INVERTED.getToken(), null, null, null, null, false, null, null, null, null, 0, 261634, null);
    }

    @NotNull
    public final Function1<FrameLayout, Unit> getAntibotFrameForHostProvider() {
        return this.antibotFrameForHostProvider;
    }
}
