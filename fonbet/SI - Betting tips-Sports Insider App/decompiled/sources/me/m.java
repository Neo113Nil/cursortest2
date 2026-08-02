package me;

import android.content.Context;
import android.view.View;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.views.PredictionCard;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20662c;

    public /* synthetic */ m(Object obj, int i5, String str) {
        this.f20660a = i5;
        this.f20661b = obj;
        this.f20662c = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v5, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f20660a) {
            case 0:
                Intrinsics.checkNotNullParameter(v5, "v");
                PredictionCard predictionCard = v5 instanceof PredictionCard ? (PredictionCard) v5 : null;
                if (predictionCard != null) {
                    PredictionFragment predictionFragment = (PredictionFragment) this.f20661b;
                    int flagDefaultSize = predictionCard.getFlagDefaultSize();
                    if (flagDefaultSize > 0) {
                        v5.removeOnLayoutChangeListener(this);
                        Context context = ((PredictionCard) v5).getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        predictionFragment.Q(context, flagDefaultSize, this.f20662c);
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v5, "v");
                PredictionCard predictionCard2 = v5 instanceof PredictionCard ? (PredictionCard) v5 : null;
                if (predictionCard2 != null) {
                    PredictionFragment predictionFragment2 = (PredictionFragment) this.f20661b;
                    int flagDefaultSize2 = predictionCard2.getFlagDefaultSize();
                    if (flagDefaultSize2 > 0) {
                        v5.removeOnLayoutChangeListener(this);
                        Context context2 = ((PredictionCard) v5).getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        predictionFragment2.R(context2, flagDefaultSize2, this.f20662c);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v5, "v");
                ve.f0 f0Var = v5 instanceof ve.f0 ? (ve.f0) v5 : null;
                if (f0Var != null) {
                    re.k kVar = (re.k) this.f20661b;
                    int widthSize = f0Var.getWidthSize();
                    int heightSize = f0Var.getHeightSize();
                    if (widthSize > 0 && heightSize > 0) {
                        v5.removeOnLayoutChangeListener(this);
                        Context context3 = ((ve.f0) v5).getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        kVar.c(context3, this.f20662c, widthSize, heightSize);
                        break;
                    }
                }
                break;
        }
    }
}
