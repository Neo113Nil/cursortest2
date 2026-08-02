package me;

import android.content.Context;
import android.view.View;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.views.TelegramBannerView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PredictionFragment f20657b;

    public /* synthetic */ k(PredictionFragment predictionFragment, int i5) {
        this.f20656a = i5;
        this.f20657b = predictionFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v5, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f20656a) {
            case 0:
                Intrinsics.checkNotNullParameter(v5, "v");
                if (i11 - i5 > 0 && i12 - i10 > 0) {
                    TelegramBannerView telegramBannerView = v5 instanceof TelegramBannerView ? (TelegramBannerView) v5 : null;
                    if (telegramBannerView != null) {
                        int widthSizeTg = telegramBannerView.getWidthSizeTg();
                        int heightSizeTg = telegramBannerView.getHeightSizeTg();
                        if (widthSizeTg > 0 && heightSizeTg > 0) {
                            v5.removeOnLayoutChangeListener(this);
                            Context context = ((TelegramBannerView) v5).getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            this.f20657b.W(context, widthSizeTg, heightSizeTg);
                            break;
                        }
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v5, "v");
                if (i11 - i5 > 0 && i12 - i10 > 0) {
                    TelegramBannerView telegramBannerView2 = v5 instanceof TelegramBannerView ? (TelegramBannerView) v5 : null;
                    if (telegramBannerView2 != null) {
                        int widthSizeSi = telegramBannerView2.getWidthSizeSi();
                        int heightSizeSi = telegramBannerView2.getHeightSizeSi();
                        if (widthSizeSi > 0 && heightSizeSi > 0) {
                            v5.removeOnLayoutChangeListener(this);
                            Context context2 = ((TelegramBannerView) v5).getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            this.f20657b.V(context2, widthSizeSi, heightSizeSi);
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v5, "v");
                if (i11 - i5 > 0 && i12 - i10 > 0) {
                    TelegramBannerView telegramBannerView3 = v5 instanceof TelegramBannerView ? (TelegramBannerView) v5 : null;
                    if (telegramBannerView3 != null) {
                        int widthSizeFt = telegramBannerView3.getWidthSizeFt();
                        int heightSizeFt = telegramBannerView3.getHeightSizeFt();
                        if (widthSizeFt > 0 && heightSizeFt > 0) {
                            v5.removeOnLayoutChangeListener(this);
                            Context context3 = ((TelegramBannerView) v5).getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            this.f20657b.N(context3, widthSizeFt, heightSizeFt);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
