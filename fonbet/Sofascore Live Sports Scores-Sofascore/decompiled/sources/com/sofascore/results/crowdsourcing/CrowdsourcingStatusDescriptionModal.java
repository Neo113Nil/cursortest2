package com.sofascore.results.crowdsourcing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.a70;
import defpackage.a99;
import defpackage.aba;
import defpackage.gz8;
import defpackage.l64;
import defpackage.o64;
import defpackage.tc3;
import defpackage.wrh;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/crowdsourcing/CrowdsourcingStatusDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrowdsourcingStatusDescriptionModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        int i = 0;
        wrh b = wrh.b(layoutInflater, (FrameLayout) v().l, false);
        ComposeView composeView = b.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.I(composeView);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "state", l64.class);
        if (M == null) {
            a70.p("Serializable state not found");
            return null;
        }
        composeView.setContent(new tc3(1548889042, new o64((l64) M, requireArguments().getBoolean("validated"), this, i), true));
        FrameLayout frameLayout = b.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(requireArguments().getInt("event_id"));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CrowdsourcingSuggestionStatusModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.crowdsourcing_status_tooltip_title);
        string.getClass();
        return string;
    }
}
