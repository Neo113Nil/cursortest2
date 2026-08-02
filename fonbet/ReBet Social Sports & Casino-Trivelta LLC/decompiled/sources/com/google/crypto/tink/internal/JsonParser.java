package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f37039a = new JsonElementTypeAdapter(null);

    public static final class JsonElementTypeAdapter extends TypeAdapter {
        private JsonElementTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.h read(Jb.a aVar) {
            String str;
            Jb.b Y12 = aVar.Y1();
            com.google.gson.h c10 = c(aVar, Y12);
            if (c10 == null) {
                return b(aVar, Y12);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.hasNext()) {
                    if (c10 instanceof com.google.gson.k) {
                        str = aVar.f0();
                        if (!JsonParser.a(str)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    Jb.b Y13 = aVar.Y1();
                    com.google.gson.h c11 = c(aVar, Y13);
                    boolean z10 = c11 != null;
                    if (c11 == null) {
                        c11 = b(aVar, Y13);
                    }
                    if (c10 instanceof com.google.gson.e) {
                        ((com.google.gson.e) c10).m(c11);
                    } else {
                        com.google.gson.k kVar = (com.google.gson.k) c10;
                        if (kVar.t(str)) {
                            throw new IOException("duplicate key: " + str);
                        }
                        kVar.m(str, c11);
                    }
                    if (z10) {
                        arrayDeque.addLast(c10);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        c10 = c11;
                    } else {
                        continue;
                    }
                } else {
                    if (c10 instanceof com.google.gson.e) {
                        aVar.n();
                    } else {
                        aVar.t();
                    }
                    if (arrayDeque.isEmpty()) {
                        return c10;
                    }
                    c10 = (com.google.gson.h) arrayDeque.removeLast();
                }
            }
        }

        public final com.google.gson.h b(Jb.a aVar, Jb.b bVar) {
            int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
            if (i10 == 3) {
                String M02 = aVar.M0();
                if (JsonParser.a(M02)) {
                    return new com.google.gson.n(M02);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new com.google.gson.n(new b(aVar.M0()));
            }
            if (i10 == 5) {
                return new com.google.gson.n(Boolean.valueOf(aVar.D0()));
            }
            if (i10 == 6) {
                aVar.n1();
                return com.google.gson.j.f38328a;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        public final com.google.gson.h c(Jb.a aVar, Jb.b bVar) {
            int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
            if (i10 == 1) {
                aVar.p();
                return new com.google.gson.e();
            }
            if (i10 != 2) {
                return null;
            }
            aVar.m();
            return new com.google.gson.k();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(Jb.c cVar, com.google.gson.h hVar) {
            throw new UnsupportedOperationException("write is not supported");
        }

        public /* synthetic */ JsonElementTypeAdapter(a aVar) {
            this();
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[Jb.b.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[Jb.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b extends Number {

        /* renamed from: a, reason: collision with root package name */
        public final String f37040a;

        public b(String str) {
            this.f37040a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f37040a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f37040a.equals(((b) obj).f37040a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f37040a);
        }

        public int hashCode() {
            return this.f37040a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f37040a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f37040a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f37040a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f37040a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f37040a).longValue();
            }
        }

        public String toString() {
            return this.f37040a;
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char charAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(charAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(charAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }
}
