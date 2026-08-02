package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.newNetwork.post.ProfileImageUploadResponse;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import com.sofascore.results.profile.view.UserBadgesGridView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y8f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditFragment b;

    public /* synthetic */ y8f(ProfileEditFragment profileEditFragment, int i) {
        this.a = i;
        this.b = profileEditFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        int i = this.a;
        int i2 = 6;
        int i3 = 4;
        int i4 = 3;
        ProfileEditFragment profileEditFragment = this.b;
        switch (i) {
            case 0:
                ProfileImageUploadResponse profileImageUploadResponse = (ProfileImageUploadResponse) obj;
                if (profileEditFragment.s != null) {
                    if (profileImageUploadResponse != null) {
                        Context requireContext = profileEditFragment.requireContext();
                        requireContext.getClass();
                        tol.t(requireContext);
                        krk krkVar = profileEditFragment.l;
                        krkVar.getClass();
                        as9.t(((tq8) krkVar).g, profileImageUploadResponse.getImageUrl());
                        xw3.L(wca.x(profileEditFragment.getLifecycle()), null, null, new z8f(profileEditFragment, null, 0), 3);
                    } else {
                        xw3.L(wca.x(profileEditFragment.getLifecycle()), null, null, new z8f(profileEditFragment, null, 1), 3);
                    }
                }
                break;
            case 1:
                c9f c9fVar = (c9f) obj;
                if (profileEditFragment.s != null) {
                    Boolean bool2 = c9fVar.a;
                    if ((bool2 == null || bool2.booleanValue()) && ((bool = c9fVar.b) == null || bool.booleanValue())) {
                        xw3.L(wca.x(profileEditFragment.getLifecycle()), null, null, new z8f(profileEditFragment, null, 2), 3);
                    } else if (Intrinsics.c(c9fVar.a, Boolean.FALSE)) {
                        xw3.L(wca.x(profileEditFragment.getLifecycle()), null, null, new z8f(profileEditFragment, null, 3), 3);
                        Context requireContext2 = profileEditFragment.requireContext();
                        requireContext2.getClass();
                        String string = profileEditFragment.getString(R.string.nickname_taken_title);
                        string.getClass();
                        String string2 = profileEditFragment.getString(R.string.nickname_taken_message);
                        string2.getClass();
                        zic.U(requireContext2, string, string2);
                    } else {
                        xw3.L(wca.x(profileEditFragment.getLifecycle()), null, null, new z8f(profileEditFragment, null, 4), 3);
                        Context requireContext3 = profileEditFragment.requireContext();
                        requireContext3.getClass();
                        String string3 = profileEditFragment.getString(R.string.profile_badge_error_message_title);
                        string3.getClass();
                        String string4 = profileEditFragment.getString(R.string.profile_badge_error_message_text);
                        string4.getClass();
                        zic.U(requireContext3, string3, string4);
                    }
                }
                break;
            case 2:
                d9f d9fVar = (d9f) obj;
                if (profileEditFragment.v) {
                    krk krkVar2 = profileEditFragment.l;
                    krkVar2.getClass();
                    UserBadgesGridView userBadgesGridView = ((tq8) krkVar2).i;
                    UserBadge userBadge = d9fVar.a;
                    UserAccount F = profileEditFragment.F();
                    F.getClass();
                    boolean c = Intrinsics.c(F.getUserBadge(), "MODERATOR");
                    List list = d9fVar.b;
                    y8f y8fVar = new y8f(profileEditFragment, i4);
                    y8f y8fVar2 = new y8f(profileEditFragment, i3);
                    list.getClass();
                    for (UserBadge userBadge2 : UserBadge.getEntries()) {
                        Context context = userBadgesGridView.getContext();
                        context.getClass();
                        final jfk jfkVar = new jfk(context);
                        UserBadge userBadge3 = UserBadge.NO_BADGE;
                        final boolean z = (userBadge2 == userBadge3 || list.contains(userBadge2)) && !c;
                        boolean z2 = !c ? !(userBadge2 == userBadge || (userBadge2 == userBadge3 && userBadge == null)) : userBadge2 != UserBadge.MODERATOR;
                        final mth mthVar = new mth(i2, userBadgesGridView, userBadge2, y8fVar);
                        final fej fejVar = new fej(10, y8fVar2, userBadge2);
                        userBadge2.getClass();
                        jfkVar.p = userBadge2;
                        rfe rfeVar = jfkVar.o;
                        List list2 = list;
                        TextView textView = (TextView) rfeVar.e;
                        boolean z3 = c;
                        ImageView imageView = (ImageView) rfeVar.c;
                        textView.setEnabled(z);
                        imageView.setEnabled(z);
                        jfkVar.setActivated(z);
                        UserBadge userBadge4 = userBadge;
                        int color = jfkVar.getContext().getColor(R.color.n_lv_3);
                        y8f y8fVar3 = y8fVar;
                        y8f y8fVar4 = y8fVar2;
                        int[][] iArr = {new int[]{-16842910}, new int[0]};
                        int i5 = ifk.a[userBadge2.ordinal()];
                        int color2 = i5 != 1 ? i5 != 2 ? jfkVar.getContext().getColor(R.color.primary_default) : jfkVar.getContext().getColor(R.color.error) : jfkVar.getContext().getColor(R.color.n_lv_3);
                        TextView textView2 = (TextView) rfeVar.e;
                        if (userBadge2 == userBadge3) {
                            textView2.setText(jfkVar.getContext().getString(R.string.profile_badge_selection_no_badge));
                            imageView.setImageResource(R.drawable.no_badge_icon);
                            imageView.setBackground(null);
                        } else {
                            Context context2 = jfkVar.getContext();
                            context2.getClass();
                            textView2.setText(jca.K(context2, userBadge2));
                            int i6 = u9f.a[userBadge2.ordinal()];
                            imageView.setImageResource(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? 0 : R.drawable.ic_top_predictors_badge_transparent : R.drawable.ic_top_contributor_badge_transparent : R.drawable.ic_top_editor_badge_transparent : R.drawable.ic_moderator_badge_transparent);
                            imageView.setImageTintList(z2 ? ColorStateList.valueOf(color2) : new ColorStateList(iArr, new int[]{color, color2}));
                        }
                        if (!z) {
                            jfkVar.setRippleColor(ColorStateList.valueOf(0));
                        }
                        jfkVar.setOnClickListener(new View.OnClickListener() { // from class: hfk
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (!z) {
                                    fejVar.invoke();
                                } else {
                                    if (jfkVar.isSelected()) {
                                        return;
                                    }
                                    mthVar.invoke();
                                }
                            }
                        });
                        ((ImageView) rfeVar.d).setVisibility(z2 ? 0 : 8);
                        jfkVar.setSelected(z2);
                        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                        jfkVar.setLayoutParams(layoutParams);
                        userBadgesGridView.addView(jfkVar);
                        list = list2;
                        c = z3;
                        userBadge = userBadge4;
                        y8fVar = y8fVar3;
                        y8fVar2 = y8fVar4;
                        i2 = 6;
                    }
                    profileEditFragment.v = false;
                }
                break;
            case 3:
                UserBadge userBadge5 = (UserBadge) obj;
                userBadge5.getClass();
                profileEditFragment.w = userBadge5;
                krk krkVar3 = profileEditFragment.l;
                krkVar3.getClass();
                as9.r(((tq8) krkVar3).h, profileEditFragment.w, 6);
                profileEditFragment.z.f(profileEditFragment.D() || profileEditFragment.C());
                break;
            default:
                ((UserBadge) obj).getClass();
                UserAccount F2 = profileEditFragment.F();
                F2.getClass();
                if (!Intrinsics.c(F2.getUserBadge(), "MODERATOR")) {
                    ((l94) profileEditFragment.u.getValue()).i();
                }
                break;
        }
        return Unit.a;
    }
}
