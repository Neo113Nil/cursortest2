package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBY\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J:\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010#\"\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010#R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u00103R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\b\u000e\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/sofascore/model/mvvm/model/TvChannel;", "Ljava/io/Serializable;", "", "id", "", "name", "countryCode", "link", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "upvote", "downvote", "", "isSelected", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TvChannel;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/TvChannel;", "toString", "I", "getId", "Ljava/lang/String;", "getName", "getCountryCode", "setCountryCode", "(Ljava/lang/String;)V", "getLink", "getUpvote", "setUpvote", "(I)V", "getDownvote", "setDownvote", "Z", "()Z", "setSelected", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TvChannel implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String countryCode;
    private int downvote;
    private final int id;
    private boolean isSelected;

    @Nullable
    private final String link;

    @NotNull
    private final String name;
    private int upvote;

    public /* synthetic */ TvChannel(int i, int i2, String str, String str2, String str3, int i3, int i4, boolean z, t5h t5hVar) {
        if (11 != (i & 11)) {
            oea.z(i, 11, TvChannel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        if ((i & 4) == 0) {
            this.countryCode = "";
        } else {
            this.countryCode = str2;
        }
        this.link = str3;
        if ((i & 16) == 0) {
            this.upvote = 0;
        } else {
            this.upvote = i3;
        }
        if ((i & 32) == 0) {
            this.downvote = 0;
        } else {
            this.downvote = i4;
        }
        if ((i & 64) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
    }

    public static /* synthetic */ TvChannel copy$default(TvChannel tvChannel, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tvChannel.id;
        }
        if ((i2 & 2) != 0) {
            str = tvChannel.name;
        }
        if ((i2 & 4) != 0) {
            str2 = tvChannel.countryCode;
        }
        if ((i2 & 8) != 0) {
            str3 = tvChannel.link;
        }
        return tvChannel.copy(i, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(TvChannel self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        if (output.o(serialDesc) || !Intrinsics.c(self.countryCode, "")) {
            output.y(serialDesc, 2, self.countryCode);
        }
        output.h(serialDesc, 3, uhi.a, self.link);
        if (output.o(serialDesc) || self.upvote != 0) {
            output.u(4, self.upvote, serialDesc);
        }
        if (output.o(serialDesc) || self.downvote != 0) {
            output.u(5, self.downvote, serialDesc);
        }
        if (output.o(serialDesc) || self.isSelected) {
            output.x(serialDesc, 6, self.isSelected);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final TvChannel copy(int id, @NotNull String name, @NotNull String countryCode, @Nullable String link) {
        name.getClass();
        countryCode.getClass();
        return new TvChannel(id, name, countryCode, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvChannel)) {
            return false;
        }
        TvChannel tvChannel = (TvChannel) other;
        return this.id == tvChannel.id && Intrinsics.c(this.countryCode, tvChannel.countryCode);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int getDownvote() {
        return this.downvote;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.countryCode);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setCountryCode(@NotNull String str) {
        str.getClass();
        this.countryCode = str;
    }

    public final void setDownvote(int i) {
        this.downvote = i;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setUpvote(int i) {
        this.upvote = i;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        return fc6.o(dmi.t(i, "TvChannel(id=", ", name=", str, ", countryCode="), this.countryCode, ", link=", this.link, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TvChannel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TvChannel;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TvChannel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TvChannel(int i, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.name = str;
        this.countryCode = str2;
        this.link = str3;
    }

    public /* synthetic */ TvChannel(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, str3);
    }
}
