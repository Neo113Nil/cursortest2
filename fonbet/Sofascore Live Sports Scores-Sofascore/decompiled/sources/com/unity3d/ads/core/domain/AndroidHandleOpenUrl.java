package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.a70;
import defpackage.b98;
import defpackage.gki;
import defpackage.il4;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.z88;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/IntentCreation;", "intentCreation", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "url", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "action", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {

    @NotNull
    private final Context context;

    @NotNull
    private final IntentCreation intentCreation;

    public AndroidHandleOpenUrl(@NotNull Context context, @NotNull IntentCreation intentCreation) {
        context.getClass();
        intentCreation.getClass();
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull final AdObject adObject, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull rq3<? super Boolean> rq3Var) {
        AndroidHandleOpenUrl$invoke$1 androidHandleOpenUrl$invoke$1;
        int i;
        Object u2gVar;
        boolean z2;
        if (rq3Var instanceof AndroidHandleOpenUrl$invoke$1) {
            androidHandleOpenUrl$invoke$1 = (AndroidHandleOpenUrl$invoke$1) rq3Var;
            int i2 = androidHandleOpenUrl$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleOpenUrl$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleOpenUrl$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidHandleOpenUrl$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    Intent invoke = this.intentCreation.invoke(str, str2, str3, map);
                    if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                        invoke.setFlags(268435456);
                        try {
                            p2g p2gVar = w2g.b;
                            this.context.startActivity(invoke);
                            u2gVar = Unit.a;
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        z2 = !(u2gVar instanceof u2g);
                        return Boolean.valueOf(z2);
                    }
                    final gki gkiVar = new gki(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new AndroidHandleOpenUrl$invoke$result$1(adObject, invoke, z, null));
                    z88 z88Var = new z88() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements b98 {
                            final /* synthetic */ AdObject $adObject$inlined;
                            final /* synthetic */ b98 $this_unsafeFlow;

                            @il4(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", l = {50}, m = "emit")
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends sq3 {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(rq3 rq3Var) {
                                    super(rq3Var);
                                }

                                @Override // defpackage.h21
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(b98 b98Var, AdObject adObject) {
                                this.$this_unsafeFlow = b98Var;
                                this.$adObject$inlined = adObject;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // defpackage.b98
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, rq3 rq3Var) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (rq3Var instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) rq3Var;
                                    int i2 = anonymousClass1.label;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        lu3 lu3Var = lu3.a;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            y6a.M(obj2);
                                            b98 b98Var = this.$this_unsafeFlow;
                                            DisplayMessage displayMessage = (DisplayMessage) obj;
                                            if ((displayMessage instanceof DisplayMessage.OpenUrlResult) && Intrinsics.c(displayMessage.getOpportunityId(), ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                                anonymousClass1.label = 1;
                                                if (b98Var.emit(obj, anonymousClass1) == lu3Var) {
                                                    return lu3Var;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            y6a.M(obj2);
                                        }
                                        return Unit.a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(rq3Var);
                                Object obj22 = anonymousClass1.result;
                                lu3 lu3Var2 = lu3.a;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.a;
                            }
                        }

                        @Override // defpackage.z88
                        public Object collect(b98 b98Var, rq3 rq3Var2) {
                            Object collect = z88.this.collect(new AnonymousClass2(b98Var, adObject), rq3Var2);
                            return collect == lu3.a ? collect : Unit.a;
                        }
                    };
                    androidHandleOpenUrl$invoke$1.label = 1;
                    obj = rd0.y(z88Var, androidHandleOpenUrl$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                z2 = ((DisplayMessage.OpenUrlResult) obj).getSuccess();
                return Boolean.valueOf(z2);
            }
        }
        androidHandleOpenUrl$invoke$1 = new AndroidHandleOpenUrl$invoke$1(this, rq3Var);
        Object obj2 = androidHandleOpenUrl$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidHandleOpenUrl$invoke$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        z2 = ((DisplayMessage.OpenUrlResult) obj2).getSuccess();
        return Boolean.valueOf(z2);
    }
}
