package org.socure.imgcodecs;

import java.util.ArrayList;
import java.util.List;
import org.socure.core.Mat;
import org.socure.core.MatOfInt;
import org.socure.core.Scalar;
import org.socure.utils.Converters;

/* loaded from: classes11.dex */
public class Animation {
    protected final long nativeObj;

    private static native void delete(long j);

    private static native double[] get_bgcolor_0(long j);

    private static native long get_durations_0(long j);

    private static native long get_frames_0(long j);

    private static native int get_loop_count_0(long j);

    private static native void set_bgcolor_0(long j, double d, double d2, double d3, double d4);

    private static native void set_durations_0(long j, long j2);

    private static native void set_frames_0(long j, long j2);

    private static native void set_loop_count_0(long j, int i);

    protected Animation(long j) {
        this.nativeObj = j;
    }

    public long getNativeObjAddr() {
        return this.nativeObj;
    }

    public static Animation __fromPtr__(long j) {
        return new Animation(j);
    }

    public int get_loop_count() {
        return get_loop_count_0(this.nativeObj);
    }

    public void set_loop_count(int i) {
        set_loop_count_0(this.nativeObj, i);
    }

    public Scalar get_bgcolor() {
        return new Scalar(get_bgcolor_0(this.nativeObj));
    }

    public void set_bgcolor(Scalar scalar) {
        set_bgcolor_0(this.nativeObj, scalar.val[0], scalar.val[1], scalar.val[2], scalar.val[3]);
    }

    public MatOfInt get_durations() {
        return MatOfInt.fromNativeAddr(get_durations_0(this.nativeObj));
    }

    public void set_durations(MatOfInt matOfInt) {
        set_durations_0(this.nativeObj, matOfInt.nativeObj);
    }

    public List<Mat> get_frames() {
        ArrayList arrayList = new ArrayList();
        Converters.Mat_to_vector_Mat(new Mat(get_frames_0(this.nativeObj)), arrayList);
        return arrayList;
    }

    public void set_frames(List<Mat> list) {
        set_frames_0(this.nativeObj, Converters.vector_Mat_to_Mat(list).nativeObj);
    }

    protected void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
