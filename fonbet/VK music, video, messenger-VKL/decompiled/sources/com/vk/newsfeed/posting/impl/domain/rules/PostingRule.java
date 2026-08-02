package com.vk.newsfeed.posting.impl.domain.rules;

import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import java.util.List;
import xsna.epx;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: PostingRule.kt */
/* loaded from: classes4.dex */
public interface PostingRule extends Serializer.StreamParcelable {

    /* compiled from: PostingRule.kt */
    public static abstract class a {
        public final PostingUserMessage a;

        /* compiled from: PostingRule.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.rules.PostingRule$a$a, reason: collision with other inner class name */
        public static final class C1431a extends a {
            public static final C1431a b = new C1431a(null);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1431a);
            }

            public final int hashCode() {
                return 57799896;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: PostingRule.kt */
        public static final class b extends a {
            public final PostingUserMessage b;

            public b() {
                this(null);
            }

            @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule.a
            public final PostingUserMessage a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                PostingUserMessage postingUserMessage = this.b;
                if (postingUserMessage == null) {
                    return 0;
                }
                return postingUserMessage.hashCode();
            }

            public final String toString() {
                return "Message(message=" + this.b + ')';
            }

            public b(PostingUserMessage.Service service) {
                super(service);
                this.b = service;
            }
        }

        public a(PostingUserMessage postingUserMessage) {
            this.a = postingUserMessage;
        }

        public PostingUserMessage a() {
            return this.a;
        }
    }

    a F2(xmc0 xmc0Var);

    List<nrg0> c6(xmc0 xmc0Var);
}
