package k5;

import Mm0.e;
import Ve.Sp;
import android.content.Context;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes8.dex */
public final class m3<T> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f70782a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final R2 f70783b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final G0 f70784c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final ArrayList f70785d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    final TreeMap f70786e;

    /* JADX WARN: Multi-variable type inference failed */
    public m3(@NonNull Context context, @NonNull Sp sp, @NonNull R2 r22, @NonNull G0 g02, @NonNull A1 a12) {
        Object c7546n2;
        Object p3Var;
        Object c7548o0;
        Object c7559r0;
        TreeMap treeMap;
        InterfaceC7576v1 c7507e;
        InterfaceC7576v1 interfaceC7576v1;
        this.f70782a = context;
        this.f70783b = r22;
        this.f70784c = g02;
        TreeMap treeMap2 = new TreeMap(new e.a());
        Iterator it = sp.a().iterator();
        while (it.hasNext()) {
            Mm0.e eVar = (Mm0.e) it.next();
            if (eVar.d() == null) {
                HashSet a11 = sp.a();
                Mm0.c cVar = Mm0.c.TWO_DAYS;
                Context context2 = this.f70782a;
                WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                LocationManager locationManager = (LocationManager) context2.getSystemService("location");
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                Objects.requireNonNull(audioManager);
                TelecomManager telecomManager = (TelecomManager) context2.getSystemService("telecom");
                l3 l3Var = new l3(context2);
                C7494a2.b();
                Iterator it2 = it;
                new HashMap(4);
                G1 g12 = new G1(context2);
                W0 w02 = W0.f22transient;
                TreeMap treeMap3 = treeMap2;
                AbstractC7520h0 a13 = K.a(w02, context2);
                AbstractC7520h0 a14 = K.a(W0.f21final, context2);
                b3 b3Var = new b3(context2);
                int i11 = T1.f70646a[eVar.ordinal()];
                G0 g03 = this.f70784c;
                switch (i11) {
                    case 1:
                        c7546n2 = new X0(a11);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 2:
                        c7546n2 = new C7592z1(sp, context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 3:
                        c7546n2 = new Q1(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 4:
                        c7546n2 = new C7554p2(Mm0.e.UnknownSources);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 5:
                        c7546n2 = new C7549o1(sp, context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 6:
                        c7546n2 = new C0(context2, a13);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 7:
                        c7546n2 = new L(context2, a13, telephonyManager, sp);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 8:
                        c7546n2 = new C7526i2();
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 9:
                        c7546n2 = new C7509e1(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 10:
                        c7546n2 = new J(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 11:
                        c7546n2 = new Q(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 12:
                        c7546n2 = new C7532k0(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 13:
                        c7546n2 = new W1(Mm0.e.DeviceModel);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 14:
                        c7546n2 = new C7514f2(Mm0.e.DeviceSystemName);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 15:
                        c7546n2 = new C7530j2(Mm0.e.DeviceSystemVersion);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 16:
                        c7546n2 = new S1(Mm0.e.Languages);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 17:
                        c7546n2 = new k3(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 18:
                        p3Var = new p3(a11, new C7534k2(context2, wifiManager), new u3(wifiManager), new C7493a1(wifiManager), new C7536l0(wifiManager));
                        treeMap = treeMap3;
                        c7546n2 = p3Var;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 19:
                        c7548o0 = new C7548o0(context2, Mm0.e.CellTowerId, a13, b3Var, g03);
                        treeMap = treeMap3;
                        c7546n2 = c7548o0;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 20:
                        c7548o0 = new L1(context2, Mm0.e.CellIdentities, a13, b3Var, g03);
                        treeMap = treeMap3;
                        c7546n2 = c7548o0;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 21:
                        c7546n2 = new M2(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 22:
                        c7546n2 = new C7522h2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 23:
                        c7546n2 = new q3(a11, context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 24:
                        c7546n2 = new C7489H(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        c7546n2 = new P(context2, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        c7546n2 = new K1(a14);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        c7546n2 = new E2(Mm0.e.SDK_VERSION);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 28:
                        c7559r0 = new C7559r0(context2, Mm0.d.Basic, this.f70783b, g03);
                        c7546n2 = c7559r0;
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 29:
                        c7546n2 = new C7528j0(Mm0.e.MultitaskingSupported);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        c7546n2 = new C7566t(context2, a14);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        c7546n2 = new C7531k(Mm0.e.AppSetIdScopeApp, context2, a14);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 32:
                        c7546n2 = new C7547o(Mm0.e.AppSetIdScopeDeveloper, context2, a14);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 33:
                        c7546n2 = new C7553p1(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 34:
                        p3Var = new O(a11, context2, K.a(w02, context2), cVar, locationManager, new s3(context2, a14, locationManager, cVar), new C7498b2(context2, a14, locationManager, cVar), new C7524i0(context2, a14, locationManager, cVar), new U(context2, a14, locationManager, cVar), new C7519h(context2, a14, locationManager, cVar), new C7527j(context2, a14, locationManager, cVar), new C7529j1(context2, a14, locationManager, cVar), new S(context2, a14, locationManager, cVar), new P0(context2, locationManager), new S0(context2, a14, locationManager, cVar));
                        treeMap = treeMap3;
                        c7546n2 = p3Var;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        c7546n2 = new H1(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        c7546n2 = new C7523i(Mm0.e.AgentBrand);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        c7546n2 = new C7491a(Mm0.e.AgentBootTime);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 38:
                        c7546n2 = new C7510e2(Mm0.e.TimeZone);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        c7546n2 = new C7541m1(Mm0.e.SupportedAPILevel);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 40:
                        c7546n2 = new T0(Mm0.e.OSCodeName);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 41:
                        c7546n2 = new r(sp, context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 42:
                        c7546n2 = new C7533k1(a13);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 43:
                        c7546n2 = new C7513f1(a13);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        c7546n2 = new C7506d2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        c7546n2 = new V1(Mm0.e.TimeZoneDSTOffset);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 46:
                        c7546n2 = new C7586y(a13, telephonyManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 47:
                        c7548o0 = new C7511f(context2, Mm0.e.AgentSignalStrengthCellular, a13, b3Var, g03);
                        treeMap = treeMap3;
                        c7546n2 = c7548o0;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 48:
                        c7546n2 = new C7570u(connectivityManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 49:
                        c7548o0 = new C7515g(context2, Mm0.e.AgentSignalTypeCellular, a13, b3Var, g03);
                        treeMap = treeMap3;
                        c7546n2 = c7548o0;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 50:
                        c7546n2 = new C7538l2(Mm0.e.LocalIPv4);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 51:
                        c7546n2 = new C2(Mm0.e.LocalIPv6);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 52:
                        c7546n2 = new C7574v(connectivityManager);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 53:
                        c7546n2 = new U0(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 54:
                        c7546n2 = new Q0(new U0(context2));
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 55:
                        c7546n2 = new S2(Mm0.e.LocationHash);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 56:
                        c7559r0 = new C7543n(context2, a13, sp);
                        c7546n2 = c7559r0;
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 57:
                        c7546n2 = new C7588y1(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 58:
                        c7546n2 = new N2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 59:
                        c7546n2 = new D2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 60:
                        Pm0.b bVar = Pm0.b.None;
                        if (Build.VERSION.SDK_INT >= 31) {
                            interfaceC7576v1 = new C7492a0(audioManager);
                        } else {
                            int i12 = C7544n0.f70790a[bVar.ordinal()];
                            if (i12 == 1) {
                                c7507e = new C7507e(audioManager, new U1());
                            } else if (i12 != 2) {
                                interfaceC7576v1 = new C7483B(audioManager);
                            } else {
                                c7507e = new Z0(context2, audioManager, new U1());
                            }
                            interfaceC7576v1 = c7507e;
                        }
                        c7546n2 = new n3(context2, telecomManager, interfaceC7576v1, g03);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 61:
                        c7559r0 = new I0(a11, context2, a13);
                        c7546n2 = c7559r0;
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 62:
                        c7546n2 = new C7495b(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 63:
                        c7546n2 = new C7583x0(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        c7546n2 = new j3(l3Var);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        c7546n2 = new e3(l3Var);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 66:
                        c7546n2 = new C1(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 67:
                        c7546n2 = new f3(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 68:
                        Object a3Var = new a3(g12, a13);
                        treeMap = treeMap3;
                        c7546n2 = a3Var;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 69:
                        c7546n2 = new B2(Mm0.e.BootId);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 70:
                        c7546n2 = new I2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 71:
                        c7546n2 = new N1(a11);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 72:
                        c7546n2 = new i3(a11, context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                        c7546n2 = new U2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 74:
                        c7546n2 = new M0(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 75:
                        c7546n2 = new G2(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 76:
                        try {
                            C7546n2.y(context2);
                        } catch (C7502c2 unused) {
                        }
                        c7546n2 = new C7546n2(Mm0.e.ScreenshotCounter);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    case 77:
                        c7546n2 = new C7567t0(context2);
                        treeMap = treeMap3;
                        treeMap.put(eVar, c7546n2);
                        treeMap2 = treeMap;
                        it = it2;
                        break;
                    default:
                        throw new IllegalArgumentException("Not found provider for parameter type: " + eVar);
                }
            }
        }
        TreeMap treeMap4 = treeMap2;
        this.f70786e = treeMap4;
        ArrayList arrayList = new ArrayList();
        for (D0 d02 : treeMap4.values()) {
            if (d02 instanceof InterfaceC7518g2) {
                if (d02 instanceof O0) {
                    try {
                        d02.t();
                    } catch (P2 unused2) {
                    }
                }
                arrayList.add((InterfaceC7518g2) d02);
            }
        }
        this.f70785d = arrayList;
    }

    public final String a() throws Nm0.a {
        Serializable serializable;
        TreeMap treeMap = this.f70786e;
        Mm0.e[] eVarArr = (Mm0.e[]) treeMap.keySet().toArray(new Mm0.e[0]);
        String a11 = C7563s0.a(new byte[]{-74, -46, 21, -18, -105, 10, -11, 122, -66, -29, -38, 29, -106, 5, 33, 9, 10, -100, -30, 59, -7, 28, 88, 59, -80, 27, 56, 115, -74, 66, -73, 101});
        G0 g02 = this.f70784c;
        g02.c(a11);
        Om0.a aVar = new Om0.a();
        HashMap hashMap = new HashMap();
        for (Mm0.e eVar : eVarArr) {
            D0 d02 = (D0) treeMap.get(eVar);
            if (d02 == null) {
                throw new IllegalArgumentException(C7563s0.a(new byte[]{-74, -105, 21, -127, -26, 59, -62, -3, 17, 60, 97, 76, -115, -73, -36, 20}) + eVar.name() + C7563s0.a(new byte[]{71, -61, 18, 32, -87, 112, -77, -85, -88, 118, 5, 74, -72, -117, 52, -48, 11, -112, -6, 11, -24, 49, 123, 85, 16, -2, -59, 120, 120, 71, 22, -11, -7, 120, -92, 73, -57, 103, -96, 99, -100, 30, 111, -47, -32, -39, -10, -45}));
            }
            String name = eVar.name();
            try {
                serializable = d02.u();
            } catch (D1 e11) {
                Serializable a12 = !eVar.f() ? null : e11.a(eVar);
                hashMap.put(eVar, e11);
                g02.b(eVar, e11);
                serializable = a12;
            }
            if (serializable != null) {
                aVar.put(name, serializable);
            } else {
                aVar.remove(name);
            }
        }
        try {
            Mm0.e eVar2 = Mm0.e.GoogleServicesParameters;
            Boolean bool = Boolean.TRUE;
            Nm0.b.a(aVar, eVar2, "%s", bool);
            Nm0.b.a(aVar, Mm0.e.HoursSinceInstall, "%s", Boolean.FALSE);
            Nm0.b.a(aVar, Mm0.e.Default, "HoursSince%sInstall", bool);
            Nm0.b.a(aVar, Mm0.e.Custom, "HoursSince%sInstall", bool);
            JsonObject c11 = Nm0.e.c(Nm0.e.d(aVar));
            Mm0.e eVar3 = Mm0.e.LocationHash;
            if (aVar.containsKey(eVar3.name())) {
                c11.remove(eVar3.name());
                c11.addProperty(eVar3.name(), Nm0.e.b(c11, ""));
            }
            String jSONObject = new JSONObject(Nm0.e.d(c11)).toString();
            com.google.gson.f fVar = new com.google.gson.f();
            fVar.f(com.google.gson.r.LONG_OR_DOUBLE);
            fVar.b();
            String d11 = Nm0.e.d((JsonElement) fVar.a().d(jSONObject, JsonObject.class));
            g02.c(C7563s0.a(new byte[]{14, 124, 110, -19, 82, -95, 31, -9, 121, -94, -74, -48, -99, -6, 108, 43}));
            return d11;
        } catch (JSONException e12) {
            throw new Nm0.a(e12.getMessage());
        }
    }

    public final void b() {
        Iterator it = this.f70785d.iterator();
        while (it.hasNext()) {
            ((InterfaceC7518g2) it.next()).e();
        }
    }

    public final void c() {
        for (Object obj : this.f70786e.values()) {
            if (obj instanceof InterfaceC7590z) {
                ((InterfaceC7590z) obj).k();
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
