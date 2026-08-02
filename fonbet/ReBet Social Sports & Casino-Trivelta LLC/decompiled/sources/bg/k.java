package bg;

import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.InterfaceC2920c;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.conversations.ui.ConversationsViewModel;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import od.AbstractC5886l;
import od.t;
import og.AbstractC5892d;
import rd.C6218a;

/* loaded from: classes4.dex */
public class k extends f implements InterfaceC2920c {

    /* renamed from: m, reason: collision with root package name */
    public Zf.e f25081m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f25082n;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f25084p;

    /* renamed from: q, reason: collision with root package name */
    public ScrollView f25085q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f25086r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f25087s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f25088t;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f25089u;

    /* renamed from: w, reason: collision with root package name */
    public ConversationsViewModel f25091w;

    /* renamed from: o, reason: collision with root package name */
    public HashMap f25083o = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public String f25090v = "";

    /* renamed from: x, reason: collision with root package name */
    public BroadcastReceiver f25092x = new a();

    /* renamed from: y, reason: collision with root package name */
    public boolean f25093y = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.hasExtra("message") ? intent.getStringExtra("message") : "";
            if (stringExtra != null && (stringExtra.equalsIgnoreCase("refreshchat") || stringExtra.equalsIgnoreCase("sync_conv") || stringExtra.equalsIgnoreCase("appstatus"))) {
                k.this.t0();
                k.this.s0();
                return;
            }
            if (stringExtra.equalsIgnoreCase("closeui")) {
                if (k.this.getActivity() != null) {
                    k.this.getActivity().finish();
                    return;
                }
                return;
            }
            if (stringExtra.equalsIgnoreCase("endchattimer")) {
                String stringExtra2 = intent.getStringExtra("chid");
                Xf.c cVar = (Xf.c) k.this.f25083o.get(stringExtra2);
                if (cVar != null) {
                    cVar.cancel();
                }
                k.this.f25083o.remove(stringExtra2);
                k.this.t0();
                return;
            }
            if (stringExtra.equalsIgnoreCase("chattimerstart")) {
                k.this.f25091w.h();
            } else if (stringExtra.equalsIgnoreCase("wmsconnect")) {
                k.this.s0();
            } else if (stringExtra.equalsIgnoreCase("networkstatus")) {
                k.this.s0();
            }
        }
    }

    public interface b {
        void a(SalesIQChat salesIQChat);
    }

    public static /* synthetic */ Unit g0(k kVar, ConversationsViewModel.a aVar) {
        kVar.getClass();
        if (aVar instanceof ConversationsViewModel.a.c) {
            kVar.f25081m.f(((ConversationsViewModel.a.c) aVar).a());
            kVar.s0();
        } else if (aVar instanceof ConversationsViewModel.a.C0623a) {
            ConversationsViewModel.a.C0623a c0623a = (ConversationsViewModel.a.C0623a) aVar;
            String a10 = c0623a.a();
            int b10 = c0623a.b();
            if (!kVar.f25083o.containsKey(a10)) {
                Xf.c cVar = new Xf.c(b10 * 1000, 1000L);
                cVar.a(kVar);
                cVar.start();
                kVar.f25083o.put(a10, cVar);
            }
        } else if (aVar instanceof ConversationsViewModel.a.b) {
            if (kVar.f25081m != null) {
                kVar.t0();
            }
            kVar.s0();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void h0(k kVar, SalesIQChat salesIQChat) {
        kVar.getClass();
        if (!LiveChatUtil.canAllowOpenChatActivityInOfflineState(salesIQChat) && !C6218a.c0()) {
            MobilistenUtil.v(t.f61107s);
            return;
        }
        Intent intent = new Intent(kVar.getActivity(), (Class<?>) ChatActivity.class);
        intent.putExtra("chid", salesIQChat.getChid());
        intent.putExtra("convID", salesIQChat.getConvID());
        intent.putExtra("unreadCount", salesIQChat.getUnreadCount());
        kVar.startActivity(intent);
    }

    public static /* synthetic */ void j0(final k kVar, final SalesIQChat salesIQChat) {
        kVar.getClass();
        LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: bg.j
            @Override // java.lang.Runnable
            public final void run() {
                k.h0(k.this, salesIQChat);
            }
        });
    }

    public static /* synthetic */ void k0(k kVar, List list) {
        kVar.f25081m.f(list);
        kVar.s0();
        if (kVar.getActivity() instanceof SalesIQActivity) {
            ((SalesIQActivity) kVar.getActivity()).g0();
        }
        if (kVar.f25093y || kVar.getActivity() == null || MobilistenUtil.h().isEmpty() || ZohoSalesIQ.l.Conversations != MobilistenUtil.h().get(((SalesIQActivity) kVar.getActivity()).f0())) {
            return;
        }
        kVar.getActivity().invalidateOptionsMenu();
    }

    @Override // cg.InterfaceC2920c
    public void d() {
        t0();
    }

    @Override // bg.f
    public boolean e0(MenuItem menuItem) {
        this.f25093y = false;
        return super.e0(menuItem);
    }

    @Override // bg.f
    public boolean f0(MenuItem menuItem) {
        this.f25093y = true;
        if (getActivity() != null && (getActivity() instanceof SalesIQActivity)) {
            ((SalesIQActivity) getActivity()).A0(8);
        }
        return super.f0(menuItem);
    }

    public boolean n0() {
        Zf.e eVar = this.f25081m;
        return eVar != null && eVar.getItemCount() >= 8;
    }

    public final void o0() {
        Iterator it = this.f25083o.values().iterator();
        while (it.hasNext()) {
            ((Xf.c) it.next()).cancel();
        }
        this.f25083o.clear();
    }

    @Override // bg.f
    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60728B, viewGroup, false);
        if (MobilistenUtil.m()) {
            inflate.setRotationY(180.0f);
        } else {
            inflate.setRotationY(0.0f);
        }
        ConversationsViewModel conversationsViewModel = (ConversationsViewModel) new U(requireActivity()).a(ConversationsViewModel.class);
        this.f25091w = conversationsViewModel;
        conversationsViewModel.l(this.f25090v);
        this.f25082n = (RecyclerView) inflate.findViewById(od.q.f60475b4);
        this.f25085q = (ScrollView) inflate.findViewById(od.q.f60393T3);
        this.f25084p = (LinearLayout) inflate.findViewById(od.q.f60716z);
        this.f25086r = (ImageView) inflate.findViewById(od.q.f60344O4);
        TextView textView = (TextView) inflate.findViewById(od.q.f60354P4);
        this.f25087s = textView;
        textView.setTypeface(C6218a.P());
        this.f25089u = (LinearLayout) inflate.findViewById(od.q.f60703x6);
        this.f25088t = (TextView) inflate.findViewById(od.q.f60713y6);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            C1908a.b(getActivity()).e(this.f25092x);
        }
        o0();
        if (this.f25081m != null) {
            t0();
        }
    }

    @Override // bg.f, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            C1908a.b(getActivity()).c(this.f25092x, new IntentFilter("receivelivechat"));
        }
        o0();
        this.f25091w.h();
    }

    @Override // cg.InterfaceC2920c
    public void onTick(int i10) {
        t0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Zf.e eVar = new Zf.e(this.f25091w.m(this.f25090v), new b() { // from class: bg.g
            @Override // bg.k.b
            public final void a(SalesIQChat salesIQChat) {
                k.j0(k.this, salesIQChat);
            }
        });
        this.f25081m = eVar;
        this.f25082n.setAdapter(eVar);
        s0();
        this.f25082n.setHasFixedSize(true);
        this.f25082n.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f25091w.o(getViewLifecycleOwner(), new Function1() { // from class: bg.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.g0(k.this, (ConversationsViewModel.a) obj);
            }
        });
        this.f25091w.getChatsLiveData().observe(getViewLifecycleOwner(), new C() { // from class: bg.i
            @Override // androidx.lifecycle.C
            public final void onChanged(Object obj) {
                k.k0(k.this, (List) obj);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("chat_id")) == null) {
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) ChatActivity.class);
        intent.putExtra("chid", string);
        startActivity(intent);
        getArguments().remove("chat_id");
    }

    public void p0() {
        this.f25089u.setVisibility(0);
        if (qd.c.k() && C6218a.c0()) {
            this.f25089u.setVisibility(8);
            return;
        }
        if (!C6218a.c0()) {
            this.f25088t.setText(t.f61132w0);
        } else if (qd.c.i()) {
            this.f25088t.setText(t.f60898L4);
        } else {
            this.f25089u.setVisibility(8);
        }
    }

    public void q0() {
        String triggerOpenChatId;
        if (!C6218a.c0()) {
            Toast.makeText(getContext(), t.f61107s, 0).show();
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) ChatActivity.class);
        String string = C6218a.M().getString("proactive_chid", null);
        if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.N(Md.a.Chat)) {
            intent.putExtra("chid", "temp_chid");
        } else if (LiveChatUtil.isProActiveFormContextStarted()) {
            intent.putExtra("chid", string);
        } else if (!LiveChatUtil.isFormContextStarted() || (triggerOpenChatId = LiveChatUtil.getTriggerOpenChatId()) == null) {
            intent.putExtra("chid", "temp_chid");
        } else {
            intent.putExtra("chid", triggerOpenChatId);
        }
        startActivity(intent);
    }

    public void r0(String str) {
        String string = LiveChatUtil.getString(str);
        this.f25090v = string;
        this.f25091w.p(string);
    }

    public void s0() {
        this.f25082n.setVisibility(8);
        if (this.f25081m.getItemCount() > 0) {
            this.f25082n.setVisibility(0);
            this.f25085q.setVisibility(8);
            this.f25084p.setVisibility(0);
        } else {
            this.f25085q.setVisibility(0);
            this.f25084p.setVisibility(8);
            if (this.f25090v.isEmpty()) {
                this.f25087s.setText(getString(t.f61119u));
                this.f25086r.setImageResource(AbstractC5892d.l(getContext(), AbstractC5886l.f59904x1));
            } else {
                this.f25087s.setText(t.f60839C);
                this.f25086r.setImageResource(AbstractC5892d.l(getContext(), AbstractC5886l.f59703C1));
            }
        }
        p0();
    }

    public final void t0() {
        this.f25091w.i(this.f25090v);
    }
}
