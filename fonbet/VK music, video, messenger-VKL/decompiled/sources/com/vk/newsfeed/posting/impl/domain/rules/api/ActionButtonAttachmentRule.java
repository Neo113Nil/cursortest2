package com.vk.newsfeed.posting.impl.domain.rules.api;

import android.os.Parcel;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.msy;
import xsna.nrg0;
import xsna.prg0;
import xsna.pu;
import xsna.xmc0;

/* compiled from: ActionButtonAttachmentRule.kt */
/* loaded from: classes4.dex */
public final class ActionButtonAttachmentRule implements PostingRule {
    public static final Serializer.c<ActionButtonAttachmentRule> CREATOR = new a();
    public final WallActionButtonTypeDto b;
    public final Set<RuleAttachment> c;
    public final String d;
    public final RuleAttachment e = RuleAttachment.ActionButton;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new pu(this, 0));

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButtonAttachmentRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonAttachmentRule a(Serializer serializer) {
            return new ActionButtonAttachmentRule((WallActionButtonTypeDto) serializer.A(WallActionButtonTypeDto.class.getClassLoader()), j5g.S0(serializer.B(RuleAttachment.class.getClassLoader())), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonAttachmentRule[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionButtonAttachmentRule(WallActionButtonTypeDto wallActionButtonTypeDto, Set<? extends RuleAttachment> set, String str) {
        this.b = wallActionButtonTypeDto;
        this.c = set;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        if (r0.d == true) goto L41;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostingRule.a F2(xmc0 xmc0Var) {
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto;
        PostingState.Editing editing = xmc0Var.a;
        ActionButton actionButton = editing.i.t;
        boolean z = ((actionButton == null || (wallAttachmentsActionButtonDto = actionButton.b) == null) ? null : wallAttachmentsActionButtonDto.f()) == this.b;
        Set<RuleAttachment> set = this.c;
        boolean z2 = set instanceof Collection;
        RuleAttachment ruleAttachment = this.e;
        if (!z2 || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (!xmc0Var.c((RuleAttachment) it.next())) {
                    ?? r6 = this.f;
                    if (!z && xmc0Var.c.i.size() <= 1) {
                        xmc0Var.f(ruleAttachment, (PostingUserMessage.Snackbar) r6.getValue());
                    }
                    if (z) {
                        if (!z2 || !set.isEmpty()) {
                            Iterator<T> it2 = set.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((RuleAttachment) it2.next()) == RuleAttachment.Market) {
                                    PhotoTagsData photoTagsData = editing.i.r;
                                    if (photoTagsData != null) {
                                    }
                                }
                            }
                        }
                        xmc0Var.h((PostingUserMessage.Snackbar) r6.getValue());
                        return new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null));
                    }
                    return PostingRule.a.C1431a.b;
                }
            }
        }
        if (xmc0Var.c(ruleAttachment) && z) {
            for (RuleAttachment ruleAttachment2 : set) {
                if (xmc0Var.b(ruleAttachment2) == 1) {
                    xmc0Var.i(ruleAttachment2, prg0.a(xmc0Var, ruleAttachment, ruleAttachment2));
                }
            }
        }
        return PostingRule.a.C1431a.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.f0(j5g.O0(this.c));
        serializer.m0(this.d);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto;
        ActionButton actionButton = xmc0Var.a.i.t;
        return ((actionButton == null || (wallAttachmentsActionButtonDto = actionButton.b) == null) ? null : wallAttachmentsActionButtonDto.f()) == this.b ? Collections.singletonList(new nrg0(this.e, 0)) : EmptyList.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
