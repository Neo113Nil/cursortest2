package com.vk.im.ui.fragments.chat;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.attaches.AttachDoc;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.fxs;
import xsna.gzs;
import xsna.izs;
import xsna.r5q0;
import xsna.s3q0;
import xsna.uqb;
import xsna.y31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) obj4;
                Dialog dialog = (Dialog) obj3;
                Msg msg = (Msg) obj2;
                AttachDoc attachDoc = (AttachDoc) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                if (attachDoc.t && attachDoc.X6()) {
                    r5q0.a aVar = new r5q0.a();
                    aVar.a = attachDoc.getFileName();
                    aVar.b = attachDoc.k;
                    aVar.c = new uqb(chatFragment, dialog, msg, attachDoc);
                    aVar.a(chatFragment.getChildFragmentManager()).Wn(chatFragment.getChildFragmentManager(), null);
                } else {
                    chatFragment.Io(dialog, msg, attachDoc);
                }
                break;
            case 1:
                com.vk.contacts.c.b.P0((Context) obj4, false, (gzs) obj3, (izs) obj2);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            default:
                ((fxs) obj4).w((Activity) obj3, (y31.a) obj2, (WebAdConfig) obj, false, AdRequestPurpose.LOAD_NEXT_INSTANCE);
                break;
        }
        return s3q0.a;
    }
}
