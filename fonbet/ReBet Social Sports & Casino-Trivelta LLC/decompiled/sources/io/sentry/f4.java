package io.sentry;

import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public enum f4 implements G0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION),
    UNKNOWN(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION),
    UNKNOWN_ERROR(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWTHICKNESS),
    UNAVAILABLE(503),
    DATA_LOSS(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION),
    UNAUTHENTICATED(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f4 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return f4.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
        }
    }

    f4(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    @Nullable
    public static f4 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static f4 fromHttpStatusCode(int i10) {
        for (f4 f4Var : values()) {
            if (f4Var.matches(i10)) {
                return f4Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.e(apiName());
    }

    @NotNull
    public static f4 fromHttpStatusCode(@Nullable Integer num, @NotNull f4 f4Var) {
        f4 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : f4Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : f4Var;
    }

    f4(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
