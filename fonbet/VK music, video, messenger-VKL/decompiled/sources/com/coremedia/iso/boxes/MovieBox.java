package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;
import xsna.ga8;

/* loaded from: classes12.dex */
public class MovieBox extends AbstractContainerBox {
    public static final String TYPE = "moov";

    public MovieBox() {
        super(TYPE);
    }

    public MovieHeaderBox getMovieHeaderBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof MovieHeaderBox) {
                return (MovieHeaderBox) ga8Var;
            }
        }
        return null;
    }

    public int getTrackCount() {
        return getBoxes(TrackBox.class).size();
    }

    public long[] getTrackNumbers() {
        List boxes = getBoxes(TrackBox.class);
        long[] jArr = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            jArr[i] = ((TrackBox) boxes.get(i)).getTrackHeaderBox().getTrackId();
        }
        return jArr;
    }
}
