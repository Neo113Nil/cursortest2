package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class FrameCropWindow {
    public final int bottom_offset;
    public final int left_offset;
    public final int right_offset;
    public final int top_offset;

    @CalledByNative
    public FrameCropWindow(int i10, int i11, int i12, int i13) {
        this.left_offset = i10;
        this.right_offset = i11;
        this.top_offset = i12;
        this.bottom_offset = i13;
    }
}
