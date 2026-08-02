package com.vk.photos.legacy;

import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.TaggedPhoto;
import com.vk.dto.user.UserProfile;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.photos.legacy.SectionedPhotoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.a920;
import xsna.e43;
import xsna.myc0;
import xsna.o25;
import xsna.pdv0;
import xsna.vtk0;

/* loaded from: classes16.dex */
public class PhotosOfMeFragment extends SectionedPhotoListFragment {
    public final SectionedPhotoListFragment.a U0;
    public final SectionedPhotoListFragment.a V0;
    public final ArrayList<TaggedPhoto> W0 = new ArrayList<>();
    public final HashMap X0 = new HashMap();

    public class a extends PhotoListFragment.k {
        public a() {
            super();
        }

        @Override // com.vk.photos.legacy.PhotoListFragment.k, com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        @Nullable
        public final View c(int i) {
            return super.c(PhotosOfMeFragment.this.W0.size() + i);
        }
    }

    public PhotosOfMeFragment() {
        SectionedPhotoListFragment.a aVar = new SectionedPhotoListFragment.a();
        this.U0 = aVar;
        String string = e43.a.getString(R.string.new_tags);
        aVar.a = string;
        aVar.b = new SectionedPhotoListFragment.b(string);
        aVar.d = 0;
        aVar.c = new PhotoListFragment.l(0, 0);
        SectionedPhotoListFragment.a aVar2 = new SectionedPhotoListFragment.a();
        this.V0 = aVar2;
        String string2 = e43.a.getString(R.string.user_photos_title_me);
        aVar2.a = string2;
        aVar2.b = new SectionedPhotoListFragment.b(string2);
        aVar2.d = 0;
        aVar2.c = new PhotoListFragment.l(0, Integer.MAX_VALUE);
        this.T0.add(aVar);
        this.T0.add(aVar2);
    }

    @Override // com.vk.photos.legacy.PhotoListFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void A3(List<Photo> list) {
        super.A3(list);
        this.J0.P0();
        if (this.M0) {
            this.J0.K0(new PhotoListFragment.i());
        }
        int size = this.W0.size();
        SectionedPhotoListFragment.a aVar = this.V0;
        if (size > 0) {
            a920 a920Var = this.J0;
            SectionedPhotoListFragment.a aVar2 = this.U0;
            a920Var.K0(aVar2.b);
            this.J0.K0(aVar2.c);
            this.J0.K0(aVar.b);
        }
        this.J0.K0(aVar.c);
    }

    @Override // com.vk.photos.legacy.PhotoListFragment
    @NonNull
    public final PhotoListFragment.k Io() {
        return new a();
    }

    @Override // com.vk.photos.legacy.PhotoListFragment
    public final void Mo() {
        Do();
    }

    @Override // com.vk.photos.legacy.PhotoListFragment
    public final void No(Photo photo) {
        Intent intent;
        if (getArguments().getBoolean("select")) {
            Intent putExtra = new Intent().putExtra("photo", photo);
            FragmentActivity activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                UserId userId = (UserId) intent.getParcelableExtra("owner_id");
                int intExtra = intent.getIntExtra("post_id", 0);
                putExtra.putExtra("owner_id", userId);
                putExtra.putExtra("post_id", intExtra);
            }
            Mf(-1, putExtra);
            return;
        }
        if (!(photo instanceof TaggedPhoto)) {
            ArrayList<TaggedPhoto> arrayList = this.W0;
            int size = arrayList.size();
            ArrayList<T> arrayList2 = this.v0;
            this.N0 = myc0.d().g(arrayList2.indexOf(photo) - arrayList.size(), arrayList2.subList(size, arrayList2.size()), requireContext(), new a(), o25.a().c());
            return;
        }
        TaggedPhoto taggedPhoto = (TaggedPhoto) photo;
        UserProfile userProfile = photo.B;
        HashMap hashMap = this.X0;
        if (userProfile == null) {
            photo.B = (UserProfile) hashMap.get(photo.f);
        }
        pdv0.a b = vtk0.c().b(photo);
        b.I((UserProfile) hashMap.get(taggedPhoto.T));
        b.A(taggedPhoto.S);
        b.k(getActivity());
    }

    @Override // com.vk.photos.legacy.PhotoListFragment, me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
    }
}
