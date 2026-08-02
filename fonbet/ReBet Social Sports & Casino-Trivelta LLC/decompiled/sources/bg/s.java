package bg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.T;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import od.t;
import rd.C6218a;

/* loaded from: classes4.dex */
public class s extends DialogInterfaceOnCancelListenerC2163m implements SearchView.m {

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f25177m;

    /* renamed from: n, reason: collision with root package name */
    public b f25178n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f25179o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public cg.i f25180p;

    public class a implements MenuItem.OnActionExpandListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            if (s.this.f25178n == null) {
                return true;
            }
            s.this.f25178n.notifyDataSetChanged();
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    public class b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public String f25182a = TimeZone.getDefault().getID();

        public class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public TextView f25184a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f25185b;

            /* renamed from: bg.s$b$a$a, reason: collision with other inner class name */
            public class ViewOnClickListenerC0439a implements View.OnClickListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map f25187a;

                public ViewOnClickListenerC0439a(Map map) {
                    this.f25187a = map;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    s.this.f25180p.a(this.f25187a);
                    LiveChatUtil.hideKeyboard(a.this.itemView);
                    s.this.getActivity().onBackPressed();
                }
            }

            public a(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(od.q.f60368Q8);
                this.f25184a = textView;
                textView.setTypeface(C6218a.P());
                TextView textView2 = (TextView) view.findViewById(od.q.f60358P8);
                this.f25185b = textView2;
                textView2.setTypeface(C6218a.P());
            }

            public void b(Map map) {
                String string = LiveChatUtil.getString(map.get("name"));
                if (b.this.f25182a.equalsIgnoreCase(LiveChatUtil.getString(map.get(StackTraceHelper.ID_KEY)))) {
                    string = s.this.getString(t.f61049j2, string);
                }
                this.f25184a.setText(string);
                this.f25185b.setText(LiveChatUtil.getString(map.get("gmt")));
                this.itemView.setOnClickListener(new ViewOnClickListenerC0439a(map));
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i10) {
            aVar.b((Map) s.this.f25179o.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60741H0, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return s.this.f25179o.size();
        }
    }

    public void j0(cg.i iVar) {
        this.f25180p = iVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
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
        searchView.setIconifiedByDefault(false);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        ((ImageView) searchView.findViewById(l.f.f55081C)).setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) searchView.findViewById(l.f.f55083E);
        searchAutoComplete.setTypeface(C6218a.P());
        searchAutoComplete.setHint(l.h.f55155n);
        findItem.setOnActionExpandListener(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60734E, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(od.q.f60691w4);
        toolbar.setTitle(getString(t.f60925Q1));
        ((AbstractActivityC5481c) getActivity()).setSupportActionBar(toolbar);
        LiveChatUtil.applyFontForToolbarTitle(toolbar);
        AbstractC5479a supportActionBar = ((AbstractActivityC5481c) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
            supportActionBar.y(true);
            supportActionBar.w(od.p.f60089e);
        }
        this.f25179o = T.e(null);
        this.f25177m = (RecyclerView) inflate.findViewById(od.q.f60715y8);
        this.f25178n = new b();
        this.f25177m.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f25177m.setAdapter(this.f25178n);
        this.f25177m.x1(T.d(this.f25179o, TimeZone.getDefault().getID()));
        setHasOptionsMenu(true);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        LiveChatUtil.hideKeyboard(getView());
        getActivity().onBackPressed();
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean p(String str) {
        this.f25179o = T.e(str.trim().toLowerCase());
        b bVar = this.f25178n;
        if (bVar == null) {
            return false;
        }
        bVar.notifyDataSetChanged();
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean t(String str) {
        return false;
    }
}
