package org.mp4parser;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* loaded from: classes10.dex */
public interface Container {
    List<Box> getBoxes();

    <T extends Box> List<T> getBoxes(Class<T> cls);

    <T extends Box> List<T> getBoxes(Class<T> cls, boolean z);

    void setBoxes(List<? extends Box> list);

    void writeContainer(WritableByteChannel writableByteChannel) throws IOException;
}
