package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes10.dex */
public class TemporalLevelEntry extends GroupEntry {
    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public boolean isLevelIndependentlyDecodable() {
        return this.levelIndependentlyDecodable;
    }

    public void setLevelIndependentlyDecodable(boolean z) {
        this.levelIndependentlyDecodable = z;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        this.levelIndependentlyDecodable = (byteBuffer.get() & 128) == 128;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.levelIndependentlyDecodable ? 128 : 0));
        allocate.rewind();
        return allocate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemporalLevelEntry temporalLevelEntry = (TemporalLevelEntry) obj;
        return this.levelIndependentlyDecodable == temporalLevelEntry.levelIndependentlyDecodable && this.reserved == temporalLevelEntry.reserved;
    }

    public int hashCode() {
        return ((this.levelIndependentlyDecodable ? 1 : 0) * 31) + this.reserved;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.levelIndependentlyDecodable + AbstractJsonLexerKt.END_OBJ;
    }
}
