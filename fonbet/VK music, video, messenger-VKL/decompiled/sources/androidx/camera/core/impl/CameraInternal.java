package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import xsna.lf9;
import xsna.re9;
import xsna.ugz;
import xsna.ui9;
import xsna.vfq0;
import xsna.wiz;
import xsna.ze9;

/* loaded from: classes11.dex */
public interface CameraInternal extends lf9, vfq0.d {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);

        private final boolean mHoldsCameraSlot;

        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public final boolean h() {
            return this.mHoldsCameraSlot;
        }
    }

    @NonNull
    default ui9 b() {
        return c();
    }

    @NonNull
    ze9 c();

    @NonNull
    wiz d();

    void e(@NonNull ArrayList arrayList);

    void g(@NonNull ArrayList arrayList);

    @NonNull
    re9 h();

    @NonNull
    ugz<Void> release();
}
