package com.vk.mytarget.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.bo8;
import xsna.d27;
import xsna.dq8;
import xsna.e43;
import xsna.epx;
import xsna.gpu0;
import xsna.hf8;
import xsna.htx;
import xsna.iah0;
import xsna.jjv0;
import xsna.jsk;
import xsna.jxu;
import xsna.ko00;
import xsna.krv0;
import xsna.lo10;
import xsna.msy;
import xsna.mv0;
import xsna.n2i0;
import xsna.oz50;
import xsna.r5g0;
import xsna.tf3;
import xsna.up8;
import xsna.wf40;
import xsna.x1m;
import xsna.xr6;

/* compiled from: MyTargetReportFragment.kt */
/* loaded from: classes3.dex */
public final class MyTargetReportFragment extends BaseFragment {
    public static final /* synthetic */ int X = 0;
    public final ArrayList S = new ArrayList();
    public final d27 T = new d27(this, 7);
    public final Object U;
    public final Object V;
    public final Object W;

    /* compiled from: MyTargetReportFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MyTargetReportFragment.class, null, null);
        }
    }

    /* compiled from: MyTargetReportFragment.kt */
    public final class b extends RecyclerView.Adapter<xr6> implements jjv0 {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return MyTargetReportFragment.this.S.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return ((htx) MyTargetReportFragment.this.S.get(i)).a;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(xr6 xr6Var, int i) {
            xr6Var.V5((htx) MyTargetReportFragment.this.S.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final xr6 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i == 2 ? new up8(tf3.b(viewGroup, R.layout.report_ad_button_item, viewGroup, false), MyTargetReportFragment.this.T) : new x1m(tf3.b(viewGroup, R.layout.report_ad_description_item, viewGroup, false));
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return iah0.a(4);
        }
    }

    public MyTargetReportFragment() {
        wf40 wf40Var = new wf40(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, wf40Var);
        this.V = msy.a(lazyThreadSafetyMode, new lo10(this, 6));
        this.W = msy.a(lazyThreadSafetyMode, new ko00(this, 9));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        jo();
        return false;
    }

    public final Parcelable[] io() {
        Parcelable[] parcelableArray;
        Bundle arguments = getArguments();
        return (arguments == null || (parcelableArray = arguments.getParcelableArray("ADS_CHOICES_WITH_ID")) == null) ? new Parcelable[0] : parcelableArray;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo() {
        Bundle arguments = getArguments();
        Integer d = arguments != null ? bo8.d(arguments, "ENTRY_HASH_ENABLED") : null;
        Bundle arguments2 = getArguments();
        NewsEntry newsEntry = arguments2 != null ? (NewsEntry) arguments2.getParcelable("ADS_NEWS_ITEM") : null;
        if (d == null && newsEntry == null) {
            return;
        }
        Intent intent = new Intent("com.vkontakte.android.AD_REPORT_CANCELLED");
        if (d != null) {
            ?? r2 = this.W;
            NewsEntry a2 = ((r5g0) r2.getValue()).a(d);
            if (a2 != null) {
                intent.putExtra("ad_entry_hash", a2.hashCode());
                ((r5g0) r2.getValue()).d(a2);
            }
        } else {
            intent.putExtra("ad_entry", newsEntry);
        }
        Context context = e43.a;
        n2i0.a(context != null ? context : null, hf8.a, intent);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void ko(String str) {
        Object obj;
        Parcelable[] io2 = io();
        ArrayList arrayList = new ArrayList();
        int length = io2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = io2[i];
            MyTargetAdsComplainOptions myTargetAdsComplainOptions = parcelable instanceof MyTargetAdsComplainOptions ? (MyTargetAdsComplainOptions) parcelable : null;
            if (myTargetAdsComplainOptions != null) {
                arrayList.add(myTargetAdsComplainOptions);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((MyTargetAdsComplainOptions) obj).c, str)) {
                    break;
                }
            }
        }
        MyTargetAdsComplainOptions myTargetAdsComplainOptions2 = (MyTargetAdsComplainOptions) obj;
        if (myTargetAdsComplainOptions2 != null) {
            int i2 = myTargetAdsComplainOptions2.b;
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("CLOSE_ADS_CHOICES_URL") : null;
            if (string != null) {
                ((mv0) this.V.getValue()).a(string + i2);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jxu jxuVar = new jxu(1);
        ArrayList arrayList = this.S;
        arrayList.add(jxuVar);
        Bundle arguments = getArguments();
        String[] stringArray = arguments != null ? arguments.getStringArray("KEY_COMPLAIN_AD_CHOICE_OPTIONS") : null;
        int i = 0;
        if (stringArray != null) {
            int length = stringArray.length;
            while (i < length) {
                arrayList.add(new dq8(stringArray[i]));
                i++;
            }
            return;
        }
        Parcelable[] io2 = io();
        ArrayList arrayList2 = new ArrayList();
        int length2 = io2.length;
        while (i < length2) {
            Parcelable parcelable = io2[i];
            MyTargetAdsComplainOptions myTargetAdsComplainOptions = parcelable instanceof MyTargetAdsComplainOptions ? (MyTargetAdsComplainOptions) parcelable : null;
            if (myTargetAdsComplainOptions != null) {
                arrayList2.add(myTargetAdsComplainOptions);
            }
            i++;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new dq8(((MyTargetAdsComplainOptions) it.next()).c));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_report_ad, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.vk_icon_cancel_28);
        toolbar.setNavigationContentDescription(R.string.report_screen_btn_close_description);
        toolbar.setTitle(getString(R.string.report_screen_title));
        toolbar.setNavigationOnClickListener(new jsk(this, 5));
        krv0.n(R.attr.vk_ui_background_content, inflate);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        b bVar = new b();
        recyclerView.setAdapter(bVar);
        gpu0 gpu0Var = new gpu0(inflate.getContext());
        gpu0Var.j = bVar;
        recyclerView.addItemDecoration(gpu0Var);
        return inflate;
    }
}
