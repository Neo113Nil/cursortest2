package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class p4h implements s9j, ec3, pla, foh, zzqp, zzyh, pg0, tz2, pjd, jr0, xn3, gml {
    public static tof i;
    public final /* synthetic */ int a;
    public static final p4h b = new p4h(0);
    public static final p4h c = new p4h(1);
    public static final p4h d = new p4h(2);
    public static final p4h e = new p4h(3);
    public static final p4h f = new p4h(4);
    public static final p4h g = new p4h(6);
    public static final p4h h = new p4h(7);
    public static final p4h j = new p4h(8);
    public static final p4h k = new p4h(9);
    public static final p4h l = new p4h(10);
    public static final p4h m = new p4h(11);
    public static final p4h n = new p4h(12);
    public static final p4h o = new p4h(13);
    public static final p4h p = new p4h(14);
    public static final p4h q = new p4h(15);

    public /* synthetic */ p4h(int i2) {
        this.a = i2;
    }

    public static lw1 j(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        int length = bArr[0].length + i3;
        int length2 = bArr.length + i3;
        lw1 lw1Var = new lw1(length, length2);
        int[] iArr = lw1Var.d;
        int length3 = iArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            iArr[i4] = 0;
        }
        int i5 = (length2 - i2) - 1;
        int i6 = 0;
        while (i6 < bArr.length) {
            byte[] bArr2 = bArr[i6];
            for (int i7 = 0; i7 < bArr[0].length; i7++) {
                if (bArr2[i7] == 1) {
                    lw1Var.b(i7 + i2, i5);
                }
            }
            i6++;
            i5--;
        }
        return lw1Var;
    }

    public static he9 r(int i2) {
        Object obj;
        Iterator<E> it = he9.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((he9) obj).a == i2) {
                break;
            }
        }
        he9 he9Var = (he9) obj;
        return he9Var == null ? he9.g : he9Var;
    }

    public static he9 s(String str) {
        Object obj;
        str.getClass();
        Iterator<E> it = he9.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((he9) obj).b.equals(str)) {
                break;
            }
        }
        he9 he9Var = (he9) obj;
        return he9Var == null ? he9.g : he9Var;
    }

    public static void t(BaseActivity baseActivity, boolean z, Function1 function1, k01 k01Var, int i2) {
        Function1 function12 = (i2 & 4) != 0 ? null : function1;
        k01 k01Var2 = (i2 & 8) != 0 ? null : k01Var;
        int i3 = 0;
        boolean z2 = (i2 & 16) == 0;
        boolean z3 = (i2 & 32) != 0;
        baseActivity.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        jx1 jx1Var = new jx1(baseActivity, z, function12, 4);
        if (eq3.b(baseActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (!wc.b0(baseActivity, "android.permission.POST_NOTIFICATIONS")) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = baseActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (!sharedPreferences.getBoolean("PREF_RATIONALE_SHOWN", false)) {
                jx1Var.invoke();
                return;
            }
            if (!z3) {
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = baseActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            if (sharedPreferences2.getBoolean("PREF_NOTIFICATIONS_DISABLED_DIALOG_DO_NOT_SHOW_AGAIN", false)) {
                return;
            }
            AlertDialog create = new AlertDialog.Builder(baseActivity, R.style.RedesignDialog).create();
            ez0 e2 = ez0.e(LayoutInflater.from(baseActivity));
            ((TextView) e2.e).setText(baseActivity.getString(R.string.notifications_disabled_title));
            ((TextView) e2.d).setText(baseActivity.getString(R.string.notifications_disabled_description));
            ((MaterialCheckBox) e2.c).setOnCheckedChangeListener(new hn(baseActivity, i3));
            create.setCanceledOnTouchOutside(false);
            create.setView((ScrollView) e2.b);
            int i4 = 2;
            create.setButton(-1, baseActivity.getString(R.string.button_update_settings), new h0(i4, baseActivity, create));
            create.setButton(-3, baseActivity.getString(R.string.button_not_now), new i0(create, i4));
            FragmentActivity K = hkg.K(baseActivity);
            if (K == null || K.isFinishing()) {
                return;
            }
            create.show();
            return;
        }
        SharedPreferences sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
            Context applicationContext3 = baseActivity.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences3 = a5f.d(applicationContext3);
                uic.j = sharedPreferences3;
            }
            sharedPreferences3.getClass();
        }
        SharedPreferences.Editor i5 = dmi.i(sharedPreferences3, "PREF_RATIONALE_SHOWN", true);
        Unit unit = Unit.a;
        i5.apply();
        if (z2) {
            jx1Var.invoke();
            return;
        }
        AlertDialog create2 = new AlertDialog.Builder(baseActivity, R.style.RedesignDialog).create();
        View inflate = LayoutInflater.from(baseActivity).inflate(R.layout.notification_permission_rationale_popup, (ViewGroup) null, false);
        int i6 = R.id.action_button;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.action_button, inflate);
        if (materialButton != null) {
            i6 = R.id.notifications_showcase;
            View B = nq8.B(R.id.notifications_showcase, inflate);
            if (B != null) {
                int i7 = R.id.game_score;
                if (((TextView) nq8.B(R.id.game_score, B)) != null) {
                    i7 = R.id.label_app_name;
                    if (((TextView) nq8.B(R.id.label_app_name, B)) != null) {
                        i7 = R.id.label_goal;
                        if (((TextView) nq8.B(R.id.label_goal, B)) != null) {
                            i7 = R.id.match_result;
                            if (((TextView) nq8.B(R.id.match_result, B)) != null) {
                                i7 = R.id.player_image;
                                ImageView imageView = (ImageView) nq8.B(R.id.player_image, B);
                                if (imageView != null) {
                                    i7 = R.id.player_name;
                                    if (((TextView) nq8.B(R.id.player_name, B)) != null) {
                                        i7 = R.id.scorer_name;
                                        if (((TextView) nq8.B(R.id.scorer_name, B)) != null) {
                                            i7 = R.id.team_logo;
                                            TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.team_logo, B);
                                            if (teamLogoView != null) {
                                                i6 = R.id.text;
                                                if (((TextView) nq8.B(R.id.text, inflate)) != null) {
                                                    i6 = R.id.title;
                                                    if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                                        as9.l(imageView, 15466, null);
                                                        TeamLogoView.g(teamLogoView, new Team(2692, "Milan", 0, null, 12, null), null, 12);
                                                        teamLogoView.setEnabled(false);
                                                        materialButton.setOnClickListener(new cn(i3, jx1Var, create2));
                                                        create2.setOnShowListener(new dn(k01Var2, i3));
                                                        create2.setView((ConstraintLayout) inflate);
                                                        create2.show();
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r1.getInputType() == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        if (r1.getInputType() == 112) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0052, code lost:
    
        if (r1.getInputType() == 96) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean v(View view) {
        boolean z;
        boolean matches;
        p4h p4hVar = b;
        Set set = cw3.a;
        if (set.contains(p4h.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (!set.contains(p4hVar)) {
                try {
                    z = textView.getInputType() == 128 ? true : textView.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    cw3.a(p4hVar, th);
                }
                if (!z && !p4hVar.u((TextView) view)) {
                    TextView textView2 = (TextView) view;
                    if (!cw3.a.contains(p4hVar)) {
                        try {
                        } catch (Throwable th2) {
                            cw3.a(p4hVar, th2);
                        }
                    }
                    TextView textView3 = (TextView) view;
                    if (!cw3.a.contains(p4hVar)) {
                        try {
                        } catch (Throwable th3) {
                            cw3.a(p4hVar, th3);
                        }
                    }
                    TextView textView4 = (TextView) view;
                    if (!cw3.a.contains(p4hVar)) {
                        try {
                        } catch (Throwable th4) {
                            cw3.a(p4hVar, th4);
                        }
                    }
                    TextView textView5 = (TextView) view;
                    if (!cw3.a.contains(p4hVar)) {
                        try {
                            if (textView5.getInputType() == 32) {
                                matches = true;
                            } else {
                                String j2 = xsk.j(textView5);
                                if (j2 != null && j2.length() != 0) {
                                    matches = Patterns.EMAIL_ADDRESS.matcher(j2).matches();
                                }
                            }
                        } catch (Throwable th5) {
                            cw3.a(p4hVar, th5);
                        }
                        if (!matches) {
                            return false;
                        }
                    }
                    matches = false;
                    if (!matches) {
                    }
                }
                return true;
            }
            z = false;
            if (!z) {
                TextView textView22 = (TextView) view;
                if (!cw3.a.contains(p4hVar)) {
                }
                TextView textView32 = (TextView) view;
                if (!cw3.a.contains(p4hVar)) {
                }
                TextView textView42 = (TextView) view;
                if (!cw3.a.contains(p4hVar)) {
                }
                TextView textView52 = (TextView) view;
                if (!cw3.a.contains(p4hVar)) {
                }
                matches = false;
                if (!matches) {
                }
            }
            return true;
        } catch (Throwable th6) {
            cw3.a(p4h.class, th6);
            return false;
        }
    }

    public static void w(Context context, String str) {
        context.getClass();
        str.getClass();
        da4 da4Var = new da4();
        int color = context.getColor(R.color.primary_variant) | (-16777216);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
        da4Var.d = bundle;
        Intent intent = da4Var.a;
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        da4Var.f(true);
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        da4Var.e();
        intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", Locale.getDefault().toLanguageTag());
        Drawable d0 = td4.d0(R.drawable.ic_arrow_back, context);
        if (d0 != null) {
            d0.setTint(context.getColor(R.color.on_color_primary));
            intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", u6h.U(d0, 0, 0, 7));
        }
        ea4 a = da4Var.a();
        try {
            ia0 ia0Var = ia0.q;
            if (Intrinsics.c(ok3.p().g().b().getDataSharingOptOut(), Boolean.TRUE)) {
                return;
            }
            a.a.setPackage(ba4.b(context));
            Uri parse = Uri.parse(str);
            parse.getClass();
            a.a(context, parse);
        } catch (Exception unused) {
            bea.G(context, str);
        }
    }

    public static byte[][] x(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    public static void y(Context context, int i2, FantasyCompetitionType fantasyCompetitionType, String str, Integer num) {
        context.getClass();
        fantasyCompetitionType.getClass();
        str.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyUserSquadActivity.class);
        intent.putExtra("USER_ID_EXTRA", str);
        intent.putExtra("COMPETITION_ID_EXTRA", i2);
        intent.putExtra("competitionType", fantasyCompetitionType);
        if (num != null) {
            intent.putExtra("GAMEWEEK_ID_EXTRA", num.intValue());
        }
        context.startActivity(intent);
    }

    @Override // defpackage.s9j
    public void a(tc3 tc3Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2101003086);
        int i3 = (av8Var.g(this) ? 32 : 16) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            tc3Var.invoke(av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(this, tc3Var, i2, 17);
        }
    }

    @Override // defpackage.pg0
    public void b(kx4 kx4Var, int i2, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = iArr[i3];
            iArr2[i4] = i5;
            i5 += i6;
            i3++;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.pla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(n29 n29Var, rq3 rq3Var) {
        qla qlaVar;
        int i2;
        ImageReader imageReader;
        if (rq3Var instanceof qla) {
            qlaVar = (qla) rq3Var;
            int i3 = qlaVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qlaVar.u = i3 - Integer.MIN_VALUE;
                Object obj = qlaVar.s;
                lu3 lu3Var = lu3.a;
                i2 = qlaVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    long j2 = n29Var.u;
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    ImageReader newInstance = ImageReader.newInstance((int) (j2 >> 32), (int) (j2 & 4294967295L), 1, 1);
                    try {
                        qlaVar.r = newInstance;
                        qlaVar.u = 1;
                        lj2 lj2Var = new lj2(1, z9a.b(qlaVar));
                        lj2Var.t();
                        newInstance.setOnImageAvailableListener(new rla(lj2Var), o1j.u(myLooper));
                        Surface surface = newInstance.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.drawColor(hkg.s0(r13.b), PorterDuff.Mode.CLEAR);
                            Canvas canvas = xx.a;
                            wx wxVar = new wx();
                            wxVar.a = lockHardwareCanvas;
                            n29Var.c(wxVar, null);
                            surface.unlockCanvasAndPost(lockHardwareCanvas);
                            obj = lj2Var.q();
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                            imageReader = newInstance;
                        } catch (Throwable th) {
                            surface.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        imageReader = newInstance;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imageReader = qlaVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            o1j.t(imageReader, th);
                            throw th4;
                        }
                    }
                }
                Bitmap O = q5a.O((Image) obj);
                o1j.t(imageReader, null);
                return O;
            }
        }
        qlaVar = new qla(this, (sq3) rq3Var);
        Object obj2 = qlaVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = qlaVar.u;
        if (i2 != 0) {
        }
        Bitmap O2 = q5a.O((Image) obj2);
        o1j.t(imageReader, null);
        return O2;
    }

    @Override // defpackage.tz2
    public InputStream d(aof aofVar) {
        return new GZIPInputStream(aofVar);
    }

    public void f(String str, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-675273434);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Unit unit = Unit.a;
            boolean i3 = av8Var.i(context) | av8Var.i(ku3Var);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new fa(14, context, ku3Var, str);
                av8Var.n0(O2);
            }
            hz8.d(unit, (Function1) O2, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(this, str, i2, 29);
        }
    }

    @Override // defpackage.tz2
    public String g() {
        return "gzip";
    }

    @Override // defpackage.tz2
    public OutputStream h(ugc ugcVar) {
        return new GZIPOutputStream(ugcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ba, code lost:
    
        r14 = (r14 - r4) - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e2, code lost:
    
        r14 = r14 - r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042d A[LOOP:12: B:213:0x042b->B:214:0x042d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04d6  */
    @Override // defpackage.gml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1 k(String str, int i2, EnumMap enumMap) {
        int i3;
        cn5 cn5Var;
        tp2 tp2Var;
        boolean z;
        String str2;
        char c2;
        char c3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        String str3;
        int i8;
        int i9;
        int i10;
        if (i2 != 11) {
            a70.p("Can only encode PDF_417, but got ".concat(fn0.C(i2)));
            return null;
        }
        cn5 cn5Var2 = cn5.g;
        boolean booleanValue = enumMap.containsKey(cn5Var2) ? Boolean.valueOf(enumMap.get(cn5Var2).toString()).booleanValue() : false;
        cn5 cn5Var3 = cn5.h;
        if (enumMap.containsKey(cn5Var3)) {
            String obj = enumMap.get(cn5Var3).toString();
            if (obj == null) {
                yhk.s("Name is null");
            } else if (!obj.equals("AUTO")) {
                if (obj.equals("TEXT")) {
                    i3 = 2;
                } else if (obj.equals("BYTE")) {
                    i3 = 3;
                } else if (obj.equals("NUMERIC")) {
                    i3 = 4;
                } else {
                    a70.p("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(obj));
                }
                cn5Var = cn5.i;
                if (enumMap.containsKey(cn5Var)) {
                    enumMap.get(cn5Var).getClass();
                    pvd.j();
                    return null;
                }
                cn5 cn5Var4 = cn5.f;
                int parseInt = enumMap.containsKey(cn5Var4) ? Integer.parseInt(enumMap.get(cn5Var4).toString()) : 30;
                cn5 cn5Var5 = cn5.a;
                int parseInt2 = enumMap.containsKey(cn5Var5) ? Integer.parseInt(enumMap.get(cn5Var5).toString()) : 2;
                cn5 cn5Var6 = cn5.b;
                Charset forName = enumMap.containsKey(cn5Var6) ? Charset.forName(enumMap.get(cn5Var6).toString()) : null;
                String str4 = "Error correction level must be between 0 and 8!";
                if (parseInt2 < 0 || parseInt2 > 8) {
                    a70.p("Error correction level must be between 0 and 8!");
                    return null;
                }
                int i11 = 1 << (parseInt2 + 1);
                Charset charset = dzd.e;
                StringBuilder sb = new StringBuilder(str.length());
                if (forName == null) {
                    forName = charset;
                } else if (!charset.equals(forName) && (tp2Var = (tp2) tp2.d.get(forName.name())) != null) {
                    int i12 = tp2Var.a[0];
                    if (i12 >= 0 && i12 < 900) {
                        sb.append((char) 927);
                        sb.append((char) i12);
                    } else if (i12 < 810900) {
                        sb.append((char) 926);
                        sb.append((char) ((i12 / 900) - 1));
                        sb.append((char) (i12 % 900));
                    } else {
                        if (i12 >= 811800) {
                            throw new iml("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i12)));
                        }
                        sb.append((char) 925);
                        sb.append((char) (810900 - i12));
                    }
                }
                int length = str.length();
                int C = wt3.C(i3);
                if (C == 1) {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    dzd.c(str, 0, length, sb, 0);
                } else if (C == 2) {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    byte[] bytes = str.getBytes(forName);
                    dzd.a(bytes.length, 1, sb, bytes);
                } else if (C != 3) {
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < length) {
                        int length2 = str.length();
                        char c4 = '0';
                        if (i13 < length2) {
                            int i16 = i13;
                            char charAt = str.charAt(i13);
                            int i17 = 0;
                            while (charAt >= '0' && charAt <= '9' && i16 < length2) {
                                i17++;
                                i16++;
                                if (i16 < length2) {
                                    charAt = str.charAt(i16);
                                }
                            }
                            i7 = i17;
                        } else {
                            i7 = 0;
                        }
                        if (i7 >= 13) {
                            sb.append((char) 902);
                            dzd.b(i13, i7, str, sb);
                            i13 += i7;
                            i14 = 2;
                            i15 = 0;
                        } else {
                            int length3 = str.length();
                            int i18 = i13;
                            while (true) {
                                if (i18 >= length3) {
                                    z3 = booleanValue;
                                    str3 = str4;
                                    break;
                                }
                                str3 = str4;
                                char charAt2 = str.charAt(i18);
                                z3 = booleanValue;
                                int i19 = 0;
                                while (i19 < 13 && charAt2 >= c4 && charAt2 <= '9' && i18 < length3) {
                                    i19++;
                                    i18++;
                                    if (i18 < length3) {
                                        charAt2 = str.charAt(i18);
                                    }
                                    c4 = '0';
                                }
                                if (i19 <= 0) {
                                    char charAt3 = str.charAt(i18);
                                    if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != '\r' && (charAt3 < ' ' || charAt3 > '~')) {
                                        break;
                                    }
                                    i18++;
                                }
                                booleanValue = z3;
                                str4 = str3;
                                c4 = '0';
                            }
                            if (i8 >= 5 || i7 == length) {
                                if (i14 != 0) {
                                    sb.append((char) 900);
                                    i9 = 0;
                                    i14 = 0;
                                } else {
                                    i9 = i15;
                                }
                                i15 = dzd.c(str, i13, i8, sb, i9);
                                i13 += i8;
                            } else {
                                CharsetEncoder newEncoder = forName.newEncoder();
                                int length4 = str.length();
                                int i20 = i13;
                                while (i20 < length4) {
                                    char charAt4 = str.charAt(i20);
                                    int i21 = 0;
                                    while (i21 < 13 && charAt4 >= '0') {
                                        if (charAt4 > '9' || (i10 = i20 + (i21 = i21 + 1)) >= length4) {
                                            break;
                                        }
                                        charAt4 = str.charAt(i10);
                                    }
                                    if (i21 >= 13) {
                                        break;
                                    }
                                    char charAt5 = str.charAt(i20);
                                    if (!newEncoder.canEncode(charAt5)) {
                                        throw new iml("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                    }
                                    i20++;
                                }
                                int i22 = i20 - i13;
                                if (i22 == 0) {
                                    i22 = 1;
                                }
                                int i23 = i13 + i22;
                                byte[] bytes2 = str.substring(i13, i23).getBytes(forName);
                                if (bytes2.length == 1 && i14 == 0) {
                                    dzd.a(1, 0, sb, bytes2);
                                } else {
                                    dzd.a(bytes2.length, i14, sb, bytes2);
                                    i14 = 1;
                                    i15 = 0;
                                }
                                i13 = i23;
                            }
                            booleanValue = z3;
                            str4 = str3;
                        }
                    }
                    z = booleanValue;
                    str2 = str4;
                } else {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    sb.append((char) 902);
                    dzd.b(0, length, str, sb);
                }
                String sb2 = sb.toString();
                int length5 = sb2.length();
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                int[] iArr = null;
                for (int i24 = 2; i24 <= 30; i24++) {
                    int i25 = length5 + 1 + i11;
                    int i26 = i25 / i24;
                    int i27 = i26 + 1;
                    if (i24 * i27 < i25 + i24) {
                        i26 = i27;
                    }
                    if (i26 < 2) {
                        break;
                    }
                    if (i26 <= 30) {
                        float f3 = (((i24 * 17) + 69) * 0.357f) / (i26 * 2.0f);
                        if (iArr == null || Math.abs(f3 - 3.0f) <= Math.abs(f2 - 3.0f)) {
                            iArr = new int[]{i24, i26};
                            f2 = f3;
                        }
                    }
                }
                if (iArr == null) {
                    int i28 = length5 + 1 + i11;
                    int i29 = i28 / 2;
                    int i30 = i29 + 1;
                    if (2 * i30 < i28 + 2) {
                        i29 = i30;
                    }
                    if (i29 < 2) {
                        c2 = 0;
                        c3 = 1;
                        iArr = new int[]{2, 2};
                        if (iArr != null) {
                            throw new iml("Unable to fit message in columns");
                        }
                        int i31 = iArr[c2];
                        int i32 = iArr[c3];
                        int i33 = (i31 * i32) - i11 > length5 + 1 ? (r5 - length5) - 1 : 0;
                        if (length5 + i11 + 1 > 929) {
                            throw new iml("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                        }
                        int i34 = length5 + i33 + 1;
                        StringBuilder sb3 = new StringBuilder(i34);
                        sb3.append((char) i34);
                        sb3.append(sb2);
                        for (int i35 = 0; i35 < i33; i35++) {
                            sb3.append((char) 900);
                        }
                        String sb4 = sb3.toString();
                        int[][] iArr2 = ok3.h;
                        if (parseInt2 < 0 || parseInt2 > 8) {
                            a70.p(str2);
                            return null;
                        }
                        char[] cArr = new char[i11];
                        int length6 = sb4.length();
                        for (int i36 = 0; i36 < length6; i36++) {
                            int i37 = i11 - 1;
                            int charAt6 = (sb4.charAt(i36) + cArr[i37]) % 929;
                            while (i37 > 0) {
                                cArr[i37] = (char) ((cArr[i37 - 1] + (929 - ((iArr2[parseInt2][i37] * charAt6) % 929))) % 929);
                                i37--;
                            }
                            cArr[0] = (char) ((929 - ((charAt6 * iArr2[parseInt2][0]) % 929)) % 929);
                        }
                        StringBuilder sb5 = new StringBuilder(i11);
                        for (int i38 = i11 - 1; i38 >= 0; i38--) {
                            char c5 = cArr[i38];
                            if (c5 != 0) {
                                cArr[i38] = (char) (929 - c5);
                            }
                            sb5.append(cArr[i38]);
                        }
                        String sb6 = sb5.toString();
                        zz0 zz0Var = new zz0(i32, i31);
                        String concat = sb4.concat(sb6);
                        int[][] iArr3 = ao2.l;
                        int i39 = 0;
                        int i40 = 0;
                        while (i39 < i32) {
                            int i41 = i39 % 3;
                            zz0Var.b++;
                            ao2.y(130728, 17, zz0Var.e());
                            if (i41 == 0) {
                                int i42 = (i39 / 3) * 30;
                                i4 = wt3.f(i32, 1, 3, i42);
                                i5 = (i31 - 1) + i42;
                            } else if (i41 == 1) {
                                int i43 = (i39 / 3) * 30;
                                int i44 = i32 - 1;
                                i4 = (i44 % 3) + (parseInt2 * 3) + i43;
                                i5 = (i44 / 3) + i43;
                            } else {
                                int i45 = (i39 / 3) * 30;
                                i4 = (i31 - 1) + i45;
                                i5 = ((i32 - 1) % 3) + (parseInt2 * 3) + i45;
                                ao2.y(iArr3[i41][i4], 17, zz0Var.e());
                                int i46 = i40;
                                for (i6 = 0; i6 < i31; i6++) {
                                    ao2.y(iArr3[i41][concat.charAt(i46)], 17, zz0Var.e());
                                    i46++;
                                }
                                if (z) {
                                    ao2.y(iArr3[i41][i5], 17, zz0Var.e());
                                    ao2.y(260649, 18, zz0Var.e());
                                } else {
                                    ao2.y(260649, 1, zz0Var.e());
                                }
                                i39++;
                                i40 = i46;
                            }
                            ao2.y(iArr3[i41][i4], 17, zz0Var.e());
                            int i462 = i40;
                            while (i6 < i31) {
                            }
                            if (z) {
                            }
                            i39++;
                            i40 = i462;
                        }
                        byte[][] i47 = zz0Var.i(1, 4);
                        if (i47[0].length < i47.length) {
                            i47 = x(i47);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int length7 = 200 / i47[0].length;
                        int length8 = 200 / i47.length;
                        if (length7 >= length8) {
                            length7 = length8;
                        }
                        if (length7 <= 1) {
                            return j(i47, parseInt);
                        }
                        byte[][] i48 = zz0Var.i(length7, length7 << 2);
                        if (z2) {
                            i48 = x(i48);
                        }
                        return j(i48, parseInt);
                    }
                }
                c2 = 0;
                c3 = 1;
                if (iArr != null) {
                }
            }
            i3 = 0;
            cn5Var = cn5.i;
            if (enumMap.containsKey(cn5Var)) {
            }
        }
        i3 = 1;
        cn5Var = cn5.i;
        if (enumMap.containsKey(cn5Var)) {
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        Object h2 = vngVar.h(new oif(i7b.class, Executor.class));
        h2.getClass();
        return fz8.P((Executor) h2);
    }

    @Override // defpackage.jr0
    public void m(dni dniVar) {
        dniVar.getClass();
        dniVar.E("DELETE FROM media_reaction_table WHERE timestamp > 9999999999 OR (reaction IS NOT NULL AND reaction != 'THUMBS_UP')");
    }

    @Override // defpackage.pjd
    public Object n() {
        return new TreeMap();
    }

    public List o(Executor executor) {
        return Collections.singletonList(new yn4(executor));
    }

    public List p() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.foh
    public boolean q(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "ReferentialEqualityPolicy";
            case 16:
                return "Arrangement#Top";
            case 24:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public boolean u(TextView textView) {
        if (!cw3.a.contains(this)) {
            try {
                String replace = new Regex("\\s").replace(xsk.j(textView), "");
                int length = replace.length();
                if (length >= 12 && length <= 19) {
                    int i2 = length - 1;
                    int i3 = 0;
                    boolean z = false;
                    while (true) {
                        if (-1 < i2) {
                            char charAt = replace.charAt(i2);
                            if (!Character.isDigit(charAt)) {
                                break;
                            }
                            int digit = Character.digit((int) charAt, 10);
                            if (digit < 0) {
                                throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                            }
                            if (z && (digit = digit * 2) > 9) {
                                digit = (digit % 10) + 1;
                            }
                            i3 += digit;
                            z = !z;
                            i2--;
                        } else if (i3 % 10 == 0) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
    }
}
