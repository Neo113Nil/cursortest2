package eF;

import android.view.KeyEvent;
import android.widget.TextView;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainViewHolder;
import ru.ozon.app.android.pdp.databinding.PdpWidgetWholesaleInputButtonBinding;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder;

/* renamed from: eF.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C6328c implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62054b;

    public /* synthetic */ C6328c(Object obj, int i11) {
        this.f62053a = i11;
        this.f62054b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean lambda$6$lambda$5$lambda$3;
        boolean bind$lambda$1;
        switch (this.f62053a) {
            case 0:
                lambda$6$lambda$5$lambda$3 = WholesaleInputButtonWidgetViewHolder.lambda$6$lambda$5$lambda$3((PdpWidgetWholesaleInputButtonBinding) this.f62054b, textView, i11, keyEvent);
                return lambda$6$lambda$5$lambda$3;
            default:
                bind$lambda$1 = FeedbackCurtainViewHolder.bind$lambda$1((FeedbackCurtainViewHolder) this.f62054b, textView, i11, keyEvent);
                return bind$lambda$1;
        }
    }
}
