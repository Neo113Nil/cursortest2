package com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.afs;
import xsna.asu0;
import xsna.bwt0;
import xsna.e3m;
import xsna.izs;
import xsna.jjc;
import xsna.pf1;
import xsna.s0w0;
import xsna.s3q0;
import xsna.ub80;
import xsna.ucp;
import xsna.vam;

/* compiled from: LinkedMessageView.kt */
/* loaded from: classes2.dex */
public final class LinkedMessageView extends ScrollView {
    public static final /* synthetic */ int f = 0;
    public final MsgPartTextView b;
    public final TextView c;
    public final b d;
    public final m1 e;

    /* compiled from: LinkedMessageView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public LinkedMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new b();
        ucp ucpVar = ucp.a;
        this.e = ucp.a();
        View.inflate(getContext(), R.layout.im_chat_clips_linked_message, this);
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        setClipToOutline(true);
        setOutlineProvider(new s0w0(getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius_promo), 6));
        MsgPartTextView msgPartTextView = (MsgPartTextView) findViewById(R.id.im_chat_clips_linked_text_msg);
        this.b = msgPartTextView;
        bwt0.p0(msgPartTextView.getTimeAndStatusView(), false);
        this.c = (TextView) findViewById(R.id.im_chat_clips_linked_text_username);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        asu0 asu0Var = asu0.a;
        this.d.b(this.e.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new pf1(new vam(this, 19), 25), new afs(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 4)));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.dispose();
    }

    public final void setBody(CharSequence charSequence) {
        MsgPartTextView msgPartTextView = this.b;
        msgPartTextView.setText(charSequence);
        msgPartTextView.invalidate();
        msgPartTextView.requestLayout();
    }

    public final void setBodyMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View findViewById = findViewById(R.id.im_chat_clips_linked_msg_content_root);
        if (findViewById != null) {
            jjc.f(onClickListener, findViewById);
        }
        this.b.setOnClickListener(onClickListener);
    }

    public final void setOnSpanClickListener(ub80 ub80Var) {
        this.b.setOnSpanClickListener(ub80Var);
    }

    public final void setUserName(String str) {
        this.c.setText(str);
    }
}
