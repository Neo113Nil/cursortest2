package com.adsbynimbus.google;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import defpackage.bsk;
import defpackage.cjb;
import defpackage.hcd;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lcd;
import defpackage.lu3;
import defpackage.of;
import defpackage.p2g;
import defpackage.qha;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.u6b;
import defpackage.w2g;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y6a;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {1, 8, 0})
@il4(c = "com.adsbynimbus.google.DynamicPriceRenderer$handleEventForNimbus$1$1", f = "DynamicPriceRenderer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$handleEventForNimbus$1$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    public /* synthetic */ Object r;
    public final /* synthetic */ AdManagerAdView s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPriceRenderer$handleEventForNimbus$1$1(AdManagerAdView adManagerAdView, String str, rq3<? super DynamicPriceRenderer$handleEventForNimbus$1$1> rq3Var) {
        super(2, rq3Var);
        this.s = adManagerAdView;
        this.t = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        DynamicPriceRenderer$handleEventForNimbus$1$1 dynamicPriceRenderer$handleEventForNimbus$1$1 = new DynamicPriceRenderer$handleEventForNimbus$1$1(this.s, this.t, rq3Var);
        dynamicPriceRenderer$handleEventForNimbus$1$1.r = obj;
        return dynamicPriceRenderer$handleEventForNimbus$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((DynamicPriceRenderer$handleEventForNimbus$1$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106 A[Catch: all -> 0x012c, TryCatch #1 {all -> 0x012c, blocks: (B:3:0x000e, B:5:0x001c, B:7:0x0022, B:8:0x0025, B:10:0x0049, B:11:0x0129, B:19:0x0062, B:54:0x00f9, B:55:0x0100, B:57:0x0106, B:59:0x011e), top: B:2:0x000e }] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        Throwable a;
        String asErrorMessage;
        String asErrorMessage2;
        String asErrorMessage3;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        final ku3 ku3Var = (ku3) this.r;
        final AdManagerAdView adManagerAdView = this.s;
        String str = this.t;
        try {
            p2g p2gVar = w2g.b;
            Object tag = adManagerAdView.getTag(com.sofascore.results.R.id.controller);
            Object obj2 = null;
            of ofVar = tag instanceof of ? (of) tag : null;
            if (ofVar != null) {
                ofVar.a();
            }
            final RenderEvent renderEvent = (RenderEvent) DynamicPriceRenderer.getJsonSerializer().b(RenderEvent.INSTANCE.serializer(), str);
            final hcd hcdVar = (hcd) DynamicPriceRenderer.getDynamicPriceAdCache().e(renderEvent.getAuctionId());
            if (hcdVar == null) {
                AdListener adListener = adManagerAdView.getAdListener();
                asErrorMessage3 = DynamicPriceRenderer.getAsErrorMessage("Ad not found in cache");
                adListener.onAdFailedToLoad(new LoadAdError(-7, asErrorMessage3, "Adsbynimbus", null, null));
            } else {
                WeakHashMap weakHashMap = bsk.a;
                if (adManagerAdView.isAttachedToWindow()) {
                    try {
                        Context context = adManagerAdView.getContext();
                        context.getClass();
                        lcd lcdVar = new lcd(context);
                        View childAt = adManagerAdView.getChildAt(0);
                        childAt.getClass();
                        ((ViewGroup) childAt).addView(lcdVar);
                        AdSize adSize = adManagerAdView.getAdSize();
                        if (adSize != null) {
                            ViewGroup.LayoutParams layoutParams = lcdVar.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            Integer num = new Integer(adSize.getWidthInPixels(adManagerAdView.getContext()));
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                layoutParams.width = num.intValue();
                            }
                            Integer num2 = new Integer(adSize.getHeightInPixels(adManagerAdView.getContext()));
                            if (num2.intValue() <= 0) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                layoutParams.height = num2.intValue();
                            }
                            lcdVar.setLayoutParams(layoutParams);
                        }
                        u6b w = qha.w(adManagerAdView);
                        if (w != null) {
                            try {
                                obj2 = xw3.L(wca.x(w.getLifecycle()), null, null, new DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2(adManagerAdView, lcdVar, hcdVar, renderEvent, null), 3);
                            } catch (Throwable th) {
                                th = th;
                                adManagerAdView = adManagerAdView;
                                Throwable th2 = th;
                                p2g p2gVar2 = w2g.b;
                                obj2 = new u2g(th2);
                                if (w2g.a(obj2) != null) {
                                }
                                u2gVar = Unit.a;
                                a = w2g.a(u2gVar);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (w2g.a(obj2) != null) {
                        AdListener adListener2 = adManagerAdView.getAdListener();
                        asErrorMessage2 = DynamicPriceRenderer.getAsErrorMessage("Google layout error");
                        adListener2.onAdFailedToLoad(new LoadAdError(-8, asErrorMessage2, "Adsbynimbus", null, null));
                    }
                } else {
                    adManagerAdView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(adManagerAdView, ku3Var, adManagerAdView, hcdVar, renderEvent) { // from class: com.adsbynimbus.google.DynamicPriceRenderer$handleEventForNimbus$1$1$invokeSuspend$lambda$9$$inlined$doOnAttach$1
                        public final /* synthetic */ View a;
                        public final /* synthetic */ AdManagerAdView b;
                        public final /* synthetic */ hcd c;
                        public final /* synthetic */ RenderEvent d;

                        {
                            this.b = adManagerAdView;
                            this.c = hcdVar;
                            this.d = renderEvent;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(@NotNull View view) {
                            Object u2gVar2;
                            String asErrorMessage4;
                            AdManagerAdView adManagerAdView2 = this.b;
                            view.getClass();
                            this.a.removeOnAttachStateChangeListener(this);
                            try {
                                p2g p2gVar3 = w2g.b;
                                Context context2 = adManagerAdView2.getContext();
                                context2.getClass();
                                lcd lcdVar2 = new lcd(context2);
                                View childAt2 = adManagerAdView2.getChildAt(0);
                                childAt2.getClass();
                                ((ViewGroup) childAt2).addView(lcdVar2);
                                AdSize adSize2 = adManagerAdView2.getAdSize();
                                u2gVar2 = null;
                                if (adSize2 != null) {
                                    ViewGroup.LayoutParams layoutParams2 = lcdVar2.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    }
                                    int widthInPixels = adSize2.getWidthInPixels(adManagerAdView2.getContext());
                                    Integer valueOf = Integer.valueOf(widthInPixels);
                                    if (widthInPixels <= 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        layoutParams2.width = valueOf.intValue();
                                    }
                                    int heightInPixels = adSize2.getHeightInPixels(adManagerAdView2.getContext());
                                    Integer valueOf2 = Integer.valueOf(heightInPixels);
                                    if (heightInPixels <= 0) {
                                        valueOf2 = null;
                                    }
                                    if (valueOf2 != null) {
                                        layoutParams2.height = valueOf2.intValue();
                                    }
                                    lcdVar2.setLayoutParams(layoutParams2);
                                }
                                u6b w2 = qha.w(adManagerAdView2);
                                if (w2 != null) {
                                    u2gVar2 = xw3.L(wca.x(w2.getLifecycle()), null, null, new DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2(this.b, lcdVar2, this.c, this.d, null), 3);
                                }
                            } catch (Throwable th4) {
                                p2g p2gVar4 = w2g.b;
                                u2gVar2 = new u2g(th4);
                            }
                            if (w2g.a(u2gVar2) != null) {
                                AdListener adListener3 = adManagerAdView2.getAdListener();
                                asErrorMessage4 = DynamicPriceRenderer.getAsErrorMessage("Google layout error");
                                adListener3.onAdFailedToLoad(new LoadAdError(-8, asErrorMessage4, "Adsbynimbus", null, null));
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(@NotNull View view) {
                            view.getClass();
                        }
                    });
                }
            }
            u2gVar = Unit.a;
        } catch (Throwable th4) {
            p2g p2gVar3 = w2g.b;
            u2gVar = new u2g(th4);
        }
        a = w2g.a(u2gVar);
        if (a != null) {
            asErrorMessage = DynamicPriceRenderer.getAsErrorMessage(a.getMessage());
            cjb.a(asErrorMessage);
        }
        return Unit.a;
    }
}
