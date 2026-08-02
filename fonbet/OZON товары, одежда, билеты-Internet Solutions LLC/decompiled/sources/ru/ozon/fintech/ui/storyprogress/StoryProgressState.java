package ru.ozon.fintech.ui.storyprogress;

import B0.C2454a;
import E30.i;
import G.g;
import Tl.b;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/fintech/ui/storyprogress/StoryProgressState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "progress", "", "", "selectedPosition", "", "paddings", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroid/graphics/Rect;)V", "getId", "()Ljava/lang/String;", "getProgress", "()Ljava/util/List;", "getSelectedPosition", "()I", "getPaddings", "()Landroid/graphics/Rect;", "provideId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoryProgressState implements RecyclerItem {

    @NotNull
    private final String id;

    @NotNull
    private final Rect paddings;

    @NotNull
    private final List<Float> progress;
    private final int selectedPosition;

    public StoryProgressState(@NotNull String id2, @NotNull List<Float> progress, int i11, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.progress = progress;
        this.selectedPosition = i11;
        this.paddings = paddings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryProgressState copy$default(StoryProgressState storyProgressState, String str, List list, int i11, Rect rect, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = storyProgressState.id;
        }
        if ((i12 & 2) != 0) {
            list = storyProgressState.progress;
        }
        if ((i12 & 4) != 0) {
            i11 = storyProgressState.selectedPosition;
        }
        if ((i12 & 8) != 0) {
            rect = storyProgressState.paddings;
        }
        return storyProgressState.copy(str, list, i11, rect);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Float> component2() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final StoryProgressState copy(@NotNull String id2, @NotNull List<Float> progress, int selectedPosition, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new StoryProgressState(id2, progress, selectedPosition, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryProgressState)) {
            return false;
        }
        StoryProgressState storyProgressState = (StoryProgressState) other;
        return Intrinsics.d(this.id, storyProgressState.id) && Intrinsics.d(this.progress, storyProgressState.progress) && this.selectedPosition == storyProgressState.selectedPosition && Intrinsics.d(this.paddings, storyProgressState.paddings);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final List<Float> getProgress() {
        return this.progress;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public int hashCode() {
        return this.paddings.hashCode() + C2454a.a(this.selectedPosition, g.b(this.id.hashCode() * 31, 31, this.progress), 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<Float> list = this.progress;
        int i11 = this.selectedPosition;
        Rect rect = this.paddings;
        StringBuilder f7 = b.f("StoryProgressState(id=", str, ", progress=", ", selectedPosition=", list);
        f7.append(i11);
        f7.append(", paddings=");
        f7.append(rect);
        f7.append(")");
        return f7.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ StoryProgressState(String str, List list, int i11, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i11, (i12 & 8) != 0 ? i.a() : rect);
    }
}
