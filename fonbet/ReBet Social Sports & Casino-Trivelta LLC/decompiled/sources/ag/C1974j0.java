package ag;

import ag.C1974j0;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
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
import com.zoho.livechat.android.ui.activities.ArticlesActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.C5875a;
import og.AbstractC5896h;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1974j0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public LinearLayout f15664Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15665R4;

    /* renamed from: S4, reason: collision with root package name */
    public TextView f15666S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15667T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15668U4;

    /* renamed from: V4, reason: collision with root package name */
    public TextView f15669V4;

    /* renamed from: W4, reason: collision with root package name */
    public RecyclerView f15670W4;

    /* renamed from: X4, reason: collision with root package name */
    public RecyclerView f15671X4;

    /* renamed from: Y4, reason: collision with root package name */
    public LinearLayoutManager f15672Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public LinearLayoutManager f15673Z4;

    /* renamed from: a5, reason: collision with root package name */
    public cg.e f15674a5;

    /* renamed from: b5, reason: collision with root package name */
    public a f15675b5;

    /* renamed from: c5, reason: collision with root package name */
    public TextView f15676c5;

    /* renamed from: ag.j0$b */
    public static class b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public Message.Meta.DisplayCard.Articles f15692a;

        /* renamed from: ag.j0$b$a */
        public class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public RelativeLayout f15693a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15694b;

            public a(View view) {
                super(view);
                this.f15693a = (RelativeLayout) view.findViewById(od.q.f60321M1);
                TextView textView = (TextView) view.findViewById(od.q.f60331N1);
                this.f15694b = textView;
                textView.setTypeface(C6218a.P());
                TextView textView2 = this.f15694b;
                textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5335a.f55002q));
            }
        }

        public b(Message.Meta.DisplayCard.Articles articles) {
            this.f15692a = articles;
        }

        public static /* synthetic */ void c(a aVar, String str, com.google.gson.k kVar, View view) {
            Intent intent = new Intent(aVar.itemView.getContext(), (Class<?>) ArticlesActivity.class);
            if (str != null) {
                intent.putExtra("article_id", str);
            } else {
                String f10 = AbstractC5896h.f(kVar.r(EventKeys.URL));
                if (!f10.isEmpty()) {
                    intent.putExtra("article_url", f10);
                }
            }
            aVar.itemView.getContext().startActivity(intent);
        }

        public static /* synthetic */ void d(a aVar, Message.Meta.DisplayCard.Articles.NewObject.Article article, View view) {
            Intent intent = new Intent(aVar.itemView.getContext(), (Class<?>) ArticlesActivity.class);
            if (article.getId() != null) {
                intent.putExtra("article_id", article.getId());
            } else if (article.getUrl() != null) {
                intent.putExtra("article_url", article.getUrl());
            }
            aVar.itemView.getContext().startActivity(intent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final a aVar, int i10) {
            List<Message.Meta.DisplayCard.Articles.NewObject.Article> list;
            Message.Meta.DisplayCard.Articles articles = this.f15692a;
            if (articles == null) {
                return;
            }
            if (!(articles instanceof Message.Meta.DisplayCard.Articles.OldObject)) {
                if (!(articles instanceof Message.Meta.DisplayCard.Articles.NewObject) || (list = ((Message.Meta.DisplayCard.Articles.NewObject) articles).getList()) == null || list.isEmpty()) {
                    return;
                }
                final Message.Meta.DisplayCard.Articles.NewObject.Article article = list.get(i10);
                aVar.f15694b.setText(article.getText());
                aVar.f15693a.setOnClickListener(new View.OnClickListener() { // from class: ag.l0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1974j0.b.d(C1974j0.b.a.this, article, view);
                    }
                });
                return;
            }
            List<com.google.gson.k> list2 = ((Message.Meta.DisplayCard.Articles.OldObject) articles).getList();
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            final com.google.gson.k kVar = list2.get(i10);
            for (final String str : kVar.u()) {
                aVar.f15694b.setText(AbstractC5896h.f(kVar.r(str)));
                aVar.f15693a.setOnClickListener(new View.OnClickListener() { // from class: ag.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1974j0.b.c(C1974j0.b.a.this, str, kVar, view);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60761R0, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            Message.Meta.DisplayCard.Articles articles = this.f15692a;
            if (articles instanceof Message.Meta.DisplayCard.Articles.OldObject) {
                if (((Message.Meta.DisplayCard.Articles.OldObject) articles).getList() != null) {
                    return ((Message.Meta.DisplayCard.Articles.OldObject) this.f15692a).getList().size();
                }
                return 0;
            }
            if (!(articles instanceof Message.Meta.DisplayCard.Articles.NewObject) || ((Message.Meta.DisplayCard.Articles.NewObject) articles).getList() == null) {
                return 0;
            }
            return ((Message.Meta.DisplayCard.Articles.NewObject) this.f15692a).getList().size();
        }
    }

    public C1974j0(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        this.f15674a5 = eVar;
        this.f15665R4 = (ImageView) view.findViewById(od.q.f60517f2);
        TextView textView = (TextView) view.findViewById(od.q.f60580l3);
        this.f15666S4 = textView;
        textView.setTypeface(C6218a.C());
        R1(this.f15666S4);
        TextView textView2 = (TextView) view.findViewById(od.q.f60401U1);
        this.f15667T4 = textView2;
        textView2.setTypeface(C6218a.P());
        this.f15668U4 = (LinearLayout) view.findViewById(od.q.f60351P1);
        TextView textView3 = (TextView) view.findViewById(od.q.f60361Q1);
        this.f15669V4 = textView3;
        textView3.setTypeface(C6218a.C());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(od.q.f60341O1);
        this.f15670W4 = recyclerView;
        this.f15672Y4 = new LinearLayoutManager(recyclerView.getContext());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60496d3);
        this.f15664Q4 = linearLayout;
        Drawable background = linearLayout.getBackground();
        int e10 = com.zoho.livechat.android.utils.P.e(this.f15664Q4.getContext(), AbstractC5886l.f59721H);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(e10, mode);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(od.q.f60474b3);
        this.f15671X4 = recyclerView2;
        recyclerView2.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15671X4.getContext(), AbstractC5886l.f59721H), mode);
        this.f15673Z4 = new LinearLayoutManager(this.f15671X4.getContext());
        R1(this.f15667T4);
        this.f15676c5 = (TextView) view.findViewById(od.q.f60597n0);
        this.f15669V4.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        final Message message2;
        super.F1(salesIQChat, message);
        C6963d.x(this.f15666S4, message.getContent(), message, w1());
        Message.Meta meta = message.getMeta();
        Message.Meta.DisplayCard displayCard = message.getMeta().getDisplayCard();
        if (meta == null || displayCard == null) {
            return;
        }
        String description = displayCard.getDescription();
        if (description != null) {
            this.f15667T4.setVisibility(0);
            message2 = message;
            C6963d.z(this.f15667T4, LiveChatUtil.unescapeHtml(description), message2, true, false, true);
        } else {
            message2 = message;
            this.f15667T4.setVisibility(8);
        }
        Message.Meta.DisplayCard.Articles articles = displayCard.getArticles();
        if (articles == null) {
            this.f15668U4.setVisibility(8);
        } else if (articles instanceof Message.Meta.DisplayCard.Articles.NewObject) {
            ((Message.Meta.DisplayCard.Articles.NewObject) articles).getList();
            this.f15668U4.setVisibility(0);
            if (Boolean.TRUE.equals(displayCard.isHideLabel())) {
                this.f15669V4.setVisibility(8);
            } else {
                this.f15669V4.setVisibility(0);
            }
            this.f15670W4.setLayoutManager(this.f15672Y4);
            this.f15670W4.setAdapter(new b(articles));
        } else if (articles instanceof Message.Meta.DisplayCard.Articles.OldObject) {
            ((Message.Meta.DisplayCard.Articles.OldObject) articles).getList();
            this.f15668U4.setVisibility(0);
            if (Boolean.TRUE.equals(displayCard.isHideLabel())) {
                this.f15669V4.setVisibility(8);
            } else {
                this.f15669V4.setVisibility(0);
            }
            this.f15670W4.setLayoutManager(this.f15672Y4);
            this.f15670W4.setAdapter(new b(articles));
        } else {
            this.f15668U4.setVisibility(8);
        }
        if (displayCard.getImage() != null) {
            this.f15665R4.setVisibility(0);
            wd.d.F(this.f15665R4, displayCard.getImage(), Float.valueOf(10.0f));
        } else {
            this.f15665R4.setVisibility(8);
        }
        if (displayCard.getActions() != null) {
            List<Message.Meta.Action> actions = displayCard.getActions();
            for (int size = actions.size() - 1; size >= 0; size--) {
                Message.Meta.Action action = actions.get(size);
                if (action != null && "client_action".equalsIgnoreCase(LiveChatUtil.getString(action.getType()))) {
                    if (!ZohoLiveChat.a.a().contains(LiveChatUtil.getString(action.getClientActionName()))) {
                        actions.remove(size);
                    }
                }
            }
            if (actions.isEmpty()) {
                this.f15664Q4.setVisibility(8);
            } else {
                this.f15664Q4.setVisibility(0);
                this.f15671X4.setLayoutManager(this.f15673Z4);
                a aVar = new a(actions, message2);
                this.f15675b5 = aVar;
                this.f15671X4.setAdapter(aVar);
            }
        } else {
            this.f15664Q4.setVisibility(8);
        }
        this.f15676c5.setText(message2.getFormattedClientTime());
        this.f15665R4.setOnClickListener(new View.OnClickListener() { // from class: ag.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1974j0.this.f15674a5.M(message2);
            }
        });
    }

    /* renamed from: ag.j0$a */
    public class a extends RecyclerView.h implements LoaderTimerListener {

        /* renamed from: a, reason: collision with root package name */
        public List f15677a;

        /* renamed from: b, reason: collision with root package name */
        public Message f15678b;

        /* renamed from: c, reason: collision with root package name */
        public nd.d f15679c;

        /* renamed from: ag.j0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0330a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f15681a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f15682b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15683c;

            /* renamed from: ag.j0$a$a$a, reason: collision with other inner class name */
            public class C0331a implements SalesIQCustomActionListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ od.z f15685a;

                public C0331a(od.z zVar) {
                    this.f15685a = zVar;
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure() {
                    a aVar = a.this;
                    aVar.h(aVar.f15678b, this.f15685a, "failure", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess() {
                    a aVar = a.this;
                    aVar.h(aVar.f15678b, this.f15685a, "success", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure(String str) {
                    a aVar = a.this;
                    aVar.h(aVar.f15678b, this.f15685a, "failure", str);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess(String str) {
                    a aVar = a.this;
                    aVar.h(aVar.f15678b, this.f15685a, "success", str);
                }
            }

            public ViewOnClickListenerC0330a(String str, String str2, String str3) {
                this.f15681a = str;
                this.f15682b = str2;
                this.f15683c = str3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C5875a c5875a;
                ArrayList a10 = nd.f.a();
                boolean z10 = true;
                if (a10 != null && a10.size() > 0) {
                    for (int i10 = 0; i10 < a10.size(); i10++) {
                        Hashtable hashtable = (Hashtable) a10.get(i10);
                        if (hashtable != null && (c5875a = (C5875a) hashtable.get(a.this.f15678b.getId())) != null && c5875a.f59642d.equals(this.f15681a) && c5875a.f59641c.equals(this.f15682b) && c5875a.f59640b.equals(this.f15683c)) {
                            z10 = false;
                        }
                    }
                }
                if (z10 && ZohoLiveChat.a.b() != null && ZohoLiveChat.a.a().contains(this.f15681a)) {
                    C5875a c5875a2 = new C5875a(a.this.f15678b.getId(), a.this.f15678b.getId(), this.f15683c, this.f15682b, this.f15681a, true, null, null, rd.b.f(), null);
                    if (a10 == null) {
                        a10 = new ArrayList();
                    }
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put(a.this.f15678b.getId(), c5875a2);
                    a10.add(hashtable2);
                    nd.f.b(a10);
                    od.z zVar = new od.z(null, this.f15683c, this.f15682b, this.f15681a);
                    try {
                        ZohoLiveChat.a.b().handleCustomAction(zVar, new C0331a(zVar));
                        if (C1974j0.this.f15675b5 != null) {
                            C1974j0.this.f15675b5.notifyDataSetChanged();
                        }
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            }
        }

        /* renamed from: ag.j0$a$b */
        public class b extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15687a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15688b;

            /* renamed from: c, reason: collision with root package name */
            public View f15689c;

            /* renamed from: d, reason: collision with root package name */
            public ProgressBar f15690d;

            public b(View view) {
                super(view);
                this.f15687a = (LinearLayout) view.findViewById(od.q.f60311L1);
                TextView textView = (TextView) view.findViewById(od.q.f60271H1);
                this.f15688b = textView;
                textView.setTypeface(C6218a.C());
                this.f15689c = view.findViewById(od.q.f60291J1);
                this.f15690d = (ProgressBar) view.findViewById(od.q.f60281I1);
            }
        }

        public a(List list, Message message) {
            this.f15677a = list;
            this.f15678b = message;
        }

        public final void f(Hashtable hashtable, C5875a c5875a) {
            C5875a c5875a2;
            ArrayList a10 = nd.f.a();
            if (a10 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 < a10.size()) {
                        Hashtable hashtable2 = (Hashtable) a10.get(i10);
                        if (hashtable2 != null && (c5875a2 = (C5875a) hashtable2.get(LiveChatUtil.getString(c5875a.f59643e))) != null && c5875a2.f59642d.equals(c5875a.f59642d) && c5875a2.f59641c.equals(c5875a.f59641c) && c5875a2.f59640b.equals(c5875a.f59640b)) {
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

        public int g(long j10) {
            int i10 = ((int) C6218a.M().getLong("timeout", 30000L)) / 1000;
            if (j10 > 0) {
                return i10 - ((int) ((rd.b.f() - j10) / 1000));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15677a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public final void h(Message message, od.z zVar, String str, String str2) {
            C5875a c5875a = new C5875a(LiveChatUtil.getString(message.getId()), zVar.f61206a, zVar.f61207b, zVar.f61208c, zVar.f61209d, false, str, str2, 0L, null);
            Hashtable hashtable = new Hashtable();
            hashtable.put(LiveChatUtil.getString(message.getId()), c5875a);
            i(hashtable, message, zVar.f61207b, zVar.f61208c, zVar.f61209d, false);
            C1974j0.this.f15675b5.notifyDataSetChanged();
        }

        public final void i(Hashtable hashtable, Message message, String str, String str2, String str3, boolean z10) {
            C5875a c5875a;
            ArrayList a10 = nd.f.a();
            int i10 = 0;
            while (true) {
                if (i10 >= a10.size()) {
                    break;
                }
                Hashtable hashtable2 = (Hashtable) a10.get(i10);
                if (hashtable2 != null && (c5875a = (C5875a) hashtable2.get(message.getId())) != null && c5875a.f59642d.equals(str3) && c5875a.f59641c.equals(str2) && c5875a.f59640b.equals(str)) {
                    a10.remove(i10);
                    if (!z10) {
                        a10.add(hashtable);
                    }
                } else {
                    i10++;
                }
            }
            nd.f.b(a10);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01e4 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01d4, B:9:0x01dc, B:12:0x01e4, B:14:0x0061, B:16:0x006d, B:18:0x0077, B:21:0x007e, B:23:0x0084, B:25:0x008c, B:27:0x009b, B:29:0x00a3, B:31:0x00ab, B:34:0x00b3, B:36:0x00bf, B:38:0x00c5, B:40:0x00c9, B:41:0x00cc, B:42:0x00e4, B:44:0x00e8, B:46:0x00f3, B:48:0x00fb, B:49:0x011e, B:51:0x0128, B:52:0x0133, B:54:0x013d, B:56:0x0147, B:57:0x0115, B:58:0x0150, B:60:0x0160, B:62:0x016b, B:63:0x01c8, B:65:0x0194, B:67:0x01a8, B:69:0x01ba), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x01dc A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01d4, B:9:0x01dc, B:12:0x01e4, B:14:0x0061, B:16:0x006d, B:18:0x0077, B:21:0x007e, B:23:0x0084, B:25:0x008c, B:27:0x009b, B:29:0x00a3, B:31:0x00ab, B:34:0x00b3, B:36:0x00bf, B:38:0x00c5, B:40:0x00c9, B:41:0x00cc, B:42:0x00e4, B:44:0x00e8, B:46:0x00f3, B:48:0x00fb, B:49:0x011e, B:51:0x0128, B:52:0x0133, B:54:0x013d, B:56:0x0147, B:57:0x0115, B:58:0x0150, B:60:0x0160, B:62:0x016b, B:63:0x01c8, B:65:0x0194, B:67:0x01a8, B:69:0x01ba), top: B:2:0x0004 }] */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(b bVar, int i10) {
            String str;
            String str2;
            int i11;
            String str3;
            String str4;
            String str5;
            int i12;
            String str6;
            boolean z10;
            int g10;
            try {
                final Message.Meta.Action action = (Message.Meta.Action) this.f15677a.get(i10);
                String label = action.getLabel();
                String name = action.getName();
                bVar.f15688b.setText(label);
                bVar.f15688b.setVisibility(0);
                bVar.f15688b.setTextColor(com.zoho.livechat.android.utils.P.e(bVar.f15688b.getContext(), AbstractC5335a.f55002q));
                int i13 = 8;
                bVar.f15690d.setVisibility(8);
                if (EventKeys.URL.equalsIgnoreCase(action.getType())) {
                    bVar.f15687a.setOnClickListener(new View.OnClickListener() { // from class: ag.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LiveChatUtil.openUrl(Message.Meta.Action.this.getLink());
                        }
                    });
                } else if (action.getType().equalsIgnoreCase("client_action")) {
                    String clientActionName = action.getClientActionName();
                    ArrayList a10 = nd.f.a();
                    if (a10 != null && a10.size() > 0) {
                        int i14 = 0;
                        while (i14 < a10.size()) {
                            Hashtable hashtable = (Hashtable) a10.get(i14);
                            if (hashtable != null) {
                                C5875a c5875a = (C5875a) hashtable.get(this.f15678b.getId());
                                if (c5875a != null && c5875a.f59642d.equals(clientActionName) && c5875a.f59641c.equals(label) && c5875a.f59640b.equals(name)) {
                                    this.f15679c = c5875a.f59648j;
                                    long j10 = c5875a.f59647i;
                                    if (j10 == 0 || (g10 = g(j10)) == 0) {
                                        z10 = false;
                                    } else {
                                        nd.d dVar = this.f15679c;
                                        if (dVar != null) {
                                            dVar.cancel();
                                        }
                                        nd.d dVar2 = new nd.d(g10 * 1000, 1000L, c5875a);
                                        this.f15679c = dVar2;
                                        dVar2.a(this);
                                        this.f15679c.start();
                                        z10 = true;
                                    }
                                    if (c5875a.f59645g != null) {
                                        bVar.f15688b.setVisibility(0);
                                        String str7 = c5875a.f59646h;
                                        if (str7 != null) {
                                            if (str7.equalsIgnoreCase("Timeout")) {
                                                bVar.f15688b.setText(bVar.f15688b.getContext().getResources().getString(od.t.f61120u0));
                                            } else {
                                                bVar.f15688b.setText(c5875a.f59646h);
                                            }
                                            if (c5875a.f59645g.equalsIgnoreCase("success")) {
                                                bVar.f15688b.setTextColor(-16711936);
                                            } else if (c5875a.f59645g.equalsIgnoreCase("failure") || c5875a.f59645g.equalsIgnoreCase("timeout")) {
                                                bVar.f15688b.setTextColor(-65536);
                                            }
                                        }
                                        String id2 = this.f15678b.getId();
                                        String id3 = this.f15678b.getId();
                                        nd.d dVar3 = z10 ? this.f15679c : null;
                                        int i15 = i13;
                                        String str8 = name;
                                        String str9 = label;
                                        C5875a c5875a2 = new C5875a(id2, id3, str8, str9, clientActionName, false, null, null, 0L, dVar3);
                                        Hashtable hashtable2 = new Hashtable();
                                        hashtable2.put(this.f15678b.getId(), c5875a2);
                                        String str10 = clientActionName;
                                        i11 = i15;
                                        i(hashtable2, this.f15678b, str8, str9, str10, true);
                                        str = str8;
                                        str2 = str10;
                                        str3 = str9;
                                    } else {
                                        int i16 = i13;
                                        str = name;
                                        str2 = clientActionName;
                                        i11 = i16;
                                        str3 = label;
                                        bVar.f15690d.setVisibility(0);
                                        bVar.f15688b.setVisibility(i11);
                                    }
                                    bVar.f15687a.setOnClickListener(new ViewOnClickListenerC0330a(str2, str3, str));
                                    if (i10 == getItemCount() - 1) {
                                        bVar.f15689c.setVisibility(i11);
                                        return;
                                    } else {
                                        bVar.f15689c.setVisibility(0);
                                        return;
                                    }
                                }
                                int i17 = i13;
                                str4 = name;
                                str5 = clientActionName;
                                i12 = i17;
                                str6 = label;
                                bVar.f15690d.setVisibility(i12);
                            } else {
                                int i18 = i13;
                                str4 = name;
                                str5 = clientActionName;
                                i12 = i18;
                                str6 = label;
                            }
                            i14++;
                            int i19 = i12;
                            clientActionName = str5;
                            name = str4;
                            i13 = i19;
                            label = str6;
                        }
                    }
                    int i20 = i13;
                    str = name;
                    str2 = clientActionName;
                    i11 = i20;
                    str3 = label;
                    bVar.f15687a.setOnClickListener(new ViewOnClickListenerC0330a(str2, str3, str));
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
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60759Q0, viewGroup, false));
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
            if (C1974j0.this.f15675b5 != null) {
                C1974j0.this.f15675b5.notifyDataSetChanged();
            }
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onTick(int i10) {
        }
    }
}
