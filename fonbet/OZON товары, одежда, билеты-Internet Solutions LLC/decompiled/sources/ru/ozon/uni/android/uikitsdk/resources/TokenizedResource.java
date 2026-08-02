package ru.ozon.uni.android.uikitsdk.resources;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001J%\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/uikitsdk/resources/TokenizedResource;", "", "T", "Landroid/content/Context;", "context", "vararg", "getValue", "(Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TokenizedResource<T> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getValue$default(TokenizedResource tokenizedResource, Context context, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getValue");
            }
            if ((i11 & 2) != 0) {
                obj = new Object[0];
            }
            return tokenizedResource.getValue(context, obj);
        }
    }

    T getValue(@NotNull Context context, Object vararg);
}
