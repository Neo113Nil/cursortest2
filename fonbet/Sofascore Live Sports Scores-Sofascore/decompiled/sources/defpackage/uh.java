package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.PlayerData;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uh extends p8 {
    public final /* synthetic */ int c;
    public final ss9 d;
    public final /* synthetic */ xh e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uh(xh xhVar, ss9 ss9Var, int i) {
        super(r1);
        this.c = i;
        switch (i) {
            case 1:
                this.e = xhVar;
                ConstraintLayout constraintLayout = ss9Var.a;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = ss9Var;
                break;
            default:
                this.e = xhVar;
                ConstraintLayout constraintLayout2 = ss9Var.a;
                constraintLayout2.getClass();
                this.d = ss9Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r24.e.getItemViewType(r25 + 1) != 1) goto L10;
     */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        ss9 ss9Var = this.d;
        Context context = this.b;
        switch (i3) {
            case 0:
                MissingPlayerData missingPlayerData = (MissingPlayerData) obj;
                missingPlayerData.getClass();
                ImageView imageView = ss9Var.c;
                ConstraintLayout constraintLayout = ss9Var.a;
                TextView textView = ss9Var.e;
                TextView textView2 = ss9Var.f;
                ImageView imageView2 = ss9Var.g;
                xh xhVar = this.e;
                xhVar.G(missingPlayerData, null, imageView, textView, textView2, imageView2, false);
                r5 = (i == i2 + (-1) || xhVar.getItemViewType(i + 1) == 1) ? false : true;
                ss9Var.b.setVisibility(r5 ? 0 : 8);
                constraintLayout.getClass();
                sea.v(constraintLayout, false, !r5, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout.setMinHeight(!r5 ? ao2.s(64, context) : ao2.s(56, context));
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), r5 ? 0 : ao2.s(8, context));
                break;
            default:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                ImageView imageView3 = ss9Var.c;
                ConstraintLayout constraintLayout2 = ss9Var.a;
                as9.l(imageView3, playerData.getPlayer().getId(), null);
                ss9Var.e.setText(tba.t(playerData.getPlayer()));
                if (i != i2 - 1) {
                    break;
                }
                r5 = false;
                ss9Var.b.setVisibility(r5 ? 0 : 8);
                constraintLayout2.getClass();
                sea.v(constraintLayout2, false, !r5, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout2.setMinHeight(!r5 ? ao2.s(64, context) : ao2.s(56, context));
                constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), r5 ? 0 : ao2.s(8, context));
                break;
        }
    }
}
