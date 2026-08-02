package com.vk.api.clips;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e7d;
import xsna.o25;
import xsna.zrp;

/* compiled from: ClipsProfileList.kt */
/* loaded from: classes14.dex */
public final class ClipsProfileList extends e7d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsProfileList.kt */
    public static final class OwnerListFilter {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OwnerListFilter[] $VALUES;
        public static final OwnerListFilter PUBLISHED;
        public static final OwnerListFilter SCHEDULED;

        static {
            OwnerListFilter ownerListFilter = new OwnerListFilter("PUBLISHED", 0);
            PUBLISHED = ownerListFilter;
            OwnerListFilter ownerListFilter2 = new OwnerListFilter("SCHEDULED", 1);
            SCHEDULED = ownerListFilter2;
            OwnerListFilter[] ownerListFilterArr = {ownerListFilter, ownerListFilter2};
            $VALUES = ownerListFilterArr;
            $ENTRIES = new asp(ownerListFilterArr);
        }

        public OwnerListFilter() {
            throw null;
        }

        public static OwnerListFilter valueOf(String str) {
            return (OwnerListFilter) Enum.valueOf(OwnerListFilter.class, str);
        }

        public static OwnerListFilter[] values() {
            return (OwnerListFilter[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsProfileList.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OwnerListFilter.values().length];
            try {
                iArr[OwnerListFilter.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OwnerListFilter.SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipsProfileList(UserId userId, PaginationKey paginationKey, int i, OwnerListFilter ownerListFilter) {
        super("shortVideo.getOwnerVideos", paginationKey, i, true);
        F(userId, "owner_id");
        int i2 = a.$EnumSwitchMapping$0[ownerListFilter.ordinal()];
        if (i2 == 1) {
            K("playlist", "published");
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            K("playlist", "scheduled");
        }
        if (o25.a().b()) {
            return;
        }
        this.d = true;
        this.c = true;
    }
}
