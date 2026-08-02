package com.vk.superapp.browser.internal.ui.communitypicker;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e370;
import xsna.egt0;
import xsna.gfx0;
import xsna.gmu0;
import xsna.hmu0;
import xsna.iah0;
import xsna.ifx0;
import xsna.izs;
import xsna.krv0;
import xsna.s3q0;
import xsna.tf3;
import xsna.tgn0;
import xsna.zc20;

/* compiled from: VkCommunityPickerActivity.kt */
/* loaded from: classes6.dex */
public final class VkCommunityPickerActivity extends VkSdkActivity {
    public static final int g = iah0.a(480.0f);
    public final hmu0 f = new hmu0(this);

    /* compiled from: VkCommunityPickerActivity.kt */
    public static final class a extends RecyclerView.Adapter<b> {
        public final List<AppsGroupsContainer> c;
        public final c d;

        public a(List list, c cVar) {
            this.c = list;
            this.d = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            AppsGroupsContainer appsGroupsContainer = this.c.get(i);
            bVar2.p = appsGroupsContainer;
            VKImageController<View> vKImageController = bVar2.n;
            WebGroup webGroup = appsGroupsContainer.b;
            vKImageController.f(webGroup.d, bVar2.o);
            bVar2.l.setText(webGroup.c);
            bVar2.m.setText(appsGroupsContainer.d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(tf3.b(viewGroup, R.layout.vk_community_picker_item, viewGroup, false), this.d);
        }
    }

    /* compiled from: VkCommunityPickerActivity.kt */
    public static final class b extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;
        public final VKImageController<View> n;
        public final VKImageController.b o;
        public AppsGroupsContainer p;

        public b(View view, c cVar) {
            super(view);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.icon_container);
            this.l = (TextView) view.findViewById(R.id.title);
            this.m = (TextView) view.findViewById(R.id.description);
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(view.getContext());
            this.n = create;
            this.o = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65531);
            view.setOnClickListener(new zc20(this, cVar, 1));
            frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
        }
    }

    /* compiled from: VkCommunityPickerActivity.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<AppsGroupsContainer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(AppsGroupsContainer appsGroupsContainer) {
            ((gmu0) this.receiver).Y(appsGroupsContainer);
            return s3q0.a;
        }
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List list;
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        setTheme(tgn0Var.c(gfx0Var != null ? gfx0Var : null));
        super.onCreate(bundle);
        setContentView(R.layout.vk_community_picker);
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) findViewById(R.id.toolbar);
        vkAuthToolbar.setNavigationIcon(krv0.f(R.drawable.vk_icon_cancel_24, R.attr.vk_ui_text_accent, vkAuthToolbar.getContext()));
        vkAuthToolbar.setNavigationContentDescription(getString(R.string.vk_accessibility_close));
        vkAuthToolbar.setNavigationOnClickListener(new egt0(this, 3));
        Bundle extras = getIntent().getExtras();
        if (extras == null || (list = extras.getParcelableArrayList("groups")) == null) {
            list = EmptyList.b;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new a(list, new c(1, this.f, gmu0.class, "pickGroup", "pickGroup(Lcom/vk/superapp/api/dto/app/AppsGroupsContainer;)V", 0)));
    }
}
