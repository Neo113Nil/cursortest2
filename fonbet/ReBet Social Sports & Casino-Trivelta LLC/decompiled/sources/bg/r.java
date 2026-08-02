package bg;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.InterfaceC2918a;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.CustomTypefaceSpan;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.T;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import od.AbstractC5886l;
import od.t;
import og.AbstractC5892d;
import og.AbstractC5895g;
import rd.C6218a;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class r extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name */
    public Toolbar f25164m;

    /* renamed from: n, reason: collision with root package name */
    public RelativeLayout f25165n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f25166o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f25167p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f25168q;

    /* renamed from: r, reason: collision with root package name */
    public String f25169r;

    /* renamed from: s, reason: collision with root package name */
    public String f25170s;

    /* renamed from: t, reason: collision with root package name */
    public Map f25171t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2918a f25172u;

    /* renamed from: v, reason: collision with root package name */
    public Message.Meta.InputCard f25173v;

    /* renamed from: w, reason: collision with root package name */
    public Zf.f f25174w;

    public class a implements View.OnClickListener {

        /* renamed from: bg.r$a$a, reason: collision with other inner class name */
        public class C0438a implements cg.i {
            public C0438a() {
            }

            @Override // cg.i
            public void a(Map map) {
                r.this.f25171t = map;
                r.this.f25168q.setText(LiveChatUtil.getString(map.get("gmt")) + " " + LiveChatUtil.getString(map.get("name")));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FragmentManager supportFragmentManager = r.this.getActivity().getSupportFragmentManager();
            s sVar = new s();
            sVar.j0(new C0438a());
            supportFragmentManager.s().b(od.q.f60627q0, sVar).g(null).i();
        }
    }

    public void g0(InterfaceC2918a interfaceC2918a) {
        this.f25172u = interfaceC2918a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Message.Meta meta;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (meta = (Message.Meta) AbstractC5895g.b(Yd.a.j(), arguments.getString(EventKeys.DATA), Message.Meta.class)) == null || meta.getInputCard() == null) {
            return;
        }
        Message.Meta.InputCard inputCard = meta.getInputCard();
        this.f25173v = inputCard;
        String label = inputCard.getLabel();
        if (label == null) {
            this.f25164m.setTitle(t.f61042i2);
        } else {
            this.f25164m.setTitle(label);
        }
        int childCount = this.f25164m.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f25164m.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(C6218a.P());
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.f25173v.getType() == Message.g.WidgetTimeslots) {
            this.f25169r = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
            if (this.f25173v.getTimeSlots() != null && this.f25173v.getTimeSlots().i()) {
                arrayList.add(new com.zoho.livechat.android.models.e(this.f25169r, this.f25173v.getTimeSlots().c()));
            }
        } else if (this.f25173v.getTimeSlots() != null && this.f25173v.getTimeSlots().k()) {
            for (Map.Entry entry : this.f25173v.getTimeSlots().e().q()) {
                arrayList.add(new com.zoho.livechat.android.models.e((String) entry.getKey(), ((com.google.gson.h) entry.getValue()).c()));
            }
        }
        this.f25174w = new Zf.f(arrayList);
        this.f25166o.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f25166o.setAdapter(this.f25174w);
        if (!Boolean.TRUE.equals(this.f25173v.isTimeZone())) {
            this.f25165n.setVisibility(8);
            return;
        }
        this.f25165n.setVisibility(0);
        this.f25167p.setText(t.f60925Q1);
        this.f25171t = T.b();
        this.f25168q.setText(LiveChatUtil.getString(this.f25171t.get("gmt")) + " " + LiveChatUtil.getString(this.f25171t.get("name")));
        this.f25165n.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        getActivity().getMenuInflater().inflate(od.s.f60824a, menu);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(C6218a.P());
        if (getContext() != null) {
            SpannableString spannableString = new SpannableString(getContext().getString(t.f60943T1));
            spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 33);
            menu.getItem(0).setTitle(spannableString);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60806r, viewGroup, false);
        this.f25164m = (Toolbar) inflate.findViewById(od.q.f60691w4);
        ((AbstractActivityC5481c) getActivity()).setSupportActionBar(this.f25164m);
        AbstractC5479a supportActionBar = ((AbstractActivityC5481c) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
            supportActionBar.y(true);
            supportActionBar.x(AbstractC5892d.c(getContext(), od.p.f59975G1, AbstractC5892d.f(getContext(), Integer.valueOf(AbstractC5886l.f59856l3))));
        }
        this.f25165n = (RelativeLayout) inflate.findViewById(od.q.f60695w8);
        TextView textView = (TextView) inflate.findViewById(od.q.f60368Q8);
        this.f25167p = textView;
        textView.setTypeface(C6218a.C());
        TextView textView2 = (TextView) inflate.findViewById(od.q.f60348O8);
        this.f25168q = textView2;
        textView2.setTypeface(C6218a.P());
        this.f25166o = (RecyclerView) inflate.findViewById(od.q.f60645r8);
        setHasOptionsMenu(true);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Zf.f fVar;
        String str;
        int itemId = menuItem.getItemId();
        if (itemId != od.q.f60490c8 || ((this.f25169r == null || this.f25170s == null) && ((fVar = this.f25174w) == null || fVar.e().length() <= 0))) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().onBackPressed();
            return true;
        }
        Hashtable hashtable = new Hashtable();
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f25173v.isTimeZone())) {
            hashtable.put("tz", LiveChatUtil.getString(this.f25171t.get("gmt")));
        }
        Zf.f fVar2 = this.f25174w;
        if (fVar2 != null && fVar2.e().length() > 0) {
            String[] split = this.f25174w.e().split(" ");
            if (this.f25173v.getType() != Message.g.WidgetTimeslots) {
                this.f25169r = split[0];
            }
            this.f25170s = split[1];
        }
        if (this.f25173v.getType() == Message.g.WidgetTimeslots) {
            hashtable.put("slot", this.f25170s);
            str = this.f25170s.toUpperCase();
        } else {
            hashtable.put("slot", this.f25169r + " " + this.f25170s);
            str = this.f25169r + " " + this.f25170s.toUpperCase();
        }
        if (bool.equals(this.f25173v.isTimeZone())) {
            str = str + ", " + LiveChatUtil.getString(this.f25171t.get("tz_name"));
        }
        this.f25172u.a(str, this.f25173v.getType(), AbstractC6574b.g(hashtable), null);
        getActivity().onBackPressed();
        return true;
    }
}
