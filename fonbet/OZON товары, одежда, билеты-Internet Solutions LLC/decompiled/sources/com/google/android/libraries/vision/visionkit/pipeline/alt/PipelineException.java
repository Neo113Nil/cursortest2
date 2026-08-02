package com.google.android.libraries.vision.visionkit.pipeline.alt;

import G.g;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import h7.C6828d;
import h7.M0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Keep
@UsedByNative("pipeline_jni.cc")
/* loaded from: classes9.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final d statusCode;
    private final String statusMessage;
    private final M0 visionkitStatus;

    public PipelineException(int i11, @NonNull String str) {
        super(g.c(d.values()[i11].a(), ": ", str));
        this.statusCode = d.values()[i11];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    @NonNull
    public List<C6828d> getComponentStatuses() {
        M0 m02 = this.visionkitStatus;
        return m02 != null ? m02.zbf() : zbkx.zbh();
    }

    public zbki<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return zbki.zbd();
        }
        List zbb = zbko.zba(ROOT_CAUSE_DELIMITER).zbb(this.statusMessage);
        if (zbb instanceof List) {
            List list = zbb;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else {
            Iterator it = zbb.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return zbki.zbe((String) obj);
    }

    public d getStatusCode() {
        return this.statusCode;
    }

    @NonNull
    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(M0 m02) {
        super(g.c(d.values()[m02.a()].a(), ": ", m02.d()));
        this.statusCode = d.values()[m02.a()];
        this.statusMessage = m02.d();
        this.visionkitStatus = m02;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    PipelineException(byte[] bArr) throws zbuq {
        this(M0.c(bArr, zbtp.zba()));
    }
}
