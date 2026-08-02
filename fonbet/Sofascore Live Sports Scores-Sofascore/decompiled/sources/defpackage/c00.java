package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vungle.ads.internal.executor.g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a() {
        eff effVar = (eff) this.b;
        AbstractMessageLite abstractMessageLite = (AbstractMessageLite) this.c;
        synchronized (effVar) {
            FileOutputStream openFileOutput = effVar.a.openFileOutput(effVar.b, 0);
            try {
                openFileOutput.write(abstractMessageLite.toByteArray());
                openFileOutput.close();
            } finally {
            }
        }
        return abstractMessageLite;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String flush$lambda$7;
        ServiceInfo serviceInfo;
        String str;
        String str2;
        int i;
        boolean z = false;
        String str3 = null;
        switch (this.a) {
            case 0:
                flush$lambda$7 = AndroidDiagnosticEventRepository.flush$lambda$7((AndroidDiagnosticEventRepository) this.b, (List) this.c);
                return flush$lambda$7;
            case 1:
                di3 di3Var = (di3) this.b;
                fi3 fi3Var = (fi3) this.c;
                ri3 ri3Var = di3Var.b;
                synchronized (ri3Var) {
                    FileOutputStream openFileOutput = ri3Var.a.openFileOutput(ri3Var.b, 0);
                    try {
                        openFileOutput.write(fi3Var.a.toString().getBytes(C.UTF8_NAME));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            case 2:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                g7h s = g7h.s();
                ((ArrayDeque) s.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (s) {
                    try {
                        String str4 = (String) s.b;
                        if (str4 != null) {
                            str3 = str4;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        str2 = context.getPackageName() + serviceInfo.name;
                                        s.b = str2;
                                    } else {
                                        str2 = serviceInfo.name;
                                        s.b = str2;
                                    }
                                    str3 = str2;
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (str3 != null) {
                    intent2.setClassName(context.getPackageName(), str3);
                }
                try {
                    i = (s.w(context) ? t62.M(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = TTAdConstant.AD_ID_IS_NULL_CODE;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            case 3:
                e58 e58Var = (e58) this.b;
                h12 h12Var = (h12) this.c;
                qi3 qi3Var = e58Var.i;
                synchronized (qi3Var.b) {
                    qi3Var.a.edit().putLong("fetch_timeout_in_seconds", h12Var.a).putLong("minimum_fetch_interval_in_seconds", h12Var.b).commit();
                }
                return null;
            case 4:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                String str5 = (String) this.c;
                klb klbVar = LottieAnimationView.n;
                if (!lottieAnimationView.j) {
                    return ulb.b(lottieAnimationView.getContext(), str5, null);
                }
                Context context2 = lottieAnimationView.getContext();
                HashMap hashMap = ulb.a;
                return ulb.b(context2, str5, "asset_" + str5);
            case 5:
                eff effVar = (eff) this.b;
                Parser parser = (Parser) this.c;
                synchronized (effVar) {
                    try {
                        FileInputStream openFileInput = effVar.a.openFileInput(effVar.b);
                        try {
                            AbstractMessageLite abstractMessageLite = (AbstractMessageLite) parser.parseFrom(openFileInput);
                            if (openFileInput != null) {
                                openFileInput.close();
                            }
                            return abstractMessageLite;
                        } catch (Throwable th) {
                            if (openFileInput != null) {
                                try {
                                    openFileInput.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e2) {
                        e2.getMessage();
                        return null;
                    }
                }
            case 6:
                return a();
            case 7:
                cdl cdlVar = (cdl) this.b;
                gdl gdlVar = (gdl) this.c;
                String str6 = gdlVar.c;
                qcl qclVar = gdlVar.i;
                lcl lclVar = gdlVar.a;
                if (!(cdlVar instanceof adl)) {
                    if (cdlVar instanceof zcl) {
                        jdb jdbVar = ((zcl) cdlVar).a;
                        int i2 = hdl.a;
                        rik.o().getClass();
                        if (lclVar.c()) {
                            gdlVar.b();
                        } else {
                            gdlVar.d(jdbVar);
                        }
                    } else {
                        if (!(cdlVar instanceof bdl)) {
                            zzl.b();
                            return null;
                        }
                        int i3 = ((bdl) cdlVar).a;
                        if (Intrinsics.c(lclVar.y, Boolean.TRUE)) {
                            int i4 = hdl.a;
                            rik.o().getClass();
                            gdlVar.a(i3);
                        } else {
                            sbl d = qclVar.d(str6);
                            if (d == null || d.d()) {
                                int i5 = hdl.a;
                                rik o = rik.o();
                                Objects.toString(d);
                                o.getClass();
                            } else {
                                int i6 = hdl.a;
                                rik o2 = rik.o();
                                d.toString();
                                o2.getClass();
                                qclVar.j(sbl.a, str6);
                                qclVar.k(i3, str6);
                                qclVar.g(-1L, str6);
                            }
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                jdb jdbVar2 = ((adl) cdlVar).a;
                sbl d2 = qclVar.d(str6);
                ecl f = gdlVar.h.f();
                f.getClass();
                gz8.S(f.a, false, true, new cfi(str6, 9));
                if (d2 != null) {
                    if (d2 == sbl.b) {
                        if (jdbVar2 instanceof idb) {
                            int i7 = hdl.a;
                            rik.o().getClass();
                            if (lclVar.c()) {
                                gdlVar.b();
                            } else {
                                qclVar.j(sbl.c, str6);
                                md4 md4Var = ((idb) jdbVar2).a;
                                md4Var.getClass();
                                gz8.S(qclVar.a, false, true, new bcl(4, md4Var, str6));
                                long currentTimeMillis = System.currentTimeMillis();
                                tx4 tx4Var = gdlVar.j;
                                for (String str7 : tx4Var.a(str6)) {
                                    if (qclVar.d(str7) == sbl.e && ((Boolean) gz8.S(tx4Var.a, true, false, new jp1(str7, 11))).booleanValue()) {
                                        int i8 = hdl.a;
                                        rik.o().getClass();
                                        qclVar.j(sbl.a, str7);
                                        qclVar.i(currentTimeMillis, str7);
                                    }
                                }
                            }
                        } else if (jdbVar2 instanceof hdb) {
                            int i9 = hdl.a;
                            rik.o().getClass();
                            gdlVar.a(-256);
                            z = true;
                        } else {
                            int i10 = hdl.a;
                            rik.o().getClass();
                            if (lclVar.c()) {
                                gdlVar.b();
                            } else {
                                if (jdbVar2 == null) {
                                    jdbVar2 = new gdb();
                                }
                                gdlVar.d(jdbVar2);
                            }
                        }
                    } else if (!d2.d()) {
                        gdlVar.a(-512);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return g.a((Callable) this.b, (Function0) this.c);
        }
    }
}
