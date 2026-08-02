package androidx.media3.transformer;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import xsna.fi20;
import xsna.hdu;
import xsna.hjp;
import xsna.io20;
import xsna.m6g;

/* compiled from: SampleExporter.java */
/* loaded from: classes12.dex */
public abstract class x {
    public final MuxerWrapper a;
    public final int b;

    @Nullable
    public final fi20 c;
    public boolean d;

    public x(androidx.media3.common.a aVar, MuxerWrapper muxerWrapper) {
        this.a = muxerWrapper;
        this.c = aVar.l;
        this.b = c0.c(aVar.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static String c(androidx.media3.common.a aVar, List<String> list) {
        String str = aVar.n;
        m6g m6gVar = aVar.D;
        str.getClass();
        boolean p = io20.p(str);
        ImmutableSet.a aVar2 = new ImmutableSet.a(4);
        aVar2.g(str);
        if (p) {
            aVar2.c("video/hevc");
            aVar2.c("video/avc");
        }
        aVar2.h(list);
        ImmutableList d = aVar2.i().d();
        for (int i = 0; i < d.size(); i++) {
            String str2 = (String) d.get(i);
            if (list.contains(str2)) {
                if (p && m6g.h(m6gVar)) {
                    if (!hjp.f(str2, m6gVar).isEmpty()) {
                        return str2;
                    }
                } else if (!hjp.e(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract hdu j(m mVar, androidx.media3.common.a aVar, int i) throws ExportException;

    @Nullable
    public abstract DecoderInputBuffer k() throws ExportException;

    @Nullable
    public abstract androidx.media3.common.a l() throws ExportException;

    public abstract boolean m();

    public boolean n() throws ExportException {
        return false;
    }

    public abstract void o();

    public abstract void p() throws ExportException;
}
