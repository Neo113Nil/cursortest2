package com.vk.vmoji.character.recommendations;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abw0;
import xsna.ao50;
import xsna.gm50;
import xsna.hhd0;
import xsna.ies;
import xsna.izs;
import xsna.km50;
import xsna.l9v0;
import xsna.mk50;
import xsna.naw0;
import xsna.oz50;
import xsna.qaw0;
import xsna.raw0;
import xsna.s3q0;
import xsna.sf90;
import xsna.u3r0;
import xsna.vaw0;
import xsna.vk50;
import xsna.waw0;
import xsna.xn50;
import xsna.yaw0;

/* compiled from: VmojiRecommendationsFragment.kt */
/* loaded from: classes7.dex */
public final class VmojiRecommendationsFragment extends MviImplFragment<qaw0, abw0, naw0> implements ies {
    public yaw0 Q;

    /* compiled from: VmojiRecommendationsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VmojiRecommendationsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<naw0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(naw0 naw0Var) {
            VmojiRecommendationsFragment vmojiRecommendationsFragment = (VmojiRecommendationsFragment) this.receiver;
            vmojiRecommendationsFragment.getClass();
            xn50.a.c(vmojiRecommendationsFragment, naw0Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        yaw0 yaw0Var = new yaw0(requireContext(), new b(1, this, VmojiRecommendationsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), getViewLifecycleOwner());
        this.Q = yaw0Var;
        return new mk50.c(yaw0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        abw0 abw0Var = (abw0) ao50Var;
        yaw0 yaw0Var = this.Q;
        if (yaw0Var == null) {
            yaw0Var = null;
        }
        yaw0Var.getClass();
        gm50.a.b(yaw0Var, abw0Var.a, new l9v0(yaw0Var, 2));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        RecommendationsBlockModel recommendationsBlockModel = (RecommendationsBlockModel) bundle.getParcelable("arg_recommendations_block");
        return new qaw0(new vaw0(new waw0.a(recommendationsBlockModel.b, recommendationsBlockModel.c, recommendationsBlockModel.f, waw0.a.AbstractC3923a.C3924a.a, new sf90.b(recommendationsBlockModel.e))), new hhd0(this), new raw0(new u3r0()), bundle.getString("arg_current_character_id", null));
    }
}
