package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lz {
    public static final tc3 d;
    public static final tc3 e;
    public static final q4k h;
    public static final q4k i;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final tc3 c = new tc3(-1571120048, new zc3(), false);
    public static final q4k f = new q4k(new wik(3), new wik(20));
    public static final q4k g = new q4k(new wik(4), new wik(5));
    public static final q4k j = new q4k(new wik(10), new wik(11));
    public static final q4k k = new q4k(new wik(12), new wik(13));
    public static final q4k l = new q4k(new wik(14), new wik(15));
    public static final q4k m = new q4k(new wik(16), new wik(17));
    public static final q4k n = new q4k(new wik(18), new wik(19));

    static {
        int i2 = 8;
        d = new tc3(-1455401925, new gd3(i2), false);
        int i3 = 7;
        e = new tc3(-1408254580, new qd3(i3), false);
        h = new q4k(new wik(6), new wik(i3));
        i = new q4k(new wik(i2), new wik(9));
    }

    public static final boolean A(View view) {
        view.getClass();
        return view.getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable B(z88 z88Var, b98 b98Var, sq3 sq3Var) {
        x98 x98Var;
        int i2;
        fsf fsfVar;
        Throwable th;
        yda ydaVar;
        CancellationException k2;
        if (sq3Var instanceof x98) {
            x98Var = (x98) sq3Var;
            int i3 = x98Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x98Var.t = i3 - Integer.MIN_VALUE;
                Object obj = x98Var.s;
                lu3 lu3Var = lu3.a;
                i2 = x98Var.t;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj);
                    try {
                        b98 nk0Var = new nk0(11, b98Var, g2);
                        x98Var.r = g2;
                        x98Var.t = 1;
                        if (z88Var.collect(nk0Var, x98Var) == lu3Var) {
                            return lu3Var;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fsfVar = g2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = x98Var.r;
                    try {
                        y6a.M(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) fsfVar.a;
                if ((th == null && th.equals(th)) || ((ydaVar = (yda) x98Var.getContext().get(uic.g)) != null && ydaVar.isCancelled() && (k2 = ydaVar.k()) != null && k2.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    de6.a(th, th);
                    throw th;
                }
                de6.a(th, th);
                throw th;
            }
        }
        x98Var = new x98(sq3Var);
        Object obj2 = x98Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = x98Var.t;
        if (i2 != 0) {
        }
        th = (Throwable) fsfVar.a;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    public static final byte C(char c2) {
        if (c2 < '~') {
            return yo2.b[c2];
        }
        return (byte) 0;
    }

    public static final long D(int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        Resources resources = (Resources) av8Var.k(nz.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = z1g.a;
        return hkg.b(resources.getColor(i2, theme));
    }

    public static final boolean E(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float F(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final xtc G(xtc xtcVar, ce8 ce8Var) {
        return xtcVar.z(new de8(ce8Var));
    }

    public static int H(nm2 nm2Var) {
        int i2 = nm2Var.i(4);
        if (i2 == 15) {
            if (nm2Var.b() >= 24) {
                return nm2Var.i(24);
            }
            throw s9e.a(null, "AAC header insufficient data");
        }
        if (i2 < 13) {
            return a[i2];
        }
        throw s9e.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static boolean I(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || !(i2 == 26 || i2 == 27)) {
            return i3 >= 33 && i2 == 30;
        }
        return true;
    }

    public static final xtc J(xtc xtcVar, e9d e9dVar, h9d h9dVar) {
        return xtcVar.z(new i9d(e9dVar, h9dVar));
    }

    public static d0 K(nm2 nm2Var, boolean z) {
        int i2 = nm2Var.i(5);
        if (i2 == 31) {
            i2 = nm2Var.i(6) + 32;
        }
        int H = H(nm2Var);
        int i3 = nm2Var.i(4);
        String j2 = ljg.j(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            H = H(nm2Var);
            int i4 = nm2Var.i(5);
            if (i4 == 31) {
                i4 = nm2Var.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = nm2Var.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw s9e.c("Unsupported audio object type: " + i2);
                }
            }
            if (nm2Var.h()) {
                tgj.d0("Unexpected frameLengthFlag = 1");
            }
            if (nm2Var.h()) {
                nm2Var.t(14);
            }
            boolean h2 = nm2Var.h();
            if (i3 == 0) {
                a70.i();
                return null;
            }
            if (i2 == 6 || i2 == 20) {
                nm2Var.t(3);
            }
            if (h2) {
                if (i2 == 22) {
                    nm2Var.t(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    nm2Var.t(3);
                }
                nm2Var.t(1);
            }
            switch (i2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i5 = nm2Var.i(2);
                    if (i5 == 2 || i5 == 3) {
                        throw s9e.c("Unsupported epConfig: " + i5);
                    }
            }
        }
        int i6 = b[i3];
        if (i6 != -1) {
            return new d0(H, i6, j2);
        }
        throw s9e.a(null, null);
    }

    public static final void L(float[] fArr, float[] fArr2) {
        float F = F(fArr2, 0, fArr, 0);
        float F2 = F(fArr2, 0, fArr, 1);
        float F3 = F(fArr2, 0, fArr, 2);
        float F4 = F(fArr2, 0, fArr, 3);
        float F5 = F(fArr2, 1, fArr, 0);
        float F6 = F(fArr2, 1, fArr, 1);
        float F7 = F(fArr2, 1, fArr, 2);
        float F8 = F(fArr2, 1, fArr, 3);
        float F9 = F(fArr2, 2, fArr, 0);
        float F10 = F(fArr2, 2, fArr, 1);
        float F11 = F(fArr2, 2, fArr, 2);
        float F12 = F(fArr2, 2, fArr, 3);
        float F13 = F(fArr2, 3, fArr, 0);
        float F14 = F(fArr2, 3, fArr, 1);
        float F15 = F(fArr2, 3, fArr, 2);
        float F16 = F(fArr2, 3, fArr, 3);
        fArr[0] = F;
        fArr[1] = F2;
        fArr[2] = F3;
        fArr[3] = F4;
        fArr[4] = F5;
        fArr[5] = F6;
        fArr[6] = F7;
        fArr[7] = F8;
        fArr[8] = F9;
        fArr[9] = F10;
        fArr[10] = F11;
        fArr[11] = F12;
        fArr[12] = F13;
        fArr[13] = F14;
        fArr[14] = F15;
        fArr[15] = F16;
    }

    public static void M(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            y9.o(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            y9.o(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            N(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            N(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            N(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int min = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int min2 = Math.min(i5, i9 - min);
        int i10 = i5 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + min) - 1))) {
            min--;
        }
        int i11 = min2 + i8;
        N(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i3, min + i3)) : charSequence.subSequence(i10, i11 + min + i10), min2, i11);
    }

    public static void N(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final boolean O(vvk vvkVar, vvk vvkVar2, sfb sfbVar) {
        vvkVar.getClass();
        if (vvkVar2 == null || ((vvkVar2 instanceof uvk) && (vvkVar instanceof tvk))) {
            return true;
        }
        if ((vvkVar instanceof uvk) && (vvkVar2 instanceof tvk)) {
            return false;
        }
        return (vvkVar.c == vvkVar2.c && vvkVar.d == vvkVar2.d && vvkVar2.a(sfbVar) <= vvkVar.a(sfbVar)) ? false : true;
    }

    public static final Shader.TileMode P(int i2) {
        return i2 == 0 ? Shader.TileMode.CLAMP : i2 == 1 ? Shader.TileMode.REPEAT : i2 == 2 ? Shader.TileMode.MIRROR : i2 == 3 ? Build.VERSION.SDK_INT >= 31 ? qz.m() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static kxe Q(int i2, Player player, Integer num, boolean z, boolean z2, boolean z3) {
        String alpha2;
        String iso3Alpha;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        boolean z5 = z3;
        player.getClass();
        int id = player.getId();
        String jerseyNumber = player.getJerseyNumber();
        String o2 = jerseyNumber != null ? lnb.o(jerseyNumber, " ", tba.t(player)) : null;
        if (!z) {
            o2 = null;
        }
        if (o2 == null) {
            o2 = tba.t(player);
        }
        String str = o2;
        ArrayList arrayList = dv3.a;
        Country country = player.getCountry();
        com.sofascore.model.Country a2 = dv3.a(country != null ? country.getAlpha2() : null);
        String str2 = (a2 == null || (iso3Alpha = a2.getIso3Alpha()) == null) ? "" : iso3Alpha;
        Country country2 = player.getCountry();
        return new kxe(id, str, str2, (country2 == null || (alpha2 = country2.getAlpha2()) == null) ? "" : alpha2, z4, num2, z5);
    }

    public static final String R(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final void a(int i2, int i3, of3 of3Var, gv9 gv9Var, Function1 function1) {
        Function1 function12;
        int i4;
        Function1 function13;
        Function1 function14;
        int i5;
        utc utcVar;
        boolean z;
        lv1 lv1Var = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(709405578);
        int i6 = i2 | (av8Var.g(gv9Var) ? 4 : 2);
        int i7 = i3 & 2;
        int i8 = 48;
        if (i7 != 0) {
            i4 = i6 | 48;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i6 | (av8Var.i(function12) ? 32 : 16);
        }
        boolean z2 = true;
        boolean z3 = false;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            if (i7 != 0) {
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = new vqg(27);
                    av8Var.n0(O);
                }
                function14 = (Function1) O;
            } else {
                function14 = function12;
            }
            float f2 = 4.0f;
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var, utcVar2);
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
            Iterator p2 = ljg.p(av8Var, C, hf3.d, 564090042, gv9Var);
            int i9 = 0;
            while (p2.hasNext()) {
                Object next = p2.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    b.q();
                    throw null;
                }
                lmi lmiVar = (lmi) next;
                int i11 = lmiVar.b;
                vv3 vv3Var = lmiVar.a;
                if (i11 < 0) {
                    av8Var.d0(-304496181);
                    i5 = vv3Var.c;
                } else {
                    av8Var.d0(-304494839);
                    i5 = vv3Var.d;
                }
                String v = oea.v(i5, av8Var);
                av8Var.s(z3);
                xtc xtcVar = (xtc) function14.invoke(Integer.valueOf(i9));
                l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, i8);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, xtcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                yf8 yf8Var = xth.a;
                int i12 = i9;
                Function1 function15 = function14;
                av8 av8Var2 = av8Var;
                float f3 = f2;
                boolean z4 = z2;
                utc utcVar3 = utcVar2;
                lv1 lv1Var2 = lv1Var;
                udj.c(v, null, D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                if (i12 < gv9Var.size() - 1) {
                    utcVar = utcVar3;
                    ljg.r(f3, 1863375931, av8Var, av8Var, utcVar);
                    z = false;
                    e12.a(0, av8Var, bkh.l(n9e.q(utcVar, D(R.color.on_color_secondary, av8Var), oyn.e), 2.0f));
                    av8Var.s(false);
                } else {
                    utcVar = utcVar3;
                    z = false;
                    av8Var.d0(1863656543);
                    av8Var.s(false);
                }
                av8Var.s(z4);
                z2 = z4;
                f2 = f3;
                utcVar2 = utcVar;
                z3 = z;
                i9 = i10;
                lv1Var = lv1Var2;
                i8 = 48;
                function14 = function15;
            }
            function13 = function14;
            av8Var.s(z3);
            av8Var.s(z2);
        } else {
            av8Var.W();
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gzg(gv9Var, function13, i2, i3, 0);
        }
    }

    public static final void b(Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1670789820);
        int i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        int i4 = 0;
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            haa.f(yqo.H(-1008607553, av8Var, new f91(i4, function0)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i2, i5, function0);
        }
    }

    public static final void c(vy8 vy8Var, ho hoVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1959221577);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var.g(vy8Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(hoVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i5 != 0) {
                vy8Var = ty8.a;
            }
            d12 d12Var = d12.b;
            av8Var.e0(578571862);
            int i6 = i4 & 896;
            av8Var.e0(-548224868);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(d12Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, f50.v);
            waa.K(av8Var, hoVar, f50.w);
            tc3Var.invoke(av8Var, Integer.valueOf((i6 >> 6) & 14));
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        vy8 vy8Var2 = vy8Var;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e50(vy8Var2, hoVar, tc3Var, i2, i3);
        }
    }

    public static final void d(int i2, of3 of3Var, xtc xtcVar, Function1 function1) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            nq8.h(av8Var, td4.X(xtcVar, function1));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(xtcVar, (Object) function1, i2, 5);
        }
    }

    public static final void e(tbj tbjVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(tbjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            o02.f(tbjVar, tc3Var, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v43(tbjVar, tc3Var, i2, i4);
        }
    }

    public static final void f(lcj lcjVar, boolean z, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-579239002);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(lcjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            o02.g(lcjVar, z, tc3Var, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u43(lcjVar, z, tc3Var, i2, 1);
        }
    }

    public static final void g(int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1263388244);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc b0 = l98.b0(xtcVar.z(bkh.c), 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            n7g a3 = o7g.a(16.0f);
            utc utcVar = utc.a;
            n(wnn.A(utcVar, a3), 0, null, pd0.f, av8Var, 3072);
            n(wnn.A(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), o7g.a(16.0f)), 0, null, pd0.g, av8Var, 3072);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(xtcVar, i2, 5);
        }
    }

    public static final void h(ra7 ra7Var, pb7 pb7Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1788302035);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(ra7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(pb7Var) : av8Var.i(pb7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function13 = function1;
            i3 |= av8Var.i(function13) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function13 = function1;
        }
        if ((i2 & 3072) == 0) {
            function14 = function12;
            i3 |= av8Var.i(function14) ? a.o : 1024;
        } else {
            function14 = function12;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            wd8 wd8Var = (wd8) av8Var.k(dh3.i);
            e1d G = i2a.G(av8Var);
            Boolean bool = (Boolean) G.getValue();
            bool.getClass();
            boolean g2 = av8Var.g(G) | av8Var.i(wd8Var);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new qa7(wd8Var, G, null, i4);
                av8Var.n0(O);
            }
            hz8.o(av8Var, bool, (Function2) O);
            wkn.a(ra7Var.a, n9e.q(xtcVar, D(R.color.surface_1, av8Var), oyn.e), null, null, yqo.H(367162952, av8Var, new er6(function14, (Object) ra7Var, function13, (Object) pb7Var, 4)), av8Var, 24576, 12);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(ra7Var, pb7Var, function1, function12, xtcVar, i2, 4);
        }
    }

    public static final void i(ta7 ta7Var, wb7 wb7Var, Function1 function1, Function1 function12, Function1 function13, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        Object obj;
        e1d e1dVar;
        int i4;
        wb7 wb7Var2;
        ta7Var.getClass();
        wb7Var.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1093692068);
        int i5 = i2 | (av8Var.i(ta7Var) ? 4 : 2) | (av8Var.i(wb7Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? 2048 : 1024) | (av8Var.i(function13) ? 16384 : 8192) | (av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i6 = 1;
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            e1d x = rfo.x(ta7Var.i, av8Var, 0);
            e1d x2 = rfo.x(wb7Var.k, av8Var, 0);
            hof hofVar = wb7Var.m;
            boolean i7 = ((i5 & 7168) == 2048) | ((i5 & 57344) == 16384) | av8Var.i(wb7Var);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (i7 || O == obj2) {
                O = new dr6(8, wb7Var, function13, function12);
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            boolean z = ((pb7) x2.getValue()).r;
            Object O2 = av8Var.O();
            if (O2 == obj2) {
                O2 = new m97(i6);
                av8Var.n0(O2);
            }
            un0.f(z, (Function0) O2, false, false, gvd.b, av8Var, 25008, 8);
            boolean z2 = ((pb7) x2.getValue()).t != null;
            boolean i8 = av8Var.i(wb7Var);
            Object O3 = av8Var.O();
            if (i8 || O3 == obj2) {
                i3 = 1;
                obj = obj2;
                e1dVar = x;
                i4 = i5;
                av6 av6Var = new av6(0, wb7Var, wb7.class, "dismissCreateTeamError", "dismissCreateTeamError()V", 0, 15);
                wb7Var2 = wb7Var;
                av8Var.n0(av6Var);
                O3 = av6Var;
            } else {
                wb7Var2 = wb7Var;
                i4 = i5;
                e1dVar = x;
                obj = obj2;
                i3 = 1;
            }
            Function0 function0 = (Function0) ((KFunction) O3);
            tc3 H = yqo.H(-1903369598, av8Var, new n97(i3, wb7Var2, x2));
            wb7 wb7Var3 = wb7Var2;
            av8Var = av8Var;
            un0.f(z2, function0, false, false, H, av8Var, 24576, 12);
            ra7 ra7Var = (ra7) e1dVar.getValue();
            pb7 pb7Var = (pb7) x2.getValue();
            boolean i9 = av8Var.i(ta7Var) | av8Var.i(wb7Var3) | av8Var.g(e1dVar);
            Object O4 = av8Var.O();
            if (i9 || O4 == obj) {
                O4 = new dr6(9, ta7Var, wb7Var3, e1dVar);
                av8Var.n0(O4);
            }
            h(ra7Var, pb7Var, function1, (Function1) O4, xtcVar, av8Var, (i4 & 896) | ((i4 >> 3) & 57344));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(ta7Var, wb7Var, function1, function12, function13, xtcVar, i2, 5);
        }
    }

    public static final void j(kj7 kj7Var, boolean z, Function0 function0, boolean z2, xtc xtcVar, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1385878232);
        int i3 = i2 | (av8Var.g(kj7Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            cdi b2 = a60.b(z ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(250, 0, null, 6), "expand_arrow_rotation_animation", av8Var, 3120, 20);
            boolean z3 = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new ve7(3, function0);
                av8Var.n0(O);
            }
            xtc y = tol.y(xtcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            av8Var = av8Var;
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
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
            gvd.j(kj7Var, null, z2, new goa(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48 | (i3 & 14) | ((i3 >> 3) & 896), 16);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            kq9.a(haa.t(R.drawable.ic_chevron_down, 0, av8Var), null, haa.v(bkh.l(utcVar, 24.0f), ((Number) b2.getValue()).floatValue()), D(R.color.primary_default, av8Var), av8Var, 56, 0);
            bf3.u(utcVar, 8.0f, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(kj7Var, z, function0, z2, xtcVar, i2);
        }
    }

    public static final void k(xtc xtcVar, String str, tc3 tc3Var, Function2 function2, of3 of3Var, int i2) {
        tc3 tc3Var2;
        Function2 function22;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1882794728);
        int i3 = i2 | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, (i3 >> 3) & 14, 0, 131066);
            av8Var = av8Var;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            xtc e2 = bkh.e(utcVar, 64.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            tc3Var2 = tc3Var;
            tc3Var2.invoke(av8Var, 6);
            bf3.t(av8Var, true, utcVar, 8.0f, av8Var);
            xtc b2 = bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 1);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            function22 = function2;
            function22.invoke(av8Var, 6);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            tc3Var2 = tc3Var;
            function22 = function2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(xtcVar, str, tc3Var2, function22, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static final void l(e9i e9iVar, pmi pmiVar, of3 of3Var, int i2) {
        int i3;
        e9i e9iVar2;
        ?? r9;
        pmi pmiVar2 = pmiVar;
        ehk ehkVar = pmiVar2.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1339551452);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(pmiVar2) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            gv9 gv9Var = pmiVar2.b;
            d7e t = haa.t(ehkVar.c, 0, av8Var);
            utc utcVar = utc.a;
            int i4 = i3;
            wkn.k(t, null, bkh.c(bkh.d(utcVar, 1.0f), 0.4f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            kg0 kg0Var = ww9.f;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a3 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            String v = oea.v(ehkVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 109562);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            gv9 W = l6g.W(CollectionsKt.L0(gv9Var, 3));
            gv9 W2 = l6g.W(CollectionsKt.M0(2, gv9Var));
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                r9 = 0;
                e9iVar2 = e9iVar;
                O = new hzg(e9iVar2, 0 == true ? 1 : 0);
                av8Var.n0(O);
            } else {
                r9 = 0;
                e9iVar2 = e9iVar;
            }
            a(r9, r9, av8Var, W, (Function1) O);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            int size = (W.size() * 150) + 1000;
            boolean e2 = (i5 == 4 ? true : r9) | av8Var.e(size);
            Object O2 = av8Var.O();
            int i6 = 9;
            if (e2 || O2 == a99Var) {
                O2 = new tj(e9iVar2, size, i6);
                av8Var.n0(O2);
            }
            a(r9, r9, av8Var, W2, (Function1) O2);
            bf3.t(av8Var, true, utcVar, 34.0f, av8Var);
            float a4 = e9iVar2.a(2500, TTAdConstant.STYLE_SIZE_RADIO_3_2);
            float f2 = (a4 * 0.1f) + 0.9f;
            float a5 = e9iVar2.a(3500, TTAdConstant.STYLE_SIZE_RADIO_3_2);
            float f3 = (0.1f * a5) + 0.9f;
            boolean d3 = av8Var.d(a4) | av8Var.d(f2);
            Object O3 = av8Var.O();
            if (d3 || O3 == a99Var) {
                O3 = new n28(i6, a4, f2);
                av8Var.n0(O3);
            }
            xtc M = s02.M(utcVar, (Function1) O3);
            boolean d4 = av8Var.d(a5) | av8Var.d(f3);
            Object O4 = av8Var.O();
            if (d4 || O4 == a99Var) {
                O4 = new n28(10, a5, f3);
                av8Var.n0(O4);
            }
            pmiVar2 = pmiVar;
            p(pmiVar2, M, s02.M(utcVar, (Function1) O4), av8Var, (i4 >> 3) & 14, 0);
            nq8.h(av8Var, new goa(1.0f, true));
            av8Var.s(true);
        } else {
            e9iVar2 = e9iVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar2, pmiVar2, i2, 22);
        }
    }

    public static final void m(v23 v23Var, pmi pmiVar, of3 of3Var, int i2) {
        int i3;
        ehk ehkVar = pmiVar.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(427888831);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(pmiVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            gv9 gv9Var = pmiVar.b;
            d7e t = haa.t(ehkVar.c, 0, av8Var);
            utc utcVar = utc.a;
            int i4 = i3;
            wkn.k(t, null, bkh.c(bkh.d(utcVar, 1.0f), 0.3f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
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
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            String v = oea.v(ehkVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 109562);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            a(0, 2, av8Var, l6g.W(CollectionsKt.L0(gv9Var, 3)), null);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            a(0, 2, av8Var, l6g.W(CollectionsKt.L0(CollectionsKt.B0(gv9Var), 2)), null);
            bf3.t(av8Var, true, utcVar, 34.0f, av8Var);
            p(pmiVar, null, null, av8Var, (i4 >> 3) & 14, 6);
            nq8.h(av8Var, v23Var.a(1.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, pmiVar, i2, 21);
        }
    }

    public static final void n(xtc xtcVar, int i2, List list, tc3 tc3Var, of3 of3Var, int i3) {
        int i4;
        List list2;
        List j2;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(392067726);
        int i6 = i3 | (av8Var.g(xtcVar) ? 4 : 2) | 176;
        if (av8Var.T(i6 & 1, (i6 & 1171) != 1170)) {
            av8Var.Y();
            if ((i3 & 1) == 0 || av8Var.B()) {
                long j3 = r13.h;
                j2 = b.j(new r13(j3), new r13(D(R.color.n_lv_5, av8Var)), new r13(j3));
                i5 = 1500;
            } else {
                av8Var.W();
                i5 = i2;
                j2 = list;
            }
            av8Var.t();
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(new c7a(0L));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            h2a F = i2a.F("shimmer", av8Var, 0);
            ff5 ff5Var = dh3.h;
            f2a q2 = i2a.q(F, -((int) (((c7a) e1dVar.getValue()).a >> 32)), ((int) (((c7a) e1dVar.getValue()).a >> 32)) * 2.0f, s02.P(s02.h0(i5, 0, jg5.d, 2), null, 0L, 6), "translateAnim", av8Var, 28680, 0);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new w30(15, e1dVar);
                av8Var.n0(O2);
            }
            xtc A = un0.A(xtcVar, (Function1) O2);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, A);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            n12 n12Var = n12.a;
            tc3Var.invoke(n12Var, av8Var, 54);
            av8Var = av8Var;
            e12.a(0, av8Var, n9e.p(n12Var.b(utc.a), new v7b(j2, null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(((Number) ((eoh) q2.d).getValue()).floatValue() - 200.0f) << 32), (Float.floatToRawIntBits(((Number) ((eoh) q2.d).getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(300.0f) & 4294967295L)), null, 6));
            av8Var.s(true);
            i4 = i5;
            list2 = j2;
        } else {
            av8Var.W();
            i4 = i2;
            list2 = list;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(list2, xtcVar, tc3Var, i4, i3, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final int i2, final int i3, final Integer num, final Integer num2, final boolean z, xtc xtcVar, long j2, long j3, boolean z2, of3 of3Var, final int i4, final int i5) {
        int i6;
        long j4;
        long j5;
        final long j6;
        final long j7;
        final boolean z3;
        eqf u;
        int i7;
        xtc xtcVar2;
        boolean z4;
        boolean z5;
        boolean z6;
        long j8;
        int i8;
        utc utcVar;
        boolean z7;
        boolean z8;
        int i9;
        int i10;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-767730612);
        if ((i4 & 6) == 0) {
            i6 = (av8Var.e(i2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= av8Var.e(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= av8Var.g(num2) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= av8Var.h(z) ? 16384 : 8192;
        }
        int i11 = i6 | 196608;
        if ((1572864 & i4) == 0) {
            if ((i5 & 64) == 0) {
                j4 = j2;
                if (av8Var.f(j4)) {
                    i10 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i11 |= i10;
                }
            } else {
                j4 = j2;
            }
            i10 = 524288;
            i11 |= i10;
        } else {
            j4 = j2;
        }
        if ((12582912 & i4) == 0) {
            if ((i5 & 128) == 0) {
                j5 = j3;
                if (av8Var.f(j5)) {
                    i9 = 8388608;
                    i11 |= i9;
                }
            } else {
                j5 = j3;
            }
            i9 = 4194304;
            i11 |= i9;
        } else {
            j5 = j3;
        }
        int i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i12 != 0) {
            i11 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            i11 |= av8Var.h(z2) ? 67108864 : 33554432;
            if (av8Var.T(i11 & 1, (i11 & 38347923) == 38347922)) {
                av8Var.W();
                j6 = j4;
                j7 = j5;
                z3 = z2;
            } else {
                av8Var.Y();
                int i13 = i4 & 1;
                utc utcVar2 = utc.a;
                if (i13 == 0 || av8Var.B()) {
                    if ((i5 & 64) != 0) {
                        j4 = D(R.color.n_lv_1, av8Var);
                        i11 &= -3670017;
                    }
                    if ((i5 & 128) != 0) {
                        j5 = D(R.color.live, av8Var);
                        i11 &= -29360129;
                    }
                    i7 = i11;
                    xtcVar2 = utcVar2;
                    if (i12 != 0) {
                        z4 = false;
                        av8Var.t();
                        long j9 = !z ? j5 : j4;
                        z5 = num == null && num2 != null;
                        lv1 lv1Var = uxf.m;
                        z6 = z4;
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        xtc d0 = l98.d0(n9e.q(bkh.g(xtcVar2, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D(R.color.surface_P, av8Var), o7g.a(4.0f)), !z6 ? 8.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C = fqj.C(av8Var, d0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        xtcVar = xtcVar2;
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C, f50Var3);
                        if (z6) {
                            j8 = j4;
                            av8Var.d0(-905066532);
                            utcVar = utcVar2;
                            td4.u(i2, (i7 & 14) | 48, av8Var, bkh.l(utcVar, 16.0f));
                            i8 = 0;
                            av8Var.s(false);
                        } else {
                            j8 = j4;
                            i8 = 0;
                            utcVar = utcVar2;
                            av8Var.d0(-904976198);
                            av8Var.s(false);
                        }
                        l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, i8);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, utcVar);
                        av8Var.h0();
                        long j10 = j5;
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a3, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        if (z5) {
                            z7 = false;
                            z8 = true;
                            av8Var.d0(-1385621026);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-1385871847);
                            String valueOf2 = String.valueOf(num.intValue());
                            yf8 yf8Var = xth.a;
                            z7 = false;
                            z8 = true;
                            udj.c(valueOf2, null, j9, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
                            bf3.u(utcVar, 2.0f, av8Var, false);
                        }
                        yf8 yf8Var2 = xth.a;
                        udj.c("-", null, j9, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 6, 0, 131066);
                        if (z5) {
                            av8Var.d0(-1385186530);
                            av8Var.s(z7);
                        } else {
                            ljg.r(2.0f, -1385438312, av8Var, av8Var, utcVar);
                            udj.c(String.valueOf(num2.intValue()), null, j9, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
                            av8Var.s(z7);
                        }
                        av8Var.s(z8);
                        if (z6) {
                            av8Var.d0(-904195525);
                            td4.u(i3, ((i7 >> 3) & 14) | 48, av8Var, bkh.l(utcVar, 16.0f));
                            av8Var.s(z7);
                        } else {
                            av8Var.d0(-904104230);
                            av8Var.s(z7);
                        }
                        av8Var.s(z8);
                        z3 = z6;
                        j6 = j8;
                        j7 = j10;
                    }
                } else {
                    av8Var.W();
                    if ((i5 & 64) != 0) {
                        i11 &= -3670017;
                    }
                    if ((i5 & 128) != 0) {
                        i11 &= -29360129;
                    }
                    xtcVar2 = xtcVar;
                    i7 = i11;
                }
                z4 = z2;
                av8Var.t();
                if (!z) {
                }
                if (num == null) {
                }
                lv1 lv1Var2 = uxf.m;
                z6 = z4;
                ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                xtc d02 = l98.d0(n9e.q(bkh.g(xtcVar2, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D(R.color.surface_P, av8Var), o7g.a(4.0f)), !z6 ? 8.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                l8g a22 = k8g.a(ng0Var2, lv1Var2, av8Var, 54);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C3 = fqj.C(av8Var, d02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var, a22, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var, m22, ff3Var2);
                Integer valueOf3 = Integer.valueOf(hashCode3);
                f50 f50Var22 = hf3.j;
                waa.K(av8Var, valueOf3, f50Var22);
                ry ryVar2 = hf3.k;
                waa.J(av8Var, ryVar2);
                xtcVar = xtcVar2;
                f50 f50Var32 = hf3.d;
                waa.K(av8Var, C3, f50Var32);
                if (z6) {
                }
                l8g a32 = k8g.a(ww9.b, uxf.l, av8Var, i8);
                int hashCode22 = Long.hashCode(av8Var.T);
                aee m32 = av8Var.m();
                xtc C22 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                long j102 = j5;
                if (av8Var.S) {
                }
                waa.K(av8Var, a32, f50Var4);
                waa.K(av8Var, m32, ff3Var2);
                bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C22, f50Var32);
                if (z5) {
                }
                yf8 yf8Var22 = xth.a;
                udj.c("-", null, j9, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 6, 0, 131066);
                if (z5) {
                }
                av8Var.s(z8);
                if (z6) {
                }
                av8Var.s(z8);
                z3 = z6;
                j6 = j8;
                j7 = j102;
            }
            final xtc xtcVar3 = xtcVar;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: sv5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int K = aba.K(i4 | 1);
                        lz.o(i2, i3, num, num2, z, xtcVar3, j6, j7, z3, (of3) obj, K, i5);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        if (av8Var.T(i11 & 1, (i11 & 38347923) == 38347922)) {
        }
        final xtc xtcVar32 = xtcVar;
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(pmi pmiVar, xtc xtcVar, xtc xtcVar2, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar3;
        int i5;
        xtc xtcVar4;
        xtc xtcVar5;
        xtc xtcVar6;
        eqf u;
        pmi pmiVar2 = pmiVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1840325585);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(pmiVar2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar3 = xtcVar;
            i4 |= av8Var.g(xtcVar3) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                xtcVar4 = xtcVar2;
                i4 |= av8Var.g(xtcVar4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
                    utc utcVar = utc.a;
                    if (i6 != 0) {
                        xtcVar3 = utcVar;
                    }
                    xtc xtcVar7 = i5 != 0 ? utcVar : xtcVar4;
                    Context context = (Context) av8Var.k(nz.b);
                    xtc d2 = bkh.d(xtcVar3, 1.0f);
                    lv1 lv1Var = uxf.l;
                    wxf wxfVar = ww9.b;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    p8g p8gVar = p8g.a;
                    xtc xtcVar8 = xtcVar3;
                    xtc a3 = p8gVar.a(1.0f, utcVar, true);
                    String v = oea.v(R.string.season_25_summary_top_team, av8Var);
                    Locale locale = Locale.ROOT;
                    String upperCase = v.toUpperCase(locale);
                    upperCase.getClass();
                    k(a3, upperCase, yqo.H(2128316517, av8Var, new fvg(pmiVar2, 5)), yqo.H(1091306116, av8Var, new gme(28, pmiVar2, context)), av8Var, 3456);
                    PlayerOrTeam playerOrTeam = pmiVar2.d;
                    Gender gender = null;
                    if (playerOrTeam.getPlayer() != null) {
                        Player player = playerOrTeam.getPlayer();
                        if (player != null) {
                            gender = player.getGender();
                        }
                    } else {
                        Team team = playerOrTeam.getTeam();
                        if (team != null) {
                            gender = team.getGender();
                        }
                    }
                    Player player2 = playerOrTeam.getPlayer();
                    Team team2 = playerOrTeam.getTeam();
                    xtc a4 = p8gVar.a(1.0f, utcVar, true);
                    String upperCase2 = new n9k(R.string.season_25_summary_top_player, gender).a(av8Var).toUpperCase(locale);
                    upperCase2.getClass();
                    k(a4, upperCase2, yqo.H(1759718286, av8Var, new gme(29, player2, team2)), yqo.H(1625135597, av8Var, new wbc(27, player2, team2, context)), av8Var, 3456);
                    bf3.t(av8Var, true, utcVar, 36.0f, av8Var);
                    xtc Y = fz8.Y(bkh.d(xtcVar7, 1.0f), n9a.a);
                    l8g a5 = k8g.a(wxfVar, uxf.m, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, Y);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a5, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    xtc a6 = p8gVar.a(1.0f, utcVar, true);
                    kv1 kv1Var = uxf.p;
                    p4h p4hVar = ww9.d;
                    xtc xtcVar9 = xtcVar7;
                    u23 a7 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, a6);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a7, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    String upperCase3 = oea.v(R.string.season_25_summary_events_viewed, av8Var).toUpperCase(locale);
                    upperCase3.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase3, null, D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    List list = dla.a;
                    udj.c(dla.i(Integer.valueOf(pmiVar2.e)), null, D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                    av8Var.s(true);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, D(R.color.on_color_highlight_1, av8Var), 0L, av8Var, bkh.c(utcVar, 1.0f));
                    xtc a8 = p8gVar.a(1.0f, utcVar, true);
                    u23 a9 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode4 = Long.hashCode(av8Var.T);
                    aee m5 = av8Var.m();
                    xtc C4 = fqj.C(av8Var, a8);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a9, f50Var);
                    waa.K(av8Var, m5, ff3Var);
                    bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C4, f50Var3);
                    String upperCase4 = oea.v(R.string.season_25_summary_top_sport, av8Var).toUpperCase(locale);
                    upperCase4.getClass();
                    udj.c(upperCase4, null, D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    pmiVar2 = pmiVar;
                    udj.c(wyh.c(context, pmiVar2.f.getSlug()), null, D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(true);
                    xtcVar5 = xtcVar8;
                    xtcVar6 = xtcVar9;
                } else {
                    av8Var.W();
                    xtcVar5 = xtcVar3;
                    xtcVar6 = xtcVar4;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new r22((Object) pmiVar2, xtcVar5, (Object) xtcVar6, i2, i3, 11);
                    return;
                }
                return;
            }
            xtcVar4 = xtcVar2;
            if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar3 = xtcVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        xtcVar4 = xtcVar2;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final d5m q(RecyclerView recyclerView, vxm vxmVar) {
        fsf fsfVar = new fsf();
        asf asfVar = new asf();
        hzm hzmVar = new hzm(asfVar, vxmVar, fsfVar);
        fsfVar.a = hzmVar;
        recyclerView.addOnLayoutChangeListener(hzmVar);
        return new d5m(new l97(8, asfVar, fsfVar, recyclerView));
    }

    public static final Object r(View view, int i2, float f2, float f3, long j2, Interpolator interpolator, Function0 function0, Function0 function02, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        view.setVisibility(0);
        view.setAlpha(f2);
        ViewPropertyAnimator interpolator2 = view.animate().alpha(f3).setDuration(j2).setInterpolator(interpolator);
        interpolator2.getClass();
        asf asfVar = new asf();
        d5m d5mVar = new d5m(new i1n(asfVar, view, i2, interpolator2, function02, lj2Var));
        interpolator2.setListener(new h0n(asfVar, lj2Var, view, i2, function0, d5mVar));
        lj2Var.v(new v0n(d5mVar));
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new p(view, d5mVar));
        } else {
            d5mVar.a();
        }
        Object q2 = lj2Var.q();
        return q2 == lu3.a ? q2 : Unit.a;
    }

    public static final void s(View view) {
        view.getClass();
        i01 i01Var = new i01(2, view);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, i01Var);
    }

    public static final void t(View view, float f2, float f3, long j2) {
        view.getClass();
        view.animate().setDuration(j2).scaleX(f2).scaleY(f3).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new wt8(view, j2, 0)).start();
    }

    public static final void u(View view, float f2, long j2) {
        view.getClass();
        view.animate().setDuration(j2).translationY(f2).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new wt8(view, j2, 1)).start();
    }

    public static final void v(View view, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i2);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void w(View view, int i2, int i3, final int i4, final Function1 function1, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function2 function2, final Function0 function05, final Function0 function06, final Function0 function07, final Function0 function08, final Function0 function09) {
        view.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function2.getClass();
        function05.getClass();
        function06.getClass();
        function07.getClass();
        function08.getClass();
        function09.getClass();
        Context context = view.getContext();
        context.getClass();
        final int a2 = evl.a(context, i2);
        Context context2 = view.getContext();
        context2.getClass();
        final float a3 = evl.a(context2, i3);
        final boolean z = i2 > 0;
        final boolean z2 = i3 > 0;
        final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        final long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        final fsf fsfVar = new fsf();
        fsfVar.a = sl9.IDLE;
        final fsf fsfVar2 = new fsf();
        final fsf fsfVar3 = new fsf();
        final fsf fsfVar4 = new fsf();
        final fsf fsfVar5 = new fsf();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: zt8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean z3;
                boolean z4 = z2;
                fsf fsfVar6 = fsfVar5;
                if (z4) {
                    Object obj = fsfVar6.a;
                    if (obj == null) {
                        obj = VelocityTracker.obtain();
                        fsfVar6.a = obj;
                    }
                    VelocityTracker velocityTracker = (VelocityTracker) obj;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                }
                int action = motionEvent.getAction();
                fsf fsfVar7 = fsfVar2;
                fsf fsfVar8 = fsfVar3;
                fsf fsfVar9 = fsfVar;
                fsf fsfVar10 = fsfVar4;
                if (action == 0) {
                    fsfVar7.a = Float.valueOf(motionEvent.getRawY());
                    fsfVar8.a = Float.valueOf(motionEvent.getRawX());
                    fsfVar9.a = sl9.IDLE;
                    function07.invoke();
                    yq5 yq5Var = new yq5(6, fsfVar9, function0);
                    fsfVar10.a = yq5Var;
                    view2.postDelayed(yq5Var, longPressTimeout);
                    return true;
                }
                int i5 = scaledTouchSlop;
                float f2 = a3;
                Function0 function010 = function06;
                Function0 function011 = function02;
                if (action == 1) {
                    view2.removeCallbacks((Runnable) fsfVar10.a);
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                    Object obj2 = fsfVar9.a;
                    boolean z5 = obj2 == sl9.LONG_CLICK;
                    int ordinal = ((sl9) obj2).ordinal();
                    if (ordinal == 0) {
                        function1.invoke(motionEvent);
                    } else if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal != 4) {
                            zzl.b();
                            return false;
                        }
                        float rawY = motionEvent.getRawY();
                        Float f3 = (Float) fsfVar7.a;
                        float floatValue = rawY - (f3 != null ? f3.floatValue() : 0.0f);
                        VelocityTracker velocityTracker2 = (VelocityTracker) fsfVar6.a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.computeCurrentVelocity(1000);
                        }
                        VelocityTracker velocityTracker3 = (VelocityTracker) fsfVar6.a;
                        float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f;
                        boolean z6 = floatValue > f2;
                        if (yVelocity > i4 && floatValue > i5) {
                            r15 = true;
                        }
                        if (z6 || r15) {
                            function05.invoke();
                        } else {
                            function010.invoke();
                        }
                    }
                    if (z5) {
                        function011.invoke();
                    }
                    function08.invoke();
                    fsfVar7.a = null;
                    fsfVar8.a = null;
                    fsfVar9.a = sl9.IDLE;
                    VelocityTracker velocityTracker4 = (VelocityTracker) fsfVar6.a;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                    }
                    fsfVar6.a = null;
                    return true;
                }
                if (action == 2) {
                    Float f4 = (Float) fsfVar7.a;
                    if (f4 != null) {
                        float floatValue2 = f4.floatValue();
                        Float f5 = (Float) fsfVar8.a;
                        if (f5 != null) {
                            float floatValue3 = f5.floatValue();
                            float rawY2 = motionEvent.getRawY() - floatValue2;
                            float rawX = motionEvent.getRawX() - floatValue3;
                            int ordinal2 = ((sl9) fsfVar9.a).ordinal();
                            Function2 function22 = function2;
                            if (ordinal2 != 0) {
                                z3 = true;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2 && ordinal2 != 3) {
                                        if (ordinal2 == 4) {
                                            function22.invoke(Float.valueOf(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rawY2)), Float.valueOf(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rawY2) / f2));
                                            return true;
                                        }
                                        zzl.b();
                                        return false;
                                    }
                                    return z3;
                                }
                            } else {
                                boolean z7 = Math.abs(rawY2) > Math.abs(rawX) * 1.5f;
                                if (z4 && rawY2 > i5 && z7) {
                                    fsfVar9.a = sl9.SWIPE_DOWN;
                                    view2.removeCallbacks((Runnable) fsfVar10.a);
                                    function04.invoke();
                                    function22.invoke(Float.valueOf(rawY2), Float.valueOf(rawY2 / f2));
                                    ViewParent parent2 = view2.getParent();
                                    z3 = true;
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                    return z3;
                                }
                                if (z && (-rawY2) > a2) {
                                    fsfVar9.a = sl9.SWIPE_UP;
                                    view2.removeCallbacks((Runnable) fsfVar10.a);
                                    function03.invoke();
                                    return true;
                                }
                            }
                        }
                    }
                } else if (action == 3) {
                    view2.removeCallbacks((Runnable) fsfVar10.a);
                    ViewParent parent3 = view2.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(false);
                    }
                    Object obj3 = fsfVar9.a;
                    r15 = obj3 == sl9.LONG_CLICK;
                    if (obj3 == sl9.SWIPE_DOWN) {
                        function010.invoke();
                    }
                    if (r15) {
                        function011.invoke();
                    }
                    function09.invoke();
                    fsfVar7.a = null;
                    fsfVar8.a = null;
                    fsfVar9.a = sl9.IDLE;
                    VelocityTracker velocityTracker5 = (VelocityTracker) fsfVar6.a;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    fsfVar6.a = null;
                    return true;
                }
                return false;
            }
        });
    }

    public static final void x(View view, List list, GradientDrawable.Orientation orientation, Float f2) {
        view.getClass();
        list.getClass();
        orientation.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                arrayList.add(num);
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, CollectionsKt.R0(arrayList));
        if (f2 != null) {
            gradientDrawable.setCornerRadius(f2.floatValue());
        }
        view.setBackground(gradientDrawable);
    }

    public static final void y(View view, boolean z) {
        view.getClass();
        view.setAlpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final void z(int i2, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i2);
        view.setLayoutParams(marginLayoutParams);
    }
}
