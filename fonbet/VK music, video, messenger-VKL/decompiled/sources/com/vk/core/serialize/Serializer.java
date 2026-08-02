package com.vk.core.serialize;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.vk.dto.actionlinks.ActionLinksResponse;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.go9;
import xsna.izs;
import xsna.jgp;
import xsna.ozl;
import xsna.q500;
import xsna.s3q0;
import xsna.v1v;
import xsna.wk3;
import xsna.zrp;

/* compiled from: Serializer.kt */
/* loaded from: classes.dex */
public abstract class Serializer {
    public static final HashMap<ClassLoader, HashMap<String, c<?>>> a = new HashMap<>();

    /* compiled from: Serializer.kt */
    /* loaded from: classes17.dex */
    public static final class BadSerializableException extends DeserializationError {
        public BadSerializableException(String str) {
            super(str, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static class DeserializationError extends RuntimeException {
        private final String whereClassName;

        public DeserializationError(String str, Throwable th) {
            super(go9.b("Deserialization error in ", str), th);
            this.whereClassName = str;
        }
    }

    /* compiled from: Serializer.kt */
    public interface StreamParcelable extends Parcelable {

        /* compiled from: Serializer.kt */
        /* loaded from: classes17.dex */
        public static final class a {
            public static void a(StreamParcelable streamParcelable, Parcel parcel) {
                HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
                b.h(streamParcelable, parcel);
            }
        }

        void O7(Serializer serializer);
    }

    /* compiled from: Serializer.kt */
    public static abstract class StreamParcelableAdapter implements StreamParcelable {
        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            b.h(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends ThreadLocal<com.vk.core.serialize.b> {
        @Override // java.lang.ThreadLocal
        public final com.vk.core.serialize.b initialValue() {
            return new com.vk.core.serialize.b();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b {
        public static StreamParcelable a(byte[] bArr, ClassLoader classLoader) {
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            return new d(new DataInputStream(new ByteArrayInputStream(bArr))).G(classLoader);
        }

        public static ArrayList b(byte[] bArr, ClassLoader classLoader) {
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            return new d(new DataInputStream(new ByteArrayInputStream(bArr))).l(classLoader);
        }

        public static ArrayList c(byte[] bArr) {
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            return new d(new DataInputStream(new ByteArrayInputStream(bArr))).d();
        }

        public static void d(String str, Throwable th) {
            StringBuilder b = v1v.b(str, '\n');
            b.append(Log.getStackTraceString(th));
            Log.println(6, "Serializer", b.toString());
        }

        public static byte[] e(StreamParcelable streamParcelable) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            new e(new DataOutputStream(byteArrayOutputStream)).i0(streamParcelable);
            return byteArrayOutputStream.toByteArray();
        }

        public static byte[] f(List list) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            new e(new DataOutputStream(byteArrayOutputStream)).W(list);
            return byteArrayOutputStream.toByteArray();
        }

        public static byte[] g(List list) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            new e(new DataOutputStream(byteArrayOutputStream)).U(list);
            return byteArrayOutputStream.toByteArray();
        }

        public static void h(StreamParcelable streamParcelable, Parcel parcel) {
            try {
                HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
                streamParcelable.O7(new g(parcel));
            } catch (Exception e) {
                d("error", e);
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static abstract class c<T> implements Parcelable.Creator<T> {
        public abstract T a(Serializer serializer);

        @Override // android.os.Parcelable.Creator
        public final T createFromParcel(Parcel parcel) {
            HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = Serializer.a;
            return a(new g(parcel));
        }
    }

    /* compiled from: Serializer.kt */
    /* loaded from: classes17.dex */
    public static final class d extends Serializer {
        public final DataInput b;

        /* compiled from: Serializer.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.Boolean.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.Byte.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.Int.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f.Long.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[f.Float.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[f.Double.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[f.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[f.Bundle.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[f.StreamParcelable.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[f.Parcelable.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d(DataInput dataInput) {
            this.b = dataInput;
        }

        @Override // com.vk.core.serialize.Serializer
        public final <T extends Parcelable> T A(ClassLoader classLoader) {
            DataInput dataInput = this.b;
            try {
                int readInt = dataInput.readInt();
                if (readInt < 0) {
                    return null;
                }
                byte[] bArr = new byte[readInt];
                dataInput.readFully(bArr);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, readInt);
                obtain.setDataPosition(0);
                T t = (T) obtain.readParcelable(classLoader);
                obtain.recycle();
                return t;
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final <T extends Serializable> T C() {
            DataInput dataInput = this.b;
            try {
                int readInt = dataInput.readInt();
                if (readInt < 0) {
                    return null;
                }
                byte[] bArr = new byte[readInt];
                dataInput.readFully(bArr);
                return (T) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final String H() {
            DataInput dataInput = this.b;
            try {
                if (dataInput.readInt() < 0) {
                    return null;
                }
                return dataInput.readUTF();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final byte[] a() {
            try {
                int u = u();
                if (u < 0) {
                    return null;
                }
                byte[] bArr = new byte[u];
                this.b.readFully(bArr);
                return bArr;
            } finally {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x008b A[DONT_GENERATE, FINALLY_INSNS] */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[DONT_GENERATE, FINALLY_INSNS, RETURN, SYNTHETIC] */
        @Override // com.vk.core.serialize.Serializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bundle o(ClassLoader classLoader) {
            int u;
            DataInput dataInput = this.b;
            try {
                u = u();
            } finally {
            }
            if (u < 0) {
                return null;
            }
            Bundle bundle = new Bundle();
            for (int i = 0; i < u; i++) {
                String H = H();
                switch (a.$EnumSwitchMapping$0[f.values()[dataInput.readInt()].ordinal()]) {
                    case 1:
                        bundle.putBoolean(H, dataInput.readBoolean());
                        continue;
                    case 2:
                        bundle.putByte(H, p());
                        continue;
                    case 3:
                        bundle.putInt(H, dataInput.readInt());
                        continue;
                    case 4:
                        bundle.putLong(H, dataInput.readLong());
                        continue;
                    case 5:
                        bundle.putFloat(H, dataInput.readFloat());
                        continue;
                    case 6:
                        bundle.putDouble(H, dataInput.readDouble());
                        continue;
                    case 7:
                        bundle.putString(H, H());
                        continue;
                    case 8:
                        bundle.putBundle(H, o(classLoader));
                        continue;
                    case 9:
                        bundle.putParcelable(H, G(classLoader));
                        continue;
                    case 10:
                        bundle.putParcelable(H, A(classLoader));
                        continue;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return bundle;
        }

        @Override // com.vk.core.serialize.Serializer
        public final byte p() {
            try {
                return this.b.readByte();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final char q() {
            try {
                return this.b.readChar();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final double r() {
            try {
                return this.b.readDouble();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final float s() {
            try {
                return this.b.readFloat();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final int u() {
            try {
                return this.b.readInt();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final long w() {
            try {
                return this.b.readLong();
            } finally {
            }
        }
    }

    /* compiled from: Serializer.kt */
    /* loaded from: classes17.dex */
    public static final class e extends Serializer {
        public final DataOutput b;

        public e(DataOutput dataOutput) {
            this.b = dataOutput;
        }

        @Override // com.vk.core.serialize.Serializer
        public final void K(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = new Bundle();
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj instanceof Boolean) {
                        bundle2.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle2.putByte(str, ((Number) obj).byteValue());
                    } else if (obj instanceof Integer) {
                        bundle2.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle2.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Float) {
                        bundle2.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle2.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof String) {
                        bundle2.putString(str, (String) obj);
                    } else if (obj instanceof Bundle) {
                        bundle2.putBundle(str, (Bundle) obj);
                    } else if (obj instanceof StreamParcelable) {
                        bundle2.putParcelable(str, (Parcelable) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle2.putParcelable(str, (Parcelable) obj);
                    }
                }
                bundle = bundle2;
            }
            DataOutput dataOutput = this.b;
            if (bundle == null) {
                dataOutput.writeInt(-1);
                return;
            }
            dataOutput.writeInt(bundle.size());
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (obj2 instanceof Boolean) {
                    p0(str2, f.Boolean);
                    dataOutput.writeBoolean(((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof Byte) {
                    p0(str2, f.Byte);
                    L(((Number) obj2).byteValue());
                } else if (obj2 instanceof Integer) {
                    p0(str2, f.Int);
                    dataOutput.writeInt(((Number) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    p0(str2, f.Long);
                    dataOutput.writeLong(((Number) obj2).longValue());
                } else if (obj2 instanceof Float) {
                    p0(str2, f.Float);
                    dataOutput.writeFloat(((Number) obj2).floatValue());
                } else if (obj2 instanceof Double) {
                    p0(str2, f.Double);
                    dataOutput.writeDouble(((Number) obj2).doubleValue());
                } else if (obj2 instanceof String) {
                    p0(str2, f.String);
                    j0((String) obj2);
                } else if (obj2 instanceof Bundle) {
                    p0(str2, f.Bundle);
                    K((Bundle) obj2);
                } else if (obj2 instanceof StreamParcelable) {
                    p0(str2, f.StreamParcelable);
                    i0((StreamParcelable) obj2);
                } else if (obj2 instanceof Parcelable) {
                    p0(str2, f.Parcelable);
                    e0((Parcelable) obj2);
                }
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final void L(byte b) {
            this.b.writeByte(b);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void M(byte[] bArr) {
            if (bArr == null) {
                S(-1);
                return;
            }
            int length = bArr.length;
            DataOutput dataOutput = this.b;
            dataOutput.writeInt(length);
            dataOutput.write(bArr);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void N(char c) {
            this.b.writeChar(c);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void O(double d) {
            this.b.writeDouble(d);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void P(float f) {
            this.b.writeFloat(f);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void S(int i) {
            this.b.writeInt(i);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void Y(long j) {
            this.b.writeLong(j);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void e0(Parcelable parcelable) {
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(parcelable, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            DataOutput dataOutput = this.b;
            if (marshall == null) {
                dataOutput.writeInt(-1);
            } else {
                dataOutput.writeInt(marshall.length);
                dataOutput.write(marshall);
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final void g0(Serializable serializable) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializable);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            DataOutput dataOutput = this.b;
            if (byteArray == null) {
                dataOutput.writeInt(-1);
            } else {
                dataOutput.writeInt(byteArray.length);
                dataOutput.write(byteArray);
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final void j0(String str) {
            DataOutput dataOutput = this.b;
            if (str == null) {
                dataOutput.writeInt(-1);
            } else {
                dataOutput.writeInt(str.length());
                dataOutput.writeUTF(str);
            }
        }

        public final void p0(String str, f fVar) {
            j0(str);
            this.b.writeInt(fVar.ordinal());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Serializer.kt */
    /* loaded from: classes17.dex */
    public static final class f {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;
        public static final f Boolean;
        public static final f Bundle;
        public static final f Byte;
        public static final f Double;
        public static final f Float;
        public static final f Int;
        public static final f Long;
        public static final f Parcelable;
        public static final f StreamParcelable;
        public static final f String;

        static {
            f fVar = new f("Boolean", 0);
            Boolean = fVar;
            f fVar2 = new f("Byte", 1);
            Byte = fVar2;
            f fVar3 = new f("Int", 2);
            Int = fVar3;
            f fVar4 = new f("Long", 3);
            Long = fVar4;
            f fVar5 = new f("Float", 4);
            Float = fVar5;
            f fVar6 = new f("Double", 5);
            Double = fVar6;
            f fVar7 = new f("String", 6);
            String = fVar7;
            f fVar8 = new f("Bundle", 7);
            Bundle = fVar8;
            f fVar9 = new f("StreamParcelable", 8);
            StreamParcelable = fVar9;
            f fVar10 = new f("Parcelable", 9);
            Parcelable = fVar10;
            f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
            $VALUES = fVarArr;
            $ENTRIES = new asp(fVarArr);
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class g extends Serializer {
        public final Parcel b;

        public g(Parcel parcel) {
            this.b = parcel;
        }

        @Override // com.vk.core.serialize.Serializer
        public final <T extends Parcelable> T A(ClassLoader classLoader) {
            try {
                return (T) this.b.readParcelable(classLoader);
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final <T extends Serializable> T C() {
            try {
                return (T) this.b.readSerializable();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final String H() {
            try {
                return this.b.readString();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final void K(Bundle bundle) {
            this.b.writeBundle(bundle);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void L(byte b) {
            this.b.writeByte(b);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void M(byte[] bArr) {
            this.b.writeByteArray(bArr);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void N(char c) {
            this.b.writeInt(c);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void O(double d) {
            this.b.writeDouble(d);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void P(float f) {
            this.b.writeFloat(f);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void S(int i) {
            this.b.writeInt(i);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void Y(long j) {
            this.b.writeLong(j);
        }

        @Override // com.vk.core.serialize.Serializer
        public final byte[] a() {
            try {
                return this.b.createByteArray();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final void e0(Parcelable parcelable) {
            this.b.writeParcelable(parcelable, 0);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void g0(Serializable serializable) {
            this.b.writeSerializable(serializable);
        }

        @Override // com.vk.core.serialize.Serializer
        public final void j0(String str) {
            this.b.writeString(str);
        }

        @Override // com.vk.core.serialize.Serializer
        public final Bundle o(ClassLoader classLoader) {
            try {
                return this.b.readBundle(classLoader);
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final byte p() {
            try {
                return this.b.readByte();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final char q() {
            try {
                return (char) this.b.readInt();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final double r() {
            try {
                return this.b.readDouble();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final float s() {
            try {
                return this.b.readFloat();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final int u() {
            try {
                return this.b.readInt();
            } finally {
            }
        }

        @Override // com.vk.core.serialize.Serializer
        public final long w() {
            try {
                return this.b.readLong();
            } finally {
            }
        }
    }

    static {
        new a();
    }

    public <T extends Parcelable> T A(ClassLoader classLoader) {
        throw new UnsupportedOperationException();
    }

    public final <T extends Parcelable> ArrayList<T> B(ClassLoader classLoader) {
        try {
            int u = u();
            if (u < 0) {
                return new ArrayList<>();
            }
            ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(u);
            for (int i = 0; i < u; i++) {
                Parcelable A = A(classLoader);
                if (A != null) {
                    actionLinksResponse.add(A);
                }
            }
            return actionLinksResponse;
        } finally {
        }
    }

    public <T extends Serializable> T C() {
        throw new UnsupportedOperationException();
    }

    public final <T extends Serializable> ArrayList<T> D() {
        try {
            int u = u();
            if (u < 0) {
                return new ArrayList<>();
            }
            ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(u);
            for (int i = 0; i < u; i++) {
                Serializable C = C();
                if (C != null) {
                    actionLinksResponse.add(C);
                }
            }
            return actionLinksResponse;
        } finally {
        }
    }

    public final <T extends Serializable> ArrayList<T> E() {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(u);
            for (int i = 0; i < u; i++) {
                Serializable C = C();
                if (C != null) {
                    actionLinksResponse.add(C);
                }
            }
            return actionLinksResponse;
        } finally {
        }
    }

    public final c<?> F(ClassLoader classLoader, String str) {
        c<?> cVar;
        if (str == null) {
            return null;
        }
        ClassLoader classLoader2 = classLoader == null ? getClass().getClassLoader() : classLoader;
        HashMap<ClassLoader, HashMap<String, c<?>>> hashMap = a;
        synchronized (hashMap) {
            try {
                HashMap<String, c<?>> hashMap2 = hashMap.get(classLoader);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(classLoader2, hashMap2);
                }
                cVar = hashMap2.get(str);
                if (cVar == null) {
                    try {
                        try {
                            Class<?> cls = Class.forName(str, false, classLoader2);
                            if (!StreamParcelable.class.isAssignableFrom(cls)) {
                                throw new BadSerializableException("Serializer.Serializable protocol requires that the class implements Serializer.Serializable");
                            }
                            Field field = cls.getField(SignalingProtocol.KEY_ROLE_CREATOR);
                            if ((field.getModifiers() & 8) == 0) {
                                throw new BadSerializableException("Serializer.Serializable protocol requires the CREATOR object to be static on class ".concat(str));
                            }
                            if (!c.class.isAssignableFrom(field.getType())) {
                                throw new BadSerializableException("Serializer.Serializable protocol requires a Serializer.Creator object called CREATOR on class ".concat(str));
                            }
                            try {
                                field.setAccessible(true);
                            } catch (Throwable th) {
                                b.d("can't set access for field: ".concat(str), th);
                            }
                            cVar = (c) field.get(null);
                            if (cVar == null) {
                                throw new BadSerializableException("Serializer.Serializable protocol requires a non-null Serializer.Creator object called CREATOR on class ".concat(str));
                            }
                            hashMap2.put(str, cVar);
                        } catch (ClassNotFoundException e2) {
                            b.d("ClassNotFoundException when unmarshalling: ".concat(str), e2);
                            throw new BadSerializableException("ClassNotFoundException when unmarshalling: ".concat(str));
                        }
                    } catch (IllegalAccessException e3) {
                        b.d("IllegalAccessException when unmarshalling: ".concat(str), e3);
                        throw new BadSerializableException("IllegalAccessException when unmarshalling: ".concat(str));
                    } catch (NoSuchFieldException unused) {
                        throw new BadSerializableException("Serializer.Serializable protocol requires a Serializer.Creator object called CREATOR on class ".concat(str));
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final <T extends StreamParcelable> T G(ClassLoader classLoader) {
        Object a2;
        try {
            String H = H();
            if (classLoader == null) {
                throw new DeserializationError(H, null);
            }
            c<?> F = F(classLoader, H);
            if (F != null) {
                try {
                    try {
                        a2 = F.a(this);
                    } catch (Throwable th) {
                        throw new DeserializationError(H, th);
                    }
                } catch (DeserializationError e2) {
                    throw e2;
                }
            } else {
                a2 = null;
            }
            T t = (T) a2;
            int u = H != null ? u() : 0;
            if (H != null && u != H.hashCode()) {
                throw new DeserializationError(H, null);
            }
            return t;
        } finally {
        }
    }

    public String H() {
        throw new UnsupportedOperationException();
    }

    public final String I() {
        try {
            if (m()) {
                return H();
            }
            return null;
        } finally {
        }
    }

    public final void J(Boolean bool) {
        if (bool == null) {
            L((byte) 0);
        } else {
            L((byte) 1);
            L(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public void K(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void L(byte b2) {
        throw new UnsupportedOperationException();
    }

    public void M(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public void N(char c2) {
        throw new UnsupportedOperationException();
    }

    public void O(double d2) {
        throw new UnsupportedOperationException();
    }

    public void P(float f2) {
        throw new UnsupportedOperationException();
    }

    public final void Q(List<Float> list) {
        if (list == null) {
            P(-1.0f);
            return;
        }
        S(list.size());
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            P(it.next().floatValue());
        }
    }

    public final void R(Float f2) {
        if (f2 == null) {
            L((byte) 0);
        } else {
            L((byte) 1);
            P(f2.floatValue());
        }
    }

    public void S(int i) {
        throw new UnsupportedOperationException();
    }

    public final void T(int[] iArr) {
        if (iArr == null) {
            S(-1);
            return;
        }
        S(iArr.length);
        for (int i : iArr) {
            S(i);
        }
    }

    public final void U(List<Integer> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            S(it.next().intValue());
        }
    }

    public final void V(Integer num) {
        if (num == null) {
            L((byte) 0);
        } else {
            L((byte) 1);
            S(num.intValue());
        }
    }

    public final <T extends StreamParcelable> void W(List<? extends T> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            i0((StreamParcelable) it.next());
        }
    }

    public final <T extends StreamParcelable> void X(List<? extends List<? extends T>> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            W((List) it.next());
        }
    }

    public void Y(long j) {
        throw new UnsupportedOperationException();
    }

    public final void Z(long[] jArr) {
        S(jArr.length);
        for (long j : jArr) {
            Y(j);
        }
    }

    public byte[] a() {
        throw new UnsupportedOperationException();
    }

    public final void a0(List<Long> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            Y(it.next().longValue());
        }
    }

    public final float[] b() {
        int u = u();
        if (u < 0) {
            return null;
        }
        float[] fArr = new float[u];
        for (int i = 0; i < u; i++) {
            fArr[i] = s();
        }
        return fArr;
    }

    public final void b0(Long l) {
        if (l == null) {
            L((byte) 0);
        } else {
            L((byte) 1);
            Y(l.longValue());
        }
    }

    public final int[] c() {
        int u = u();
        if (u < 0) {
            return null;
        }
        int[] iArr = new int[u];
        for (int i = 0; i < u; i++) {
            iArr[i] = u();
        }
        return iArr;
    }

    public final <V extends Parcelable> void c0(Map<Long, ? extends V> map) {
        Iterator c2 = n.c(this, map);
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            Y(((Number) entry.getKey()).longValue());
            e0((Parcelable) entry.getValue());
        }
    }

    public final ArrayList<Integer> d() {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < u; i++) {
                arrayList.add(Integer.valueOf(u()));
            }
            return arrayList;
        } finally {
        }
    }

    public final void d0(q500 q500Var) {
        if (q500Var == null) {
            L((byte) 0);
            return;
        }
        L((byte) 1);
        Y(q500Var.d());
        Y(q500Var.e());
    }

    public final long[] e() {
        int u = u();
        if (u < 0) {
            return null;
        }
        long[] jArr = new long[u];
        for (int i = 0; i < u; i++) {
            jArr[i] = w();
        }
        return jArr;
    }

    public void e0(Parcelable parcelable) {
        throw new UnsupportedOperationException();
    }

    public final ArrayList<Long> f() {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            for (int i = 0; i < u; i++) {
                arrayList.add(Long.valueOf(w()));
            }
            return arrayList;
        } finally {
        }
    }

    public final <T extends Parcelable> void f0(List<? extends T> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            e0(it.next());
        }
    }

    public final String[] g() {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            String[] strArr = new String[u];
            for (int i = 0; i < u; i++) {
                strArr[i] = H();
            }
            return strArr;
        } finally {
        }
    }

    public void g0(Serializable serializable) {
        throw new UnsupportedOperationException();
    }

    public final ArrayList<String> h() {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < u; i++) {
                arrayList.add(H());
            }
            return arrayList;
        } finally {
        }
    }

    public final void h0(List<? extends Serializable> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g0(list.get(i));
        }
    }

    public final <T> T[] i(c<T> cVar) {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            T[] newArray = cVar.newArray(u);
            for (int i = 0; i < u; i++) {
                if (u() != 0) {
                    newArray[i] = cVar.a(this);
                }
            }
            return newArray;
        } finally {
        }
    }

    public final void i0(StreamParcelable streamParcelable) {
        if (streamParcelable == null) {
            j0(null);
            return;
        }
        String name = streamParcelable.getClass().getName();
        j0(name);
        streamParcelable.O7(this);
        S(name.hashCode());
    }

    @ozl
    public final <T> ArrayList<T> j(c<T> cVar) {
        T a2;
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ArrayList<T> arrayList = new ArrayList<>(u);
            for (int i = 0; i < u; i++) {
                if (u() != 0 && (a2 = cVar.a(this)) != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        } finally {
        }
    }

    public void j0(String str) {
        throw new UnsupportedOperationException();
    }

    public final <T extends StreamParcelable> ArrayList<T> k(Class<T> cls) {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(u);
            for (int i = 0; i < u; i++) {
                StreamParcelable G = G(cls.getClassLoader());
                if (!cls.isInstance(G)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Deserialized ");
                    sb.append(G != null ? G.getClass() : null);
                    sb.append(" instead of ");
                    sb.append(cls);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                actionLinksResponse.add(G);
            }
            return actionLinksResponse;
        } finally {
        }
    }

    public final void k0(String[] strArr) {
        if (strArr == null) {
            S(-1);
            return;
        }
        S(strArr.length);
        wk3 wk3Var = new wk3(strArr);
        while (wk3Var.hasNext()) {
            j0((String) wk3Var.next());
        }
    }

    @ozl
    public final <T extends StreamParcelable> ArrayList<T> l(ClassLoader classLoader) {
        try {
            int u = u();
            if (u < 0) {
                return null;
            }
            ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(u);
            for (int i = 0; i < u; i++) {
                actionLinksResponse.add(G(classLoader));
            }
            return actionLinksResponse;
        } finally {
        }
    }

    public final void l0(List<String> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            j0(it.next());
        }
    }

    public final boolean m() {
        return p() != 0;
    }

    public final void m0(String str) {
        if (str == null) {
            L((byte) 0);
        } else {
            L((byte) 1);
            j0(str);
        }
    }

    public final Boolean n() {
        try {
            if (m()) {
                return Boolean.valueOf(m());
            }
            return null;
        } finally {
        }
    }

    public final <T extends StreamParcelable> void n0(T[] tArr) {
        if (tArr == null) {
            S(-1);
            return;
        }
        S(tArr.length);
        wk3 wk3Var = new wk3(tArr);
        while (wk3Var.hasNext()) {
            StreamParcelable streamParcelable = (StreamParcelable) wk3Var.next();
            if (streamParcelable != null) {
                S(1);
                streamParcelable.O7(this);
            } else {
                S(0);
            }
        }
    }

    public Bundle o(ClassLoader classLoader) {
        throw new UnsupportedOperationException();
    }

    @ozl
    public final <T extends StreamParcelable> void o0(List<? extends T> list) {
        if (list == null) {
            S(-1);
            return;
        }
        S(list.size());
        for (T t : list) {
            if (t != null) {
                S(1);
                t.O7(this);
            } else {
                S(0);
            }
        }
    }

    public byte p() {
        throw new UnsupportedOperationException();
    }

    public char q() {
        throw new UnsupportedOperationException();
    }

    public double r() {
        throw new UnsupportedOperationException();
    }

    public float s() {
        throw new UnsupportedOperationException();
    }

    public final Float t() {
        try {
            if (m()) {
                return Float.valueOf(s());
            }
            return null;
        } finally {
        }
    }

    public int u() {
        throw new UnsupportedOperationException();
    }

    public final Integer v() {
        try {
            if (m()) {
                return Integer.valueOf(u());
            }
            return null;
        } finally {
        }
    }

    public long w() {
        throw new UnsupportedOperationException();
    }

    public final Long x() {
        try {
            if (m()) {
                return Long.valueOf(w());
            }
            return null;
        } finally {
        }
    }

    public final q500 y() {
        try {
            if (m()) {
                return new q500(w(), w());
            }
            return null;
        } finally {
        }
    }

    public final <K, V> Map<K, V> z(izs<? super Serializer, ? extends K> izsVar, izs<? super Serializer, ? extends V> izsVar2) {
        try {
            int u = u();
            if (u < 0) {
                return jgp.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < u; i++) {
                K invoke = izsVar.invoke(this);
                V invoke2 = izsVar2.invoke(this);
                if (invoke != null && invoke2 != null) {
                    linkedHashMap.put(invoke, invoke2);
                }
            }
            return linkedHashMap;
        } finally {
        }
    }
}
