package com.detmir.recycli.adapters;

import androidx.annotation.Keep;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/detmir/recycli/adapters/ScrollKeeper;", "", "", "pos", "offset", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/detmir/recycli/adapters/ScrollKeeper;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPos", "setPos", "(Ljava/lang/Integer;)V", "getOffset", "setOffset", "a", "b", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ScrollKeeper {
    private Integer offset;
    private Integer pos;

    public interface a {
        @NotNull
        ScrollKeeper L(@NotNull String str);
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final HashMap<String, ScrollKeeper> f57712a = new HashMap<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.detmir.recycli.adapters.ScrollKeeper.a
        @NotNull
        public final ScrollKeeper L(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            HashMap<String, ScrollKeeper> hashMap = this.f57712a;
            ScrollKeeper scrollKeeper = hashMap.get(id2);
            if (scrollKeeper == null) {
                scrollKeeper = new ScrollKeeper(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                hashMap.put(id2, scrollKeeper);
            }
            return scrollKeeper;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollKeeper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScrollKeeper copy$default(ScrollKeeper scrollKeeper, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = scrollKeeper.pos;
        }
        if ((i11 & 2) != 0) {
            num2 = scrollKeeper.offset;
        }
        return scrollKeeper.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getPos() {
        return this.pos;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @NotNull
    public final ScrollKeeper copy(Integer pos, Integer offset) {
        return new ScrollKeeper(pos, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollKeeper)) {
            return false;
        }
        ScrollKeeper scrollKeeper = (ScrollKeeper) other;
        return Intrinsics.d(this.pos, scrollKeeper.pos) && Intrinsics.d(this.offset, scrollKeeper.offset);
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getPos() {
        return this.pos;
    }

    public int hashCode() {
        Integer num = this.pos;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.offset;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setPos(Integer num) {
        this.pos = num;
    }

    @NotNull
    public String toString() {
        return "ScrollKeeper(pos=" + this.pos + ", offset=" + this.offset + ')';
    }

    public ScrollKeeper(Integer num, Integer num2) {
        this.pos = num;
        this.offset = num2;
    }

    public /* synthetic */ ScrollKeeper(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
    }
}
