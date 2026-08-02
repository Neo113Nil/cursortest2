package com.blaze.blazesdk.closed_captions.models.dto;

import androidx.annotation.Keep;
import com.ironsource.S5;
import defpackage.b6h;
import defpackage.lnb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsDto;", "", "files", "", "Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsFileDto;", "language", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", S5.b.d, "()Ljava/util/List;", "getLanguage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClosedCaptionsDto {
    public static final int $stable = 8;

    @b6h("files")
    @Nullable
    private final List<ClosedCaptionsFileDto> files;

    @b6h("language")
    @Nullable
    private final String language;

    public ClosedCaptionsDto(@Nullable List<ClosedCaptionsFileDto> list, @Nullable String str) {
        this.files = list;
        this.language = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClosedCaptionsDto copy$default(ClosedCaptionsDto closedCaptionsDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = closedCaptionsDto.files;
        }
        if ((i & 2) != 0) {
            str = closedCaptionsDto.language;
        }
        return closedCaptionsDto.copy(list, str);
    }

    @Nullable
    public final List<ClosedCaptionsFileDto> component1() {
        return this.files;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final ClosedCaptionsDto copy(@Nullable List<ClosedCaptionsFileDto> files, @Nullable String language) {
        return new ClosedCaptionsDto(files, language);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosedCaptionsDto)) {
            return false;
        }
        ClosedCaptionsDto closedCaptionsDto = (ClosedCaptionsDto) other;
        return Intrinsics.c(this.files, closedCaptionsDto.files) && Intrinsics.c(this.language, closedCaptionsDto.language);
    }

    @Nullable
    public final List<ClosedCaptionsFileDto> getFiles() {
        return this.files;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        List<ClosedCaptionsFileDto> list = this.files;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.language;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ClosedCaptionsDto(files=");
        sb.append(this.files);
        sb.append(", language=");
        return lnb.q(sb, this.language, ')');
    }
}
