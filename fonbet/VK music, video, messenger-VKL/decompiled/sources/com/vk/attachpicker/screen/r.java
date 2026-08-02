package com.vk.attachpicker.screen;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.util.ArrayList;
import xsna.izt0;
import xsna.zmw;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class r extends izt0 {
    public final Activity b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ p d;

    /* compiled from: ViewerScreen.java */
    public class a {
        public a() {
        }
    }

    public r(p pVar, ArrayList arrayList) {
        this.d = pVar;
        this.c = arrayList;
        this.b = pVar.k;
    }

    @Override // xsna.izt0
    public final View b(int i, ViewPager viewPager) {
        Activity activity = this.b;
        FrameLayout frameLayout = new FrameLayout(activity);
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.c.get(i);
        p pVar = this.d;
        MediaStoreEntry s = pVar.G.s(mediaStoreEntry);
        if (s != null) {
            mediaStoreEntry = s;
        }
        zmw zmwVar = new zmw(activity, i);
        zmwVar.setPostprocessor(pVar.S.H(mediaStoreEntry));
        zmwVar.setAutoPlayAnimations(true);
        zmwVar.T0(mediaStoreEntry);
        frameLayout.addView(zmwVar);
        pVar.S.w(zmwVar);
        if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
            zmwVar.setZoomable(false);
            frameLayout.addView(new com.vk.attachpicker.widget.c(activity, mediaStoreEntry.f(), i, new a()));
        }
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.c.size();
    }
}
