package com.vk.im.ui.components.msg_view.header;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.j;
import io.reactivex.rxjava3.internal.operators.single.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a1w;
import xsna.asp;
import xsna.bzb0;
import xsna.cvh;
import xsna.cvm;
import xsna.e9w;
import xsna.f9w;
import xsna.g9b;
import xsna.h5b;
import xsna.izs;
import xsna.j8i;
import xsna.m140;
import xsna.om1;
import xsna.op5;
import xsna.s3q0;
import xsna.sl30;
import xsna.xk30;
import xsna.zk70;
import xsna.zrp;

/* compiled from: MsgViewHeaderComponent.kt */
/* loaded from: classes2.dex */
public final class MsgViewHeaderComponent extends j8i {
    public static final f9w o = e9w.a(MsgViewHeaderComponent.class);
    public final a1w i;
    public final DialogExt j;
    public final bzb0 k;
    public Type l = Type.DEFAULT;
    public m140 m;
    public op5 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgViewHeaderComponent.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DEFAULT;
        public static final Type PINNED;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("PINNED", 1);
            PINNED = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MsgViewHeaderComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.PINNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgViewHeaderComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            MsgViewHeaderComponent msgViewHeaderComponent = (MsgViewHeaderComponent) this.receiver;
            f9w f9wVar = MsgViewHeaderComponent.o;
            msgViewHeaderComponent.getClass();
            MsgViewHeaderComponent.o.a(th2);
            zk70.e(th2);
            return s3q0.a;
        }
    }

    public MsgViewHeaderComponent(FragmentActivity fragmentActivity, a1w a1wVar, DialogExt dialogExt) {
        this.i = a1wVar;
        this.j = dialogExt;
        this.k = new bzb0(fragmentActivity);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        m140 m140Var = new m140(layoutInflater, viewGroup);
        this.m = m140Var;
        m140Var.g = new com.vk.movika.sdk.base.asset.b(this);
        Y0();
        m140 m140Var2 = this.m;
        if (m140Var2 == null) {
            m140Var2 = null;
        }
        return m140Var2.a;
    }

    @Override // xsna.j8i
    public final void N0() {
        m140 m140Var = this.m;
        if (m140Var == null) {
            m140Var = null;
        }
        ((com.vk.im.popup.a) m140Var.d.getValue()).dismiss();
    }

    public final void X0(boolean z) {
        I0(new j(new n(this.i.E(this, new cvm(this.j.f, z, null)), new xk30(new cvh(this, 24), 2)), new g9b(this, 2)).subscribe(new sl30(new h5b(this, z, 2), 1), new om1(new b(1, this, MsgViewHeaderComponent.class, "onCmdError", "onCmdError(Ljava/lang/Throwable;)V", 0), 29)));
    }

    public final void Y0() {
        ChatSettings Hb;
        int i = a.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i == 1) {
            m140 m140Var = this.m;
            Toolbar toolbar = (m140Var != null ? m140Var : null).c;
            toolbar.getMenu().clear();
            toolbar.setTitle(R.string.vkim_msg_view_mode_default);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        m140 m140Var2 = this.m;
        if (m140Var2 == null) {
            m140Var2 = null;
        }
        Toolbar toolbar2 = m140Var2.c;
        toolbar2.l(R.menu.vkim_menu_pinned_msg);
        toolbar2.setTitle(R.string.vkim_msg_view_mode_pinned);
        Dialog Cb = this.j.Cb();
        m140 m140Var3 = this.m;
        m140 m140Var4 = m140Var3 != null ? m140Var3 : null;
        boolean z = false;
        boolean ec = Cb != null ? Cb.ec() : false;
        if (Cb != null && (Hb = Cb.Hb()) != null) {
            z = Hb.q;
        }
        m140Var4.e = ec;
        m140Var4.f = z;
    }
}
