package com.vk.im.ui.components.chat_profile;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.cwb0;
import xsna.e43;
import xsna.jwb0;
import xsna.rl3;
import xsna.zrp;

/* compiled from: ChatProfilePopups.kt */
/* loaded from: classes2.dex */
public final class ProfileLinkActionChooser extends cwb0.m<LinkAction> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatProfilePopups.kt */
    public static final class LinkAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkAction[] $VALUES;
        public static final LinkAction COPY;
        public static final LinkAction SHARE;

        static {
            LinkAction linkAction = new LinkAction("COPY", 0);
            COPY = linkAction;
            LinkAction linkAction2 = new LinkAction("SHARE", 1);
            SHARE = linkAction2;
            LinkAction[] linkActionArr = {linkAction, linkAction2};
            $VALUES = linkActionArr;
            $ENTRIES = new asp(linkActionArr);
        }

        public LinkAction() {
            throw null;
        }

        public static LinkAction valueOf(String str) {
            return (LinkAction) Enum.valueOf(LinkAction.class, str);
        }

        public static LinkAction[] values() {
            return (LinkAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfileLinkActionChooser() {
        super(null, null, null, null, null, e43.l(new jwb0(null, R.string.vkim_msg_list_link_option_copy, null, null, 0, LinkAction.COPY, false, null, 989), new jwb0(null, R.string.vkim_share, null, null, 0, LinkAction.SHARE, false, null, 989)), rl3.u0(LinkAction.values()), r8, 3071);
        cwb0.c1.c cVar = cwb0.c1.c.a;
    }
}
