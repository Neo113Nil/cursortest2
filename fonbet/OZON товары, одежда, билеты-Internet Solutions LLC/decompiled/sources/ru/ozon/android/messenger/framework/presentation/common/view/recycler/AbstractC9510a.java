package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.recycler.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9510a<T extends ru.ozon.android.messenger.framework.presentation.models.g> extends ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f91211d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final View f91212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q<T, X4.a> f91213c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC9510a(View view, @NotNull q<T, X4.a> messengerView) {
        super(r0);
        Intrinsics.checkNotNullParameter(messengerView, "messengerView");
        View root = messengerView.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.f91212b = view;
        this.f91213c = messengerView;
    }

    public final void e(@NotNull T block, @NotNull ru.ozon.android.messenger.framework.presentation.models.p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        this.f91213c.bind(block, itemInfo, blockInfo, obj);
    }

    public void onRecycle() {
        this.f91213c.onRecycle();
    }
}
