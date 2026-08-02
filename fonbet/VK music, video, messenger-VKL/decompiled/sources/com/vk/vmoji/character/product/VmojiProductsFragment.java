package com.vk.vmoji.character.product;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aaw0;
import xsna.ao50;
import xsna.baw0;
import xsna.bwt0;
import xsna.daw0;
import xsna.gaw0;
import xsna.gm50;
import xsna.ies;
import xsna.izs;
import xsna.kcl0;
import xsna.km50;
import xsna.mk50;
import xsna.o9w0;
import xsna.oz50;
import xsna.q9i0;
import xsna.r9w0;
import xsna.s3q0;
import xsna.t6g0;
import xsna.u3r0;
import xsna.vk50;
import xsna.w6w0;
import xsna.xn50;
import xsna.y9w0;
import xsna.zq70;

/* compiled from: VmojiProductsFragment.kt */
/* loaded from: classes7.dex */
public final class VmojiProductsFragment extends MviImplFragment<r9w0, gaw0, o9w0> implements ies {
    public daw0 Q;

    /* compiled from: VmojiProductsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VmojiProductsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<o9w0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(o9w0 o9w0Var) {
            VmojiProductsFragment vmojiProductsFragment = (VmojiProductsFragment) this.receiver;
            vmojiProductsFragment.getClass();
            xn50.a.c(vmojiProductsFragment, o9w0Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        daw0 daw0Var = new daw0(requireContext(), new b(1, this, VmojiProductsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), getViewLifecycleOwner());
        this.Q = daw0Var;
        return new mk50.c(daw0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gaw0 gaw0Var = (gaw0) ao50Var;
        daw0 daw0Var = this.Q;
        if (daw0Var == null) {
            daw0Var = null;
        }
        daw0Var.getClass();
        gm50.a.b(daw0Var, gaw0Var.a, new q9i0(daw0Var, 14));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        daw0 daw0Var = this.Q;
        if (daw0Var == null) {
            daw0Var = null;
        }
        if (!bwt0.K(daw0Var.j.a)) {
            return false;
        }
        daw0Var.c.invoke(o9w0.d.b);
        return true;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VmojiCharacterModel vmojiCharacterModel = (VmojiCharacterModel) bundle.getParcelable("arg_character");
        List<VmojiProductModel> list = vmojiCharacterModel.l;
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        VmojiAvatar vmojiAvatar = vmojiCharacterModel.b;
        return new r9w0(new y9w0(vmojiAvatar.getId(), new baw0.a(vmojiAvatar.getId(), list)), new w6w0(new u3r0(), new zq70(), d, null, null, vmojiCharacterModel.d, vmojiCharacterModel.e), new aaw0(this), requireContext());
    }
}
