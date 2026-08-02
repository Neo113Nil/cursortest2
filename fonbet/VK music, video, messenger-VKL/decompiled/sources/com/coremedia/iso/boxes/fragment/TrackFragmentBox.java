package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractContainerBox;
import xsna.ga8;

/* loaded from: classes12.dex */
public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) ga8Var;
            }
        }
        return null;
    }
}
