package ag;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.MobilistenUtil;
import java.text.Bidi;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5886l;
import og.AbstractC5892d;

/* renamed from: ag.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1966f0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public AppCompatImageView f15629Q4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1966f0(View view, ConstraintLayout currentLayoutParent, cg.e eVar) {
        super(view, eVar);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(currentLayoutParent, "currentLayoutParent");
        super.K1(currentLayoutParent);
        TextView O02 = O0();
        if (O02 != null) {
            O02.setOnLongClickListener(t0());
        }
    }

    public final void Y1(SalesIQChat salesIQChat, Message message) {
        Message message2;
        Intrinsics.checkNotNullParameter(message, "message");
        F1(salesIQChat, message);
        TextView O02 = O0();
        if (O02 != null) {
            O02.setVisibility(0);
        }
        if (x1()) {
            if (Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE)) {
                ImageView s02 = s0();
                if (s02 != null) {
                    og.p.n(s02);
                }
            } else {
                ImageView s03 = s0();
                if (s03 != null) {
                    og.p.w(s03);
                }
            }
            message2 = message;
            H.s1(this, message2, false, null, 6, null);
        } else {
            message2 = message;
            ImageView s04 = s0();
            if (s04 != null) {
                s04.setVisibility(8);
            }
        }
        if (!Intrinsics.areEqual(message2.isDeleted(), Boolean.TRUE) && message2.getContent() == null) {
            a2();
            return;
        }
        P1(message2);
        if (!w1()) {
            a2();
            return;
        }
        if (message2.getMeta() == null || !(message2.getMeta().getMetaType() == Message.Meta.b.ContentModerationWaring || message2.getMeta().getMetaType() == Message.Meta.b.ContentModerationClose || message2.getMeta().getMetaType() == Message.Meta.b.ContentModerationBlock)) {
            a2();
            return;
        }
        Z1();
        b2();
        TextView O03 = O0();
        if (O03 != null) {
            O03.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(R.attr.textColorSecondary), 0.0f, 2, null));
        }
    }

    public final AppCompatImageView Z1() {
        AppCompatImageView appCompatImageView = this.f15629Q4;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(d0());
        appCompatImageView2.setId(od.q.f60459a);
        H.F(this, n0(), appCompatImageView2, null, 2, null);
        appCompatImageView2.setImageResource(od.p.f60029R0);
        Context context = appCompatImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatImageView2.setColorFilter(new PorterDuffColorFilter(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59852l), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP));
        this.f15629Q4 = appCompatImageView2;
        return appCompatImageView2;
    }

    public final void a2() {
        C1(n0(), this.f15629Q4);
        this.f15629Q4 = null;
    }

    public final void b2() {
        ViewGroup.LayoutParams layoutParams = Z1().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        TextView O02 = O0();
        if (O02 != null) {
            int id2 = O02.getId();
            TextView O03 = O0();
            Intrinsics.checkNotNull(O03);
            ((ViewGroup.MarginLayoutParams) bVar).width = (int) O03.getTextSize();
            TextView O04 = O0();
            Intrinsics.checkNotNull(O04);
            ((ViewGroup.MarginLayoutParams) bVar).height = (int) O04.getTextSize();
            bVar.f18164i = id2;
            boolean m10 = MobilistenUtil.m();
            Message q02 = q0();
            if (m10 != new Bidi(q02 != null ? q02.getContent() : null, -2).isRightToLeft()) {
                bVar.f18190v = id2;
                TextView O05 = O0();
                Intrinsics.checkNotNull(O05);
                bVar.setMarginEnd(O05.getPaddingEnd());
            } else {
                bVar.f18186t = id2;
                TextView O06 = O0();
                Intrinsics.checkNotNull(O06);
                bVar.setMarginStart(O06.getPaddingStart());
            }
            TextView O07 = O0();
            Intrinsics.checkNotNull(O07);
            int paddingTop = O07.getPaddingTop();
            TextView O08 = O0();
            Intrinsics.checkNotNull(O08);
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = paddingTop + ((int) (O08.getLineSpacingExtra() / 2));
        }
        Z1().setLayoutParams(bVar);
    }
}
