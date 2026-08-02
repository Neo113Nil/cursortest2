package com.vk.media.pipeline.session.transform.task.transcode.producer.framerate;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.f100;
import xsna.zrp;

/* compiled from: FrameRateController.kt */
/* loaded from: classes3.dex */
public final class FrameRateController {
    public final f100 a;
    public final ResultType b;
    public final double c;
    public double d;
    public int e;
    public int f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FrameRateController.kt */
    public static final class ResultType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResultType[] $VALUES;
        public static final ResultType DUPLICATE;
        public static final ResultType NO_CHANGES;
        public static final ResultType SKIP;

        static {
            ResultType resultType = new ResultType("NO_CHANGES", 0);
            NO_CHANGES = resultType;
            ResultType resultType2 = new ResultType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
            SKIP = resultType2;
            ResultType resultType3 = new ResultType("DUPLICATE", 2);
            DUPLICATE = resultType3;
            ResultType[] resultTypeArr = {resultType, resultType2, resultType3};
            $VALUES = resultTypeArr;
            $ENTRIES = new asp(resultTypeArr);
        }

        public ResultType() {
            throw null;
        }

        public static ResultType valueOf(String str) {
            return (ResultType) Enum.valueOf(ResultType.class, str);
        }

        public static ResultType[] values() {
            return (ResultType[]) $VALUES.clone();
        }
    }

    /* compiled from: FrameRateController.kt */
    public static final class a {
        public final ResultType a;
        public final int b;

        public a(ResultType resultType, int i) {
            this.a = resultType;
            this.b = i;
        }
    }

    /* compiled from: FrameRateController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResultType.values().length];
            try {
                iArr[ResultType.NO_CHANGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultType.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultType.DUPLICATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FrameRateController(int i, int i2, f100 f100Var) {
        this.a = f100Var;
        ResultType resultType = i2 == i ? ResultType.NO_CHANGES : i2 > i ? ResultType.DUPLICATE : ResultType.SKIP;
        this.b = resultType;
        this.c = (Integer.max(i, i2) * 1.0d) / Integer.min(i, i2);
        if (f100Var != null) {
            f100Var.d("FrameRateController", "frame rate control is enabled, type=" + resultType + ", inFps=" + i + ", outFps=" + i2);
        }
    }

    public final a a() {
        this.e++;
        int i = b.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            this.f++;
            return new a(ResultType.NO_CHANGES, -1);
        }
        double d = this.c;
        if (i == 2) {
            double d2 = this.d;
            if (d2 >= 1.0d) {
                this.d = d2 - 1.0d;
                return new a(ResultType.SKIP, -1);
            }
            this.f++;
            this.d = (d - 1) + d2;
            return new a(ResultType.NO_CHANGES, -1);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        double d3 = (d - 1) + this.d;
        this.d = d3;
        if (d3 < 1.0d) {
            this.f++;
            return new a(ResultType.NO_CHANGES, -1);
        }
        int i2 = (int) d3;
        this.d = d3 - i2;
        this.f = i2 + 1 + this.f;
        return new a(ResultType.DUPLICATE, i2);
    }
}
