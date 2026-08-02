package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class ContinuePlaybackActionDto implements a {
    public static final Companion Companion = new Companion();
    public final ContinuePlaybackActionArgsDto a;

    public static final class Companion {
        public final KSerializer<ContinuePlaybackActionDto> serializer() {
            return ContinuePlaybackActionDto$$serializer.INSTANCE;
        }
    }

    @imi0
    public static final class ContinuePlaybackActionArgsDto {
        public static final Companion Companion = new Companion();
        public final Boolean a;

        public static final class Companion {
            public final KSerializer<ContinuePlaybackActionArgsDto> serializer() {
                return ContinuePlaybackActionDto$ContinuePlaybackActionArgsDto$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ContinuePlaybackActionArgsDto(int i, Boolean bool) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinuePlaybackActionArgsDto) && epx.f(this.a, ((ContinuePlaybackActionArgsDto) obj).a);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return "ContinuePlaybackActionArgsDto(shouldOpenNow=" + this.a + ")";
        }

        public ContinuePlaybackActionArgsDto() {
            this.a = null;
        }
    }

    public /* synthetic */ ContinuePlaybackActionDto(int i, ContinuePlaybackActionArgsDto continuePlaybackActionArgsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = continuePlaybackActionArgsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContinuePlaybackActionDto) && epx.f(this.a, ((ContinuePlaybackActionDto) obj).a);
    }

    public final int hashCode() {
        ContinuePlaybackActionArgsDto continuePlaybackActionArgsDto = this.a;
        if (continuePlaybackActionArgsDto == null) {
            return 0;
        }
        return continuePlaybackActionArgsDto.hashCode();
    }

    public final String toString() {
        return "ContinuePlaybackActionDto(args=" + this.a + ")";
    }

    public ContinuePlaybackActionDto() {
        this.a = null;
    }
}
