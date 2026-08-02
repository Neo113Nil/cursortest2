package ag;

import ag.C1989r0;
import android.R;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.ui.customviews.FlowLayout;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.regex.Pattern;
import l.AbstractC5335a;
import m.AbstractActivityC5481c;
import od.AbstractC5886l;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1989r0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15749Q4;

    /* renamed from: R4, reason: collision with root package name */
    public cg.e f15750R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15751S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15752T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15753U4;

    /* renamed from: V4, reason: collision with root package name */
    public RelativeLayout f15754V4;

    /* renamed from: W4, reason: collision with root package name */
    public ImageView f15755W4;

    /* renamed from: X4, reason: collision with root package name */
    public com.google.gson.e f15756X4;

    /* renamed from: Y4, reason: collision with root package name */
    public ArrayList f15757Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public g f15758Z4;

    /* renamed from: a5, reason: collision with root package name */
    public boolean f15759a5;

    /* renamed from: b5, reason: collision with root package name */
    public int f15760b5;

    /* renamed from: c5, reason: collision with root package name */
    public int f15761c5;

    /* renamed from: d5, reason: collision with root package name */
    public String f15762d5;

    /* renamed from: e5, reason: collision with root package name */
    public Message.RespondedMessage.Value f15763e5;

    /* renamed from: f5, reason: collision with root package name */
    public TextView f15764f5;

    /* renamed from: ag.r0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15765a;

        public a(Message message) {
            this.f15765a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1989r0.this.f15750R4.M(this.f15765a);
        }
    }

    /* renamed from: ag.r0$b */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15767a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Message.RespondedMessage.Value f15768b;

        public b(ArrayList arrayList, Message.RespondedMessage.Value value) {
            this.f15767a = arrayList;
            this.f15768b = value;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1989r0.this.i2();
            if (this.f15767a.contains(this.f15768b)) {
                this.f15767a.remove(this.f15768b);
            } else {
                this.f15767a.add(this.f15768b);
            }
            if (this.f15767a.isEmpty()) {
                C1989r0.this.f15763e5 = null;
            }
        }
    }

    /* renamed from: ag.r0$c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15770a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15771b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f15772c;

        public c(ArrayList arrayList, int i10, h hVar) {
            this.f15770a = arrayList;
            this.f15771b = i10;
            this.f15772c = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1989r0.this.i2();
            Message.RespondedMessage.Value value = (Message.RespondedMessage.Value) this.f15770a.get(this.f15771b);
            if (this.f15770a.contains(value)) {
                this.f15770a.remove(value);
            } else {
                this.f15770a.add(value);
            }
            if (this.f15770a.isEmpty()) {
                C1989r0.this.f15763e5 = null;
            }
            h hVar = this.f15772c;
            hVar.a(this.f15770a, hVar);
        }
    }

    /* renamed from: ag.r0$e */
    public class e implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.a f15776a;

        public e(androidx.appcompat.app.a aVar) {
            this.f15776a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C1989r0.this.f15757Y4.size() <= 0) {
                C1989r0 c1989r0 = C1989r0.this;
                c1989r0.X1(c1989r0.f15761c5);
                return;
            }
            int size = C1989r0.this.f15757Y4.size();
            C1989r0 c1989r02 = C1989r0.this;
            if (size < c1989r02.f15761c5) {
                Toast.makeText(c1989r02.itemView.getContext(), C1989r0.this.itemView.getContext().getString(od.t.f61063l2, Integer.valueOf(C1989r0.this.f15761c5)), 0).show();
            } else if (c1989r02.f15749Q4.P(TextUtils.join(", ", Message.RespondedMessage.Value.getLabels(C1989r0.this.f15757Y4)), Message.g.WidgetInputDropdown, Yd.a.j().v(C1989r0.this.f15757Y4), null)) {
                this.f15776a.dismiss();
                C1989r0.this.f15757Y4.clear();
            }
        }
    }

    /* renamed from: ag.r0$f */
    public class f implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.a f15778a;

        public f(androidx.appcompat.app.a aVar) {
            this.f15778a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1989r0.this.f15757Y4.clear();
            this.f15778a.dismiss();
        }
    }

    /* renamed from: ag.r0$g */
    public class g extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public com.google.gson.e f15780a;

        /* renamed from: b, reason: collision with root package name */
        public h f15781b;

        /* renamed from: ag.r0$g$a */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.RespondedMessage.Value f15783a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15784b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15785c;

            public a(Message.RespondedMessage.Value value, c cVar, String str) {
                this.f15783a = value;
                this.f15784b = cVar;
                this.f15785c = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1989r0 c1989r0 = C1989r0.this;
                if (!c1989r0.f15759a5) {
                    c1989r0.f15763e5 = null;
                    if (c1989r0.f15757Y4.contains(this.f15783a)) {
                        C1989r0.this.f15757Y4.clear();
                        this.f15784b.f15793c.setChecked(false);
                    } else {
                        C1989r0.this.f15757Y4.clear();
                        C1989r0.this.f15757Y4.add(this.f15783a);
                        this.f15784b.f15793c.setChecked(true);
                    }
                    C1989r0.this.f15758Z4.notifyDataSetChanged();
                } else if (c1989r0.f15757Y4.contains(this.f15783a)) {
                    this.f15784b.f15793c.setChecked(false);
                    C1989r0.this.f15757Y4.remove(this.f15783a);
                    Message.RespondedMessage.Value value = C1989r0.this.f15763e5;
                    if (value != null && value.getLabel() != null && C1989r0.this.f15763e5.getLabel().equalsIgnoreCase(this.f15785c)) {
                        C1989r0.this.f15763e5 = null;
                    }
                } else {
                    C1989r0 c1989r02 = C1989r0.this;
                    if (c1989r02.f15760b5 == 0 || c1989r02.f15757Y4.size() != C1989r0.this.f15760b5) {
                        this.f15784b.f15793c.setChecked(true);
                        C1989r0.this.f15757Y4.add(this.f15783a);
                    } else {
                        Toast.makeText(this.f15784b.f15791a.getContext(), od.t.f61035h2, 0).show();
                    }
                }
                g gVar = g.this;
                gVar.f15781b.a(C1989r0.this.f15757Y4, g.this.f15781b);
            }
        }

        /* renamed from: ag.r0$g$b */
        public class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.RespondedMessage.Value f15787a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15788b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15789c;

            public b(Message.RespondedMessage.Value value, c cVar, String str) {
                this.f15787a = value;
                this.f15788b = cVar;
                this.f15789c = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1989r0 c1989r0 = C1989r0.this;
                if (!c1989r0.f15759a5) {
                    if (c1989r0.f15757Y4.contains(this.f15787a)) {
                        C1989r0.this.f15757Y4.clear();
                        this.f15788b.f15793c.setChecked(false);
                        Message.RespondedMessage.Value value = C1989r0.this.f15763e5;
                        if (value != null && value.getValue() != null && C1989r0.this.f15763e5.getValue().equalsIgnoreCase(this.f15789c)) {
                            C1989r0.this.f15763e5 = null;
                        }
                    } else {
                        C1989r0.this.f15757Y4.clear();
                        C1989r0.this.f15757Y4.add(this.f15787a);
                        this.f15788b.f15793c.setChecked(true);
                    }
                    C1989r0.this.f15758Z4.notifyDataSetChanged();
                } else if (c1989r0.f15757Y4.contains(this.f15787a)) {
                    this.f15788b.f15793c.setChecked(false);
                    C1989r0.this.f15757Y4.remove(this.f15787a);
                    Message.RespondedMessage.Value value2 = C1989r0.this.f15763e5;
                    if (value2 != null && value2.getValue() != null && C1989r0.this.f15763e5.getValue().equalsIgnoreCase(this.f15789c)) {
                        C1989r0.this.f15763e5 = null;
                    }
                } else {
                    C1989r0 c1989r02 = C1989r0.this;
                    if (c1989r02.f15760b5 == 0 || c1989r02.f15757Y4.size() != C1989r0.this.f15760b5) {
                        this.f15788b.f15793c.setChecked(true);
                        C1989r0.this.f15757Y4.add(this.f15787a);
                    } else {
                        Toast.makeText(this.f15788b.f15791a.getContext(), od.t.f61035h2, 0).show();
                        this.f15788b.f15793c.setChecked(false);
                    }
                }
                g gVar = g.this;
                gVar.f15781b.a(C1989r0.this.f15757Y4, g.this.f15781b);
            }
        }

        /* renamed from: ag.r0$g$c */
        public class c extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public RelativeLayout f15791a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15792b;

            /* renamed from: c, reason: collision with root package name */
            public AppCompatCheckBox f15793c;

            public c(View view) {
                super(view);
                this.f15791a = (RelativeLayout) view.findViewById(od.q.f60284I4);
                this.f15793c = (AppCompatCheckBox) view.findViewById(od.q.f60224C4);
                TextView textView = (TextView) view.findViewById(od.q.f60294J4);
                this.f15792b = textView;
                textView.setTypeface(C6218a.P());
                TextView textView2 = this.f15792b;
                textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59825f2));
            }
        }

        public g(com.google.gson.e eVar, h hVar) {
            this.f15780a = eVar;
            this.f15781b = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i10) {
            com.google.gson.h o10 = this.f15780a.o(i10);
            if (o10.k()) {
                com.google.gson.k e10 = o10.e();
                String h10 = !e10.r(AnnotatedPrivateKey.LABEL).j() ? e10.r(AnnotatedPrivateKey.LABEL).h() : null;
                Message.RespondedMessage.Value h22 = C1989r0.this.h2(e10);
                cVar.f15792b.setText(h10);
                if (C1989r0.this.f15757Y4.contains(h22)) {
                    cVar.f15793c.setChecked(true);
                    this.f15781b.a(C1989r0.this.f15757Y4, this.f15781b);
                } else {
                    cVar.f15793c.setChecked(false);
                }
                cVar.f15791a.setOnClickListener(new a(h22, cVar, h10));
                cVar.f15793c.setOnClickListener(new b(h22, cVar, h10));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60758Q, viewGroup, false));
        }

        public void e(com.google.gson.e eVar) {
            this.f15780a = eVar;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            com.google.gson.e eVar = this.f15780a;
            if (eVar == null) {
                return 0;
            }
            return eVar.size();
        }
    }

    /* renamed from: ag.r0$h */
    public interface h {
        void a(ArrayList arrayList, h hVar);
    }

    public C1989r0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        this.f15756X4 = new com.google.gson.e();
        this.f15757Y4 = new ArrayList();
        this.f15758Z4 = null;
        this.f15759a5 = true;
        this.f15760b5 = 0;
        this.f15761c5 = 0;
        this.f15763e5 = null;
        super.K1(constraintLayout);
        this.f15750R4 = eVar;
        this.f15749Q4 = fVar;
        this.f15751S4 = (ImageView) view.findViewById(od.q.f60517f2);
        TextView textView = (TextView) view.findViewById(od.q.f60462a2);
        this.f15752T4 = textView;
        textView.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15752T4.setTypeface(C6218a.P());
        this.f15753U4 = (LinearLayout) view.findViewById(od.q.f60473b2);
        this.f15754V4 = (RelativeLayout) view.findViewById(od.q.f60451Z1);
        ImageView imageView = (ImageView) view.findViewById(od.q.f60441Y1);
        this.f15755W4 = imageView;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59775U1), PorterDuff.Mode.SRC_ATOP);
        TextView textView2 = (TextView) view.findViewById(od.q.f60304K4);
        this.f15764f5 = textView2;
        textView2.setTypeface(C6218a.P());
    }

    public static /* synthetic */ void Y1(final C1989r0 c1989r0, Message.RespondedMessage.Value value, View view) {
        c1989r0.f15757Y4.clear();
        a.C0340a m10 = qe.d.m(view.getContext());
        View inflate = ((AbstractActivityC5481c) view.getContext()).getLayoutInflater().inflate(od.r.f60800o, (ViewGroup) null);
        m10.setView(inflate);
        final View findViewById = inflate.findViewById(od.q.f60661t4);
        final FlowLayout flowLayout = (FlowLayout) inflate.findViewById(od.q.f60274H4);
        final TextView textView = (TextView) inflate.findViewById(od.q.f60671u4);
        String str = c1989r0.f15762d5;
        if (str != null && str.length() > 0) {
            textView.setText(c1989r0.f15762d5);
        }
        textView.setTypeface(C6218a.C());
        textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), R.attr.textColorTertiary));
        TextView textView2 = (TextView) inflate.findViewById(od.q.f60631q4);
        textView2.setTypeface(C6218a.C());
        textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), R.attr.textColorTertiary));
        textView2.setPadding(H.W0(), H.U0(), H.W0(), H.U0());
        textView.setPadding(H.W0(), H.U0(), H.W0(), H.U0());
        LiveChatUtil.applySelectableItemBackground(textView2);
        LiveChatUtil.applySelectableItemBackground(textView);
        EditText editText = (EditText) inflate.findViewById(od.q.f60651s4);
        editText.setTypeface(C6218a.P());
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(od.q.f60681v4);
        relativeLayout.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(relativeLayout.getContext(), AbstractC5886l.f59743M1), PorterDuff.Mode.SRC_ATOP);
        TextView textView3 = (TextView) inflate.findViewById(od.q.f60264G4);
        textView3.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(od.q.f60641r4);
        androidx.appcompat.app.a create = m10.create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawableResource(od.p.f60027Q3);
        }
        if (value != null && value.getLabel() != null && value.getLabel().length() > 0 && !c1989r0.f15757Y4.contains(value)) {
            c1989r0.f15757Y4.add(value);
        }
        g gVar = c1989r0.new g(c1989r0.f15756X4, new h() { // from class: ag.q0
            @Override // ag.C1989r0.h
            public final void a(ArrayList arrayList, C1989r0.h hVar) {
                C1989r0.Z1(C1989r0.this, flowLayout, findViewById, textView, arrayList, hVar);
            }
        });
        c1989r0.f15758Z4 = gVar;
        recyclerView.setAdapter(gVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        editText.addTextChangedListener(c1989r0.new d(textView3));
        textView.setOnClickListener(c1989r0.new e(create));
        textView2.setOnClickListener(c1989r0.new f(create));
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setLayout(C6218a.r() - C6218a.b(50.0f), C6218a.p() - C6218a.b(50.0f));
        }
    }

    public static /* synthetic */ void Z1(C1989r0 c1989r0, FlowLayout flowLayout, View view, TextView textView, ArrayList arrayList, h hVar) {
        float f10;
        float f11;
        Message.RespondedMessage.Value value = c1989r0.f15763e5;
        flowLayout.removeAllViews();
        view.setVisibility(0);
        flowLayout.setVisibility(8);
        textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), R.attr.textColorTertiary));
        if (value == null || value.getLabel() == null || value.getLabel().length() <= 0 || arrayList.contains(value)) {
            f10 = 1.5f;
            f11 = 20.0f;
        } else {
            arrayList.add(value);
            textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5335a.f55002q));
            View inflate = LayoutInflater.from(c1989r0.itemView.getContext()).inflate(od.r.f60816w, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            f10 = 1.5f;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(od.q.f60244E4);
            linearLayout.setLayoutParams(layoutParams);
            f11 = 20.0f;
            linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59743M1), C6218a.b(20.0f), C6218a.b(1.5f), com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59771T1)));
            ImageView imageView = (ImageView) inflate.findViewById(od.q.f60234D4);
            imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59842j));
            TextView textView2 = (TextView) inflate.findViewById(od.q.f60254F4);
            textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), R.attr.textColorPrimary));
            textView2.setTypeface(C6218a.P());
            textView2.setText(value.getLabel());
            view.setVisibility(4);
            flowLayout.setVisibility(0);
            flowLayout.addView(inflate);
            imageView.setOnClickListener(c1989r0.new b(arrayList, value));
            hVar.a(arrayList, hVar);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5335a.f55002q));
            View inflate2 = LayoutInflater.from(c1989r0.itemView.getContext()).inflate(od.r.f60816w, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(od.q.f60244E4);
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59743M1), C6218a.b(f11), C6218a.b(f10), com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59771T1)));
            ImageView imageView2 = (ImageView) inflate2.findViewById(od.q.f60234D4);
            imageView2.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView2.getContext(), AbstractC5886l.f59842j));
            TextView textView3 = (TextView) inflate2.findViewById(od.q.f60254F4);
            textView3.setTextColor(com.zoho.livechat.android.utils.P.e(textView3.getContext(), R.attr.textColorPrimary));
            textView3.setTypeface(C6218a.P());
            textView3.setText(((Message.RespondedMessage.Value) arrayList.get(i10)).getLabel());
            view.setVisibility(4);
            flowLayout.setVisibility(0);
            flowLayout.addView(inflate2);
            imageView2.setOnClickListener(c1989r0.new c(arrayList, i10, hVar));
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        boolean z10;
        super.F1(salesIQChat, message);
        C6963d.y(O0(), message.getContent(), message, true, !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15751S4.setVisibility(8);
            z10 = true;
        } else {
            this.f15751S4.setVisibility(0);
            wd.d.F(this.f15751S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15751S4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || message.getMeta() == null || message.getMeta().getInputCard() == null || salesIQChat == null || !(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5)) {
            this.f15753U4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15753U4.setVisibility(0);
            this.f15752T4.setText(message.getMeta().getInputCard().getPlaceholder());
            com.google.gson.e c10 = message.getMeta().getInputCard().getOptions() != null ? message.getMeta().getInputCard().getOptions().c() : null;
            this.f15756X4 = c10;
            if (c10 != null) {
                for (int i10 = 0; i10 < this.f15756X4.size(); i10++) {
                    com.google.gson.h o10 = this.f15756X4.o(i10);
                    if (o10.k()) {
                        com.google.gson.k e10 = o10.e();
                        if (e10.t("selected") && Boolean.TRUE.equals(Boolean.valueOf(e10.r("selected").a()))) {
                            this.f15763e5 = h2(e10);
                        }
                    }
                }
            }
            this.f15759a5 = message.getMeta().getInputCard().isMultiple() != null && Boolean.TRUE.equals(message.getMeta().getInputCard().isMultiple());
            this.f15760b5 = message.getMeta().getInputCard().getMaximumSelection();
            this.f15761c5 = message.getMeta().getInputCard().getMinimumSelection();
            this.f15762d5 = message.getMeta().getInputCard().getSelectLabel();
            final Message.RespondedMessage.Value value = this.f15763e5;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ag.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1989r0.Y1(C1989r0.this, value, view);
                }
            };
            this.f15753U4.setOnClickListener(onClickListener);
            this.f15754V4.setOnClickListener(onClickListener);
        }
        T1(message, z11, this.f15764f5);
    }

    public com.google.gson.e g2(CharSequence charSequence, com.google.gson.e eVar) {
        com.google.gson.e eVar2 = new com.google.gson.e();
        for (int i10 = 0; i10 < eVar.size(); i10++) {
            com.google.gson.h o10 = eVar.o(i10);
            if (o10.k()) {
                com.google.gson.k e10 = o10.e();
                if (e10.r(AnnotatedPrivateKey.LABEL) != null && e10.r(AnnotatedPrivateKey.LABEL).h() != null && Pattern.compile(Pattern.quote(charSequence.toString()), 2).matcher(e10.r(AnnotatedPrivateKey.LABEL).h()).find()) {
                    eVar2.m(e10);
                }
            }
        }
        return eVar2;
    }

    public final Message.RespondedMessage.Value h2(com.google.gson.k kVar) {
        return new Message.RespondedMessage.Value(kVar.r(EventKeys.VALUE_KEY).h(), kVar.r(AnnotatedPrivateKey.LABEL).h());
    }

    public final void i2() {
        this.f15758Z4.notifyDataSetChanged();
    }

    /* renamed from: ag.r0$d */
    public class d implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f15774a;

        public d(TextView textView) {
            this.f15774a = textView;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.toString().trim().length() <= 0) {
                C1989r0 c1989r0 = C1989r0.this;
                c1989r0.f15758Z4.e(c1989r0.f15756X4);
                return;
            }
            C1989r0 c1989r02 = C1989r0.this;
            if (c1989r02.g2(charSequence, c1989r02.f15756X4).size() == 0) {
                this.f15774a.setVisibility(0);
            } else {
                this.f15774a.setVisibility(8);
            }
            C1989r0 c1989r03 = C1989r0.this;
            c1989r03.f15758Z4.e(c1989r03.g2(charSequence, c1989r03.f15756X4));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
