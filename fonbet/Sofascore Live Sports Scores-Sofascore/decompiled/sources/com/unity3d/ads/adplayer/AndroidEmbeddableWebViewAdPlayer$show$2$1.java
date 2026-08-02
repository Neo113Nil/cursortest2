package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import defpackage.a70;
import defpackage.b98;
import defpackage.ddi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {46, 47}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$2$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, rq3<? super AndroidEmbeddableWebViewAdPlayer$show$2$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2$1(this.this$0, this.$showOptions, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r6.requestShow(r1, r5) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LifecycleDataSource lifecycleDataSource;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
            Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pvd.x();
                return null;
            }
            y6a.M(obj);
        }
        lifecycleDataSource = this.this$0.lifecycleDataSource;
        ddi appActive = lifecycleDataSource.getAppActive();
        final AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
        b98 b98Var = new b98() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1.1
            public final Object emit(boolean z, rq3<? super Unit> rq3Var) {
                Object sendFocusChange = AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.sendFocusChange(z, rq3Var);
                return sendFocusChange == lu3.a ? sendFocusChange : Unit.a;
            }

            @Override // defpackage.b98
            public /* bridge */ /* synthetic */ Object emit(Object obj2, rq3 rq3Var) {
                return emit(((Boolean) obj2).booleanValue(), (rq3<? super Unit>) rq3Var);
            }
        };
        this.label = 2;
    }
}
