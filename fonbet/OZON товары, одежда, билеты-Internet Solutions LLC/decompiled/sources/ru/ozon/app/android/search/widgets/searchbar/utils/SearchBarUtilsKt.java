package ru.ozon.app.android.search.widgets.searchbar.utils;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u000e\u0010\b\u001a\u00020\u0006*\u0004\u0018\u00010\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¨\u0006\u000e"}, d2 = {"cut", "", "maxLength", "", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "searchParamsHasChanged", "", "otherLink", "isPhotoPermissionGranted", "Landroid/content/Context;", "getSearchBarDefaultRadius", "", "isSelect", "isRedesigned", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarUtilsKt {
    @NotNull
    public static final String cut(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (num != null) {
            int intValue = num.intValue();
            if (1 > intValue || intValue >= str.length()) {
                num = null;
            }
            if (num != null) {
                String substring = str.substring(0, num.intValue());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (substring != null) {
                    return substring;
                }
            }
        }
        return str;
    }

    public static final float getSearchBarDefaultRadius(boolean z11, boolean z12) {
        return ResourceExtKt.toPxF((z11 && z12) ? 24 : z11 ? 32 : z12 ? 16 : 12);
    }

    public static final boolean isPhotoPermissionGranted(Context context) {
        if (context == null) {
            return false;
        }
        return PermissionExtensionsKt.isPermissionGranted(context, "android.permission.CAMERA") || PermissionExtensionsKt.isPermissionGranted(context, Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE");
    }

    public static final boolean searchParamsHasChanged(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return !Intrinsics.d(str2 != null ? UriUtilsKt.extractFullSearchText(str2) : null, UriUtilsKt.extractFullSearchText(str));
    }
}
