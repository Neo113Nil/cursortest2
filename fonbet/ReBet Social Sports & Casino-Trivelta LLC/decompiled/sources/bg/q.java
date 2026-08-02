package bg;

import V9.InterfaceC1756l;
import W9.c;
import Zf.k;
import a1.C1908a;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.K;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.S;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l0.AbstractC5338c;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import od.AbstractC5886l;
import od.t;
import od.y;
import og.AbstractC5892d;
import og.AbstractC5895g;
import pd.C6065b;
import qd.C6150a;
import rd.C6218a;

/* loaded from: classes4.dex */
public class q extends DialogInterfaceOnCancelListenerC2163m implements SearchView.m, W9.e, f.b, f.c {

    /* renamed from: A, reason: collision with root package name */
    public LatLng f25132A;

    /* renamed from: B, reason: collision with root package name */
    public LatLng f25133B;

    /* renamed from: C, reason: collision with root package name */
    public LatLng f25134C;

    /* renamed from: D, reason: collision with root package name */
    public LatLng f25135D;

    /* renamed from: E, reason: collision with root package name */
    public Location f25136E;

    /* renamed from: F, reason: collision with root package name */
    public Y9.e f25137F;

    /* renamed from: G, reason: collision with root package name */
    public cg.d f25138G;

    /* renamed from: H, reason: collision with root package name */
    public Geocoder f25139H;

    /* renamed from: J, reason: collision with root package name */
    public com.google.android.gms.common.api.f f25141J;

    /* renamed from: L, reason: collision with root package name */
    public View f25143L;

    /* renamed from: m, reason: collision with root package name */
    public MapView f25146m;

    /* renamed from: n, reason: collision with root package name */
    public W9.c f25147n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f25148o;

    /* renamed from: p, reason: collision with root package name */
    public Toolbar f25149p;

    /* renamed from: q, reason: collision with root package name */
    public RelativeLayout f25150q;

    /* renamed from: r, reason: collision with root package name */
    public RelativeLayout f25151r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f25152s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f25153t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f25154u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f25155v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f25156w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f25157x;

    /* renamed from: y, reason: collision with root package name */
    public Message.Meta.InputCard f25158y;

    /* renamed from: z, reason: collision with root package name */
    public Zf.k f25159z;

    /* renamed from: I, reason: collision with root package name */
    public Double f25140I = null;

    /* renamed from: K, reason: collision with root package name */
    public final AbstractC5086b f25142K = registerForActivityResult(new k.g(), new InterfaceC5085a() { // from class: bg.n
        @Override // j.InterfaceC5085a
        public final void a(Object obj) {
            q.g0(q.this, (Map) obj);
        }
    });

    /* renamed from: O, reason: collision with root package name */
    public BroadcastReceiver f25144O = new b();

    /* renamed from: P, reason: collision with root package name */
    public boolean f25145P = true;

    public class a implements MenuItem.OnActionExpandListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (q.this.f25159z != null) {
                q.this.f25159z.g(Q.s());
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.A0(q.this.f25134C != null ? q.this.f25134C : q.this.f25133B != null ? q.this.f25133B : q.this.f25132A != null ? q.this.f25132A : q.this.f25135D, null);
        }
    }

    public class d implements InterfaceC1756l {
        public d() {
        }

        @Override // V9.InterfaceC1756l
        public void onLocationChanged(Location location) {
            q.this.f25136E = location;
            if (q.this.f25136E != null) {
                q.this.f25135D = new LatLng(q.this.f25136E.getLatitude(), q.this.f25136E.getLongitude());
                q.this.G0();
            }
            q.this.f25141J.e();
        }
    }

    public static /* synthetic */ void f0(q qVar, com.zoho.livechat.android.models.c cVar) {
        if (qVar.f25138G != null) {
            qVar.A0(new LatLng(LiveChatUtil.getDouble(cVar.e()), LiveChatUtil.getDouble(cVar.f())), cVar.g());
        }
    }

    public static /* synthetic */ void g0(q qVar, Map map) {
        qVar.getClass();
        Boolean bool = Boolean.TRUE;
        if (bool.equals(map.get("android.permission.ACCESS_FINE_LOCATION")) || bool.equals(map.get("android.permission.ACCESS_COARSE_LOCATION"))) {
            com.google.android.gms.common.api.f fVar = qVar.f25141J;
            if (fVar == null) {
                qVar.B0();
                return;
            } else if (fVar.m()) {
                qVar.g(null);
                return;
            } else {
                qVar.f25141J.d();
                return;
            }
        }
        if (qVar.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            MobilistenUtil mobilistenUtil = MobilistenUtil.f44407a;
            MobilistenUtil.y(qVar.getResources().getString(t.f60835B1), 0);
            return;
        }
        try {
            PackageManager packageManager = qVar.getContext().getPackageManager();
            K.d(qVar.getActivity(), 305, String.format(qVar.getResources().getString(t.f61099q3), packageManager.getApplicationLabel(packageManager.getApplicationInfo(MobilistenUtil.f(), 0)).toString()));
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ void h0(q qVar, LatLng latLng) {
        Double d10 = qVar.f25140I;
        if (d10 == null) {
            if (qVar.f25137F == null) {
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.e0(latLng);
                qVar.f25137F = qVar.f25147n.b(markerOptions);
            }
            qVar.f25134C = latLng;
            qVar.f25137F.a(latLng);
        } else if (d10.doubleValue() == 0.0d) {
            qVar.f25134C = latLng;
            qVar.f25137F.a(latLng);
        } else {
            float[] fArr = new float[1];
            LatLng latLng2 = qVar.f25133B;
            if (latLng2 == null && (latLng2 = qVar.f25132A) == null) {
                latLng2 = qVar.f25135D;
            }
            if (latLng2 != null) {
                Location.distanceBetween(latLng2.f33210a, latLng2.f33211b, latLng.f33210a, latLng.f33211b, fArr);
                Double d11 = qVar.f25140I;
                if (d11 != null && fArr[0] < d11.doubleValue()) {
                    qVar.f25134C = latLng;
                    qVar.f25137F.a(latLng);
                }
            }
        }
        qVar.F0();
    }

    @Override // W9.e
    public void A(W9.c cVar) {
        this.f25147n = cVar;
        Double d10 = this.f25140I;
        if (d10 == null || d10.doubleValue() != 0.0d) {
            this.f25147n.h(new c.a() { // from class: bg.p
                @Override // W9.c.a
                public final void a(LatLng latLng) {
                    q.h0(q.this, latLng);
                }
            });
        }
        Message.Meta.InputCard inputCard = this.f25158y;
        if (inputCard != null) {
            if (inputCard.getLatitude() != null && this.f25158y.getLongitude() != null) {
                this.f25133B = new LatLng(Double.parseDouble(this.f25158y.getLatitude()), Double.parseDouble(this.f25158y.getLongitude()));
            } else if (MobilistenUtil.c.a().a().b() != null) {
                y yVar = (y) MobilistenUtil.c.a().a().b();
                this.f25132A = new LatLng(yVar.d(), yVar.e());
            }
            B0();
            if (this.f25158y.getRadius() != null) {
                Double valueOf = Double.valueOf(LiveChatUtil.getDouble(this.f25158y.getRadius()));
                this.f25140I = valueOf;
                this.f25159z.i(valueOf.doubleValue());
            }
            G0();
        }
    }

    public final void A0(LatLng latLng, String str) {
        if (this.f25138G != null) {
            double d10 = latLng.f33210a;
            double d11 = latLng.f33211b;
            Address v02 = v0(latLng);
            Hashtable hashtable = new Hashtable();
            hashtable.put("lat", String.valueOf(d10));
            hashtable.put("lng", String.valueOf(d11));
            String str2 = "";
            if (v02 != null) {
                String featureName = v02.getFeatureName();
                String locality = v02.getLocality();
                String subAdminArea = v02.getSubAdminArea();
                String adminArea = v02.getAdminArea();
                String countryName = v02.getCountryName();
                String postalCode = v02.getPostalCode();
                if (str != null) {
                    str2 = "" + str + ", ";
                    hashtable.put("title", str);
                }
                if (featureName != null) {
                    str2 = str2 + featureName + ", ";
                    hashtable.put("street", featureName);
                }
                if (locality != null) {
                    str2 = str2 + locality + ", ";
                }
                if (subAdminArea != null) {
                    str2 = str2 + subAdminArea + ", ";
                    hashtable.put("city", subAdminArea);
                }
                if (adminArea != null) {
                    String str3 = str2 + adminArea;
                    if (postalCode != null) {
                        str3 = str3 + " " + postalCode;
                    }
                    hashtable.put("state", adminArea);
                    str2 = str3 + ", ";
                }
                if (countryName != null) {
                    str2 = str2 + countryName;
                }
            }
            if (str2.isEmpty()) {
                str2 = d10 + ", " + d11;
            }
            hashtable.put("image", w0(latLng.f33210a, latLng.f33211b));
            this.f25138G.a(str2, Message.g.Location, hashtable, null);
            getActivity().getSupportFragmentManager().h1();
        }
    }

    public final void B0() {
        try {
            if (AbstractC5338c.checkSelfPermission(getContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0 && AbstractC5338c.checkSelfPermission(getContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                return;
            }
            com.google.android.gms.common.api.f d10 = new f.a(getContext()).b(this).c(this).a(LocationServices.f33128a).d();
            this.f25141J = d10;
            d10.d();
            LiveChatUtil.log("LocationTest " + this.f25141J);
            x0();
        } catch (SecurityException e10) {
            LiveChatUtil.log(e10.getMessage());
        }
    }

    public final boolean C0() {
        return AbstractC5338c.checkSelfPermission(getContext(), "android.permission.ACCESS_COARSE_LOCATION") == -1;
    }

    public final void D0(double d10, double d11, double d12) {
        if (d12 == 0.0d) {
            d12 = 1000.0d;
        }
        new C6150a(d10 + "," + d11, d12, y0()).start();
    }

    public void E0(cg.d dVar) {
        this.f25138G = dVar;
    }

    public final void F0() {
        this.f25150q.setOnClickListener(new c());
        if (this.f25134C != null) {
            this.f25153t.setText(t.f60993b2);
            this.f25154u.setText(this.f25134C.f33210a + "," + this.f25134C.f33211b);
            this.f25152s.setImageResource(od.p.f60099g);
            return;
        }
        if (this.f25133B == null) {
            this.f25153t.setText(t.f60986a2);
            this.f25152s.setImageResource(od.p.f60188x3);
            if (this.f25136E != null) {
                TextView textView = this.f25154u;
                textView.setText(textView.getContext().getResources().getString(t.f60961W1, Integer.valueOf(Math.round(this.f25136E.getAccuracy()))));
                return;
            } else {
                TextView textView2 = this.f25154u;
                textView2.setText(textView2.getContext().getResources().getString(t.f61101r));
                this.f25150q.setOnClickListener(null);
                return;
            }
        }
        if (this.f25132A != null) {
            this.f25153t.setText(t.f60993b2);
            this.f25154u.setText(this.f25133B.f33210a + "," + this.f25133B.f33211b);
            this.f25152s.setImageResource(od.p.f60099g);
            return;
        }
        this.f25153t.setText(t.f60986a2);
        this.f25152s.setImageResource(od.p.f60188x3);
        if (this.f25136E != null) {
            TextView textView3 = this.f25154u;
            textView3.setText(textView3.getContext().getString(t.f60961W1, Integer.valueOf(Math.round(this.f25136E.getAccuracy()))));
        } else {
            TextView textView4 = this.f25154u;
            textView4.setText(textView4.getContext().getResources().getString(t.f61101r));
            this.f25150q.setOnClickListener(null);
        }
    }

    public final void G0() {
        LatLng latLng;
        W9.c cVar = this.f25147n;
        if (cVar == null) {
            return;
        }
        try {
            cVar.c();
            if (this.f25133B == null) {
                x0();
            }
            latLng = this.f25133B;
            if (latLng == null && (latLng = this.f25132A) == null) {
                latLng = this.f25135D;
            }
        } catch (SecurityException e10) {
            e = e10;
        }
        try {
            if (latLng == null) {
                TextView textView = this.f25154u;
                textView.setText(textView.getContext().getResources().getString(t.f61101r));
                this.f25150q.setOnClickListener(null);
                return;
            }
            MarkerOptions markerOptions = new MarkerOptions();
            LatLng latLng2 = this.f25134C;
            if (latLng2 == null) {
                latLng2 = latLng;
            }
            markerOptions.e0(latLng2);
            this.f25137F = this.f25147n.b(markerOptions);
            if (this.f25140I != null) {
                CircleOptions circleOptions = new CircleOptions();
                circleOptions.g(latLng);
                circleOptions.a0(this.f25140I.doubleValue());
                circleOptions.e0(C6218a.b(1.5f));
                circleOptions.d0(P.a(getContext()));
                circleOptions.h(P.g(P.a(getContext()), 8));
                this.f25147n.a(circleOptions);
                LatLngBounds u02 = u0(latLng, this.f25140I.doubleValue());
                this.f25147n.e(W9.b.a(u02, C6218a.b(10.0f)));
                this.f25147n.f(u02);
                this.f25155v.setVisibility(0);
                this.f25157x.setText(z0(this.f25140I.doubleValue(), this.f25157x.getContext()));
            } else {
                this.f25155v.setVisibility(8);
                this.f25147n.e(W9.b.b(latLng, 15.0f));
            }
            if (this.f25133B == null) {
                this.f25147n.g(true);
                this.f25147n.d().a(false);
                MapView mapView = this.f25146m;
                if (mapView != null && mapView.findViewById(Integer.parseInt("1")) != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f25146m.findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                    layoutParams.addRule(10, 0);
                    layoutParams.addRule(12, -1);
                    layoutParams.setMargins(0, 0, C6218a.b(18.0f), C6218a.b(18.0f));
                }
            } else {
                this.f25147n.g(false);
            }
            this.f25159z.h(latLng);
            Double d10 = this.f25140I;
            if (d10 != null) {
                D0(latLng.f33210a, latLng.f33211b, d10.doubleValue());
            }
            F0();
        } catch (SecurityException e11) {
            e = e11;
            LiveChatUtil.log(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public void c(ConnectionResult connectionResult) {
        LiveChatUtil.log("GoogleApiClient onConnectionFailed error message: " + connectionResult.i());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public void g(Bundle bundle) {
        LocationRequest g10 = LocationRequest.g();
        g10.h0(100);
        g10.f0(1000L);
        g10.g0(1);
        if (this.f25141J.m()) {
            LocationServices.f33129b.requestLocationUpdates(this.f25141J, g10, new d());
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f25139H = new Geocoder(getContext(), Locale.getDefault());
            Message.Meta meta = (Message.Meta) AbstractC5895g.b(Yd.a.j(), arguments.getString(EventKeys.DATA), Message.Meta.class);
            if (meta == null || meta.getInputCard() == null) {
                return;
            }
            Message.Meta.InputCard inputCard = meta.getInputCard();
            this.f25158y = inputCard;
            String label = inputCard.getLabel();
            if (label == null) {
                this.f25149p.setTitle(t.f60979Z1);
            } else {
                this.f25149p.setTitle(label);
            }
            LiveChatUtil.applyFontForToolbarTitle(this.f25149p);
            this.f25146m.a(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B0();
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
        getActivity().getMenuInflater().inflate(od.s.f60826c, menu);
        MenuItem findItem = menu.findItem(od.q.f60470b);
        SearchView searchView = (SearchView) findItem.getActionView();
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint(this.f25149p.getContext().getString(t.f61089p0) + "...");
        searchView.setIconifiedByDefault(false);
        ((ImageView) searchView.findViewById(l.f.f55081C)).setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) searchView.findViewById(l.f.f55083E);
        searchAutoComplete.setHintTextColor(Color.parseColor("#66ffffff"));
        searchAutoComplete.setTextColor(-1);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        EditText editText = (EditText) searchView.findViewById(l.f.f55083E);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editText.getLayoutParams();
        editText.setTypeface(C6218a.P());
        marginLayoutParams.setMarginStart(0);
        editText.setLayoutParams(marginLayoutParams);
        editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        editText.setCompoundDrawablePadding(0);
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(androidx.core.content.res.k.f(editText.getResources(), od.p.f60052V3, editText.getContext().getTheme()));
        }
        Toolbar toolbar = this.f25149p;
        toolbar.setPadding(0, toolbar.getPaddingTop(), this.f25149p.getPaddingRight(), this.f25149p.getPaddingBottom());
        findItem.setOnActionExpandListener(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60804q, viewGroup, false);
        this.f25149p = (Toolbar) inflate.findViewById(od.q.f60691w4);
        ((AbstractActivityC5481c) getActivity()).setSupportActionBar(this.f25149p);
        AbstractC5479a supportActionBar = ((AbstractActivityC5481c) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
            supportActionBar.y(true);
            supportActionBar.x(AbstractC5892d.c(getContext(), od.p.f59975G1, AbstractC5892d.f(getContext(), Integer.valueOf(AbstractC5886l.f59856l3))));
        }
        View findViewById = inflate.findViewById(od.q.f60385S5);
        this.f25143L = findViewById;
        if ("DARK".equalsIgnoreCase(P.j(findViewById.getContext()))) {
            this.f25143L.setVisibility(8);
        } else {
            this.f25143L.setVisibility(0);
        }
        MapView mapView = (MapView) inflate.findViewById(od.q.f60499d6);
        this.f25146m = mapView;
        mapView.b(bundle);
        this.f25150q = (RelativeLayout) inflate.findViewById(od.q.f60335N5);
        this.f25148o = (RecyclerView) inflate.findViewById(od.q.f60477b6);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(od.q.f60355P5);
        this.f25151r = relativeLayout;
        Drawable background = relativeLayout.getBackground();
        int a10 = P.a(getContext());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(a10, mode);
        this.f25152s = (ImageView) inflate.findViewById(od.q.f60345O5);
        TextView textView = (TextView) inflate.findViewById(od.q.f60375R5);
        this.f25153t = textView;
        textView.setTypeface(C6218a.C());
        TextView textView2 = (TextView) inflate.findViewById(od.q.f60365Q5);
        this.f25154u = textView2;
        textView2.setTypeface(C6218a.P());
        CardView cardView = (CardView) inflate.findViewById(od.q.f60521f6);
        this.f25155v = cardView;
        cardView.setVisibility(8);
        ImageView imageView = (ImageView) inflate.findViewById(od.q.f60510e6);
        this.f25156w = imageView;
        imageView.getDrawable().setColorFilter(P.a(getContext()), mode);
        TextView textView3 = (TextView) inflate.findViewById(od.q.f60532g6);
        this.f25157x = textView3;
        textView3.setTypeface(C6218a.C());
        this.f25159z = new Zf.k(null, null, this.f25140I);
        this.f25148o.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f25148o.setAdapter(this.f25159z);
        this.f25159z.f(new k.b() { // from class: bg.o
            @Override // Zf.k.b
            public final void a(com.zoho.livechat.android.models.c cVar) {
                q.f0(q.this, cVar);
            }
        });
        setHasOptionsMenu(true);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f25146m.c();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f25146m.d();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().getSupportFragmentManager().h1();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f25146m.e();
        C1908a.b(getActivity()).e(this.f25144O);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f25146m.f();
        if (getActivity() != null) {
            getActivity().invalidateOptionsMenu();
        }
        C1908a.b(getActivity()).c(this.f25144O, new IntentFilter("locationreceiver"));
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean p(String str) {
        LatLng latLng = this.f25133B;
        if (latLng == null && (latLng = this.f25132A) == null) {
            latLng = this.f25135D;
        }
        new C6065b().a(str, latLng);
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean t(String str) {
        return false;
    }

    public final LatLngBounds u0(LatLng latLng, double d10) {
        return new LatLngBounds.a().b(S.a(latLng, d10, 0.0d)).b(S.a(latLng, d10, 90.0d)).b(S.a(latLng, d10, 180.0d)).b(S.a(latLng, d10, 270.0d)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Address v0(LatLng latLng) {
        List<Address> list;
        try {
            list = this.f25139H.getFromLocation(latLng.f33210a, latLng.f33211b, 1);
        } catch (IOException e10) {
            LiveChatUtil.log(e10);
            list = null;
            return list != null ? null : null;
        } catch (IllegalArgumentException e11) {
            LiveChatUtil.log(e11);
            list = null;
            if (list != null) {
            }
        }
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
    }

    public final String w0(double d10, double d11) {
        return "https://maps.zoho.com/v2/staticimage?lat=" + d10 + "&lon=" + d11 + "&zoom=12&height=250&width=300&marker=true";
    }

    public final void x0() {
        if (getContext() == null || !this.f25145P) {
            return;
        }
        this.f25145P = false;
        boolean z10 = AbstractC5338c.checkSelfPermission(getContext(), "android.permission.ACCESS_FINE_LOCATION") == -1;
        boolean C02 = C0();
        if (!z10 && !C02) {
            G0();
            return;
        }
        if (getActivity() != null) {
            this.f25142K.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            if (C02 && z10) {
                return;
            }
            G0();
        }
    }

    public final String y0() {
        try {
            return getActivity().getPackageManager().getApplicationInfo(MobilistenUtil.f(), 128).metaData.getString("com.google.android.geo.API_KEY");
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public final String z0(double d10, Context context) {
        double d11 = d10 / 1000.0d;
        return d10 % 1000.0d == 0.0d ? context.getResources().getString(t.f60973Y1, Integer.valueOf((int) d11)) : context.getResources().getString(t.f60967X1, Double.valueOf(d11));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public void i(int i10) {
    }
}
