package ag;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.C3948q;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import od.AbstractC5886l;
import okhttp3.HttpUrl;
import rd.C6218a;

/* renamed from: ag.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1977l extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.e f15700Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ConstraintLayout f15701R4;

    /* renamed from: S4, reason: collision with root package name */
    public View f15702S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15703T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15704U4;

    /* renamed from: V4, reason: collision with root package name */
    public TextView f15705V4;

    /* renamed from: W4, reason: collision with root package name */
    public RelativeLayout f15706W4;

    /* renamed from: X4, reason: collision with root package name */
    public RelativeLayout f15707X4;

    /* renamed from: Y4, reason: collision with root package name */
    public ImageView f15708Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public CircularProgressIndicator f15709Z4;

    /* renamed from: a5, reason: collision with root package name */
    public TextView f15710a5;

    /* renamed from: b5, reason: collision with root package name */
    public View f15711b5;

    /* renamed from: c5, reason: collision with root package name */
    public ConstraintLayout f15712c5;

    /* renamed from: d5, reason: collision with root package name */
    public MobilistenTextView f15713d5;

    /* renamed from: e5, reason: collision with root package name */
    public MobilistenTextView f15714e5;

    /* renamed from: f5, reason: collision with root package name */
    public AppCompatImageView f15715f5;

    /* renamed from: g5, reason: collision with root package name */
    public SalesIQChat f15716g5;

    public C1977l(View view, ConstraintLayout constraintLayout, final cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        constraintLayout.setMinWidth(F0());
        this.f15700Q4 = eVar;
        this.f15701R4 = (ConstraintLayout) view.findViewById(od.q.f60673u6);
        this.f15712c5 = (ConstraintLayout) view.findViewById(od.q.f60270H0);
        this.f15713d5 = (MobilistenTextView) view.findViewById(od.q.f60280I0);
        this.f15714e5 = (MobilistenTextView) view.findViewById(od.q.f60340O0);
        this.f15703T4 = (ImageView) view.findViewById(od.q.f60210B0);
        TextView textView = (TextView) view.findViewById(od.q.f60230D0);
        this.f15704U4 = textView;
        textView.setTypeface(C6218a.C());
        TextView textView2 = (TextView) view.findViewById(od.q.f60250F0);
        this.f15705V4 = textView2;
        textView2.setTypeface(C6218a.P());
        this.f15706W4 = (RelativeLayout) view.findViewById(od.q.f60707y0);
        this.f15707X4 = (RelativeLayout) view.findViewById(od.q.f60220C0);
        this.f15708Y4 = (ImageView) view.findViewById(od.q.f60697x0);
        this.f15709Z4 = (CircularProgressIndicator) view.findViewById(od.q.f60240E0);
        View findViewById = view.findViewById(od.q.f60394T4);
        this.f15702S4 = findViewById;
        findViewById.setOnLongClickListener(t0());
        TextView textView3 = (TextView) view.findViewById(od.q.f60200A0);
        this.f15710a5 = textView3;
        textView3.setTypeface(C6218a.P());
        this.f15711b5 = view.findViewById(od.q.f60717z0);
        this.f15715f5 = (AppCompatImageView) view.findViewById(od.q.f60260G0);
        if (w1()) {
            R(this.f15701R4, AbstractC5886l.f59766S0);
            s0().setVisibility(8);
        } else {
            R(this.f15701R4, AbstractC5886l.f59770T0);
        }
        this.f15706W4.setOnClickListener(new View.OnClickListener() { // from class: ag.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r0.c1(r0.f15716g5, r0.q0(), r0.f15708Y4, eVar, new Function2() { // from class: ag.k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C1977l.Y1(C1977l.this, (Boolean) obj, (Message) obj2);
                    }
                });
            }
        });
    }

    public static /* synthetic */ Unit Y1(C1977l c1977l, Boolean bool, Message message) {
        c1977l.M1(message);
        if (bool.booleanValue()) {
            c1977l.F1(c1977l.f15716g5, message);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void Z1(C1977l c1977l, File file, View view) {
        cg.e eVar = c1977l.f15700Q4;
        if (eVar != null) {
            eVar.T(file);
        }
    }

    public static /* synthetic */ void b2(C1977l c1977l, Message message, HttpUrl.Builder builder, Message.Attachment attachment, SalesIQChat salesIQChat, View view) {
        c1977l.getClass();
        C3948q.b().a(message.getChatId(), message.getId(), builder, com.zoho.livechat.android.utils.y.INSTANCE.getFileName(attachment.getFileName(), LiveChatUtil.getLong(message.getId())), attachment.getSize());
        c1977l.f15708Y4.setImageResource(od.p.f60158r3);
        c1977l.F1(salesIQChat, message);
    }

    public static HttpUrl.Builder d2(SalesIQChat salesIQChat, Message.Attachment attachment) {
        HttpUrl.Builder builder = null;
        try {
            HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/download", LiveChatUtil.getScreenName(), salesIQChat.getVisitorid());
            if (g10 == null) {
                return null;
            }
            try {
                g10.addQueryParameter(EventKeys.URL, attachment.getUrl());
                g10.addQueryParameter("file_size", String.valueOf(attachment.getSize()));
                g10.addQueryParameter("file_name", String.valueOf(attachment.getFileName()));
                return g10;
            } catch (Exception e10) {
                e = e10;
                builder = g10;
                LiveChatUtil.log(e);
                return builder;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // ag.H
    public MobilistenTextView A0() {
        return this.f15714e5;
    }

    @Override // ag.H
    public MobilistenTextView B0() {
        return this.f15713d5;
    }

    @Override // ag.H
    public void F1(final SalesIQChat salesIQChat, final Message message) {
        super.F1(salesIQChat, message);
        this.f15716g5 = salesIQChat;
        final Message.Attachment attachment = message.getAttachment();
        d1(message);
        if (attachment != null) {
            this.f15704U4.setText(attachment.getFileName());
            this.f15705V4.setText(og.j.d(attachment.getSize()));
            TextView textView = this.f15710a5;
            textView.setText(c2(textView.getContext(), attachment.getFileName()));
            ConstraintLayout.b bVar = (ConstraintLayout.b) this.f15712c5.getLayoutParams();
            if (message.getHasComment()) {
                this.f15712c5.setVisibility(8);
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = H.U0();
                if (w1()) {
                    O0().setTextColor(com.zoho.livechat.android.utils.P.e(d0(), R.attr.textColorPrimary));
                } else {
                    O0().setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59804b1));
                    s0().setVisibility(0);
                    q1(message);
                }
                this.f15715f5.setVisibility(8);
                R0().setVisibility(0);
                if (w1()) {
                    s0().setVisibility(8);
                } else {
                    s0().setVisibility(0);
                    q1(message);
                }
                og.p.g(this.f15702S4, message.getReplyTo() == null ? H.l0() : null, null, Integer.valueOf(com.zoho.livechat.android.utils.P.e(this.f15701R4.getContext(), AbstractC5886l.f59805b2)));
            } else {
                this.f15712c5.setVisibility(0);
                if (w1()) {
                    ConstraintLayout constraintLayout = this.f15712c5;
                    constraintLayout.setBackgroundColor(com.zoho.livechat.android.utils.P.e(constraintLayout.getContext(), AbstractC5886l.f59766S0));
                    View view = this.f15702S4;
                    view.setBackgroundColor(com.zoho.livechat.android.utils.P.e(view.getContext(), AbstractC5886l.f59766S0));
                } else {
                    ConstraintLayout constraintLayout2 = this.f15712c5;
                    constraintLayout2.setBackgroundColor(com.zoho.livechat.android.utils.P.e(constraintLayout2.getContext(), AbstractC5886l.f59770T0));
                    View view2 = this.f15702S4;
                    view2.setBackgroundColor(com.zoho.livechat.android.utils.P.e(view2.getContext(), AbstractC5886l.f59770T0));
                }
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
                s0().setVisibility(8);
                R0().setVisibility(8);
                if (w1()) {
                    this.f15715f5.setVisibility(8);
                } else {
                    this.f15715f5.setVisibility(0);
                    r1(message, false, this.f15715f5);
                }
            }
            this.f15712c5.setLayoutParams(bVar);
            if (w1()) {
                this.f15713d5.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59809c1));
                ImageView imageView = this.f15708Y4;
                imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59875q0));
                TextView textView2 = this.f15704U4;
                textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59891u0));
                this.f15705V4.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59899w0));
                this.f15711b5.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59883s0)));
                this.f15710a5.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59907y0));
                RelativeLayout relativeLayout = this.f15707X4;
                relativeLayout.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(relativeLayout.getContext(), AbstractC5886l.f59867o0)));
                RelativeLayout relativeLayout2 = this.f15706W4;
                relativeLayout2.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(relativeLayout2.getContext(), AbstractC5886l.f59867o0)));
                CircularProgressIndicator circularProgressIndicator = this.f15709Z4;
                circularProgressIndicator.setIndicatorColor(com.zoho.livechat.android.utils.P.e(circularProgressIndicator.getContext(), AbstractC5886l.f59875q0));
                this.f15703T4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f59953C, com.zoho.livechat.android.utils.P.e(this.f15703T4.getContext(), AbstractC5886l.f59875q0)));
            } else {
                this.f15713d5.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59814d1));
                ImageView imageView2 = this.f15708Y4;
                imageView2.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView2.getContext(), AbstractC5886l.f59879r0));
                TextView textView3 = this.f15704U4;
                textView3.setTextColor(com.zoho.livechat.android.utils.P.e(textView3.getContext(), AbstractC5886l.f59895v0));
                this.f15705V4.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59903x0));
                this.f15711b5.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59887t0)));
                this.f15710a5.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15704U4.getContext(), AbstractC5886l.f59911z0));
                RelativeLayout relativeLayout3 = this.f15707X4;
                relativeLayout3.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(relativeLayout3.getContext(), AbstractC5886l.f59871p0)));
                RelativeLayout relativeLayout4 = this.f15706W4;
                relativeLayout4.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(relativeLayout4.getContext(), AbstractC5886l.f59871p0)));
                this.f15709Z4.setIndicatorColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59879r0));
                this.f15703T4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f59953C, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59879r0)));
            }
            if (message.getStatus() != Message.f.Sent) {
                this.f15706W4.setVisibility(0);
                this.f15707X4.setVisibility(8);
                if (Message.f.isFailed(message.getStatus())) {
                    e2();
                    return;
                } else {
                    f2();
                    return;
                }
            }
            final File file = (message.getExtras() == null || message.getExtras().getLocalFilePath() == null) ? null : new File(message.getExtras().getLocalFilePath());
            if (file != null && file.exists() && message.getExtras().getLocalFileSize() >= attachment.getSize()) {
                this.f15706W4.setVisibility(8);
                this.f15707X4.setVisibility(0);
                this.f15702S4.setOnClickListener(new View.OnClickListener() { // from class: ag.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1977l.Z1(C1977l.this, file, view3);
                    }
                });
                return;
            }
            final HttpUrl.Builder d22 = d2(salesIQChat, attachment);
            this.f15706W4.setVisibility(0);
            this.f15707X4.setVisibility(8);
            if (!C3948q.b().c(message.getId())) {
                this.f15708Y4.setImageResource(od.p.f60004M0);
                this.f15709Z4.setVisibility(8);
                this.f15702S4.setOnClickListener(new View.OnClickListener() { // from class: ag.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1977l.b2(C1977l.this, message, d22, attachment, salesIQChat, view3);
                    }
                });
            } else {
                this.f15708Y4.setImageResource(od.p.f60158r3);
                this.f15709Z4.setVisibility(0);
                if (!this.f15709Z4.isIndeterminate()) {
                    this.f15709Z4.setIndeterminate(true);
                }
                this.f15702S4.setOnClickListener(null);
            }
        }
    }

    @Override // ag.H
    public void N1(Message message) {
        super.N1(message);
        if (message.getHasComment()) {
            this.f15712c5.setVisibility(8);
        } else {
            this.f15712c5.setVisibility(0);
        }
    }

    public final String c2(Context context, String str) {
        String str2 = null;
        try {
            if (str.lastIndexOf(".") != -1 && str.lastIndexOf(".") != 0) {
                str2 = str.substring(str.lastIndexOf(".") + 1);
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        return TextUtils.isEmpty(str2) ? context.getString(od.t.f60864G0) : str2;
    }

    public final void e2() {
        this.f15715f5.setVisibility(8);
        this.f15708Y4.setImageResource(od.p.f59980H1);
        this.f15709Z4.setVisibility(8);
    }

    public final void f2() {
        this.f15708Y4.setImageResource(od.p.f60158r3);
        this.f15709Z4.setVisibility(0);
        this.f15707X4.setVisibility(8);
        if (this.f15709Z4.isIndeterminate()) {
            return;
        }
        this.f15709Z4.setIndeterminate(true);
    }

    public void g2(String str, int i10) {
        if ((q0().getStatus() != Message.f.Uploading && !C3948q.b().c(str)) || !q0().getId().equals(str) || getAdapterPosition() == -1 || i10 <= -1) {
            this.f15709Z4.setIndeterminate(true);
        } else {
            this.f15709Z4.setIndeterminate(i10 == 100);
            this.f15709Z4.setProgress(i10);
        }
    }

    @Override // ag.H
    public void r1(Message message, boolean z10, ImageView imageView) {
        if (x1()) {
            super.r1(message, z10, q0().getComment() == null ? this.f15715f5 : null);
            if (Message.f.isFailed(message.getStatus())) {
                e2();
            } else if (message.getStatus() == Message.f.Uploading) {
                f2();
            }
        }
    }
}
