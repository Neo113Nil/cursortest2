package i8;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import f8.l;
import g6.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import s7.r1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a9.a f11009a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f11010b = null;

    public c(a9.a aVar) {
        this.f11009a = aVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f11003a;
        String str2 = bVar.f11004b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f11003a.equals(str) && bVar2.f11004b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        l8.c cVar = (l8.c) ((l8.b) this.f11009a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((j1) cVar.f19409a.f22318b).f("frc", "")) {
            l lVar = m8.b.f20497a;
            v.h(bundle);
            l8.a aVar = new l8.a();
            String str = (String) r1.e(bundle, "origin", String.class, null);
            v.h(str);
            aVar.f19394a = str;
            String str2 = (String) r1.e(bundle, "name", String.class, null);
            v.h(str2);
            aVar.f19395b = str2;
            aVar.f19396c = r1.e(bundle, "value", Object.class, null);
            aVar.f19397d = (String) r1.e(bundle, "trigger_event_name", String.class, null);
            aVar.f19398e = ((Long) r1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f19399f = (String) r1.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f19400g = (Bundle) r1.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f19401h = (String) r1.e(bundle, "triggered_event_name", String.class, null);
            aVar.f19402i = (Bundle) r1.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) r1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f19403k = (String) r1.e(bundle, "expired_event_name", String.class, null);
            aVar.f19404l = (Bundle) r1.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f19406n = ((Boolean) r1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f19405m = ((Long) r1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f19407o = ((Long) r1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.os.Bundle, java.lang.String] */
    public final void c(ArrayList arrayList) {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        String str;
        String str2;
        String str3;
        a9.a aVar = this.f11009a;
        if (aVar.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                Object obj = null;
                if (arrayList2.isEmpty()) {
                    if (aVar.get() == null) {
                        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        String str4 = ((l8.a) it2.next()).f19395b;
                        j1 j1Var = (j1) ((l8.c) ((l8.b) aVar.get())).f19409a.f22318b;
                        j1Var.c(new x0(j1Var, str4, null, null, 0));
                    }
                    return;
                }
                if (aVar.get() == null) {
                    throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList b10 = b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = b10.iterator();
                while (it3.hasNext()) {
                    l8.a aVar2 = (l8.a) it3.next();
                    String[] strArr = b.f11001g;
                    String str5 = aVar2.f19397d;
                    arrayList3.add(new b(aVar2.f19395b, String.valueOf(aVar2.f19396c), str5 != null ? str5 : "", new Date(aVar2.f19405m), aVar2.f19398e, aVar2.j));
                    obj = obj;
                }
                ?? r21 = obj;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    b bVar = (b) it4.next();
                    if (!a(arrayList2, bVar)) {
                        arrayList4.add(bVar.a());
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    String str6 = ((l8.a) it5.next()).f19395b;
                    j1 j1Var2 = (j1) ((l8.c) ((l8.b) aVar.get())).f19409a.f22318b;
                    j1Var2.c(new x0(j1Var2, str6, r21, r21, 0));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    b bVar2 = (b) it6.next();
                    if (!a(arrayList3, bVar2)) {
                        arrayList5.add(bVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f11010b == null) {
                    this.f11010b = Integer.valueOf(((j1) ((l8.c) ((l8.b) aVar.get())).f19409a.f22318b).b("frc"));
                }
                int intValue = this.f11010b.intValue();
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    b bVar3 = (b) it7.next();
                    while (arrayDeque.size() >= intValue) {
                        String str7 = ((l8.a) arrayDeque.pollFirst()).f19395b;
                        j1 j1Var3 = (j1) ((l8.c) ((l8.b) aVar.get())).f19409a.f22318b;
                        j1Var3.c(new x0(j1Var3, str7, r21, r21, 0));
                    }
                    l8.a a7 = bVar3.a();
                    l8.c cVar = (l8.c) ((l8.b) aVar.get());
                    cVar.getClass();
                    l lVar = m8.b.f20497a;
                    String str8 = a7.f19394a;
                    if (!str8.isEmpty()) {
                        Object obj2 = a7.f19396c;
                        if (obj2 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj2);
                                    objectOutputStream.flush();
                                    objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = r21;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = r21;
                                objectInputStream = objectOutputStream;
                            }
                            try {
                                Object obj3 = objectInputStream2.readObject();
                                try {
                                    objectOutputStream.close();
                                    objectInputStream2.close();
                                } catch (IOException | ClassNotFoundException unused) {
                                    obj3 = r21;
                                }
                                if (obj3 == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                objectInputStream = objectInputStream2;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (objectInputStream != 0) {
                                    objectInputStream.close();
                                }
                                throw th;
                            }
                        }
                        if (!m8.b.f20498b.contains(str8) && m8.b.b(str8, a7.f19395b) && (((str = a7.f19403k) == null || (m8.b.a(a7.f19404l, str) && m8.b.c(str8, a7.f19403k, a7.f19404l))) && (((str2 = a7.f19401h) == null || (m8.b.a(a7.f19402i, str2) && m8.b.c(str8, a7.f19401h, a7.f19402i))) && ((str3 = a7.f19399f) == null || (m8.b.a(a7.f19400g, str3) && m8.b.c(str8, a7.f19399f, a7.f19400g)))))) {
                            r7.a aVar3 = cVar.f19409a;
                            Bundle bundle = new Bundle();
                            bundle.putString("origin", a7.f19394a);
                            String str9 = a7.f19395b;
                            if (str9 != null) {
                                bundle.putString("name", str9);
                            }
                            Object obj4 = a7.f19396c;
                            if (obj4 != null) {
                                r1.c(bundle, obj4);
                            }
                            String str10 = a7.f19397d;
                            if (str10 != null) {
                                bundle.putString("trigger_event_name", str10);
                            }
                            bundle.putLong("trigger_timeout", a7.f19398e);
                            String str11 = a7.f19399f;
                            if (str11 != null) {
                                bundle.putString("timed_out_event_name", str11);
                            }
                            Bundle bundle2 = a7.f19400g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str12 = a7.f19401h;
                            if (str12 != null) {
                                bundle.putString("triggered_event_name", str12);
                            }
                            Bundle bundle3 = a7.f19402i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", a7.j);
                            String str13 = a7.f19403k;
                            if (str13 != null) {
                                bundle.putString("expired_event_name", str13);
                            }
                            Bundle bundle4 = a7.f19404l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", a7.f19405m);
                            bundle.putBoolean("active", a7.f19406n);
                            bundle.putLong("triggered_timestamp", a7.f19407o);
                            j1 j1Var4 = (j1) aVar3.f22318b;
                            j1Var4.c(new w0(j1Var4, bundle));
                        }
                    }
                    arrayDeque.offer(a7);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = b.f11001g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.f11001g;
            for (int i5 = 0; i5 < 5; i5++) {
                String str14 = strArr3[i5];
                if (!map.containsKey(str14)) {
                    arrayList6.add(str14);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.f11002h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e7) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e7);
            } catch (ParseException e9) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e9);
            }
        }
    }
}
