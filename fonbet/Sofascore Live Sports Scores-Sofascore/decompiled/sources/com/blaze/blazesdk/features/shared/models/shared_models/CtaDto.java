package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;", "", "type", "Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaTypeDto;", "text", "", "url", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "textColor", "enhancements", "Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto;", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto;)V", "getType", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaTypeDto;", "getText", "()Ljava/lang/String;", "getUrl", "getBackgroundColor", "getTextColor", "getEnhancements", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CtaDto {
    public static final int $stable = 0;

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final CTAEnhancementsDto enhancements;

    @Nullable
    private final String text;

    @Nullable
    private final String textColor;

    @Nullable
    private final CtaTypeDto type;

    @Nullable
    private final String url;

    public CtaDto(@Nullable CtaTypeDto ctaTypeDto, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable CTAEnhancementsDto cTAEnhancementsDto) {
        this.type = ctaTypeDto;
        this.text = str;
        this.url = str2;
        this.backgroundColor = str3;
        this.textColor = str4;
        this.enhancements = cTAEnhancementsDto;
    }

    public static /* synthetic */ CtaDto copy$default(CtaDto ctaDto, CtaTypeDto ctaTypeDto, String str, String str2, String str3, String str4, CTAEnhancementsDto cTAEnhancementsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            ctaTypeDto = ctaDto.type;
        }
        if ((i & 2) != 0) {
            str = ctaDto.text;
        }
        if ((i & 4) != 0) {
            str2 = ctaDto.url;
        }
        if ((i & 8) != 0) {
            str3 = ctaDto.backgroundColor;
        }
        if ((i & 16) != 0) {
            str4 = ctaDto.textColor;
        }
        if ((i & 32) != 0) {
            cTAEnhancementsDto = ctaDto.enhancements;
        }
        String str5 = str4;
        CTAEnhancementsDto cTAEnhancementsDto2 = cTAEnhancementsDto;
        return ctaDto.copy(ctaTypeDto, str, str2, str3, str5, cTAEnhancementsDto2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CtaTypeDto getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final CTAEnhancementsDto getEnhancements() {
        return this.enhancements;
    }

    @NotNull
    public final CtaDto copy(@Nullable CtaTypeDto type, @Nullable String text, @Nullable String url, @Nullable String backgroundColor, @Nullable String textColor, @Nullable CTAEnhancementsDto enhancements) {
        return new CtaDto(type, text, url, backgroundColor, textColor, enhancements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaDto)) {
            return false;
        }
        CtaDto ctaDto = (CtaDto) other;
        return this.type == ctaDto.type && Intrinsics.c(this.text, ctaDto.text) && Intrinsics.c(this.url, ctaDto.url) && Intrinsics.c(this.backgroundColor, ctaDto.backgroundColor) && Intrinsics.c(this.textColor, ctaDto.textColor) && Intrinsics.c(this.enhancements, ctaDto.enhancements);
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final CTAEnhancementsDto getEnhancements() {
        return this.enhancements;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final CtaTypeDto getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        CtaTypeDto ctaTypeDto = this.type;
        int hashCode = (ctaTypeDto == null ? 0 : ctaTypeDto.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CTAEnhancementsDto cTAEnhancementsDto = this.enhancements;
        return hashCode5 + (cTAEnhancementsDto != null ? cTAEnhancementsDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CtaDto(type=" + this.type + ", text=" + this.text + ", url=" + this.url + ", backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", enhancements=" + this.enhancements + ')';
    }
}
