package com.sofascore.results.base.compose.architecture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import defpackage.a99;
import defpackage.aba;
import defpackage.de3;
import defpackage.krk;
import defpackage.tc3;
import defpackage.yrh;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lyrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ComposeFullScreenDialogFragment extends BaseFullScreenDialog<yrh> {
    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    /* renamed from: r */
    public final boolean getT() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        yrh a = yrh.a(layoutInflater, viewGroup);
        ComposeView composeView = a.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.F(composeView);
        composeView.setContent(new tc3(1476041996, new de3(this, 0), true));
        return a;
    }

    /* renamed from: u */
    public abstract tc3 getW();
}
