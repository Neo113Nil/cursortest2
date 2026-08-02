package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ad2;
import defpackage.bea;
import defpackage.ct8;
import defpackage.fdi;
import defpackage.g6b;
import defpackage.gdi;
import defpackage.hje;
import defpackage.hs4;
import defpackage.jy0;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.v24;
import defpackage.xw3;
import defpackage.yf4;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b0 extends FrameLayout {
    public static final r69 k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e a;
    public final Function0 b;
    public final f c;
    public final Function0 d;
    public ad2 e;
    public final fdi f;
    public final fdi g;
    public final fdi h;
    public final GestureDetector i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a j;

    static {
        hs4 hs4Var = z45.a;
        k = rob.a.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, g6b g6bVar, ct8 ct8Var, ct8 ct8Var2, ct8 ct8Var3, Function2 function2, Function0 function02) {
        super(context);
        Object obj;
        v vVar;
        l0 l0Var;
        View view;
        f fVar = new f(context, g6bVar, eVar.s, qVar);
        y yVar = y.b;
        context.getClass();
        qVar.getClass();
        g6bVar.getClass();
        function02.getClass();
        this.a = eVar;
        this.b = function0;
        this.c = fVar;
        this.d = function02;
        fdi a = gdi.a(Boolean.FALSE);
        this.f = a;
        fdi a2 = gdi.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a);
        this.g = a2;
        this.h = gdi.a(Boolean.TRUE);
        final int i = 0;
        this.i = new GestureDetector(context, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.c(new Function2(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w
            public final /* synthetic */ b0 b;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public final class b extends View.BaseSavedState {

                @NotNull
                public static final Parcelable.Creator<b> CREATOR = new p0();
                public float a;

                @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    super.writeToParcel(parcel, i);
                    parcel.writeFloat(this.a);
                }
            }

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                b0 b0Var = this.b;
                switch (i2) {
                    case 0:
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj2;
                        gVar.getClass();
                        ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj3).getClass();
                        Function0 function03 = b0Var.b;
                        if (function03 != null) {
                            function03.invoke();
                        } else {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                            eVar2.getClass();
                            eVar2.g(true, gVar);
                        }
                        break;
                    default:
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj2;
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) obj3;
                        dVar.getClass();
                        cVar.getClass();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar3 = b0Var.a;
                        eVar3.f(dVar);
                        eVar3.e(cVar);
                        break;
                }
                return Unit.a;
            }
        }));
        View view2 = new View(context);
        view2.setClickable(false);
        view2.setFocusable(false);
        final int i2 = 2;
        view2.setImportantForAccessibility(2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = eVar.e ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) yVar.invoke(context, eVar, qVar) : null;
        this.j = aVar;
        final int i3 = 0;
        fVar.setOnIsPlaying(new Function1(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = i3;
                b0 b0Var = this.b;
                switch (i4) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        fdi fdiVar = b0Var.a.z;
                        fdiVar.getClass();
                        fdiVar.m(null, bool);
                        fdi fdiVar2 = b0Var.f;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool);
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                        if (booleanValue) {
                            jy0 jy0Var = eVar2.C;
                            if (Integer.compareUnsigned(jy0Var.a, 0) > 0) {
                                jy0Var.a(jy0Var.a & 4294967295L);
                            }
                        } else {
                            eVar2.a();
                        }
                        break;
                    case 2:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj2;
                        oVar.getClass();
                        b0Var.a.b(oVar);
                        fdi fdiVar3 = b0Var.g;
                        fdiVar3.getClass();
                        fdiVar3.m(null, oVar);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj2;
                        boolean booleanValue2 = bool2.booleanValue();
                        fdi fdiVar4 = b0Var.h;
                        fdiVar4.getClass();
                        fdiVar4.m(null, bool2);
                        b0Var.c.setPlay(booleanValue2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar2 = b0Var.j;
                        if (booleanValue2) {
                            if (aVar2 != null) {
                                aVar2.n = true;
                                aVar2.a();
                            }
                        } else if (aVar2 != null) {
                            aVar2.n = false;
                            aVar2.a();
                        }
                        break;
                }
                return Unit.a;
            }
        });
        final int i4 = 1;
        fVar.setOnIsVisible(new Function1(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i42 = i4;
                b0 b0Var = this.b;
                switch (i42) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        fdi fdiVar = b0Var.a.z;
                        fdiVar.getClass();
                        fdiVar.m(null, bool);
                        fdi fdiVar2 = b0Var.f;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool);
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                        if (booleanValue) {
                            jy0 jy0Var = eVar2.C;
                            if (Integer.compareUnsigned(jy0Var.a, 0) > 0) {
                                jy0Var.a(jy0Var.a & 4294967295L);
                            }
                        } else {
                            eVar2.a();
                        }
                        break;
                    case 2:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj2;
                        oVar.getClass();
                        b0Var.a.b(oVar);
                        fdi fdiVar3 = b0Var.g;
                        fdiVar3.getClass();
                        fdiVar3.m(null, oVar);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj2;
                        boolean booleanValue2 = bool2.booleanValue();
                        fdi fdiVar4 = b0Var.h;
                        fdiVar4.getClass();
                        fdiVar4.m(null, bool2);
                        b0Var.c.setPlay(booleanValue2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar2 = b0Var.j;
                        if (booleanValue2) {
                            if (aVar2 != null) {
                                aVar2.n = true;
                                aVar2.a();
                            }
                        } else if (aVar2 != null) {
                            aVar2.n = false;
                            aVar2.a();
                        }
                        break;
                }
                return Unit.a;
            }
        });
        fVar.setOnProgressChanged(new Function1(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i42 = i2;
                b0 b0Var = this.b;
                switch (i42) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        fdi fdiVar = b0Var.a.z;
                        fdiVar.getClass();
                        fdiVar.m(null, bool);
                        fdi fdiVar2 = b0Var.f;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool);
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                        if (booleanValue) {
                            jy0 jy0Var = eVar2.C;
                            if (Integer.compareUnsigned(jy0Var.a, 0) > 0) {
                                jy0Var.a(jy0Var.a & 4294967295L);
                            }
                        } else {
                            eVar2.a();
                        }
                        break;
                    case 2:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj2;
                        oVar.getClass();
                        b0Var.a.b(oVar);
                        fdi fdiVar3 = b0Var.g;
                        fdiVar3.getClass();
                        fdiVar3.m(null, oVar);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj2;
                        boolean booleanValue2 = bool2.booleanValue();
                        fdi fdiVar4 = b0Var.h;
                        fdiVar4.getClass();
                        fdiVar4.m(null, bool2);
                        b0Var.c.setPlay(booleanValue2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar2 = b0Var.j;
                        if (booleanValue2) {
                            if (aVar2 != null) {
                                aVar2.n = true;
                                aVar2.a();
                            }
                        } else if (aVar2 != null) {
                            aVar2.n = false;
                            aVar2.a();
                        }
                        break;
                }
                return Unit.a;
            }
        });
        View view3 = aVar;
        Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e> cls = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.class;
        fVar.setOnError(new com.moloco.sdk.internal.publisher.l0(1, eVar, cls, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0, 8));
        fVar.setUri(eVar.t);
        addView(view2, new FrameLayout.LayoutParams(-1, -1));
        if (view3 != null) {
            addView(view3, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(fVar, new FrameLayout.LayoutParams(-1, -1, 1));
        final int i5 = 3;
        if (ct8Var != null) {
            obj = context;
            e0 e0Var = (e0) ct8Var.invoke(obj, new yf4(a, a2, new v24(i5, null, 5), i4), eVar.n);
            if (e0Var != null) {
                e0Var.setOnMuteChange(new com.moloco.sdk.internal.publisher.l0(1, eVar, cls, "onMuteChange", "onMuteChange(Z)V", 0, 9));
                e0Var.setOnButtonReplaced(new Function2(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w
                    public final /* synthetic */ b0 b;

                    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                    public final class b extends View.BaseSavedState {

                        @NotNull
                        public static final Parcelable.Creator<b> CREATOR = new p0();
                        public float a;

                        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                        public final void writeToParcel(Parcel parcel, int i) {
                            parcel.getClass();
                            super.writeToParcel(parcel, i);
                            parcel.writeFloat(this.a);
                        }
                    }

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i22 = i4;
                        b0 b0Var = this.b;
                        switch (i22) {
                            case 0:
                                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj2;
                                gVar.getClass();
                                ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj3).getClass();
                                Function0 function03 = b0Var.b;
                                if (function03 != null) {
                                    function03.invoke();
                                } else {
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                                    eVar2.getClass();
                                    eVar2.g(true, gVar);
                                }
                                break;
                            default:
                                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj2;
                                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) obj3;
                                dVar.getClass();
                                cVar.getClass();
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar3 = b0Var.a;
                                eVar3.f(dVar);
                                eVar3.e(cVar);
                                break;
                        }
                        return Unit.a;
                    }
                });
                addView(e0Var);
            }
        } else {
            obj = context;
        }
        if (ct8Var2 != null && (view = (s0) ct8Var2.invoke(obj, a, a2)) != null) {
            addView(view);
        }
        if (ct8Var3 != null && (l0Var = (l0) ct8Var3.invoke(obj, a, a2)) != null) {
            l0Var.setOnShouldPlay(new Function1(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x
                public final /* synthetic */ b0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i42 = i5;
                    b0 b0Var = this.b;
                    switch (i42) {
                        case 0:
                            Boolean bool = (Boolean) obj2;
                            bool.booleanValue();
                            fdi fdiVar = b0Var.a.z;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            fdi fdiVar2 = b0Var.f;
                            fdiVar2.getClass();
                            fdiVar2.m(null, bool);
                            break;
                        case 1:
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = b0Var.a;
                            if (booleanValue) {
                                jy0 jy0Var = eVar2.C;
                                if (Integer.compareUnsigned(jy0Var.a, 0) > 0) {
                                    jy0Var.a(jy0Var.a & 4294967295L);
                                }
                            } else {
                                eVar2.a();
                            }
                            break;
                        case 2:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj2;
                            oVar.getClass();
                            b0Var.a.b(oVar);
                            fdi fdiVar3 = b0Var.g;
                            fdiVar3.getClass();
                            fdiVar3.m(null, oVar);
                            break;
                        default:
                            Boolean bool2 = (Boolean) obj2;
                            boolean booleanValue2 = bool2.booleanValue();
                            fdi fdiVar4 = b0Var.h;
                            fdiVar4.getClass();
                            fdiVar4.m(null, bool2);
                            b0Var.c.setPlay(booleanValue2);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar2 = b0Var.j;
                            if (booleanValue2) {
                                if (aVar2 != null) {
                                    aVar2.n = true;
                                    aVar2.a();
                                }
                            } else if (aVar2 != null) {
                                aVar2.n = false;
                                aVar2.a();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            l0Var.setOnShouldReplay(function02);
            addView(l0Var);
        }
        if (function2 == null || (vVar = (v) function2.invoke(obj, eVar.y)) == null) {
            return;
        }
        int i6 = 0;
        vVar.setOnDisplayed(new com.moloco.sdk.internal.publisher.nativead.b(0, eVar, cls, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", i6, 15));
        vVar.setOnClick(new com.moloco.sdk.internal.publisher.nativead.b(0, eVar, cls, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", i6, 16));
        addView(vVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        this.i.onTouchEvent(motionEvent);
        return true;
    }

    @NotNull
    public final f getVideoPlayer$moloco_sdk_release() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), k));
        this.e = c;
        rq3 rq3Var = null;
        xw3.L(c, null, null, new hje(this, rq3Var, 29), 3);
        xw3.L(c, null, null, new a0(this, rq3Var, 0), 3);
        xw3.L(c, null, null, new a0(this, rq3Var, 1), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.e;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.e = null;
    }
}
