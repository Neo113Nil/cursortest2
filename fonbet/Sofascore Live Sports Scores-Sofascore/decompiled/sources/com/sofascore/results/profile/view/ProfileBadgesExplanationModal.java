package com.sofascore.results.profile.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.aba;
import defpackage.as9;
import defpackage.ate;
import defpackage.cne;
import defpackage.e92;
import defpackage.gz8;
import defpackage.ia0;
import defpackage.nq8;
import defpackage.ok3;
import defpackage.u9f;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/view/ProfileBadgesExplanationModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileBadgesExplanationModal extends BaseModalBottomSheetDialog {
    public e92 w;
    public final boolean x = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.user_profile_badge_modal_layout, (ViewGroup) v().l, false);
        int i = R.id.badge_description;
        TextView textView = (TextView) nq8.B(R.id.badge_description, inflate);
        if (textView != null) {
            i = R.id.become_an_editor_text;
            TextView textView2 = (TextView) nq8.B(R.id.become_an_editor_text, inflate);
            if (textView2 != null) {
                i = R.id.got_it_button;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.got_it_button, inflate);
                if (materialButton != null) {
                    i = R.id.user_badge;
                    ImageView imageView = (ImageView) nq8.B(R.id.user_badge, inflate);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.w = new e92(constraintLayout, textView, textView2, materialButton, imageView, 24);
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ProfileData profileData = arguments != null ? (ProfileData) gz8.M(arguments, "PROFILE_DATA", ProfileData.class) : null;
        ia0 ia0Var = ia0.q;
        UserAccount e = ok3.p().e();
        boolean c = Intrinsics.c(profileData != null ? profileData.getId() : null, e.getId());
        if (profileData != null) {
            e92 e92Var = this.w;
            if (e92Var == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            as9.r((ImageView) e92Var.c, profileData.getUserBadge(), 6);
            e92 e92Var2 = this.w;
            if (e92Var2 == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            TextView textView = (TextView) e92Var2.d;
            Context requireContext = requireContext();
            requireContext.getClass();
            UserBadge userBadge = profileData.getUserBadge();
            int i = userBadge == null ? -1 : u9f.a[userBadge.ordinal()];
            String str = "";
            if (i == 1) {
                string = requireContext.getString(R.string.moderator_badge_text);
                string.getClass();
            } else if (i == 2) {
                string = requireContext.getString(R.string.editor_badge_text);
                string.getClass();
            } else if (i == 3) {
                string = requireContext.getString(R.string.contributor_badge_text);
                string.getClass();
            } else if (i != 4) {
                string = "";
            } else {
                string = requireContext.getString(R.string.profile_badge_top_predictor_info_description);
                string.getClass();
            }
            textView.setText(string);
            e92 e92Var3 = this.w;
            if (e92Var3 == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            TextView textView2 = (TextView) e92Var3.b;
            UserBadge userBadge2 = profileData.getUserBadge();
            UserBadge userBadge3 = UserBadge.EDITOR;
            textView2.setVisibility((userBadge2 != userBadge3 || c || e.getIsEditor()) ? 8 : 0);
            TextView textView3 = v().g;
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            UserBadge userBadge4 = profileData.getUserBadge();
            if (userBadge4 == UserBadge.MODERATOR) {
                str = requireContext2.getString(R.string.moderator_badge_title);
                str.getClass();
            } else if (userBadge4 == userBadge3) {
                str = requireContext2.getString(R.string.editor_badge_title);
                str.getClass();
            } else if (userBadge4 == UserBadge.CROWDSOURCER) {
                str = requireContext2.getString(R.string.contributor_badge_title);
                str.getClass();
            } else if (userBadge4 == UserBadge.PREDICTOR) {
                str = requireContext2.getString(R.string.profile_badge_top_predictor_info);
                str.getClass();
            }
            textView3.setText(str);
        }
        e92 e92Var4 = this.w;
        if (e92Var4 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        aba.y((TextView) e92Var4.b, 0, 3);
        e92 e92Var5 = this.w;
        if (e92Var5 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        aba.y((MaterialButton) e92Var5.f, 0, 3);
        e92 e92Var6 = this.w;
        if (e92Var6 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        z8e.a0((TextView) e92Var6.b, 1000L, new ate(this, 11));
        e92 e92Var7 = this.w;
        if (e92Var7 != null) {
            ((MaterialButton) e92Var7.f).setOnClickListener(new cne(this, 8));
        } else {
            Intrinsics.i("modalBinding");
            throw null;
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AboutUserModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return "";
    }
}
