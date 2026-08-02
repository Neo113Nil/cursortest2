package com.vk.media.pipeline.codec;

import android.media.MediaCodec;
import com.vk.media.pipeline.codec.CodecController;
import com.vk.media.pipeline.codec.CodecFeeder;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.f100;
import xsna.hzf;
import xsna.izs;
import xsna.kzf;
import xsna.ppa0;
import xsna.uzf;
import xsna.zis0;
import xsna.zrp;
import xsna.zzs;

/* compiled from: CodecFeeder.kt */
/* loaded from: classes3.dex */
public final class CodecFeeder<C extends hzf> {
    public final C a;
    public final long b;
    public final ppa0.a c;
    public final f100 d;
    public final CodecController<C> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CodecFeeder.kt */
    public static final class FeedStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedStatus[] $VALUES;
        public static final FeedStatus CONTINUE;
        public static final FeedStatus STOP;

        static {
            FeedStatus feedStatus = new FeedStatus("CONTINUE", 0);
            CONTINUE = feedStatus;
            FeedStatus feedStatus2 = new FeedStatus("STOP", 1);
            STOP = feedStatus2;
            FeedStatus[] feedStatusArr = {feedStatus, feedStatus2};
            $VALUES = feedStatusArr;
            $ENTRIES = new asp(feedStatusArr);
        }

        public FeedStatus() {
            throw null;
        }

        public static FeedStatus valueOf(String str) {
            return (FeedStatus) Enum.valueOf(FeedStatus.class, str);
        }

        public static FeedStatus[] values() {
            return (FeedStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: CodecFeeder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CodecController.InputBufferStatus.values().length];
            try {
                iArr[CodecController.InputBufferStatus.OBTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CodecController.InputBufferStatus.TRY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodecFeeder(hzf hzfVar, long j, ppa0.a aVar, f100 f100Var) {
        this.a = hzfVar;
        this.b = j;
        this.c = aVar;
        this.d = f100Var;
        this.e = new CodecController<>(hzfVar, f100Var, "CodecFeeder");
    }

    public final <Sample> void a(Sample sample, MediaCodec.BufferInfo bufferInfo, zzs<? super CodecFeeder<C>, ? super Sample, ? super MediaCodec.BufferInfo, ? super ByteBuffer, ? extends FeedStatus> zzsVar, izs<? super CodecFeeder<C>, ? extends FeedStatus> izsVar) {
        CodecController.InputBufferStatus inputBufferStatus;
        while (!((Boolean) this.c.get()).booleanValue() && !Thread.currentThread().isInterrupted()) {
            long j = this.b;
            CodecController<C> codecController = this.e;
            if (codecController.d != null) {
                inputBufferStatus = CodecController.InputBufferStatus.OBTAINED;
            } else {
                C c = codecController.a;
                c.getClass();
                try {
                    int dequeueInputBuffer = c.a.dequeueInputBuffer(j);
                    uzf.a aVar = c.g;
                    if (dequeueInputBuffer >= 0) {
                        aVar.h++;
                    } else {
                        aVar.g++;
                    }
                    if (dequeueInputBuffer >= 0) {
                        c.e = false;
                        c.f = false;
                    }
                    if (dequeueInputBuffer >= 0) {
                        codecController.d = Integer.valueOf(dequeueInputBuffer);
                        inputBufferStatus = CodecController.InputBufferStatus.OBTAINED;
                    } else {
                        inputBufferStatus = CodecController.InputBufferStatus.TRY_LATER;
                    }
                } catch (Throwable th) {
                    throw c.a("dequeueInputBuffer", th);
                }
            }
            int i = a.$EnumSwitchMapping$0[inputBufferStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (izsVar.invoke(this) != FeedStatus.CONTINUE) {
                    return;
                }
            } else if (zzsVar.invoke(this, sample, bufferInfo, codecController.a()) != FeedStatus.CONTINUE) {
                return;
            }
        }
    }

    public final void b(izs<? super CodecFeeder<C>, ? extends FeedStatus> izsVar) {
        C c = this.e.a;
        boolean z = c.e;
        C c2 = this.a;
        if (z) {
            f100 f100Var = this.d;
            if (f100Var != null) {
                f100Var.e("CodecFeeder", "tried to resend EOS to ".concat(c2.c));
                return;
            }
            return;
        }
        if (!(c2 instanceof zis0)) {
            a(0, new MediaCodec.BufferInfo(), new zzs() { // from class: xsna.mzf
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Integer) obj2).intValue();
                    CodecFeeder.this.e.b(0, 0, 4, 0L);
                    return CodecFeeder.FeedStatus.STOP;
                }
            }, izsVar);
            return;
        }
        uzf.a aVar = c.g;
        String str = c.c;
        f100 f100Var2 = c.b;
        if (z) {
            aVar.e++;
            if (f100Var2 != null) {
                f100Var2.w(str, "EOS was already sent, skip");
                return;
            }
            return;
        }
        if (f100Var2 != null) {
            f100Var2.v(str, "send EOS...");
        }
        c.d("signalEndOfInputStream", kzf.b);
        aVar.d++;
        c.e = true;
        c.f = false;
    }

    public final void c(MediaCodec.BufferInfo bufferInfo) {
        int i = bufferInfo.offset;
        int i2 = bufferInfo.size;
        long j = bufferInfo.presentationTimeUs;
        this.e.b(i, i2, bufferInfo.flags, j);
    }
}
