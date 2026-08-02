package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import xsna.ga8;

/* loaded from: classes12.dex */
public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) ga8Var;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) ga8Var;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) ga8Var;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) ga8Var;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SampleSizeBox) {
                return (SampleSizeBox) ga8Var;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox = this.sampleToChunkBox;
        if (sampleToChunkBox != null) {
            return sampleToChunkBox;
        }
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SampleToChunkBox) {
                SampleToChunkBox sampleToChunkBox2 = (SampleToChunkBox) ga8Var;
                this.sampleToChunkBox = sampleToChunkBox2;
                return sampleToChunkBox2;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof SyncSampleBox) {
                return (SyncSampleBox) ga8Var;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (ga8 ga8Var : getBoxes()) {
            if (ga8Var instanceof TimeToSampleBox) {
                return (TimeToSampleBox) ga8Var;
            }
        }
        return null;
    }
}
