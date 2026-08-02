package org.mp4parser.boxes.iso14496.part12;

import org.mp4parser.Box;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.support.DoNotParseDetail;

/* loaded from: classes10.dex */
public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    @DoNotParseDetail
    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (Box box : getBoxes()) {
            if (box instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) box;
            }
        }
        return null;
    }
}
