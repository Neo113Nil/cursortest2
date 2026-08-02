package com.vk.movika.sdk.base.data.converter;

import android.os.Parcelable;
import android.text.Editable;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.writebar.WriteBar;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.time.Instant;
import kotlin.collections.EmptyList;
import xsna.c4m0;
import xsna.ce60;
import xsna.d2h0;
import xsna.e1y0;
import xsna.e2h0;
import xsna.ezi0;
import xsna.f2h0;
import xsna.f5z;
import xsna.gz20;
import xsna.hg1;
import xsna.ify;
import xsna.izs;
import xsna.kz30;
import xsna.lxa;
import xsna.nuv;
import xsna.sjg;
import xsna.u76;
import xsna.vr0;

/* loaded from: classes3.dex */
public class c implements sjg, e2h0, e1y0, gz20 {
    public final Object b;

    public /* synthetic */ c(Object obj) {
        this.b = obj;
    }

    @Override // xsna.sjg
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        hg1.a(cVar, (f5z) this.b);
    }

    @Override // xsna.e1y0
    public void e(Editable editable) {
        kz30 kz30Var = (kz30) this.b;
        WriteBar writeBar = kz30Var.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setBotKeyboardAllowed(kz30Var.f());
        kz30.M(kz30Var.M);
        if (!kz30Var.f()) {
            kz30.K(kz30Var.N);
        }
        if (editable.length() > 0 && !kz30Var.r && kz30Var.n == kz30.c.NORMAL) {
            ChatFragment.k kVar = kz30Var.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.getClass();
            ezi0.b bVar = ezi0.d;
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            bVar.a(chatFragment.io(), chatFragment.no().b, chatFragment.ho(), ComposingType.TEXT);
        }
        ChatFragment.k kVar2 = kz30Var.K;
        if (kVar2 == null) {
            kVar2 = null;
        }
        ChatFragment chatFragment2 = ChatFragment.this;
        ChatFragment.d dVar2 = ChatFragment.w1;
        chatFragment2.po();
        WriteBar writeBar2 = kz30Var.t;
        (writeBar2 != null ? writeBar2 : null).I();
    }

    @Override // xsna.sjg
    public String getRef() {
        ce60 ce60Var = ce60.b;
        return ce60.k(ce60Var, ce60Var.i());
    }

    @Override // xsna.e2h0
    public Object i(f2h0 f2h0Var, Object obj) {
        return (Parcelable) ((d2h0) obj).e();
    }

    @Override // xsna.e1y0
    public void j() {
        kz30 kz30Var = (kz30) this.b;
        int i = ify.a;
        if (ify.e(ify.c)) {
            kz30Var.h(MsgSendHidePopupsReason.OTHER);
        } else {
            kz30Var.N();
        }
    }

    @Override // xsna.e2h0
    public Object k(Object obj) {
        return (d2h0) ((izs) this.b).invoke(new nuv((Parcelable) obj, 2));
    }

    @Override // xsna.gz20
    public void onCancel() {
        u76 u76Var = ((c4m0) this.b).e;
        u76Var.o5().h();
        u76Var.i4();
    }

    public c(lxa lxaVar) {
        this.b = lxaVar.e.U(new q1(new vr0(6)));
    }

    public c(Instant instant, int i) {
        this.b = instant;
    }

    public c(c cVar, boolean z) {
        this.b = (Instant) cVar.b;
    }

    public c(int i) {
        this.b = com.vk.movika.sdk.base.data.b.a(EmptyList.b);
    }
}
