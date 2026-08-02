package com.sofascore.model.mvvm.model;

import com.sofascore.model.mvvm.IRecent;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002DCB?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB5\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010&JR\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b.\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010&R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00104\u001a\u0004\b5\u0010)\"\u0004\b6\u00107R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b8\u0010&\"\u0004\b9\u0010:R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\b;\u0010&\"\u0004\b<\u0010:R\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010=\u001a\u0004\b\u0011\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010&¨\u0006E"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueStage;", "Lcom/sofascore/model/mvvm/IRecent;", "Ljava/io/Serializable;", "", "id", "", "slug", "name", "Lcom/sofascore/model/mvvm/model/Category;", "category", "primaryColorHex", "secondaryColorHex", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;Ljava/lang/String;)V", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "isRecent", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;Ljava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Category;", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/UniqueStage;", "toString", "I", "getId", "Ljava/lang/String;", "getSlug", "getName", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "setCategory", "(Lcom/sofascore/model/mvvm/model/Category;)V", "getPrimaryColorHex", "setPrimaryColorHex", "(Ljava/lang/String;)V", "getSecondaryColorHex", "setSecondaryColorHex", "Z", "()Z", "setRecent", "(Z)V", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueStage implements IRecent, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Category category;
    private final int id;
    private boolean isRecent;

    @NotNull
    private final String name;

    @Nullable
    private String primaryColorHex;

    @Nullable
    private String secondaryColorHex;

    @Nullable
    private final String slug;

    public /* synthetic */ UniqueStage(int i, int i2, String str, String str2, Category category, String str3, String str4, boolean z, t5h t5hVar) {
        if (55 != (i & 55)) {
            oea.z(i, 55, UniqueStage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.slug = str;
        this.name = str2;
        if ((i & 8) == 0) {
            this.category = new Category("", 0);
        } else {
            this.category = category;
        }
        this.primaryColorHex = str3;
        this.secondaryColorHex = str4;
        if ((i & 64) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z;
        }
    }

    public static /* synthetic */ UniqueStage copy$default(UniqueStage uniqueStage, int i, String str, String str2, Category category, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uniqueStage.id;
        }
        if ((i2 & 2) != 0) {
            str = uniqueStage.slug;
        }
        if ((i2 & 4) != 0) {
            str2 = uniqueStage.name;
        }
        if ((i2 & 8) != 0) {
            category = uniqueStage.category;
        }
        if ((i2 & 16) != 0) {
            str3 = uniqueStage.primaryColorHex;
        }
        if ((i2 & 32) != 0) {
            str4 = uniqueStage.secondaryColorHex;
        }
        String str5 = str3;
        String str6 = str4;
        return uniqueStage.copy(i, str, str2, category, str5, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueStage self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.slug);
        output.y(serialDesc, 2, self.name);
        if (output.o(serialDesc) || !Intrinsics.c(self.category, new Category("", 0))) {
            output.f(serialDesc, 3, Category$$serializer.INSTANCE, self.category);
        }
        output.h(serialDesc, 4, uhiVar, self.primaryColorHex);
        output.h(serialDesc, 5, uhiVar, self.secondaryColorHex);
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 6, self.getIsRecent());
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    @NotNull
    public final UniqueStage copy(int id, @Nullable String slug, @NotNull String name, @NotNull Category category, @Nullable String primaryColorHex, @Nullable String secondaryColorHex) {
        name.getClass();
        category.getClass();
        return new UniqueStage(id, slug, name, category, primaryColorHex, secondaryColorHex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UniqueStage) && getId() == ((UniqueStage) other).getId();
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    @Nullable
    public final String getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @NotNull
    public String getSportSlug() {
        return this.category.getSport().getSlug();
    }

    public int hashCode() {
        return getId();
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public final void setCategory(@NotNull Category category) {
        category.getClass();
        this.category = category;
    }

    public final void setPrimaryColorHex(@Nullable String str) {
        this.primaryColorHex = str;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    public final void setSecondaryColorHex(@Nullable String str) {
        this.secondaryColorHex = str;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.slug;
        String str2 = this.name;
        Category category = this.category;
        String str3 = this.primaryColorHex;
        String str4 = this.secondaryColorHex;
        StringBuilder t = dmi.t(i, "UniqueStage(id=", ", slug=", str, ", name=");
        t.append(str2);
        t.append(", category=");
        t.append(category);
        t.append(", primaryColorHex=");
        return fc6.o(t, str3, ", secondaryColorHex=", str4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueStage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/UniqueStage;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueStage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueStage(int i, @Nullable String str, @NotNull String str2, @NotNull Category category, @Nullable String str3, @Nullable String str4) {
        str2.getClass();
        category.getClass();
        this.id = i;
        this.slug = str;
        this.name = str2;
        this.category = category;
        this.primaryColorHex = str3;
        this.secondaryColorHex = str4;
    }

    public /* synthetic */ UniqueStage(int i, String str, String str2, Category category, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? new Category("", 0) : category, str3, str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UniqueStage(int i, @NotNull String str, @NotNull Category category, @Nullable String str2, @Nullable String str3) {
        this(i, "", str, category, str2, str3);
        str.getClass();
        category.getClass();
    }
}
