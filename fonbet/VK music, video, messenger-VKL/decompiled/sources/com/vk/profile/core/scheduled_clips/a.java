package com.vk.profile.core.scheduled_clips;

import com.vk.dto.common.ClipVideoFile;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;

/* compiled from: BaseCommunityScheduledClipsGridFragment.kt */
/* loaded from: classes5.dex */
public final class a {
    public final /* synthetic */ BaseCommunityScheduledClipsGridFragment a;
    public final /* synthetic */ ClipVideoFile b;

    /* compiled from: BaseCommunityScheduledClipsGridFragment.kt */
    /* renamed from: com.vk.profile.core.scheduled_clips.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1641a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityScheduledClipsBottomSheetSideEffectOptions.values().length];
            try {
                iArr[CommunityScheduledClipsBottomSheetSideEffectOptions.EDIT_PUBLICATION_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(BaseCommunityScheduledClipsGridFragment baseCommunityScheduledClipsGridFragment, ClipVideoFile clipVideoFile) {
        this.a = baseCommunityScheduledClipsGridFragment;
        this.b = clipVideoFile;
    }

    public final void a(CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions) {
        int i = C1641a.$EnumSwitchMapping$0[communityScheduledClipsBottomSheetSideEffectOptions.ordinal()];
        BaseCommunityScheduledClipsGridFragment baseCommunityScheduledClipsGridFragment = this.a;
        if (i == 1) {
            baseCommunityScheduledClipsGridFragment.getFeature().C(new b.d(this.b));
        } else {
            if (i != 2) {
                return;
            }
            baseCommunityScheduledClipsGridFragment.getFeature().C(new b.a(baseCommunityScheduledClipsGridFragment.go(), true));
        }
    }
}
