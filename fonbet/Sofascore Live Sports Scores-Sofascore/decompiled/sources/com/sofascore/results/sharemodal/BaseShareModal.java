package com.sofascore.results.sharemodal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.sharemodal.BaseShareModal;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aba;
import defpackage.ich;
import defpackage.kch;
import defpackage.nq8;
import defpackage.o3a;
import defpackage.su;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/BaseShareModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseShareModal extends BaseModalBottomSheetDialog {
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public int A() {
        return 17;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.share_modal_footer, (ViewGroup) v().l, false);
        int i2 = R.id.download_button;
        ImageView imageView = (ImageView) nq8.B(R.id.download_button, inflate);
        if (imageView != null) {
            i2 = R.id.share_button;
            Button button = (Button) nq8.B(R.id.share_button, inflate);
            if (button != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                aba.y(imageView, 0, 3);
                z8e.a0(imageView, 1000L, new Function0(this) { // from class: i61
                    public final /* synthetic */ BaseShareModal b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        BaseShareModal baseShareModal = this.b;
                        rq3 rq3Var = null;
                        switch (i3) {
                            case 0:
                                RecyclerView K = baseShareModal.K();
                                if (K != null) {
                                    xw3.L(wca.x(baseShareModal.getLifecycle()), null, null, new j61(baseShareModal, K, rq3Var, 0), 3);
                                }
                                break;
                            default:
                                RecyclerView K2 = baseShareModal.K();
                                if (K2 != null) {
                                    xw3.L(wca.x(baseShareModal.getLifecycle()), null, null, new j61(baseShareModal, K2, rq3Var, 1), 3);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                });
                final int i3 = 1;
                z8e.a0(button, 1000L, new Function0(this) { // from class: i61
                    public final /* synthetic */ BaseShareModal b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i32 = i3;
                        BaseShareModal baseShareModal = this.b;
                        rq3 rq3Var = null;
                        switch (i32) {
                            case 0:
                                RecyclerView K = baseShareModal.K();
                                if (K != null) {
                                    xw3.L(wca.x(baseShareModal.getLifecycle()), null, null, new j61(baseShareModal, K, rq3Var, 0), 3);
                                }
                                break;
                            default:
                                RecyclerView K2 = baseShareModal.K();
                                if (K2 != null) {
                                    xw3.L(wca.x(baseShareModal.getLifecycle()), null, null, new j61(baseShareModal, K2, rq3Var, 1), 3);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                });
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    /* renamed from: F */
    public abstract kch getA();

    public String G() {
        return null;
    }

    public abstract ich H();

    public final int I() {
        ich H = H();
        IShareContent data = H != null ? H.getData() : null;
        if (data instanceof Event) {
            return ((Event) data).getId();
        }
        if (!(data instanceof Tournament)) {
            if (data instanceof Team) {
                return ((Team) data).getId();
            }
            return -1;
        }
        Integer F = o3a.F((Tournament) data);
        if (F != null) {
            return F.intValue();
        }
        return 0;
    }

    public abstract RecyclerView K();

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((FrameLayout) v().k).setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ich H = H();
        IShareContent data = H != null ? H.getData() : null;
        boolean z = data instanceof Event;
        su suVar = this.t;
        if (z) {
            Event event = (Event) data;
            suVar.a = Integer.valueOf(event.getId());
            suVar.c = event.getStatus().getType();
        } else if (data instanceof Tournament) {
            suVar.a = o3a.F((Tournament) data);
        } else if (data instanceof Team) {
            suVar.a = Integer.valueOf(((Team) data).getId());
        }
    }
}
