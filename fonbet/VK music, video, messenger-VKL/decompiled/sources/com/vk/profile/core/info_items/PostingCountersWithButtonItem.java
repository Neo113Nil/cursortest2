package com.vk.profile.core.info_items;

import android.view.ViewGroup;
import xsna.asp;
import xsna.ayt0;
import xsna.ozl;
import xsna.zrp;

/* compiled from: PostingCountersItem.kt */
/* loaded from: classes5.dex */
public final class PostingCountersWithButtonItem extends ayt0 {
    public final int i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingCountersItem.kt */
    public static final class CommunityPostingButton {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CommunityPostingButton[] $VALUES;
        public static final CommunityPostingButton PUBLISH;
        public static final CommunityPostingButton SUGGEST;

        static {
            CommunityPostingButton communityPostingButton = new CommunityPostingButton("SUGGEST", 0);
            SUGGEST = communityPostingButton;
            CommunityPostingButton communityPostingButton2 = new CommunityPostingButton("PUBLISH", 1);
            PUBLISH = communityPostingButton2;
            CommunityPostingButton[] communityPostingButtonArr = {communityPostingButton, communityPostingButton2};
            $VALUES = communityPostingButtonArr;
            $ENTRIES = new asp(communityPostingButtonArr);
        }

        public CommunityPostingButton() {
            throw null;
        }

        public static CommunityPostingButton valueOf(String str) {
            return (CommunityPostingButton) Enum.valueOf(CommunityPostingButton.class, str);
        }

        public static CommunityPostingButton[] values() {
            return (CommunityPostingButton[]) $VALUES.clone();
        }
    }

    /* compiled from: PostingCountersItem.kt */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: PostingCountersItem.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityPostingButton.values().length];
            try {
                iArr[CommunityPostingButton.PUBLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityPostingButton.SUGGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostingCountersWithButtonItem() {
        throw null;
    }

    @ozl
    public PostingCountersWithButtonItem(ViewGroup viewGroup, CommunityPostingButton communityPostingButton, boolean z) {
        super(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(viewGroup, 18), viewGroup.getId());
        int i = communityPostingButton == null ? -1 : b.$EnumSwitchMapping$0[communityPostingButton.ordinal()];
        this.i = i != 1 ? i != 2 ? z ? -86 : -78 : z ? -234 : -232 : z ? -235 : -233;
        this.h = viewGroup;
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
