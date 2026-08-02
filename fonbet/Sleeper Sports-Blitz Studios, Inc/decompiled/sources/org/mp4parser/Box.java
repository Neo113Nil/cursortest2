package org.mp4parser;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes10.dex */
public interface Box {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    long getSize();

    String getType();
}
