package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Country;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.VoteChoices;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class z5l {
    public static final /* synthetic */ int a = 0;

    static {
        x3f x3fVar = y3f.d;
        WhoWillWinOptions whoWillWinOptions = WhoWillWinOptions.HOME_TEAM_WIN;
        WhoWillWinOptions.Companion companion = WhoWillWinOptions.INSTANCE;
        WhoWillWinOptions whoWillWinOptions2 = WhoWillWinOptions.AWAY_TEAM_WIN;
        new Vote(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, 3984, 8329);
        whoWillWinOptions.getClass();
        whoWillWinOptions2.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final int i2, final w3f w3fVar, final boolean z, final Function2 function2, xtc xtcVar, Integer num, Integer num2, Integer num3, Integer num4, of3 of3Var, final int i3, final int i4) {
        int i5;
        xtc xtcVar2;
        int i6;
        Integer num5;
        int i7;
        Integer num6;
        int i8;
        int i9;
        int i10;
        int i11;
        av8 av8Var;
        final Integer num7;
        xtc xtcVar3;
        final Integer num8;
        final Integer num9;
        final Integer num10;
        eqf u;
        Integer num11;
        List j;
        String str;
        List<Integer> votingPercentage;
        boolean g;
        Object l84Var;
        String str2;
        boolean z2;
        String choice;
        Integer num12;
        Integer num13;
        boolean i12;
        Object O;
        String str3;
        boolean z3;
        String choice2;
        boolean i13;
        Object O2;
        w3fVar.getClass();
        function2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-362108136);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= av8Var2.i(w3fVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= av8Var2.h(z) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= av8Var2.i(function2) ? 16384 : 8192;
        }
        int i14 = i4 & 32;
        if (i14 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var2.g(xtcVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i3) == 0) {
                num5 = num;
                i5 |= av8Var2.g(num5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i7 = i4 & 128;
                if (i7 != 0) {
                    i5 |= 12582912;
                    num6 = num2;
                } else {
                    num6 = num2;
                    if ((i3 & 12582912) == 0) {
                        i5 |= av8Var2.g(num6) ? 8388608 : 4194304;
                    }
                }
                i8 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i8 != 0) {
                    i5 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i5 |= av8Var2.g(num3) ? 67108864 : 33554432;
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i5 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i10 = i9;
                    i5 |= av8Var2.g(num4) ? 536870912 : 268435456;
                    i11 = i5;
                    if (av8Var2.T(i11 & 1, (i5 & 306783379) == 306783378)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        num7 = num6;
                        xtcVar3 = xtcVar2;
                        num8 = num5;
                        num9 = num3;
                        num10 = num4;
                    } else {
                        utc utcVar = utc.a;
                        if (i14 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if (i6 != 0) {
                            num5 = null;
                        }
                        if (i7 != 0) {
                            num6 = null;
                        }
                        Integer num14 = i8 != 0 ? null : num3;
                        Integer num15 = i10 != 0 ? null : num4;
                        Object O3 = av8Var2.O();
                        a99 a99Var = nf3.a;
                        if (O3 == a99Var) {
                            O3 = e.f(Boolean.FALSE);
                            av8Var2.n0(O3);
                        }
                        e1d e1dVar = (e1d) O3;
                        Context context = (Context) av8Var2.k(nz.b);
                        VoteChoices voteChoices = w3fVar.o;
                        VoteChoices voteChoices2 = w3fVar.p;
                        VoteChoices voteChoices3 = w3fVar.n;
                        y3f y3fVar = w3fVar.b;
                        boolean z4 = w3fVar.c;
                        context.getClass();
                        String str4 = w3fVar.i;
                        String str5 = w3fVar.h;
                        final Integer num16 = num14;
                        int ordinal = y3fVar.ordinal();
                        if (ordinal != 0) {
                            num11 = num6;
                            if (ordinal == 1) {
                                String string = context.getString(R.string.yes);
                                if (z4) {
                                    string = null;
                                }
                                if (string == null) {
                                    string = context.getString(R.string.no);
                                    string.getClass();
                                }
                                String string2 = context.getString(R.string.no);
                                if (z4) {
                                    string2 = null;
                                }
                                if (string2 == null) {
                                    string2 = context.getString(R.string.yes);
                                    string2.getClass();
                                }
                                j = b.j(string, string2);
                            } else {
                                if (ordinal != 2) {
                                    zzl.b();
                                    return;
                                }
                                if (!z4 || str5 == null || str5.length() == 0 || str4 == null || str4.length() == 0) {
                                    String str6 = !z4 ? "1" : null;
                                    if (str6 == null) {
                                        str6 = "2";
                                    }
                                    String string3 = context.getString(R.string.no_goal);
                                    string3.getClass();
                                    str = z4 ? null : "2";
                                    j = b.j(str6, string3, str == null ? "1" : str);
                                } else {
                                    String string4 = context.getString(R.string.no_goal);
                                    string4.getClass();
                                    j = b.j(str5, string4, str4);
                                }
                            }
                        } else {
                            num11 = num6;
                            Country country = zu3.a;
                            int i15 = ke0.c;
                            ArrayList w0 = CollectionsKt.w0(zu3.n.getMccList(), zu3.p.getMccList());
                            if ((!zu3.a(i15) && !w0.contains(Integer.valueOf(i15))) || str5 == null || str5.length() == 0 || str4 == null || str4.length() == 0) {
                                String str7 = !z4 ? "1" : null;
                                if (str7 == null) {
                                    str7 = "2";
                                }
                                str = z4 ? null : "2";
                                j = b.j(str7, "X", str == null ? "1" : str);
                            } else {
                                j = b.j(str5, "Tie", str4);
                            }
                        }
                        String str8 = w3fVar.g;
                        boolean z5 = w3fVar.m;
                        int ordinal2 = y3fVar.ordinal();
                        if (ordinal2 == 0) {
                            Vote vote = w3fVar.d;
                            if (vote != null) {
                                votingPercentage = VotesResponseKt.getVotingPercentage(vote, z4);
                                Boolean valueOf = Boolean.valueOf(z5);
                                g = av8Var2.g(str8) | av8Var2.h(z5);
                                Object O4 = av8Var2.O();
                                if (g) {
                                }
                                l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                                str2 = str8;
                                z2 = z5;
                                av8Var2.n0(l84Var);
                                hz8.q(str2, valueOf, (Function2) l84Var, av8Var2);
                                cdi b = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                                xtc x = gz8.x(xtcVar2, null, null, 3);
                                l8g a2 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                                xtc xtcVar4 = xtcVar2;
                                int hashCode = Long.hashCode(av8Var2.T);
                                aee m = av8Var2.m();
                                xtc C = fqj.C(av8Var2, x);
                                if3.k7.getClass();
                                xtcVar3 = xtcVar4;
                                zg3 zg3Var = hf3.b;
                                av8Var2.h0();
                                if (av8Var2.S) {
                                }
                                waa.K(av8Var2, a2, hf3.g);
                                waa.K(av8Var2, m, hf3.f);
                                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                                waa.J(av8Var2, hf3.k);
                                waa.K(av8Var2, C, hf3.d);
                                p8g p8gVar = p8g.a;
                                xtc a3 = p8gVar.a(1.0f, utcVar, true);
                                choice = voteChoices3.getChoice();
                                if (z4) {
                                }
                                if (choice == null) {
                                }
                                if (votingPercentage == null) {
                                }
                                float floatValue = ((Number) b.getValue()).floatValue();
                                final int i16 = 0;
                                final Integer num17 = num12;
                                final Integer num18 = num11;
                                tc3 H = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i17 = i16;
                                        Integer num19 = num18;
                                        Integer num20 = num17;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i17) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num20 == null || num19 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num20.intValue(), num19.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num20 == null || num19 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num20.intValue(), num19.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                int i17 = i11 & 57344;
                                String str9 = choice;
                                i12 = (i17 != 16384) | av8Var2.i(w3fVar);
                                O = av8Var2.O();
                                if (i12) {
                                }
                                str3 = str2;
                                final int i18 = 0;
                                O = new Function1() { // from class: w5l
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i19 = i18;
                                        w3f w3fVar2 = w3fVar;
                                        Function2 function22 = function2;
                                        String str10 = (String) obj;
                                        switch (i19) {
                                            case 0:
                                                str10.getClass();
                                                function22.invoke(str10, w3fVar2);
                                                break;
                                            case 1:
                                                str10.getClass();
                                                function22.invoke(str10, w3fVar2);
                                                break;
                                            default:
                                                str10.getClass();
                                                function22.invoke(str10, w3fVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var2.n0(O);
                                int i19 = (458752 & (i11 << 6)) | 6;
                                b(H, num13, str9, str3, floatValue, z, z2, (Function1) O, a3, av8Var2, i19);
                                av8Var = av8Var2;
                                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                if (w3fVar.r) {
                                }
                                z3 = false;
                                av8Var.d0(-1154021690);
                                av8Var.s(false);
                                xtc a4 = p8gVar.a(1.0f, utcVar, true);
                                if (votingPercentage == null) {
                                }
                                choice2 = voteChoices2.getChoice();
                                if (z4) {
                                }
                                if (choice2 == null) {
                                }
                                String str10 = choice2;
                                float floatValue2 = ((Number) b.getValue()).floatValue();
                                final int i20 = 1;
                                final Integer num19 = num15;
                                tc3 H2 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i172 = i20;
                                        Integer num192 = num19;
                                        Integer num20 = num16;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i172) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num20 == null || num192 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num20.intValue(), num192.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num20 == null || num192 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num20.intValue(), num192.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                i13 = av8Var.i(w3fVar) | (i17 != 16384 ? true : z3);
                                O2 = av8Var.O();
                                if (!i13) {
                                }
                                final int i21 = 2;
                                O2 = new Function1() { // from class: w5l
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i192 = i21;
                                        w3f w3fVar2 = w3fVar;
                                        Function2 function22 = function2;
                                        String str102 = (String) obj;
                                        switch (i192) {
                                            case 0:
                                                str102.getClass();
                                                function22.invoke(str102, w3fVar2);
                                                break;
                                            case 1:
                                                str102.getClass();
                                                function22.invoke(str102, w3fVar2);
                                                break;
                                            default:
                                                str102.getClass();
                                                function22.invoke(str102, w3fVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var.n0(O2);
                                b(H2, r14, str10, str3, floatValue2, z, z2, (Function1) O2, a4, av8Var, i19);
                                av8Var.s(true);
                                num8 = num17;
                                num9 = num16;
                                num7 = num18;
                                num10 = num19;
                            }
                            votingPercentage = null;
                            Boolean valueOf2 = Boolean.valueOf(z5);
                            g = av8Var2.g(str8) | av8Var2.h(z5);
                            Object O42 = av8Var2.O();
                            if (g) {
                            }
                            l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                            str2 = str8;
                            z2 = z5;
                            av8Var2.n0(l84Var);
                            hz8.q(str2, valueOf2, (Function2) l84Var, av8Var2);
                            cdi b2 = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                            xtc x2 = gz8.x(xtcVar2, null, null, 3);
                            l8g a22 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                            xtc xtcVar42 = xtcVar2;
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C2 = fqj.C(av8Var2, x2);
                            if3.k7.getClass();
                            xtcVar3 = xtcVar42;
                            zg3 zg3Var2 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                            }
                            waa.K(av8Var2, a22, hf3.g);
                            waa.K(av8Var2, m2, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C2, hf3.d);
                            p8g p8gVar2 = p8g.a;
                            xtc a32 = p8gVar2.a(1.0f, utcVar, true);
                            choice = voteChoices3.getChoice();
                            if (z4) {
                            }
                            if (choice == null) {
                            }
                            if (votingPercentage == null) {
                            }
                            float floatValue3 = ((Number) b2.getValue()).floatValue();
                            final int i162 = 0;
                            final Integer num172 = num12;
                            final Integer num182 = num11;
                            tc3 H3 = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i172 = i162;
                                    Integer num192 = num182;
                                    Integer num20 = num172;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i172) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num20 == null || num192 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num20.intValue(), num192.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num20 == null || num192 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num20.intValue(), num192.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            int i172 = i11 & 57344;
                            String str92 = choice;
                            i12 = (i172 != 16384) | av8Var2.i(w3fVar);
                            O = av8Var2.O();
                            if (i12) {
                            }
                            str3 = str2;
                            final int i182 = 0;
                            O = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i192 = i182;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str102 = (String) obj;
                                    switch (i192) {
                                        case 0:
                                            str102.getClass();
                                            function22.invoke(str102, w3fVar2);
                                            break;
                                        case 1:
                                            str102.getClass();
                                            function22.invoke(str102, w3fVar2);
                                            break;
                                        default:
                                            str102.getClass();
                                            function22.invoke(str102, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O);
                            int i192 = (458752 & (i11 << 6)) | 6;
                            b(H3, num13, str92, str3, floatValue3, z, z2, (Function1) O, a32, av8Var2, i192);
                            av8Var = av8Var2;
                            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                            if (w3fVar.r) {
                            }
                            z3 = false;
                            av8Var.d0(-1154021690);
                            av8Var.s(false);
                            xtc a42 = p8gVar2.a(1.0f, utcVar, true);
                            if (votingPercentage == null) {
                            }
                            choice2 = voteChoices2.getChoice();
                            if (z4) {
                            }
                            if (choice2 == null) {
                            }
                            String str102 = choice2;
                            float floatValue22 = ((Number) b2.getValue()).floatValue();
                            final int i202 = 1;
                            final Integer num192 = num15;
                            tc3 H22 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i1722 = i202;
                                    Integer num1922 = num192;
                                    Integer num20 = num16;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i1722) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num20 == null || num1922 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num20.intValue(), num1922.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num20 == null || num1922 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num20.intValue(), num1922.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            i13 = av8Var.i(w3fVar) | (i172 != 16384 ? true : z3);
                            O2 = av8Var.O();
                            if (!i13) {
                            }
                            final int i212 = 2;
                            O2 = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i1922 = i212;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str1022 = (String) obj;
                                    switch (i1922) {
                                        case 0:
                                            str1022.getClass();
                                            function22.invoke(str1022, w3fVar2);
                                            break;
                                        case 1:
                                            str1022.getClass();
                                            function22.invoke(str1022, w3fVar2);
                                            break;
                                        default:
                                            str1022.getClass();
                                            function22.invoke(str1022, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var.n0(O2);
                            b(H22, r14, str102, str3, floatValue22, z, z2, (Function1) O2, a42, av8Var, i192);
                            av8Var.s(true);
                            num8 = num172;
                            num9 = num16;
                            num7 = num182;
                            num10 = num192;
                        } else if (ordinal2 == 1) {
                            WillBothTeamsScoreVote willBothTeamsScoreVote = w3fVar.f;
                            if (willBothTeamsScoreVote != null) {
                                votingPercentage = VotesResponseKt.getVotingPercentage(willBothTeamsScoreVote, z4);
                                Boolean valueOf22 = Boolean.valueOf(z5);
                                g = av8Var2.g(str8) | av8Var2.h(z5);
                                Object O422 = av8Var2.O();
                                if (g) {
                                }
                                l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                                str2 = str8;
                                z2 = z5;
                                av8Var2.n0(l84Var);
                                hz8.q(str2, valueOf22, (Function2) l84Var, av8Var2);
                                cdi b22 = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                                xtc x22 = gz8.x(xtcVar2, null, null, 3);
                                l8g a222 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                                xtc xtcVar422 = xtcVar2;
                                int hashCode22 = Long.hashCode(av8Var2.T);
                                aee m22 = av8Var2.m();
                                xtc C22 = fqj.C(av8Var2, x22);
                                if3.k7.getClass();
                                xtcVar3 = xtcVar422;
                                zg3 zg3Var22 = hf3.b;
                                av8Var2.h0();
                                if (av8Var2.S) {
                                }
                                waa.K(av8Var2, a222, hf3.g);
                                waa.K(av8Var2, m22, hf3.f);
                                waa.K(av8Var2, Integer.valueOf(hashCode22), hf3.j);
                                waa.J(av8Var2, hf3.k);
                                waa.K(av8Var2, C22, hf3.d);
                                p8g p8gVar22 = p8g.a;
                                xtc a322 = p8gVar22.a(1.0f, utcVar, true);
                                choice = voteChoices3.getChoice();
                                if (z4) {
                                }
                                if (choice == null) {
                                }
                                if (votingPercentage == null) {
                                }
                                float floatValue32 = ((Number) b22.getValue()).floatValue();
                                final int i1622 = 0;
                                final Integer num1722 = num12;
                                final Integer num1822 = num11;
                                tc3 H32 = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i1722 = i1622;
                                        Integer num1922 = num1822;
                                        Integer num20 = num1722;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i1722) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num20 == null || num1922 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num20.intValue(), num1922.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num20 == null || num1922 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num20.intValue(), num1922.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                int i1722 = i11 & 57344;
                                String str922 = choice;
                                i12 = (i1722 != 16384) | av8Var2.i(w3fVar);
                                O = av8Var2.O();
                                if (i12) {
                                }
                                str3 = str2;
                                final int i1822 = 0;
                                O = new Function1() { // from class: w5l
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i1922 = i1822;
                                        w3f w3fVar2 = w3fVar;
                                        Function2 function22 = function2;
                                        String str1022 = (String) obj;
                                        switch (i1922) {
                                            case 0:
                                                str1022.getClass();
                                                function22.invoke(str1022, w3fVar2);
                                                break;
                                            case 1:
                                                str1022.getClass();
                                                function22.invoke(str1022, w3fVar2);
                                                break;
                                            default:
                                                str1022.getClass();
                                                function22.invoke(str1022, w3fVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var2.n0(O);
                                int i1922 = (458752 & (i11 << 6)) | 6;
                                b(H32, num13, str922, str3, floatValue32, z, z2, (Function1) O, a322, av8Var2, i1922);
                                av8Var = av8Var2;
                                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                if (w3fVar.r) {
                                }
                                z3 = false;
                                av8Var.d0(-1154021690);
                                av8Var.s(false);
                                xtc a422 = p8gVar22.a(1.0f, utcVar, true);
                                if (votingPercentage == null) {
                                }
                                choice2 = voteChoices2.getChoice();
                                if (z4) {
                                }
                                if (choice2 == null) {
                                }
                                String str1022 = choice2;
                                float floatValue222 = ((Number) b22.getValue()).floatValue();
                                final int i2022 = 1;
                                final Integer num1922 = num15;
                                tc3 H222 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i17222 = i2022;
                                        Integer num19222 = num1922;
                                        Integer num20 = num16;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i17222) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num20 == null || num19222 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num20.intValue(), num19222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num20 == null || num19222 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num20.intValue(), num19222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                i13 = av8Var.i(w3fVar) | (i1722 != 16384 ? true : z3);
                                O2 = av8Var.O();
                                if (!i13) {
                                }
                                final int i2122 = 2;
                                O2 = new Function1() { // from class: w5l
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i19222 = i2122;
                                        w3f w3fVar2 = w3fVar;
                                        Function2 function22 = function2;
                                        String str10222 = (String) obj;
                                        switch (i19222) {
                                            case 0:
                                                str10222.getClass();
                                                function22.invoke(str10222, w3fVar2);
                                                break;
                                            case 1:
                                                str10222.getClass();
                                                function22.invoke(str10222, w3fVar2);
                                                break;
                                            default:
                                                str10222.getClass();
                                                function22.invoke(str10222, w3fVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var.n0(O2);
                                b(H222, r14, str1022, str3, floatValue222, z, z2, (Function1) O2, a422, av8Var, i1922);
                                av8Var.s(true);
                                num8 = num1722;
                                num9 = num16;
                                num7 = num1822;
                                num10 = num1922;
                            }
                            votingPercentage = null;
                            Boolean valueOf222 = Boolean.valueOf(z5);
                            g = av8Var2.g(str8) | av8Var2.h(z5);
                            Object O4222 = av8Var2.O();
                            if (g) {
                            }
                            l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                            str2 = str8;
                            z2 = z5;
                            av8Var2.n0(l84Var);
                            hz8.q(str2, valueOf222, (Function2) l84Var, av8Var2);
                            cdi b222 = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                            xtc x222 = gz8.x(xtcVar2, null, null, 3);
                            l8g a2222 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                            xtc xtcVar4222 = xtcVar2;
                            int hashCode222 = Long.hashCode(av8Var2.T);
                            aee m222 = av8Var2.m();
                            xtc C222 = fqj.C(av8Var2, x222);
                            if3.k7.getClass();
                            xtcVar3 = xtcVar4222;
                            zg3 zg3Var222 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                            }
                            waa.K(av8Var2, a2222, hf3.g);
                            waa.K(av8Var2, m222, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode222), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C222, hf3.d);
                            p8g p8gVar222 = p8g.a;
                            xtc a3222 = p8gVar222.a(1.0f, utcVar, true);
                            choice = voteChoices3.getChoice();
                            if (z4) {
                            }
                            if (choice == null) {
                            }
                            if (votingPercentage == null) {
                            }
                            float floatValue322 = ((Number) b222.getValue()).floatValue();
                            final int i16222 = 0;
                            final Integer num17222 = num12;
                            final Integer num18222 = num11;
                            tc3 H322 = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i17222 = i16222;
                                    Integer num19222 = num18222;
                                    Integer num20 = num17222;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i17222) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num20 == null || num19222 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num20.intValue(), num19222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num20 == null || num19222 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num20.intValue(), num19222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            int i17222 = i11 & 57344;
                            String str9222 = choice;
                            i12 = (i17222 != 16384) | av8Var2.i(w3fVar);
                            O = av8Var2.O();
                            if (i12) {
                            }
                            str3 = str2;
                            final int i18222 = 0;
                            O = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i19222 = i18222;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str10222 = (String) obj;
                                    switch (i19222) {
                                        case 0:
                                            str10222.getClass();
                                            function22.invoke(str10222, w3fVar2);
                                            break;
                                        case 1:
                                            str10222.getClass();
                                            function22.invoke(str10222, w3fVar2);
                                            break;
                                        default:
                                            str10222.getClass();
                                            function22.invoke(str10222, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O);
                            int i19222 = (458752 & (i11 << 6)) | 6;
                            b(H322, num13, str9222, str3, floatValue322, z, z2, (Function1) O, a3222, av8Var2, i19222);
                            av8Var = av8Var2;
                            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                            if (w3fVar.r) {
                            }
                            z3 = false;
                            av8Var.d0(-1154021690);
                            av8Var.s(false);
                            xtc a4222 = p8gVar222.a(1.0f, utcVar, true);
                            if (votingPercentage == null) {
                            }
                            choice2 = voteChoices2.getChoice();
                            if (z4) {
                            }
                            if (choice2 == null) {
                            }
                            String str10222 = choice2;
                            float floatValue2222 = ((Number) b222.getValue()).floatValue();
                            final int i20222 = 1;
                            final Integer num19222 = num15;
                            tc3 H2222 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i172222 = i20222;
                                    Integer num192222 = num19222;
                                    Integer num20 = num16;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i172222) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num20 == null || num192222 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num20.intValue(), num192222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num20 == null || num192222 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num20.intValue(), num192222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            i13 = av8Var.i(w3fVar) | (i17222 != 16384 ? true : z3);
                            O2 = av8Var.O();
                            if (!i13) {
                            }
                            final int i21222 = 2;
                            O2 = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i192222 = i21222;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str102222 = (String) obj;
                                    switch (i192222) {
                                        case 0:
                                            str102222.getClass();
                                            function22.invoke(str102222, w3fVar2);
                                            break;
                                        case 1:
                                            str102222.getClass();
                                            function22.invoke(str102222, w3fVar2);
                                            break;
                                        default:
                                            str102222.getClass();
                                            function22.invoke(str102222, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var.n0(O2);
                            b(H2222, r14, str10222, str3, floatValue2222, z, z2, (Function1) O2, a4222, av8Var, i19222);
                            av8Var.s(true);
                            num8 = num17222;
                            num9 = num16;
                            num7 = num18222;
                            num10 = num19222;
                        } else {
                            if (ordinal2 != 2) {
                                zzl.b();
                                return;
                            }
                            FirstTeamToScoreVote firstTeamToScoreVote = w3fVar.e;
                            if (firstTeamToScoreVote != null) {
                                votingPercentage = VotesResponseKt.getVotingPercentage(firstTeamToScoreVote, z4);
                                Boolean valueOf2222 = Boolean.valueOf(z5);
                                g = av8Var2.g(str8) | av8Var2.h(z5);
                                Object O42222 = av8Var2.O();
                                if (!g || O42222 == a99Var) {
                                    l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                                    str2 = str8;
                                    z2 = z5;
                                    av8Var2.n0(l84Var);
                                } else {
                                    z2 = z5;
                                    str2 = str8;
                                    l84Var = O42222;
                                }
                                hz8.q(str2, valueOf2222, (Function2) l84Var, av8Var2);
                                cdi b2222 = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                                xtc x2222 = gz8.x(xtcVar2, null, null, 3);
                                l8g a22222 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                                xtc xtcVar42222 = xtcVar2;
                                int hashCode2222 = Long.hashCode(av8Var2.T);
                                aee m2222 = av8Var2.m();
                                xtc C2222 = fqj.C(av8Var2, x2222);
                                if3.k7.getClass();
                                xtcVar3 = xtcVar42222;
                                zg3 zg3Var2222 = hf3.b;
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.q0();
                                } else {
                                    av8Var2.l(zg3Var2222);
                                }
                                waa.K(av8Var2, a22222, hf3.g);
                                waa.K(av8Var2, m2222, hf3.f);
                                waa.K(av8Var2, Integer.valueOf(hashCode2222), hf3.j);
                                waa.J(av8Var2, hf3.k);
                                waa.K(av8Var2, C2222, hf3.d);
                                p8g p8gVar2222 = p8g.a;
                                xtc a32222 = p8gVar2222.a(1.0f, utcVar, true);
                                choice = voteChoices3.getChoice();
                                if (z4) {
                                    choice = null;
                                }
                                if (choice == null) {
                                    choice = voteChoices2.getChoice();
                                }
                                if (votingPercentage == null) {
                                    Integer num20 = num5;
                                    num13 = (Integer) CollectionsKt.firstOrNull(votingPercentage);
                                    num12 = num20;
                                } else {
                                    num12 = num5;
                                    num13 = null;
                                }
                                float floatValue3222 = ((Number) b2222.getValue()).floatValue();
                                final int i162222 = 0;
                                final Integer num172222 = num12;
                                final Integer num182222 = num11;
                                tc3 H3222 = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i172222 = i162222;
                                        Integer num192222 = num182222;
                                        Integer num202 = num172222;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i172222) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num202 == null || num192222 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num202.intValue(), num192222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num202 == null || num192222 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num202.intValue(), num192222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                int i172222 = i11 & 57344;
                                String str92222 = choice;
                                i12 = (i172222 != 16384) | av8Var2.i(w3fVar);
                                O = av8Var2.O();
                                if (!i12 || O == a99Var) {
                                    str3 = str2;
                                    final int i182222 = 0;
                                    O = new Function1() { // from class: w5l
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i192222 = i182222;
                                            w3f w3fVar2 = w3fVar;
                                            Function2 function22 = function2;
                                            String str102222 = (String) obj;
                                            switch (i192222) {
                                                case 0:
                                                    str102222.getClass();
                                                    function22.invoke(str102222, w3fVar2);
                                                    break;
                                                case 1:
                                                    str102222.getClass();
                                                    function22.invoke(str102222, w3fVar2);
                                                    break;
                                                default:
                                                    str102222.getClass();
                                                    function22.invoke(str102222, w3fVar2);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    av8Var2.n0(O);
                                } else {
                                    str3 = str2;
                                }
                                int i192222 = (458752 & (i11 << 6)) | 6;
                                b(H3222, num13, str92222, str3, floatValue3222, z, z2, (Function1) O, a32222, av8Var2, i192222);
                                av8Var = av8Var2;
                                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                if (w3fVar.r || j.size() != 3 || voteChoices == null) {
                                    z3 = false;
                                    av8Var.d0(-1154021690);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(-1155158553);
                                    xtc a5 = p8gVar2222.a(1.0f, utcVar, true);
                                    Integer num21 = votingPercentage != null ? (Integer) CollectionsKt.a0(1, votingPercentage) : null;
                                    String choice3 = voteChoices.getChoice();
                                    float floatValue4 = ((Number) b2222.getValue()).floatValue();
                                    tc3 H4 = yqo.H(1607332670, av8Var, new e6i(20, w3fVar, j));
                                    boolean i22 = (i172222 == 16384) | av8Var.i(w3fVar);
                                    Object O5 = av8Var.O();
                                    if (i22 || O5 == a99Var) {
                                        final int i23 = 1;
                                        O5 = new Function1() { // from class: w5l
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                int i1922222 = i23;
                                                w3f w3fVar2 = w3fVar;
                                                Function2 function22 = function2;
                                                String str102222 = (String) obj;
                                                switch (i1922222) {
                                                    case 0:
                                                        str102222.getClass();
                                                        function22.invoke(str102222, w3fVar2);
                                                        break;
                                                    case 1:
                                                        str102222.getClass();
                                                        function22.invoke(str102222, w3fVar2);
                                                        break;
                                                    default:
                                                        str102222.getClass();
                                                        function22.invoke(str102222, w3fVar2);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        av8Var.n0(O5);
                                    }
                                    b(H4, num21, choice3, str3, floatValue4, z, z2, (Function1) O5, a5, av8Var, i192222);
                                    z3 = false;
                                    bf3.u(utcVar, 8.0f, av8Var, false);
                                }
                                xtc a42222 = p8gVar2222.a(1.0f, utcVar, true);
                                Integer num22 = votingPercentage == null ? (Integer) CollectionsKt.j0(votingPercentage) : null;
                                choice2 = voteChoices2.getChoice();
                                if (z4) {
                                    choice2 = null;
                                }
                                if (choice2 == null) {
                                    choice2 = voteChoices3.getChoice();
                                }
                                String str102222 = choice2;
                                float floatValue22222 = ((Number) b2222.getValue()).floatValue();
                                final int i202222 = 1;
                                final Integer num192222 = num15;
                                tc3 H22222 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i1722222 = i202222;
                                        Integer num1922222 = num192222;
                                        Integer num202 = num16;
                                        w3f w3fVar2 = w3fVar;
                                        switch (i1722222) {
                                            case 0:
                                                xtc xtcVar5 = (xtc) obj;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                xtcVar5.getClass();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                                }
                                                av8 av8Var3 = (av8) of3Var2;
                                                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                    av8Var3.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var3.d0(-1611388100);
                                                    String v = oea.v(R.string.yes, av8Var3);
                                                    if (w3fVar2.c) {
                                                        v = null;
                                                    }
                                                    if (v == null) {
                                                        v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                    } else {
                                                        av8Var3.d0(-744714155);
                                                        av8Var3.s(false);
                                                    }
                                                    Locale locale = Locale.getDefault();
                                                    locale.getClass();
                                                    String upperCase = v.toUpperCase(locale);
                                                    upperCase.getClass();
                                                    z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611098188);
                                                    if (num202 == null || num1922222 == null) {
                                                        av8Var3.d0(-1610746741);
                                                        td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                        av8Var3.s(false);
                                                    } else {
                                                        av8Var3.d0(-1611007668);
                                                        z5l.d(num202.intValue(), num1922222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                        av8Var3.s(false);
                                                    }
                                                    av8Var3.s(false);
                                                }
                                                break;
                                            default:
                                                xtc xtcVar6 = (xtc) obj;
                                                of3 of3Var3 = (of3) obj2;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                xtcVar6.getClass();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                                }
                                                av8 av8Var4 = (av8) of3Var3;
                                                if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    av8Var4.W();
                                                } else if (w3fVar2.b == y3f.f) {
                                                    av8Var4.d0(-599351771);
                                                    String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                    if (v2 == null) {
                                                        v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                    } else {
                                                        av8Var4.d0(1227594828);
                                                        av8Var4.s(false);
                                                    }
                                                    Locale locale2 = Locale.getDefault();
                                                    locale2.getClass();
                                                    String upperCase2 = v2.toUpperCase(locale2);
                                                    upperCase2.getClass();
                                                    z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-599061859);
                                                    if (num202 == null || num1922222 == null) {
                                                        av8Var4.d0(-598710412);
                                                        td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                        av8Var4.s(false);
                                                    } else {
                                                        av8Var4.d0(-598971339);
                                                        z5l.d(num202.intValue(), num1922222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                        av8Var4.s(false);
                                                    }
                                                    av8Var4.s(false);
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                i13 = av8Var.i(w3fVar) | (i172222 != 16384 ? true : z3);
                                O2 = av8Var.O();
                                if (!i13 || O2 == a99Var) {
                                    final int i212222 = 2;
                                    O2 = new Function1() { // from class: w5l
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i1922222 = i212222;
                                            w3f w3fVar2 = w3fVar;
                                            Function2 function22 = function2;
                                            String str1022222 = (String) obj;
                                            switch (i1922222) {
                                                case 0:
                                                    str1022222.getClass();
                                                    function22.invoke(str1022222, w3fVar2);
                                                    break;
                                                case 1:
                                                    str1022222.getClass();
                                                    function22.invoke(str1022222, w3fVar2);
                                                    break;
                                                default:
                                                    str1022222.getClass();
                                                    function22.invoke(str1022222, w3fVar2);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    av8Var.n0(O2);
                                }
                                b(H22222, num22, str102222, str3, floatValue22222, z, z2, (Function1) O2, a42222, av8Var, i192222);
                                av8Var.s(true);
                                num8 = num172222;
                                num9 = num16;
                                num7 = num182222;
                                num10 = num192222;
                            }
                            votingPercentage = null;
                            Boolean valueOf22222 = Boolean.valueOf(z5);
                            g = av8Var2.g(str8) | av8Var2.h(z5);
                            Object O422222 = av8Var2.O();
                            if (g) {
                            }
                            l84Var = new l84(str8, z5, e1dVar, (rq3) null, 9);
                            str2 = str8;
                            z2 = z5;
                            av8Var2.n0(l84Var);
                            hz8.q(str2, valueOf22222, (Function2) l84Var, av8Var2);
                            cdi b22222 = a60.b(!((Boolean) e1dVar.getValue()).booleanValue() ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, jg5.a, 2), "horizontalBias", av8Var2, 3072, 20);
                            xtc x22222 = gz8.x(xtcVar2, null, null, 3);
                            l8g a222222 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                            xtc xtcVar422222 = xtcVar2;
                            int hashCode22222 = Long.hashCode(av8Var2.T);
                            aee m22222 = av8Var2.m();
                            xtc C22222 = fqj.C(av8Var2, x22222);
                            if3.k7.getClass();
                            xtcVar3 = xtcVar422222;
                            zg3 zg3Var22222 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                            }
                            waa.K(av8Var2, a222222, hf3.g);
                            waa.K(av8Var2, m22222, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode22222), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C22222, hf3.d);
                            p8g p8gVar22222 = p8g.a;
                            xtc a322222 = p8gVar22222.a(1.0f, utcVar, true);
                            choice = voteChoices3.getChoice();
                            if (z4) {
                            }
                            if (choice == null) {
                            }
                            if (votingPercentage == null) {
                            }
                            float floatValue32222 = ((Number) b22222.getValue()).floatValue();
                            final int i1622222 = 0;
                            final Integer num1722222 = num12;
                            final Integer num1822222 = num11;
                            tc3 H32222 = yqo.H(1348944227, av8Var2, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i1722222 = i1622222;
                                    Integer num1922222 = num1822222;
                                    Integer num202 = num1722222;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i1722222) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num202 == null || num1922222 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num202.intValue(), num1922222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num202 == null || num1922222 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num202.intValue(), num1922222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            int i1722222 = i11 & 57344;
                            String str922222 = choice;
                            i12 = (i1722222 != 16384) | av8Var2.i(w3fVar);
                            O = av8Var2.O();
                            if (i12) {
                            }
                            str3 = str2;
                            final int i1822222 = 0;
                            O = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i1922222 = i1822222;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str1022222 = (String) obj;
                                    switch (i1922222) {
                                        case 0:
                                            str1022222.getClass();
                                            function22.invoke(str1022222, w3fVar2);
                                            break;
                                        case 1:
                                            str1022222.getClass();
                                            function22.invoke(str1022222, w3fVar2);
                                            break;
                                        default:
                                            str1022222.getClass();
                                            function22.invoke(str1022222, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O);
                            int i1922222 = (458752 & (i11 << 6)) | 6;
                            b(H32222, num13, str922222, str3, floatValue32222, z, z2, (Function1) O, a322222, av8Var2, i1922222);
                            av8Var = av8Var2;
                            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                            if (w3fVar.r) {
                            }
                            z3 = false;
                            av8Var.d0(-1154021690);
                            av8Var.s(false);
                            xtc a422222 = p8gVar22222.a(1.0f, utcVar, true);
                            if (votingPercentage == null) {
                            }
                            choice2 = voteChoices2.getChoice();
                            if (z4) {
                            }
                            if (choice2 == null) {
                            }
                            String str1022222 = choice2;
                            float floatValue222222 = ((Number) b22222.getValue()).floatValue();
                            final int i2022222 = 1;
                            final Integer num1922222 = num15;
                            tc3 H222222 = yqo.H(-2023301350, av8Var, new ct8() { // from class: v5l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i17222222 = i2022222;
                                    Integer num19222222 = num1922222;
                                    Integer num202 = num16;
                                    w3f w3fVar2 = w3fVar;
                                    switch (i17222222) {
                                        case 0:
                                            xtc xtcVar5 = (xtc) obj;
                                            of3 of3Var2 = (of3) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            xtcVar5.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((av8) of3Var2).g(xtcVar5) ? 4 : 2;
                                            }
                                            av8 av8Var3 = (av8) of3Var2;
                                            if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                                av8Var3.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var3.d0(-1611388100);
                                                String v = oea.v(R.string.yes, av8Var3);
                                                if (w3fVar2.c) {
                                                    v = null;
                                                }
                                                if (v == null) {
                                                    v = ljg.k(av8Var3, -744711613, R.string.no, av8Var3, false);
                                                } else {
                                                    av8Var3.d0(-744714155);
                                                    av8Var3.s(false);
                                                }
                                                Locale locale = Locale.getDefault();
                                                locale.getClass();
                                                String upperCase = v.toUpperCase(locale);
                                                upperCase.getClass();
                                                z5l.c((intValue << 3) & 112, av8Var3, xtcVar5, upperCase);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(-1611098188);
                                                if (num202 == null || num19222222 == null) {
                                                    av8Var3.d0(-1610746741);
                                                    td4.G(i2, bkh.l(xtcVar5, 24.0f), false, 0L, av8Var3, 0, 12);
                                                    av8Var3.s(false);
                                                } else {
                                                    av8Var3.d0(-1611007668);
                                                    z5l.d(num202.intValue(), num19222222.intValue(), (intValue << 6) & 896, av8Var3, xtcVar5);
                                                    av8Var3.s(false);
                                                }
                                                av8Var3.s(false);
                                            }
                                            break;
                                        default:
                                            xtc xtcVar6 = (xtc) obj;
                                            of3 of3Var3 = (of3) obj2;
                                            int intValue2 = ((Integer) obj3).intValue();
                                            xtcVar6.getClass();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((av8) of3Var3).g(xtcVar6) ? 4 : 2;
                                            }
                                            av8 av8Var4 = (av8) of3Var3;
                                            if (!av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                av8Var4.W();
                                            } else if (w3fVar2.b == y3f.f) {
                                                av8Var4.d0(-599351771);
                                                String v2 = !w3fVar2.c ? oea.v(R.string.no, av8Var4) : null;
                                                if (v2 == null) {
                                                    v2 = ljg.k(av8Var4, 1227597339, R.string.yes, av8Var4, false);
                                                } else {
                                                    av8Var4.d0(1227594828);
                                                    av8Var4.s(false);
                                                }
                                                Locale locale2 = Locale.getDefault();
                                                locale2.getClass();
                                                String upperCase2 = v2.toUpperCase(locale2);
                                                upperCase2.getClass();
                                                z5l.c((intValue2 << 3) & 112, av8Var4, xtcVar6, upperCase2);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-599061859);
                                                if (num202 == null || num19222222 == null) {
                                                    av8Var4.d0(-598710412);
                                                    td4.G(i2, bkh.l(xtcVar6, 24.0f), false, 0L, av8Var4, 0, 12);
                                                    av8Var4.s(false);
                                                } else {
                                                    av8Var4.d0(-598971339);
                                                    z5l.d(num202.intValue(), num19222222.intValue(), (intValue2 << 6) & 896, av8Var4, xtcVar6);
                                                    av8Var4.s(false);
                                                }
                                                av8Var4.s(false);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                            i13 = av8Var.i(w3fVar) | (i1722222 != 16384 ? true : z3);
                            O2 = av8Var.O();
                            if (!i13) {
                            }
                            final int i2122222 = 2;
                            O2 = new Function1() { // from class: w5l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i19222222 = i2122222;
                                    w3f w3fVar2 = w3fVar;
                                    Function2 function22 = function2;
                                    String str10222222 = (String) obj;
                                    switch (i19222222) {
                                        case 0:
                                            str10222222.getClass();
                                            function22.invoke(str10222222, w3fVar2);
                                            break;
                                        case 1:
                                            str10222222.getClass();
                                            function22.invoke(str10222222, w3fVar2);
                                            break;
                                        default:
                                            str10222222.getClass();
                                            function22.invoke(str10222222, w3fVar2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var.n0(O2);
                            b(H222222, num22, str1022222, str3, floatValue222222, z, z2, (Function1) O2, a422222, av8Var, i1922222);
                            av8Var.s(true);
                            num8 = num1722222;
                            num9 = num16;
                            num7 = num1822222;
                            num10 = num1922222;
                        }
                    }
                    u = av8Var.u();
                    if (u == null) {
                        final xtc xtcVar5 = xtcVar3;
                        u.d = new Function2() { // from class: x5l
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z5l.a(i, i2, w3fVar, z, function2, xtcVar5, num8, num7, num9, num10, (of3) obj, aba.K(i3 | 1), i4);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i9;
                i11 = i5;
                if (av8Var2.T(i11 & 1, (i5 & 306783379) == 306783378)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            num5 = num;
            i7 = i4 & 128;
            if (i7 != 0) {
            }
            i8 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i8 != 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i5;
            if (av8Var2.T(i11 & 1, (i5 & 306783379) == 306783378)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        num5 = num;
        i7 = i4 & 128;
        if (i7 != 0) {
        }
        i8 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 != 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i5;
        if (av8Var2.T(i11 & 1, (i5 & 306783379) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(final tc3 tc3Var, final Integer num, final String str, final String str2, final float f, final boolean z, final boolean z2, final Function1 function1, final xtc xtcVar, of3 of3Var, final int i) {
        int i2;
        av8 av8Var;
        int i3;
        int i4;
        int i5;
        int i6;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-653931558);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(tc3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(str2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var2.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var2.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var2.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 67108864 : 33554432;
        }
        if (av8Var2.T(i2 & 1, (38347923 & i2) != 38347922)) {
            e1d g = e.g(Boolean.valueOf(f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z), av8Var2);
            xtc A = wnn.A(bkh.g(xtcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(32.0f));
            boolean booleanValue = ((Boolean) g.getValue()).booleanValue();
            boolean z3 = ((29360128 & i2) == 8388608) | ((i2 & 896) == 256);
            Object O = av8Var2.O();
            if (z3 || O == nf3.a) {
                O = new fej(21, str, function1);
                av8Var2.n0(O);
            }
            int i7 = i2;
            xtc y = tol.y(A, booleanValue, false, false, 0L, null, (Function0) O, av8Var2, 30);
            if (Intrinsics.c(str, str2) || z2 || (str2 == null && !z)) {
                i3 = 697500941;
                i4 = R.color.primary_default;
            } else {
                i3 = 697565111;
                i4 = R.color.n_lv_4;
            }
            xtc o = yso.o(y, 1.0f, ljg.f(av8Var2, i3, i4, av8Var2, false), o7g.a(32.0f));
            if (!Intrinsics.c(str, str2) || z2) {
                i5 = -1362964345;
                i6 = R.color.surface_2;
            } else {
                i5 = -1362965201;
                i6 = R.color.primary_highlight;
            }
            xtc c0 = l98.c0(n9e.q(o, ljg.f(av8Var2, i5, i6, av8Var2, false), oyn.e), 16.0f, 4.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            mv1 mv1Var = new mv1(z ? -1.0f : f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            tc3Var.invoke(n12Var.a(utcVar, mv1Var), av8Var2, Integer.valueOf((i7 << 3) & 112));
            fz8.e(!((Boolean) g.getValue()).booleanValue(), n12Var.a(utcVar, uxf.h), uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, yqo.H(-758766920, av8Var2, new zya(15, num, str, str2)), av8Var2, 200064, 16);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: y5l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z5l.b(tc3.this, num, str, str2, f, z, z2, function1, xtcVar, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, String str) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-840608310);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            int i3 = i2 & 14;
            av8Var = av8Var2;
            udj.c(str, bkh.p(xtcVar, ((kx4) av8Var2.k(dh3.h)).C0(((int) (jej.a(h5a.Q(0, 0, 1, av8Var2), str, xth.k(), 1020).c >> 32)) + 2)), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, i3, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yi7(str, xtcVar, i, 4);
        }
    }

    public static final void d(int i, int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1090380805);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= av8Var.e(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc p = bkh.p(xtcVar, 44.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, p);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 24.0f);
            mv1 mv1Var = uxf.h;
            n12 n12Var = n12.a;
            td4.G(i5, n12Var.a(l, mv1Var), false, 0L, av8Var, (i4 >> 3) & 14, 12);
            td4.G(i, n12Var.a(bkh.l(utcVar, 24.0f), uxf.f), false, 0L, av8Var, i4 & 14, 12);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cu7(i, i2, xtcVar, i3, 1);
        }
    }
}
