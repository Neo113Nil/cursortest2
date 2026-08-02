package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg.k;
import cg.InterfaceC2919b;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.AbstractC3943l;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import n.AbstractC5596a;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.AbstractC5893e;
import rd.C6218a;
import wf.EnumC6745a;
import zf.C6966g;

/* renamed from: ag.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1955a extends Ve.e implements cg.h, InterfaceC2919b {

    /* renamed from: c, reason: collision with root package name */
    public ImageView f15554c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f15555d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f15556e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f15557f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f15558g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f15559h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f15560i;

    /* renamed from: j, reason: collision with root package name */
    public k.b f15561j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f15562k;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f15563l;

    /* renamed from: m, reason: collision with root package name */
    public ProgressBar f15564m;

    /* renamed from: n, reason: collision with root package name */
    public Xf.b f15565n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f15566o;

    /* renamed from: ag.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0329a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f15567a;

        public ViewOnClickListenerC0329a(SalesIQChat salesIQChat) {
            this.f15567a = salesIQChat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1955a.this.f15561j.a(this.f15567a);
        }
    }

    /* renamed from: ag.a$b */
    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SalesIQChat chat = LiveChatUtil.getChat(C1955a.this.f12883b.getChid());
            if (chat != null) {
                if (chat.getStatus() == 1 || chat.getStatus() == 5) {
                    new pd.n(C1955a.this.f12883b.getVisitorid(), true).c();
                }
            }
        }
    }

    public C1955a(View view, k.b bVar) {
        super(view);
        this.f15561j = bVar;
        this.f15563l = (ConstraintLayout) view.findViewById(od.q.f60486c4);
        this.f15554c = (ImageView) view.findViewById(od.q.f60403U3);
        this.f15555d = (ImageView) view.findViewById(od.q.f60313L3);
        TextView textView = (TextView) view.findViewById(od.q.f60464a4);
        this.f15556e = textView;
        textView.setTypeface(C6218a.C());
        TextView textView2 = (TextView) view.findViewById(od.q.f60443Y3);
        this.f15557f = textView2;
        textView2.setMinimumHeight(og.k.b(20));
        TextView textView3 = (TextView) view.findViewById(od.q.f60453Z3);
        this.f15558g = textView3;
        textView3.setTypeface(C6218a.P());
        this.f15564m = (ProgressBar) view.findViewById(od.q.f60413V3);
        this.f15559h = (ImageView) view.findViewById(od.q.f60369R);
        TextView textView4 = (TextView) view.findViewById(od.q.f60373R3);
        this.f15560i = textView4;
        textView4.setTypeface(C6218a.P());
        TextView textView5 = this.f15560i;
        textView5.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(textView5.getContext(), AbstractC5886l.f59731J1)));
        TextView textView6 = (TextView) view.findViewById(od.q.f60423W3);
        this.f15562k = textView6;
        textView6.setTypeface(C6218a.P());
        this.f15566o = (ImageView) view.findViewById(od.q.f60433X3);
    }

    @Override // cg.InterfaceC2919b
    public void H() {
        new b().start();
    }

    @Override // cg.h
    public void f() {
        this.f12883b.setQueueStartTime(rd.b.f());
        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f12883b);
    }

    public final SpannableStringBuilder i(Context context, Message message, float f10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message.getContent());
        int e10 = com.zoho.livechat.android.utils.P.e(context, AbstractC5886l.f59782W0);
        return com.zoho.livechat.android.utils.L.l(com.zoho.livechat.android.utils.L.b(context, spannableStringBuilder, Integer.valueOf(e10), 0, com.zoho.livechat.android.utils.P.e(context, AbstractC5886l.f59774U0), true, f10, true, message.getMarkdowns()), "___");
    }

    public final void j(TextView textView, SalesIQChat salesIQChat) {
        String departmentName = salesIQChat.getDepartmentName();
        int length = departmentName != null ? departmentName.length() : 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (length > 0) {
            spannableStringBuilder.append((CharSequence) textView.getContext().getString(od.t.f60833B, departmentName));
            spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 33);
        }
        if (!TextUtils.isEmpty(salesIQChat.getAttenderName())) {
            spannableStringBuilder.append((CharSequence) textView.getContext().getString(od.t.f60869H, salesIQChat.getAttenderName()));
            spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - salesIQChat.getAttenderName().length(), spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    public final void k(TextView textView, SalesIQChat salesIQChat) {
        Drawable b10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            if (salesIQChat.getStatus() == 1 || salesIQChat.getStatus() == 5) {
                textView.setText(Vf.b.i().c(LiveChatUtil.unescapeHtml(salesIQChat.getQuestion())));
                return;
            }
            Message lastMessage = salesIQChat.getLastMessage();
            if (lastMessage != null) {
                if (lastMessage.getContent() != null && lastMessage.getMessageType() != Message.g.InfoMessage) {
                    if (lastMessage.getSender() == null || !lastMessage.getSender().startsWith("$")) {
                        spannableStringBuilder.append((CharSequence) i(this.f12882a.getContext(), lastMessage, textView.getTextSize()));
                    } else {
                        spannableStringBuilder.append((CharSequence) (textView.getContext().getString(od.t.f61127v1) + ": "));
                        spannableStringBuilder.append((CharSequence) lastMessage.getContent());
                    }
                }
                Message.Attachment attachment = lastMessage.getAttachment();
                if (lastMessage.isDeleted() != Boolean.TRUE) {
                    if (attachment != null) {
                        if (lastMessage.getSender() != null && lastMessage.getSender().startsWith("$")) {
                            spannableStringBuilder.append((CharSequence) (textView.getContext().getString(od.t.f61127v1) + ": "));
                        }
                        String fileName = (attachment.getFileName() == null || attachment.getFileName().isEmpty()) ? null : attachment.getFileName();
                        if (attachment.getType() != null && attachment.getType().contains("gif")) {
                            b10 = AbstractC5596a.b(textView.getContext(), od.p.f60094f);
                            if (b10 != null) {
                                b10.setColorFilter(new PorterDuffColorFilter(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59706D0), PorterDuff.Mode.SRC_ATOP));
                            }
                            if (fileName == null || fileName.isEmpty()) {
                                fileName = textView.getContext().getString(od.t.f61137x);
                            }
                        } else if (attachment.getDimensions() != null) {
                            b10 = AbstractC5596a.b(textView.getContext(), od.p.f60178v3);
                            if (fileName == null || fileName.isEmpty()) {
                                fileName = textView.getContext().getString(od.t.f61143y);
                            }
                        } else if (attachment.getType() != null && attachment.getType().contains("audio")) {
                            b10 = attachment.getAttachmentType() == Message.Attachment.a.VoiceNote ? AbstractC5596a.b(textView.getContext(), od.p.f60104h) : AbstractC5596a.b(textView.getContext(), od.p.f59970F1);
                            if (fileName == null || fileName.isEmpty()) {
                                fileName = textView.getContext().getString(od.t.f61131w);
                            }
                        } else if (attachment.getType() == null || !attachment.getType().contains("video")) {
                            b10 = AbstractC5596a.b(textView.getContext(), od.p.f59953C);
                            if (fileName == null || fileName.isEmpty()) {
                                fileName = textView.getContext().getString(od.t.f61149z);
                            }
                        } else {
                            b10 = AbstractC5596a.b(textView.getContext(), od.p.f59985I1);
                            if (fileName == null || fileName.isEmpty()) {
                                fileName = textView.getContext().getString(od.t.f60827A);
                            }
                        }
                        Drawable a10 = AbstractC5893e.a(b10, com.zoho.livechat.android.utils.P.e(this.f12882a.getContext(), AbstractC5886l.f59841i3));
                        a10.setBounds(0, 0, C6218a.b(16.0f), C6218a.b(16.0f));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("  " + fileName);
                        spannableStringBuilder2.setSpan(new ImageSpan(a10, 0), 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                    }
                    if (lastMessage.getMessageType() == Message.g.RequestLog) {
                        spannableStringBuilder.append((CharSequence) textView.getContext().getString(od.t.f61085o3));
                    } else if (lastMessage.getMessageType() == Message.g.Article) {
                        Drawable a11 = AbstractC5893e.a(AbstractC5596a.b(textView.getContext(), od.p.f60139o), com.zoho.livechat.android.utils.P.e(this.f12882a.getContext(), AbstractC5886l.f59841i3));
                        a11.setBounds(0, 0, C6218a.b(16.0f), C6218a.b(16.0f));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("  " + lastMessage.getContent());
                        spannableStringBuilder3.setSpan(new ImageSpan(a11, 0), 0, 1, 33);
                        spannableStringBuilder.clear();
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                    } else if (lastMessage.getInfoMessage() != null && lastMessage.getInfoMessage().getMode() != null) {
                        try {
                            Spannable c10 = C6966g.C6967a.c(textView.getContext(), Integer.valueOf(salesIQChat.getStatus()), lastMessage, false, false);
                            if (c10 != null) {
                                spannableStringBuilder.append((CharSequence) c10);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (lastMessage.getSender() == null || !lastMessage.getSender().startsWith("$") || salesIQChat.getStatus() != 2 || salesIQChat.getRemainingTime() > 0) {
                        this.f15566o.setVisibility(8);
                    } else {
                        this.f15566o.setVisibility(0);
                        this.f15560i.setVisibility(8);
                        if (!salesIQChat.isBotAttender() && lastMessage.getMessageType() != Message.g.InfoMessage) {
                            l(this.f15566o, lastMessage.getStatus(), Boolean.valueOf(Boolean.TRUE.equals(lastMessage.isRead())));
                        }
                        this.f15566o.setVisibility(8);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(textView.getContext().getString(od.t.f61117t3));
                    int indexOf = StringsKt.indexOf((CharSequence) spannableStringBuilder, (char) 10680, 0, false);
                    int i10 = indexOf == 0 ? 2 : 0;
                    int length = spannableStringBuilder.length();
                    if (indexOf != 0) {
                        length -= 2;
                    }
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 34);
                    spannableStringBuilder.append((CharSequence) " ");
                }
                textView.setText(spannableStringBuilder);
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public void l(ImageView imageView, Message.f fVar, Boolean bool) {
        Drawable changeDrawableColor = LiveChatUtil.changeDrawableColor(imageView.getContext(), od.p.f59978H, com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59912z1));
        if (fVar == Message.f.Sent) {
            if (C6966g.h0(EnumC6745a.Read) && bool.booleanValue()) {
                imageView.setContentDescription("Message read");
                changeDrawableColor = LiveChatUtil.changeDrawableColor(imageView.getContext(), od.p.f59968F, com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59908y1));
            } else {
                imageView.setContentDescription("Message sent");
                changeDrawableColor = LiveChatUtil.changeDrawableColor(imageView.getContext(), od.p.f59973G, com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59695A1));
            }
        } else if (fVar == Message.f.WaitingForWms || fVar == Message.f.Sending || fVar == Message.f.Uploading) {
            imageView.setContentDescription("Message sending");
            changeDrawableColor = LiveChatUtil.changeDrawableColor(imageView.getContext(), od.p.f59978H, com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59912z1));
        } else if (Message.f.isFailed(fVar)) {
            imageView.setContentDescription("Message sending failed");
            changeDrawableColor = AbstractC5338c.getDrawable(imageView.getContext(), od.p.f60029R0);
        }
        imageView.setImageDrawable(changeDrawableColor);
    }

    public final void m(long j10, long j11) {
        int timeRemaining = LiveChatUtil.getTimeRemaining(Long.valueOf(j10), LiveChatUtil.getInteger(Long.valueOf(j11)).intValue());
        Xf.b bVar = this.f15565n;
        if (bVar != null) {
            bVar.cancel();
        }
        if (timeRemaining > 0) {
            Xf.b bVar2 = new Xf.b(this.f12883b.getChid(), timeRemaining * 1000, 1000L);
            this.f15565n = bVar2;
            bVar2.a(this);
            this.f15565n.start();
            Ue.a.d(this.f12883b);
        }
    }

    public final boolean n(int i10) {
        return (i10 == 4 || i10 == 3) ? false : true;
    }

    public void o(SalesIQChat salesIQChat) {
        String str;
        Xf.b bVar;
        b(salesIQChat);
        this.f12883b = salesIQChat;
        e(this.f15554c);
        this.f15557f.setText((CharSequence) null);
        this.f15557f.setTextColor(AbstractC5892d.f(d(), Integer.valueOf(AbstractC5886l.f59719G1)));
        this.f15564m.setVisibility(8);
        this.f15566o.setVisibility(8);
        this.f15555d.setVisibility(8);
        if (n(salesIQChat.getStatus())) {
            this.f15562k.setVisibility(0);
            TextView textView = this.f15562k;
            textView.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59707D1), C6218a.b(10.0f), 0, 0));
            this.f15562k.setText(od.t.f60845D);
            if (salesIQChat.getStatus() == 2) {
                this.f15556e.setText(LiveChatUtil.unescapeHtml(salesIQChat.getAttenderName()));
                k(this.f15557f, salesIQChat);
            } else if (salesIQChat.getStatus() == 1 || salesIQChat.getStatus() == 5) {
                k(this.f15556e, salesIQChat);
                if (salesIQChat.getVisitorid() == null) {
                    this.f15564m.setVisibility(0);
                    TextView textView2 = this.f15557f;
                    textView2.setText(textView2.getContext().getString(od.t.f60857F));
                } else {
                    TextView textView3 = this.f15557f;
                    textView3.setText(textView3.getContext().getString(od.t.f61151z1));
                }
            } else {
                k(this.f15557f, salesIQChat);
                if (salesIQChat.getAttenderName() != null && salesIQChat.getAttenderName().length() > 0) {
                    this.f15556e.setText(LiveChatUtil.unescapeHtml(salesIQChat.getAttenderName()));
                } else if (salesIQChat.getDepartmentName() == null || salesIQChat.getDepartmentName().length() <= 0) {
                    k(this.f15557f, salesIQChat);
                } else {
                    j(this.f15556e, salesIQChat);
                }
            }
            if (salesIQChat.getStatus() == 2 && salesIQChat.getRemainingTime() > 0) {
                this.f15559h.setVisibility(0);
                ImageView imageView = this.f15559h;
                imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59723H1));
                TextView textView4 = this.f15557f;
                textView4.setText(textView4.getContext().getString(od.t.f61125v, AbstractC3943l.a(salesIQChat.getRemainingTime()).trim()));
                TextView textView5 = this.f15557f;
                textView5.setTextColor(com.zoho.livechat.android.utils.P.e(textView5.getContext(), AbstractC5886l.f59727I1));
                this.f15560i.setVisibility(8);
            } else if (salesIQChat.getUnreadCount() <= 0 || salesIQChat.getLastMessage() == null || salesIQChat.getLastMessage().getSender() == null || salesIQChat.getLastMessage().getSender().equals(LiveChatUtil.getAnnonID())) {
                this.f15559h.setVisibility(8);
                this.f15560i.setVisibility(8);
                TextView textView6 = this.f15557f;
                textView6.setTextColor(com.zoho.livechat.android.utils.P.e(textView6.getContext(), AbstractC5886l.f59719G1));
            } else {
                this.f15557f.setTextColor(AbstractC5892d.f(d(), Integer.valueOf(AbstractC5886l.f59711E1)));
                this.f15559h.setVisibility(8);
                this.f15560i.setVisibility(0);
                this.f15560i.setText(String.valueOf(salesIQChat.getUnreadCount()));
            }
            if (salesIQChat.getStatus() == 1 || salesIQChat.getStatus() == 5 || salesIQChat.getStatus() == 2) {
                if (salesIQChat.canShowQueue() && salesIQChat.getQueuePosition() > 0) {
                    DecimalFormat decimalFormat = new DecimalFormat("00");
                    List i10 = AbstractC3945n.i(salesIQChat.getStatus() == 5, null, salesIQChat.getConvID());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i10 == null || i10.size() <= 1) {
                        spannableStringBuilder.append((CharSequence) (Te.a.z() ? this.f15557f.getContext().getResources().getString(od.t.f60851E, decimalFormat.format(salesIQChat.getQueuePosition())) : this.f15557f.getContext().getString(od.t.f61081o)));
                        TextView textView7 = this.f15557f;
                        textView7.setTextColor(com.zoho.livechat.android.utils.P.e(textView7.getContext(), AbstractC5886l.f59715F1));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(salesIQChat.getDepartmentName());
                        sb2.append(" | ");
                        sb2.append(Te.a.z() ? this.f15557f.getContext().getResources().getString(od.t.f60851E, decimalFormat.format(salesIQChat.getQueuePosition())) : this.f15557f.getContext().getString(od.t.f61081o));
                        String sb3 = sb2.toString();
                        spannableStringBuilder.append((CharSequence) sb3);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC5892d.f(this.f15557f.getContext(), Integer.valueOf(AbstractC5886l.f59715F1))), salesIQChat.getDepartmentName().length() + 3, sb3.length(), 33);
                        TextView textView8 = this.f15557f;
                        textView8.setTextColor(AbstractC5892d.f(textView8.getContext(), Integer.valueOf(AbstractC5886l.f59719G1)));
                    }
                    this.f15557f.setText(spannableStringBuilder);
                } else if ((LiveChatUtil.getChatWaitingTime() > 0 && salesIQChat.getStatus() == 1) || salesIQChat.getStatus() == 5) {
                    m(salesIQChat.getWaitingTimerStartTime(), LiveChatUtil.getChatWaitingTime());
                }
                if (salesIQChat.getStatus() == 2 && (bVar = this.f15565n) != null) {
                    bVar.cancel();
                }
            }
        } else {
            this.f15562k.setVisibility(8);
            Spannable c10 = Vf.b.i().c(LiveChatUtil.unescapeHtml(salesIQChat.getQuestion()));
            if (salesIQChat.getVisitid() == null || salesIQChat.getVisitid().length() <= 0) {
                str = "" + ((Object) c10);
            } else {
                str = "#" + salesIQChat.getVisitid() + " | " + ((Object) c10);
            }
            this.f15556e.setText(str);
            if (salesIQChat.getStatus() == 3) {
                this.f15555d.setVisibility(0);
                if (salesIQChat.getMissedTime() == salesIQChat.getChatLastInitiatedTime().longValue()) {
                    TextView textView9 = this.f15557f;
                    textView9.setText(textView9.getContext().getString(od.t.f60844C4));
                    this.f15555d.setImageResource(od.p.f60159s);
                } else {
                    TextView textView10 = this.f15557f;
                    textView10.setText(textView10.getContext().getString(od.t.f60838B4));
                    this.f15555d.setImageResource(od.p.f59963E);
                }
                TextView textView11 = this.f15557f;
                textView11.setTextColor(com.zoho.livechat.android.utils.P.e(textView11.getContext(), AbstractC5886l.f59719G1));
            } else if (salesIQChat.getAttenderName() == null || salesIQChat.getAttenderName().isEmpty()) {
                this.f15555d.setVisibility(0);
                if ("open".equalsIgnoreCase(salesIQChat.getStatusKey())) {
                    TextView textView12 = this.f15557f;
                    textView12.setText(textView12.getContext().getString(od.t.f60838B4));
                    this.f15555d.setImageResource(od.p.f59963E);
                } else {
                    TextView textView13 = this.f15557f;
                    textView13.setText(textView13.getContext().getString(od.t.f60844C4));
                    this.f15555d.setImageResource(od.p.f60159s);
                }
                TextView textView14 = this.f15557f;
                textView14.setTextColor(com.zoho.livechat.android.utils.P.e(textView14.getContext(), AbstractC5886l.f59719G1));
            } else {
                this.f15557f.setText(Vf.b.i().c(LiveChatUtil.unescapeHtml(salesIQChat.getAttenderName())));
                TextView textView15 = this.f15557f;
                textView15.setTextColor(com.zoho.livechat.android.utils.P.e(textView15.getContext(), AbstractC5886l.f59719G1));
            }
            this.f15560i.setVisibility(8);
            this.f15559h.setVisibility(8);
        }
        g(this.f15558g);
        this.f12882a.setOnClickListener(new ViewOnClickListenerC0329a(salesIQChat));
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this.f15563l);
        if (this.f15564m.getVisibility() == 0 || this.f15559h.getVisibility() == 0) {
            dVar.h(od.q.f60443Y3, 6, od.q.f60413V3, 7);
        } else {
            dVar.h(od.q.f60443Y3, 6, od.q.f60464a4, 6);
        }
        dVar.c(this.f15563l);
    }

    @Override // cg.InterfaceC2919b
    public void G(long j10) {
    }

    @Override // cg.h
    public void S(long j10) {
    }
}
