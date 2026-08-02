package ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory;

import android.content.Context;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final MessengerNavBarDTO f86703f;

    static {
        int i11 = IconButtonV3DTO.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull Moshi moshi) {
        super(context, moshi);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f86703f = ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.a.b(context);
    }

    @Override // ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.a
    @NotNull
    protected final MessengerNavBarDTO b() {
        return this.f86703f;
    }
}
