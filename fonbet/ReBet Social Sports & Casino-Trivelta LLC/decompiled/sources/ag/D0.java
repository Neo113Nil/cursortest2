package ag;

import ag.D0;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.twilio.voice.EventKeys;
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
import se.C6363a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class D0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public LinearLayout f15168Q4;

    /* renamed from: R4, reason: collision with root package name */
    public LinearLayout f15169R4;

    /* renamed from: S4, reason: collision with root package name */
    public ConstraintLayout f15170S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15171T4;

    /* renamed from: U4, reason: collision with root package name */
    public RecyclerView f15172U4;

    /* renamed from: V4, reason: collision with root package name */
    public RecyclerView f15173V4;

    /* renamed from: W4, reason: collision with root package name */
    public LinearLayoutManager f15174W4;

    /* renamed from: X4, reason: collision with root package name */
    public LinearLayoutManager f15175X4;

    /* renamed from: Y4, reason: collision with root package name */
    public cg.e f15176Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public a f15177Z4;

    public class b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public final List f15195a;

        public class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15197a;

            /* renamed from: b, reason: collision with root package name */
            public ImageView f15198b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f15199c;

            /* renamed from: d, reason: collision with root package name */
            public View f15200d;

            public a(View view) {
                super(view);
                this.f15197a = (LinearLayout) view.findViewById(od.q.f60452Z2);
                this.f15198b = (ImageView) view.findViewById(od.q.f60442Y2);
                TextView textView = (TextView) view.findViewById(od.q.f60463a3);
                this.f15199c = textView;
                textView.setTypeface(C6218a.C());
                this.f15200d = view.findViewById(od.q.f60432X2);
            }
        }

        public b(List list) {
            this.f15195a = list;
        }

        public static /* synthetic */ void c(Message.Meta.DisplayCard.Link link, a aVar, String str, View view) {
            if (link.getTarget() != Message.Meta.DisplayCard.Link.Target.Self) {
                LiveChatUtil.handleUri(aVar.itemView.getContext(), str);
            } else if (C6218a.c0()) {
                C6363a.b(aVar.itemView.getContext(), str);
            } else {
                MobilistenUtil.v(od.t.f61107s);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final a aVar, int i10) {
            if (i10 == getItemCount() - 1) {
                og.p.r(aVar.f15197a, com.zoho.livechat.android.utils.P.e(D0.this.d0(), AbstractC5886l.f59721H), new float[]{0.0f, 0.0f, 0.0f, 0.0f, H.V0(), H.V0(), H.V0(), H.V0()});
            } else {
                og.p.q(aVar.f15197a, com.zoho.livechat.android.utils.P.e(D0.this.d0(), AbstractC5886l.f59721H));
            }
            final Message.Meta.DisplayCard.Link link = (Message.Meta.DisplayCard.Link) this.f15195a.get(i10);
            String text = link.getText();
            final String url = link.getUrl();
            String icon = link.getIcon();
            if (text == null || text.trim().length() <= 0) {
                aVar.f15199c.setText(url);
            } else {
                aVar.f15199c.setText(text);
            }
            if (icon != null) {
                wd.d.G(aVar.f15198b, icon, null, true, true);
            } else {
                aVar.f15198b.setImageDrawable(aVar.f15198b.getContext().getResources().getDrawable(od.p.f60040T1));
                aVar.f15198b.setColorFilter(com.zoho.livechat.android.utils.P.e(aVar.f15198b.getContext(), AbstractC5886l.f59733K));
            }
            if (url != null) {
                aVar.f15197a.setOnClickListener(new View.OnClickListener() { // from class: ag.E0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        D0.b.c(Message.Meta.DisplayCard.Link.this, aVar, url, view);
                    }
                });
            }
            if (i10 == getItemCount() - 1) {
                aVar.f15200d.setVisibility(8);
            } else {
                aVar.f15200d.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60765T0, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15195a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    public D0(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        this.f15176Y4 = eVar;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(od.q.f60650s3);
        this.f15170S4 = constraintLayout2;
        constraintLayout2.setBackground(constraintLayout2.getContext().getResources().getDrawable(od.p.f60018P));
        Drawable background = this.f15170S4.getBackground();
        int e10 = com.zoho.livechat.android.utils.P.e(this.f15170S4.getContext(), AbstractC5886l.f59766S0);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(e10, mode);
        this.f15171T4 = (ImageView) view.findViewById(od.q.f60517f2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(od.q.f60507e3);
        this.f15172U4 = recyclerView;
        recyclerView.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15172U4.getContext(), AbstractC5886l.f59721H), mode);
        this.f15174W4 = new LinearLayoutManager(this.f15172U4.getContext());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60496d3);
        this.f15168Q4 = linearLayout;
        linearLayout.setBackground(linearLayout.getContext().getResources().getDrawable(od.p.f60018P));
        this.f15168Q4.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15168Q4.getContext(), AbstractC5886l.f59766S0), mode);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(od.q.f60485c3);
        this.f15169R4 = linearLayout2;
        linearLayout2.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15169R4.getContext(), AbstractC5886l.f59766S0), mode);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(od.q.f60474b3);
        this.f15173V4 = recyclerView2;
        recyclerView2.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15173V4.getContext(), AbstractC5886l.f59721H), mode);
        this.f15175X4 = new LinearLayoutManager(this.f15173V4.getContext());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, final Message message) {
        super.F1(salesIQChat, message);
        C6963d.x(O0(), message.getContent(), message, w1());
        this.f15172U4.setVisibility(8);
        if (message.getMeta() != null && message.getMeta().getDisplayCard() != null) {
            List<Message.Meta.DisplayCard.Link> links = message.getMeta().getDisplayCard().getLinks();
            if (links != null && !links.isEmpty()) {
                this.f15172U4.setVisibility(0);
                this.f15172U4.setLayoutManager(this.f15174W4);
                this.f15172U4.setAdapter(new b(links));
            }
            if (message.getMeta().getDisplayCard().getActions() != null) {
                List<Message.Meta.Action> actions = message.getMeta().getDisplayCard().getActions();
                for (int size = actions.size() - 1; size >= 0; size--) {
                    Message.Meta.Action action = actions.get(size);
                    if (action != null && "client_action".equalsIgnoreCase(action.getType()) && !ZohoLiveChat.a.a().contains(action.getClientActionName())) {
                        actions.remove(size);
                    }
                }
                if (actions.isEmpty()) {
                    this.f15168Q4.setVisibility(8);
                } else {
                    this.f15168Q4.setVisibility(0);
                    this.f15173V4.setLayoutManager(this.f15175X4);
                    a aVar = new a(actions, message);
                    this.f15177Z4 = aVar;
                    this.f15173V4.setAdapter(aVar);
                }
            }
        }
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15171T4.setVisibility(8);
        } else {
            this.f15171T4.setVisibility(0);
            wd.d.F(this.f15171T4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
        }
        this.f15171T4.setOnClickListener(new View.OnClickListener() { // from class: ag.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                D0.this.f15176Y4.M(message);
            }
        });
    }

    public class a extends RecyclerView.h implements LoaderTimerListener {

        /* renamed from: a, reason: collision with root package name */
        public final List f15178a;

        /* renamed from: b, reason: collision with root package name */
        public Message f15179b;

        /* renamed from: c, reason: collision with root package name */
        public nd.d f15180c;

        /* renamed from: ag.D0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0322a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.Meta.Action f15182a;

            public ViewOnClickListenerC0322a(Message.Meta.Action action) {
                this.f15182a = action;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LiveChatUtil.openUrl(this.f15182a.getLink());
            }
        }

        public class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f15184a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f15185b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15186c;

            /* renamed from: ag.D0$a$b$a, reason: collision with other inner class name */
            public class C0323a implements SalesIQCustomActionListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ od.z f15188a;

                public C0323a(od.z zVar) {
                    this.f15188a = zVar;
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure() {
                    a aVar = a.this;
                    aVar.g(aVar.f15179b, this.f15188a, "failure", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess() {
                    a aVar = a.this;
                    aVar.g(aVar.f15179b, this.f15188a, "success", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure(String str) {
                    a aVar = a.this;
                    aVar.g(aVar.f15179b, this.f15188a, "failure", str);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess(String str) {
                    a aVar = a.this;
                    aVar.g(aVar.f15179b, this.f15188a, "success", str);
                }
            }

            public b(String str, String str2, String str3) {
                this.f15184a = str;
                this.f15185b = str2;
                this.f15186c = str3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C5875a c5875a;
                ArrayList a10 = nd.f.a();
                boolean z10 = true;
                if (a10 != null && a10.size() > 0) {
                    for (int i10 = 0; i10 < a10.size(); i10++) {
                        Hashtable hashtable = (Hashtable) a10.get(i10);
                        if (hashtable != null && (c5875a = (C5875a) hashtable.get(a.this.f15179b.getId())) != null && c5875a.f59642d.equals(this.f15184a) && c5875a.f59641c.equals(this.f15185b) && c5875a.f59640b.equals(this.f15186c)) {
                            z10 = false;
                        }
                    }
                }
                if (z10 && ZohoLiveChat.a.b() != null && ZohoLiveChat.a.a().contains(this.f15184a)) {
                    C5875a c5875a2 = new C5875a(a.this.f15179b.getId(), a.this.f15179b.getId(), this.f15186c, this.f15185b, this.f15184a, true, null, null, rd.b.f(), null);
                    if (a10 == null) {
                        a10 = new ArrayList();
                    }
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put(a.this.f15179b.getId(), c5875a2);
                    a10.add(hashtable2);
                    nd.f.b(a10);
                    od.z zVar = new od.z(null, this.f15186c, this.f15185b, this.f15184a);
                    try {
                        ZohoLiveChat.a.b().handleCustomAction(zVar, new C0323a(zVar));
                        if (D0.this.f15177Z4 != null) {
                            D0.this.f15177Z4.notifyDataSetChanged();
                        }
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            }
        }

        public class c extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15190a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15191b;

            /* renamed from: c, reason: collision with root package name */
            public View f15192c;

            /* renamed from: d, reason: collision with root package name */
            public ProgressBar f15193d;

            public c(View view) {
                super(view);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60311L1);
                this.f15190a = linearLayout;
                og.p.s(linearLayout, com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59721H), null, Integer.valueOf(og.k.b(10)));
                TextView textView = (TextView) view.findViewById(od.q.f60271H1);
                this.f15191b = textView;
                textView.setTypeface(C6218a.C());
                this.f15192c = view.findViewById(od.q.f60291J1);
                this.f15193d = (ProgressBar) view.findViewById(od.q.f60281I1);
            }
        }

        public a(List list, Message message) {
            this.f15178a = list;
            this.f15179b = message;
        }

        private void e(Hashtable hashtable, C5875a c5875a) {
            C5875a c5875a2;
            ArrayList a10 = nd.f.a();
            if (a10 != null) {
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Hashtable hashtable2 = (Hashtable) a10.get(i10);
                    if (hashtable2 != null && (c5875a2 = (C5875a) hashtable2.get(c5875a.f59643e)) != null && c5875a2.f59642d.equals(c5875a.f59642d) && c5875a2.f59641c.equals(c5875a.f59641c) && c5875a2.f59640b.equals(c5875a.f59640b)) {
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
            h(hashtable, message, zVar.f61207b, zVar.f61208c, zVar.f61209d, false);
            if (D0.this.f15177Z4 != null) {
                D0.this.f15177Z4.notifyDataSetChanged();
            }
        }

        private void h(Hashtable hashtable, Message message, String str, String str2, String str3, boolean z10) {
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

        public int f(long j10) {
            int i10 = ((int) C6218a.M().getLong("timeout", 30000L)) / 1000;
            if (j10 > 0) {
                return i10 - ((int) ((rd.b.f() - j10) / 1000));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15178a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01d3 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01c3, B:9:0x01cb, B:12:0x01d3, B:14:0x0061, B:16:0x0069, B:18:0x0073, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0097, B:29:0x009f, B:31:0x00a7, B:34:0x00af, B:36:0x00bb, B:38:0x00c1, B:40:0x00c5, B:41:0x00c8, B:42:0x00e0, B:44:0x00e4, B:46:0x00ef, B:48:0x00f7, B:49:0x011a, B:51:0x0124, B:52:0x012f, B:54:0x0139, B:56:0x0143, B:57:0x0111, B:58:0x014c, B:60:0x015c, B:62:0x0165, B:63:0x01b7, B:65:0x0192, B:67:0x01a3, B:69:0x01af), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x01cb A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01c3, B:9:0x01cb, B:12:0x01d3, B:14:0x0061, B:16:0x0069, B:18:0x0073, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0097, B:29:0x009f, B:31:0x00a7, B:34:0x00af, B:36:0x00bb, B:38:0x00c1, B:40:0x00c5, B:41:0x00c8, B:42:0x00e0, B:44:0x00e4, B:46:0x00ef, B:48:0x00f7, B:49:0x011a, B:51:0x0124, B:52:0x012f, B:54:0x0139, B:56:0x0143, B:57:0x0111, B:58:0x014c, B:60:0x015c, B:62:0x0165, B:63:0x01b7, B:65:0x0192, B:67:0x01a3, B:69:0x01af), top: B:2:0x0004 }] */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(c cVar, int i10) {
            int i11;
            String str;
            int i12;
            String str2;
            boolean z10;
            int f10;
            try {
                Message.Meta.Action action = (Message.Meta.Action) this.f15178a.get(i10);
                String label = action.getLabel();
                String name = action.getName();
                String type = action.getType();
                cVar.f15191b.setText(label);
                cVar.f15191b.setVisibility(0);
                cVar.f15191b.setTextColor(com.zoho.livechat.android.utils.P.e(cVar.f15191b.getContext(), AbstractC5335a.f55002q));
                int i13 = 8;
                cVar.f15193d.setVisibility(8);
                if (EventKeys.URL.equalsIgnoreCase(type)) {
                    cVar.f15190a.setOnClickListener(new ViewOnClickListenerC0322a(action));
                } else if (type.equalsIgnoreCase("client_action")) {
                    String clientActionName = action.getClientActionName();
                    ArrayList a10 = nd.f.a();
                    if (a10 != null && a10.size() > 0) {
                        int i14 = 0;
                        while (i14 < a10.size()) {
                            Hashtable hashtable = (Hashtable) a10.get(i14);
                            if (hashtable != null) {
                                C5875a c5875a = (C5875a) hashtable.get(this.f15179b.getId());
                                if (c5875a != null && c5875a.f59642d.equals(clientActionName) && c5875a.f59641c.equals(label) && c5875a.f59640b.equals(name)) {
                                    this.f15180c = c5875a.f59648j;
                                    long j10 = c5875a.f59647i;
                                    if (j10 == 0 || (f10 = f(j10)) == 0) {
                                        z10 = false;
                                    } else {
                                        nd.d dVar = this.f15180c;
                                        if (dVar != null) {
                                            dVar.cancel();
                                        }
                                        nd.d dVar2 = new nd.d(f10 * 1000, 1000L, c5875a);
                                        this.f15180c = dVar2;
                                        dVar2.a(this);
                                        this.f15180c.start();
                                        z10 = true;
                                    }
                                    if (c5875a.f59645g != null) {
                                        cVar.f15191b.setVisibility(0);
                                        String str3 = c5875a.f59646h;
                                        if (str3 != null) {
                                            if (str3.equalsIgnoreCase("Timeout")) {
                                                cVar.f15191b.setText(cVar.f15191b.getContext().getResources().getString(od.t.f61120u0));
                                            } else {
                                                cVar.f15191b.setText(c5875a.f59646h);
                                            }
                                            if (c5875a.f59645g.equalsIgnoreCase("success")) {
                                                cVar.f15191b.setTextColor(-16711936);
                                            } else if (c5875a.f59645g.equalsIgnoreCase("failure") || c5875a.f59645g.equalsIgnoreCase("timeout")) {
                                                cVar.f15191b.setTextColor(-65536);
                                            }
                                        }
                                        String id2 = this.f15179b.getId();
                                        String id3 = this.f15179b.getId();
                                        nd.d dVar3 = z10 ? this.f15180c : null;
                                        int i15 = i13;
                                        String str4 = label;
                                        C5875a c5875a2 = new C5875a(id2, id3, name, str4, clientActionName, false, null, null, 0L, dVar3);
                                        name = name;
                                        clientActionName = clientActionName;
                                        Hashtable hashtable2 = new Hashtable();
                                        hashtable2.put(String.valueOf(this.f15179b.getId()), c5875a2);
                                        i11 = i15;
                                        h(hashtable2, this.f15179b, name, str4, clientActionName, true);
                                        str = str4;
                                    } else {
                                        i11 = i13;
                                        str = label;
                                        cVar.f15193d.setVisibility(0);
                                        cVar.f15191b.setVisibility(i11);
                                    }
                                    cVar.f15190a.setOnClickListener(new b(clientActionName, str, name));
                                    if (i10 == getItemCount() - 1) {
                                        cVar.f15192c.setVisibility(i11);
                                        return;
                                    } else {
                                        cVar.f15192c.setVisibility(0);
                                        return;
                                    }
                                }
                                i12 = i13;
                                str2 = label;
                                cVar.f15193d.setVisibility(i12);
                            } else {
                                i12 = i13;
                                str2 = label;
                            }
                            i14++;
                            label = str2;
                            i13 = i12;
                        }
                    }
                    i11 = i13;
                    str = label;
                    cVar.f15190a.setOnClickListener(new b(clientActionName, str, name));
                    if (i10 == getItemCount() - 1) {
                    }
                }
                i11 = 8;
                if (i10 == getItemCount() - 1) {
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
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
            e(hashtable, c5875a);
            if (D0.this.f15177Z4 != null) {
                D0.this.f15177Z4.notifyDataSetChanged();
            }
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onTick(int i10) {
        }
    }
}
