package androidx.work;

import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.awk;
import xsna.epx;
import xsna.fpf0;
import xsna.ho8;
import xsna.i5s;
import xsna.izs;
import xsna.j5g;
import xsna.jw5;
import xsna.lhg;
import xsna.m100;
import xsna.rfc;

/* compiled from: Data_.kt */
/* loaded from: classes.dex */
public final class Data {
    public static final Data b = new a().a();
    public final HashMap a;

    /* compiled from: Data_.kt */
    public static final class a {
        public final LinkedHashMap a = new LinkedHashMap();

        public final Data a() {
            Data data = new Data(this.a);
            b.b(data);
            return data;
        }

        public final void b(Object obj, String str) {
            if (obj == null) {
                obj = null;
            } else {
                rfc a = fpf0.a(obj.getClass());
                if (!(a.equals(fpf0.a(Boolean.TYPE)) ? true : a.equals(fpf0.a(Byte.TYPE)) ? true : a.equals(fpf0.a(Integer.TYPE)) ? true : a.equals(fpf0.a(Long.TYPE)) ? true : a.equals(fpf0.a(Float.TYPE)) ? true : a.equals(fpf0.a(Double.TYPE)) ? true : a.equals(fpf0.a(String.class)) ? true : a.equals(fpf0.a(Boolean[].class)) ? true : a.equals(fpf0.a(Byte[].class)) ? true : a.equals(fpf0.a(Integer[].class)) ? true : a.equals(fpf0.a(Long[].class)) ? true : a.equals(fpf0.a(Float[].class)) ? true : a.equals(fpf0.a(Double[].class)) ? true : a.equals(fpf0.a(String[].class)))) {
                    if (a.equals(fpf0.a(boolean[].class))) {
                        obj = awk.a((boolean[]) obj);
                    } else if (a.equals(fpf0.a(byte[].class))) {
                        obj = awk.b((byte[]) obj);
                    } else if (a.equals(fpf0.a(int[].class))) {
                        obj = awk.e((int[]) obj);
                    } else if (a.equals(fpf0.a(long[].class))) {
                        obj = awk.f((long[]) obj);
                    } else if (a.equals(fpf0.a(float[].class))) {
                        obj = awk.d((float[]) obj);
                    } else {
                        if (!a.equals(fpf0.a(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + a);
                        }
                        obj = awk.c((double[]) obj);
                    }
                }
            }
            this.a.put(str, obj);
        }

        public final void c(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b(entry.getValue(), (String) entry.getKey());
            }
        }

        public final void d(String str, String str2) {
            this.a.put(str, str2);
        }
    }

    /* compiled from: Data_.kt */
    public static final class b {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable a(DataInputStream dataInputStream, byte b) {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int readInt = dataInputStream.readInt();
                ?? r0 = new Boolean[readInt];
                while (i < readInt) {
                    r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return r0;
            }
            if (b == 9) {
                int readInt2 = dataInputStream.readInt();
                ?? r02 = new Byte[readInt2];
                while (i < readInt2) {
                    r02[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return r02;
            }
            if (b == 10) {
                int readInt3 = dataInputStream.readInt();
                ?? r03 = new Integer[readInt3];
                while (i < readInt3) {
                    r03[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return r03;
            }
            if (b == 11) {
                int readInt4 = dataInputStream.readInt();
                ?? r04 = new Long[readInt4];
                while (i < readInt4) {
                    r04[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return r04;
            }
            if (b == 12) {
                int readInt5 = dataInputStream.readInt();
                ?? r05 = new Float[readInt5];
                while (i < readInt5) {
                    r05[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return r05;
            }
            if (b == 13) {
                int readInt6 = dataInputStream.readInt();
                ?? r06 = new Double[readInt6];
                while (i < readInt6) {
                    r06[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return r06;
            }
            if (b != 14) {
                throw new IllegalStateException(lhg.a(b, "Unsupported type "));
            }
            int readInt7 = dataInputStream.readInt();
            ?? r1 = new String[readInt7];
            while (i < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (epx.f(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i] = readUTF;
                i++;
            }
            return r1;
        }

        public static byte[] b(Data data) {
            String str;
            HashMap hashMap = data.a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(hashMap.size());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                str = awk.a;
                m100.c().b(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        public static final void c(DataOutputStream dataOutputStream, String str, Object obj) {
            int i;
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
                    throw new IllegalArgumentException("Unsupported value type " + fpf0.a(obj.getClass()).l());
                }
                Object[] objArr = (Object[]) obj;
                rfc a = fpf0.a(objArr.getClass());
                if (a.equals(fpf0.a(Boolean[].class))) {
                    i = 8;
                } else if (a.equals(fpf0.a(Byte[].class))) {
                    i = 9;
                } else if (a.equals(fpf0.a(Integer[].class))) {
                    i = 10;
                } else if (a.equals(fpf0.a(Long[].class))) {
                    i = 11;
                } else if (a.equals(fpf0.a(Float[].class))) {
                    i = 12;
                } else if (a.equals(fpf0.a(Double[].class))) {
                    i = 13;
                } else {
                    if (!a.equals(fpf0.a(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + fpf0.a(objArr.getClass()).h());
                    }
                    i = 14;
                }
                dataOutputStream.writeByte(i);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i == 9) {
                        Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                    } else if (i == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i == 11) {
                        Long l = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                    } else if (i == 12) {
                        Float f = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else if (i == 13) {
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                    } else if (i == 14) {
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
    }

    /* compiled from: Data_.kt */
    /* loaded from: classes12.dex */
    public static final class c extends Lambda implements izs<Map.Entry<? extends String, ? extends Object>, CharSequence> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
            Map.Entry<? extends String, ? extends Object> entry2 = entry;
            String key = entry2.getKey();
            Object value = entry2.getValue();
            StringBuilder b = ho8.b(key, " : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
            }
            b.append(value);
            return b.toString();
        }
    }

    public Data(Data data) {
        this.a = new HashMap(data.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: ClassNotFoundException -> 0x0055, IOException -> 0x0057, TRY_LEAVE, TryCatch #6 {IOException -> 0x0057, ClassNotFoundException -> 0x0055, blocks: (B:10:0x0012, B:12:0x0029, B:15:0x0030, B:17:0x0035, B:25:0x0050, B:33:0x005b, B:34:0x005e, B:35:0x005f, B:46:0x008d, B:56:0x00b3, B:57:0x00b6), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[Catch: ClassNotFoundException -> 0x0055, IOException -> 0x0057, TRY_LEAVE, TryCatch #6 {IOException -> 0x0057, ClassNotFoundException -> 0x0055, blocks: (B:10:0x0012, B:12:0x0029, B:15:0x0030, B:17:0x0035, B:25:0x0050, B:33:0x005b, B:34:0x005e, B:35:0x005f, B:46:0x008d, B:56:0x00b3, B:57:0x00b6), top: B:9:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Data a(byte[] bArr) {
        String str;
        String str2;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2;
        byte b2;
        int i;
        boolean z;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bArr.length == 0) {
            return b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            b2 = (byte) (-21267);
            i = 0;
        } catch (IOException e) {
            str2 = awk.a;
            m100.c().b(str2, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            str = awk.a;
            m100.c().b(str, "Error in Data#fromByteArray: ", e2);
        }
        if (bArr2[0] == ((byte) 16777132)) {
            z = true;
            if (bArr2[1] == b2) {
                byteArrayInputStream.reset();
                if (z) {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort != -21521) {
                            throw new IllegalStateException(lhg.a(readShort, "Magic number doesn't match: ").toString());
                        }
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            throw new IllegalStateException(lhg.a(readShort2, "Unsupported version number: ").toString());
                        }
                        int readInt = dataInputStream.readInt();
                        while (i < readInt) {
                            linkedHashMap.put(dataInputStream.readUTF(), b.a(dataInputStream, dataInputStream.readByte()));
                            i++;
                        }
                        dataInputStream.close();
                    } finally {
                    }
                } else {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt2 = objectInputStream.readInt();
                        while (i < readInt2) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i++;
                        }
                        objectInputStream.close();
                    } finally {
                    }
                }
                return new Data(linkedHashMap);
            }
        }
        z = false;
        byteArrayInputStream.reset();
        if (z) {
        }
        return new Data(linkedHashMap);
    }

    public final boolean b(String str, boolean z) {
        Object valueOf = Boolean.valueOf(z);
        Object obj = this.a.get(str);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final long c(String str, long j) {
        Object valueOf = Long.valueOf(j);
        Object obj = this.a.get(str);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final String d(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] e(String str) {
        Object[] objArr;
        final Object obj = this.a.get(str);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        izs<Integer, String> izsVar = new izs<Integer, String>() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final String invoke(Integer num) {
                Object obj2 = ((Object[]) obj)[num.intValue()];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        };
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = izsVar.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && Data.class.equals(obj.getClass())) {
                HashMap hashMap = ((Data) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (epx.f(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = jw5.c(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return i5s.a(new StringBuilder("Data {"), j5g.g0(this.a.entrySet(), null, null, null, 0, c.i, 31), "}");
    }

    public Data(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
