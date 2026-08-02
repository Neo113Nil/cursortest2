package com.vk.media.pipeline.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.vk.media.pipeline.codec.CodecController;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.f100;
import xsna.hzf;
import xsna.izs;
import xsna.jzf;
import xsna.ppa0;
import xsna.s3q0;
import xsna.uzf;
import xsna.wzs;
import xsna.yzs;
import xsna.zrp;

/* compiled from: CodecDrainer.kt */
/* loaded from: classes3.dex */
public final class CodecDrainer<C extends hzf> {
    public final int a;
    public final C b;
    public final ppa0.a c;
    public final CodecController<C> d;
    public final MediaCodec.BufferInfo e = new MediaCodec.BufferInfo();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CodecDrainer.kt */
    public static final class DrainStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DrainStatus[] $VALUES;
        public static final DrainStatus CONTINUE;
        public static final DrainStatus STOP;

        static {
            DrainStatus drainStatus = new DrainStatus("CONTINUE", 0);
            CONTINUE = drainStatus;
            DrainStatus drainStatus2 = new DrainStatus("STOP", 1);
            STOP = drainStatus2;
            DrainStatus[] drainStatusArr = {drainStatus, drainStatus2};
            $VALUES = drainStatusArr;
            $ENTRIES = new asp(drainStatusArr);
        }

        public DrainStatus() {
            throw null;
        }

        public static DrainStatus valueOf(String str) {
            return (DrainStatus) Enum.valueOf(DrainStatus.class, str);
        }

        public static DrainStatus[] values() {
            return (DrainStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: CodecDrainer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CodecController.OutputBufferStatus.values().length];
            try {
                iArr[CodecController.OutputBufferStatus.OBTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CodecController.OutputBufferStatus.TRY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CodecController.OutputBufferStatus.OUTPUT_FORMAT_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodecDrainer(int i, hzf hzfVar, ppa0.a aVar, f100 f100Var) {
        this.a = i;
        this.b = hzfVar;
        this.c = aVar;
        this.d = new CodecController<>(hzfVar, f100Var, "CodecDrainer");
    }

    public static void c(CodecDrainer codecDrainer, Long l, int i) {
        MediaCodecException a2;
        if ((i & 1) != 0) {
            l = null;
        }
        CodecController<C> codecController = codecDrainer.d;
        String str = codecController.c;
        f100 f100Var = codecController.b;
        C c = codecController.a;
        if (l == null) {
            Integer num = codecController.e;
            if (num == null) {
                if (f100Var != null) {
                    f100Var.e(str, "attempt to release output buffer without successful dequeue");
                    return;
                }
                return;
            }
            codecController.e = null;
            int intValue = num.intValue();
            c.getClass();
            try {
                c.a.releaseOutputBuffer(intValue, false);
                s3q0 s3q0Var = s3q0.a;
                c.g.l++;
                return;
            } finally {
            }
        }
        long longValue = l.longValue();
        Integer num2 = codecController.e;
        if (num2 == null) {
            if (f100Var != null) {
                f100Var.e(str, "attempt to release output buffer without successful dequeue");
                return;
            }
            return;
        }
        codecController.e = null;
        int intValue2 = num2.intValue();
        c.getClass();
        try {
            c.a.releaseOutputBuffer(intValue2, longValue * 1000);
            s3q0 s3q0Var2 = s3q0.a;
            uzf.a aVar = c.g;
            aVar.l++;
            aVar.k++;
        } finally {
        }
    }

    public final void a(izs izsVar, wzs wzsVar, yzs yzsVar) {
        CodecController.OutputBufferStatus outputBufferStatus;
        ByteBuffer byteBuffer;
        CodecController<C> codecController = this.d;
        String str = codecController.c;
        f100 f100Var = codecController.b;
        C c = codecController.a;
        while (!((Boolean) this.c.get()).booleanValue() && !Thread.currentThread().isInterrupted()) {
            MediaCodec.BufferInfo bufferInfo = this.e;
            bufferInfo.set(0, 0, 0L, 0);
            if (codecController.e != null) {
                outputBufferStatus = CodecController.OutputBufferStatus.OBTAINED;
            } else {
                c.getClass();
                try {
                    int dequeueOutputBuffer = c.a.dequeueOutputBuffer(bufferInfo, 0L);
                    uzf.a aVar = c.g;
                    if (dequeueOutputBuffer >= 0) {
                        aVar.i++;
                    } else {
                        aVar.j++;
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        c.f = true;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        codecController.e = Integer.valueOf(dequeueOutputBuffer);
                        outputBufferStatus = CodecController.OutputBufferStatus.OBTAINED;
                    } else if (dequeueOutputBuffer == -1) {
                        outputBufferStatus = CodecController.OutputBufferStatus.TRY_LATER;
                    } else if (dequeueOutputBuffer == -2) {
                        outputBufferStatus = CodecController.OutputBufferStatus.OUTPUT_FORMAT_CHANGED;
                    } else {
                        if (f100Var != null) {
                            f100Var.w(str, "ignore dequeueOutputBuffer result - " + dequeueOutputBuffer);
                        }
                        outputBufferStatus = CodecController.OutputBufferStatus.TRY_LATER;
                    }
                } catch (Throwable th) {
                    throw c.a("dequeueOutputBuffer", th);
                }
            }
            int i = a.$EnumSwitchMapping$0[outputBufferStatus.ordinal()];
            if (i == 1) {
                Integer num = codecController.e;
                if (num != null) {
                    int intValue = num.intValue();
                    c.getClass();
                    try {
                        byteBuffer = c.a.getOutputBuffer(intValue);
                    } catch (Throwable th2) {
                        throw c.a("getOutputBuffer", th2);
                    }
                } else {
                    if (f100Var != null) {
                        f100Var.e(str, "attempt to get output buffer without successful dequeue");
                    }
                    byteBuffer = null;
                }
                if (yzsVar.invoke(this, byteBuffer, this.e) != DrainStatus.CONTINUE) {
                    return;
                }
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C c2 = this.b;
                c2.getClass();
                if (wzsVar.invoke(this, (MediaFormat) c2.d("getOutputFormat", jzf.b)) != DrainStatus.CONTINUE) {
                    return;
                }
            } else if (izsVar.invoke(this) != DrainStatus.CONTINUE) {
                return;
            }
        }
    }

    public final boolean b() {
        return this.d.a.f;
    }
}
