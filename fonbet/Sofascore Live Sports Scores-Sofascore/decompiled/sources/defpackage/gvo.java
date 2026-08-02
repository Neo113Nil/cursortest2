package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cloudmessaging.RegisterRequest;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzno;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zzns;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzs;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.cloudmessaging.zzc;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.internal.cloudmessaging.zzm;
import com.google.android.gms.internal.cloudmessaging.zzn;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gvo implements RemoteCall, OnCompleteListener, zzeb, zzjp, zzec, wcn, uap, zzdu, Continuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public gvo(IBinder iBinder) {
        this.a = 9;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new zzd(iBinder);
            this.b = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            hbo.n();
            throw null;
        }
    }

    public static String d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        String name = cls.getName();
        return wt3.m("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ", name, new StringBuilder(name.length() + Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class");
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public void a(long j, Bundle bundle, String str, String str2) {
        try {
            ((zzcy) this.b).z2(j, bundle, str, str2);
        } catch (RemoteException e) {
            zzic zzicVar = ((AppMeasurementDynamiteService) this.c).a;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.b(e, "Event interceptor threw exception");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzec
    public /* synthetic */ void b(Object obj, zzs zzsVar) {
        zznt zzntVar = (zznt) obj;
        zzntVar.o((zzno) this.c, new zzns(zzsVar, ((zzpv) this.b).e));
    }

    public String c() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                a70.p("Invalid application ID: ".concat(str));
                return null;
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection<String> collection = (Collection) this.c;
        boolean z = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                a70.p("Must specify at least one namespace");
                return null;
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String str2 : collection) {
                CastUtils.b(str2);
                if (!z3) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                if (!CastUtils.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (defpackage.ktm.N(r0[0]) != java.lang.String.class) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public icp e(z6n z6nVar, boolean z) {
        icp xtoVar;
        String sb;
        Map map = (Map) this.b;
        Type type = z6nVar.b;
        Class cls = z6nVar.a;
        icp icpVar = null;
        if (map.get(type) != null) {
            pvd.j();
            return null;
        }
        if (map.get(cls) != null) {
            pvd.j();
            return null;
        }
        icp n1pVar = EnumSet.class.isAssignableFrom(cls) ? new n1p(type, 3) : cls == EnumMap.class ? new ta3(type) : null;
        if (n1pVar != null) {
            return n1pVar;
        }
        int V = b0a.V(cls, (List) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                if (V == 1 || (ocp.a.a(null, declaredConstructor) && (V != 4 || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    if (V == 1) {
                        vha vhaVar = f6n.a;
                        try {
                            declaredConstructor.setAccessible(true);
                            sb = null;
                        } catch (Exception e) {
                            String d = f6n.d(declaredConstructor);
                            int length = d.length();
                            String message = e.getMessage();
                            String e2 = f6n.e(e);
                            StringBuilder sb2 = new StringBuilder(length + 145 + String.valueOf(message).length() + e2.length());
                            bf3.v(sb2, "Failed making constructor '", d, "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ", message);
                            sb2.append(e2);
                            sb = sb2.toString();
                        }
                        if (sb != null) {
                            xtoVar = new kn3(sb);
                        }
                    }
                    xtoVar = new xto(declaredConstructor, 8);
                } else {
                    String valueOf = String.valueOf(cls);
                    xtoVar = new kn3(wt3.m("Unable to invoke no-args constructor of ", valueOf, new StringBuilder(valueOf.length() + 266), "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
            }
            if (xtoVar == null) {
                return xtoVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                if (cls.isAssignableFrom(ArrayList.class)) {
                    icpVar = new icp() { // from class: rap
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new ArrayList();
                        }
                    };
                } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                    icpVar = new icp() { // from class: dbp
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new LinkedHashSet();
                        }
                    };
                } else if (cls.isAssignableFrom(TreeSet.class)) {
                    icpVar = new icp() { // from class: ibp
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new TreeSet();
                        }
                    };
                } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                    icpVar = new icp() { // from class: qap
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new ArrayDeque();
                        }
                    };
                }
            } else if (Map.class.isAssignableFrom(cls)) {
                if (cls.isAssignableFrom(gcp.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    icpVar = new icp() { // from class: xap
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new gcp();
                        }
                    };
                }
                if (cls.isAssignableFrom(LinkedHashMap.class)) {
                    icpVar = new icp() { // from class: bbp
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new LinkedHashMap();
                        }
                    };
                } else if (cls.isAssignableFrom(TreeMap.class)) {
                    icpVar = new icp() { // from class: gbp
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new TreeMap();
                        }
                    };
                } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                    icpVar = new icp() { // from class: sap
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new ConcurrentHashMap();
                        }
                    };
                } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    icpVar = new icp() { // from class: tap
                        @Override // defpackage.icp
                        public final /* synthetic */ Object zza() {
                            return new ConcurrentSkipListMap();
                        }
                    };
                }
            }
            if (icpVar != null) {
                return icpVar;
            }
            String d2 = d(cls);
            if (d2 != null) {
                return new kn3(d2);
            }
            if (!z) {
                String valueOf2 = String.valueOf(cls);
                return new kn3(wt3.m("Unable to create instance of ", valueOf2, new StringBuilder(valueOf2.length() + 90), "; Register an InstanceCreator or a TypeAdapter for this type."));
            }
            if (V == 1) {
                return new gmo(cls, 11);
            }
            String valueOf3 = String.valueOf(cls);
            return new kn3(wt3.m("Unable to create instance of ", valueOf3, new StringBuilder(valueOf3.length() + 211), "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."));
        }
        xtoVar = null;
        if (xtoVar == null) {
        }
    }

    public zzcl f(Activity activity, it7 it7Var) {
        z41 z41Var = new z41((Application) this.b, 15);
        boolean z = true;
        if (!zzdb.a() && !((ArrayList) z41Var.b).contains(zzct.a((Context) z41Var.c))) {
            z = false;
        }
        return d1p.a(new d1p(this, activity, new r0a(z, z41Var), it7Var));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        qbp qbpVar = (qbp) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (qbpVar.f) {
            qbpVar.e.remove(taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Rpc rpc = (Rpc) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        int i = Rpc.h;
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : rpc.b(bundle).onSuccessTask(g35.d, fff.b);
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return ((Map) this.b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        int i;
        switch (this.a) {
            case 1:
                zzm zzmVar = (zzm) this.b;
                com.google.android.gms.internal.cloudmessaging.zzd zzdVar = (com.google.android.gms.internal.cloudmessaging.zzd) anyClient;
                doo dooVar = new doo(zzmVar, taskCompletionSource);
                Context context = zzmVar.a;
                try {
                    i = Wrappers.a(context).b(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                RegisterRequest registerRequest = (RegisterRequest) this.c;
                registerRequest.f = i;
                zze zzeVar = (zze) zzdVar.getService();
                zzdVar.getContext();
                int i2 = zzn.a;
                Parcelable.Creator<ComplianceOptions> creator = ComplianceOptions.CREATOR;
                ComplianceOptions a = new ComplianceOptions.Builder().a();
                Parcelable.Creator<ApiMetadata> creator2 = ApiMetadata.CREATOR;
                ApiMetadata.Builder builder = new ApiMetadata.Builder();
                builder.a = a;
                ApiMetadata a2 = builder.a();
                ApiMetadata.Builder builder2 = new ApiMetadata.Builder();
                builder2.a = a2.a;
                builder2.c = a2.c;
                builder2.b = true;
                ApiMetadata a3 = builder2.a();
                zzeVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i3 = zzc.a;
                obtain.writeStrongBinder(dooVar);
                obtain.writeInt(1);
                registerRequest.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                a3.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    zzeVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                iyo iyoVar = new iyo((vyo) this.b, taskCompletionSource);
                zxo zxoVar = (zxo) ((wyo) anyClient).getService();
                Bundle bundle = (Bundle) this.c;
                vxo vxoVar = (vxo) zxoVar;
                Parcel J = vxoVar.J();
                int i4 = avo.a;
                J.writeInt(1);
                bundle.writeToParcel(J, 0);
                avo.b(J, iyoVar);
                try {
                    vxoVar.a.transact(1, J, null, 1);
                    return;
                } finally {
                    J.recycle();
                }
        }
    }

    @Override // defpackage.uap
    public int zza(Object obj) {
        zzvs zzvsVar = (zzvs) obj;
        HashMap hashMap = zzwl.a;
        Context context = (Context) this.b;
        zzv zzvVar = (zzv) this.c;
        String str = zzvsVar.b;
        return ((str.equals(zzvVar.o) || str.equals(zzwl.d(zzvVar))) && zzvsVar.f(context, zzvVar, false) && zzvsVar.g(zzvVar)) ? 1 : 0;
    }

    @Override // defpackage.wcn
    public Object zza() {
        return new t3p(((qc4) ((mxn) this.b).b).b, (h6p) ((wcn) this.c).zza());
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 6:
                ((zznt) obj).n((zznr) this.b, (zzxk) this.c);
                break;
            default:
                ((zzxz) obj).b(0, ((zzxy) this.b).a, (zzxk) this.c);
                break;
        }
    }

    public /* synthetic */ gvo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public gvo(WebImage webImage) {
        this.a = 0;
        this.b = webImage == null ? null : webImage.b;
    }

    public gvo(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar) {
        this.a = 7;
        this.c = appMeasurementDynamiteService;
        this.b = zzcyVar;
    }

    public gvo(zzoc zzocVar) {
        this.a = 4;
        this.c = zzocVar;
    }
}
