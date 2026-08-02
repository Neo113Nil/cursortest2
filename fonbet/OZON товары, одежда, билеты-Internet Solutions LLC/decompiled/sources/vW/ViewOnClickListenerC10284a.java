package vW;

import android.view.View;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.AnswerListAdapter;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;

/* renamed from: vW.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10284a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f102707d;

    public /* synthetic */ ViewOnClickListenerC10284a(Object obj, Object obj2, Object obj3, int i11) {
        this.f102704a = i11;
        this.f102705b = obj;
        this.f102706c = obj2;
        this.f102707d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102704a) {
            case 0:
                AnswerListAdapter.onBindViewHolder$lambda$3$lambda$2$lambda$1((TagButtonView) this.f102705b, (AnswerListAdapter) this.f102706c, (ReviewFormQuestionsVO.QuestionVO.AnswerVO) this.f102707d, view);
                break;
            default:
                ProductsToPayWidgetViewHolder.bindCounter$lambda$9$lambda$7((ProductsToPayVO.ProductCounterVO) this.f102705b, (ProductsToPayWidgetViewHolder) this.f102706c, (String) this.f102707d, view);
                break;
        }
    }
}
