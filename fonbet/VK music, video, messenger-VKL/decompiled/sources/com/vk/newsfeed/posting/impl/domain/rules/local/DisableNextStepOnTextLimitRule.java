package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import java.util.List;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: DisableNextStepOnTextLimitRule.kt */
/* loaded from: classes4.dex */
public final class DisableNextStepOnTextLimitRule implements PostingRule {
    public static final Serializer.c<DisableNextStepOnTextLimitRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisableNextStepOnTextLimitRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisableNextStepOnTextLimitRule a(Serializer serializer) {
            return new DisableNextStepOnTextLimitRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisableNextStepOnTextLimitRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        PostingState.Editing editing = xmc0Var.a;
        if (editing.i.c.length() > editing.d.l) {
            xmc0Var.g(null);
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
