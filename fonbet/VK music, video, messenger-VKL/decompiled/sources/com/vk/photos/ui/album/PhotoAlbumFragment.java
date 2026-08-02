package com.vk.photos.ui.album;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.lists.AbstractPaginatedView;
import com.vk.photos.ui.PhotoUploadExtraParams;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aq2;
import xsna.b8g;
import xsna.bwt0;
import xsna.c220;
import xsna.d02;
import xsna.e3m;
import xsna.ev6;
import xsna.f5a0;
import xsna.fsk;
import xsna.gko;
import xsna.gm6;
import xsna.hg1;
import xsna.hvz;
import xsna.jgp;
import xsna.jz70;
import xsna.la;
import xsna.o25;
import xsna.sdz;
import xsna.t2i0;
import xsna.u4a0;
import xsna.uq50;
import xsna.vt30;
import xsna.x4a0;
import xsna.xwk;
import xsna.z7w;

/* compiled from: PhotoAlbumFragment.kt */
/* loaded from: classes3.dex */
public class PhotoAlbumFragment extends BasePhotoListFragment<Object> implements u4a0 {
    public static final /* synthetic */ int r0 = 0;
    public boolean n0;
    public hvz o0;
    public final f5a0 p0 = new f5a0(this);
    public final c q0 = new c();

    /* compiled from: PhotoAlbumFragment.kt */
    public static final class a extends BasePhotoListFragment.a {
        public a(UserId userId, PhotoAlbum photoAlbum, boolean z) {
            super(userId, PhotoAlbumFragment.class);
            this.j.putParcelable("album", photoAlbum);
            this.j.putBoolean("isNeedUpdateGroupAlbumInfo", z);
        }
    }

    /* compiled from: PhotoAlbumFragment.kt */
    public static final class b extends aq2 {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity, null, 6, 0);
        }

        @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView, com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
        public final View c(Context context, AttributeSet attributeSet) {
            PhotoAlbum photoAlbum;
            View inflate = LayoutInflater.from(context).inflate(R.layout.photos_empty_stub_view, (ViewGroup) this, false);
            View findViewById = inflate.findViewById(R.id.add_photo);
            PhotoAlbumFragment photoAlbumFragment = PhotoAlbumFragment.this;
            f5a0 f5a0Var = photoAlbumFragment.p0;
            if (f5a0Var == null || (photoAlbum = f5a0Var.g) == null || !d02.k(photoAlbum)) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setOnClickListener(new la(photoAlbumFragment, 9));
            }
            setupEmptyHeader(inflate);
            photoAlbumFragment.o0 = new hvz(this, 21);
            return inflate;
        }

        public final void setupEmptyHeader(View view) {
            PhotoAlbum photoAlbum;
            PhotoAlbum photoAlbum2;
            PhotoAlbum photoAlbum3;
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.description);
            PhotoAlbumFragment photoAlbumFragment = PhotoAlbumFragment.this;
            f5a0 f5a0Var = photoAlbumFragment.p0;
            String str = null;
            textView.setText((f5a0Var == null || (photoAlbum3 = f5a0Var.g) == null) ? null : photoAlbum3.g);
            f5a0 f5a0Var2 = photoAlbumFragment.p0;
            if (TextUtils.isEmpty((f5a0Var2 == null || (photoAlbum2 = f5a0Var2.g) == null) ? null : photoAlbum2.h)) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setVisibility(0);
            sdz a = xwk.d().a();
            f5a0 f5a0Var3 = photoAlbumFragment.p0;
            if (f5a0Var3 != null && (photoAlbum = f5a0Var3.g) != null) {
                str = photoAlbum.h;
            }
            textView2.setText(a.m(str));
        }
    }

    /* compiled from: PhotoAlbumFragment.kt */
    public static final class c extends AbstractPaginatedView.i {
        public c() {
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void b() {
            int i = PhotoAlbumFragment.r0;
            PhotoAlbumFragment photoAlbumFragment = PhotoAlbumFragment.this;
            if (photoAlbumFragment.po().getItemCount() > 1) {
                photoAlbumFragment.n0 = true;
            }
            photoAlbumFragment.ko();
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void c() {
            PhotoAlbumFragment photoAlbumFragment = PhotoAlbumFragment.this;
            photoAlbumFragment.n0 = false;
            photoAlbumFragment.ko();
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, xsna.hj6
    public final void I0() {
        f5a0 f5a0Var = this.p0;
        C1(f5a0Var != null ? f5a0Var.g : null);
        hvz hvzVar = this.o0;
        if (hvzVar != null) {
            hvzVar.invoke();
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, xsna.hj6
    public final void g1(Photo photo) {
        f5a0 f5a0Var = this.p0;
        if (f5a0Var == null || !f5a0Var.l) {
            po().x0(photo);
        } else {
            po().z0(0, photo);
        }
        C1(f5a0Var != null ? f5a0Var.g : null);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.p0;
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void ko() {
        super.ko();
        f5a0 f5a0Var = this.p0;
        int i = (f5a0Var == null || !f5a0Var.l) ? R.drawable.vk_icon_deprecated_ic_revert_24 : R.drawable.vk_icon_deprecated_ic_revert_back_24;
        gko.b bVar = gko.Companion;
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(VkTopBar.Middle.c.a);
        }
        VkTopBar vkTopBar2 = this.X;
        if (vkTopBar2 != null) {
            VkTopBar.a.b.C0877b c0877b = null;
            VkTopBar.a.c.f fVar = new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_24), null, new jz70(this, 4), null, null, com.vk.core.compose.component.semantics.b.a(null, new c220(10), 3), 26);
            if (this.n0) {
                c0877b = new VkTopBar.a.b.C0877b(new gko(i), null, new vt30(this, 12), null, new b8g(e3m.f(R.attr.vk_ui_icon_accent_themed, kn())), com.vk.core.compose.component.semantics.b.a(null, new z7w(14), 3), 10);
            }
            vkTopBar2.setAfter(VkTopBar.a.C0875a.a(fVar, c0877b, 4));
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void lo() {
        this.V.x0(new x4a0(new uq50(this, 10)));
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final aq2 no() {
        return new b(kn());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        PhotoAlbum photoAlbum;
        ArrayList<String> arrayList;
        f5a0 f5a0Var = this.p0;
        if (f5a0Var == null || (photoAlbum = f5a0Var.g) == null) {
            return;
        }
        if (i != 3890) {
            if (i == 8295 && i2 == -1) {
                f5a0Var.v7();
                return;
            }
            return;
        }
        if (i2 == -1) {
            if (intent.hasExtra("files")) {
                arrayList = intent.getStringArrayListExtra("files");
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                arrayList = new ArrayList<>();
                String stringExtra = intent.getStringExtra(X3.i.b);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                arrayList.add(stringExtra);
            }
            ArrayList arrayList2 = new ArrayList();
            UserId c2 = o25.a().c();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                int i3 = photoAlbum.b;
                UserId userId = photoAlbum.c;
                arrayList2.add(i3 > 0 ? new com.vk.upload.impl.tasks.b(next, c2, i3, userId, "", false) : new com.vk.upload.impl.tasks.a(next, c2, i3, userId, "", false));
            }
            PendingIntent a2 = t2i0.a(kn(), 0, kn().getIntent(), 33554432);
            ev6 ev6Var = new ev6(arrayList2, getString(R.string.uploading_photo));
            ev6Var.m = new PhotoUploadExtraParams(photoAlbum);
            com.vk.upload.impl.a.g(ev6Var, new UploadNotification.a(a2, getString(R.string.photos_upload_ok), getString(R.string.photos_upload_ok_long)));
            com.vk.upload.impl.a.i(ev6Var);
            if (arrayList.size() >= 3) {
                hg1.e(this.d0, fsk.c.b(InAppReviewConditionKey.LOAD_3_MORE_PHOTOS, jgp.b).subscribe());
            }
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f5a0 f5a0Var = this.p0;
        C1(f5a0Var != null ? f5a0Var.g : null);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.o0 = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(VkTopBar.Middle.c.a);
        }
        bwt0.p0(view.findViewById(R.id.app_bar_shadow_view), false);
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        aq2Var.setUiStateCallbacks(this.q0);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, xsna.hj6
    public final void r0(int i) {
        super.r0(i);
        this.n0 = po().getItemCount() > 1;
        ko();
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    /* renamed from: ro */
    public final Object io() {
        return this.p0;
    }
}
