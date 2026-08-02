package com.vk.newsfeed.impl.posting.profilefriendslists.holders;

import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.fk;
import xsna.tlo0;
import xsna.tq;
import xsna.vfz;
import xsna.zrp;

/* compiled from: ProfileFriendsListHeaderVh.kt */
/* loaded from: classes4.dex */
public final class ProfileFriendsListHeaderVh extends vfz<com.vk.newsfeed.impl.posting.profilefriendslists.holders.a> {
    public final a l;
    public final VkGroupHeader m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileFriendsListHeaderVh.kt */
    public static final class ClearButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClearButtonType[] $VALUES;
        public static final ClearButtonType CLEAR_CONVERSATIONS;
        public static final ClearButtonType CLEAR_FRIENDS;
        public static final ClearButtonType CLEAR_FRIENDS_LISTS;

        static {
            ClearButtonType clearButtonType = new ClearButtonType("CLEAR_FRIENDS", 0);
            CLEAR_FRIENDS = clearButtonType;
            ClearButtonType clearButtonType2 = new ClearButtonType("CLEAR_FRIENDS_LISTS", 1);
            CLEAR_FRIENDS_LISTS = clearButtonType2;
            ClearButtonType clearButtonType3 = new ClearButtonType("CLEAR_CONVERSATIONS", 2);
            CLEAR_CONVERSATIONS = clearButtonType3;
            ClearButtonType[] clearButtonTypeArr = {clearButtonType, clearButtonType2, clearButtonType3};
            $VALUES = clearButtonTypeArr;
            $ENTRIES = new asp(clearButtonTypeArr);
        }

        public ClearButtonType() {
            throw null;
        }

        public static ClearButtonType valueOf(String str) {
            return (ClearButtonType) Enum.valueOf(ClearButtonType.class, str);
        }

        public static ClearButtonType[] values() {
            return (ClearButtonType[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileFriendsListHeaderVh.kt */
    public interface a {
        void U0();

        void b1();
    }

    /* compiled from: ProfileFriendsListHeaderVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClearButtonType.values().length];
            try {
                iArr[ClearButtonType.CLEAR_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClearButtonType.CLEAR_FRIENDS_LISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClearButtonType.CLEAR_CONVERSATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileFriendsListHeaderVh(ViewGroup viewGroup, a aVar) {
        super(R.layout.holder_profile_friends_header, viewGroup);
        this.l = aVar;
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        this.m = vkGroupHeader;
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    public final void W5(com.vk.newsfeed.impl.posting.profilefriendslists.holders.a aVar) {
        com.vk.newsfeed.impl.posting.profilefriendslists.holders.a aVar2 = aVar;
        VkGroupHeader.Right right = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        VkGroupHeader.d dVar = new VkGroupHeader.d(aVar2.b, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.m;
        vkGroupHeader.setTitle(dVar);
        ClearButtonType clearButtonType = aVar2.c;
        int i = b.$EnumSwitchMapping$0[clearButtonType.ordinal()];
        if (i == 1 || i == 2) {
            tlo0.f h = tq.h(tlo0.Companion, R.string.clear);
            VkButton.Mode mode = VkButton.Mode.Link;
            VkButton.Appearance appearance = VkButton.Appearance.Neutral;
            right = new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(h, new fk(14, this, clearButtonType), null, mode, appearance, null, 484), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 6);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        vkGroupHeader.setRight(right);
    }
}
