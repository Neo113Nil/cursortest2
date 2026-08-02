package ag;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.C5875a;
import rd.C6218a;
import t0.AbstractC6377b;
import zf.C6963d;

/* renamed from: ag.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1997v0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public final LinearLayout f15831Q4;

    /* renamed from: R4, reason: collision with root package name */
    public final ImageView f15832R4;

    /* renamed from: S4, reason: collision with root package name */
    public final WebView f15833S4;

    /* renamed from: T4, reason: collision with root package name */
    public final cg.e f15834T4;

    /* renamed from: U4, reason: collision with root package name */
    public final RecyclerView f15835U4;

    /* renamed from: V4, reason: collision with root package name */
    public final LinearLayoutManager f15836V4;

    /* renamed from: W4, reason: collision with root package name */
    public c f15837W4;

    /* renamed from: X4, reason: collision with root package name */
    public Message.g f15838X4;

    /* renamed from: Y4, reason: collision with root package name */
    public String f15839Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public final RelativeLayout f15840Z4;

    /* renamed from: a5, reason: collision with root package name */
    public final LinearLayout f15841a5;

    /* renamed from: b5, reason: collision with root package name */
    public final LinearLayout f15842b5;

    /* renamed from: c5, reason: collision with root package name */
    public final RelativeLayout f15843c5;

    /* renamed from: d5, reason: collision with root package name */
    public final TextView f15844d5;

    /* renamed from: e5, reason: collision with root package name */
    public final TextView f15845e5;

    /* renamed from: f5, reason: collision with root package name */
    public final ImageView f15846f5;

    /* renamed from: g5, reason: collision with root package name */
    public Message.Meta.DisplayCard.LinkInfo f15847g5;

    /* renamed from: h5, reason: collision with root package name */
    public final CardView f15848h5;

    /* renamed from: ag.v0$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : webResourceRequest.getUrl().toString();
            if (uri == null || uri.isEmpty()) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            C1997v0.this.d0().startActivity(new Intent("android.intent.action.VIEW", AbstractC6377b.a(uri)));
            return true;
        }
    }

    /* renamed from: ag.v0$b */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15850a;

        public b(Message message) {
            this.f15850a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C1997v0.this.f15834T4 != null) {
                if (C1997v0.this.f15838X4 == Message.g.WidgetImage || this.f15850a.getMeta().getDisplayCard().getImage() != null) {
                    C1997v0.this.f15834T4.M(this.f15850a);
                } else if (C1997v0.this.f15838X4 == Message.g.Video) {
                    LiveChatUtil.openUrl(C1997v0.this.f15839Y4);
                }
            }
        }
    }

    public C1997v0(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view, eVar);
        this.f15838X4 = null;
        this.f15839Y4 = null;
        super.K1(constraintLayout);
        this.f15834T4 = eVar;
        CardView cardView = (CardView) view.findViewById(od.q.f60241E1);
        this.f15848h5 = cardView;
        cardView.setCardBackgroundColor(com.zoho.livechat.android.utils.P.e(cardView.getContext(), AbstractC5886l.f59702C0));
        this.f15832R4 = (ImageView) view.findViewById(od.q.f60517f2);
        WebView webView = (WebView) view.findViewById(od.q.f60323M3);
        this.f15833S4 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setBackgroundColor(0);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new a());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60496d3);
        this.f15831Q4 = linearLayout;
        Drawable background = linearLayout.getBackground();
        int e10 = com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59721H);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(e10, mode);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(od.q.f60474b3);
        this.f15835U4 = recyclerView;
        recyclerView.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(recyclerView.getContext(), AbstractC5886l.f59721H), mode);
        this.f15836V4 = new LinearLayoutManager(recyclerView.getContext());
        this.f15840Z4 = (RelativeLayout) view.findViewById(od.q.f60487c5);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(od.q.f60243E3);
        this.f15841a5 = linearLayout2;
        linearLayout2.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59827g));
        this.f15842b5 = (LinearLayout) view.findViewById(od.q.f60263G3);
        TextView textView = (TextView) view.findViewById(od.q.f60253F3);
        this.f15844d5 = textView;
        textView.setTypeface(C6218a.P());
        textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59813d0));
        this.f15843c5 = (RelativeLayout) view.findViewById(od.q.f60283I3);
        TextView textView2 = (TextView) view.findViewById(od.q.f60273H3);
        this.f15845e5 = textView2;
        textView2.setTypeface(C6218a.P(), 1);
        textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59818e0));
        this.f15846f5 = (ImageView) view.findViewById(od.q.f60233D3);
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        this.f15840Z4.setVisibility(8);
        this.f15843c5.setVisibility(8);
        this.f15846f5.setVisibility(8);
        this.f15841a5.setVisibility(8);
        C6963d.x(O0(), message.getContent(), message, true);
        if (message.getMeta() != null && message.getMeta().getDisplayCard() != null && message.getMeta().getDisplayCard().getType() != null) {
            this.f15838X4 = message.getMeta().getDisplayCard().getType();
        }
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null) {
            this.f15832R4.setVisibility(8);
        } else if (message.getMeta().getDisplayCard().getImage() != null) {
            this.f15832R4.setVisibility(0);
            Message.Meta.DisplayCard.a imagePosition = message.getMeta().getDisplayCard().getImagePosition();
            if (imagePosition != null) {
                if (imagePosition == Message.Meta.DisplayCard.a.Fit) {
                    this.f15832R4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (imagePosition == Message.Meta.DisplayCard.a.Fill) {
                    this.f15832R4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
            }
            wd.d.E(this.f15832R4, message.getMeta().getDisplayCard().getImage());
        } else if (this.f15838X4 == Message.g.Video) {
            this.f15832R4.setVisibility(0);
            this.f15840Z4.setVisibility(0);
            Message.Meta.DisplayCard displayCard = message.getMeta().getDisplayCard();
            this.f15839Y4 = displayCard.getUrl();
            Message.Meta.DisplayCard.LinkInfo linkInfo = displayCard.getLinkInfo();
            this.f15847g5 = linkInfo;
            if (linkInfo != null) {
                String thumbnailUrl = linkInfo.getThumbnailUrl();
                if (this.f15847g5.getProviderName() != null && "YouTube".contains(this.f15847g5.getProviderName()) && this.f15847g5.getUrl() != null && !this.f15847g5.getUrl().isEmpty()) {
                    this.f15840Z4.setVisibility(8);
                    this.f15833S4.setVisibility(0);
                    this.f15832R4.setVisibility(8);
                    HashMap hashMap = new HashMap();
                    hashMap.put("Referer", "https://" + MobilistenUtil.f());
                    String e22 = e2(this.f15847g5.getUrl(), displayCard.getAutoplay() != null && displayCard.getAutoplay().booleanValue());
                    if (e22 != null) {
                        this.f15833S4.loadUrl(e22, hashMap);
                    } else if (thumbnailUrl != null && !thumbnailUrl.isEmpty()) {
                        wd.d.E(this.f15832R4, thumbnailUrl);
                    }
                } else if (thumbnailUrl != null && !thumbnailUrl.isEmpty()) {
                    wd.d.E(this.f15832R4, thumbnailUrl);
                }
                String providerName = this.f15847g5.getProviderName();
                if (providerName == null || providerName.isEmpty()) {
                    try {
                        providerName = new URL(this.f15839Y4).getHost();
                    } catch (MalformedURLException unused) {
                    }
                }
                final String providerUrl = this.f15847g5.getProviderUrl();
                if (providerName != null && !providerName.isEmpty()) {
                    this.f15841a5.setVisibility(0);
                    this.f15844d5.setText(providerName);
                    if (providerUrl == null || providerUrl.length() <= 0) {
                        this.f15842b5.setOnClickListener(null);
                    } else {
                        this.f15842b5.setOnClickListener(new View.OnClickListener() { // from class: ag.u0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LiveChatUtil.openUrl(providerUrl);
                            }
                        });
                    }
                }
                if (this.f15847g5.getTitle() != null && !this.f15847g5.getTitle().isEmpty()) {
                    String string = LiveChatUtil.getString(this.f15847g5.getTitle());
                    if (string.length() > 0) {
                        this.f15843c5.setVisibility(0);
                        this.f15845e5.setText(string);
                    }
                }
                if (this.f15847g5.getFavIconLink() != null && !this.f15847g5.getFavIconLink().isEmpty()) {
                    String favIconLink = this.f15847g5.getFavIconLink();
                    if (favIconLink.length() > 0) {
                        this.f15846f5.setVisibility(0);
                        wd.d.E(this.f15846f5, favIconLink);
                    }
                }
            }
        }
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getActions() == null) {
            this.f15831Q4.setVisibility(8);
        } else {
            List<Message.Meta.Action> actions = message.getMeta().getDisplayCard().getActions();
            for (int size = actions.size() - 1; size >= 0; size--) {
                Message.Meta.Action action = actions.get(size);
                if (action != null && "client_action".equalsIgnoreCase(action.getType()) && !ZohoLiveChat.a.a().contains(action.getClientActionName())) {
                    actions.remove(size);
                }
            }
            if (actions.size() > 0) {
                this.f15831Q4.setVisibility(0);
                this.f15835U4.setLayoutManager(this.f15836V4);
                c cVar = new c(actions, message);
                this.f15837W4 = cVar;
                this.f15835U4.setAdapter(cVar);
            } else {
                this.f15831Q4.setVisibility(8);
            }
        }
        this.f15832R4.setOnClickListener(new b(message));
    }

    public final String d2(String str) {
        Matcher matcher = Pattern.compile("(?<=watch\\?v=|/videos/|embed/|shorts/|youtu.be/|/v/|/e/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%2Fvideos%2F|youtu.be%2F|/v%2F)[^#&?]*", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public final String e2(String str, boolean z10) {
        String d22 = d2(str);
        if (d22 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://www.youtube.com/embed/");
        sb2.append(d22);
        sb2.append("?autoplay=");
        sb2.append(z10 ? "1" : "0");
        sb2.append("&mute=0&controls=1&modestbranding=1&rel=0&showinfo=0&iv_load_policy=3&cc_load_policy=0&fs=0");
        return sb2.toString();
    }

    public void f2() {
        this.f15832R4.setImageDrawable(null);
    }

    /* renamed from: ag.v0$c */
    public class c extends RecyclerView.h implements LoaderTimerListener {

        /* renamed from: a, reason: collision with root package name */
        public List f15852a;

        /* renamed from: b, reason: collision with root package name */
        public Message f15853b;

        /* renamed from: c, reason: collision with root package name */
        public nd.d f15854c;

        /* renamed from: ag.v0$c$a */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message.Meta.Action f15856a;

            public a(Message.Meta.Action action) {
                this.f15856a = action;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LiveChatUtil.openUrl(this.f15856a.getLink());
            }
        }

        /* renamed from: ag.v0$c$b */
        public class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f15858a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f15859b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f15860c;

            /* renamed from: ag.v0$c$b$a */
            public class a implements SalesIQCustomActionListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ od.z f15862a;

                public a(od.z zVar) {
                    this.f15862a = zVar;
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure() {
                    c cVar = c.this;
                    cVar.f(cVar.f15853b, this.f15862a, "failure", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess() {
                    c cVar = c.this;
                    cVar.f(cVar.f15853b, this.f15862a, "success", null);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onFailure(String str) {
                    c cVar = c.this;
                    cVar.f(cVar.f15853b, this.f15862a, "failure", str);
                }

                @Override // com.zoho.livechat.android.listeners.SalesIQCustomActionListener
                public void onSuccess(String str) {
                    c cVar = c.this;
                    cVar.f(cVar.f15853b, this.f15862a, "success", str);
                }
            }

            public b(String str, String str2, String str3) {
                this.f15858a = str;
                this.f15859b = str2;
                this.f15860c = str3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C5875a c5875a;
                ArrayList a10 = nd.f.a();
                boolean z10 = true;
                if (a10 != null && a10.size() > 0) {
                    for (int i10 = 0; i10 < a10.size(); i10++) {
                        Hashtable hashtable = (Hashtable) a10.get(i10);
                        if (hashtable != null && (c5875a = (C5875a) hashtable.get(c.this.f15853b.getId())) != null && c5875a.f59642d.equals(this.f15858a) && c5875a.f59641c.equals(this.f15859b) && c5875a.f59640b.equals(this.f15860c)) {
                            z10 = false;
                        }
                    }
                }
                if (z10 && ZohoLiveChat.a.b() != null && ZohoLiveChat.a.a().contains(this.f15858a)) {
                    C5875a c5875a2 = new C5875a(c.this.f15853b.getId(), c.this.f15853b.getId(), this.f15860c, this.f15859b, this.f15858a, true, null, null, rd.b.f(), null);
                    if (a10 == null) {
                        a10 = new ArrayList();
                    }
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put(c.this.f15853b.getId(), c5875a2);
                    a10.add(hashtable2);
                    nd.f.b(a10);
                    od.z zVar = new od.z(null, this.f15860c, this.f15859b, this.f15858a);
                    try {
                        ZohoLiveChat.a.b().handleCustomAction(zVar, new a(zVar));
                        if (C1997v0.this.f15837W4 != null) {
                            C1997v0.this.f15837W4.notifyDataSetChanged();
                        }
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            }
        }

        /* renamed from: ag.v0$c$c, reason: collision with other inner class name */
        public class C0332c extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15864a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15865b;

            /* renamed from: c, reason: collision with root package name */
            public View f15866c;

            /* renamed from: d, reason: collision with root package name */
            public ProgressBar f15867d;

            public C0332c(View view) {
                super(view);
                this.f15864a = (LinearLayout) view.findViewById(od.q.f60311L1);
                TextView textView = (TextView) view.findViewById(od.q.f60271H1);
                this.f15865b = textView;
                textView.setTypeface(C6218a.C());
                this.f15866c = view.findViewById(od.q.f60291J1);
                this.f15867d = (ProgressBar) view.findViewById(od.q.f60281I1);
            }
        }

        public c(List list, Message message) {
            this.f15852a = list;
            this.f15853b = message;
        }

        private void d(Hashtable hashtable, C5875a c5875a) {
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
        public void f(Message message, od.z zVar, String str, String str2) {
            C5875a c5875a = new C5875a(LiveChatUtil.getString(message.getId()), zVar.f61206a, zVar.f61207b, zVar.f61208c, zVar.f61209d, false, str, str2, 0L, null);
            Hashtable hashtable = new Hashtable();
            hashtable.put(LiveChatUtil.getString(message.getId()), c5875a);
            g(hashtable, message, zVar.f61207b, zVar.f61208c, zVar.f61209d, false);
            C1997v0.this.f15837W4.notifyDataSetChanged();
        }

        private void g(Hashtable hashtable, Message message, String str, String str2, String str3, boolean z10) {
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

        public int e(long j10) {
            int i10 = ((int) C6218a.M().getLong("timeout", 30000L)) / 1000;
            if (j10 > 0) {
                return i10 - ((int) ((rd.b.f() - j10) / 1000));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15852a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01cf A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01bf, B:9:0x01c7, B:12:0x01cf, B:14:0x0061, B:16:0x0069, B:18:0x0073, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0097, B:29:0x009f, B:31:0x00a7, B:34:0x00af, B:36:0x00bb, B:38:0x00c1, B:40:0x00c5, B:41:0x00c8, B:42:0x00e0, B:44:0x00e4, B:46:0x00ef, B:48:0x00f7, B:49:0x011a, B:51:0x0124, B:52:0x012f, B:54:0x0139, B:56:0x0143, B:57:0x0111, B:58:0x014c, B:60:0x015c, B:62:0x0165, B:63:0x01b3, B:65:0x018e, B:67:0x019f, B:69:0x01ab), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x01c7 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0004, B:5:0x004f, B:7:0x01bf, B:9:0x01c7, B:12:0x01cf, B:14:0x0061, B:16:0x0069, B:18:0x0073, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0097, B:29:0x009f, B:31:0x00a7, B:34:0x00af, B:36:0x00bb, B:38:0x00c1, B:40:0x00c5, B:41:0x00c8, B:42:0x00e0, B:44:0x00e4, B:46:0x00ef, B:48:0x00f7, B:49:0x011a, B:51:0x0124, B:52:0x012f, B:54:0x0139, B:56:0x0143, B:57:0x0111, B:58:0x014c, B:60:0x015c, B:62:0x0165, B:63:0x01b3, B:65:0x018e, B:67:0x019f, B:69:0x01ab), top: B:2:0x0004 }] */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(C0332c c0332c, int i10) {
            int i11;
            String str;
            int i12;
            String str2;
            boolean z10;
            int e10;
            try {
                Message.Meta.Action action = (Message.Meta.Action) this.f15852a.get(i10);
                String label = action.getLabel();
                String name = action.getName();
                String type = action.getType();
                c0332c.f15865b.setText(label);
                c0332c.f15865b.setVisibility(0);
                c0332c.f15865b.setTextColor(com.zoho.livechat.android.utils.P.e(c0332c.f15865b.getContext(), AbstractC5335a.f55002q));
                int i13 = 8;
                c0332c.f15867d.setVisibility(8);
                if (type.equalsIgnoreCase(EventKeys.URL)) {
                    c0332c.f15864a.setOnClickListener(new a(action));
                } else if (type.equalsIgnoreCase("client_action")) {
                    String clientActionName = action.getClientActionName();
                    ArrayList a10 = nd.f.a();
                    if (a10 != null && a10.size() > 0) {
                        int i14 = 0;
                        while (i14 < a10.size()) {
                            Hashtable hashtable = (Hashtable) a10.get(i14);
                            if (hashtable != null) {
                                C5875a c5875a = (C5875a) hashtable.get(this.f15853b.getId());
                                if (c5875a != null && c5875a.f59642d.equals(clientActionName) && c5875a.f59641c.equals(label) && c5875a.f59640b.equals(name)) {
                                    this.f15854c = c5875a.f59648j;
                                    long j10 = c5875a.f59647i;
                                    if (j10 == 0 || (e10 = e(j10)) == 0) {
                                        z10 = false;
                                    } else {
                                        nd.d dVar = this.f15854c;
                                        if (dVar != null) {
                                            dVar.cancel();
                                        }
                                        nd.d dVar2 = new nd.d(e10 * 1000, 1000L, c5875a);
                                        this.f15854c = dVar2;
                                        dVar2.a(this);
                                        this.f15854c.start();
                                        z10 = true;
                                    }
                                    if (c5875a.f59645g != null) {
                                        c0332c.f15865b.setVisibility(0);
                                        String str3 = c5875a.f59646h;
                                        if (str3 != null) {
                                            if (str3.equalsIgnoreCase("Timeout")) {
                                                c0332c.f15865b.setText(c0332c.f15865b.getContext().getResources().getString(od.t.f61120u0));
                                            } else {
                                                c0332c.f15865b.setText(c5875a.f59646h);
                                            }
                                            if (c5875a.f59645g.equalsIgnoreCase("success")) {
                                                c0332c.f15865b.setTextColor(-16711936);
                                            } else if (c5875a.f59645g.equalsIgnoreCase("failure") || c5875a.f59645g.equalsIgnoreCase("timeout")) {
                                                c0332c.f15865b.setTextColor(-65536);
                                            }
                                        }
                                        String id2 = this.f15853b.getId();
                                        String id3 = this.f15853b.getId();
                                        nd.d dVar3 = z10 ? this.f15854c : null;
                                        int i15 = i13;
                                        String str4 = label;
                                        C5875a c5875a2 = new C5875a(id2, id3, name, str4, clientActionName, false, null, null, 0L, dVar3);
                                        name = name;
                                        clientActionName = clientActionName;
                                        Hashtable hashtable2 = new Hashtable();
                                        hashtable2.put(this.f15853b.getId(), c5875a2);
                                        i11 = i15;
                                        g(hashtable2, this.f15853b, name, str4, clientActionName, true);
                                        str = str4;
                                    } else {
                                        i11 = i13;
                                        str = label;
                                        c0332c.f15867d.setVisibility(0);
                                        c0332c.f15865b.setVisibility(i11);
                                    }
                                    c0332c.f15864a.setOnClickListener(new b(clientActionName, str, name));
                                    if (i10 == getItemCount() - 1) {
                                        c0332c.f15866c.setVisibility(i11);
                                        return;
                                    } else {
                                        c0332c.f15866c.setVisibility(0);
                                        return;
                                    }
                                }
                                i12 = i13;
                                str2 = label;
                                c0332c.f15867d.setVisibility(i12);
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
                    c0332c.f15864a.setOnClickListener(new b(clientActionName, str, name));
                    if (i10 == getItemCount() - 1) {
                    }
                }
                i11 = 8;
                if (i10 == getItemCount() - 1) {
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C0332c onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new C0332c(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60759Q0, viewGroup, false));
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onFinish(C5875a c5875a) {
            c5875a.f59644f = Boolean.FALSE;
            c5875a.f59645g = "timeout";
            c5875a.f59646h = "Timeout";
            c5875a.f59647i = 0L;
            Hashtable hashtable = new Hashtable();
            hashtable.put(c5875a.f59643e, c5875a);
            d(hashtable, c5875a);
            if (C1997v0.this.f15837W4 != null) {
                C1997v0.this.f15837W4.notifyDataSetChanged();
            }
        }

        @Override // com.zoho.livechat.android.listeners.LoaderTimerListener
        public void onTick(int i10) {
        }
    }
}
