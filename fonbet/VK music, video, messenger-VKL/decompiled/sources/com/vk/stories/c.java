package com.vk.stories;

import com.vk.stories.StoriesVideoEncoder;
import xsna.jkp0;

/* compiled from: StoriesVideoEncoder.kt */
/* loaded from: classes6.dex */
public final class c implements jkp0.a {
    public final /* synthetic */ StoriesVideoEncoder a;

    public c(StoriesVideoEncoder storiesVideoEncoder) {
        this.a = storiesVideoEncoder;
    }

    @Override // xsna.jkp0.a
    public final void a(final int i) {
        final StoriesVideoEncoder storiesVideoEncoder = this.a;
        storiesVideoEncoder.i.post(new Runnable() { // from class: xsna.awl0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesVideoEncoder.this.e.r(i);
            }
        });
    }

    @Override // xsna.jkp0.a
    public final void b(final int i) {
        final StoriesVideoEncoder storiesVideoEncoder = this.a;
        storiesVideoEncoder.i.post(new Runnable() { // from class: xsna.bwl0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesVideoEncoder.this.e.s(i);
            }
        });
    }
}
