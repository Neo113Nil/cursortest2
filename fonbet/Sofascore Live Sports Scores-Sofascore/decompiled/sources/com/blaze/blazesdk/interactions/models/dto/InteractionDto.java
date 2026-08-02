package com.blaze.blazesdk.interactions.models.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "", "id", "", "type", "htmlUrl", "topOffset", "", "startOffset", "relativeHeight", "relativeWidth", "designOverrides", "initData", "bounds", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionBoundsDto;", "clientEnrichmentUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/interactions/models/dto/InteractionBoundsDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getHtmlUrl", "getTopOffset", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStartOffset", "getRelativeHeight", "getRelativeWidth", "getDesignOverrides", "getInitData", "getBounds", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionBoundsDto;", "getClientEnrichmentUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/interactions/models/dto/InteractionBoundsDto;Ljava/lang/String;)Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionDto {
    public static final int $stable = 0;

    @b6h("bounds")
    @Nullable
    private final InteractionBoundsDto bounds;

    @b6h("clientEnrichmentUrl")
    @Nullable
    private final String clientEnrichmentUrl;

    @b6h("designOverridesStr")
    @Nullable
    private final String designOverrides;

    @b6h("htmlUrl")
    @Nullable
    private final String htmlUrl;

    @b6h("id")
    @Nullable
    private final String id;

    @b6h("initData")
    @Nullable
    private final String initData;

    @b6h("relativeHeight")
    @Nullable
    private final Float relativeHeight;

    @b6h("relativeWidth")
    @Nullable
    private final Float relativeWidth;

    @b6h("leftOffset")
    @Nullable
    private final Float startOffset;

    @b6h("topOffset")
    @Nullable
    private final Float topOffset;

    @b6h("type")
    @Nullable
    private final String type;

    public InteractionDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable String str4, @Nullable String str5, @Nullable InteractionBoundsDto interactionBoundsDto, @Nullable String str6) {
        this.id = str;
        this.type = str2;
        this.htmlUrl = str3;
        this.topOffset = f;
        this.startOffset = f2;
        this.relativeHeight = f3;
        this.relativeWidth = f4;
        this.designOverrides = str4;
        this.initData = str5;
        this.bounds = interactionBoundsDto;
        this.clientEnrichmentUrl = str6;
    }

    public static /* synthetic */ InteractionDto copy$default(InteractionDto interactionDto, String str, String str2, String str3, Float f, Float f2, Float f3, Float f4, String str4, String str5, InteractionBoundsDto interactionBoundsDto, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interactionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = interactionDto.type;
        }
        if ((i & 4) != 0) {
            str3 = interactionDto.htmlUrl;
        }
        if ((i & 8) != 0) {
            f = interactionDto.topOffset;
        }
        if ((i & 16) != 0) {
            f2 = interactionDto.startOffset;
        }
        if ((i & 32) != 0) {
            f3 = interactionDto.relativeHeight;
        }
        if ((i & 64) != 0) {
            f4 = interactionDto.relativeWidth;
        }
        if ((i & 128) != 0) {
            str4 = interactionDto.designOverrides;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str5 = interactionDto.initData;
        }
        if ((i & 512) != 0) {
            interactionBoundsDto = interactionDto.bounds;
        }
        if ((i & 1024) != 0) {
            str6 = interactionDto.clientEnrichmentUrl;
        }
        InteractionBoundsDto interactionBoundsDto2 = interactionBoundsDto;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        Float f5 = f3;
        Float f6 = f4;
        Float f7 = f2;
        String str10 = str3;
        return interactionDto.copy(str, str2, str10, f, f7, f5, f6, str8, str9, interactionBoundsDto2, str7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final InteractionBoundsDto getBounds() {
        return this.bounds;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getClientEnrichmentUrl() {
        return this.clientEnrichmentUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getStartOffset() {
        return this.startOffset;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getRelativeHeight() {
        return this.relativeHeight;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getRelativeWidth() {
        return this.relativeWidth;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getDesignOverrides() {
        return this.designOverrides;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    @NotNull
    public final InteractionDto copy(@Nullable String id, @Nullable String type, @Nullable String htmlUrl, @Nullable Float topOffset, @Nullable Float startOffset, @Nullable Float relativeHeight, @Nullable Float relativeWidth, @Nullable String designOverrides, @Nullable String initData, @Nullable InteractionBoundsDto bounds, @Nullable String clientEnrichmentUrl) {
        return new InteractionDto(id, type, htmlUrl, topOffset, startOffset, relativeHeight, relativeWidth, designOverrides, initData, bounds, clientEnrichmentUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionDto)) {
            return false;
        }
        InteractionDto interactionDto = (InteractionDto) other;
        return Intrinsics.c(this.id, interactionDto.id) && Intrinsics.c(this.type, interactionDto.type) && Intrinsics.c(this.htmlUrl, interactionDto.htmlUrl) && Intrinsics.c(this.topOffset, interactionDto.topOffset) && Intrinsics.c(this.startOffset, interactionDto.startOffset) && Intrinsics.c(this.relativeHeight, interactionDto.relativeHeight) && Intrinsics.c(this.relativeWidth, interactionDto.relativeWidth) && Intrinsics.c(this.designOverrides, interactionDto.designOverrides) && Intrinsics.c(this.initData, interactionDto.initData) && Intrinsics.c(this.bounds, interactionDto.bounds) && Intrinsics.c(this.clientEnrichmentUrl, interactionDto.clientEnrichmentUrl);
    }

    @Nullable
    public final InteractionBoundsDto getBounds() {
        return this.bounds;
    }

    @Nullable
    public final String getClientEnrichmentUrl() {
        return this.clientEnrichmentUrl;
    }

    @Nullable
    public final String getDesignOverrides() {
        return this.designOverrides;
    }

    @Nullable
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getInitData() {
        return this.initData;
    }

    @Nullable
    public final Float getRelativeHeight() {
        return this.relativeHeight;
    }

    @Nullable
    public final Float getRelativeWidth() {
        return this.relativeWidth;
    }

    @Nullable
    public final Float getStartOffset() {
        return this.startOffset;
    }

    @Nullable
    public final Float getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.htmlUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.topOffset;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.startOffset;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.relativeHeight;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.relativeWidth;
        int hashCode7 = (hashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str4 = this.designOverrides;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.initData;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InteractionBoundsDto interactionBoundsDto = this.bounds;
        int hashCode10 = (hashCode9 + (interactionBoundsDto == null ? 0 : interactionBoundsDto.hashCode())) * 31;
        String str6 = this.clientEnrichmentUrl;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InteractionDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", htmlUrl=");
        sb.append(this.htmlUrl);
        sb.append(", topOffset=");
        sb.append(this.topOffset);
        sb.append(", startOffset=");
        sb.append(this.startOffset);
        sb.append(", relativeHeight=");
        sb.append(this.relativeHeight);
        sb.append(", relativeWidth=");
        sb.append(this.relativeWidth);
        sb.append(", designOverrides=");
        sb.append(this.designOverrides);
        sb.append(", initData=");
        sb.append(this.initData);
        sb.append(", bounds=");
        sb.append(this.bounds);
        sb.append(", clientEnrichmentUrl=");
        return lnb.q(sb, this.clientEnrichmentUrl, ')');
    }
}
