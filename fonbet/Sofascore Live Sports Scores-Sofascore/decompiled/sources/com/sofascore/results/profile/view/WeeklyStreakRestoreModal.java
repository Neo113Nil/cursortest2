package com.sofascore.results.profile.view;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.android.billingclient.api.ProductDetails;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.mqi;
import defpackage.o5l;
import defpackage.p5l;
import defpackage.r4l;
import defpackage.tc3;
import defpackage.wrh;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/view/WeeklyStreakRestoreModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyStreakRestoreModal extends BaseModalBottomSheetDialog {
    public static ProductDetails A;
    public static r4l B;
    public wrh w;
    public final boolean x = true;
    public final mqi y = ypa.b(new p5l(this, 0));
    public final mqi z = ypa.b(new p5l(this, 1));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        wrh b = wrh.b(layoutInflater, null, false);
        this.w = b;
        FrameLayout frameLayout = b.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        B = null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (A == null) {
            return;
        }
        wrh wrhVar = this.w;
        if (wrhVar != null) {
            wrhVar.b.setContent(new tc3(-345545643, new o5l(this, 0), true));
        } else {
            Intrinsics.i("modalBinding");
            throw null;
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "StreakRestoreModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.streak_restore_title);
        string.getClass();
        return string;
    }
}
