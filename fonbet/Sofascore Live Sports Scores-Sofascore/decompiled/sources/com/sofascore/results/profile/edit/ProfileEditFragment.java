package com.sofascore.results.profile.edit;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import com.sofascore.results.profile.view.UserBadgesGridView;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.a9f;
import defpackage.aba;
import defpackage.as9;
import defpackage.bi4;
import defpackage.ce;
import defpackage.de;
import defpackage.dk2;
import defpackage.duf;
import defpackage.e6b;
import defpackage.f9f;
import defpackage.fc6;
import defpackage.g2;
import defpackage.h10;
import defpackage.hk4;
import defpackage.ioe;
import defpackage.k0;
import defpackage.krk;
import defpackage.kv;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nv;
import defpackage.otk;
import defpackage.px0;
import defpackage.ql4;
import defpackage.rq3;
import defpackage.s8f;
import defpackage.tq8;
import defpackage.ts2;
import defpackage.u6b;
import defpackage.un0;
import defpackage.upd;
import defpackage.w8f;
import defpackage.xd;
import defpackage.xw3;
import defpackage.y8f;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z8e;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/edit/ProfileEditFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Ltq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditFragment extends Hilt_ProfileEditFragment<tq8> {
    public final otk r;
    public g2 s;
    public final mqi u;
    public UserBadge w;
    public final de x;
    public final de y;
    public final px0 z;
    public final mqi t = ypa.b(new s8f(10));
    public boolean v = true;

    public ProfileEditFragment() {
        final int i = 0;
        final int i2 = 1;
        int i3 = 2;
        this.r = new otk(duf.a.getOrCreateKotlinClass(f9f.class), new a9f(this, i), new a9f(this, i3), new a9f(this, i2));
        this.u = ypa.b(new w8f(this, i3));
        de registerForActivityResult = registerForActivityResult(new ce(3), new xd(this) { // from class: x8f
            public final /* synthetic */ ProfileEditFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                int i4 = i;
                int i5 = 2;
                ProfileEditFragment profileEditFragment = this.b;
                switch (i4) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            rq3 rq3Var = null;
                            Uri data = intent != null ? intent.getData() : null;
                            if (data != null) {
                                Context requireContext = profileEditFragment.requireContext();
                                requireContext.getClass();
                                String string = profileEditFragment.getString(R.string.saving_changes);
                                string.getClass();
                                dk2 c = dk2.c(LayoutInflater.from(requireContext));
                                AlertDialog create = new AlertDialog.Builder(requireContext, R.style.RedesignDialog).create();
                                create.setCancelable(false);
                                TextView textView = c.c;
                                textView.setText(string);
                                textView.setVisibility(0);
                                create.setView(c.b);
                                create.show();
                                profileEditFragment.s = new g2(c, create, rq3Var, i5);
                                f9f E = profileEditFragment.E();
                                xw3.L(un0.z(E), null, null, new gje(E, data, rq3Var, 12), 3);
                                break;
                            } else {
                                Calendar calendar = ke0.a;
                                Context requireContext2 = profileEditFragment.requireContext();
                                requireContext2.getClass();
                                ke0.g(requireContext2, profileEditFragment.getString(R.string.file_error), 0);
                                if (eq3.b(profileEditFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                    profileEditFragment.y.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        map.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == 2) {
                            profileEditFragment.G();
                            break;
                        }
                        break;
                }
            }
        });
        registerForActivityResult.getClass();
        this.x = registerForActivityResult;
        de registerForActivityResult2 = registerForActivityResult(new ce(i2), new xd(this) { // from class: x8f
            public final /* synthetic */ ProfileEditFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                int i4 = i2;
                int i5 = 2;
                ProfileEditFragment profileEditFragment = this.b;
                switch (i4) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            rq3 rq3Var = null;
                            Uri data = intent != null ? intent.getData() : null;
                            if (data != null) {
                                Context requireContext = profileEditFragment.requireContext();
                                requireContext.getClass();
                                String string = profileEditFragment.getString(R.string.saving_changes);
                                string.getClass();
                                dk2 c = dk2.c(LayoutInflater.from(requireContext));
                                AlertDialog create = new AlertDialog.Builder(requireContext, R.style.RedesignDialog).create();
                                create.setCancelable(false);
                                TextView textView = c.c;
                                textView.setText(string);
                                textView.setVisibility(0);
                                create.setView(c.b);
                                create.show();
                                profileEditFragment.s = new g2(c, create, rq3Var, i5);
                                f9f E = profileEditFragment.E();
                                xw3.L(un0.z(E), null, null, new gje(E, data, rq3Var, 12), 3);
                                break;
                            } else {
                                Calendar calendar = ke0.a;
                                Context requireContext2 = profileEditFragment.requireContext();
                                requireContext2.getClass();
                                ke0.g(requireContext2, profileEditFragment.getString(R.string.file_error), 0);
                                if (eq3.b(profileEditFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                    profileEditFragment.y.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        map.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == 2) {
                            profileEditFragment.G();
                            break;
                        }
                        break;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.y = registerForActivityResult2;
        this.z = new px0(this, 10);
    }

    public final boolean C() {
        String userBadge = F().getUserBadge();
        if (userBadge == null) {
            userBadge = null;
        }
        UserBadge userBadge2 = this.w;
        if (userBadge == null) {
            return (userBadge2 == null || userBadge2 == UserBadge.NO_BADGE) ? false : true;
        }
        if (userBadge2 != null) {
            if (!Intrinsics.c(userBadge2 != null ? userBadge2.name() : null, userBadge)) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        krk krkVar = this.l;
        krkVar.getClass();
        String valueOf = String.valueOf(((tq8) krkVar).d.getText());
        return !Intrinsics.c(F().getNickname(), valueOf) && valueOf.length() > 0 && valueOf.length() <= 30;
    }

    public final f9f E() {
        return (f9f) this.r.getValue();
    }

    public final UserAccount F() {
        return (UserAccount) this.t.getValue();
    }

    public final void G() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        String string = getString(R.string.choose_image);
        string.getClass();
        this.x.a(Intent.createChooser(intent, string), null);
    }

    public final boolean H() {
        krk krkVar = this.l;
        krkVar.getClass();
        String valueOf = String.valueOf(((tq8) krkVar).d.getText());
        boolean D = D();
        boolean C = C();
        rq3 rq3Var = null;
        if (C) {
            UserBadge userBadge = this.w;
            String badgeName = userBadge != null ? userBadge.getBadgeName() : null;
            if (badgeName != null) {
                Context requireContext = requireContext();
                requireContext.getClass();
                nv.z0(requireContext, kv.BADGE_CHANGE, badgeName, "profile");
            }
        }
        if (!D && !C) {
            return false;
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        String string = getString(R.string.saving_changes);
        string.getClass();
        dk2 c = dk2.c(LayoutInflater.from(requireContext2));
        AlertDialog create = new AlertDialog.Builder(requireContext2, R.style.RedesignDialog).create();
        create.setCancelable(false);
        TextView textView = c.c;
        textView.setText(string);
        textView.setVisibility(0);
        create.setView(c.b);
        create.show();
        this.s = new g2(c, create, rq3Var, 2);
        String str = D ? valueOf : null;
        UserBadge userBadge2 = C ? this.w : null;
        f9f E = E();
        xw3.L(un0.z(E), null, null, new ts2(str, userBadge2, E, rq3Var, 12), 3);
        return true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_user_profile_edit, (ViewGroup) null, false);
        int i = R.id.account_creation_text;
        TextView textView = (TextView) nq8.B(R.id.account_creation_text, inflate);
        if (textView != null) {
            i = R.id.badge_selection_text;
            if (((TextView) nq8.B(R.id.badge_selection_text, inflate)) != null) {
                i = R.id.change_profile_picture;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.change_profile_picture, inflate);
                if (materialButton != null) {
                    i = R.id.input_player_nickname;
                    TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.input_player_nickname, inflate);
                    if (textInputEditText != null) {
                        i = R.id.moderator_info_layout;
                        CardView cardView = (CardView) nq8.B(R.id.moderator_info_layout, inflate);
                        if (cardView != null) {
                            i = R.id.player_nickname;
                            SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.player_nickname, inflate);
                            if (sofaTextInputLayout != null) {
                                i = R.id.profile_image;
                                ImageView imageView = (ImageView) nq8.B(R.id.profile_image, inflate);
                                if (imageView != null) {
                                    i = R.id.user_badge;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.user_badge, inflate);
                                    if (imageView2 != null) {
                                        i = R.id.user_badges;
                                        UserBadgesGridView userBadgesGridView = (UserBadgesGridView) nq8.B(R.id.user_badges, inflate);
                                        if (userBadgesGridView != null) {
                                            return new tq8((ScrollView) inflate, textView, materialButton, textInputEditText, cardView, sofaTextInputLayout, imageView, imageView2, userBadgesGridView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "EditProfileTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        requireActivity.addMenuProvider(new k0(this, 13), getViewLifecycleOwner(), e6b.e);
        krk krkVar = this.l;
        krkVar.getClass();
        ((tq8) krkVar).d.setText(F().getNickname());
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int i = 2;
        ((tq8) krkVar2).d.addTextChangedListener(new ql4(this, i));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        int i2 = 0;
        int i3 = 3;
        aba.y(((tq8) krkVar3).c, 0, 3);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        as9.t(((tq8) krkVar4).g, F().getImageUrl());
        krk krkVar5 = this.l;
        krkVar5.getClass();
        as9.r(((tq8) krkVar5).h, UserBadge.INSTANCE.get(F().getUserBadge()), 6);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        TextView textView = ((tq8) krkVar6).b;
        Context requireContext = requireContext();
        String providerType = F().getProviderType();
        int i4 = 1;
        if (providerType.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = providerType.charAt(0);
            Locale locale = Locale.getDefault();
            locale.getClass();
            sb.append((Object) CharsKt.c(charAt, locale));
            sb.append(providerType.substring(1));
            providerType = sb.toString();
        }
        long joinDate = F().getJoinDate();
        bi4 bi4Var = bi4.PATTERN_DMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        textView.setText(requireContext.getString(R.string.profile_account_creation_info, providerType, fc6.i(joinDate, hk4.a(bi4Var.d()))));
        krk krkVar7 = this.l;
        krkVar7.getClass();
        CardView cardView = ((tq8) krkVar7).e;
        UserAccount F = F();
        F.getClass();
        cardView.setVisibility(Intrinsics.c(F.getUserBadge(), "MODERATOR") ? 0 : 8);
        krk krkVar8 = this.l;
        krkVar8.getClass();
        SofaTextInputLayout sofaTextInputLayout = ((tq8) krkVar8).f;
        F().getClass();
        sofaTextInputLayout.setEnabled(!Intrinsics.c(r2.getUserBadge(), "MODERATOR"));
        E().j.e(this, new ioe(3, new y8f(this, i2)));
        E().h.e(this, new ioe(3, new y8f(this, i4)));
        krk krkVar9 = this.l;
        krkVar9.getClass();
        z8e.a0(((tq8) krkVar9).c, 1000L, new w8f(this, i3));
        E().n.e(getViewLifecycleOwner(), new ioe(3, new y8f(this, i)));
        upd onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner, this.z);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        f9f E = E();
        xw3.L(un0.z(E), null, null, new h10(E, null, 17), 3);
    }
}
