package com.vk.media.pipeline.codec;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import xsna.asp;
import xsna.f100;
import xsna.hzf;
import xsna.k3r0;
import xsna.s3q0;
import xsna.uzf;
import xsna.zrp;

/* compiled from: CodecController.kt */
/* loaded from: classes3.dex */
public final class CodecController<C extends hzf> {
    public final C a;
    public final f100 b;
    public final String c;
    public Integer d;
    public Integer e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CodecController.kt */
    public static final class InputBufferStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputBufferStatus[] $VALUES;
        public static final InputBufferStatus OBTAINED;
        public static final InputBufferStatus TRY_LATER;

        static {
            InputBufferStatus inputBufferStatus = new InputBufferStatus("OBTAINED", 0);
            OBTAINED = inputBufferStatus;
            InputBufferStatus inputBufferStatus2 = new InputBufferStatus("TRY_LATER", 1);
            TRY_LATER = inputBufferStatus2;
            InputBufferStatus[] inputBufferStatusArr = {inputBufferStatus, inputBufferStatus2};
            $VALUES = inputBufferStatusArr;
            $ENTRIES = new asp(inputBufferStatusArr);
        }

        public InputBufferStatus() {
            throw null;
        }

        public static InputBufferStatus valueOf(String str) {
            return (InputBufferStatus) Enum.valueOf(InputBufferStatus.class, str);
        }

        public static InputBufferStatus[] values() {
            return (InputBufferStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CodecController.kt */
    public static final class OutputBufferStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OutputBufferStatus[] $VALUES;
        public static final OutputBufferStatus OBTAINED;
        public static final OutputBufferStatus OUTPUT_FORMAT_CHANGED;
        public static final OutputBufferStatus TRY_LATER;

        static {
            OutputBufferStatus outputBufferStatus = new OutputBufferStatus("OBTAINED", 0);
            OBTAINED = outputBufferStatus;
            OutputBufferStatus outputBufferStatus2 = new OutputBufferStatus("TRY_LATER", 1);
            TRY_LATER = outputBufferStatus2;
            OutputBufferStatus outputBufferStatus3 = new OutputBufferStatus("OUTPUT_FORMAT_CHANGED", 2);
            OUTPUT_FORMAT_CHANGED = outputBufferStatus3;
            OutputBufferStatus[] outputBufferStatusArr = {outputBufferStatus, outputBufferStatus2, outputBufferStatus3};
            $VALUES = outputBufferStatusArr;
            $ENTRIES = new asp(outputBufferStatusArr);
        }

        public OutputBufferStatus() {
            throw null;
        }

        public static OutputBufferStatus valueOf(String str) {
            return (OutputBufferStatus) Enum.valueOf(OutputBufferStatus.class, str);
        }

        public static OutputBufferStatus[] values() {
            return (OutputBufferStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodecController(hzf hzfVar, f100 f100Var, String str) {
        this.a = hzfVar;
        this.b = f100Var;
        this.c = str;
    }

    public final ByteBuffer a() {
        Integer num = this.d;
        if (num == null) {
            f100 f100Var = this.b;
            if (f100Var == null) {
                return null;
            }
            f100Var.e(this.c, "attempt to get input buffer without successful dequeue");
            return null;
        }
        int intValue = num.intValue();
        C c = this.a;
        c.getClass();
        try {
            return c.a.getInputBuffer(intValue);
        } catch (Throwable th) {
            throw c.a("getInputBuffer", th);
        }
    }

    public final void b(int i, int i2, int i3, long j) {
        MediaCodecException a;
        Integer num = this.d;
        if (num == null) {
            f100 f100Var = this.b;
            if (f100Var != null) {
                f100Var.e(this.c, "attempt to queue input buffer without successful dequeue");
                return;
            }
            return;
        }
        int intValue = num.intValue();
        C c = this.a;
        String str = c.c;
        MediaCodec mediaCodec = c.a;
        f100 f100Var2 = c.b;
        uzf.a aVar = c.g;
        int i4 = i3 & 4;
        if (i4 == 0) {
            try {
                mediaCodec.queueInputBuffer(intValue, i, i2, j, i3);
                s3q0 s3q0Var = s3q0.a;
                aVar.f++;
                if (i4 != 0) {
                    aVar.d++;
                }
            } finally {
            }
        } else {
            if (c.e) {
                aVar.e++;
                if (f100Var2 != null) {
                    f100Var2.w(str, "EOS has already been sent, skip=" + k3r0.a(i, i2, i3, j));
                    return;
                }
                return;
            }
            if (f100Var2 != null) {
                f100Var2.v(str, "send EOS=" + k3r0.a(i, i2, i3, j) + " ...");
            }
            try {
                mediaCodec.queueInputBuffer(intValue, i, i2, j, i3);
                s3q0 s3q0Var2 = s3q0.a;
                aVar.f++;
                if (i4 != 0) {
                    aVar.d++;
                }
                c.e = true;
                c.f = false;
            } finally {
            }
        }
        this.d = null;
    }
}
