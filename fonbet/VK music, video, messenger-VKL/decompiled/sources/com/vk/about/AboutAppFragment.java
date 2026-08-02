package com.vk.about;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseFragment;
import com.vk.debug.ui.DebugTabsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.bwt0;
import xsna.bxu;
import xsna.eq8;
import xsna.fnj;
import xsna.ftx;
import xsna.gpu0;
import xsna.i1;
import xsna.i5s;
import xsna.iah0;
import xsna.j6r0;
import xsna.jjv0;
import xsna.k1;
import xsna.m6r0;
import xsna.mf7;
import xsna.mxu;
import xsna.o2l;
import xsna.oz50;
import xsna.q6r0;
import xsna.sxt0;
import xsna.tf3;
import xsna.u1u0;
import xsna.vp8;

/* compiled from: AboutAppFragment.kt */
/* loaded from: classes14.dex */
public final class AboutAppFragment extends BaseFragment {
    public static final /* synthetic */ int U = 0;
    public ArrayList S;
    public final k1 T = new k1(this, 0);

    /* compiled from: AboutAppFragment.kt */
    public final class a extends RecyclerView.Adapter<sxt0> implements mf7, jjv0 {
        public a() {
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            if (getItemViewType(i) != 2) {
                return 0;
            }
            if (i == 0 || getItemViewType(i - 1) != 2) {
                return 2;
            }
            return (i >= getItemCount() - 1 || getItemViewType(i + 1) != 2) ? 4 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            ArrayList arrayList = AboutAppFragment.this.S;
            if (arrayList == null) {
                arrayList = null;
            }
            return arrayList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            ArrayList arrayList = AboutAppFragment.this.S;
            if (arrayList == null) {
                arrayList = null;
            }
            return ((ftx) arrayList.get(i)).a;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            if (getItemViewType(i) != 2 || i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (getItemViewType(i2) == 2 && i < getItemCount()) {
                return (getItemViewType(i2) != 2 || getItemViewType(i) == 2) ? 0 : 1;
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(sxt0 sxt0Var, int i) {
            sxt0 sxt0Var2 = sxt0Var;
            ArrayList arrayList = AboutAppFragment.this.S;
            if (arrayList == null) {
                arrayList = null;
            }
            sxt0Var2.V5((ftx) arrayList.get(i));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final sxt0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            String str;
            boolean j;
            if (i == 2) {
                int[] iArr = u1u0.a;
                return new vp8(tf3.b(viewGroup, R.layout.about_app_button_item, viewGroup, false), AboutAppFragment.this.T);
            }
            int[] iArr2 = u1u0.a;
            final View b = tf3.b(viewGroup, R.layout.about_app_header_item, viewGroup, false);
            final bxu bxuVar = new bxu(b);
            bxuVar.l = null;
            final View findViewById = b.findViewById(R.id.logo_and_version_container);
            if (BuildInfo.j()) {
                Context context = b.getContext();
                if (BuildInfo.h()) {
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                    j = BuildInfo.j();
                } else {
                    VKApplication vKApplication2 = com.vk.core.apps.a.a;
                    j = BuildInfo.l(context, "com.android.vending");
                }
                if (!j && BuildInfo.o()) {
                    str = i5s.a(new StringBuilder(), BuildInfo.d, "-unknown");
                    ((TextView) b.findViewById(R.id.version_name)).setText(b.getContext().getString(R.string.about_app_version, str, String.valueOf(BuildInfo.e)));
                    final String str2 = str + ' ' + BuildInfo.e;
                    findViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.twu
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            fvr.l(b.getContext(), str2);
                            return true;
                        }
                    });
                    o2l.a.getClass();
                    if (!o2l.b) {
                        findViewById.setBackground(b.getContext().getDrawable(R.drawable.highlight_radius_8));
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xsna.uwu
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bxu bxuVar2 = bxu.this;
                                int i2 = bxuVar2.m;
                                bxuVar2.m = i2 + 1;
                                if (i2 != 10) {
                                    io.reactivex.rxjava3.android.a aVar = bxuVar2.l;
                                    if (aVar != null) {
                                        i0q0.g(aVar);
                                    }
                                    io.reactivex.rxjava3.android.a aVar2 = new io.reactivex.rxjava3.android.a(bxuVar2, 6);
                                    i0q0.d(1000L, aVar2);
                                    bxuVar2.l = aVar2;
                                    return;
                                }
                                o2l.a.getClass();
                                o2l.b = true;
                                View view2 = findViewById;
                                view2.setOnClickListener(null);
                                view2.setBackground(null);
                                view2.setClickable(false);
                                new oz50(DebugTabsFragment.class, null, null).k(b.getContext());
                            }
                        });
                    }
                    return bxuVar;
                }
            }
            str = BuildInfo.d;
            ((TextView) b.findViewById(R.id.version_name)).setText(b.getContext().getString(R.string.about_app_version, str, String.valueOf(BuildInfo.e)));
            final String str22 = str + ' ' + BuildInfo.e;
            findViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.twu
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    fvr.l(b.getContext(), str22);
                    return true;
                }
            });
            o2l.a.getClass();
            if (!o2l.b) {
            }
            return bxuVar;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return iah0.a(4);
        }
    }

    /* compiled from: AboutAppFragment.kt */
    public static final class b extends oz50 {
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList(7);
        this.S = arrayList;
        arrayList.add(new mxu(1));
        ArrayList arrayList2 = this.S;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        arrayList2.add(new eq8(0, R.string.about_app_feedback));
        ArrayList arrayList3 = this.S;
        if (arrayList3 == null) {
            arrayList3 = null;
        }
        arrayList3.add(new eq8(1, R.string.about_app_estimate));
        ArrayList arrayList4 = this.S;
        if (arrayList4 == null) {
            arrayList4 = null;
        }
        arrayList4.add(new eq8(2, R.string.about_app_privacy));
        if (q6r0.f().e(m6r0.g0)) {
            ArrayList arrayList5 = this.S;
            if (arrayList5 == null) {
                arrayList5 = null;
            }
            arrayList5.add(new eq8(5, R.string.about_app_cookie));
        }
        ArrayList arrayList6 = this.S;
        if (arrayList6 == null) {
            arrayList6 = null;
        }
        arrayList6.add(new eq8(3, R.string.about_app_terms_to_use));
        ArrayList arrayList7 = this.S;
        if (arrayList7 == null) {
            arrayList7 = null;
        }
        arrayList7.add(new eq8(4, R.string.about_app_license));
        ArrayList arrayList8 = this.S;
        (arrayList8 != null ? arrayList8 : null).add(new eq8(6, R.string.about_app_data_protect));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.fragment_toolbar_recycler, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
        toolbar.setTitle(getString(R.string.about_app));
        toolbar.setNavigationOnClickListener(new i1(this, 0));
        bwt0.Z(R.attr.vk_ui_background_content, inflate);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        a aVar = new a();
        recyclerView.setAdapter(aVar);
        int i2 = kn().getResources().getConfiguration().screenWidthDp;
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        if (fnj.d(kn)) {
            float max = Math.max(16, (i2 - 924) / 2);
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(max);
        } else {
            i = 0;
        }
        recyclerView.setPadding(i, 0, i, 0);
        gpu0 gpu0Var = new gpu0(inflate.getContext());
        gpu0Var.j = aVar;
        recyclerView.addItemDecoration(gpu0Var);
        return inflate;
    }
}
