package com.sofascore.results.sharemodal.compose;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal;
import defpackage.av8;
import defpackage.joa;
import defpackage.kch;
import defpackage.t21;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/sharemodal/compose/BaseShareComposeBottomSheetModal;", "Landroid/os/Parcelable;", "T", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseShareComposeBottomSheetModal<T extends Parcelable> extends ComposeModalBottomSheetDialog {
    public final joa x;
    public final joa y;

    public BaseShareComposeBottomSheetModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: s51
            public final /* synthetic */ BaseShareComposeBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BaseShareComposeBottomSheetModal baseShareComposeBottomSheetModal = this.b;
                switch (i2) {
                    case 0:
                        Iterable L = gz8.L(baseShareComposeBottomSheetModal.requireArguments(), "ARG_ITEMS", baseShareComposeBottomSheetModal.getE());
                        if (L == null) {
                            L = km5.a;
                        }
                        return l6g.W(L);
                    default:
                        return Integer.valueOf(baseShareComposeBottomSheetModal.requireArguments().getInt("ARG_INITIAL_PAGE", 0));
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: s51
            public final /* synthetic */ BaseShareComposeBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BaseShareComposeBottomSheetModal baseShareComposeBottomSheetModal = this.b;
                switch (i22) {
                    case 0:
                        Iterable L = gz8.L(baseShareComposeBottomSheetModal.requireArguments(), "ARG_ITEMS", baseShareComposeBottomSheetModal.getE());
                        if (L == null) {
                            L = km5.a;
                        }
                        return l6g.W(L);
                    default:
                        return Integer.valueOf(baseShareComposeBottomSheetModal.requireArguments().getInt("ARG_INITIAL_PAGE", 0));
                }
            }
        });
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(1491378795, new t21(this, 13), true);
    }

    public abstract void K(Parcelable parcelable, av8 av8Var, int i);

    public abstract int L(Parcelable parcelable);

    /* renamed from: M */
    public abstract kch getF();

    /* renamed from: N */
    public abstract Class getE();

    /* renamed from: O */
    public abstract int getH();

    /* renamed from: P */
    public abstract int getG();

    public abstract String Q(Parcelable parcelable);

    public String R(Parcelable parcelable) {
        return Q(parcelable);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((FrameLayout) v().k).setVisibility(8);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(getG());
        string.getClass();
        return string;
    }
}
