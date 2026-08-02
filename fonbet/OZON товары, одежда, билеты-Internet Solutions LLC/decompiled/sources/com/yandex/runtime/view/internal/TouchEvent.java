package com.yandex.runtime.view.internal;

import android.view.MotionEvent;
import com.yandex.runtime.bindings.internal.ArchiveWriter;

/* loaded from: classes9.dex */
public class TouchEvent {

    private enum Type {
        BEGAN,
        ENDED,
        MOVED,
        CANCELED
    }

    private static boolean filterAction(MotionEvent motionEvent, int i11) {
        return (motionEvent.getActionMasked() == 6 && motionEvent.getActionIndex() == i11) ? false : true;
    }

    private static int getFilteredActionsCount(MotionEvent motionEvent) {
        int i11 = 0;
        for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
            if (filterAction(motionEvent, i12)) {
                i11++;
            }
        }
        return i11;
    }

    private static Type getType(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return Type.BEGAN;
        }
        if (actionMasked == 1) {
            return Type.ENDED;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                return Type.CANCELED;
            }
            if (actionMasked != 5 && actionMasked != 6) {
                return null;
            }
        }
        return Type.MOVED;
    }

    public static boolean isTouchEvent(MotionEvent motionEvent) {
        return getType(motionEvent) != null;
    }

    public static void serialize(MotionEvent motionEvent, ArchiveWriter archiveWriter) {
        archiveWriter.add((ArchiveWriter) getType(motionEvent), false, (Class<ArchiveWriter>) Type.class);
        archiveWriter.add(motionEvent.getEventTime());
        archiveWriter.add(getFilteredActionsCount(motionEvent));
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            if (filterAction(motionEvent, i11)) {
                archiveWriter.add(motionEvent.getPointerId(i11));
                archiveWriter.add(motionEvent.getX(i11));
                archiveWriter.add(motionEvent.getY(i11));
            }
        }
    }
}
