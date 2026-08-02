package ru.ozon.app.android.marketing.common.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/common/view/ViewContainerLayoutHolder;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewContainerLayoutHolder {

    @NotNull
    private final View itemView;
    private int position;

    public ViewContainerLayoutHolder(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
        this.position = -1;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int i11) {
        this.position = i11;
    }
}
