package ru.ozon.app.android.uikit.view.recycler.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/adapter/ViewHolder;", "", "T", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ViewHolder<T> extends BaseViewHolder<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }
}
