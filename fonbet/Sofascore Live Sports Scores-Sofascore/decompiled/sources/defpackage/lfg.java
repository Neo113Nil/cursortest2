package defpackage;

import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lfg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ tfg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfg(tfg tfgVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = tfgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tfg tfgVar = this.s;
        switch (i) {
            case 0:
                return new lfg(tfgVar, rq3Var, 0);
            case 1:
                return new lfg(tfgVar, rq3Var, 1);
            case 2:
                return new lfg(tfgVar, rq3Var, 2);
            case 3:
                return new lfg(tfgVar, rq3Var, 3);
            case 4:
                return new lfg(tfgVar, rq3Var, 4);
            case 5:
                return new lfg(tfgVar, rq3Var, 5);
            case 6:
                return new lfg(tfgVar, rq3Var, 6);
            case 7:
                return new lfg(tfgVar, rq3Var, 7);
            case 8:
                return new lfg(tfgVar, rq3Var, 8);
            default:
                return new lfg(tfgVar, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lfg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f6, code lost:
    
        if (r2.intValue() != 1) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [rq3] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        xag xagVar;
        kfg kfgVar;
        int i = this.r;
        int i2 = 4;
        int i3 = 2;
        int i4 = 3;
        boolean z = false;
        z = false;
        z = false;
        tfg tfgVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                LinkedHashMap linkedHashMap = tfgVar.F;
                ExoPlayer exoPlayer = tfgVar.v;
                if (exoPlayer == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                double currentPosition = ((vg6) exoPlayer).getCurrentPosition();
                if (tfgVar.v == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                double duration = currentPosition / ((vg6) r3).getDuration();
                fhg fhgVar = tfgVar.y;
                if (fhgVar == null) {
                    Intrinsics.i("videoLayersController");
                    throw null;
                }
                TextureView textureView = fhgVar.d;
                if (System.currentTimeMillis() - fhgVar.h > 750) {
                    fhgVar.g = true;
                    textureView.setVisibility(8);
                    textureView.setVisibility(0);
                } else {
                    fhgVar.g = false;
                }
                xag xagVar2 = tfgVar.z;
                if (xagVar2 != null) {
                    ExoPlayer exoPlayer2 = tfgVar.v;
                    if (exoPlayer2 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    long currentPosition2 = ((vg6) exoPlayer2).getCurrentPosition();
                    zag zagVar = (zag) xagVar2;
                    zagVar.a();
                    jhg jhgVar = zagVar.q;
                    if (jhgVar != null) {
                        jhgVar.h = currentPosition2;
                    }
                }
                igg iggVar = tfgVar.A;
                if (iggVar != null) {
                    ExoPlayer exoPlayer3 = tfgVar.v;
                    if (exoPlayer3 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    ?? r14 = 0;
                    xw3.L(iggVar.a, null, null, new hgg(iggVar, ((vg6) exoPlayer3).getCurrentPosition(), r14, 1), 3);
                    th = r14;
                } else {
                    th = null;
                }
                ahg ahgVar = tfgVar.r;
                if (ahgVar == null) {
                    Intrinsics.i("videoCloseController");
                    throw th;
                }
                wgg wggVar = wgg.b;
                ExoPlayer exoPlayer4 = tfgVar.v;
                if (exoPlayer4 == null) {
                    Intrinsics.i("exoPlayer");
                    throw th;
                }
                ahgVar.b(wggVar, ((vg6) exoPlayer4).getCurrentPosition());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getKey()).doubleValue() <= duration) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    double doubleValue = ((Number) entry2.getKey()).doubleValue();
                    kig kigVar = (kig) entry2.getValue();
                    xag xagVar3 = tfgVar.z;
                    if (xagVar3 != null) {
                        ExoPlayer exoPlayer5 = tfgVar.v;
                        if (exoPlayer5 == null) {
                            Intrinsics.i("exoPlayer");
                            throw th;
                        }
                        ((zag) xagVar3).i(kigVar, ((vg6) exoPlayer5).getCurrentPosition());
                    }
                    linkedHashMap.remove(new Double(doubleValue));
                    mjg mjgVar = tfgVar.c;
                    fhg fhgVar2 = tfgVar.y;
                    if (fhgVar2 == null) {
                        Intrinsics.i("videoLayersController");
                        throw th;
                    }
                    rjg b = mjgVar.b(fhgVar2.j);
                    if (b != null) {
                        int ordinal = kigVar.ordinal();
                        if (ordinal == 4) {
                            hkg.T().post(new ojg(b, 9));
                        } else if (ordinal == 5) {
                            hkg.T().post(new ojg(b, 10));
                        } else if (ordinal == 6) {
                            hkg.T().post(new ojg(b, z ? 1 : 0));
                        }
                    }
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ahg ahgVar2 = tfgVar.r;
                if (ahgVar2 == null) {
                    Intrinsics.i("videoCloseController");
                    throw null;
                }
                wgg wggVar2 = wgg.a;
                ExoPlayer exoPlayer6 = tfgVar.v;
                if (exoPlayer6 != null) {
                    ahgVar2.b(wggVar2, ((vg6) exoPlayer6).getCurrentPosition());
                    return Unit.a;
                }
                Intrinsics.i("exoPlayer");
                throw null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ahg ahgVar3 = tfgVar.r;
                if (ahgVar3 == null) {
                    Intrinsics.i("videoCloseController");
                    throw null;
                }
                ahgVar3.c();
                if (ahgVar3.a) {
                    ahgVar3.c();
                    xgg xggVar = ahgVar3.g;
                    if (xggVar != null) {
                        xggVar.onCloseRequested();
                    }
                } else {
                    ahgVar3.m = true;
                    ahgVar3.b.a(true);
                    ahgVar3.c();
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                nbg nbgVar = tfgVar.e;
                tfgVar.a(true, nbgVar.f);
                if (nbgVar.f) {
                    ExoPlayer exoPlayer7 = tfgVar.v;
                    if (exoPlayer7 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    long currentPosition3 = ((vg6) exoPlayer7).getCurrentPosition();
                    xag xagVar4 = tfgVar.z;
                    if (xagVar4 != null) {
                        ((zag) xagVar4).i(kig.PLAYER_COLLAPSE, currentPosition3);
                    }
                    xag xagVar5 = tfgVar.z;
                    if (xagVar5 != null) {
                        ((zag) xagVar5).i(kig.EXIT_FULLSCREEN, currentPosition3);
                    }
                    mjg mjgVar2 = tfgVar.c;
                    fhg fhgVar3 = tfgVar.y;
                    if (fhgVar3 == null) {
                        Intrinsics.i("videoLayersController");
                        throw null;
                    }
                    rjg b2 = mjgVar2.b(fhgVar3.j);
                    if (b2 != null) {
                        b2.b(false);
                    }
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                nbg nbgVar2 = tfgVar.e;
                if (nbgVar2.h) {
                    int ordinal2 = tfgVar.a.j.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            Integer num = (Integer) tfgVar.n.invoke(tfgVar.o);
                            if (num != null) {
                                if (num.intValue() != 0) {
                                    break;
                                }
                            }
                        } else if (ordinal2 != 2) {
                            zzl.b();
                            return null;
                        }
                    }
                    z = true;
                }
                tfgVar.a(z, nbgVar2.f);
                if (nbgVar2.f) {
                    ExoPlayer exoPlayer8 = tfgVar.v;
                    if (exoPlayer8 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    long currentPosition4 = ((vg6) exoPlayer8).getCurrentPosition();
                    xag xagVar6 = tfgVar.z;
                    if (xagVar6 != null) {
                        ((zag) xagVar6).i(kig.PLAYER_EXPAND, currentPosition4);
                    }
                    xag xagVar7 = tfgVar.z;
                    if (xagVar7 != null) {
                        ((zag) xagVar7).i(kig.FULLSCREEN, currentPosition4);
                    }
                    mjg mjgVar3 = tfgVar.c;
                    fhg fhgVar4 = tfgVar.y;
                    if (fhgVar4 == null) {
                        Intrinsics.i("videoLayersController");
                        throw null;
                    }
                    rjg b3 = mjgVar3.b(fhgVar4.j);
                    if (b3 != null) {
                        b3.b(true);
                    }
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                mjg mjgVar4 = tfgVar.c;
                ExoPlayer exoPlayer9 = tfgVar.v;
                if (exoPlayer9 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                ((vg6) exoPlayer9).stop();
                ExoPlayer exoPlayer10 = tfgVar.v;
                if (exoPlayer10 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                ((vg6) exoPlayer10).release();
                tfgVar.K.cancel();
                xag xagVar8 = tfgVar.z;
                if (xagVar8 != null) {
                    ((zag) xagVar8).m(true);
                }
                if (!tfgVar.E && tfgVar.N != kfg.a) {
                    zl1 zl1Var = tfgVar.I;
                    zl1Var.b.add(new adg(new hfg(tfgVar, i4)));
                    zl1Var.j();
                    fhg fhgVar5 = tfgVar.y;
                    if (fhgVar5 == null) {
                        Intrinsics.i("videoLayersController");
                        throw null;
                    }
                    rjg b4 = mjgVar4.b(fhgVar5.j);
                    if (b4 != null) {
                        hkg.T().post(new ojg(b4, i2));
                    }
                }
                fhg fhgVar6 = tfgVar.y;
                if (fhgVar6 == null) {
                    Intrinsics.i("videoLayersController");
                    throw null;
                }
                rjg b5 = mjgVar4.b(fhgVar6.j);
                if (b5 != null) {
                    b5.c();
                }
                if (tfgVar.x && (xagVar = tfgVar.z) != null) {
                    ((zag) xagVar).g();
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                pgg pggVar = tfgVar.b;
                leg[] legVarArr = leg.a;
                ffg ffgVar = tfgVar.a;
                String str = ffgVar.i;
                keg kegVar = (str == null || StringsKt.R(str)) ? keg.NONE : keg.VAST;
                String str2 = ffgVar.a;
                ExoPlayer exoPlayer11 = tfgVar.v;
                if (exoPlayer11 != null) {
                    ((qgg) pggVar).h(kegVar, str2, ((vg6) exoPlayer11).getDuration());
                    return Unit.a;
                }
                Intrinsics.i("exoPlayer");
                throw null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                if (tfgVar.M == jfg.b) {
                    sdg sdgVar = tfgVar.p;
                    if (sdgVar == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar.requestFocus();
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                Object obj2 = tfgVar.v;
                if (obj2 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                if (((g51) obj2).isPlaying()) {
                    tfgVar.m(kfg.c);
                    Object obj3 = tfgVar.v;
                    if (obj3 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    ((g51) obj3).setPlayWhenReady(false);
                    xag xagVar9 = tfgVar.z;
                    if (xagVar9 != null) {
                        kig kigVar2 = kig.PAUSE;
                        ExoPlayer exoPlayer12 = tfgVar.v;
                        if (exoPlayer12 == null) {
                            Intrinsics.i("exoPlayer");
                            throw null;
                        }
                        ((zag) xagVar9).i(kigVar2, ((vg6) exoPlayer12).getCurrentPosition());
                    }
                    mjg mjgVar5 = tfgVar.c;
                    fhg fhgVar7 = tfgVar.y;
                    if (fhgVar7 == null) {
                        Intrinsics.i("videoLayersController");
                        throw null;
                    }
                    rjg b6 = mjgVar5.b(fhgVar7.j);
                    if (b6 != null) {
                        hkg.T().post(new ojg(b6, i3));
                    }
                }
                return Unit.a;
            default:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                Object obj4 = tfgVar.v;
                if (obj4 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                if (!((g51) obj4).isPlaying() && (kfgVar = tfgVar.N) != kfg.d) {
                    if (kfgVar == kfg.c) {
                        xag xagVar10 = tfgVar.z;
                        if (xagVar10 != null) {
                            kig kigVar3 = kig.RESUME;
                            ExoPlayer exoPlayer13 = tfgVar.v;
                            if (exoPlayer13 == null) {
                                Intrinsics.i("exoPlayer");
                                throw null;
                            }
                            ((zag) xagVar10).i(kigVar3, ((vg6) exoPlayer13).getCurrentPosition());
                        }
                        mjg mjgVar6 = tfgVar.c;
                        fhg fhgVar8 = tfgVar.y;
                        if (fhgVar8 == null) {
                            Intrinsics.i("videoLayersController");
                            throw null;
                        }
                        rjg b7 = mjgVar6.b(fhgVar8.j);
                        if (b7 != null) {
                            hkg.T().post(new ojg(b7, i4));
                        }
                    }
                    tfgVar.m(kfg.b);
                    Object obj5 = tfgVar.v;
                    if (obj5 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    ((g51) obj5).setPlayWhenReady(true);
                }
                return Unit.a;
        }
    }
}
