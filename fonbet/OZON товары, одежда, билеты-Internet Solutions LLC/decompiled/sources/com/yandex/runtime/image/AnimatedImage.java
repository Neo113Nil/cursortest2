package com.yandex.runtime.image;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class AnimatedImage {
    public static final int INFINITE_ANIMATION = 0;
    private final List<Frame> frames;
    private final int loopCount;

    public AnimatedImage(int i11, List<Frame> list) {
        this.frames = list;
        this.loopCount = i11;
    }

    public void addFrame(ImageProvider imageProvider, long j11) {
        this.frames.add(new Frame(imageProvider, j11));
    }

    public List<Frame> getFrames() {
        return this.frames;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public AnimatedImage(int i11) {
        this(i11, new ArrayList());
    }
}
