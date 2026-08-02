package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class NullMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "nmhd";

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 4L;
    }

    public NullMediaHeaderBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
    }
}
