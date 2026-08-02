package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import xsna.ga8;
import xsna.pa8;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes12.dex */
public interface SampleEntry extends ga8, yej {
    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    @Override // xsna.yej
    /* synthetic */ List getBoxes();

    @Override // xsna.yej
    /* synthetic */ List getBoxes(Class cls);

    @Override // xsna.yej
    /* synthetic */ List getBoxes(Class cls, boolean z);

    @Override // xsna.yej
    /* synthetic */ ByteBuffer getByteBuffer(long j, long j2) throws IOException;

    int getDataReferenceIndex();

    /* synthetic */ long getOffset();

    @Override // xsna.ga8
    /* synthetic */ yej getParent();

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    /* synthetic */ long getSize();

    @Override // xsna.ga8
    /* synthetic */ String getType();

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException;

    /* synthetic */ void setBoxes(List list);

    void setDataReferenceIndex(int i);

    @Override // xsna.ga8
    /* synthetic */ void setParent(yej yejVar);

    @Override // xsna.yej
    /* synthetic */ void writeContainer(WritableByteChannel writableByteChannel) throws IOException;
}
