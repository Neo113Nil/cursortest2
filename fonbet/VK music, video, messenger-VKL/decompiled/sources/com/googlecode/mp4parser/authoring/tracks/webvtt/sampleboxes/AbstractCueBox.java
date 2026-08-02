package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.mp4parser.streaming.WriteOnlyBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.etx;
import xsna.imj0;
import xsna.up2;

/* loaded from: classes13.dex */
public abstract class AbstractCueBox extends WriteOnlyBox {
    String content;

    public AbstractCueBox(String str) {
        super(str);
        this.content = "";
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(up2.p(getSize()));
        allocate.putInt((int) getSize());
        allocate.put(etx.c(getType()));
        allocate.put(imj0.b(this.content));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public String getContent() {
        return this.content;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return imj0.j(this.content) + 8;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
