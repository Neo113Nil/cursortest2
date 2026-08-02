package com.sofascore.results.chat.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.ajh;
import defpackage.apf;
import defpackage.as9;
import defpackage.cq2;
import defpackage.ht9;
import defpackage.nq8;
import defpackage.ob9;
import defpackage.u9f;
import defpackage.vt9;
import defpackage.yhk;
import defpackage.z82;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/chat/view/ChatActionsModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatActionsModal extends BaseModalBottomSheetDialog {
    public final ChatUser A;
    public final boolean B;
    public final Function1 C;
    public final boolean D = true;
    public z82 E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public ChatActionsModal(boolean z, boolean z2, boolean z3, boolean z4, ChatUser chatUser, boolean z5, Function1 function1) {
        this.w = z;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.A = chatUser;
        this.B = z5;
        this.C = function1;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        String string;
        View inflate = layoutInflater.inflate(R.layout.chat_actions_modal_header, (ViewGroup) null, false);
        int i = R.id.user_badge;
        ImageView imageView = (ImageView) nq8.B(R.id.user_badge, inflate);
        if (imageView != null) {
            i = R.id.user_image;
            ImageView imageView2 = (ImageView) nq8.B(R.id.user_image, inflate);
            if (imageView2 != null) {
                i = R.id.user_name;
                TextView textView = (TextView) nq8.B(R.id.user_name, inflate);
                if (textView != null) {
                    i = R.id.user_role;
                    TextView textView2 = (TextView) nq8.B(R.id.user_role, inflate);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (this.z) {
                            constraintLayout.getClass();
                            constraintLayout.setVisibility(8);
                        } else {
                            ChatUser chatUser = this.A;
                            textView.setText(chatUser.getName());
                            as9.s(imageView2, chatUser.getId());
                            as9.r(imageView, chatUser.getUserBadge(), 6);
                            Context requireContext = requireContext();
                            requireContext.getClass();
                            UserBadge userBadge = chatUser.getUserBadge();
                            int i2 = userBadge == null ? -1 : u9f.a[userBadge.ordinal()];
                            if (i2 == 1) {
                                string = requireContext.getString(R.string.user_profile_moderator);
                                string.getClass();
                            } else if (i2 == 2) {
                                string = requireContext.getString(R.string.user_status_editor);
                                string.getClass();
                            } else if (i2 == 3) {
                                string = requireContext.getString(R.string.user_status_contributor);
                                string.getClass();
                            } else if (i2 != 4) {
                                string = "";
                            } else {
                                string = requireContext.getString(R.string.profile_badge_top_predictor);
                                string.getClass();
                            }
                            String str = string.length() > 0 ? string : null;
                            if (str != null) {
                                textView2.setText(str);
                            } else {
                                textView2.setVisibility(8);
                            }
                            constraintLayout.setOnClickListener(new cq2(this, 5));
                        }
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.chat_actions_modal, (ViewGroup) v().l, false);
        int i = R.id.ban_user;
        View B = nq8.B(R.id.ban_user, inflate);
        if (B != null) {
            ob9 a = ob9.a(B);
            i = R.id.permanently_ban;
            View B2 = nq8.B(R.id.permanently_ban, inflate);
            if (B2 != null) {
                ob9 a2 = ob9.a(B2);
                i = R.id.remove_message;
                View B3 = nq8.B(R.id.remove_message, inflate);
                if (B3 != null) {
                    ob9 a3 = ob9.a(B3);
                    i = R.id.report_user;
                    View B4 = nq8.B(R.id.report_user, inflate);
                    if (B4 != null) {
                        ob9 a4 = ob9.a(B4);
                        i = R.id.warn_user;
                        View B5 = nq8.B(R.id.warn_user, inflate);
                        if (B5 != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.E = new z82(linearLayout, a, a2, a3, a4, ob9.a(B5), 3);
                            linearLayout.getClass();
                            return linearLayout;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ImageView imageView;
        FrameLayout frameLayout;
        Dialog dialog;
        Window window;
        Integer valueOf = Integer.valueOf(R.drawable.ic_warning);
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior C = BottomSheetBehavior.C((View) parent);
        C.K = true;
        C.J(true);
        C.M(3);
        ChatUser chatUser = this.A;
        boolean z2 = this.w;
        boolean z3 = (z2 || this.y || chatUser.isAdmin() || chatUser.isModerator()) ? false : true;
        int color = requireContext().getColor(R.color.primary_default);
        int color2 = requireContext().getColor(R.color.error);
        z82 z82Var = this.E;
        if (z82Var == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ob9 ob9Var = (ob9) z82Var.d;
        ImageView imageView2 = ob9Var.c;
        FrameLayout frameLayout2 = ob9Var.b;
        ob9 ob9Var2 = (ob9) z82Var.f;
        FrameLayout frameLayout3 = ob9Var2.b;
        ImageView imageView3 = ob9Var2.c;
        ob9 ob9Var3 = (ob9) z82Var.c;
        ImageView imageView4 = ob9Var3.c;
        FrameLayout frameLayout4 = ob9Var3.b;
        if (z2) {
            ob9 ob9Var4 = (ob9) z82Var.e;
            FrameLayout frameLayout5 = ob9Var4.b;
            TextView textView = ob9Var4.d;
            ImageView imageView5 = ob9Var4.c;
            z = z3;
            frameLayout5.setVisibility(0);
            apf a = ajh.a(imageView5.getContext());
            frameLayout = frameLayout2;
            imageView = imageView2;
            ht9 ht9Var = new ht9(imageView5.getContext());
            ht9Var.c = valueOf;
            vt9.f(ht9Var, imageView5);
            a.a(ht9Var.a());
            imageView5.setImageTintList(ColorStateList.valueOf(color2));
            textView.setText(requireContext().getString(R.string.chat_report));
            textView.setTextColor(color2);
            frameLayout5.setOnClickListener(new cq2(this, 0));
            frameLayout4.setVisibility(8);
        } else {
            z = z3;
            imageView = imageView2;
            frameLayout = frameLayout2;
            TextView textView2 = ob9Var3.d;
            Integer valueOf2 = Integer.valueOf(R.drawable.ic_delete);
            apf a2 = ajh.a(imageView4.getContext());
            ht9 ht9Var2 = new ht9(imageView4.getContext());
            ht9Var2.c = valueOf2;
            vt9.f(ht9Var2, imageView4);
            a2.a(ht9Var2.a());
            imageView4.setImageTintList(ColorStateList.valueOf(color));
            textView2.setText(requireContext().getString(R.string.chat_delete_message));
            textView2.setTextColor(color);
            frameLayout4.setOnClickListener(new cq2(this, 1));
        }
        ob9 ob9Var5 = (ob9) z82Var.g;
        FrameLayout frameLayout6 = ob9Var5.b;
        ImageView imageView6 = ob9Var5.c;
        int i = 2;
        if (z) {
            TextView textView3 = ob9Var5.d;
            apf a3 = ajh.a(imageView6.getContext());
            ht9 ht9Var3 = new ht9(imageView6.getContext());
            ht9Var3.c = valueOf;
            vt9.f(ht9Var3, imageView6);
            a3.a(ht9Var3.a());
            imageView6.setImageTintList(ColorStateList.valueOf(color));
            textView3.setText(requireContext().getString(R.string.warn_user, Integer.valueOf(chatUser.getWarns())));
            textView3.setTextColor(color);
            frameLayout6.setOnClickListener(new cq2(this, i));
            TextView textView4 = ob9Var2.d;
            Integer valueOf3 = Integer.valueOf(R.drawable.ic_remove_member);
            apf a4 = ajh.a(imageView3.getContext());
            ht9 ht9Var4 = new ht9(imageView3.getContext());
            ht9Var4.c = valueOf3;
            vt9.f(ht9Var4, imageView3);
            a4.a(ht9Var4.a());
            imageView3.setImageTintList(ColorStateList.valueOf(color2));
            textView4.setText(requireContext().getString(R.string.ban_user, Integer.valueOf(chatUser.getBans())));
            textView4.setTextColor(color2);
            frameLayout3.setOnClickListener(new cq2(this, 3));
            if (this.x) {
                TextView textView5 = ob9Var.d;
                Integer valueOf4 = Integer.valueOf(R.drawable.ic_remove);
                apf a5 = ajh.a(imageView.getContext());
                ht9 ht9Var5 = new ht9(imageView.getContext());
                ht9Var5.c = valueOf4;
                ImageView imageView7 = imageView;
                vt9.f(ht9Var5, imageView7);
                a5.a(ht9Var5.a());
                textView5.setText(requireContext().getString(R.string.permanently_ban_user));
                textView5.setTextColor(ColorStateList.valueOf(color2));
                imageView7.setImageTintList(ColorStateList.valueOf(color2));
                frameLayout.setOnClickListener(new cq2(this, 4));
            } else {
                frameLayout.setVisibility(8);
            }
        } else {
            frameLayout6.setVisibility(8);
            frameLayout3.setVisibility(8);
            frameLayout.setVisibility(8);
        }
        if (!this.B || (dialog = this.l) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.clearFlags(2);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return this.x ? "AdminActionsModal" : this.w ? "UserActionsModal" : "ModeratorActionsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
