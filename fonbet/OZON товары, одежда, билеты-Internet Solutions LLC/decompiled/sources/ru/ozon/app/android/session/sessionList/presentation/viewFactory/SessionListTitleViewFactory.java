package ru.ozon.app.android.session.sessionList.presentation.viewFactory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\u00020\t*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListTitleViewFactory;", "", "<init>", "()V", "horizontalOffset", "", "topOffset", "bottomOffset", "create", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "addMargins", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListTitleViewFactory {
    private final int horizontalOffset = ResourceExtKt.toPx(16);
    private final int topOffset = ResourceExtKt.toPx(16);
    private final int bottomOffset = ResourceExtKt.toPx(8);

    private final View addMargins(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = this.horizontalOffset;
        layoutParams.setMargins(i11, this.topOffset, i11, this.bottomOffset);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @NotNull
    public final View create(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return addMargins(new TextAtomView(context, null, 0, 6, null));
    }
}
