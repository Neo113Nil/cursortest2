package com.davidehrmann.vcdiff;

import java.io.IOException;
import java.util.EnumSet;

/* loaded from: classes6.dex */
public interface VCDiffCodeTableWriter<OUT> {
    void add(byte[] bArr, int i, int i2);

    void addChecksum(int i);

    void copy(int i, int i2);

    void finishEncoding(OUT out) throws IOException;

    void init(int i) throws IOException;

    void output(OUT out) throws IOException;

    void run(int i, byte b);

    void writeHeader(OUT out, EnumSet<VCDiffFormatExtension> enumSet) throws IOException;
}
