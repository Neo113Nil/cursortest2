package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.b6h;
import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "", PlayerKt.E_SPORTS_TOP, "", "start", "bottom", TtmlNode.END, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTop", "()Ljava/lang/Integer;", "setTop", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStart", "setStart", "getBottom", "setBottom", "getEnd", "setEnd", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "equals", "", "other", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InsetsRemoteDto {
    public static final int $stable = 8;

    @b6h("bottom")
    @Nullable
    private Integer bottom;

    @b6h(TtmlNode.END)
    @Nullable
    private Integer end;

    @b6h("start")
    @Nullable
    private Integer start;

    @b6h(PlayerKt.E_SPORTS_TOP)
    @Nullable
    private Integer top;

    public InsetsRemoteDto(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.top = num;
        this.start = num2;
        this.bottom = num3;
        this.end = num4;
    }

    public static /* synthetic */ InsetsRemoteDto copy$default(InsetsRemoteDto insetsRemoteDto, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = insetsRemoteDto.top;
        }
        if ((i & 2) != 0) {
            num2 = insetsRemoteDto.start;
        }
        if ((i & 4) != 0) {
            num3 = insetsRemoteDto.bottom;
        }
        if ((i & 8) != 0) {
            num4 = insetsRemoteDto.end;
        }
        return insetsRemoteDto.copy(num, num2, num3, num4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTop() {
        return this.top;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getStart() {
        return this.start;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getBottom() {
        return this.bottom;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getEnd() {
        return this.end;
    }

    @NotNull
    public final InsetsRemoteDto copy(@Nullable Integer top, @Nullable Integer start, @Nullable Integer bottom, @Nullable Integer end) {
        return new InsetsRemoteDto(top, start, bottom, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsRemoteDto)) {
            return false;
        }
        InsetsRemoteDto insetsRemoteDto = (InsetsRemoteDto) other;
        return Intrinsics.c(this.top, insetsRemoteDto.top) && Intrinsics.c(this.start, insetsRemoteDto.start) && Intrinsics.c(this.bottom, insetsRemoteDto.bottom) && Intrinsics.c(this.end, insetsRemoteDto.end);
    }

    @Nullable
    public final Integer getBottom() {
        return this.bottom;
    }

    @Nullable
    public final Integer getEnd() {
        return this.end;
    }

    @Nullable
    public final Integer getStart() {
        return this.start;
    }

    @Nullable
    public final Integer getTop() {
        return this.top;
    }

    public int hashCode() {
        Integer num = this.top;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.start;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottom;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.end;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setBottom(@Nullable Integer num) {
        this.bottom = num;
    }

    public final void setEnd(@Nullable Integer num) {
        this.end = num;
    }

    public final void setStart(@Nullable Integer num) {
        this.start = num;
    }

    public final void setTop(@Nullable Integer num) {
        this.top = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InsetsRemoteDto(top=");
        sb.append(this.top);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", end=");
        return bf3.n(sb, this.end, ')');
    }
}
