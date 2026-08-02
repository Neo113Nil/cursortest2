package com.sofascore.results.profile.view;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.ao2;
import defpackage.dmi;
import defpackage.ndk;
import defpackage.nq8;
import defpackage.t22;
import defpackage.w62;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/view/WeeklyStreaksExplanationModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyStreaksExplanationModal extends BaseModalBottomSheetDialog {
    public t22 w;
    public final boolean x = true;

    public WeeklyStreaksExplanationModal() {
        if (((Boolean) ypa.a(ysa.c, new ndk(this, 8)).getValue()).booleanValue()) {
            this.t.b = "other_profile";
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.weekly_streak_explanation_modal, (ViewGroup) v().l, false);
        int i = R.id.weekly_info_bullets;
        TextView textView = (TextView) nq8.B(R.id.weekly_info_bullets, inflate);
        if (textView != null) {
            i = R.id.weekly_tracking_rivals;
            TextView textView2 = (TextView) nq8.B(R.id.weekly_tracking_rivals, inflate);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.w = new t22(linearLayout, textView, textView2, 9);
                linearLayout.getClass();
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        List j = b.j(getString(R.string.weekly_streaks_starting_bullet), getString(R.string.weekly_streaks_staying_bullet), getString(R.string.weekly_streaks_losing_bullet));
        Context requireContext = requireContext();
        requireContext.getClass();
        int s = ao2.s(2, requireContext);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int s2 = ao2.s(6, requireContext2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            String y = dmi.y((String) it.next(), "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) y);
            spannableStringBuilder.setSpan(new w62(s, s2), length, y.length() + length, 33);
            t22 t22Var = this.w;
            if (t22Var == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            t22Var.c.setText(spannableStringBuilder);
        }
        t22 t22Var2 = this.w;
        if (t22Var2 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        TextView textView = t22Var2.d;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.weekly_streaks_tracking_rivals));
        spannableStringBuilder2.setSpan(new w62(s, s2), 0, spannableStringBuilder2.length(), 33);
        textView.setText(spannableStringBuilder2);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ChallengeStreakInfoModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
