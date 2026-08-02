package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;
import xsna.ga8;

/* loaded from: classes12.dex */
public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(TYPE);
    }

    public MediaBox getMediaBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof MediaBox) {
                return (MediaBox) ga8Var;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        MediaInformationBox mediaInformationBox;
        SampleTableBox sampleTableBox = this.sampleTableBox;
        if (sampleTableBox != null) {
            return sampleTableBox;
        }
        MediaBox mediaBox = getMediaBox();
        if (mediaBox == null || (mediaInformationBox = mediaBox.getMediaInformationBox()) == null) {
            return null;
        }
        SampleTableBox sampleTableBox2 = mediaInformationBox.getSampleTableBox();
        this.sampleTableBox = sampleTableBox2;
        return sampleTableBox2;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof TrackHeaderBox) {
                return (TrackHeaderBox) ga8Var;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void setBoxes(List<ga8> list) {
        super.setBoxes(list);
        this.sampleTableBox = null;
    }
}
