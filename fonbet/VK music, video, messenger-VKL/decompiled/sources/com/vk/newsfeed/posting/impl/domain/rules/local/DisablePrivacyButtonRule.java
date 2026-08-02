package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vkontakte.android.R;
import java.util.List;
import xsna.nrg0;
import xsna.vmc0;
import xsna.xmc0;

/* compiled from: DisablePrivacyButtonRule.kt */
/* loaded from: classes4.dex */
public final class DisablePrivacyButtonRule implements PostingRule {
    public static final Serializer.c<DisablePrivacyButtonRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisablePrivacyButtonRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisablePrivacyButtonRule a(Serializer serializer) {
            return new DisablePrivacyButtonRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisablePrivacyButtonRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        if (vmc0.b(xmc0Var.a)) {
            ActionsAvailabilityState.Availability.NotAvailable notAvailable = new ActionsAvailabilityState.Availability.NotAvailable(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.privacy_after_publish_unavailable_message), null, 4, null));
            ActionsAvailabilityState actionsAvailabilityState = xmc0Var.g;
            xmc0Var.g = ActionsAvailabilityState.a(actionsAvailabilityState, null, null, null, null, actionsAvailabilityState.i.m5(notAvailable), 127);
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
