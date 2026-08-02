package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/FollowEntityDto;", "", "storageFile", "Lcom/blaze/blazesdk/features/shared/models/shared_models/StorageFileDto;", "entityType", "Lcom/blaze/blazesdk/features/shared/models/shared_models/FollowEntityTypeDto;", "entityId", "", "description", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/StorageFileDto;Lcom/blaze/blazesdk/features/shared/models/shared_models/FollowEntityTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "getStorageFile", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/StorageFileDto;", "getEntityType", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/FollowEntityTypeDto;", "getEntityId", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FollowEntityDto {
    public static final int $stable = 0;

    @b6h("description")
    @NotNull
    private final String description;

    @b6h("entityId")
    @NotNull
    private final String entityId;

    @b6h("entityType")
    @NotNull
    private final FollowEntityTypeDto entityType;

    @b6h("storageFile")
    @NotNull
    private final StorageFileDto storageFile;

    public FollowEntityDto(@NotNull StorageFileDto storageFileDto, @NotNull FollowEntityTypeDto followEntityTypeDto, @NotNull String str, @NotNull String str2) {
        storageFileDto.getClass();
        followEntityTypeDto.getClass();
        str.getClass();
        str2.getClass();
        this.storageFile = storageFileDto;
        this.entityType = followEntityTypeDto;
        this.entityId = str;
        this.description = str2;
    }

    public static /* synthetic */ FollowEntityDto copy$default(FollowEntityDto followEntityDto, StorageFileDto storageFileDto, FollowEntityTypeDto followEntityTypeDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            storageFileDto = followEntityDto.storageFile;
        }
        if ((i & 2) != 0) {
            followEntityTypeDto = followEntityDto.entityType;
        }
        if ((i & 4) != 0) {
            str = followEntityDto.entityId;
        }
        if ((i & 8) != 0) {
            str2 = followEntityDto.description;
        }
        return followEntityDto.copy(storageFileDto, followEntityTypeDto, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StorageFileDto getStorageFile() {
        return this.storageFile;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FollowEntityTypeDto getEntityType() {
        return this.entityType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final FollowEntityDto copy(@NotNull StorageFileDto storageFile, @NotNull FollowEntityTypeDto entityType, @NotNull String entityId, @NotNull String description) {
        storageFile.getClass();
        entityType.getClass();
        entityId.getClass();
        description.getClass();
        return new FollowEntityDto(storageFile, entityType, entityId, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowEntityDto)) {
            return false;
        }
        FollowEntityDto followEntityDto = (FollowEntityDto) other;
        return Intrinsics.c(this.storageFile, followEntityDto.storageFile) && this.entityType == followEntityDto.entityType && Intrinsics.c(this.entityId, followEntityDto.entityId) && Intrinsics.c(this.description, followEntityDto.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEntityId() {
        return this.entityId;
    }

    @NotNull
    public final FollowEntityTypeDto getEntityType() {
        return this.entityType;
    }

    @NotNull
    public final StorageFileDto getStorageFile() {
        return this.storageFile;
    }

    public int hashCode() {
        return this.description.hashCode() + o6a.k(this.entityId, (this.entityType.hashCode() + (this.storageFile.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FollowEntityDto(storageFile=");
        sb.append(this.storageFile);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", description=");
        return lnb.q(sb, this.description, ')');
    }
}
