package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vkontakte.android.R;
import java.util.List;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: DisableActionButtonWithCoauthorsRule.kt */
/* loaded from: classes4.dex */
public final class DisableActionButtonWithCoauthorsRule implements PostingRule {
    public static final Serializer.c<DisableActionButtonWithCoauthorsRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisableActionButtonWithCoauthorsRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisableActionButtonWithCoauthorsRule a(Serializer serializer) {
            return new DisableActionButtonWithCoauthorsRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisableActionButtonWithCoauthorsRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        if (xmc0Var.a.i.n != null && (!r0.isEmpty())) {
            PostingUserMessage.Snackbar snackbar = new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_accent), new PostingUserMessageText.ResText(R.string.coauthor_restriction_action_button_add), null, 4, null);
            RuleAttachment ruleAttachment = RuleAttachment.ActionButton;
            xmc0Var.f(ruleAttachment, snackbar);
            if (xmc0Var.c(ruleAttachment)) {
                xmc0Var.h(snackbar);
            }
        }
        return PostingRule.a.C1431a.b;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
