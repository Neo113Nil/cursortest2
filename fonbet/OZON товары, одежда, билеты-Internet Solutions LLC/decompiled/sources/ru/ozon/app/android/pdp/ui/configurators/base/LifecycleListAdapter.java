package ru.ozon.app.android.pdp.ui.configurators.base;

import androidx.lifecycle.J;
import jk0.h;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ListItem;
import ru.ozon.app.android.pdp.utils.ListItemDiffUtils;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/base/LifecycleListAdapter;", "Lru/ozon/app/android/pdp/utils/ListItem;", "T", "Ljk0/j;", "VH", "Ljk0/i;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Ljk0/h;", "delegateFactory", "<init>", "(Landroidx/lifecycle/J;Ljk0/h;)V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class LifecycleListAdapter<T extends ListItem, VH extends j> extends i<T, VH> {
    public LifecycleListAdapter(J j11, h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? new h() : hVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleListAdapter(@NotNull J lifecycleOwner, @NotNull h<VH> delegateFactory) {
        super(new ListItemDiffUtils(), lifecycleOwner, delegateFactory);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
    }
}
