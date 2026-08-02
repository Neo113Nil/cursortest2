package ag;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC2082d0;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import od.AbstractC5886l;
import og.AbstractC5891c;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class Z0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public Message.g f15540Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ConstraintLayout f15541R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15542S4;

    /* renamed from: T4, reason: collision with root package name */
    public LinearLayout f15543T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15544U4;

    /* renamed from: V4, reason: collision with root package name */
    public TextView f15545V4;

    /* renamed from: W4, reason: collision with root package name */
    public RangeSlider f15546W4;

    /* renamed from: X4, reason: collision with root package name */
    public Slider f15547X4;

    /* renamed from: Y4, reason: collision with root package name */
    public RelativeLayout f15548Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public TextView f15549Z4;

    /* renamed from: a5, reason: collision with root package name */
    public TextView f15550a5;

    /* renamed from: b5, reason: collision with root package name */
    public TextView f15551b5;

    /* renamed from: c5, reason: collision with root package name */
    public cg.e f15552c5;

    /* renamed from: d5, reason: collision with root package name */
    public TextView f15553d5;

    public Z0(View view, ConstraintLayout constraintLayout, final cg.f fVar, final Message.g gVar, final cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15540Q4 = gVar;
        this.f15552c5 = eVar;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(od.q.f60700x3);
        this.f15541R4 = constraintLayout2;
        constraintLayout2.setOnClickListener(null);
        this.f15542S4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15543T4 = (LinearLayout) view.findViewById(od.q.f60550i3);
        this.f15544U4 = (LinearLayout) view.findViewById(od.q.f60371R1);
        this.f15545V4 = (TextView) view.findViewById(od.q.f60391T1);
        this.f15544U4.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15544U4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        this.f15545V4.setTypeface(C6218a.C());
        this.f15545V4.setText(od.t.f60943T1);
        TextView textView = this.f15545V4;
        textView.setTextColor(com.zoho.livechat.android.utils.P.a(textView.getContext()));
        this.f15547X4 = (Slider) view.findViewById(od.q.f60207A7);
        this.f15546W4 = (RangeSlider) view.findViewById(od.q.f60336N6);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(od.q.f60529g3);
        this.f15548Y4 = relativeLayout;
        AbstractC2082d0.p0(relativeLayout, i2());
        TextView textView2 = (TextView) view.findViewById(od.q.f60540h3);
        this.f15549Z4 = textView2;
        textView2.setTypeface(C6218a.P());
        TextView textView3 = (TextView) view.findViewById(od.q.f60227C7);
        this.f15550a5 = textView3;
        textView3.setTypeface(C6218a.P());
        TextView textView4 = (TextView) view.findViewById(od.q.f60217B7);
        this.f15551b5 = textView4;
        textView4.setTypeface(C6218a.P());
        TextView textView5 = (TextView) view.findViewById(od.q.f60237D7);
        this.f15553d5 = textView5;
        textView5.setTypeface(C6218a.P());
        this.f15547X4.m(new Slider.a() { // from class: ag.R0
            @Override // com.google.android.material.slider.Slider.a
            /* renamed from: c */
            public final void a(Slider slider, float f10, boolean z10) {
                Z0.this.l2((int) f10);
            }
        });
        this.f15546W4.m(new RangeSlider.b() { // from class: ag.S0
            @Override // com.google.android.material.slider.RangeSlider.b
            /* renamed from: b */
            public final void a(RangeSlider rangeSlider, float f10, boolean z10) {
                Z0.this.k2(rangeSlider);
            }
        });
        this.f15544U4.setOnClickListener(new View.OnClickListener() { // from class: ag.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Z0.e2(Z0.this, fVar, gVar, view2);
            }
        });
        this.f15542S4.setOnClickListener(new View.OnClickListener() { // from class: ag.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                eVar.M(Z0.this.q0());
            }
        });
    }

    public static /* synthetic */ void e2(Z0 z02, cg.f fVar, Message.g gVar, View view) {
        String str;
        String str2;
        List j22 = j2(z02.q0());
        if (j22.isEmpty() || fVar == null) {
            return;
        }
        Message.g gVar2 = Message.g.WidgetSlider;
        if (gVar == gVar2) {
            str = (String) j22.get((int) z02.f15547X4.getValue());
            str2 = str;
        } else {
            if (AbstractC5891c.b(z02.f15546W4.getValues(), new Function1() { // from class: ag.X0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Integer valueOf;
                    valueOf = Integer.valueOf(((Float) obj).intValue());
                    return valueOf;
                }
            }).size() > 1) {
                List j23 = j2(z02.q0());
                NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
                String str3 = numberFormat.format(Integer.parseInt((String) j23.get(((Integer) r9.get(0)).intValue()))) + " - " + numberFormat.format(Integer.parseInt((String) j23.get(((Integer) r9.get(1)).intValue())));
                str2 = Yd.a.j().v(AbstractC5891c.b(z02.f15546W4.getValues(), new Function1() { // from class: ag.Y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String valueOf;
                        valueOf = String.valueOf(((Float) obj).intValue());
                        return valueOf;
                    }
                }));
                str = str3;
            } else {
                str = null;
                str2 = null;
            }
            gVar2 = Message.g.WidgetRangeSlider;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        fVar.P(str, gVar2, str2, null);
    }

    public static List j2(Message message) {
        return message.getMeta().getInputCard() != null ? message.getMeta().getInputCard().getValues() : new ArrayList();
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, final Message message) {
        boolean z10;
        super.F1(salesIQChat, message);
        R(this.f15541R4, AbstractC5886l.f59766S0);
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15542S4.setVisibility(8);
            z10 = true;
        } else {
            this.f15542S4.setVisibility(0);
            wd.d.F(this.f15542S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        if (message.isLastMessage() && salesIQChat != null && (salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5)) {
            this.f15543T4.setVisibility(0);
            this.f15544U4.setVisibility(0);
            int e10 = com.zoho.livechat.android.utils.P.e(this.itemView.getContext(), AbstractC5886l.f59798a0);
            int g10 = com.zoho.livechat.android.utils.P.g(e10, 14);
            int g11 = com.zoho.livechat.android.utils.P.g(e10, 54);
            int g12 = com.zoho.livechat.android.utils.P.g(-1, 54);
            List j22 = j2(message);
            if (this.f15540Q4 == Message.g.WidgetSlider) {
                og.p.n(this.f15546W4);
                og.p.w(this.f15547X4);
                h2(g12, g11, g10, e10);
                this.f15547X4.setStepSize(1.0f);
                this.f15547X4.setValueFrom(0.0f);
                this.f15547X4.setValueTo(j22.size() - 1);
                if (message.getMeta() == null || message.getMeta().getInputCard() == null || message.getMeta().getInputCard().getDefaultValue() == null) {
                    this.f15547X4.setValue(0.0f);
                } else {
                    int a10 = AbstractC5891c.a(j22, new Function1() { // from class: ag.V0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Boolean valueOf;
                            Message message2 = Message.this;
                            valueOf = Boolean.valueOf(r1 == r0.getMeta().getInputCard().getDefaultValue());
                            return valueOf;
                        }
                    });
                    if (a10 > -1) {
                        this.f15547X4.setValue(a10);
                    } else {
                        this.f15547X4.setValue(0.0f);
                    }
                }
                l2((int) this.f15547X4.getValue());
            } else {
                og.p.n(this.f15547X4);
                og.p.w(this.f15546W4);
                g2(g12, g11, g10, e10);
                this.f15546W4.setStepSize(1.0f);
                this.f15546W4.setValueFrom(0.0f);
                this.f15546W4.setValueTo(j22.size() - 1);
                if (j22.size() > 1) {
                    this.f15546W4.setValues(Float.valueOf(0.0f), Float.valueOf(1.0f));
                }
                this.f15546W4.setMinSeparationValue(1.0f);
            }
            this.f15550a5.setText(j22.get(0).toString());
            this.f15551b5.setText(j22.get(j22.size() - 1).toString());
        } else {
            this.f15544U4.setVisibility(8);
            this.f15543T4.setVisibility(8);
            z11 = z10;
        }
        T1(message, z11, this.f15553d5);
    }

    public final void g2(int i10, int i11, int i12, int i13) {
        this.f15546W4.setTickActiveTintList(ColorStateList.valueOf(i10));
        this.f15546W4.setTickInactiveTintList(ColorStateList.valueOf(i11));
        this.f15546W4.setTickTintList(ColorStateList.valueOf(i10));
        this.f15546W4.setTickActiveRadius(og.k.b(2));
        this.f15546W4.setTickInactiveRadius(og.k.b(2));
        this.f15546W4.setTrackTintList(ColorStateList.valueOf(i12));
        this.f15546W4.setTrackActiveTintList(ColorStateList.valueOf(i13));
        this.f15546W4.setTrackHeight(og.k.b(4));
        this.f15546W4.setThumbTintList(ColorStateList.valueOf(i13));
        this.f15546W4.setThumbRadius(og.k.b(8));
        this.f15546W4.setHaloRadius(og.k.b(18));
        this.f15546W4.setLabelBehavior(2);
    }

    public final void h2(int i10, int i11, int i12, int i13) {
        this.f15547X4.setTickActiveTintList(ColorStateList.valueOf(i10));
        this.f15547X4.setTickInactiveTintList(ColorStateList.valueOf(i11));
        this.f15547X4.setTickTintList(ColorStateList.valueOf(i10));
        this.f15547X4.setTickActiveRadius(og.k.b(2));
        this.f15547X4.setTickInactiveRadius(og.k.b(2));
        this.f15547X4.setTrackTintList(ColorStateList.valueOf(i12));
        this.f15547X4.setTrackActiveTintList(ColorStateList.valueOf(i13));
        this.f15547X4.setTrackHeight(og.k.b(4));
        this.f15547X4.setThumbTintList(ColorStateList.valueOf(i13));
        this.f15547X4.setThumbRadius(og.k.b(8));
        this.f15547X4.setHaloRadius(og.k.b(18));
        this.f15547X4.setLabelBehavior(2);
    }

    public final GradientDrawable i2() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(og.k.b(4));
        gradientDrawable.setColor(com.zoho.livechat.android.utils.P.e(this.itemView.getContext(), AbstractC5886l.f59793Z));
        return gradientDrawable;
    }

    public final void k2(RangeSlider rangeSlider) {
        if (AbstractC5891c.b(rangeSlider.getValues(), new Function1() { // from class: ag.W0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((Float) obj).intValue());
                return valueOf;
            }
        }).size() > 1) {
            List j22 = j2(q0());
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            this.f15549Z4.setText(numberFormat.format(Integer.parseInt((String) j22.get(((Integer) r8.get(0)).intValue()))) + " - " + numberFormat.format(Integer.parseInt((String) j22.get(((Integer) r8.get(1)).intValue()))));
        }
    }

    public final void l2(int i10) {
        List j22 = j2(q0());
        if (j22.isEmpty() || this.f15540Q4 != Message.g.WidgetSlider) {
            return;
        }
        this.f15549Z4.setText((String) j22.get(i10));
    }
}
