package com.vk.photos.legacy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.b0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.ToolbarFragment;
import xsna.anj;
import xsna.asu0;
import xsna.azo;
import xsna.bzo;
import xsna.c63;
import xsna.dhr0;
import xsna.ea;
import xsna.ei10;
import xsna.enj;
import xsna.fnj;
import xsna.ft9;
import xsna.iah0;
import xsna.isk;
import xsna.j6r0;
import xsna.jed0;
import xsna.jx2;
import xsna.le50;
import xsna.m33;
import xsna.mp0;
import xsna.n720;
import xsna.oz50;
import xsna.qea0;
import xsna.s6l;
import xsna.too0;
import xsna.u1u0;
import xsna.x93;

/* loaded from: classes16.dex */
public class EditAlbumFragment extends ToolbarFragment implements too0 {
    public static final /* synthetic */ int s0 = 0;
    public View b0;
    public PhotoAlbum c0;
    public VkInputSelect d0;
    public VkInputSelect e0;
    public TextView f0;
    public TextView g0;
    public View h0;
    public View i0;
    public View j0;
    public View k0;
    public CheckBox l0;
    public CheckBox m0;
    public UserId n0 = UserId.d;
    public final jed0 o0 = new jed0();
    public c p0 = null;
    public c q0 = null;
    public MenuItem r0;

    public static class b extends oz50 {
        public b() {
            super(EditAlbumFragment.class, null, null);
            TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
            aVar.b();
            Handler handler = x93.a;
            Activity b = c63.b();
            if (b != null) {
                HashSet hashSet = iah0.a;
                if (fnj.d(b)) {
                    this.i = aVar;
                }
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ro();
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.photo_album_edit, (ViewGroup) null);
        this.b0 = inflate;
        this.d0 = (VkInputSelect) inflate.findViewById(R.id.title);
        this.e0 = (VkInputSelect) this.b0.findViewById(R.id.description);
        this.f0 = (TextView) this.b0.findViewById(R.id.album_privacy_text);
        this.g0 = (TextView) this.b0.findViewById(R.id.album_privacy_comment_text);
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.f = Arrays.asList("all", "friends", "friends_of_friends", "only_me", "some");
        privacySetting.c = getString(R.string.create_album_privacy);
        PhotoAlbum photoAlbum = this.c0;
        privacySetting.e = photoAlbum != null ? photoAlbum.i : Arrays.asList(PrivacyRules.a);
        PrivacySetting privacySetting2 = new PrivacySetting();
        privacySetting2.f = Arrays.asList("all", "friends", "friends_of_friends", "only_me", "some");
        privacySetting2.c = getString(R.string.create_album_privacy_comments);
        PhotoAlbum photoAlbum2 = this.c0;
        privacySetting2.e = photoAlbum2 != null ? photoAlbum2.j : Arrays.asList(PrivacyRules.a);
        this.h0 = this.b0.findViewById(R.id.album_privacy);
        this.i0 = this.b0.findViewById(R.id.album_privacy_comment);
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            this.h0.setOnClickListener(new s6l(mo2getContext, 1));
            this.i0.setOnClickListener(new isk(mo2getContext, 1));
        }
        this.h0.setTag(privacySetting);
        this.i0.setTag(privacySetting2);
        this.j0 = this.b0.findViewById(R.id.photo_album_community_privacy_wrap);
        this.k0 = this.b0.findViewById(R.id.photo_album_community_privacy_comment_wrap);
        this.l0 = (CheckBox) this.b0.findViewById(R.id.photo_album_community_privacy);
        this.m0 = (CheckBox) this.b0.findViewById(R.id.photo_album_community_privacy_comment);
        if (this.n0.b < 0) {
            this.h0.setVisibility(8);
            this.i0.setVisibility(8);
        } else {
            this.j0.setVisibility(8);
            this.k0.setVisibility(8);
        }
        PhotoAlbum photoAlbum3 = this.c0;
        if (photoAlbum3 != null) {
            this.d0.setText(photoAlbum3.g);
            this.e0.setText(this.c0.h);
            qo(privacySetting);
            po(privacySetting2);
            this.l0.setChecked(this.c0.o);
            this.m0.setChecked(this.c0.p);
        }
        this.d0.b(new a());
        return this.b0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        PrivacySetting privacySetting;
        PrivacySetting privacySetting2;
        if (i == 8295 && i2 == -1 && (privacySetting2 = (PrivacySetting) intent.getParcelableExtra("setting")) != null) {
            qo(privacySetting2);
            this.h0.setTag(privacySetting2);
        }
        if (i == 8296 && i2 == -1 && (privacySetting = (PrivacySetting) intent.getParcelableExtra("setting")) != null) {
            po(privacySetting);
            this.i0.setTag(privacySetting);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.c0 = (PhotoAlbum) getArguments().getParcelable("album");
        this.n0 = getArguments().getParcelable("owner_id") == null ? UserId.d : (UserId) getArguments().getParcelable("owner_id");
        PhotoAlbum photoAlbum = this.c0;
        if (photoAlbum != null) {
            this.n0 = photoAlbum.c;
        }
        setTitle(photoAlbum != null ? R.string.edit_album : R.string.create_album);
        setHasOptionsMenu(true);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ko(configuration);
        ro();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(R.string.save);
        this.r0 = add;
        n720.b(add, anj.b(R.color.base_action_menu_text_color, getActivity()));
        this.r0.setIcon(enj.d(R.drawable.vk_icon_done_24, R.color.almost_black, getActivity()));
        this.r0.setShowAsAction(2);
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.a0.setScrollBarStyle(33554432);
        ko(getResources().getConfiguration());
        ro();
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ei10 ei10Var;
        qea0 qea0Var;
        PhotoAlbum photoAlbum = this.c0;
        if (photoAlbum == null) {
            if (this.n0.b >= 0) {
                qea0Var = new qea0(oo(), this.e0.getText().toString(), ((PrivacySetting) this.h0.getTag()).zb(), ((PrivacySetting) this.i0.getTag()).zb(), this.n0);
            } else {
                qea0Var = new qea0(this.n0, oo(), this.e0.getText().toString(), this.l0.isChecked(), this.m0.isChecked());
            }
            jx2 jx2Var = new jx2(qea0Var, new azo(this, getActivity()));
            jx2Var.g = getActivity();
            jx2Var.a();
            return true;
        }
        if (this.n0.b > 0) {
            int i = photoAlbum.b;
            ei10Var = new ei10(oo(), this.e0.getText().toString(), ((PrivacySetting) this.h0.getTag()).zb(), i, this.n0, ((PrivacySetting) this.i0.getTag()).zb());
        } else {
            ei10Var = new ei10(photoAlbum.b, oo(), this.e0.getText().toString(), this.l0.isChecked(), this.m0.isChecked(), this.n0);
        }
        jx2 jx2Var2 = new jx2(ei10Var, new bzo(this));
        jx2Var2.g = getActivity();
        jx2Var2.a();
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!getArguments().getBoolean("_split")) {
            u1u0.k(this.Q, R.drawable.vk_icon_cancel_24, R.string.accessibility_cancel);
        }
        this.r0.setEnabled(oo().trim().length() >= 2);
    }

    @NonNull
    public final String oo() {
        return this.d0.getText().toString().trim();
    }

    public final void po(PrivacySetting privacySetting) {
        c cVar = this.q0;
        if (cVar != null) {
            cVar.dispose();
        }
        jed0 jed0Var = this.o0;
        jed0Var.getClass();
        b0 m = jed0Var.b(privacySetting.e).m(asu0.a.d());
        ea eaVar = new ea(this, 28);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        this.q0 = m.subscribe(eaVar, new le50(bVar, 25));
    }

    public final void qo(PrivacySetting privacySetting) {
        c cVar = this.p0;
        if (cVar != null) {
            cVar.dispose();
        }
        jed0 jed0Var = this.o0;
        jed0Var.getClass();
        b0 m = jed0Var.b(privacySetting.e).m(asu0.a.d());
        mp0 mp0Var = new mp0(this, 21);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        this.p0 = m.subscribe(mp0Var, new le50(bVar, 25));
    }

    public final void ro() {
        int i;
        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) this.b0).getChildAt(0);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            int c = dhr0.t.c(R.attr.vk_ui_background_content);
            getResources();
            WeakHashMap weakHashMap = j6r0.a;
            ft9 ft9Var = new ft9(iah0.a(2.0f), c, !this.U);
            View childAt = linearLayout.getChildAt(i2);
            childAt.setBackground(ft9Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.topMargin = iah0.a(3.0f);
            marginLayoutParams.bottomMargin = iah0.a(2.0f);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.b0.findViewById(R.id.linear_layout);
        dhr0.a.getClass();
        linearLayout2.setDividerDrawable(m33.a(R.drawable.divider, dhr0.E()));
        linearLayout2.setShowDividers(2);
        if (this.V >= 924) {
            WeakHashMap weakHashMap2 = j6r0.a;
            i = iah0.a(32.0f);
        } else {
            i = 0;
        }
        linearLayout.setPadding(i, 0, i, 0);
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String charSequence2 = charSequence.toString();
            int i4 = EditAlbumFragment.s0;
            EditAlbumFragment.this.r0.setEnabled(charSequence2.trim().length() >= 2);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
