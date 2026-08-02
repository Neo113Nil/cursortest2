package com.vk.vmoji.character;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.vmoji.character.model.CharacterContext;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bjm0;
import xsna.bo8;
import xsna.bwt0;
import xsna.e6w0;
import xsna.e8w0;
import xsna.epx;
import xsna.gm50;
import xsna.i8w0;
import xsna.ies;
import xsna.izs;
import xsna.kcl0;
import xsna.km50;
import xsna.ksg0;
import xsna.m6w0;
import xsna.mcj0;
import xsna.mk50;
import xsna.o25;
import xsna.oz50;
import xsna.p8w0;
import xsna.s3q0;
import xsna.t6g0;
import xsna.u3r0;
import xsna.v7w0;
import xsna.vk50;
import xsna.w6w0;
import xsna.xn50;
import xsna.y7w0;
import xsna.zq70;

/* compiled from: VmojiCharacterFragment.kt */
/* loaded from: classes7.dex */
public final class VmojiCharacterFragment extends MviImplFragment<m6w0, i8w0, e6w0> implements ies {
    public final kcl0 Q;
    public e8w0 R;
    public w6w0 S;

    /* compiled from: VmojiCharacterFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VmojiCharacterFragment.kt */
    public static final class b extends oz50 {
    }

    /* compiled from: VmojiCharacterFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<e6w0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(e6w0 e6w0Var) {
            VmojiCharacterFragment vmojiCharacterFragment = (VmojiCharacterFragment) this.receiver;
            vmojiCharacterFragment.getClass();
            xn50.a.c(vmojiCharacterFragment, e6w0Var);
            return s3q0.a;
        }
    }

    public VmojiCharacterFragment() {
        t6g0 t6g0Var = t6g0.b;
        this.Q = t6g0.d();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        e8w0 e8w0Var = new e8w0(requireContext(), new c(1, this, VmojiCharacterFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), getViewLifecycleOwner());
        this.R = e8w0Var;
        return new mk50.c(e8w0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        i8w0 i8w0Var = (i8w0) ao50Var;
        e8w0 e8w0Var = this.R;
        if (e8w0Var == null) {
            e8w0Var = null;
        }
        e8w0Var.getClass();
        gm50.a.b(e8w0Var, i8w0Var.c, new mcj0(e8w0Var, 29));
        gm50.a.b(e8w0Var, i8w0Var.b, new bjm0(e8w0Var, 19));
        gm50.a.b(e8w0Var, i8w0Var.a, new ksg0(e8w0Var, 28));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        e8w0 e8w0Var = this.R;
        if (e8w0Var == null) {
            e8w0Var = null;
        }
        if (!bwt0.K(e8w0Var.t.a)) {
            return false;
        }
        e8w0Var.c.invoke(e6w0.e.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Object obj;
        VmojiAvatar vmojiAvatar;
        VmojiAvatar vmojiAvatar2;
        CharacterContext characterContext;
        VmojiAvatar vmojiAvatar3;
        Integer d = bo8.d(bundle, "arg_pack_id");
        kcl0 kcl0Var = this.Q;
        VmojiAvatarModel p = kcl0Var.p();
        boolean z = p != null;
        VmojiAvatar vmojiAvatar4 = (VmojiAvatar) bundle.getParcelable("arg_avatar");
        if (vmojiAvatar4 != null) {
            vmojiAvatar = vmojiAvatar4;
        } else {
            UserId userId = (UserId) bundle.getParcelable("arg_user_id");
            String string = bundle.getString("arg_character_id");
            Iterator it = kcl0Var.U().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                VmojiAvatar vmojiAvatar5 = ((StickerStockItem) obj).H;
                if (epx.f(vmojiAvatar5 != null ? vmojiAvatar5.Ab() : null, string)) {
                    break;
                }
            }
            StickerStockItem stickerStockItem = (StickerStockItem) obj;
            vmojiAvatar = new VmojiAvatar(userId + '_' + string, string, "", (stickerStockItem == null || (vmojiAvatar2 = stickerStockItem.H) == null || !vmojiAvatar2.Cb()) ? false : true, null, 16, null);
        }
        UserId a2 = p8w0.a(vmojiAvatar);
        if (o25.a().a(a2)) {
            if (epx.f((p == null || (vmojiAvatar3 = p.b) == null) ? null : vmojiAvatar3.getId(), vmojiAvatar.getId())) {
                characterContext = CharacterContext.MY_CHARACTER;
                CharacterContext characterContext2 = characterContext;
                y7w0 y7w0Var = new y7w0(this);
                w6w0 w6w0Var = new w6w0(new u3r0(), new zq70(), this.Q, a2, d, characterContext2, z);
                this.S = w6w0Var;
                v7w0 v7w0Var = new v7w0(w6w0Var, a2);
                w6w0 w6w0Var2 = this.S;
                return new m6w0(v7w0Var, w6w0Var2 == null ? w6w0Var2 : null, y7w0Var, requireContext(), vmojiAvatar);
            }
        }
        characterContext = !o25.a().a(a2) ? CharacterContext.OTHER_CHARACTER : CharacterContext.UNKNOWN;
        CharacterContext characterContext22 = characterContext;
        y7w0 y7w0Var2 = new y7w0(this);
        w6w0 w6w0Var3 = new w6w0(new u3r0(), new zq70(), this.Q, a2, d, characterContext22, z);
        this.S = w6w0Var3;
        v7w0 v7w0Var2 = new v7w0(w6w0Var3, a2);
        w6w0 w6w0Var22 = this.S;
        return new m6w0(v7w0Var2, w6w0Var22 == null ? w6w0Var22 : null, y7w0Var2, requireContext(), vmojiAvatar);
    }
}
