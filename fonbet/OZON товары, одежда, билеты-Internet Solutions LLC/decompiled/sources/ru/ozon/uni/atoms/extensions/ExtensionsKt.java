package ru.ozon.uni.atoms.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\bH\u0000\"\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u0002H\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"exhaustive", "T", "getExhaustive", "(Ljava/lang/Object;)Ljava/lang/Object;", "loadDrawableByName", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isUrl", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtensionsKt {
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

    public static final Drawable loadDrawableByName(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return ru.ozon.uni.android.uikit.extensions.ExtensionsKt.loadDrawableByName(context, name);
    }
}
