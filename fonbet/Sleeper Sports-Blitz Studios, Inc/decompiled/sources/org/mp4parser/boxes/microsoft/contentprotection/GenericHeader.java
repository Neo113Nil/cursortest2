package org.mp4parser.boxes.microsoft.contentprotection;

import io.sentry.util.StringUtils;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.mp4parser.boxes.microsoft.ProtectionSpecificHeader;

/* loaded from: classes10.dex */
public class GenericHeader extends ProtectionSpecificHeader {
    public static UUID PROTECTION_SYSTEM_ID = UUID.fromString(StringUtils.PROPER_NIL_UUID);
    ByteBuffer data;

    static {
        ProtectionSpecificHeader.uuidRegistry.put(PROTECTION_SYSTEM_ID, GenericHeader.class);
    }

    @Override // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public UUID getSystemId() {
        return PROTECTION_SYSTEM_ID;
    }

    @Override // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public void parse(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public ByteBuffer getData() {
        return this.data;
    }
}
