package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.AnimatedImageDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.SeparatorDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TextDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TitleDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.AnimatedImageViewHolder;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.ImageViewHolder;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.SeparatorViewHolder;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.TextViewHolder;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.TitleViewHolder;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/EmptyStateAdapter;", "Ljk0/i;", "", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "isSmallScreen", "<init>", "(Landroidx/lifecycle/J;Z)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "", "onBindViewHolder", "(Ljk0/j;I)V", "Z", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyStateAdapter extends i<Object, j> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isSmallScreen;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/EmptyStateAdapter$Companion;", "", "<init>", "()V", "TYPE_SEPARATOR", "", "TYPE_TEXT", "TYPE_TITLE", "TYPE_IMAGE", "TYPE_ANIMATED_IMAGE", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateAdapter(@NotNull J lifecycleOwner, boolean z11) {
        super(new EmptyStateItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.isSmallScreen = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Object item = getItem(position);
        if (item instanceof SeparatorDTO) {
            return 0;
        }
        if (item instanceof Text$TextDTO) {
            return 1;
        }
        if (item instanceof Text$TitleDTO) {
            return 2;
        }
        if (item instanceof ImageDTO) {
            return 3;
        }
        return item instanceof AnimatedImageDTO ? 4 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        if (holder instanceof SeparatorViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.SeparatorDTO");
            ((SeparatorViewHolder) holder).bind((SeparatorDTO) item);
            return;
        }
        if (holder instanceof TextViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text.TextDTO");
            ((TextViewHolder) holder).bind((Text$TextDTO) item);
            return;
        }
        if (holder instanceof TitleViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text.TitleDTO");
            ((TitleViewHolder) holder).bind((Text$TitleDTO) item);
        } else if (holder instanceof ImageViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.image.ImageDTO");
            ((ImageViewHolder) holder).bind((ImageDTO) item);
        } else if (holder instanceof AnimatedImageViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.AnimatedImageDTO");
            ((AnimatedImageViewHolder) holder).bind((AnimatedImageDTO) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            SeparatorViewHolder.Companion companion = SeparatorViewHolder.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return companion.create(context);
        }
        if (viewType == 1) {
            TextViewHolder.Companion companion2 = TextViewHolder.INSTANCE;
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return companion2.create(context2);
        }
        if (viewType == 2) {
            TitleViewHolder.Companion companion3 = TitleViewHolder.INSTANCE;
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return companion3.create(context3, this.isSmallScreen);
        }
        if (viewType == 3) {
            ImageViewHolder.Companion companion4 = ImageViewHolder.INSTANCE;
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return companion4.create(context4, this.isSmallScreen);
        }
        if (viewType != 4) {
            throw new IllegalStateException("unknown view type");
        }
        AnimatedImageViewHolder.Companion companion5 = AnimatedImageViewHolder.INSTANCE;
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        return companion5.create(context5);
    }
}
