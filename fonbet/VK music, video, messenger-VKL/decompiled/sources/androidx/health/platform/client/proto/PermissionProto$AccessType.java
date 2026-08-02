package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.b0;

/* loaded from: classes12.dex */
public enum PermissionProto$AccessType implements b0.a {
    ACCESS_TYPE_UNKNOWN(0),
    ACCESS_TYPE_READ(1),
    ACCESS_TYPE_WRITE(2);

    public static final int ACCESS_TYPE_READ_VALUE = 1;
    public static final int ACCESS_TYPE_UNKNOWN_VALUE = 0;
    public static final int ACCESS_TYPE_WRITE_VALUE = 2;
    private static final b0.b<PermissionProto$AccessType> internalValueMap = new a();
    private final int value;

    public class a implements b0.b<PermissionProto$AccessType> {
    }

    public static final class b implements b0.c {
        public static final b a = new b();

        @Override // androidx.health.platform.client.proto.b0.c
        public final boolean isInRange(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? null : PermissionProto$AccessType.ACCESS_TYPE_WRITE : PermissionProto$AccessType.ACCESS_TYPE_READ : PermissionProto$AccessType.ACCESS_TYPE_UNKNOWN) != null;
        }
    }

    PermissionProto$AccessType(int i) {
        this.value = i;
    }

    @Override // androidx.health.platform.client.proto.b0.a
    public final int getNumber() {
        return this.value;
    }
}
