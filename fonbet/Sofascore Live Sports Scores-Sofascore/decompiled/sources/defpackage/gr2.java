package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.chat.view.ChatMessageInputView;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gr2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ ChatMessageInputView c;

    public /* synthetic */ gr2(ValueAnimator valueAnimator, ChatMessageInputView chatMessageInputView, int i) {
        this.a = i;
        this.b = valueAnimator;
        this.c = chatMessageInputView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        int intValue;
        int i = this.a;
        ChatMessageInputView chatMessageInputView = this.c;
        ValueAnimator valueAnimator2 = this.b;
        switch (i) {
            case 0:
                int i2 = ChatMessageInputView.x;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                intValue = num != null ? num.intValue() : 0;
                Iterator it = chatMessageInputView.t.iterator();
                while (it.hasNext()) {
                    ImageView imageView = (ImageView) it.next();
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.width = intValue;
                        int i3 = chatMessageInputView.v;
                        marginLayoutParams.setMarginEnd((i3 * intValue) / i3);
                        imageView.setLayoutParams(marginLayoutParams);
                    }
                }
                break;
            case 1:
                int i4 = ChatMessageInputView.x;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                num = animatedValue2 instanceof Integer ? (Integer) animatedValue2 : null;
                intValue = num != null ? num.intValue() : 0;
                ImageView imageView2 = (ImageView) chatMessageInputView.d.f;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    break;
                } else {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = intValue;
                    Context context = chatMessageInputView.getContext();
                    context.getClass();
                    if (intValue <= ao2.s(16, context)) {
                        layoutParams3.setMarginEnd(intValue);
                    }
                    imageView2.setLayoutParams(layoutParams3);
                    break;
                }
            case 2:
                int i5 = ChatMessageInputView.x;
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator2.getAnimatedValue();
                num = animatedValue3 instanceof Integer ? (Integer) animatedValue3 : null;
                intValue = num != null ? num.intValue() : 0;
                Iterator it2 = chatMessageInputView.t.iterator();
                while (it2.hasNext()) {
                    ImageView imageView3 = (ImageView) it2.next();
                    ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
                    if (layoutParams4 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.width = intValue;
                        if (intValue <= chatMessageInputView.u) {
                            marginLayoutParams2.setMarginEnd(intValue);
                        }
                        imageView3.setLayoutParams(marginLayoutParams2);
                    }
                }
                break;
            default:
                int i6 = ChatMessageInputView.x;
                valueAnimator.getClass();
                Object animatedValue4 = valueAnimator2.getAnimatedValue();
                num = animatedValue4 instanceof Integer ? (Integer) animatedValue4 : null;
                intValue = num != null ? num.intValue() : 0;
                ImageView imageView4 = (ImageView) chatMessageInputView.d.f;
                ViewGroup.LayoutParams layoutParams5 = imageView4.getLayoutParams();
                if (layoutParams5 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams3.width = intValue;
                    int i7 = chatMessageInputView.v;
                    marginLayoutParams3.setMarginEnd((intValue * i7) / i7);
                    imageView4.setLayoutParams(marginLayoutParams3);
                    break;
                }
        }
    }
}
