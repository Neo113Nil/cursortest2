package defpackage;

import android.content.Context;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzcwa;
import com.google.android.gms.internal.ads.zzcxh;
import com.google.android.gms.internal.ads.zzcyd;
import com.google.android.gms.internal.ads.zzczr;
import com.google.android.gms.internal.ads.zzdbu;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdov;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzeqk;
import com.google.android.gms.internal.ads.zzesg;
import com.google.android.gms.internal.ads.zzfic;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzioe;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c40 implements mu9, zzcxh {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public c40(vg6 vg6Var, mg6 mg6Var, tqi tqiVar, int i, int i2) {
        this.a = 3;
        this.b = vg6Var;
        this.d = mg6Var;
        this.e = tqiVar;
        this.f = new iij();
        this.g = tqiVar.a(vg6Var.t, new odb(this, 2));
        this.h = new pii(this);
        this.i = new qii(this, i);
        this.j = new rii(this, i2);
        this.k = new nc9(this);
        oii oiiVar = new oii(this);
        this.c = oiiVar;
        vg6Var.m.a(oiiVar);
    }

    public static wtc j(vtc vtcVar, wtc wtcVar) {
        wtc wtcVar2;
        if (vtcVar instanceof buc) {
            wtcVar2 = ((buc) vtcVar).c();
            wtcVar2.c = xdd.f(wtcVar2);
        } else {
            bz0 bz0Var = new bz0();
            bz0Var.c = xdd.d(vtcVar);
            bz0Var.o = vtcVar;
            bz0Var.p = new HashSet();
            wtcVar2 = bz0Var;
        }
        if (wtcVar2.n) {
            r3a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        wtcVar2.i = true;
        wtc wtcVar3 = wtcVar.f;
        if (wtcVar3 != null) {
            wtcVar3.e = wtcVar2;
            wtcVar2.f = wtcVar3;
        }
        wtcVar.f = wtcVar2;
        wtcVar2.e = wtcVar;
        return wtcVar2;
    }

    public static wtc l(wtc wtcVar) {
        boolean z = wtcVar.n;
        if (z) {
            h0d h0dVar = xdd.a;
            if (!z) {
                r3a.b("autoInvalidateRemovedNode called on unattached node");
            }
            xdd.a(wtcVar, -1, 2);
            wtcVar.h1();
            wtcVar.b1();
        }
        wtc wtcVar2 = wtcVar.f;
        wtc wtcVar3 = wtcVar.e;
        if (wtcVar2 != null) {
            wtcVar2.e = wtcVar3;
            wtcVar.f = null;
        }
        if (wtcVar3 != null) {
            wtcVar3.f = wtcVar2;
            wtcVar.e = null;
        }
        wtcVar3.getClass();
        return wtcVar3;
    }

    public static void s(vtc vtcVar, vtc vtcVar2, wtc wtcVar) {
        if ((vtcVar instanceof buc) && (vtcVar2 instanceof buc)) {
            wtcVar.getClass();
            ((buc) vtcVar2).g(wtcVar);
            if (wtcVar.n) {
                xdd.c(wtcVar);
                return;
            } else {
                wtcVar.j = true;
                return;
            }
        }
        if (!(wtcVar instanceof bz0)) {
            r3a.b("Unknown Modifier.Node type");
            return;
        }
        bz0 bz0Var = (bz0) wtcVar;
        boolean z = bz0Var.n;
        if (z) {
            if (!z) {
                r3a.b("unInitializeModifier called on unattached node");
            }
            if ((bz0Var.c & 8) != 0) {
                ((xy) c6o.d0(bz0Var)).G();
            }
        }
        bz0Var.o = vtcVar2;
        bz0Var.c = xdd.d(vtcVar2);
        if (bz0Var.n) {
            bz0Var.k1(false);
        }
        if (wtcVar.n) {
            xdd.c(wtcVar);
        } else {
            wtcVar.j = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw a(zzfiy zzfiyVar) {
        this.c = zzfiyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw b(zzfic zzficVar) {
        this.d = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public /* synthetic */ c40 c(zzfic zzficVar) {
        this.d = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public /* synthetic */ c40 d(zzfiy zzfiyVar) {
        this.c = zzfiyVar;
        return this;
    }

    @Override // defpackage.mu9
    public long e(long j) {
        return ((fig) this.b).e(j);
    }

    @Override // defpackage.mu9
    public int f() {
        return ((fig) this.c).f();
    }

    @Override // defpackage.mu9
    public long g(long j) {
        return ((fig) this.b).g(j);
    }

    public void h(String str, String str2) {
        HashMap hashMap = (HashMap) this.g;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            a70.r("Property \"autoMetadata\" has not been set");
        }
    }

    public du0 i() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((dn5) this.d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.f) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.g) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new du0((String) this.b, (Integer) this.c, (dn5) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (HashMap) this.g, (Integer) this.h, (String) this.i, (byte[]) this.j, (byte[]) this.k);
        }
        a70.r("Missing required properties:".concat(str));
        return null;
    }

    public void k() {
        this.h = c0.Default;
        com.facebook.c0 c0Var = (com.facebook.c0) this.f;
        c0Var.getClass();
        c0Var.b("mraidbridge.setSupports(false,false,false,false,true)");
        c0 c0Var2 = (c0) this.h;
        c0Var2.getClass();
        c0Var.b("mraidbridge.setState(" + JSONObject.quote(c0Var2.a) + ')');
        a0 a0Var = a0.Inline;
        c0Var.b("mraidbridge.setPlacementType(" + JSONObject.quote("interstitial") + ')');
        b0 b0Var = (b0) this.i;
        c0Var.e(((e0) ((fdi) b0Var.i).getValue()).a);
        rq3 rq3Var = null;
        int i = 3;
        v98 v98Var = new v98((fdi) b0Var.f, new mp1(this, rq3Var, 13), i);
        ad2 ad2Var = (ad2) this.e;
        fcp.m0(v98Var, ad2Var);
        fcp.m0(new v98((fdi) b0Var.i, new pdk(this, rq3Var, 22), i), ad2Var);
    }

    public void m(Function1 function1) {
        fig figVar = (fig) this.b;
        figVar.a++;
        ((i1d) figVar.d).b(function1);
        figVar.a();
    }

    public boolean n(int i) {
        return (((wtc) this.g).d & i) != 0;
    }

    public void o(wtc wtcVar, wdd wddVar) {
        for (wtc wtcVar2 = wtcVar.e; wtcVar2 != null; wtcVar2 = wtcVar2.e) {
            if (wtcVar2 == ((qdd) this.c)) {
                wma v = ((wma) this.b).v();
                wddVar.q = v != null ? (z3a) v.F.d : null;
                this.e = wddVar;
                return;
            } else {
                if ((wtcVar2.c & 2) != 0) {
                    return;
                }
                wtcVar2.j1(wddVar);
            }
        }
    }

    public void p() {
        for (wtc wtcVar = (wtc) this.g; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.g1();
            if (wtcVar.i) {
                h0d h0dVar = xdd.a;
                if (!wtcVar.n) {
                    r3a.b("autoInvalidateInsertedNode called on unattached node");
                }
                xdd.a(wtcVar, -1, 1);
            }
            if (wtcVar.j) {
                xdd.c(wtcVar);
            }
            wtcVar.i = false;
            wtcVar.j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(int i, i1d i1dVar, i1d i1dVar2, wtc wtcVar, boolean z) {
        int i2;
        i1d i1dVar3;
        i1d i1dVar4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        pdd pddVar = (pdd) this.k;
        if (pddVar == null) {
            i2 = i;
            i1dVar3 = i1dVar;
            i1dVar4 = i1dVar2;
            pddVar = new pdd(this, wtcVar, i2, i1dVar3, i1dVar4, z);
            this.k = pddVar;
        } else {
            i2 = i;
            i1dVar3 = i1dVar;
            i1dVar4 = i1dVar2;
            pddVar.a = wtcVar;
            pddVar.b = i2;
            pddVar.c = i1dVar3;
            pddVar.d = i1dVar4;
            pddVar.e = z;
        }
        c40 c40Var = pddVar.f;
        int i9 = i1dVar3.c - i2;
        int i10 = i1dVar4.c - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        e7a e7aVar = new e7a(i11 * 3);
        e7a e7aVar2 = new e7a(i11 * 4);
        int i12 = 0;
        e7aVar2.g(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = e7aVar2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = e7aVar2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            e7aVar2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            e7aVar2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            e7aVar2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            e7aVar2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && pddVar.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        e7aVar.f(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    e7aVar2.g(i23, iArr2[i15], i19, iArr2[c2]);
                    e7aVar2.g(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = e7aVar.b;
        if (i55 % 3 != 0) {
            r3a.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            e7aVar.h(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        e7aVar.f(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < e7aVar.b) {
            int[] iArr8 = e7aVar.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                wtc wtcVar2 = pddVar.a.f;
                wtcVar2.getClass();
                if ((wtcVar2.c & 2) != 0) {
                    wdd wddVar = wtcVar2.h;
                    wddVar.getClass();
                    wdd wddVar2 = wddVar.q;
                    wdd wddVar3 = wddVar.p;
                    wddVar3.getClass();
                    if (wddVar2 != null) {
                        wddVar2.p = wddVar3;
                    }
                    wddVar3.q = wddVar2;
                    c40Var.o(pddVar.a, wddVar3);
                }
                pddVar.a = l(wtcVar2);
                i57++;
            }
            while (i58 < i62) {
                wtc j = j((vtc) pddVar.d.a[pddVar.b + i58], pddVar.a);
                pddVar.a = j;
                if (pddVar.e) {
                    wtc wtcVar3 = j.f;
                    wtcVar3.getClass();
                    wdd wddVar4 = wtcVar3.h;
                    wddVar4.getClass();
                    oma A = c6o.A(pddVar.a);
                    if (A != null) {
                        qma qmaVar = new qma((wma) c40Var.b, A);
                        pddVar.a.j1(qmaVar);
                        c40Var.o(pddVar.a, qmaVar);
                        qmaVar.q = wddVar4.q;
                        qmaVar.p = wddVar4;
                        wddVar4.q = qmaVar;
                    } else {
                        pddVar.a.j1(wddVar4);
                    }
                    pddVar.a.a1();
                    pddVar.a.g1();
                    wtc wtcVar4 = pddVar.a;
                    h0d h0dVar = xdd.a;
                    if (!wtcVar4.n) {
                        r3a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    xdd.a(wtcVar4, -1, 1);
                } else {
                    j.i = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    wtc wtcVar5 = pddVar.a.f;
                    wtcVar5.getClass();
                    pddVar.a = wtcVar5;
                    i1d i1dVar5 = pddVar.c;
                    int i64 = pddVar.b;
                    vtc vtcVar = (vtc) i1dVar5.a[i64 + i57];
                    vtc vtcVar2 = (vtc) pddVar.d.a[i64 + i58];
                    if (!Intrinsics.c(vtcVar, vtcVar2)) {
                        s(vtcVar, vtcVar2, pddVar.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (wtc wtcVar6 = ((hti) this.f).e; wtcVar6 != null && wtcVar6 != ((qdd) this.c); wtcVar6 = wtcVar6.e) {
            i65 |= wtcVar6.c;
            wtcVar6.d = i65;
        }
    }

    public void r() {
        qma qmaVar;
        wma wmaVar = (wma) this.b;
        wdd wddVar = (z3a) this.d;
        for (wtc wtcVar = ((hti) this.f).e; wtcVar != null; wtcVar = wtcVar.e) {
            oma A = c6o.A(wtcVar);
            if (A != null) {
                wdd wddVar2 = wtcVar.h;
                if (wddVar2 != null) {
                    qma qmaVar2 = (qma) wddVar2;
                    oma omaVar = qmaVar2.S;
                    qmaVar2.H1(A);
                    qmaVar = qmaVar2;
                    if (omaVar != wtcVar) {
                        qyd qydVar = qmaVar2.L;
                        qmaVar = qmaVar2;
                        if (qydVar != null) {
                            ((q29) qydVar).c();
                            qmaVar = qmaVar2;
                        }
                    }
                } else {
                    qma qmaVar3 = new qma(wmaVar, A);
                    wtcVar.j1(qmaVar3);
                    qmaVar = qmaVar3;
                }
                wddVar.q = qmaVar;
                qmaVar.p = wddVar;
                wddVar = qmaVar;
            } else {
                wtcVar.j1(wddVar);
            }
        }
        wma v = wmaVar.v();
        wddVar.q = v != null ? (z3a) v.F.d : null;
        this.e = wddVar;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder(U3.j.d);
                wtc wtcVar = (wtc) this.g;
                hti htiVar = (hti) this.f;
                if (wtcVar == htiVar) {
                    sb.append(U3.j.e);
                } else {
                    while (true) {
                        if (wtcVar != null && wtcVar != htiVar) {
                            sb.append(String.valueOf(wtcVar));
                            if (wtcVar.f == htiVar) {
                                sb.append(U3.j.e);
                            } else {
                                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                wtcVar = wtcVar.f;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zun zzh() {
        zzioe.b(zzdjp.class, (zzdjp) this.e);
        zzioe.b(zzdcz.class, (zzdcz) this.f);
        zzioe.b(zzesg.class, (zzesg) this.g);
        zzioe.b(zzcyd.class, (zzcyd) this.h);
        if (((zzeqk) this.i) == null) {
            this.i = new zzeqk();
        }
        zzioe.b(zzcwa.class, (zzcwa) this.j);
        zzioe.b(zzdov.class, (zzdov) this.k);
        uun uunVar = (uun) this.b;
        zzcwa zzcwaVar = (zzcwa) this.j;
        zzdov zzdovVar = (zzdov) this.k;
        new zzczr();
        new zzfnc();
        new zzdbu();
        return new zun(uunVar, zzcwaVar, zzdovVar, new zzeay(), (zzdjp) this.e, (zzdcz) this.f, (zzeqk) this.i, (zzesg) this.g, (zzcyd) this.h, (zzfiy) this.c, (zzfic) this.d);
    }

    public /* synthetic */ c40(uun uunVar) {
        this.a = 5;
        this.b = uunVar;
    }

    public c40(Context context, f fVar, b bVar) {
        this.a = 4;
        this.b = context;
        this.c = fVar;
        this.d = bVar;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.e = c;
        this.f = new com.facebook.c0(fVar, 10);
        this.g = new a(context, this);
        this.h = c0.Default;
        this.i = new b0(fVar, context, c);
        fdi a = gdi.a(new w(true, y.d));
        this.j = a;
        this.k = a;
    }

    public c40(wma wmaVar) {
        this.a = 2;
        this.b = wmaVar;
        qdd qddVar = new qdd(0);
        qddVar.d = -1;
        this.c = qddVar;
        z3a z3aVar = new z3a(wmaVar);
        this.d = z3aVar;
        this.e = z3aVar;
        hti htiVar = z3aVar.S;
        this.f = htiVar;
        this.g = htiVar;
        this.j = new i1d(new xtc[16], 0);
    }

    public /* synthetic */ c40() {
        this.a = 1;
    }

    public c40(fig figVar, jwj jwjVar, z41 z41Var, Function1 function1, u84 u84Var, cej cejVar, Function0 function0, hsk hskVar, Function1 function12) {
        this.a = 0;
        this.c = figVar;
        this.d = jwjVar;
        this.e = z41Var;
        this.f = function1;
        this.h = u84Var;
        this.i = cejVar;
        this.j = function0;
        this.k = hskVar;
        this.g = function12;
        this.b = figVar;
    }
}
