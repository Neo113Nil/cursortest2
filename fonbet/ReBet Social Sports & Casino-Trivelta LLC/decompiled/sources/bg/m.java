package bg;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.FragmentManager;
import bg.m;
import cg.InterfaceC2918a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.CustomTypefaceSpan;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.livechat.android.utils.T;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class m extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: A, reason: collision with root package name */
    public TextView f25096A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f25097B;

    /* renamed from: C, reason: collision with root package name */
    public Map f25098C;

    /* renamed from: D, reason: collision with root package name */
    public Date f25099D;

    /* renamed from: E, reason: collision with root package name */
    public Date f25100E;

    /* renamed from: F, reason: collision with root package name */
    public long f25101F;

    /* renamed from: G, reason: collision with root package name */
    public long f25102G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC2918a f25103H;

    /* renamed from: I, reason: collision with root package name */
    public Message.Meta.InputCard f25104I;

    /* renamed from: J, reason: collision with root package name */
    public String f25105J = null;

    /* renamed from: m, reason: collision with root package name */
    public Toolbar f25106m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f25107n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f25108o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f25109p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f25110q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f25111r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f25112s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f25113t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f25114u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f25115v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f25116w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f25117x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f25118y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f25119z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public static /* synthetic */ void a(a aVar, Map map) {
            m.this.f25098C = map;
            m.this.f25097B.setText(LiveChatUtil.getString(map.get("gmt")) + " " + LiveChatUtil.getString(map.get("name")));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FragmentManager supportFragmentManager = m.this.getActivity().getSupportFragmentManager();
            s sVar = new s();
            sVar.j0(new cg.i() { // from class: bg.l
                @Override // cg.i
                public final void a(Map map) {
                    m.a.a(m.a.this, map);
                }
            });
            supportFragmentManager.s().b(od.q.f60627q0, sVar).g(null).i();
        }
    }

    public class b implements View.OnClickListener {

        public class a implements DatePickerDialog.OnDateSetListener {
            public a() {
            }

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(m.this.f25101F);
                calendar.set(i10, i11, i12);
                m.this.f25101F = calendar.getTimeInMillis();
                m.this.f25099D = new Date(m.this.f25101F);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
                m mVar = m.this;
                mVar.f25113t.setText(simpleDateFormat.format(mVar.f25099D));
                m.this.x0();
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long timeInMillis;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(m.this.f25099D);
            DatePickerDialog datePickerDialog = new DatePickerDialog(m.this.f25107n.getContext(), P.f(m.this.f25107n.getContext()), new a(), calendar.get(1), calendar.get(2), calendar.get(5));
            if (m.this.f25104I.getFrom() != null) {
                Calendar calendar2 = Calendar.getInstance();
                String from = m.this.f25104I.getFrom();
                if (from.startsWith("+") || from.startsWith("-")) {
                    calendar2.add(5, LiveChatUtil.getInteger(from).intValue());
                    timeInMillis = calendar2.getTimeInMillis();
                } else {
                    timeInMillis = LiveChatUtil.getLong(from);
                }
                datePickerDialog.getDatePicker().setMinDate(timeInMillis);
            }
            if (m.this.f25104I.getTo() != null) {
                Calendar calendar3 = Calendar.getInstance();
                String to = m.this.f25104I.getTo();
                if (to.startsWith("+") || to.startsWith("-")) {
                    calendar3.add(5, LiveChatUtil.getInteger(to).intValue());
                } else {
                    calendar3.setTimeInMillis(LiveChatUtil.getLong(to));
                }
                if (Boolean.FALSE.equals(m.this.f25104I.isTime()) && m.this.f25104I.getType() == Message.g.WidgetRangeCalendar) {
                    calendar3.add(5, -1);
                }
                datePickerDialog.getDatePicker().setMaxDate(calendar3.getTimeInMillis());
            }
            datePickerDialog.show();
        }
    }

    public class c implements View.OnClickListener {

        public class a implements DatePickerDialog.OnDateSetListener {
            public a() {
            }

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(m.this.f25102G);
                calendar.set(i10, i11, i12);
                m.this.f25102G = calendar.getTimeInMillis();
                m.this.f25100E = new Date(m.this.f25102G);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
                m mVar = m.this;
                mVar.f25115v.setText(simpleDateFormat.format(mVar.f25100E));
                m.this.y0();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long timeInMillis;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(m.this.f25100E);
            DatePickerDialog datePickerDialog = new DatePickerDialog(m.this.getContext(), new a(), calendar.get(1), calendar.get(2), calendar.get(5));
            if (m.this.f25104I.isTime().booleanValue()) {
                datePickerDialog.getDatePicker().setMinDate(m.this.f25099D.getTime());
            } else {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(m.this.f25099D);
                calendar2.add(5, 1);
                datePickerDialog.getDatePicker().setMinDate(calendar2.getTimeInMillis());
            }
            if (m.this.f25104I.getTo() != null) {
                Calendar calendar3 = Calendar.getInstance();
                String to = m.this.f25104I.getTo();
                if (to.startsWith("+") || to.startsWith("-")) {
                    calendar3.add(5, LiveChatUtil.getInteger(to).intValue());
                    timeInMillis = calendar3.getTimeInMillis();
                } else {
                    timeInMillis = LiveChatUtil.getLong(to);
                }
                datePickerDialog.getDatePicker().setMaxDate(timeInMillis);
            }
            datePickerDialog.show();
        }
    }

    public class d implements View.OnClickListener {

        public class a implements TimePickerDialog.OnTimeSetListener {
            public a() {
            }

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public void onTimeSet(TimePicker timePicker, int i10, int i11) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(m.this.f25099D);
                calendar.set(12, i11);
                calendar.set(11, i10);
                m.this.f25101F = calendar.getTimeInMillis();
                m.this.f25099D = new Date(m.this.f25101F);
                m mVar = m.this;
                mVar.f25117x.setText(og.j.a(mVar.f25101F));
                m.this.y0();
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m.this.f25101F);
            com.zoho.livechat.android.ui.customviews.a aVar = new com.zoho.livechat.android.ui.customviews.a(m.this.getContext(), P.f(m.this.f25108o.getContext()), new a(), calendar.get(11), calendar.get(12), false);
            if (m.this.f25104I.getFrom() != null && !m.this.f25104I.getFrom().startsWith("+") && !m.this.f25104I.getFrom().startsWith("-")) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(LiveChatUtil.getLong(m.this.f25104I.getFrom()));
                aVar.b(calendar2.get(11), calendar2.get(12));
            }
            if (m.this.f25104I.getTo() != null && !m.this.f25104I.getTo().startsWith("+") && !m.this.f25104I.getTo().startsWith("-")) {
                Calendar calendar3 = Calendar.getInstance();
                long j10 = LiveChatUtil.getLong(m.this.f25104I.getTo());
                if (m.this.f25104I.getType() == Message.g.WidgetRangeCalendar) {
                    calendar3.setTimeInMillis(j10 - 60000);
                } else {
                    calendar3.setTimeInMillis(j10);
                }
                aVar.a(calendar3.get(11), calendar3.get(12));
            }
            aVar.show();
        }
    }

    public class e implements View.OnClickListener {

        public class a implements TimePickerDialog.OnTimeSetListener {
            public a() {
            }

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public void onTimeSet(TimePicker timePicker, int i10, int i11) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(m.this.f25100E);
                calendar.set(12, i11);
                calendar.set(11, i10);
                m.this.f25102G = calendar.getTimeInMillis();
                m.this.f25100E = new Date(m.this.f25102G);
                m mVar = m.this;
                mVar.f25119z.setText(og.j.a(mVar.f25102G));
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m.this.f25102G);
            int i10 = calendar.get(11);
            int i11 = calendar.get(12);
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            com.zoho.livechat.android.ui.customviews.a aVar = new com.zoho.livechat.android.ui.customviews.a(m.this.getContext(), P.f(m.this.f25110q.getContext()), new a(), i10, i11, false);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(m.this.f25101F + 60000);
            if (calendar2.get(2) == i12 && calendar2.get(5) == i13) {
                aVar.b(calendar2.get(11), calendar2.get(12));
                if (m.this.f25104I.getTo() != null && !m.this.f25104I.getTo().startsWith("+") && !m.this.f25104I.getTo().startsWith("-")) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(LiveChatUtil.getLong(m.this.f25104I.getTo()));
                    aVar.a(calendar3.get(11), calendar3.get(12));
                }
            }
            aVar.show();
        }
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
        this.f25104I = inputCard;
        String label = inputCard.getLabel();
        this.f25105J = this.f25104I.getSelectLabel();
        if (label == null) {
            this.f25106m.setTitle(t.f60907N1);
        } else {
            this.f25106m.setTitle(label);
        }
        for (int i10 = 0; i10 < this.f25106m.getChildCount(); i10++) {
            View childAt = this.f25106m.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(C6218a.P());
            }
        }
        if (this.f25104I.getType() == Message.g.WidgetCalendar) {
            this.f25112s.setText(t.f60913O1);
            this.f25116w.setText(t.f60919P1);
            this.f25107n.setVisibility(0);
            Message.Meta.InputCard inputCard2 = this.f25104I;
            if (inputCard2 == null || !Boolean.TRUE.equals(inputCard2.isTime())) {
                this.f25108o.setVisibility(8);
            } else {
                this.f25108o.setVisibility(0);
            }
            this.f25109p.setVisibility(8);
            this.f25110q.setVisibility(8);
        } else {
            Message.Meta.InputCard inputCard3 = this.f25104I;
            if (inputCard3 == null || !Boolean.TRUE.equals(inputCard3.isTime())) {
                this.f25108o.setVisibility(8);
                this.f25110q.setVisibility(8);
            } else {
                this.f25108o.setVisibility(0);
                this.f25110q.setVisibility(0);
            }
            this.f25112s.setText(t.f60895L1);
            this.f25116w.setText(t.f60901M1);
            this.f25114u.setText(t.f60931R1);
            this.f25118y.setText(t.f60937S1);
        }
        v0();
        x0();
        if (!Boolean.TRUE.equals(this.f25104I.isTimeZone())) {
            this.f25111r.setVisibility(8);
            return;
        }
        this.f25111r.setVisibility(0);
        this.f25096A.setText(t.f60925Q1);
        this.f25098C = T.b();
        this.f25097B.setText(LiveChatUtil.getString(this.f25098C.get("gmt")) + " " + LiveChatUtil.getString(this.f25098C.get("name")));
        this.f25111r.setOnClickListener(new a());
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
            String str = this.f25105J;
            SpannableString spannableString = new SpannableString((str == null || str.length() <= 0) ? getContext().getString(t.f60943T1) : this.f25105J);
            spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 33);
            menu.getItem(0).setTitle(spannableString);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60802p, viewGroup, false);
        this.f25106m = (Toolbar) inflate.findViewById(od.q.f60691w4);
        if (getActivity() != null) {
            ((AbstractActivityC5481c) getActivity()).setSupportActionBar(this.f25106m);
        }
        AbstractC5479a supportActionBar = ((AbstractActivityC5481c) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
            supportActionBar.y(true);
            supportActionBar.x(AbstractC5892d.c(getContext(), od.p.f59975G1, AbstractC5892d.f(getContext(), Integer.valueOf(AbstractC5886l.f59856l3))));
        }
        this.f25107n = (LinearLayout) inflate.findViewById(od.q.f60628q1);
        this.f25108o = (LinearLayout) inflate.findViewById(od.q.f60638r1);
        this.f25109p = (LinearLayout) inflate.findViewById(od.q.f60648s1);
        this.f25110q = (LinearLayout) inflate.findViewById(od.q.f60658t1);
        this.f25111r = (LinearLayout) inflate.findViewById(od.q.f60668u1);
        TextView textView = (TextView) inflate.findViewById(od.q.f60454Z4);
        this.f25112s = textView;
        textView.setTypeface(C6218a.P());
        TextView textView2 = (TextView) inflate.findViewById(od.q.f60444Y4);
        this.f25113t = textView2;
        textView2.setTypeface(C6218a.P());
        TextView textView3 = (TextView) inflate.findViewById(od.q.f60476b5);
        this.f25116w = textView3;
        textView3.setTypeface(C6218a.P());
        TextView textView4 = (TextView) inflate.findViewById(od.q.f60465a5);
        this.f25117x = textView4;
        textView4.setTypeface(C6218a.P());
        TextView textView5 = (TextView) inflate.findViewById(od.q.f60218B8);
        this.f25114u = textView5;
        textView5.setTypeface(C6218a.P());
        TextView textView6 = (TextView) inflate.findViewById(od.q.f60208A8);
        this.f25115v = textView6;
        textView6.setTypeface(C6218a.P());
        TextView textView7 = (TextView) inflate.findViewById(od.q.f60238D8);
        this.f25118y = textView7;
        textView7.setTypeface(C6218a.P());
        TextView textView8 = (TextView) inflate.findViewById(od.q.f60228C8);
        this.f25119z = textView8;
        textView8.setTypeface(C6218a.P());
        TextView textView9 = (TextView) inflate.findViewById(od.q.f60368Q8);
        this.f25096A = textView9;
        textView9.setTypeface(C6218a.P());
        TextView textView10 = (TextView) inflate.findViewById(od.q.f60348O8);
        this.f25097B = textView10;
        textView10.setTypeface(C6218a.P());
        setHasOptionsMenu(true);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        SimpleDateFormat simpleDateFormat;
        Map map;
        Map map2;
        int itemId = menuItem.getItemId();
        if (itemId != od.q.f60490c8) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().onBackPressed();
            return true;
        }
        Hashtable hashtable = new Hashtable();
        Message.Meta.InputCard inputCard = this.f25104I;
        if (inputCard != null) {
            if (Boolean.TRUE.equals(inputCard.isTimeZone()) && (map2 = this.f25098C) != null) {
                hashtable.put("tz", LiveChatUtil.getString(map2.get("gmt")));
                hashtable.put("time_zone_id", LiveChatUtil.getString(this.f25098C.get(StackTraceHelper.ID_KEY)));
            }
            if (this.f25104I.getType() == Message.g.WidgetCalendar) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
                if (this.f25104I.getFormat() != null) {
                    try {
                        simpleDateFormat2 = new SimpleDateFormat(this.f25104I.getFormat(), Locale.getDefault());
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
                str = simpleDateFormat2.format(this.f25099D);
                if (Boolean.TRUE.equals(this.f25104I.isTime())) {
                    hashtable.put("time", String.valueOf(this.f25099D.getTime()));
                    if (this.f25104I.getFormat() == null) {
                        str = str + " " + og.j.a(this.f25099D.getTime());
                    }
                }
            } else {
                hashtable.put("from_time", String.valueOf(this.f25099D.getTime()));
                hashtable.put("to_time", String.valueOf(this.f25100E.getTime()));
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
                if (this.f25104I.getFormat() != null) {
                    try {
                        simpleDateFormat3 = new SimpleDateFormat(this.f25104I.getFormat(), Locale.getDefault());
                    } catch (Exception e11) {
                        LiveChatUtil.log(e11);
                    }
                }
                String format = simpleDateFormat3.format(this.f25099D);
                String format2 = simpleDateFormat3.format(this.f25100E);
                if (Boolean.TRUE.equals(this.f25104I.isTime())) {
                    if (this.f25104I.getTimeFormat() != null) {
                        try {
                            simpleDateFormat = new SimpleDateFormat(this.f25104I.getTimeFormat(), Locale.getDefault());
                        } catch (Exception e12) {
                            LiveChatUtil.log(e12);
                        }
                        if (this.f25104I.getTimeFormat() == null || this.f25104I.getFormat() == null) {
                            Date date = this.f25099D;
                            String format3 = simpleDateFormat == null ? simpleDateFormat.format(date) : og.j.a(date.getTime());
                            long j10 = this.f25102G;
                            String format4 = simpleDateFormat == null ? simpleDateFormat.format(Long.valueOf(j10)) : og.j.a(j10);
                            if (format.equalsIgnoreCase(format2)) {
                                str = format + " " + format3 + " - " + format2 + " " + format4;
                            } else {
                                str = format + " " + format3 + " - " + format4;
                            }
                        } else {
                            str = format + " - " + format2;
                        }
                    }
                    simpleDateFormat = null;
                    if (this.f25104I.getTimeFormat() == null) {
                    }
                    Date date2 = this.f25099D;
                    if (simpleDateFormat == null) {
                    }
                    long j102 = this.f25102G;
                    if (simpleDateFormat == null) {
                    }
                    if (format.equalsIgnoreCase(format2)) {
                    }
                } else {
                    str = format + " - " + format2;
                }
            }
            if (Boolean.TRUE.equals(this.f25104I.isTimeZone()) && (map = this.f25098C) != null) {
                str = str + ", " + LiveChatUtil.getString(map.get("tz_name"));
            }
            this.f25103H.a(str, this.f25104I.getType(), AbstractC6574b.g(hashtable), null);
            getActivity().onBackPressed();
        }
        return true;
    }

    public final void v0() {
        if (this.f25107n.getVisibility() == 0) {
            if (this.f25099D == null) {
                if (this.f25104I.getFrom() == null || this.f25104I.getFrom().startsWith("+") || this.f25104I.getFrom().startsWith("-")) {
                    this.f25099D = new Date();
                } else {
                    this.f25099D = new Date(LiveChatUtil.getLong(this.f25104I.getFrom()));
                }
            }
            this.f25113t.setText(new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(this.f25099D));
            this.f25107n.setOnClickListener(new b());
            w0();
        }
    }

    public final void w0() {
        Message.Meta.InputCard inputCard = this.f25104I;
        if (inputCard != null && Boolean.TRUE.equals(inputCard.isTime()) && this.f25108o.getVisibility() == 0) {
            if (this.f25101F == 0) {
                this.f25101F = this.f25099D.getTime();
            }
            this.f25117x.setText(og.j.a(this.f25101F));
            this.f25108o.setOnClickListener(new d());
        }
    }

    public final void x0() {
        if (this.f25109p.getVisibility() == 0) {
            if (this.f25100E == null) {
                if (this.f25104I.getTo() == null || this.f25104I.getTo().startsWith("+") || this.f25104I.getTo().startsWith("-")) {
                    this.f25100E = new Date();
                } else {
                    this.f25100E = new Date(this.f25099D.getTime());
                }
            }
            if (!this.f25104I.isTime().booleanValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(this.f25099D);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(this.f25100E);
                int i10 = calendar.get(2);
                int i11 = calendar.get(5);
                int i12 = calendar2.get(2);
                int i13 = calendar2.get(5);
                if (i10 >= i12 && (i10 > i12 || i11 >= i13)) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(this.f25099D);
                    calendar3.add(5, 1);
                    this.f25100E = calendar3.getTime();
                }
            } else if (this.f25099D.getTime() > this.f25100E.getTime()) {
                this.f25100E = new Date(this.f25099D.getTime());
            }
            this.f25115v.setText(new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(this.f25100E));
            this.f25109p.setOnClickListener(new c());
            y0();
        }
    }

    public final void y0() {
        if (this.f25104I.isTime().booleanValue() && this.f25110q.getVisibility() == 0) {
            if (this.f25102G == 0) {
                this.f25102G = this.f25100E.getTime();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f25101F);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(this.f25102G);
            if (calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                int i10 = calendar.get(11);
                int i11 = calendar2.get(11);
                int i12 = calendar2.get(12);
                int i13 = calendar2.get(12);
                if (i10 > i11) {
                    this.f25102G = this.f25101F + 60000;
                    this.f25100E = new Date(this.f25102G);
                } else if (i10 == i11 && i12 >= i13) {
                    this.f25102G = this.f25101F + 60000;
                    this.f25100E = new Date(this.f25102G);
                }
            }
            this.f25119z.setText(og.j.a(this.f25102G));
            this.f25110q.setOnClickListener(new e());
        }
    }

    public void z0(InterfaceC2918a interfaceC2918a) {
        this.f25103H = interfaceC2918a;
    }
}
