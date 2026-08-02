package androidx.paging.compose;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyFoundationExtensions.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2,\b\u0002\u0010\t\u001a&\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001\u001aa\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2*\b\u0002\u0010\r\u001a$\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001¨\u0006\u000e"}, d2 = {"itemContentType", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/paging/compose/LazyPagingItems;", "contentType", "Lkotlin/jvm/JvmSuppressWildcards;", "item", "itemKey", SDKConstants.PARAM_KEY, "paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LazyFoundationExtensionsKt {
    public static /* synthetic */ Function1 itemKey$default(LazyPagingItems lazyPagingItems, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return itemKey(lazyPagingItems, function1);
    }

    public static final <T> Function1<Integer, Object> itemKey(final LazyPagingItems<T> lazyPagingItems, final Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt$itemKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                if (function1 == null) {
                    return PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i);
                }
                Object peek = lazyPagingItems.peek(i);
                return peek == null ? PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i) : function1.invoke(peek);
            }
        };
    }

    public static /* synthetic */ Function1 itemContentType$default(LazyPagingItems lazyPagingItems, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return itemContentType(lazyPagingItems, function1);
    }

    public static final <T> Function1<Integer, Object> itemContentType(final LazyPagingItems<T> lazyPagingItems, final Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt$itemContentType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                if (function1 == null) {
                    return null;
                }
                Object peek = lazyPagingItems.peek(i);
                return peek == null ? PagingPlaceholderContentType.INSTANCE : function1.invoke(peek);
            }
        };
    }
}
