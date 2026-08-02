package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.view.header.FollowersTextView;
import com.unity3d.services.UnityAdsConstants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class iz8 {
    public static final float[] a = new float[91];
    public static final tc3 b = new tc3(1434026124, new ed3(9), false);
    public static final tc3 c = new tc3(-366234026, new qd3(28), false);
    public static final tc3 d = new tc3(1596279775, new qd3(29), false);
    public static final tc3 e = new tc3(-793844633, new ud3(0), false);
    public static final tc3 f = new tc3(1460447558, new ud3(1), false);
    public static final tc3 g = new tc3(-580227547, new ud3(2), false);
    public static final su9 h = new su9(false);
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final t75 j = new t75();
    public static final String[] k = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] l = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] m = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xvc A(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!ufa.A(newPullParser, "x:xmpmeta")) {
            throw s9e.a(null, "Couldn't find xmp metadata");
        }
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        long j2 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (ufa.A(newPullParser, "rdf:Description")) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break loop0;
                    }
                    String q2 = ufa.q(newPullParser, k[i3]);
                    if (q2 == null) {
                        i3++;
                    } else {
                        if (Integer.parseInt(q2) != 1) {
                            break;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String q3 = ufa.q(newPullParser, l[i4]);
                            if (q3 != null) {
                                j2 = Long.parseLong(q3);
                            } else {
                                i4++;
                            }
                        }
                        j2 = -9223372036854775807L;
                        while (true) {
                            if (i2 >= 2) {
                                av9 av9Var2 = hv9.b;
                                vvfVar = vvf.e;
                                break;
                            }
                            String q4 = ufa.q(newPullParser, m[i2]);
                            if (q4 != null) {
                                vvfVar = hv9.A(new wvc("image/jpeg", 0L, 0L), new wvc(MimeTypes.VIDEO_MP4, Long.parseLong(q4), 0L));
                                break;
                            }
                            i2++;
                        }
                    }
                }
            } else if (ufa.A(newPullParser, "Container:Directory")) {
                vvfVar = B(newPullParser, "Container", "Item");
            } else if (ufa.A(newPullParser, "GContainer:Directory")) {
                vvfVar = B(newPullParser, "GContainer", "GContainerItem");
            }
            if (ufa.x(newPullParser, "x:xmpmeta")) {
                if (!vvfVar.isEmpty()) {
                    return new xvc(j2, vvfVar);
                }
            }
        }
        return null;
    }

    public static vvf B(XmlPullParser xmlPullParser, String str, String str2) {
        zu9 s = hv9.s();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String q2 = ufa.q(xmlPullParser, concat3);
                String q3 = ufa.q(xmlPullParser, concat4);
                String q4 = ufa.q(xmlPullParser, concat5);
                String q5 = ufa.q(xmlPullParser, concat6);
                if (q2 == null || q3 == null) {
                    return vvf.e;
                }
                s.c(new wvc(q2, q4 != null ? Long.parseLong(q4) : 0L, q5 != null ? Long.parseLong(q5) : 0L));
            }
        } while (!ufa.x(xmlPullParser, concat2));
        return s.g();
    }

    public static final int C(DisplayMetrics displayMetrics, int i2) {
        displayMetrics.getClass();
        return wzb.b(i2 / displayMetrics.density);
    }

    public static final void D(bu1 bu1Var, IRecent iRecent, boolean z) {
        boolean z2;
        long userCount;
        ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
        iRecent.getClass();
        if (iRecent instanceof UniqueTournament) {
            userCount = ((UniqueTournament) iRecent).getUserCount();
            z2 = true;
        } else if (iRecent instanceof Team) {
            Team team = (Team) iRecent;
            PlayerTeamInfo playerTeamInfo = team.getPlayerTeamInfo();
            if (!(playerTeamInfo != null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false)) {
                PlayerTeamInfo playerTeamInfo2 = team.getPlayerTeamInfo();
                if (!(playerTeamInfo2 != null ? Intrinsics.c(playerTeamInfo2.getRetired(), Boolean.TRUE) : false)) {
                    z2 = true;
                    userCount = team.getUserCount();
                }
            }
            z2 = false;
            userCount = team.getUserCount();
        } else {
            if (!(iRecent instanceof Player)) {
                return;
            }
            Player player = (Player) iRecent;
            z2 = (player.getRetired() || player.getDeceased()) ? false : true;
            userCount = player.getUserCount();
        }
        constraintLayout.setVisibility(z2 ? 0 : 8);
        if (z2) {
            ((FollowersTextView) bu1Var.h).setCount(userCount);
            if (z) {
                LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                TextView textView = (TextView) bu1Var.e;
                FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                Object tag = constraintLayout.getTag();
                AnimatorSet animatorSet = tag instanceof AnimatorSet ? (AnimatorSet) tag : null;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                frameLayout.setAlpha(1.0f);
                frameLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Context context = linearLayout.getContext();
                context.getClass();
                int i2 = 2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationY", ao2.u(14, context), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat2.setDuration(800L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                Property property = View.TRANSLATION_Y;
                Context context2 = linearLayout.getContext();
                context2.getClass();
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, PropertyValuesHolder.ofFloat((Property<?, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -ao2.u(16, context2)), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                ofPropertyValuesHolder.setDuration(200L);
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(ofFloat, ofFloat2, ofPropertyValuesHolder);
                animatorSet2.start();
                if (constraintLayout.isAttachedToWindow()) {
                    constraintLayout.addOnAttachStateChangeListener(new jf(constraintLayout, animatorSet2, bu1Var, i2));
                } else {
                    animatorSet2.cancel();
                    constraintLayout.setTag(null);
                }
                constraintLayout.setTag(animatorSet2);
            }
        }
    }

    public static final void E(v82 v82Var, Drawable drawable) {
        v82Var.getClass();
        ImageView imageView = (ImageView) v82Var.d;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public static final void F(v82 v82Var, String str) {
        v82Var.getClass();
        str.getClass();
        TextView textView = (TextView) v82Var.e;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public static final void G(v82 v82Var, String str) {
        v82Var.getClass();
        str.getClass();
        TextView textView = (TextView) v82Var.c;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public static final xtc H(xtc xtcVar, boolean z, boolean z2, Function0 function0) {
        if (!z || !oji.a) {
            return xtcVar;
        }
        if (z2) {
            xtcVar = xtcVar.z(new pji(j));
        }
        return xtcVar.z(new mji(function0));
    }

    public static final xtc I(xtc xtcVar, q80 q80Var, dfj dfjVar, Function1 function1, int i2, boolean z, int i3, int i4, sf8 sf8Var, List list, Function1 function12, c23 c23Var, Function1 function13, es0 es0Var) {
        return xtcVar.z(utc.a).z(new s7j(q80Var, dfjVar, sf8Var, function1, i2, z, i3, i4, list, function12, c23Var, es0Var, function13));
    }

    public static final void a(old oldVar, of3 of3Var, int i2) {
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1608451284);
        int i3 = (av8Var.g(oldVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            goa g2 = ljg.g(av8Var, C, hf3.d, 1.0f, true);
            String v = oea.v(R.string.additional_odds, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, g2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131064);
            if (oldVar.c) {
                av8Var.d0(-1510953325);
                z = true;
                nld.f(oldVar, vmd.ADDITIONAL_ODDS, null, null, null, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), false, av8Var, (i3 & 14) | 14380464, 0);
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(-1510536902);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(oldVar, i2, 7);
        }
    }

    public static final void b(vnb vnbVar, ksa ksaVar, of3 of3Var, int i2) {
        vnb vnbVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-737297818);
        int i3 = 2;
        int i4 = (av8Var.g(vnbVar) ? 4 : 2) | i2 | (av8Var.g(ksaVar) ? 32 : 16);
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            vnbVar2 = vnbVar;
            ktm.t(vnbVar2, null, false, null, null, yqo.H(1901095173, av8Var, new sj(ksaVar, ke0.c, i5)), av8Var, (i4 & 14) | 196608, 30);
        } else {
            vnbVar2 = vnbVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(vnbVar2, ksaVar, i2, i3);
        }
    }

    public static final void c(q80 q80Var, xtc xtcVar, dfj dfjVar, Function1 function1, int i2, boolean z, int i3, int i4, Map map, es0 es0Var, of3 of3Var, int i5, int i6) {
        int i7;
        Function1 function12;
        int i8;
        av8 av8Var;
        boolean z2;
        int i9;
        boolean z3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1343466571);
        if ((i5 & 6) == 0) {
            i7 = (av8Var2.g(q80Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= av8Var2.g(dfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i5 & 3072) == 0) {
            function12 = function1;
            i7 |= av8Var2.i(function12) ? a.o : 1024;
        } else {
            function12 = function1;
        }
        if ((i5 & 24576) == 0) {
            i7 |= av8Var2.e(i2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= av8Var2.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i5) == 0) {
            i7 |= av8Var2.e(i3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= av8Var2.e(i4) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= av8Var2.i(map) ? 67108864 : 33554432;
        }
        int i10 = i7 | 805306368;
        if ((i6 & 6) == 0) {
            i8 = i6 | ((i6 & 8) == 0 ? av8Var2.g(es0Var) : av8Var2.i(es0Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        int i11 = 0;
        if (av8Var2.T(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            wnn.K(i4, i3);
            if (av8Var2.k(i3h.a) != null) {
                pvd.j();
                return;
            }
            av8Var2.d0(1588759409);
            av8Var2.s(false);
            Pair pair = t80.a;
            int length = q80Var.b.length();
            List list = q80Var.a;
            if (list != null) {
                int size = list.size();
                while (i11 < size) {
                    i9 = i10;
                    p80 p80Var = (p80) list.get(i11);
                    List list2 = list;
                    if ((p80Var.a instanceof ohi) && "androidx.compose.foundation.text.inlineContent".equals(p80Var.d)) {
                        z2 = false;
                        if (r80.b(0, length, p80Var.b, p80Var.c)) {
                            z3 = true;
                            break;
                        }
                    }
                    i11++;
                    list = list2;
                    i10 = i9;
                }
                z2 = false;
            } else {
                z2 = false;
            }
            i9 = i10;
            z3 = z2;
            boolean n2 = oea.n(q80Var);
            sf8 sf8Var = (sf8) av8Var2.k(dh3.k);
            if (z3 || n2) {
                av8Var2.d0(1590022070);
                boolean z4 = (i9 & 14) == 4 ? true : z2;
                Object O = av8Var2.O();
                Object obj = nf3.a;
                if (z4 || O == obj) {
                    O = e.f(q80Var);
                    av8Var2.n0(O);
                }
                e1d e1dVar = (e1d) O;
                q80 q80Var2 = (q80) e1dVar.getValue();
                boolean g2 = av8Var2.g(e1dVar);
                Object O2 = av8Var2.O();
                if (g2 || O2 == obj) {
                    O2 = new w30(11, e1dVar);
                    av8Var2.n0(O2);
                }
                int i12 = i9 << 6;
                int i13 = ((i9 >> 21) & 896) | ((i8 << 12) & 57344);
                av8Var = av8Var2;
                n(xtcVar, q80Var2, function1, z3, map, dfjVar, i2, z, i3, i4, sf8Var, (Function1) O2, es0Var, av8Var, ((i9 >> 3) & 910) | ((i9 >> 12) & 57344) | ((i9 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), i13);
                av8Var.s(false);
            } else {
                av8Var2.d0(1589006262);
                fp1.a(q80Var, dfjVar, sf8Var, null, av8Var2);
                xtc I = I(xtcVar, q80Var, dfjVar, function12, i2, z, i3, i4, sf8Var, null, null, null, null, es0Var);
                g00 g00Var = g00.g;
                int hashCode = Long.hashCode(av8Var2.T);
                xtc C = fqj.C(av8Var2, I);
                aee m2 = av8Var2.m();
                if3.k7.getClass();
                Function0 function0 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(function0);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, g00Var, hf3.g);
                waa.K(av8Var2, m2, hf3.f);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                av8Var2.s(true);
                av8Var2.s(false);
                av8Var = av8Var2;
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zo1(q80Var, xtcVar, dfjVar, function1, i2, z, i3, i4, map, es0Var, i5, i6, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, xtc xtcVar, dfj dfjVar, Function1 function1, int i2, boolean z, int i3, int i4, c23 c23Var, es0 es0Var, of3 of3Var, int i5, int i6) {
        int i7;
        dfj dfjVar2;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        av8 av8Var;
        boolean z2;
        c23 c23Var2;
        es0 es0Var2;
        Function1 function13;
        int i15;
        int i16;
        eqf u;
        int i17;
        c23 c23Var3;
        sf8 sf8Var;
        boolean z3;
        boolean z4;
        int i18;
        int i19;
        es0 es0Var3;
        Function1 function14;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (av8Var2.g(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            dfjVar2 = dfjVar;
            i7 |= av8Var2.g(dfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            dfjVar2 = dfjVar;
        }
        int i20 = i6 & 8;
        if (i20 != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            function12 = function1;
            i7 |= av8Var2.i(function12) ? a.o : 1024;
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i5 & 24576) == 0) {
                i9 = i2;
                i7 |= av8Var2.e(i9) ? 16384 : 8192;
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i5) == 0) {
                    i7 |= av8Var2.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if ((1572864 & i5) == 0) {
                        i7 |= av8Var2.e(i3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i7 |= av8Var2.e(i4) ? 8388608 : 4194304;
                    }
                    i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i5 & 100663296) == 0) {
                        i13 = i12;
                        i7 |= av8Var2.i(c23Var) ? 67108864 : 33554432;
                        i14 = i6 & 512;
                        int i21 = 805306368;
                        if (i14 == 0) {
                            if ((i5 & 805306368) == 0) {
                                i21 = (i5 & 1073741824) == 0 ? av8Var2.g(es0Var) : av8Var2.i(es0Var) ? 536870912 : 268435456;
                            }
                            if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                                av8Var = av8Var2;
                                av8Var.W();
                                z2 = z;
                                c23Var2 = c23Var;
                                es0Var2 = es0Var;
                                function13 = function12;
                                i15 = i9;
                                i16 = i4;
                            } else {
                                Function1 function15 = i20 != 0 ? null : function12;
                                if (i8 != 0) {
                                    i9 = 1;
                                }
                                boolean z5 = i10 != 0 ? true : z;
                                int i22 = i11 != 0 ? 1 : i4;
                                if (i13 != 0) {
                                    i17 = i9;
                                    c23Var3 = null;
                                } else {
                                    i17 = i9;
                                    c23Var3 = c23Var;
                                }
                                es0 es0Var4 = i14 != 0 ? null : es0Var;
                                wnn.K(i22, i3);
                                if (av8Var2.k(i3h.a) != null) {
                                    pvd.j();
                                    return;
                                }
                                av8Var2.d0(356914239);
                                av8Var2.s(false);
                                sf8 sf8Var2 = (sf8) av8Var2.k(dh3.k);
                                Executor executor = (Executor) av8Var2.k(fp1.a);
                                if (executor == null || !fp1.b(str.length())) {
                                    sf8Var = sf8Var2;
                                    z3 = false;
                                    av8Var2.d0(1255914055);
                                    av8Var2.s(false);
                                } else {
                                    av8Var2.d0(1254298614);
                                    try {
                                        try {
                                            dp1 dp1Var = new dp1(dfjVar2, (ema) av8Var2.k(dh3.n), str, (kx4) av8Var2.k(dh3.h), sf8Var2, 0);
                                            sf8Var = sf8Var2;
                                            try {
                                                executor.execute(dp1Var);
                                            } catch (RejectedExecutionException unused) {
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                            sf8Var = sf8Var2;
                                        }
                                    } catch (RejectedExecutionException unused3) {
                                        sf8Var = sf8Var2;
                                    }
                                    z3 = false;
                                    av8Var2.s(false);
                                }
                                if (function15 == null && es0Var4 == null) {
                                    av8Var2.d0(357875859);
                                    av8Var2.s(z3);
                                    z4 = z5;
                                    i18 = i22;
                                    i19 = i17;
                                    xtcVar2 = xtcVar.z(new yej(str, dfjVar, sf8Var, i19, z4, i3, i18, c23Var3));
                                    av8Var = av8Var2;
                                    es0Var3 = es0Var4;
                                    function14 = function15;
                                } else {
                                    z4 = z5;
                                    i18 = i22;
                                    i19 = i17;
                                    av8Var2.d0(357232113);
                                    av8Var = av8Var2;
                                    c23 c23Var4 = c23Var3;
                                    es0Var3 = es0Var4;
                                    function14 = function15;
                                    xtc I = I(xtcVar, new q80(str), dfjVar, function14, i19, z4, i3, i18, (sf8) av8Var2.k(dh3.k), null, null, c23Var4, null, es0Var3);
                                    c23Var3 = c23Var4;
                                    av8Var.s(z3);
                                    xtcVar2 = I;
                                }
                                g00 g00Var = g00.g;
                                int hashCode = Long.hashCode(av8Var.T);
                                xtc C = fqj.C(av8Var, xtcVar2);
                                aee m2 = av8Var.m();
                                if3.k7.getClass();
                                zg3 zg3Var = hf3.b;
                                av8Var.h0();
                                if (av8Var.S) {
                                    av8Var.l(zg3Var);
                                } else {
                                    av8Var.q0();
                                }
                                waa.K(av8Var, g00Var, hf3.g);
                                waa.K(av8Var, m2, hf3.f);
                                waa.J(av8Var, hf3.k);
                                waa.K(av8Var, C, hf3.d);
                                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                av8Var.s(true);
                                z2 = z4;
                                c23Var2 = c23Var3;
                                es0Var2 = es0Var3;
                                i15 = i19;
                                i16 = i18;
                                function13 = function14;
                            }
                            u = av8Var.u();
                            if (u == null) {
                                u.d = new zo1(str, xtcVar, dfjVar, function13, i15, z2, i3, i16, c23Var2, es0Var2, i5, i6, 0);
                                return;
                            }
                            return;
                        }
                        i7 |= i21;
                        if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    int i212 = 805306368;
                    if (i14 == 0) {
                    }
                    i7 |= i212;
                    if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
                if ((1572864 & i5) == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                int i2122 = 805306368;
                if (i14 == 0) {
                }
                i7 |= i2122;
                if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            i9 = i2;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            if ((1572864 & i5) == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            int i21222 = 805306368;
            if (i14 == 0) {
            }
            i7 |= i21222;
            if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        function12 = function1;
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        if ((1572864 & i5) == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        int i212222 = 805306368;
        if (i14 == 0) {
        }
        i7 |= i212222;
        if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(Function0 function0, xtc xtcVar, boolean z, uah uahVar, p72 p72Var, v72 v72Var, qz1 qz1Var, p3e p3eVar, wzc wzcVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        uah uahVar2;
        v72 v72Var2;
        int i6;
        qz1 qz1Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        av8 av8Var;
        xtc xtcVar2;
        boolean z3;
        uah uahVar3;
        v72 v72Var3;
        qz1 qz1Var3;
        p3e p3eVar2;
        wzc wzcVar2;
        eqf u;
        uah uahVar4;
        v72 v72Var4;
        p3e p3eVar3;
        int i11;
        qz1 qz1Var4;
        boolean z4;
        uah uahVar5;
        wzc wzcVar3;
        a99 a99Var;
        wzc wzcVar4;
        wzc wzcVar5;
        p3e p3eVar4;
        long j2;
        qz1 qz1Var5;
        long j3;
        float f2;
        Object O;
        wzc wzcVar6;
        boolean i12;
        Object O2;
        d80 d80Var;
        Object O3;
        int i13;
        int i14;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(xtcVar) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        uahVar2 = uahVar;
                        if (av8Var2.g(uahVar2)) {
                            i14 = a.o;
                            i4 |= i14;
                        }
                    } else {
                        uahVar2 = uahVar;
                    }
                    i14 = 1024;
                    i4 |= i14;
                } else {
                    uahVar2 = uahVar;
                }
                if ((i2 & 24576) == 0) {
                    i4 |= av8Var2.g(p72Var) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        v72Var2 = v72Var;
                        if (av8Var2.g(v72Var2)) {
                            i13 = 131072;
                            i4 |= i13;
                        }
                    } else {
                        v72Var2 = v72Var;
                    }
                    i13 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i13;
                } else {
                    v72Var2 = v72Var;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    qz1Var2 = qz1Var;
                    i4 |= av8Var2.g(qz1Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= av8Var2.g(p3eVar) ? 8388608 : 4194304;
                    }
                    int i16 = i4;
                    i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i8 == 0) {
                        i16 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i9 = i8;
                        i16 |= av8Var2.g(wzcVar) ? 67108864 : 33554432;
                        if ((i2 & 805306368) == 0) {
                            i16 |= av8Var2.i(tc3Var) ? 536870912 : 268435456;
                        }
                        i10 = i16;
                        if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                            av8Var2.Y();
                            if ((i2 & 1) == 0 || av8Var2.B()) {
                                xtcVar2 = i15 != 0 ? utc.a : xtcVar;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 8) != 0) {
                                    t3e t3eVar = q72.a;
                                    uahVar4 = ech.b(a82.a, av8Var2);
                                    i10 &= -7169;
                                } else {
                                    uahVar4 = uahVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    v72Var4 = q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31);
                                    i10 &= -458753;
                                } else {
                                    v72Var4 = v72Var2;
                                }
                                if (i6 != 0) {
                                    qz1Var2 = null;
                                }
                                p3eVar3 = i7 != 0 ? q72.a : p3eVar;
                                boolean z5 = z2;
                                i11 = i10;
                                qz1Var4 = qz1Var2;
                                z4 = z5;
                                uahVar5 = uahVar4;
                                if (i9 != 0) {
                                    wzcVar3 = null;
                                } else {
                                    wzcVar3 = wzcVar;
                                    av8Var2.t();
                                    a99Var = nf3.a;
                                    if (wzcVar3 != null) {
                                        av8Var2.d0(1691738187);
                                        Object O4 = av8Var2.O();
                                        if (O4 == a99Var) {
                                            O4 = mz1.e(av8Var2);
                                        }
                                        wzcVar4 = (wzc) O4;
                                        av8Var2.s(false);
                                    } else {
                                        av8Var2.d0(-499617780);
                                        av8Var2.s(false);
                                        wzcVar4 = wzcVar3;
                                    }
                                    if (z4) {
                                        wzcVar5 = wzcVar3;
                                        p3eVar4 = p3eVar3;
                                        j2 = p72Var.c;
                                    } else {
                                        wzcVar5 = wzcVar3;
                                        p3eVar4 = p3eVar3;
                                        j2 = p72Var.a;
                                    }
                                    long j4 = j2;
                                    long j5 = !z4 ? p72Var.b : p72Var.d;
                                    if (v72Var4 != null) {
                                        av8Var2.d0(1691921830);
                                        av8Var2.s(false);
                                        qz1Var5 = qz1Var4;
                                        wzcVar6 = wzcVar4;
                                        j3 = j5;
                                        d80Var = null;
                                    } else {
                                        av8Var2.d0(-499611205);
                                        int i17 = ((i11 >> 9) & 896) | ((i11 >> 6) & 14);
                                        Object O5 = av8Var2.O();
                                        if (O5 == a99Var) {
                                            O5 = new SnapshotStateList();
                                            av8Var2.n0(O5);
                                        }
                                        SnapshotStateList snapshotStateList = (SnapshotStateList) O5;
                                        boolean g2 = av8Var2.g(wzcVar4);
                                        qz1Var5 = qz1Var4;
                                        Object O6 = av8Var2.O();
                                        if (g2 || O6 == a99Var) {
                                            j3 = j5;
                                            O6 = new t72(wzcVar4, snapshotStateList, null, 0);
                                            av8Var2.n0(O6);
                                        } else {
                                            j3 = j5;
                                        }
                                        hz8.o(av8Var2, wzcVar4, (Function2) O6);
                                        i7a i7aVar = (i7a) CollectionsKt.j0(snapshotStateList);
                                        if (z4 && !(i7aVar instanceof l6f)) {
                                            if (i7aVar instanceof sf9) {
                                                f2 = v72Var4.b;
                                            } else if (!(i7aVar instanceof rd8)) {
                                                f2 = v72Var4.a;
                                            }
                                            O = av8Var2.O();
                                            if (O != a99Var) {
                                                wzcVar6 = wzcVar4;
                                                O = new q50(new p75(f2), lz.h, null, 12);
                                                av8Var2.n0(O);
                                            } else {
                                                wzcVar6 = wzcVar4;
                                            }
                                            q50 q50Var = (q50) O;
                                            p75 p75Var = new p75(f2);
                                            i12 = ((((i17 & 896) ^ 384) <= 256 && av8Var2.g(v72Var4)) || (i17 & 384) == 256) | av8Var2.i(q50Var) | av8Var2.d(f2) | ((((i17 & 14) ^ 6) <= 4 && av8Var2.h(z4)) || (i17 & 6) == 4) | av8Var2.i(i7aVar);
                                            O2 = av8Var2.O();
                                            if (!i12 || O2 == a99Var) {
                                                O2 = new u72(q50Var, f2, z4, v72Var4, i7aVar, null, 0);
                                                av8Var2.n0(O2);
                                            }
                                            hz8.o(av8Var2, p75Var, (Function2) O2);
                                            d80Var = q50Var.c;
                                            av8Var2.s(false);
                                        }
                                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        O = av8Var2.O();
                                        if (O != a99Var) {
                                        }
                                        q50 q50Var2 = (q50) O;
                                        p75 p75Var2 = new p75(f2);
                                        i12 = ((((i17 & 896) ^ 384) <= 256 && av8Var2.g(v72Var4)) || (i17 & 384) == 256) | av8Var2.i(q50Var2) | av8Var2.d(f2) | ((((i17 & 14) ^ 6) <= 4 && av8Var2.h(z4)) || (i17 & 6) == 4) | av8Var2.i(i7aVar);
                                        O2 = av8Var2.O();
                                        if (!i12) {
                                        }
                                        O2 = new u72(q50Var2, f2, z4, v72Var4, i7aVar, null, 0);
                                        av8Var2.n0(O2);
                                        hz8.o(av8Var2, p75Var2, (Function2) O2);
                                        d80Var = q50Var2.c;
                                        av8Var2.s(false);
                                    }
                                    float f3 = d80Var == null ? ((p75) ((eoh) d80Var.b).getValue()).a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    O3 = av8Var2.O();
                                    if (O3 == a99Var) {
                                        O3 = new b42(1);
                                        av8Var2.n0(O3);
                                    }
                                    p3e p3eVar5 = p3eVar4;
                                    long j6 = j3;
                                    qz1 qz1Var6 = qz1Var5;
                                    av8Var = av8Var2;
                                    uni.c(function0, o3h.a(xtcVar2, false, (Function1) O3), z4, uahVar5, j4, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, qz1Var6, wzcVar6, yqo.H(-535639973, av8Var2, new z72(j6, p3eVar5, tc3Var, 0)), av8Var, (i11 & 8078) | (234881024 & (i11 << 6)), 64);
                                    p3eVar2 = p3eVar5;
                                    v72Var3 = v72Var4;
                                    z3 = z4;
                                    uahVar3 = uahVar5;
                                    qz1Var3 = qz1Var6;
                                    wzcVar2 = wzcVar5;
                                }
                            } else {
                                av8Var2.W();
                                if ((i3 & 8) != 0) {
                                    i10 &= -7169;
                                }
                                if ((i3 & 32) != 0) {
                                    i10 &= -458753;
                                }
                                boolean z6 = z2;
                                i11 = i10;
                                qz1Var4 = qz1Var2;
                                z4 = z6;
                                xtcVar2 = xtcVar;
                                p3eVar3 = p3eVar;
                                wzcVar3 = wzcVar;
                                uahVar5 = uahVar2;
                                v72Var4 = v72Var2;
                            }
                            av8Var2.t();
                            a99Var = nf3.a;
                            if (wzcVar3 != null) {
                            }
                            if (z4) {
                            }
                            long j42 = j2;
                            if (!z4) {
                            }
                            if (v72Var4 != null) {
                            }
                            if (d80Var == null) {
                            }
                            O3 = av8Var2.O();
                            if (O3 == a99Var) {
                            }
                            p3e p3eVar52 = p3eVar4;
                            long j62 = j3;
                            qz1 qz1Var62 = qz1Var5;
                            av8Var = av8Var2;
                            uni.c(function0, o3h.a(xtcVar2, false, (Function1) O3), z4, uahVar5, j42, j62, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, qz1Var62, wzcVar6, yqo.H(-535639973, av8Var2, new z72(j62, p3eVar52, tc3Var, 0)), av8Var, (i11 & 8078) | (234881024 & (i11 << 6)), 64);
                            p3eVar2 = p3eVar52;
                            v72Var3 = v72Var4;
                            z3 = z4;
                            uahVar3 = uahVar5;
                            qz1Var3 = qz1Var62;
                            wzcVar2 = wzcVar5;
                        } else {
                            av8Var = av8Var2;
                            av8Var.W();
                            xtcVar2 = xtcVar;
                            z3 = z2;
                            uahVar3 = uahVar2;
                            v72Var3 = v72Var2;
                            qz1Var3 = qz1Var2;
                            p3eVar2 = p3eVar;
                            wzcVar2 = wzcVar;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new w72(function0, xtcVar2, z3, uahVar3, p72Var, v72Var3, qz1Var3, p3eVar2, wzcVar2, tc3Var, i2, i3);
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & 805306368) == 0) {
                    }
                    i10 = i16;
                    if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                qz1Var2 = qz1Var;
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                int i162 = i4;
                i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 805306368) == 0) {
                }
                i10 = i162;
                if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            z2 = z;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            qz1Var2 = qz1Var;
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            int i1622 = i4;
            i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 805306368) == 0) {
            }
            i10 = i1622;
            if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        qz1Var2 = qz1Var;
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        int i16222 = i4;
        i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 805306368) == 0) {
        }
        i10 = i16222;
        if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void f(Function0 function0, Function0 function02, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i2) {
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1045798159);
        int i3 = i2 | (av8Var.i(function0) ? 4 : 2) | (av8Var.i(function02) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            xtc d2 = bkh.d(xtcVar, 1.0f);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            mha.h(oea.v(R.string.substitutions, av8Var), function0, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, z, false, false, 0L, 0, 0, av8Var, ((i3 << 3) & 112) | ((i3 << 9) & 458752), 0, 2008);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            mha.h(oea.v(R.string.transfers, av8Var), function02, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, z2, false, false, 0L, 0, 0, av8Var, (i3 & 112) | ((i3 << 6) & 458752), 0, 2008);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(function0, function02, z, z2, xtcVar, i2, 0);
        }
    }

    public static final void g(u75 u75Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1401110176);
        int i3 = (av8Var.g(u75Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Integer num = u75Var.a;
            ww9.c(null, num != null ? num.intValue() : -1, u75Var.b, u75Var.c, u75Var.d, null, new goa(1.0f, true), av8Var, 196614);
            String u = dti.u(context, u75Var.f, u75Var.g, u75Var.e, true);
            xtc p2 = bkh.p(l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 56.0f);
            yf8 yf8Var = xth.a;
            q5a.w(u, p2, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(6), 0L, 0, false, 0, 0, xth.g(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ns4(u75Var, xtcVar, i2, 8);
        }
    }

    public static final void h(ev6 ev6Var, xtc xtcVar, boolean z, boolean z2, Function0 function0, of3 of3Var, int i2) {
        ev6 ev6Var2;
        Function0 function02;
        long j2;
        float f2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1837359098);
        int i4 = i2 | (av8Var.g(ev6Var) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            if (z) {
                j2 = ljg.f(av8Var, -470524005, R.color.primary_highlight, av8Var, false);
            } else {
                av8Var.d0(-470522959);
                av8Var.s(false);
                j2 = r13.h;
            }
            cdi a2 = wih.a(j2, null, null, av8Var, 0, 14);
            lv1 lv1Var = uxf.m;
            xtc f0 = l98.f0(l98.d0(bkh.d(fz8.Y(n9e.q(xtcVar, ((r13) a2.getValue()).a, oyn.e), n9a.b), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            Integer num = ev6Var.g;
            String str = ev6Var.h;
            int i5 = ev6Var.a;
            boolean z3 = ev6Var.y;
            utc utcVar = utc.a;
            td4.q(num, i5, z3, bkh.l(utcVar, 40.0f), av8Var, 3072);
            goa d2 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String str2 = ev6Var.e;
            yf8 yf8Var = xth.a;
            ev6Var2 = ev6Var;
            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            e12.a(0, av8Var, n9e.q(l98.b0(bkh.l(utcVar, 16.0f), 5.5f), r13.c(lz.D(R.color.n_lv_1, av8Var), 0.15f), o7g.a));
            kq9.a(haa.t(R.drawable.ic_team, 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 440, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(uxf.E(ev6Var2.t, 58, false), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            bf3.t(av8Var, true, utcVar, 2.0f, av8Var);
            l8g a6 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.a(haa.t(wyh.a(str), 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 440, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(wyh.c(context, str), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            if (ev6Var2.y) {
                av8Var.d0(1576747314);
                fz8.j(6, 2, 0L, av8Var, l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                kq9.b(s6a.N(R.drawable.ic_official_checkmark, 6, av8Var), null, bkh.l(utcVar, 16.0f), r13.i, av8Var, V2.b.f, 0);
                f2 = 0.0f;
                i3 = 2;
                udj.c(fc6.f(2.0f, R.string.fantasy_official_league, av8Var, av8Var, utcVar), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i3 = 2;
                av8Var.d0(1577515153);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
            if (z2) {
                ljg.r(8.0f, -1588587228, av8Var, av8Var, utcVar);
                d7e t = haa.t(R.drawable.ic_reorder, 0, av8Var);
                long D = lz.D(R.color.n_lv_3, av8Var);
                xtc c2 = bkh.c(utcVar, 1.0f);
                boolean z4 = (i4 & 57344) == 16384;
                Object O = av8Var.O();
                int i6 = 3;
                if (z4 || O == nf3.a) {
                    function02 = function0;
                    O = new ma0(i6, function02);
                    av8Var.n0(O);
                } else {
                    function02 = function0;
                }
                kq9.a(t, null, bkh.l(l98.d0(fqj.q(c2, new e60((Function1) O, i6)), 8.0f, f2, i3), 24.0f), D, av8Var, 56, 0);
                bf3.u(utcVar, 8.0f, av8Var, false);
            } else {
                function02 = function0;
                ljg.r(16.0f, -1587897044, av8Var, av8Var, utcVar);
                kq9.a(haa.t(R.drawable.ic_chevron_right_small_16, 0, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440, 0);
                bf3.u(utcVar, 16.0f, av8Var, false);
            }
            av8Var.s(true);
        } else {
            ev6Var2 = ev6Var;
            function02 = function0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(ev6Var2, xtcVar, z, z2, function02, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, String str2, String str3, Function0 function0, String str4, String str5, Function0 function02, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        int i4;
        Function0 function03;
        String str6;
        int i5;
        String str7;
        int i6;
        int i7;
        av8 av8Var;
        Function0 function04;
        String str8;
        eqf u;
        String str9;
        float f2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1736167301);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            function03 = function0;
            i4 |= av8Var2.i(function03) ? a.o : 1024;
        } else {
            function03 = function0;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            str6 = str4;
            i4 |= av8Var2.g(str6) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                str7 = str5;
                i4 |= av8Var2.g(str7) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i4 |= av8Var2.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if ((i2 & 12582912) == 0) {
                        i4 |= av8Var2.h(z) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= av8Var2.h(z2) ? 67108864 : 33554432;
                    }
                    i7 = i4;
                    if (av8Var2.T(i7 & 1, (i4 & 38347923) == 38347922)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        function04 = function02;
                        str8 = str6;
                    } else {
                        if (i8 != 0) {
                            str6 = null;
                        }
                        String str10 = i5 != 0 ? null : str7;
                        Function0 function05 = i6 == 0 ? function02 : null;
                        utc utcVar = utc.a;
                        xtc b0 = l98.b0(n9e.q(wnn.A(l98.b0(utcVar, 16.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var2), oyn.e), 16.0f);
                        u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, b0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var2, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var2, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var2, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var2, C, f50Var3);
                        yf8 yf8Var = xth.a;
                        udj.c(str, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.i(), av8Var2, (i7 & 14) | 48, 24576, 114680);
                        nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                        udj.c(str2, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, ((i7 >> 3) & 14) | 48, 0, 131064);
                        av8 av8Var3 = av8Var2;
                        if (str6 != null) {
                            av8Var3.d0(1950143740);
                            nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                            dfj f3 = xth.f();
                            long D = lz.D(R.color.n_lv_1, av8Var3);
                            String str11 = str6;
                            f2 = 16.0f;
                            udj.c(str11, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, f3, av8Var3, ((i7 >> 12) & 14) | 48, 0, 131064);
                            str9 = str11;
                            av8Var3 = av8Var3;
                            av8Var3.s(false);
                        } else {
                            str9 = str6;
                            f2 = 16.0f;
                            av8Var3.d0(1950400327);
                            av8Var3.s(false);
                        }
                        nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
                        lv1 lv1Var = uxf.m;
                        uxf uxfVar = ww9.c;
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        l8g a3 = k8g.a(uxfVar, lv1Var, av8Var3, 54);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m3 = av8Var3.m();
                        xtc C2 = fqj.C(av8Var3, d2);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a3, f50Var);
                        waa.K(av8Var3, m3, ff3Var);
                        bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                        waa.K(av8Var3, C2, f50Var3);
                        int i9 = i7 >> 6;
                        av8 av8Var4 = av8Var3;
                        mha.h(str3, function03, null, gqh.a, null, !z2, false, false, 0L, 0, 0, av8Var4, (i9 & 14) | 3072 | (i9 & 112), 0, 2004);
                        av8Var = av8Var4;
                        if (str10 == null) {
                            av8Var.d0(1696375180);
                            av8Var.s(false);
                            str7 = str10;
                        } else {
                            ljg.r(f2, 1696375181, av8Var, av8Var, utcVar);
                            boolean z3 = z || z2;
                            boolean z4 = (i7 & 3670016) == 1048576;
                            Object O = av8Var.O();
                            if (z4 || O == nf3.a) {
                                O = new ve7(5, function05);
                                av8Var.n0(O);
                            }
                            String str12 = str10;
                            mha.h(str12, (Function0) O, null, kqh.a, null, false, z3, false, 0L, 0, 0, av8Var, ((i7 >> 15) & 14) | 3072, 0, 1972);
                            str7 = str12;
                            av8Var = av8Var;
                            Unit unit = Unit.a;
                            av8Var.s(false);
                        }
                        av8Var.s(true);
                        av8Var.s(true);
                        function04 = function05;
                        str8 = str9;
                    }
                    String str13 = str7;
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new a05(str, str2, str3, function0, str8, str13, function04, z, z2, i2, i3);
                        return;
                    }
                    return;
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i7 = i4;
                if (av8Var2.T(i7 & 1, (i4 & 38347923) == 38347922)) {
                }
                String str132 = str7;
                u = av8Var.u();
                if (u == null) {
                }
            }
            str7 = str5;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i7 = i4;
            if (av8Var2.T(i7 & 1, (i4 & 38347923) == 38347922)) {
            }
            String str1322 = str7;
            u = av8Var.u();
            if (u == null) {
            }
        }
        str6 = str4;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        str7 = str5;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i7 = i4;
        if (av8Var2.T(i7 & 1, (i4 & 38347923) == 38347922)) {
        }
        String str13222 = str7;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void j(final vl7 vl7Var, Function0 function0, final Function2 function2, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        String str;
        vl7Var.getClass();
        function0.getClass();
        function2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-945193888);
        int i6 = i2 | (av8Var.g(vl7Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function2) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z3 = z;
        } else {
            z3 = z;
            i4 = i6 | (av8Var.h(z3) ? a.o : 1024);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i4 | (av8Var.h(z4) ? 16384 : 8192);
        }
        final int i9 = 0;
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z7 = i7 != 0 ? false : z3;
            boolean z8 = i8 != 0 ? false : z4;
            am7 am7Var = vl7Var.b;
            tl7 tl7Var = vl7Var.a;
            if (am7Var instanceof zl7) {
                av8Var.d0(-465198307);
                int i10 = (i5 << 6) & 7168;
                int i11 = i5 << 12;
                i(oea.v(R.string.fantasy_token_unavailable, av8Var), oea.v(((zl7) am7Var).a.a, av8Var), oea.v(R.string.button_text_got_it, av8Var), function0, null, null, null, z7, z8, av8Var, (i11 & 234881024) | i10 | (i11 & 29360128), 112);
                av8Var.s(false);
            } else {
                boolean z9 = am7Var instanceof yl7;
                a99 a99Var = nf3.a;
                int i12 = R.string.cancel;
                if (z9) {
                    av8Var.d0(-464715079);
                    String v = oea.v(tl7Var.b, av8Var);
                    String v2 = oea.v(tl7Var.c, av8Var);
                    String v3 = oea.v(vl7Var.d ? R.string.fantasy_token_available_rebuild_squad_text_1 : R.string.fantasy_token_available_additional_text, av8Var);
                    String v4 = oea.v(R.string.cancel, av8Var);
                    String v5 = oea.v(R.string.fantasy_activate_token_button, av8Var);
                    boolean z10 = ((i5 & 14) == 4) | ((i5 & 896) == 256);
                    Object O = av8Var.O();
                    if (z10 || O == a99Var) {
                        O = new Function0() { // from class: wl7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i13 = i9;
                                vl7 vl7Var2 = vl7Var;
                                Function2 function22 = function2;
                                switch (i13) {
                                    case 0:
                                        function22.invoke(vl7Var2.a, Boolean.TRUE);
                                        break;
                                    default:
                                        function22.invoke(vl7Var2.a, Boolean.FALSE);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O);
                    }
                    int i13 = (i5 << 6) & 7168;
                    int i14 = i5 << 12;
                    i(v, v2, v4, function0, v3, v5, (Function0) O, z7, z8, av8Var, i13 | (i14 & 29360128) | (i14 & 234881024), 0);
                    av8Var.s(false);
                } else {
                    if (!(am7Var instanceof xl7)) {
                        throw dmi.h(av8Var, -2093217335, false);
                    }
                    av8Var.d0(-463999320);
                    boolean z11 = ((xl7) am7Var).a;
                    String v6 = oea.v(z11 ? tl7Var.d : R.string.fantasy_token_active, av8Var);
                    String v7 = oea.v(z11 ? R.string.fantasy_token_deactivate_text : tl7Var.e, av8Var);
                    if (!z11) {
                        i12 = R.string.button_text_got_it;
                    }
                    String v8 = oea.v(i12, av8Var);
                    if (z11) {
                        str = ljg.k(av8Var, -2093161221, R.string.fantasy_token_deactivate, av8Var, false);
                    } else {
                        av8Var.d0(-463425635);
                        av8Var.s(false);
                        str = null;
                    }
                    boolean z12 = ((i5 & 14) == 4) | ((i5 & 896) == 256);
                    Object O2 = av8Var.O();
                    if (z12 || O2 == a99Var) {
                        final int i15 = 1;
                        O2 = new Function0() { // from class: wl7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i132 = i15;
                                vl7 vl7Var2 = vl7Var;
                                Function2 function22 = function2;
                                switch (i132) {
                                    case 0:
                                        function22.invoke(vl7Var2.a, Boolean.TRUE);
                                        break;
                                    default:
                                        function22.invoke(vl7Var2.a, Boolean.FALSE);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O2);
                    }
                    Function0 function02 = (Function0) O2;
                    if (!z11) {
                        function02 = null;
                    }
                    int i16 = (i5 << 6) & 7168;
                    int i17 = i5 << 12;
                    i(v6, v7, v8, function0, null, str, function02, z7, z8, av8Var, i16 | (i17 & 29360128) | (i17 & 234881024), 16);
                    av8Var.s(false);
                }
            }
            z5 = z7;
            z6 = z8;
        } else {
            av8Var.W();
            z5 = z3;
            z6 = z4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(vl7Var, function0, function2, z5, z6, i2, i3);
        }
    }

    public static final void k(xtc xtcVar, int i2, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, of3 of3Var, int i3) {
        int i4;
        String str2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1598776959);
        if ((i3 & 6) == 0) {
            i4 = i3 | (av8Var.g(xtcVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i5 = i4 | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(num) ? a.o : 1024) | (av8Var.g(num2) ? 16384 : 8192) | (av8Var.g(num3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(num4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(num5) ? 8388608 : 4194304);
        if (av8Var.T(i5 & 1, (4793491 & i5) != 4793490)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            td4.C(i2, bkh.l(utcVar, 48.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i5 >> 3) & 14) | 48, 12);
            xtc f0 = l98.f0(bkh.o(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 120.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                str2.getClass();
            } else {
                str2 = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str2, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.d0(620585596);
            if (num != null && num2 != null && num3 != null && num4 != null) {
                int intValue = num4.intValue();
                int intValue2 = num3.intValue();
                rha.d(num.intValue(), num2.intValue(), intValue2, intValue, Integer.valueOf(num5 != null ? num5.intValue() : 0), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 196608, 0, 1984);
                av8Var = av8Var;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w51(xtcVar, i2, str, num, num2, num3, num4, num5, i3);
        }
    }

    public static final void l(bq9 bq9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1909677118);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(bq9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 >> 6) & 14;
            int i5 = i3 << 3;
            m((i5 & 896) | i4 | (i5 & 112), bq9Var, av8Var, bq9Var.m, bq9Var.n, bq9Var.o, xtcVar, bq9Var.p, function1);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wp9(bq9Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void m(int i2, w31 w31Var, of3 of3Var, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, xtc xtcVar, TeamSelection teamSelection, Function1 function1) {
        int i3;
        av8 av8Var;
        function1.getClass();
        gv9Var.getClass();
        teamSelection.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1591993774);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(w31Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(fy7Var) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(ux7Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.i(gv9Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var2.e(teamSelection.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            int g2 = w31Var.getG();
            x43 f2 = w31Var.f();
            String h2 = w31Var.getH();
            String i5 = w31Var.getI();
            boolean z = w31Var.e;
            int i6 = 29;
            tc3 H = yqo.H(1297612244, av8Var2, new s16(w31Var, i6));
            tc3 H2 = yqo.H(601945486, av8Var2, new d67(i6, ux7Var, fy7Var, w31Var));
            tc3 H3 = yqo.H(-1839512304, av8Var2, new xp9(i4, gv9Var, teamSelection));
            int i7 = i3 & 896;
            int i8 = i3;
            int i9 = i8 & 112;
            boolean z2 = ((57344 & i3) == 16384) | (i7 == 256) | ((i3 & 7168) == 2048) | (i9 == 32);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new yp9(ux7Var, function1, fy7Var, w31Var);
                av8Var2.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean z3 = (i7 == 256) | (i9 == 32);
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                O2 = new ij8(15, function1, w31Var);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(g2, f2, xtcVar, H, H2, null, H3, null, h2, i5, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, ((i8 << 6) & 896) | 1600512, (i8 << 12) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zp9(xtcVar, w31Var, function1, fy7Var, ux7Var, gv9Var, teamSelection, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hej, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [e1d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [km5] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    public static final void n(final xtc xtcVar, q80 q80Var, final Function1 function1, final boolean z, final Map map, final dfj dfjVar, final int i2, final boolean z2, final int i3, final int i4, final sf8 sf8Var, final Function1 function12, final es0 es0Var, of3 of3Var, final int i5, final int i6) {
        int i7;
        int i8;
        q80 q80Var2;
        av8 av8Var;
        ?? r4;
        j4 j4Var;
        Function0 function0;
        Pair pair;
        w30 w30Var;
        ?? r8;
        int i9;
        Object obj;
        Object q20Var;
        ?? r9;
        int i10;
        Map map2 = map;
        ?? r7 = (av8) of3Var;
        r7.f0(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (r7.g(xtcVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r7.g(q80Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= r7.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= r7.h(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= r7.i(map2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= r7.g(dfjVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i5) == 0) {
            i7 |= r7.e(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= r7.h(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= r7.e(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= r7.e(i4) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (r7.i(sf8Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= r7.i(null) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= r7.i(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= r7.i(function12) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? r7.g(es0Var) : r7.i(es0Var) ? 16384 : 8192;
        }
        if (r7.T(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean n2 = oea.n(q80Var);
            a99 a99Var = nf3.a;
            if (n2) {
                r7.d0(145641571);
                boolean z3 = (i7 & 112) == 32;
                Object O = r7.O();
                Object obj2 = O;
                if (z3 || O == a99Var) {
                    hej hejVar = new hej(q80Var);
                    r7.n0(hejVar);
                    obj2 = hejVar;
                }
                r7.s(false);
                r4 = (hej) obj2;
            } else {
                r7.d0(145707228);
                r7.s(false);
                r4 = 0;
            }
            if (oea.n(q80Var)) {
                r7.d0(145905443);
                boolean g2 = ((i7 & 112) == 32) | r7.g(r4);
                ?? O2 = r7.O();
                j4 j4Var2 = O2;
                if (g2 || O2 == a99Var) {
                    j4 j4Var3 = new j4(25, r4, q80Var);
                    r7.n0(j4Var3);
                    j4Var2 = j4Var3;
                }
                j4Var = j4Var2;
                r7.s(false);
            } else {
                r7.d0(146002721);
                boolean z4 = (i7 & 112) == 32;
                Object O3 = r7.O();
                Object obj3 = O3;
                if (z4 || O3 == a99Var) {
                    yj1 yj1Var = new yj1(q80Var, 2);
                    r7.n0(yj1Var);
                    obj3 = yj1Var;
                }
                j4Var = (Function0) obj3;
                r7.s(false);
            }
            if (z) {
                if (map2 != null) {
                    Pair pair2 = t80.a;
                    if (!map2.isEmpty()) {
                        int length = q80Var.b.length();
                        function0 = j4Var;
                        List list = q80Var.a;
                        if (list != null) {
                            r9 = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                List list2 = list;
                                p80 p80Var = (p80) list.get(i11);
                                int i12 = size;
                                Object obj4 = p80Var.a;
                                int i13 = i11;
                                int i14 = p80Var.c;
                                int i15 = p80Var.b;
                                String str = p80Var.d;
                                if ((obj4 instanceof ohi) && "androidx.compose.foundation.text.inlineContent".equals(str) && r80.b(0, length, i15, i14)) {
                                    Object obj5 = p80Var.a;
                                    obj5.getClass();
                                    r9.add(new p80(((ohi) obj5).a, str, i15, i14));
                                }
                                i11 = i13 + 1;
                                size = i12;
                                list = list2;
                            }
                        } else {
                            r9 = km5.a;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r9.size();
                        int i16 = 0;
                        List list3 = r9;
                        while (i16 < size2) {
                            p80 p80Var2 = (p80) list3.get(i16);
                            Object obj6 = p80Var2.a;
                            List list4 = list3;
                            int i17 = p80Var2.c;
                            int i18 = p80Var2.b;
                            x3a x3aVar = (x3a) map2.get(obj6);
                            if (x3aVar != null) {
                                i10 = size2;
                                arrayList.add(new p80(x3aVar.a, i18, i17));
                                arrayList2.add(new p80(x3aVar.b, i18, i17));
                            } else {
                                i10 = size2;
                            }
                            i16++;
                            map2 = map;
                            list3 = list4;
                            size2 = i10;
                        }
                        pair = new Pair(arrayList, arrayList2);
                        w30Var = null;
                    }
                }
                function0 = j4Var;
                pair = t80.a;
                w30Var = null;
            } else {
                function0 = j4Var;
                w30Var = null;
                pair = new Pair(null, null);
            }
            List list5 = (List) pair.a;
            List list6 = (List) pair.b;
            if (z) {
                r7.d0(146318828);
                Object O4 = r7.O();
                Object obj7 = O4;
                if (O4 == a99Var) {
                    e1d f2 = e.f(w30Var);
                    r7.n0(f2);
                    obj7 = f2;
                }
                r7.s(false);
                r8 = (e1d) obj7;
            } else {
                r7.d0(146406588);
                r7.s(false);
                r8 = w30Var;
            }
            if (z) {
                r7.d0(146499837);
                boolean g3 = r7.g(r8);
                ?? O5 = r7.O();
                w30 w30Var2 = O5;
                if (g3 || O5 == a99Var) {
                    w30 w30Var3 = new w30(12, r8);
                    r7.n0(w30Var3);
                    w30Var2 = w30Var3;
                }
                w30Var = w30Var2;
                r7.s(false);
            } else {
                r7.d0(146571260);
                r7.s(false);
            }
            int i19 = (i7 >> 3) & 14;
            fp1.a(q80Var, dfjVar, sf8Var, list5, r7);
            q80 q80Var3 = (q80) function0.invoke();
            boolean i20 = ((i7 & 896) == 256) | r7.i(r4);
            Object O6 = r7.O();
            if (i20 || O6 == a99Var) {
                i9 = 0;
                bp1 bp1Var = new bp1(r4, function1, i9);
                r7.n0(bp1Var);
                obj = bp1Var;
            } else {
                i9 = 0;
                obj = O6;
            }
            Function1 function13 = w30Var;
            ?? r0 = r7;
            e1d e1dVar = r8;
            ?? r2 = i9;
            xtc I = I(xtcVar, q80Var3, dfjVar, (Function1) obj, i2, z2, i3, i4, sf8Var, list5, function13, null, function12, es0Var);
            if (z) {
                r0.d0(147927697);
                boolean i21 = r0.i(r4);
                Object O7 = r0.O();
                Object obj8 = O7;
                if (i21 || O7 == a99Var) {
                    cp1 cp1Var = new cp1(r4, 1);
                    r0.n0(cp1Var);
                    obj8 = cp1Var;
                }
                Function0 function02 = (Function0) obj8;
                boolean g4 = r0.g(e1dVar);
                Object O8 = r0.O();
                Object obj9 = O8;
                if (g4 || O8 == a99Var) {
                    v30 v30Var = new v30(6, e1dVar);
                    r0.n0(v30Var);
                    obj9 = v30Var;
                }
                q20Var = new q20(1, function02, (Function0) obj9);
                r0.s(r2);
            } else {
                r0.d0(147750935);
                boolean i22 = r0.i(r4);
                Object O9 = r0.O();
                Object obj10 = O9;
                if (i22 || O9 == a99Var) {
                    cp1 cp1Var2 = new cp1(r4, r2 == true ? 1 : 0);
                    r0.n0(cp1Var2);
                    obj10 = cp1Var2;
                }
                q20Var = new rbb((Function0) obj10, r2 == true ? 1 : 0);
                r0.s(r2);
            }
            int hashCode = Long.hashCode(r0.T);
            aee m2 = r0.m();
            xtc C = fqj.C(r0, I);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            r0.h0();
            if (r0.S) {
                r0.l(zg3Var);
            } else {
                r0.q0();
            }
            waa.K(r0, q20Var, hf3.g);
            waa.K(r0, m2, hf3.f);
            waa.K(r0, Integer.valueOf(hashCode), hf3.j);
            waa.J(r0, hf3.k);
            waa.K(r0, C, hf3.d);
            if (r4 == 0) {
                r0.d0(-433557001);
                r0.s(r2);
            } else {
                r0.d0(-291080374);
                r4.a(r2 == true ? 1 : 0, r0);
                r0.s(r2);
                Unit unit = Unit.a;
            }
            if (list6 == null) {
                r0.d0(-433506223);
                r0.s(r2);
                q80Var2 = q80Var;
            } else {
                r0.d0(-433506222);
                q80Var2 = q80Var;
                t80.a(q80Var2, list6, r0, i19);
                Unit unit2 = Unit.a;
                r0.s(r2);
            }
            r0.s(true);
            av8Var = r0;
        } else {
            q80Var2 = q80Var;
            av8 av8Var2 = r7;
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final q80 q80Var4 = q80Var2;
            u.d = new Function2() { // from class: ap1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int K = aba.K(i5 | 1);
                    int K2 = aba.K(i6);
                    iz8.n(xtc.this, q80Var4, function1, z, map, dfjVar, i2, z2, i3, i4, sf8Var, function12, es0Var, (of3) obj11, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(Function0 function0, xtc xtcVar, boolean z, uah uahVar, p72 p72Var, p3e p3eVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        uah uahVar2;
        int i5;
        av8 av8Var;
        p3e p3eVar2;
        xtc xtcVar3;
        boolean z2;
        eqf u;
        uah uahVar3;
        uah uahVar4;
        p3e p3eVar3;
        boolean z3;
        xtc xtcVar4;
        int i6;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
            int i8 = i4 | 384;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    uahVar2 = uahVar;
                    if (av8Var2.g(uahVar2)) {
                        i6 = a.o;
                        i8 |= i6;
                    }
                } else {
                    uahVar2 = uahVar;
                }
                i6 = 1024;
                i8 |= i6;
            } else {
                uahVar2 = uahVar;
            }
            if ((i2 & 24576) == 0) {
                i8 |= av8Var2.g(p72Var) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i8 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i8 |= av8Var2.g(null) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if ((i3 & 64) == 0) {
                i8 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i8 |= av8Var2.g(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i5 = i8 | 113246208;
            if ((805306368 & i2) == 0) {
                i5 |= av8Var2.i(tc3Var) ? 536870912 : 268435456;
            }
            if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378)) {
                av8Var = av8Var2;
                av8Var.W();
                p3eVar2 = p3eVar;
                xtcVar3 = xtcVar2;
                z2 = z;
            } else {
                av8Var2.Y();
                if ((i2 & 1) == 0 || av8Var2.B()) {
                    xtc xtcVar5 = i7 != 0 ? utc.a : xtcVar2;
                    if ((i3 & 8) != 0) {
                        t3e t3eVar = q72.a;
                        uahVar3 = ech.b(a82.a, av8Var2);
                        i5 &= -7169;
                    } else {
                        uahVar3 = uahVar2;
                    }
                    uahVar4 = uahVar3;
                    p3eVar3 = q72.b;
                    z3 = true;
                    xtcVar4 = xtcVar5;
                } else {
                    av8Var2.W();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    z3 = z;
                    p3eVar3 = p3eVar;
                    xtcVar4 = xtcVar2;
                    uahVar4 = uahVar2;
                }
                av8Var2.t();
                av8Var = av8Var2;
                e(function0, xtcVar4, z3, uahVar4, p72Var, null, null, p3eVar3, null, tc3Var, av8Var, i5 & 2147483646, 0);
                xtcVar3 = xtcVar4;
                z2 = z3;
                uahVar2 = uahVar4;
                p3eVar2 = p3eVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x72(function0, xtcVar3, z2, uahVar2, p72Var, p3eVar2, tc3Var, i2, i3);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        int i82 = i4 | 384;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i5 = i82 | 113246208;
        if ((805306368 & i2) == 0) {
        }
        if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void p(gh0 gh0Var, int i2) {
        gh0Var.a = new int[i2];
        gh0Var.b = new Object[i2];
    }

    public static xh2 q(av4 av4Var) {
        uh2 uh2Var = new uh2();
        uh2Var.c = new b1g();
        xh2 xh2Var = new xh2(uh2Var);
        uh2Var.b = xh2Var;
        uh2Var.a = wt3.class;
        try {
            av4Var.n(new i20(8, uh2Var, av4Var));
            uh2Var.a = "Deferred.asListenableFuture";
            return xh2Var;
        } catch (Exception e2) {
            xh2Var.b(e2);
            return xh2Var;
        }
    }

    public static final void r(bu1 bu1Var, long j2) {
        FollowersTextView followersTextView = (FollowersTextView) bu1Var.h;
        followersTextView.setCount(j2);
        long j3 = followersTextView.h - 1;
        if (j3 < 0) {
            j3 = 0;
        }
        followersTextView.h = j3;
        followersTextView.g();
    }

    public static final int s(DisplayMetrics displayMetrics, int i2) {
        displayMetrics.getClass();
        return wzb.b(i2 * displayMetrics.density);
    }

    public static final jfj t(int i2, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new jfj(4, str, Integer.valueOf(i2));
    }

    public static final int u(gh0 gh0Var, Object obj, int i2) {
        int i3 = gh0Var.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int h2 = kik.h(i3, i2, gh0Var.a);
            if (h2 < 0 || Intrinsics.c(obj, gh0Var.b[h2])) {
                return h2;
            }
            int i4 = h2 + 1;
            while (i4 < i3 && gh0Var.a[i4] == i2) {
                if (Intrinsics.c(obj, gh0Var.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = h2 - 1; i5 >= 0 && gh0Var.a[i5] == i2; i5--) {
                if (Intrinsics.c(obj, gh0Var.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            a70.o();
            return 0;
        }
    }

    public static final void v(av8 av8Var, Function2 function2) {
        function2.getClass();
        i5k.e(2, function2);
        function2.invoke(av8Var, 1);
    }

    public static final j67 w(FantasyLeague fantasyLeague) {
        int id = fantasyLeague.getId();
        String name = fantasyLeague.getName();
        String description = fantasyLeague.getDescription();
        String ownerId = fantasyLeague.getOwnerId();
        Integer startRoundId = fantasyLeague.getStartRoundId();
        int intValue = startRoundId != null ? startRoundId.intValue() : 0;
        Integer totalPlayers = fantasyLeague.getTotalPlayers();
        int intValue2 = totalPlayers != null ? totalPlayers.intValue() : 0;
        Long createdAtTimestamp = fantasyLeague.getCreatedAtTimestamp();
        String ownerNickname = fantasyLeague.getOwnerNickname();
        Country country = fantasyLeague.getCountry();
        return new j67(id, name, description, ownerId, intValue, intValue2, ownerNickname, createdAtTimestamp, country != null ? country.getAlpha2() : null, fantasyLeague.getType(), fantasyLeague.getGameType());
    }

    public static final ArrayList x(List list, Function0 function0) {
        und undVar;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            g1c g1cVar = (g1c) list.get(i3);
            Object h2 = g1cVar.h();
            h2.getClass();
            ow9 ow9Var = ((qej) h2).a;
            hej hejVar = (hej) ow9Var.b;
            p80 p80Var = (p80) ow9Var.c;
            aej aejVar = (aej) ((eoh) hejVar.a).getValue();
            int i4 = 7;
            if (aejVar == null) {
                undVar = new und(i2, i2, i4, new z2j(29));
            } else {
                p80 c2 = hej.c(p80Var, aejVar);
                if (c2 == null) {
                    undVar = new und(i2, i2, i4, new eej(i2));
                } else {
                    x6a J = y6a.J(aejVar.j(c2.b, c2.c).e());
                    undVar = new und(J.d(), J.b(), i4, new w1i(J, 19));
                }
            }
            int i5 = undVar.b;
            int i6 = undVar.c;
            arrayList.add(new Pair(g1cVar.J(pco.E(i5, i5, i6, i6)), (Function0) undVar.d));
        }
        return arrayList;
    }

    public static final xtc y(Function1 function1) {
        return new via(function1, null);
    }

    public static final xtc z(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new via(null, function1));
    }
}
