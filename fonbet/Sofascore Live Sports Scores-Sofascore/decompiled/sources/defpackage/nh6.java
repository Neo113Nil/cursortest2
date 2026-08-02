package defpackage;

import androidx.media3.common.b;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface nh6 {
    void b(boolean z);

    boolean d(int i, long j);

    void disable();

    int e(b bVar);

    void enable();

    int evaluateQueueSize(long j, List list);

    default boolean f(long j, mu2 mu2Var, List list) {
        return false;
    }

    boolean g(int i, long j);

    b getFormat(int i);

    int getIndexInTrackGroup(int i);

    b getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    osj getTrackGroup();

    void h(long j, long j2, long j3, List list, k2c[] k2cVarArr);

    int indexOf(int i);

    int length();

    void onPlaybackSpeed(float f);

    default void a() {
    }

    default void c() {
    }
}
