package com.google.protobuf;

import com.google.protobuf.Internal;
import xsna.go80;
import xsna.lhg;

/* loaded from: classes13.dex */
public final class FieldInfo implements Comparable<FieldInfo> {
    public final java.lang.reflect.Field b;
    public final FieldType c;
    public final int d;
    public final java.lang.reflect.Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final java.lang.reflect.Field i;
    public final Object j;
    public final Internal.EnumVerifier k;

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private go80 oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                java.lang.reflect.Field field = this.field;
                int i = this.fieldNumber;
                Internal.EnumVerifier enumVerifier = this.enumVerifier;
                Internal.checkNotNull(obj, "mapDefaultEntry");
                FieldInfo.a(i);
                Internal.checkNotNull(field, "field");
                return new FieldInfo(field, i, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
            }
            java.lang.reflect.Field field2 = this.presenceField;
            if (field2 != null) {
                if (this.required) {
                    java.lang.reflect.Field field3 = this.field;
                    int i2 = this.fieldNumber;
                    FieldType fieldType = this.type;
                    int i3 = this.presenceMask;
                    boolean z = this.enforceUtf8;
                    Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                    FieldInfo.a(i2);
                    Internal.checkNotNull(field3, "field");
                    Internal.checkNotNull(fieldType, "fieldType");
                    Internal.checkNotNull(field2, "presenceField");
                    if (i3 == 0 || ((i3 - 1) & i3) != 0) {
                        throw new IllegalArgumentException(lhg.a(i3, "presenceMask must have exactly one bit set: "));
                    }
                    return new FieldInfo(field3, i2, fieldType, field2, i3, true, z, null, enumVerifier2, null);
                }
                java.lang.reflect.Field field4 = this.field;
                int i4 = this.fieldNumber;
                FieldType fieldType2 = this.type;
                int i5 = this.presenceMask;
                boolean z2 = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
                FieldInfo.a(i4);
                Internal.checkNotNull(field4, "field");
                Internal.checkNotNull(fieldType2, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i5 == 0 || ((i5 - 1) & i5) != 0) {
                    throw new IllegalArgumentException(lhg.a(i5, "presenceMask must have exactly one bit set: "));
                }
                return new FieldInfo(field4, i4, fieldType2, field2, i5, false, z2, null, enumVerifier3, null);
            }
            Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
            if (enumVerifier4 != null) {
                java.lang.reflect.Field field5 = this.cachedSizeField;
                if (field5 == null) {
                    java.lang.reflect.Field field6 = this.field;
                    int i6 = this.fieldNumber;
                    FieldType fieldType3 = this.type;
                    FieldInfo.a(i6);
                    Internal.checkNotNull(field6, "field");
                    return new FieldInfo(field6, i6, fieldType3, null, 0, false, false, null, enumVerifier4, null);
                }
                java.lang.reflect.Field field7 = this.field;
                int i7 = this.fieldNumber;
                FieldType fieldType4 = this.type;
                FieldInfo.a(i7);
                Internal.checkNotNull(field7, "field");
                return new FieldInfo(field7, i7, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
            }
            java.lang.reflect.Field field8 = this.cachedSizeField;
            if (field8 != null) {
                java.lang.reflect.Field field9 = this.field;
                int i8 = this.fieldNumber;
                FieldType fieldType5 = this.type;
                FieldInfo.a(i8);
                Internal.checkNotNull(field9, "field");
                Internal.checkNotNull(fieldType5, "fieldType");
                if (fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
                    throw new IllegalStateException("Shouldn't be called for repeated message fields.");
                }
                return new FieldInfo(field9, i8, fieldType5, null, 0, false, false, null, null, field8);
            }
            java.lang.reflect.Field field10 = this.field;
            int i9 = this.fieldNumber;
            FieldType fieldType6 = this.type;
            boolean z3 = this.enforceUtf8;
            FieldInfo.a(i9);
            Internal.checkNotNull(field10, "field");
            Internal.checkNotNull(fieldType6, "fieldType");
            if (fieldType6 == FieldType.MESSAGE_LIST || fieldType6 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new FieldInfo(field10, i9, fieldType6, null, 0, false, z3, null, null, null);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.enforceUtf8 = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(go80 go80Var, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.required = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FieldType.values().length];
            a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.b = field;
        this.c = fieldType;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.j = obj;
        this.k = enumVerifier;
        this.i = field3;
    }

    public static void a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "fieldNumber must be positive: "));
        }
    }

    public final java.lang.reflect.Field c() {
        return this.i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(FieldInfo fieldInfo) {
        return this.d - fieldInfo.d;
    }

    public final Internal.EnumVerifier h() {
        return this.k;
    }

    public final java.lang.reflect.Field i() {
        return this.b;
    }

    public final int j() {
        return this.d;
    }

    public final Object k() {
        return this.j;
    }

    public final Class<?> l() {
        java.lang.reflect.Field field;
        int i = a.a[this.c.ordinal()];
        if ((i == 1 || i == 2) && (field = this.b) != null) {
            return field.getType();
        }
        return null;
    }

    public final java.lang.reflect.Field m() {
        return this.e;
    }

    public final int n() {
        return this.f;
    }

    public final FieldType o() {
        return this.c;
    }

    public final boolean p() {
        return this.h;
    }

    public final boolean q() {
        return this.g;
    }
}
