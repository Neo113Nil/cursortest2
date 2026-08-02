package ks;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.csma.tips.databinding.WidgetCourierTipsDetailsNoUiBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressViewMapper;

/* renamed from: ks.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C7753a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71995b;

    public /* synthetic */ C7753a(Object obj, int i11) {
        this.f71994a = i11;
        this.f71995b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$1;
        switch (this.f71994a) {
            case 0:
                createHolder$lambda$2 = TipCourierReviewOverlayViewMapper.createHolder$lambda$2((WidgetCourierTipsDetailsNoUiBinding) this.f71995b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$1 = ReviewFormPointsProgressViewMapper.createHolder$lambda$1((i) this.f71995b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
        }
    }
}
