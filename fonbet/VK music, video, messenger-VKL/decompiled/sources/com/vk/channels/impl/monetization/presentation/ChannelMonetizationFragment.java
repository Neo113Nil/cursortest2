package com.vk.channels.impl.monetization.presentation;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.internal.storage.delegates.messages.b;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import xsna.a1w;
import xsna.ao50;
import xsna.c4b;
import xsna.dy2;
import xsna.e4b;
import xsna.fpf0;
import xsna.gm50;
import xsna.ikv0;
import xsna.k4b;
import xsna.km50;
import xsna.l4b;
import xsna.m7;
import xsna.m7m;
import xsna.mk50;
import xsna.oib;
import xsna.oz50;
import xsna.q1w;
import xsna.rm0;
import xsna.vk50;
import xsna.x3b;
import xsna.y3b;
import xsna.zx;

/* compiled from: ChannelMonetizationFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelMonetizationFragment extends MviImplFragment<y3b, l4b, x3b> {
    public static final /* synthetic */ int T = 0;
    public k4b Q;
    public c4b R;
    public e4b S;

    /* compiled from: ChannelMonetizationFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, UserId userId2) {
            super(ChannelMonetizationFragment.class, null, null);
            s(true);
            this.j.putParcelable("owner_id_key", userId);
            this.j.putParcelable("channel_id_key", userId2);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.im_channel_monetization_fragment, (ViewGroup) null);
        this.Q = new k4b(inflate, this, new b(this, 21));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        l4b l4bVar = (l4b) ao50Var;
        k4b k4bVar = this.Q;
        if (k4bVar != null) {
            gm50.a.b(this, l4bVar.a, new rm0(2, this, k4bVar));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        y3b y3bVar = (y3b) vk50Var;
        y3bVar.j.a(new m7(this, 23), this);
        y3bVar.k.a(new zx(this, 16), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.R = new c4b(requireContext(), ((LinksBridgeComponent) m7m.d(this).a(fpf0.a(LinksBridgeComponent.class))).p(), new g(this, 13));
        this.S = new e4b(requireContext(), new com.vk.im.engine.internal.api_commands.messages.a(this, 10));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ikv0 ikv0Var;
        super.onDestroy();
        e4b e4bVar = this.S;
        if (e4bVar != null && (ikv0Var = e4bVar.c) != null) {
            ikv0Var.a();
        }
        this.R = null;
        this.S = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getFeature().C(x3b.b.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(x3b.a.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r8 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        UserId userId2;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments.getParcelable("owner_id_key", UserId.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments.getParcelable("owner_id_key");
                if (!(parcelable5 instanceof UserId)) {
                    parcelable5 = null;
                }
                parcelable3 = (UserId) parcelable5;
            }
            userId = (UserId) parcelable3;
        }
        userId = UserId.d;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("channel_id_key", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable6 = arguments2.getParcelable("channel_id_key");
                if (!(parcelable6 instanceof UserId)) {
                    parcelable6 = null;
                }
                parcelable = (UserId) parcelable6;
            }
            userId2 = (UserId) parcelable;
        }
        userId2 = UserId.d;
        UserId userId3 = userId2;
        a1w a1wVar = q1w.a;
        return new y3b(userId, userId3, a1wVar != null ? a1wVar : null, new oib(), new dy2());
    }
}
