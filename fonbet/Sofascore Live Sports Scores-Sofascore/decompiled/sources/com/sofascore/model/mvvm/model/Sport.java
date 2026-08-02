package com.sofascore.model.mvvm.model;

import com.sofascore.model.mvvm.IRecent;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0002:9B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\t\b\u0017¢\u0006\u0004\b\b\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000bBY\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\b\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010!J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b/\u0010!\"\u0004\b0\u00101R\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010+\u001a\u0004\b2\u0010!\"\u0004\b3\u00101R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u00104\u001a\u0004\b\u0010\u00105\"\u0004\b6\u00107R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b8\u0010\u0016¨\u0006;"}, d2 = {"Lcom/sofascore/model/mvvm/model/Sport;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "", "id", "", "slug", "name", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "()V", "(ILjava/lang/String;)V", "seen0", "numberOfLiveEvents", "numberOfEvent", "", "isRecent", "sportSlug", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Lt5h;)V", "component3", "()Ljava/lang/String;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Sport;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/Sport;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getSlug", "getNumberOfLiveEvents", "setNumberOfLiveEvents", "(I)V", "getNumberOfEvent", "setNumberOfEvent", "Z", "()Z", "setRecent", "(Z)V", "getSportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Sport implements Serializable, IRecent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;
    private boolean isRecent;

    @NotNull
    private final String name;
    private int numberOfEvent;
    private int numberOfLiveEvents;

    @NotNull
    private final String slug;

    @NotNull
    private final String sportSlug;

    public /* synthetic */ Sport(int i, int i2, String str, String str2, int i3, int i4, boolean z, String str3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Sport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.slug = str;
        this.name = str2;
        if ((i & 8) == 0) {
            this.numberOfLiveEvents = 0;
        } else {
            this.numberOfLiveEvents = i3;
        }
        if ((i & 16) == 0) {
            this.numberOfEvent = 0;
        } else {
            this.numberOfEvent = i4;
        }
        if ((i & 32) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z;
        }
        if ((i & 64) == 0) {
            this.sportSlug = str;
        } else {
            this.sportSlug = str3;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final String getName() {
        return this.name;
    }

    public static /* synthetic */ Sport copy$default(Sport sport, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sport.id;
        }
        if ((i2 & 2) != 0) {
            str = sport.slug;
        }
        if ((i2 & 4) != 0) {
            str2 = sport.name;
        }
        return sport.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(Sport self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.slug);
        output.y(serialDesc, 2, self.name);
        if (output.o(serialDesc) || self.numberOfLiveEvents != 0) {
            output.u(3, self.numberOfLiveEvents, serialDesc);
        }
        if (output.o(serialDesc) || self.numberOfEvent != 0) {
            output.u(4, self.numberOfEvent, serialDesc);
        }
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 5, self.getIsRecent());
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.getSportSlug(), self.slug)) {
            return;
        }
        output.y(serialDesc, 6, self.getSportSlug());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final Sport copy(int id, @NotNull String slug, @NotNull String name) {
        slug.getClass();
        name.getClass();
        return new Sport(id, slug, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) other;
        return this.id == sport.id && Intrinsics.c(this.slug, sport.slug) && Intrinsics.c(this.name, sport.name);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    public final int getNumberOfEvent() {
        return this.numberOfEvent;
    }

    public final int getNumberOfLiveEvents() {
        return this.numberOfLiveEvents;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @NotNull
    public String getSportSlug() {
        return this.sportSlug;
    }

    public int hashCode() {
        return this.name.hashCode() + dmi.c(Integer.hashCode(this.id) * 31, 31, this.slug);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public final void setNumberOfEvent(int i) {
        this.numberOfEvent = i;
    }

    public final void setNumberOfLiveEvents(int i) {
        this.numberOfLiveEvents = i;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.slug;
        return mz1.o(dmi.t(i, "Sport(id=", ", slug=", str, ", name="), this.name, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Sport$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Sport;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Sport$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Sport(int i, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.slug = str;
        this.name = str2;
        this.sportSlug = str;
    }

    public Sport() {
        this(0, "", "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Sport(int i, @NotNull String str) {
        this(i, str, "");
        str.getClass();
    }
}
