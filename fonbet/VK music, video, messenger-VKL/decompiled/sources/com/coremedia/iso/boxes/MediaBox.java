package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import xsna.ga8;

/* loaded from: classes12.dex */
public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof HandlerBox) {
                return (HandlerBox) ga8Var;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof MediaHeaderBox) {
                return (MediaHeaderBox) ga8Var;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof MediaInformationBox) {
                return (MediaInformationBox) ga8Var;
            }
        }
        return null;
    }
}
