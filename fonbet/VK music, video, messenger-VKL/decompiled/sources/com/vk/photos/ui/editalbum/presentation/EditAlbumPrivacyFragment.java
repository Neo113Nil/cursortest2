package com.vk.photos.ui.editalbum.presentation;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.privacyui.PrivacyEditFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ab6;
import xsna.bwt0;
import xsna.dxh;
import xsna.e10;
import xsna.epx;
import xsna.gzs;
import xsna.iah0;
import xsna.jno0;
import xsna.jzo0;
import xsna.pfd0;
import xsna.qyc0;
import xsna.r3j0;
import xsna.s6x;
import xsna.vif0;

/* compiled from: EditAlbumPrivacyFragment.kt */
/* loaded from: classes3.dex */
public final class EditAlbumPrivacyFragment extends PrivacyEditFragment {
    public static final /* synthetic */ int X0 = 0;

    /* compiled from: EditAlbumPrivacyFragment.kt */
    public static final class a extends PrivacyEditFragment.a {
        public a() {
            super(EditAlbumPrivacyFragment.class, null, null);
        }
    }

    /* compiled from: EditAlbumPrivacyFragment.kt */
    public static final class b extends vif0<Integer> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(Integer num) {
        }
    }

    @Override // com.vk.privacyui.PrivacyEditFragment
    public final View[] Ko() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.item_photo_flow_privacy_header, (ViewGroup) null, false);
        ((TextView) inflate).setText(this.J0.c);
        return new View[]{inflate};
    }

    @Override // com.vk.privacyui.PrivacyEditFragment
    public final vif0 Lo(int i, ViewGroup viewGroup) {
        return i != 20 ? i != 21 ? new qyc0(new VkCell(requireContext(), null, 6, 0), viewGroup, this) : new b(new View(requireContext())) : new b(new View(requireContext()));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Mf(int i, Intent intent) {
        if (getParentFragment() == null) {
            super.Mf(i, intent);
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            parentFragment.onActivityResult(requireArguments().getInt("REQUEST_CODE"), i, intent);
        }
    }

    @Override // com.vk.privacyui.PrivacyEditFragment
    public final vif0 Mo(ViewGroup viewGroup, int i, ArrayList arrayList, gzs gzsVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProfile userProfile = (UserProfile) it.next();
            if (userProfile.c.b > 2000000000 && epx.f(userProfile.h, "http://vkontakte.ru/images/question_c.gif")) {
                userProfile.h = null;
            }
        }
        switch (i) {
            case 10:
                jzo0 jzo0Var = new jzo0(R.layout.title_holder_redesign, viewGroup);
                int a2 = iah0.a(44);
                TextView textView = jzo0Var.n;
                textView.setMinHeight(a2);
                jno0.c(textView, R.attr.vk_ui_text_secondary);
                return jzo0Var;
            case 11:
                return new b(new View(requireContext()));
            case 12:
            case 14:
                return new r3j0(viewGroup.getContext());
            case 13:
            default:
                Context context = viewGroup.getContext();
                VKCircleImageView vKCircleImageView = new VKCircleImageView(viewGroup.getContext());
                vKCircleImageView.setPlaceholderImage(R.drawable.vk_icon_users_circle_fill_yellow_28);
                return new pfd0(vKCircleImageView, context, new s6x(24), new ab6(arrayList, gzsVar, this, 4));
        }
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Qo();
        return true;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        View inflate = View.inflate(requireContext(), R.layout.fragment_modal_privacy, null);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_content_holder);
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) inflate.findViewById(R.id.new_toolbar);
        photoFlowToolbarView.Q4(R.drawable.vk_icon_arrow_left_outline_28, R.string.accessibility_close);
        photoFlowToolbarView.setTitle(R.string.privacy_toolbar);
        photoFlowToolbarView.P4(new e10(this, 24));
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null && (findViewById = onCreateView.findViewById(R.id.shadow)) != null) {
            findViewById.setVisibility(8);
        }
        frameLayout.addView(onCreateView, 0);
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        super.onStop();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
        bwt0.i0(view.findViewById(R.id.touch_outside), new dxh(this, 8));
    }
}
