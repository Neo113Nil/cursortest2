package ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle;

import Sc.InterfaceC3999a;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.g;
import jk0.h;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "T", "Ljk0/j;", "VH", "Ljk0/i;", "Landroidx/recyclerview/widget/i$d;", "diffCallback", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Ljk0/g;", "lifecycleAdapterDelegateFactory", "<init>", "(Landroidx/recyclerview/widget/i$d;Landroidx/lifecycle/J;Ljk0/g;)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LifecycleListAdapter<T, VH extends j> extends i<T, VH> {
    public LifecycleListAdapter(i.d dVar, J j11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, (i11 & 4) != 0 ? new h() : gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleListAdapter(@NotNull i.d<T> diffCallback, @NotNull J containerViewLifecycleOwner, @NotNull g<VH> lifecycleAdapterDelegateFactory) {
        super(diffCallback, containerViewLifecycleOwner, lifecycleAdapterDelegateFactory);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleAdapterDelegateFactory, "lifecycleAdapterDelegateFactory");
    }
}
