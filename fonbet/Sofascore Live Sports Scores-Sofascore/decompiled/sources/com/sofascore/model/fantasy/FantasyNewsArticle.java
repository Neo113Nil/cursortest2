package com.sofascore.model.fantasy;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u001c¨\u00063"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyNewsArticle;", "", "", "id", "", "date", "link", "title", "subtitle", "imageUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyNewsArticle;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/fantasy/FantasyNewsArticle;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getDate", "getLink", "getTitle", "getSubtitle", "getImageUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyNewsArticle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String date;
    private final int id;

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String link;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public /* synthetic */ FantasyNewsArticle(int i, int i2, String str, String str2, String str3, String str4, String str5, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FantasyNewsArticle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.date = str;
        this.link = str2;
        this.title = str3;
        this.subtitle = str4;
        this.imageUrl = str5;
    }

    public static /* synthetic */ FantasyNewsArticle copy$default(FantasyNewsArticle fantasyNewsArticle, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyNewsArticle.id;
        }
        if ((i2 & 2) != 0) {
            str = fantasyNewsArticle.date;
        }
        if ((i2 & 4) != 0) {
            str2 = fantasyNewsArticle.link;
        }
        if ((i2 & 8) != 0) {
            str3 = fantasyNewsArticle.title;
        }
        if ((i2 & 16) != 0) {
            str4 = fantasyNewsArticle.subtitle;
        }
        if ((i2 & 32) != 0) {
            str5 = fantasyNewsArticle.imageUrl;
        }
        String str6 = str4;
        String str7 = str5;
        return fantasyNewsArticle.copy(i, str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyNewsArticle self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.date);
        output.y(serialDesc, 2, self.link);
        output.y(serialDesc, 3, self.title);
        output.y(serialDesc, 4, self.subtitle);
        output.y(serialDesc, 5, self.imageUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final FantasyNewsArticle copy(int id, @NotNull String date, @NotNull String link, @NotNull String title, @NotNull String subtitle, @NotNull String imageUrl) {
        date.getClass();
        link.getClass();
        title.getClass();
        subtitle.getClass();
        imageUrl.getClass();
        return new FantasyNewsArticle(id, date, link, title, subtitle, imageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyNewsArticle)) {
            return false;
        }
        FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) other;
        return this.id == fantasyNewsArticle.id && Intrinsics.c(this.date, fantasyNewsArticle.date) && Intrinsics.c(this.link, fantasyNewsArticle.link) && Intrinsics.c(this.title, fantasyNewsArticle.title) && Intrinsics.c(this.subtitle, fantasyNewsArticle.subtitle) && Intrinsics.c(this.imageUrl, fantasyNewsArticle.imageUrl);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + dmi.c(dmi.c(dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.date), 31, this.link), 31, this.title), 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.date;
        String str2 = this.link;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.imageUrl;
        StringBuilder t = dmi.t(i, "FantasyNewsArticle(id=", ", date=", str, ", link=");
        bf3.v(t, str2, ", title=", str3, ", subtitle=");
        return fc6.o(t, str4, ", imageUrl=", str5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyNewsArticle$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyNewsArticle;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyNewsArticle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyNewsArticle(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.id = i;
        this.date = str;
        this.link = str2;
        this.title = str3;
        this.subtitle = str4;
        this.imageUrl = str5;
    }
}
