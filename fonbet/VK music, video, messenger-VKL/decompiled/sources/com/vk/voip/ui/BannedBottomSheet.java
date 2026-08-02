package com.vk.voip.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.voip.ui.ext.VKCallUserInputData;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.gr3;
import xsna.l7s;
import xsna.m7;
import xsna.whr0;
import xsna.x59;
import xsna.zx;

/* compiled from: BannedBottomSheet.kt */
/* loaded from: classes7.dex */
public final class BannedBottomSheet extends StaticBottomSheetFragment {
    public static final /* synthetic */ int R = 0;
    public whr0 P;
    public boolean Q;

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.voip_banned_bottom_sheet, viewGroup, false);
        AvatarView avatarView = (AvatarView) inflate.findViewById(R.id.banned_avatar);
        whr0 whr0Var = this.P;
        if (whr0Var == null) {
            whr0Var = null;
        }
        x59.a(avatarView, whr0Var.b);
        TextView textView = (TextView) inflate.findViewById(R.id.banned_subtitle);
        whr0 whr0Var2 = this.P;
        textView.setText(getString((whr0Var2 == null ? null : whr0Var2).c ? R.string.voip_she_was_banned : R.string.voip_he_was_banned, (whr0Var2 != null ? whr0Var2 : null).e()));
        if (!this.Q) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.banned_white_button);
            textView2.setText(R.string.voip_understood);
            bwt0.i0(textView2, new m7(this, 9));
            ((TextView) inflate.findViewById(R.id.banned_black_button)).setVisibility(8);
            return inflate;
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.banned_white_button);
        textView3.setText(R.string.voip_forgive_and_add);
        bwt0.i0(textView3, new zx(this, 6));
        TextView textView4 = (TextView) inflate.findViewById(R.id.banned_black_button);
        textView4.setText(R.string.voip_do_not_add);
        bwt0.i0(textView4, new gr3(this, 3));
        return inflate;
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        whr0 whr0Var;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            VKCallUserInputData vKCallUserInputData = (VKCallUserInputData) arguments.getParcelable("call_member");
            if (vKCallUserInputData == null || (whr0Var = vKCallUserInputData.b) == null) {
                throw new IllegalArgumentException("no call member passed to args");
            }
            this.P = whr0Var;
            this.Q = arguments.getBoolean("has_callback");
        }
    }
}
