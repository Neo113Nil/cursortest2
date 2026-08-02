package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDetailsEditorFileFieldBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder;ILjava/util/List;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FileFieldAdapter extends t<LegalDetailsEditorVO.FileFieldVO, FileFieldViewHolder> {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileFieldAdapter(@NotNull ComposerReferences references) {
        super(new FileFieldDiffCallback());
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((FileFieldViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FileFieldViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetLegalDetailsEditorFileFieldBinding inflate = WidgetLegalDetailsEditorFileFieldBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FileFieldViewHolder(inflate, this.references);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FileFieldViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LegalDetailsEditorVO.FileFieldVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull FileFieldViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        List list = M11 instanceof List ? (List) M11 : null;
        if (list == null) {
            super.onBindViewHolder((FileFieldAdapter) holder, position, payloads);
            return;
        }
        LegalDetailsEditorVO.FileFieldVO item = getItem(position);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof FileFieldStatusPayload) {
                holder.bindFileField(item.getStatus(), item.getLexemes(), item.getButtonStates());
            }
        }
    }
}
