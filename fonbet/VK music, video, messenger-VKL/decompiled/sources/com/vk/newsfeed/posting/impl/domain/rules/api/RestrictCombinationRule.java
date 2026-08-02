package com.vk.newsfeed.posting.impl.domain.rules.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.c5g;
import xsna.izi0;
import xsna.j5g;
import xsna.msy;
import xsna.nrg0;
import xsna.p4g;
import xsna.vex;
import xsna.xmc0;

/* compiled from: RestrictCombinationRule.kt */
/* loaded from: classes4.dex */
public final class RestrictCombinationRule implements PostingRule {
    public static final Serializer.c<RestrictCombinationRule> CREATOR = new a();
    public final Set<RuleAttachment> b;
    public final String c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new vex(this, 26));

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RestrictCombinationRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RestrictCombinationRule a(Serializer serializer) {
            return new RestrictCombinationRule(j5g.S0(serializer.B(RuleAttachment.class.getClassLoader())), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestrictCombinationRule[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestrictCombinationRule(Set<? extends RuleAttachment> set, String str) {
        this.b = set;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        Set<RuleAttachment> a2 = xmc0Var.a();
        Set<RuleAttachment> set = this.b;
        Set<RuleAttachment> set2 = set;
        LinkedHashSet d0 = j5g.d0(a2, set2);
        int size = d0.size();
        ?? r4 = this.d;
        if (size == 1) {
            Iterator it = izi0.g(set, d0).iterator();
            while (it.hasNext()) {
                xmc0Var.f((RuleAttachment) it.next(), (PostingUserMessage.Snackbar) r4.getValue());
            }
            return PostingRule.a.C1431a.b;
        }
        if (d0.size() <= 1) {
            return PostingRule.a.C1431a.b;
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            xmc0Var.f((RuleAttachment) it2.next(), (PostingUserMessage.Snackbar) r4.getValue());
        }
        xmc0Var.h((PostingUserMessage.Snackbar) r4.getValue());
        return new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(j5g.O0(this.b));
        serializer.m0(this.c);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        Set<RuleAttachment> a2 = xmc0Var.a();
        Set<RuleAttachment> set = this.b;
        LinkedHashSet d0 = j5g.d0(a2, set);
        if (d0.isEmpty()) {
            return null;
        }
        HashSet f = p4g.f(set, j5g.X(d0));
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(new nrg0((RuleAttachment) it.next(), 0));
        }
        return j5g.O0(arrayList);
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
