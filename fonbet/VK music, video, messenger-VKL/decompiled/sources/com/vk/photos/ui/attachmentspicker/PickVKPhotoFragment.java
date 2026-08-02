package com.vk.photos.ui.attachmentspicker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import com.vk.photos.legacy.PhotosOfMeFragment;
import com.vk.photos.legacy.YearSectionedPhotoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import me.grishka.appkit.fragments.AppKitFragment;
import xsna.bwt0;
import xsna.g3p0;
import xsna.gk;
import xsna.iin0;
import xsna.o25;
import xsna.u1u0;
import xsna.vbs;

/* loaded from: classes3.dex */
public class PickVKPhotoFragment extends AppKitFragment implements iin0 {
    public PhotoAlbumListFragment Z;
    public YearSectionedPhotoListFragment a0;
    public PhotosOfMeFragment b0;
    public ArrayList<CharSequence> c0;
    public int d0 = -1;
    public boolean e0 = false;

    public static String no(@NonNull Context context, @NonNull Photo photo, @Nullable String str, @NonNull StringBuilder sb, @NonNull gk gkVar) {
        sb.setLength(0);
        sb.append(context.getString(R.string.accessibility_photo));
        long j = photo.g * 1000;
        if (str != null) {
            sb.append(", ");
            sb.append(context.getString(R.string.accessibility_vk_photo_album_name, str));
        }
        if (j != 0) {
            sb.append(", ");
            sb.append(context.getString(R.string.accessibility_vk_photo_added, gkVar.a(j)));
        }
        return sb.toString();
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        return this.Q;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment
    public final void fo(int i) {
        Fragment fragment;
        if (this.e0 || i != this.d0) {
            if (i == 0) {
                if (this.a0 == null) {
                    Bundle bundle = new Bundle();
                    PhotoAlbum photoAlbum = new PhotoAlbum();
                    photoAlbum.g = getString(R.string.all_photos);
                    photoAlbum.b = -9002;
                    photoAlbum.c = o25.a().c();
                    this.a0 = new YearSectionedPhotoListFragment();
                    bundle.putParcelable("album", photoAlbum);
                    bundle.putBoolean("no_album_header", true);
                    bundle.putBoolean("select", true);
                    bundle.putBoolean("autoload", true);
                    bundle.putBoolean("__is_tab", true);
                    this.a0.setArguments(bundle);
                    this.a0.Ho(false);
                }
                fragment = this.a0;
            } else if (i == 1) {
                if (this.Z == null) {
                    Bundle bundle2 = new Bundle();
                    this.Z = new PhotoAlbumListFragment();
                    bundle2.putParcelable("uid", o25.a().c());
                    bundle2.putBoolean("no_title", true);
                    bundle2.putBoolean("need_system", true);
                    bundle2.putBoolean("select", true);
                    bundle2.putBoolean("__is_tab", true);
                    this.Z.setArguments(bundle2);
                    this.Z.Ho(false);
                    this.Z.qo();
                }
                fragment = this.Z;
            } else if (i != 2) {
                fragment = null;
            } else {
                if (this.b0 == null) {
                    PhotoAlbum photoAlbum2 = new PhotoAlbum();
                    photoAlbum2.g = getString(R.string.user_photos_title_me);
                    photoAlbum2.b = -9000;
                    photoAlbum2.c = o25.a().c();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("album", photoAlbum2);
                    bundle3.putBoolean("no_album_header", true);
                    bundle3.putBoolean("select", true);
                    bundle3.putBoolean("__is_tab", true);
                    PhotosOfMeFragment photosOfMeFragment = new PhotosOfMeFragment();
                    this.b0 = photosOfMeFragment;
                    photosOfMeFragment.setArguments(bundle3);
                    this.b0.Ho(false);
                    this.b0.qo();
                }
                fragment = this.b0;
            }
            if (fragment != null) {
                vbs vbsVar = In().q().a;
                vbsVar.c();
                a aVar = vbsVar.f;
                if (aVar != null) {
                    aVar.g(R.id.appkit_content, fragment, "INNER_PHOTO_FRAGMENT");
                }
                vbsVar.d();
            }
            this.d0 = i;
            this.e0 = false;
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        L.A("PickVKPhotoFragment", "onAttach");
        super.onAttach(context);
        ArrayList<CharSequence> arrayList = new ArrayList<>(3);
        this.c0 = arrayList;
        arrayList.add(getString(R.string.all_photos_short));
        this.c0.add(getString(R.string.albums));
        this.c0.add(getString(R.string.photos_of_me));
        this.X = R.layout.spinner_view_light;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        L.A("PickVKPhotoFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.appkit_toolbar_fragment, (ViewGroup) null);
        bwt0.Z(R.attr.vk_ui_background_content, inflate);
        return inflate;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentImpl b = In().b("INNER_PHOTO_FRAGMENT");
        if (b != null && !getActivity().isFinishing()) {
            In().q().b(b);
        }
        this.e0 = true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            bwt0.Z(R.attr.vk_ui_background_modal, toolbar);
            g3p0.c(toolbar);
            toolbar.setVisibility(8);
        }
        View findViewById = view.findViewById(R.id.appkit_content);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        findViewById.setLayoutParams(marginLayoutParams);
        ArrayList<CharSequence> arrayList = this.c0;
        if (arrayList == null) {
            io(null);
        } else {
            AppKitFragment.b bVar = new AppKitFragment.b(getActivity(), this.X, android.R.id.text1);
            bVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            bVar.addAll(arrayList);
            bVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            io(bVar);
        }
        int i = this.d0;
        if (i >= 0) {
            this.T.setSelection(i);
        } else {
            fo(0);
        }
        u1u0.l(this.Q, null);
    }
}
