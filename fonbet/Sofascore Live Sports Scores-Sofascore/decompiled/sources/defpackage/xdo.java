package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayw;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghr;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgrh;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xdo extends zzgka {
    public final /* synthetic */ int f = 0;
    public final Map g;
    public final Object h;
    public final Object i;

    public xdo(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Context context, Map map, zzgrh zzgrhVar) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.h = zzgffVar;
        this.i = context;
        this.g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        boolean z = true;
        switch (this.f) {
            case 0:
                zzgff zzgffVar = (zzgff) this.h;
                Integer valueOf = Integer.valueOf(zzgffVar.ordinal());
                Context context = (Context) this.i;
                Object obj = this.g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr = (Object[]) method.invoke("", valueOf, context, obj);
                objArr.getClass();
                synchronized (zzayaVar) {
                    try {
                        if (zzgffVar == zzgff.a) {
                            Object obj2 = objArr[0];
                            if (obj2 == null) {
                                obj2 = r0;
                            }
                            long longValue = ((Long) obj2).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).E(longValue);
                            Object obj3 = objArr[1];
                            long longValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).F(longValue2);
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).O0(longValue3);
                        long longValue4 = ((Long) objArr[3]).longValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).f0(longValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr2.getClass();
                zzayw D = zzayx.D();
                Object obj4 = objArr2[0];
                if (obj4 != null && objArr2[1] != null) {
                    long longValue5 = ((Long) obj4).longValue();
                    D.n();
                    ((zzayx) D.b).E(longValue5);
                    long longValue6 = ((Long) objArr2[1]).longValue();
                    D.n();
                    ((zzayx) D.b).F(longValue6);
                }
                Object obj5 = objArr2[2];
                if (obj5 != null) {
                    long longValue7 = ((Long) obj5).longValue();
                    D.n();
                    ((zzayx) D.b).L(longValue7);
                }
                Object obj6 = objArr2[3];
                if (obj6 != null) {
                    long longValue8 = ((Long) obj6).longValue();
                    D.n();
                    ((zzayx) D.b).J(longValue8);
                }
                Object obj7 = objArr2[4];
                if (obj7 != null) {
                    long longValue9 = ((Long) obj7).longValue();
                    D.n();
                    ((zzayx) D.b).G(longValue9);
                }
                Object obj8 = objArr2[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    D.n();
                    ((zzayx) D.b).X(i);
                }
                Object obj9 = objArr2[6];
                if (obj9 != null) {
                    long longValue10 = ((Long) obj9).longValue();
                    D.n();
                    ((zzayx) D.b).N(longValue10);
                }
                Object obj10 = objArr2[7];
                if (obj10 != null) {
                    long longValue11 = ((Long) obj10).longValue();
                    D.n();
                    ((zzayx) D.b).M(longValue11);
                }
                Object obj11 = objArr2[8];
                if (obj11 != null) {
                    int i2 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    D.n();
                    ((zzayx) D.b).Y(i2);
                }
                synchronized (zzayaVar) {
                    try {
                        Method c = ((zzgiw) this.h).c("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
                        if (c == null) {
                            throw null;
                        }
                        Object[] objArr3 = (Object[]) c.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                        if (objArr3 == null) {
                            throw null;
                        }
                        Object obj12 = objArr3[0];
                        if (obj12 != null) {
                            long longValue12 = ((Long) obj12).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).P0(longValue12);
                        }
                        Object obj13 = objArr3[1];
                        if (obj13 != null) {
                            long longValue13 = ((Long) obj13).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).Q0(longValue13);
                        }
                        Object obj14 = objArr3[2];
                        if (obj14 != null) {
                            long longValue14 = ((Long) obj14).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).R0(longValue14);
                        }
                        Object obj15 = objArr3[3];
                        if (obj15 != null) {
                            long longValue15 = ((Long) obj15).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).J(longValue15);
                        }
                        Object obj16 = objArr3[4];
                        if (obj16 != null) {
                            long longValue16 = ((Long) obj16).longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).K(longValue16);
                        }
                        zzghq zzghqVar = (zzghq) map.get("oe");
                        if (zzghqVar != null) {
                            long j = zzghqVar.a;
                            if (j > 0) {
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).N(j);
                            }
                            long j2 = zzghqVar.b;
                            if (j2 > 0) {
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).M(j2);
                            }
                            long j3 = zzghqVar.c;
                            if (j3 > 0) {
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).L(j3);
                            }
                            long j4 = zzghqVar.d;
                            if (j4 > 0) {
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).O(j4);
                            }
                        }
                        zzghq zzghqVar2 = (zzghq) map.get("oe");
                        if (zzghqVar2 != null && zzghqVar2.a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                                double d = zzghqVar2.g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long round = Math.round(d / displayMetrics.density);
                                D.n();
                                ((zzayx) D.b).P(round);
                                long round2 = Math.round((zzghqVar2.j - zzghqVar2.h) / displayMetrics.density);
                                D.n();
                                ((zzayx) D.b).Q(round2);
                                long round3 = Math.round((zzghqVar2.k - zzghqVar2.i) / displayMetrics.density);
                                D.n();
                                ((zzayx) D.b).R(round3);
                                long round4 = Math.round(zzghqVar2.h / displayMetrics.density);
                                D.n();
                                ((zzayx) D.b).V(round4);
                                long round5 = Math.round(zzghqVar2.i / displayMetrics.density);
                                D.n();
                                ((zzayx) D.b).W(round5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long round6 = Math.round((((zzghqVar2.h - zzghqVar2.j) + r4.getRawX()) - r4.getX()) / displayMetrics.density);
                                    if (round6 != 0) {
                                        D.n();
                                        ((zzayx) D.b).S(round6);
                                    }
                                    long round7 = Math.round((((zzghqVar2.i - zzghqVar2.k) + r4.getRawY()) - r4.getY()) / displayMetrics.density);
                                    if (round7 != 0) {
                                        D.n();
                                        ((zzayx) D.b).U(round7);
                                    }
                                }
                            }
                        }
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).X((zzayx) D.o());
                        zzghr[] zzghrVarArr = (zzghr[]) map.get("ro");
                        if (zzghrVarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                z = false;
                            }
                            if (z) {
                                for (int i3 = 0; i3 <= zzghrVarArr.length - 2; i3++) {
                                    zzghr zzghrVar = zzghrVarArr[i3];
                                    zzayw D2 = zzayx.D();
                                    double d2 = zzghrVar.a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long round8 = Math.round(d2 / displayMetrics.density);
                                    D2.n();
                                    ((zzayx) D2.b).E(round8);
                                    long round9 = Math.round(zzghrVar.b / displayMetrics.density);
                                    D2.n();
                                    ((zzayx) D2.b).F(round9);
                                    zzayx zzayxVar = (zzayx) D2.o();
                                    zzayaVar.n();
                                    ((zzaza) zzayaVar.b).Y(zzayxVar);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public xdo(zzaya zzayaVar, zzgiw zzgiwVar, Map map, DisplayMetrics displayMetrics, zzgrh zzgrhVar) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.h = zzgiwVar;
        this.g = map;
        this.i = displayMetrics;
    }
}
