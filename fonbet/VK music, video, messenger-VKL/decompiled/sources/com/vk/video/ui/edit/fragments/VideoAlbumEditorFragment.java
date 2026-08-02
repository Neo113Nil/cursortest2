package com.vk.video.ui.edit.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.AppKitFragment;
import xsna.ape0;
import xsna.asu0;
import xsna.bt8;
import xsna.dhr0;
import xsna.epx;
import xsna.fnj;
import xsna.fxc0;
import xsna.gko;
import xsna.hwi0;
import xsna.i3b;
import xsna.iah0;
import xsna.icn0;
import xsna.ies;
import xsna.izs;
import xsna.j6l0;
import xsna.j6r0;
import xsna.jed0;
import xsna.kjs;
import xsna.ltl0;
import xsna.o25;
import xsna.oz50;
import xsna.qz50;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.wmz;
import xsna.xsj0;
import xsna.xvl0;
import xsna.zed0;

/* compiled from: VideoAlbumEditorFragment.kt */
/* loaded from: classes7.dex */
public final class VideoAlbumEditorFragment extends AppKitFragment implements too0, ies {
    public static final /* synthetic */ int l0 = 0;
    public VkInputSelect b0;
    public VkText c0;
    public VkText d0;
    public boolean e0;
    public VideoAlbum f0;
    public com.vk.dto.common.VideoAlbum g0;
    public VkTopBar i0;
    public View j0;
    public io.reactivex.rxjava3.disposables.c k0;
    public final jed0 Z = new jed0();
    public PrivacySetting a0 = new PrivacySetting();
    public UserId h0 = UserId.d;

    /* compiled from: VideoAlbumEditorFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(VideoAlbumEditorFragment.class, null, null);
            TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
            aVar.b();
            Bundle bundle = aVar.b;
            bundle.putInt("input_mode", 16);
            WeakHashMap weakHashMap = j6r0.a;
            bundle.putInt("max_width", iah0.a(720.0f));
            bundle.putInt("preferred_height", iah0.a(350.0f));
            bundle.putInt("min_spacing", iah0.a(32.0f));
            bundle.putInt("window_background_color", dhr0.t.c(R.attr.vk_ui_background));
            qz50.a(this, aVar);
        }

        public final void y(boolean z) {
            this.j.putBoolean("should_notify_video_bus", z);
        }
    }

    /* compiled from: VideoAlbumEditorFragment.kt */
    public static final class b {
        public static a a(UserId userId) {
            a aVar = new a();
            aVar.j.putParcelable("oid", userId);
            return aVar;
        }

        public static a b(VideoAlbum videoAlbum) {
            a aVar = new a();
            Bundle bundle = aVar.j;
            bundle.putParcelable("catalog_album", videoAlbum);
            bundle.putParcelable("oid", videoAlbum.c);
            return aVar;
        }
    }

    /* compiled from: VideoAlbumEditorFragment.kt */
    public static final class c extends xsj0 {
        public c() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = epx.g(obj.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            final boolean z3 = obj.subSequence(i, length + 1).toString().length() > 0;
            final VideoAlbumEditorFragment videoAlbumEditorFragment = VideoAlbumEditorFragment.this;
            if (z3 != videoAlbumEditorFragment.e0) {
                videoAlbumEditorFragment.e0 = z3;
                i3b i3bVar = z3 ? new i3b(videoAlbumEditorFragment, 5) : null;
                VkTopBar vkTopBar = videoAlbumEditorFragment.i0;
                if (vkTopBar != null) {
                    VkTopBar.a after = vkTopBar.getAfter();
                    VkTopBar.a.c b = after != null ? after.b() : null;
                    VkTopBar.a.c.f fVar = b instanceof VkTopBar.a.c.f ? (VkTopBar.a.c.f) b : null;
                    if (fVar != null) {
                        VkTopBar.a after2 = vkTopBar.getAfter();
                        vkTopBar.setAfter(after2 != null ? after2.a(VkTopBar.a.c.f.a(fVar, null, null, i3bVar, com.vk.core.compose.component.semantics.b.a(null, new izs() { // from class: xsna.y0s0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                tgi0 tgi0Var = (tgi0) obj2;
                                int i2 = VideoAlbumEditorFragment.l0;
                                qgi0.h(tgi0Var, VideoAlbumEditorFragment.this.getString(R.string.accessibility_done));
                                qgi0.r(tgi0Var, "edit_done_button");
                                final boolean z4 = z3;
                                qgi0.e(tgi0Var, null, new gzs() { // from class: xsna.x0s0
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        int i3 = VideoAlbumEditorFragment.l0;
                                        return Boolean.valueOf(z4);
                                    }
                                });
                                return s3q0.a;
                            }
                        }, 3), 27)) : null);
                    }
                }
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        VkInputSelect vkInputSelect = this.b0;
        if (vkInputSelect != null) {
            vkInputSelect.setBackground(dhr0.a.F(R.drawable.vkui_bg_edittext));
        }
        VkInputSelect vkInputSelect2 = this.b0;
        if (vkInputSelect2 != null) {
            vkInputSelect2.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, B()));
        }
    }

    public final void no(PrivacySetting privacySetting) {
        io.reactivex.rxjava3.disposables.c cVar = this.k0;
        if (cVar != null) {
            cVar.dispose();
        }
        jed0 jed0Var = this.Z;
        jed0Var.getClass();
        this.k0 = jed0Var.b(privacySetting.e).m(asu0.a.d()).subscribe(new wmz(new ape0(this, 24), 28), new kjs(new hwi0(13), 26));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 103 && i2 == -1) {
            PrivacySetting privacySetting = intent != null ? (PrivacySetting) intent.getParcelableExtra("setting") : null;
            if (privacySetting != null) {
                this.a0 = privacySetting;
                no(privacySetting);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.g0 = (com.vk.dto.common.VideoAlbum) requireArguments().getParcelable("album");
            this.h0 = (UserId) requireArguments().getParcelable("oid");
            this.f0 = (VideoAlbum) requireArguments().getParcelable("catalog_album");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.video_album_edit, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.k0;
        if (cVar == null || cVar == null) {
            return;
        }
        cVar.dispose();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VkInputSelect vkInputSelect;
        List list;
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(requireContext);
        boolean x0 = fxc0.B().J().x0();
        if (d && x0) {
            int a2 = iah0.a(16);
            view.setPadding(a2, view.getPaddingTop(), a2, view.getPaddingBottom());
        }
        this.i0 = (VkTopBar) view.findViewById(R.id.vae_vk_top_bar);
        this.b0 = (VkInputSelect) view.findViewById(R.id.title);
        this.c0 = (VkText) view.findViewById(R.id.privacy_title);
        this.d0 = (VkText) view.findViewById(R.id.privacy_subtitle);
        this.j0 = view.findViewById(R.id.privacy);
        ((VkImage) view.findViewById(R.id.chevron)).setImageResource(R.drawable.vk_icon_chevron_compact_right_24);
        VkText vkText = (VkText) view.findViewById(R.id.privacy_container_title);
        View findViewById = view.findViewById(R.id.divider);
        int i = (this.g0 == null && this.f0 == null) ? R.string.videoalbum_toolbar_new_playlist : R.string.videoalbum_toolbar_edit_playlist;
        VkTopBar vkTopBar = this.i0;
        if (vkTopBar != null) {
            vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), new icn0(this, 5), null, com.vk.core.compose.component.semantics.b.a(null, new j6l0(this, 17), 3), 4));
        }
        VkTopBar vkTopBar2 = this.i0;
        if (vkTopBar2 != null) {
            vkTopBar2.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, i), null, null, null, null, 30), null, false ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new ltl0(7), 3), 6));
        }
        VkTopBar vkTopBar3 = this.i0;
        int i2 = 6;
        if (vkTopBar3 != null) {
            vkTopBar3.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_24), tq.h(tlo0.Companion, R.string.accessibility_done), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new xvl0(this, 12), 3), 28), null, 6));
        }
        VkTopBar vkTopBar4 = this.i0;
        if (vkTopBar4 != null) {
            jo(vkTopBar4);
        }
        VkInputSelect vkInputSelect2 = this.b0;
        if (vkInputSelect2 != null) {
            vkInputSelect2.b(new c());
        }
        View view2 = this.j0;
        if (view2 != null) {
            view2.setOnClickListener(new bt8(this, i2));
        }
        UserId userId = this.h0;
        if (userId != null && userId.b < 0) {
            vkText.setVisibility(8);
            findViewById.setVisibility(8);
            View view3 = this.j0;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        com.vk.dto.common.VideoAlbum videoAlbum = this.g0;
        if (videoAlbum != null) {
            VkInputSelect vkInputSelect3 = this.b0;
            if (vkInputSelect3 != null) {
                vkInputSelect3.setText(videoAlbum.c);
                vkInputSelect3.setSelection(vkInputSelect3.g.length());
            }
        } else {
            VideoAlbum videoAlbum2 = this.f0;
            if (videoAlbum2 != null && (vkInputSelect = this.b0) != null) {
                vkInputSelect.setText(videoAlbum2.d);
                vkInputSelect.setSelection(vkInputSelect.g.length());
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!o25.a().d()) {
            arrayList.add("all");
        }
        arrayList.add("friends");
        arrayList.add("friends_of_friends");
        arrayList.add("only_me");
        arrayList.add("some");
        PrivacySetting privacySetting = this.a0;
        privacySetting.f = arrayList;
        privacySetting.c = getString(R.string.create_video_playlist_privacy);
        PrivacySetting privacySetting2 = this.a0;
        com.vk.dto.common.VideoAlbum videoAlbum3 = this.g0;
        if (videoAlbum3 != null) {
            list = videoAlbum3.i;
        } else {
            VideoAlbum videoAlbum4 = this.f0;
            list = videoAlbum4 != null ? videoAlbum4.j : Collections.singletonList(PrivacyRules.a);
        }
        privacySetting2.e = list;
        VkText vkText2 = this.c0;
        if (vkText2 != null) {
            vkText2.setText(R.string.create_video_playlist_privacy);
        }
        PrivacySetting privacySetting3 = this.a0;
        privacySetting3.e = zed0.a(privacySetting3.e);
        this.a0 = privacySetting3;
        no(privacySetting3);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = (this.g0 == null && this.f0 == null) ? MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CREATE_VIDEO_ALBUM : MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_EDIT_VIDEO_ALBUM;
    }
}
