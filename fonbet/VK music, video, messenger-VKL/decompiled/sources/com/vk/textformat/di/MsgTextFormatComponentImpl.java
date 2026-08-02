package com.vk.textformat.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dw9;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.ib3;
import xsna.nwy;
import xsna.p040;
import xsna.pwj0;
import xsna.qcy;
import xsna.r040;

/* compiled from: MsgTextFormatComponentImpl.kt */
/* loaded from: classes11.dex */
public final class MsgTextFormatComponentImpl implements MsgTextFormatComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(MsgTextFormatComponentImpl.class, "msgTextFormatFeature", "getMsgTextFormatFeature()Lcom/vk/textformat/feature/MsgTextFormatFeature;", 0), fp.c(0, MsgTextFormatComponentImpl.class, "textFormatFormatter", "getTextFormatFormatter()Lcom/vk/textformat/formatter/MsgTextFormatFormatter;", fpf0.a)};
    public final nwy a = new nwy(new dw9(4));
    public final nwy b = new nwy(new ib3(6));

    /* compiled from: MsgTextFormatComponentImpl.kt */
    public static final class a implements c8m<MsgTextFormatComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MsgTextFormatComponentImpl();
        }
    }

    @Override // com.vk.textformat.di.MsgTextFormatComponent
    public final r040 ed() {
        qcy<Object> qcyVar = c[1];
        return (r040) this.b.c();
    }

    @Override // com.vk.textformat.di.MsgTextFormatComponent
    public final p040 t3() {
        qcy<Object> qcyVar = c[0];
        return (p040) this.a.c();
    }
}
