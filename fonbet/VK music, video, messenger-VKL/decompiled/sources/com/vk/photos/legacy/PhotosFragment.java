package com.vk.photos.legacy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.photos.legacy.PhotosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKTabbedFragment;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import me.grishka.appkit.fragments.TabbedFragment;
import xsna.ez5;
import xsna.g620;
import xsna.h3p0;
import xsna.h5s;
import xsna.hx2;
import xsna.ifa0;
import xsna.iin0;
import xsna.j2r0;
import xsna.jx2;
import xsna.le50;
import xsna.o25;
import xsna.p0e0;
import xsna.r1r0;
import xsna.rsg0;
import xsna.rwi;
import xsna.u1r0;
import xsna.yfb;

/* loaded from: classes16.dex */
public class PhotosFragment extends VKTabbedFragment implements iin0 {
    public PhotoAlbumListFragment d0;
    public YearSectionedPhotoListFragment e0;
    public PhotoListFragment f0;
    public UserId c0 = UserId.d;
    public int g0 = -1;
    public c h0 = null;
    public final u1r0 i0 = new u1r0();
    public final j2r0 j0 = new j2r0();

    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean Ci() {
        return !(getActivity() != null ? rwi.d().p().d(this) : false) && h3p0.a(this);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        return this.Q;
    }

    @Override // com.vkontakte.android.fragments.VKTabbedFragment, me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean ea() {
        return !(getActivity() != null ? rwi.d().p().d(this) : false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        UserId userId = (UserId) getArguments().getParcelable("uid");
        this.c0 = userId;
        if (userId == null) {
            this.c0 = o25.a().c();
        }
        p0e0.b(this.c0, "photos_group");
        if (getArguments().containsKey("title")) {
            setTitle(getArguments().getCharSequence("title"));
        } else {
            setTitle(getString(R.string.photos));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = new Bundle();
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.g = getString(R.string.all_photos);
        photoAlbum.b = -9002;
        photoAlbum.c = this.c0;
        this.e0 = new YearSectionedPhotoListFragment();
        bundle.putParcelable("album", photoAlbum);
        bundle.putBoolean("no_album_header", true);
        bundle.putBoolean("autoload", true);
        bundle.putBoolean("select", getArguments().getBoolean("select"));
        this.e0.setArguments(bundle);
        arrayList.add(this.e0);
        arrayList2.add(getString(R.string.all_photos_short));
        Bundle bundle2 = new Bundle();
        this.d0 = new PhotoAlbumListFragment();
        bundle2.putParcelable("uid", this.c0);
        bundle2.putBoolean("no_title", true);
        bundle2.putBoolean("need_system", true);
        bundle2.putBoolean("select", getArguments().getBoolean("select"));
        this.d0.setArguments(bundle2);
        arrayList.add(this.d0);
        arrayList2.add(getString(R.string.albums));
        boolean a2 = o25.a().a(this.c0);
        if (!a2 && !getArguments().containsKey("can_view_user_photos")) {
            UserId userId2 = this.c0;
            if (userId2.b > 0) {
                new jx2(new ifa0(0, 0, userId2, true), new a(arrayList, arrayList2)).a();
            }
        } else if (a2 || getArguments().getBoolean("can_view_user_photos")) {
            PhotoAlbum photoAlbum2 = new PhotoAlbum();
            photoAlbum2.g = a2 ? getString(R.string.user_photos_title_me) : getString(R.string.user_photos_title, getArguments().getString("user_name_ins"));
            photoAlbum2.b = -9000;
            photoAlbum2.c = this.c0;
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("album", photoAlbum2);
            bundle3.putBoolean("no_album_header", true);
            bundle3.putBoolean("select", getArguments().getBoolean("select"));
            PhotoListFragment photosOfMeFragment = a2 ? new PhotosOfMeFragment() : new PhotoListFragment();
            this.f0 = photosOfMeFragment;
            photosOfMeFragment.setArguments(bundle3);
            arrayList.add(this.f0);
            arrayList2.add(oo());
            this.g0 = arrayList2.size() - 1;
        }
        this.b0.o(arrayList, arrayList2);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.h0;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        TabLayout.g b;
        super.onResume();
        int i = this.g0;
        if (i >= 0) {
            try {
                CharSequence oo = oo();
                TabbedFragment.a aVar = this.b0;
                aVar.e.set(i, oo);
                try {
                    TabLayout tabLayout = aVar.b;
                    if (tabLayout == null || (b = tabLayout.b(i)) == null) {
                        return;
                    }
                    b.q(oo);
                } catch (Exception e) {
                    L.i(e);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.vkontakte.android.fragments.VKTabbedFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() != null ? rwi.d().p().d(this) : false) {
            this.Q.setVisibility(8);
            view.setBackgroundColor(-1);
            this.e0.Ho(false);
            this.f0.Ho(false);
            this.d0.Ho(false);
            TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
            tabLayout.setBackgroundColor(-1);
            tabLayout.setTabTextColors(TabLayout.n(Color.parseColor("#B9CDE3"), getResources().getColor(R.color.vk_blue_400)));
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.vk_blue_400));
        }
    }

    public final CharSequence oo() {
        if (!o25.a().a(this.c0)) {
            return getString(R.string.photos_of_user, getArguments().getString("user_name_ins"));
        }
        if (g620.h <= 0) {
            return getString(R.string.photos_of_me);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.photos_of_me));
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(h5s.c(g620.h, "", new StringBuilder()));
        ez5 ez5Var = new ez5();
        ez5Var.b = new Paint(1);
        ez5Var.c = new RectF();
        spannableString.setSpan(ez5Var, 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public class a implements hx2<VKList<Photo>> {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ ArrayList c;

        public a(ArrayList arrayList, ArrayList arrayList2) {
            this.b = arrayList;
            this.c = arrayList2;
        }

        @Override // xsna.hx2
        public final void b(VKList<Photo> vKList) {
            if (vKList.i() > 0) {
                PhotosFragment photosFragment = PhotosFragment.this;
                c cVar = photosFragment.h0;
                if (cVar != null) {
                    cVar.dispose();
                }
                u1r0 u1r0Var = photosFragment.i0;
                List singletonList = Collections.singletonList(photosFragment.c0);
                Object[] objArr = {UsersFieldsDto.PHOTO_BASE};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                u1r0Var.getClass();
                f0 W = rsg0.W(yfb.x(r1r0.a.a(singletonList, null, unmodifiableList, "ins", null)), 7);
                final ArrayList arrayList2 = this.b;
                final ArrayList arrayList3 = this.c;
                f fVar = new f() { // from class: xsna.uea0
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj2) {
                        PhotosFragment photosFragment2 = PhotosFragment.this;
                        ArrayList arrayList4 = new ArrayList();
                        for (UsersUserFullDto usersUserFullDto : (List) obj2) {
                            photosFragment2.j0.getClass();
                            arrayList4.add(j2r0.a(usersUserFullDto));
                        }
                        PhotoAlbum photoAlbum = new PhotoAlbum();
                        photoAlbum.g = photosFragment2.getString(R.string.user_photos_title, ((UserProfile) arrayList4.get(0)).d);
                        photoAlbum.b = -9000;
                        photoAlbum.c = photosFragment2.c0;
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("album", photoAlbum);
                        bundle.putBoolean("no_album_header", true);
                        PhotoListFragment photoListFragment = new PhotoListFragment();
                        photosFragment2.f0 = photoListFragment;
                        photoListFragment.setArguments(bundle);
                        PhotoListFragment photoListFragment2 = photosFragment2.f0;
                        ArrayList arrayList5 = arrayList2;
                        arrayList5.add(photoListFragment2);
                        String string = photosFragment2.getString(R.string.photos_of_user, ((UserProfile) arrayList4.get(0)).d);
                        ArrayList arrayList6 = arrayList3;
                        arrayList6.add(string);
                        photosFragment2.b0.o(arrayList5, arrayList6);
                    }
                };
                b bVar = b.a;
                Objects.requireNonNull(bVar);
                photosFragment.h0 = W.subscribe(fVar, new le50(bVar, 25));
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
        }
    }
}
