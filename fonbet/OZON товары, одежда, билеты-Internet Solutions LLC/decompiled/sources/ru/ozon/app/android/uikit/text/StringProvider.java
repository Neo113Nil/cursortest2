package ru.ozon.app.android.uikit.text;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.appcompat.app.j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J/\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u000fJ\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J7\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/uikit/text/StringProvider;", "", "<init>", "()V", "appContext", "Landroid/content/Context;", "init", "", "context", "getString", "", "id", "", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getQuantityString", "quantity", "(II[Ljava/lang/Object;)Ljava/lang/String;", "formatString", "string", "localizedContext", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringProvider {

    @NotNull
    public static final StringProvider INSTANCE = new StringProvider();
    private static Context appContext;

    private StringProvider() {
    }

    private final String formatString(String string) {
        return string;
    }

    @NotNull
    public static final String getQuantityString(int id2, int quantity, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        StringProvider stringProvider = INSTANCE;
        String quantityString = stringProvider.localizedContext().getResources().getQuantityString(id2, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return stringProvider.formatString(quantityString);
    }

    @NotNull
    public static final String getString(int id2, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        StringProvider stringProvider = INSTANCE;
        String string = stringProvider.localizedContext().getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return stringProvider.formatString(string);
    }

    public static final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        appContext = context.getApplicationContext();
    }

    private final Context localizedContext() {
        Context context = appContext;
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String h11 = j.k().h();
        Intrinsics.checkNotNullExpressionValue(h11, "toLanguageTags(...)");
        if (h11.length() == 0) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocales(LocaleList.forLanguageTags(h11));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @NotNull
    public static final String getString(int id2) {
        StringProvider stringProvider = INSTANCE;
        String string = stringProvider.localizedContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return stringProvider.formatString(string);
    }
}
