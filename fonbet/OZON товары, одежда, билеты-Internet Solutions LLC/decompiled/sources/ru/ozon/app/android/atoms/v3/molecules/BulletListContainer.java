package ru.ozon.app.android.atoms.v3.molecules;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.v3.containers.RecyclerContainer;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/BulletListContainer;", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "submitItems", "", "items", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BulletListContainer extends RecyclerContainer<ListElementAtom.BulletListElement> implements AtomView {
    public /* synthetic */ BulletListContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // ru.ozon.uni.atoms.v3.containers.RecyclerContainer
    protected void submitItems(@NotNull List<? extends ListElementAtom.BulletListElement> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        getAtomsAdapter().submitList(items);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletListContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new LinearLayoutManager(context));
    }
}
