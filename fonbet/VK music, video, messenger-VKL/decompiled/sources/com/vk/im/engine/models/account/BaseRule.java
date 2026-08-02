package com.vk.im.engine.models.account;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PrivacySetting.kt */
/* loaded from: classes2.dex */
public final class BaseRule extends PrivacyRule {
    public static final Serializer.c<BaseRule> CREATOR = new a();
    public static final BaseRule c = new BaseRule("all");
    public static final BaseRule d = new BaseRule("only_me");
    public static final BaseRule e = new BaseRule("nobody");
    public static final BaseRule f = new BaseRule("friends");
    public static final BaseRule g = new BaseRule("friends_and_contacts");
    public static final BaseRule h = new BaseRule("friends_of_friends");
    public static final BaseRule i = new BaseRule("friends_of_friends_only");
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BaseRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BaseRule a(Serializer serializer) {
            return new BaseRule(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BaseRule[i];
        }
    }

    public BaseRule(String str) {
        super(null);
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseRule) && epx.f(this.b, ((BaseRule) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("BaseRule(value="), this.b, ')');
    }

    public BaseRule(Serializer serializer, zcl zclVar) {
        this(serializer.H());
    }
}
