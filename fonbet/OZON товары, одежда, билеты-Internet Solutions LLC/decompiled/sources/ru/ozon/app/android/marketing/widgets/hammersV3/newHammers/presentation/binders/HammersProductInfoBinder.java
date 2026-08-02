package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolderKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammerPriceV3DTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyViewBuilder;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammersProductInfoBinder;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductPropertyBinder;", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "priceInfo", "", "bindPriceInfo", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "hammerProduct", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "recycle", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersProductInfoBinder extends HammerProductPropertyBinder {
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindPriceInfo(HammerPriceV3DTO priceInfo) {
        boolean z11;
        TextAtomV2View hammerTextTop;
        HammersBodyViewBuilder hammersBodyViewBuilder;
        HammersBodyView rootView;
        boolean z12;
        PriceAtomView hammerDiscount;
        HammersBodyView rootView2;
        TextAtomV2View hammerTextMiddle;
        HammersBodyView rootView3;
        boolean z13;
        PriceAtomView hammerPrice;
        HammersBodyView rootView4;
        boolean z14;
        TextAtomV2View hammerLabel;
        HammersBodyView rootView5;
        boolean z15;
        StockBarView hammerStockBar;
        HammersBodyView rootView6;
        StockBar stockBar;
        StockBar stockBar2;
        HammersBodyView hammersBodyView;
        HammersBodyView hammersBodyView2;
        HammersBodyView hammersBodyView3;
        HammersBodyView hammersBodyView4;
        HammersBodyView hammersBodyView5;
        HammersBodyView hammersBodyView6;
        boolean z16 = (priceInfo != null ? priceInfo.getTextTop() : null) != null;
        boolean z17 = (priceInfo != null ? priceInfo.getTextMiddle() : null) != null;
        if ((priceInfo != null ? priceInfo.getPrice() : null) == null) {
            if ((priceInfo != null ? priceInfo.getDiscount() : null) == null) {
                z11 = false;
                HammersBodyView rootView7 = getRootView();
                hammerTextTop = rootView7 == null ? rootView7.getHammerTextTop() : null;
                hammersBodyViewBuilder = HammersBodyViewBuilder.INSTANCE;
                if (z16 && hammerTextTop == null) {
                    hammersBodyView6 = ((HammerProductPropertyBinder) this).rootView;
                    hammerTextTop = hammersBodyView6 == null ? hammersBodyViewBuilder.buildTopText(hammersBodyView6) : null;
                }
                rootView = getRootView();
                if (rootView != null) {
                    rootView.setHammerTextTop(hammerTextTop);
                }
                if (hammerTextTop != null) {
                    TextHolderKt.bindOrGone$default(hammerTextTop, priceInfo != null ? priceInfo.getTextTop() : null, null, 2, null);
                }
                z12 = (priceInfo == null ? priceInfo.getDiscount() : null) == null;
                HammersBodyView rootView8 = getRootView();
                hammerDiscount = rootView8 == null ? rootView8.getHammerDiscount() : null;
                if (z12 && hammerDiscount == null) {
                    hammersBodyView5 = ((HammerProductPropertyBinder) this).rootView;
                    hammerDiscount = hammersBodyView5 == null ? hammersBodyViewBuilder.buildPriceWithDiscount(hammersBodyView5, z16) : null;
                }
                rootView2 = getRootView();
                if (rootView2 != null) {
                    rootView2.setHammerDiscount(hammerDiscount);
                }
                if (hammerDiscount != null) {
                    PriceAtomHolderKt.bindOrGone$default(hammerDiscount, priceInfo != null ? priceInfo.getDiscount() : null, null, 2, null);
                }
                HammersBodyView rootView9 = getRootView();
                hammerTextMiddle = rootView9 == null ? rootView9.getHammerTextMiddle() : null;
                if (z17 && hammerTextMiddle == null) {
                    hammersBodyView4 = ((HammerProductPropertyBinder) this).rootView;
                    if (hammersBodyView4 == null) {
                        hammerTextMiddle = hammersBodyViewBuilder.buildMiddleText(hammersBodyView4, (priceInfo != null ? priceInfo.getDiscount() : null) != null);
                    } else {
                        hammerTextMiddle = null;
                    }
                }
                rootView3 = getRootView();
                if (rootView3 != null) {
                    rootView3.setHammerTextMiddle(hammerTextMiddle);
                }
                if (hammerTextMiddle != null) {
                    TextHolderKt.bindOrGone$default(hammerTextMiddle, priceInfo != null ? priceInfo.getTextMiddle() : null, null, 2, null);
                }
                z13 = (priceInfo == null ? priceInfo.getPrice() : null) == null;
                HammersBodyView rootView10 = getRootView();
                hammerPrice = rootView10 == null ? rootView10.getHammerPrice() : null;
                if (z13 && hammerPrice == null) {
                    hammersBodyView3 = ((HammerProductPropertyBinder) this).rootView;
                    hammerPrice = hammersBodyView3 == null ? hammersBodyViewBuilder.buildPrice(hammersBodyView3, z17) : null;
                }
                rootView4 = getRootView();
                if (rootView4 != null) {
                    rootView4.setHammerPrice(hammerPrice);
                }
                if (hammerPrice != null) {
                    PriceAtomHolderKt.bindOrGone$default(hammerPrice, priceInfo != null ? priceInfo.getPrice() : null, null, 2, null);
                }
                z14 = (priceInfo == null ? priceInfo.getLabel() : null) == null;
                HammersBodyView rootView11 = getRootView();
                hammerLabel = rootView11 == null ? rootView11.getHammerLabel() : null;
                if (z14 && hammerLabel == null) {
                    hammersBodyView2 = ((HammerProductPropertyBinder) this).rootView;
                    hammerLabel = hammersBodyView2 == null ? hammersBodyViewBuilder.buildLabel(hammersBodyView2, z11) : null;
                }
                rootView5 = getRootView();
                if (rootView5 != null) {
                    rootView5.setHammerLabel(hammerLabel);
                }
                if (hammerLabel != null) {
                    TextHolderKt.bindOrGone$default(hammerLabel, priceInfo != null ? priceInfo.getLabel() : null, null, 2, null);
                }
                z15 = (priceInfo == null ? priceInfo.getStockBar() : null) != null;
                HammersBodyView rootView12 = getRootView();
                hammerStockBar = rootView12 == null ? rootView12.getHammerStockBar() : null;
                if (z15 && hammerStockBar == null) {
                    hammersBodyView = ((HammerProductPropertyBinder) this).rootView;
                    hammerStockBar = hammersBodyView == null ? hammersBodyViewBuilder.placeStockBar(hammersBodyView) : null;
                }
                rootView6 = getRootView();
                if (rootView6 != null) {
                    rootView6.setHammerStockBar(hammerStockBar);
                }
                if (hammerStockBar == null) {
                    if (priceInfo == null || (stockBar2 = priceInfo.getStockBar()) == null) {
                        stockBar = null;
                    } else {
                        StyleParser styleParser = StyleParser.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(hammerStockBar.getContext(), "getContext(...)");
                        stockBar = StockBar.copy$default(stockBar2, null, 0, null, null, null, null, Color.alpha(styleParser.parseColor(r3, stockBar2.getStockBarBackgroundColor(), UniColors.BG_ACCENT_PRIMARY.getResId())) / 255.0f, false, null, null, 959, null);
                    }
                    StockBarHolderKt.bindOrGone$default(hammerStockBar, stockBar, null, 2, null);
                    return;
                }
                return;
            }
        }
        z11 = true;
        HammersBodyView rootView72 = getRootView();
        if (rootView72 == null) {
        }
        hammersBodyViewBuilder = HammersBodyViewBuilder.INSTANCE;
        if (z16) {
            hammersBodyView6 = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView6 == null) {
            }
        }
        rootView = getRootView();
        if (rootView != null) {
        }
        if (hammerTextTop != null) {
        }
        if ((priceInfo == null ? priceInfo.getDiscount() : null) == null) {
        }
        HammersBodyView rootView82 = getRootView();
        if (rootView82 == null) {
        }
        if (z12) {
            hammersBodyView5 = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView5 == null) {
            }
        }
        rootView2 = getRootView();
        if (rootView2 != null) {
        }
        if (hammerDiscount != null) {
        }
        HammersBodyView rootView92 = getRootView();
        if (rootView92 == null) {
        }
        if (z17) {
            hammersBodyView4 = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView4 == null) {
            }
        }
        rootView3 = getRootView();
        if (rootView3 != null) {
        }
        if (hammerTextMiddle != null) {
        }
        if ((priceInfo == null ? priceInfo.getPrice() : null) == null) {
        }
        HammersBodyView rootView102 = getRootView();
        if (rootView102 == null) {
        }
        if (z13) {
            hammersBodyView3 = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView3 == null) {
            }
        }
        rootView4 = getRootView();
        if (rootView4 != null) {
        }
        if (hammerPrice != null) {
        }
        if ((priceInfo == null ? priceInfo.getLabel() : null) == null) {
        }
        HammersBodyView rootView112 = getRootView();
        if (rootView112 == null) {
        }
        if (z14) {
            hammersBodyView2 = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView2 == null) {
            }
        }
        rootView5 = getRootView();
        if (rootView5 != null) {
        }
        if (hammerLabel != null) {
        }
        if ((priceInfo == null ? priceInfo.getStockBar() : null) != null) {
        }
        HammersBodyView rootView122 = getRootView();
        if (rootView122 == null) {
        }
        if (z15) {
            hammersBodyView = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView == null) {
            }
        }
        rootView6 = getRootView();
        if (rootView6 != null) {
        }
        if (hammerStockBar == null) {
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder
    public void bind(@NotNull HammersV3BodyVO hammerProduct, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(hammerProduct, "hammerProduct");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(hammerProduct, info, holder);
        bindPriceInfo(hammerProduct.getHammerPrice());
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder
    public void recycle() {
        bindPriceInfo(null);
    }
}
