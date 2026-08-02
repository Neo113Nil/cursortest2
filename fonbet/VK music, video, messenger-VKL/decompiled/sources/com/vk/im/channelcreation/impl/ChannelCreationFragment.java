package com.vk.im.channelcreation.impl;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.im.channelcreation.impl.a;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.b25;
import xsna.ewy;
import xsna.fpf0;
import xsna.ies;
import xsna.j7g0;
import xsna.m7m;
import xsna.mxv;
import xsna.nwy;
import xsna.oz50;
import xsna.ozo;
import xsna.qcy;
import xsna.r6k;
import xsna.xul;
import xsna.yj50;

/* compiled from: ChannelCreationFragment.kt */
/* loaded from: classes2.dex */
public final class ChannelCreationFragment extends MultiComponentFragment implements ies {

    /* compiled from: ChannelCreationFragment.kt */
    public static final class a extends oz50 {
        public a(b bVar) {
            super(ChannelCreationFragment.class, null, null);
            if (bVar instanceof b.a) {
                this.j.putLong("parent_id", ((b.a) bVar).a);
            } else {
                if (!(bVar instanceof b.C1091b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.j.putLong("channel_id", ((b.C1091b) bVar).a);
            }
        }
    }

    /* compiled from: ChannelCreationFragment.kt */
    public static abstract class b {

        /* compiled from: ChannelCreationFragment.kt */
        public static final class a extends b {
            public final long a;

            public a(long j) {
                this.a = j;
            }
        }

        /* compiled from: ChannelCreationFragment.kt */
        /* renamed from: com.vk.im.channelcreation.impl.ChannelCreationFragment$b$b, reason: collision with other inner class name */
        public static final class C1091b extends b {
            public final long a;

            public C1091b(long j) {
                this.a = j;
            }
        }
    }

    public ChannelCreationFragment() {
        super(R.layout.im_channel_creation_fragment);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ho(g.c.b);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        ChannelCreationInternalDiComponent channelCreationInternalDiComponent = (ChannelCreationInternalDiComponent) m7m.d(this).mo408a(fpf0.a(ChannelCreationInternalDiComponent.class));
        Bundle requireArguments = requireArguments();
        a.AbstractC1092a bVar = requireArguments.containsKey("channel_id") ? new a.AbstractC1092a.b(requireArguments.getLong("channel_id")) : new a.AbstractC1092a.C1093a(requireArguments.getLong("parent_id"));
        ewy ewyVar = channelCreationInternalDiComponent.c;
        qcy<Object>[] qcyVarArr = ChannelCreationInternalDiComponent.j;
        qcy<Object> qcyVar = qcyVarArr[0];
        r6k r6kVar = (r6k) ewyVar.c();
        ewy ewyVar2 = channelCreationInternalDiComponent.d;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        ozo ozoVar = (ozo) ewyVar2.c();
        ewy ewyVar3 = channelCreationInternalDiComponent.e;
        qcy<Object> qcyVar3 = qcyVarArr[2];
        j7g0 j7g0Var = (j7g0) ewyVar3.c();
        ewy ewyVar4 = channelCreationInternalDiComponent.f;
        qcy<Object> qcyVar4 = qcyVarArr[3];
        xul xulVar = (xul) ewyVar4.c();
        nwy nwyVar = channelCreationInternalDiComponent.h;
        qcy<Object> qcyVar5 = qcyVarArr[5];
        mxv mxvVar = (mxv) nwyVar.c();
        nwy nwyVar2 = channelCreationInternalDiComponent.g;
        qcy<Object> qcyVar6 = qcyVarArr[4];
        return Collections.singletonList(new com.vk.im.channelcreation.impl.a(this, this, bVar, r6kVar, ozoVar, j7g0Var, xulVar, mxvVar, (b25) nwyVar2.c(), channelCreationInternalDiComponent.Df()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        if (i2 == -1 && i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra(X3.i.b);
            if (stringExtra == null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("output", Uri.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("output");
                    if (!(parcelableExtra2 instanceof Uri)) {
                        parcelableExtra2 = null;
                    }
                    parcelable = (Uri) parcelableExtra2;
                }
                Uri uri = (Uri) parcelable;
                stringExtra = uri != null ? uri.toString() : null;
                if (stringExtra == null) {
                    stringExtra = "";
                }
            }
            if (stringExtra.length() > 0) {
                ho(new g.n(stringExtra));
            }
        }
    }
}
