package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.GestureSignalData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dco implements orn {
    public final qrn a;
    public final wco b;
    public final View c;
    public final w2o d;

    public dco(mqn mqnVar, wco wcoVar, ViewGroup viewGroup, w2o w2oVar) {
        this.a = mqnVar;
        this.b = wcoVar;
        this.c = viewGroup;
        this.d = w2oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (true == (r0 instanceof java.util.concurrent.TimeoutException)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (true == (r0 instanceof java.util.concurrent.TimeoutException)) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [b2p] */
    /* JADX WARN: Type inference failed for: r13v12, types: [b2p] */
    @Override // defpackage.orn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(lda ldaVar) {
        wco wcoVar = this.b;
        Context context = wcoVar.a;
        ddb ddbVar = wcoVar.d;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        String str = ldaVar.c;
        String str2 = ldaVar.e;
        if (str2 == null) {
            return;
        }
        int ordinal = ldaVar.d.ordinal();
        qrn qrnVar = this.a;
        String str3 = "17";
        View view = this.c;
        if (ordinal != 17) {
            if (ordinal != 95) {
                return;
            }
            u1p u1pVar = u1p.a;
            try {
                u1pVar = (b2p) ddbVar.get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (u1pVar.d()) {
                try {
                    str3 = ((cvo) u1pVar.g()).a.q0(new ObjectWrapper(context), new ObjectWrapper(view), new ObjectWrapper(null));
                } catch (Exception e) {
                    "Failed to get view signal: ".concat(e.toString());
                }
                GestureSignalData.Builder builder = GestureSignalData.builder();
                builder.gestureSignal(str3);
                mqn mqnVar = (mqn) qrnVar;
                mqnVar.d(new lda(JavaScriptMessage$MsgChannel.gestureSignal, JavaScriptMessage$MsgType.viewSignalResponse, str, builder.build(), str2));
                return;
            }
            str3 = "3";
            GestureSignalData.Builder builder2 = GestureSignalData.builder();
            builder2.gestureSignal(str3);
            mqn mqnVar2 = (mqn) qrnVar;
            mqnVar2.d(new lda(JavaScriptMessage$MsgChannel.gestureSignal, JavaScriptMessage$MsgType.viewSignalResponse, str, builder2.build(), str2));
            return;
        }
        javaScriptMsgData.clickString();
        w2o w2oVar = this.d;
        u1p u1pVar2 = u1p.a;
        try {
            u1pVar2 = (b2p) ddbVar.get();
        } catch (InterruptedException | ExecutionException unused2) {
        }
        if (u1pVar2.d()) {
            try {
                m3p listIterator = w2oVar.a().listIterator(0);
                while (listIterator.hasNext()) {
                    ((cvo) u1pVar2.g()).a.t(new ObjectWrapper((MotionEvent) listIterator.next()));
                }
                str3 = ((cvo) u1pVar2.g()).a.R(new ObjectWrapper(context), new ObjectWrapper(""), new ObjectWrapper(view), new ObjectWrapper(null));
            } catch (Exception e2) {
                "Failed to get click signal: ".concat(e2.toString());
            }
            GestureSignalData.Builder builder3 = GestureSignalData.builder();
            builder3.gestureSignal(str3);
            mqn mqnVar3 = (mqn) qrnVar;
            mqnVar3.d(new lda(JavaScriptMessage$MsgChannel.gestureSignal, JavaScriptMessage$MsgType.clickSignalResponse, str, builder3.build(), str2));
        }
        str3 = "3";
        GestureSignalData.Builder builder32 = GestureSignalData.builder();
        builder32.gestureSignal(str3);
        mqn mqnVar32 = (mqn) qrnVar;
        mqnVar32.d(new lda(JavaScriptMessage$MsgChannel.gestureSignal, JavaScriptMessage$MsgType.clickSignalResponse, str, builder32.build(), str2));
    }
}
