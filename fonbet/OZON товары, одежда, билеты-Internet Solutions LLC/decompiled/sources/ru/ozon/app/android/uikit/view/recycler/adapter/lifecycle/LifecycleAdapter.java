package ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle;

import Sc.InterfaceC3999a;
import androidx.lifecycle.J;
import jk0.d;
import jk0.h;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Ljk0/j;", "T", "Ljk0/d;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Ljk0/h;", "lifecycleAdapterDelegateFactory", "<init>", "(Landroidx/lifecycle/J;Ljk0/h;)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class LifecycleAdapter<T extends j> extends d<T> {
    public LifecycleAdapter(J j11, h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? new h() : hVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleAdapter(@NotNull J containerViewLifecycleOwner, @NotNull h<T> lifecycleAdapterDelegateFactory) {
        super(containerViewLifecycleOwner, lifecycleAdapterDelegateFactory);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleAdapterDelegateFactory, "lifecycleAdapterDelegateFactory");
    }
}
