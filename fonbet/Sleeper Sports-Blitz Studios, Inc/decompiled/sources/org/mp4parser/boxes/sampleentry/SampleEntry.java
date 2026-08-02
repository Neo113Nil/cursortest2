package org.mp4parser.boxes.sampleentry;

import org.mp4parser.Container;
import org.mp4parser.ParsableBox;

/* loaded from: classes10.dex */
public interface SampleEntry extends ParsableBox, Container {
    int getDataReferenceIndex();

    void setDataReferenceIndex(int i);
}
