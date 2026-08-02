package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a530;
import xsna.ao50;
import xsna.bpn0;
import xsna.dw20;
import xsna.e430;
import xsna.fpf0;
import xsna.gzs;
import xsna.km50;
import xsna.mk50;
import xsna.nf3;
import xsna.nly;
import xsna.p5j;
import xsna.qcy;
import xsna.qdz;
import xsna.rd1;
import xsna.s3q0;
import xsna.tl50;
import xsna.vex;
import xsna.vk50;
import xsna.w620;
import xsna.w8i;
import xsna.xa9;

/* compiled from: ModerationBlockedItemDialog.kt */
/* loaded from: classes18.dex */
public final class b extends tl50<d, i, com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a> implements w8i {
    public static final /* synthetic */ qcy<Object>[] n1 = {new MutablePropertyReference1Impl(b.class, "contentView", "getContentView()Lcom/vk/ecomm/moderation/impl/restrictions/dialogs/blocked/ModerationBlockedItemView;", 0), p5j.a(0, b.class, "args", "getArgs()Lcom/vk/ecomm/moderation/impl/restrictions/dialogs/blocked/ModerationBlockedItemArgs;", fpf0.a)};
    public FunctionReferenceImpl k1;
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public final bpn0 l1 = new bpn0(new vex(this, 4));
    public final bpn0 m1 = new bpn0(new nly(this, 8));

    /* compiled from: ModerationBlockedItemDialog.kt */
    public static final class a extends dw20.b {
        public final boolean e;
        public final UserId f;
        public final long g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final FunctionReferenceImpl l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, UserId userId, long j, String str, String str2, String str3, String str4, gzs<s3q0> gzsVar, Context context) {
            super(context, null);
            this.e = z;
            this.f = userId;
            this.g = j;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = str4;
            this.l = (FunctionReferenceImpl) gzsVar;
            C(0.3f);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            bVar.k1 = this.l;
            Bundle bundle = new Bundle();
            String l = fpf0.a(ModerationBlockedItemArgs.class).l();
            String str = this.h;
            String str2 = str == null ? "" : str;
            String str3 = this.i;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.j;
            bundle.putParcelable(l, new ModerationBlockedItemArgs(this.e, this.f, this.g, str2, str4, str5 == null ? "" : str5, this.k));
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        qcy<Object>[] qcyVarArr = n1;
        h hVar = new h(requireContext, this, ((ModerationBlockedItemArgs) this.j1.getValue(this, qcyVarArr[1])).b);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = hVar;
        return new mk50.c(((h) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((h) this.i1.getValue(this, n1[0])).f((i) ao50Var, new xa9(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        d dVar = (d) vk50Var;
        dVar.j.a(new w620(this, 1), this);
        dVar.k.a(new rd1(29), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void dismiss() {
        ?? r0 = this.k1;
        if (r0 != 0) {
            r0.invoke();
        }
        super.dismiss();
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        String l = fpf0.a(ModerationBlockedItemArgs.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable(l, ModerationBlockedItemArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable(l);
            if (!(parcelable3 instanceof ModerationBlockedItemArgs)) {
                parcelable3 = null;
            }
            parcelable = (ModerationBlockedItemArgs) parcelable3;
        }
        ModerationBlockedItemArgs moderationBlockedItemArgs = (ModerationBlockedItemArgs) parcelable;
        if (moderationBlockedItemArgs == null) {
            return;
        }
        qcy<Object> qcyVar = n1[1];
        this.j1.c = moderationBlockedItemArgs;
        super.onCreate(bundle);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new d(new g(new e430(null, "", "", false)), (ModerationBlockedItemArgs) this.j1.getValue(this, n1[1]), (qdz) this.l1.getValue(), (a530) this.m1.getValue());
    }
}
