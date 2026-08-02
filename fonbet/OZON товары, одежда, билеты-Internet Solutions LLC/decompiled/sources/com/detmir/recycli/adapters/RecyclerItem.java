package com.detmir.recycli.adapters;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000H\u0016J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerItem;", "", "areContentsTheSame", "", "other", "provideId", "", "withView", "Ljava/lang/Class;", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RecyclerItem {

    public static final class a {
        public static boolean a(@NotNull RecyclerItem recyclerItem, @NotNull RecyclerItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Intrinsics.d(recyclerItem, other);
        }
    }

    boolean areContentsTheSame(@NotNull RecyclerItem other);

    @NotNull
    String provideId();

    Class<? extends Object> withView();
}
