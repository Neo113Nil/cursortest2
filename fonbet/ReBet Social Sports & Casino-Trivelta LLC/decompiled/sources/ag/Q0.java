package ag;

import ag.Q0;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.twilio.voice.EventKeys;
import com.zoho.commons.PagerScrollingIndicator;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.LoaderTimerListener;
import com.zoho.livechat.android.listeners.SalesIQCustomActionListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.C5875a;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class Q0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public LinearLayout f15457Q4;

    /* renamed from: R4, reason: collision with root package name */
    public LinearLayout f15458R4;

    /* renamed from: S4, reason: collision with root package name */
    public ConstraintLayout f15459S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15460T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15461U4;

    /* renamed from: V4, reason: collision with root package name */
    public RecyclerView f15462V4;

    /* renamed from: W4, reason: collision with root package name */
    public RecyclerView f15463W4;

    /* renamed from: X4, reason: collision with root package name */
    public LinearLayoutManager f15464X4;

    /* renamed from: Y4, reason: collision with root package name */
    public LinearLayoutManager f15465Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public cg.e f15466Z4;

    /* renamed from: a5, reason: collision with root package name */
    public b f15467a5;

    /* renamed from: b5, reason: collision with root package name */
    public a f15468b5;

    /* renamed from: c5, reason: collision with root package name */
    public int f15469c5;

    /* renamed from: d5, reason: collision with root package name */
    public TextView f15470d5;

    public class a extends RecyclerView.h implements LoaderTimerListener {

        /* renamed from: a, reason: collision with root package name */
        public List f15471a;

        /* renamed from: b, reason: collision with root package name */
        public Message.Meta.DisplayCard f15472b;

        /* renamed from: c, reason: collision with root package name */
        public Message f15473c;

        /* renamed from: d, reason: collision with root package name */
        public nd.d f15474d;

        /* renamed from: ag.Q0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0327a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f15476a;

            public ViewOnClickListenerC0327a(String str) {
                this.f15476a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LiveChatUtil.handleUri(view.getContext(), this.f15476a);
            }
        }

        public class c extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15480a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15481b;

            /* renamed from: c, reason: collision with root package name */
            public View f15482c;

            /* renamed from: d, reason: collision with root package name */
            public ProgressBar f15483d;

            public c(View view) {
                super(view);
                this.f15480a = (LinearLayout) view.findViewById(od.q.f60311L1);
                TextView textView = (TextView) view.findViewById(od.q.f60271H1);
                this.f15481b = textView;
                textView.setTypeface(C6218a.C());
                this.f15482c = view.findViewById(od.q.f60291J1);
                this.f15483d = (ProgressBar) view.findViewById(od.q.f60281I1);
            }
        }

        public a(List list, Message.Meta.DisplayCard displayCard, Message message) {
            this.f15471a = list;
            this.f15472b = displayCard;
            this.f15473c = message;
        }

        public static /* synthetic */ void c(a aVar, String str, String str2, String str3, View view) {
            C5875a c5875a;
            aVar.getClass();
            ArrayList a10 = nd.f.a();
            if (a10 != null && a10.size() > 0) {
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Hashtable hashtable = (Hashtable) a10.get(i10);
                    if (hashtable != null && (c5875a = (C5875a) hashtable.get(aVar.f15473c.getId())) != null && c5875a.f59642d.equals(str) && c5875a.f59641c.equals(str2) && c5875a.f59640b.equals(str3)) {
                        return;
                    }
                }
            }
            if (ZohoLiveChat.a.b() != null) {
                Message.Meta.Element element = aVar.f15472b.getElements().get(Q0.this.f15469c5);
                C5875a c5875a2 = new C5875a(aVar.f15473c.getId(), element.getId(), str3, str2, str, true, null, null, rd.b.f(), null);
                if (a10 == null) {
                    a10 = new ArrayList();
                }
                Hashtable hashtable2 = new Hashtable();
                hashtable2.put(aVar.f15473c.getId(), c5875a2);
                a10.add(hashtable2);
                nd.f.b(a10);
                od.z zVar = new od.z(element.getId(), str3, str2, str);
                try {
                    ZohoLiveChat.a.b().handleCustomAction(zVar, aVar.new b(zVar));
                    Q0.this.f15468b5.notifyDataSetChanged();
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
        }

        private void f(Hashtable hashtable, C5875a c5875a) {
            C5875a c5875a2;
            ArrayList a10 = nd.f.a();
            if (a10 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 < a10.size()) {
                        Hashtable hashtable2 = (Hashtable) a10.get(i10);
                        if (hashtable2 != null && (c5875a2 = (C5875a) hashtable2.get(c5875a.f59643e)) != null && c5875a2.f59642d.equals(c5875a.f59642d) && c5875a2.f59641c.equals(c5875a.f59641c) && c5875a2.f59640b.equals(c5875a.f59640b)) {
                            a10.remove(i10);
                            a10.add(hashtable);
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            nd.f.b(a10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Message message, od.z zVar, String str, String str2) {
            C5875a c5875a = new C5875a(LiveChatUtil.getString(message.getId()), zVar.f61206a, zVar.f61207b, zVar.f61208c, zVar.f61209d, false, str, str2, 0L, null);
            Hashtable hashtable = new Hashtable();
            hashtable.put(LiveChatUtil.getString(message.getId()), c5875a);
            i(hashtable, message, zVar.f61207b, zVar.f61208c, zVar.f61209d, false);
            Q0.this.f15468b5.notifyDataSetChanged();
        }

        private void i(Hashtable hashtable, Message message, String str, String str2, String str3, boolean z10) {
            C5875a c5875a;
            ArrayList a10 = nd.f.a();
            for (int i10 = 0; i10 < a10.size(); i10++) {
                Hashtable hashtable2 = (Hashtable) a10.get(i10);
                if (hashtable2 != null && (c5875a = (C5875a) hashtable2.get(message.getId())) != null && c5875a.f59642d.equals(str3) && c5875a.f59641c.equals(str2) && c5875a.f59640b.equals(str)) {
                    a10.remove(i10);
                    if (!z10) {
                        a10.add(hashtable);
                    }
                    nd.f.b(a10);
                    return;
                }
            }
        }

        public int g(long j10) {
            int i10 = ((int) C6218a.M().getLong("timeout", 30000L)) / 1000;
            if (j10 > 0) {
                return i10 - ((int) ((rd.b.f() - j10) / 1000));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15471a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i10) {
            Message.Meta.Element element;
            boolean z10;
            int g10;
            try {
                Message.Meta.Action action = (Message.Meta.Action) this.f15471a.get(i10);
                final String label = action.getLabel();
                final String name = action.getName();
                Message.Meta.Element element2 = this.f15472b.getElements() != null ? this.f15472b.getElements().get(Q0.this.f15469c5) : null;
                cVar.f15481b.setText(label);
                cVar.f15481b.setVisibility(0);
                cVar.f15481b.setTextColor(com.zoho.livechat.android.utils.P.e(cVar.f15481b.getContext(), AbstractC5335a.f55002q));
                int i11 = 8;
                cVar.f15483d.setVisibility(8);
                if (action.getType().equalsIgnoreCase(EventKeys.URL)) {
                    cVar.f15480a.setOnClickListener(new ViewOnClickListenerC0327a(action.getLink()));
                } else if (action.getType().equalsIgnoreCase("client_action")) {
                    final String clientActionName = action.getClientActionName();
                    ArrayList a10 = nd.f.a();
                    if (a10 != null && a10.size() > 0) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= a10.size()) {
                                break;
                            }
                            Hashtable hashtable = (Hashtable) a10.get(i12);
                            if (hashtable != null) {
                                C5875a c5875a = (C5875a) hashtable.get(this.f15473c.getId());
                                if (c5875a != null && c5875a.f59642d.equals(clientActionName) && c5875a.f59641c.equals(label) && c5875a.f59640b.equals(name)) {
                                    this.f15474d = c5875a.f59648j;
                                    long j10 = c5875a.f59647i;
                                    if (j10 == 0 || (g10 = g(j10)) == 0) {
                                        z10 = false;
                                    } else {
                                        nd.d dVar = this.f15474d;
                                        if (dVar != null) {
                                            dVar.cancel();
                                        }
                                        nd.d dVar2 = new nd.d(g10 * 1000, 1000L, c5875a);
                                        this.f15474d = dVar2;
                                        dVar2.a(this);
                                        this.f15474d.start();
                                        z10 = true;
                                    }
                                    if (c5875a.f59645g != null) {
                                        cVar.f15481b.setVisibility(0);
                                        String str = c5875a.f59646h;
                                        if (str != null) {
                                            if (str.equalsIgnoreCase("Timeout")) {
                                                cVar.f15481b.setText(cVar.f15481b.getContext().getResources().getString(od.t.f61120u0));
                                            } else {
                                                cVar.f15481b.setText(c5875a.f59646h);
                                            }
                                            if (c5875a.f59645g.equalsIgnoreCase("success")) {
                                                cVar.f15481b.setTextColor(-16711936);
                                            } else if (c5875a.f59645g.equalsIgnoreCase("failure") || c5875a.f59645g.equalsIgnoreCase("timeout")) {
                                                cVar.f15481b.setTextColor(-65536);
                                            }
                                        }
                                        if (element2 != null) {
                                            C5875a c5875a2 = new C5875a(this.f15473c.getId(), element2.getId(), name, label, clientActionName, false, null, null, 0L, z10 ? this.f15474d : null);
                                            Hashtable hashtable2 = new Hashtable();
                                            hashtable2.put(this.f15473c.getId(), c5875a2);
                                            label = label;
                                            i11 = 8;
                                            name = name;
                                            i(hashtable2, this.f15473c, name, label, clientActionName, true);
                                            clientActionName = clientActionName;
                                        }
                                    } else {
                                        cVar.f15483d.setVisibility(0);
                                        cVar.f15481b.setVisibility(8);
                                    }
                                } else {
                                    element = element2;
                                    cVar.f15483d.setVisibility(8);
                                }
                            } else {
                                element = element2;
                            }
                            i12++;
                            element2 = element;
                        }
                    }
                    cVar.f15480a.setOnClickListener(new View.OnClickListener() { // from class: ag.P0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Q0.a.c(Q0.a.this, clientActionName, label, name, view);
                        }
                    });
                }
                if (i10 == getItemCount() - 1) {
                    cVar.f15482c.setVisibility(i11);
                } else {
                    cVar.f15482c.setVisibility(0);
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60759Q0, viewGroup, false));
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onFinish(C5875a c5875a) {
            c5875a.f59644f = Boolean.FALSE;
            c5875a.f59645g = "timeout";
            c5875a.f59646h = "Timeout";
            c5875a.f59647i = 0L;
            Hashtable hashtable = new Hashtable();
            hashtable.put(c5875a.f59643e, c5875a);
            f(hashtable, c5875a);
            Q0.this.f15468b5.notifyDataSetChanged();
        }

        public class b implements SalesIQCustomActionListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ od.z f15478a;

            public b(od.z zVar) {
                this.f15478a = zVar;
            }

            @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
            public void onFailure() {
                a aVar = a.this;
                aVar.h(aVar.f15473c, this.f15478a, "failure", null);
                Q0.this.f15468b5.notifyDataSetChanged();
            }

            @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
            public void onSuccess() {
                a aVar = a.this;
                aVar.h(aVar.f15473c, this.f15478a, "success", null);
                Q0.this.f15468b5.notifyDataSetChanged();
            }

            @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
            public void onFailure(String str) {
                a aVar = a.this;
                aVar.h(aVar.f15473c, this.f15478a, "failure", str);
                Q0.this.f15468b5.notifyDataSetChanged();
            }

            @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
            public void onSuccess(String str) {
                a aVar = a.this;
                aVar.h(aVar.f15473c, this.f15478a, "success", str);
                Q0.this.f15468b5.notifyDataSetChanged();
            }
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onTick(int i10) {
        }
    }

    public class b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public List f15485a;

        /* renamed from: b, reason: collision with root package name */
        public Message f15486b;

        /* renamed from: c, reason: collision with root package name */
        public Message.Meta.DisplayCard f15487c;

        public class a extends RecyclerView.v {
            public a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.v
            public void a(RecyclerView recyclerView, int i10) {
                super.a(recyclerView, i10);
                if (i10 == 0) {
                    Q0 q02 = Q0.this;
                    q02.f15469c5 = ((LinearLayoutManager) q02.f15462V4.getLayoutManager()).n2();
                }
            }
        }

        /* renamed from: ag.Q0$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0328b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f15490a;

            public ViewOnClickListenerC0328b(c cVar) {
                this.f15490a = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Q0.this.f15466Z4.q(b.this.f15486b, this.f15490a.getAdapterPosition());
            }
        }

        public class c extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15492a;

            /* renamed from: b, reason: collision with root package name */
            public ImageView f15493b;

            /* renamed from: c, reason: collision with root package name */
            public CardView f15494c;

            public c(View view) {
                super(view);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60610o3);
                this.f15492a = linearLayout;
                linearLayout.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59827g));
                CardView cardView = (CardView) view.findViewById(od.q.f60620p3);
                this.f15494c = cardView;
                cardView.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15494c.getContext(), AbstractC5886l.f59766S0), PorterDuff.Mode.SRC_ATOP);
                this.f15493b = (ImageView) view.findViewById(od.q.f60517f2);
            }
        }

        public b(Message.Meta.DisplayCard displayCard, Message message) {
            this.f15487c = displayCard;
            this.f15485a = displayCard.getElements();
            this.f15486b = message;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i10) {
            try {
                Message.Meta.Element element = (Message.Meta.Element) this.f15485a.get(cVar.getAdapterPosition());
                cVar.f15493b.setVisibility(0);
                if (element.getImage() != null) {
                    wd.d.E(cVar.f15493b, element.getImage());
                }
                Q0.this.f15462V4.n(new a());
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
            cVar.f15493b.setOnClickListener(new ViewOnClickListenerC0328b(cVar));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60763S0, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15485a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    public Q0(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view);
        this.f15469c5 = 0;
        super.K1(constraintLayout);
        this.f15466Z4 = eVar;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(od.q.f60590m3);
        this.f15459S4 = constraintLayout2;
        constraintLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(constraintLayout2.getContext(), AbstractC5886l.f59766S0), H.W0(), 0, 0));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60549i2);
        this.f15457Q4 = linearLayout;
        linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59766S0), H.W0(), 0, 0));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(od.q.f60359Q);
        this.f15458R4 = linearLayout2;
        linearLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59776U2), H.W0(), 0, 0));
        RecyclerView recyclerView = (RecyclerView) this.f15457Q4.findViewById(od.q.f60539h2);
        this.f15462V4 = recyclerView;
        this.f15464X4 = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        new androidx.recyclerview.widget.t().b(this.f15462V4);
        TextView textView = (TextView) view.findViewById(od.q.f60600n3);
        this.f15460T4 = textView;
        textView.setTypeface(C6218a.C());
        this.f15461U4 = (TextView) view.findViewById(od.q.f60543h6);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(od.q.f60301K1);
        this.f15463W4 = recyclerView2;
        recyclerView2.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15463W4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        this.f15465Y4 = new LinearLayoutManager(this.f15463W4.getContext());
        R1(this.f15461U4);
        this.f15470d5 = (TextView) view.findViewById(od.q.f60553i6);
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        C6963d.y(O0(), message.getContent(), message, w1(), false);
        if (message.getMeta() != null && message.getMeta().getDisplayCard() != null) {
            List<Message.Meta.Element> elements = message.getMeta().getDisplayCard().getElements();
            if (elements != null && !elements.isEmpty()) {
                this.f15462V4.setLayoutManager(this.f15464X4);
                b bVar = new b(message.getMeta().getDisplayCard(), message);
                this.f15467a5 = bVar;
                this.f15462V4.setAdapter(bVar);
                this.f15462V4.x1(0);
                PagerScrollingIndicator pagerScrollingIndicator = (PagerScrollingIndicator) this.itemView.findViewById(od.q.f60349P);
                if (MobilistenUtil.m()) {
                    pagerScrollingIndicator.setRotationY(180.0f);
                } else {
                    pagerScrollingIndicator.setRotationY(0.0f);
                }
                pagerScrollingIndicator.d(this.f15462V4);
            }
            String title = message.getMeta().getDisplayCard().getTitle();
            if (title != null) {
                C6963d.z(this.f15460T4, title, message, true, false, true);
            }
            String subTitle = message.getMeta().getDisplayCard().getSubTitle();
            if (subTitle != null) {
                this.f15461U4.setVisibility(0);
                C6963d.z(this.f15461U4, subTitle, message, true, true, true);
            } else {
                this.f15461U4.setVisibility(8);
            }
            if (title == null && subTitle == null) {
                R0().setVisibility(0);
                this.f15470d5.setVisibility(8);
            } else {
                R0().setVisibility(8);
                this.f15470d5.setVisibility(0);
            }
            List<Message.Meta.Action> actions = message.getMeta().getDisplayCard().getActions();
            if (actions != null) {
                ArrayList arrayList = new ArrayList(actions);
                for (int size = actions.size() - 1; size >= 0; size--) {
                    Message.Meta.Action action = actions.get(size);
                    if ("client_action".equalsIgnoreCase(LiveChatUtil.getString(action.getType())) && action.getClientActionName() != null && !ZohoLiveChat.a.a().contains(action.getClientActionName())) {
                        arrayList.remove(size);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f15463W4.setLayoutManager(this.f15465Y4);
                    a aVar = new a(arrayList, message.getMeta().getDisplayCard(), message);
                    this.f15468b5 = aVar;
                    this.f15463W4.setAdapter(aVar);
                }
            }
        }
        this.f15470d5.setText(message.getFormattedClientTime());
    }
}
