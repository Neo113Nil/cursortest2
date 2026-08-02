package com.vk.clips.favorites.impl.ui.folders.renaming;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.ao50;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.enj;
import xsna.fm0;
import xsna.fpf0;
import xsna.g20;
import xsna.g4e;
import xsna.gm50;
import xsna.jgz;
import xsna.jm0;
import xsna.km50;
import xsna.m0q0;
import xsna.mk50;
import xsna.msy;
import xsna.na;
import xsna.ra0;
import xsna.sa;
import xsna.t5e;
import xsna.tho0;
import xsna.tl50;
import xsna.tzp0;
import xsna.vk50;
import xsna.wd8;
import xsna.wds;
import xsna.yfb;

/* compiled from: ClipsFavoritesFolderRenamingDialog.kt */
/* loaded from: classes16.dex */
public final class b extends tl50<c, f, com.vk.clips.favorites.impl.ui.folders.renaming.a> implements wds {
    public static final String m1 = fpf0.a(b.class).l();
    public final Object i1;
    public final Object j1;
    public g4e k1;
    public C0616b l1;

    /* compiled from: ClipsFavoritesFolderRenamingDialog.kt */
    public static final class a extends dw20.b {
        public static final tzp0.c.a f = new tzp0.c.a(new C0615a(), false);
        public final ClipsFavoritesFolderRenamingParams e;

        /* compiled from: ClipsFavoritesFolderRenamingDialog.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.b$a$a, reason: collision with other inner class name */
        public static final class C0615a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDER_RENAMING_DIALOG;
            }
        }

        public a(Context context, ClipsFavoritesFolderRenamingParams clipsFavoritesFolderRenamingParams) {
            super(context, f);
            this.e = clipsFavoritesFolderRenamingParams;
            K0(21);
            N0();
            int a = e3m.a(R.dimen.clips_favorite_folder_renaming_dialog_padding, context);
            v0(R.string.clips_favorites_folder_renaming_title);
            n0(a);
            o0(a);
            m0(a);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("params", this.e);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* compiled from: ClipsFavoritesFolderRenamingDialog.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.b$b, reason: collision with other inner class name */
    public static final class C0616b {
        public final ClipsFolderNameFormField a;
        public final VkButton b;
        public final FrameLayout c;

        public C0616b(ClipsFolderNameFormField clipsFolderNameFormField, VkButton vkButton, FrameLayout frameLayout) {
            this.a = clipsFolderNameFormField;
            this.b = vkButton;
            this.c = frameLayout;
        }
    }

    public b() {
        na naVar = new na(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, naVar);
        this.j1 = msy.a(lazyThreadSafetyMode, new ra0(this, 25));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.clips_favorites_folder_renaming_dialog, (ViewGroup) null, false);
        ClipsFolderNameFormField clipsFolderNameFormField = (ClipsFolderNameFormField) inflate.findViewById(R.id.clips_favorites_folder_renaming_field);
        clipsFolderNameFormField.setOnUpdateAction(new jm0(this, 13));
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.clips_favorites_folder_renaming_save);
        bwt0.i0(vkButton, new sa(this, 26));
        this.l1 = new C0616b(clipsFolderNameFormField, vkButton, (FrameLayout) inflate.findViewById(R.id.clips_favorites_folder_renaming_spinner_container));
        inflate.setBackground(enj.c(R.drawable.vk_bg_radius_12, e3m.f(R.attr.vk_ui_background_content, requireContext()), requireContext()));
        Context requireContext = requireContext();
        this.k1 = new g4e(requireContext, this, dhr0.a.c(requireContext));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0616b c0616b = this.l1;
        if (c0616b == null) {
            c0616b = null;
        }
        FrameLayout frameLayout = c0616b.c;
        g4e g4eVar = this.k1;
        frameLayout.addView((g4eVar != null ? g4eVar : null).d, layoutParams);
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        f fVar = (f) ao50Var;
        C0616b c0616b = this.l1;
        if (c0616b == null) {
            c0616b = null;
        }
        ClipsFavoritesFolderRenamingParams clipsFavoritesFolderRenamingParams = (ClipsFavoritesFolderRenamingParams) this.j1.getValue();
        ClipsFavoritesFolderRenamingParams.RenameFolder renameFolder = clipsFavoritesFolderRenamingParams instanceof ClipsFavoritesFolderRenamingParams.RenameFolder ? (ClipsFavoritesFolderRenamingParams.RenameFolder) clipsFavoritesFolderRenamingParams : null;
        String str = renameFolder != null ? renameFolder.e : "";
        c0616b.a.setFolderName(new tho0(str, jgz.c(0, str.length()), 4));
        g4e g4eVar = this.k1;
        (g4eVar != null ? g4eVar : null).f(fVar, new wd8(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3));
        gm50.a.b(this, fVar.a, new g20(this, 27));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((c) vk50Var).h.a(new fm0(this, 20), this);
    }

    @Override // xsna.wds
    public final boolean e9(t5e t5eVar) {
        return (t5eVar instanceof t5e.l) || (t5eVar instanceof t5e.p);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!((ClipsFavoritesFolderRenamingParams) this.j1.getValue()).J0()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return bwt0.u(mo2getContext);
        }
        return null;
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getParentFragmentManager().k0(yfb.b(new Pair("result", 0)), "result");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new c(new e(), (ClipsFavoritesFolderRenamingParams) this.j1.getValue(), ((ClipsFavoritesComponentImpl) this.i1.getValue()).b());
    }
}
