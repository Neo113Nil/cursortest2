package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.ga8;
import xsna.pa8;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes12.dex */
public interface FullBox extends ga8 {
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    int getFlags();

    /* synthetic */ long getOffset();

    @Override // xsna.ga8
    /* synthetic */ yej getParent();

    /* synthetic */ long getSize();

    @Override // xsna.ga8
    /* synthetic */ String getType();

    int getVersion();

    /* synthetic */ void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException;

    void setFlags(int i);

    @Override // xsna.ga8
    /* synthetic */ void setParent(yej yejVar);

    void setVersion(int i);
}
