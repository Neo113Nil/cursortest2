package rl0;

import Sc.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import org.jetbrains.annotations.NotNull;
import wl0.C10569b;
import zl0.C11150a;
import zl0.C11151b;

/* loaded from: classes8.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Q f83657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f83658c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends AbstractC7737t implements Function1<lm0.e<T>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC7737t f83660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super lm0.e<T>, ? extends ServiceConnection> function1) {
            super(1);
            this.f83660c = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            Object a11;
            lm0.e emitter = (lm0.e) obj;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Y y11 = Y.this;
            ?? r12 = this.f83660c;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                ServiceConnection serviceConnection = (ServiceConnection) r12.invoke(emitter);
                emitter.c(new U(y11, serviceConnection));
                Y.c(y11.f83656a, new W(emitter), serviceConnection);
                a11 = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                emitter.a(b11);
            }
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function1<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f83661b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(Throwable th2) {
            Throwable error = th2;
            Intrinsics.checkNotNullParameter(error, "error");
            return error instanceof TimeoutException ? new C10569b() : error;
        }
    }

    public Y(@NotNull Context context, @NotNull Q appUpdateInfoMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUpdateInfoMapper, "appUpdateInfoMapper");
        this.f83656a = context;
        this.f83657b = appUpdateInfoMapper;
        this.f83658c = kotlin.collections.U.j(new Pair("ru.vk.store.qa", "ede11cc1950c698f92325ffba8a7c1152943d6f19ea714e2496703050395edb8"), new Pair("ru.vk.store", "661f20828ef780de0b79bc59f26a30864316355f30e4f91cfa14a20791839914"));
    }

    public static final void c(Context context, W w11, ServiceConnection serviceConnection) {
        ComponentName a11;
        PackageManager.ResolveInfoFlags of2;
        List queryIntentServices;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z11 = C11151b.a(context, "ru.vk.store.qa") || C11151b.a(context, "ru.vk.store");
        lm0.e<Object> eVar = w11.f83647b;
        if (!z11) {
            wl0.d error = new wl0.d();
            Intrinsics.checkNotNullParameter(error, "error");
            eVar.a(error);
            Unit unit = Unit.f71690a;
            return;
        }
        Intent intent = new Intent("ru.vk.store.provider.appupdate.RemoteAppUpdateFlowProvider");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of2 = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentServices = packageManager.queryIntentServices(intent, of2);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "packageManager\n         ….ResolveInfoFlags.of(0L))");
            a11 = C11150a.a(queryIntentServices);
        } else {
            List<ResolveInfo> queryIntentServices2 = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices2, "packageManager\n         …IntentServices(intent, 0)");
            a11 = C11150a.a(queryIntentServices2);
        }
        if (a11 != null) {
            intent.setComponent(a11);
            context.bindService(intent, serviceConnection, 1);
        } else {
            wl0.e error2 = new wl0.e();
            Intrinsics.checkNotNullParameter(error2, "error");
            eVar.a(error2);
            Unit unit2 = Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r8 = r8.getApkContentsSigners();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(String str, Function1<? super Intent, Unit> function1) {
        Object obj;
        String str2;
        boolean equalsIgnoreCase;
        int i11;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        Signature[] signatureArr2;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean z11;
        Intent intent = new Intent(str);
        if (function1 != null) {
            function1.invoke(intent);
        }
        Context context = this.f83656a;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(this, 0)");
        ?? r22 = this.f83658c;
        Iterator it = r22.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str3 = (String) obj;
            if (!(queryIntentActivities instanceof Collection) || !queryIntentActivities.isEmpty()) {
                Iterator<T> it2 = queryIntentActivities.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.d(((ResolveInfo) it2.next()).activityInfo.packageName, str3)) {
                        String str4 = (String) r22.get(str3);
                        if (str4 != null) {
                            try {
                                i11 = Build.VERSION.SDK_INT;
                                packageInfo = i11 >= 28 ? context.getPackageManager().getPackageInfo(str3, 134217728) : context.getPackageManager().getPackageInfo(str3, 64);
                            } catch (Exception unused) {
                            }
                            if (i11 >= 28) {
                                signingInfo = packageInfo.signingInfo;
                                if (signingInfo == null || signatureArr2 == null) {
                                    signingInfo2 = packageInfo.signingInfo;
                                    if (signingInfo2 != null) {
                                        signatureArr = signingInfo2.getSigningCertificateHistory();
                                    } else {
                                        signatureArr2 = null;
                                    }
                                }
                                if (signatureArr2 != null && signatureArr2.length != 0) {
                                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(signatureArr2[0].toByteArray());
                                    Intrinsics.checkNotNullExpressionValue(digest, "digest");
                                    str2 = C7705l.O(digest, "", C9297h.f83683b, 30);
                                    if (str2 != null) {
                                        equalsIgnoreCase = str4.equalsIgnoreCase(str2);
                                        if (equalsIgnoreCase) {
                                            z11 = true;
                                        }
                                    }
                                }
                                str2 = null;
                                if (str2 != null) {
                                }
                            } else {
                                signatureArr = packageInfo.signatures;
                            }
                            signatureArr2 = signatureArr;
                            if (signatureArr2 != null) {
                                byte[] digest2 = MessageDigest.getInstance("SHA-256").digest(signatureArr2[0].toByteArray());
                                Intrinsics.checkNotNullExpressionValue(digest2, "digest");
                                str2 = C7705l.O(digest2, "", C9297h.f83683b, 30);
                                if (str2 != null) {
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                        }
                        equalsIgnoreCase = false;
                        if (equalsIgnoreCase) {
                        }
                    }
                }
            }
            z11 = false;
            if (z11) {
                break;
            }
        }
        String str5 = (String) obj;
        if (str5 != null) {
            return intent.setPackage(str5);
        }
        return null;
    }

    public final <T> AbstractC7971a<T> b(Function1<? super lm0.e<T>, ? extends ServiceConnection> function1) {
        a source = new a(function1);
        Intrinsics.checkNotNullParameter(source, "source");
        lm0.b bVar = new lm0.b(source);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return lm0.l.a(lm0.v.a(bVar), b.f83661b);
    }
}
