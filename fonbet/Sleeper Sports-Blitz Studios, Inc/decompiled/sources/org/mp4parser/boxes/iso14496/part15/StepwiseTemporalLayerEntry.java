package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.boxes.samplegrouping.GroupEntry;

/* loaded from: classes10.dex */
public class StepwiseTemporalLayerEntry extends GroupEntry {
    public static final String TYPE = "stsa";

    public int hashCode() {
        return 37;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        return ByteBuffer.allocate(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }
}
