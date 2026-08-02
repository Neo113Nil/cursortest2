package ru.ozon.app.android.returns.creation.di;

import IZ.a;
import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnCreationCourierCommentModalDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnCreationItemsDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnCreationMethodsDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnCreationPhotoPickerDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnCreationReasonsDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnEditPhotoPickerDeeplinkHandler;
import ru.ozon.app.android.returns.creation.deeplink.handlers.ReturnsEditAddressAndRecipientModalDeeplinkHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/di/ReturnCreationNavigationModule;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "LIZ/a;", "provideDeeplinkHandlers", "(Landroid/content/Context;)Ljava/util/Set;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationNavigationModule {
    @NotNull
    public final Set<a> provideDeeplinkHandlers(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        a[] elements = {new ReturnCreationReasonsDeeplinkHandler(appContext), new ReturnCreationMethodsDeeplinkHandler(appContext), new ReturnCreationItemsDeeplinkHandler(appContext), new ReturnCreationPhotoPickerDeeplinkHandler(), new ReturnsEditAddressAndRecipientModalDeeplinkHandler(), new ReturnCreationCourierCommentModalDeeplinkHandler(), new ReturnEditPhotoPickerDeeplinkHandler()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
