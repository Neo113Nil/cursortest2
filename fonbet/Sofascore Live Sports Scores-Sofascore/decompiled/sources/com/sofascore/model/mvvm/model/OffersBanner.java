package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\"Jf\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b7\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b8\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b9\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b<\u0010\"¨\u0006?"}, d2 = {"Lcom/sofascore/model/mvvm/model/OffersBanner;", "", "", "id", "Lcom/sofascore/model/mvvm/model/OffersBannerLayout;", TtmlNode.TAG_LAYOUT, "", "title", "description", U3.i.G0, "regulative", "Lcom/sofascore/model/mvvm/model/OffersBannerBackground;", "background", "url", "<init>", "(ILcom/sofascore/model/mvvm/model/OffersBannerLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/OffersBannerBackground;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/OffersBannerLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/OffersBannerBackground;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/OffersBanner;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/OffersBannerLayout;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/sofascore/model/mvvm/model/OffersBannerBackground;", "component8", "copy", "(ILcom/sofascore/model/mvvm/model/OffersBannerLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/OffersBannerBackground;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/OffersBanner;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/mvvm/model/OffersBannerLayout;", "getLayout", "Ljava/lang/String;", "getTitle", "getDescription", "getCta", "getRegulative", "Lcom/sofascore/model/mvvm/model/OffersBannerBackground;", "getBackground", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OffersBanner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final OffersBannerBackground background;

    @NotNull
    private final String cta;

    @NotNull
    private final String description;
    private final int id;

    @Nullable
    private final OffersBannerLayout layout;

    @Nullable
    private final String regulative;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public /* synthetic */ OffersBanner(int i, int i2, OffersBannerLayout offersBannerLayout, String str, String str2, String str3, String str4, OffersBannerBackground offersBannerBackground, String str5, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, OffersBanner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.layout = offersBannerLayout;
        this.title = str;
        this.description = str2;
        this.cta = str3;
        this.regulative = str4;
        this.background = offersBannerBackground;
        this.url = str5;
    }

    public static /* synthetic */ OffersBanner copy$default(OffersBanner offersBanner, int i, OffersBannerLayout offersBannerLayout, String str, String str2, String str3, String str4, OffersBannerBackground offersBannerBackground, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = offersBanner.id;
        }
        if ((i2 & 2) != 0) {
            offersBannerLayout = offersBanner.layout;
        }
        if ((i2 & 4) != 0) {
            str = offersBanner.title;
        }
        if ((i2 & 8) != 0) {
            str2 = offersBanner.description;
        }
        if ((i2 & 16) != 0) {
            str3 = offersBanner.cta;
        }
        if ((i2 & 32) != 0) {
            str4 = offersBanner.regulative;
        }
        if ((i2 & 64) != 0) {
            offersBannerBackground = offersBanner.background;
        }
        if ((i2 & 128) != 0) {
            str5 = offersBanner.url;
        }
        OffersBannerBackground offersBannerBackground2 = offersBannerBackground;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return offersBanner.copy(i, offersBannerLayout, str, str2, str7, str8, offersBannerBackground2, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(OffersBanner self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.h(serialDesc, 1, OffersBannerLayoutSerializer.INSTANCE, self.layout);
        output.y(serialDesc, 2, self.title);
        output.y(serialDesc, 3, self.description);
        output.y(serialDesc, 4, self.cta);
        output.h(serialDesc, 5, uhi.a, self.regulative);
        output.h(serialDesc, 6, OffersBannerBackgroundSerializer.INSTANCE, self.background);
        output.y(serialDesc, 7, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final OffersBannerLayout getLayout() {
        return this.layout;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRegulative() {
        return this.regulative;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final OffersBannerBackground getBackground() {
        return this.background;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final OffersBanner copy(int id, @Nullable OffersBannerLayout layout, @NotNull String title, @NotNull String description, @NotNull String cta, @Nullable String regulative, @Nullable OffersBannerBackground background, @NotNull String url) {
        title.getClass();
        description.getClass();
        cta.getClass();
        url.getClass();
        return new OffersBanner(id, layout, title, description, cta, regulative, background, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffersBanner)) {
            return false;
        }
        OffersBanner offersBanner = (OffersBanner) other;
        return this.id == offersBanner.id && this.layout == offersBanner.layout && Intrinsics.c(this.title, offersBanner.title) && Intrinsics.c(this.description, offersBanner.description) && Intrinsics.c(this.cta, offersBanner.cta) && Intrinsics.c(this.regulative, offersBanner.regulative) && this.background == offersBanner.background && Intrinsics.c(this.url, offersBanner.url);
    }

    @Nullable
    public final OffersBannerBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final OffersBannerLayout getLayout() {
        return this.layout;
    }

    @Nullable
    public final String getRegulative() {
        return this.regulative;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        OffersBannerLayout offersBannerLayout = this.layout;
        int c = dmi.c(dmi.c(dmi.c((hashCode + (offersBannerLayout == null ? 0 : offersBannerLayout.hashCode())) * 31, 31, this.title), 31, this.description), 31, this.cta);
        String str = this.regulative;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        OffersBannerBackground offersBannerBackground = this.background;
        return this.url.hashCode() + ((hashCode2 + (offersBannerBackground != null ? offersBannerBackground.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        OffersBannerLayout offersBannerLayout = this.layout;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.cta;
        String str4 = this.regulative;
        OffersBannerBackground offersBannerBackground = this.background;
        String str5 = this.url;
        StringBuilder sb = new StringBuilder("OffersBanner(id=");
        sb.append(i);
        sb.append(", layout=");
        sb.append(offersBannerLayout);
        sb.append(", title=");
        bf3.v(sb, str, ", description=", str2, ", cta=");
        bf3.v(sb, str3, ", regulative=", str4, ", background=");
        sb.append(offersBannerBackground);
        sb.append(", url=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/OffersBanner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/OffersBanner;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OffersBanner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OffersBanner(int i, @Nullable OffersBannerLayout offersBannerLayout, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable OffersBannerBackground offersBannerBackground, @NotNull String str5) {
        w1l.y(str, str2, str3, str5);
        this.id = i;
        this.layout = offersBannerLayout;
        this.title = str;
        this.description = str2;
        this.cta = str3;
        this.regulative = str4;
        this.background = offersBannerBackground;
        this.url = str5;
    }
}
