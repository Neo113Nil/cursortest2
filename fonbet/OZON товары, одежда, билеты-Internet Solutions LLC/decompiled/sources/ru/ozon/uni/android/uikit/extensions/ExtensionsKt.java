package ru.ozon.uni.android.uikit.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\n\u0010\f\u001a\u00020\r*\u00020\b\"\u001b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u0002H\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"exhaustive", "T", "getExhaustive", "(Ljava/lang/Object;)Ljava/lang/Object;", "loadDrawableByName", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "coerceValue", "", "default", "isUrl", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtensionsKt {
    public static final int coerceValue(int i11, int i12) {
        return i11 >= 0 ? i11 : i12;
    }

    public static final <T> T getExhaustive(T t2) {
        return t2;
    }

    public static final boolean isUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            new URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Drawable loadDrawableByName(@NotNull Context context, @NotNull String name) {
        Drawable drawable;
        Integer drawable2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        UniIconToken byId = UniTheme.INSTANCE.getIconTokens().getById(name);
        if (byId != null && (drawable2 = TokensExtKt.getDrawable(byId)) != null) {
            if (drawable2.intValue() == 0) {
                drawable2 = null;
            }
            if (drawable2 != null) {
                drawable = a.getDrawable(context, drawable2.intValue());
                if (drawable == null) {
                    return drawable;
                }
                int identifier = context.getResources().getIdentifier(name, "drawable", context.getApplicationContext().getPackageName());
                if (identifier != 0) {
                    return C7232a.a(context, identifier);
                }
                return null;
            }
        }
        drawable = null;
        if (drawable == null) {
        }
    }
}
