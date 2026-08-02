package defpackage;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.blaze.blazesdk.external_modules.BlazeExternalModulesBinder;
import com.blaze.blazesdk.external_modules.flutter.BlazeFlutterSDKHelperInterface;
import com.blaze.blazesdk.external_modules.react_native.BlazeReactSDKHelperInterface;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.results.y;
import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import com.mbridge.msdk.foundation.download.Command;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o1m extends hoi implements Function2 {
    public Object r;
    public Object s;
    public Object t;
    public ssm u;
    public int v;
    public final /* synthetic */ p7a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1m(p7a p7aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = p7aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new o1m(this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o1m(this.w, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0264, code lost:
    
        if (r4 != r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0215, code lost:
    
        if (r1 == r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
    
        if (defpackage.rd0.y(r4, r15) == r6) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02a2 A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qzf qzfVar;
        usl uslVar;
        Object f;
        usl uslVar2;
        qzf qzfVar2;
        Application application$blazesdk_release;
        String str;
        String flutterSDKVersion;
        String reactNativeSDKVersion;
        Object a;
        qzf qzfVar3;
        String str2;
        CharSequence charSequence;
        Object f2;
        String str3;
        usl uslVar3;
        qzf qzfVar4;
        ssm ssmVar;
        Object refreshTokenAndLock$default;
        String str4;
        qzf qzfVar5;
        Object f3;
        Object a2;
        Object f4;
        String str5;
        d2g d2gVar;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        p7a p7aVar = this.w;
        switch (i) {
            case 0:
                y6a.M(obj);
                pzf b = ((epf) p7aVar).e.b();
                String str6 = "Unknown";
                if (yaa.f.equals("BlazeSDK-DefaultUserAgent") && (application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release()) != null) {
                    try {
                        ApplicationInfo applicationInfo = application$blazesdk_release.getApplicationInfo();
                        int i2 = applicationInfo.labelRes;
                        if (i2 == 0) {
                            str = applicationInfo.nonLocalizedLabel.toString();
                        } else {
                            str = application$blazesdk_release.getString(i2);
                            str.getClass();
                        }
                    } catch (Exception unused) {
                        str = "Unknown";
                    }
                    String encode = Uri.encode(str);
                    try {
                        PackageManager packageManager = application$blazesdk_release.getPackageManager();
                        packageManager.getClass();
                        String packageName = application$blazesdk_release.getPackageName();
                        packageName.getClass();
                        PackageInfo a3 = wsm.a(packageManager, packageName, 0);
                        if (a3 != null) {
                            String str7 = a3.versionName;
                            if (str7 != null) {
                                str6 = str7;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    String str8 = "Android " + encode + ':' + str6 + " BlazeSDK:1.17.1";
                    BlazeExternalModulesBinder blazeExternalModulesBinder = BlazeExternalModulesBinder.INSTANCE;
                    BlazeReactSDKHelperInterface reactNativeSDKHelper = blazeExternalModulesBinder.getReactNativeSDKHelper();
                    if (reactNativeSDKHelper != null && (reactNativeSDKVersion = reactNativeSDKHelper.getReactNativeSDKVersion()) != null) {
                        str8 = lnb.o(str8, " BlazeRTNSDK:", reactNativeSDKVersion);
                    }
                    BlazeFlutterSDKHelperInterface flutterSDKHelper = blazeExternalModulesBinder.getFlutterSDKHelper();
                    if (flutterSDKHelper != null && (flutterSDKVersion = flutterSDKHelper.getFlutterSDKVersion()) != null) {
                        str8 = lnb.o(str8, " BlazeFlutterSDK:", flutterSDKVersion);
                    }
                    yaa.f = str8;
                }
                b.c(Command.HTTP_HEADER_USER_AGENT, yaa.f);
                qzfVar = new qzf(b);
                dba dbaVar = (dba) qzfVar.c(duf.a.getOrCreateKotlinClass(dba.class));
                AuthNeeded authNeeded = dbaVar != null ? (AuthNeeded) dbaVar.c.getAnnotation(AuthNeeded.class) : null;
                uslVar = dbaVar != null ? (usl) dbaVar.c.getAnnotation(usl.class) : null;
                if (authNeeded != null) {
                    ssm ssmVar2 = ssm.a;
                    this.r = qzfVar;
                    this.s = uslVar;
                    this.v = 1;
                    f = ssmVar2.f(this);
                    if (f != lu3Var) {
                        uslVar2 = uslVar;
                        qzfVar2 = qzfVar;
                        String str9 = (String) f;
                        ssm ssmVar3 = ssm.a;
                        this.r = qzfVar2;
                        this.s = uslVar2;
                        this.t = str9;
                        this.v = 2;
                        a = ssmVar3.a(this);
                        if (a != lu3Var) {
                            qzfVar3 = qzfVar2;
                            str2 = str9;
                            charSequence = (CharSequence) a;
                            if (charSequence != null || charSequence.length() == 0) {
                                ssm ssmVar4 = ssm.a;
                                this.r = qzfVar3;
                                this.s = uslVar2;
                                this.t = str2;
                                this.u = ssmVar4;
                                this.v = 3;
                                f2 = ssmVar4.f(this);
                                if (f2 != lu3Var) {
                                    str3 = str2;
                                    uslVar3 = uslVar2;
                                    qzfVar4 = qzfVar3;
                                    ssmVar = ssmVar4;
                                    this.r = qzfVar4;
                                    this.s = uslVar3;
                                    this.t = str3;
                                    this.u = null;
                                    this.v = 4;
                                    refreshTokenAndLock$default = ssm.refreshTokenAndLock$default(ssmVar, (String) f2, false, this, 2, null);
                                    if (refreshTokenAndLock$default != lu3Var) {
                                        uslVar2 = uslVar3;
                                        qzfVar3 = qzfVar4;
                                        str4 = (String) ((Pair) refreshTokenAndLock$default).a;
                                        if (str4 == null) {
                                            ssm ssmVar5 = ssm.a;
                                            qzfVar3.getClass();
                                            pzf b2 = qzfVar3.b();
                                            b2.c("Authorization", "Bearer ".concat(str4));
                                            qzfVar5 = new qzf(b2);
                                            this.r = str3;
                                            this.s = p7aVar;
                                            this.t = qzfVar5;
                                            this.v = 5;
                                            f3 = ssmVar5.f(this);
                                            break;
                                        } else {
                                            str2 = str3;
                                        }
                                    }
                                }
                            }
                            if (ssm.b.get()) {
                                aeh aehVar = ssm.c;
                                this.r = qzfVar3;
                                this.s = uslVar2;
                                this.t = str2;
                                this.v = 6;
                                break;
                            }
                            ssm ssmVar6 = ssm.a;
                            this.r = qzfVar3;
                            this.s = uslVar2;
                            this.t = str2;
                            this.v = 7;
                            a2 = ssmVar6.a(this);
                            break;
                        }
                    }
                    return lu3Var;
                }
                if (uslVar != null) {
                    return ((epf) p7aVar).b(qzfVar);
                }
                if (qzfVar.d == null || qzfVar.c.a("Content-Encoding") != null) {
                    return ((epf) p7aVar).b(qzfVar);
                }
                yzf yzfVar = qzfVar.d;
                b8m b8mVar = yzfVar != null ? new b8m(yzfVar) : null;
                pzf b3 = qzfVar.b();
                b3.c("Content-Encoding", "gzip");
                b3.e(qzfVar.b, b8mVar);
                return ((epf) p7aVar).b(new qzf(b3));
            case 1:
                usl uslVar4 = (usl) this.s;
                qzf qzfVar6 = (qzf) this.r;
                y6a.M(obj);
                uslVar2 = uslVar4;
                qzfVar2 = qzfVar6;
                f = obj;
                String str92 = (String) f;
                ssm ssmVar32 = ssm.a;
                this.r = qzfVar2;
                this.s = uslVar2;
                this.t = str92;
                this.v = 2;
                a = ssmVar32.a(this);
                if (a != lu3Var) {
                }
                return lu3Var;
            case 2:
                str2 = (String) this.t;
                uslVar2 = (usl) this.s;
                qzfVar3 = (qzf) this.r;
                y6a.M(obj);
                a = obj;
                charSequence = (CharSequence) a;
                if (charSequence != null) {
                    break;
                }
                ssm ssmVar42 = ssm.a;
                this.r = qzfVar3;
                this.s = uslVar2;
                this.t = str2;
                this.u = ssmVar42;
                this.v = 3;
                f2 = ssmVar42.f(this);
                if (f2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                ssmVar = this.u;
                String str10 = (String) this.t;
                usl uslVar5 = (usl) this.s;
                qzf qzfVar7 = (qzf) this.r;
                y6a.M(obj);
                f2 = obj;
                str3 = str10;
                uslVar3 = uslVar5;
                qzfVar4 = qzfVar7;
                this.r = qzfVar4;
                this.s = uslVar3;
                this.t = str3;
                this.u = null;
                this.v = 4;
                refreshTokenAndLock$default = ssm.refreshTokenAndLock$default(ssmVar, (String) f2, false, this, 2, null);
                if (refreshTokenAndLock$default != lu3Var) {
                }
                return lu3Var;
            case 4:
                String str11 = (String) this.t;
                uslVar2 = (usl) this.s;
                qzfVar3 = (qzf) this.r;
                y6a.M(obj);
                str3 = str11;
                refreshTokenAndLock$default = obj;
                str4 = (String) ((Pair) refreshTokenAndLock$default).a;
                if (str4 == null) {
                }
                break;
            case 5:
                qzfVar5 = (qzf) this.t;
                p7aVar = (p7a) this.s;
                String str12 = (String) this.r;
                y6a.M(obj);
                str3 = str12;
                f3 = obj;
                if (Intrinsics.c(str3, (String) f3)) {
                    return ((epf) p7aVar).b(qzfVar5);
                }
                j1m j1mVar = j1m.a;
                y yVar = new y();
                j1m.a(yVar);
                throw new BlazeException.a(yVar.d);
            case 6:
                str2 = (String) this.t;
                uslVar2 = (usl) this.s;
                qzfVar3 = (qzf) this.r;
                y6a.M(obj);
                ssm ssmVar62 = ssm.a;
                this.r = qzfVar3;
                this.s = uslVar2;
                this.t = str2;
                this.v = 7;
                a2 = ssmVar62.a(this);
                break;
            case 7:
                str2 = (String) this.t;
                uslVar2 = (usl) this.s;
                qzfVar3 = (qzf) this.r;
                y6a.M(obj);
                a2 = obj;
                String str13 = (String) a2;
                if (str13 != null) {
                    ssm ssmVar7 = ssm.a;
                    qzfVar3.getClass();
                    pzf b4 = qzfVar3.b();
                    b4.c("Authorization", "Bearer ".concat(str13));
                    d2g b5 = ((epf) p7aVar).b(new qzf(b4));
                    this.r = str2;
                    this.s = b5;
                    this.t = null;
                    this.v = 8;
                    f4 = ssmVar7.f(this);
                    if (f4 != lu3Var) {
                        str5 = str2;
                        d2gVar = b5;
                        if (!Intrinsics.c(str5, (String) f4)) {
                            return d2gVar;
                        }
                        j1m j1mVar2 = j1m.a;
                        y yVar2 = new y();
                        j1m.a(yVar2);
                        throw new BlazeException.a(yVar2.d);
                    }
                    return lu3Var;
                }
                uslVar = uslVar2;
                qzfVar = qzfVar3;
                if (uslVar != null) {
                }
                break;
            case 8:
                d2gVar = (d2g) this.s;
                String str14 = (String) this.r;
                y6a.M(obj);
                str5 = str14;
                f4 = obj;
                if (!Intrinsics.c(str5, (String) f4)) {
                }
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
