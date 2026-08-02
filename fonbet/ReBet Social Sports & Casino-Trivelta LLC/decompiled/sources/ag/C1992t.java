package ag;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.AbstractC3934c;
import com.zoho.livechat.android.utils.AbstractC3935d;
import com.zoho.livechat.android.utils.C3948q;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.AbstractC5335a;
import od.AbstractC5886l;
import okhttp3.HttpUrl;
import rd.C6218a;

/* renamed from: ag.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1992t extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public LinearLayout f15797Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15798R4;

    /* renamed from: S4, reason: collision with root package name */
    public RelativeLayout f15799S4;

    /* renamed from: T4, reason: collision with root package name */
    public RelativeLayout f15800T4;

    /* renamed from: U4, reason: collision with root package name */
    public RelativeLayout f15801U4;

    /* renamed from: V4, reason: collision with root package name */
    public CircularProgressIndicator f15802V4;

    /* renamed from: W4, reason: collision with root package name */
    public ImageView f15803W4;

    /* renamed from: X4, reason: collision with root package name */
    public SeekBar f15804X4;

    /* renamed from: Y4, reason: collision with root package name */
    public TextView f15805Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public AppCompatImageView f15806Z4;

    /* renamed from: a5, reason: collision with root package name */
    public ConstraintLayout f15807a5;

    /* renamed from: b5, reason: collision with root package name */
    public SalesIQChat f15808b5;

    /* renamed from: c5, reason: collision with root package name */
    public Message f15809c5;

    /* renamed from: d5, reason: collision with root package name */
    public MobilistenTextView f15810d5;

    /* renamed from: e5, reason: collision with root package name */
    public MobilistenTextView f15811e5;

    public C1992t(View view, ConstraintLayout constraintLayout, final cg.e eVar, Function1 function1) {
        super(view, eVar);
        super.K1(constraintLayout);
        super.O1(function1);
        this.f15810d5 = (MobilistenTextView) view.findViewById(od.q.f60420W0);
        this.f15797Q4 = (LinearLayout) view.findViewById(od.q.f60410V0);
        this.f15798R4 = (ImageView) view.findViewById(od.q.f60350P0);
        this.f15800T4 = (RelativeLayout) view.findViewById(od.q.f60370R0);
        this.f15799S4 = (RelativeLayout) view.findViewById(od.q.f60380S0);
        this.f15801U4 = (RelativeLayout) view.findViewById(od.q.f60409V);
        this.f15802V4 = (CircularProgressIndicator) view.findViewById(od.q.f60430X0);
        this.f15803W4 = (ImageView) view.findViewById(od.q.f60360Q0);
        this.f15804X4 = (SeekBar) view.findViewById(od.q.f60440Y0);
        TextView textView = (TextView) view.findViewById(od.q.f60390T0);
        this.f15805Y4 = textView;
        textView.setTypeface(C6218a.C());
        this.f15807a5 = (ConstraintLayout) view.findViewById(od.q.f60461a1);
        MobilistenTextView mobilistenTextView = (MobilistenTextView) view.findViewById(od.q.f60472b1);
        this.f15811e5 = mobilistenTextView;
        mobilistenTextView.setTypeface(C6218a.P());
        this.f15806Z4 = (AppCompatImageView) view.findViewById(od.q.f60450Z0);
        this.f15799S4.setOnClickListener(new View.OnClickListener() { // from class: ag.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r0.c1(r0.f15808b5, r0.f15809c5, r0.f15803W4, eVar, new Function2() { // from class: ag.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C1992t.c2(C1992t.this, (Boolean) obj, (Message) obj2);
                    }
                });
            }
        });
    }

    public static /* synthetic */ boolean Y1(View view, MotionEvent motionEvent) {
        return true;
    }

    public static /* synthetic */ boolean Z1(C1992t c1992t, View view, MotionEvent motionEvent) {
        c1992t.getClass();
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            c1992t.N0().invoke(Boolean.FALSE);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        c1992t.N0().invoke(Boolean.TRUE);
        return false;
    }

    public static /* synthetic */ void a2(C1992t c1992t, Message message, int i10, boolean z10) {
        ChatActivity chatActivity = (ChatActivity) c1992t.itemView.getContext();
        if (chatActivity == null || !LiveChatUtil.isActivityLive(chatActivity) || c1992t.getBindingAdapterPosition() == -1) {
            return;
        }
        c1992t.f15804X4.setProgress(i10);
        if (i10 != -1) {
            c1992t.f15805Y4.setText(j2("" + i10));
        } else {
            c1992t.f15805Y4.setText(message.getExtras().getMediaDurationText());
        }
        if (z10) {
            c1992t.f15798R4.setImageDrawable(c1992t.l2(c1992t.w1(), message.getHasComment()));
        } else {
            c1992t.f15798R4.setImageDrawable(c1992t.k2(c1992t.w1(), message.getHasComment()));
        }
    }

    public static /* synthetic */ void b2(C1992t c1992t, String str, Message message, File file, View view) {
        AbstractC3935d.a a10;
        c1992t.getClass();
        String j10 = AbstractC3934c.j();
        if (j10 != null && !j10.equals(str) && (a10 = AbstractC3935d.a(j10)) != null) {
            a10.a(AbstractC3935d.b(j10), true);
            AbstractC3935d.d(j10, AbstractC3935d.b(j10));
        }
        if (AbstractC3934c.m(str)) {
            c1992t.f15798R4.setImageDrawable(c1992t.l2(c1992t.w1(), message.getHasComment()));
            AbstractC3934c.k(message.getId(), str, Uri.fromFile(file), -1);
        } else {
            c1992t.f15798R4.setImageDrawable(c1992t.k2(c1992t.w1(), message.getHasComment()));
            AbstractC3934c.k(message.getId(), str, Uri.fromFile(file), c1992t.f15804X4.getProgress());
        }
    }

    public static /* synthetic */ Unit c2(C1992t c1992t, Boolean bool, Message message) {
        c1992t.getClass();
        if (bool.booleanValue()) {
            c1992t.F1(c1992t.f15808b5, message);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void e2(C1992t c1992t, Message message, HttpUrl.Builder builder, SalesIQChat salesIQChat, View view) {
        c1992t.getClass();
        C3948q.b().a(message.getChatId(), message.getId(), builder, com.zoho.livechat.android.utils.y.INSTANCE.getFileName(message.getAttachment().getFileName(), LiveChatUtil.getLong(message.getId())), message.getAttachment().getSize());
        c1992t.f15799S4.setVisibility(0);
        c1992t.f15801U4.setVisibility(8);
        c1992t.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(c1992t.d0(), od.p.f60158r3, -1));
        c1992t.f15802V4.setVisibility(0);
        c1992t.F1(salesIQChat, message);
    }

    public static int i2(boolean z10, boolean z11) {
        return z10 ? z11 ? AbstractC5886l.f59870p : AbstractC5886l.f59886t : z11 ? AbstractC5886l.f59874q : AbstractC5886l.f59890u;
    }

    public static String j2(String str) {
        if (str == null) {
            return null;
        }
        long longValue = Long.valueOf(str).longValue() / 1000;
        long j10 = longValue / 60;
        long j11 = longValue % 60;
        String str2 = "" + j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j11 < 10 ? "0" : "");
        sb2.append(j11);
        return str2 + ":" + sb2.toString();
    }

    private void m2() {
        this.f15806Z4.setVisibility(8);
        s0().setVisibility(8);
        this.f15799S4.setVisibility(0);
        this.f15801U4.setVisibility(8);
        this.f15802V4.setVisibility(8);
        this.f15803W4.setImageResource(od.p.f59980H1);
    }

    @Override // ag.H
    public MobilistenTextView A0() {
        return this.f15810d5;
    }

    @Override // ag.H
    public MobilistenTextView B0() {
        return this.f15811e5;
    }

    @Override // ag.H
    public void F1(final SalesIQChat salesIQChat, final Message message) {
        super.F1(salesIQChat, message);
        this.f15809c5 = message;
        this.f15808b5 = salesIQChat;
        if (message.getAttachment() != null) {
            if (w1()) {
                s0().setVisibility(8);
            } else {
                s0().setVisibility(0);
                q1(message);
            }
            this.f15804X4.setProgress(0);
            final HttpUrl.Builder W10 = W(salesIQChat, message.getAttachment());
            final String builder = W10 != null ? W10.toString() : "";
            String formattedClientTime = message.getFormattedClientTime();
            if (message.getHasComment()) {
                this.f15807a5.setVisibility(8);
                this.f15797Q4.setPadding(H.U0(), H.U0(), H.U0(), H.U0());
                d1(message);
                if (w1()) {
                    this.f15802V4.setIndicatorColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59870p));
                    this.f15803W4.setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59870p));
                    this.f15804X4.getProgressDrawable().setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59894v), PorterDuff.Mode.SRC_IN);
                    this.f15800T4.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59862n)));
                    O0().setTextColor(com.zoho.livechat.android.utils.P.e(d0(), R.attr.textColorPrimary));
                    this.f15805Y4.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59705D));
                    this.f15804X4.getThumb().setTint(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59902x));
                } else {
                    this.f15802V4.setIndicatorColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59874q));
                    this.f15803W4.setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59874q));
                    this.f15804X4.getProgressDrawable().setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59898w), PorterDuff.Mode.SRC_IN);
                    this.f15800T4.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59866o)));
                    O0().setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59804b1));
                    this.f15805Y4.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59709E));
                    this.f15804X4.getThumb().setTint(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59906y));
                }
                if (w1()) {
                    s0().setVisibility(8);
                } else {
                    s0().setVisibility(0);
                    q1(message);
                }
                og.p.g(this.f15797Q4, null, Integer.valueOf(H.U0()), Integer.valueOf(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59827g)));
            } else {
                this.f15797Q4.setBackground(null);
                this.f15807a5.setVisibility(0);
                og.p.n(R0());
                og.p.n(s0());
                this.f15797Q4.setPadding(H.U0(), H.U0(), H.U0(), 0);
                this.f15811e5.setText(formattedClientTime);
                if (w1()) {
                    this.f15802V4.setIndicatorColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59886t));
                    this.f15803W4.setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59886t));
                    this.f15804X4.getProgressDrawable().setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59697B), PorterDuff.Mode.SRC_IN);
                    this.f15800T4.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59878r)));
                    this.f15811e5.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59809c1));
                    this.f15805Y4.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59713F));
                    this.f15804X4.getThumb().setTint(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59910z));
                } else {
                    this.f15802V4.setIndicatorColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59890u));
                    this.f15803W4.setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59890u));
                    this.f15804X4.getProgressDrawable().setColorFilter(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59701C), PorterDuff.Mode.SRC_IN);
                    this.f15800T4.setBackground(com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59882s)));
                    this.f15811e5.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59814d1));
                    this.f15805Y4.setTextColor(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59717G));
                    this.f15804X4.getThumb().setTint(com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59693A));
                }
                if (w1()) {
                    this.f15806Z4.setVisibility(8);
                } else {
                    this.f15806Z4.setVisibility(0);
                    q1(message);
                }
            }
            if (message.getStatus() != Message.f.Sent && !Boolean.TRUE.equals(message.isRead())) {
                this.f15805Y4.setText(message.getExtras().getMediaDurationText());
                n2(false);
                if (Message.f.isFailed(message.getStatus())) {
                    m2();
                    return;
                } else {
                    h2();
                    return;
                }
            }
            final File file = (message.getExtras() == null || message.getExtras().getLocalFilePath() == null) ? null : new File(message.getExtras().getLocalFilePath());
            if (file == null || !file.exists() || message.getAttachment() == null || message.getExtras().getLocalFileSize() < message.getAttachment().getSize()) {
                this.f15805Y4.setText(og.j.d(message.getAttachment().getSize()));
                n2(false);
                if (!C3948q.b().c(message.getId())) {
                    this.f15799S4.setVisibility(8);
                    this.f15801U4.setVisibility(0);
                    this.f15798R4.setImageDrawable(e0(w1(), message.getHasComment()));
                    this.f15800T4.setOnClickListener(new View.OnClickListener() { // from class: ag.o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1992t.e2(C1992t.this, message, W10, salesIQChat, view);
                        }
                    });
                    return;
                }
                this.f15799S4.setVisibility(0);
                this.f15801U4.setVisibility(8);
                if (w1()) {
                    this.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f60158r3, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59886t)));
                } else if (message.getHasComment()) {
                    this.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f60158r3, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5335a.f55002q)));
                } else {
                    this.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f60158r3, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59890u)));
                }
                this.f15802V4.setVisibility(0);
                if (!this.f15802V4.isIndeterminate()) {
                    this.f15802V4.setIndeterminate(true);
                }
                this.f15800T4.setOnClickListener(null);
                return;
            }
            this.f15799S4.setVisibility(8);
            this.f15801U4.setVisibility(0);
            n2(true);
            if (AbstractC3934c.m(builder)) {
                this.f15798R4.setImageDrawable(k2(w1(), message.getHasComment()));
            } else {
                this.f15798R4.setImageDrawable(l2(w1(), message.getHasComment()));
            }
            this.f15804X4.setMax(Integer.parseInt(LiveChatUtil.getString(Long.valueOf(message.getExtras().getMediaDuration()))));
            int b10 = AbstractC3935d.b(builder);
            this.f15804X4.setProgress(0);
            if (b10 > -1) {
                this.f15804X4.setProgress(b10);
                this.f15805Y4.setText(j2("" + b10));
            } else {
                this.f15805Y4.setText(message.getExtras().getMediaDurationText());
            }
            AbstractC3935d.c(builder, new AbstractC3935d.a() { // from class: ag.m
                @Override // com.zoho.livechat.android.utils.AbstractC3935d.a
                public final void a(int i10, boolean z10) {
                    C1992t.a2(C1992t.this, message, i10, z10);
                }
            });
            this.f15804X4.setOnSeekBarChangeListener(new a(builder, message, file));
            this.f15799S4.setOnClickListener(null);
            this.f15800T4.setOnClickListener(new View.OnClickListener() { // from class: ag.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1992t.b2(C1992t.this, builder, message, file, view);
                }
            });
        }
    }

    public final void h2() {
        this.f15799S4.setVisibility(0);
        this.f15801U4.setVisibility(8);
        this.f15802V4.setVisibility(0);
        if (w1()) {
            this.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f60158r3, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59886t)));
        } else {
            this.f15803W4.setImageDrawable(LiveChatUtil.changeDrawableColor(d0(), od.p.f60158r3, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59890u)));
        }
        if (this.f15802V4.isIndeterminate()) {
            return;
        }
        this.f15802V4.setIndeterminate(true);
    }

    public final Drawable k2(boolean z10, boolean z11) {
        return LiveChatUtil.changeDrawableColor(d0(), od.p.f60129m, com.zoho.livechat.android.utils.P.e(d0(), i2(z10, z11)));
    }

    public final Drawable l2(boolean z10, boolean z11) {
        return LiveChatUtil.changeDrawableColor(d0(), od.p.f60134n, com.zoho.livechat.android.utils.P.e(d0(), i2(z10, z11)));
    }

    public final void n2(boolean z10) {
        if (z10) {
            this.f15804X4.setOnTouchListener(new View.OnTouchListener() { // from class: ag.q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C1992t.Z1(C1992t.this, view, motionEvent);
                }
            });
        } else {
            this.f15804X4.setOnTouchListener(new View.OnTouchListener() { // from class: ag.r
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C1992t.Y1(view, motionEvent);
                }
            });
        }
    }

    public void o2(String str, int i10) {
        if ((this.f15809c5.getStatus() == Message.f.Uploading || C3948q.b().c(str)) && this.f15809c5.getId().equals(str) && getAdapterPosition() != -1 && i10 > -1) {
            if (this.f15802V4.isIndeterminate()) {
                this.f15802V4.setIndeterminate(false);
            }
            this.f15802V4.setProgress(i10);
        }
    }

    @Override // ag.H
    public void r1(Message message, boolean z10, ImageView imageView) {
        if (x1()) {
            super.r1(message, z10, q0().getComment() == null ? this.f15806Z4 : null);
            if (Message.f.isFailed(message.getStatus())) {
                m2();
            } else if (message.getStatus() == Message.f.Uploading) {
                h2();
            }
        }
    }

    /* renamed from: ag.t$a */
    public class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Message f15813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f15814c;

        public a(String str, Message message, File file) {
            this.f15812a = str;
            this.f15813b = message;
            this.f15814c = file;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                AbstractC3935d.d(this.f15812a, i10);
                if (i10 > -1) {
                    C1992t.this.f15805Y4.setText(C1992t.j2("" + i10));
                } else {
                    C1992t.this.f15805Y4.setText(this.f15813b.getExtras().getMediaDurationText());
                }
                if (AbstractC3934c.m(this.f15812a)) {
                    AbstractC3934c.k(this.f15813b.getId(), this.f15812a, Uri.fromFile(this.f15814c), i10);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
