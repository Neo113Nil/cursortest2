package ag;

import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.Gson;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.LoaderTimerListener;
import com.zoho.livechat.android.listeners.SalesIQCustomActionListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.C3937f;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.C5875a;
import og.AbstractC5892d;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class K0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public final View.OnTouchListener f15365Q4;

    /* renamed from: R4, reason: collision with root package name */
    public cg.f f15366R4;

    /* renamed from: S4, reason: collision with root package name */
    public ConstraintLayout f15367S4;

    /* renamed from: T4, reason: collision with root package name */
    public LinearLayoutManager f15368T4;

    /* renamed from: U4, reason: collision with root package name */
    public cg.e f15369U4;

    /* renamed from: V4, reason: collision with root package name */
    public Function0 f15370V4;

    /* renamed from: W4, reason: collision with root package name */
    public b f15371W4;

    /* renamed from: X4, reason: collision with root package name */
    public int f15372X4;

    /* renamed from: Y4, reason: collision with root package name */
    public HashMap f15373Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public FrameLayout f15374Z4;

    /* renamed from: a5, reason: collision with root package name */
    public ConstraintLayout f15375a5;

    /* renamed from: b5, reason: collision with root package name */
    public int f15376b5;

    /* renamed from: c5, reason: collision with root package name */
    public SalesIQChat f15377c5;

    /* renamed from: d5, reason: collision with root package name */
    public List f15378d5;

    /* renamed from: e5, reason: collision with root package name */
    public Message f15379e5;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15380a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15381b;

        public a(Message message, int i10) {
            this.f15380a = message;
            this.f15381b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            K0.this.f15369U4.q(this.f15380a, this.f15381b);
        }
    }

    public class b extends RecyclerView.h implements LoaderTimerListener {

        /* renamed from: a, reason: collision with root package name */
        public List f15383a;

        /* renamed from: b, reason: collision with root package name */
        public Message.Meta.Element f15384b;

        /* renamed from: c, reason: collision with root package name */
        public String f15385c;

        /* renamed from: d, reason: collision with root package name */
        public Message f15386d;

        /* renamed from: e, reason: collision with root package name */
        public nd.d f15387e;

        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.Meta.Action f15389a;

            public a(Message.Meta.Action action) {
                this.f15389a = action;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LiveChatUtil.handleUri(view.getContext(), this.f15389a.getLink());
            }
        }

        public class c implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.Meta.Action f15398a;

            public c(Message.Meta.Action action) {
                this.f15398a = action;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Gson j10 = Yd.a.j();
                com.google.gson.k kVar = new com.google.gson.k();
                com.google.gson.k kVar2 = new com.google.gson.k();
                if (b.this.f15384b.getTitle() != null) {
                    kVar2.p("title", b.this.f15384b.getTitle());
                }
                if (b.this.f15384b.getId() != null) {
                    kVar2.p(StackTraceHelper.ID_KEY, b.this.f15384b.getId());
                }
                kVar.m("action", j10.B(this.f15398a));
                kVar.m("element", kVar2);
                if (K0.this.f15366R4.P(b.this.f15384b.getTitle() + " - " + this.f15398a.getLabel(), Message.g.WidgetMultipleProduct, kVar, null)) {
                    K0.this.f15373Y4.clear();
                }
            }
        }

        public class d extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15400a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15401b;

            /* renamed from: c, reason: collision with root package name */
            public View f15402c;

            /* renamed from: d, reason: collision with root package name */
            public ProgressBar f15403d;

            public d(View view) {
                super(view);
                this.f15400a = (LinearLayout) view.findViewById(od.q.f60311L1);
                TextView textView = (TextView) view.findViewById(od.q.f60271H1);
                this.f15401b = textView;
                textView.setTypeface(C6218a.C());
                this.f15402c = view.findViewById(od.q.f60291J1);
                this.f15403d = (ProgressBar) view.findViewById(od.q.f60281I1);
            }
        }

        public b(Message.Meta.Element element, String str, List list, Message message) {
            this.f15384b = element;
            this.f15385c = str;
            this.f15383a = list;
            this.f15386d = message;
        }

        private void e(Hashtable hashtable, C5875a c5875a) {
            C5875a c5875a2;
            ArrayList a10 = nd.f.a();
            if (a10 != null) {
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Hashtable hashtable2 = (Hashtable) a10.get(i10);
                    if (hashtable2 != null && (c5875a2 = (C5875a) hashtable2.get(c5875a.f59643e)) != null && c5875a2.f59639a.equals(c5875a.f59639a) && c5875a2.f59642d.equals(c5875a.f59642d) && c5875a2.f59641c.equals(c5875a.f59641c) && c5875a2.f59640b.equals(c5875a.f59640b)) {
                        a10.remove(i10);
                        a10.add(hashtable);
                        nd.f.b(a10);
                        return;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Message message, od.z zVar, String str, String str2) {
            C5875a c5875a = new C5875a(LiveChatUtil.getString(message.getId()), zVar.f61206a, zVar.f61207b, zVar.f61208c, zVar.f61209d, false, str, str2, 0L, null);
            Hashtable hashtable = new Hashtable();
            hashtable.put(LiveChatUtil.getString(message.getId()), c5875a);
            h(hashtable, message, zVar.f61206a, zVar.f61207b, zVar.f61208c, zVar.f61209d, false);
            K0.this.f15371W4.notifyDataSetChanged();
        }

        public int f(long j10) {
            int i10 = ((int) C6218a.M().getLong("timeout", 30000L)) / 1000;
            if (j10 > 0) {
                return i10 - ((int) ((rd.b.f() - j10) / 1000));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f15383a == null) {
                return 0;
            }
            return K0.this.f15372X4;
        }

        public final void h(Hashtable hashtable, Message message, String str, String str2, String str3, String str4, boolean z10) {
            C5875a c5875a;
            ArrayList a10 = nd.f.a();
            for (int i10 = 0; i10 < a10.size(); i10++) {
                Hashtable hashtable2 = (Hashtable) a10.get(i10);
                if (hashtable2 != null && (c5875a = (C5875a) hashtable2.get(message.getId())) != null && c5875a.f59639a.equals(str) && c5875a.f59642d.equals(str4) && c5875a.f59641c.equals(str3) && c5875a.f59640b.equals(str2)) {
                    a10.remove(i10);
                    if (!z10) {
                        a10.add(hashtable);
                    }
                    nd.f.b(a10);
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, int i10) {
            int i11;
            int i12;
            String str;
            int i13;
            String str2;
            int f10;
            b bVar = this;
            try {
                if (dVar.getAdapterPosition() < K0.this.f15372X4 - bVar.f15383a.size()) {
                    dVar.f15402c.setVisibility(8);
                    dVar.f15400a.setBackgroundColor(com.zoho.livechat.android.utils.P.e(dVar.f15400a.getContext(), AbstractC5886l.f59766S0));
                    return;
                }
                Message.Meta.Action action = (Message.Meta.Action) bVar.f15383a.get(i10 - (K0.this.f15372X4 - bVar.f15383a.size()));
                String label = action.getLabel();
                String name = action.getName();
                String str3 = bVar.f15385c;
                dVar.f15401b.setText(label);
                int i14 = 0;
                dVar.f15401b.setVisibility(0);
                dVar.f15401b.setTextColor(com.zoho.livechat.android.utils.P.e(dVar.f15401b.getContext(), AbstractC5335a.f55002q));
                dVar.f15403d.setVisibility(8);
                if (EventKeys.URL.equalsIgnoreCase(action.getType())) {
                    dVar.f15400a.setOnClickListener(bVar.new a(action));
                    i11 = 0;
                } else if ("client_action".equalsIgnoreCase(action.getType())) {
                    String clientActionName = action.getClientActionName();
                    ArrayList a10 = nd.f.a();
                    if (a10 != null) {
                        try {
                            if (a10.size() > 0) {
                                int i15 = 0;
                                while (i15 < a10.size()) {
                                    Hashtable hashtable = (Hashtable) a10.get(i15);
                                    if (hashtable != null) {
                                        C5875a c5875a = (C5875a) hashtable.get(bVar.f15386d.getId());
                                        if (c5875a != null && c5875a.f59639a.equals(str3) && c5875a.f59642d.equals(clientActionName) && c5875a.f59641c.equals(label) && c5875a.f59640b.equals(name)) {
                                            bVar.f15387e = c5875a.f59648j;
                                            long j10 = c5875a.f59647i;
                                            if (j10 == 0 || (f10 = bVar.f(j10)) == 0) {
                                                i13 = i14;
                                            } else {
                                                nd.d dVar2 = bVar.f15387e;
                                                if (dVar2 != null) {
                                                    dVar2.cancel();
                                                }
                                                nd.d dVar3 = new nd.d(f10 * 1000, 1000L, c5875a);
                                                bVar.f15387e = dVar3;
                                                dVar3.a(bVar);
                                                bVar.f15387e.start();
                                                i13 = 1;
                                            }
                                            if (c5875a.f59645g != null) {
                                                dVar.f15401b.setVisibility(i14);
                                                String str4 = c5875a.f59646h;
                                                if (str4 != null) {
                                                    if (str4.equalsIgnoreCase("Timeout")) {
                                                        dVar.f15401b.setText(dVar.f15401b.getContext().getResources().getString(od.t.f61120u0));
                                                    } else {
                                                        dVar.f15401b.setText(c5875a.f59646h);
                                                    }
                                                    if (c5875a.f59645g.equalsIgnoreCase("success")) {
                                                        dVar.f15401b.setTextColor(-16711936);
                                                    } else if (c5875a.f59645g.equalsIgnoreCase("failure") || c5875a.f59645g.equalsIgnoreCase("timeout")) {
                                                        dVar.f15401b.setTextColor(-65536);
                                                    }
                                                }
                                                str2 = clientActionName;
                                                C5875a c5875a2 = new C5875a(bVar.f15386d.getId(), str3, name, label, str2, false, null, null, 0L, i13 != 0 ? bVar.f15387e : null);
                                                Hashtable hashtable2 = new Hashtable();
                                                hashtable2.put(bVar.f15386d.getId(), c5875a2);
                                                i11 = i14;
                                                bVar.h(hashtable2, bVar.f15386d, str3, name, label, str2, true);
                                            } else {
                                                i11 = i14;
                                                str2 = clientActionName;
                                                dVar.f15403d.setVisibility(i11);
                                                dVar.f15401b.setVisibility(8);
                                            }
                                            bVar = this;
                                            dVar.f15400a.setOnClickListener(bVar.new ViewOnClickListenerC0326b(str3, str2, label, name));
                                        } else {
                                            i12 = i14;
                                            str = clientActionName;
                                            dVar.f15403d.setVisibility(8);
                                        }
                                    } else {
                                        i12 = i14;
                                        str = clientActionName;
                                    }
                                    i15++;
                                    bVar = this;
                                    i14 = i12;
                                    clientActionName = str;
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            LiveChatUtil.log(e);
                            return;
                        }
                    }
                    i11 = i14;
                    str2 = clientActionName;
                    bVar = this;
                    dVar.f15400a.setOnClickListener(bVar.new ViewOnClickListenerC0326b(str3, str2, label, name));
                } else {
                    i11 = 0;
                    if (bVar.f15386d.getMeta() != null && bVar.f15386d.getMeta().getInputCard() != null) {
                        dVar.f15400a.setOnClickListener(bVar.new c(action));
                    }
                }
                if (i10 == bVar.getItemCount() - 1) {
                    dVar.f15402c.setVisibility(8);
                } else {
                    dVar.f15402c.setVisibility(i11);
                }
                float W02 = H.W0();
                float[] fArr = new float[8];
                fArr[i11] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = W02;
                fArr[5] = W02;
                fArr[6] = W02;
                fArr[7] = W02;
                og.p.r(dVar.f15400a, AbstractC5892d.f(dVar.f15400a.getContext(), Integer.valueOf(AbstractC5886l.f59721H)), fArr);
            } catch (Exception e11) {
                e = e11;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60759Q0, viewGroup, false));
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onFinish(C5875a c5875a) {
            c5875a.f59644f = Boolean.FALSE;
            c5875a.f59645g = "timeout";
            c5875a.f59646h = "Timeout";
            c5875a.f59647i = 0L;
            Hashtable hashtable = new Hashtable();
            hashtable.put(c5875a.f59643e, c5875a);
            e(hashtable, c5875a);
            K0.this.h2();
        }

        /* renamed from: ag.K0$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0326b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f15391a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f15392b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15393c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f15394d;

            public ViewOnClickListenerC0326b(String str, String str2, String str3, String str4) {
                this.f15391a = str;
                this.f15392b = str2;
                this.f15393c = str3;
                this.f15394d = str4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C5875a c5875a;
                ArrayList a10 = nd.f.a();
                if (a10 != null && a10.size() > 0) {
                    for (int i10 = 0; i10 < a10.size(); i10++) {
                        Hashtable hashtable = (Hashtable) a10.get(i10);
                        if (hashtable != null && (c5875a = (C5875a) hashtable.get(b.this.f15386d.getId())) != null && c5875a.f59639a.equals(this.f15391a) && c5875a.f59642d.equals(this.f15392b) && c5875a.f59641c.equals(this.f15393c) && c5875a.f59640b.equals(this.f15394d)) {
                            return;
                        }
                    }
                }
                if (ZohoLiveChat.a.b() != null) {
                    C5875a c5875a2 = new C5875a(b.this.f15386d.getId(), this.f15391a, this.f15394d, this.f15393c, this.f15392b, true, null, null, rd.b.f(), null);
                    if (a10 == null) {
                        a10 = new ArrayList();
                    }
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put(b.this.f15386d.getId(), c5875a2);
                    a10.add(hashtable2);
                    nd.f.b(a10);
                    od.z zVar = new od.z(this.f15391a, this.f15394d, this.f15393c, this.f15392b);
                    try {
                        ZohoLiveChat.a.b().handleCustomAction(zVar, new a(zVar));
                        K0.this.h2();
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            }

            /* renamed from: ag.K0$b$b$a */
            public class a implements SalesIQCustomActionListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ od.z f15396a;

                public a(od.z zVar) {
                    this.f15396a = zVar;
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure() {
                    b bVar = b.this;
                    bVar.g(bVar.f15386d, this.f15396a, "failure", null);
                    K0.this.f15371W4.notifyDataSetChanged();
                    K0.this.h2();
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess() {
                    b bVar = b.this;
                    bVar.g(bVar.f15386d, this.f15396a, "success", null);
                    K0.this.f15371W4.notifyDataSetChanged();
                    K0.this.h2();
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure(String str) {
                    b bVar = b.this;
                    bVar.g(bVar.f15386d, this.f15396a, "failure", str);
                    K0.this.f15371W4.notifyDataSetChanged();
                    K0.this.h2();
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess(String str) {
                    b bVar = b.this;
                    bVar.g(bVar.f15386d, this.f15396a, "success", str);
                    K0.this.f15371W4.notifyDataSetChanged();
                    K0.this.h2();
                }
            }
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onTick(int i10) {
        }
    }

    public K0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar, Function1 function1, Function0 function0) {
        super(view);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: ag.J0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return K0.Y1(K0.this, view2, motionEvent);
            }
        };
        this.f15365Q4 = onTouchListener;
        this.f15372X4 = 0;
        this.f15373Y4 = new HashMap();
        this.f15376b5 = 0;
        super.K1(constraintLayout);
        O1(function1);
        this.f15366R4 = fVar;
        this.f15369U4 = eVar;
        this.f15370V4 = function0;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(od.q.f60660t3);
        this.f15367S4 = constraintLayout2;
        constraintLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(constraintLayout2.getContext(), AbstractC5886l.f59766S0), H.W0(), 0, 0));
        if (g2()) {
            this.f15376b5 = 1;
            ScrollView scrollView = new ScrollView(d0());
            this.f15374Z4 = scrollView;
            scrollView.setVerticalScrollBarEnabled(false);
        } else {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(d0());
            this.f15374Z4 = horizontalScrollView;
            horizontalScrollView.setDescendantFocusability(393216);
            this.f15374Z4.setHorizontalScrollBarEnabled(false);
        }
        this.f15374Z4.setOnTouchListener(onTouchListener);
        this.f15374Z4.setId(View.generateViewId());
        r0().addView(this.f15374Z4);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = og.k.b(4);
        bVar.f18166j = constraintLayout.getId();
        this.f15374Z4.setLayoutParams(bVar);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(od.q.f60418V8);
        this.f15375a5 = constraintLayout3;
        constraintLayout3.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(constraintLayout3.getContext(), AbstractC5886l.f59766S0), H.W0(), 0, 0));
    }

    public static /* synthetic */ boolean Y1(K0 k02, View view, MotionEvent motionEvent) {
        k02.getClass();
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            k02.N0().invoke(Boolean.FALSE);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        k02.N0().invoke(Boolean.TRUE);
        return false;
    }

    public static /* synthetic */ Unit Z1(K0 k02, String str, Boolean bool) {
        Function0 function0;
        k02.f15373Y4.put(str, bool);
        if (bool.booleanValue() && (function0 = k02.f15370V4) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        this.f15377c5 = salesIQChat;
        C6963d.x(O0(), message.getContent(), message, w1());
        if (message.getMeta() != null) {
            if (message.getMeta().getDisplayCard() != null) {
                List<Message.Meta.Element> elements = message.getMeta().getDisplayCard().getElements();
                if (elements == null || elements.size() <= 0) {
                    this.f15374Z4.setVisibility(8);
                    return;
                }
                for (int i10 = 0; i10 < elements.size(); i10++) {
                    ArrayList arrayList = (ArrayList) elements.get(i10).getActions();
                    if (arrayList != null) {
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            Message.Meta.Action action = (Message.Meta.Action) arrayList.get(i12);
                            if (!"client_action".equalsIgnoreCase(LiveChatUtil.getString(action.getType())) || ZohoLiveChat.a.a().contains(action.getClientActionName())) {
                                i11++;
                            }
                        }
                        if (this.f15372X4 < i11) {
                            this.f15372X4 = i11;
                        }
                    }
                }
                this.f15374Z4.setVisibility(0);
                f2(salesIQChat, message, elements);
                return;
            }
            if (message.getMeta().getInputCard() != null) {
                List<Message.Meta.Element> elements2 = message.getMeta().getInputCard().getElements();
                if (elements2 == null || elements2.isEmpty()) {
                    this.f15374Z4.setVisibility(8);
                    return;
                }
                int size = elements2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ArrayList arrayList2 = (ArrayList) elements2.get(i13).getActions();
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size2; i15++) {
                            Message.Meta.Action action2 = (Message.Meta.Action) arrayList2.get(i15);
                            if (!"client_action".equalsIgnoreCase(LiveChatUtil.getString(action2.getType())) || ZohoLiveChat.a.a().contains(action2.getClientActionName())) {
                                i14++;
                            }
                        }
                        if (this.f15372X4 < i14) {
                            this.f15372X4 = i14;
                        }
                    }
                }
                this.f15374Z4.setVisibility(0);
                f2(salesIQChat, message, elements2);
            }
        }
    }

    public final void f2(SalesIQChat salesIQChat, Message message, List list) {
        Message message2;
        char c10;
        if (salesIQChat == null || list == null || message == null) {
            return;
        }
        FlexboxLayout flexboxLayout = new FlexboxLayout(d0());
        flexboxLayout.setId(View.generateViewId());
        flexboxLayout.setFlexWrap(0);
        int i10 = 4;
        if (g2()) {
            flexboxLayout.setFlexDirection(2);
        } else {
            flexboxLayout.setFlexDirection(0);
            flexboxLayout.setAlignItems(4);
        }
        flexboxLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.f15374Z4.removeAllViews();
        this.f15374Z4.addView(flexboxLayout);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            Message.Meta.Element element = (Message.Meta.Element) list.get(i11);
            View inflate = LayoutInflater.from(d0()).inflate(od.r.f60769X, (ViewGroup) flexboxLayout, false);
            flexboxLayout.addView(inflate);
            FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) inflate.getLayoutParams();
            layoutParams.a(0.0f);
            inflate.setLayoutParams(layoutParams);
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(od.q.f60559j2);
            int b10 = c0() ? og.k.b(52) : og.k.b(16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) constraintLayout.getLayoutParams();
            marginLayoutParams.width = u0() - (G0() + b10);
            marginLayoutParams.height = -1;
            marginLayoutParams.setMargins(0, this.f15376b5 == 1 ? og.k.b(i10) : 0, C6218a.b(8.0f), 0);
            constraintLayout.setLayoutParams(marginLayoutParams);
            constraintLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(constraintLayout.getContext(), AbstractC5886l.f59766S0), H.W0(), 0, 0));
            Guideline guideline = (Guideline) inflate.findViewById(od.q.f60398T8);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(od.q.f60528g2);
            ImageView imageView = (ImageView) inflate.findViewById(od.q.f60517f2);
            imageView.setOnTouchListener(this.f15365Q4);
            TextView textView = (TextView) inflate.findViewById(od.q.f60600n3);
            textView.setTypeface(C6218a.C());
            TextView textView2 = (TextView) inflate.findViewById(od.q.f60570k3);
            textView2.setTypeface(C6218a.P());
            textView2.setMovementMethod(C3937f.f());
            textView2.setOnTouchListener(this.f15365Q4);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(od.q.f60301K1);
            recyclerView.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(recyclerView.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
            int b11 = c0() ? C6218a.b(52.0f) : H.Y0();
            if (this.f15376b5 != 0) {
                guideline.setGuidelineBegin(b11);
            } else if (i11 == 0) {
                guideline.setGuidelineBegin(b11);
            } else {
                guideline.setGuidelineBegin(0);
            }
            if (!"true".equalsIgnoreCase(System.getProperty("chat_bot_carousal_card_image_visibility", "true")) || element.getImage() == null || element.getImage().isEmpty()) {
                linearLayout.setVisibility(8);
            } else {
                wd.d.F(imageView, element.getImage(), Float.valueOf(12.0f));
                linearLayout.setVisibility(0);
            }
            textView.setText(element.getTitle());
            SpannableStringBuilder z10 = C6963d.z(textView2, element.getSubTitle(), message, true, false, true);
            final String id2 = element.getId() != null ? element.getId() : "element_" + i11;
            if (z10 != null) {
                C6963d.r(textView2, new SpannableStringBuilder(textView2.getText()), this.f15373Y4.get(id2) == Boolean.TRUE, new Function1() { // from class: ag.I0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K0.Z1(K0.this, id2, (Boolean) obj);
                    }
                });
            }
            List<Message.Meta.Action> actions = element.getActions();
            if (actions != null) {
                for (int size2 = actions.size() - 1; size2 >= 0; size2--) {
                    Message.Meta.Action action = actions.get(size2);
                    if (action != null && "client_action".equalsIgnoreCase(LiveChatUtil.getString(action.getType())) && !ZohoLiveChat.a.a().contains(action.getClientActionName())) {
                        actions.remove(action);
                    }
                }
                boolean z11 = (message.getMeta() == null || message.getMeta().getInputCard() == null) ? false : true;
                if (actions.size() > 0) {
                    c10 = 2;
                    if ((salesIQChat.getStatus() != 2 || z11) && !message.isLastMessage()) {
                        message2 = message;
                    } else {
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
                        this.f15368T4 = linearLayoutManager;
                        recyclerView.setLayoutManager(linearLayoutManager);
                        b bVar = new b(element, element.getId(), actions, message);
                        message2 = message;
                        this.f15371W4 = bVar;
                        recyclerView.setAdapter(bVar);
                    }
                    imageView.setOnClickListener(new a(message2, i11));
                    i11++;
                    i10 = 4;
                }
            }
            message2 = message;
            c10 = 2;
            imageView.setOnClickListener(new a(message2, i11));
            i11++;
            i10 = 4;
        }
    }

    public final boolean g2() {
        return "vertical".equalsIgnoreCase(System.getProperty("chat_bot_carousal_card_properties_orientation", "horizontal"));
    }

    public final void h2() {
        f2(this.f15377c5, this.f15379e5, this.f15378d5);
    }
}
