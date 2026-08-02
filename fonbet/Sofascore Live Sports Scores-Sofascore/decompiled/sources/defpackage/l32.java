package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.newRankings.RankingType;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.branding.BrandingHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class l32 extends p8 {
    public final /* synthetic */ int c = 2;
    public final int d;
    public final krk e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l32(ed edVar) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) edVar.b;
        frameLayout.getClass();
        this.e = edVar;
        this.d = ao2.s(8, this.b);
        ((BrandingHeaderView) edVar.c).setBackgroundResource(R.drawable.rectangle_24dp_top_corners_no_color);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String name;
        Drawable drawable;
        int i3 = this.c;
        int i4 = 0;
        Context context = this.b;
        int i5 = this.d;
        krk krkVar = this.e;
        switch (i3) {
            case 0:
                m32 m32Var = (m32) obj;
                m32Var.getClass();
                boolean d = d(i);
                ed edVar = (ed) krkVar;
                BrandingHeaderView brandingHeaderView = (BrandingHeaderView) edVar.c;
                ViewGroup.LayoutParams layoutParams = brandingHeaderView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (m32Var.d && !d) {
                        i4 = i5;
                    }
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    brandingHeaderView.setLayoutParams(marginLayoutParams);
                    FrameLayout frameLayout = (FrameLayout) edVar.b;
                    frameLayout.getClass();
                    sea.v(frameLayout, d, false, 24, 6, 0, null, 112);
                    BrandingHeaderView.d(brandingHeaderView, m32Var.a, m32Var.c, m32Var.b, 24);
                    break;
                }
            case 1:
                cz9 cz9Var = (cz9) obj;
                cz9Var.getClass();
                o16 o16Var = (o16) krkVar;
                TextView textView = o16Var.c;
                Integer valueOf = Integer.valueOf(cz9Var.d);
                String string = context.getString(R.string.additional_time);
                string.getClass();
                textView.setText(yid.e(2, string, valueOf));
                FrameLayout frameLayout2 = o16Var.b;
                frameLayout2.getClass();
                sea.v(frameLayout2, cz9Var.a, cz9Var.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                if (!cz9Var.b) {
                    i5 = 0;
                }
                frameLayout2.setPaddingRelative(0, 0, 0, i5);
                break;
            case 2:
                RankingType rankingType = (RankingType) obj;
                rankingType.getClass();
                String weightClass = rankingType.getWeightClass();
                if (weightClass != null) {
                    name = tnf.q(context, weightClass);
                } else {
                    name = rankingType.getName();
                    if (name == null) {
                        name = context.getString(R.string.value_unknown);
                        name.getClass();
                    }
                }
                kqb kqbVar = (kqb) krkVar;
                ConstraintLayout constraintLayout = kqbVar.b;
                TextView textView2 = kqbVar.d;
                constraintLayout.getClass();
                sea.v(constraintLayout, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                textView2.setText(name);
                textView2.setPaddingRelative(i5, i5, i5, i5);
                haa.G(textView2);
                Drawable drawable2 = context.getDrawable(R.drawable.ic_external_link_16);
                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    v9g.K(drawable, context.getColor(R.color.primary_default));
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                break;
            default:
                d7i d7iVar = (d7i) obj;
                d7iVar.getClass();
                dd ddVar = (dd) krkVar;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ddVar.b;
                constraintLayout2.getClass();
                sea.v(constraintLayout2, true, !d7iVar.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                TextView textView3 = (TextView) ddVar.d;
                UniqueStage uniqueStage = d7iVar.a;
                textView3.setText(uniqueStage.getName());
                String j = vxd.j(uniqueStage.getCategory().getId(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
                ua5 ua5Var = ua5.a;
                t25.a(i5);
                haa.q(textView3, j, ua5Var, new t25(i5));
                ((BellButton) ddVar.c).e(uniqueStage, wu.MAIN_MATCHES);
                break;
        }
    }

    public boolean d(int i) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(View view) {
        super(view);
        view.getClass();
        this.e = kqb.b(view);
        this.d = ao2.s(16, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l32(o16 o16Var) {
        super(r0);
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.e = o16Var;
        this.d = ao2.s(8, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l32(dd ddVar) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) ddVar.b;
        constraintLayout.getClass();
        this.e = ddVar;
        this.d = ao2.v(24, this.b);
    }
}
