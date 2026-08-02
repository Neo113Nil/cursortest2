package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Da extends hoi implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ EnumC3661on b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Da(Ha ha, EnumC3661on enumC3661on, JSONObject jSONObject, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = ha;
        this.b = enumC3661on;
        this.c = jSONObject;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Da(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Da) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a.a;
        EnumC3661on enumC3661on = this.b;
        JSONObject jSONObject = this.c;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        enumC3661on.getClass();
        D8 d8 = gestureDetectorOnGestureListenerC3889xi.Z0;
        if (d8 != null) {
            enumC3661on.getClass();
            switch (enumC3661on.ordinal()) {
                case 0:
                    d8.b(true);
                    break;
                case 1:
                    d8.b(false);
                    break;
                case 2:
                    if (!d8.g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        A8 a8 = A8.PLAYING;
                        A8[] a8Arr = {A8.LOADED, A8.PAUSED, A8.COMPLETED, a8};
                        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
                        if (d8.a(a8Arr, "executeVideoPlayerActions", jSONObject2.toString(), a8)) {
                            d8.k.d();
                            break;
                        }
                    }
                    break;
                case 3:
                    if (!d8.g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        A8 a82 = A8.PAUSED;
                        A8[] a8Arr2 = {A8.LOADED, a82, A8.COMPLETED, A8.PLAYING};
                        EnumC3491i8[] enumC3491i8Arr2 = EnumC3491i8.a;
                        if (d8.a(a8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), a82)) {
                            d8.k.c();
                            break;
                        }
                    }
                    break;
                case 4:
                    d8.a(true);
                    break;
                case 5:
                    d8.a(false);
                    break;
                case 6:
                    if (!d8.g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        A8 a83 = A8.PAUSED;
                        A8[] a8Arr3 = {A8.LOADED, a83, A8.COMPLETED, A8.PLAYING};
                        EnumC3491i8[] enumC3491i8Arr3 = EnumC3491i8.a;
                        if (d8.a(a8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), a83)) {
                            d8.k.c();
                        }
                    }
                    Mf mf = d8.p;
                    if (mf != null) {
                        In in = new In((long) d8.k.a().getTime());
                        Oe oe = mf.e;
                        if (oe != null) {
                            oe.a(in);
                            break;
                        }
                    }
                    break;
                default:
                    zzl.b();
                    return null;
            }
            gestureDetectorOnGestureListenerC3889xi.a(EnumC3879x8.VIDEO_PLAYER_ACTION_EXECUTED, jSONObject);
        } else {
            EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_COMMAND_ERROR;
            EnumC3491i8[] enumC3491i8Arr4 = EnumC3491i8.a;
            gestureDetectorOnGestureListenerC3889xi.a(enumC3879x8, AbstractC3907ya.a(new C3413f8(jSONObject), C3413f8.class));
        }
        return Unit.a;
    }
}
