package com.vk.newsfeed.impl.views;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.a6a0;
import xsna.b2c0;
import xsna.b6f0;
import xsna.dh6;
import xsna.dw20;
import xsna.e43;
import xsna.flm0;
import xsna.h170;
import xsna.j5g;
import xsna.m0q0;
import xsna.msy;
import xsna.ol60;
import xsna.p870;
import xsna.pa2;
import xsna.s1c0;
import xsna.sf2;
import xsna.tzp0;
import xsna.u1c0;
import xsna.up70;
import xsna.vp10;
import xsna.w8i;

/* compiled from: TaggedPhotosBottomSheet.kt */
/* loaded from: classes4.dex */
public final class a extends dw20 implements w8i {
    public static final tzp0.c.a l1 = new tzp0.c.a(new b(), true);
    public b2c0 f1;
    public Photos g1;
    public PostInteract h1;
    public String i1;
    public final Object j1 = msy.a(LazyThreadSafetyMode.NONE, new b6f0(this, 10));
    public final flm0 k1 = new flm0(this, 1);

    /* compiled from: TaggedPhotosBottomSheet.kt */
    /* renamed from: com.vk.newsfeed.impl.views.a$a, reason: collision with other inner class name */
    public static final class C1405a extends dw20.b {
        public final b2c0 e;

        public C1405a(Context context, b2c0 b2c0Var, dh6.a aVar) {
            super(context, aVar);
            this.e = b2c0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.f1 = this.e;
            return aVar;
        }
    }

    /* compiled from: TaggedPhotosBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_TAG_POPUP;
        }
    }

    /* compiled from: TaggedPhotosBottomSheet.kt */
    public static final class c {
        public static ArrayList a(Context context, Photos photos, PostInteract postInteract, String str) {
            int i;
            new a6a0();
            h170 h170Var = new h170();
            s1c0.a aVar = new s1c0.a();
            aVar.j = false;
            sf2 sf2Var = new sf2();
            sf2Var.b = context;
            aVar.s = sf2Var.a();
            s1c0 a = aVar.a();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : photos.q) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                EntryAttachment entryAttachment = (EntryAttachment) obj;
                Attachment attachment = entryAttachment.b;
                attachment.b = true;
                if (attachment instanceof PhotoAttachment) {
                    i = 1;
                    arrayList.add(a6a0.c(new vp10(photos, photos, (PhotoAttachment) attachment, 50, i2, EmptyList.b, a.q)));
                } else {
                    i = 1;
                }
                Photos Lb = Photos.Lb(photos, i2 == 0 ? photos.m : -1, e43.a(entryAttachment), null, 4061);
                u1c0 u1c0Var = new u1c0(i, Lb);
                u1c0Var.h = (ol60) j5g.a0(new up70(new pa2(h170Var)).a(0, new Triple(Lb, Lb, a)));
                arrayList.add(u1c0Var);
                i2 = i3;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u1c0 u1c0Var2 = (u1c0) it.next();
                u1c0Var2.m = postInteract;
                u1c0Var2.l = str;
                u1c0Var2.n = a;
            }
            return arrayList;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f1 == null) {
            dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((p870) this.j1.getValue()).b(113, this.k1);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((p870) this.j1.getValue()).g(this.k1);
        super.onDestroyView();
    }
}
