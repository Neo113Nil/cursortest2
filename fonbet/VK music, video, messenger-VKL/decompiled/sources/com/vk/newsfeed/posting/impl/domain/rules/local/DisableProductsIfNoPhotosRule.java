package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: DisableProductsIfNoPhotosRule.kt */
/* loaded from: classes4.dex */
public final class DisableProductsIfNoPhotosRule implements PostingRule {
    public static final Serializer.c<DisableProductsIfNoPhotosRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisableProductsIfNoPhotosRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisableProductsIfNoPhotosRule a(Serializer serializer) {
            return new DisableProductsIfNoPhotosRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisableProductsIfNoPhotosRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        List<PostingAttachment> list = xmc0Var.a.i.p;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (PostingAttachment postingAttachment : list) {
                if ((postingAttachment instanceof PhotoDto) && xmc0.e(((PhotoDto) postingAttachment).f)) {
                    break;
                }
            }
        }
        xmc0Var.f(RuleAttachment.Market, new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.snackbar_message_products_restriction), null, 4, null));
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
