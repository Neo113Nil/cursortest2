package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideInstructionStyle;
import com.google.android.gms.internal.fido.zzgx;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class r4a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static void A(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static and B(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds) {
        oddsCountryProvider.getClass();
        providerOdds.getClass();
        OddsProvider provider = oddsCountryProvider.getProvider();
        provider.getClass();
        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
        String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
        if (defaultBetSlipLink == null) {
            defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
        }
        return new and(new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()), egf.a(context, oddsCountryProvider, providerOdds));
    }

    public static final t28 C(int i) {
        return new t28(p4a.b, new f0c(i));
    }

    public static TypedArray D(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final void E(String str, int i, Bundle bundle) {
        str.getClass();
        bundle.putInt(str, i);
    }

    public static final void F(Bundle bundle, String str, List list) {
        str.getClass();
        list.getClass();
        bundle.putParcelableArrayList(str, h5a.R(list));
    }

    public static final void G(Bundle bundle, String str, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    public static final void H(String str, Bundle bundle, String str2) {
        str.getClass();
        str2.getClass();
        bundle.putString(str, str2);
    }

    public static final void I(Bundle bundle, String str, List list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, h5a.R(list));
    }

    public static xtc J(xtc xtcVar, int i, int i2) {
        long j = r13.h;
        List j2 = b.j(new r13(j), new r13(r13.d), new r13(j));
        xtcVar.getClass();
        j2.getClass();
        return fqj.q(xtcVar, new ffh(i2, i, "M54,6V72L27,78.01L0,72V6L27,0L54,6Z", j2));
    }

    public static final long K(String str, long j, long j2, long j3) {
        String str2;
        int i = hri.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long k0 = StringsKt.k0(str2);
        if (k0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = k0.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        fn0.t(j3, "..", ", but is '", sb);
        sb.append(longValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int L(int i, int i2, String str) {
        return (int) K(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final void M(zzc zzcVar) {
        zzcVar.getClass();
        zzcVar.a(Unit.a);
    }

    public static String N(zzgx zzgxVar) {
        StringBuilder sb = new StringBuilder(zzgxVar.m());
        for (int i = 0; i < zzgxVar.m(); i++) {
            byte c2 = zzgxVar.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean O(byte b2) {
        return b2 > -65;
    }

    public static final void a(float f, int i, long j, long j2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1147017405);
        int i2 = (av8Var.f(j) ? 4 : 2) | i | (av8Var.f(j2) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= av8Var.d(f) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int i3 = i2;
            xtc q = n9e.q(bkh.l(utcVar, 24.0f), j2, o7g.a(4.0f));
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_arrow_drop_down_16, 6, av8Var), null, n12.a.a(bkh.l(haa.v(utcVar, f), 16.0f), uxf.g), j, av8Var, ((i3 << 9) & 7168) | 48, 0);
            i.o(av8Var, true, utcVar, 4.0f, av8Var);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pth(j, j2, f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(oxh oxhVar, uxh uxhVar, boolean z, xtc xtcVar, boolean z2, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        boolean z3;
        xtc xtcVar3;
        boolean z4;
        eqf u;
        long j;
        p8g p8gVar;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1547003602);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(oxhVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(uxhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= av8Var.h(z3) ? 16384 : 8192;
                if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                    xtc xtcVar4 = utc.a;
                    xtc xtcVar5 = i6 != 0 ? xtcVar4 : xtcVar2;
                    boolean z5 = i4 != 0 ? false : z3;
                    xtc c0 = l98.c0(kda.w(xtcVar5), 8.0f, 2.0f);
                    l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    ct8 ct8Var = oxhVar.c;
                    pxh pxhVar = oxhVar.e;
                    if (ct8Var == null) {
                        av8Var.d0(-61129514);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-61129513);
                        ct8Var.invoke(kda.O(bkh.l(xtcVar4, 24.0f), "image_first", av8Var), av8Var, 0);
                        av8Var.s(false);
                    }
                    ct8 ct8Var2 = oxhVar.d;
                    if (ct8Var2 == null) {
                        av8Var.d0(-60937035);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-60937034);
                        ct8Var2.invoke(kda.O(bkh.l(xtcVar4, 24.0f), "image_second", av8Var), av8Var, 0);
                        av8Var.s(false);
                    }
                    String str = oxhVar.b;
                    p8g p8gVar2 = p8g.a;
                    if (str == null) {
                        av8Var.d0(-60748183);
                        av8Var.s(false);
                        p8gVar = p8gVar2;
                        i5 = 6;
                    } else {
                        av8Var.d0(-60748182);
                        if (Intrinsics.c(pxhVar != null ? Boolean.valueOf(pxhVar.b) : null, Boolean.TRUE)) {
                            xtcVar4 = p8gVar2.a(1.0f, xtcVar4, true);
                        }
                        xtc O = kda.O(xtcVar4, "item_text", av8Var);
                        boolean z6 = oxhVar.f;
                        if (z) {
                            av8Var.d0(-69826559);
                            j = z5 ? ljg.f(av8Var, -69826078, R.color.primary_default, av8Var, false) : ljg.f(av8Var, -69825288, R.color.n_lv_1, av8Var, false);
                            av8Var.s(false);
                        } else if (z6) {
                            av8Var.d0(-69824026);
                            j = ((r13) uxhVar.d.invoke(av8Var, 0)).a;
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-69822629);
                            j = ((r13) uxhVar.c.invoke(av8Var, 0)).a;
                            av8Var.s(false);
                        }
                        long j2 = j;
                        p8gVar = p8gVar2;
                        i5 = 6;
                        l(0, j2, av8Var, O, str);
                        av8Var.s(false);
                    }
                    tc3 tc3Var = pxhVar != null ? pxhVar.a : null;
                    if (tc3Var == null) {
                        av8Var.d0(-60330613);
                    } else {
                        av8Var.d0(-1248872138);
                        tc3Var.invoke(p8gVar, av8Var, Integer.valueOf(i5));
                    }
                    av8Var.s(false);
                    av8Var.s(true);
                    xtcVar3 = xtcVar5;
                    z4 = z5;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    z4 = z3;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new e82(oxhVar, uxhVar, z, xtcVar3, z4, i, i2, 7);
                    return;
                }
                return;
            }
            z3 = z2;
            if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void c(String str, xtc xtcVar, dfj dfjVar, long j, bqh bqhVar, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        long j2;
        long D;
        int i2;
        tc3 H;
        boolean z;
        boolean z2;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2055490743);
        int i3 = 2;
        int i4 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(dfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 1024 | (av8Var2.g(bqhVar) ? 16384 : 8192) | (av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var2.T(i4 & 1, (74899 & i4) != 74898)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                D = lz.D(R.color.primary_default, av8Var2);
                i2 = i4 & (-7169);
            } else {
                av8Var2.W();
                i2 = i4 & (-7169);
                D = j;
            }
            av8Var2.t();
            if (bqhVar == null) {
                av8Var2.d0(-1775686862);
                av8Var2.s(false);
                H = null;
            } else {
                av8Var2.d0(-1775686861);
                H = yqo.H(-1806245320, av8Var2, new o47(bqhVar, D, i3));
                av8Var2.s(false);
            }
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
            boolean z3 = (i2 & 458752) == 131072;
            Object O = av8Var2.O();
            int i5 = 15;
            if (z3 || O == nf3.a) {
                O = new ve7(i5, function0);
                av8Var2.n0(O);
            }
            long j3 = D;
            xtc c0 = l98.c0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 16.0f, 10.0f);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var2, 54);
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
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            if (Intrinsics.c(bqhVar != null ? bqhVar.b : null, uxf.o)) {
                av8Var2.d0(2057018285);
                if (H == null) {
                    av8Var2.d0(-656942604);
                    z2 = false;
                } else {
                    z2 = false;
                    av8Var2.d0(2057018285);
                    H.invoke(av8Var2, 0);
                }
                av8Var2.s(z2);
                av8Var2.s(z2);
            } else {
                av8Var2.d0(-656924995);
                av8Var2.s(false);
            }
            udj.c(str, null, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar, av8Var2, i2 & 14, (29360128 & (i2 << 15)) | 24960, 110586);
            av8Var = av8Var2;
            if (Intrinsics.c(bqhVar != null ? bqhVar.b : null, uxf.q)) {
                av8Var.d0(2057026765);
                if (H == null) {
                    av8Var.d0(-656679724);
                    z = false;
                } else {
                    z = false;
                    av8Var.d0(2057026765);
                    H.invoke(av8Var, 0);
                }
                av8Var.s(z);
                av8Var.s(z);
            } else {
                av8Var.d0(-656662115);
                av8Var.s(false);
            }
            av8Var.s(true);
            j2 = j3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            j2 = j;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vka(str, xtcVar, dfjVar, j2, bqhVar, function0, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0537, code lost:
    
        if (r11.g(r7) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x055c, code lost:
    
        if (r11.g(r9) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0578, code lost:
    
        if (r11.g(r10) == false) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0625 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030d A[LOOP:2: B:206:0x0307->B:208:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /* JADX WARN: Type inference failed for: r10v34, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r11v1, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(asg asgVar, o8d o8dVar, xtc xtcVar, io ioVar, Function1 function1, Function1 function12, Function2 function2, of3 of3Var, int i) {
        av8 av8Var;
        boolean z;
        boolean z2;
        float f;
        int i2;
        Object obj;
        boolean z3;
        Object O;
        Object O2;
        g0d g0dVar;
        eoh eohVar;
        int b2;
        float f2;
        ArrayList arrayList;
        Object O3;
        SnapshotStateList snapshotStateList;
        boolean i3;
        Object O4;
        boolean g;
        Object O5;
        ArrayList arrayList2;
        g0d g0dVar2;
        Iterator it;
        Iterator it2;
        boolean c2;
        int size;
        int i4;
        SnapshotStateList snapshotStateList2;
        Set set;
        Object put;
        int i5;
        trg trgVar;
        axj axjVar;
        rq3 rq3Var;
        boolean z4;
        final Function2 function22;
        boolean z5;
        final Function1 function13;
        boolean z6;
        final Function1 function14;
        boolean z7;
        Object O6;
        Object obj2;
        ?? r14;
        int i6;
        g0d g0dVar3;
        ArrayList arrayList3;
        boolean g2;
        Object O7;
        Object O8;
        ?? r10;
        boolean g3;
        Object O9;
        ?? r7;
        int size2;
        rq3 rq3Var2;
        trg trgVar2;
        ArrayList arrayList4 = asgVar.a;
        ?? r11 = (av8) of3Var;
        r11.f0(-303833701);
        int i7 = (i & 6) == 0 ? (r11.g(asgVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= r11.g(o8dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= r11.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= r11.g(ioVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= r11.i(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i7 |= r11.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i7 |= r11.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i7 |= r11.i(function2) ? 8388608 : 4194304;
        }
        boolean z8 = true;
        if (r11.T(i7 & 1, (4793491 & i7) != 4793490)) {
            r11.Y();
            if ((i & 1) != 0 && !r11.B()) {
                r11.W();
            }
            r11.t();
            trg trgVar3 = asgVar.c;
            Object O10 = r11.O();
            Object obj3 = nf3.a;
            if (O10 == obj3) {
                O10 = new o0h(trgVar3);
                r11.n0(O10);
            }
            o0h o0hVar = (o0h) O10;
            axj H = yso.H(o0hVar, "scene", r11, 56);
            t01 t01Var = H.a;
            e1d e1dVar = H.d;
            boolean g4 = r11.g((trg) t01Var.w());
            Object O11 = r11.O();
            if (g4 || O11 == obj3) {
                O11 = CollectionsKt.S0(arrayList4);
                r11.n0(O11);
            }
            List list = (List) O11;
            int i8 = i7;
            trg trgVar4 = (trg) CollectionsKt.j0(asgVar.d);
            r8d r8dVar = (r8d) ((eoh) o8dVar.a).getValue();
            boolean z9 = r8dVar instanceof q8d;
            if (!z9 || trgVar4 == null) {
                z = z9;
                z2 = false;
            } else {
                z = z9;
                z2 = true;
            }
            boolean z10 = r8dVar instanceof p8d;
            if (z10) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                if (!z) {
                    zzl.b();
                    return;
                }
                f = ((q8d) r8dVar).a.b;
            }
            if (z10) {
                i2 = 2;
            } else {
                if (!z) {
                    zzl.b();
                    return;
                }
                i2 = ((q8d) r8dVar).a.a;
            }
            ArrayList arrayList5 = new ArrayList(k13.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((e7d) it3.next()).b);
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList6.add(((e7d) it4.next()).b);
            }
            if (Intrinsics.c(CollectionsKt.Y(arrayList5), CollectionsKt.Y(arrayList6)) && arrayList6.size() <= arrayList5.size()) {
                v6a it5 = b.h(arrayList6).iterator();
                while (true) {
                    if (!it5.c) {
                        obj = null;
                        break;
                    }
                    obj = it5.next();
                    int intValue = ((Number) obj).intValue();
                    v6a v6aVar = it5;
                    if (!Intrinsics.c(arrayList6.get(intValue), arrayList5.get(intValue))) {
                        break;
                    } else {
                        it5 = v6aVar;
                    }
                }
                if (((Integer) obj) == null && arrayList6.size() != arrayList5.size()) {
                    z3 = true;
                    O = r11.O();
                    if (O == obj3) {
                        O = new koh();
                        r11.n0(O);
                    }
                    koh kohVar = (koh) O;
                    O2 = r11.O();
                    if (O2 == obj3) {
                        int i9 = ujd.a;
                        O2 = new g0d(6);
                        r11.n0(O2);
                    }
                    g0dVar = (g0d) O2;
                    e70 e70Var = new e70((trg) t01Var.w());
                    eohVar = (eoh) e1dVar;
                    final boolean z11 = z3;
                    e70 e70Var2 = new e70((trg) eohVar.getValue());
                    b2 = g0dVar.b(e70Var);
                    if (b2 < 0) {
                        f2 = g0dVar.c[b2];
                    } else {
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        g0dVar.f(e70Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    float f3 = f2;
                    float c3 = (!z2 || Intrinsics.c(eohVar.getValue(), trgVar3) || g0dVar.b(e70Var2) < 0) ? !e70Var.equals(e70Var2) ? f3 : (z11 || z2) ? f3 - 1.0f : f3 + 1.0f : g0dVar.c(e70Var2);
                    kohVar.put(e70Var2, eohVar.getValue());
                    tnh tnhVar = kohVar.b;
                    g0dVar.f(e70Var2, c3);
                    arrayList = asgVar.b;
                    O3 = r11.O();
                    if (O3 == obj3) {
                        O3 = new SnapshotStateList();
                        r11.n0(O3);
                    }
                    snapshotStateList = (SnapshotStateList) O3;
                    i3 = r11.i(arrayList);
                    O4 = r11.O();
                    float f4 = c3;
                    int i10 = 24;
                    if (!i3 || O4 == obj3) {
                        O4 = new qa7(arrayList, snapshotStateList, null, i10);
                        r11.n0(O4);
                    }
                    hz8.o(r11, arrayList, (Function2) O4);
                    List S0 = CollectionsKt.S0(tnhVar);
                    snapshotStateList.getClass();
                    g = r11.g(g0dVar.toString()) | r11.g(j72.B(snapshotStateList).c) | r11.g(S0);
                    O5 = r11.O();
                    if (!g || O5 == obj3) {
                        ltb ltbVar = new ltb();
                        ArrayList arrayList7 = new ArrayList();
                        arrayList2 = arrayList;
                        List H0 = CollectionsKt.H0(tnhVar, new cp(g0dVar, 24));
                        g0dVar2 = g0dVar;
                        ArrayList arrayList8 = new ArrayList(k13.r(H0, 10));
                        it = H0.iterator();
                        while (it.hasNext()) {
                            arrayList8.add((trg) ((Map.Entry) it.next()).getValue());
                        }
                        it2 = arrayList8.iterator();
                        while (it2.hasNext()) {
                            trg trgVar5 = (trg) it2.next();
                            if (!arrayList7.contains(trgVar5)) {
                                arrayList7.add(trgVar5);
                            }
                        }
                        ArrayList w0 = CollectionsKt.w0(arrayList7, snapshotStateList);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        c2 = Intrinsics.c(eohVar.getValue(), CollectionsKt.Y(arrayList7));
                        size = w0.size();
                        i4 = 0;
                        while (i4 < size) {
                            SnapshotStateList snapshotStateList3 = snapshotStateList;
                            trg trgVar6 = (trg) w0.get(i4);
                            ArrayList arrayList9 = w0;
                            List entries = trgVar6.getEntries();
                            boolean z12 = c2;
                            int i11 = size;
                            int i12 = i4;
                            ArrayList arrayList10 = new ArrayList(k13.r(entries, 10));
                            Iterator it6 = entries.iterator();
                            while (it6.hasNext()) {
                                arrayList10.add(((e7d) it6.next()).b);
                            }
                            ArrayList arrayList11 = new ArrayList();
                            Iterator it7 = arrayList10.iterator();
                            while (it7.hasNext()) {
                                Object next = it7.next();
                                if (!linkedHashSet.contains(next)) {
                                    arrayList11.add(next);
                                }
                            }
                            Set W0 = CollectionsKt.W0(arrayList11);
                            if (z12 || Intrinsics.c(eohVar.getValue(), trgVar6)) {
                                set = W0;
                                put = ltbVar.put(new e70(trgVar6), CollectionsKt.V0(linkedHashSet));
                            } else {
                                e70 e70Var3 = new e70(trgVar6);
                                List entries2 = ((trg) eohVar.getValue()).getEntries();
                                ArrayList arrayList12 = new ArrayList(entries2.size());
                                int size3 = entries2.size();
                                set = W0;
                                int i13 = 0;
                                while (i13 < size3) {
                                    arrayList12.add(((e7d) entries2.get(i13)).b);
                                    i13++;
                                    entries2 = entries2;
                                }
                                HashSet hashSet = new HashSet(arrayList12.size());
                                int i14 = 0;
                                for (int size4 = arrayList12.size(); i14 < size4; size4 = size4) {
                                    hashSet.add(arrayList12.get(i14));
                                    i14++;
                                }
                                put = ltbVar.put(e70Var3, hashSet);
                            }
                            linkedHashSet.addAll(set);
                            i4 = i12 + 1;
                            w0 = arrayList9;
                            snapshotStateList = snapshotStateList3;
                            c2 = z12;
                            size = i11;
                        }
                        snapshotStateList2 = snapshotStateList;
                        if (!c2) {
                            ltbVar.put(new e70((trg) eohVar.getValue()), rm5.a);
                        }
                        O5 = ltbVar.d();
                        r11.n0(O5);
                    } else {
                        snapshotStateList2 = snapshotStateList;
                        g0dVar2 = g0dVar;
                        arrayList2 = arrayList;
                    }
                    Map map = (Map) O5;
                    trg trgVar7 = f3 < f4 ? (trg) t01Var.w() : (trg) eohVar.getValue();
                    if (z2) {
                        i5 = 131072;
                        rq3 rq3Var3 = null;
                        r11.d0(-2005826792);
                        boolean i15 = r11.i(o0hVar) | r11.g(trgVar3) | r11.g(H);
                        Object O12 = r11.O();
                        if (i15 || O12 == obj3) {
                            va8 va8Var = new va8(o0hVar, trgVar3, H, rq3Var3, 23);
                            trgVar = trgVar3;
                            axjVar = H;
                            rq3Var = null;
                            r11.n0(va8Var);
                            O12 = va8Var;
                        } else {
                            axjVar = H;
                            trgVar = trgVar3;
                            rq3Var = null;
                        }
                        hz8.o(r11, trgVar, (Function2) O12);
                        z4 = false;
                        r11.s(false);
                    } else {
                        r11.d0(-2006161995);
                        if (Intrinsics.c(t01Var.w(), trgVar4)) {
                            z4 = false;
                            i5 = 131072;
                            rq3Var2 = null;
                            r11.d0(-2005904633);
                            r11.s(false);
                        } else {
                            r11.d0(-2006108365);
                            Float valueOf = Float.valueOf(f);
                            boolean i16 = r11.i(o0hVar) | r11.d(f) | r11.g(trgVar4);
                            Object O13 = r11.O();
                            if (i16 || O13 == obj3) {
                                i5 = 131072;
                                rq3Var2 = null;
                                pv2 pv2Var = new pv2(o0hVar, f, trgVar4, rq3Var2, 1);
                                trgVar2 = trgVar4;
                                r11.n0(pv2Var);
                                O13 = pv2Var;
                            } else {
                                trgVar2 = trgVar4;
                                i5 = 131072;
                                rq3Var2 = null;
                            }
                            hz8.q(trgVar2, valueOf, (Function2) O13, r11);
                            z4 = false;
                            r11.s(false);
                        }
                        r11.s(z4);
                        axjVar = H;
                        rq3Var = rq3Var2;
                    }
                    boolean h = r11.h(z2) | r11.g(trgVar7) | r11.e(i2);
                    if (((i8 & 29360128) ^ 12582912) <= 8388608) {
                        function22 = function2;
                    } else {
                        function22 = function2;
                    }
                    if ((i8 & 12582912) != 8388608) {
                        z5 = z4;
                        boolean h2 = h | z5 | r11.h(z11);
                        if (((i8 & 3670016) ^ 1572864) > 1048576) {
                            function13 = function12;
                        } else {
                            function13 = function12;
                        }
                        if ((i8 & 1572864) != 1048576) {
                            z6 = z4;
                            boolean z13 = h2 | z6;
                            if (((i8 & 458752) ^ 196608) <= i5) {
                                function14 = function1;
                            } else {
                                function14 = function1;
                            }
                            if ((i8 & 196608) != i5) {
                                z8 = z4;
                            }
                            z7 = z13 | z8;
                            O6 = r11.O();
                            if (!z7 || O6 == obj3) {
                                final int i17 = i2;
                                obj2 = obj3;
                                final trg trgVar8 = trgVar7;
                                final boolean z14 = z2;
                                r14 = z4;
                                i6 = i8;
                                g0dVar3 = g0dVar2;
                                arrayList3 = arrayList2;
                                Function1 function15 = new Function1() { // from class: y6d
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        pp3 pp3Var;
                                        pp3 pp3Var2;
                                        pp3 pp3Var3;
                                        r60 r60Var = (r60) obj4;
                                        boolean z15 = z14;
                                        trg trgVar9 = trgVar8;
                                        if (z15) {
                                            Object obj5 = trgVar9.x().get(it7.m.toString());
                                            if (obj5 == null) {
                                                obj5 = null;
                                            }
                                            Function2 function23 = i5k.f(2, obj5) ? (Function2) obj5 : null;
                                            int i18 = i17;
                                            return (function23 == null || (pp3Var3 = (pp3) function23.invoke(r60Var, Integer.valueOf(i18))) == null) ? (pp3) function22.invoke(r60Var, Integer.valueOf(i18)) : pp3Var3;
                                        }
                                        if (z11) {
                                            Object obj6 = trgVar9.x().get(k03.e.toString());
                                            if (obj6 == null) {
                                                obj6 = null;
                                            }
                                            Function1 function16 = i5k.f(1, obj6) ? (Function1) obj6 : null;
                                            return (function16 == null || (pp3Var2 = (pp3) function16.invoke(r60Var)) == null) ? (pp3) function13.invoke(r60Var) : pp3Var2;
                                        }
                                        Object obj7 = trgVar9.x().get(mx9.e.toString());
                                        Object obj8 = obj7;
                                        if (obj7 == null) {
                                            obj8 = null;
                                        }
                                        Function1 function17 = i5k.f(1, obj8) ? (Function1) obj8 : null;
                                        return (function17 == null || (pp3Var = (pp3) function17.invoke(r60Var)) == null) ? (pp3) function14.invoke(r60Var) : pp3Var;
                                    }
                                };
                                r11.n0(function15);
                                O6 = function15;
                            } else {
                                r14 = z4;
                                obj2 = obj3;
                                i6 = i8;
                                g0dVar3 = g0dVar2;
                                arrayList3 = arrayList2;
                            }
                            Function1 function16 = (Function1) O6;
                            fsf fsfVar = new fsf();
                            g2 = r11.g(function16) | r11.d(f4) | r11.i(rq3Var);
                            O7 = r11.O();
                            if (!g2 || O7 == obj2) {
                                O7 = new z6d(function16, f4, r14);
                                r11.n0(O7);
                            }
                            Function1 function17 = (Function1) O7;
                            O8 = r11.O();
                            if (O8 == obj2) {
                                O8 = new a7d(r14);
                                r11.n0(O8);
                            }
                            SnapshotStateList snapshotStateList4 = snapshotStateList2;
                            r10 = r11;
                            axj axjVar2 = axjVar;
                            l98.a(axjVar2, xtcVar, function17, ioVar, (Function1) O8, yqo.H(-1167420988, r11, new nlj(axjVar, snapshotStateList4, fsfVar, map, 6)), r10, (i6 & 7168) | ((i6 >> 3) & 112) | 221184);
                            g3 = r10.g(axjVar2) | r10.i(g0dVar3);
                            O9 = r10.O();
                            if (!g3 || O9 == obj2) {
                                rq3 rq3Var4 = rq3Var;
                                j8c j8cVar = new j8c(axjVar2, kohVar, g0dVar3, rq3Var4, 13);
                                r7 = rq3Var4;
                                r10.n0(j8cVar);
                                O9 = j8cVar;
                            } else {
                                r7 = rq3Var;
                            }
                            hz8.o(r10, axjVar2, (Function2) O9);
                            size2 = snapshotStateList4.size() - 1;
                            av8Var = r10;
                            if (size2 >= 0) {
                                if (snapshotStateList4.get(size2) != null) {
                                    pvd.j();
                                    return;
                                }
                                r10.a0(43486632, r7);
                                i2a.H(Intrinsics.c(CollectionsKt.firstOrNull(arrayList3), r7) ? e6b.e : e6b.d, r10);
                                mhb.a.getClass();
                                ff5 ff5Var = zrg.a;
                                throw r7;
                            }
                        }
                        z6 = true;
                        boolean z132 = h2 | z6;
                        if (((i8 & 458752) ^ 196608) <= i5) {
                        }
                        if ((i8 & 196608) != i5) {
                        }
                        z7 = z132 | z8;
                        O6 = r11.O();
                        if (z7) {
                        }
                        final int i172 = i2;
                        obj2 = obj3;
                        final trg trgVar82 = trgVar7;
                        final boolean z142 = z2;
                        r14 = z4;
                        i6 = i8;
                        g0dVar3 = g0dVar2;
                        arrayList3 = arrayList2;
                        Function1 function152 = new Function1() { // from class: y6d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                pp3 pp3Var;
                                pp3 pp3Var2;
                                pp3 pp3Var3;
                                r60 r60Var = (r60) obj4;
                                boolean z15 = z142;
                                trg trgVar9 = trgVar82;
                                if (z15) {
                                    Object obj5 = trgVar9.x().get(it7.m.toString());
                                    if (obj5 == null) {
                                        obj5 = null;
                                    }
                                    Function2 function23 = i5k.f(2, obj5) ? (Function2) obj5 : null;
                                    int i18 = i172;
                                    return (function23 == null || (pp3Var3 = (pp3) function23.invoke(r60Var, Integer.valueOf(i18))) == null) ? (pp3) function22.invoke(r60Var, Integer.valueOf(i18)) : pp3Var3;
                                }
                                if (z11) {
                                    Object obj6 = trgVar9.x().get(k03.e.toString());
                                    if (obj6 == null) {
                                        obj6 = null;
                                    }
                                    Function1 function162 = i5k.f(1, obj6) ? (Function1) obj6 : null;
                                    return (function162 == null || (pp3Var2 = (pp3) function162.invoke(r60Var)) == null) ? (pp3) function13.invoke(r60Var) : pp3Var2;
                                }
                                Object obj7 = trgVar9.x().get(mx9.e.toString());
                                Object obj8 = obj7;
                                if (obj7 == null) {
                                    obj8 = null;
                                }
                                Function1 function172 = i5k.f(1, obj8) ? (Function1) obj8 : null;
                                return (function172 == null || (pp3Var = (pp3) function172.invoke(r60Var)) == null) ? (pp3) function14.invoke(r60Var) : pp3Var;
                            }
                        };
                        r11.n0(function152);
                        O6 = function152;
                        Function1 function162 = (Function1) O6;
                        fsf fsfVar2 = new fsf();
                        g2 = r11.g(function162) | r11.d(f4) | r11.i(rq3Var);
                        O7 = r11.O();
                        if (!g2) {
                        }
                        O7 = new z6d(function162, f4, r14);
                        r11.n0(O7);
                        Function1 function172 = (Function1) O7;
                        O8 = r11.O();
                        if (O8 == obj2) {
                        }
                        SnapshotStateList snapshotStateList42 = snapshotStateList2;
                        r10 = r11;
                        axj axjVar22 = axjVar;
                        l98.a(axjVar22, xtcVar, function172, ioVar, (Function1) O8, yqo.H(-1167420988, r11, new nlj(axjVar, snapshotStateList42, fsfVar2, map, 6)), r10, (i6 & 7168) | ((i6 >> 3) & 112) | 221184);
                        g3 = r10.g(axjVar22) | r10.i(g0dVar3);
                        O9 = r10.O();
                        if (g3) {
                        }
                        rq3 rq3Var42 = rq3Var;
                        j8c j8cVar2 = new j8c(axjVar22, kohVar, g0dVar3, rq3Var42, 13);
                        r7 = rq3Var42;
                        r10.n0(j8cVar2);
                        O9 = j8cVar2;
                        hz8.o(r10, axjVar22, (Function2) O9);
                        size2 = snapshotStateList42.size() - 1;
                        av8Var = r10;
                        if (size2 >= 0) {
                        }
                    }
                    z5 = true;
                    boolean h22 = h | z5 | r11.h(z11);
                    if (((i8 & 3670016) ^ 1572864) > 1048576) {
                    }
                    if ((i8 & 1572864) != 1048576) {
                    }
                    z6 = true;
                    boolean z1322 = h22 | z6;
                    if (((i8 & 458752) ^ 196608) <= i5) {
                    }
                    if ((i8 & 196608) != i5) {
                    }
                    z7 = z1322 | z8;
                    O6 = r11.O();
                    if (z7) {
                    }
                    final int i1722 = i2;
                    obj2 = obj3;
                    final trg trgVar822 = trgVar7;
                    final boolean z1422 = z2;
                    r14 = z4;
                    i6 = i8;
                    g0dVar3 = g0dVar2;
                    arrayList3 = arrayList2;
                    Function1 function1522 = new Function1() { // from class: y6d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            pp3 pp3Var;
                            pp3 pp3Var2;
                            pp3 pp3Var3;
                            r60 r60Var = (r60) obj4;
                            boolean z15 = z1422;
                            trg trgVar9 = trgVar822;
                            if (z15) {
                                Object obj5 = trgVar9.x().get(it7.m.toString());
                                if (obj5 == null) {
                                    obj5 = null;
                                }
                                Function2 function23 = i5k.f(2, obj5) ? (Function2) obj5 : null;
                                int i18 = i1722;
                                return (function23 == null || (pp3Var3 = (pp3) function23.invoke(r60Var, Integer.valueOf(i18))) == null) ? (pp3) function22.invoke(r60Var, Integer.valueOf(i18)) : pp3Var3;
                            }
                            if (z11) {
                                Object obj6 = trgVar9.x().get(k03.e.toString());
                                if (obj6 == null) {
                                    obj6 = null;
                                }
                                Function1 function1622 = i5k.f(1, obj6) ? (Function1) obj6 : null;
                                return (function1622 == null || (pp3Var2 = (pp3) function1622.invoke(r60Var)) == null) ? (pp3) function13.invoke(r60Var) : pp3Var2;
                            }
                            Object obj7 = trgVar9.x().get(mx9.e.toString());
                            Object obj8 = obj7;
                            if (obj7 == null) {
                                obj8 = null;
                            }
                            Function1 function1722 = i5k.f(1, obj8) ? (Function1) obj8 : null;
                            return (function1722 == null || (pp3Var = (pp3) function1722.invoke(r60Var)) == null) ? (pp3) function14.invoke(r60Var) : pp3Var;
                        }
                    };
                    r11.n0(function1522);
                    O6 = function1522;
                    Function1 function1622 = (Function1) O6;
                    fsf fsfVar22 = new fsf();
                    g2 = r11.g(function1622) | r11.d(f4) | r11.i(rq3Var);
                    O7 = r11.O();
                    if (!g2) {
                    }
                    O7 = new z6d(function1622, f4, r14);
                    r11.n0(O7);
                    Function1 function1722 = (Function1) O7;
                    O8 = r11.O();
                    if (O8 == obj2) {
                    }
                    SnapshotStateList snapshotStateList422 = snapshotStateList2;
                    r10 = r11;
                    axj axjVar222 = axjVar;
                    l98.a(axjVar222, xtcVar, function1722, ioVar, (Function1) O8, yqo.H(-1167420988, r11, new nlj(axjVar, snapshotStateList422, fsfVar22, map, 6)), r10, (i6 & 7168) | ((i6 >> 3) & 112) | 221184);
                    g3 = r10.g(axjVar222) | r10.i(g0dVar3);
                    O9 = r10.O();
                    if (g3) {
                    }
                    rq3 rq3Var422 = rq3Var;
                    j8c j8cVar22 = new j8c(axjVar222, kohVar, g0dVar3, rq3Var422, 13);
                    r7 = rq3Var422;
                    r10.n0(j8cVar22);
                    O9 = j8cVar22;
                    hz8.o(r10, axjVar222, (Function2) O9);
                    size2 = snapshotStateList422.size() - 1;
                    av8Var = r10;
                    if (size2 >= 0) {
                    }
                }
            }
            z3 = false;
            O = r11.O();
            if (O == obj3) {
            }
            koh kohVar2 = (koh) O;
            O2 = r11.O();
            if (O2 == obj3) {
            }
            g0dVar = (g0d) O2;
            e70 e70Var4 = new e70((trg) t01Var.w());
            eohVar = (eoh) e1dVar;
            final boolean z112 = z3;
            e70 e70Var22 = new e70((trg) eohVar.getValue());
            b2 = g0dVar.b(e70Var4);
            if (b2 < 0) {
            }
            float f32 = f2;
            if (z2) {
            }
            kohVar2.put(e70Var22, eohVar.getValue());
            tnh tnhVar2 = kohVar2.b;
            g0dVar.f(e70Var22, c3);
            arrayList = asgVar.b;
            O3 = r11.O();
            if (O3 == obj3) {
            }
            snapshotStateList = (SnapshotStateList) O3;
            i3 = r11.i(arrayList);
            O4 = r11.O();
            float f42 = c3;
            int i102 = 24;
            if (!i3) {
            }
            O4 = new qa7(arrayList, snapshotStateList, null, i102);
            r11.n0(O4);
            hz8.o(r11, arrayList, (Function2) O4);
            List S02 = CollectionsKt.S0(tnhVar2);
            snapshotStateList.getClass();
            g = r11.g(g0dVar.toString()) | r11.g(j72.B(snapshotStateList).c) | r11.g(S02);
            O5 = r11.O();
            if (g) {
            }
            ltb ltbVar2 = new ltb();
            ArrayList arrayList72 = new ArrayList();
            arrayList2 = arrayList;
            List H02 = CollectionsKt.H0(tnhVar2, new cp(g0dVar, 24));
            g0dVar2 = g0dVar;
            ArrayList arrayList82 = new ArrayList(k13.r(H02, 10));
            it = H02.iterator();
            while (it.hasNext()) {
            }
            it2 = arrayList82.iterator();
            while (it2.hasNext()) {
            }
            ArrayList w02 = CollectionsKt.w0(arrayList72, snapshotStateList);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            c2 = Intrinsics.c(eohVar.getValue(), CollectionsKt.Y(arrayList72));
            size = w02.size();
            i4 = 0;
            while (i4 < size) {
            }
            snapshotStateList2 = snapshotStateList;
            if (!c2) {
            }
            O5 = ltbVar2.d();
            r11.n0(O5);
            Map map2 = (Map) O5;
            if (f32 < f42) {
            }
            if (z2) {
            }
            boolean h3 = r11.h(z2) | r11.g(trgVar7) | r11.e(i2);
            if (((i8 & 29360128) ^ 12582912) <= 8388608) {
            }
            if ((i8 & 12582912) != 8388608) {
            }
            z5 = true;
            boolean h222 = h3 | z5 | r11.h(z112);
            if (((i8 & 3670016) ^ 1572864) > 1048576) {
            }
            if ((i8 & 1572864) != 1048576) {
            }
            z6 = true;
            boolean z13222 = h222 | z6;
            if (((i8 & 458752) ^ 196608) <= i5) {
            }
            if ((i8 & 196608) != i5) {
            }
            z7 = z13222 | z8;
            O6 = r11.O();
            if (z7) {
            }
            final int i17222 = i2;
            obj2 = obj3;
            final trg trgVar8222 = trgVar7;
            final boolean z14222 = z2;
            r14 = z4;
            i6 = i8;
            g0dVar3 = g0dVar2;
            arrayList3 = arrayList2;
            Function1 function15222 = new Function1() { // from class: y6d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    pp3 pp3Var;
                    pp3 pp3Var2;
                    pp3 pp3Var3;
                    r60 r60Var = (r60) obj4;
                    boolean z15 = z14222;
                    trg trgVar9 = trgVar8222;
                    if (z15) {
                        Object obj5 = trgVar9.x().get(it7.m.toString());
                        if (obj5 == null) {
                            obj5 = null;
                        }
                        Function2 function23 = i5k.f(2, obj5) ? (Function2) obj5 : null;
                        int i18 = i17222;
                        return (function23 == null || (pp3Var3 = (pp3) function23.invoke(r60Var, Integer.valueOf(i18))) == null) ? (pp3) function22.invoke(r60Var, Integer.valueOf(i18)) : pp3Var3;
                    }
                    if (z112) {
                        Object obj6 = trgVar9.x().get(k03.e.toString());
                        if (obj6 == null) {
                            obj6 = null;
                        }
                        Function1 function16222 = i5k.f(1, obj6) ? (Function1) obj6 : null;
                        return (function16222 == null || (pp3Var2 = (pp3) function16222.invoke(r60Var)) == null) ? (pp3) function13.invoke(r60Var) : pp3Var2;
                    }
                    Object obj7 = trgVar9.x().get(mx9.e.toString());
                    Object obj8 = obj7;
                    if (obj7 == null) {
                        obj8 = null;
                    }
                    Function1 function17222 = i5k.f(1, obj8) ? (Function1) obj8 : null;
                    return (function17222 == null || (pp3Var = (pp3) function17222.invoke(r60Var)) == null) ? (pp3) function14.invoke(r60Var) : pp3Var;
                }
            };
            r11.n0(function15222);
            O6 = function15222;
            Function1 function16222 = (Function1) O6;
            fsf fsfVar222 = new fsf();
            g2 = r11.g(function16222) | r11.d(f42) | r11.i(rq3Var);
            O7 = r11.O();
            if (!g2) {
            }
            O7 = new z6d(function16222, f42, r14);
            r11.n0(O7);
            Function1 function17222 = (Function1) O7;
            O8 = r11.O();
            if (O8 == obj2) {
            }
            SnapshotStateList snapshotStateList4222 = snapshotStateList2;
            r10 = r11;
            axj axjVar2222 = axjVar;
            l98.a(axjVar2222, xtcVar, function17222, ioVar, (Function1) O8, yqo.H(-1167420988, r11, new nlj(axjVar, snapshotStateList4222, fsfVar222, map2, 6)), r10, (i6 & 7168) | ((i6 >> 3) & 112) | 221184);
            g3 = r10.g(axjVar2222) | r10.i(g0dVar3);
            O9 = r10.O();
            if (g3) {
            }
            rq3 rq3Var4222 = rq3Var;
            j8c j8cVar222 = new j8c(axjVar2222, kohVar2, g0dVar3, rq3Var4222, 13);
            r7 = rq3Var4222;
            r10.n0(j8cVar222);
            O9 = j8cVar222;
            hz8.o(r10, axjVar2222, (Function2) O9);
            size2 = snapshotStateList4222.size() - 1;
            av8Var = r10;
            if (size2 >= 0) {
            }
        } else {
            av8 av8Var2 = r11;
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc3(asgVar, o8dVar, xtcVar, ioVar, function1, function12, function2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(ArrayList arrayList, xtc xtcVar, io ioVar, List list, List list2, Function1 function1, Function1 function12, Function2 function2, Function0 function0, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        List list3 = list;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1914095277);
        int i5 = (i & 6) == 0 ? (av8Var.i(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= av8Var.g(ioVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= av8Var.i(list3) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= av8Var.i(list2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= av8Var.g(null) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i5 |= av8Var.i(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= av8Var.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= av8Var.i(function12) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= av8Var.i(function2) ? 536870912 : 268435456;
        }
        int i6 = (i2 & 6) == 0 ? i2 | (av8Var.i(function0) ? 4 : 2) : i2;
        if (av8Var.T(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            if (arrayList.isEmpty()) {
                a70.p("NavDisplay entries cannot be empty");
                return;
            }
            int i7 = i5 >> 6;
            int i8 = (i7 & 896) | (i5 & 14) | (i7 & 112) | (i7 & 7168) | ((i6 << 12) & 57344);
            e.g(function0, av8Var);
            av8Var.d0(-984503628);
            av8Var.s(false);
            ff5 ff5Var = zrg.a;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                i3 = i5;
                koh kohVar = new koh();
                i4 = i8;
                O = new yrg(new qfg(kohVar, 5), new tc3(-1714993007, new pte(kohVar, 16), true));
                av8Var.n0(O);
            } else {
                i3 = i5;
                i4 = i8;
            }
            ArrayList N = c5n.N(arrayList, ph0.x(new f7d[]{null, (yrg) O, new f7d(new a7d(1), yqo.H(1077673004, av8Var, new zx0(0, e.g(arrayList, av8Var))))}), av8Var, i4 & 14);
            boolean g = av8Var.g(CollectionsKt.S0(list3)) | av8Var.g(N);
            Object O2 = av8Var.O();
            if (g || O2 == obj) {
                ArrayList l = b.l(o6a.H(N, list3, list2));
                CollectionsKt.h0(l);
                List T = CollectionsKt.T(l);
                ArrayList arrayList2 = new ArrayList(T.size());
                int size = T.size();
                for (int i9 = 0; i9 < size; i9++) {
                    trg trgVar = (trg) T.get(i9);
                    trgVar.getClass();
                    arrayList2.add((jyd) trgVar);
                }
                trg trgVar2 = (trg) CollectionsKt.h0(l);
                ArrayList l2 = b.l(CollectionsKt.Y(l));
                while (true) {
                    trg trgVar3 = (trg) CollectionsKt.firstOrNull(l2);
                    List a2 = trgVar3 != null ? trgVar3.a() : null;
                    if (a2 != null && !a2.isEmpty()) {
                        l2.add(0, o6a.H(a2, list3, list2));
                    }
                    if (a2 == null || a2.isEmpty()) {
                        break;
                    } else {
                        list3 = list;
                    }
                }
                l2.remove(trgVar2);
                O2 = new asg(N, arrayList2, trgVar2, l2);
                av8Var.n0(O2);
            }
            asg asgVar = (asg) O2;
            trg trgVar4 = asgVar.c;
            urg urgVar = new urg(trgVar4);
            ArrayList arrayList3 = asgVar.d;
            ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(new urg((trg) it.next()));
            }
            km5 km5Var = km5.a;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = new o8d(urgVar, arrayList4, km5Var);
                av8Var.n0(O3);
            }
            o8d o8dVar = (o8d) O3;
            boolean i10 = av8Var.i(urgVar) | av8Var.i(arrayList4) | av8Var.i(km5Var);
            Object O4 = av8Var.O();
            if (i10 || O4 == obj) {
                O4 = new m61(o8dVar, urgVar, arrayList4, km5Var, 18);
                av8Var.n0(O4);
            }
            hz8.t((Function0) O4, av8Var);
            boolean z = !trgVar4.a().isEmpty();
            boolean i11 = av8Var.i(arrayList) | av8Var.g(trgVar4) | ((i6 & 14) == 4);
            Object O5 = av8Var.O();
            if (i11 || O5 == obj) {
                O5 = new l97(16, arrayList, trgVar4, function0);
                av8Var.n0(O5);
            }
            v7a.a(o8dVar, z, null, (Function0) O5, av8Var, 0);
            d(asgVar, o8dVar, xtcVar, ioVar, function1, function12, function2, av8Var, ((i3 << 3) & 8064) | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128));
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x6d(arrayList, xtcVar, ioVar, list, list2, function1, function12, function2, function0, i, i2);
        }
    }

    public static final void f(List list, xtc xtcVar, io ioVar, Function0 function0, List list2, List list3, List list4, Function1 function1, Function1 function12, Function2 function2, r82 r82Var, of3 of3Var, int i) {
        av8 av8Var;
        io ioVar2;
        List list5;
        List list6;
        List list7;
        int i2;
        int i3;
        List c2;
        List c3;
        int i4;
        io ioVar3;
        List list8;
        List list9;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1398581072);
        int i5 = 4;
        int i6 = i | (av8Var2.i(list) ? 4 : 2) | (av8Var2.g(xtcVar) ? 32 : 16) | 384 | (av8Var2.i(function0) ? a.o : 1024) | 114892800 | (av8Var2.i(function1) ? 536870912 : 268435456);
        int i7 = (av8Var2.i(function12) ? 4 : 2) | (av8Var2.i(function2) ? 32 : 16) | (av8Var2.i(r82Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            av8Var2.Y();
            int i8 = i & 1;
            a99 a99Var = nf3.a;
            if (i8 == 0 || av8Var2.B()) {
                mv1 mv1Var = uxf.c;
                ppg I = i2a.I(av8Var2);
                boolean g = av8Var2.g(I);
                Object O = av8Var2.O();
                if (g || O == a99Var) {
                    i2 = i6;
                    i3 = i7;
                    O = new qpg(new qfg(I, i5), new tc3(-1320822745, new pte(I, 15), true));
                    av8Var2.n0(O);
                } else {
                    i2 = i6;
                    i3 = i7;
                }
                c2 = kotlin.collections.a.c((qpg) O);
                c3 = kotlin.collections.a.c(new bih());
                i4 = i2 & (-516097);
                ioVar3 = mv1Var;
                list8 = km5.a;
            } else {
                av8Var2.W();
                ioVar3 = ioVar;
                list8 = list4;
                i4 = i6 & (-516097);
                i3 = i7;
                c2 = list2;
                c3 = list3;
            }
            av8Var2.t();
            if (list.isEmpty()) {
                a70.p("NavDisplay backstack cannot be empty");
                return;
            }
            int i9 = i4 >> 9;
            boolean g2 = av8Var2.g(CollectionsKt.S0(list));
            Object O2 = av8Var2.O();
            if (g2 || O2 == a99Var) {
                if (list instanceof RandomAccess) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        arrayList.add((e7d) r82Var.invoke(list.get(i10)));
                        i10++;
                        c3 = c3;
                    }
                    list9 = c3;
                    O2 = arrayList;
                } else {
                    list9 = c3;
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((e7d) r82Var.invoke(it.next()));
                    }
                    O2 = arrayList2;
                }
                av8Var2.n0(O2);
            } else {
                list9 = c3;
            }
            int i11 = (i4 & 1008) | 1794048 | ((i4 >> 6) & 29360128);
            int i12 = i3 << 24;
            List list10 = list9;
            av8Var = av8Var2;
            e(c5n.N((List) O2, c2, av8Var2, 0), xtcVar, ioVar3, list10, list8, function1, function12, function2, function0, av8Var, i11 | (234881024 & i12) | (i12 & 1879048192), i9 & 14);
            list5 = c2;
            ioVar2 = ioVar3;
            list6 = list10;
            list7 = list8;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            ioVar2 = ioVar;
            list5 = list2;
            list6 = list3;
            list7 = list4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w6d(list, xtcVar, ioVar2, function0, list5, list6, list7, function1, function12, function2, r82Var, i);
        }
    }

    public static final void g(w3f w3fVar, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Function1 function1, Function0 function0, Function2 function2, xtc xtcVar, of3 of3Var, int i3) {
        Function1 function12;
        xtc xtcVar2;
        Object t53Var;
        e1d e1dVar;
        e1d e1dVar2;
        String str = w3fVar.k;
        boolean z = w3fVar.j;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-159714516);
        int i4 = i3 | (av8Var.i(w3fVar) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(num) ? a.o : 1024) | (av8Var.g(num2) ? 16384 : 8192) | (av8Var.g(num3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(num4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.i(function1) ? 8388608 : 4194304) | (av8Var.i(function0) ? 67108864 : 33554432) | (av8Var.i(function2) ? 536870912 : 268435456);
        if (av8Var.T(i4 & 1, (i4 & 306783379) != 306783378)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                String str2 = w3fVar.g;
                O = e.f(Boolean.valueOf((str2 == null || str2.length() == 0 || w3fVar.m) && !z && Intrinsics.c(str, StatusKt.STATUS_NOT_STARTED)));
                av8Var.n0(O);
            }
            e1d e1dVar3 = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                int ordinal = w3fVar.b.ordinal();
                Integer num5 = null;
                if (ordinal == 0) {
                    Vote vote = w3fVar.d;
                    if (vote != null) {
                        num5 = Integer.valueOf(VotesResponseKt.getTotalVotes(vote));
                    }
                } else if (ordinal == 1) {
                    WillBothTeamsScoreVote willBothTeamsScoreVote = w3fVar.f;
                    if (willBothTeamsScoreVote != null) {
                        num5 = Integer.valueOf(VotesResponseKt.getTotalVotes(willBothTeamsScoreVote));
                    }
                } else if (ordinal != 2) {
                    zzl.b();
                    return;
                } else {
                    FirstTeamToScoreVote firstTeamToScoreVote = w3fVar.e;
                    if (firstTeamToScoreVote != null) {
                        num5 = Integer.valueOf(VotesResponseKt.getTotalVotes(firstTeamToScoreVote));
                    }
                }
                O2 = e.f(num5);
                av8Var.n0(O2);
            }
            e1d e1dVar4 = (e1d) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = e.f(Boolean.valueOf(!z && Intrinsics.c(str, StatusKt.STATUS_NOT_STARTED)));
                av8Var.n0(O3);
            }
            e1d e1dVar5 = (e1d) O3;
            boolean i5 = av8Var.i(w3fVar);
            Object O4 = av8Var.O();
            if (i5 || O4 == a99Var) {
                e1dVar = e1dVar3;
                t53Var = new t53(w3fVar, e1dVar, e1dVar5, e1dVar4, null, 7);
                e1dVar2 = e1dVar5;
                av8Var.n0(t53Var);
            } else {
                t53Var = O4;
                e1dVar = e1dVar3;
                e1dVar2 = e1dVar5;
            }
            hz8.o(av8Var, w3fVar, (Function2) t53Var);
            String E = uxf.E(((Integer) e1dVar4.getValue()) != null ? r0.intValue() : 0.0d, 58, false);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, 14.0f, 16.0f, 8.0f);
            kv1 kv1Var = uxf.p;
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            e1d e1dVar6 = e1dVar;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d2 = bkh.d(utcVar, 1.0f);
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            goa g = ljg.g(av8Var, C2, f50Var3, 1.0f, true);
            u23 a4 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(w3fVar.a, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            Boolean bool = (Boolean) e1dVar6.getValue();
            bool.getClass();
            wnn.d(bool, null, null, null, yqo.H(616472699, av8Var, new d82(E, 4)), av8Var, 24576, 14);
            av8Var.s(true);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            function12 = function1;
            wnn.d(Boolean.valueOf(!((Boolean) e1dVar6.getValue()).booleanValue() && ((Boolean) e1dVar2.getValue()).booleanValue()), null, null, null, yqo.H(1573315113, av8Var, new yya(13, function12, w3fVar)), av8Var, 24576, 14);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O5;
            Object[] objArr = new Object[0];
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = mce.f;
                av8Var.n0(O6);
            }
            kq9.b(s6a.N(R.drawable.ic_leagues_empty, 6, av8Var), oea.v(R.string.weekly_challenge, av8Var), tol.y(utcVar, true, false, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O6, av8Var, 48), function0, 25), av8Var, 0), lz.D(R.color.primary_default, av8Var), av8Var, 0, 0);
            av8Var.s(true);
            av8Var.s(true);
            int i6 = i4 >> 3;
            int i7 = i4 << 9;
            z5l.a(i, i2, w3fVar, (((Boolean) e1dVar6.getValue()).booleanValue() || ((Boolean) e1dVar2.getValue()).booleanValue()) ? false : true, function2, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), num, num2, num3, num4, av8Var, (i6 & 112) | (i6 & 14) | 196608 | ((i4 << 6) & 896) | ((i4 >> 15) & 57344) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), 0);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            function12 = function1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x6d(w3fVar, i, i2, num, num2, num3, num4, function12, function0, function2, xtcVar2, i3);
        }
    }

    public static final void h(gv9 gv9Var, Function1 function1, gv9 gv9Var2, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        function1.getClass();
        gv9Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-776941882);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = 6;
            ng0 ng0Var = new ng0(4.0f, true, new a70(i3));
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i3));
            xtcVar = utc.a;
            s02.n(l98.b0(bkh.d(gz8.x(xtcVar, null, null, 3), 1.0f), 8.0f), ng0Var, ng0Var2, null, 0, 0, yqo.H(642822273, av8Var, new zya(3, gv9Var2, gv9Var, function1)), av8Var, 1573296, 56);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(gv9Var, function1, gv9Var2, xtcVar2, i, 8);
        }
    }

    public static final void i(xtc xtcVar, long j, Function0 function0, Function0 function02, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-296859259);
        int i2 = i | 6 | (av8Var.f(j) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc u0 = hkg.u0(bkh.d(utcVar, 1.0f), hkg.o0(av8Var), false, 14);
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(u0, D, jf9Var);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc e = bkh.e(bkh.d(utcVar, 1.0f), 182.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            wkn.k(haa.t(2131232886, 0, av8Var), null, bkh.d(utcVar, 1.0f), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            e12.a(0, av8Var, n9e.q(n12.a.a(bkh.m(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 48.0f, 4.0f), uxf.d), lz.D(R.color.on_color_highlight_1, av8Var), o7g.a(20.0f)));
            av8Var.s(true);
            e12.a(0, av8Var, n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 4.0f), lz.D(R.color.primary_default, av8Var), jf9Var));
            xtc b0 = l98.b0(utcVar, 16.0f);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String upperCase = oea.v(R.string.sofascore_analyst_make_every_session_smoother, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            udj.c(bf3.g(4.0f, R.string.sofascore_analyst_same_app_no_ads, av8Var, av8Var, utcVar), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            int i3 = i2 >> 3;
            qha.j(j, null, av8Var, i3 & 14);
            udj.c(bf3.g(16.0f, R.string.sofascore_analyst_same_app_no_ads_body, av8Var, av8Var, utcVar), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            mha.h(bf3.g(32.0f, R.string.button_view_offer, av8Var, av8Var, utcVar), function0, bkh.d(utcVar, 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var, (i3 & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            mha.h(bf3.g(8.0f, R.string.maybe_later, av8Var, av8Var, utcVar), function02, bkh.d(utcVar, 1.0f), gqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i2 >> 6) & 112) | 3456, 0, 2032);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lv3(xtcVar2, j, function0, function02, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final gv9 gv9Var, final oxh oxhVar, final Function1 function1, xtc xtcVar, uxh uxhVar, boolean z, p3e p3eVar, boolean z2, float f, of3 of3Var, final int i, final int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        uxh uxhVar2;
        int i5;
        int i6;
        final boolean z3;
        int i7;
        final boolean z4;
        final p3e p3eVar2;
        final float f2;
        av8 av8Var;
        final xtc xtcVar3;
        final uxh uxhVar3;
        eqf u;
        boolean z5;
        float f3;
        boolean z6;
        xtc xtcVar4;
        uxh uxhVar4;
        int i8;
        boolean z7;
        p3e p3eVar3;
        utc utcVar;
        qug qugVar;
        uxh uxhVar5;
        a99 a99Var;
        av8 av8Var2;
        kx4 kx4Var;
        boolean z8;
        int i9;
        float f4;
        uxh uxhVar6;
        av8 av8Var3;
        boolean z9;
        a99 a99Var2;
        Boolean bool;
        uxh uxhVar7;
        a99 a99Var3;
        qug qugVar2;
        e1d e1dVar;
        Object O;
        boolean z10;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(1568009478);
        if ((i & 6) == 0) {
            i3 = (av8Var4.g(gv9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var4.g(oxhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var4.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var4.g(xtcVar2) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                uxhVar2 = uxhVar;
                i3 |= av8Var4.g(uxhVar2) ? 16384 : 8192;
                if ((i & 196608) == 0) {
                    i3 |= ((i2 & 32) == 0 && av8Var4.h(z)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
                int i11 = i3 | 1572864;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i11 = i3 | 14155776;
                } else if ((12582912 & i) == 0) {
                    i11 |= av8Var4.g(p3eVar) ? 8388608 : 4194304;
                    i6 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i6 == 0) {
                        i11 |= 100663296;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 100663296) == 0) {
                            i11 |= av8Var4.h(z3) ? 67108864 : 33554432;
                        }
                    }
                    i7 = i11 | 805306368;
                    if (av8Var4.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                        av8Var4.W();
                        z4 = z;
                        p3eVar2 = p3eVar;
                        f2 = f;
                        av8Var = av8Var4;
                        xtcVar3 = xtcVar2;
                        uxhVar3 = uxhVar2;
                    } else {
                        av8Var4.Y();
                        int i12 = i & 1;
                        utc utcVar2 = utc.a;
                        if (i12 == 0 || av8Var4.B()) {
                            if (i10 != 0) {
                                xtcVar2 = utcVar2;
                            }
                            if (i4 != 0) {
                                uxhVar2 = sxh.i;
                            }
                            if ((i2 & 32) != 0) {
                                z5 = gv9Var.size() > 1;
                                i7 &= -458753;
                            } else {
                                z5 = z;
                            }
                            p3e t3eVar = i5 != 0 ? new t3e(4.0f, 8.0f, 4.0f, 8.0f) : p3eVar;
                            if (i6 != 0) {
                                z3 = false;
                            }
                            f3 = 4.0f;
                            z6 = z3;
                            xtcVar4 = xtcVar2;
                            uxhVar4 = uxhVar2;
                            i8 = i7;
                            z7 = z5;
                            p3eVar3 = t3eVar;
                        } else {
                            av8Var4.W();
                            if ((i2 & 32) != 0) {
                                i7 &= -458753;
                            }
                            p3eVar3 = p3eVar;
                            f3 = f;
                            z6 = z3;
                            xtcVar4 = xtcVar2;
                            uxhVar4 = uxhVar2;
                            i8 = i7;
                            z7 = z;
                        }
                        av8Var4.t();
                        kx4 kx4Var2 = (kx4) av8Var4.k(dh3.h);
                        qug o0 = hkg.o0(av8Var4);
                        Object O2 = av8Var4.O();
                        a99 a99Var4 = nf3.a;
                        if (O2 == a99Var4) {
                            O2 = e.f(Boolean.valueOf(z6));
                            av8Var4.n0(O2);
                        }
                        e1d e1dVar2 = (e1d) O2;
                        cdi b2 = a60.b(((Boolean) e1dVar2.getValue()).booleanValue() ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(400, 0, jg5.a, 2), "dropdown_arrow_rotation_animation", av8Var4, 3072, 20);
                        xtc g = bkh.g(l98.a0(xtcVar4, p3eVar3), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        if (z7) {
                            uxhVar4.getClass();
                            utcVar = utcVar2;
                            g = g.z(d2a.E(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o7g.a(8.0f), false, 0L, 28));
                        } else {
                            utcVar = utcVar2;
                        }
                        int i13 = (i8 >> 9) & 112;
                        p3e p3eVar4 = p3eVar3;
                        xtc o = yso.o(n9e.q(wnn.A(g, o7g.a(8.0f)), uxhVar4.b(z7, av8Var4), oyn.e), 1.0f, uxhVar4.a(z7, av8Var4), o7g.a(8.0f));
                        Object O3 = av8Var4.O();
                        if (O3 == a99Var4) {
                            O3 = new tra(21, e1dVar2);
                            av8Var4.n0(O3);
                        }
                        xtc y = tol.y(o, z7, false, false, 0L, null, (Function0) O3, av8Var4, 30);
                        boolean z11 = z7;
                        k1c c2 = e12.c(uxf.c, true);
                        int hashCode = Long.hashCode(av8Var4.T);
                        aee m = av8Var4.m();
                        xtc C = fqj.C(av8Var4, y);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var4.h0();
                        if (av8Var4.S) {
                            av8Var4.l(zg3Var);
                        } else {
                            av8Var4.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var4, c2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var4, m, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var4, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var4, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var4, C, f50Var3);
                        if (oxhVar != null) {
                            av8Var4.d0(296729150);
                            xtc C2 = u6h.C(utcVar, z11 ? 1.0f : 0.5f);
                            uxh uxhVar8 = uxhVar4;
                            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var4, 54);
                            int hashCode2 = Long.hashCode(av8Var4.T);
                            aee m2 = av8Var4.m();
                            xtc C3 = fqj.C(av8Var4, C2);
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var);
                            } else {
                                av8Var4.q0();
                            }
                            waa.K(av8Var4, a2, f50Var);
                            waa.K(av8Var4, m2, ff3Var);
                            bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
                            qugVar = o0;
                            a99Var = a99Var4;
                            kx4Var = kx4Var2;
                            z8 = true;
                            i9 = 4;
                            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            b(oxhVar, uxhVar8, false, ljg.g(av8Var4, C3, f50Var3, 1.0f, false), false, av8Var4, ((i8 >> 3) & 14) | 384 | i13, 16);
                            uxhVar5 = uxhVar8;
                            if (z11) {
                                av8Var4.d0(-1105713520);
                                a(((Number) b2.getValue()).floatValue(), 0, ((r13) uxhVar5.g.invoke(av8Var4, 0)).a, ((r13) uxhVar5.h.invoke(av8Var4, 0)).a, av8Var4);
                                av8Var2 = av8Var4;
                                z10 = false;
                                av8Var2.s(false);
                            } else {
                                av8Var2 = av8Var4;
                                z10 = false;
                                av8Var2.d0(-1105460777);
                                av8Var2.s(false);
                            }
                            av8Var2.s(true);
                            av8Var2.s(z10);
                        } else {
                            qugVar = o0;
                            uxhVar5 = uxhVar4;
                            a99Var = a99Var4;
                            av8Var2 = av8Var4;
                            kx4Var = kx4Var2;
                            z8 = true;
                            i9 = 4;
                            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            av8Var2.d0(297469430);
                            av8Var2.s(false);
                        }
                        if (gv9Var.isEmpty()) {
                            uxhVar6 = uxhVar5;
                            av8Var3 = av8Var2;
                            z9 = z8;
                            av8Var3.d0(299716310);
                            av8Var3.s(false);
                        } else {
                            av8Var2.d0(297597305);
                            Boolean bool2 = (Boolean) e1dVar2.getValue();
                            bool2.getClass();
                            boolean g2 = ((i8 & 14) == i9 ? z8 : false) | ((i8 & 112) == 32 ? z8 : false) | av8Var2.g(kx4Var) | av8Var2.g(qugVar);
                            Object O4 = av8Var2.O();
                            if (g2) {
                                a99Var2 = a99Var;
                            } else {
                                a99Var2 = a99Var;
                                if (O4 != a99Var2) {
                                    uxhVar7 = uxhVar5;
                                    a99Var3 = a99Var2;
                                    qugVar2 = qugVar;
                                    e1dVar = e1dVar2;
                                    bool = bool2;
                                    hz8.o(av8Var2, bool, (Function2) O4);
                                    boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                                    n7g a3 = o7g.a(8.0f);
                                    long D = lz.D(R.color.surface_P, av8Var2);
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                    O = av8Var2.O();
                                    if (O == a99Var3) {
                                        O = new tra(22, e1dVar);
                                        av8Var2.n0(O);
                                    }
                                    uxh uxhVar9 = uxhVar7;
                                    uxhVar6 = uxhVar9;
                                    z9 = true;
                                    av8 av8Var5 = av8Var2;
                                    u10.a(booleanValue, (Function0) O, null, floatToRawIntBits, qugVar2, null, a3, D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(972908739, av8Var2, new ff7((Object) gv9Var, (Object) oxhVar, function1, (Object) uxhVar9, (Object) e1dVar, 13)), av8Var5, 48, 1828);
                                    av8Var3 = av8Var5;
                                    av8Var3.s(false);
                                }
                            }
                            a99Var3 = a99Var2;
                            kx4 kx4Var3 = kx4Var;
                            qugVar2 = qugVar;
                            e1dVar = e1dVar2;
                            bool = bool2;
                            uxhVar7 = uxhVar5;
                            h10 h10Var = new h10(gv9Var, e1dVar, oxhVar, kx4Var3, qugVar2, null, 27);
                            av8Var2.n0(h10Var);
                            O4 = h10Var;
                            hz8.o(av8Var2, bool, (Function2) O4);
                            boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
                            n7g a32 = o7g.a(8.0f);
                            long D2 = lz.D(R.color.surface_P, av8Var2);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                            O = av8Var2.O();
                            if (O == a99Var3) {
                            }
                            uxh uxhVar92 = uxhVar7;
                            uxhVar6 = uxhVar92;
                            z9 = true;
                            av8 av8Var52 = av8Var2;
                            u10.a(booleanValue2, (Function0) O, null, floatToRawIntBits2, qugVar2, null, a32, D2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(972908739, av8Var2, new ff7((Object) gv9Var, (Object) oxhVar, function1, (Object) uxhVar92, (Object) e1dVar, 13)), av8Var52, 48, 1828);
                            av8Var3 = av8Var52;
                            av8Var3.s(false);
                        }
                        av8Var3.s(z9);
                        av8Var = av8Var3;
                        xtcVar3 = xtcVar4;
                        p3eVar2 = p3eVar4;
                        z4 = z11;
                        z3 = z6;
                        f2 = f3;
                        uxhVar3 = uxhVar6;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: oth
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                r4a.j(gv9.this, oxhVar, function1, xtcVar3, uxhVar3, z4, p3eVar2, z3, f2, (of3) obj, aba.K(i | 1), i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i6 == 0) {
                }
                i7 = i11 | 805306368;
                if (av8Var4.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            uxhVar2 = uxhVar;
            if ((i & 196608) == 0) {
            }
            int i112 = i3 | 1572864;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i6 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i6 == 0) {
            }
            i7 = i112 | 805306368;
            if (av8Var4.T(i7 & 1, (i7 & 306783379) == 306783378)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        uxhVar2 = uxhVar;
        if ((i & 196608) == 0) {
        }
        int i1122 = i3 | 1572864;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i6 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i6 == 0) {
        }
        i7 = i1122 | 805306368;
        if (av8Var4.T(i7 & 1, (i7 & 306783379) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(oxh oxhVar, Function0 function0, xtc xtcVar, uxh uxhVar, boolean z, p3e p3eVar, of3 of3Var, int i, int i2) {
        oxh oxhVar2;
        int i3;
        uxh uxhVar2;
        int i4;
        boolean z2;
        int i5;
        p3e p3eVar2;
        xtc xtcVar2;
        boolean z3;
        p3e p3eVar3;
        av8 av8Var;
        uxh uxhVar3;
        eqf u;
        utc utcVar;
        boolean z4;
        av8 av8Var2;
        function0.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-111965553);
        if ((i & 6) == 0) {
            oxhVar2 = oxhVar;
            i3 = (av8Var3.g(oxhVar2) ? 4 : 2) | i;
        } else {
            oxhVar2 = oxhVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var3.i(function0) ? 32 : 16;
        }
        int i6 = i3 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            uxh uxhVar4 = uxhVar;
            i6 |= av8Var3.g(uxhVar4) ? a.o : 1024;
            uxhVar2 = uxhVar4;
            i4 = i2 & 16;
            if (i4 == 0) {
                i6 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i6 |= av8Var3.h(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i6 |= 196608;
                } else if ((196608 & i) == 0) {
                    p3eVar2 = p3eVar;
                    i6 |= av8Var3.g(p3eVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    uxh uxhVar5 = uxhVar2;
                    if (av8Var3.T(i6 & 1, (74899 & i6) == 74898)) {
                        av8Var3.W();
                        xtcVar2 = xtcVar;
                        z3 = z2;
                        p3eVar3 = p3eVar2;
                        uxhVar3 = uxhVar2;
                        av8Var = av8Var3;
                    } else {
                        if (i7 != 0) {
                            uxhVar5 = sxh.i;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        p3e t3eVar = i5 != 0 ? new t3e(4.0f, 8.0f, 4.0f, 8.0f) : p3eVar2;
                        av8Var3.d0(1624164875);
                        utc utcVar2 = utc.a;
                        xtc g = bkh.g(l98.a0(utcVar2, t3eVar), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        if (z2) {
                            uxhVar5.getClass();
                            utcVar = utcVar2;
                            g = g.z(d2a.E(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o7g.a(8.0f), false, 0L, 28));
                        } else {
                            utcVar = utcVar2;
                        }
                        int i8 = (i6 >> 6) & 112;
                        p3e p3eVar4 = t3eVar;
                        xtc y = tol.y(u6h.C(yso.o(n9e.q(wnn.A(g, o7g.a(8.0f)), uxhVar5.b(z2, av8Var3), oyn.e), 1.0f, uxhVar5.a(z2, av8Var3), o7g.a(8.0f)), z2 ? 1.0f : 0.5f), z2, false, false, 0L, null, function0, av8Var3, 30);
                        av8 av8Var4 = av8Var3;
                        boolean z5 = z2;
                        l8g a2 = k8g.a(ww9.h, uxf.m, av8Var4, 54);
                        int hashCode = Long.hashCode(av8Var4.T);
                        aee m = av8Var4.m();
                        xtc C = fqj.C(av8Var4, y);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var4.h0();
                        if (av8Var4.S) {
                            av8Var4.l(zg3Var);
                        } else {
                            av8Var4.q0();
                        }
                        waa.K(av8Var4, a2, hf3.g);
                        waa.K(av8Var4, m, hf3.f);
                        waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var4, hf3.k);
                        b(oxhVar2, uxhVar5, false, ljg.g(av8Var4, C, hf3.d, 1.0f, false), false, av8Var4, (i6 & 14) | 384 | i8, 16);
                        if (z5) {
                            av8Var4.d0(1149055952);
                            a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 384, ((r13) uxhVar5.g.invoke(av8Var4, 0)).a, ((r13) uxhVar5.h.invoke(av8Var4, 0)).a, av8Var4);
                            av8 av8Var5 = av8Var4;
                            z4 = false;
                            av8Var5.s(false);
                            av8Var2 = av8Var5;
                        } else {
                            z4 = false;
                            av8Var4.d0(1149273138);
                            av8Var4.s(false);
                            av8Var2 = av8Var4;
                        }
                        av8Var2.s(true);
                        av8Var2.s(z4);
                        p3eVar3 = p3eVar4;
                        z3 = z5;
                        xtcVar2 = utcVar;
                        uxhVar3 = uxhVar5;
                        av8Var = av8Var2;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new vr5(oxhVar, function0, xtcVar2, uxhVar3, z3, p3eVar3, i, i2);
                        return;
                    }
                    return;
                }
                p3eVar2 = p3eVar;
                uxh uxhVar52 = uxhVar2;
                if (av8Var3.T(i6 & 1, (74899 & i6) == 74898)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            p3eVar2 = p3eVar;
            uxh uxhVar522 = uxhVar2;
            if (av8Var3.T(i6 & 1, (74899 & i6) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        uxhVar2 = uxhVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        p3eVar2 = p3eVar;
        uxh uxhVar5222 = uxhVar2;
        if (av8Var3.T(i6 & 1, (74899 & i6) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void l(int i, long j, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1802629875);
        int i2 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.f(j) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, xtcVar, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 24960, 110584);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l67(str, j, xtcVar, i, 4);
        }
    }

    public static final void m(zil zilVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1158935946);
        int i2 = (av8Var.g(zilVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(bkh.l(utcVar, 142.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new fej(29, function1, zilVar);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int i3 = zilVar.a;
            Integer num = zilVar.d;
            td4.I(i3, 48, av8Var, rd0.N(bkh.l(utcVar, 142.0f), 44.0f, 44.0f), false);
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str = zilVar.b;
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            if (num != null) {
                av8Var.d0(1879947028);
                udj.c(oea.w(R.string.fifa_rankings_position, new Object[]{num}, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1880245372);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(zilVar, function1, i, 16);
        }
    }

    public static final void n(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function0 function0, Function1 function1) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-676647612);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new ila(9);
                av8Var2.n0(O);
            }
            znh znhVar = (znh) o3a.N(objArr, (Function0) O, av8Var2, 48);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            l39 l39Var = new l39();
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            int i3 = 6;
            ng0 ng0Var = new ng0(8.0f, true, new a70(i3));
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i3));
            goa goaVar = new goa(1.0f, false);
            boolean g = ((i2 & 14) == 4) | av8Var2.g(znhVar);
            Object O2 = av8Var2.O();
            if (g || O2 == obj) {
                O2 = new uf8(23, gv9Var, znhVar);
                av8Var2.n0(O2);
            }
            haa.d(l39Var, goaVar, null, C2, ng0Var2, ng0Var, null, false, null, (Function1) O2, av8Var2, 1772544, 916);
            String v = oea.v(R.string.vote, av8Var2);
            boolean z = znhVar.h() != -1;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean g2 = av8Var2.g(znhVar) | ((i2 & 112) == 32);
            Object O3 = av8Var2.O();
            if (g2 || O3 == obj) {
                O3 = new ixa(0, function1, znhVar);
                av8Var2.n0(O3);
            }
            mha.h(v, (Function0) O3, d2, kqh.a, null, z, false, false, 0L, 0, 0, av8Var2, 3456, 0, 2000);
            mha.h(bf3.g(8.0f, R.string.close, av8Var2, av8Var2, utcVar), function0, bkh.d(utcVar, 1.0f), gqh.a, null, false, false, false, 0L, 0, 0, av8Var2, ((i2 >> 3) & 112) | 3456, 0, 2032);
            av8Var = av8Var2;
            w1l.s(utcVar, 16.0f, av8Var, true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xm1(gv9Var, function1, function0, xtcVar2, i);
        }
    }

    public static final void o(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        xtc xtcVar2;
        boolean z;
        Function0 function02 = function0;
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1909404867);
        int i2 = i | (av8Var.i(function02) ? 4 : 2) | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            String v = oea.v(R.string.mute_weekly_challenge_text, av8Var);
            yf8 yf8Var = xth.a;
            int i3 = 4;
            udj.c(v, d0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            String v2 = oea.v(R.string.also_mute_popups, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new nxk(i3);
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) n9e.x(context, (Function1) O)).booleanValue();
            boolean i4 = av8Var.i(context);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new vt(context, 20);
                av8Var.n0(O2);
            }
            o3a.g(v2, booleanValue, (Function1) O2, l98.c0(n9e.q(l98.e0(utcVar, 8.0f, 16.0f, 8.0f, 8.0f), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 16.0f, 12.0f), oea.v(R.string.undo_action_later, av8Var), av8Var, 0, 0);
            String v3 = oea.v(R.string.action_settings, av8Var);
            xtc d2 = bkh.d(l98.f0(utcVar, 16.0f, 48.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f);
            boolean i5 = av8Var.i(context) | ((i2 & 14) == 4);
            Object O3 = av8Var.O();
            if (i5 || O3 == a99Var) {
                function02 = function0;
                z = true;
                O3 = new rea(context, function02, 1 == true ? 1 : 0);
                av8Var.n0(O3);
            } else {
                function02 = function0;
                z = true;
            }
            ww9.q(d2, v3, false, false, (Function0) O3, av8Var, 0, 12);
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function02, xtcVar2, i, 12);
        }
    }

    public static final void p(ofl oflVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        Function1 function12 = function1;
        oflVar.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-124194069);
        int i2 = i | (av8Var.g(oflVar) ? 4 : 2) | (av8Var.i(function12) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object O = av8Var.O();
            int i4 = 12;
            Object obj = nf3.a;
            if (z || O == obj) {
                O = new ndk(oflVar, i4);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 0);
            String str = (String) e1dVar.getValue();
            boolean g = av8Var.g(a2);
            Object O2 = av8Var.O();
            if (g || O2 == obj) {
                O2 = new ck1(17, null, a2);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, str, (Function2) O2);
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a3 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a4 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.fifa_wc_2026_meet_the_teams, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            String v2 = oea.v(R.string.football_view_standings, av8Var);
            int i5 = i2 & 112;
            boolean g2 = av8Var.g(e1dVar) | (i5 == 32);
            Object O3 = av8Var.O();
            if (g2 || O3 == obj) {
                O3 = new s91(function12, e1dVar, 12);
                av8Var.n0(O3);
            }
            tz9.s(0, 4, av8Var, null, v2, (Function0) O3);
            av8Var.s(true);
            xtc O4 = kda.O(bkh.d(utcVar, 1.0f), "wc26_group_chip", av8Var);
            gv9 gv9Var = oflVar.a;
            String str2 = (String) e1dVar.getValue();
            jrh jrhVar = jrh.m;
            boolean g3 = av8Var.g(e1dVar);
            Object O5 = av8Var.O();
            int i6 = 13;
            if (g3 || O5 == obj) {
                O5 = new eqh(i6, e1dVar);
                av8Var.n0(O5);
            }
            trh.a(gv9Var, str2, (Function1) O5, O4, null, null, jrhVar, false, false, false, null, null, av8Var, 1572864, 4016);
            av8Var = av8Var;
            xtc d2 = bkh.d(utcVar, 1.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            t3e B = l98.B(8.0f, 2);
            boolean g4 = av8Var.g(e1dVar) | (i3 == 4) | (i5 == 32);
            Object O6 = av8Var.O();
            if (g4 || O6 == obj) {
                function12 = function1;
                O6 = new ncj(13, oflVar, e1dVar, function12);
                av8Var.n0(O6);
            } else {
                function12 = function1;
            }
            v8a.c(d2, a2, B, ng0Var, null, null, false, null, (Function1) O6, av8Var, 24966, 488);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(oflVar, function12, xtcVar, i, 26);
        }
    }

    public static final ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((BlazeFirstTimeSlideInstructionStyle) next).isVisible()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle = (BlazeFirstTimeSlideInstructionStyle) it2.next();
            arrayList3.add(new fwl(blazeFirstTimeSlideInstructionStyle.getHeaderText(), blazeFirstTimeSlideInstructionStyle.getDescriptionText(), blazeFirstTimeSlideInstructionStyle.getIconDrawableResId()));
        }
        return arrayList3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011e, code lost:
    
        if (r8 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        if (r8.equals("Clay") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
    
        r8 = java.lang.Integer.valueOf(com.sofascore.results.R.drawable.tennis_terrain_clay_icon);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        if (r8.equals("Red clay") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(zl zlVar, lrj lrjVar) {
        Integer num;
        Drawable drawable;
        lrjVar.getClass();
        View view = (View) zlVar.l;
        View view2 = (View) zlVar.i;
        LinearLayout linearLayout = (LinearLayout) zlVar.f;
        TextView textView = (TextView) zlVar.j;
        TextView textView2 = (TextView) zlVar.b;
        TextView textView3 = (TextView) zlVar.k;
        ImageView imageView = (ImageView) zlVar.h;
        TextView textView4 = zlVar.g;
        ImageView imageView2 = (ImageView) zlVar.e;
        boolean z = lrjVar.b;
        Tournament tournament = lrjVar.a;
        view.setVisibility(z ? 0 : 8);
        f6a.g(textView3, lrjVar.c);
        ((ImageView) zlVar.c).setVisibility(textView3.getVisibility());
        f6a.g(textView2, lrjVar.d);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        f6a.g(textView4, lrjVar.e);
        f6a.g(textView, lrjVar.f);
        ((ImageView) zlVar.m).setVisibility(lrjVar.m ? 0 : 8);
        aik.Q(imageView2).a();
        imageView2.setImageDrawable(null);
        imageView2.setVisibility(8);
        aik.Q(imageView).a();
        imageView.setImageDrawable(null);
        imageView.setVisibility(8);
        view2.setVisibility(8);
        if (lrjVar.f == null || lrjVar.j == null) {
            imageView2.setVisibility(textView4.getVisibility() == 0 ? 0 : 8);
            if (textView4.getVisibility() == 0) {
                as9.b(imageView2, Integer.valueOf(tournament.getCategory().getId()), null);
            }
        } else {
            imageView2.setVisibility(textView4.getVisibility() == 0 ? 0 : 8);
            if (textView4.getVisibility() == 0) {
                as9.b(imageView2, Integer.valueOf(tournament.getCategory().getId()), null);
            }
            String str = lrjVar.j;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1216068804:
                        if (str.equals("Hardcourt outdoor")) {
                            num = Integer.valueOf(R.drawable.tennis_terrain_outdoor_hard_icon);
                            break;
                        }
                        break;
                    case -779358032:
                        break;
                    case -633575661:
                        if (str.equals("Hardcourt indoor")) {
                            num = Integer.valueOf(R.drawable.tennis_terrain_indoor_hard_icon);
                            break;
                        }
                        break;
                    case 2102913:
                        break;
                    case 69063062:
                        if (str.equals("Grass")) {
                            num = Integer.valueOf(R.drawable.tennis_terrain_grass_icon);
                            break;
                        }
                        break;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    Context context = linearLayout.getContext();
                    context.getClass();
                    Drawable drawable2 = context.getDrawable(intValue);
                    if (drawable2 != null) {
                        drawable = drawable2.mutate();
                    }
                }
                drawable = null;
                imageView.setVisibility((textView.getVisibility() == 0 || drawable == null) ? 8 : 0);
                imageView.setImageDrawable(drawable);
                if (textView4.getVisibility() == 0 && textView.getVisibility() == 0) {
                    r11 = 0;
                }
                view2.setVisibility(r11);
            }
            num = null;
            if (num != null) {
            }
            drawable = null;
            imageView.setVisibility((textView.getVisibility() == 0 || drawable == null) ? 8 : 0);
            imageView.setImageDrawable(drawable);
            if (textView4.getVisibility() == 0) {
                r11 = 0;
            }
            view2.setVisibility(r11);
        }
        ImageView imageView3 = (ImageView) zlVar.d;
        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
        as9.q(imageView3, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, tournament.getId(), Integer.valueOf(tournament.getCategory().getId()));
        int color = linearLayout.getContext().getColor(R.color.n_lv_1);
        int color2 = linearLayout.getContext().getColor(R.color.n_lv_3);
        textView3.setTextColor(lrjVar.c != null ? color : color2);
        if (lrjVar.c != null) {
            color = color2;
        }
        textView2.setTextColor(color);
    }

    public static final float s(long j, float f, long j2, long j3) {
        long B = hkg.B(r13.c(j, f), j3);
        float e0 = hkg.e0(hkg.B(j2, B)) + 0.05f;
        float e02 = hkg.e0(B) + 0.05f;
        return Math.max(e0, e02) / Math.min(e0, e02);
    }

    public static final long t(long j, oqf oqfVar) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = oqfVar.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = oqfVar.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = oqfVar.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = oqfVar.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static final long v(cej cejVar, long j) {
        dnd dndVar;
        dma e = cejVar.e();
        if (e != null) {
            dma b2 = cejVar.b();
            if (b2 != null) {
                dndVar = new dnd((e.f() && b2.f()) ? e.l(b2, j) : j);
            } else {
                dndVar = null;
            }
            if (dndVar != null) {
                return dndVar.a;
            }
        }
        return j;
    }

    public static int w(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static ColorStateList x(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (z(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i == 2) {
                ogj.i(typedValue, "Failed to resolve attribute at index 1: ");
            } else {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = m23.a;
                try {
                    return m23.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static b10 y(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        b10 b10Var;
        boolean z = z(xmlPullParser, str);
        int i2 = 3;
        Object obj = null;
        int i3 = 0;
        if (z) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new b10(obj, obj, typedValue.data, i2);
            }
            try {
                b10Var = b10.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                b10Var = null;
            }
            if (b10Var != null) {
                return b10Var;
            }
        }
        return new b10(obj, obj, i3, i2);
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
