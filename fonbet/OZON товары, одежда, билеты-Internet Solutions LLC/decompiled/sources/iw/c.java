package iw;

import android.animation.TypeEvaluator;
import kotlin.Pair;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        Pair cornersEvaluator$lambda$8;
        cornersEvaluator$lambda$8 = FakeSearchViewController.cornersEvaluator$lambda$8(f7, (Pair) obj, (Pair) obj2);
        return cornersEvaluator$lambda$8;
    }
}
