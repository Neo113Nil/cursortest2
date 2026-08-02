package com.vk.movika.sdk.android.defaultplayer.control;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRendererView;
import xsna.afw;
import xsna.eef;
import xsna.g2v;
import xsna.qot0;
import xsna.tfy;
import xsna.ufy;
import xsna.utj;
import xsna.y4l0;
import xsna.yfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.movika.sdk.base.model.j jVar = (com.vk.movika.sdk.base.model.j) obj;
                com.vk.movika.sdk.android.defaultplayer.container.a aVar = ((k) obj2).c;
                if (aVar != null) {
                    aVar.b(jVar);
                    break;
                }
                break;
            case 1:
                afw afwVar = (afw) obj2;
                Context context = (Context) obj;
                Editable text = afwVar.c.getText();
                StringBuilder sb = new StringBuilder();
                int length = text.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = text.charAt(i2);
                    if (Character.isDigit(charAt) || charAt == '+') {
                        sb.append(charAt);
                    }
                }
                Intent intent = new Intent("com.android.contacts.action.SHOW_OR_CREATE_CONTACT", Uri.parse("tel:" + sb.toString()));
                intent.putExtra("com.android.contacts.action.FORCE_CREATE", true);
                context.startActivity(intent, yfb.a());
                afwVar.dismiss();
                break;
            case 2:
                ufy ufyVar = (ufy) obj;
                y4l0 y4l0Var = ((tfy) obj2).l;
                if (y4l0Var != null) {
                    y4l0Var.m(ufyVar.b);
                    break;
                }
                break;
            case 3:
                TextStatRendererView._init_$lambda$0((Context) obj2, (TextStatRendererView) obj, view);
                break;
            case 4:
                int i3 = TransferInputFieldView.p;
                g2v.c().b().d(((Dialog) obj).Sb().longValue(), ((TransferInputFieldView) obj2).getContext());
                break;
            default:
                Pair pair = (Pair) obj;
                qot0 qot0Var = qot0.this;
                qot0Var.s = null;
                utj utjVar = qot0Var.q;
                if (utjVar != null) {
                    utjVar.b();
                }
                ((eef) qot0Var.h.getValue()).c(((ClipUploadJob) pair.i()).b);
                break;
        }
    }
}
