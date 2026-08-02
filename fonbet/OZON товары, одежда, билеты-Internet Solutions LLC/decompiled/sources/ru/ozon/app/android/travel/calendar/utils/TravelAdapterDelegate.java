package ru.ozon.app.android.travel.calendar.utils;

import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "T", "", "item", "", "isForViewType", "(Ljava/lang/Object;)Z", "", "provideLayoutRes", "()I", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "provideView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$C;", "view", "createViewHolder", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "onBindViewHolder", "(Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$C;)V", "onAttach", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onDetach", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TravelAdapterDelegate<T> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> void onAttach(@NotNull TravelAdapterDelegate<T> travelAdapterDelegate, @NotNull RecyclerView.C viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }

        @NotNull
        public static <T> RecyclerView.C onCreateViewHolder(@NotNull TravelAdapterDelegate<T> travelAdapterDelegate, @NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return travelAdapterDelegate.createViewHolder(travelAdapterDelegate.provideView(parent));
        }

        public static <T> void onDetach(@NotNull TravelAdapterDelegate<T> travelAdapterDelegate, @NotNull RecyclerView.C viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }

        @NotNull
        public static <T> View provideView(@NotNull TravelAdapterDelegate<T> travelAdapterDelegate, @NotNull ViewGroup viewGroup) {
            View inflate = C4636t5.a(viewGroup, "parent").inflate(travelAdapterDelegate.provideLayoutRes(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return inflate;
        }
    }

    @NotNull
    RecyclerView.C createViewHolder(@NotNull View view);

    boolean isForViewType(T item);

    void onAttach(@NotNull RecyclerView.C viewHolder);

    void onBindViewHolder(T item, @NotNull RecyclerView.C viewHolder);

    @NotNull
    RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent);

    void onDetach(@NotNull RecyclerView.C viewHolder);

    int provideLayoutRes();

    @NotNull
    View provideView(@NotNull ViewGroup parent);
}
