package org.mp4parser;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes10.dex */
public interface BoxParser {
    ParsableBox parseBox(ReadableByteChannel readableByteChannel, String str) throws IOException;
}
