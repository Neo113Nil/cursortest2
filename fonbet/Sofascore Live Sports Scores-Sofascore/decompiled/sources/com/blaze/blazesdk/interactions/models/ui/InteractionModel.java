package com.blaze.blazesdk.interactions.models.ui;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.g7a;
import defpackage.lnb;
import defpackage.nsl;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u008c\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b4\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b<\u0010\u0014¨\u0006="}, d2 = {"Lcom/blaze/blazesdk/interactions/models/ui/InteractionModel;", "", "", "id", "type", "htmlUrl", "", "topOffset", "startOffset", "relativeHeight", "relativeWidth", "designOverrides", "initData", "userAnswer", "Lnsl;", "bounds", "clientEnrichmentUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnsl;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()F", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lnsl;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnsl;Ljava/lang/String;)Lcom/blaze/blazesdk/interactions/models/ui/InteractionModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getType", "getHtmlUrl", "F", "getTopOffset", "getStartOffset", "getRelativeHeight", "getRelativeWidth", "getDesignOverrides", "getInitData", "getUserAnswer", "setUserAnswer", "(Ljava/lang/String;)V", "Lnsl;", "getBounds", "getClientEnrichmentUrl", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionModel {
    public static final int $stable = 8;

    @Nullable
    private final nsl bounds;

    @NotNull
    private final String clientEnrichmentUrl;

    @NotNull
    private final String designOverrides;

    @NotNull
    private final String htmlUrl;

    @NotNull
    private final String id;

    @NotNull
    private final String initData;
    private final float relativeHeight;
    private final float relativeWidth;
    private final float startOffset;
    private final float topOffset;

    @NotNull
    private final String type;

    @Nullable
    private String userAnswer;

    public InteractionModel(@NotNull String str, @NotNull String str2, @NotNull String str3, float f, float f2, float f3, float f4, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable nsl nslVar, @NotNull String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        this.id = str;
        this.type = str2;
        this.htmlUrl = str3;
        this.topOffset = f;
        this.startOffset = f2;
        this.relativeHeight = f3;
        this.relativeWidth = f4;
        this.designOverrides = str4;
        this.initData = str5;
        this.userAnswer = str6;
        this.bounds = nslVar;
        this.clientEnrichmentUrl = str7;
    }

    public static /* synthetic */ InteractionModel copy$default(InteractionModel interactionModel, String str, String str2, String str3, float f, float f2, float f3, float f4, String str4, String str5, String str6, nsl nslVar, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interactionModel.id;
        }
        if ((i & 2) != 0) {
            str2 = interactionModel.type;
        }
        if ((i & 4) != 0) {
            str3 = interactionModel.htmlUrl;
        }
        if ((i & 8) != 0) {
            f = interactionModel.topOffset;
        }
        if ((i & 16) != 0) {
            f2 = interactionModel.startOffset;
        }
        if ((i & 32) != 0) {
            f3 = interactionModel.relativeHeight;
        }
        if ((i & 64) != 0) {
            f4 = interactionModel.relativeWidth;
        }
        if ((i & 128) != 0) {
            str4 = interactionModel.designOverrides;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str5 = interactionModel.initData;
        }
        if ((i & 512) != 0) {
            str6 = interactionModel.userAnswer;
        }
        if ((i & 1024) != 0) {
            nslVar = interactionModel.bounds;
        }
        if ((i & a.o) != 0) {
            str7 = interactionModel.clientEnrichmentUrl;
        }
        nsl nslVar2 = nslVar;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        float f5 = f4;
        String str11 = str4;
        float f6 = f2;
        float f7 = f3;
        return interactionModel.copy(str, str2, str3, f, f6, f7, f5, str11, str9, str10, nslVar2, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getUserAnswer() {
        return this.userAnswer;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final nsl getBounds() {
        return this.bounds;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getClientEnrichmentUrl() {
        return this.clientEnrichmentUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTopOffset() {
        return this.topOffset;
    }

    /* renamed from: component5, reason: from getter */
    public final float getStartOffset() {
        return this.startOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRelativeHeight() {
        return this.relativeHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final float getRelativeWidth() {
        return this.relativeWidth;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getDesignOverrides() {
        return this.designOverrides;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    @NotNull
    public final InteractionModel copy(@NotNull String id, @NotNull String type, @NotNull String htmlUrl, float topOffset, float startOffset, float relativeHeight, float relativeWidth, @NotNull String designOverrides, @NotNull String initData, @Nullable String userAnswer, @Nullable nsl bounds, @NotNull String clientEnrichmentUrl) {
        id.getClass();
        type.getClass();
        htmlUrl.getClass();
        designOverrides.getClass();
        initData.getClass();
        clientEnrichmentUrl.getClass();
        return new InteractionModel(id, type, htmlUrl, topOffset, startOffset, relativeHeight, relativeWidth, designOverrides, initData, userAnswer, bounds, clientEnrichmentUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionModel)) {
            return false;
        }
        InteractionModel interactionModel = (InteractionModel) other;
        return Intrinsics.c(this.id, interactionModel.id) && Intrinsics.c(this.type, interactionModel.type) && Intrinsics.c(this.htmlUrl, interactionModel.htmlUrl) && Float.compare(this.topOffset, interactionModel.topOffset) == 0 && Float.compare(this.startOffset, interactionModel.startOffset) == 0 && Float.compare(this.relativeHeight, interactionModel.relativeHeight) == 0 && Float.compare(this.relativeWidth, interactionModel.relativeWidth) == 0 && Intrinsics.c(this.designOverrides, interactionModel.designOverrides) && Intrinsics.c(this.initData, interactionModel.initData) && Intrinsics.c(this.userAnswer, interactionModel.userAnswer) && Intrinsics.c(this.bounds, interactionModel.bounds) && Intrinsics.c(this.clientEnrichmentUrl, interactionModel.clientEnrichmentUrl);
    }

    @Nullable
    public final nsl getBounds() {
        return this.bounds;
    }

    @NotNull
    public final String getClientEnrichmentUrl() {
        return this.clientEnrichmentUrl;
    }

    @NotNull
    public final String getDesignOverrides() {
        return this.designOverrides;
    }

    @NotNull
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInitData() {
        return this.initData;
    }

    public final float getRelativeHeight() {
        return this.relativeHeight;
    }

    public final float getRelativeWidth() {
        return this.relativeWidth;
    }

    public final float getStartOffset() {
        return this.startOffset;
    }

    public final float getTopOffset() {
        return this.topOffset;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUserAnswer() {
        return this.userAnswer;
    }

    public int hashCode() {
        int k = o6a.k(this.initData, o6a.k(this.designOverrides, g7a.o(this.relativeWidth, g7a.o(this.relativeHeight, g7a.o(this.startOffset, g7a.o(this.topOffset, o6a.k(this.htmlUrl, o6a.k(this.type, this.id.hashCode() * 31))))))));
        String str = this.userAnswer;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        nsl nslVar = this.bounds;
        return this.clientEnrichmentUrl.hashCode() + ((hashCode + (nslVar != null ? nslVar.hashCode() : 0)) * 31);
    }

    public final void setUserAnswer(@Nullable String str) {
        this.userAnswer = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InteractionModel(id=");
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
        sb.append(", userAnswer=");
        sb.append(this.userAnswer);
        sb.append(", bounds=");
        sb.append(this.bounds);
        sb.append(", clientEnrichmentUrl=");
        return lnb.q(sb, this.clientEnrichmentUrl, ')');
    }
}
