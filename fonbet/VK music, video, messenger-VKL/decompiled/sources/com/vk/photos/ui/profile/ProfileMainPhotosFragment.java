package com.vk.photos.ui.profile;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.lists.ListDataSet;
import com.vk.photos.ui.PhotoUploadExtraParams;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.a920;
import xsna.am1;
import xsna.aq2;
import xsna.av70;
import xsna.b1z;
import xsna.b290;
import xsna.bpn0;
import xsna.buc0;
import xsna.cf00;
import xsna.d02;
import xsna.d0w;
import xsna.daa0;
import xsna.dm1;
import xsna.dw20;
import xsna.en0;
import xsna.epx;
import xsna.ev20;
import xsna.ev6;
import xsna.ey50;
import xsna.fcn;
import xsna.fkq0;
import xsna.fnj;
import xsna.fpf0;
import xsna.fsk;
import xsna.gko;
import xsna.gm6;
import xsna.gyd0;
import xsna.hg1;
import xsna.hyd0;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.jfv;
import xsna.jgp;
import xsna.klj;
import xsna.ko00;
import xsna.kv3;
import xsna.kyd0;
import xsna.lo10;
import xsna.lva0;
import xsna.m0q0;
import xsna.mca0;
import xsna.msy;
import xsna.o25;
import xsna.oax;
import xsna.odc0;
import xsna.oz50;
import xsna.rfc;
import xsna.rsr;
import xsna.rwi;
import xsna.s3q0;
import xsna.sx3;
import xsna.t2i0;
import xsna.tzp0;
import xsna.v4v;
import xsna.we6;
import xsna.ww50;
import xsna.x550;
import xsna.xg5;
import xsna.y8g0;
import xsna.zs6;
import xsna.zvw;

/* compiled from: ProfileMainPhotosFragment.kt */
/* loaded from: classes3.dex */
public class ProfileMainPhotosFragment extends BasePhotoListFragment<Object> implements gyd0, oax {
    public static final /* synthetic */ int F0 = 0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public int p0;
    public int q0;
    public boolean r0;
    public PhotoAlbum s0;
    public dw20 t0;
    public ev20 u0;
    public final Object z0;
    public final b n0 = new b();
    public final d0w o0 = new d0w(this, 19);
    public final tzp0.c.a v0 = new tzp0.c.a(new c(), false);
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public final bpn0 x0 = new bpn0(new x550(this, 20));
    public final kyd0 y0 = new kyd0(this);

    /* compiled from: ProfileMainPhotosFragment.kt */
    public static class a extends BasePhotoListFragment.a {
        public a(UserId userId, String str, String str2, boolean z, boolean z2) {
            super(userId, ProfileMainPhotosFragment.class);
            this.j.putBoolean("need_system", true);
            this.j.putString("user_name_ins", str);
            this.j.putBoolean("can_view_user_photos", z);
            this.j.putBoolean("show_new_tags", true);
            this.j.putBoolean("open_for_add", z2);
            y(str2);
        }
    }

    /* compiled from: ProfileMainPhotosFragment.kt */
    public static final class b implements fcn {
        public dw20 b;

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = this.b;
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: ProfileMainPhotosFragment.kt */
    public static final class c implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MODERN_PHOTO_UPLOAD;
        }
    }

    public ProfileMainPhotosFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z0 = msy.a(lazyThreadSafetyMode, new b1z(this, 19));
        this.A0 = msy.a(lazyThreadSafetyMode, new cf00(this, 22));
        this.B0 = msy.a(lazyThreadSafetyMode, new hyd0(0));
        this.C0 = msy.a(lazyThreadSafetyMode, new b290(this, 11));
        this.D0 = msy.a(lazyThreadSafetyMode, new buc0(2));
        this.E0 = msy.a(lazyThreadSafetyMode, new lva0(this, 9));
    }

    public final void Ao(Intent intent) {
        ArrayList<String> arrayList;
        UserId userId;
        PhotoAlbum photoAlbum = this.s0;
        if (photoAlbum != null) {
            if (intent.hasExtra("files")) {
                arrayList = intent.getStringArrayListExtra("files");
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                ArrayList<String> arrayList2 = new ArrayList<>();
                String stringExtra = intent.getStringExtra(X3.i.b);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                arrayList2.add(stringExtra);
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            UserId c2 = o25.a().c();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                int i = photoAlbum.b;
                UserId userId2 = photoAlbum.c;
                arrayList3.add(i > 0 ? new com.vk.upload.impl.tasks.b(next, c2, i, userId2, "", false) : new com.vk.upload.impl.tasks.a(next, c2, i, userId2, "", false));
            }
            PendingIntent a2 = t2i0.a(kn(), 0, kn().getIntent(), 33554432);
            ev6 ev6Var = new ev6(arrayList3, getString(R.string.uploading_photo));
            ev6Var.m = new PhotoUploadExtraParams(photoAlbum);
            com.vk.upload.impl.a.g(ev6Var, new UploadNotification.a(a2, getString(R.string.photos_upload_ok), getString(R.string.photos_upload_ok_long)));
            com.vk.upload.impl.a.i(ev6Var);
            kyd0 kyd0Var = this.y0;
            if (kyd0Var != null && (userId = kyd0Var.f) != null) {
                new PhotoAlbumFragment.a(userId, photoAlbum, false).g(1534, this);
            }
            if (arrayList.size() >= 3) {
                hg1.e(this.d0, fsk.c.b(InAppReviewConditionKey.LOAD_3_MORE_PHOTOS, jgp.b).subscribe());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void Bo() {
        ?? r0 = this.D0;
        ((zvw) r0.getValue()).clear();
        ((zvw) r0.getValue()).x0(new klj(y8g0.e(R.string.all_photos), this.a0, false, (Runnable) null, 24));
    }

    @Override // xsna.gyd0
    public final void P(PhotosGetAlbums.a aVar) {
        this.r0 = true;
        ArrayList<PhotoAlbum> arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList<PhotoAlbum> arrayList2 = aVar.b;
        this.q0 = arrayList2.size() + size;
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        vo().clear();
        vo().n0(j5g.H0(arrayList3, 10));
        xo().clear();
        dm1 xo = xo();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (d02.k((PhotoAlbum) obj)) {
                arrayList4.add(obj);
            }
        }
        xo.n0(arrayList4);
    }

    @Override // xsna.gyd0
    public final void R(int i) {
        ev20 ev20Var;
        dm1 vo = vo();
        vo.getClass();
        vo.C0(new am1(i));
        dm1 xo = xo();
        xo.getClass();
        xo.C0(new am1(i));
        if (xo().E0() == 0 && (ev20Var = this.u0) != null) {
            ev20Var.a(true);
        }
        int i2 = -1;
        this.q0--;
        klj kljVar = to();
        ListDataSet listDataSet = (ListDataSet) this.V.c;
        ArrayList arrayList = listDataSet.d;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (epx.f(((we6) arrayList.get(i3)).f, 1)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            listDataSet.h(i2);
            arrayList.set(i2, kljVar);
            listDataSet.d(i2);
        }
    }

    @Override // xsna.gyd0
    public final void U(int i, String str) {
        vo().U(i, str);
        xo().U(i, str);
    }

    @Override // xsna.oax
    public final boolean V7(Intent intent) {
        return intent.getBooleanExtra("profile_photos_picker", false);
    }

    @Override // xsna.oax
    public final void Wc(Intent intent) {
        if (!rwi.d().g().a(intent)) {
            uo();
            return;
        }
        View view = getView();
        if (view != null) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.w0.post(new zs6(3, this, intent));
    }

    @Override // xsna.gyd0
    public final void X(PhotoAlbum photoAlbum) {
        vo().X(photoAlbum);
        xo().X(photoAlbum);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.y0;
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void ko() {
        super.ko();
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            UserId userId = this.y0.f;
            boolean z = !fkq0.c(userId) || userId.equals(o25.a().c());
            if (!z && fkq0.b(userId)) {
                Group b2 = xg5.a().b(userId);
                z = b2 != null && b2.i;
            }
            vkTopBar.setAfter(z && ((!requireArguments().getBoolean("select") || requireArguments().getBoolean("select_album")) && this.r0) ? VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_add_24), null, new odc0(this, 5), null, null, com.vk.core.compose.component.semantics.b.a(null, new av70(7), 3), 26), null, 6) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void lo() {
        zvw zvwVar = this.V;
        zvwVar.clear();
        int i = 0;
        int i2 = 1;
        if (this.p0 > 0) {
            String e = y8g0.e(R.string.new_tags);
            int i3 = this.p0;
            zvwVar.x0(new klj((CharSequence) e, i3, i3 > 1, true, (Runnable) new sx3(this, 9)));
            zvwVar.x0(new jfv(i2, yo()));
        }
        if (this.q0 > 0) {
            zvwVar.x0(to());
            jfv jfvVar = new jfv(i, vo());
            jfvVar.j = new v4v(26);
            jfvVar.b = true;
            zvwVar.x0(jfvVar);
        }
        ((zvw) this.B0.getValue()).clear();
        Bo();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final a920 mo() {
        a920 a920Var = new a920();
        a920Var.K0(this.V);
        a920Var.K0((zvw) this.B0.getValue());
        a920Var.K0((daa0) this.C0.getValue());
        a920Var.K0((zvw) this.D0.getValue());
        a920Var.K0(po());
        return a920Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        PhotoAlbum photoAlbum;
        ev20 ev20Var;
        super.onActivityResult(i, i2, intent);
        if (i == 8295 && i2 == -1 && intent != null && (photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album")) != null) {
            vo().K0(photoAlbum);
            int i3 = 0;
            if (d02.k(photoAlbum)) {
                xo().K0(photoAlbum);
                if (xo().E0() > 0 && (ev20Var = this.u0) != null) {
                    ev20Var.a(false);
                }
            }
            this.q0++;
            klj kljVar = to();
            ListDataSet listDataSet = (ListDataSet) this.V.c;
            ArrayList arrayList = listDataSet.d;
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (epx.f(((we6) arrayList.get(i3)).f, 1)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 >= 0) {
                listDataSet.h(i3);
                arrayList.set(i3, kljVar);
                listDataSet.d(i3);
            }
        }
        rfc a2 = fpf0.a(kn().getClass());
        rsr rsrVar = oz50.k;
        oz50.b.d();
        boolean c2 = a2.c(MainActivity.class);
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        if ((fnj.d(kn) || !c2) && i == 1534 && i2 == -1 && intent != null) {
            Ao(intent);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Dialog dialog;
        dw20 dw20Var = this.t0;
        if (dw20Var != null && (dialog = dw20Var.s) != null) {
            dialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // xsna.gyd0
    public final void q() {
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        aq2Var.f0();
        C1(null);
        ko();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("open_for_add")) {
            return;
        }
        uo();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("open_for_add");
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final int qo() {
        return this.a0;
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, xsna.hj6
    public final void r0(int i) {
        this.a0--;
        Bo();
        super.r0(i);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    /* renamed from: ro */
    public final Object io() {
        return this.y0;
    }

    @Override // xsna.gyd0
    public final void sh(ArrayList arrayList) {
        this.p0 = arrayList.size();
        yo().clear();
        yo().n0(arrayList);
    }

    public final klj to() {
        klj kljVar = new klj(getString(R.string.albums), this.q0, true, (Runnable) new kv3(this, 18), 8);
        kljVar.f = 1;
        return kljVar;
    }

    public final void uo() {
        ev20 ev20Var = new ev20(kn());
        ev20Var.setOnAddAlbumClick(new lo10(this, 24));
        ev20Var.setAdapter(xo());
        this.u0 = ev20Var;
        this.t0 = new dw20.b(kn(), this.v0).c(new en0()).D0(this.u0, false).v0(R.string.photos_view_choose_album).a0(new ko00(this, 27)).I0("modal_add_photo");
        if (getActivity() instanceof ey50) {
            ww50<?> Y = ((ey50) getActivity()).Y();
            b bVar = this.n0;
            Y.S(bVar);
            bVar.b = this.t0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dm1 vo() {
        return (dm1) this.A0.getValue();
    }

    public izs<PhotoAlbum, s3q0> wo() {
        return this.o0;
    }

    @Override // xsna.gyd0
    public final void xj(ProfilePhotoTag profilePhotoTag) {
        mca0 yo = yo();
        yo.B0(profilePhotoTag);
        mca0.a aVar = yo.g.get();
        if (aVar != null) {
            aVar.V5(Integer.valueOf(yo.getItemCount() - 1));
        }
        this.p0 = yo().getItemCount();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dm1 xo() {
        return (dm1) this.E0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mca0 yo() {
        return (mca0) this.z0.getValue();
    }

    public void zo() {
        new AlbumsListFragment.a(this.y0.f).k(getActivity());
    }
}
