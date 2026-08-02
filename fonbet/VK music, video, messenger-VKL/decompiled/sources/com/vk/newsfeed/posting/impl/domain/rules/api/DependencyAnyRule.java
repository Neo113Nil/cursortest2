package com.vk.newsfeed.posting.impl.domain.rules.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.j5g;
import xsna.msy;
import xsna.myh;
import xsna.nrg0;
import xsna.prg0;
import xsna.xmc0;

/* compiled from: DependencyAnyRule.kt */
/* loaded from: classes4.dex */
public final class DependencyAnyRule implements PostingRule {
    public static final Serializer.c<DependencyAnyRule> CREATOR = new a();
    public final RuleAttachment b;
    public final Set<RuleAttachment> c;
    public final String d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new myh(this, 4));

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DependencyAnyRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DependencyAnyRule a(Serializer serializer) {
            return new DependencyAnyRule((RuleAttachment) serializer.A(RuleAttachment.class.getClassLoader()), j5g.S0(serializer.B(RuleAttachment.class.getClassLoader())), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DependencyAnyRule[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DependencyAnyRule(RuleAttachment ruleAttachment, Set<? extends RuleAttachment> set, String str) {
        this.b = ruleAttachment;
        this.c = set;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        Set<RuleAttachment> set = this.c;
        boolean z = set instanceof Collection;
        RuleAttachment ruleAttachment = this.b;
        if (!z || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (xmc0Var.c((RuleAttachment) it.next())) {
                    if (xmc0Var.c(ruleAttachment)) {
                        Iterator<T> it2 = set.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            i += xmc0Var.b((RuleAttachment) it2.next());
                        }
                        if (i == 1) {
                            for (RuleAttachment ruleAttachment2 : set) {
                                if (xmc0Var.b(ruleAttachment2) == 1) {
                                    xmc0Var.i(ruleAttachment2, prg0.a(xmc0Var, ruleAttachment, ruleAttachment2));
                                }
                            }
                        }
                    }
                    return PostingRule.a.C1431a.b;
                }
            }
        }
        boolean c = xmc0Var.c(ruleAttachment);
        ?? r1 = this.e;
        xmc0Var.f(ruleAttachment, (PostingUserMessage.Snackbar) r1.getValue());
        if (!c) {
            return PostingRule.a.C1431a.b;
        }
        xmc0Var.h((PostingUserMessage.Snackbar) r1.getValue());
        return new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.f0(j5g.O0(this.c));
        serializer.m0(this.d);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        return Collections.singletonList(new nrg0(this.b, 0));
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
