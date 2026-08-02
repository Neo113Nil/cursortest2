package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.dto.common.Attachment;
import java.util.List;
import xsna.epx;
import xsna.hn50;
import xsna.ln50;
import xsna.ms9;
import xsna.on50;
import xsna.vu5;

/* compiled from: MarketItemReviewRepliesTask.kt */
/* loaded from: classes18.dex */
public interface n extends hn50 {

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class a implements n {
        public static final a b = new a();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 1775667009;
        }

        public final String toString() {
            return "CheckIfHasEditorRole";
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class b implements n {
        public final String b;
        public final List<Attachment> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, List<? extends Attachment> list) {
            this.b = str;
            this.c = list;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Attachment> list = this.c;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateReply(text=");
            sb.append(this.b);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class c implements n {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteReply(replyId="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class d implements n {
        public static final d b = new d();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -240361550;
        }

        public final String toString() {
            return "GetCurrentUserId";
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class e implements n {
        public static final e b = new e();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -498099234;
        }

        public final String toString() {
            return "LoadPage";
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class f implements n {
        public static final f b = new f();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 813053435;
        }

        public final String toString() {
            return "LoadReviewWithReplies";
        }
    }

    /* compiled from: MarketItemReviewRepliesTask.kt */
    public static final class g implements n {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("RestoreReply(replyId="), this.b, ')');
        }
    }
}
