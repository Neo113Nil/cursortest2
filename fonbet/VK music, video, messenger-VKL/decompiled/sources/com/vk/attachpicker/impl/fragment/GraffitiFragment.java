package com.vk.attachpicker.impl.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.BaseRecyclerFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.acu;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f5h0;
import xsna.ff20;
import xsna.h7u0;
import xsna.i1;
import xsna.iah0;
import xsna.iin0;
import xsna.j34;
import xsna.j6r0;
import xsna.jx2;
import xsna.rpj0;
import xsna.rwi;
import xsna.xbu;
import xsna.ybu;
import xsna.zbu;

/* loaded from: classes15.dex */
public class GraffitiFragment extends BaseRecyclerFragment<Document> implements iin0 {
    public static final /* synthetic */ int N0 = 0;
    public String G0;
    public String H0;
    public ViewGroup I0;
    public LinearLayout J0;
    public View K0;
    public b L0;
    public io.reactivex.rxjava3.disposables.c M0;

    public class a extends rpj0<ArrayList<Document>> {
        public a(GraffitiFragment graffitiFragment) {
            super(graffitiFragment);
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            GraffitiFragment graffitiFragment = GraffitiFragment.this;
            graffitiFragment.M0 = null;
            graffitiFragment.Bo(arrayList, false);
            b wo = graffitiFragment.wo();
            ArrayList<Document> arrayList2 = wo.d;
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            wo.notifyDataSetChanged();
            wo.e = arrayList2.size() == 0;
        }

        @Override // xsna.rpj0, xsna.q76, xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            GraffitiFragment.this.M0 = null;
            super.e(vKApiExecutionException);
        }
    }

    public class b extends UsableRecyclerView.c<UsableRecyclerView.x> {
        public final Context c;
        public final ArrayList<Document> d = new ArrayList<>();
        public boolean e = false;

        public b(FragmentActivity fragmentActivity) {
            this.c = fragmentActivity;
            setHasStableIds(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            if (i == 0) {
                return 0L;
            }
            return this.d.get(i - 1).b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UsableRecyclerView.x xVar = (UsableRecyclerView.x) e0Var;
            if (xVar instanceof c) {
                c cVar = (c) xVar;
                Document document = this.d.get(i - 1);
                cVar.l = document;
                ((VKImageView) cVar.itemView).O0(document.n, ImageScreenSize.MID);
                return;
            }
            if (xVar instanceof d) {
                boolean z = this.e;
                TextView textView = ((d) xVar).l;
                if (z) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraffitiFragment graffitiFragment = GraffitiFragment.this;
            return i == 0 ? new d(graffitiFragment) : graffitiFragment.new c(this.c);
        }
    }

    public class c extends UsableRecyclerView.x implements UsableRecyclerView.e, UsableRecyclerView.r {
        public Document l;

        public c(Context context) {
            super(new VKImageView(context));
            ((VKImageView) this.itemView).setActualScaleType(f5h0.i.a);
            ((VKImageView) this.itemView).setAspectRatio(1.0f);
            int a = iah0.a(8);
            this.itemView.setPadding(a, a, a, a);
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.r
        public final boolean P4() {
            Document document;
            FragmentActivity activity = GraffitiFragment.this.getActivity();
            if (activity == null || (document = this.l) == null) {
                return false;
            }
            h7u0.a aVar = new h7u0.a(activity);
            aVar.T(new String[]{activity.getString(R.string.delete)}, new com.vk.attachpicker.impl.fragment.b(this, document));
            aVar.m();
            return true;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            GraffitiFragment graffitiFragment = GraffitiFragment.this;
            FragmentActivity activity = graffitiFragment.getActivity();
            if (activity == null || this.l == null) {
                return;
            }
            j34 a = rwi.d().p().a(graffitiFragment);
            Document document = this.l;
            acu acuVar = new acu(activity, R.style.FullScreenDialogDialog);
            dhr0.s0(acuVar.getWindow());
            acuVar.setCancelable(true);
            acuVar.setCanceledOnTouchOutside(false);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(acuVar.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.softInputMode = 48;
            acuVar.getWindow().setAttributes(layoutParams);
            if (activity.getResources().getBoolean(R.bool.picker_transparent_status_bar)) {
                acuVar.getWindow().addFlags(67108864);
            }
            acuVar.setContentView(activity.getLayoutInflater().inflate(R.layout.picker_layout_graffiti_result, (ViewGroup) null));
            View findViewById = acuVar.findViewById(R.id.fl_graffiti_preview);
            acuVar.b = findViewById;
            acuVar.c = acuVar.findViewById(R.id.fl_graffiti_container);
            VKImageView vKImageView = (VKImageView) acuVar.findViewById(R.id.iv_preview);
            TextView textView = (TextView) acuVar.findViewById(R.id.tv_send_button);
            vKImageView.setAspectRatio(Math.min(2.0f, Math.max(0.6f, document.d / document.e)));
            vKImageView.O0(document.k, ImageScreenSize.MID);
            vKImageView.setMaxHeight(iah0.v() - iah0.a(128));
            vKImageView.setMaxWidth(iah0.v() - iah0.a(32));
            vKImageView.setOnClickListener(new xbu());
            findViewById.setOnClickListener(new ybu(acuVar));
            textView.setOnClickListener(new zbu(acuVar, document, activity, a));
            acuVar.show();
        }
    }

    public class d extends UsableRecyclerView.x {
        public final TextView l;

        public d(GraffitiFragment graffitiFragment) {
            super(graffitiFragment.J0);
            this.l = (TextView) this.itemView.findViewById(R.id.tv_empty);
        }
    }

    public GraffitiFragment() {
        super(20);
        this.E0 = R.layout.picker_fragment_graffiti2;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    /* renamed from: Io, reason: merged with bridge method [inline-methods] */
    public final b wo() {
        if (this.L0 == null) {
            this.L0 = new b(getActivity());
        }
        return this.L0;
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        if (this.I0 == null) {
            this.I0 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.picker_toolbar_graffiti, (ViewGroup) null);
        }
        return this.I0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        if (getActivity() != null && i == 150 && i2 == -1) {
            FragmentActivity activity = getActivity();
            if (activity != null && (intent2 = activity.getIntent()) != null) {
                UserId userId = (UserId) intent2.getParcelableExtra("owner_id");
                int intExtra = intent2.getIntExtra("post_id", 0);
                long longExtra = intent2.getLongExtra("peer_id", 0L);
                intent.putExtra("owner_id", userId);
                intent.putExtra("post_id", intExtra);
                intent.putExtra("peer_id", longExtra);
            }
            j34 a2 = rwi.d().p().a(this);
            if (a2 != null) {
                a2.V2(intent);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        qo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.G0 = getArguments().getString("graffiti_avatar");
            this.H0 = getArguments().getString("graffiti_title");
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UsableRecyclerView usableRecyclerView = this.n0;
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.setPadding(0, iah0.a(8.0f), 0, iah0.a(20.0f));
        this.Q.setVisibility(8);
        Ho(false);
        bwt0.Z(R.attr.vk_legacy_background_content, view);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.picker_layout_graffiti_header, (ViewGroup) null);
        this.J0 = linearLayout;
        View findViewById = linearLayout.findViewById(R.id.fl_new_graffiti);
        this.K0 = findViewById;
        findViewById.setOnClickListener(new i1(this, 6));
        return super.ro(layoutInflater, viewGroup, bundle);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        io.reactivex.rxjava3.disposables.c cVar = this.M0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.M0 = new jx2(new ff20(), new a(this)).a();
    }
}
