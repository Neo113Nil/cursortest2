package xf;

import android.annotation.SuppressLint;
import android.util.StatsEvent;
import android.util.StatsLog;

/* renamed from: xf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10770b {
    public static void a(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(762);
        newBuilder.writeLong(j11);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeInt(i16);
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i21);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void b(long j11, int i11, int i12, int i13, int i14, int i15, long j12, int i16, int i17, boolean z11, boolean z12, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, String str, int i33) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(704);
        newBuilder.writeLong(j11);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeLong(j12);
        newBuilder.writeInt(i16);
        newBuilder.writeInt(i17);
        newBuilder.writeBoolean(z11);
        newBuilder.writeBoolean(z12);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i21);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.writeInt(i25);
        newBuilder.writeInt(i26);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.writeInt(i27);
        newBuilder.writeInt(i28);
        newBuilder.writeInt(i29);
        newBuilder.writeInt(i31);
        newBuilder.writeInt(i32);
        newBuilder.writeString(str);
        newBuilder.writeInt(i33);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void c(long j11, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, int i16, boolean z13, boolean z14, boolean z15, int i17, String str, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i41, long j12, int i42) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(703);
        newBuilder.writeLong(j11);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeBoolean(z11);
        newBuilder.writeBoolean(z12);
        newBuilder.writeInt(i16);
        newBuilder.writeBoolean(z13);
        newBuilder.writeBoolean(z14);
        newBuilder.writeBoolean(z15);
        newBuilder.writeInt(i17);
        newBuilder.writeString(str);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i21);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.writeInt(i25);
        newBuilder.writeInt(i26);
        newBuilder.writeInt(i27);
        newBuilder.writeInt(i28);
        newBuilder.writeInt(i29);
        newBuilder.writeInt(i31);
        newBuilder.writeInt(i32);
        newBuilder.writeInt(i33);
        newBuilder.writeInt(i34);
        newBuilder.writeInt(i35);
        newBuilder.writeInt(i36);
        newBuilder.writeInt(i37);
        newBuilder.writeInt(i38);
        newBuilder.writeInt(i39);
        newBuilder.writeInt(i41);
        newBuilder.writeLong(j12);
        newBuilder.writeInt(i42);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static void d(long j11, int i11, int i12, int i13, long[] jArr, long[] jArr2, String str, int i14, int i15) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(764);
        newBuilder.writeLong(j11);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(-1);
        newBuilder.writeInt(i13);
        newBuilder.writeLongArray(jArr);
        newBuilder.writeLongArray(jArr2);
        newBuilder.writeString(str);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }
}
