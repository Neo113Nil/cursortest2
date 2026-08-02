package com.vk.superapp.browser.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e370;
import xsna.gfx0;
import xsna.ifx0;
import xsna.rg0;
import xsna.tgn0;

/* compiled from: VkImagesPreviewActivity.kt */
/* loaded from: classes6.dex */
public final class VkImagesPreviewActivity extends VkSdkActivity {
    public static final /* synthetic */ int g = 0;
    public final VKImageController.b f = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, VKImageController.ScaleType.CENTER_INSIDE, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65407);

    /* compiled from: VkImagesPreviewActivity.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final ArrayList c;

        public a(ArrayList arrayList) {
            this.c = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            Object next;
            b bVar2 = bVar;
            Iterator<T> it = ((WebImage) this.c.get(i)).b.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    WebImageSize webImageSize = (WebImageSize) next;
                    int max = Math.max(webImageSize.c, webImageSize.d);
                    do {
                        Object next2 = it.next();
                        WebImageSize webImageSize2 = (WebImageSize) next2;
                        int max2 = Math.max(webImageSize2.c, webImageSize2.d);
                        if (max < max2) {
                            next = next2;
                            max = max2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            WebImageSize webImageSize3 = (WebImageSize) next;
            bVar2.l.f(webImageSize3 != null ? webImageSize3.b : null, VkImagesPreviewActivity.this.f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            ifx0 ifx0Var = e370.c;
            if (ifx0Var == null) {
                ifx0Var = null;
            }
            VKImageController<View> create = ifx0Var.b().create(viewGroup.getContext());
            ((c) create).getView().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new b(create);
        }
    }

    /* compiled from: VkImagesPreviewActivity.kt */
    public final class b extends RecyclerView.e0 {
        public final VKImageController<View> l;

        public b(VKImageController vKImageController) {
            super(vKImageController.getView());
            this.l = vKImageController;
        }
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        setTheme(tgn0Var.c(gfx0Var));
        super.onCreate(bundle);
        setContentView(R.layout.vk_images_preview_activity);
        Bundle extras = getIntent().getExtras();
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("images") : null;
        Bundle extras2 = getIntent().getExtras();
        int i = extras2 != null ? extras2.getInt("startIndex") : 0;
        a aVar = parcelableArrayList != null ? new a(parcelableArrayList) : null;
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.viewpager);
        viewPager2.setAdapter(aVar);
        viewPager2.e(i, false);
        ((ImageButton) findViewById(R.id.cancel_action)).setOnClickListener(new rg0(this, 16));
    }
}
