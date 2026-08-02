package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import xsna.ga8;

/* loaded from: classes12.dex */
public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super(TYPE);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) ga8Var;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SampleTableBox) {
                return (SampleTableBox) ga8Var;
            }
        }
        return null;
    }
}
