package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.chat.view.ChatMessageInputView;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kr2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMessageInputView b;

    public /* synthetic */ kr2(ChatMessageInputView chatMessageInputView, int i) {
        this.a = i;
        this.b = chatMessageInputView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        ChatMessageInputView chatMessageInputView = this.b;
        animator.getClass();
        switch (i) {
            case 0:
                Iterator it = chatMessageInputView.t.iterator();
                while (it.hasNext()) {
                    ((ImageView) it.next()).setVisibility(8);
                }
                break;
            case 1:
            case 2:
                break;
            default:
                ((ImageView) chatMessageInputView.d.f).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        ChatMessageInputView chatMessageInputView = this.b;
        animator.getClass();
        switch (i) {
            case 1:
                js2 js2Var = chatMessageInputView.d;
                ImageView imageView = (ImageView) js2Var.f;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    break;
                } else {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.setMarginEnd(0);
                    imageView.setLayoutParams(layoutParams2);
                    ((ImageView) js2Var.f).setVisibility(0);
                    break;
                }
            case 2:
                Iterator it = chatMessageInputView.t.iterator();
                while (it.hasNext()) {
                    ImageView imageView2 = (ImageView) it.next();
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    if (layoutParams3 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams.width = 0;
                        marginLayoutParams.setMarginEnd(0);
                        imageView2.setLayoutParams(marginLayoutParams);
                        imageView2.setVisibility(0);
                    }
                }
                break;
        }
    }
}
