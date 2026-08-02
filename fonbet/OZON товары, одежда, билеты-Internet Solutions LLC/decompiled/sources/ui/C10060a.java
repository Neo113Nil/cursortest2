package ui;

import Hi.j;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi.C10321a;
import vi.C10322b;
import wi.C10563a;
import wi.c;

/* renamed from: ui.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10060a extends t<c, RecyclerView.C> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<j, Unit> f100797a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10060a(@NotNull Function1<? super j, Unit> onAlbumSelected) {
        super(new C10061b());
        Intrinsics.checkNotNullParameter(onAlbumSelected, "onAlbumSelected");
        this.f100797a = onAlbumSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        c item = getItem(i11);
        if (item instanceof c.a) {
            return 0;
        }
        if (item instanceof c.b) {
            return 1;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof C10563a) {
            c item = getItem(i11);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.android.gallery.album.view.recycler.viewholder.ViewHolderModel.Album");
            ((C10563a) holder).f(((c.a) item).a());
        } else if (holder instanceof wi.b) {
            c item2 = getItem(i11);
            Intrinsics.g(item2, "null cannot be cast to non-null type ru.ozon.android.gallery.album.view.recycler.viewholder.ViewHolderModel.Title");
            ((wi.b) holder).bind(((c.b) item2).a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public final RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new C10563a(new C10321a(context), this.f100797a);
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new wi.b(new C10322b(context2));
    }
}
