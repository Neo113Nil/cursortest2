package ru.ozon.android.messenger.blocks.messagetext;

import Sc.s;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.utils.view.TightTextView;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.messagetext.MessageTextView$setupText$2$1", f = "MessageTextView.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85878d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TightTextView f85879e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Spannable f85880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(TightTextView tightTextView, Spannable spannable, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f85879e = tightTextView;
        this.f85880f = spannable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f85879e, this.f85880f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85878d;
        TightTextView tightTextView = this.f85879e;
        if (i11 == 0) {
            s.b(obj);
            Intrinsics.f(tightTextView);
            this.f85878d = 1;
            if (ru.ozon.android.messenger.utils.view.n.b(tightTextView, this.f85880f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Context context = tightTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ru.ozon.android.messenger.utils.h.b(context)) {
            Intrinsics.checkNotNullParameter(tightTextView, "<this>");
            SpannableString spannableString = new SpannableString(tightTextView.getText());
            Iterator a11 = C7721c.a(spannableString.getSpans(0, spannableString.length(), URLSpan.class));
            while (a11.hasNext()) {
                URLSpan uRLSpan = (URLSpan) a11.next();
                spannableString.setSpan(new ru.ozon.android.messenger.utils.view.o(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
            }
            tightTextView.setText(spannableString);
        }
        return Unit.f71690a;
    }
}
