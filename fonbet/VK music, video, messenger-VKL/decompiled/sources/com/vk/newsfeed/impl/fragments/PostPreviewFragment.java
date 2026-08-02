package com.vk.newsfeed.impl.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.ui.p;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.b2c0;
import xsna.b44;
import xsna.bpn0;
import xsna.bwt0;
import xsna.gzs;
import xsna.hd60;
import xsna.hp30;
import xsna.jjc;
import xsna.l2c0;
import xsna.msy;
import xsna.q9q0;
import xsna.r9x0;
import xsna.s3q0;
import xsna.s6c0;
import xsna.u6c0;
import xsna.ww;
import xsna.xgv;

/* compiled from: PostPreviewFragment.kt */
/* loaded from: classes4.dex */
public final class PostPreviewFragment extends BaseFragment implements View.OnClickListener {
    public static final /* synthetic */ int g0 = 0;
    public u6c0 S;
    public b2c0 T;
    public ViewGroup U;
    public ViewGroup V;
    public VKImageView W;
    public VKImageView X;
    public TextView Y;
    public ViewGroup Z;
    public RecyclerView a0;
    public TextView b0;
    public View c0;
    public View d0;
    public final l2c0 e0 = new l2c0();
    public final Object f0 = msy.a(LazyThreadSafetyMode.NONE, new hp30(this, 12));

    @Override // com.vk.core.fragments.BaseFragment
    public final void a(c cVar) {
        this.Q.b(cVar);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
        }
        return false;
    }

    public final void io(Integer num, String str) {
        if (num == null && str == null) {
            Mf(0, null);
        } else {
            Mf(10, new Intent().putExtra("code", num).putExtra("description", str));
        }
    }

    public final void jo(boolean z) {
        TextView textView = this.b0;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u6c0 u6c0Var;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.postpreview_publish_button) {
            if (valueOf == null || valueOf.intValue() != R.id.postpreview_close_button || (u6c0Var = this.S) == null) {
                return;
            }
            u6c0Var.a.io(null, null);
            return;
        }
        u6c0 u6c0Var2 = this.S;
        if (u6c0Var2 != null) {
            u6c0Var2.a.jo(false);
            String str = u6c0Var2.d;
            if (str == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Owner owner = u6c0Var2.c;
            if (owner != null) {
            }
            b44 b44Var = new b44(u6c0Var2, str, linkedHashMap, 3);
            u6c0Var2.f = b44Var;
            b44Var.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new u6c0(this, (r9x0) this.f0.getValue());
        this.T = new b2c0();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.postpreview_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        u6c0 u6c0Var = this.S;
        if (u6c0Var != null) {
            bpn0 bpn0Var = u6c0Var.h;
            if (bpn0Var.isInitialized()) {
                ((q9q0) bpn0Var.getValue()).a();
            }
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        VkSimpleButton vkSimpleButton;
        super.onViewCreated(view, bundle);
        this.U = (ViewGroup) view.findViewById(R.id.postpreview_content_layout);
        this.W = (VKImageView) view.findViewById(R.id.postpreview_user_avatar);
        this.X = (VKImageView) view.findViewById(R.id.postpreview_app_avatar_image);
        this.Z = (ViewGroup) view.findViewById(R.id.postpreview_title_layout);
        this.Y = (TextView) view.findViewById(R.id.postpreview_app_title_text);
        this.d0 = view.findViewById(R.id.postpreview_progressbar);
        this.c0 = view.findViewById(R.id.postpreview_error_view);
        this.V = (ViewGroup) view.findViewById(R.id.button_layout);
        View view2 = this.c0;
        if (view2 != null && (vkSimpleButton = (VkSimpleButton) view2.findViewById(R.id.error_retry)) != null) {
            jjc.g(vkSimpleButton, new xgv(this, 27));
        }
        TextView textView = (TextView) view.findViewById(R.id.postpreview_publish_button);
        this.b0 = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        View findViewById = view.findViewById(R.id.postpreview_close_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.postpreview_recycler_view);
        this.a0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.T);
        }
        RecyclerView recyclerView2 = this.a0;
        if (recyclerView2 != null) {
            getActivity();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView3 = this.a0;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(this.e0);
        }
        u6c0 u6c0Var = this.S;
        if (u6c0Var != null) {
            Bundle requireArguments = requireArguments();
            PostPreviewFragment postPreviewFragment = u6c0Var.a;
            String u = hd60.a().a().u();
            if (u == null) {
                u = "";
            }
            VKImageView vKImageView = postPreviewFragment.W;
            if (vKImageView != null) {
                vKImageView.load(u);
            }
            u6c0Var.d = requireArguments.getString("params", "");
            boolean z = requireArguments.getBoolean("is_internal");
            requireArguments.getBoolean("is_game");
            u6c0Var.e = requireArguments.getString("ref");
            Uri parse = Uri.parse(u6c0Var.d);
            boolean booleanQueryParameter = parse.getBooleanQueryParameter("hide_banner", false);
            long j = requireArguments.getLong("appId");
            String queryParameter = parse.getQueryParameter("owner_id");
            boolean z2 = (queryParameter != null ? Long.parseLong(queryParameter) : 0L) < 0;
            boolean booleanQueryParameter2 = parse.getBooleanQueryParameter("from_group", false);
            String queryParameter2 = parse.getQueryParameter("upload_attachments");
            String queryParameter3 = parse.getQueryParameter("upload_attachments_size");
            s6c0 s6c0Var = new s6c0(j, queryParameter3 != null ? Integer.parseInt(queryParameter3) : 0, queryParameter2, z2, booleanQueryParameter2);
            if (z && booleanQueryParameter && (viewGroup = postPreviewFragment.Z) != null) {
                bwt0.p0(viewGroup, false);
            }
            gzs<s3q0> wwVar = queryParameter2 != null ? new ww(20, u6c0Var, s6c0Var) : new p(16, u6c0Var, s6c0Var);
            u6c0Var.f = wwVar;
            wwVar.invoke();
        }
    }
}
