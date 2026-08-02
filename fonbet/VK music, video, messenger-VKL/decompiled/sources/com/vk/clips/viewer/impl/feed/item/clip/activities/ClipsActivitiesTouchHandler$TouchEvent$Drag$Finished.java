package com.vk.clips.viewer.impl.feed.item.clip.activities;

import com.vk.clips.viewer.impl.feed.item.clip.activities.a;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsActivitiesTouchHandler.kt */
/* loaded from: classes17.dex */
public final class ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished implements a.b {
    public final DragResult a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsActivitiesTouchHandler.kt */
    public static final class DragResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DragResult[] $VALUES;
        public static final DragResult DISMISSED;
        public static final DragResult RETURNED;

        static {
            DragResult dragResult = new DragResult("DISMISSED", 0);
            DISMISSED = dragResult;
            DragResult dragResult2 = new DragResult("RETURNED", 1);
            RETURNED = dragResult2;
            DragResult[] dragResultArr = {dragResult, dragResult2};
            $VALUES = dragResultArr;
            $ENTRIES = new asp(dragResultArr);
        }

        public DragResult() {
            throw null;
        }

        public static DragResult valueOf(String str) {
            return (DragResult) Enum.valueOf(DragResult.class, str);
        }

        public static DragResult[] values() {
            return (DragResult[]) $VALUES.clone();
        }
    }

    public ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished(DragResult dragResult) {
        this.a = dragResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished) && this.a == ((ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Finished(result=" + this.a + ')';
    }
}
