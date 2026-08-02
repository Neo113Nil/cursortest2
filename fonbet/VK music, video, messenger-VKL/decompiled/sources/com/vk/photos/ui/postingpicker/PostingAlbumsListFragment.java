package com.vk.photos.ui.postingpicker;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.photos.ui.postingpicker.PostingPhotoAlbumFragment;
import xsna.s200;
import xsna.ww50;

/* compiled from: PostingAlbumsListFragment.kt */
/* loaded from: classes3.dex */
public final class PostingAlbumsListFragment extends AlbumsListFragment {

    /* compiled from: PostingAlbumsListFragment.kt */
    public static final class a extends AlbumsListFragment.a {
    }

    @Override // com.vk.photos.ui.album_list.AlbumsListFragment
    public final void jo(PhotoAlbum photoAlbum) {
        ww50 v;
        FragmentImpl u;
        FragmentActivity activity = getActivity();
        if (activity == null || (v = s200.v(activity)) == null || (u = v.u()) == null) {
            return;
        }
        new PostingPhotoAlbumFragment.a(this.W.d, photoAlbum).g(44, u);
    }

    @Override // com.vk.photos.ui.album_list.AlbumsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 44 && i2 == -1 && intent != null && intent.hasExtra("photo_vk_attach")) {
            Mf(-1, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }
}
