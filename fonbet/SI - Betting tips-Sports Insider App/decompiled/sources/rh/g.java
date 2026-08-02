package rh;

import a2.q;
import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h0;
import androidx.appcompat.widget.c1;
import androidx.core.view.y0;
import androidx.core.view.z0;
import e3.f0;
import e3.i0;
import e3.y;
import eg.c0;
import eg.y1;
import gh.t0;
import gh.u;
import hf.r;
import io.sentry.android.replay.d0;
import io.sentry.z4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import jg.t;
import k2.x;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import m3.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f22527a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f22528b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22529c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f22530d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONArray f22531e;

    public static final i0 A(int i5) {
        if (i5 == 0) {
            return i0.f8524a;
        }
        if (i5 == 1) {
            return i0.f8525b;
        }
        if (i5 == 2) {
            return i0.f8526c;
        }
        if (i5 == 3) {
            return i0.f8527d;
        }
        if (i5 == 4) {
            return i0.f8528e;
        }
        if (i5 == 5) {
            return i0.f8529f;
        }
        throw new IllegalArgumentException(d9.e.f(i5, "Could not convert ", " to State"));
    }

    public static final ArrayList C(Map map, Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            y1.k kVar = (y1.k) entry.getValue();
            Boolean valueOf = kVar != null ? Boolean.valueOf(kVar.f25579b) : null;
            Intrinsics.checkNotNull(valueOf);
            if (!valueOf.booleanValue() && !kVar.f25580c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int D(y networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int ordinal = networkType.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i5 = 1;
        if (ordinal != 1) {
            i5 = 2;
            if (ordinal != 2) {
                i5 = 3;
                if (ordinal != 3) {
                    i5 = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && networkType == y.f8577f) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                }
            }
        }
        return i5;
    }

    public static k1.b F(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i5 = duplicate.getShort() & 65535;
        if (i5 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                j = -1;
                break;
            }
            int i11 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j6 = duplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j6; i12++) {
                int i13 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    duplicate.position((int) (j10 + j));
                    k1.b bVar = new k1.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f1362d = duplicate;
                    bVar.f1359a = position;
                    int i14 = position - duplicate.getInt(position);
                    bVar.f1360b = i14;
                    bVar.f1361c = ((ByteBuffer) bVar.f1362d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ee, code lost:
    
        r0 = kotlin.collections.u0.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f2, code lost:
    
        u6.h.g(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p2.k G(s2.a connection, String tableName) {
        Map c2;
        r rVar;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        s2.c r02 = connection.r0("PRAGMA table_info(`" + tableName + "`)");
        try {
            long j = 0;
            if (r02.n0()) {
                int g10 = x.g(r02, "name");
                int g11 = x.g(r02, "type");
                int g12 = x.g(r02, "notnull");
                int g13 = x.g(r02, "pk");
                int g14 = x.g(r02, "dflt_value");
                hf.i builder = new hf.i();
                do {
                    String V = r02.V(g10);
                    builder.put(V, new p2.h(V, r02.V(g11), r02.getLong(g12) != 0, (int) r02.getLong(g13), r02.isNull(g14) ? null : r02.V(g14), 2));
                } while (r02.n0());
                Intrinsics.checkNotNullParameter(builder, "builder");
                c2 = builder.c();
                u6.h.g(r02, null);
            } else {
                c2 = n0.c();
                u6.h.g(r02, null);
            }
            r02 = connection.r0("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int g15 = x.g(r02, "id");
                int g16 = x.g(r02, "seq");
                int g17 = x.g(r02, "table");
                int g18 = x.g(r02, "on_delete");
                int g19 = x.g(r02, "on_update");
                List a7 = p2.g.a(r02);
                r02.reset();
                r rVar2 = new r();
                while (r02.n0()) {
                    if (r02.getLong(g16) == j) {
                        int i5 = (int) r02.getLong(g15);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = g15;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : a7) {
                            int i11 = g16;
                            List list = a7;
                            if (((p2.f) obj).f21472a == i5) {
                                arrayList3.add(obj);
                            }
                            g16 = i11;
                            a7 = list;
                        }
                        int i12 = g16;
                        List list2 = a7;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            p2.f fVar = (p2.f) it.next();
                            arrayList.add(fVar.f21474c);
                            arrayList2.add(fVar.f21475d);
                        }
                        rVar2.add(new p2.i(r02.V(g17), r02.V(g18), r02.V(g19), arrayList, arrayList2));
                        g15 = i10;
                        g16 = i12;
                        a7 = list2;
                        j = 0;
                    }
                }
                r a10 = u0.a(rVar2);
                u6.h.g(r02, null);
                r02 = connection.r0("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int g20 = x.g(r02, "name");
                    int g21 = x.g(r02, "origin");
                    int g22 = x.g(r02, "unique");
                    if (g20 == -1 || g21 == -1 || g22 == -1) {
                        u6.h.g(r02, null);
                        rVar = null;
                    } else {
                        r rVar3 = new r();
                        while (true) {
                            if (!r02.n0()) {
                                break;
                            }
                            if (Intrinsics.areEqual("c", r02.V(g21))) {
                                p2.j b10 = p2.g.b(connection, r02.V(g20), r02.getLong(g22) == 1);
                                if (b10 == null) {
                                    u6.h.g(r02, null);
                                    rVar = null;
                                    break;
                                }
                                rVar3.add(b10);
                            }
                        }
                    }
                    return new p2.k(tableName, c2, a10, rVar);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public static final byte[] H(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    e3.e eVar = (e3.e) it.next();
                    objectOutputStream.writeUTF(eVar.f8498a.toString());
                    objectOutputStream.writeBoolean(eVar.f8499b);
                }
                Unit unit = Unit.f19194a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final Object I(t tVar, boolean z5, t tVar2, Function2 function2) {
        Object tVar3;
        Object S;
        try {
            tVar3 = !(function2 instanceof mf.a) ? lf.d.c(function2, tVar2, tVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(tVar2, tVar);
        } catch (eg.i0 e7) {
            Throwable th2 = e7.f9179a;
            tVar.Q(new eg.t(th2, false));
            throw th2;
        } catch (Throwable th3) {
            tVar3 = new eg.t(th3, false);
        }
        lf.a aVar = lf.a.f20034a;
        if (tVar3 == aVar || (S = tVar.S(tVar3)) == c0.f9154e) {
            return aVar;
        }
        tVar.k0();
        if (!(S instanceof eg.t)) {
            return c0.z(S);
        }
        if (!z5) {
            Throwable th4 = ((eg.t) S).f9223a;
            if ((th4 instanceof y1) && ((y1) th4).f9244a == tVar) {
                if (tVar3 instanceof eg.t) {
                    throw ((eg.t) tVar3).f9223a;
                }
                return tVar3;
            }
        }
        throw ((eg.t) S).f9223a;
    }

    public static final int J(i0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (v.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new gf.m();
        }
    }

    public static int K(Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i5});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static byte[] L(e3.j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(data.f8532a.size());
                for (Map.Entry entry : data.f8532a.entrySet()) {
                    M(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                Intrinsics.checkNotNull(byteArray);
                return byteArray;
            } finally {
            }
        } catch (IOException e7) {
            e3.x.e().d(e3.k.f8534a, "Error in Data#toByteArray: ", e7);
            return new byte[0];
        }
    }

    public static final void M(DataOutputStream dataOutputStream, String str, Object obj) {
        int i5;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
            }
            Object[] objArr = (Object[]) obj;
            ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(objArr.getClass());
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class))) {
                i5 = 8;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class))) {
                i5 = 9;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class))) {
                i5 = 10;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class))) {
                i5 = 11;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class))) {
                i5 = 12;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class))) {
                i5 = 13;
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + Reflection.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                }
                i5 = 14;
            }
            dataOutputStream.writeByte(i5);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i5 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i5 == 9) {
                    Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i5 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i5 == 11) {
                    Long l6 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l6 != null ? l6.longValue() : 0L);
                } else if (i5 == 12) {
                    Float f6 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f6 != null ? f6.floatValue() : 0.0f);
                } else if (i5 == 13) {
                    Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i5 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final n3.i N(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new n3.i(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i5 = 0; i5 < readInt; i5++) {
                    iArr[i5] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i10 = 0; i10 < readInt2; i10++) {
                    iArr2[i10] = objectInputStream.readInt();
                }
                n3.i a7 = n3.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return a7;
            } finally {
            }
        } finally {
        }
    }

    public static void a(String str) {
        z4.d().a(str);
    }

    public static final LinkedHashSet b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i5 = 0; i5 < readInt; i5++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                Intrinsics.checkNotNull(parse);
                linkedHashSet.add(new e3.e(readBoolean, parse));
            }
            Unit unit = Unit.f19194a;
            objectInputStream.close();
            Unit unit2 = Unit.f19194a;
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static void c(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h0 f(Bundle data, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            switch (type.hashCode()) {
                case -1678407252:
                    if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String jsonString = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            Intrinsics.checkNotNull(jsonString);
                            t0.o oVar = new t0.o(data, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
                            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                            if (jsonString.length() != 0) {
                                try {
                                    new JSONObject(jsonString);
                                    return oVar;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new y0.a();
                        }
                    }
                    throw new y0.a();
                case -1072734346:
                    if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        String jsonString2 = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (jsonString2 == null) {
                            throw new u0.i("The device does not contain a restore credential.");
                        }
                        t0.o oVar2 = new t0.o(data, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                        Intrinsics.checkNotNullParameter(jsonString2, "jsonString");
                        if (jsonString2.length() != 0) {
                            try {
                                new JSONObject(jsonString2);
                                return oVar2;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new y0.a();
                case -543568185:
                    if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            Intrinsics.checkNotNull(string);
                            Intrinsics.checkNotNull(string2);
                            return new t0.t(string, string2, data);
                        } catch (Exception unused4) {
                            throw new y0.a();
                        }
                    }
                    throw new y0.a();
                case -95037569:
                    if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            Intrinsics.checkNotNull(string3);
                            return new t0.v(data, string3);
                        } catch (Exception unused5) {
                            throw new y0.a();
                        }
                    }
                    throw new y0.a();
                default:
                    throw new y0.a();
            }
        } catch (y0.a unused6) {
            return new t0.n(data, type);
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = z0.f1413a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = y0.f1406d;
        y0 y0Var = (y0) view.getTag(com.sports.insider.R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (y0Var == null) {
            y0Var = new y0();
            y0Var.f1407a = null;
            y0Var.f1408b = null;
            y0Var.f1409c = null;
            view.setTag(com.sports.insider.R.id.tag_unhandled_key_event_manager, y0Var);
        }
        WeakReference weakReference2 = y0Var.f1409c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        y0Var.f1409c = new WeakReference(keyEvent);
        if (y0Var.f1408b == null) {
            y0Var.f1408b = new SparseArray();
        }
        SparseArray sparseArray = y0Var.f1408b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.sports.insider.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(androidx.core.view.m mVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z5 = false;
        if (mVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return mVar.e(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f22527a) {
                            try {
                                f22528b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f22527a = true;
                        }
                        Method method = f22528b;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z5 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z5) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (z0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f22529c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f22530d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f22529c = true;
                }
                Field field = f22530d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (z0.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && z0.c(view, keyEvent)) || mVar.e(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static int i(Shader.TileMode tileMode) {
        int i5 = u9.k.f24124a[tileMode.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? r4.k.e(1) : r4.k.e(4) : r4.k.e(3) : r4.k.e(2);
    }

    public static int j(int i5, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i5 + (i5 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: ClassNotFoundException -> 0x005a, IOException -> 0x005c, TRY_LEAVE, TryCatch #6 {IOException -> 0x005c, ClassNotFoundException -> 0x005a, blocks: (B:10:0x0017, B:12:0x002e, B:15:0x0035, B:17:0x003a, B:25:0x0055, B:33:0x0060, B:34:0x0063, B:35:0x0064, B:46:0x0092, B:56:0x00b8, B:57:0x00bb, B:37:0x0069, B:39:0x0071, B:41:0x0078, B:43:0x007e, B:47:0x0096, B:48:0x00a5, B:49:0x00a6, B:50:0x00b5, B:19:0x003f, B:21:0x0045, B:53:0x00b6, B:30:0x005e), top: B:9:0x0017, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[Catch: ClassNotFoundException -> 0x005a, IOException -> 0x005c, TRY_LEAVE, TryCatch #6 {IOException -> 0x005c, ClassNotFoundException -> 0x005a, blocks: (B:10:0x0017, B:12:0x002e, B:15:0x0035, B:17:0x003a, B:25:0x0055, B:33:0x0060, B:34:0x0063, B:35:0x0064, B:46:0x0092, B:56:0x00b8, B:57:0x00bb, B:37:0x0069, B:39:0x0071, B:41:0x0078, B:43:0x007e, B:47:0x0096, B:48:0x00a5, B:49:0x00a6, B:50:0x00b5, B:19:0x003f, B:21:0x0045, B:53:0x00b6, B:30:0x005e), top: B:9:0x0017, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e3.j k(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        byte b10;
        int i5;
        boolean z5;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return e3.j.f8531b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            b10 = (byte) (-21267);
            i5 = 0;
        } catch (IOException e7) {
            e3.x.e().d(e3.k.f8534a, "Error in Data#fromByteArray: ", e7);
        } catch (ClassNotFoundException e9) {
            e3.x.e().d(e3.k.f8534a, "Error in Data#fromByteArray: ", e9);
        }
        if (bArr[0] == ((byte) 16777132)) {
            z5 = true;
            if (bArr[1] == b10) {
                byteArrayInputStream.reset();
                if (z5) {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort != -21521) {
                            throw new IllegalStateException(c1.i(readShort, "Magic number doesn't match: ").toString());
                        }
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            throw new IllegalStateException(c1.i(readShort2, "Unsupported version number: ").toString());
                        }
                        int readInt = dataInputStream.readInt();
                        while (i5 < readInt) {
                            linkedHashMap.put(dataInputStream.readUTF(), l(dataInputStream, dataInputStream.readByte()));
                            i5++;
                        }
                        dataInputStream.close();
                        return new e3.j(linkedHashMap);
                    } finally {
                    }
                } else {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt2 = objectInputStream.readInt();
                        while (i5 < readInt2) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i5++;
                        }
                        objectInputStream.close();
                        return new e3.j(linkedHashMap);
                    } finally {
                    }
                }
            }
        }
        z5 = false;
        byteArrayInputStream.reset();
        if (z5) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable l(DataInputStream dataInputStream, byte b10) {
        if (b10 == 0) {
            return null;
        }
        if (b10 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b10 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b10 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b10 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b10 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b10 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b10 == 7) {
            return dataInputStream.readUTF();
        }
        int i5 = 0;
        if (b10 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r02 = new Boolean[readInt];
            while (i5 < readInt) {
                r02[i5] = Boolean.valueOf(dataInputStream.readBoolean());
                i5++;
            }
            return r02;
        }
        if (b10 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r03 = new Byte[readInt2];
            while (i5 < readInt2) {
                r03[i5] = Byte.valueOf(dataInputStream.readByte());
                i5++;
            }
            return r03;
        }
        if (b10 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r04 = new Integer[readInt3];
            while (i5 < readInt3) {
                r04[i5] = Integer.valueOf(dataInputStream.readInt());
                i5++;
            }
            return r04;
        }
        if (b10 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r05 = new Long[readInt4];
            while (i5 < readInt4) {
                r05[i5] = Long.valueOf(dataInputStream.readLong());
                i5++;
            }
            return r05;
        }
        if (b10 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r06 = new Float[readInt5];
            while (i5 < readInt5) {
                r06[i5] = Float.valueOf(dataInputStream.readFloat());
                i5++;
            }
            return r06;
        }
        if (b10 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r07 = new Double[readInt6];
            while (i5 < readInt6) {
                r07[i5] = Double.valueOf(dataInputStream.readDouble());
                i5++;
            }
            return r07;
        }
        if (b10 != 14) {
            throw new IllegalStateException(c1.i(b10, "Unsupported type "));
        }
        int readInt7 = dataInputStream.readInt();
        ?? r12 = new String[readInt7];
        while (i5 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (Intrinsics.areEqual(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r12[i5] = readUTF;
            i5++;
        }
        return r12;
    }

    public static final byte[] m(n3.i requestCompat) {
        int[] V;
        int[] V2;
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) requestCompat.f20836a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                Intrinsics.checkNotNullParameter(networkRequest, "<this>");
                if (i5 >= 31) {
                    V = n3.h.b(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < 10; i10++) {
                        int i11 = iArr[i10];
                        if (n3.a.d(networkRequest, i11)) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    }
                    V = CollectionsKt.V(arrayList);
                }
                Intrinsics.checkNotNullParameter(networkRequest, "<this>");
                if (Build.VERSION.SDK_INT >= 31) {
                    V2 = n3.h.a(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < 30; i12++) {
                        int i13 = iArr2[i12];
                        if (n3.a.c(networkRequest, i13)) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                    }
                    V2 = CollectionsKt.V(arrayList2);
                }
                objectOutputStream.writeInt(V.length);
                for (int i14 : V) {
                    objectOutputStream.writeInt(i14);
                }
                objectOutputStream.writeInt(V2.length);
                for (int i15 : V2) {
                    objectOutputStream.writeInt(i15);
                }
                Unit unit = Unit.f19194a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static u n(SSLSession sSLSession) {
        Object obj;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        gh.j d10 = gh.j.f10212b.d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (Intrinsics.areEqual("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        t0.f10307b.getClass();
        t0 e7 = gh.o.e(protocol);
        try {
            obj = hh.g.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = e0.f19204a;
        }
        return new u(e7, d10, hh.g.k(sSLSession.getLocalCertificates()), new q(18, obj));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [gf.i, java.lang.Object] */
    public static final Window r(View view) {
        Field field;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object obj = d0.f16023a;
        View maybeDecorView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(maybeDecorView, "getRootView(...)");
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class cls = (Class) d0.f16023a.getValue();
        if (cls == null || !cls.isInstance(maybeDecorView) || (field = (Field) d0.f16024b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(maybeDecorView);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    public static SharedPreferences s(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final a6.f u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return new a6.f(context, null, a6.f.f83l, d6.b.f8244d0, d6.f.f8246c);
    }

    public static final e3.a v(int i5) {
        if (i5 == 0) {
            return e3.a.f8471a;
        }
        if (i5 == 1) {
            return e3.a.f8472b;
        }
        throw new IllegalArgumentException(d9.e.f(i5, "Could not convert ", " to BackoffPolicy"));
    }

    public static char w(int i5) {
        switch (i5 / 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static char x(int i5) {
        switch (i5 % 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static final y y(int i5) {
        if (i5 == 0) {
            return y.f8572a;
        }
        if (i5 == 1) {
            return y.f8573b;
        }
        if (i5 == 2) {
            return y.f8574c;
        }
        if (i5 == 3) {
            return y.f8575d;
        }
        if (i5 == 4) {
            return y.f8576e;
        }
        if (Build.VERSION.SDK_INT < 30 || i5 != 5) {
            throw new IllegalArgumentException(d9.e.f(i5, "Could not convert ", " to NetworkType"));
        }
        return y.f8577f;
    }

    public static final f0 z(int i5) {
        if (i5 == 0) {
            return f0.f8515a;
        }
        if (i5 == 1) {
            return f0.f8516b;
        }
        throw new IllegalArgumentException(d9.e.f(i5, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public abstract boolean B(Class cls);

    public abstract g E(ag.c cVar, Object obj);

    public abstract Object o(ag.c cVar);

    public abstract Method p(Class cls, Field field);

    public abstract Constructor q(Class cls);

    public abstract String[] t(Class cls);
}
